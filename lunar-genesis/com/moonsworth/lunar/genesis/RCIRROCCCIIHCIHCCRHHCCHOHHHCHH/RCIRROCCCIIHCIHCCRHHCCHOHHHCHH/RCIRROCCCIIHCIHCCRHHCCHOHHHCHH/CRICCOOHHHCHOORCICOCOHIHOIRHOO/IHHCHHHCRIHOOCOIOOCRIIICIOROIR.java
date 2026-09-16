package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class IHHCHHHCRIHOOCOIOOCRIIICIOROIR extends FilterInputStream {
   private long count;
   private long mark = -1L;

   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR(InputStream var1) {
      super(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         )
      );
   }

   public long getCount() {
      return this.count;
   }

   @Override
   public int read() {
      int var1 = this.in.read();
      if (var1 != -1) {
         this.count++;
      }

      return var1;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = this.in.read(var1, var2, var3);
      if (var4 != -1) {
         this.count += var4;
      }

      return var4;
   }

   @Override
   public long skip(long var1) {
      long var3 = this.in.skip(var1);
      this.count += var3;
      return var3;
   }

   @Override
   public synchronized void mark(int var1) {
      this.in.mark(var1);
      this.mark = this.count;
   }

   @Override
   public synchronized void reset() {
      if (!this.in.markSupported()) {
         throw new IOException("Mark not supported");
      }

      if (this.mark == -1L) {
         throw new IOException("Mark not set");
      }

      this.in.reset();
      this.count = this.mark;
   }
}
