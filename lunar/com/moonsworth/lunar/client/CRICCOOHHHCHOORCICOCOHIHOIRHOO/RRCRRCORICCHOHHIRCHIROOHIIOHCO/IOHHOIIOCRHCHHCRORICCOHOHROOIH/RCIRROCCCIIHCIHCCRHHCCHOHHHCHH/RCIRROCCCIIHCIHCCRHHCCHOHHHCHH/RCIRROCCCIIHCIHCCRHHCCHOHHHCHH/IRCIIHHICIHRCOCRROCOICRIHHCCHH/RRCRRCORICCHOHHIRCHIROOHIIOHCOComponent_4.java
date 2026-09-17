package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap.Builder;
import org.jetbrains.annotations.NotNull;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static final BiMap<String, Integer> ORRCOHRICOCORROIIOOCCOHIOORIHH = new Builder()
      .put("white", 15)
      .put("orange", 14)
      .put("magenta", 13)
      .put("light_blue", 12)
      .put("yellow", 11)
      .put("lime", 10)
      .put("pink", 9)
      .put("gray", 8)
      .put("silver", 7)
      .put("cyan", 6)
      .put("purple", 5)
      .put("blue", 4)
      .put("brown", 3)
      .put("green", 2)
      .put("red", 1)
      .put("black", 0)
      .build();
   private final String OHIRRIOIRCCOIIIOOCHRHIHCICCIIC;
   private final boolean IHCOICCCIHCICOHIRHRRIORRHHHHRR;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, boolean var2) {
      this.OHIRRIOIRCCOIIIOOCHRHIHCICCIIC = var1;
      this.IHCOICCCIHCICOHIRHRRIORRHHHHRR = var2;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1) {
      this(var1, true);
   }

   @Override
   protected String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2
   ) {
      return (String)ORRCOHRICOCORROIIOOCCOHIOORIHH.inverse().getOrDefault(this.IHCOICCCIHCICOHIRHRRIORRHHHHRR ? 15 - var1 : var1, "black");
   }

   @Override
   protected int HCIIICCOOORRIIRROCIIHIOHRRHIOI(String var1) {
      int var2 = (Integer)ORRCOHRICOCORROIIOOCCOHIOORIHH.getOrDefault(var1, 15);
      return this.IHCOICCCIHCICOHIRHRRIORRHHHHRR ? 15 - var2 : var2;
   }

   @Override
   protected String COIROICCIRCOIOOOHROIRCOIOOORCH() {
      return "white";
   }

   @NotNull
   @Override
   public String RRIICCIOCHRHOHIRIHCHRHOCOROOCC() {
      return this.OHIRRIOIRCCOIIIOOCHRHIHCICCIIC;
   }
}
