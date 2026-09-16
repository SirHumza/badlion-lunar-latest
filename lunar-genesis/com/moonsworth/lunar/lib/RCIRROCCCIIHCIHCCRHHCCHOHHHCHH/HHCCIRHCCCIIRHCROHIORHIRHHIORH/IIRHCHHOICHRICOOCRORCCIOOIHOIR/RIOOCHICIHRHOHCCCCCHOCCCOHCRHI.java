package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.io.InputStream;
import java.nio.ByteBuffer;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends InputStream {
   protected final ByteBuffer ROROHOCRRHCCROICOHCIOIOCCOHHCR;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(ByteBuffer var1) {
      this.ROROHOCRRHCCROICOHCIOIOCCOHHCR = var1;
   }

   @Override
   public int available() {
      return this.ROROHOCRRHCCROICOHCIOIOCCOHHCR.remaining();
   }

   @Override
   public int read() {
      return this.ROROHOCRRHCCROICOHCIOIOCCOHHCR.hasRemaining() ? this.ROROHOCRRHCCROICOHCIOIOCCOHHCR.get() & 0xFF : -1;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (!this.ROROHOCRRHCCROICOHCIOIOCCOHHCR.hasRemaining()) {
         return -1;
      }

      var3 = Math.min(var3, this.ROROHOCRRHCCROICOHCIOIOCCOHHCR.remaining());
      this.ROROHOCRRHCCROICOHCIOIOCCOHHCR.get(var1, var2, var3);
      return var3;
   }
}
