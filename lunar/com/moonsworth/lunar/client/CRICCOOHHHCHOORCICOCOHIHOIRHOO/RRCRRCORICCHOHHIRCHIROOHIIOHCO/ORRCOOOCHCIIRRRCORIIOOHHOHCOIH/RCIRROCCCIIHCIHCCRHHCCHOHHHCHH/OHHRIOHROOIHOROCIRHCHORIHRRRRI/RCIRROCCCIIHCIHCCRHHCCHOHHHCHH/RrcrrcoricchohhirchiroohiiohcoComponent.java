package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import javax.annotation.Nullable;
import lombok.Generated;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   EASY("Easy", RRCRRCORICCHOHHIRCHIROOHIIOHCO.GREEN),
   MEDIUM("Medium", RRCRRCORICCHOHHIRCHIROOHIIOHCO.YELLOW),
   HARD("Hard", RRCRRCORICCHOHHIRCHIROOHIIOHCO.RED);

   public static final int TASKS_PER_TIER = 7;
   private final String label;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO color;

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3, RRCRRCORICCHOHHIRCHIROOHIIOHCO var4) {
      this.label = var3;
      this.color = var4;
   }

   @Nullable
   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH fromLoreLine(String var0) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
         if (var0.equals(var4.label + " Task")) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public String getLabel() {
      return this.label;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO getColor() {
      return this.color;
   }
}
