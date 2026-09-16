package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Integer> {
   private final int HIHCOCOIRIICOIOIIICRCOIRCRHRIO;
   private final int OCOOCHOOHOCHRIROCHRHCCOHCOHOCR;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var1, int var2, boolean var3, boolean var4) {
      super(var3, var4);
      this.HIHCOCOIRIICOIOIIICRCOIRCRHRIO = var1;
      this.OCOOCHOOHOCHRIROCHRHCCOHCOHOCR = var2;
   }

   public Integer RROOIOHOICHIROHRICCOHOHICOIIRO() {
      return this.HIHCOCOIRIICOIOIIICRCOIRCRHRIO;
   }

   public Integer ROOCHRCRCOCRIOIIRIHHHCCOCRIIOI() {
      return this.OCOOCHOOHOCHRIROCHRHCCOHCOHOCR;
   }

   @Override
   public String OCOCHIOCCCHOHOORHCCOIHICHRCRHO() {
      return "Integer";
   }

   public Integer HRCOCHHHCCIORCORCHIOOOCCCCHICH(double var1) {
      return (int)Math.round(var1);
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, int var1, boolean var2, boolean var3) {
      int var4 = 2;
      var4 = 31 * var4 + Integer.hashCode(var0);
      var4 = 31 * var4 + Integer.hashCode(var1);
      var4 = 31 * var4 + Boolean.hashCode(var2);
      var4 = 31 * var4 + Boolean.hashCode(var3);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var4x -> new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1, var2, var3));
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RRCRRCORICCHOHHIRCHIROOHIIOHCO var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         Integer var3 = this.RROOIOHOICHIROHRICCOHOHICOIIRO();
         Integer var4 = var2.RROOIOHOICHIROHRICCOHOHICOIIRO();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Integer var5 = this.ROOCHRCRCOCRIOIIRIHHHCCOCRIIOI();
            Integer var6 = var2.ROOCHRCRCOCRIOIIRIHHHCCOCRIIOI();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RRCRRCORICCHOHHIRCHIROOHIIOHCO;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      Integer var3 = this.RROOIOHOICHIROHRICCOHOHICOIIRO();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Integer var4 = this.ROOCHRCRCOCRIOIIRIHHHCCOCRIIOI();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }
}
