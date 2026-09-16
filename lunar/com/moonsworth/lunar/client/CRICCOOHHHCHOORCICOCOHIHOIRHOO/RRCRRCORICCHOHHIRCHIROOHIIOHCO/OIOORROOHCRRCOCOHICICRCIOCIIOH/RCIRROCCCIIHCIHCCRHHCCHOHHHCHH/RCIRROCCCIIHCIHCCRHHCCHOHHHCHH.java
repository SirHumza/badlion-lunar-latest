package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private final List<CRICCOOHHHCHOORCICOCOHIHOIRHOO> COOICRIHHHRORIHOHIHRORIORIROIC;
   private int width = -1;
   private int height = -1;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO... var1) {
      if (var1 != null && var1.length != 0) {
         this.COOICRIHHHRORIHOHIHRORIORIROIC = Arrays.asList(var1);
      } else {
         this.COOICRIHHHRORIHOHIHRORIORIROIC = new ArrayList<>();
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO... var1) {
      Collections.addAll(this.COOICRIHHHRORIHOHIHRORIORIROIC, var1);
   }

   @Override
   public int getWidth() {
      if (this.width == -1) {
         this.width = 0;

         for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 : this.COOICRIHHHRORIHOHIHRORIORIROIC) {
            this.width = this.width + var2.getWidth();
         }
      }

      return this.width;
   }

   @Override
   public int getHeight() {
      if (this.height == -1) {
         this.height = 0;

         for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 : this.COOICRIHHHRORIHOHIHRORIORIROIC) {
            this.height = Math.max(this.height, var2.getHeight());
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
      var4 += this.getHeight() / 2;

      for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var6 : this.COOICRIHHHRORIHOHIHRORIORIROIC) {
         var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4 - var6.getHeight() / 2);
         var3 += var6.getWidth();
      }
   }
}
