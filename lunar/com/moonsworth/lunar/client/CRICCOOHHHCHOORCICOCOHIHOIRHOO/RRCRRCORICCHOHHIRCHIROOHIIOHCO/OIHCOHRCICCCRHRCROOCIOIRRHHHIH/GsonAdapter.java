package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.lunarclient.adventure.matcher.ComponentMatcher;
import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.transform.ComponentTransformer;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHRRHOHCRCHCCRRHOHHIRCCHOCICHC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIIIRHIHROIRCROHHROIHIIHRCRRHO;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IOCCCRIHOCHRCHRHCRHROIRIRHHHIR;
import com.moonsworth.lunar.client.util.OCIOROHIHRROROOIRRHRRCCHHRRRHI;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Pattern HHCHOICCIHIICRIRHRHHRHRIHCCHHH = Pattern.compile("^From .*: .*");
   private static final Pattern ROHCOCOROICOOOCOOHOIOIHHORRHHO = Pattern.compile("^You found .*in the well!");
   private static final Pattern IICORIHCCHORCHCIRHRHCHCOHRIHRH = Pattern.compile(".*\\[TEAM] .*: .*");
   private static final Pattern CCCRRIIIRROOOHIHOOIOHHIIHRCHHR = Pattern.compile(".*: .*");
   private static final int OHIHCCICHOOCCCRIOHRIRRCOIRIORH = 256 - "/achat ".length();
   private static final ImmutableList<String> CHHCHOCOROOHHRRRICCRHICOHICCOI = ImmutableList.of(
      "Winner #1 (",
      "Top Survivors",
      "Winners - ",
      "Winners: ",
      "Winner: ",
      "Winning Team: ",
      " won the game!",
      "Top Seeker: ",
      "Last team standing!",
      "1st Place: ",
      "1st Killer - ",
      "1st Place - ",
      new String[]{"Winner: ", " - Damage Dealt - ", "Damage Dealt: ", "Winning Team -", "1st - ", " Duel - ", "Most Wool Placed  -"}
   );
   private static final ComponentMatcher HIRRRCCRHHIRHHIOHOOIRRRHIHIHRO = ComponentPattern.regex("joined\\.$", NamedTextColor.YELLOW).toMatcher();
   private static final ComponentMatcher ORICRIRORRCHHHRRHOORHIRCICHCCO = ComponentPattern.regex("left\\.$", NamedTextColor.YELLOW).toMatcher();
   private final com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH OCHOOROCHHIHOHROIRHOROOCHICCRI = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.class
   );
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ROHRHOCOOHIIIHIIHRHCOOOCCRRORC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("autoFriend")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI CHICCHOOCRHHRIHOHRCICCOOOIHHII = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("autoGG")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI OOHIRHHHRCORHHCRIIOOHRICHICIRR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("antiGG")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCORHOIRRCRHRCCOICORIOOHORCOOO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("autoTip")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ROCORCHOROCCCRRICHICORCIHOOHRR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("autoWho")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI OHIOOOHIRRIRCIOOIRHIHCRORHHRCC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("levelHead")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final RIROICHCRROROHCCROOCCCCOCHCCRI<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> OIIRCCHHOHCHORCHHRIOIRROIRHCHO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "levelHeadSource", RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.NETWORK
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ICIIRHICOCRIIIIHCHIORRHRIIICIO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hypixelAutocomplete"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI IIOOOOCORRRHHCHCHCOOOIIHCIIIIC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "shortChannelNames"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ICOOOHHRHROCHOROOHOIRRHOIRRHOH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "removeGuildOnTab"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI CORIORRCOOHIHRHIICCRROHCCIHIIH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "removeLobbyStatuses"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI OHROOCHOHIORORCCORICCRHRCHHIHO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "removeGuildMotd"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI HOHOCHCHIIHOHOHIIRCICCRORHIROH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("levelAbove")
      .OHCRHRCHCRHHCCHIIIRHOOHORCOROC()
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HRCCRHRHHIRCRRCOROHOOHIIRORORH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR("levelColor")
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-171)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HIICCOCIRORHCOCHIIHCHCOROOORHC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR(
         "levelHeadNumberColor"
      )
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-11141121)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI CRCRCRCHIRCROHCORIHHRROOCRCCRI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "useBedwarsLevelsFormat"
      )
      .OHCRHRCHCRHHCCHIIIRHOOHORCOROC()
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI COCCIROIHOCOIOOIORROOCCCHRRCOR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("hideTeamChat")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI OHHCCCHICCCCOCRHHOIHRCOCCRRCIO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("hideGuildChat")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI OHHIRHRHCCCRIOIIOCIRCOOOROOOCH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("hidePartyChat")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIICCORHCCIIICRCOCCHRIORRRHOH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC("hideShout")
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI RIRIOOCICRRIHHOHIOICCCICIIRCOO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hideSpectatorChat"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI HHHIIOOCIRRIOCROHHCCIRRRRCICCH = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hideJoinMessages"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI CICHRHRIROOHHIIOOHCROOOCRCIHHR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hideLeaveMessages"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI CCHHHIHCCOORORRHCOHIIRRHROCRII = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hidePrivateMessages"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ICRICOIHOIHIOROOICHOHHHOIHIRHC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hideSoulWellAnnouncements"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI HRCOOIOCRCCRRORHRHOHCHOIOIRHOC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "hideMysteryBoxAnnouncements"
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final RHRRHOHCRCHCCRRHOHHIRCCHOCICHC RIHRRHHRIRHRROHCOICRRHCHROCCCR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRIIRCCHICHCORCCCHIHCCRRORIHCI("autoGGMessage")
      .ORIOHRCIHRCOOHICCCRIIIHCRHHIHI("gg")
      .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1 -> this.RIHRRHHRIRHRROHCOICRRHCHROCCCR.get().length() > OHIHCCICHOOCCCRIOHRIRRCOIRIORH
               && !RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.CORCOCICIRIOHROHROIIOOHICCHCRR(var1)
            ? null
            : var1
      )
      .RIIHIHHCRHCHRCICHOROHCHIIHCICH(var1 -> {
         if (var1.isEmpty()) {
            this.RIHRRHHRIRHRROHCOICRRHCHROCCCR.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH("gg");
         }
      })
      .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1 -> this.RIHRRHHRIRHRROHCOICRRHCHROCCCR.get().length() > OHIHCCICHOOCCCRIOHRIRRCOIRIORH
               && !RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.CORCOCICIRIOHROHROIIOOHICCHCRR(var1)
            ? null
            : var1
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   private final Map<UUID, String> CRCCHRRCCRRIHHHHRRICHHHIIHRIRI = new ConcurrentHashMap<>();
   private final Map<String, UUID> CRCCHHIHHICHHCIHICOHCHHIIORRIC = new ConcurrentHashMap<>();
   private final Set<UUID> IHHIICICCCROHRORHCCOIIROOCCHCI = Sets.newSetFromMap(new ConcurrentHashMap());
   private final JsonParser ICRRRHCRICRICHRCHIOIOOCCICOHIC = new JsonParser();
   private static final Splitter IICRIIRIOHROCCCROIHIICCIIHOHRR = Splitter.on(' ').trimResults().omitEmptyStrings();
   private static final String IHICIRRCHRRRHOOCIICIRCOHIRICRH = "--------------  Guild: Message Of The Day  --------------";
   private static final String IRCORHRHCCIOICCCOIIICCRIHIHCCI = "-------------------------------------------";
   private static final String OHOCIHIOOCOCHORCHHHICHROCRIOCR = "lunar:data/hypixel/autocomplete.json";
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCHIRCCCORRCROOCOHHRHROIIIHCO = null;
   private long CIOIOHHHIRIHIOORCCRICCRHOROORI;
   private long RCIOOHHIOORCOHCCRRIOOCIRHHCHIO;
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH HCHRRIOHRHOOHOHCCRIICCHCRHIHII;
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC OCORHHHRHRIORRCHCOCCIHHOORRCHO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
      "lunar:hypixel/bedwars_levels_format.json"
   );
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO IICCCOIHHROORCCIHORHIORIRROHRC = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   private long RHORHICIHIIRHCICHICIRHIRCIHICR = 0L;
   private int IIHHCHOCIHICICOICCICHOIHRIROOH = -1;
   private boolean OIOCHRIOCRRRCOIICORRICHIROIROH = false;
   private final ComponentTransformer HOORIICORRIIRCIIOOHROOIHOCICIH = ComponentTransformer.replaceRegex("^Party", "P");
   private final ComponentTransformer HCROCHOOICHHCRROCORCROCICRCORC = ComponentTransformer.replaceRegex("^Guild >", "G >");
   private final ComponentTransformer COIRCCOCRHRRCHIHCIIIRHCORCIRIO = ComponentTransformer.replaceRegex("^Friend >", "F >");
   private final ComponentTransformer RICRCRCIHRRHRHRCHROHCCOCOCIRRO = ComponentTransformer.replaceRegex("^Officer >", "O >");

   private void CIHCIIOHCCHHROCORHCIOHRCOCHOIC() {
      Gson var1 = new Gson();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = this.mc
         .bridge$getResourceManager()
         .bridge$getResource(OCORHHHRHRIORRCHCOCCIHHOORRCHO);
      if (var2 == null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Could not find bedwars levels format json file: " + OCORHHHRHRIORRCHCOCCIHHOORRCHO
         );
      } else {
         InputStream var3 = var2.bridge$getInputStream();
         JsonReader var4 = new JsonReader(new InputStreamReader(var3));
         this.HCHRRIOHRHOOHOHCCRIICCHCRHIHII = var1.fromJson(var4, HHCCIRHCCCIIRHCROHIORHIRHHIORH.class);
      }
   }

   private String ROCRHIOCHIIOCROIHHOHHROCHCIHCH(int var1) {
      int var2 = Math.min(var1 / 100, this.HCHRRIOHRHOOHOHCCRIICCHCRHIHII.OHIIORHIRRCORIOROIIROORHRRHCCI().size() - 1);
      HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.HCHRRIOHRHOOHOHCCRIICCHCRHIHII.OHIIORHIRRCORIOROIIROORHRRHCCI().get(var2);
      String var4 = var3.ICOIRCCIHRIIOICHHCOOROICRIOIHC();
      String var5 = String.valueOf(var1);
      StringBuilder var6 = new StringBuilder();
      var6.append(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getByCode(var4.charAt(0)))
         .append('[');

      for (int var7 = 0; var7 < var5.length(); var7++) {
         var6.append(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getByCode(
                  var4.charAt(Math.min(var7 + 1, 4))
               )
            )
            .append(var5.charAt(var7));
      }

      var6.append(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getByCode(var4.charAt(5)))
         .append(var3.getSymbol());
      var6.append(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getByCode(var4.charAt(6)))
         .append(']');
      return var6.toString();
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      super(true);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IHHOCHOCHOCCHIIICRHRRROICHHIIC,
         var0 -> var0.RIORIRIHOIRCIROHCRHHCHIHIRHRIH()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL)
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         this::CRRRICCRROCOHHOHIICIHORCOORRRH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         this::CORCOCICIRIOHROHROIIOOHICCHCRR
      );
      this.handle(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class, this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
      this.handle(IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.handle(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
         this::RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
      );
      this.CIOIOHHHIRIHIOORCCRICCRHOROORI = 0L;
      this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO.IIOCHOIICCIORCOROIROHICCHIOHIC(var1 -> {
         this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI.clear();
         this.CRCCHHIHHICHHCIHICOHCHHIIORRIC.clear();
         this.IHHIICICCCROHRORHCCOIIROOCCHCI.clear();
      });
      this.CRCRCRCHIRCROHCORIHHRROOCRCCRI.IIOCHOIICCIORCOROIROHICCHIOHIC(var1 -> {
         this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI.clear();
         this.CRCCHHIHHICHHCIHICOHCHHIIORRIC.clear();
         this.IHHIICICCCROHRORHCCOIIROOCCHCI.clear();
      });
      this.CIHCIIOHCCHHROCORHCIOHRCOCHOIC();
   }

   @Override
   public String getId() {
      return "HYPIXEL_MOD";
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI var1
   ) {
      this.RHORHICIHIIRHCICHICIRHIRCIHICR++;
      this.RHORHICIHIIRHCICHICIRHIRCIHICR %= 4L;
      if (this.RHORHICIHIIRHCICHICIRHIRCIHICR == 0L) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
            && this.mc.bridge$getSession() != null
            && this.mc.bridge$getSession().bridge$isValidSession()) {
            String var2 = OCIOROHIHRROROOIRRHRRCCHHRRRHI.CCHHHHCICRCCCIOOIOICOOCRCRHCCR(this.mc.bridge$getSession().bridge$getPlayerID());
            if (this.isEnabled() && this.OHIOOOHIRRIRCIOOIRHIHCRORHHRCC.get() && !this.IHHIICICCCROHRORHCCOIIROOCCHCI.isEmpty()) {
               ImmutableSet var3 = ImmutableSet.copyOf(this.IHHIICICCCROHRORHCCOIIROOCCHCI);
               this.IHHIICICCCROHRORHCCOIIROOCCHCI.clear();
               StringBuilder var4 = new StringBuilder("?");

               for (UUID var6 : var3) {
                  var4.append("uuid=").append(var6).append('&');
               }

               var4.append("gameMode=")
                  .append(IOCCCRIHOCHRCHRHCRHROIRIRHHHIR.getServer() == null ? "unknown" : URLEncoder.encode(IOCCCRIHOCHRCHRHCRHROIRIRHHHIR.getServer()))
                  .append('&');
               var4.append("sourceUuid=").append(var2).append('&');
               var4.append("commit=")
                  .append(com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCICHOOCICHRIIIHHROHCRHHROOHIO)
                  .append("&");
               var4.append("level=").append(this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO.get().getQueryParam()).append("&");
               var4.setLength(var4.length() - 1);
               String var8 = com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI.RCOCHHICCIRHIRORROCIRHRIHOIHIC();
               URI var9 = URI.create(var8 + "/hypixel/levelhead" + var4);
               Builder var7 = HttpRequest.newBuilder()
                  .header(
                     "User-Agent",
                     "LunarClient/" + com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOCRRHCRORRCCCIRHOIORIHRIIHOOC
                  )
                  .header(
                     "X-Hypixel-Gamemode",
                     IOCCCRIHOCHRCHRHCRHROIRIRHHHIR.getServer() == null ? "unknown" : URLEncoder.encode(IOCCCRIHOCHRCHRHCRHROIRIRHHHIR.getServer())
                  )
                  .header("X-SourceUuid", var2)
                  .header(
                     "X-LC-Commit", com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCICHOOCICHRIIIHHROHCRHHROOHIO
                  )
                  .uri(var9)
                  .GET();
               HttpClient.newBuilder()
                  .build()
                  .sendAsync(var7.build(), BodyHandlers.ofString())
                  .thenAccept(
                     var2x -> {
                        JsonObject var3x = null;
                        if (var2x != null) {
                           String var4x = var2x.body();
                           if (var4x != null) {
                              try {
                                 var3x = this.ICRRRHCRICRICHRCHIOIOOCCICOHIC.parse(var4x).getAsJsonObject();
                              } catch (JsonParseException var10) {
                              }

                              if (var3x != null) {
                                 for (UUID var6x : var3) {
                                    String var7x = var6x.toString();
                                    if (var3x.has(var7x)) {
                                       JsonElement var8x = var3x.get(var7x);
                                       if (!var8x.isJsonNull()) {
                                          String var9x;
                                          if (this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO.get() == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BEDWARS
                                             && this.CRCRCRCHIRCROHCORIHHRROOCRCCRI.get()) {
                                             var9x = this.ROCRHIOCHIIOCROIHHOHHROCHCIHCH(var8x.getAsInt());
                                          } else {
                                             var9x = String.valueOf(var8x.getAsInt());
                                          }

                                          this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI.put(var6x, var9x);
                                          continue;
                                       }
                                    }

                                    this.CRCCHHIHHICHHCIHICOHCHHIIORRIC.values().removeIf(var1xx -> var1xx.equals(var6x));
                                 }
                              }
                           }
                        }
                     }
                  );
            }
         }
      }
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      this.CRCCHHIHHICHHCIHICOHCHHIIORRIC.clear();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var1) {
      if (var1.CCCHCRRRIRRHICOOIOCHCHRCRICHOC() instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2
         )
       {
         if (this.OHIOOOHIRRIRCIOOIRHIHCRORHHRCC.get()) {
            UUID var10 = var2.bridge$getUniqueID();
            if (!IIIIRHIHROIRCROHHROIHIIHRCRRHO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, true)) {
               Component var4 = var2.bridge$getCustomName();
               if (var4 == null || !var4.hasDecoration(TextDecoration.OBFUSCATED)) {
                  if (this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI.containsKey(var10)) {
                     String var11 = this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI.get(var2.bridge$getUniqueID());
                     if (!var11.isEmpty() && !var1.isCancelled()) {
                        int var12 = OCOHORHCROHICRRIHCIHHRRCIHICRI.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                           this.HRCCRHRHHIRCRRCOROHOOHIIRORORH.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F), 0.8745098F
                        );
                        int var7 = OCOHORHCROHICRRIHCIHHRRCIHICRI.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                           this.HIICCOCIRORHCOCHIIHCHCOROOORHC.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F), 0.8745098F
                        );
                        String var8 = this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO.get().getNametagPrefix();
                        TextComponent var9 = (TextComponent)Component.text(var8, TextColor.color(var12)).append(Component.text(var11, TextColor.color(var7)));
                        if (this.HOHOCHCHIIHOHOHIIRCICCRORHIROH.get()) {
                           var1.getLines().add(var9);
                        } else {
                           var1.getLines().add(0, var9);
                        }
                     }
                  } else {
                     if (var10.version() == 1) {
                        int var5 = this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO.get().generateRandomLevelForNicked(var10);
                        String var6;
                        if (this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO.get() == RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BEDWARS && this.CRCRCRCHIRCROHCORIHHRROOCRCCRI.get()) {
                           var6 = this.ROCRHIOCHIIOCROIHHOHHROCHCIHCH(var5);
                        } else {
                           var6 = String.valueOf(var5);
                        }

                        this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI.put(var10, var6);
                     } else {
                        if (this.CRCCHHIHHICHHCIHICOHCHHIIORRIC.containsKey(var2.bridge$getName())) {
                           return;
                        }

                        this.CRCCHHIHHICHHCIHICOHCHHIIORRIC.put(var2.bridge$getName(), var10);
                        this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI.put(var10, "");
                        this.IHHIICICCCROHRORHCCOIIROOCCHCI.add(var10);
                     }
                  }
               }
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      if (this.ICIIRHICOCRIIIIHCHIORRHRIIICIO.get()) {
         if (var1.OHIHHORORHROIOICRRCCROHHCIOCIO().startsWith("/")) {
            this.HRHRIRICROCCRICOHHCHOCHHOHICIH();
            String var2 = var1.OHIHHORORHROIOICRRCCROHHCIOCIO().substring(1).toLowerCase(Locale.ROOT);
            ArrayList var3 = new ArrayList(IICRIIRIOHROCCCROIHIICCIIHOHRR.splitToList(var2));
            if (var1.OHIHHORORHROIOICRRCCROHHCIOCIO().endsWith(" ")) {
               var3.add("");
            }

            if (!var3.isEmpty()) {
               this.OCHOOROCHHIHOHROIRHOROOCHICCRI
                  .HRCOOHCRCHOCHOIHIHHHCRHOCCOHRR()
                  .map(
                     com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH::IOICCIIRHOOCCHIOOCRRHRCROOHCCC
                  )
                  .ifPresent(
                     var4 -> {
                        int var5 = 0;
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = this.HHCHIRCCCORRCROOCOHHRHROIIIHCO;

                        while (var3.size() > var5) {
                           String var7 = (String)var3.get(var5);
                           if (var5 == var3.size() - 1) {
                              ArrayList var8 = new ArrayList();

                              for (String var10 : var6.IOICCORIRIHIHOCRORIIIRRIOCCRIO().keySet()) {
                                 if (var10.startsWith(var7)) {
                                    if (var5 == 0) {
                                       var8.add("/" + var10);
                                    } else {
                                       var8.add(var10);
                                    }
                                 }
                              }

                              for (String var12 : var6.getValues()) {
                                 if (var12.equals("%PARTY%")) {
                                    for (String var23 : var4) {
                                       if (var23.toLowerCase(Locale.ROOT).startsWith(var7)) {
                                          var8.add(var23);
                                       }
                                    }

                                    String var21 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName();
                                    if (var21.toLowerCase(Locale.ROOT).startsWith(var7) && !var8.contains(var21)) {
                                       var8.add(var21);
                                    }
                                 } else if (!var12.equals("%PLAYERS%")) {
                                    if (var12.startsWith(var7)) {
                                       if (var5 == 0) {
                                          var8.add("/" + var12);
                                       } else {
                                          var8.add(var12);
                                       }
                                    }
                                 } else {
                                    for (String var14 : var4) {
                                       if (var14.toLowerCase(Locale.ROOT).startsWith(var7)) {
                                          var8.add(var14);
                                       }
                                    }

                                    for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var22 : this.mc
                                       .bridge$getClientPacketListener()
                                       .bridge$getPlayerInfoMap()) {
                                       String var15 = var22.bridge$getGameProfile().getName();
                                       if (var15.toLowerCase(Locale.ROOT).startsWith(var7)) {
                                          var8.add(var15);
                                       }
                                    }
                                 }
                              }

                              if (var8.size() == 1) {
                                 String var17 = (String)var8.get(0);
                                 if (("/" + var2).endsWith(var17)) {
                                    var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(new String[0]);
                                    return;
                                 }
                              }

                              if (!var8.isEmpty()) {
                                 var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var8.toArray(new String[0]));
                              }

                              return;
                           }

                           var6 = var6.IOICCORIRIHIHOCRORIIIRRIOCCRIO().get(var7);
                           if (var6 == null) {
                              return;
                           }

                           var5++;
                        }
                     }
                  );
            }
         }
      }
   }

   private void HRHRIRICROCCRICOHHCHOCHHOHICIH() {
      if (this.HHCHIRCCCORRCROOCOHHRHROIIIHCO == null) {
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var1 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar:data/hypixel/autocomplete.json");
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO()
            .bridge$getResourceManager()
            .bridge$getResource(var1);
         if (var2 == null) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Couldn't find the autocomplete json file: lunar:data/hypixel/autocomplete.json"
            );
            this.HHCHIRCCCORRCROOCOHHRHROIIIHCO = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new String[0], new HashMap<>());
         } else {
            try (InputStreamReader var3 = new InputStreamReader(var2.bridge$getInputStream())) {
               this.HHCHIRCCCORRCROOCOHHRHROIIIHCO = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
                  .fromJson(var3, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class);
            } catch (Exception var8) {
               var8.printStackTrace();
               this.HHCHIRCCCORRCROOCOHHRHROIIIHCO = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new String[0], new HashMap<>());
            }
         }
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(
         this.ICOOOHHRHROCHOROOHOIRRHOIRRHOH,
         this.OHROOCHOHIORORCCORICCRHRCHHIHO,
         this.IIOOOOCORRRHHCHCHCOOOIIHCIIIIC,
         this.ROHRHOCOOHIIIHIIHRHCOOOCCRRORC,
         this.RCORHOIRRCRHRCCOICORIOOHORCOOO
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.CHICCHOOCRHHRIHOHRCICCOOOIHHII, var1x -> var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(this.RIHRRHHRIRHRROHCOICRRHCHROCCCR)
      );
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(this.OOHIRHHHRCORHHCRIIOOHRICHICIRR, this.ROCORCHOROCCCRRICHICORCIHOOHRR, this.OHIOOOHIRRIRCIOOIRHIHCRORHHRCC);
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(this.ICIIRHICOCRIIIIHCHIORRHRIIICIO).HHRIICOIOORCHCOIICOOIHIRHHICRI(1);
      var1.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
            "levelHeadOptions",
            var1x -> {
               var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO,
                  this.HRCCRHRHHIRCRRCOROHOOHIIRORORH,
                  this.HIICCOCIRORHCOCHIIHCHCOROOORHC,
                  this.HOHOCHCHIIHOHOHIIRCICCRORHIROH
               );
               var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(this.CRCRCRCHIRCROHCORIHHRROOCRCCRI)
                  .IIHRRHORCRCROCHHOHORCHCROCIHRO(() -> this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO.get() != RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BEDWARS);
            }
         )
         .CIOHHCORHRCCRICCCORIHCRHCCCRRR(() -> !this.OHIOOOHIRRIRCIOOIRHIHCRORHHRCC.get());
      var1.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         "chatOptions",
         var1x -> var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(
            this.CCHHHIHCCOORORRHCOHIIRRHROCRII,
            this.COCCIROIHOCOIOOIORROOCCCHRRCOR,
            this.OHHIRHRHCCCRIOIIOCIRCOOOROOOCH,
            this.OHHCCCHICCCCOCRHHOIHRCOCCRRCIO,
            this.RCIICCORHCCIIICRCOCCHRIORRRHOH,
            this.RIRIOOCICRRIHHOHIOICCCICIIRCOO,
            this.CORIORRCOOHIHRHIICCRROHCCIHIIH,
            this.HHHIIOOCIRRIOCROHHCCIRRRRCICCH,
            this.CICHRHRIROOHHIIOOHCROOOCRCIHHR,
            this.ICRICOIHOIHIOROOICHOHHHOIHIRHC,
            this.HRCOOIOCRCCRRORHRHOHCHOIOIRHOC
         )
      );
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCOCHOCIRORHHORHCROHOIOCRCHIO
         )
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR("Cow (Autocomplete)")
         .HRCHROOHRIHCRCRHRIIROCIRHOIRHH("AutoGG", "Auto GG", "Level Head")
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      if (this.mc.bridge$getPlayer() != null) {
         if (this.RCORHOIRRCRHRCCOICORIOOHORCOOO.get()) {
            com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = var1.HRRHORHIOHORCHHCRIOCRRCIRIRIOO();
            if (var2 != null
               && (
                  var2.CHCCORCICOHOCHICRHIRORIORHOICC == null
                     || !var2.HRCOCIRHOIRHCHRCOHHIROHIORRRIH.equals("SKYBLOCK")
                     || !var2.CHCCORCICOHOCHICRHIRORIORHOICC.equals("Dungeon")
               )) {
               this.mc.bridge$getPlayer().bridge$sendCommand("/tip all");
            }
         }

         if (this.ROCORCHOROCCCRRICHICORCIHOOHRR.get()) {
            this.mc.bridge$getPlayer().bridge$sendCommand("/who");
            this.OIOCHRIOCRRRCOIICORRICHIROIROH = true;
         }
      }
   }

   private void CORCOCICIRIOHROHROIIOOHICCHCRR(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      Component var2 = var1.OIOORCCOCHRRIRRORRICOCOCROICII();
      if (this.IIHHCHOCIHICICOICCICHOIHRIROOH >= 0) {
         this.IIHHCHOCIHICICOICCICHOIHRIROOH++;
         if (this.IIHHCHOCIHICICOICCICHOIHRIROOH != 1
            && (
               this.IIHHCHOCIHICICOICCICHOIHRIROOH >= 6
                  || var2.color() != null
                     && var2.color().value() == NamedTextColor.AQUA.value()
                     && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var2)
                        .startsWith("-------------------------------------------")
            )) {
            this.IIHHCHOCIHICICOICCICHOIHRIROOH = -1;
         }

         var1.setCancelled(true);
      } else {
         String var3 = var1.OCOCIORRCHHHHHHHOOIHRRHOIHICRH();
         if (this.ROCORCHOROCCCRRICHICORCIHOOHRR.get()) {
            if (var3.equalsIgnoreCase("Cages opened! FIGHT!")) {
               this.mc.bridge$getPlayer().bridge$sendCommand("/who");
               this.OIOCHRIOCRRRCOIICORRICHIROIROH = true;
            } else if (this.OIOCHRIOCRRRCOIICORRICHIROIROH) {
               if (var3.equalsIgnoreCase("This command is not available on this server!") || var3.equalsIgnoreCase("Game hasn't started yet!")) {
                  var1.setCancelled(true);
                  this.OIOCHRIOCRRRCOIICORRICHIROIROH = false;
               } else if (var3.startsWith("Mode: ") || var3.startsWith("ONLINE: ")) {
                  this.OIOCHRIOCRRRCOIICORRICHIROIROH = false;
               }
            }
         }

         if (this.RCORHOIRRCRHRCCOICORIOOHORCOOO.get()
            && var3.equalsIgnoreCase("You already tipped everyone that has boosters active, so there isn't anybody to be tipped right now!")) {
            var1.setCancelled(true);
         } else {
            if (this.OOHIRHHHRCORHHCRIIOOHRICHICIRR.get()) {
               String var4 = var3.toLowerCase(Locale.ROOT);
               String var5 = this.RIHRRHHRIRHRROHCOICRRHCHROCCCR.get();
               if (var4.endsWith("gg") || var4.endsWith("good game") || !var5.isEmpty() && var4.endsWith(var5)) {
                  var1.setCancelled(true);
               }
            }

            if (this.CHICCHOOCRHHRIHOHRCICCOOOIHHII.get()) {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() - this.CIOIOHHHIRIHIOORCCRICCRHOROORI
                  <= TimeUnit.SECONDS.toMillis(2L)) {
                  return;
               }

               if (var3.startsWith(" ") && !var3.startsWith(" + ") && !this.RIHRRHHRIRHRROHCOICRRHCHROCCCR.get().isEmpty()) {
                  UnmodifiableIterator var9 = CHHCHOCOROOHHRRRICCRHICOHICCOI.iterator();

                  while (var9.hasNext()) {
                     String var11 = (String)var9.next();
                     if (var3.contains(var11)) {
                        this.mc.bridge$getPlayer().bridge$sendCommand("/achat " + this.RIHRRHHRIRHRROHCOICRRHCHROCCCR.get());
                        this.CIOIOHHHIRIHIOORCCRICCRHOROORI = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
                        break;
                     }
                  }
               }
            }

            if (this.ROHRHOCOOHIIIHIIHRHCOOOCCRRORC.get() && !var3.contains(":") && var3.contains("Friend request from")) {
               for (String var7 : var3.split("\n")) {
                  if (var7.contains("Friend request from ")) {
                     String var8 = var7.replace("Friend request from ", "");
                     var8 = var8.split(" ")[var8.split(" ").length - 1];
                     this.mc.bridge$getPlayer().bridge$sendCommand("/friend accept " + var8);
                     break;
                  }
               }
            }

            if (!var1.isCancelled()) {
               if (this.CORIORRCOOHIHRHIICCRROHCCIHIIH.get()
                  && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.containsColoredText(
                     var2, NamedTextColor.GOLD, "joined the lobby!", "spooked into the lobby!"
                  )) {
                  var1.setCancelled(true);
               } else if (this.HHHIIOOCIRRIOCROHHCCIRRRRCICCH.get() && HIRRRCCRHHIRHHIOHOOIRRRHIHIHRO.matches(var2)) {
                  var1.setCancelled(true);
               } else if (this.CICHRHRIROOHHIIOOHCROOOCRCIHHR.get() && ORICRIRORRCHHHRRHOORHIRCICHCCO.matches(var2)) {
                  var1.setCancelled(true);
               } else if (this.CCHHHIHCCOORORRHCOHIIRRHROCRII.get() && HHCHOICCIHIICRIRHRHHRHRIHCCHHH.matcher(var3).matches()) {
                  var1.setCancelled(true);
               } else if (this.RCIICCORHCCIIICRCOCCHRIORRRHOH.get()
                  && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.startsWith(
                     var2, "[SHOUT]", NamedTextColor.GOLD
                  )) {
                  var1.setCancelled(true);
               } else if (this.RIRIOOCICRRIHHOHIOICCCICIIRCOO.get()
                  && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.startsWith(
                     var2, "[SPECTATOR]", NamedTextColor.GRAY
                  )) {
                  var1.setCancelled(true);
               } else if (this.ICRICOIHOIHIOROOICHOHHHOIHIRHC.get() && ROHCOCOROICOOOCOOHOIOIHHORRHHO.matcher(var3).matches()) {
                  var1.setCancelled(true);
               } else if (this.HRCOOIOCRCCRRORHRHOHCHOIOIRHOC.get()
                     & com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.startsWith(var2, "✦")
                  && var3.contains("Mystery Box")) {
                  var1.setCancelled(true);
               } else if (this.COCCIROIHOCOIOOIORROOCCCHRRCOR.get()) {
                  if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .CCIRRROHCHHIRRIRHHRIROICHCCCHO()
                     .COIRCHHOHRHRICOIRIHRIIHRCCRIOO()) {
                     if (CCCRRIIIRROOOHIHOOIOHHIIHRCHHR.matcher(var3).matches()) {
                        var1.setCancelled(true);
                     }
                  } else if (IICORIHCCHORCHCIRHRHCHCOHRIHRH.matcher(var3).matches()) {
                     var1.setCancelled(true);
                  }
               }

               if (!var1.isCancelled()
                  && this.OHROOCHOHIORORCCORICCRHRCHHIHO.get()
                  && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() - this.RCIOOHHIOORCOHCCRRIOOCIRHHCHIO < 3000L
                  && var2.color() != null
                  && var2.color().value() == NamedTextColor.AQUA.value()
                  && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var2)
                     .equals("--------------  Guild: Message Of The Day  --------------")) {
                  this.IIHHCHOCIHICICOICCICHOIHRIROOH = 0;
                  var1.setCancelled(true);
               } else {
                  if (!var1.isCancelled()) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
                  }
               }
            }
         }
      }
   }

   @Override
   public void COIHORRCHRRCHOCIRHHRRIOIHRIHCC(boolean var1) {
      if (var1) {
         this.RCIOOHHIOORCOHCCRRIOOCIRHHCHIO = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
      }
   }

   public boolean HCCOCCCOHOOIHRCCIIRCCIHHIIIHOO() {
      return this.isEnabled()
         && this.ICOOOHHRHROCHOROOHOIRRHOIRRHOH.get()
         && com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHHHHCRRIRRCHHICHOHHIRCIOORRH
            .RRRCHORHHHIHOCIOCRICCOIOOHHCOO()
            .CHICHOOHORHIRICCCRHCHCIOHOCHHI();
   }

   public String HOORIORICHOORIIRRRCOHCIRIICOCI(String var1) {
      return var1.endsWith("]") && this.HCCOCCCOHOOIHRCCIIRCCIHHIIIHOO() ? var1.substring(0, var1.lastIndexOf(91)) : var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, Component var2
   ) {
      if (var1.endsWith("]") && this.HCCOCCCOHOOIHRCCIIRCCIHHIIIHOO()) {
         String var3 = var1.substring(var1.lastIndexOf(91));
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(
            ComponentTransformer.replaceLiteral(var3, "").transform(var2)
         );
      } else {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var2);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2
   ) {
      ComponentTransformer var3 = null;
      if (var2.startsWith("Party > ")) {
         if (this.OHHIRHRHCCCRIOIIOCIRCOOOROOOCH.get()) {
            var1.setCancelled(true);
         } else if (this.IIOOOOCORRRHHCHCHCOOOIIHCIIIIC.get()) {
            var3 = this.HOORIICORRIIRCIIOOHROOIHOCICIH;
         }
      } else if (var2.startsWith("Guild > ")) {
         if (this.OHHCCCHICCCCOCRHHOIHRCOCCRRCIO.get()) {
            var1.setCancelled(true);
         } else if (this.IIOOOOCORRRHHCHCHCOOOIIHCIIIIC.get()) {
            var3 = this.HCROCHOOICHHCRROCORCROCICRCORC;
         }
      } else if (this.IIOOOOCORRRHHCHCHCOOOIIHCIIIIC.get()) {
         if (var2.startsWith("Friend > ")) {
            var3 = this.COIRCCOCRHRRCHIHCIIIRHCORCIRIO;
         } else if (var2.startsWith("Officer > ")) {
            var3 = this.RICRCRCIHRRHRHRCHROHCCOCOCIRRO;
         }
      }

      if (var3 != null) {
         var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3.transform(var1.OIOORCCOCHRRIRRORRICOCOCROICII()));
      }
   }

   @Override
   protected List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CICCRRIHRRIOIRCCIOOOCROCORIRHI() {
      return List.of(this.IICCCOIHHROORCCIHORHIORIRROHRC);
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IRRRORCRRIIOROCCCOOIIOHRHRCHHR() {
      return this.ROHRHOCOOHIIIHIIHRHCOOOCCRRORC;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IORIICIOOIOOROORHROIIHCHCHHCOO() {
      return this.CHICCHOOCRHHRIHOHRCICCOOOIHHII;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IRIIIIHCICCCROHCIRRIIRRROOIOCH() {
      return this.OOHIRHHHRCORHHCRIIOOHRICHICIRR;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HOOOIRCCOIRIHCHOIHHOIIOIIHCIRR() {
      return this.RCORHOIRRCRHRCCOICORIOOHORCOOO;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HRRIROORCROIOOCHHCIHRIHCIOOCCC() {
      return this.ROCORCHOROCCCRRICHICORCIHOOHRR;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI RICHORHCIIIHIHCRIOOHRROIHHIIIR() {
      return this.OHIOOOHIRRIRCIOOIRHIHCRORHHRCC;
   }

   @Generated
   public RIROICHCRROROHCCROOCCCCOCHCCRI<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> OIIHHICRRCROCRHROOORRCRICIHCRO() {
      return this.OIIRCCHHOHCHORCHHRIOIRROIRHCHO;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HHIRHRCIRCRIHIOHRRRORORORRHROO() {
      return this.ICIIRHICOCRIIIIHCHIORRHRIIICIO;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI ICRIHOHIHIRORRORCIRIROOHRCHOII() {
      return this.IIOOOOCORRRHHCHCHCOOOIIHCIIIIC;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HIRORHCOCCCCOOCRRROOHHOCIIIROR() {
      return this.ICOOOHHRHROCHOROOHOIRRHOIRRHOH;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HHRICRICCRCIRORICIHORCIIOHHHCR() {
      return this.CORIORRCOOHIHRHIICCRROHCCIHIIH;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HOIHIRRRIHOIIOOHHOOOCOROCIICOH() {
      return this.OHROOCHOHIORORCCORICCRHRCHHIHO;
   }

   @Generated
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI OORCCIICRORIHIIIHHORCORRCRRROO() {
      return this.HRCCRHRHHIRCRRCOROHOOHIIRORORH;
   }

   @Generated
   public OHHRIOHROOIHOROCIRHCHORIHRRRRI IHHCCROCHIRCHROCIRCHCHIOOHOIRH() {
      return this.HIICCOCIRORHCOCHIIHCHCOROOORHC;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HCHOIHRHIIOCCCHCCHROOCHOCHHHOO() {
      return this.CRCRCRCHIRCROHCORIHHRROOCRCCRI;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HHHCIIIHHORHIHRIORHHHORRROIROC() {
      return this.COCCIROIHOCOIOOIORROOCCCHRRCOR;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IIRCOHORRIIHIRIRIIOIIROIHIRORO() {
      return this.OHHCCCHICCCCOCRHHOIHRCOCCRRCIO;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI RROCRORCHOROHCHRCIIICRICCRIOIO() {
      return this.OHHIRHRHCCCRIOIIOCIRCOOOROOOCH;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IHRRIIRHRIHIRIRHRRCOHCHRHCHICC() {
      return this.RCIICCORHCCIIICRCOCCHRIORRRHOH;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI OCHOIRRRRCRIIOCHCIHROOHROICOCR() {
      return this.RIRIOOCICRRIHHOHIOICCCICIIRCOO;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI OORIHORIIHCIICOCIHRRIHIHCCOHIR() {
      return this.HHHIIOOCIRRIOCROHHCCIRRRRCICCH;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI ORIRRIICHHHIOORHCCIIICCHOCRCIC() {
      return this.CICHRHRIROOHHIIOOHCROOOCRCIHHR;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI IIIHROCHCCHICCIHROIOHHRHROCRHO() {
      return this.CCHHHIHCCOORORRHCOHIIRRHROCRII;
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI HOOHIRORRHHOCOOHORRRRHRCOOOHOO() {
      return this.ICRICOIHOIHIOROOICHOHHHOIHIRHC;
   }

   @Generated
   public Map<UUID, String> RHRHCCIOIOOOOCCOICORIORHCIHRCO() {
      return this.CRCCHRRCCRRIHHHHRRICHHHIIHRIRI;
   }

   @Generated
   public Set<UUID> OOICRCRHHROCHHOORHRRCOCRICRRHC() {
      return this.IHHIICICCCROHRORHCCOIIROOCCHCI;
   }

   @Generated
   public long RHRIHIHOORIIIIICRHCHIOIIROIHOR() {
      return this.CIOIOHHHIRIHIOORCCRICCRHOROORI;
   }
}
