package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   protected long startTime;
   protected long CHIOHICHHCCCRORHORIOCCCHRCHHCR;
   protected long durationMs;
   protected boolean active = true;
   protected float OOHIRROCHIRRHHRHRIIOOHRRIRRRCR;
   protected long RCRHRCCCCCHIHIICHICRCIRIIORHII;
   protected final float RHOCIHIOCOCRRCROROROCOIORRHHIO;
   private boolean RRRIHHHHIHRCHCCRIIRHCOCOCIOCIC;
   private int IHCOHRCHCCOHIRHIIOIIHOORICRHHC = 1;
   private int RHCORHOHRRIOCICIIIHRHORRROOHII = 1;
   private boolean IOIIRRRROCROROROICCCHHHHHCCHOR;
   private boolean CICOHOCRCOCHRORHRICRIOOIIROHCH;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1, float var3) {
      this.durationMs = var1;
      this.RHOCIHIOCOCRRCROROROCOIORRHHIO = var3;
   }

   protected abstract float OCORHOIOHRHRIIRROCHRRROIOIOCRI();

   protected abstract long CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(float var1);

   public void start() {
      this.startTime = System.currentTimeMillis();
      this.active = true;
   }

   public void RCOCRROHHROHHOCRCCCHCIROIIOORC(long var1) {
      this.startTime = System.currentTimeMillis() - var1;
      this.active = true;
   }

   public void OROOOORIRRORHRCRRCCROCCOIOIHHC() {
      this.RRRIHHHHIHRCHCCRIIRHCOCOCIOCIC = true;
   }

   public boolean RCICROORIIICORORIRRCRHHCRICIOI() {
      return this.startTime != 0L;
   }

   public boolean CCHRRRORHHCHCOIIORCCRICOHICOHI() {
      return this.COIHHHIRRCOHCCCCCHCRRIORRCIOIR() <= 0L && this.active;
   }

   public void stop() {
      this.startTime = 0L;
      this.IHCOHRCHCCOHIRHIIOIIHOORICRHHC = 1;
      this.active = false;
   }

   public boolean HROOIHCCIIORCIHIORHCOROHIROICH() {
      return this.startTime != 0L && this.COIHHHIRRCOHCCCCCHCRRIORRCIOIR() > 0L;
   }

   private float HHCIICRIRRHCHIOCOORROROCCCHHRO() {
      if (this.startTime == 0L) {
         return 0.0F;
      } else {
         return this.COIHHHIRRCOHCCCCCHCRRIORRCIOIR() <= 0L ? 1.0F : this.OCORHOIOHRHRIIRROCHRRROIOIOCRI();
      }
   }

   public float OICICHCIIHCIHHRRROIIIIHIIICCRI() {
      if (this.startTime == 0L) {
         return 0.0F;
      }

      if (!this.CCHRRRORHHCHCOIIORCCRICOHICOHI()) {
         return this.active ? this.OCORHOIOHRHRIIRROCHRRROIOIOCRI() : this.OOHIRROCHIRRHHRHRIIOOHRRIRRRCR;
      }

      if (this.RRRIHHHHIHRCHCCRIIRHCOCOCIOCIC
         || this.RHCORHOHRRIOCICIIIHRHORRROOHII >= 1 && this.IHCOHRCHCCOHIRHIIOIIHOORICRHHC < this.RHCORHOHRRIOCICIIIHRHORRROOHII) {
         this.start();
         this.IHCOHRCHCCOHIRHIIOIIHOORICRHHC++;
      }

      return this.IOIIRRRROCROROROICCCHHHHHCCHOR ? 1.0F - this.RHOCIHIOCOCRRCROROROCOIORRHHIO : this.RHOCIHIOCOCRRCROROROCOIORRHHIO;
   }

   public void pause() {
      this.active = false;
      this.OOHIRROCHIRRHHRHRIIOOHRRIRRRCR = this.OCORHOIOHRHRIIRROCHRRROIOIOCRI();
      this.RCRHRCCCCCHIHIICHICRCIRIIORHII = System.currentTimeMillis() - this.startTime;
   }

   public void OIIIOCICICCCCHCHRIIOIIIOCCORCC() {
      this.startTime = System.currentTimeMillis() - this.RCRHRCCCCCHIHIICHICRCIRIIORHII;
      this.active = true;
   }

   public long OCHOHOCCICORHCCOHRIICHCIHIIIOI() {
      long var1;
      if (this.active) {
         var1 = this.COIHHHIRRCOHCCCCCHCRRIORRCIOIR();
      } else {
         var1 = System.currentTimeMillis() - this.RCRHRCCCCCHIHIICHICRCIRIIORHII + this.durationMs - System.currentTimeMillis();
      }

      return Math.min(this.durationMs, Math.max(0L, var1));
   }

   public long RHIHHOHCIOCRCOIHOHOHHCCCOIRCII() {
      return this.durationMs - this.OCHOHOCCICORHCCOHRIICHCIHIIIOI();
   }

   protected long COIHHHIRRCOHCCCCCHCRRIORRCIOIR() {
      return this.startTime + this.durationMs - System.currentTimeMillis();
   }

   @Generated
   public long getStartTime() {
      return this.startTime;
   }

   @Generated
   public long ORCHRHCRHIIROCIRHOHOIOIIROCORR() {
      return this.CHIOHICHHCCCRORHORIOCCCHRCHHCR;
   }

   @Generated
   public long getDurationMs() {
      return this.durationMs;
   }

   @Generated
   public void setDurationMs(long var1) {
      this.durationMs = var1;
   }

   @Generated
   public boolean isActive() {
      return this.active;
   }

   @Generated
   public float IHHIHHICHHOHHOCCOIHORRIHRHHHOC() {
      return this.OOHIRROCHIRRHHRHRIIOOHRRIRRRCR;
   }

   @Generated
   public long OHROOOIROCOIIRCIHIRHRCIIOCICHI() {
      return this.RCRHRCCCCCHIHIICHICRCIRIIORHII;
   }

   @Generated
   public float HHORRCHRIRRRRRIICICROICCIROOOR() {
      return this.RHOCIHIOCOCRRCROROROCOIORRHHIO;
   }

   @Generated
   public boolean IRIHIRRICCCHCIOCCOICIOOOCIHIHI() {
      return this.RRRIHHHHIHRCHCCRIIRHCOCOCIOCIC;
   }

   @Generated
   public void RORROCOIOHHOCCHRCHIIOHIHCRIIOO(int var1) {
      this.RHCORHOHRRIOCICIIIHRHORRROOHII = var1;
   }

   @Generated
   public void ROHHCOIHHRHOICCCRCCRRRHHHOIHCI(boolean var1) {
      this.IOIIRRRROCROROROICCCHHHHHCCHOR = var1;
   }

   @Generated
   public boolean RIIRIHIHRIICCICOOCRCRRCROHIIIO() {
      return this.IOIIRRRROCROROROICCCHHHHHCCHOR;
   }

   @Generated
   public boolean OIHRRCROCROOOOCIIOHCORHCOCHIIR() {
      return this.CICOHOCRCOCHRORHRICRIOOIIROHCH;
   }
}
