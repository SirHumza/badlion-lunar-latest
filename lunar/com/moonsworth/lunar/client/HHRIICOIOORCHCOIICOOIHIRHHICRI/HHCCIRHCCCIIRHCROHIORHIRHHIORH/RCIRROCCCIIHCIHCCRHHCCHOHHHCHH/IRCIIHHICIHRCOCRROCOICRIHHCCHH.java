package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Iterator;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final String RHROOHHRCRCRRCOCOHOCCICIIHHOHI = "test";
   private static final int RRCOHIIIOCHOOHROORHRCHRCCICROO = 20;
   private static final int HRORCHHCROHRRROOOORHRRCCOOCHHO = 30;
   private int CORRCCIIOIIRICOCIRHOOIIIOCOOCR = 0;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable String var1) {
      super(var1);
      if (!"test".equals(var1) && com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
         throw new IllegalAccessError("DevOptionBaker can only be used in a development environment!");
      }
   }

   @Override
   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      Set<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var2
   ) {
      Iterator var3 = var1.getChildren().iterator();

      while (var3.hasNext()) {
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3.next();
         if (var4.IROIOIOOCOCCOICCHIRHROIOCOOOOR() || this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var2)) {
            var3.remove();
            var2.add(var4);
         }

         if (this.CORRCCIIOIIRICOCIRHOOIIIOCOOCR > 30) {
            throw new StackOverflowError("Found option with hierarchy deeper than 30 for id: " + this.getId());
         }

         if (this.CORRCCIIOIIRICOCIRHOOIIIOCOOCR > 20) {
            System.out.println("Depth detection: " + var4.ROIRROHRCIRCCOOICHCHOHRRRCOORH().getId());
         }

         this.CORRCCIIOIIRICOCIRHOOIIIOCOOCR++;
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2);
         this.CORRCCIIOIIRICOCIRHOOIIIOCOOCR--;
      }
   }
}
