package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.io.Serializable;

public class RCIROOOOICRHCCRRCIORHHIRCOIIIC implements Serializable {
   private static final long HROICHOOIIOHRCROROHROOCHCHOCOI = 1L;
   protected static final RCIROOOOICRHCCRRCIORHHIRCOIIIC ORIIOORRIRCRHOCORIHOIHIHCHIHHO = new RCIROOOOICRHCCRRCIORHHIRCOIIIC();

   public boolean HIOOOIRCCROCRIRCROOHRCCOOIOIOH(Class<?> var1) {
      return false;
   }

   public static RCIROOOOICRHCCRRCIORHHIRCOIIIC OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Class<?>[] var0) {
      if (var0 == null) {
         return ORIIOORRIRCRHOCORIHOIHIHCHIHHO;
      }

      switch (var0.length) {
         case 0:
            return ORIIOORRIRCRHOCORIHOIHIHCHIHHO;
         case 1:
            return new RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0[0]);
         default:
            return new RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RCIROOOOICRHCCRRCIORHHIRCOIIIC {
      private static final long RCIRCCOROCHIOIROIHRHCOCHOCORIR = 1L;
      private final Class<?> IRHOOIICCCOOOCOCIIIRRIOIOHHIIR;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<?> var1) {
         this.IRHOOIICCCOOOCOCIIIRRIOIOHHIIR = var1;
      }

      @Override
      public boolean HIOOOIRCCROCRIRCROOHRCCOOIOIOH(Class<?> var1) {
         return var1 == this.IRHOOIICCCOOOCOCIIIRRIOIOHHIIR || this.IRHOOIICCCOOOCOCIIIRRIOIOHHIIR.isAssignableFrom(var1);
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RCIROOOOICRHCCRRCIORHHIRCOIIIC implements Serializable {
      private static final long ROIRORCHRRCIRIHCRCCCIRHIOCRRHI = 1L;
      private final Class<?>[] RCRHCCRHHHCOCHHRIRHHCOHCIHRIOR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?>[] var1) {
         this.RCRHCCRHHHCOCHHRIRHHCOHCIHRIOR = var1;
      }

      @Override
      public boolean HIOOOIRCCROCRIRCROOHRCCOOIOIOH(Class<?> var1) {
         int var2 = 0;

         for (int var3 = this.RCRHCCRHHHCOCHHRIRHHCOHCIHRIOR.length; var2 < var3; var2++) {
            Class var4 = this.RCRHCCRHHHCOCHHRIRHHCOHCIHRIOR[var2];
            if (var1 == var4 || var4.isAssignableFrom(var1)) {
               return true;
            }
         }

         return false;
      }
   }
}
