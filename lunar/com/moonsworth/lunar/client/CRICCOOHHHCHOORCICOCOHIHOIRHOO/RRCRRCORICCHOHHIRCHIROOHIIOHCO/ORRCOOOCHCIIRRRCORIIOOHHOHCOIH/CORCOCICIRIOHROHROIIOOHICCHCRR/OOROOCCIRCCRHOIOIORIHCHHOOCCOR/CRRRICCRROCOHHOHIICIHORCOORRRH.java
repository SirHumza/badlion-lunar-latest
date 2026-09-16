package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.serializer.gson.GsonComponentSerializer;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Pattern OORCOROORIORCCRRHCOOORICHOCOCH = Pattern.compile("^(?:(?:BUY|SELL) )?(?<shard>.+) Shard$");

   public static @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(@Nullable IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = var0.bridge$getDataComponent(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRCHCROCHRROHROOCCHIHIOCHOICOC
         );
         return var1 == null ? null : var1.bridge$getData();
      } else {
         return null;
      }
   }

   public static @NonNull String CHHIICHRIIROIOHIHIIROICOCCROCI(@Nullable IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
         var0
      );
      return var1 == null ? "" : var1.bridge$getString("id");
   }

   public static @NonNull String COOCCHICCCIIICRHIOCOCIOOORCOCC(@Nullable IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 == null) {
         return "";
      }

      String var1 = CHHIICHRIIROIOHIHIIROICOCCROCI(var0);
      if (var1.isEmpty() || var1.equals("ATTRIBUTE_SHARD")) {
         Matcher var2 = OORCOROORIORCCRRHCOOORICHOCOCH.matcher(var0.bridge$getRawDisplayName());
         if (var2.matches()) {
            return "SHARD_" + var2.group("shard").replaceAll(" ", "_").toUpperCase(Locale.ROOT);
         }
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
         var0
      );
      if (var11 == null) {
         return var1;
      }

      return switch (var1) {
         case "PET" -> {
            String var25;
            try {
               JsonObject var30 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
                  .fromJson(var11.bridge$getString("petInfo"), JsonObject.class);
               String var32 = var30.get("type").getAsString();
               String var34 = var30.get("tier").getAsString();
               var25 = var32 + ";" + var34;
            } catch (Exception var10) {
               var25 = var1;
               yield var25;
            }

            yield var25;
         }
         case "ENCHANTED_BOOK" -> {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var29 = var11.bridge$getCompoundTag(
               "enchantments"
            );
            if (var29 == null) {
               String var21 = var1;
               yield var21;
            } else {
               Set var31 = var29.bridge$getAllKeys();
               if (var31.size() != 1) {
                  String var22 = var1;
                  yield var22;
               } else {
                  String var33 = (String)var31.iterator().next();
                  int var35 = var29.bridge$getInteger(var33);
                  String var23 = "ENCHANTMENT_" + var33.toUpperCase() + "_" + var35;
                  yield var23;
               }
            }
         }
         case "RUNE", "UNIQUE_RUNE" -> {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var28 = var11.bridge$getCompoundTag(
               "runes"
            );
            if (var28 == null) {
               String var18 = var1;
               yield var18;
            } else {
               Set var7 = var28.bridge$getAllKeys();
               if (var7.size() != 1) {
                  String var19 = var1;
                  yield var19;
               } else {
                  String var8 = (String)var7.iterator().next();
                  int var9 = var28.bridge$getInteger(var8);
                  String var20 = var1 + ";" + var8.toUpperCase() + ";" + var9;
                  yield var20;
               }
            }
         }
         case "PARTY_HAT_CRAB", "PARTY_HAT_CRAB_ANIMATED" -> {
            String var27 = var11.bridge$getString("party_hat_color");
            if (var27.isEmpty()) {
               String var16 = var1;
               yield var16;
            } else {
               String var17 = var1 + "_" + var27.toUpperCase();
               yield var17;
            }
         }
         case "PARTY_HAT_SLOTH" -> {
            String var26 = var11.bridge$getString("party_hat_emoji");
            if (var26.isEmpty()) {
               String var14 = var1;
               yield var14;
            } else {
               String var15 = var1 + "_" + var26.toUpperCase();
               yield var15;
            }
         }
         case "ABICASE" -> {
            String var6 = var11.bridge$getString("model");
            if (var6.isEmpty()) {
               String var12 = var1;
               yield var12;
            } else {
               String var13 = var1 + "_" + var6.toUpperCase();
               yield var13;
            }
         }
         default -> {
            String var5 = var1;
            yield var5;
         }
      };
   }

   public static Component deserialize(String var0) {
      try {
         JsonObject var1 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var0, JsonObject.class);
         return GsonComponentSerializer.gson().deserializeFromTree(var1);
      } catch (Exception var2) {
         return Component.text(var0);
      }
   }

   public static boolean RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(@Nullable IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && var0.bridge$hasFoil()) {
         Boolean var1 = var0.bridge$getPatchedDataComponent(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCIRRHRCHICIICOIRCRRIOHCCRROI
         );
         return var0.bridge$isItemEnchanted() || Boolean.TRUE.equals(var1);
      } else {
         return false;
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         List var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
            .RIHIRCIOIHIRRICIHHROORCOOHRICC();
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
      } else {
         return null;
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRHIHIRHRCHHRORRRCORHOCIRHRIOR(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         List var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
            .HOHHHOCOOCRHOIRHCHHCOHRRHIOOCI();
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
      } else {
         return null;
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCOROCROIRCHIHIHHOOIRIIIRRCRHI(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         List var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
            .HHHHCCHIHRHHOOIIROHOOCHOOCHORI();
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
      } else {
         return null;
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOCIIROIRCOHIRHHHROHCOOHIICIHI(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         List var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
            .HICRCCCICOCCRORIICHRCOIIHHIIRC();
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
      } else {
         return null;
      }
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCRHOICIRORRHOOOCIHHHHCHCICHOH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      if (var0 != null && !var0.bridge$isEmpty()) {
         List var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
            .OHOOIIIHRRIOOIOIRRHCRROHRHOHRI();
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
      } else {
         return null;
      }
   }

   private static CRRRICCRROCOHHOHIICIHORCOORRRH.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var0, List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1
   ) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var0.bridge$getItem() == var1.get(var2)) {
            return CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.fromIndex(var2);
         }
      }

      return null;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      @Nullable HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      @Nullable RORCHCIIICOHIRROOORHOCCCCIOCCI var2
   ) {
      if (var0 == null) {
         return null;
      }

      List var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CCHCOROOHHCIHOHOCHIHRHOHOCROII()
         .HHHHCCHIHRHHOOIIROHOOCHOOCHORI();

      for (int var4 = 0; var4 < var3.size(); var4++) {
         if (var0 == var3.get(var4)) {
            return CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.fromIndex(var4);
         }
      }

      return null;
   }

   public static Optional<String> CCHORHIOORICCIRIHRIIHIICORIORO(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = var0.bridge$getDataComponent(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OORHHCHCIRIRORIHRRRCIRICIOOIHH
      );
      if (var1 == null) {
         return Optional.empty();
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var1.bridge$getPropertyMap();
      if (var2 == null) {
         return Optional.empty();
      }

      List var3 = var2.bridge$get("textures");
      return var3 != null && !var3.isEmpty()
         ? Optional.ofNullable(
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.get(0)).bridge$getValue()
         )
         : Optional.empty();
   }

   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var0, String var1, String var2) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
               .HCHCICHCRROORRRHIOHIIHHCRCHHII()
         );
      var3.bridge$setProfile(UUID.fromString(var0), var1, var2);
      return var3;
   }

   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR HRHRRRIROIRIOOCHROIHCRHIROCOIH(String var0) {
      byte[] var1 = ("{\"textures\":{\"SKIN\":{\"url\":\"http://textures.minecraft.net/texture/" + var0 + "\"}}}").getBytes(StandardCharsets.UTF_8);
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(UUID.nameUUIDFromBytes(var1).toString(), Base64.getEncoder().encodeToString(var1), null);
   }

   public static List<String> OCIIROIOORRIOIIIRHIRRCCIIRRROH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.bridge$isEmpty()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = var0.bridge$getDataComponent(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHRCCRRRRHRCCIICIHRCCOOIRIICRO
         );
         if (var2 == null) {
            return var1;
         }

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var2.bridge$getLines()) {
            Component var5 = var4.moonBridge$asAdventureComponent();
            var1.add(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(var5));
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static List<String> HRHRORCIRICHCCCCCHICOOICIRHRIO(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.bridge$isEmpty()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = var0.bridge$getDataComponent(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHRCCRRRRHRCCIICIHRCCOOIRIICRO
         );

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var2.bridge$getLines()) {
            Component var5 = var4.moonBridge$asAdventureComponent();
            var1.add(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var5));
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static List<Component> ROHHHCHRIHHOOHCHIIIHOOCIIRROIO(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.bridge$isEmpty()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = var0.bridge$getDataComponent(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CHRCCRRRRHRCCIICIHRCCOOIRIICRO
         );
         if (var2 == null) {
            return var1;
         }

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var2.bridge$getLines()) {
            var1.add(var4.moonBridge$asAdventureComponent());
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0, IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      if (var0 != null && var1 != null) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
            var0
         );
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
            var1
         );
         if (var2 != null && var3 != null) {
            String var4 = var2.bridge$getString("uuid");
            String var5 = var3.bridge$getString("uuid");
            return var4 != null && var4.equals(var5);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static String HOHCCHOIOHOHHOROHOIIHOOHORRHRO(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
         var0
      );
      return var1 == null ? null : var1.bridge$getString("uuid");
   }

   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR RRCRRCORICCHOHHIRCHIROOHIIOHCO(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0) {
      List var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
         .OHOOIIIHRRIOOIOIRRHCRROHRHOHRI();
      int var2 = var0.ordinal();
      if (var2 >= var1.size()) {
         return null;
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1.get(var2);
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3);
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      if (var0 == null) {
         return false;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = var0.bridge$getData();
      return var1 == null ? false : var1.bridge$getInteger("ethermerge") == 1;
   }

   public static boolean IOHOHIHHHOOHOOHRRIOCRIRRORICIO(String var0) {
      return var0.equals("ASPECT_OF_THE_END")
         || var0.equals("ASPECT_OF_THE_VOID")
         || var0.equals("NECRONS_BLADE")
         || var0.equals("HYPERION")
         || var0.equals("ASTRAEA")
         || var0.equals("VALKYRIE")
         || var0.equals("SCYLLA");
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH IRRICCOOOOHCHIROHCRHICROHCHHCH(
      String var0
   ) {
      byte[] var1 = Base64.getDecoder().decode(var0);
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      byte[] var0
   ) {
      byte[] var1 = Base64.getDecoder().decode(var0);
      return HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      byte[] var0
   ) {
      ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      return var2.bridge$getList("i", 10);
   }

   public static TextComponent HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = var0.bridge$getCompoundTag("tag")
         .bridge$getCompoundTag("display");
      if (var1.bridge$isEmpty()) {
         return Component.text("None", NamedTextColor.RED);
      }

      TextComponent var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
         var1.bridge$getString("Name")
      );
      TextComponent var3 = var2;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = var1.bridge$getList("Lore", 8);

      for (int var5 = 0; var5 < var4.bridge$size(); var5++) {
         String var6 = var4.bridge$getString(var5);
         var3 = (TextComponent)((TextComponent)var3.appendNewline())
            .append(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(var6));
      }

      return (TextComponent)var2.hoverEvent(HoverEvent.showText(var3));
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIIIHHICHOROIIROORCOCIRRCROIR(
      @Nullable String var0
   ) {
      if (var0 == null) {
         return null;
      }

      try {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH()
            .HHCCIRHCCCIIRHCROHIORHIRHHIORH(new ByteArrayInputStream(Base64.getDecoder().decode(var0)));
      } catch (IOException var2) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, "Failed to parse inventory"
         );
         return null;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 33)
   public static @Nullable IIRHCHHOICHRICOOCRORCCIOOIHOIR CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      try {
         short var1 = var0.bridge$getShort("id");
         if (var1 == 141) {
            var1 = 391;
         }

         short var2 = var0.bridge$contains("Damage", 2) ? var0.bridge$getShort("Damage") : 0;
         byte var3 = var0.bridge$getByte("Count");
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var0.bridge$getCompoundTag(
            "tag"
         );
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var4.bridge$getCompoundTag(
            "display"
         );
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = var5.bridge$getList("Lore", 8);
         ArrayList var7 = new ArrayList();

         for (int var8 = 0; var8 < var6.bridge$size(); var8++) {
            TextComponent var9 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
               var6.bridge$getString(var8)
            );
            var7.add(var9.style(var9.style().decoration(TextDecoration.ITALIC, false)));
         }

         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var20 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
            .HCCCIIHICHIROIHHIIHCIIICCORCCR(
               "minecraft:"
                  + com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.idToNewName(
                     var1, var2
                  )
            );
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var21 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var20);
         var21.bridge$setItemDamage(var2);
         TextComponent var10 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            var5.bridge$getString("Name")
         );
         var21.bridge$setStackDisplayName(var10.style(var10.style().decoration(TextDecoration.ITALIC, false)));
         var21.bridge$setLore(var7);
         var21.bridge$setStackSize(var3);
         if (var4.bridge$contains("ench", 9)) {
            var21.bridge$setEnchantments(
               Map.of(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOIRRRIRHICOHCCORHIHCOHIIIHCCO()
                     .CCIHIRRIHCOICHHHIHCHHHHCHRIICR(),
                  1
               )
            );
         }

         if (var4.bridge$contains("SkullOwner", 10)) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var11 = var4.bridge$getCompoundTag(
               "SkullOwner"
            );
            String var12 = var11.bridge$getString("Id");
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var13 = var11.bridge$getCompoundTag(
               "Properties"
            );
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var14 = var13.bridge$getList(
               "textures", 10
            );
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var15 = var14.bridge$getCompoundAt(
               0
            );
            String var16 = var15.bridge$getString("Value");
            String var17 = var15.bridge$getString("Signature");
            var21.bridge$setProfile(UUID.fromString(var12), var16, var17);
         }

         if (var5.bridge$contains("color", 3)) {
            var21.bridge$setArmorColor(var5.bridge$getInteger("color"));
         }

         if (var4.bridge$contains("CustomPotionEffects", 9)) {
            ArrayList var22 = new ArrayList();
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var24 = var4.bridge$getList(
               "CustomPotionEffects", 10
            );

            for (int var25 = 0; var25 < var24.bridge$size(); var25++) {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var26 = var24.bridge$getCompoundAt(
                  var25
               );
               byte var27 = var26.bridge$getByte("Id");
               byte var28 = var26.bridge$getByte("Amplifier");
               int var29 = var26.bridge$getInteger("Duration");
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var18 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getById(
                  var27
               );
               if (var18 != null && var18.getPotion() != null) {
                  var22.add(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCICHHOCCHOROIORCOHOHIRRHCIIOR()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var18.getPotion().bridge$getID(), var18.getId(), var28, var29)
                  );
               }
            }

            var21.bridge$setPotionEffects(var22);
         }

         var21.bridge$setSkyBlockExtraAttributes(var4.bridge$getCompoundTag("ExtraAttributes"));
         var21.bridge$sbHideTooltipComponents();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var23 = var0.bridge$getCompoundTag(
            "components"
         );
         if (var23.bridge$contains("minecraft:item_model", 8)) {
            var21.bridge$setItemModel(RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var23.bridge$getString("minecraft:item_model")));
         }

         return var21;
      } catch (Exception var19) {
         return null;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 33)
   public static @Nullable List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> ROHRIRHHHRCORCIRCHCICIHCRICIHR(@Nullable String var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = RCIIIHHICHOROIIROORCOCIRRCROIR(
         var0
      );
      if (var1 == null) {
         return null;
      }

      ArrayList var2 = new ArrayList();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = var1.bridge$getList("i", 10);

      for (int var4 = 0; var4 < var3.bridge$size(); var4++) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var3.bridge$getCompoundAt(
            var4
         );
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 = CRRRICCRROCOHHOHIICIHORCOORRRH(var5);
         if (var6 != null) {
            var2.add(var6);
         } else {
            var2.add(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .ORIHOCRRHHCCOIHICIOHCIOCIIHOOO()
            );
         }
      }

      return var2;
   }

   public static @NonNull Object2IntOpenHashMap<String> IICCOOCHCHROORHHIIHROHCCRHRCOR(@Nullable IIRHCHHOICHRICOOCRORCCIOOIHOIR var0) {
      Object2IntOpenHashMap var1 = new Object2IntOpenHashMap();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(
         var0
      );
      if (var2 == null) {
         return var1;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var2.bridge$getCompoundTag(
         "enchantments"
      );
      if (var3 == null) {
         return var1;
      }

      for (String var5 : var3.bridge$getAllKeys()) {
         var1.put(var5, var3.bridge$getInteger(var5));
      }

      return var1;
   }

   @Generated
   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      WHITE,
      ORANGE,
      MAGENTA,
      LIGHT_BLUE,
      YELLOW,
      LIME,
      PINK,
      GRAY,
      LIGHT_GRAY,
      CYAN,
      PURPLE,
      BLUE,
      BROWN,
      GREEN,
      RED,
      BLACK;

      public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromIndex(int var0) {
         return values()[var0];
      }
   }
}
