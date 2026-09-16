package org.apache.commons.compress.compressors.pack200;

import java.io.OutputStream;
import java.util.Map;
import java.util.jar.JarInputStream;
import java.util.jar.Pack200;
import java.util.jar.Pack200.Packer;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;

public class Pack200CompressorOutputStream extends CompressorOutputStream {
   private boolean finished = false;
   private final OutputStream originalOutput;
   private final StreamBridge streamBridge;
   private final Map<String, String> properties;

   public Pack200CompressorOutputStream(OutputStream var1) {
      this(var1, Pack200Strategy.IN_MEMORY);
   }

   public Pack200CompressorOutputStream(OutputStream var1, Pack200Strategy var2) {
      this(var1, var2, null);
   }

   public Pack200CompressorOutputStream(OutputStream var1, Map<String, String> var2) {
      this(var1, Pack200Strategy.IN_MEMORY, var2);
   }

   public Pack200CompressorOutputStream(OutputStream var1, Pack200Strategy var2, Map<String, String> var3) {
      this.originalOutput = var1;
      this.streamBridge = var2.newStreamBridge();
      this.properties = var3;
   }

   @Override
   public void write(int var1) {
      this.streamBridge.write(var1);
   }

   @Override
   public void write(byte[] var1) {
      this.streamBridge.write(var1);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      this.streamBridge.write(var1, var2, var3);
   }

   @Override
   public void close() {
      this.finish();

      try {
         this.streamBridge.stop();
      } finally {
         this.originalOutput.close();
      }
   }

   public void finish() {
      if (!this.finished) {
         this.finished = true;
         Packer var1 = Pack200.newPacker();
         if (this.properties != null) {
            var1.properties().putAll(this.properties);
         }

         JarInputStream var2 = null;
         boolean var3 = false;

         try {
            var1.pack(var2 = new JarInputStream(this.streamBridge.getInput()), this.originalOutput);
            var3 = true;
         } finally {
            if (!var3) {
               IOUtils.closeQuietly(var2);
            }
         }
      }
   }
}
