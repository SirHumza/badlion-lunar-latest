package org.apache.commons.compress.compressors.pack200;

public enum Pack200Strategy {
   IN_MEMORY {
      @Override
      StreamBridge newStreamBridge() {
         return new InMemoryCachingStreamBridge();
      }
   },
   TEMP_FILE {
      @Override
      StreamBridge newStreamBridge() {
         return new TempFileCachingStreamBridge();
      }
   };

   Pack200Strategy() {
   }

   abstract StreamBridge newStreamBridge();
}
