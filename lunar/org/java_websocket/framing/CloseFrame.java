package org.java_websocket.framing;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.util.ByteBufferUtils;
import org.java_websocket.util.Charsetfunctions;

public class CloseFrame extends ControlFrame {
   public static final int NORMAL = 1000;
   public static final int GOING_AWAY = 1001;
   public static final int PROTOCOL_ERROR = 1002;
   public static final int REFUSE = 1003;
   public static final int NOCODE = 1005;
   public static final int ABNORMAL_CLOSE = 1006;
   public static final int NO_UTF8 = 1007;
   public static final int POLICY_VALIDATION = 1008;
   public static final int TOOBIG = 1009;
   public static final int EXTENSION = 1010;
   public static final int UNEXPECTED_CONDITION = 1011;
   public static final int SERVICE_RESTART = 1012;
   public static final int TRY_AGAIN_LATER = 1013;
   public static final int BAD_GATEWAY = 1014;
   public static final int TLS_ERROR = 1015;
   public static final int NEVER_CONNECTED = -1;
   public static final int BUGGYCLOSE = -2;
   public static final int FLASHPOLICY = -3;
   private int code;
   private String reason;

   public CloseFrame() {
      super(Opcode.CLOSING);
      this.setReason("");
      this.setCode(1000);
   }

   public void setCode(int var1) {
      this.code = var1;
      if (var1 == 1015) {
         this.code = 1005;
         this.reason = "";
      }

      this.updatePayload();
   }

   public void setReason(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.reason = var1;
      this.updatePayload();
   }

   public int getCloseCode() {
      return this.code;
   }

   public String getMessage() {
      return this.reason;
   }

   @Override
   public String toString() {
      return super.toString() + "code: " + this.code;
   }

   @Override
   public void isValid() {
      super.isValid();
      if (this.code == 1007 && this.reason.isEmpty()) {
         throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
      } else if (this.code == 1005 && 0 < this.reason.length()) {
         throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
      } else if (this.code > 1015 && this.code < 3000) {
         throw new InvalidDataException(1002, "Trying to send an illegal close code!");
      } else if (this.code == 1006 || this.code == 1015 || this.code == 1005 || this.code > 4999 || this.code < 1000 || this.code == 1004) {
         throw new InvalidFrameException("closecode must not be sent over the wire: " + this.code);
      }
   }

   @Override
   public void setPayload(ByteBuffer var1) {
      this.code = 1005;
      this.reason = "";
      ((Buffer)var1).mark();
      if (var1.remaining() == 0) {
         this.code = 1000;
      } else if (var1.remaining() == 1) {
         this.code = 1002;
      } else {
         if (var1.remaining() >= 2) {
            ByteBuffer var2 = ByteBuffer.allocate(4);
            ((Buffer)var2).position(2);
            var2.putShort(var1.getShort());
            ((Buffer)var2).position(0);
            this.code = var2.getInt();
         }

         ((Buffer)var1).reset();

         try {
            int var4 = var1.position();
            this.validateUtf8(var1, var4);
         } catch (InvalidDataException var3) {
            this.code = 1007;
            this.reason = null;
         }
      }
   }

   private void validateUtf8(ByteBuffer var1, int var2) {
      try {
         ((Buffer)var1).position(var1.position() + 2);
         this.reason = Charsetfunctions.stringUtf8(var1);
      } catch (IllegalArgumentException var7) {
         throw new InvalidDataException(1007);
      } finally {
         ((Buffer)var1).position(var2);
      }
   }

   private void updatePayload() {
      byte[] var1 = Charsetfunctions.utf8Bytes(this.reason);
      ByteBuffer var2 = ByteBuffer.allocate(4);
      var2.putInt(this.code);
      ((Buffer)var2).position(2);
      ByteBuffer var3 = ByteBuffer.allocate(2 + var1.length);
      var3.put(var2);
      var3.put(var1);
      ((Buffer)var3).rewind();
      super.setPayload(var3);
   }

   @Override
   public ByteBuffer getPayloadData() {
      return this.code == 1005 ? ByteBufferUtils.getEmptyByteBuffer() : super.getPayloadData();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null || this.getClass() != var1.getClass()) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         CloseFrame var2 = (CloseFrame)var1;
         if (this.code != var2.code) {
            return false;
         } else {
            return this.reason != null ? this.reason.equals(var2.reason) : var2.reason == null;
         }
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.code;
      return 31 * var1 + (this.reason != null ? this.reason.hashCode() : 0);
   }
}
