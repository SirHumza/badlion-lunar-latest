package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOROCROIRCHIHIHHOOIRIIIRRCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.ICOHIIIRCIORCORHRRROOOOCOOROIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Arrays;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC HROOCOCOCIRRHOCCOIHIIHOOOICOHO;
   private int volume;
   private String prettyName;
   private String[] CIROCHHRCRHOICHHIHHCIHCCRCROOC;
   private String OROOCRHHCIICHOHORROROICCIOORRO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, int var2) {
      this.HROOCOCOCIRRHOCCOIHIIHOOOICOHO = var1;
      this.volume = var2;
      String var3 = this.HROOCOCOCIRRHOCCOIHIIHOOOICOHO.bridge$getPath();
      String[] var4 = var3.split("\\.");
      this.CIROCHHRCRHOICHHIHHCIHCCRCROOC = Arrays.copyOfRange(var4, 0, var4.length - 1);
      this.OROOCRHHCIICHOHORROROICCIOORRO = var4[var4.length - 1];
      this.prettyName = ICOHIIIRCIORCORHRRROOOOCOOROIC.OORRROHOHHOOROORRRCCCOCCOOCCHI(var4[var4.length - 1]);
   }

   public String RCCCRIIRHCHHHOIORIRICHROIIRROO() {
      return StringUtils.join(this.CIROCHHRCRHOICHHIHHCIHCCRCROOC, ".");
   }

   public String HHHRICHCCIROCHHOCCHHOORCCOCCRI() {
      return this.RCCCRIIRHCHHHOIORIRICHROIIRROO() + "." + this.OROOCRHHCIICHOHORROROICCIOORRO;
   }

   public void setVolume(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RCORCHORIOHORCOOHOHRCICORHCOCO().isEnabled()) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getSoundHandler()
            .bridge$getSoundEngine()
            .bridge$setPlayingSoundVolume(this.HROOCOCOCIRRHOCCOIHIIHOOOICOHO, var1 * 0.01F);
         this.volume = var1;
      }
   }

   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getLocation() {
      return this.HROOCOCOCIRRHOCCOIHIIHOOOICOHO;
   }

   @Generated
   public int getVolume() {
      return this.volume;
   }

   @Generated
   public String getPrettyName() {
      return this.prettyName;
   }

   @Generated
   public String[] IORHORIOCOIIIHCOIRRROCOROICCCH() {
      return this.CIROCHHRCRHOICHHIHHCIHCCRCROOC;
   }

   @Generated
   public String IRIRRIIHCORORHHRRIORHCCCCHIHCO() {
      return this.OROOCRHHCIICHOHORROROICCIOORRO;
   }

   @Generated
   public void RORIRRHCCIORHCHHIOROHCHHRHIRRR(String var1) {
      this.prettyName = var1;
   }

   @Generated
   public void IHIRRIIORRHORHRORIHOROIRCORCOO(String[] var1) {
      this.CIROCHHRCRHOICHHIHHCIHCCRCROOC = var1;
   }

   @Generated
   public void OOHHRIOIRIHRHHOCCCCCIHIHCCOOIH(String var1) {
      this.OROOCRHHCIICHOHORROROICCIOORRO = var1;
   }
}
