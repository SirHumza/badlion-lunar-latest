package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.webosr.config.SystemConfig;
import com.moonsworth.webosr.config.UltralightConfig;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<UltralightConfig> {
   private final boolean OICRIHROCRICCCOHRCCIHOCICIROOC;
   private final int sampleSizeGPU;
   private final String resourcePath;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(boolean var1, int var2, String var3) {
      super("UL", false);
      this.OICRIHROCRICCCOHRCCIHOCICIROOC = var1;
      this.sampleSizeGPU = var2;
      this.resourcePath = var3;
   }

   public UltralightConfig RHHRRIOHIICRIOHHIOOOHHOORCCRCI() {
      UltralightConfig var1 = new UltralightConfig();
      var1.sampleSizeGPU = this.sampleSizeGPU;
      var1.resourcePath = this.resourcePath;
      SystemConfig var2 = new SystemConfig();
      var2.display = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getWindow().bridge$getDisplayHandle();
      var2.window = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getWindow().bridge$getWindowHandle();
      var1.system = var2;
      var1.animationTimer = 0.008333333333333333;
      var1.scrollTimer = 0.008333333333333333;
      return var1;
   }
}
