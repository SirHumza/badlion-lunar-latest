package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.tukaani.xz.DeltaOptions;
import org.tukaani.xz.FinishableWrapperOutputStream;
import org.tukaani.xz.UnsupportedOptionsException;

class DeltaDecoder extends CoderBase {
   DeltaDecoder() {
      super(Number.class);
   }

   @Override
   InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5) {
      return new DeltaOptions(this.getOptionsFromCoder(var4)).getInputStream(var1);
   }

   @Override
   OutputStream encode(OutputStream var1, Object var2) {
      int var3 = numberOptionOrDefault(var2, 1);

      try {
         return new DeltaOptions(var3).getOutputStream(new FinishableWrapperOutputStream(var1));
      } catch (UnsupportedOptionsException var5) {
         throw new IOException(var5.getMessage());
      }
   }

   @Override
   byte[] getOptionsAsProperties(Object var1) {
      return new byte[]{(byte)(numberOptionOrDefault(var1, 1) - 1)};
   }

   @Override
   Object getOptionsFromCoder(Coder var1, InputStream var2) {
      return this.getOptionsFromCoder(var1);
   }

   private int getOptionsFromCoder(Coder var1) {
      return var1.properties != null && var1.properties.length != 0 ? (0xFF & var1.properties[0]) + 1 : 1;
   }
}
