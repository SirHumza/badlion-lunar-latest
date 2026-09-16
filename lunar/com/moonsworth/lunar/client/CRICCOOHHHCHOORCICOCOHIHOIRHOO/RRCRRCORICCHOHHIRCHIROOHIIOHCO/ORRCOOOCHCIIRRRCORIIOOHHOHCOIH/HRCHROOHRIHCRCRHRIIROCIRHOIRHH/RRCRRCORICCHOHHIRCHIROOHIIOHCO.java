package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.util.Optional;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   GLOWING_MUSHROOM_CAVE("Glowing Mushroom Cave");

   @NotNull
   private final String scoreboardName;

   RRCRRCORICCHOHHIRCHIROOHIIOHCO(@NotNull String var3) {
      this.scoreboardName = var3;
   }

   public static Optional<RRCRRCORICCHOHHIRCHIROOHIIOHCO> fromScoreboard(@NotNull String var0) {
      for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 : values()) {
         if (var0.equals(var4.getScoreboardName())) {
            return Optional.of(var4);
         }
      }

      return Optional.empty();
   }

   @NotNull
   @Generated
   public String getScoreboardName() {
      return this.scoreboardName;
   }
}
