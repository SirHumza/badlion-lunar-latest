package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Short> {
   private final short RHCCIOIHCHHOOCCOCIIHHIHRCIHROC;
   private final short CHHICHHOIHRCOCOHRHIICIHHCIRHCI;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(short var1, short var2, boolean var3, boolean var4) {
      super(var3, var4);
      this.RHCCIOIHCHHOOCCOCIIHHIHRCIHROC = var1;
      this.CHHICHHOIHRCOCOHRHIICIHHCIRHCI = var2;
   }

   public Short IOCIOCIHRIRROHIRICHICOOOICOROI() {
      return this.RHCCIOIHCHHOOCCOCIIHHIHRCIHROC;
   }

   public Short OOHRHCOICORIRIRRIRHHOHRCHRRHHH() {
      return this.CHHICHHOIHRCOCOHRHIICIHHCIRHCI;
   }

   @Override
   public String OCOCHIOCCCHOHOORHCCOIHICHRCRHO() {
      return "Short";
   }

   public Short IIIIRHIHROIRCROHHROIHIIHRCRRHO(double var1) {
      return (short)Math.round(var1);
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(short var0, short var1, boolean var2, boolean var3) {
      int var4 = 1;
      var4 = 31 * var4 + Short.hashCode(var0);
      var4 = 31 * var4 + Short.hashCode(var1);
      var4 = 31 * var4 + Boolean.hashCode(var2);
      var4 = 31 * var4 + Boolean.hashCode(var3);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4x -> new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, var1, var2, var3));
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         Short var3 = this.IOCIOCIHRIRROHIRICHICOOOICOROI();
         Short var4 = var2.IOCIOCIHRIRROHIRICHICOOOICOROI();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Short var5 = this.OOHRHCOICORIRIRRIRHHOHRCHRRHHH();
            Short var6 = var2.OOHRHCOICORIRIRRIRHHOHRCHRRHHH();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      Short var3 = this.IOCIOCIHRIRROHIRICHICOOOICOROI();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Short var4 = this.OOHRHCOICORIRIRRIRHHOHRCHRRHHH();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }
}
