package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final long IRCHHHRIRRRHIHCHCCOHCORRRIICCH;
   private long start;
   private double OOIIOHCIICCIOCHHCOCOCRIICHRORC;
   private boolean pressed;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(double var1) {
      this.IRCHHHRIRRRHIHCHCCOHCORRRIICCH = (long)(var1 * 1.0E9);
   }

   @Override
   public void HOIRIIORIIICHOOOHHCIOIICOHRROH() {
      this.OOIIOHCIICCIOCHHCOCOCRIICHRORC = this.IROORRRIICOHCHRICIHCHICOIHRICO();
      this.pressed = true;
      this.start = System.nanoTime();
   }

   @Override
   public void CIHIOIRCOOORICCICHCRCIICCCHIRR() {
      this.OOIIOHCIICCIOCHHCOCOCRIICHRORC = 1.0 + (1.0F - this.IROORRRIICOHCHRICIHCHICOIHRICO());
      this.pressed = false;
      this.start = System.nanoTime();
   }

   @Override
   public float IROORRRIICOHCHRICIHCHICOIHRICO() {
      float var1 = this.ICRHCHCOCIIIHCCRCHRICOCROCCHCO();
      if (var1 > 1.0F) {
         var1 = 2.0F - var1;
      }

      return var1;
   }

   @Override
   public float ICRHCHCOCIIIHCCRCHRICOCROCCHCO() {
      long var1 = System.nanoTime() - this.start;
      double var3 = (double)var1 / this.IRCHHHRIRRRHIHCHCCOHCORRRIICCH;
      var3 *= 2.0;
      var3 += this.OOIIOHCIICCIOCHHCOCOCRIICHRORC;
      if (var3 > 1.0 && this.pressed) {
         return 1.0F;
      } else {
         return var3 > 2.0 ? 2.0F : (float)var3;
      }
   }
}
