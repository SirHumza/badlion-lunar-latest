package com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.Color;
import java.util.function.BiFunction;
import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   WAVE("wave", com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PI_MOTION_EASE_IN_OUT_STROKE, (var0, var1) -> {
      double var2 = (100.1F - var1.RRCOIRHOCOOCRHIRIIORRIRHCRORCC()) / 100.0F;
      double var4 = 2.0E7 * var2;
      double var6 = 1.0E10 * var2;
      float var8 = (float)((IICCOOCHCHROORHHIIHROHCCRHRCOR.RCOHICHHHORRICCHOIICRHICIOICIO() + var0.floatValue() * var4) / var6 % 1.0);
      return var1.getAlpha() << 24 | Color.HSBtoRGB(var8, var1.RCCCCCCOOIIOOOORRHIHHRCHICIHRH(), var1.COHCIHHHOIHOCROIIRCIHHIHICRCHI()) & 16777215;
   }),
   SHIFT("shift", com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PI_REPEAT_SQUARE_STROKE, (var0, var1) -> {
      double var2 = (100.1F - var1.RRCOIRHOCOOCRHIRIIORRIRHCRORCC()) / 100.0F;
      double var4 = 1.0E10 * var2;
      float var6 = (float)(IICCOOCHCHROORHHIIHROHCCRHRCOR.RCOHICHHHORRICCHOIICRHICIOICIO() / var4 % 1.0);
      return var1.getAlpha() << 24 | Color.HSBtoRGB(var6, var1.RCCCCCCOOIIOOOORRHIHHRCHICIHRH(), var1.COHCIHHHOIHOCROIIRCIHHIHICRCHI()) & 16777215;
   });

   private final String id;
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH icon;
   private final BiFunction<Float, com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Integer> color;

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Generated
   @Override
   public String id() {
      return this.id;
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH icon() {
      return this.icon;
   }

   @Generated
   public BiFunction<Float, com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Integer> color() {
      return this.color;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var3,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      BiFunction<Float, com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Integer> var5
   ) {
      this.id = var3;
      this.icon = var4;
      this.color = var5;
   }
}
