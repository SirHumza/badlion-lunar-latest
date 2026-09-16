package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Arrays;
import java.util.List;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   ENTITY(33),
   BLOCK_ENTITY(33),
   LEVEL(35);

   private final int minVersion;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
      this.minVersion = var3;
   }

   public static List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> valuesOnVersion() {
      return Arrays.stream(values()).filter(var0 -> var0.minVersion <= IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION).toList();
   }

   public boolean shouldRender() {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   public boolean shouldCancel() {
      return !this.shouldRender();
   }
}
