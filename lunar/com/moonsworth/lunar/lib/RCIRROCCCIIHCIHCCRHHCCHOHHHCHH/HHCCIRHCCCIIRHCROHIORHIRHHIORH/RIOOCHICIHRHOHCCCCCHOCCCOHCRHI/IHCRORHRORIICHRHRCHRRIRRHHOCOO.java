package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class IHCRORHRORIICHRHRCHRRIRRHHOCOO {
   static final Class<?>[] IIRRCRCIOCOOIOIOCOORIHIHOCHRIC = new Class[0];
   final String ICOOIRROORORCIROICIIIIIHOOHIRH;
   final Class<?>[] HROIHOHOIHCHOOICORRICHOHCIIOHC;

   public IHCRORHRORIICHRHRCHRRIRRHHOCOO(Method var1) {
      this(var1.getName(), var1.getParameterTypes());
   }

   public IHCRORHRORIICHRHRCHRRIRRHHOCOO(Constructor<?> var1) {
      this("", var1.getParameterTypes());
   }

   public IHCRORHRORIICHRHRCHRRIRRHHOCOO(String var1, Class<?>[] var2) {
      this.ICOOIRROORORCIROICIIIIIHOOHIRH = var1;
      this.HROIHOHOIHCHOOICORRICHOHCIIOHC = var2 == null ? IIRRCRCIOCOOIOIOCOORIHIHOCHRIC : var2;
   }

   public String getName() {
      return this.ICOOIRROORORCIROICIIIIIHOOHIRH;
   }

   public int RRHIIIRCHRHHOOICIOCRROCCOOCIIC() {
      return this.HROIHOHOIHCHOOICORRICHOHCIIOHC.length;
   }

   @Override
   public String toString() {
      return this.ICOOIRROORORCIROICIIIIIHOOHIRH + "(" + this.HROIHOHOIHCHOOICORRICHOHCIIOHC.length + "-args)";
   }

   @Override
   public int hashCode() {
      return this.ICOOIRROORORCIROICIIIIIHOOHIRH.hashCode() + this.HROIHOHOIHCHOOICORRICHOHCIIOHC.length;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (var1.getClass() != this.getClass()) {
         return false;
      }

      IHCRORHRORIICHRHRCHRRIRRHHOCOO var2 = (IHCRORHRORIICHRHRCHRRIRRHHOCOO)var1;
      if (!this.ICOOIRROORORCIROICIIIIIHOOHIRH.equals(var2.ICOOIRROORORCIROICIIIIIHOOHIRH)) {
         return false;
      }

      Class[] var3 = var2.HROIHOHOIHCHOOICORRICHOHCIIOHC;
      int var4 = this.HROIHOHOIHCHOOICORRICHOHCIIOHC.length;
      if (var3.length != var4) {
         return false;
      }

      for (int var5 = 0; var5 < var4; var5++) {
         Class var6 = var3[var5];
         Class var7 = this.HROIHOHOIHCHOOICORRICHOHCIIOHC[var5];
         if (var6 != var7) {
            return false;
         }
      }

      return true;
   }
}
