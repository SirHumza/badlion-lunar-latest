package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCIOROHIHRROROOIRRHRRCCHHRRRHI;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.Sentry;
import io.sentry.protocol.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private String ICHROHOOIOICOIIORHOCRCCCHHHROC;
   private String OIRRIOHHROCOOOIOIIHRCCIOHIORRO;
   @Nullable
   private ITransaction RRCORCROHIOCICRROIOIRIIOIOIHCH;
   private final HashMap<String, ISpan> ORHOIOIHCIHHHHORCIHOORRIRIOOHC = new HashMap<>();
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CCHIRHHHCCIHHRRCRRORIIHCOCIHCH = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
         this::RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
      );
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI var1
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var2 != null) {
         if (!var2.CRHCHHROOCCHRHHOHRCHICCIRRIHRC() && !var2.ROOHROCIRRRIORCIRIRIHCCHOOORIC()) {
            this.IOCCHHCCIIIHIHHRRRRCCROHHHHIOH();
            var2 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
            if (var2 == null) {
               return;
            }

            String var3 = var2.getUsername();
            if (var2.CRHCHHROOCCHRHHOHRCHICCIRRIHRC()) {
               RRCRRCORICCHOHHIRCHIROOHIIOHCO("The launcher refreshed the access token for the current account %s.", var3);
               return;
            }

            if (var2.getAccessToken() == null || var2.IRIOIRHHCOHHORHHOOCRIRROROCRIO() == null) {
               var2.CRCICOIHIIOIHIOOIIHORHOOCROHIR(true);
               RRCRRCORICCHOHHIRCHIROOHIIOHCO("Current account %s is missing token(s), skipping refresh.", var3);
               return;
            }

            RRCRRCORICCHOHHIRCHIROOHIIOHCO("Current account's access token has expired, refreshing...");
            var2.CRCICOIHIIOIHIOOIIHORHOOCROHIR(true);
            this.RIROICHCRROROHCCROOCCCCOCHCCRI(var2.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId(), true);
            var2.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
               var2x -> {
                  com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3x = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
                  if (var3x != null && var3x.HHROOOHCIOIOCCOIRHHOICHIHRCRHO() != null) {
                     this.RIROICHCRROROHCCROOCCCCOCHCCRI(var3x.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId(), false);
                     if (var2x.isSuccessful()) {
                        this.IHIRRIIORRHORHRORIHOROIRCORCOO(var3x.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId(), false);
                        RRCRRCORICCHOHHIRCHIROOHIIOHCO("Successfully refreshed access token for account %s", var3);
                        this.IOCCHHCCIIIHIHHRRRRCCROHHHHIOH();
                     } else {
                        this.IHIRRIIORRHORHRORIHOROIRCORCOO(var3x.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId(), true);
                        RRCRRCORICCHOHHIRCHIROOHIIOHCO("Failed to refresh access token for account %s", var3);
                     }
                  }
               }
            );
         }
      }
   }

   @Nullable
   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOOIOIRHHCHIROHHCCCORCRCHICROO() {
      return this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO == null ? null : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().get(this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO);
   }

   public void HIHROCCHROORCOHIRROOCOHHCORICH(@Nullable String var1) {
      this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO = var1;
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var2 != null) {
         this.CCHIRHHHCCIHHRRCRRORIIHCOCIHCH.IIHRRHORCRCROCHHOHORCHCROCIHRO("selectedAccount", var2.provide());
      }
   }

   @Override
   protected Map<String, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return new ConcurrentHashMap<>();
   }

   @Override
   public File CCOICRRHOHHHHROOOROIHIRHHCCIHI() {
      File var1 = new File(com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROCIHIROIOOIHHHHIRIRCCIIOOHHHI + File.separator + "accounts.json");
      if (var1.exists()) {
         return var1;
      }

      try {
         var1.createNewFile();
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return new File(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), this.OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC());
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "launcher_accounts.json";
   }

   @Override
   public void init() {
      super.init();
      this.ORHHHHORORCIROIRRICCHOOOICCCHC(true);
   }

   private boolean RCHCOHROIHRCIRCRRRHOROCCCOCIII() {
      File var1 = this.CCOICRRHOHHHHROOOROIHIRHHCCIHI();
      if (!var1.exists()) {
         return false;
      } else {
         boolean var2 = var1.setWritable(true);
         if (!var2) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO("Could not set accounts file to writable!");
            this.OHOCCIHOOIIIHRRHCHIHRHCICIOIHH();
            return true;
         } else {
            return !Files.isWritable(var1.toPath());
         }
      }
   }

   private void OHOCCIHOOIIIHRRHCHIHRHCICIOIHH() {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$schedule(
            () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                     "accounts_file_not_writable"
                  )
               )
         );
   }

   @Override
   public boolean OHRRCRHHCOHOHHCORRROHROOCOCCHH() {
      return this.RCHCOHROIHRCIRCRRRHOROCCCOCIII()
         ? false
         : com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.super.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
   }

   @Override
   public void RHHIIRORCOIORHIOHRHCIHRHHIRCRH(boolean var1) {
      if (!this.RCHCOHROIHRCIRCRRRHOROCCCOCIII()) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.super.RHHIIRORCOIORHIOHRHCIHRHHIRCRH(var1);
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Exception var1, File var2) {
      if (var1 instanceof FileNotFoundException && var2.isFile()) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO("Could not write to file: %s", var2.getAbsolutePath());
         this.OHOCCIHOOIIIHRRHCHIHRHCICIOIHH();
      } else {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null);
      }
   }

   public void IOCCHHCCIIIHIHHRRRRCCROHHHHIOH() {
      this.ORHHHHORORCIROIRRICCHOOOICCCHC(false);
   }

   public void ORHHHHORORCIROIRRICCHOOOICCCHC(boolean var1) {
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().clear();
      this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
      ArrayList var2 = new ArrayList();

      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .values()) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = var4.HHROOOHCIOIOCCOIRHHOICHIHRCRHO();
         if (var4.CRCHRRIICIOCRCIOIHICHHRROIOCHR()
            != com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.XBOX) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO("Removing %s because it is not an XBOX account.", var4.getUsername());
            var2.add(var4);
         } else if (!var2.contains(var4) && var5 != null) {
            for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
               .values()) {
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var8 = var7.HHROOOHCIOIOCCOIRHHOICHIHRCRHO();
               if (!var2.contains(var7) && var8 != null && !var5.equals(var8) && var5.getId().equals(var8.getId())) {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO("Removing duplicate account because it's xbox");
                  var2.add(var7);
                  break;
               }
            }
         }
      }

      RRCRRCORICCHOHHIRCHIROOHIIOHCO("Removed all accounts [%s count]", var2.size());
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values().removeAll(var2);
      this.IROHHICRRROCCCICOIRICRHRRIORCI();
      if (var1) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
         if (var9 != null && !var9.CRHCHHROOCCHRHHOHRCHICCIRRIHRC()) {
            var9.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var2x -> {
               if (var2x.isSuccessful()) {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO("Successfully refreshed access token for account %s", var9.getUsername());
                  this.IOCCHHCCIIIHIHHRRRRCCROHHHHIOH();
               } else {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO("Failed to refresh access token for account %s", var9.getUsername());
               }
            });
         }
      }
   }

   private void IROHHICRRROCCCICOIRICRHRRIORCI() {
      if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SENTRY_ACCOUNT_LOGIN_TRACING
         .isEnabled()) {
         this.RRCORCROHIOCICRROIOIRIIOIOIHCH = Sentry.startTransaction("Auth", "auth3");
      } else {
         this.RRCORCROHIOCICRROIOIRIIOIOIHCH = null;
      }

      this.RROOICCHOHOIRCRHHOIHCRHIIOCHIO();
   }

   private void IRCICCHIOHCRCROROHHHIIROOCRRHI() {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO("Current account is null?! Signing into the first account we find.");
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .entrySet()
         .stream()
         .filter(var0 -> var0.getValue().CRHCHHROOCCHRHHOHRCHICCIRRIHRC())
         .findFirst()
         .ifPresentOrElse(var1 -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getValue()), () -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null));
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, false);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, boolean var2
   ) {
      if (var1 == null) {
         this.HIHROCCHROORCOHIRROOCOHHCORICH(null);
         Sentry.setUser(null);
      } else {
         this.HIHROCCHROORCOHIRROOCOHHCORICH(var1.getUsername());
         ISpan var3 = null;
         if (this.RRCORCROHIOCICRROIOIRIIOIOIHCH != null) {
            var3 = this.RRCORCROHIOCICRROIOIRIIOIOIHCH.startChild("setCurrentAccount " + var1.getUsername());
         }

         var1.CHOORROORROOHOOOHIOHRHCIHOIOCC();
         if (var3 != null) {
            var3.finish();
         }

         User var4 = new User();
         var4.setUsername(var1.getUsername());
         String var5 = OCIOROHIHRROROOIRRHRRCCHHRRRHI.CCHHHHCICRCCCIOOIOICOOCRCRHCCR(var1.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId());
         var4.setId(var5);
         Sentry.setUser(var4);
         if (var2) {
            this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
         }
      }
   }

   @Override
   public void load(JsonObject var1) {
      if (var1.has("mojangClientToken")) {
         this.ICHROHOOIOICOIIORHOCRCCCHHHROC = var1.get("mojangClientToken").getAsString();
      }

      String var2 = "";
      if (var1.has("activeAccountLocalId")) {
         var2 = var1.get("activeAccountLocalId").getAsString();
      }

      if (var1.has("accounts")) {
         JsonObject var3 = var1.get("accounts").getAsJsonObject();

         for (Entry var5 : var3.entrySet()) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO("Attempting to load account [%s]", var5.getKey());
            JsonObject var6 = ((JsonElement)var5.getValue()).getAsJsonObject();
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.valueOf(
               var6.get("type").getAsString().toUpperCase()
            );
            if (var7 == com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.XBOX) {
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var8 = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  (String)var5.getKey()
               );
               var8.load(var6);
               Instant var9 = var8.IIRCCROHCHOHIHOHCCCOIOOHHICRCC();
               if (var9 != null && var9.isAfter(Instant.now().plus(14L, ChronoUnit.DAYS))) {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO("Account [%s] was invalid (2)", var8.getUsername());
                  this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().remove(var8.getUsername());
               } else {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO("Loaded content for [%s] Token IAT", var8.getUsername(), var8.RCOROOOICCRIRCIIHHHRHRIRRIOIHC());
                  com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
                     .get(var8.getUsername());
                  if (var10 != null) {
                     if (!var8.CRHCHHROOCCHRHHOHRCHICCIRRIHRC()) {
                        RRCRRCORICCHOHHIRCHIROOHIIOHCO("Account was skipped due to double account which is invalid.");
                        continue;
                     }

                     if (var10.RCOROOOICCRIRCIIHHHRHRIRRIOIHC() < var8.RCOROOOICCRIRCIIHHHRHRIRRIOIHC()) {
                        RRCRRCORICCHOHHIRCHIROOHIIOHCO("Double Account, getting the newer one so we're skipping this one.");
                        continue;
                     }

                     var2 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var5, var8);
                     RRCRRCORICCHOHHIRCHIROOHIIOHCO("Removing old account.");
                     RRCRRCORICCHOHHIRCHIROOHIIOHCO("Duplicate account found!");
                  }

                  this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().put(var8.getUsername(), var8);
                  if (var2.equals(var5.getKey()) || var10 != null && var10.CCHROIRCOOCIRCCHIOIIRRHCCCOHHI().equals(var5.getKey())) {
                     if (var8.getAccessToken() != null && var8.IRIOIRHHCOHHORHHOOCRIRROROCRIO() != null) {
                        RRCRRCORICCHOHHIRCHIROOHIIOHCO("Setting currentAccount to what was on disk: %s", var8.getUsername());
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8);
                     } else {
                        this.IHIRRIIORRHORHRORIHOROIRCORCOO(var8.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId(), true);
                     }
                  }
               }
            } else if (var7 != com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.MOJANG) {
               throw new IllegalArgumentException("Unknown type for " + var7.name());
            }
         }
      }

      this.RROOICCHOHOIRCRHHOIHCRHIIOCHIO();
   }

   private String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      Entry<String, JsonElement> var2,
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().remove(var3.getUsername());
      if (this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO != null && this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO.equals(var3.getUsername())) {
         this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO = var3.getUsername();
         var1 = (String)var2.getKey();
      }

      this.RROOICCHOHOIRCRHHOIHCRHIIOCHIO();
      return var1;
   }

   @Override
   public boolean CRCRRCIIHIRCOHOOORROOCOROOHCRR() {
      return true;
   }

   @Override
   public void close() {
      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      this.RROOICCHOHOIRCRHHOIHCRHIIOCHIO();
      var1.addProperty("mojangClientToken", this.ICHROHOOIOICOIIORHOCRCCCHHHROC);
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var2 != null) {
         var1.addProperty("activeAccountLocalId", var2.CCHROIRCOOCIRCCHIOIIRRHCCCOHHI());
      }

      JsonObject var3 = new JsonObject();
      var1.add("accounts", var3);

      for (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .values()) {
         var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
      }
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().remove(var1.getUsername());
      if (var1.getUsername().equals(this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO)) {
         this.OIRRIOHHROCOOOIOIIHRCCIOHIORRO = null;
         this.IRCICCHIOHCRCROROHHHIIROOCRRHI();
      }

      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
      return true;
   }

   public boolean ICHHCHRHIRIHIOHCHORIRIOIRIRICR() {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      return var1 != null && var1.getAccessToken() != null && var1.CRHCHHROOCCHRHHOHRCHICCIRRIHRC();
   }

   public boolean HHRIIIRIRIICRRHHICOHIHICHHRCRR() {
      return !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
         ? true
         : this.ICHHCHRHIRIHIOHCHORIRIOIRIRICR()
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession() != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$isValidSession();
   }

   public static void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object var0, Object... var1) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("Accounts", var0, var1);
   }

   @Override
   public Map<String, com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RHHCIRRROCHIIHOCRIIHIHOOCCCRCR() {
      return super.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();
   }

   private void RROOICCHOHOIRCRHHOIHCRHIIOCHIO() {
      this.CCHIRHHHCCIHHRRCRRORIIHCOCIHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH("accounts", this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().values());
   }

   public void HIOCCRCCCRICORCIIHHRIRROICHRIC(boolean var1) {
      this.CCHIRHHHCCIHHRRCRRORIIHCOCIHCH.IIHRRHORCRCROCHHOHORCHCROCIHRO("loggingIn", var1);
   }

   public void IHCICHIIIHORHRIICHOHOHHOCHRORO(boolean var1) {
      this.CCHIRHHHCCIHHRRCRRORIIHCOCIHCH.IIHRRHORCRCROCHHOHORCHCROCIHRO("addingAccount", var1);
   }

   public void RIROICHCRROROHCCROOCCCCOCHCCRI(String var1, boolean var2) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.COHHIHOCHHCOOOIICHOHOIHHIICRHC(
         var1
      );
      if (var3 != null) {
         var3.IIHHIIIHCRHCCROOHHRROORCORCCCC(var2);
         if (var2) {
            var3.setInvalid(false);
         }

         this.RROOICCHOHOIRCRHHOIHCRHIIOCHIO();
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
      }
   }

   public void IHIRRIIORRHORHRORIHOROIRCORCOO(String var1, boolean var2) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.COHHIHOCHHCOOOIICHOHOIHHIICRHC(
         var1
      );
      if (var3 != null) {
         var3.IIHHIIIHCRHCCROOHHRROORCORCCCC(false);
         var3.setInvalid(var2);
         this.RROOICCHOHOIRCRHHOIHCRHIIOCHIO();
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
      }
   }

   private com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COHHIHOCHHCOOOIICHOHOIHHIICRHC(
      String var1
   ) {
      return this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .values()
         .stream()
         .filter(var1x -> var1x.HHROOOHCIOIOCCOIRHHOICHIHRCRHO() != null && var1x.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId().equals(var1))
         .findFirst()
         .orElse(null);
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var2 != null && var2 == var1) {
         this.CCHIRHHHCCIHHRRCRRORIIHCOCIHCH.IIHRRHORCRCROCHHOHORCHCROCIHRO("selectedAccount", var1.provide());
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Instant var1) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.IOOIOIRHHCHIROHHCCCORCRCHICROO();
      if (var2 != null) {
         var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         this.CCHIRHHHCCIHHRRCRRORIIHCOCIHCH.IIHRRHORCRCROCHHOHORCHCROCIHRO("selectedAccount", var2.provide());
         this.RROOICCHOHOIRCRHHOIHCRHIIOCHIO();
      }
   }

   @Generated
   public void OHCIHICCRCICIOCOOORIICOOROHOHC(String var1) {
      this.ICHROHOOIOICOIIORHOCRCCCHHHROC = var1;
   }

   @Generated
   public String ICHCICCCIOHCOCIRCIOCOHICIICCOC() {
      return this.ICHROHOOIOICOIIORHOCRCCCHHHROC;
   }

   @Generated
   public HashMap<String, ISpan> RRRCRHRCICHIOORIIRCHORIHROHHIR() {
      return this.ORHOIOIHCIHHHHORCIHOORRIRIOOHC;
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.CCHIRHHHCCIHHRRCRRORIIHCOCIHCH;
   }
}
