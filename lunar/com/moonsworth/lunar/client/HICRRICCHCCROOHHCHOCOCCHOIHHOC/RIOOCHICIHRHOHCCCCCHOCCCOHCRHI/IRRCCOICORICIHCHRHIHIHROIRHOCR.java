package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IORRORCRRHRRORHIRHRROHCRRIHRII;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import com.moonsworth.lunar.lib.adventure.text.TextReplacementConfig;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IRRCCOICORICIHCHRHIHIHROIRHOCR
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH>
   implements com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final Pattern RCRIRRHIHRICCRIOOHOHHCCOHIORIC = Pattern.compile("\\$([{]?([a-zA-Z0-9]*)[}]?)");
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH OIHCIIRRCHHHHHHCCRCCRCORRROIOH = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIIIHRHCRRORCIRIHHCCRCIHHICCRC;
   private String RHCCORHOHIIIIOORIOICIORORIROOI;
   private JsonObject IICOROORCCIIIIROHOORIOROOICCRR = new JsonObject();
   private JsonObject OICOHCOHHRRIOHRORCCHOCORIHRCCC = new JsonObject();
   @Nullable
   private JsonObject ORIOHHIRIOHIICOIOCIIOIORRHCIII = null;
   private final Map<String, List<String>> RRRHCHRCRRRRHRROOHIHHCCCHICORI = new HashMap<>();
   private final List<String> ORHICRROHOCOOIHCHIHCHIRCIHCICC = new ArrayList<>();
   private JsonObject IORIIOORRRCIIOCOHIRRCCOHHCRHIO = new JsonObject();

   public IRRCCOICORICIHCHRHIHIHROIRHOCR() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         var1 -> {
            this.ORHICRROHOCOOIHCHIHCHIRCIHCICC.addAll(var1.OIOOIOOHRORRCCOOHIROHRHOICCIOI().keySet());
            this.OCRCIHIHHHCHCHCOOOOOHRIICRHRCI();
         }
      );
      this.OCRCIHIHHHCHCHCOOOOOHRIICRHRCI();
      this.IIRRHOIOCCCIROCICICOCCHICHIOOO();
   }

   @Override
   protected Map<String, com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return ImmutableMap.copyOf(
         Arrays.stream(com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.values())
            .collect(
               Collectors.toMap(com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH::getFileName, Function.identity())
            )
      );
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, Object... var3) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CCICIOHHRRHCIOHIHROIRHHROOOICI(var1), var2, var3);
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH var1, String var2, Object... var3
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getLanguagePath(), var2, var3);
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<String> var1, String var2, Object... var3) {
      Optional var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.IICOROORCCIIIIROHOORIOROOICCRR)
         .or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.OICOHCOHHRRIOHRORCCHOCORIHRCCC))
         .or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.IORIIOORRRCIIOCOHIRRCCOHHCRHIO));
      if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
         && this.ORIOHHIRIOHIICOIOCIIOIORRHCIII != null) {
         var4 = var4.or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.ORIOHHIRIOHIICOIOCIIOIORRHCIII));
      }

      return var4.<String>map(var1x -> IORRORCRRHRRORHIRHRROHCRRIHRII.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1x, var3)).orElse(var2);
   }

   public boolean RRORCOIRRIICOOICOIOCORHORCHCOC(String var1, String var2) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.CCICIOHHRRHCIOHIHROIRHHROOOICI(var1), var2);
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(List<String> var1, String var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.IICOROORCCIIIIROHOORIOROOICCRR)
         .or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.OICOHCOHHRRIOHRORCCHOCORIHRCCC))
         .or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.IORIIOORRRCIIOCOHIRRCCOHHCRHIO))
         .isPresent();
   }

   public Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TranslatableComponent var1) {
      String[] var2 = var1.key().split(Pattern.quote("."));
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var2.length - 1; var4++) {
         String var5 = var2[var4];
         if (!var5.isEmpty()) {
            var3.add(var5);
         }
      }

      return var3.isEmpty() ? var1 : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2[var2.length - 1], var1.args());
   }

   public Component IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, List<Component> var3) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CCICIOHHRRHCIOHIHROIRHHROOOICI(var1), var2, var3);
   }

   public Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<String> var1, String var2, List<Component> var3) {
      Optional var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.IICOROORCCIIIIROHOORIOROOICCRR)
         .or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.OICOHCOHHRRIOHRORCCHOCORIHRCCC))
         .or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.IORIIOORRRCIIOCOHIRRCCOHHCRHIO));
      if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
         && this.ORIOHHIRIOHIICOIOCIIOIORRHCIII != null) {
         var4 = var4.or(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, this.ORIOHHIRIOHIICOIOCIIOIORRHCIII));
      }

      return var4.<Component>map(
            var1x -> var1x.contains("$")
               ? Component.text(var1x)
                  .replaceText(
                     TextReplacementConfig.builder()
                        .match(RCRIRRHIHRICCRIOOHOHHCCOHIORIC)
                        .replacement(
                           (var1xx, var2x) -> {
                              String var3x = var1xx.group(1);
                              String var4x = var1xx.group(2);
                              boolean var5 = !var3x.equals(var4x);
                              if (var5) {
                                 return Component.text(
                                    Objects.requireNonNull(
                                       com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.getReplacement(var4x)
                                    )
                                 );
                              }

                              int var6 = Integer.parseInt(var3x);
                              return (ComponentLike)var3.get(var6);
                           }
                        )
                        .build()
                  )
               : Component.text(var1x)
         )
         .orElse(Component.text(var2));
   }

   private synchronized List<String> CCICIOHHRRHCIOHIHROIRHHROOOICI(String var1) {
      return this.RRRHCHRCRRRRHRROOHIHHCCCHICORI.computeIfAbsent(var1, var0 -> {
         Builder var1x = ImmutableList.builder();

         for (String var5 : var0.split(Pattern.quote("."))) {
            if (!var5.isEmpty()) {
               var1x.add(var5);
            }
         }

         return var1x.build();
      });
   }

   private Optional<String> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<String> var1, String var2, JsonObject var3) {
      String var4 = null;

      try {
         JsonObject var5 = var3;

         for (String var7 : var1) {
            JsonObject var8 = var5.getAsJsonObject(var7);
            if (var8 != null) {
               var5 = var8;
            }
         }

         JsonElement var10 = var5.get(var2);
         if (var10 != null) {
            var4 = var10.getAsString();
         }
      } catch (Exception var9) {
      }

      return var4 != null && !var4.isEmpty() ? Optional.of(var4) : Optional.empty();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC = var1;
      this.OCRCIHIHHHCHCHCOOOOOHRIICRHRCI();
   }

   public void setLanguage(String var1) {
      this.RHCCORHOHIIIIOORIOICIORORIROOI = var1;
      this.HIHRIHIOOOCRRHORRCICIIHOHOOIHH();
      com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .getOrDefault(var1, com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ENGLISH);
      if (this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC == null || !this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC.equals(var2)) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      }
   }

   private void OCRCIHIHHHCHCHCOOOOOHRIICRHRCI() {
      if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
         && this.ORIOHHIRIOHIICOIOCIIOIORRHCIII == null) {
         this.ORIOHHIRIOHIICOIOCIIOIORRHCIII = this.IOIICIRIICICIIOORHCIIIIRRIHRHI("lang/lunar/dev-langs", false);
      }

      if (this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Lang", "Couldn't get a valid language so we're setting it to ENGLISH."
         );
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ENGLISH);
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Lang", "Language set as %s (%s).", this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC.name(), this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC.getFileName()
         );
         this.IICOROORCCIIIIROHOORIOROOICCRR = this.IOIICIRIICICIIOORHCIIIIRRIHRHI("lang/lunar/" + this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC.getFileName(), true);
         this.OICOHCOHHRRIOHRORCCHOCORIHRCCC = this.IOIICIRIICICIIOORHCIIIIRRIHRHI("lang/lunar/en_US", true);

         for (String var2 : this.ORHICRROHOCOOIHCHIHCHIRCIHCICC) {
            JsonObject var3 = this.IOIICIRIICICIIOORHCIIIIRRIHRHI("assets/" + var2 + "/lang/" + this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC.getFileName(), false);
            if (var3.keySet().isEmpty()) {
               var3 = this.IOIICIRIICICIIOORHCIIIIRRIHRHI("assets/" + var2 + "/lang/en_US", false);
            }

            if (!var3.keySet().isEmpty()) {
               this.IICOROORCCIIIIROHOORIOROOICCRR.add(var2, var3);
               this.OICOHCOHHRRIOHRORCCHOCORIHRCCC.add(var2, var3);
            }
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR() != null) {
            com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIIIRIRRROOIOIHCRRORORRCCCOCII();

            for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 : com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.values()) {
               var4.updateNametagPrefixLang();
            }
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .OHHRCRIOOCIORORHIOHRICRHHORCIH()
               .forEach(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH::CIIIRIRRROOIOIHCRRORORRCCCOCII);
         }

         this.HIHRIHIOOOCRRHORRCICIIHOHOOIHH();
      }
   }

   public void HIHRIHIOOOCRRHORRCICIIHOHOOIHH() {
      this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH.IIHRRHORCRCROCHHOHORCHCROCIHRO("active", this.RHCCORHOHIIIIOORIOICIORORIROOI);
      this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH.IIHRRHORCRCROCHHOHORCHCROCIHRO("default", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OORHIHHCIRRIRCOHICHCICHIHOOHCO);
      this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH.IIHRRHORCRCROCHHOHORCHCROCIHRO("lang", this.IICOROORCCIIIIROHOORIOROOICCRR);
      this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH.IIHRRHORCRCROCHHOHORCHCROCIHRO("defaultLang", this.OICOHCOHHRRIOHRORCCHOCORIHRCCC);
      this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH
         .IIHRRHORCRCROCHHOHORCHCROCIHRO(
            "forceUnicode", IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$isForceUnicode()
         );
      this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH
         .IIHRRHORCRCROCHHOHORCHCROCIHRO(
            "japaneseGlyphVariants", IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$isJapaneseGlyphVariants()
         );
   }

   private JsonObject IOIICIRIICICIIOORHCIIIIRRIHRHI(String var1, boolean var2) {
      JsonObject var3 = new JsonObject();

      try {
         InputStream var4 = this.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1 + ".json", var1.toLowerCase() + ".json", var1 + ".lang", var1.toLowerCase() + ".lang");
         if (var4 != null) {
            if (var2) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "Lang", "Language file found: %s.", var1
               );
            }

            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            byte[] var6 = new byte[1024];

            int var7;
            while ((var7 = var4.read(var6)) != -1) {
               var5.write(var6, 0, var7);
            }

            String var8 = var5.toString(StandardCharsets.UTF_8);

            try {
               var3 = new JsonParser().parse(var8).getAsJsonObject();
            } catch (Exception var10) {
               var3 = this.HIIIHRROOCHRRRHORCIHOCORRRCOCR(var8);
            }

            var4.close();
         } else if (var2) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Lang", "Language file not found %s.", var1
            );
         }
      } catch (JsonParseException | IllegalStateException | IOException var11) {
         var11.printStackTrace();
      }

      return var3;
   }

   private JsonObject HIIIHRROOCHRRRHORCIHOCORRRCOCR(String var1) {
      JsonObject var2 = new JsonObject();

      for (String var6 : var1.split("\\r?\\n")) {
         if (!var6.isEmpty() && !var6.startsWith("#")) {
            String[] var7 = var6.split("=", 2);
            if (var7.length == 2) {
               var2.addProperty(var7[0], var7[1]);
            }
         }
      }

      return var2;
   }

   private InputStream IOIICIRIICICIIOORHCIIIIRRIHRHI(String... var1) {
      for (String var5 : var1) {
         InputStream var6 = this.getClass().getClassLoader().getResourceAsStream(var5);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   @Override
   public void init() {
      super.init();
      this.OCRCIHIHHHCHCHCOOOOOHRIICRHRCI();
      this.IIRRHOIOCCCIROCICICOCCHICHIOOO();
   }

   public void IIRRHOIOCCCIROCICICOCCHICHIOOO() {
      JsonArray var1 = new JsonArray();
      List var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getLanguageManager().bridge$getLanguages();
      var2.sort(Comparator.comparing(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHCRORHRORIICHRHRCHRRIRRHHOCOO::name));

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHCRORHRORIICHRHRCHRRIRRHHOCOO var4 : var2) {
         JsonObject var5 = new JsonObject();
         var5.addProperty("code", var4.OHOHIOHCIIHOCRIHHICIHHCIRIIRHC());
         var5.addProperty("region", var4.OORHHCHCIRIRORIHRRRCIRICIOOIHH());
         var5.addProperty("name", var4.name());
         var5.addProperty("lunarSupported", var4.RCHROROIIRHORCHIHICIOOOIOOOCIR());
         var1.add(var5);
      }

      this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH.IIHRRHORCRCROCHHOHORCHCROCIHRO("available", var1);
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Object[] var2, boolean var3) {
      boolean var5 = var3 && var1.startsWith("key.");
      String var4;
      if (var5) {
         var4 = var1.substring("key.".length());
      } else {
         var4 = var1;
      }

      Optional var6 = Arrays.stream(var4.split("\\.")).findFirst();
      if (var6.isPresent()) {
         String var7 = var4;
         if (var5) {
            if (((String)var6.get()).equals("replaymod")) {
               var7 = "replaymod.input." + var7.substring("replaymod.".length());
            } else {
               var7 = "key." + var7;
               String var8 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ImmutableList.of((String)var6.get()), var7, var2);
               if (!var8.equals(var7)) {
                  return var8;
               }

               var7 = var4;
            }
         }

         String var10 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ImmutableList.of((String)var6.get()), var7, var2);
         if (!var10.equals(var7)) {
            return var10;
         }
      }

      return !var3 ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, true) : null;
   }

   @Generated
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.OIHCIIRRCHHHHHHCCRCCRCORRROIOH;
   }

   @Generated
   public com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOHIHORCRRHIHHRIOOIOCRCCHRCROH() {
      return this.CIIIHRHCRRORCIRIHHCCRCIHHICCRC;
   }

   @Generated
   public void IHIIIRHOOCHRCCCCIORIROCOIRRHCC(JsonObject var1) {
      this.IORIIOORRRCIIOCOHIRRCCOHHCRHIO = var1;
   }
}
