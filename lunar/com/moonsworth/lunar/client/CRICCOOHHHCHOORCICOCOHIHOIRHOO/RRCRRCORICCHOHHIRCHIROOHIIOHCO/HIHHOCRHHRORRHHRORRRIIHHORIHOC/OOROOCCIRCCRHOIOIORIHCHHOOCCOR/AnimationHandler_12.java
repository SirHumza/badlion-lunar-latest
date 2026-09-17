package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Objects;

public interface OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      double var2,
      double var4,
      double var6,
      boolean var8
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = Objects.requireNonNull(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
      );
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 35) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRIRROIOROICIOOCCOHOOROHHCOCO().bridge$setClientLoaded(true);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 28) {
         var9.bridge$setClientLoaded(true);
      }

      var9.bridge$setPreviousPosX(var1.getX());
      var9.bridge$setPreviousPosY(var1.getY());
      var9.bridge$setPreviousPosZ(var1.getZ());
      var1.setPos(var2, var4, var6);
      var9.bridge$lerpTo(var2, var4, var6, var1.getYaw(), var1.getPitch());
      var9.bridge$setOnGround(var8);
      var9.bridge$calculateEntityAnimation();
   }
}
