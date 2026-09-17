package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.OptionalInt;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> HHHCHORRHRORHROHCCHICICIOHRHHC;
   private int width = -1;
   private int height = -1;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH... var1) {
      this.HHHCHORRHRORHROHCCHICICIOHRHHC = List.of(var1);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      this.HHHCHORRHRORHROHCCHICICIOHRHHC = var1;
   }

   public int getWidth() {
      if (this.width == -1) {
         OptionalInt var1 = this.HHHCHORRHRORHROHCCHICICIOHRHHC.stream().mapToInt(IRCIIHHICIHRCOCRROCOICRIHHCCHH::getWidth).max();
         this.width = var1.isPresent() ? var1.getAsInt() : -1;
      }

      return this.width;
   }

   public int getHeight() {
      if (this.height == -1) {
         this.height = this.HHHCHORRHRORHROHCCHICICIOHRHHC.stream().mapToInt(IRCIIHHICIHRCOCRROCOICRIHHCCHH::getHeight).sum()
            + IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .RIHHOIIHRHORCIRICCHHOOROHOHIRO()
               .COCIHCHRHIHCCIHOIRCOHOHCHHCIHI();
      }

      return this.height;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3,
      int var4
   ) {
      int var5 = var2.COCIHCHRHIHCCIHOIRCOHOHCHHCIHI() / 2;

      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : this.HHHCHORRHRORHROHCCHICICIOHRHHC) {
         var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4 + var5);
         var5 += var7.getHeight();
      }
   }

   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> CHHHCOCIOCOCOCOROHIOHOCHCIOCCC() {
      return this.HHHCHORRHRORHROHCCHICICIOHRHHC;
   }

   @Generated
   public void setWidth(int var1) {
      this.width = var1;
   }

   @Generated
   public void setHeight(int var1) {
      this.height = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         if (this.getWidth() != var2.getWidth()) {
            return false;
         }

         if (this.getHeight() != var2.getHeight()) {
            return false;
         }

         List var3 = this.CHHHCOCIOCOCOCOROHIOHOCHCIOCCC();
         List var4 = var2.CHHHCOCIOCOCOCOROHIOHOCHCIOCCC();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.getWidth();
      var2 = var2 * 59 + this.getHeight();
      List var3 = this.CHHHCOCIOCOCOCOROHIOHOCHCIOCCC();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "WAILALayout(rows=" + this.CHHHCOCIOCOCOCOROHIOHOCHCIOCCC() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ")";
   }
}
