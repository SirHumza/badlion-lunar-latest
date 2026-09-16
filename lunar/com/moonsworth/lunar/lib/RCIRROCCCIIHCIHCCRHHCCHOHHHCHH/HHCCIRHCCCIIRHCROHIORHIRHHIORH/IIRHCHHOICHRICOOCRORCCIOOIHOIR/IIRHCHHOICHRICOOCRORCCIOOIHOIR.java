package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var0, Collection<String> var1, Collection<String> var2) {
      if (var1 == null && var2 == null) {
         return false;
      } else if (var2 == null) {
         return var1.contains(var0);
      } else {
         return var1 == null ? !var2.contains(var0) : !var2.contains(var0) || var1.contains(var0);
      }
   }

   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCOHORHCROHICRRIHCIHHRRCIHICRI(Set<String> var0, Set<String> var1) {
      return var1 != null || var0 != null && !var0.isEmpty()
         ? IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var0, var1)
         : null;
   }

   public static Set<String> CIOHHCORHRCCRICCCORIHCRHCCCRRR(Set<String> var0, Set<String> var1) {
      if (var0 == null) {
         return var1;
      }

      if (var1 == null) {
         return var0;
      }

      HashSet var2 = new HashSet();

      for (String var4 : var1) {
         if (var0.contains(var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
      private static final long RCICHHRIIHHHHRIOHCIHHCHIOHHIHI = 1L;
      private final Set<String> HCRCCRIHIHCIIHOICRRRHCIIOIIHCR;
      private final Set<String> CRCIRCOOHHICHIIIROHRORCRHCHCOI;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Set<String> var1, Set<String> var2) {
         if (var1 == null) {
            var1 = Collections.emptySet();
         }

         this.HCRCCRIHIHCIIHOICRRRHCIIOIIHCR = var1;
         this.CRCIRCOOHHICHIIIROHRORCRHCHCOI = var2;
      }

      public static IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Set<String> var0, Set<String> var1) {
         return new IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
      }

      public boolean IIRRRHRHIRCCIIHORIHRHHHOIIHICH(Object var1) {
         return this.CRCIRCOOHHICHIIIROHRORCRHCHCOI != null && !this.CRCIRCOOHHICHIIIROHRORCRHCHCOI.contains(var1)
            || this.HCRCCRIHIHCIIHOICRRRHCIIOIIHCR.contains(var1);
      }
   }
}
