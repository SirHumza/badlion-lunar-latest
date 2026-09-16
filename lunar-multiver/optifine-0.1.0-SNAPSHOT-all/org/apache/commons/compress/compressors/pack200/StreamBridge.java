package org.apache.commons.compress.compressors.pack200;

import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

abstract class StreamBridge extends FilterOutputStream {
   private InputStream input;
   private final Object INPUT_LOCK = new Object();

   protected StreamBridge(OutputStream var1) {
      super(var1);
   }

   protected StreamBridge() {
      this(null);
   }

   InputStream getInput() {
      synchronized (this.INPUT_LOCK) {
         if (this.input == null) {
            this.input = this.getInputView();
         }
      }

      return this.input;
   }

   abstract InputStream getInputView();

   void stop() {
      this.close();
      synchronized (this.INPUT_LOCK) {
         if (this.input != null) {
            this.input.close();
            this.input = null;
         }
      }
   }
}
