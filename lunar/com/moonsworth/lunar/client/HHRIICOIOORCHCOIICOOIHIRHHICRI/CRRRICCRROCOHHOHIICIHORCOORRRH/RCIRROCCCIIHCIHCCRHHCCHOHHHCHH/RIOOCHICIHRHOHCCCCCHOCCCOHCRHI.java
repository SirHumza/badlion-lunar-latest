package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Long> {
   private final long ROOOHCRRRCCCCCHRICCICHHCOOCCRR;
   private final long IHCRHRCROCIHHIIOOHICRHRHCRCORR;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(long var1, long var3, boolean var5, boolean var6) {
      super(var5, var6);
      this.ROOOHCRRRCCCCCHRICCICHHCOOCCRR = var1;
      this.IHCRHRCROCIHHIIOOHICRHRHCRCORR = var3;
   }

   public Long IICCOOHRICHHRRROCCIIIRHIHIOHII() {
      return this.ROOOHCRRRCCCCCHRICCICHHCOOCCRR;
   }

   public Long ROCHIRIOCCIOHICRRCCCOOIICHRIII() {
      return this.IHCRHRCROCIHHIIOOHICRHRHCRCORR;
   }

   @Override
   public String OCOCHIOCCCHOHOORHCCOIHICHRCRHO() {
      return "Long";
   }

   public Long IIHHICHCCCOHCHROIRIHICCHHOROCR(double var1) {
      return Math.round(var1);
   }

   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, long var2, boolean var4, boolean var5) {
      int var6 = 3;
      var6 = 31 * var6 + Long.hashCode(var0);
      var6 = 31 * var6 + Long.hashCode(var2);
      var6 = 31 * var6 + Boolean.hashCode(var4);
      var6 = 31 * var6 + Boolean.hashCode(var5);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var6x -> new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var2, var4, var5));
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         Long var3 = this.IICCOOHRICHHRRROCCIIIRHIHIOHII();
         Long var4 = var2.IICCOOHRICHHRRROCCIIIRHIHIOHII();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Long var5 = this.ROCHIRIOCCIOHICRRCCCOOIICHRIII();
            Long var6 = var2.ROCHIRIOCCIOHICRRCCCOOIICHRIII();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      Long var3 = this.IICCOOHRICHHRRROCCIIIRHIHIOHII();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Long var4 = this.ROCHIRIOCCIOHICRRCCCOOIICHRIII();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }
}
