package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;

import com.lunarclient.websocket.cosmetic.v2.BiomeTemperatureCondition;
import com.lunarclient.websocket.cosmetic.v2.DimensionCondition;
import com.lunarclient.websocket.cosmetic.v2.EquipCondition;
import com.lunarclient.websocket.cosmetic.v2.InLiquidCondition;
import com.lunarclient.websocket.cosmetic.v2.MovementStateCondition;
import com.lunarclient.websocket.cosmetic.v2.OnFireCondition;
import com.lunarclient.websocket.cosmetic.v2.PassengerOfEntityCondition;
import com.lunarclient.websocket.cosmetic.v2.RadioPlayingCondition;
import com.lunarclient.websocket.cosmetic.v2.ServerCondition;
import com.lunarclient.websocket.cosmetic.v2.TimeCondition;
import com.lunarclient.websocket.cosmetic.v2.WeatherCondition;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      super(false);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO, new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
      );
   }

   @Override
   public String getId() {
      return "COSMETIC_DEBUG_MOD";
   }

   @Override
   protected String IICHOOIOHOOOHOIROCHHIOCCRRCRRR() {
      return "Cosmetic Debug";
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCCIRORHIRRORROOOOCCHCRIORHOIC
         )
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<List<TextComponent>> {
      private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HCHCIHHHCRHCORHHCCCOHRCHHROIIO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR(
            "enabledColor"
         )
         .RCIICICHIIRIIRHHROCOOOHRROOIIC(-16736512)
         .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      private final OHHRIOHROOIHOROCIRHCHORIHRRRRI HIIIHIOIIHIIIRIORCCOHCCIIHHCHO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR(
            "disabledColor"
         )
         .RCIICICHIIRIIRHHROCOOOHRROOIIC(-6356992)
         .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      private final List<com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>> IHRORIICICHCOIIIIRIIROIRIIHOCR = List.of(
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder()
               .setMovementState(MovementStateCondition.newBuilder().setState(MovementStateCondition.State.STATE_SWIMMING).build())
               .build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setInLiquid(InLiquidCondition.newBuilder().setLiquid(InLiquidCondition.Liquid.LIQUID_WATER).build()).build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setOnFire(OnFireCondition.newBuilder().build()).build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setPassengerOfEntity(PassengerOfEntityCondition.newBuilder().setEntityId("minecraft:pig").build()).build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder()
               .setBiomeTemperature(BiomeTemperatureCondition.newBuilder().setTemperature(BiomeTemperatureCondition.Temperature.TEMPERATURE_HOT).build())
               .build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setRadioPlaying(RadioPlayingCondition.newBuilder().build()).build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setWeather(WeatherCondition.newBuilder().setWeather(WeatherCondition.Weather.WEATHER_RAIN).build()).build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setTime(TimeCondition.newBuilder().setTime(TimeCondition.Time.TIME_DAY).build()).build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setServer(ServerCondition.newBuilder().setServerIp("example-server").build()).build()
         ),
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            EquipCondition.newBuilder().setDimension(DimensionCondition.newBuilder().setDimensionId("minecraft:overworld").build()).build()
         )
      );

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(0.0F, 0.0F, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.TOP_LEFT);
      }

      @Override
      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
      ) {
         super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
         var1.CRRRICCRROCOHHOHIICIHORCOORRRH(this.HCHCIHHHCRHCORHHCCCOHRCHHROIIO, this.HIIIHIOIIHIIIRIORCCOHCCIIHHCHO);
      }

      @Override
      public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH RHRCHCRRICCCOOIHHROROOOICCOHRH() {
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHHIHHRICOHICCORICHHICCORCCCOH()
            .OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(false)
            .OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(false)
            .IROORIICOORCHOHRHRROCHROORHOHR();
      }

      @Override
      protected boolean ORHOCOHHHHOOHHCHHOIOIRHCIRIICH() {
         return false;
      }

      @Override
      protected boolean RRRCCHRHHHRHIOCIHRIOHHRHRICHHR() {
         return false;
      }

      @Override
      protected com.moonsworth.lunar.client.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIHHOIIRORCHCIHROROHOORCCCRCOH() {
         return com.moonsworth.lunar.client.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.LEFT;
      }

      @Override
      public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH HRRIHHICORIHCHICOHCCRCHCHOHRCH() {
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            18, 18, 700, 100, 200, 320
         );
      }

      @Nullable
      public List<TextComponent> IROCHOHCORHCOCCCOCHORCICRORIIC(boolean var1) {
         ArrayList var2 = new ArrayList();

         for (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.IHRORIICICHCOIIIIRIIROIRIIHOCR) {
            String var5 = var4.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH());
            if (var5 != null) {
               var2.add(
                  (TextComponent)Component.text(var4.HCOICHIRORIHROIRHHCCICCIHCRRRR().getConditionCase().name() + ": ")
                     .append(Component.text(var5, TextColor.color(this.HCHCIHHHCRHCORHHCCCOHRCHHROIIO.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F))))
               );
            }
         }

         return var2;
      }
   }
}
