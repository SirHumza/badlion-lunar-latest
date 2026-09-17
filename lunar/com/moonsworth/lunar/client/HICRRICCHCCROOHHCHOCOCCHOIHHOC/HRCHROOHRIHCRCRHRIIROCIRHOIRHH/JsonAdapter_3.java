package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH>
   implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private JsonObject ORRIIHCCHRIRHIHHHCIIIHOCHCCHRR = new JsonObject();

   @Override
   protected Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      HashMap var1 = new HashMap();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "blogPosts",
         new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(),
         var1
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "alert",
         new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(),
         var1
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("modSettings", new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(), var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "clientSettings",
         new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(),
         var1
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("pinnedServers", new CORCOCICIRIOHROHROIIOOHICCHCRR(), var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("serverIntegration", new CRICCOOHHHCHOORCICOCOHIHOIRHOO(), var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("starServers", new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(), var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("featureFlag", new CRRRICCRROCOHHOHIICIHORCOORRRH(), var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("sentryFilteredExceptions", new RRCRRCORICCHOHHIRCHIROOHIIOHCO(), var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "links",
         new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(),
         var1
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("langOverride", new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(), var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("storeBadge", new IIHRRHORCRCROCHHOHORCHCROCIHRO(), var1);
      this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1);
      return var1;
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "metadata_fallback.json";
   }

   @Override
   public void load(JsonObject var1) {
      var1 = var1.get("metaData").getAsJsonObject();
      boolean var2 = false;

      for (Entry var4 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().entrySet()) {
         String var5 = (String)var4.getKey();
         Consumer var6 = (Consumer)var4.getValue();
         if (var1.has(var5) && !this.ORRIIHCCHRIRHIHHHCIIIHOCHCCHRR.has(var5)) {
            try {
               JsonElement var7 = var1.get(var5);
               var6.accept(var7);
               this.ORRIIHCCHRIRHIHHHCIIIHOCHCCHRR.add(var5, var7);
            } catch (Exception var8) {
               var2 = true;
               com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var8, "GameMeta Processor"
               );
            }
         }
      }

      if (var2 && var1.has("webCopy")) {
         this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
      } else {
         this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      var1.add("metaData", this.ORRIIHCCHRIRHIHHHCIIIHOCHCCHRR);
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH CHRRCCIRORIICIIHRCHCORRHROCCHH(String var1) {
      return this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().get(var1);
   }

   @Nullable
   public String RROHICOOIOIIRIHCRRCRRCCRIIOHCI() {
      return this.CHRRCCIRORIICIIHRCHCORRHROCCHH("storeBadge") instanceof IIHRRHORCRCROCHHOHORCHCROCIHRO var2 ? var2.RROHICOOIOIIRIHCRRCRRCCRIIOHCI() : null;
   }

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, HashMap<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH> var3
   ) {
      var2.setName(var1);
      var3.put(var1, var2);
      return var2;
   }

   public void IHIRRIIORRHORHRORIHOROIRCORCOO(Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      if (var1 == null) {
         var1 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();
      }

      this.ORRIIHCCHRIRHIHHHCIIIHOCHCCHRR = new JsonObject();

      try {
         String var2 = URLEncoder.encode(IIRHCHHOICHRICOOCRORCCIOOIHOIR.HIOCHICRIOCICHRCOOCOROIHIIHCHO, StandardCharsets.UTF_8);
         String var3 = URLEncoder.encode(IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCOIIIHIRRCCCCCHCHRIOCHHRHIICI, StandardCharsets.UTF_8);
         String var4 = URLEncoder.encode(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCICHOOCICHRIIIHHROHCRHHROOHIO, StandardCharsets.UTF_8
         );
         String var5 = URLEncoder.encode(
            com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO, StandardCharsets.UTF_8
         );
         String var6;
         if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null
            && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR() != null) {
            var6 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .HOHIHORCRRHIHHRIOOIOCRCCHRCROH()
               .getBase();
         } else {
            var6 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OORHIHHCIRRIRCOHICHCICHIHOOHCO.split("_")[0];
         }

         String var7 = URLEncoder.encode(var6, StandardCharsets.UTF_8);
         HttpRequest var8 = HttpRequest.newBuilder()
            .uri(
               URI.create(
                  RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR()
                     + "/game/metadata?os="
                     + var2
                     + "&version="
                     + com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CROIHRIIRROCHORIIRIOCROOORRCCH()
                     + "&arch="
                     + var3
                     + "&gitCommit="
                     + var4
                     + "&branch="
                     + var5
                     + "&language="
                     + var7
               )
            )
            .header("X-Installation-Id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR)
            .header("X-Overwolf-Muid", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC)
            .header("sentry-trace", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CCHHHCROHRCOCHHORCORROCIIOOHOC)
            .GET()
            .build();
         Map var9 = var1;
         HttpClient.newHttpClient()
            .sendAsync(var8, BodyHandlers.ofString())
            .thenAccept(
               var2x -> {
                  JsonElement var3x;
                  try {
                     var3x = new JsonParser().parse(var2x.body());
                  } catch (Exception var8x) {
                     var8x.printStackTrace();
                     this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                     return;
                  }

                  if (!var3x.isJsonObject()) {
                     this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                  } else {
                     boolean var4x = false;

                     for (String var6x : var9.keySet()) {
                        if (var3x.getAsJsonObject().has(var6x)) {
                           var4x = true;
                           break;
                        }
                     }

                     if (!var4x) {
                        this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                     } else {
                        JsonObject var9x = new JsonObject();

                        try {
                           var9x.addProperty("webCopy", true);
                           var9x.add("metaData", var3x.getAsJsonObject());
                           this.load(var9x);
                        } catch (IOException var7x) {
                           com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var7x, "GameMeta Processor - Download"
                           );
                           this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                        }
                     }
                  }
               }
            );
      } catch (Exception var10) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var10, "GameMeta Processor - Outbound Request"
         );
         this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var1,
      String var2,
      Object var3,
      @NotNull HCHRIROHHHCORIOCROOCHRCIOROOCI var4,
      com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var5,
      Predicate<@Nullable String> var6
   ) {
      Optional var7 = var4.RIROICHCRROROHCCROOCCCCOCHCCRI(var1.get(var2));
      if (!var7.isEmpty()) {
         if (var6 == null) {
            var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var3,
               com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CLIENT_REMOTE,
               var7.get()
            );
         } else {
            var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var7.get());
         }
      }
   }

   @Override
   public String getCategory() {
      return "Metadata";
   }

   @Override
   public Set<? extends com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HIHCHCHCHROIIHCIHCOCIORCHCOCRC() {
      return new HashSet<>(this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values());
   }
}
