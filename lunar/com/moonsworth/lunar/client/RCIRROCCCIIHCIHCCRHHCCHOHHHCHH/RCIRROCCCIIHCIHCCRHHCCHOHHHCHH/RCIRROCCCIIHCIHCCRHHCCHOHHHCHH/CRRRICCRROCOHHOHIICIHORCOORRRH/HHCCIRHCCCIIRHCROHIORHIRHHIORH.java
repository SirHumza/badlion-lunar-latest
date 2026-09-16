package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private volatile boolean completed;
   private volatile boolean CCRIIHHOROCCHCCCCHRCCOROIHICIO;
   private final long RIIHOCROCCIRCHOIRIOHOOIHHRIHCC;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH ORIHRORHHHROICRRCCIIOCROCIHOIR;

   @Generated
   public boolean OROHIHCCRHRHOOHIOHHOICHIOHIOCO() {
      return this.completed;
   }

   @Generated
   public boolean RIRRCRRIHRORROIOOHIHIOCRIROOHC() {
      return this.CCRIIHHOROCCHCCCCHRCCOROIHICIO;
   }

   @Generated
   public long ROHIICRIRROCRHRHOOHORCIRHOIOII() {
      return this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC;
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH HROORRHRIICCHICHORHOHCCORICIIH() {
      return this.ORIHRORHHHROICRRCCIIOCROCIHOIR;
   }

   @Generated
   public void OHIIIOHIRIRCCRRIOIICCHHIORRHOH(boolean var1) {
      this.completed = var1;
   }

   @Generated
   public void IHICORCROOROHCIHIHCOIHRRHICICO(boolean var1) {
      this.CCRIIHHOROCCHCCCCHRCCOROIHICIO = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      this.ORIHRORHHHROICRRCCIIOCROCIHOIR = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         if (this.OROHIHCCRHRHOOHIOHHOICHIOHIOCO() != var2.OROHIHCCRHRHOOHIOHHOICHIOHIOCO()) {
            return false;
         }

         if (this.RIRRCRRIHRORROIOOHIHIOCRIROOHC() != var2.RIRRCRRIHRORROIOOHIHIOCRIROOHC()) {
            return false;
         }

         if (this.ROHIICRIRROCRHRHOOHORCIRHOIOII() != var2.ROHIICRIRROCRHRHOOHORCIRHOIOII()) {
            return false;
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = this.HROORRHRIICCHICHORHOHCCORICIIH();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = var2.HROORRHRIICCHICHORHOHCCORICIIH();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.OROHIHCCRHRHOOHIOHHOICHIOHIOCO() ? 79 : 97);
      var2 = var2 * 59 + (this.RIRRCRRIHRORROIOOHIHIOCRIROOHC() ? 79 : 97);
      long var3 = this.ROHIICRIRROCRHRHOOHORCIRHOIOII();
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = this.HROORRHRIICCHICHORHOHCCORICIIH();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "PingServerData(completed="
         + this.OROHIHCCRHRHOOHIOHHOICHIOHIOCO()
         + ", timedOut="
         + this.RIRRCRRIHRORROIOOHIHIOCRIROOHC()
         + ", endTime="
         + this.ROHIICRIRROCRHRHOOHORCIRHOIOII()
         + ", serverDataBridge="
         + this.HROORRHRIICCHICHORHOHCCORICIIH()
         + ")";
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      boolean var1,
      boolean var2,
      long var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5
   ) {
      this.completed = var1;
      this.CCRIIHHOROCCHCCCCHRCCOROIHICIO = var2;
      this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC = var3;
      this.ORIHRORHHHROICRRCCIIOCROCIHOIR = var5;
   }
}
