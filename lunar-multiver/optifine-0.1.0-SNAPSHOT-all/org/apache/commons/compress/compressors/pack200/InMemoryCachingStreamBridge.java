package org.apache.commons.compress.compressors.pack200;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

class InMemoryCachingStreamBridge extends StreamBridge {
   InMemoryCachingStreamBridge() {
      super(new ByteArrayOutputStream());
   }

   @Override
   InputStream getInputView() {
      return new ByteArrayInputStream(((ByteArrayOutputStream)this.out).toByteArray());
   }
}
