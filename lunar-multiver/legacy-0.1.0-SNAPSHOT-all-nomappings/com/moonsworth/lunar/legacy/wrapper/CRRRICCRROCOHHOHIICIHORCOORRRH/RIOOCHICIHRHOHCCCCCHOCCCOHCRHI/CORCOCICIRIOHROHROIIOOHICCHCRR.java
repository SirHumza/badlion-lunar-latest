package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import lombok.Generated;

public class CORCOCICIRIOHROHROIIOOHICCHCRR implements OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   private final Runnable ROHOIIOCOOCOHICIOCIRIIHORIIHHO;
   private final Runnable CHCHOCHIRCHOHHIRICIROCIIOOOCOI;

   public void bridge$setupState() {
      this.ROHOIIOCOOCOHICIOCIRIIHORIIHHO.run();
   }

   public void bridge$clearState() {
      this.CHCHOCHIRCHOHHIRICIROCIIOOOCOI.run();
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else {
         Runnable var3 = this.ROHOIIOCOOCOHICIOCIRIIHORIIHHO;
         Runnable var4 = var2.ROHOIIOCOOCOHICIOCIRIIHORIIHHO;
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Runnable var5 = this.CHCHOCHIRCHOHHIRICIROCIIOOOCOI;
            Runnable var6 = var2.CHCHOCHIRCHOHHIRICIROCIIOOOCOI;
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      Runnable var3 = this.ROHOIIOCOOCOHICIOCIRIIHORIIHHO;
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Runnable var4 = this.CHCHOCHIRCHOHHIRICIROCIIOOOCOI;
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Generated
   public CORCOCICIRIOHROHROIIOOHICCHCRR(Runnable var1, Runnable var2) {
      this.ROHOIIOCOOCOHICIOCIRIIHORIIHHO = var1;
      this.CHCHOCHIRCHOHHIRICIROCIIOOOCOI = var2;
   }
}
