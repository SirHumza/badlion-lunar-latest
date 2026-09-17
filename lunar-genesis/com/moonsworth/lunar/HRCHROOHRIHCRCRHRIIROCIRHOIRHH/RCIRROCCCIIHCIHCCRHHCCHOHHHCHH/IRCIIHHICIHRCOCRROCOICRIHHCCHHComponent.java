package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final String CIROCHHCRRCCROHHOOCRHIRHROIIOH;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1) {
      this.CIROCHHCRRCCROHHOOCRHIRHROIIOH = var1;
   }

   @Override
   public Collection<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      return List.copyOf(var1.getData().values());
   }

   @Override
   public String getId() {
      return "freeze/" + Objects.hash(this.OHRHOCORCOICIOIOCCCOOIRHCRRIOO());
   }

   @Override
   public String getNamespace() {
      return this.CIROCHHCRRCCROHHOOCRHIRHROIIOH;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, final CRRRICCRROCOHHOHIICIHORCOORRRH... var1) {
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0) {
         {
            HashSet var3 = new HashSet<>(Arrays.asList(var1));
            this.CCHCCOICICHORCOOHOIHRROICICIOI.addAll(var3);
            this.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1xxx -> var3);
         }
      };
   }
}
