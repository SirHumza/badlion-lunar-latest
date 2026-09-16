package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap.Builder;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class RIROICHCRROROHCCROOCCCCOCHCCRI extends RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static final BiMap<String, Integer> OCHOHHOIOIRCICHRRHHCOIORHHCIRH = new Builder()
      .put("oak", 0)
      .put("spruce", 1)
      .put("birch", 2)
      .put("jungle", 3)
      .put("acacia", 4)
      .put("dark_oak", 5)
      .build();
   private final String RCRCOCRRRHIROHCIRCIOHCCRCCIOIC;

   @Override
   protected String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2
   ) {
      return (String)OCHOHHOIOIRCICHRRHHCOIORHHCIRH.inverse().getOrDefault(var1, "oak");
   }

   @Override
   protected int HCIIICCOOORRIIRROCIIHIOHRRHIOI(String var1) {
      return (Integer)OCHOHHOIOIRCICHRRHHCOIORHHCIRH.getOrDefault(var1, 0);
   }

   @Override
   protected String COIROICCIRCOIOOOHROIRCOIOOORCH() {
      return "oak";
   }

   @NotNull
   @Override
   public String RRIICCIOCHRHOHIRIHCHRHOCOROOCC() {
      return this.RCRCOCRRRHIROHCIRCIOHCCRCCIOIC;
   }

   @Generated
   public RIROICHCRROROHCCROOCCCCOCHCCRI(String var1) {
      this.RCRCOCRRRHIROHCIRCIOHCCRCCIOIC = var1;
   }
}
