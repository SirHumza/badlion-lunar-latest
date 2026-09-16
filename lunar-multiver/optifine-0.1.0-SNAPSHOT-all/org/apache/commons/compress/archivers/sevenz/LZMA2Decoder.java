package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.tukaani.xz.FinishableWrapperOutputStream;
import org.tukaani.xz.LZMA2InputStream;
import org.tukaani.xz.LZMA2Options;

class LZMA2Decoder extends CoderBase {
   LZMA2Decoder() {
      super(LZMA2Options.class, Number.class);
   }

   @Override
   InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5) {
      try {
         int var6 = this.getDictionarySize(var4);
         return new LZMA2InputStream(var1, var6);
      } catch (IllegalArgumentException var7) {
         throw new IOException(var7.getMessage());
      }
   }

   @Override
   OutputStream encode(OutputStream var1, Object var2) {
      LZMA2Options var3 = this.getOptions(var2);
      FinishableWrapperOutputStream var4 = new FinishableWrapperOutputStream(var1);
      return var3.getOutputStream(var4);
   }

   @Override
   byte[] getOptionsAsProperties(Object var1) {
      int var2 = this.getDictSize(var1);
      int var3 = Integer.numberOfLeadingZeros(var2);
      int var4 = (var2 >>> 30 - var3) - 2;
      return new byte[]{(byte)((19 - var3) * 2 + var4)};
   }

   @Override
   Object getOptionsFromCoder(Coder var1, InputStream var2) {
      return this.getDictionarySize(var1);
   }

   private int getDictSize(Object var1) {
      return var1 instanceof LZMA2Options ? ((LZMA2Options)var1).getDictSize() : this.numberOptionOrDefault(var1);
   }

   private int getDictionarySize(Coder var1) {
      int var2 = 255 & var1.properties[0];
      if ((var2 & -64) != 0) {
         throw new IllegalArgumentException("Unsupported LZMA2 property bits");
      } else if (var2 > 40) {
         throw new IllegalArgumentException("Dictionary larger than 4GiB maximum size");
      } else {
         return var2 == 40 ? -1 : (2 | var2 & 1) << var2 / 2 + 11;
      }
   }

   private LZMA2Options getOptions(Object var1) {
      if (var1 instanceof LZMA2Options) {
         return (LZMA2Options)var1;
      }

      LZMA2Options var2 = new LZMA2Options();
      var2.setDictSize(this.numberOptionOrDefault(var1));
      return var2;
   }

   private int numberOptionOrDefault(Object var1) {
      return numberOptionOrDefault(var1, 8388608);
   }
}
