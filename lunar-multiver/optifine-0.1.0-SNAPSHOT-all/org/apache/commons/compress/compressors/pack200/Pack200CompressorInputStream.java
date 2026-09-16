package org.apache.commons.compress.compressors.pack200;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.jar.Pack200.Unpacker;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class Pack200CompressorInputStream extends CompressorInputStream {
   private final InputStream originalInput;
   private final StreamBridge streamBridge;
   private static final byte[] CAFE_DOOD = new byte[]{-54, -2, -48, 13};
   private static final int SIG_LENGTH = CAFE_DOOD.length;

   public Pack200CompressorInputStream(InputStream var1) {
      this(var1, Pack200Strategy.IN_MEMORY);
   }

   public Pack200CompressorInputStream(InputStream var1, Pack200Strategy var2) {
      this(var1, null, var2, null);
   }

   public Pack200CompressorInputStream(InputStream var1, Map<String, String> var2) {
      this(var1, Pack200Strategy.IN_MEMORY, var2);
   }

   public Pack200CompressorInputStream(InputStream var1, Pack200Strategy var2, Map<String, String> var3) {
      this(var1, null, var2, var3);
   }

   public Pack200CompressorInputStream(File var1) {
      this(var1, Pack200Strategy.IN_MEMORY);
   }

   public Pack200CompressorInputStream(File var1, Pack200Strategy var2) {
      this(null, var1, var2, null);
   }

   public Pack200CompressorInputStream(File var1, Map<String, String> var2) {
      this(var1, Pack200Strategy.IN_MEMORY, var2);
   }

   public Pack200CompressorInputStream(File var1, Pack200Strategy var2, Map<String, String> var3) {
      this(null, var1, var2, var3);
   }

   private Pack200CompressorInputStream(InputStream var1, File var2, Pack200Strategy var3, Map<String, String> var4) {
      this.originalInput = var1;
      this.streamBridge = var3.newStreamBridge();
      JarOutputStream var5 = new JarOutputStream(this.streamBridge);
      Unpacker var6 = Pack200.newUnpacker();
      if (var4 != null) {
         var6.properties().putAll(var4);
      }

      if (var2 == null) {
         var6.unpack(new FilterInputStream(var1) {
            @Override
            public void close() {
            }
         }, var5);
      } else {
         var6.unpack(var2, var5);
      }

      var5.close();
   }

   @Override
   public int read() {
      return this.streamBridge.getInput().read();
   }

   @Override
   public int read(byte[] var1) {
      return this.streamBridge.getInput().read(var1);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      return this.streamBridge.getInput().read(var1, var2, var3);
   }

   @Override
   public int available() {
      return this.streamBridge.getInput().available();
   }

   @Override
   public boolean markSupported() {
      try {
         return this.streamBridge.getInput().markSupported();
      } catch (IOException var2) {
         return false;
      }
   }

   @Override
   public void mark(int var1) {
      try {
         this.streamBridge.getInput().mark(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   @Override
   public void reset() {
      this.streamBridge.getInput().reset();
   }

   @Override
   public long skip(long var1) {
      return this.streamBridge.getInput().skip(var1);
   }

   @Override
   public void close() {
      try {
         this.streamBridge.stop();
      } finally {
         if (this.originalInput != null) {
            this.originalInput.close();
         }
      }
   }

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < SIG_LENGTH) {
         return false;
      }

      for (int var2 = 0; var2 < SIG_LENGTH; var2++) {
         if (var0[var2] != CAFE_DOOD[var2]) {
            return false;
         }
      }

      return true;
   }
}
