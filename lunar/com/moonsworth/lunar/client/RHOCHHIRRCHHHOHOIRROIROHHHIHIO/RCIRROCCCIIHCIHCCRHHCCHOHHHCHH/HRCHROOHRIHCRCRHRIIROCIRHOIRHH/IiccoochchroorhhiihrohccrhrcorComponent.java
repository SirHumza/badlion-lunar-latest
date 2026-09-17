package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.eliotlash.molang.utils.Interpolations;
import com.eliotlash.molang.utils.MolangUtils;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import lombok.Generated;
import software.bernie.geckolib3.core.easing.EasingManager;
import software.bernie.geckolib3.core.easing.EasingType;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final EasingType easingType;
   private final String ICRHRHIRRHIRRHHCRCOCHHOCRRCOCH;
   private double length;
   private boolean ORICRCICHCICCHIRIIOHIHHHCOCCCR;
   private long startTime = IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI();
   private boolean HOIOIIRHOHCOHIRICIIRCCRCRHCCRC = false;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(EasingType var1, String var2, double var3, boolean var5) {
      this.easingType = var1;
      this.ICRHRHIRRHIRRHHCRCOCHHOCRRCOCH = var2;
      this.length = var3;
      this.ORICRCICHCICCHIRIIOHIHHHCOCCCR = var5;
   }

   public double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, double var2, List<Double> var4) {
      if (var1 == this.ORICRCICHCICCHIRIIOHIHHHCOCCCR) {
         if (!this.HOIOIIRHOHCOHIRICIIRCCRCRHCCRC) {
            return MolangUtils.booleanToFloat(this.ORICRCICHCICCHIRIIOHIHHHCOCCCR);
         }

         this.startTime = IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI();
         this.ORICRCICHCICCHIRIIOHIHHHCOCCCR = !this.ORICRCICHCICCHIRIIOHIHHHCOCCCR;
      }

      if (!this.HOIOIIRHOHCOHIRICIIRCCRCRHCCRC) {
         this.startTime = IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI();
      }

      this.HOIOIIRHOHCOHIRICIIRCCRCRHCCRC = true;
      double var5 = this.startTime + var2 * 1000.0;
      double var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI() - this.startTime;
      double var9 = var7 / (var5 - this.startTime);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.CHHORHORHIIRRIHRCCHIIORIRCROCI() - this.startTime >= var2 * 1000.0) {
         this.HOIOIIRHOHCOHIRICIIRCCRCRHCCRC = false;
         this.ORICRCICHCICCHIRIIOHIHHHCOCCCR = var1;
         return MolangUtils.booleanToFloat(this.ORICRCICHCICCHIRIIOHIHHHCOCCCR);
      } else {
         var9 = EasingManager.ease(var9, this.easingType, var4);
         return Interpolations.lerp(MolangUtils.booleanToFloat(this.ORICRCICHCICCHIRIIOHIHHHCOCCCR), MolangUtils.booleanToFloat(var1), var9);
      }
   }

   @Generated
   public String getQuery() {
      return this.ICRHRHIRRHIRRHHCRCOCHHOCRRCOCH;
   }

   @Generated
   public double getLength() {
      return this.length;
   }
}
