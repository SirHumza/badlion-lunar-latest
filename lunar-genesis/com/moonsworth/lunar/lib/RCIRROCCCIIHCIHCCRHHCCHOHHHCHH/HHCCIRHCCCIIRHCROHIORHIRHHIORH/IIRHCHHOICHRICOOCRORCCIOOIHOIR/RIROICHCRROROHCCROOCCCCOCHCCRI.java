package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.io.Serializable;

public abstract class RIROICHCRROROHCCROOCCCCOCHCCRI {
   public static final RIROICHCRROROHCCROOCCCCOCHCCRI RCHIOORHRIIHCCIIRRCRHRRIHHIOOI = new RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();

   protected RIROICHCRROROHCCROOCCCCOCHCCRI() {
   }

   public static RIROICHCRROROHCCROOCCCCOCHCCRI OCIHRICRHRRHIOHIIHIROCRIRHCCIR(final String var0, final String var1) {
      boolean var2 = var0 != null && !var0.isEmpty();
      boolean var3 = var1 != null && !var1.isEmpty();
      if (var2) {
         return var3 ? new RIROICHCRROROHCCROOCCCCOCHCCRI() {
            @Override
            public String CCOOHCORIOIRCOICIOIOOCRIICCHCO(String var1x) {
               return var0 + var1x + var1;
            }

            @Override
            public String IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(String var1x) {
               if (var1x.startsWith(var0)) {
                  String var2x = var1x.substring(var0.length());
                  if (var2x.endsWith(var1)) {
                     return var2x.substring(0, var2x.length() - var1.length());
                  }
               }

               return null;
            }

            @Override
            public String toString() {
               return "[PreAndSuffixTransformer('" + var0 + "','" + var1 + "')]";
            }
         } : new RIROICHCRROROHCCROOCCCCOCHCCRI() {
            @Override
            public String CCOOHCORIOIRCOICIOIOOCRIICCHCO(String var1) {
               return var0 + var1;
            }

            @Override
            public String IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(String var1) {
               return var1.startsWith(var0) ? var1.substring(var0.length()) : null;
            }

            @Override
            public String toString() {
               return "[PrefixTransformer('" + var0 + "')]";
            }
         };
      } else {
         return var3 ? new RIROICHCRROROHCCROOCCCCOCHCCRI() {
            @Override
            public String CCOOHCORIOIRCOICIOIOOCRIICCHCO(String var1x) {
               return var1x + var1;
            }

            @Override
            public String IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(String var1x) {
               return var1x.endsWith(var1) ? var1x.substring(0, var1x.length() - var1.length()) : null;
            }

            @Override
            public String toString() {
               return "[SuffixTransformer('" + var1 + "')]";
            }
         } : RCHIOORHRIIHCCIIRRCRHRRIHHIOOI;
      }
   }

   public static RIROICHCRROROHCCROOCCCCOCHCCRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIROICHCRROROHCCROOCCCCOCHCCRI var0, RIROICHCRROROHCCROOCCCCOCHCCRI var1) {
      return new RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
   }

   public abstract String CCOOHCORIOIRCOICIOIOOCRIICCHCO(String var1);

   public abstract String IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(String var1);

   protected static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RIROICHCRROROHCCROOCCCCOCHCCRI implements Serializable {
      private static final long IOCIRROICIIOHCORHCRRROIOHOICCC = 1L;

      @Override
      public String CCOOHCORIOIRCOICIOIOOCRIICCHCO(String var1) {
         return var1;
      }

      @Override
      public String IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(String var1) {
         return var1;
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RIROICHCRROROHCCROOCCCCOCHCCRI implements Serializable {
      private static final long RORROCCORCCIHHIOIRHCIOCOHIROHH = 1L;
      protected final RIROICHCRROROHCCROOCCCCOCHCCRI IIOIIHIORROIOHICCORRIICICCROIR;
      protected final RIROICHCRROROHCCROOCCCCOCHCCRI ORHRRCHHRIRCRIIOIRIOIRCIHOIHCH;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIROICHCRROROHCCROOCCCCOCHCCRI var1, RIROICHCRROROHCCROOCCCCOCHCCRI var2) {
         this.IIOIIHIORROIOHICCORRIICICCROIR = var1;
         this.ORHRRCHHRIRCRIIOIRIOIRCIHOIHCH = var2;
      }

      @Override
      public String CCOOHCORIOIRCOICIOIOOCRIICCHCO(String var1) {
         return this.IIOIIHIORROIOHICCORRIICICCROIR.CCOOHCORIOIRCOICIOIOOCRIICCHCO(this.ORHRRCHHRIRCRIIOIRIOIRCIHOIHCH.CCOOHCORIOIRCOICIOIOOCRIICCHCO(var1));
      }

      @Override
      public String IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(String var1) {
         var1 = this.IIOIIHIORROIOHICCORRIICICCROIR.IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(var1);
         if (var1 != null) {
            var1 = this.ORHRRCHHRIRCRIIOIRIOIRCIHOIHCH.IIIOIHOHRIROHRIIHIHHIHHOOHRRHI(var1);
         }

         return var1;
      }

      @Override
      public String toString() {
         return "[ChainedTransformer(" + this.IIOIIHIORROIOHICCORRIICICCROIR + ", " + this.ORHRRCHHRIRCRIIOIRIOIRCIHOIHCH + ")]";
      }
   }
}
