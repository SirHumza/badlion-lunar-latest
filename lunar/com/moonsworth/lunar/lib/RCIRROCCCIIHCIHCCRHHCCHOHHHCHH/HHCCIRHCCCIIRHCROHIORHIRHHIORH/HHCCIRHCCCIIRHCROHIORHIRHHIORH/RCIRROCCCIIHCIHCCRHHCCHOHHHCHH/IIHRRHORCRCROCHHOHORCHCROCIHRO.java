package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   private static final int CCHIOHHOHIHRRCCIHOICCHCHOOCICH = 1;
   private static final int OIRORRHRCIICHOHRIRHHOHHROCCCIH = 2;
   private static final int RROORHHORIHIHOHCOCRHOIRCHRHIHC = 3;
   private static final int COHHRIIHIOCCHIIRHCRRRIHHCOCOCR = 4;
   private static final int HICOOICCIRCRIICRCIHCIHHCORHIIH = 5;
   private static final int OIRIHIIIHOIRCICIRIRRCHOCRROHHI = 6;
   private static final int CIRRIIHCOOHIRHHHRIHCORROORCIHC = 7;
   private static final int CIRRCCRCOHCORIHCIHORCHOCIOOHRH = 8;
   private static final int HCHHHRHHIRCCHHHIHIHOHCCHCCHORR = 9;
   private static final int IOOOOIICCCOORORIOCOROHIHROOCHO = 10;
   public static final int CHICHRHHOIIRIIRIIIRHIHOHOOIIIC = 11;
   private static final String HIROCCIIRHROIICIHCORRORRHRCCHI = "java.util.Collections$";
   private static final String ORIICCCRCCCIHRHRRRRCCRRCHRHOHC = "java.util.Arrays$";
   private static final String HORIIHRIICOIOOCCOORIOOOIOHHHOH = "java.util.ImmutableCollections$";

   public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1
   ) {
      String var2 = var1.RRICIOOORRIORHHICIRCIOCHRHRCHH().getName();
      if (!var2.startsWith("java.util.")) {
         return null;
      }

      String var3 = OICICCOOCCCHROORIHCCHHRCIOICHC(var2);
      if (var3 != null) {
         IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = null;
         String var5;
         if ((var5 = HHHHCIICCHHICIOIHCHOROHOCIHIRI(var3)) != null) {
            if (var5.endsWith("Set")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(4, var1, Set.class);
            } else if (var5.endsWith("List")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(5, var1, List.class);
            }
         } else if ((var5 = COHIIORCIRRIHIRROCIIHHCIRICORC(var3)) != null) {
            if (var5.endsWith("Set")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(1, var1, Set.class);
            } else if (var5.endsWith("List")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(2, var1, List.class);
            }
         } else if ((var5 = OIOOIOOHRORRCCOOHIROHRHOICCIOI(var3)) != null) {
            if (var5.endsWith("Set")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(7, var1, Set.class);
            } else if (var5.endsWith("List")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(9, var1, List.class);
            } else if (var5.endsWith("Collection")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(8, var1, Collection.class);
            }
         }

         return var4 == null
            ? null
            : new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO<>(
               var4
            );
      } else {
         if ((var3 = RRROCHOCCHHOICRCHIHHHHOOHOCHHR(var2)) != null) {
            return var3.contains("List")
               ? new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO<>(
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(11, var1, List.class)
               )
               : null;
         }

         if ((var3 = HHRHIIOIIRHIOHCIRHHIOIHHOROHRO(var2)) != null) {
            if (var3.contains("List")) {
               return new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO<>(
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(11, var1, List.class)
               );
            } else {
               return var3.contains("Set")
                  ? new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO<>(
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(4, var1, Set.class)
                  )
                  : null;
            }
         } else {
            return null;
         }
      }
   }

   public static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1
   ) {
      String var2 = var1.RRICIOOORRIORHHICIRCIOCHRHRCHH().getName();
      IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = null;
      String var3;
      if ((var3 = OICICCOOCCCHROORIHCCHHRCIOICHC(var2)) != null) {
         String var5;
         if ((var5 = HHHHCIICCHHICIOIHCHOROHOCIHIRI(var3)) != null) {
            if (var5.contains("Map")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(6, var1, Map.class);
            }
         } else if ((var5 = COHIIORCIRRIHIRROCIIHHCIRICORC(var3)) != null) {
            if (var5.contains("Map")) {
               var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(3, var1, Map.class);
            }
         } else if ((var5 = OIOOIOOHRORRCCOOHIROHRHOICCIOI(var3)) != null && var5.contains("Map")) {
            var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(10, var1, Map.class);
         }
      } else if ((var3 = HHRHIIOIIRHIOHCIRHHIOIHHOROHRO(var2)) != null && var3.contains("Map")) {
         var4 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(6, var1, Map.class);
      }

      return var4 == null
         ? null
         : new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO<>(
            var4
         );
   }

   static IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var0, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1, Class<?> var2
   ) {
      return new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1.IHROCRRIRIROCCCRCRRROCRRCRIIHH(var2));
   }

   private static String RRROCHOCCHHOICRCHIHHHHOOHOCHHR(String var0) {
      return var0.startsWith("java.util.Arrays$") ? var0.substring("java.util.Arrays$".length()) : null;
   }

   private static String OICICCOOCCCHROORIHCCHHRCIOICHC(String var0) {
      return var0.startsWith("java.util.Collections$") ? var0.substring("java.util.Collections$".length()) : null;
   }

   private static String HHRHIIOIIRHIOHCIRHHIOIHHOROHRO(String var0) {
      return var0.startsWith("java.util.ImmutableCollections$") ? var0.substring("java.util.ImmutableCollections$".length()) : null;
   }

   private static String COHIIORCIRRIHIRROCIIHHCIRICORC(String var0) {
      return var0.startsWith("Singleton") ? var0.substring(9) : null;
   }

   private static String OIOOIOOHRORRCCOOHIROHRHOICCIOI(String var0) {
      return var0.startsWith("Synchronized") ? var0.substring(12) : null;
   }

   private static String HHHHCIICCHHICIOIHCHOROHOCIHIRI(String var0) {
      return var0.startsWith("Unmodifiable") ? var0.substring(12) : null;
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRICCOOHHHCHOORCICOCOHIHOIRHOO<Object, Object> {
      private final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI IHICIOIICOCROOHHROCRHIHOOIRROC;
      private final int HIRRHHHHHCRRCICRIOICOOORIOOCCO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         int var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
      ) {
         this.IHICIOIICOCROOHHROCRHIHOOIRROC = var2;
         this.HIRRHHHHHCRRCICRIOICOOORIOOCCO = var1;
      }

      @Override
      public Object convert(Object var1) {
         if (var1 == null) {
            return null;
         }

         switch (this.HIRRHHHHHCRRCICRIOICOOORIOOCCO) {
            case 1:
               Set var5 = (Set)var1;
               this.RIRIOIIHRIRRHRROHRORICOHOIOHHH(var5.size());
               return Collections.singleton(var5.iterator().next());
            case 2:
               List var4 = (List)var1;
               this.RIRIOIIHRIRRHRROHRORICOHOIOHHH(var4.size());
               return Collections.singletonList(var4.get(0));
            case 3:
               Map var2 = (Map)var1;
               this.RIRIOIIHRIRRHRROHRORICOHOIOHHH(var2.size());
               Entry var3 = (Entry)var2.entrySet().iterator().next();
               return Collections.singletonMap(var3.getKey(), var3.getValue());
            case 4:
               return Collections.unmodifiableSet((Set)var1);
            case 5:
               return Collections.unmodifiableList((List)var1);
            case 6:
               return Collections.unmodifiableMap((Map)var1);
            case 7:
               return Collections.synchronizedSet((Set)var1);
            case 8:
               return Collections.synchronizedCollection((Collection)var1);
            case 9:
               return Collections.synchronizedList((List)var1);
            case 10:
               return Collections.synchronizedMap((Map)var1);
            case 11:
            default:
               return var1;
         }
      }

      @Override
      public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1
      ) {
         return this.IHICIOIICOCROOHHROCRHIHOOIRROC;
      }

      @Override
      public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1
      ) {
         return this.IHICIOIICOCROOHHROCRHIHOOIRROC;
      }

      private void RIRIOIIHRIRRHRROHRORICOHOIOHHH(int var1) {
         if (var1 != 1) {
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + var1 + " entries");
         }
      }
   }
}
