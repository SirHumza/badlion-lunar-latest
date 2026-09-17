package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.ArrayList;
import java.util.List;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private int width = -1;
   private int height = -1;
   private final List<CRICCOOHHHCHOORCICOCOHIHOIRHOO> IRRRCOCORCIHOIRCOROHIRORHIOOCI = new ArrayList<>();

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CRICCOOHHHCHOORCICOCOHIHOIRHOO... var1) {
      for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 : var1) {
         if (var5 != null) {
            this.IRRRCOCORCIHOIRCOROHIRORHIOOCI.add(var5);
         }
      }
   }

   @Override
   public int getWidth() {
      if (this.width == -1) {
         this.width = 0;

         for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 : this.IRRRCOCORCIHOIRCOROHIRORHIOOCI) {
            this.width = Math.max(this.width, var2.getWidth());
         }
      }

      return this.width;
   }

   @Override
   public int getHeight() {
      if (this.height == -1) {
         this.height = 0;

         for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 : this.IRRRCOCORCIHOIRCOROHIRORHIOOCI) {
            this.height = this.height + var2.getHeight() + 1;
         }
      }

      return this.height;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3,
      int var4
   ) {
      var4++;

      for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var6 : this.IRRRCOCORCIHOIRCOROHIRORHIOOCI) {
         var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4);
         var4 += var6.getHeight() + 1;
      }
   }
}
