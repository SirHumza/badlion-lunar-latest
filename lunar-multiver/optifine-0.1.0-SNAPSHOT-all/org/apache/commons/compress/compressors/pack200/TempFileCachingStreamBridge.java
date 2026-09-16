package org.apache.commons.compress.compressors.pack200;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

class TempFileCachingStreamBridge extends StreamBridge {
   private final File f = File.createTempFile("commons-compress", "packtemp");

   TempFileCachingStreamBridge() {
      this.f.deleteOnExit();
      this.out = new FileOutputStream(this.f);
   }

   @Override
   InputStream getInputView() {
      this.out.close();
      return new FileInputStream(this.f) {
         @Override
         public void close() {
            super.close();
            TempFileCachingStreamBridge.this.f.delete();
         }
      };
   }
}
