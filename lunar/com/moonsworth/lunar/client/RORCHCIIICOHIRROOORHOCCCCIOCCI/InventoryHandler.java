package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   public static String CRRRICCRROCOHHOHIICIHORCOORRRH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0) {
      if (var0 == null) {
         return "Container is null";
      }

      StringBuilder var1 = new StringBuilder();
      var1.append("TraitContainer [size=").append(var0.size()).append("]\n");
      var0.stream().sorted((var0x, var1x) -> Integer.compare(var0x.type(), var1x.type())).forEach(var2 -> {
         String var3 = var0.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var2.type());
         var1.append("  - ").append(var3).append(" (").append(var2.type()).append("): ");
         var1.append(var2.value() != null ? var2.value().toString() : "null").append("\n");
      });
      return var1.toString();
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var0, OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var1) {
      if (var0 != null && var1 != null) {
         StringBuilder var2 = new StringBuilder();
         var2.append("TraitType: ").append(var1).append("\n");
         var2.append("  - ID: ").append(var1.getId()).append("\n");
         var2.append("  - Name: ").append(var0.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1.getId())).append("\n");
         Map var3 = var0.RHIHOOOHCIRRIOCRRRHRIHIORICOHI(var1.getId());
         if (var3 != null && !var3.isEmpty()) {
            var2.append("  - Conditions:\n");

            for (Entry var5 : var3.entrySet()) {
               var2.append("    - ").append(var5.getKey()).append(": ");
               List var6 = Arrays.stream((int[])var5.getValue()).mapToObj(var0::HHOOIRORCCOOORRIIIOCRCRHIICOCH).collect(Collectors.toList());
               var2.append(String.join(", ", var6)).append("\n");
            }
         } else {
            var2.append("  - No conditions\n");
         }

         return var2.toString();
      } else {
         return "Registry or TraitType is null";
      }
   }

   public static List<String> RRCRRCORICCHOHHIRCHIROOHIIOHCO(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0) {
      ArrayList var1 = new ArrayList();
      OCOHORHCROHICRRIHCIHHRRCIHICRI var2 = var0.ORORICHHRHHRRORHHIOCORRIROIOHO();

      for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : var0) {
         int var5 = var4.type();
         String var6 = var2.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var5);
         Map var7 = var2.RHIHOOOHCIRRIOCRRRHRIHIORICOHI(var5);
         if (var7 != null) {
            int[] var8 = var7.getOrDefault(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.REQUIRES, new int[0]);

            for (int var12 : var8) {
               OHHRIOHROOIHOROCIRHCHORIHRRRRI var13 = var2.HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(var12);
               if (var13 != null && !var0.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var13)) {
                  String var14 = var2.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var12);
                  var1.add(var6 + " requires " + var14 + " but it is not present");
               }
            }

            int[] var16 = var7.getOrDefault(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CONFLICTS, new int[0]);

            for (int var20 : var16) {
               OHHRIOHROOIHOROCIRHCHORIHRRRRI var21 = var2.HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(var20);
               if (var21 != null && var0.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var21)) {
                  String var15 = var2.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var20);
                  var1.add(var6 + " conflicts with " + var15 + " but both are present");
               }
            }
         }
      }

      return var1;
   }

   public static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var0, OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var1) {
      if (var0 != null && var1 != null) {
         int var2 = var1.getId();
         String var3 = var0.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var2);
         StringBuilder var4 = new StringBuilder();
         var4.append("Related conditions for ").append(var3).append(":\n");
         boolean var5 = false;

         for (int var6 = 0; var6 <= var0.RCROHIORRCHOHHOCROCHICOHHCCHCO(); var6++) {
            if (var6 != var2) {
               Map var7 = var0.RHIHOOOHCIRRIOCRRRHRIHIORICOHI(var6);
               if (var7 != null) {
                  boolean var8 = false;
                  StringBuilder var9 = new StringBuilder();
                  String var10 = var0.HHOOIRORCCOOORRIIIOCRCRHIICOCH(var6);
                  var9.append("  - ").append(var10).append(":\n");

                  for (Entry var12 : var7.entrySet()) {
                     if (Arrays.stream((int[])var12.getValue()).anyMatch(var1x -> var1x == var2)) {
                        var9.append("    - ").append(var12.getKey()).append(" ").append(var3).append("\n");
                        var8 = true;
                        var5 = true;
                     }
                  }

                  if (var8) {
                     var4.append(var9);
                  }
               }
            }
         }

         if (!var5) {
            var4.append("  No other trait types have conditions related to this type\n");
         }

         return var4.toString();
      } else {
         return "Registry or TraitType is null";
      }
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      if (var0 != null && var1 != null) {
         StringBuilder var2 = new StringBuilder();
         var2.append("Comparing trait containers:\n");
         var2.append("Traits only in first container:\n");
         boolean var3 = false;

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 : var0) {
            OHHRIOHROOIHOROCIRHCHORIHRRRRI var6 = var0.ORORICHHRHHRRORHHIOCORRIROIOHO().HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(var5.type());
            if (var6 != null && !var1.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var6)) {
               String var7 = var0.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var5.type());
               var2.append("  - ").append(var7).append(" (").append(var5.type()).append(")\n");
               var3 = true;
            }
         }

         if (!var3) {
            var2.append("  None\n");
         }

         var2.append("Traits only in second container:\n");
         boolean var12 = false;

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var15 : var1) {
            OHHRIOHROOIHOROCIRHCHORIHRRRRI var17 = var1.ORORICHHRHHRRORHHIOCORRIROIOHO().HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(var15.type());
            if (var17 != null && !var0.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var17)) {
               String var8 = var1.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var15.type());
               var2.append("  - ").append(var8).append(" (").append(var15.type()).append(")\n");
               var12 = true;
            }
         }

         if (!var12) {
            var2.append("  None\n");
         }

         var2.append("Traits with different values:\n");
         boolean var14 = false;

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var18 : var0) {
            OHHRIOHROOIHOROCIRHCHORIHRRRRI var19 = var0.ORORICHHRHHRRORHHIOCORRIROIOHO().HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(var18.type());
            if (var19 != null && var1.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var19)) {
               Object var9 = var18.value();
               Object var10 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var19);
               if (var9 == null && var10 != null || var9 != null && !var9.equals(var10)) {
                  String var11 = var0.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var18.type());
                  var2.append("  - ").append(var11).append(" (").append(var18.type()).append("): \n");
                  var2.append("    First: ").append(var9).append("\n");
                  var2.append("    Second: ").append(var10).append("\n");
                  var14 = true;
               }
            }
         }

         if (!var14) {
            var2.append("  None\n");
         }

         return var2.toString();
      } else {
         return "One or both containers are null";
      }
   }
}
