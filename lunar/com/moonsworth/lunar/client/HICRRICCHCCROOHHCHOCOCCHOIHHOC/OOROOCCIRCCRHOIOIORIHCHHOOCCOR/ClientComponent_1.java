package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.ICOHIIIRCIORCORHRRROOOOCOOROIC;
import com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final String IHHRCHCRCHCCIHOICHRICIHRRORICO = "%release_version%";
   private static final String IIHCCCICRRHOICRIHRORHCHHORHHII = "./apollo/api/src/main/java/com/lunarclient/apollo/mods/impl/";
   private static final List<String> ORHIHRCRCIOOOIRCHIHIIRRHROOHOI = new ArrayList<>(
      Arrays.asList(
         "/*",
         " * This file is part of Apollo, licensed under the MIT License.",
         " *",
         " * Copyright (c) 2026 Moonsworth",
         " *",
         " * Permission is hereby granted, free of charge, to any person obtaining a copy",
         " * of this software and associated documentation files (the \"Software\"), to deal",
         " * in the Software without restriction, including without limitation the rights",
         " * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell",
         " * copies of the Software, and to permit persons to whom the Software is",
         " * furnished to do so, subject to the following conditions:",
         " *",
         " * The above copyright notice and this permission notice shall be included in all",
         " * copies or substantial portions of the Software.",
         " *",
         " * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR",
         " * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,",
         " * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE",
         " * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER",
         " * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,",
         " * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE",
         " * SOFTWARE.",
         " */"
      )
   );
   private final Map<String, HHCCIRHCCCIIRHCROHIORHIRHHIORH> optionMap = new LinkedHashMap<>();
   private final Set<String> IIHCOOCOIOHOHHRIROIIIIROIIOCHH = new LinkedHashSet<>();
   private static final Pattern CRIOCORHCRCOCOIOCICHCROOOHHCRH = Pattern.compile("public static final\\s\\w+<?\\w+>\\s(\\w+)\\s");
   private static final Function<String, Pattern> IRCORCIRHCOCHIHHHIOOOHHOOORCCR = var0 -> Pattern.compile(
      "(/\\*\\*(?:(?!\\*\\*).)*?)(?=" + var0 + ")(.*?;)", 32
   );

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
      this.optionMap.put(var1, var2);
   }

   public void RICRIRRCOHRCOCRRHHCRHRROOIOHHR(Path var1) {
      com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = new com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1
      );
      IRRCCOICORICIHCHRHIHIHROIRHOCR var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR();

      for (Entry var5 : this.optionMap.entrySet()) {
         String var6 = ((HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5.getValue()).IRCORRROCIORRRCRRCOHCICHRIRCRH();
         List var7 = ((HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5.getValue()).options();
         boolean var8 = false;
         boolean var9 = false;
         boolean var10 = false;

         for (HCHRIROHHHCORIOCROOCHRCIOROOCI var12 : var7) {
            if (OHHRIOHROOIHOROCIRHCHORIHRRRRI.class.isAssignableFrom(var12.HRIOIIOORCRIRCROHOHRIRIIRRCCOR())) {
               var8 = true;
               var10 = true;
            } else if (var12.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH)) {
               var9 = true;
            } else {
               var10 = true;
            }
         }

         if (!var7.isEmpty()) {
            String var21 = var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, "description");
            if ("description".equals(var21)) {
               var21 = "A mod class";
            }

            String var22 = (String)var5.getKey();
            String var13 = "Mod" + RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIIRICIHIHCOCHIHHICIIOOOCICOO(var22);
            String var14 = this.CIORICCOOCHHRRRCCHOIRIOOHCORHR(var13);
            String var15 = this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var14, var13);
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var16 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLASS
            );

            for (String var20 : var21.split("\n")) {
               if (!var20.isEmpty()) {
                  var16.RHCHCCIOOCORHOHICHOIOHRIOCCIHC(var20);
               }
            }

            var16.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var15);
            com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var23 = com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCOCOHHCOOICCICCRCCORORROHRCCC(
                  var13, "com.lunarclient.apollo.mods.impl"
               )
               .RORRCRCHIRCHHOOIHCCHRCHORHCICI(ORHIHRCRCIOOOIRCHIHIIRRHROOHOI)
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PUBLIC)
               .HOCIHCOOCROCHOCIROHCRHRIHIHHOC()
               .CRRCOIIORIRHIOOOIORIIHRRCIRIOC()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16);

            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var26 : var7) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, var22, var26, var14);
            }

            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var25 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var23, var14, var7
            );
            if (var9 || var25.IHCRCCCORIIIRCIOOCIRRCCHOHHROC()) {
               var23.RCRRCCORORHORHOOIOIRCROCIROOCR("com.lunarclient.apollo.option.NumberOption");
            }

            if (var10 || var25.HRCORRRHROCROOIHCHOCCRHOOIIICH()) {
               var23.RCRRCCORORHORHOOIOIRCROCIROOCR("com.lunarclient.apollo.option.SimpleOption");
            }

            var23.RCRRCCORORHORHOOIOIRCROCIROOCR("io.leangen.geantyref.TypeToken");
            if (var8 || var25.IRRIHCIHOHHCCHICHCIIRHRHHOHROR()) {
               var23.RCRRCCORORHORHOOIOIRCROCIROOCR("java.awt.Color");
            }

            var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23);
         }
      }

      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      var2.OHCOCICIRIHRCOORIOIHRCRHRIRRHI();
   }

   protected List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> getOptions(String var1) {
      return this.optionMap.get(var1).options();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      String var2,
      HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var3,
      @Nullable String var4
   ) {
      Object var5 = var3.get();
      String var6 = OHHRIOHROOIHOROCIRHCHORIHRRRRI.class.isAssignableFrom(var3.HRIOIIOORCRIRCROHOHRIRIIRRCCOR()) ? "Color" : var5.getClass().getSimpleName();
      String var7 = var3.getId();
      String var8 = ICOHIIIRCIORCORHRRROOOOCOOROIC.RHIIORHOIHHICHORHRIRHIIROCHOHO(var7);
      String var9 = var3.CHIIRICICCCIIRRRICIICCCIIHHRRO();
      String var10 = var9 + "Description";
      String var11 = var3.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var10);
      String var12 = ".node(\""
         + CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, var2)
         + "\", \""
         + CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, var7)
         + "\").type(TypeToken.get("
         + var6
         + ".class))";
      com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13;
      if (OHHRIOHROOIHOROCIRHCHORIHRRRRI.class.isAssignableFrom(var3.HRIOIIOORCRIRCROHOHRIRIIRRCCOR())) {
         var13 = com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IORRORCRRHRRORHIRHRROHCRRIHRII(
               var8, "SimpleOption<Color>"
            )
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PUBLIC)
            .HOCRHCHCOOHCRIIHOHROHRIIOOOOCO()
            .OOOHIHORIRCHHIROHCCRROHHCICIOR()
            .HOIOHRCOCOOHHCHHHHROHHCOCOOOHI("SimpleOption.<Color>builder()");
         String var14 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4, "SimpleOption", "builder", var8);
         if (!var11.equals(var10)) {
            var11 = var11.replaceAll("§[0-9a-fk-orA-FK-OR]|\\n", "");
            var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(".comment(\"" + var11.replace("\"", "\\\"") + "\")")
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIELD)
                     .RHCHCCIOOCORHOHICHOIOHRIOCCIHC(var11)
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var14)
               );
         } else {
            var13.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIELD)
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var14)
            );
         }

         var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(var12);
      } else if (var3.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH)) {
         var1.RCRRCCORORHORHOOIOIRCROCIROOCR("com.lunarclient.apollo.option.NumberOption");
         var13 = com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IORRORCRRHRRORHIRHRROHCRRIHRII(
               var8, "NumberOption<" + var6 + ">"
            )
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PUBLIC)
            .HOCRHCHCOOHCRIIHOHROHRIIOOOOCO()
            .OOOHIHORIRCHHIROHCCRROHHCICIOR()
            .HOIOHRCOCOOHHCHHHHROHHCOCOOOHI("NumberOption.<" + var6 + ">number()");
         String var19 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4, "NumberOption", "number", var8);
         if (!var11.equals(var10)) {
            var11 = var11.replaceAll("§[0-9a-fk-orA-FK-OR]|\\n", "");
            var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(".comment(\"" + var11.replace("\"", "\\\"") + "\")")
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIELD)
                     .RHCHCCIOOCORHOHICHOIOHRIOCCIHC(var11)
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var19)
               );
         } else {
            var13.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIELD)
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var19)
            );
         }

         var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(var12);
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var15 = var3.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH
         );
         var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(
            ".min("
               + RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var15.getMin())
               + ").max("
               + RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var15.getMax())
               + ")"
         );
      } else {
         var13 = com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IORRORCRRHRRORHIRHRROHCRRIHRII(
               var8, "SimpleOption<" + var6 + ">"
            )
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PUBLIC)
            .HOCRHCHCOOHCRIIHOHROHRIIOOOOCO()
            .OOOHIHORIRCHHIROHCCRROHHCICIOR()
            .HOIOHRCOCOOHHCHHHHROHHCOCOOOHI("SimpleOption.<" + var6 + ">builder()");
         String var20 = this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4, "SimpleOption", "builder", var8);
         if (!var11.equals(var10)) {
            var11 = var11.replaceAll("§[0-9a-fk-orA-FK-OR]|\\n", "");
            var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(".comment(\"" + var11.replace("\"", "\\\"") + "\")")
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIELD)
                     .RHCHCCIOOCORHOHICHOIOHRIOCCIHC(var11)
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var20)
               );
         } else {
            var13.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIELD)
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var20)
            );
         }

         var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(var12);
      }

      var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(".defaultValue(" + RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH(var3, var3.getDefaultValue()) + ")");
      var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(".notifyClient()");
      var13.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(".build()");
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, Objects.equals(var7, "enabled"));
   }

   private String RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(String var1, String var2) {
      if (var1 != null) {
         Pattern var3 = Pattern.compile("@since (\\d\\.\\d\\.\\d)\\n\\s*\\*/\\n(?:@Deprecated\\n)?public final class " + var2 + " \\{");
         Matcher var4 = var3.matcher(var1);
         if (var4.find()) {
            return var4.group(1);
         }
      }

      return "%release_version%";
   }

   private String RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, String var2, String var3, String var4) {
      if (var1 != null) {
         Pattern var5 = Pattern.compile("@since (\\d\\.\\d\\.\\d)\\n\\s*\\*/\\n\\s.*" + var2 + "<.*> " + var4 + " = " + var2 + "\\.<.*>" + var3 + "\\(\\)");
         Matcher var6 = var5.matcher(var1);
         if (var6.find()) {
            return var6.group(1);
         }
      }

      return "%release_version%";
   }

   @Nullable
   private String CIORICCOOCHHRRRCCHOIRIOOHCORHR(String var1) {
      File var2 = new File("./apollo/api/src/main/java/com/lunarclient/apollo/mods/impl/" + var1 + ".java");
      if (var2.exists()) {
         try {
            return Files.readString(var2.toPath());
         } catch (IOException var4) {
         }
      }

      return null;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      ArrayList var2 = Lists.newArrayList();

      for (String var4 : this.optionMap.keySet()) {
         var2.add("com.lunarclient.apollo.mods.impl.Mod" + RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIIRICIHIHCOCHIHHICIIOOOCICOO(var4));
      }

      for (String var7 : this.IIHCOOCOIOHOHHRIROIIIIROIIOCHH) {
         var2.add("com.lunarclient.apollo.mods.impl." + var7);
      }

      Collections.sort(var2);
      com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCOCOHHCOOICCICCRCCORORROHRCCC(
            "Mods", "com.lunarclient.apollo.mods"
         )
         .RORRCRCHIRCHHOOIHCCHRCHORHCICI(ORHIHRCRCIOOOIRCHIHIIRRHROOHOI)
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PUBLIC)
         .HOCIHCOOCROCHOCIROHCRHRIHIHHOC()
         .CRRCOIIORIRHIOOOIORIIHRRCIRIOC()
         .ROCHRRCORRCOOOOOCOICOCROIIHIHH(var2)
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLASS)
               .RHCHCCIOOCORHOHICHOIOHRIOCCIHC("Mod container")
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, "1.0.0")
         );
      var6.RCRRCCORORHORHOOIOIRCROCIROOCR("java.util.Arrays");
      var6.RCRRCCORORHORHOOIOIRCROCIROOCR("java.util.List");
      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIOOIIIHHHRRRHCRIRHRORCOIICHHH());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
   }

   private com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIOOIIIHHHRRRHCRIRHRORCOIICHHH() {
      com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IORRORCRRHRRORHIRHRROHCRRIHRII(
            "ALL_MODS", "List<Class<?>>"
         )
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PUBLIC)
         .HOCRHCHCOOHCRIIHOHROHRIIOOOOCO()
         .OOOHIHORIRCHHIROHCCRROHHCICIOR()
         .HOIOHRCOCOOHHCHHHHROHHCOCOOOHI("Arrays.asList(")
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.FIELD)
               .RHCHCCIOOCORHOHICHOIOHRIOCCIHC("List of all current mod classes")
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, "1.0.0")
         );
      ArrayList var2 = new ArrayList();

      for (String var4 : this.optionMap.keySet()) {
         var2.add("Mod" + RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIIRICIHIHCOCHIHHICIIOOOCICOO(var4));
      }

      var2.addAll(this.IIHCOOCOIOHOHHRIROIIIIROIIOCHH);
      int var7 = 0;

      for (String var5 : var2) {
         var7++;
         String var6 = var7 != var2.size() ? "," : "";
         var1.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(
            com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(1)
               + var5
               + ".class"
               + var6
         );
      }

      var1.HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(")");
      return var1;
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      File var2 = new File("./apollo/api/src/main/java/com/lunarclient/apollo/mods/impl/");
      if (var2.exists()) {
         HashSet var3 = new HashSet();

         for (String var5 : this.optionMap.keySet()) {
            var3.add("Mod" + RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOIIRICIHIHCOCHIHHICIIOOOCICOO(var5));
         }

         File[] var14 = var2.listFiles((var0, var1x) -> var1x.startsWith("Mod") && var1x.endsWith(".java"));
         if (var14 != null) {
            for (File var8 : var14) {
               String var9 = var8.getName().replace(".java", "");
               if (!var3.contains(var9)) {
                  String var10 = this.CIORICCOOCHHRRRCCHOIRIOOHCORHR(var9);
                  if (var10 != null) {
                     String var11 = this.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var10, var9);
                     com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCOCOHHCOOICCICCRCCORORROHRCCC(
                           var9, "com.lunarclient.apollo.mods.impl"
                        )
                        .RORRCRCHIRCHHOOIHCCHRCHORHCICI(ORHIHRCRCIOOOIRCHIHIIRRHROOHOI)
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PUBLIC)
                        .HOCIHCOOCROCHOCIROHCRHRIHIHHOC()
                        .CRRCOIIORIRHIOOOIORIIHRRCIRIOC()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCHHRRIIIORORCHIICIIOORCOIOIO(
                              "Deprecated"
                           )
                        )
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLASS)
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SINCE, var11)
                        );
                     com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var12, var10, Collections.emptyList()
                     );
                     if (var13.IHCRCCCORIIIRCIOOCIRRCCHOHHROC()) {
                        var12.RCRRCCORORHORHOOIOIRCROCIROOCR("com.lunarclient.apollo.option.NumberOption");
                     }

                     if (var13.HRCORRRHROCROOIHCHOCCRHOOIIICH()) {
                        var12.RCRRCCORORHORHOOIOIRCROCIROOCR("com.lunarclient.apollo.option.SimpleOption");
                     }

                     var12.RCRRCCORORHORHOOIOIRCROCIROOCR("io.leangen.geantyref.TypeToken");
                     if (var13.IRRIHCIHOHHCCHICHCIIRHRHHOHROR()) {
                        var12.RCRRCCORORHORHOOIOIRCROCIROOCR("java.awt.Color");
                     }

                     var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12);
                     this.IIHCOOCOIOHOHHRIROIIIIROIIOCHH.add(var9);
                  }
               }
            }
         }
      }
   }

   private com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      @Nullable String var2,
      List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var3
   ) {
      if (var2 == null) {
         return new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            false, false, false
         );
      }

      Matcher var4 = CRIOCORHCRCOCOIOCICHCROOOHHCRH.matcher(var2);
      ArrayList var5 = new ArrayList();

      while (var4.find()) {
         var5.add(var4.group(1));
      }

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var7 : var3) {
         String var8 = ICOHIIIRCIORCORHRRROOOOCOOROIC.RHIIORHOIHHICHORHRIRHIIROCHOHO(var7.getId());
         var5.remove(var8);
      }

      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;

      for (String var10 : var5) {
         Pattern var11 = IRCORCIRHCOCHIHHHIOOOHHOOORCCR.apply(" " + var10 + " ");
         Matcher var12 = var11.matcher(var2);
         if (var12.find()) {
            String var13 = var12.group(1);
            String var14 = var12.group(2);
            String var15;
            if (var13.contains("@Deprecated")) {
               var15 = var13 + var14;
            } else {
               int var16 = var13.indexOf("*/") + 2;
               var15 = var13.substring(0, var16)
                  + "\n"
                  + com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(1)
                  + "@Deprecated"
                  + var13.substring(var16)
                  + var14;
            }

            if (var15.contains("SimpleOption<Color>")) {
               var19 = true;
            } else if (var15.contains("NumberOption")) {
               var18 = true;
            } else {
               var17 = true;
            }

            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var15)
            );
         }
      }

      return new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var17, var19, var18
      );
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final boolean HHHOCORHROCORIHORHOOCRHIRIICOI;
      private final boolean OOIIIRIOOHIHROIRIHOHCOOCRRCIIO;
      private final boolean HIOHOOOIRICHIHHCRRRHHRHRRHORRH;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, boolean var2, boolean var3) {
         this.HHHOCORHROCORIHORHOOCRHIRIICOI = var1;
         this.OOIIIRIOOHIHROIRIHOHCOOCRRCIIO = var2;
         this.HIOHOOOIRICHIHHCRRRHHRHRRHORRH = var3;
      }

      public boolean HRCORRRHROCROOIHCHOCCRHOOIIICH() {
         return this.HHHOCORHROCORIHORHOOCRHIRIICOI;
      }

      public boolean IRRIHCIHOHHCCHICHCIIRHRHHOHROR() {
         return this.OOIIIRIOOHIHROIRIHOHCOOCRRCIIO;
      }

      public boolean IHCRCCCORIIIRCIOOCIRRCCHOHHROC() {
         return this.HIOHOOOIRICHIHHCRRRHHRHRRHORRH;
      }
   }
}
