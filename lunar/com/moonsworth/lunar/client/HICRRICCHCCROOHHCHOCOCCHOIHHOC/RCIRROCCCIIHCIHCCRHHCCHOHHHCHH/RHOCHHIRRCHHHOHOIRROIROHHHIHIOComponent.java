package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHICORCROOROHCIHIHCOIHRRHICICO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.util.HIHHOCRHHRORRHHRORRRIIHHORIHOC;
import com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCIOROHIHRROROOIRRHRRCCHHRRRHI;
import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import java.util.function.Consumer;
import lombok.Generated;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC CRHHRCOHOCOIHCHRCORCHCCRHHRCOC = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "steve.png");
   private String COCICCOCCOOCHRROHHCIRICRIRCOHR;
   private Instant CCCRCRRIICIIROIIHIIIIORICIHRRO;
   private String HCCIOORIRROHIOROIRHOOCRRRRIRRI;
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO OOOIORHORRCOOOHHCHCHIIHIOHIHRH;
   private String HRCIHOIHHHOCICOICCIICRHOHRCRCR;
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH IHCRHRHRORRCOHHOORHCRCROHIROOC;
   private String username;
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH ROCCHCOCHOIRIROROROOCRCRCRCCCO;
   private boolean ROOICHHHOOOOROCRROOCIORORRRCRI = false;
   private transient String COIICIHCCHHHCOIHIOOCRIIROIHROI;
   private transient RCIROOOOICRHCCRRCIORHHIRCOIIIC CHHIROIHRHRRIORCIHROORRHICRHOO;
   private transient boolean OIRHCRRCICHIICIRIIIRORHHOHCCHO;
   private transient boolean invalid;
   private Instant CIRRIICIIRRCCOOIRRICCCRHCHRCOO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1) {
      this.HCCIOORIRROHIOROIRHOOCRRRRIRRI = var1;
   }

   @Override
   public void load(JsonObject var1) {
      if (var1.has("accessTokenExpiresAt") && !var1.get("accessTokenExpiresAt").isJsonNull()) {
         this.CCCRCRRIICIIROIIHIIIIORICIHRRO = Instant.parse(var1.get("accessTokenExpiresAt").getAsString());
      } else {
         this.CCCRCRRIICIIROIIHIIIIORICIHRRO = null;
      }

      this.HCCIOORIRROHIOROIRHOOCRRRRIRRI = var1.get("localId").getAsString();
      this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH = new RRCRRCORICCHOHHIRCHIROOHIIOHCO();
      this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH.load(var1.get("minecraftProfile").getAsJsonObject());
      this.HRCIHOIHHHOCICOICCIICRHOHRCRCR = var1.get("remoteId").getAsString();
      this.IHCRHRHRORRCOHHOORHCRCROHIROOC = HHCCIRHCCCIIRHCROHIORHIRHHIORH.valueOf(var1.get("type").getAsString().toUpperCase());
      if (var1.has("username")) {
         this.username = var1.get("username").getAsString();
      }

      if (var1.has("accessToken") && !var1.get("accessToken").getAsString().isEmpty()) {
         this.COCICCOCCOOCHRROHHCIRICRIRCOHR = var1.get("accessToken").getAsString();
      } else {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            "No access token found for [%s]", this.username
         );
      }

      if (var1.has("refreshToken")) {
         this.COIICIHCCHHHCOIHIOOCRIIROIHROI = var1.get("refreshToken").getAsString();
      }

      this.ROCCHCOCHOIRIROROROOCRCRCRCCCO = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      this.ROCCHCOCHOIRIROROROOCRCRCRCCCO.load(var1);
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      JsonObject var2 = new JsonObject();
      var1.add(this.HCCIOORIRROHIOROIRHOOCRRRRIRRI, var2);
      var2.addProperty("accessToken", this.COCICCOCCOOCHRROHHCIRICRIRCOHR);
      if (this.CCCRCRRIICIIROIIHIIIIORICIHRRO != null) {
         var2.addProperty("accessTokenExpiresAt", this.CCCRCRRIICIIROIIHIIIIORICIHRRO.toString());
      }

      if (this.ROCCHCOCHOIRIROROROOCRCRCRCCCO == null) {
         this.ROCCHCOCHOIRIROROROOCRCRCRCCCO = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      }

      this.ROCCHCOCHOIRIROROROOCRCRCRCCCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
      var2.addProperty("localId", this.HCCIOORIRROHIOROIRHOOCRRRRIRRI);
      var2.addProperty("refreshToken", this.COIICIHCCHHHCOIHIOOCRIIROIHROI);
      this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
      var2.addProperty("remoteId", this.HRCIHOIHHHOCICOICCIICRHOHRCRCR);
      var2.addProperty("type", this.IHCRHRHRORRCOHHOORHCRCROHIROOC.getFormatted());
      var2.addProperty("username", this.username);
   }

   public abstract void OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
      Consumer<com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH> var1
   );

   public abstract boolean CRHCHHROOCCHRHHOHRCHICCIRRIHRC();

   public abstract long OIOIRCROCCHHCROROOOIRCCIIHCIOR();

   public abstract int RCOROOOICCRIRCIIHHHRHRIRRIOIHC();

   public RCIROOOOICRHCCRRCIORHHIRCOIIIC ORROCICCRHCHHHIHRRHCOOHROIOHII() {
      if (this.CHHIROIHRHRRIORCIHROORRHICRHOO == null) {
         if (this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH == null) {
            return CRHHRCOHOCOIHCHRCORCHCCRHHRCOC;
         }

         String var1 = OCIOROHIHRROROOIRRHRRCCHHRRRHI.CCHHHHCICRCCCIOOIOICOOCRCRHCCR(this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH.getId());
         this.CHHIROIHRHRRIORCIHROORRHICRHOO = HIHHOCRHHRORRHHRORRRIIHHORIHOC.IOOCHIRHCRICHIHORCRCHCRHCICROH(UUID.fromString(var1));
      }

      return this.CHHIROIHRHRRIORCIHROORRHICRHOO;
   }

   public void CHOORROORROOHOOOHIOHRHCIHOIOCC() {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         "Setting account '%s' as the current session.", this.username
      );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$setSession(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  this.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getName(), this.HHROOOHCIOIOCCOIRHHOICHIHRCRHO().getId(), this.getAccessToken(), "msa"
               )
         );
      IHICORCROOROHCIHIHCOIHRRHICICO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession();
      if (var1 != null && var1.bridge$getProfile() != null && var1.bridge$getProfile().getId() != null) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HIROOIRICIRHIHHIIIRCIOHHHIOHIC()
            .OICOCIOCIHCOCRHHCOHHOHOCOOIROO();
         if (var2 != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HIROOIRICIRHIHHIIIRCIOHHHIOHIC().CRRRICCRROCOHHOHIICIHORCOORRRH(var2);
            if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIRHHRHCRRCIOHIHRORHCOIRIIOHHC()
               != null) {
               RCIROOOOICRHCCRRCIORHHIRCOIIIC var3 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHRHHHORORIROOCORCIORRCOCHHHRI(
                  var2.getHash(), var2.getUrl()
               );
               String var4 = var2.IRIIRHOOOCCHRORRIRIHIHHOORRCOC().toString().equals("classic") ? "default" : var2.IRIIRHOOOCCHRORRIRIHIHHOORRCOC().toString();
               com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIRHHRHCRRCIOHIHRORHCOIRIIOHHC()
                  .bridge$setSkinLocation(var3, var4);
               com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOROCROIRCHIHIHHOOIRIIIRRCRHI(
                  var3
               );
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.COIHORRCHRRCHOCIRHHRRIOIHRIHCC.CRRRICCRROCOHHOHIICIHORCOORRRH.OICICOOOHCRHIOCRHHCHRROCIHHCOO = var4;
               GameProfile var5 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIRHHRHCRRCIOHIHRORHCOIRIIOHHC()
                  .bridge$getGameProfile();
               ((IHIRRIIORRHORHRORIHOROIRCORCOO)com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIRHHRHCRRCIOHIHRORHCOIRIIOHHC())
                  .setGameProfile(new GameProfile(var5.getId(), var1.bridge$getProfile().getName()));
            }
         }
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HIROOIRICIRHIHHIIIRCIOHHHIOHIC().IRCCIIIOCIRCCCROHOHOROORRHOHHI();
   }

   @com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH(
      "accounts"
   )
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("uuid", OCIOROHIHRROROOIRRHRRCCHHRRRHI.CCHHHHCICRCCCIOOIOICOOCRCRHCCR(this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH.getId()));
      var1.addProperty("username", this.username);
      var1.addProperty("accountType", this.IHCRHRHRORRCOHHOORHCRCROHIROOC.getFormatted());
      boolean var2 = this.CRHCHHROOCCHRHHOHRCHICCIRRIHRC();
      var1.addProperty("validSession", var2);
      var1.addProperty("loading", this.OIRHCRRCICHIICIRIIIRORHHOHCCHO);
      var1.addProperty("invalid", this.invalid);
      var1.addProperty("localId", this.HCCIOORIRROHIOROIRHOOCRRRRIRRI);
      Instant var3 = this.CCCRCRRIICIIROIIHIIIIORICIHRRO != null
         ? this.CCCRCRRIICIIROIIHIIIIORICIHRRO.minus(1L, ChronoUnit.DAYS)
         : (this.OIOIRCROCCHHCROROOOIRCCIIHCIOR() > 0L ? Instant.ofEpochMilli(this.OIOIRCROCCHHCROROOOIRCCIIHCIOR()).minus(1L, ChronoUnit.DAYS) : Instant.now());
      var1.addProperty("lastUsedAt", var3.getEpochSecond());
      var1.addProperty("lastUsedAtReadable", "Last used " + RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR(var3));
      if (this.CIRRIICIIRRCCOOIRRICCCRHCHRCOO != null) {
         LocalDateTime var4 = LocalDateTime.ofInstant(this.CIRRIICIIRRCCOOIRRICCCRHCHRCOO, ZoneId.systemDefault());
         var1.addProperty("createdAt", var4.format(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CCOIHIICCROHHRCCRIRHIHCOCOROIO));
      }

      return var1;
   }

   @Generated
   public String getAccessToken() {
      return this.COCICCOCCOOCHRROHHCIRICRIRCOHR;
   }

   @Generated
   public Instant IIRCCROHCHOHIHOHCCCOIOOHHICRCC() {
      return this.CCCRCRRIICIIROIIHIIIIORICIHRRO;
   }

   @Generated
   public String CCHROIRCOOCIRCCHIOIIRRHCCCOHHI() {
      return this.HCCIOORIRROHIOROIRHOOCRRRRIRRI;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO HHROOOHCIOIOCCOIRHHOICHIHRCRHO() {
      return this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH;
   }

   @Generated
   public String HRIOOCOCIRCIHIRRHHOHORRICIRCRH() {
      return this.HRCIHOIHHHOCICOICCIICRHOHRCRCR;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH CRCHRRIICIOCRCIOIHICHHRROIOCHR() {
      return this.IHCRHRHRORRCOHHOORHCRCROHIROOC;
   }

   @Generated
   public String getUsername() {
      return this.username;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH OOOIRHORORCOOOIHIHOICIICHORIII() {
      return this.ROCCHCOCHOIRIROROROOCRCRCRCCCO;
   }

   @Generated
   public boolean ROOHROCIRRRIORCIRIRIHCCHOOORIC() {
      return this.ROOICHHHOOOOROCRROOCIORORRRCRI;
   }

   @Generated
   public String IRIOIRHHCOHHORHHOOCRIRROROCRIO() {
      return this.COIICIHCCHHHCOIHIOOCRIIROIHROI;
   }

   @Generated
   public boolean isLoading() {
      return this.OIRHCRRCICHIICIRIIIRORHHOHCCHO;
   }

   @Generated
   public boolean isInvalid() {
      return this.invalid;
   }

   @Generated
   public Instant CIHCCCOHCIOOCICCRRROOHOCORHOCI() {
      return this.CIRRIICIIRRCCOOIRRICCCRHCHRCOO;
   }

   @Generated
   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(String var1) {
      this.COCICCOCCOOCHRROHHCIRICRIRCOHR = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Instant var1) {
      this.CCCRCRRIICIIROIIHIIIIORICIHRRO = var1;
   }

   @Generated
   public void CHOOIORORCOOICCRRHRRHCOIICOOCC(String var1) {
      this.HCCIOORIRROHIOROIRHOOCRRRRIRRI = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      this.OOOIORHORRCOOOHHCHCHIIHIOHIHRH = var1;
   }

   @Generated
   public void OORCRORHCICOCORRCHRHRHIICHOCCR(String var1) {
      this.HRCIHOIHHHOCICOICCIICRHOHRCRCR = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.IHCRHRHRORRCOHHOORHCRCROHIROOC = var1;
   }

   @Generated
   public void setUsername(String var1) {
      this.username = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.ROCCHCOCHOIRIROROROOCRCRCRCCCO = var1;
   }

   @Generated
   public void CRCICOIHIIOIHIOOIIHORHOOCROHIR(boolean var1) {
      this.ROOICHHHOOOOROCRROOCIORORRRCRI = var1;
   }

   @Generated
   public void IHIIOHCOCOCCORIIOCHHCORIOOHICH(String var1) {
      this.COIICIHCCHHHCOIHIOOCRIIROIHROI = var1;
   }

   @Generated
   public void HRRHRCCOOIOIIIRORIOOORORHOORIH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      this.CHHIROIHRHRRIORCIHROORRHICRHOO = var1;
   }

   @Generated
   public void IIHHIIIHCRHCCROOHHRROORCORCCCC(boolean var1) {
      this.OIRHCRRCICHIICIRIIIRORHHOHCCHO = var1;
   }

   @Generated
   public void setInvalid(boolean var1) {
      this.invalid = var1;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Instant var1) {
      this.CIRRIICIIRRCCOOIRRICCCRHCHRCOO = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         if (this.ROOHROCIRRRIORCIRIRIHCCHOOORIC() != var2.ROOHROCIRRRIORCIRIRIHCCHOOORIC()) {
            return false;
         }

         String var3 = this.getAccessToken();
         String var4 = var2.getAccessToken();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Instant var5 = this.IIRCCROHCHOHIHOHCCCOIOOHHICRCC();
            Instant var6 = var2.IIRCCROHCHOHIHOHCCCOIOOHHICRCC();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.CCHROIRCOOCIRCCHIOIIRRHCCCOHHI();
               String var8 = var2.CCHROIRCOOCIRCCHIOIIRRHCCCOHHI();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 = this.HHROOOHCIOIOCCOIRHHOICHIHRCRHO();
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO var10 = var2.HHROOOHCIOIOCCOIRHHOICHIHRCRHO();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     String var11 = this.HRIOOCOCIRCIHIRRHHOHORRICIRCRH();
                     String var12 = var2.HRIOOCOCIRCIHIRRHHOHORRICIRCRH();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        HHCCIRHCCCIIRHCROHIORHIRHHIORH var13 = this.CRCHRRIICIOCRCIOIHICHHRROIOCHR();
                        HHCCIRHCCCIIRHCROHIORHIRHHIORH var14 = var2.CRCHRRIICIOCRCIOIHICHHRROIOCHR();
                        if (var13 == null ? var14 == null : var13.equals(var14)) {
                           String var15 = this.getUsername();
                           String var16 = var2.getUsername();
                           if (var15 == null ? var16 == null : var15.equals(var16)) {
                              IRCIIHHICIHRCOCRROCOICRIHHCCHH var17 = this.OOOIRHORORCOOOIHIHOICIICHORIII();
                              IRCIIHHICIHRCOCRROCOICRIHHCCHH var18 = var2.OOOIRHORORCOOOIHIHOICIICHORIII();
                              if (var17 == null ? var18 == null : var17.equals(var18)) {
                                 Instant var19 = this.CIHCCCOHCIOOCICCRRROOHOCORHOCI();
                                 Instant var20 = var2.CIHCCCOHCIOOCICCRRROOHOCORHOCI();
                                 return var19 == null ? var20 == null : var19.equals(var20);
                              } else {
                                 return false;
                              }
                           } else {
                              return false;
                           }
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.ROOHROCIRRRIORCIRIRIHCCHOOORIC() ? 79 : 97);
      String var3 = this.getAccessToken();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Instant var4 = this.IIRCCROHCHOHIHOHCCCOIOOHHICRCC();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.CCHROIRCOOCIRCCHIOIIRRHCCCOHHI();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = this.HHROOOHCIOIOCCOIRHHOICHIHRCRHO();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      String var7 = this.HRIOOCOCIRCIHIRRHHOHORRICIRCRH();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = this.CRCHRRIICIOCRCIOIHICHHRROIOCHR();
      var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
      String var9 = this.getUsername();
      var2 = var2 * 59 + (var9 == null ? 43 : var9.hashCode());
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = this.OOOIRHORORCOOOIHIHOICIICHORIII();
      var2 = var2 * 59 + (var10 == null ? 43 : var10.hashCode());
      Instant var11 = this.CIHCCCOHCIOOCICCRRROOHOCORHOCI();
      return var2 * 59 + (var11 == null ? 43 : var11.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "Account(accessToken="
         + this.getAccessToken()
         + ", accessTokenExpiresAt="
         + this.IIRCCROHCHOHIHOHCCCOIOOHHICRCC()
         + ", localId="
         + this.CCHROIRCOOCIRCCHIOIIRRHCCCOHHI()
         + ", profile="
         + this.HHROOOHCIOIOCCOIRHHOICHIHRCRHO()
         + ", remoteId="
         + this.HRIOOCOCIRCIHIRRHHOHORRICIRCRH()
         + ", type="
         + this.CRCHRRIICIOCRCIOIHICHHRROIOCHR()
         + ", username="
         + this.getUsername()
         + ", accountComplianceData="
         + this.OOOIRHORORCOOOIHIHOICIICHORIII()
         + ", triedRefreshing="
         + this.ROOHROCIRRRIORCIRIRIHCCHOOORIC()
         + ", refreshToken="
         + this.IRIOIRHHCOHHORHHOOCRIRROROCRIO()
         + ", head="
         + this.ORROCICCRHCHHHIHRRHCOOHROIOHII()
         + ", loading="
         + this.isLoading()
         + ", invalid="
         + this.isInvalid()
         + ", createdAt="
         + this.CIHCCCOHCIOOCICCRRROOHOCORHOCI()
         + ")";
   }
}
