package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   NONE("none"),
   TAIGA("taiga"),
   EXTREME_HILLS("extreme_hills"),
   JUNGLE("jungle"),
   MESA("mesa"),
   PLAINS("plains"),
   SAVANNA("savanna"),
   ICY("icy"),
   THEEND("the_end"),
   BEACH("beach"),
   FOREST("forest"),
   OCEAN("ocean"),
   DESERT("desert"),
   RIVER("river"),
   SWAMP("swamp"),
   MUSHROOM("mushroom"),
   NETHER("nether"),
   UNDERGROUND("underground"),
   MOUNTAIN("mountain");

   public final String name;
   public static final Map<String, HHCCIRHCCCIIRHCROHIORHIRHHIORH> BY_NAME = Arrays.stream(values())
      .collect(Collectors.toMap(HHCCIRHCCCIIRHCROHIORHIRHHIORH::getName, var0 -> (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var0));

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var3) {
      this.name = var3;
   }

   public String getName() {
      return this.name;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH byName(String var0) {
      return BY_NAME.get(var0);
   }
}
