package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Random;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public Random random = new Random();

   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[] var1,
      String var2
   ) {
      super(var1, var2);
   }

   @Override
   public double doubleValue() {
      double var1;
      if (this.RCIOHOCORRORRRCIOIRIOCIRROICCO.length >= 3) {
         this.random.setSeed((long)this.ROORRRORCHHOOHIIORIHCORHCIOIHR(2).doubleValue());
         var1 = this.random.nextDouble();
      } else {
         var1 = Math.random();
      }

      if (this.RCIOHOCORRORRRCIOIRIOCIRROICCO.length >= 2) {
         double var3 = this.ROORRRORCHHOOHIIORIHCORHCIOIHR(0).doubleValue();
         double var5 = this.ROORRRORCHHOOHIIORIHCORHCIOIHR(1).doubleValue();
         double var7 = Math.min(var3, var5);
         double var9 = Math.max(var3, var5);
         var1 = var1 * (var9 - var7) + var7;
      } else if (this.RCIOHOCORRORRRCIOIRIOCIRROICCO.length >= 1) {
         var1 *= this.ROORRRORCHHOOHIIORIHCORHCIOIHR(0).doubleValue();
      }

      return var1;
   }
}
