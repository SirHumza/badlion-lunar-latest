package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static Pattern IIIRCIHRHHIHIICHHIIORHHCORROIR = Pattern.compile(
      "^\\[(?<sbLvl>\\d{1,3})\\] (?:\\[(?<rank>YOUTUBE|ADMIN)\\] )?(?<name>\\w{1,16})(?: (?<emblem>[^♲Ⓑቾ⚒])?(?<gamemode>[☀♲Ⓑ])?(?<faction>[ቾ⚒])?)?(?: \\((?<dungeonClass>\\w+)(?: (?<classLevelRoman>[IVXLC]+|\\d+))?\\))?(?: (?<guest>\\[✌\\]))?$"
   );

   public static com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCOCICIIHIOIRCROIROROORHIIIIHI(
      String var0
   ) {
      Matcher var1 = IIIRCIHRHHIHIICHHIIORHHCORROIR.matcher(var0);
      if (!var1.matches()) {
         return null;
      }

      int var2;
      try {
         var2 = Integer.parseInt(var1.group("sbLvl"));
      } catch (Exception var10) {
         return null;
      }

      String var3 = var1.group("rank");
      String var4 = var1.group("name");
      String var5 = var1.group("emblem");
      String var6 = var1.group("gamemode");
      String var7 = var1.group("faction");
      String var8 = var1.group("dungeonClass");
      String var9 = var1.group("classLevelRoman");
      return new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2, var3, var4, var5, var6, var7, var8, var9
      );
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final int IOOCIIOORIIIIHCCOICHRHOHHIIHCC;
      @Nullable
      private final String ICCHICIOOCHOCHCCHCIROCOIOIROII;
      private final String HHIHOIRIOCOCIOROHCCCRRIOOOIRIC;
      @Nullable
      private final String IOCCIOOCIICHIHIIOIIHIRIROICHRC;
      @Nullable
      private final String CRRRRRCOOOCIRIRRIOOIIOHRIIHIII;
      @Nullable
      private final String IOCORRCHHCIOCCIIHRIHOIHICHHIHC;
      @Nullable
      private final String IOHIROCRHHCCOIIHHIOROCHCHHHROI;
      @Nullable
      private final String CHRHRIOIRROHIIIRHIROHICCOICCIR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         int var1,
         @Nullable String var2,
         String var3,
         @Nullable String var4,
         @Nullable String var5,
         @Nullable String var6,
         @Nullable String var7,
         @Nullable String var8
      ) {
         this.IOOCIIOORIIIIHCCOICHRHOHHIIHCC = var1;
         this.ICCHICIOOCHOCHCCHCIROCOIOIROII = var2;
         this.HHIHOIRIOCOCIOROHCCCRRIOOOIRIC = var3;
         this.IOCCIOOCIICHIHIIOIIHIRIROICHRC = var4;
         this.CRRRRRCOOOCIRIRRIOOIIOHRIIHIII = var5;
         this.IOCORRCHHCIOCCIIHRIHOIHICHHIHC = var6;
         this.IOHIROCRHHCCOIIHHIOROCHCHHHROI = var7;
         this.CHRHRIOIRROHIIIRHIROHICCOICCIR = var8;
      }

      public int level() {
         return this.IOOCIIOORIIIIHCCOICHRHOHHIIHCC;
      }

      @Nullable
      public String rank() {
         return this.ICCHICIOOCHOCHCCHCIROCOIOIROII;
      }

      public String playerName() {
         return this.HHIHOIRIOCOCIOROHCCCRRIOOOIRIC;
      }

      @Nullable
      public String RIRCIORCIOHOOOIICOCHRCOOHOIHRO() {
         return this.IOCCIOOCIICHIHIIOIIHIRIROICHRC;
      }

      @Nullable
      public String HRIRCIROHCROOCCHHRHIIHIICOOIHH() {
         return this.CRRRRRCOOOCIRIRRIOOIIOHRIIHIII;
      }

      @Nullable
      public String faction() {
         return this.IOCORRCHHCIOCCIIHRIHOIHICHHIHC;
      }

      @Nullable
      public String OOROCIRRICHIHRIOCRIORHROOHHIHC() {
         return this.IOHIROCRHHCCOIIHHIOROCHCHHHROI;
      }

      @Nullable
      public String CCIRRIRCIORCRROCIORCOOOOCOROHO() {
         return this.CHRHRIOIRROHIIIRHIROHICCOICCIR;
      }
   }
}
