package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static List<String> RICCICOHIICIIORHCHCRCRHOOOCHIC(String var0) {
      return var0 != null && var0.startsWith("/") && var0.indexOf(32) >= 0 ? RCOROOHHCORIRCRHOHRCCIHRCORCHH(var0) : Collections.emptyList();
   }

   public static String[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(String[] var0, String var1) {
      if (var1 != null && var1.startsWith("/")) {
         LinkedHashSet var2 = new LinkedHashSet(var0.length);
         var2.addAll(Arrays.asList(var0));
         return var2.addAll(RCOROOHHCORIRCRHOHRCCIHRCORCHH(var1)) ? var2.toArray(new String[0]) : var0;
      } else {
         return var0;
      }
   }

   private static List<String> RCOROOHHCORIRCRHOHRCCIHRCORCHH(String var0) {
      ArrayList var1 = new ArrayList();
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               var1
            )
         );
      ArrayList var2 = new ArrayList();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var1) {
         if (var4.isEnabled()) {
            var2.addAll(var4.OOHCHIOCOOORHOHOCRCOOIICCICIHI(var0));
         }
      }

      return var2;
   }

   public static List<String> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      String var1
   ) {
      boolean var2 = var1.startsWith("/");
      String var3 = var2 ? var1.substring(1) : var1;
      String var4 = var0.RHOCOOCCHCOCCRRHIOHIOROHOORRRO();
      int var5 = var3.indexOf(32);
      if (var5 < 0) {
         return var4.startsWith(var3) && !var4.equals(var3) ? List.of(var2 ? "/" + var4 : var4) : Collections.emptyList();
      }

      if (!var3.substring(0, var5).equals(var4)) {
         return Collections.emptyList();
      }

      String var6 = var3.substring(var5 + 1);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var6);
   }

   private static List<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, String var1
   ) {
      int var2 = var1.indexOf(32);
      if (var2 < 0) {
         ArrayList var10 = new ArrayList();

         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var12 : var0.getChildren()) {
            if (var12 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var13
               )
             {
               if (var13.RHOCOOCCHCOCCRRHIOHIOROHOORRRO().startsWith(var1)) {
                  var10.add(var13.RHOCOOCCHCOCCRRHIOHIOROHOORRRO());
               }
            } else if (var12 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var15
               )
             {
               CRRRICCRROCOHHOHIICIHORCOORRRH var16 = var15.OICCIHIHRCORIIROHICHOOOCOOIRIR();
               if (var16 != null) {
                  HHCCIRHCCCIIRHCROHIORHIRHHIORH var17 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
                  var16.provide(IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCCIIHCCICCCICIHOHCIHIIOOHRHRC, var17);
                  var10.addAll(var17.CIICICORRHHRHOIHOHHHHRCHHICOCO());
               }
            }
         }

         return var10;
      } else {
         String var3 = var1.substring(0, var2);
         String var4 = var1.substring(var2 + 1);

         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 : var0.getChildren()) {
            if (var6 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7
               )
             {
               if (var7.RHOCOOCCHCOCCRRHIOHIOROHOORRRO().equals(var3)) {
                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var4);
               }
            } else if (var6 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var14
               )
             {
               if (var14.CCORCICRCCHHOHICORHIORICHIICRC().HOIROHHIROCIRRIOORRIOHCIHOCHCC()) {
                  CRRRICCRROCOHHOHIICIHORCOORRRH var8 = var14.OICCIHIHRCORIIROHICHOOOCOOIRIR();
                  if (var8 == null) {
                     return Collections.emptyList();
                  }

                  HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
                  var8.provide(IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCCIIHCCICCCICIHOHCIHIIOOHRHRC, var9);
                  return new ArrayList<>(var9.CIICICORRHHRHOIHOHHHHRCHHICOCO());
               }

               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var4);
            }
         }

         return Collections.emptyList();
      }
   }
}
