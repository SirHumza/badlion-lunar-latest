package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Map;
import java.util.Map.Entry;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   public String HCOIOHCCHIHRCHCCICCIRCIOHCRIHH;
   public String description;
   public Map<String, IIHRRHORCRCROCHHOHORCHCROCIHRO> HHIOCIRHCHIRHHRIRCHOIRORHCRCRI;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(String var1, String var2, Map<String, IIHRRHORCRCROCHHOHORCHCROCIHRO> var3) {
      this.HCOIOHCCHIHRCHCCICCIRCIOHCRIHH = var1;
      this.description = var2;
      this.HHIOCIRHCHIRHHRIRCHOIRORHCRCRI = var3;
   }

   public String CRRRICCRROCOHHOHIICIHORCOORRRH(Map<String, String> var1) {
      String var2 = this.HCOIOHCCHIHRCHCCICCIRCIOHCRIHH;

      for (Entry var4 : this.HHIOCIRHCHIRHHRIRCHOIRORHCRCRI.entrySet()) {
         String var5 = (String)var4.getKey();
         IIHRRHORCRCROCHHOHORCHCROCIHRO var6 = (IIHRRHORCRCROCHHOHORCHCROCIHRO)var4.getValue();
         String var7 = var6.RCHHHORIRORROOHRRHHIIIOIROHHCC;
         if (var1 != null && var1.containsKey(var5)) {
            var7 = (String)var1.get(var5);
            if (var6.CIOORRCRICOIICROHRHRHHOHRCCRII.size() > 0 && !var6.CIOORRCRICOIICROHRHRHHOHRCCRII.contains(var7)) {
               throw new IllegalArgumentException("The variable " + var5 + " in the server URL has invalid value " + var7 + ".");
            }
         }

         var2 = var2.replace("{" + var5 + "}", var7);
      }

      return var2;
   }

   public String ORCOCORROHIROCCIORORRRRCHIOOCH() {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(null);
   }
}
