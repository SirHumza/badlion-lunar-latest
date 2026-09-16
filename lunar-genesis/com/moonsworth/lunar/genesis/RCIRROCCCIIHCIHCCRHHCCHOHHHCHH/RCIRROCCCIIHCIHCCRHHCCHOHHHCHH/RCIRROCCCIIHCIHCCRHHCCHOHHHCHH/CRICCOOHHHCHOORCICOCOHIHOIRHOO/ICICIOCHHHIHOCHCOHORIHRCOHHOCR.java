package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.io.Reader;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
class ICICIOCHHHIHOCHCOHORIHRCOHHOCR extends Reader {
   private final Iterator<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> HOCCOHHHIHHCCIIRCORRHOCOHROOOO;
   private @Nullable Reader current;

   ICICIOCHHHIHOCHCOHORIHRCOHHOCR(Iterator<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> var1) {
      this.HOCCOHHHIHHCCIIRCORRHOCOHROOOO = var1;
      this.advance();
   }

   private void advance() {
      this.close();
      if (this.HOCCOHHHIHHCCIIRCORRHOCOHROOOO.hasNext()) {
         this.current = this.HOCCOHHHIHHCCIIRCORRHOCOHROOOO.next().openStream();
      }
   }

   @Override
   public int read(char @Nullable [] var1, int var2, int var3) {
      if (this.current == null) {
         return -1;
      } else {
         int var4 = this.current.read(var1, var2, var3);
         if (var4 == -1) {
            this.advance();
            return this.read(var1, var2, var3);
         } else {
            return var4;
         }
      }
   }

   @Override
   public long skip(long var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0L, "n is negative"
      );
      if (var1 > 0L) {
         while (this.current != null) {
            long var3 = this.current.skip(var1);
            if (var3 > 0L) {
               return var3;
            }

            this.advance();
         }
      }

      return 0L;
   }

   @Override
   public boolean ready() {
      return this.current != null && this.current.ready();
   }

   @Override
   public void close() {
      if (this.current != null) {
         try {
            this.current.close();
         } finally {
            this.current = null;
         }
      }
   }
}
