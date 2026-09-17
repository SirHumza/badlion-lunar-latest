package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Objects;
import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   HYPIXEL_PARTY(
      "hypixelParty",
      (var0, var1, var2) -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RRCOIOICOHCCICIHRROICHRCRRORII()
         .RRRORRCHOHRRCICRIIIHHRHIRHIHIH()
         .HRCOOHCRCHOCHOIHIHHHCRHOCCOHRR()
         .map(
            com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH::IOICCIIRHOOCCHIOOCRRHRCROOHCCC
         )
         .map(
            var1x -> {
               boolean var2x = var1x.contains(var1.getName());
               if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                  && !var2x) {
                  String var3 = String.join(",", var1x);
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     "Hypixel Party Members: %s", var3
                  );
               }

               return var2x;
            }
         )
         .orElse(false)
   ),
   LUNAR_FRIENDS(
      "lunarFriends",
      (var0, var1, var2) -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RORROHRORCOOOOHRROHIOHCRHHCRCO()
         .HRRHRCCOOIOIIIRORIOOORORHOORIH(var1.getId())
   ),
   APOLLO(
      "apolloTeams",
      (var0, var1, var2) -> {
         CRHROHHHCIHHCOHCOORCRIHHIICROR var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .RHIIORHOIHHICHORHRIRHIIROCHOHO();
         com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var3.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .get(var1.getId());
         if (var4 == null) {
            if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
               )
             {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Markers] Apollo team check failed, no team member %s", var1.getId()
               );
            }

            return false;
         } else {
            if (var3.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4)) {
               return true;
            }

            if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
               )
             {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Markers] Apollo team check failed %s (%s <-> %s)",
                  var4.HRIOHCCIOOIORHRHCIRCRRIIOHCHHI(),
                  var4.OCHHROCHHOCHCCCHRHICROHCHROCCC(),
                  com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().getWorld()
               );
            }

            return false;
         }
      }
   ),
   SCOREBOARD(
      "scoreboardTeams",
      (var0, var1, var2) -> {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH();
         if (var3 == null) {
            return false;
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var3.bridge$getScoreboard();
         if (var4 == null) {
            if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
               )
             {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Markers] Scoreboard team check failed, sb is null"
               );
            }

            return false;
         } else {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = var4.bridge$getPlayersTeam(
               IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getName()
            );
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = var4.bridge$getPlayersTeam(
               var1.getName()
            );
            if (var5 != null && var6 != null) {
               return Objects.equals(var5, var6);
            }

            if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
               )
             {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Markers] Scoreboard team check failed, team is null %s %s %s", var1.getId(), var5 == null, var6 == null
               );
            }

            return false;
         }
      }
   ),
   NAME_COLOR(
      "colorTeams",
      (var0, var1, var2) -> {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getClientPacketListener();
         if (var3 == null) {
            return false;
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var3.bridge$getPlayerInfo(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID()
         );
         if (var4 == null) {
            return false;
         }

         Component var5 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getFirstColoredComponent(
            var4.bridge$formatName()
         );
         Component var6 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getFirstColoredComponent(
            var0.bridge$formatName()
         );
         if (var5 != null && var6 != null) {
            return Objects.equals(var5.style(), var6.style());
         }

         if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
            )
          {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               "[Markers] Name color team check failed, components null %s %s %s", var1.getId(), var5 == null, var6 == null
            );
         }

         return false;
      }
   );

   private final String id;
   private final CRRRICCRROCOHHOHIICIHORCOORRRH detectionFunction;

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Override
   public String id() {
      return this.id;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, CRRRICCRROCOHHOHIICIHORCOORRRH var4) {
      this.id = var3;
      this.detectionFunction = var4;
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH getDetectionFunction() {
      return this.detectionFunction;
   }
}
