package com.moonsworth.lunar.client.util;

import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.PublicServer;
import com.lunarclient.websocket.hostedworld.v1.AddressAndPort;
import com.lunarclient.websocket.hostedworld.v1.JoinHostedWorldRequest;
import com.lunarclient.websocket.hostedworld.v1.JoinHostedWorldResponse;
import com.lunarclient.websocket.hostedworld.v1.Joinability;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class COIHORRCHRRCHOCIRHHRRIOIHRIHCC implements com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final List<Runnable> COOOOHCCOCHCCROOCOORCCCIRHHCCC = new ArrayList<>();

   public COIHORRCHRRCHOCIRHHRRIOIHRIHCC() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI.class,
         var0 -> {
            while (COOOOHCCOCHCCROOCOORCCCIRHHCCC.size() > 0) {
               COOOOHCCOCHCCROOCOORCCCIRHHCCC.remove(0).run();
            }
         }
      );
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, JoinHostedWorldRequest.Source var1
   ) {
      if (var0.getLocation() != null) {
         if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()
            || IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer() == null
            || IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getIntegratedServer().bridge$isReady()) {
            if (var0.getLocation().getLocationCase() == Location.LocationCase.PUBLIC_SERVER) {
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0);
            } else if (var0.getLocation().getLocationCase() == Location.LocationCase.HOSTED_WORLD
               && var0.getHostedWorldJoinability() == Joinability.JOINABILITY_ALLOWED) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var0.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(), var0.ROCCHOHOIICCCROOHIHHHRORHCCIRI()
                  ),
                  var1
               );
            }
         }
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, JoinHostedWorldRequest.Source var1
   ) {
      com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CCRHICOCOHIIRIHCOCIRCHHROHCCRR();
      if (var2.OOHIRRIROCROCIHHIHIOOHHHCRRCOH()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getCurrentScreen();
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$displayScreen(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "hostedWorldJoin", var0, var2x -> {
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(var3);
                           var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)null);
                        }
                     )
                  )
            );
         IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
            .ifPresentOrElse(
               var4 -> {
                  var2.IIIIRHIHROIRCROHHROIHIIHRCRRHO(var0.uuid());
                  var4.IRROIHHOOHCIOHICHHROOOCOCHCCOI()
                     .joinHostedWorld(
                        null,
                        JoinHostedWorldRequest.newBuilder()
                           .setWorldHostUuid(CCHORHIOORICCIRIHRIIHIICORIORO.IRIHOIRCHIRRCRIOORCOICORHHORHH(var0.uuid()))
                           .setSource(var1)
                           .build(),
                        var3xx -> {
                           if (var3xx.getStatus() != JoinHostedWorldResponse.Status.STATUS_OK) {
                              com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 "Failed to join hosted world: " + var3xx.getStatus()
                              );
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(var3);
                              IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                 .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                                 .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR,
                                    IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                       .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                                       .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups", "hostedWorldErrorTitle"),
                                    IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                                       .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                                       .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("popups", "hostedWorldErrorContent", var3xx.getStatusValue())
                                 );
                           } else {
                              COOOOHCCOCHCCROOCOORCCCIRHHCCC.add(
                                 () -> {
                                    if (var2.OOOIIOOHHRRRORIHROOCHHCICOIIOC()) {
                                       var2.OCCCHCIRROHCIHCORORHIHOCHCHIII();
                                    }

                                    CHRCRHHRCCOICCOOIIRIOHCOHCHHIC.OOCHCRIRHOHRCIHHRCROOOIHCCOCIR();
                                    var2.IIIIRHIHROIRCROHHROIHIIHRCRRHO(var0.uuid());
                                    AddressAndPort var3xxx = var3xx.getRelay();
                                    com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4x = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                                       .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Hosted World", var3xxx.getAddress() + ":" + var3xxx.getPort(), false);
                                    var4x.bridge$disableResourcePack();
                                    IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$connect(var4x, null);
                                    var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
                                 }
                              );
                           }
                        }
                     );
               },
               () -> {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(var3);
                  var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)null);
               }
            );
      }
   }

   private static void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      CHRCRHHRCCOICCOOIIRIOHCOHCHHIC.OOCHCRIRHOHRCIHHRCROOOIHCCOCIR();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(null);
      PublicServer var1 = var0.getLocation().getPublicServer();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$connect(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getName(), var1.getPrimaryAddress(), false),
            null
         );
   }

   public static void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getCurrentScreen();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$displayScreen(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "hostedWorldInvite",
                     var0.ROCCHOHOIICCCROOHIHHHRORHCCIRI(),
                     var0.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(),
                     "invite",
                     var2 -> {
                        if (var2) {
                           com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .CCRHICOCOHIIRIHCOCIRCHHROHCCRR();
                           var3.OCIROOIHIHRHOCCHIIIROOCRIIOCRR(var0.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI());
                           var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3.IORRRROCRRCHCHHRCCOHCRRCRHCRHH().HIRROICHOOICOOCOCHIROHOCCHCOIR());
                        }

                        IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayScreen(var1);
                     }
                  )
               )
         );
   }

   public static boolean CORCOCICIRIOHROHROIIOOHICCHCRR(com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession() == null
         || var0.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()
            .equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession().bridge$getProfile().getId())) {
         return false;
      }

      if (var0.getLocation() == null) {
         return false;
      }

      return switch (var0.getLocation().getLocationCase()) {
         case PUBLIC_SERVER -> true;
         case HOSTED_WORLD -> !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CCRHICOCOHIIRIHCOCIRCHHROHCCRR()
               .OOIRIHORHICIIOIIIRCOROROICCICR()
            || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().HCCCOOOCHRCRRRORROHRCHCCCCCIHC().uuid()
               != var0.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI();
         default -> false;
      };
   }

   public static com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSession() != null && var0.getLocation() != null) {
         if (var0.getLocation().getLocationCase() == Location.LocationCase.HOSTED_WORLD) {
            boolean var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OOIRIHORHICIIOIIIRCOROROICCICR()
               && var0.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()
                  .equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().CIOOORRCOROIHHIHIOIRRRHRHOORRR());
            Set var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().CHICCROOICRRCRCCCOOCIOIHOIIRHC();
            boolean var4;
            synchronized (var3) {
               var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OOOIIOOHHRRRORIHROOCHHCICOIIOC()
                  && var3.stream().anyMatch(var1x -> var1x.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI().equals(var0.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()));
            }

            if (var0.getHostedWorldJoinability() != Joinability.JOINABILITY_UNSPECIFIED && !var2 && !var4) {
               if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OOHIRRIROCROCIHHIHIOOHHHCRRCOH()) {
                  var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO("joinWorldDisabled");
                  return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(217, 217, 217, 255),
                     OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(217, 217, 217, 191)
                  );
               }

               if (var0.getHostedWorldJoinability() == Joinability.JOINABILITY_ALLOWED) {
                  var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO("joinWorld");
                  return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(0, 255, 101, 255),
                     OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(0, 255, 101, 191)
                  );
               }

               if (var0.getHostedWorldJoinability() == Joinability.JOINABILITY_WORLD_FULL) {
                  var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO("worldFull");
               } else if (var0.getHostedWorldJoinability() == Joinability.JOINABILITY_INCOMPATIBLE_MINECRAFT_VERSION) {
                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var0.IHRHCIIHICCCIRHHIOOICIIIIOHCCC();
                  String var6 = var5 != null ? var5.getDisplayName() : "unknown version";
                  var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO("worldRequiresVersion", var6);
               } else {
                  var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO("worldUnrecognizedError");
               }

               return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(217, 217, 217, 255),
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(217, 217, 217, 191)
               );
            }
         } else if (var0.getLocation().getLocationCase() == Location.LocationCase.PUBLIC_SERVER) {
            var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO("joinServer");
            return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(0, 255, 101, 255),
               OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(0, 255, 101, 191)
            );
         }

         return null;
      } else {
         return null;
      }
   }
}
