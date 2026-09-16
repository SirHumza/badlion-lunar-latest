package com.moonsworth.lunar.client.util;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;

public final class IORRORCRRHRRORHIRHRROHCRRIHRII {
   private static final Pattern HICHHIROHOIIOHRHIIHIIIICCOOICO = Pattern.compile("(?<raw>[$%](?<id>\\d+)?(?<i18n>\\$[sdf])?(\\{(?<name>[a-zA-Z0-9]+)})?)");

   public static String CRICCOOHHHCHOORCICOCOHIHOIRHOO(String var0, Object... var1) {
      String var2 = var0;
      if (var2.contains("$")) {
         Matcher var3 = HICHHIROHOIIOHRHIIHIIIICCOOICO.matcher(var2);

         while (var3.find()) {
            String var4 = var3.group("raw");
            String var5 = var3.group("id");
            String var6 = var3.group("name");
            String var7 = var3.group("i18n");
            boolean var8 = var7 != null;
            boolean var9 = var6 != null;
            if (var9) {
               var2 = var2.replace(
                  var4, Objects.requireNonNull(com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.getReplacement(var6))
               );
            } else if (var5 != null) {
               try {
                  int var10 = Integer.parseInt(var5) - (var8 ? 1 : 0);
                  var2 = var2.replace(var4, var1[var10].toString());
               } catch (Exception var11) {
               }
            }
         }
      }

      return var2;
   }

   public static com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      String var0, Object... var1
   ) {
      com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHCIOHOCROCRRCHRROCCHCIRRORHIC();
      Matcher var3 = HICHHIROHOIIOHRHIIHIIIICCOOICO.matcher(var0);

      int var4;
      for (var4 = 0; var3.find(); var4 = var3.end()) {
         String var5 = var3.group("id");
         String var6 = var3.group("name");
         String var7 = var3.group("i18n");
         var2.HHIIIIIRHIOORRRIIORICIRCOHIIHI(var0.substring(var4, var3.start()));
         if (var6 != null) {
            com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var13 = com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.getVariable(
               var6
            );
            if (var13 != null) {
               if (var13.isDynamic()) {
                  var2.RICRIHOOHROHICCHHIIHRHCORHIOHR(var13.getReplacement());
               } else {
                  var2.HHIIIIIRHIOORRRIIORICIRCOHIIHI(var13.getReplacement().get().toString());
               }
            } else {
               var2.HHIIIIIRHIOORRRIIORICIRCOHIIHI("null");
            }
         } else if (var5 != null) {
            try {
               int var8 = Integer.parseInt(var5);
               int var9 = var8 - (var7 != null ? 1 : 0);
               if (var9 >= 0 && var9 < var1.length) {
                  Object var10 = var1[var9];
                  if (var10 instanceof Supplier var11) {
                     var2.RICRIHOOHROHICCHHIIHRHCORHIOHR(var11);
                  } else {
                     var2.HHIIIIIRHIOORRRIIORICIRCOHIIHI(var10.toString());
                  }
               } else {
                  var2.HHIIIIIRHIOORRRIIORICIRCOHIIHI("null");
               }
            } catch (NumberFormatException var12) {
            }
         }
      }

      var2.HHIIIIIRHIOORRRIIORICIRCOHIIHI(var0.substring(var4));
      return var2.OCOORCOIIORORRHHOIIOHIRROHRHOR();
   }

   public static com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RICRRCRROIHCOOOCHCRROCHIOCOORI(
      String var0
   ) {
      com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHCIOHOCROCRRCHRROCCHCIRRORHIC();
      Matcher var2 = HICHHIROHOIIOHRHIIHIIIICCOOICO.matcher(var0);

      int var3;
      for (var3 = 0; var2.find(); var3 = var2.end()) {
         String var4 = var2.group("id");
         String var5 = var2.group("name");
         var1.HHIIIIIRHIOORRRIIORICIRCOHIIHI(var0.substring(var3, var2.start()));
         if (var5 != null) {
            com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.getVariable(
               var5
            );
            if (var6 != null) {
               if (var6.isDynamic()) {
                  var1.RICRIHOOHROHICCHHIIHRHCORHIOHR(var6.getReplacement());
               } else {
                  var1.HHIIIIIRHIOORRRIIORICIRCOHIIHI(var6.getReplacement().get().toString());
               }
            } else {
               var1.HHIIIIIRHIOORRRIIORICIRCOHIIHI("null");
            }
         } else if (var4 != null) {
            var1.HCCRRHCRRCIHCCORCHIHHHHCCHRIHO();
         }
      }

      var1.HHIIIIIRHIOORRRIIORICIRCOHIIHI(var0.substring(var3));
      return var1.OCOORCOIIORORRHHOIIOHIRROHRHOR();
   }

   public static String RCROOHHCROORIIICHORIHRROIOOHHC(String var0) {
      return Normalizer.normalize(var0, Form.NFD).replaceAll("[^A-Za-z0-9.]", "").toLowerCase();
   }

   @Generated
   private IORRORCRRHRRORHIRHRROHCRRIHRII() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
