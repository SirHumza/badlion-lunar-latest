package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import lombok.Generated;

public enum OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   DAY("☀"),
   NIGHT("☽"),
   RAIN("☔"),
   THUNDER("⚡");

   private final String icon;

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR getFromIcon(String var0) {
      for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var4 : values()) {
         if (var4.getIcon().equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   OOROOCCIRCCRHOIOIORIHCHHOOCCOR(String var3) {
      this.icon = var3;
   }

   @Generated
   public String getIcon() {
      return this.icon;
   }
}
