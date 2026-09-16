package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import it.unimi.dsi.fastutil.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.EnumMap;
import java.util.Optional;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   default Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> bridge$getBuffer(
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1
   ) {
      return Optional.empty();
   }

   default void bridge$renderUnbatchableAfter(IRRCCOICORICIHCHRHIHIHROIRHOCR var1, Runnable var2) {
      var1.bridge$setupRenderState();
      var2.run();
      var1.bridge$clearRenderState();
   }

   default void bridge$renderSortedBatchable(IRRCCOICORICIHCHRHIHIHROIRHOCR var1, Runnable var2) {
      var1.bridge$setupRenderState();
      var2.run();
      var1.bridge$clearRenderState();
   }

   default void bridge$contributeWeightedOrderings(
      EnumMap<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, Object2IntMap<Pair<IRRCCOICORICIHCHRHIHIHROIRHOCR, IRRCCOICORICIHCHRHIHIHROIRHOCR>>> var1
   ) {
   }
}
