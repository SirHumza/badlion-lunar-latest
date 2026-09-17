package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   public abstract Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2, CRRRICCRROCOHHOHIICIHORCOORRRH var3, Object var4);

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IIHRRHORCRCROCHHOHORCHCROCIHRO implements Serializable {
      private static final long HOIHIOHROCOCCORRHCHRIOHRRCROIO = 1L;
      protected final Map<String, Object> ICRHHCOOOOIROHIIHRIIRIRIHICOOC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         this(new HashMap<>());
      }

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<String, Object> var1) {
         this.ICRHHCOOOOIROHIIHRIIRIRIHICOOC = var1;
      }

      public IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORHIOICIOCRRHOOCOHRORIHICHRCRR(String var1, Object var2) {
         this.ICRHHCOOOOIROHIIHRIIRIRIHICOOC.put(var1, var2);
         return this;
      }

      public IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Class<?> var1, Object var2) {
         this.ICRHHCOOOOIROHIIHRIIRIRIHICOOC.put(var1.getName(), var2);
         return this;
      }

      @Override
      public Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2, CRRRICCRROCOHHOHIICIHORCOORRRH var3, Object var4) {
         if (!(var1 instanceof String)) {
            var2.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHCCOOCIIIIIIHIOHRICIIHCCIIIIH(
                  var1
               ),
               String.format(
                  "Unrecognized inject value id type (%s), expecting String",
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRROIHOIHOORCCOHOOCHRRRCIIRHHH(
                     var1
                  )
               )
            );
         }

         String var5 = (String)var1;
         Object var6 = this.ICRHHCOOOOIROHIIHRIIRIRIHICOOC.get(var5);
         if (var6 == null && !this.ICRHHCOOOOIROHIIHRIIRIRIHICOOC.containsKey(var5)) {
            throw new IllegalArgumentException("No injectable id with value '" + var5 + "' found (for property '" + var3.getName() + "')");
         } else {
            return var6;
         }
      }
   }
}
