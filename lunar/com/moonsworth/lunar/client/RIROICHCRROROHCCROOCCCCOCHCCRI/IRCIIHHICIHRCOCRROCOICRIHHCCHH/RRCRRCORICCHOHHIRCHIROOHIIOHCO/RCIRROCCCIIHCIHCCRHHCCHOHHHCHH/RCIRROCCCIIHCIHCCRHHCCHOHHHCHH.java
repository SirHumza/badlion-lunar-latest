package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.websocket.cosmetic.v2.BiomeTemperatureCondition;
import com.lunarclient.websocket.cosmetic.v2.EquipCondition;
import org.apache.commons.lang3.Range;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<BiomeTemperatureCondition> {
   public static final float RIICOORIRIRCHRCOOOIHIIRRRROCHR = 0.2F;
   private static final Range<Float> RHHROIRRHROHRICOOHOHRHCHICCHRC = Range.between(-1.0F, 0.0F);
   private static final Range<Float> CCCCHRIOIRIOCCOHCHOHHORCHCHRRR = Range.between(1.0F, 2.0F);

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EquipCondition var1) {
      super(var1);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      BiomeTemperatureCondition var2
   ) {
      if (var1 == null) {
         return false;
      }

      float var3 = this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var1);

      return switch (this.HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var3)) {
         case TEMPERATURE_COLD -> var2.getTemperature() == BiomeTemperatureCondition.Temperature.TEMPERATURE_COLD;
         case TEMPERATURE_HOT -> var2.getTemperature() == BiomeTemperatureCondition.Temperature.TEMPERATURE_HOT;
         default -> false;
      };
   }

   @Override
   public String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 == null) {
         return null;
      }

      float var2 = this.RCIROOOOICRHCCRRCIORHHIRCOIIIC(var1);
      BiomeTemperatureCondition.Temperature var3 = this.HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var2);
      return var3 == BiomeTemperatureCondition.Temperature.TEMPERATURE_UNSPECIFIED ? null : var3.name();
   }

   private BiomeTemperatureCondition.Temperature HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(float var1) {
      if (RHHROIRRHROHRICOOHOHRHCHICCHRC.contains(var1)) {
         return BiomeTemperatureCondition.Temperature.TEMPERATURE_COLD;
      } else {
         return CCCCHRIOIRIOCCOHCHOHHORCHCHRRR.contains(var1)
            ? BiomeTemperatureCondition.Temperature.TEMPERATURE_HOT
            : BiomeTemperatureCondition.Temperature.TEMPERATURE_UNSPECIFIED;
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
