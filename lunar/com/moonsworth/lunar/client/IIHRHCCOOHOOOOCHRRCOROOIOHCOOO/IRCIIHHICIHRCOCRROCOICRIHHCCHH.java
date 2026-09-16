package com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.RadioInfo;
import com.lunarclient.common.v1.RadioTrack;
import com.lunarclient.common.v1.UserSocial;
import com.lunarclient.websocket.friend.v1.FriendSocials;
import com.lunarclient.websocket.hostedworld.v1.Joinability;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.RCOCRROHHROHHOCRCCCHCIROIIOORC;
import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final UUID HCROCIIOOIROHRRRHRRHHIHOCHRRCH;
   private String name;
   private String HHCCOOHOOHRCRHHCRRHIHCROOCHOCI;
   private Location OICCCOHHOHHOHOHRORIOCIIIRROHOH;
   private com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOHICCRICRHIOIIRIICIHRIIOCRORO;
   private long ROHHIHCIIHOHOCCHHOOROHOCRORIOR;
   @Nullable
   private Instant CIRHOROICCCIRIRHIRICOCROCIIHII;
   @Nullable
   private FriendSocials CRIORROROCRCICCCROHCCORHHORHCR;
   private CORCOCICIRIOHROHROIIOOHICCHCRR CRIRORROHCOHROOHOROIIIOOHIRIRO = CORCOCICIRIOHROHROIIOOHICCHCRR.OFFLINE;
   private Joinability OCCHCIROHOHIHIOCHIOIHCICIOOCCO;
   private boolean HHOIORROCOOHIHHOCCRRIIORCOHCCH;
   private long durationMs;
   private int color = -1;
   private long CRRHICIHICICRRIOOIIIORCOCIHCIR;
   private CRHROHHHCIHHCOHCOORCRIHHIICROR RCIOHHIICOIHHCRRHORRCOOROOHCHI;
   private CRHROHHHCIHHCOHCOORCRIHHIICROR CIROCHCHOIRCRROHCOROHOHOORCOOC;
   private long ICROCRRIIIRIICHRCOIHRCHROCHRCR;
   private long HCRHIRIOCRCORIORCRCOIICOHCOOIO;
   @Nullable
   private String IOICRIRHICRCCHCHOHHIORCIOCCOOO;
   @Nullable
   private Component RROHCIHCOORCHORHHOOOIIRHIIHCCI;
   @Nullable
   private RadioInfo CRROIOROIHRIORORIHRCORHOIICORR;
   private int CHOOHHHIHIRIOHOCROCOHRCIIRRRCO;
   private int HIIRCCHHCIHROHCRICCOCIHRRHCRIH;
   @Nullable
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIROCOHOCRHOHCCRIHIRHOICHRIRIR;
   @Nullable
   private String rank;
   private boolean IOCIOIIOHHRIOOCIIRHHRICIROCICC;
   private boolean CRRCOCCCIRRROIRCIICORCIOHRCROH;
   private boolean HOHIIIIIHHROICOIRHHHHICORHRRCI;
   private String HCICRICIOIIOOCOIIRHORICIHHRCOR = "steve.png";

   @Deprecated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var1) {
      this.HCROCIIOOIROHRRRHRRHHIHOCHRRCH = var1;
      this.ICIHOOIOHRHHCRHIIROCHOHCHRIOIH();
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var1, String var2) {
      this(var1);
      this.setName(var2);
   }

   public void RICRIRRCOHRCOCRRHHCRHRROOIOHHR(CRHROHHHCIHHCOHCOORCRIHHIICROR var1) {
      this.RCIOHHIICOIHHCRRHORRCOOROOHCHI = this.CIROCHCHOIRCRROHCOROHOHOORCOOC == null ? var1 : this.CIROCHCHOIRCRROHCOROHOHOORCOOC;
      this.CIROCHCHOIRCRROHCOROHOHOORCOOC = var1;
      long var2 = System.currentTimeMillis();
      if (this.ICROCRRIIIRIICHRCOIHRCHROCHRCR != 0L) {
         this.HCRHIRIOCRCORIORCRCOIICOHCOOIO = var2 - this.ICROCRRIIIRIICHRCOIHRCHROCHRCR;
      }

      this.ICROCRRIIIRIICHRCOIHRCHROCHRCR = var2;
   }

   public void COOOHIRRCCRCIHRCHHIHORIIHHIORO() {
      this.RCIOHHIICOIHHCRRHORRCOOROOHCHI = null;
      this.CIROCHCHOIRCRROHCOROHOHOORCOOC = null;
      this.IOICRIRHICRCCHCHOHHIORCIOCCOOO = null;
   }

   public double HIRIRHRRIRICICOCRORIRIHHRCCOIO() {
      if (this.HCRHIRIOCRCORIORCRCOIICOHCOOIO <= 0L) {
         return 1.0;
      }

      double var1 = System.currentTimeMillis() - this.ICROCRRIIIRIICHRCOIHRCHROCHRCR;
      return Math.min(1.0, var1 / this.HCRHIRIOCRCORIORCRCOIICOHCOOIO);
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      this.CRIRORROHCOHROOHOROIIIOOHIRIRO = var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCOIHOICHRIIHOCCCIHRRHHRROORCR() != null
         && this == IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RROHIIOHORHICRHIHCCRRRHIHCHRCC()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .RCOIHOICHRIIHOCCCIHRRHHRROORCR()
            .CORROIRHRRIHCRHIROHHORCCHIIRCO()
            .IIHRRHORCRCROCHHOHORCHCROCIHRO("onlineStatus", var1.getName());
      }
   }

   public int CCHCCIHCIORHHICRROIOHIHRHCHORH() {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.CRIRORROHCOHROOHOROIIIOOHIRIRO);
   }

   public boolean CIIRCROIRCROCCIIHCOIHOIHOCHRCI() {
      return this.CRIRORROHCOHROOHOROIIIOOHIRIRO != CORCOCICIRIOHROHROIIOOHICCHCRR.OFFLINE;
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(CORCOCICIRIOHROHROIIOOHICCHCRR var0) {
      if (var0 == null) {
         return -4210753;
      }

      return switch (var0) {
         case AWAY -> -5991424;
         case BUSY -> -904879;
         case INVISIBLE, OFFLINE -> -4210753;
         case ONLINE -> -12209557;
      };
   }

   public void setName(String var1) {
      this.name = var1;
      this.HHCCOOHOOHRCRHHCRRHIHCROOCHOCI = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(var1);
   }

   private void ICIHOOIOHRHHCRHIIROCHOHCHRIOIH() {
      String var1 = this.HCROCIIOOIROHRRRHRRHHIHOCHRRCH.toString() + ".png";
      Path var2 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.RHOIRIICHCIRHHOORORIIRCRCRRIHH;

      try {
         Files.createDirectories(var2);
      } catch (IOException var4) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "Loading Avatars");
         return;
      }

      File[] var3 = var2.toFile().listFiles();
      if (var3 != null) {
         if (Arrays.stream(var3).noneMatch(var1x -> var1x.getName().equals(var1))) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "WebOSR", "Avatar doesn't exist, download: " + var1
            );
            new Thread(new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this)).start();
         } else {
            this.HROICORRORCIOIHHOROICROHIOCHIO(var1);
         }
      }
   }

   @CRRRICCRROCOHHOHIICIHORCOORRRH("friends")
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH RCOIRIIRORCOOHCRCIRHIHCIIIRCRI() {
      return () -> {
         JsonObject var1 = new JsonObject();
         var1.addProperty("uuid", this.HCROCIIOOIROHRRRHRRHHIHOCHRRCH.toString());
         var1.addProperty("file", this.HCICRICIOIIOOCOIIRHORICIHHRCOR);
         var1.addProperty("formattedName", this.name);
         var1.addProperty("name", this.HHCCOOHOOHRCRHHCRRHIHCROOCHOCI);
         var1.addProperty("online", this.CRIRORROHCOHROOHOROIIIOOHIRIRO.getName());
         var1.addProperty("version", this.HOHICCRICRHIOIIRIICIHRIIOCRORO == null ? null : this.HOHICCRICRHIOIIRIICIHRIIOCRORO.RIOHOIHIOORHIIICRCOCRCICORICRH());
         var1.add(
            "statusDetails",
            RCOCRROHHROHHOCRCCCHCIROIIOORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.HCROCIIOOIROHRRRHRRHHIHOCHRRCH,
               this.OICCCOHHOHHOHOHRORIOCIIIRROHOH,
               this.CRIRORROHCOHROOHOROIIIOOHIRIRO,
               this.ROHHIHCIIHOHOCCHHOOROHOCRORIOR
            )
         );
         var1.addProperty("invitedMeToHostedWorld", this.HHOIORROCOOHIHHOCCRRIIORCOHCCH);
         var1.addProperty(
            "hostedWorldJoinability",
            this.OCCHCIROHOHIHIOCHIOIHCICIOOCCO != null ? this.OCCHCIROHOHIHIOCHIOIHCICIOOCCO.name() : Joinability.JOINABILITY_UNSPECIFIED.name()
         );
         var1.addProperty("canJoinServer", this.getLocation() != null && this.getLocation().getLocationCase() == Location.LocationCase.PUBLIC_SERVER);
         if (this.CRROIOROIHRIORORIHRCORHOIICORR != null && !this.CRROIOROIHRIORORIHRCORHOIICORR.getTrack().getTitle().isEmpty()) {
            RadioTrack var2 = this.CRROIOROIHRIORORIHRCORHOIICORR.getTrack();
            var1.addProperty("isRadioPlaying", true);
            var1.addProperty("radioTitle", var2.getTitle());
            var1.addProperty("radioArtist", String.join(", ", var2.getArtistNamesList()));
            var1.addProperty("radioCoverArt", var2.getImageUrl());
         } else {
            var1.addProperty("isRadioPlaying", false);
         }

         if (this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR != null) {
            var1.add("badge", this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR.RHRRROIHCRIICHOORRIHCOCHCHCHCR());
         }

         if (this.rank != null) {
            var1.addProperty("rank", this.rank);
         }

         JsonObject var8 = new JsonObject();
         var8.addProperty("isLunarPlus", this.CHOOHHHIHIRIOHOCROCOHRCIIRRRCO != 0);
         var8.addProperty("plusColor", String.format("#%06X", 16777215 & this.COHORRCHIRRRCHICOCRHOOCHIRIIRC()));
         var8.addProperty("logoColor", String.format("#%06X", 16777215 & this.IIRORHHOIHCICOROIIIRRIHHRHIHOC()));
         var1.add("lunarPlus", var8);
         var1.addProperty("pinned", this.HOHIIIIIHHROICOIRHHHHICORHRRCI);
         if (this.CIRHOROICCCIRIRHIRICOCROCIIHII != null && this.CIRHOROICCCIRIRHIRICOCROCIIHII.toEpochMilli() > 0L) {
            LocalDateTime var3 = LocalDateTime.ofInstant(this.CIRHOROICCCIRIRHIRICOCROCIIHII, ZoneId.systemDefault());
            var1.addProperty("friendsSince", var3.format(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CCOIHIICCROHHRCCRIRHIHCOCOROIO));
         }

         if (this.CRIORROROCRCICCCROHCCORHHORHCR != null) {
            JsonObject var9 = new JsonObject();
            var9.addProperty("hidden", this.CRIORROROCRCICCCROHCCORHHORHCR.getHidden());
            JsonArray var4 = new JsonArray();

            for (UserSocial var6 : this.CRIORROROCRCICCCROHCCORHHORHCR.getLinkedList()) {
               JsonObject var7 = new JsonObject();
               var7.addProperty("platform", var6.getPlatform().name());
               var7.addProperty("username", var6.getUsername());
               var7.addProperty("avatar", var6.getAvatar());
               var4.add(var7);
            }

            var9.add("linked", var4);
            var1.add("socials", var9);
         }

         return var1;
      };
   }

   @Generated
   public UUID HRIOHCCIOOIORHRHCIRCRRIIOHCHHI() {
      return this.HCROCIIOOIROHRRRHRRHHIHOCHRRCH;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public String ROCCHOHOIICCCROOHIHHHRORHCCIRI() {
      return this.HHCCOOHOOHRCRHHCRRHIHCROOCHOCI;
   }

   @Generated
   public Location getLocation() {
      return this.OICCCOHHOHHOHOHRORIOCIIIRROHOH;
   }

   @Generated
   public com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHRHCIIHICCCIRHHIOOICIIIIOHCCC() {
      return this.HOHICCRICRHIOIIRIICIHRIIOCRORO;
   }

   @Generated
   public long RCCCCICCICIHHCOORIIOCRCCROIOCI() {
      return this.ROHHIHCIIHOHOCCHHOOROHOCRORIOR;
   }

   @Nullable
   @Generated
   public Instant RIOOHRIIOCRORCCIIOHHIOIIHHICCI() {
      return this.CIRHOROICCCIRIRHIRICOCROCIIHII;
   }

   @Nullable
   @Generated
   public FriendSocials OIICOOOCHOHHRCHRRCHRCOOHHIOOIR() {
      return this.CRIORROROCRCICCCROHCCORHHORHCR;
   }

   @Generated
   public CORCOCICIRIOHROHROIIOOHICCHCRR CIHIIIROIRCIRROICHIHHCOHCCHHOC() {
      return this.CRIRORROHCOHROOHOROIIIOOHIRIRO;
   }

   @Generated
   public Joinability getHostedWorldJoinability() {
      return this.OCCHCIROHOHIHIOCHIOIHCICIOOCCO;
   }

   @Generated
   public boolean HRHICCHOIHHCOOCCCRCHRIRHRHHOHR() {
      return this.HHOIORROCOOHIHHOCCRRIIORCOHCCH;
   }

   @Generated
   public long getDurationMs() {
      return this.durationMs;
   }

   @Generated
   public int getColor() {
      return this.color;
   }

   @Generated
   public long OCHROCIHHHIHRCHOOOORORIHICHCOC() {
      return this.CRRHICIHICICRRIOOIIIORCOCIHCIR;
   }

   @Generated
   public CRHROHHHCIHHCOHCOORCRIHHIICROR OHHHOOOCOCCHIOOIHCRIIRRHRHOCCH() {
      return this.RCIOHHIICOIHHCRRHORRCOOROOHCHI;
   }

   @Generated
   public CRHROHHHCIHHCOHCOORCRIHHIICROR RRRRHORROHCHCRCHIRRHORRHRICIRR() {
      return this.CIROCHCHOIRCRROHCOROHOHOORCOOC;
   }

   @Generated
   public long ROCRRHIOOHRIIHOCHHHIICOORCIIRI() {
      return this.ICROCRRIIIRIICHRCOIHRCHROCHRCR;
   }

   @Generated
   public long CCROCHCIIORIRIOHOHHHOHCRHIOCIR() {
      return this.HCRHIRIOCRCORIORCRCOIICOHCOOIO;
   }

   @Nullable
   @Generated
   public String OCHHROCHHOCHCCCHRHICROHCHROCCC() {
      return this.IOICRIRHICRCCHCHOHHIORCIOCCOOO;
   }

   @Nullable
   @Generated
   public Component HCHCCRIRROCHOOIHRRHROIRIRICCII() {
      return this.RROHCIHCOORCHORHHOOOIIRHIIHCCI;
   }

   @Nullable
   @Generated
   public RadioInfo getRadioInfo() {
      return this.CRROIOROIHRIORORIHRCORHOIICORR;
   }

   @Generated
   public int COHORRCHIRRRCHICOCRHOOCHIRIIRC() {
      return this.CHOOHHHIHIRIOHOCROCOHRCIIRRRCO;
   }

   @Generated
   public int IIRORHHOIHCICOROIIIRRIHHRHIHOC() {
      return this.HIIRCCHHCIHROHCRICCOCIHRRHCRIH;
   }

   @Nullable
   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RROOHCOHROIIROCRCRICHOHHCCOOCR() {
      return this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR;
   }

   @Nullable
   @Generated
   public String HOOOHCROCOIRIIRCIIICOCOHRRCOCR() {
      return this.rank;
   }

   @Generated
   public boolean RCHHRRHRRHOHHICCHHRHCIIHCCHCOR() {
      return this.IOCIOIIOHHRIOOCIIRHHRICIROCICC;
   }

   @Generated
   public boolean HROCRCRCRHRIIHHOOROHOIRHHICHCI() {
      return this.CRRCOCCCIRRROIRCIICORCIOHRCROH;
   }

   @Generated
   public boolean ROOHROOCOCOOHCROIRIRHIHOORHIRH() {
      return this.HOHIIIIIHHROICOIRHHHHICORHRRCI;
   }

   @Generated
   public String COCRRRHCRCORHIOIHCOIIIIRCHCORH() {
      return this.HCICRICIOIIOOCOIIRHORICIHHRCOR;
   }

   @Generated
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Location var1) {
      this.OICCCOHHOHHOHOHRORIOCIIIRROHOH = var1;
   }

   @Generated
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HOHICCRICRHIOIIRIICIHRIIOCRORO = var1;
   }

   @Generated
   public void CCHORHIOORICCIRIHRIIHIICORIORO(long var1) {
      this.ROHHIHCIIHOHOCCHHOOROHOCRORIOR = var1;
   }

   @Generated
   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@Nullable Instant var1) {
      this.CIRHOROICCCIRIRHIRICOCROCIIHII = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable FriendSocials var1) {
      this.CRIORROROCRCICCCROHCCORHHORHCR = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Joinability var1) {
      this.OCCHCIROHOHIHIOCHIOIHCICIOOCCO = var1;
   }

   @Generated
   public void IRHCROCOORCOOCIIOORRCCORRIOORO(boolean var1) {
      this.HHOIORROCOOHIHHOCCRRIIORCOHCCH = var1;
   }

   @Generated
   public void setDurationMs(long var1) {
      this.durationMs = var1;
   }

   @Generated
   public void CORCOCICIRIOHROHROIIOOHICCHCRR(int var1) {
      this.color = var1;
   }

   @Generated
   public void OCIIROIOORRIOIIIRHIRRCCIIRRROH(long var1) {
      this.CRRHICIHICICRRIOOIIIORCOCIHCIR = var1;
   }

   @Generated
   public void RRHOOICIIHOCROIHCHRRORRORHHROH(@Nullable String var1) {
      this.IOICRIRHICRCCHCHOHHIORCIOCCOOO = var1;
   }

   @Generated
   public void ORHIOICIOCRRHOOCOHRORIHICHRCRR(@Nullable Component var1) {
      this.RROHCIHCOORCHORHHOOOIIRHIIHCCI = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable RadioInfo var1) {
      this.CRROIOROIHRIORORIHRCORHOIICORR = var1;
   }

   @Generated
   public void IOCCIOHHRCIOHOHOHCOHCRHCCRIIOI(int var1) {
      this.CHOOHHHIHIRIOHOCROCOHRCIIRRRCO = var1;
   }

   @Generated
   public void OHORCCHOIOCRHROIRRHICHCIIOCRCH(int var1) {
      this.HIIRCCHHCIHROHCRICCOCIHRRHCRIH = var1;
   }

   @Generated
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.CIROCOHOCRHOHCCRIHIRHOICHRIRIR = var1;
   }

   @Generated
   public void ROCCROHOHRHROOOORROCICOCCOCORO(@Nullable String var1) {
      this.rank = var1;
   }

   @Generated
   public void HICHHHOOCRROHCCCCOOHOCHHOIOHCR(boolean var1) {
      this.IOCIOIIOHHRIOOCIIRHHRICIROCICC = var1;
   }

   @Generated
   public void RHCRHHIIOHCIRCIIHCHCHRHRRHRHCC(boolean var1) {
      this.CRRCOCCCIRRROIRCIICORCIOHRCROH = var1;
   }

   @Generated
   public void HHIHIIOICHCCHIIRRCCRHHHOOCOOCO(boolean var1) {
      this.HOHIIIIIHHROICOIRHHHHICORHRRCI = var1;
   }

   @Generated
   public void HROICORRORCIOIHHOROICROHIOCHIO(String var1) {
      this.HCICRICIOIIOOCOIIRHORICIHHRCOR = var1;
   }
}
