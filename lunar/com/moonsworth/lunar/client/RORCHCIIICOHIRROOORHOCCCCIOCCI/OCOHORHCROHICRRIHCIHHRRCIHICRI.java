package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.Nullable;

public interface OCOHORHCROHICRRIHCIHHRRCIHICRI {
   int RCROHIORRCHOHHOCROCHICOHHCCHCO();

   String HHOOIRORCCOOORRIIIOCRCRHIICOCH(int var1);

   OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(int var1);

   @Nullable
   Map<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, int[]> RHIHOOOHCIRRIOCRRRHRIHIORICOHI(int var1);

   static OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var0, String[] var1, OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>[] var2, Map<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, int[]>[] var3
   ) {
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0, var1, var2, var3);
   }

   static OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIHRRHORCRCROCHHOHORCHCROCIHRO var0) {
      int var1 = var0.size() - 1;
      String[] var2 = new String[var0.size()];
      OHHRIOHROOIHOROCIRHCHORIHRRRRI[] var3 = new OHHRIOHROOIHOROCIRHCHORIHRRRRI[var0.size()];
      Map[] var4 = new Map[var0.size()];

      for (Entry var6 : var0.entrySet()) {
         int var7 = ((OHHRIOHROOIHOROCIRHCHORIHRRRRI)var6.getValue()).getId();
         var2[var7] = (String)var6.getKey();
         var3[var7] = (OHHRIOHROOIHOROCIRHCHORIHRRRRI)var6.getValue();
         var4[var7] = (Map)var0.RCIHRIHHOHCCCCHOHROIOICHRIHCCH().get(var7);
      }

      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1, var2, var3, var4);
   }
}
