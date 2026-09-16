package org.java_websocket.extensions.permessage_deflate;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.extensions.CompressionExtension;
import org.java_websocket.extensions.ExtensionRequestData;
import org.java_websocket.extensions.IExtension;
import org.java_websocket.framing.BinaryFrame;
import org.java_websocket.framing.ContinuousFrame;
import org.java_websocket.framing.DataFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.FramedataImpl1;
import org.java_websocket.framing.TextFrame;

public class PerMessageDeflateExtension extends CompressionExtension {
   private static final String EXTENSION_REGISTERED_NAME = "permessage-deflate";
   private static final String SERVER_NO_CONTEXT_TAKEOVER = "server_no_context_takeover";
   private static final String CLIENT_NO_CONTEXT_TAKEOVER = "client_no_context_takeover";
   private static final String SERVER_MAX_WINDOW_BITS = "server_max_window_bits";
   private static final String CLIENT_MAX_WINDOW_BITS = "client_max_window_bits";
   private static final int serverMaxWindowBits = 32768;
   private static final int clientMaxWindowBits = 32768;
   private static final byte[] TAIL_BYTES = new byte[]{0, 0, -1, -1};
   private static final int BUFFER_SIZE = 1024;
   private boolean serverNoContextTakeover = true;
   private boolean clientNoContextTakeover = false;
   private Map<String, String> requestedParameters = new LinkedHashMap<>();
   private Inflater inflater = new Inflater(true);
   private Deflater deflater = new Deflater(-1, true);

   @Override
   public void decodeFrame(Framedata var1) {
      if (var1 instanceof DataFrame) {
         if (var1.getOpcode() == Opcode.CONTINUOUS && var1.isRSV1()) {
            throw new InvalidDataException(1008, "RSV1 bit can only be set for the first frame.");
         }

         ByteArrayOutputStream var2 = new ByteArrayOutputStream();

         try {
            this.decompress(var1.getPayloadData().array(), var2);
            if (this.inflater.getRemaining() > 0) {
               this.inflater = new Inflater(true);
               this.decompress(var1.getPayloadData().array(), var2);
            }

            if (var1.isFin()) {
               this.decompress(TAIL_BYTES, var2);
               if (this.clientNoContextTakeover) {
                  this.inflater = new Inflater(true);
               }
            }
         } catch (DataFormatException var4) {
            throw new InvalidDataException(1008, var4.getMessage());
         }

         if (var1.isRSV1()) {
            ((DataFrame)var1).setRSV1(false);
         }

         ((FramedataImpl1)var1).setPayload(ByteBuffer.wrap(var2.toByteArray(), 0, var2.size()));
      }
   }

   private void decompress(byte[] var1, ByteArrayOutputStream var2) {
      this.inflater.setInput(var1);
      byte[] var3 = new byte[1024];

      int var4;
      while ((var4 = this.inflater.inflate(var3)) > 0) {
         var2.write(var3, 0, var4);
      }
   }

   @Override
   public void encodeFrame(Framedata var1) {
      if (var1 instanceof DataFrame) {
         if (!(var1 instanceof ContinuousFrame)) {
            ((DataFrame)var1).setRSV1(true);
         }

         this.deflater.setInput(var1.getPayloadData().array());
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         byte[] var3 = new byte[1024];

         int var4;
         while ((var4 = this.deflater.deflate(var3, 0, var3.length, 2)) > 0) {
            var2.write(var3, 0, var4);
         }

         byte[] var5 = var2.toByteArray();
         int var6 = var5.length;
         if (var1.isFin()) {
            if (this.endsWithTail(var5)) {
               var6 -= TAIL_BYTES.length;
            }

            if (this.serverNoContextTakeover) {
               this.deflater.end();
               this.deflater = new Deflater(-1, true);
            }
         }

         ((FramedataImpl1)var1).setPayload(ByteBuffer.wrap(var5, 0, var6));
      }
   }

   private boolean endsWithTail(byte[] var1) {
      if (var1.length < 4) {
         return false;
      }

      int var2 = var1.length;

      for (int var3 = 0; var3 < TAIL_BYTES.length; var3++) {
         if (TAIL_BYTES[var3] != var1[var2 - TAIL_BYTES.length + var3]) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean acceptProvidedExtensionAsServer(String var1) {
      String[] var2 = var1.split(",");

      for (String var6 : var2) {
         ExtensionRequestData var7 = ExtensionRequestData.parseExtensionRequest(var6);
         if ("permessage-deflate".equalsIgnoreCase(var7.getExtensionName())) {
            Map var8 = var7.getExtensionParameters();
            this.requestedParameters.putAll(var8);
            if (this.requestedParameters.containsKey("client_no_context_takeover")) {
               this.clientNoContextTakeover = true;
            }

            return true;
         }
      }

      return false;
   }

   @Override
   public boolean acceptProvidedExtensionAsClient(String var1) {
      String[] var2 = var1.split(",");

      for (String var6 : var2) {
         ExtensionRequestData var7 = ExtensionRequestData.parseExtensionRequest(var6);
         if ("permessage-deflate".equalsIgnoreCase(var7.getExtensionName())) {
            Map var8 = var7.getExtensionParameters();
            return true;
         }
      }

      return false;
   }

   @Override
   public String getProvidedExtensionAsClient() {
      this.requestedParameters.put("client_no_context_takeover", ExtensionRequestData.EMPTY_VALUE);
      this.requestedParameters.put("server_no_context_takeover", ExtensionRequestData.EMPTY_VALUE);
      return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
   }

   @Override
   public String getProvidedExtensionAsServer() {
      return "permessage-deflate; server_no_context_takeover" + (this.clientNoContextTakeover ? "; client_no_context_takeover" : "");
   }

   @Override
   public IExtension copyInstance() {
      return new PerMessageDeflateExtension();
   }

   @Override
   public void isFrameValid(Framedata var1) {
      if ((var1 instanceof TextFrame || var1 instanceof BinaryFrame) && !var1.isRSV1()) {
         throw new InvalidFrameException("RSV1 bit must be set for DataFrames.");
      }

      if (!(var1 instanceof ContinuousFrame) || !var1.isRSV1() && !var1.isRSV2() && !var1.isRSV3()) {
         super.isFrameValid(var1);
      } else {
         throw new InvalidFrameException("bad rsv RSV1: " + var1.isRSV1() + " RSV2: " + var1.isRSV2() + " RSV3: " + var1.isRSV3());
      }
   }

   @Override
   public String toString() {
      return "PerMessageDeflateExtension";
   }
}
