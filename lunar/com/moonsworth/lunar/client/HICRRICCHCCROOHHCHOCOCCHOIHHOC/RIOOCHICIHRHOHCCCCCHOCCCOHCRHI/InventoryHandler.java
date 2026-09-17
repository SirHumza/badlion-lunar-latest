package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.protobuf.Any;
import com.lunarclient.websocket.emote.v1.EquippedEmote;
import com.lunarclient.websocket.emote.v1.StopEmotePush;
import com.lunarclient.websocket.emote.v1.StopEmoteRequest;
import com.lunarclient.websocket.emote.v1.UpdateEquippedEmotesRequest;
import com.lunarclient.websocket.emote.v1.UseEmotePush;
import com.lunarclient.websocket.emote.v1.UseEmoteRequest;
import com.lunarclient.websocket.emote.v1.UseEmoteResponse;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import mchorse.emoticons.capabilities.cosmetic.EmoteController;
import mchorse.emoticons.common.EmoteAPI;
import org.jetbrains.annotations.Nullable;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<UUID, com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>
   implements com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH RIHHRIHICOICHCRRRIHCOIROOHOCOI = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   public static final BiMap<Integer, com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH> IOCICHRIHOHOHRRHIRIHHCROCCOCIR = HashBiMap.create();
   private List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> CIOROHROCRRICHRIHORIHIHHCIOCRC = new ArrayList<>();
   private Set<com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> OCRRHCICHRHHOOHCCHOOHRIICIRHOI = new HashSet<>();
   private Integer CCCHCROHOCRRROCOCOHIIHICICOHIH = null;
   private boolean CIIRHHOCHICCHICORIHHIIIHCHCCIO = false;
   private final Map<UUID, IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OOCIRICCCIORIRCHCRRRHHCICICIIR = new ConcurrentHashMap<>();
   public boolean IHCIRIOIIHRHOCCOOOHOCOCORCCCIC;
   public int OORHIRCRHHOCHRROROOCOIICHOCOHO;
   public boolean IOHIHCIRIRCHOHIIRHROHICICICHCO;

   public IIHRRHORCRCROCHHOHORCHCROCIHRO() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI.class,
         this::IRCIIHHICIHRCOCRROCOICRIHHCCHH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.class,
         var0 -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.IIRROICRRIIIIHICIHIOOHIOOOHIRI(), false);
            }
         }
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         var0 -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.OORHCIORORHOHHROIRROHIIOIHRCHH(), false);
            }
         }
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         var0 -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(), false);
            }
         }
      );
   }

   public void RRCRHRRIRRORCOOCORCRRHOCHROIIH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(), false, false);
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 : IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH()
            .bridge$getPlayerEntities()) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().COOCRCHRIOOCHCIHCIOCHHIOOIRHIC().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, false, false);
         }
      }
   }

   public void RORCCRRCOHOHHOHOCOOIRORHIRIICR() {
      List var1 = this.OCRRHCICHRHHOOHCCHOOHRIICIRHOI
         .stream()
         .sorted(Comparator.comparingInt(com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR::getSlotId))
         .toList();
      List var2 = var1.stream()
         .map(var0 -> EquippedEmote.newBuilder().setEmoteId(var0.getEmoteId()).setAttachedJamId(var0.getJamId()).setSlotNumber(var0.getSlotId()).build())
         .toList();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var1x -> var1x.RRIOIROCRCCCCROHHCRHOOROOHRROI()
               .updateEquippedEmotes(null, UpdateEquippedEmotesRequest.newBuilder().addAllEquippedEmotes(var2).build(), var0x -> {})
         );
   }

   public void IOIICIRIICICIIOORHCIIIIRRIHRHI(int var1, int var2, int var3) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOOHRIIRIHCIHIIHIOHHOHHORIOHOR()
         .CIHCIHCORCICOHIRICHRRIORROOICH()) {
         if (this.CIOROHROCRRICHRIHORIHIHHCIOCRC
            .contains(
               new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var1, -1L, null, new ArrayList<>(), null
               )
            )) {
            if (this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().containsKey(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID())) {
               this.IHCIRIOIIHRHOCCOOOHOCOCORCCCIC = false;
               this.IOHIHCIRIRCHOHIIRHROHICICICHCO = true;
            } else {
               this.IOHIHCIRIRCHOHIIRHROHICICICHCO = false;
            }

            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCCIIOHOROCIICCOOORHCHRRCHROHC()
               .get(var3);
            UUID var5 = var4 != null ? var4.OHRRCHIHIROCICRICCCOIRCCOROIIH() : null;
            String var6 = var5 != null ? var5.toString() : "";
            if (!var6.isEmpty()) {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .OIOOIHRRCRIIOCCRROOOROOIOCCOHO()
                  .CORCOCICIRIOHROHROIIOOHICCHCRR(
                     var6,
                     var5x -> {
                        com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6x = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                           .OHOHCHORHIIHCCOIHOHCCICRHHICIR();
                        if (var6x.IOHOCCHIHCCROOIRORCORCRRIHHCRH().get()
                           && var6x.OOICIIRIOHIIICHCIRIIRRIRORCCRH().get()
                           && !var4.IIIRHORICIOIICRHCICIOIIICHCHOO()
                           && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IOORROIRICCOCCOOCCIROIIIHRCCCC().HRIIOOOROORRCHOHROCHHRCRIHHCOO()
                           && var6x.HHOCRIRHRRRHRCCRRIORHHORHRCCCC().get()) {
                           com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var7 = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                              com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.WARNING
                                 .getIcon(),
                              com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                                 "disableStreamerMode"
                              )
                           );
                           var7.ORCOCORROHIROCCIORORRRRCHIOOCH(6000L);
                           com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                              .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                              .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7);
                        }

                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var5x, var3);
                     }
                  );
            } else {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, "", 0);
            }
         } else {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Couldn't perform emote (%s) as you do not own it", var1
            );
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, String var3, int var4) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
         .ifPresent(
            var5 -> var5.RRIOIROCRCCCCROHHCRHOOROOHRROI()
               .useEmote(
                  null,
                  UseEmoteRequest.newBuilder().setEmoteId(var1).setEmoteMetadata(var2).setEmoteJamId(var4).setEmoteSoundtrackUrl(var3).build(),
                  var5x -> {
                     if (var5x.getStatus() != UseEmoteResponse.Status.STATUS_RATE_LIMITED) {
                        if (var5x.getStatus() != UseEmoteResponse.Status.STATUS_OK) {
                           String var8 = switch (var5x.getStatus()) {
                              case STATUS_EMOTE_NOT_OWNED -> "You do not own that emote.";
                              case STATUS_ILLEGAL_SOUNDTRACK -> "Invalid emote soundtrack.";
                              case STATUS_OK, STATUS_UNSPECIFIED, STATUS_RATE_LIMITED, UNRECOGNIZED -> "Unknown error.";
                           };
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                                 var8
                              );
                        } else if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                           .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                           .HIRIIHHOCHORROOOHCOIHCHICCOOIH()
                           .get()) {
                           String var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups", "emotesDisabled");
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                 com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                                 var7
                              );
                        } else {
                           com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                                 com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
                              )
                              .ifPresent(
                                 var3xxx -> {
                                    if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                                       .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                                       .HOOHRIIRIHCIHIIHIOHHOHHORIOHOR()
                                       .isEnabled()) {
                                       var3xxx.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                                          Any.pack(
                                             UseEmotePush.newBuilder()
                                                .setEmoteId(var1)
                                                .setEmoteMetadata(var2)
                                                .setEmoteSoundtrackUrl(var3)
                                                .setPlayerUuid(
                                                   CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(
                                                      IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID()
                                                   )
                                                )
                                                .build()
                                          )
                                       );
                                    }
                                 }
                              );
                           com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                              .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
                           if (var6.isRecording()) {
                              var6.OHOHRHIIIIIORCIHCHCHCIIHOOIIOI()
                                 .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                                    Any.pack(
                                       UseEmotePush.newBuilder()
                                          .setEmoteId(var1)
                                          .setEmoteMetadata(var2)
                                          .setEmoteSoundtrackUrl(var3)
                                          .setPlayerUuid(
                                             CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(
                                                IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID()
                                             )
                                          )
                                          .build()
                                    )
                                 );
                           }

                           this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getPlayer(),
                              this.RCCRRRIHRRHCIIHRIOHHROHIOOCRIC(var1),
                              var2,
                              var3,
                              var4
                           );
                        }
                     }
                  }
               )
         );
   }

   public void RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(int var1, int var2) {
      this.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1, var2, 0);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var1.getId(), var1.getMetadata());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2, int var3, String var4, int var5
   ) {
      if (var1 != null) {
         this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1);
         if (var2 != null) {
            if (EmoteController.avoidEmote(var1)) {
               if (var1 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()) {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                     .IICHCOCCIOIIHRHHROCOIOHOHCIHCH(
                        com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                           "emoteFailure"
                        )
                     );
               }

               return;
            }

            if (var1 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .HOOHRIIRIHCIHIIHIOHHOHHORIOHOR()
                  .CIHCIHCORCICOHIRICHRRIORROOICH()
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getMovementInput().bridge$isSneaking()
               && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO()
                     .bridge$getGameSettings()
                     .bridge$getThirdPersonView()
                  == 0) {
               this.IHCIRIOIIHRHOCCOOOHOCOCORCCCIC = true;
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO()
                  .bridge$getGameSettings()
                  .bridge$setThirdPersonView(1);
            }

            this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().putIfAbsent(var1.bridge$getUniqueID(), var2);
            if (var2 instanceof com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH) {
               ((com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
            }

            if (var4 != null && !var4.isEmpty()) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.bridge$getUniqueID(), var4, var5);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, String var2, int var3) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR();
         if (var4.IOHOCCHIHCCROOIRORCORCRRIHHCRH().get()) {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = var3 == 0
               ? null
               : com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCCIIOHOROCIICCOOORHCHRRCHROHC()
                  .get(var3);
            if ((var5 == null || !var5.IIIRHORICIOIICRHCICIOIIICHCHOO())
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().IOORROIRICCOCCOOCCIROIIIHRCCCC().HRIIOOOROORRCHOHROCHHRCRIHHCOO()) {
               return;
            }

            this.OOCIRICCCIORIRCHCRRRHHCICICIIR.remove(var1);
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$submit(
                  () -> {
                     float var5x = var4.IROHIRRRICIICHIHHHCOIIORHCRHOH().get();
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
                     if (var6 != null && var6.bridge$getUniqueID() != var1) {
                        var5x = var4.OOHRIIOROCRICHIIICHIOCRORROCHI().get();
                     }

                     Object var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                        .bridge$getSoundHandler()
                        .bridge$playMp3FromURL(var2, var5x, true, true);
                     if (var7 != null) {
                        this.OOCIRICCCIORIRCHCRRRHHCICICIIR
                           .put(var1, new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(System.currentTimeMillis(), var7, var2, var3));
                     }
                  }
               );
         }
      }
   }

   public boolean RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      EmoteController var2 = (EmoteController)EmoteController.get(var1);
      return var2 != null && var2.isEmoting();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, true);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2,
      boolean var3
   ) {
      if (this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().containsKey(var1.bridge$getUniqueID())) {
         this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1);
         if (!(var1 instanceof com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO)) {
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                  com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
               )
               .ifPresent(
                  var1x -> {
                     if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .HOOHRIIRIHCIHIIHIOHHOHHORIOHOR()
                        .isEnabled()) {
                        var1x.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                           Any.pack(
                              StopEmotePush.newBuilder()
                                 .setPlayerUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1.bridge$getUniqueID()))
                                 .build()
                           )
                        );
                     }
                  }
               );
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
            if (var4.isRecording()) {
               var4.OHOHRHIIIIIORCIHCHCHCIIHOOIIOI()
                  .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     Any.pack(
                        StopEmotePush.newBuilder()
                           .setPlayerUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var1.bridge$getUniqueID()))
                           .build()
                     )
                  );
            }
         }

         if (var1 == IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().isPresent()
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().get().isOpen()
            && var3
            && !var2) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
               .ifPresent(var0 -> var0.RRIOIROCRCCCCROHHCRHOOROOHRROI().stopEmote(null, StopEmoteRequest.getDefaultInstance(), var0x -> {}));
         }
      }
   }

   private void IHCRORHRORIICHRHRCHRRIRRHHOCOO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 != null && var1.bridge$getUniqueID() != null) {
         IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.OOCIRICCCIORIRCHCRRRHHCICICIIR.remove(var1.bridge$getUniqueID());
         if (var2 != null) {
            try {
               IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSoundHandler().bridge$destroySound(var2.source);
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }

         Map var3 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();
         if (var3 != null && var3.containsKey(var1.bridge$getUniqueID())) {
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.get(
               var1.bridge$getUniqueID()
            );
            if (var4 != null) {
               if (var4 instanceof com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH) {
                  EmoteAPI.setEmoteClient(null, var1, -1);
               }

               var4.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var1);
            }

            var3.remove(var1.bridge$getUniqueID());
         }
      }
   }

   public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCCRRRIHRRHCIIHRIOHHROHIOOCRIC(
      int var1
   ) {
      return this.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var1, 0);
   }

   public com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRHOOOORORHHOOIHRCCHIIHHIIIIOH(
      int var1, int var2
   ) {
      try {
         com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = (com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH)IOCICHRIHOHOHRRHIRIHHCROCCOCIR.get(
            var1
         );
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCCIIOHOROCIICCOOORHCHRRCHROHC()
            .get(var2);
         return var3 == null
            ? null
            : new com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               var1, var3.HCHROROOIIORIORRIOHOIROCHORCRO(), var3.getId(), var3.CHHHRIIIIIRRHHICIRHCOCHIOHCRHR(), var4
            );
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
      if (!this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().isEmpty()) {
         ArrayList var3 = new ArrayList();

         for (Entry var5 : this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().entrySet()) {
            UUID var6 = (UUID)var5.getKey();
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5.getValue();
            if (var7.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO()) {
               if (var2 != null) {
                  var2.bridge$getPlayerByUniqueId(var6).ifPresent(var1x -> {
                     if (var7.IHIOHHHHIRHRHIHHHHRICRIHCHOOCO()) {
                        var7.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var1x);
                     }
                  });
               }

               var3.add(var6);
            }
         }

         for (UUID var11 : var3) {
            this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().remove(var11);
         }
      }

      for (Entry var10 : this.OOCIRICCCIORIRCHCRRRHHCICICIIR.entrySet()) {
         if (var10.getValue() != null && var2 != null) {
            var2.bridge$getPlayerByUniqueId((UUID)var10.getKey())
               .ifPresent(
                  var2x -> {
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var3x = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                        .bridge$getSoundHandler();
                     IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var10.getValue();
                     if (!var3x.bridge$isSoundPlaying(var4.source)) {
                        try {
                           var3x.bridge$destroySound(var4.source);
                        } catch (Exception var6x) {
                           var6x.printStackTrace();
                        }

                        if (var4.timestamp + 1000L > System.currentTimeMillis()) {
                           this.OOCIRICCCIORIRCHCRRRHHCICICIIR.remove(var10.getKey());
                           return;
                        }

                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((UUID)var10.getKey(), var4.CHHCIIOHOROIRRRHICCOIRCRRIRORC, var4.HHIRHRIIOIORHCIHIOHIIRRCCHHOIR);
                     }

                     var3x.bridge$setSoundLocation(var4.source, var2x.bridge$getPosX(), var2x.bridge$getPosY(), var2x.bridge$getPosZ());
                  }
               );
         }
      }
   }

   @Override
   protected Map<UUID, com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return new HashMap<>();
   }

   public void RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(
      List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1
   ) {
      this.CIOROHROCRRICHRIHORIHIHHCIOCRC = var1;
      this.OOIHIRRHCRHOCRCCCIHIHIIHOOIOIH();
   }

   public void IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Set<com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var1) {
      this.OCRRHCICHRHHOOHCCHOOHRIICIRHOI = var1;
      this.CRHCHHCHHICCHOHOHHCOICCRIRHHRR();
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1
   ) {
      com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .get(var1.bridge$getUniqueID());
      return var2 == null || var2.RROIRRCROOCOORHHICICOCHCRRCRIH();
   }

   public Optional<com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> OIROOCRCIRRRCICRHCCIRCCHRIRHRR(int var1) {
      return this.OCRRHCICHRHHOOHCCHOOHRIICIRHOI.stream().filter(var1x -> var1x.getSlotId() == var1).findFirst();
   }

   public void OOIHIRRHCRHOCRCCCIHIHIIHOOIOIH() {
      List var1 = this.IRIRIICCORRCHICCRRCRIRHCIIRROR()
         .stream()
         .map(
            var0 -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
               .RCCRRRIHRRHCIIHRIOHHROHIOOCRIC(var0.id())
         )
         .toList();
      JsonArray var2 = new JsonArray(var1.size());

      for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var1) {
         if (var4 != null) {
            JsonObject var5 = (JsonObject)var4.provide();
            var5.addProperty("active", this.IRHRIRCIOHRICHOIIIHCRIRICHOCIC().stream().anyMatch(var1x -> var1x.getEmoteId() == var4.getId()));
            var2.add(var5);
         }
      }

      this.RIHHRIHICOICHCRRRIHCOIROOHOCOI.IIHRRHORCRCROCHHOHORCHCROCIHRO("ownedEmotes", var2);
      this.RIHHRIHICOICHCRRRIHCOIROOHOCOI.IIHRRHORCRCROCHHOHORCHCROCIHRO("freeLunarPlusEmote", this.CCCHCROHOCRRROCOCOHIIHICICOHIH);
      this.RIHHRIHICOICHCRRRIHCOIROOHOCOI.IIHRRHORCRCROCHHOHORCHCROCIHRO("ownsLunarPlusEmote", this.CIIRHHOCHICCHICORIHHIIIHCHCCIO);
   }

   public void CRHCHHCHHICCHOHOHHCOICCRIRHHRR() {
      JsonArray var1 = new JsonArray(this.IRHRIRCIOHRICHOIIIHCRIRICHOCIC().size());

      for (com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3 : this.IRHRIRCIOHRICHOIIIHCRIRICHOCIC()) {
         if (var3 != null) {
            var1.add(var3.provide());
         }
      }

      this.RIHHRIHICOICHCRRRIHCOIROOHOCOI.IIHRRHORCRCROCHHOHORCHCROCIHRO("equippedEmotes", var1);
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.RIHHRIHICOICHCRRRIHCOIROOHOCOI;
   }

   @Generated
   public List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> IRIRIICCORRCHICCRRCRIRHCIIRROR() {
      return this.CIOROHROCRRICHRIHORIHIHHCIOCRC;
   }

   @Generated
   public Set<com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> IRHRIRCIOHRICHOIIIHCRIRICHOCIC() {
      return this.OCRRHCICHRHHOOHCCHOOHRIICIRHOI;
   }

   @Generated
   public Integer HCICOHIHICHHRHIOCHIOOORIOORORC() {
      return this.CCCHCROHOCRRROCOCOHIIHICICOHIH;
   }

   @Generated
   public void CCIHHRIOOOOCOHRCIHOHROOICIORCC(Integer var1) {
      this.CCCHCROHOCRRROCOCOHIIHICICOHIH = var1;
   }

   @Generated
   public void OIRRROORIIRHHROOCCRIIIRRIOCCCO(boolean var1) {
      this.CIIRHHOCHICCHICORIHHIIIHCHCCIO = var1;
   }

   @Generated
   public Map<UUID, IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IIHOOICIOCRRCHOIRRHCCRHIOCRICC() {
      return this.OOCIRICCCIORIRCHCRRRHHCICICIIR;
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private long timestamp;
      private Object source;
      private final String CHHCIIOHOROIRRRHICCOIRCRRIRORC;
      private final int HHIRHRIIOIORHCIHIOHIIRRCCHHOIR;

      @Generated
      public long getTimestamp() {
         return this.timestamp;
      }

      @Generated
      public Object getSource() {
         return this.source;
      }

      @Generated
      public String HOHCHOCIRIRCHCRICIOHOCHOOOOICO() {
         return this.CHHCIIOHOROIRRRHICCOIRCRRIRORC;
      }

      @Generated
      public int getJamId() {
         return this.HHIRHRIIOIORHCIHIOHIIRRCCHHOIR;
      }

      @Generated
      public void setTimestamp(long var1) {
         this.timestamp = var1;
      }

      @Generated
      public void RCCCROCHCICCROHCOCCRRROCIIHCCH(Object var1) {
         this.source = var1;
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1, Object var3, String var4, int var5) {
         this.timestamp = var1;
         this.source = var3;
         this.CHHCIIOHOROIRRRHICCOIRCRRIRORC = var4;
         this.HHIRHRIIOIORHCIHIOHIIRRCCHHOIR = var5;
      }
   }
}
