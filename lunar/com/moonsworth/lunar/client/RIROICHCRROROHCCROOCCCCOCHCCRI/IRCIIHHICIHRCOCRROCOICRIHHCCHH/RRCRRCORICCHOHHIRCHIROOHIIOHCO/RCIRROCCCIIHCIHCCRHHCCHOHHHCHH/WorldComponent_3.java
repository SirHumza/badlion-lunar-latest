package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.websocket.cosmetic.v2.EquipCondition;
import com.lunarclient.websocket.cosmetic.v2.WeatherCondition;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<WeatherCondition> {
   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(EquipCondition var1) {
      super(var1);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      WeatherCondition var2
   ) {
      if (var1 == null) {
         return false;
      }

      WeatherCondition.Weather var3 = this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var1);
      return var3 != WeatherCondition.Weather.WEATHER_UNSPECIFIED && var3 == var2.getWeather();
   }

   @Override
   public String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 == null) {
         return null;
      }

      WeatherCondition.Weather var2 = this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var1);
      return var2 == WeatherCondition.Weather.WEATHER_UNSPECIFIED ? null : var2.name();
   }

   private WeatherCondition.Weather IOHHOIIOCRHCHHCRORICCOHOHROOIH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = var1.bridge$getWorld();
      if (var2 == null) {
         return WeatherCondition.Weather.WEATHER_UNSPECIFIED;
      }

      if (var2.bridge$isThundering()) {
         return WeatherCondition.Weather.WEATHER_THUNDERSTORM;
      }

      if (var2.bridge$isRaining()) {
         float var3 = this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var1);
         if (var3 >= 2.0F) {
            return WeatherCondition.Weather.WEATHER_CLEAR;
         } else {
            return var3 < 0.15F ? WeatherCondition.Weather.WEATHER_SNOW : WeatherCondition.Weather.WEATHER_RAIN;
         }
      } else {
         return WeatherCondition.Weather.WEATHER_CLEAR;
      }
   }

   private float RCIROOOOICRHCCRRCIORHHIRCOIIIC(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = var1.bridge$getWorld();
      if (var2 == null) {
         return 0.2F;
      }

      int var3 = (int)Math.floor(var1.bridge$getPosX());
      int var4 = (int)Math.floor(var1.bridge$getPosY());
      int var5 = (int)Math.floor(var1.bridge$getPosZ());
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var2.bridge$getBiome(
         var3, var4, var5
      );
      return var6 == null
         ? 0.2F
         : var6.bridge$getTemperature(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var4, var5)
         );
   }
}
