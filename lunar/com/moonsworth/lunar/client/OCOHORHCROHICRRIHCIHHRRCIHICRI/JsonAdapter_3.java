package com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.lunarclient.common.v1.InboundHostedWorld;
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundSinglePlayer;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.friend.v1.BroadcastLocationChangeRequest;
import com.lunarclient.websocket.hostedworld.v1.AddressAndPort;
import com.lunarclient.websocket.hostedworld.v1.Heartbeat;
import com.lunarclient.websocket.hostedworld.v1.HostedWorldHeartbeatRequest;
import com.lunarclient.websocket.hostedworld.v1.HostedWorldHeartbeatResponse;
import com.lunarclient.websocket.hostedworld.v1.HostedWorldStatusPush;
import com.lunarclient.websocket.hostedworld.v1.JoinSource;
import com.lunarclient.websocket.hostedworld.v1.ListHostedWorldsResponse;
import com.lunarclient.websocket.hostedworld.v1.LoginResponse;
import com.lunarclient.websocket.hostedworld.v1.StartHostingWorldRequest;
import com.lunarclient.websocket.hostedworld.v1.StartHostingWorldResponse;
import com.lunarclient.websocket.hostedworld.v1.StopHostingWorldRequest;
import com.lunarclient.websocket.hostedworld.v1.StopHostingWorldResponse;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI,
   com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH HOCHHRIOHRRRRHHOROIOHOHHCCHIHI = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private static final int IOROCHHORORCHCHCIICRCRRCHOCHCH = 30000;
   private com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCICIOOOHOCCORRRCOOCHICIRHOCHC;
   private Thread OHRHOCORCOICIOIOCCCOOIRHCRRIOO;
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO COIOIOCIRHROOHROCOCIHRORHCOOHO;
   private File CCOOCICOOOCOICIIHRIIOIROCHHIOH;
   private final Set<com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH> ICCRCOHHIHCRIOCRHHRCROICORRHHR = new HashSet<>();
   private Set<UUID> CIRRICRRRIROIHOOOIIOOCIHHOHORO = new HashSet<>();
   private Set<String> OCHOCOOCROIICOIIHIHHHCICCHIICO = new HashSet<>();
   private boolean OORIHCIIRICOCHRIRHHRHRIHHCHIIO = true;
   private boolean RIIROCCHOCICCICOHIOCRIIORCRRRC = true;
   private int RRRHROHCCCHCORHRHOCHCICCHHCORR = 12;
   private HostedWorldStatusPush ICIRHOCHOORIOHHHIOHOIRORCICRCR = null;
   private com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH OCIIORIOOHIHICOOOHRROHRORRIOIC = null;
   private UUID OIHRIOIOCHCIHORHCIICCHORROCOIH = null;
   private List<ListHostedWorldsResponse.HostedWorld> RORCHHRHRRCCHIRCOIIIOOHROCCOIO = new ArrayList<>();
   private boolean CRIOHIICICHCHIOCCRHHHIRIORCCHC = false;
   private final Map<UUID, AddressAndPort> IHRRICRRICCORIOHRHHCIHIROCICHO = new ConcurrentHashMap<>();
   private int OHRCHIHCHCOIORIICCCICOOROHHIHC = 5;

   @Override
   public void close() {
   }

   @Override
   public void init() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         var1 -> this.CORCRCRCIRIHRRCRCCIORCOCCICIRI()
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         var1 -> {
            if (this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
               this.CORCRCRCIRIHRRCRCCIORCOCCICIRI();
            }
         }
      );
      this.handle(CIOHHCORHRCCRICCCORIHCRHCCCRRR.class, this::HHCCIRHCCCIIRHCROHIORHIRHHIORH);
      this.handle(OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class, this::RIOOCHICIHRHOHCCCCCHOCCCOHCRHI);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         this::CRRRICCRROCOHHOHIICIHORCOORRRH
      );
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      if (!var1.getCommand().startsWith("/publish") || !this.OOIRIHORHICIIOIIIRCOROROICCICR() && !this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         if (var1.getCommand().startsWith("/publish") && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer() != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$submit(
                  () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$displayScreen(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 "hostedWorldSettings"
                              )
                           )
                     )
               );
            var1.cancel();
         }
      } else {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.OCCIHCOCHOHOOHIHCRCORCCCOCCOCH("Cannot use /publish in a hosted world");
         var1.cancel();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, AddressAndPort var2) {
      this.IHRRICRRICCORIOHRHHCIHIROCICHO.put(var1, var2);
   }

   @Nullable
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH OOCHRIIIRIHRRCRIORHCROIIHCRRIC(UUID var1) {
      AddressAndPort var2 = this.IHRRICRRICCORIOHRHHCIHIROCICHO.get(var1);
      if (this.RCICIOOOHOCCORRRCOOCHICIRHOCHC == null) {
         return null;
      }

      if (var2 == null) {
         return null;
      }

      int var3 = this.RCICIOOOHOCCORRRCOOCHICIRHOCHC.HIRROICHOOICOOCOCHIROHOCCHCOIR().getPort();
      new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, var2, var3);
      return new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH(
         var2.getPort(), var2.getAddress()
      );
   }

   public void CORCRCRCIRIHRRCRCCIORCOCCICIRI() {
      this.IHHOOCIRIROHIHICCICCCCHOHHRCOH();
      this.OCCCHCIRROHCIHCORORHIHOCHCHIII();
      this.ICIRHOCHOORIOHHHIOHOIRORCICRCR = null;
      this.OCIIORIOOHIHICOOOHRROHRORRIOIC = null;
      this.OIHRIOIOCHCIHORHCIICCHORROCOIH = null;
      this.COIOIOCIRHROOHROCOCIHRORHCOOHO = null;
      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      this.RCICIOOOHOCCORRRCOOCHICIRHOCHC = new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      this.HHOCRCRHCCCCIHIORHHOOIICHCHRHI();
      this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(
         var2 -> {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
            if (var3 == null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().CORCRCRCIRIHRRCRCCIORCOCCICIRI();
            } else {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
                  .ifPresent(
                     var1xx -> var1xx.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        InboundLocation.newBuilder()
                           .setHostedWorld(
                              InboundHostedWorld.newBuilder()
                                 .setWorldHost(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var3.bridge$getUniqueID()))
                                 .build()
                           )
                           .build(),
                        BroadcastLocationChangeRequest.Trigger.TRIGGER_HOSTED_WORLD_START,
                        null
                     )
                  );
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(
                  var1.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR().ordinal()
               );
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                  .bridge$getIntegratedServer()
                  .bridge$publishWorldToLan(var4, var1.ORRHHOOHIIORRHRIORIRICCCOOICCR(), var1.getPort());
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                        com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                           "hostWorldNotification"
                        )
                     )
                  );
               ClickEvent var5 = null;
               HoverEvent var6 = null;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6) {
                  var5 = ClickEvent.copyToClipboard(var2.getJoinIp());
                  var6 = HoverEvent.showText(
                     Component.text()
                        .content(
                           com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                              .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("messages", "clickToCopyIp")
                        )
                        .color(NamedTextColor.GREEN)
                  );
               }

               Component var7 = ((TextComponent)((TextComponent)Component.text(
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GRAY
                              + "["
                              + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.AQUA
                              + "LC"
                              + com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GRAY
                              + "] "
                        )
                        .append(
                           Component.text()
                              .content(
                                 com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                                    .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                                    .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("messages", "startedHostingWorldPrefix")
                              )
                              .color(NamedTextColor.WHITE)
                              .clickEvent(var5)
                              .hoverEvent(var6)
                        ))
                     .append(((TextComponent)Component.text(var2.getJoinIp(), NamedTextColor.AQUA).clickEvent(var5)).hoverEvent(var6)))
                  .append(
                     Component.text()
                        .content(
                           com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                              .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("messages", "startedHostingWorldSuffix")
                        )
                        .color(NamedTextColor.WHITE)
                        .clickEvent(var5)
                        .hoverEvent(var6)
                  );
               var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var7);
               if (var1.HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO()
                  == com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.InviteOnly
                  )
                {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.OCCIHCOCHOHOOHIHCRCORCCCOCCOCH(
                     com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                        .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           "messages",
                           "hostedWorldHint",
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                                 .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                                 .IICHHHOHHCOHRCHHRICRHRHCCCIHCR()
                                 .CHHRRRHRCOHIICOHRRHCHCIROHRCCO()
                                 .get()
                           )
                        )
                  );
               }

               this.OHRHOCORCOICIOIOCCCOOIRHCRRIOO = new Thread(this::HORCCIORRCRCCHCIIIIOCIRIOHHIRI);
               this.OHRHOCORCOICIOIOCCCOOIRHCRRIOO.setDaemon(true);
               this.OHRHOCORCOICIOIOCCCOOIRHCRRIOO.start();
               this.IHHOOCIRIROHIHICCICCCCHOHHRCOH();
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
            }
         }
      );
      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   public void RIHRROICOICHIHIHOROCOCRCRCIHII() {
      if (this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0 -> {});
      } else {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(var0 -> var0.IRROIHHOOHCIOHICHHROOOCOCHCCOI().stopHostingWorld(null, StopHostingWorldRequest.newBuilder().build(), var0x -> {}));
      }
   }

   public void RCIROOOOICRHCCRRCIORHHIRCOIIIC(Consumer<StartHostingWorldResponse> var1) {
      Heartbeat var2 = this.CHCHOIRCCOHRCHOCOHCHCCORCROIOR();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var2x -> var2x.IRROIHHOOHCIOHICHHROOOCOCHCCOI()
               .startHostingWorld(
                  null,
                  StartHostingWorldRequest.newBuilder().setHeartbeat(var2).build(),
                  var1xx -> {
                     if (var1xx.getStatus() == StartHostingWorldResponse.Status.STATUS_OK) {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           "Successfully hosted server."
                        );
                        var1.accept(var1xx);
                     } else {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           "Failed to start hosted world: " + var1xx.getStatus()
                        );
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                              com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                                 "failedToHostWorld", var1xx.getStatus()
                              )
                           );
                        IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().CORCRCRCIRIHRRCRCCIORCOCCICIRI();
                        if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer() != null) {
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer().bridge$haltServer();
                        }
                     }
                  }
               )
         );
   }

   private void HHOCRCRHCCCCIHIORHHOOIICHCHRHI() {
      this.COIOIOCIRHROOHROCOCIHRORHCOOHO = this.RCICIOOOHOCCORRRCOOCHICIRHOCHC.HIRROICHOOICOOCOCHIROHOCCHCOIR();
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      this.RCICIOOOHOCCORRRCOOCHICIRHOCHC = new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      this.HHOCRCRHCCCCIHIORHHOOIICHCHRHI();
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      this.IHHOOCIRIROHIHICCICCCCHOHHRCOH();
      Heartbeat var2 = this.CHCHOIRCCOHRCHOCOHCHCCORCROIOR();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var1x -> var1x.IRROIHHOOHCIOHICHHROOOCOCHCCOI()
               .hostedWorldHeartbeat(
                  null,
                  HostedWorldHeartbeatRequest.newBuilder().setHeartbeat(var2).build(),
                  var0x -> {
                     if (var0x.getStatus() == HostedWorldHeartbeatResponse.Status.STATUS_OK) {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           "Successfully updated server."
                        );
                     } else {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           "Failed to update hosted world: " + var0x.getStatus()
                        );
                     }
                  }
               )
         );
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRRRICCRROCOHHOHIICIHORCOORRRH.getByID(
         var1.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR().ordinal()
      );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getIntegratedServer()
         .bridge$updateLanWorld(var3, var1.ORRHHOOHIIORRHRIORIRICCCOOICCR());
      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getIntegratedServer();
      var2.bridge$setAllowCheats(var1.ORRHHOOHIIORRHRIORIRICCCOOICCR());
      var2.bridge$setDifficulty(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.byId(
            var1.ROIICHORCRRROOORHIHIIIRCOROCRR().id
         )
      );
   }

   private void IHHOOCIRIROHIHICCICCCCHOHHRCOH() {
      if (this.CCOOCICOOOCOICIIHRIIOIROCHHIOH != null && this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.RCICIOOOHOCCORRRCOOCHICIRHOCHC.HIRROICHOOICOOCOCHIROHOCCHCOIR(), this.ICCRCOHHIHCRIOCRHHRCROICORRHHR, this.CIRRICRRRIROIHOOOIIOOCIHHOHORO
         );

         try {
            Files.writeString(this.CCOOCICOOOCOICIIHRIIOIROCHHIOH.toPath(), IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.toJson(var1));
         } catch (IOException var3) {
            throw new RuntimeException("Could not write to lunar hosted world settings file");
         }
      }
   }

   public void OCCCHCIRROHCIHCORORHIHOCHCHIII() {
      if (this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getIntegratedServer();
         if (var1 != null) {
            var1.bridge$closeLanServer(this.RCICIOOOHOCCORRRCOOCHICIRHOCHC.HIRROICHOOICOOCOCHIROHOCCHCOIR().getPort());
         }

         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var0 -> var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  InboundLocation.newBuilder().setSinglePlayer(InboundSinglePlayer.getDefaultInstance()).build(),
                  BroadcastLocationChangeRequest.Trigger.TRIGGER_HOSTED_WORLD_STOP,
                  null
               )
            );
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var0 -> var0.IRROIHHOOHCIOHICHHROOOCOCHCCOI()
                  .stopHostingWorld(
                     null,
                     StopHostingWorldRequest.newBuilder().build(),
                     var0x -> {
                        if (var0x.getStatus() == StopHostingWorldResponse.Status.STATUS_OK) {
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                              "Successfully stopped hosting server."
                           );
                        } else {
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                              "Failed to stop hosted world: " + var0x.getStatus()
                           );
                        }
                     }
                  )
            );
         this.RCICIOOOHOCCORRRCOOCHICIRHOCHC = null;
         synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
            this.ICCRCOHHIHCRIOCRHHRCROICORRHHR.clear();
         }

         this.CIRRICRRRIROIHOOOIIOOCIHHOHORO = new HashSet<>();
         this.IHRRICRRICCORIOHRHHCIHIROCICHO.clear();
      }

      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   @Nullable
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      String var2 = var1.bridge$getEnteredHostName();
      if (var2 == null) {
         return null;
      } else {
         String[] var3 = var2.split("\u0000");
         if (var3.length == 6 && var3[1].equals("LunarPreAuthV1")) {
            String var4 = var3[2];
            UUID var5 = UUID.fromString(var3[3]);
            com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var6 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
               .fromJson(
                  var3[4], com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[].class
               );
            String var7 = var3[5];
            return !this.OCHOCOOCROIICOIIHIHHHCICCHIICO.remove(var7)
               ? null
               : new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var4, var6);
         } else {
            return null;
         }
      }
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      if (var1.OCOIORCRROIOOCHORHHHROCHCCIHRR == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
         && !this.OOIRIHORHICIIOIIIRCOROROICCICR()
         && this.COIOIOCIRHROOHROCOCIHRORHCOOHO != null
         && this.COIOIOCIRHROOHROCOCIHRORHCOOHO.CIRRCCICHIROICRRRIOOCCRIIICROI()
         && !this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         if (this.COIOIOCIRHROOHROCOCIHRORHCOOHO.HIHCIOORORIORHCCOORRHCIHOOHHCR() != null) {
            this.COIOIOCIRHROOHROCOCIHRORHCOOHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.COIOIOCIRHROOHROCOCIHRORHCOOHO.HIHCIOORORIORHCCOORRHCIHOOHHCR());
         }

         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CCRHICOCOHIIRIHCOCIRCHHROHCCRR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.COIOIOCIRHROOHROCOCIHRORHCOOHO);
      }

      if (this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()
         && var1.OCOIORCRROIOOCHORHHHROCHCCIHRR instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
         )
       {
         synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
            Optional var4 = this.ICCRCOHHIHCRIOCRHHRCROICORRHHR
               .stream()
               .filter(var1x -> var1x.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var1.OCOIORCRROIOOCHORHHHROCHCCIHRR.bridge$getUniqueID()))
               .findFirst();
            if (var4.isPresent()) {
               ((com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.get())
                  .HOIHOROOIOOCOIHCRIRIRIRRICIIHC(System.currentTimeMillis());
               ((com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.get()).IHCCOOCIIIIIIHIOHRICIIHCCIIIIH(true);
            } else {
               this.ICCRCOHHIHCRIOCRHHRCROICORRHHR
                  .add(
                     new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH(
                        var2.bridge$getName(), var2.bridge$getUniqueID(), System.currentTimeMillis(), true
                     )
                  );
            }
         }

         this.OHCRCCICCOCICOCICIRCHRORHHCIRO();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RORROHRORCOOOOHRROHIOHCRHHCRCO().OOHHCCRHIRCIHOIOCCIOCCORICCHCI();
      }

      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
      File var2 = var1.IHCHHOHHOHCRHHCOCICHRIIRROIOHH();
      if (var2 != null) {
         this.CCOOCICOOOCOICIIHRIIOIROCHHIOH = new File(var2, "lunar_hosted_world_data.json");
         if (!this.CCOOCICOOOCOICIIHRIIOIROCHHIOH.exists()) {
            try {
               this.CCOOCICOOOCOICIIHRIIOIROCHHIOH.createNewFile();
            } catch (IOException var8) {
               throw new RuntimeException("Could not create Hosted World JSON.", var8);
            }
         } else {
            try (FileReader var3 = new FileReader(this.CCOOCICOOOCOICIIHRIIOIROCHHIOH)) {
               com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
                  .fromJson(
                     var3, com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class
                  );
               if (var4 != null) {
                  this.COIOIOCIRHROOHROCOCIHRORHCOOHO = var4.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI;
                  synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
                     this.ICCRCOHHIHCRIOCRHHRCROICORRHHR.clear();
                     if (var4.IRCIIIRRIOIHICRCIHHOOCRROOOOCO != null) {
                        this.ICCRCOHHIHCRIOCRHHRCROICORRHHR.addAll(var4.IRCIIIRRIOIHICRCIHHOOCRROOOOCO);
                     }
                  }

                  this.CIRRICRRRIROIHOOOIIOOCIHHOHORO = Objects.requireNonNullElseGet(var4.IRCCOROOCOIRRIICHRCICCOOHRHHOI, HashSet::new);
               }
            } catch (IOException var11) {
               throw new RuntimeException("Could not read Hosted World JSON.", var11);
            }
         }
      }

      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   private void HORCCIORRCRCCHCIIIIOCIRIOHHIRI() {
      try {
         while (this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
            Thread.sleep(30000L);
            this.OHCRCCICCOCICOCICIRCHRORHHCIRO();
         }
      } catch (Throwable var2) {
         throw var2;
      }
   }

   private void OHCRCCICCOCICOCICIRCHRORHHCIRO() {
      if (this.RCICIOOOHOCCORRRCOOCHICIRHOCHC != null) {
         Heartbeat var1 = this.CHCHOIRCCOHRCHOCOHCHCCORCROIOR();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresent(
               var1x -> var1x.IRROIHHOOHCIOHICHHROOOCOCHCCOI()
                  .hostedWorldHeartbeat(
                     null,
                     HostedWorldHeartbeatRequest.newBuilder().setHeartbeat(var1).build(),
                     var0x -> {
                        if (var0x.getStatus() != HostedWorldHeartbeatResponse.Status.STATUS_OK) {
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                              "Failed to heartbeat hosted world: " + var0x.getStatus()
                           );
                        }
                     }
                  )
            );
      }
   }

   @NotNull
   private Heartbeat CHCHOIRCCOHRCHOCOHCHCCORCROIOR() {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = this.RCICIOOOHOCCORRRCOOCHICIRHOCHC.HIRROICHOOICOOCOCHIROHOCCHCOIR();
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 : new ArrayList<>(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer().bridge$getPlayers()
      )) {
         synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
            Optional var7 = this.ICCRCOHHIHCRIOCRHHRCROICORRHHR
               .stream()
               .filter(var1x -> var1x.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var5.bridge$getUniqueID()))
               .findFirst();
            if (var7.isPresent()) {
               ((com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH)var7.get())
                  .HOIHOROOIOOCOIHCRIRIRIRRICIIHC(System.currentTimeMillis());
            } else {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Online player wasn't in the playerlist somehow??"
               );
               com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var8 = new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  var5.bridge$getName(), var5.bridge$getUniqueID(), System.currentTimeMillis(), true
               );
               this.ICCRCOHHIHCRIOCRHHRCROICORRHHR.add(var8);
            }
         }

         var2.add(Heartbeat.OnlinePlayer.newBuilder().setPlayer(CCHORHIOORICCIRIHRIIHIICORIORO.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var5)).build());
      }

      if (var2.stream()
         .noneMatch(var0 -> var0.getPlayer().getUsername().equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName()))) {
         com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var15 = new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName(),
            IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID(),
            System.currentTimeMillis(),
            true
         );
         synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
            this.ICCRCOHHIHCRIOCRHHRCROICORRHHR.add(var15);
         }

         var2.add(
            Heartbeat.OnlinePlayer.newBuilder()
               .setPlayer(
                  UuidAndUsername.newBuilder()
                     .setUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var15.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()))
                     .setUsername(var15.getUsername())
                     .build()
               )
               .build()
         );
      }

      ArrayList var16;
      synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
         var16 = new ArrayList<>(this.ICCRCOHHIHCRIOCRHHRCROICORRHHR);
      }

      for (com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var21 : var16) {
         if (!var2.stream()
            .anyMatch(
               var1x -> CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x.getPlayer().getUuid())
                  .equals(var21.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI())
            )) {
            var21.IHCCOOCIIIIIIHIOHRICIIHCCIIIIH(false);
            var3.add(
               Heartbeat.OfflinePlayer.newBuilder()
                  .setPlayer(
                     UuidAndUsername.newBuilder()
                        .setUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var21.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()))
                        .setUsername(var21.getUsername())
                        .build()
                  )
                  .setLastOnline(CCHORHIOORICCIRIHRIIHIICORIORO.IHROCRRIRIROCCCRCRRROCRRCRIIHH(var21.ORHHIRRICROCIOHHHHICCIOIRHRROC()))
                  .build()
            );
         }
      }

      Heartbeat.Builder var20 = Heartbeat.newBuilder();
      if (var1.HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO()
         != com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.Closed
         )
       {
         var20.addAllowedJoinSources(switch (this.COIOIOCIRHROOHROCOCIHRORHCOOHO.HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO()) {
            case LAN -> JoinSource.JOIN_SOURCE_LOCAL_AREA_NETWORK;
            case InviteOnly -> JoinSource.JOIN_SOURCE_HOSTED_WORLD_WHITELIST;
            case Friends -> JoinSource.JOIN_SOURCE_LUNAR_CLIENT_FRIENDS;
            case Everyone -> JoinSource.JOIN_SOURCE_EVERYONE;
            default -> throw new IllegalStateException("Unknown privacy state");
         });
      }

      return var20.setMaxPlayers(var1.RCHOCRHCHHRIORRIHIIORROIRHOHRI())
         .addAllWhitelistedUuids(CCHORHIOORICCIRIHRIIHIICORIORO.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.CIRRICRRRIROIHOOOIIOOCIHHOHORO))
         .addAllOnlinePlayers(var2)
         .addAllOfflinePlayers(var3)
         .build();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(LoginResponse var1) {
      this.RRRHROHCCCHCORHRHOCHCICCHHCORR = var1.getMaxWorldPlayerCount();
      this.OORIHCIIRICOCHRIRHHRHRIHHCHIIO = var1.getHostingEnabled();
      this.RIIROCCHOCICCICOHIOCRIIORCRRRC = var1.getJoiningEnabled();
      this.OHRCHIHCHCOIORIICCCICOOROHHIHC = var1.getMultiplayerRefreshIntervalSeconds();
   }

   public boolean OOOIIOOHHRRRORIHROOCHHCICOIIOC() {
      return this.RCICIOOOHOCCORRRCOOCHICIRHOCHC != null;
   }

   public static com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      HostedWorldStatusPush var0
   ) {
      if (var0.getAllowedJoinSourcesCount() == 0) {
         return com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.Closed;
      }

      return switch (var0.getAllowedJoinSources(0)) {
         case JOIN_SOURCE_UNSPECIFIED -> com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.Closed;
         case JOIN_SOURCE_LOCAL_AREA_NETWORK -> com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.LAN;
         case JOIN_SOURCE_HOSTED_WORLD_WHITELIST -> com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.InviteOnly;
         case JOIN_SOURCE_LUNAR_CLIENT_FRIENDS -> com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.Friends;
         case JOIN_SOURCE_EVERYONE -> com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.Everyone;
         case UNRECOGNIZED -> null;
      };
   }

   public void CHRRCCOOHCCRRCIRRIOCIROCOOCIHO() {
      this.HOCHHRIOHRRRRHHOROIOHOHHCCHIHI.IIHRRHORCRCROCHHOHORCHCROCIHRO("isHostingWorld", this.OOOIIOOHHRRRORIHROOCHHCICOIIOC());
      this.HOCHHRIOHRRRRHHOROIOHOHHCCHIHI.IIHRRHORCRCROCHHOHORCHCROCIHRO("isInSomeonesHostedWorld", this.OOIRIHORHICIIOIIIRCOROROICCICR());
      JsonArray var1 = new JsonArray();

      for (UUID var3 : this.CIRRICRRRIROIHOOOIIOOCIHHOHORO) {
         var1.add(var3.toString());
      }

      this.HOCHHRIOHRRRRHHOROIOHOHHCCHIHI.IIHRRHORCRCROCHHOHORCHCROCIHRO("whitelistedUUIDs", var1);
      JsonArray var13 = new JsonArray();
      String var14 = "";
      String var4 = "";
      HostedWorldStatusPush var5 = this.RIRIIIOHCOICRORRICHOICCHIRHOII();
      if (this.OOIRIHORHICIIOIIIRCOROROICCICR() && var5 != null) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var15 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var5
         );
         var14 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "hostedWorldNameText", this.HCCCOOOCHRCRRRORROHRCHCCCCCIHC().username());
         var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "hostedWorldDescriptionText", var15, var5.getOnlinePlayersCount(), var5.getMaxPlayers());
         long var17 = System.currentTimeMillis();

         for (HostedWorldStatusPush.OnlinePlayer var10 : var5.getOnlinePlayersList()) {
            var13.add(
               com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var17).provide()
            );
         }

         for (HostedWorldStatusPush.OfflinePlayer var21 : var5.getOfflinePlayersList()) {
            var13.add(com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21).provide());
         }
      } else if (this.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
         synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
            for (com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var8 : this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
               var13.add(var8.provide());
            }

            int var16 = (int)this.CHICCROOICRRCRCCCOOCIOIHOIIRHC()
               .stream()
               .filter(com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH::CIIRCROIRCROCCIIHCOIHOIHOCHRCI)
               .count();
            int var18 = this.CHICCROOICRRCRCCCOOCIOIHOIIRHC().size();
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
            var14 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "hostedWorldNameText", var9 == null ? "You" : var9.bridge$getName());
            var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  "gui.components",
                  "hostedWorldDescriptionText",
                  this.IORRRROCRRCHCHHRCCOHCRRCRHCRHH().HIRROICHOOICOOCOCHIROHOCCHCOIR().HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO(),
                  var16,
                  var18
               );
         }
      }

      this.HOCHHRIOHRRRRHHOROIOHOHHCCHIHI.IIHRRHORCRCROCHHOHORCHCROCIHRO("players", var13);
      this.HOCHHRIOHRRRRHHOROIOHOHHCCHIHI.IIHRRHORCRCROCHHOHORCHCROCIHRO("title", var14);
      this.HOCHHRIOHRRRRHHOROIOHOHHCCHIHI.IIHRRHORCRCROCHHOHORCHCROCIHRO("description", var4);
   }

   public void OCIROOIHIHRHOCCHIIIROOCRIIOCRR(UUID var1) {
      this.CIRRICRRRIROIHOOOIIOOCIHHOHORO.add(var1);
      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   public void HRCOCHHHCCIORCORCHIOOOCCCCHICH(UUID var1) {
      this.CIRRICRRRIROIHOOOIIOOCIHHOHORO.remove(var1);
      this.CHRRCCOOHCCRRCIRRIOCIROCOOCIHO();
   }

   public com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH IIHHICHCCCOHCHROIRIHICCHHOROCR(UUID var1) {
      HostedWorldStatusPush var2 = this.RIRIIIOHCOICRORRICHOICCHIRHOII();
      if (this.OOIRIHORHICIIOIIIRCOROROICCICR() && var2 != null) {
         long var10 = System.currentTimeMillis();

         for (HostedWorldStatusPush.OnlinePlayer var6 : var2.getOnlinePlayersList()) {
            com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var7 = com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var6, var10
            );
            if (var7.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var1)) {
               return var7;
            }
         }

         for (HostedWorldStatusPush.OfflinePlayer var13 : var2.getOfflinePlayersList()) {
            com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var14 = com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var13
            );
            if (var14.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var1)) {
               return var14;
            }
         }
      } else {
         synchronized (this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
            for (com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var5 : this.ICCRCOHHIHCRIOCRHHRCROICORRHHR) {
               if (var5.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var1)) {
                  return var5;
               }
            }
         }
      }

      return null;
   }

   public boolean OOIRIHORHICIIOIIIRCOROROICCICR() {
      return this.OCIIORIOOHIHICOOOHRROHRORRIOIC != null && !this.OOOIIOOHHRRRORIHROOCHHCICOIIOC();
   }

   @com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH(
      "hostedWorld"
   )
   @Generated
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH RHRRHRICHHHOHRHOHICROHRRIHCCHH() {
      return this.HOCHHRIOHRRRRHHOROIOHOHHCCHIHI;
   }

   @Generated
   public com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IORRRROCRRCHCHHRCCOHCRRCRHCRHH() {
      return this.RCICIOOOHOCCORRRCOOCHICIRHOCHC;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO OOOIHICRCHCOHHIIORORHIOIRCICOI() {
      return this.COIOIOCIRHROOHROCOCIHRORHCOOHO;
   }

   @Generated
   public Set<com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH> CHICCROOICRRCRCCCOOCIOIHOIIRHC() {
      return this.ICCRCOHHIHCRIOCRHHRCROICORRHHR;
   }

   @Generated
   public Set<UUID> RRRIROIHCCICHIIOIIOHHHRHCHOICH() {
      return this.CIRRICRRRIROIHOOOIIOOCIHHOHORO;
   }

   @Generated
   public Set<String> COIHOORIRRCRCRHRCIROHCHHIIRHHR() {
      return this.OCHOCOOCROIICOIIHIHHHCICCHIICO;
   }

   @Generated
   public boolean RCOROCRIICIOORHHCCIHHOOCCHRCIH() {
      return this.OORIHCIIRICOCHRIRHHRHRIHHCHIIO;
   }

   @Generated
   public boolean OOHIRRIROCROCIHHIHIOOHHHCRRCOH() {
      return this.RIIROCCHOCICCICOHIOCRIIORCRRRC;
   }

   @Generated
   public int getMaxWorldPlayerCount() {
      return this.RRRHROHCCCHCORHRHOCHCICCHHCORR;
   }

   @Generated
   public HostedWorldStatusPush RIRIIIOHCOICRORRICHOICCHIRHOII() {
      return this.ICIRHOCHOORIOHHHIOHOIRORCICRCR;
   }

   @Generated
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HostedWorldStatusPush var1) {
      this.ICIRHOCHOORIOHHHIOHOIRORCICRCR = var1;
   }

   @Generated
   public com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCCCOOOCHRCRRRORROHRCHCCCCCIHC() {
      return this.OCIIORIOOHIHICOOOHRROHRORRIOIC;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OCIIORIOOHIHICOOOHRROHRORRIOIC = var1;
   }

   @Generated
   public UUID CIOOORRCOROIHHIHIOIRRRHRHOORRR() {
      return this.OIHRIOIOCHCIHORHCIICCHORROCOIH;
   }

   @Generated
   public void IIIIRHIHROIRCROHHROIHIIHRCRRHO(UUID var1) {
      this.OIHRIOIOCHCIHORHCIICCHORROCOIH = var1;
   }

   @Generated
   public List<ListHostedWorldsResponse.HostedWorld> IIOCRICIRCCIIOHHOHHHCRROHHOCRI() {
      return this.RORCHHRHRRCCHIRCOIIIOOHROCCOIO;
   }

   @Generated
   public void ROCRHIOCHIIOCROIHHOHHROCHCIHCH(List<ListHostedWorldsResponse.HostedWorld> var1) {
      this.RORCHHRHRRCCHIRCOIIIOOHROCCOIO = var1;
   }

   @Generated
   public boolean CRIHHICHIOCHIOOCCRICCCOIIOHHIC() {
      return this.CRIOHIICICHCHIOCCRHHHIRIORCCHC;
   }

   @Generated
   public void OCICRRCHRIRORHIRHIHOIRCCIHCHRH(boolean var1) {
      this.CRIOHIICICHCHIOCCRHHHIRIORCCHC = var1;
   }

   @Generated
   public int getMultiplayerRefreshIntervalSeconds() {
      return this.OHRCHIHCHCOIORIICCCICOOROHHIHC;
   }

   public record CRRRICCRROCOHHOHIICIHORCOORRRH() {
      private final int HHORRRCRRROHHRCCOCOOCIOHCCCCCR;
      private final String HRRICROOIRRCHIRHOIHOCRCICHIICO;

      public CRRRICCRROCOHHOHIICIHORCOORRRH(int var1, String var2) {
         this.HHORRRCRRROHHRCCOCOOCIOHCCCCCR = var1;
         this.HRRICROOIRRCHIRHOIHOCRCICHIICO = var2;
      }

      public int CRIIRHHROICIHIIRIRIORHHOCROOII() {
         return this.HHORRRCRRROHHRCCOCOOCIOHCCCCCR;
      }

      public String IHIORRORORCHHHHHCCCIIRHOOCCHOH() {
         return this.HRRICROOIRRCHIRHOIHOCRCICHIICO;
      }
   }

   public static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      @SerializedName("worldSettings")
      private final RRCRRCORICCHOHHIRCHIROOHIIOHCO HICIHRHHIHIIRRRHHRHHHCCIIHOCOI;
      @SerializedName("playerList")
      private final Set<com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH> IRCIIIRRIOIHICRCIHHOOCRROOOOCO;
      @SerializedName("whitelistedUUIDs")
      private final Set<UUID> IRCCOROOCOIRRIICHRCICCOOHRHHOI;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
         Set<com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH> var2,
         Set<UUID> var3
      ) {
         this.HICIHRHHIHIIRRRHHRHHHCCIIHOCOI = var1;
         this.IRCIIIRRIOIHICRCIHHOOCRROOOOCO = var2;
         this.IRCCOROOCOIRRIICHRCICCOOHRHHOI = var3;
      }
   }

   public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      @SerializedName("name")
      private final String HRHHRICOROIIHRIHOCIOIORRORORIH;
      @SerializedName("value")
      private final String HOCHHHCHIRROIRIRIRRRCCRHROHIOO;
      @SerializedName("signature")
      private final String RIIOIOIIHHHHRCIIHRHHOOHRHHRROO;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, String var3) {
         this.HRHHRICOROIIHRIHOCIOIORRORORIH = var1;
         this.HOCHHHCHIRROIRIRIRRRCCRHROHIOO = var2;
         this.RIIOIOIIHHHHRCIIHRHHOOHRHHRROO = var3;
      }

      @SerializedName("name")
      public String name() {
         return this.HRHHRICOROIIHRIHOCIOIORRORORIH;
      }

      @SerializedName("value")
      public String value() {
         return this.HOCHHHCHIRROIRIRIRRRCCRHROHIOO;
      }

      @SerializedName("signature")
      public String signature() {
         return this.RIIOIOIIHHHHRCIIHRHHOOHRHHRROO;
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final UUID ICRRIOIROROCHIHIRHHHIRCCIRCIHH;
      private final String IOHCOORHIHCRCRIIHHRHCCHORCOIRC;
      private final com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] IIHCHCIOHIOOHIIRHROCRCIRHIHHCO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         UUID var1,
         String var2,
         com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var3
      ) {
         this.ICRRIOIROROCHIHIRHHHIRCCIRCIHH = var1;
         this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC = var2;
         this.IIHCHCIOHIOOHIIRHROCRCIRHIHHCO = var3;
      }

      public UUID uuid() {
         return this.ICRRIOIROROCHIHIRHHHIRCCIRCIHH;
      }

      public String username() {
         return this.IOHCOORHIHCRCRIIHHRHCCHORCOIRC;
      }

      public com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] CIRRICIRHCCHCHHHCRCOHIHRCHOIRH() {
         return this.IIHCHCIOHIOOHIIRHROCRCIRHIHHCO;
      }
   }
}
