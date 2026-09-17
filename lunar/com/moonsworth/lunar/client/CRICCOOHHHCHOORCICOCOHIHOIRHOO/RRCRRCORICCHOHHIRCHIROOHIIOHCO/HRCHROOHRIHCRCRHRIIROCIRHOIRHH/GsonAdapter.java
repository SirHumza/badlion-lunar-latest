package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.transform.ComponentTransform;
import com.lunarclient.adventure.transform.ComponentTransformer;
import com.lunarclient.adventure.utils.ComponentType;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.ShadowColor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Pattern IHICOOCCOIHOOCIHOOHHCIIHOHICCI = Pattern.compile(":([A-Za-z0-9_+-]+):");
   private static final String IOCCIIIIHIHCORCROIIHCIOIORRHHR = "/assets/lunar/";
   private static final String IICCRORIIRCCORIIRHIOHCOOORIORH = "font/emoji.json";
   private static final int HCCHIHHHHRCRIICOROCRIHICORIHHR = 20;
   private static boolean IHIOIOIHRRIRCHOOIIOOICHIROCIHR;
   private Map<String, String> IORRRIRIIROIRCHIOIICIOOHORIROO;
   private Map<String, String> OCCIRIIIICIOHOIHHRIHOIHIOOCRIR;
   private Map<String, String> CHIIROCCICCCICOOROHCOICOIIHCRH;
   private Map<String, String> HIRRCOORCHCHRHHRHHCHRCIHCICOCC;
   private Map<String, String> CHROHOHIHHCHCCRIRHOHICRCHHHORO;
   private Set<String> RIIHIIOICRIROCRCCICORCROHRRRHC;
   private ComponentTransformer RCHHICIHOCHHHRIICCROIIHHHRIOHH;
   private ComponentTransformer HCCROOIHHOCIHOROHOOIIHHRORICOH;

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      Component var2 = var1.OIOORCCOCHRRIRRORRICOCOCROICII();
      Component var3 = this.CIHHOHOIIOIHOCCHRIRCHHOICORIOR() ? this.HICIRRHIRHRIRICOROHIOIIHIICHHR().transform(var2) : var2;
      ComponentTransformer var4 = this.IROHORHIHRIIICCRHRHCHCRIRICRHI() ? null : this.HCOHIORIIHCIROHOIHCORCHHIIRCHO();
      if (var4 != null) {
         var3 = var4.transform(var3);
      }

      if (!var3.equals(var2)) {
         var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3);
      }
   }

   public String OIIHROORCRORRRCOICCCHIOIHIHHRC(String var1) {
      if (var1.indexOf(58) == -1) {
         return var1;
      }

      Matcher var2 = IHICOOCCOIHOOCIHOOHHCIIHOHICCI.matcher(var1);
      StringBuilder var3 = null;

      while (var2.find()) {
         String var4 = this.RRCHOOIROCICCRHIRORICRCCOHIROI().get(var2.group(1).toLowerCase(Locale.ROOT));
         String var5 = var4 == null ? null : this.IORCORRCHCOIRCIRRIIOOHHIORRHIO(var4);
         if (var5 != null) {
            if (var3 == null) {
               var3 = new StringBuilder();
            }

            var2.appendReplacement(var3, Matcher.quoteReplacement(var5));
         }
      }

      return var3 == null ? var1 : var2.appendTail(var3).toString();
   }

   public String HCRCROOHOHOHOHCOCRCCHRIHCORRIO(String var1) {
      int var2 = Math.max(256, var1.length());
      StringBuilder var3 = null;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         char var5 = var1.charAt(var4);
         String var6 = this.CHRRROOIIOOHHRCIHCCHIIOIIHRICR().get(String.valueOf(var5));
         if (var6 != null) {
            if (var3 == null) {
               var3 = new StringBuilder(var1.substring(0, var4));
            }

            String var7 = this.OCRHIHCHCCROIICORRIORRCIRCROCI().get(String.valueOf(var5));
            int var8 = var1.length() - var4 - 1;
            if (var7 == null || var7.length() > 1 && var3.length() + var7.length() + var8 > var2) {
               if (var7 == null && var3.length() + var6.length() + 2 + var8 <= var2) {
                  var3.append(':').append(var6).append(':');
               } else {
                  var3.append(var5);
               }
            } else {
               var3.append(var7);
            }
         } else if (var3 != null) {
            var3.append(var5);
         }
      }

      return var3 == null ? var1 : var3.toString();
   }

   public String ICRICIRRROOICOCHOHICCOHIRCHIOR(String var1) {
      StringBuilder var2 = null;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         String var5 = this.CHRRROOIIOOHHRCIHCCHIIOIIHRICR().get(String.valueOf(var4));
         if (var5 != null) {
            if (var2 == null) {
               var2 = new StringBuilder(var1.substring(0, var3));
            }

            var2.append(':').append(var5).append(':');
         } else if (var2 != null) {
            var2.append(var4);
         }
      }

      return var2 == null ? var1 : var2.toString();
   }

   public Map<String, String> CIHOOHCHOCIIHRIORCRCHHOOCRIRHH(String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT);
      LinkedHashMap var3 = new LinkedHashMap();

      for (Entry var5 : this.RRCHOOIROCICCRHIRORICRCCOHIROI().entrySet()) {
         if (((String)var5.getKey()).startsWith(var2)) {
            String var6 = this.IORCORRCHCOIRCIRRIIOOHHIORRHIO((String)var5.getValue());
            if (var6 != null) {
               var3.put(":" + (String)var5.getKey() + ":", var6);
               if (var3.size() >= 20) {
                  break;
               }
            }
         }
      }

      return var3;
   }

   private String IORCORRCHCOIRCIRRIIOOHHIORRHIO(String var1) {
      String var2 = this.RICRIHICHCROHCCIOHIHIHIRCRIOOO().get(var1);
      if (this.IROHORHIHRIIICCRHRHCHCRIRICRHI()) {
         return var2;
      } else {
         return var2 != null && this.HHHHCRROHRHCCCRCHCRRIOHHOIOIRH().contains(var1) ? var2 : var1;
      }
   }

   private boolean IROHORHIHRIIICCRHRHCHCRIRICRHI() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
         .HCRCRIHOIHICCCCCOOROIHIIRIHCHI()
         .get();
   }

   private boolean CIHHOHOIIOIHOCCHRIRCHHOICORIOR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC()
         .HHHRCOHIHORCIICROOOHCIOOOCROHI()
         .get();
   }

   private ComponentTransformer HICIRRHIRHRIRICOROHIOIIHIICHHR() {
      if (this.RCHHICIHOCHHHRIICCROIIHHHRIOHH == null) {
         this.RCHHICIHOCHHHRIICCROIIHHHRIOHH = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IHICOOCCOIHOOCIHOOHHCIIHOHICCI, var1 -> this.RRCHOOIROCICCRHIRORICRCCOHIROI().get(var1.group(1).toLowerCase(Locale.ROOT))
         );
      }

      return this.RCHHICIHOCHHHRIICCROIIHHHRIOHH;
   }

   @Nullable
   private ComponentTransformer HCOHIORIIHCIROHOIHCORCHHIIRCHO() {
      if (this.HCCROOIHHOCIHOROHOOIIHHRORICOH == null) {
         Map var1 = this.CRHIHIOIRHRICCCIIIROORROICCCHR();
         if (var1.isEmpty()) {
            return null;
         }

         int[] var2 = var1.keySet().stream().mapToInt(var0 -> var0.codePointAt(0)).sorted().toArray();
         StringBuilder var3 = new StringBuilder("[");

         for (int var4 = 0; var4 < var2.length; var4++) {
            int var5 = var2[var4];

            while (var4 + 1 < var2.length && var2[var4 + 1] == var2[var4] + 1) {
               var4++;
            }

            var3.appendCodePoint(var5);
            if (var2[var4] > var5) {
               var3.append('-').appendCodePoint(var2[var4]);
            }
         }

         var3.append("]\\uFE0F?[");
         var3.appendCodePoint(127995).append('-').appendCodePoint(127999);
         Pattern var6 = Pattern.compile(var3.append("]?").toString());
         this.HCCROOIHHOCIHOROHOOIIHHRORICOH = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var1x -> {
            String var2x = var1x.group();

            while (!var2x.isEmpty()) {
               int var3x = var2x.codePointBefore(var2x.length());
               if (var3x != 65039 && (var3x < 127995 || var3x > 127999)) {
                  break;
               }

               var2x = var2x.substring(0, var2x.length() - Character.charCount(var3x));
            }

            return this.CRHIHIOIRHRICCCIIIROORROICCCHR().get(var2x);
         });
      }

      return this.HCCROOIHHOCIHOROHOOIIHHRORICOH;
   }

   private ComponentTransformer RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Pattern var1, Function<MatchResult, String> var2) {
      Key var3 = (Key)RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "emoji");
      return ComponentTransformer.of(
         ComponentPattern.pattern(var1),
         ComponentTransform.builder()
            .functor(
               ComponentType.TEXT,
               (var3x, var4) -> {
                  String var5 = var3x == null ? null : (String)var2.apply(var3x);
                  String var6 = var5 == null ? null : this.IORCORRCHCOIRCIRRIIOOHHIORRHIO(var5);
                  if (var6 == null) {
                     return var4;
                  } else {
                     return !var6.equals(var5)
                        ? var4.content(var6)
                        : var4.content("")
                           .append(Component.text(var5).style(var1xx -> var1xx.font(var3).color(NamedTextColor.WHITE).shadowColor(ShadowColor.none())));
                  }
               }
            )
            .build()
      );
   }

   private Map<String, String> RRCHOOIROCICCRHIRORICRCCOHIROI() {
      if (this.IORRRIRIIROIRCHIOIICIOOHORIROO == null) {
         this.loadMappings();
      }

      return this.IORRRIRIIROIRCHIOIICIOOHORIROO;
   }

   private Map<String, String> RICRIHICHCROHCCIOHIHIHIRCRIOOO() {
      if (this.CHIIROCCICCCICOOROHCOICOIIHCRH == null) {
         this.loadMappings();
      }

      return this.CHIIROCCICCCICOOROHCOICOIIHCRH;
   }

   private Map<String, String> OCRHIHCHCCROIICORRIORRCIRCROCI() {
      if (this.HIRRCOORCHCHRHHRHHCHRCIHCICOCC == null) {
         this.loadMappings();
      }

      return this.HIRRCOORCHCHRHHRHHCHRCIHCICOCC;
   }

   private Map<String, String> CRHIHIOIRHRICCCIIIROORROICCCHR() {
      if (this.CHROHOHIHHCHCCRIRHOHICRCHHHORO == null) {
         this.loadMappings();
      }

      return this.CHROHOHIHHCHCCRIRHOHICRCHHHORO;
   }

   private Set<String> HHHHCRROHRHCCCRCHCRRIOHHOIOIRH() {
      if (this.RIIHIIOICRIROCRCCICORCROHRRRHC == null) {
         this.loadMappings();
      }

      return this.RIIHIIOICRIROCRCCICORCROHRRRHC;
   }

   private Map<String, String> CHRRROOIIOOHHRCIHCCHIIOIIHRICR() {
      if (this.OCCIRIIIICIOHOIHHRIHOIHIOOCRIR == null) {
         LinkedHashMap var1 = new LinkedHashMap();

         for (Entry var3 : this.RRCHOOIROCICCRHIRORICRCCOHIROI().entrySet()) {
            var1.putIfAbsent((String)var3.getValue(), (String)var3.getKey());
         }

         this.OCCIRIIIICIOHOIHHRIHOIHIOOCRIR = var1;
      }

      return this.OCCIRIIIICIOHOIHHRIHOIHIOOCRIR;
   }

   @Nullable
   public static File ROCRICRHOHCCHOCHHRRORIIOOCHHOI() {
      try {
         Path var0 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO.resolve("emoji-font");
         if (!RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("/assets/lunar/font/emoji.json", "assets/lunar/font/emoji.json", var0)) {
            return null;
         }

         int var1 = 0;

         while (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("/assets/lunar/textures/font/emoji_" + var1 + ".png", "assets/lunar/textures/font/emoji_" + var1 + ".png", var0)) {
            var1++;
         }

         if (var1 == 0) {
            return null;
         }

         Files.deleteIfExists(var0.resolve("assets/minecraft/font/default.json"));
         Files.deleteIfExists(var0.resolve("assets/minecraft/font/uniform.json"));
         IHIOIOIHRRIRCHOOIIOOICHIROCIHR = true;
         return var0.toFile();
      } catch (IOException var2) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, "Extracting chat emoji font"
         );
         return null;
      }
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, String var1, Path var2) {
      try (InputStream var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getResourceAsStream(var0)) {
         if (var3 == null) {
            return false;
         }

         Path var4 = var2.resolve(var1);
         Files.createDirectories(var4.getParent());
         Files.copy(var3, var4, StandardCopyOption.REPLACE_EXISTING);
         return true;
      }
   }

   private void loadMappings() {
      try (InputStreamReader var1 = new InputStreamReader(
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getResourceAsStream("/assets/lunar/emoji/shortcodes.json"), StandardCharsets.UTF_8
         )) {
         JsonObject var2 = new Gson().fromJson(var1, JsonObject.class);
         this.IORRRIRIIROIRCHIOIICIOOHORIROO = HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, "shortcodes");
         this.CHIIROCCICCCICOOROHCOICOIIHCRH = HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var2, IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 17 ? "unicodeModern" : "unicode"
         );
         this.HIRRCOORCHCHRHHRHHCHRCIHCICOCC = HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, "unicodeAll");
         this.CHROHOHIHHCHCCRIRHOHICRCHHHORO = HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, "characters");
         this.RIIHIIOICRIROCRCCICORCROHRRRHC = var2.get("textSymbols")
            .getAsString()
            .chars()
            .mapToObj(var0 -> String.valueOf((char)var0))
            .collect(Collectors.toUnmodifiableSet());
      } catch (Exception var6) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var6, "Loading chat emoji shortcodes"
         );
         this.IORRRIRIIROIRCHIOIICIOOHORIROO = Map.of();
         this.CHIIROCCICCCICOOROHCOICOIIHCRH = Map.of();
         this.HIRRCOORCHCHRHHRHHCHRCIHCICOCC = Map.of();
         this.CHROHOHIHHCHCCRIRHOHICRCHHHORO = Map.of();
         this.RIIHIIOICRIROCRCCICORCROHRRRHC = Set.of();
      }
   }

   private static Map<String, String> HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1) {
      LinkedHashMap var2 = new LinkedHashMap();

      for (Entry var4 : var0.getAsJsonObject(var1).entrySet()) {
         var2.put((String)var4.getKey(), ((JsonElement)var4.getValue()).getAsString());
      }

      return var2;
   }

   @Generated
   public static boolean HICOHORCHORHIHOHRHIORICIIOIHRO() {
      return IHIOIOIHRRIRCHOOIIOOICHIROCIHR;
   }
}
