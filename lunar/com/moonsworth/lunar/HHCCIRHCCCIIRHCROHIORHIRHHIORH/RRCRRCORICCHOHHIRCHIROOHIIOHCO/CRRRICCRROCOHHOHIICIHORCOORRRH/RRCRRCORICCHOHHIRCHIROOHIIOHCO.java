package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.util.Map;
import org.jetbrains.annotations.Contract;

public interface RRCRRCORICCHOHHIRCHIROOHIIOHCO extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getScoreboard();

   void bridge$disconnect();

   int bridge$getLoadedChunkCount();

   long bridge$getGameTime();

   long bridge$getDayTime();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 36)
   long bridge$getDayTimeline();

   @Override
   boolean bridge$isRaining();

   boolean bridge$isSnowing(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1);

   @Override
   boolean bridge$isThundering();

   boolean bridge$canMonstersSpawn(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1);

   default boolean bridge$canMonstersSpawn(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, Object var2
   ) {
      return this.bridge$canMonstersSpawn(var1);
   }

   int bridge$calculateSkylightSubtract(long var1);

   Iterable<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$entitiesForRendering();

   @Contract("_,false,false->fail")
   int bridge$getLightLevel(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, boolean var2, boolean var3
   );

   Map<Object, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getAllMapData();
}
