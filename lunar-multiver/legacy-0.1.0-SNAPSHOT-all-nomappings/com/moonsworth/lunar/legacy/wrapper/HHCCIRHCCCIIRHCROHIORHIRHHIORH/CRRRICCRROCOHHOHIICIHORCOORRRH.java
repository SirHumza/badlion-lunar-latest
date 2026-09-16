package com.moonsworth.lunar.legacy.wrapper.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private double RIRRIIRORORHHIIRRRHHCHRCCCHCIH = 0.0;
   private double RCIHHIROCCHRHCRRICRICCCCRCIRRH = 0.0;
   private double HRICRHHHCOHROIRHIIICHCRCRIIRRH = 6.0E7;
   private double HOCIORROCIHOROCIHOROOHIRHRORHO = this.HRICRHHHCOHROIRHIIICHCRCRIIRRH;
   private long RIIHOCROCCIRCHOIRIOHOOIHHRIHCC;
   private long startTime;
   private int ROOHRHORRCROOCORIRCIRRRHIOHCOC = 29999984;
   private double ROIROHRIIHRCIRCRIROIOORCIROCHR = 0.2;
   private double HOHHRROHRHCHIORORRIORRHHCHOCCH = 5.0;
   private int HOCCIIIHRRICRRCRIHOHHROIRICCHC = 15;
   private int OIRRCIHCCHOCRCOCHCCOICROCICHOH = 5;

   public boolean contains(double var1, double var3) {
      var1 = Math.floor(var1);
      var3 = Math.floor(var3);
      return var1 + 1.0 > this.minX() && var1 < this.maxX() && var3 + 1.0 > this.minZ() && var3 < this.maxZ();
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AxisAlignedBB var1) {
      return var1.maxX > this.minX() && var1.minX < this.maxX() && var1.maxZ > this.minZ() && var1.minZ < this.maxZ();
   }

   public double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Entity var1) {
      return this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var1.posX, var1.posZ);
   }

   public double RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(double var1, double var3) {
      double var5 = var3 - this.minZ();
      double var7 = this.maxZ() - var3;
      double var9 = var1 - this.minX();
      double var11 = this.maxX() - var1;
      double var13 = Math.min(var9, var11);
      var13 = Math.min(var13, var5);
      return Math.min(var13, var7);
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROCIICICHIOIOHCIHRROOOHIIHRHHC() {
      return this.HOCIORROCIHOROCIHOROOHIRHRORHO < this.HRICRHHHCOHROIRHIIICHCRCRIIRRH
         ? CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SHRINKING
         : (
            this.HOCIORROCIHOROCIHOROOHIRHRORHO > this.HRICRHHHCOHROIRHIIICHCRCRIIRRH
               ? CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GROWING
               : CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STATIONARY
         );
   }

   public double minX() {
      double var1 = this.getCenterX() - this.getDiameter() / 2.0;
      if (var1 < -this.ROOHRHORRCROOCORIRCIRRRHIOHCOC) {
         var1 = -this.ROOHRHORRCROOCORIRCIRRRHIOHCOC;
      }

      return var1;
   }

   public double minZ() {
      double var1 = this.IIHOOIHRIICCRRRCCIIOIIHIRRIICC() - this.getDiameter() / 2.0;
      if (var1 < -this.ROOHRHORRCROOCORIRCIRRRHIOHCOC) {
         var1 = -this.ROOHRHORRCROOCORIRCIRRRHIOHCOC;
      }

      return var1;
   }

   public double maxX() {
      double var1 = this.getCenterX() + this.getDiameter() / 2.0;
      if (var1 > this.ROOHRHORRCROOCORIRCIRRRHIOHCOC) {
         var1 = this.ROOHRHORRCROOCORIRCIRRRHIOHCOC;
      }

      return var1;
   }

   public double maxZ() {
      double var1 = this.IIHOOIHRIICCRRRCCIIOIIHIRRIICC() + this.getDiameter() / 2.0;
      if (var1 > this.ROOHRHORRCROOCORIRCIRRRHIOHCOC) {
         var1 = this.ROOHRHORRCROOCORIRCIRRRHIOHCOC;
      }

      return var1;
   }

   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(double var1, double var3) {
      this.RIRRIIRORORHHIIRRRHHCHRCCCHCIH = var1;
      this.RCIHHIROCCHRHCRRICRICCCCRCIRRH = var3;
   }

   public double getDiameter() {
      if (this.ROCIICICHIOIOHCIHRROOOHIIHRHHC() != CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STATIONARY) {
         double var1 = (float)(System.currentTimeMillis() - this.startTime) / (float)(this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC - this.startTime);
         if (var1 < 1.0) {
            return this.HRICRHHHCOHROIRHIIICHCRCRIIRRH + (this.HOCIORROCIHOROCIHOROOHIRHRORHO - this.HRICRHHHCOHROIRHIIICHCRCRIIRRH) * var1;
         }

         this.COIOORHCRHCRCOROOHCHIRRIIOIOHR(this.HOCIORROCIHOROCIHOROOHIRHRORHO);
      }

      return this.HRICRHHHCOHROIRHIIICHCRCRIIRRH;
   }

   public long HOOCHRORCOIRICRICOICORIHCICICC() {
      return this.ROCIICICHIOIOHCIHRROOOHIIHRHHC() != CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STATIONARY
         ? this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC - System.currentTimeMillis()
         : 0L;
   }

   public double COOCICHRRHOOROIHIOHCIRICCOHCOC() {
      return this.HOCIORROCIHOROCIHOROOHIRHRORHO;
   }

   public void COIOORHCRHCRCOROOHCHIRRIIOIOHR(double var1) {
      this.HRICRHHHCOHROIRHIIICHCRCRIIRRH = var1;
      this.HOCIORROCIHOROCIHOROOHIRHRORHO = var1;
      this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC = System.currentTimeMillis();
      this.startTime = this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC;
   }

   public void setTransition(double var1, double var3, long var5) {
      if (var5 == 0L) {
         this.COIOORHCRHCRCOROOHCHIRRIIOIOHR(var3);
      } else {
         this.HRICRHHHCOHROIRHIIICHCRCRIIRRH = var1;
         this.HOCIORROCIHOROCIHOROOHIRHRORHO = var3;
         this.startTime = System.currentTimeMillis();
         this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC = this.startTime + var5;
      }
   }

   public int getSize() {
      return this.ROOHRHORRCROOCORIRCIRRRHIOHCOC;
   }

   public void setSize(int var1) {
      this.ROOHRHORRCROOCORIRCIRRRHIOHCOC = var1;
   }

   public double CHICCORHOHRICIIORHOCCIRRIOOOOR() {
      return this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC == this.startTime
         ? 0.0
         : Math.abs(this.HRICRHHHCOHROIRHIIICHCRCRIIRRH - this.HOCIORROCIHOROCIHOROOHIRHRORHO) / (this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC - this.startTime);
   }

   @Generated
   public double getCenterX() {
      return this.RIRRIIRORORHHIIRRRHHCHRCCCHCIH;
   }

   @Generated
   public double IIHOOIHRIICCRRRCCIIOIIHIRRIICC() {
      return this.RCIHHIROCCHRHCRRICRICCCCRCIRRH;
   }

   @Generated
   public double HIRICIRHRRHHHICIICRROOHCIOHRRR() {
      return this.HRICRHHHCOHROIRHIIICHCRCRIIRRH;
   }

   @Generated
   public double IRORRCCCHHCHOROHHIOOOOHCRIRHCC() {
      return this.HOCIORROCIHOROCIHOROOHIRHRORHO;
   }

   @Generated
   public long ROHIICRIRROCRHRHOOHORCIRHOIOII() {
      return this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC;
   }

   @Generated
   public long getStartTime() {
      return this.startTime;
   }

   @Generated
   public int HICIIOIIIHCCRIIIIRCCCRCCOOHOHC() {
      return this.ROOHRHORRCROOCORIRCIRRRHIOHCOC;
   }

   @Generated
   public double ICRHCRRORRROOOOORRHHRIHHHIHROI() {
      return this.ROIROHRIIHRCIRCRIROIOORCIROCHR;
   }

   @Generated
   public double CICCHIRICCHROCRIOIORCORROHOOCO() {
      return this.HOHHRROHRHCHIORORRIORRHHCHOCCH;
   }

   @Generated
   public int OIHHCOICRIHCRCHCIHORRCRIOHCOCC() {
      return this.HOCCIIIHRRICRRCRIHOHHROIRICCHC;
   }

   @Generated
   public int RRCRRICOHCCCHIHCOCIHORCOCIIHOH() {
      return this.OIRRCIHCCHOCRCOCHCCOICROCICHOH;
   }

   @Generated
   public void HCHHOOOCRCRHHICHICORHOCHCCCHRH(double var1) {
      this.RIRRIIRORORHHIIRRRHHCHRCCCHCIH = var1;
   }

   @Generated
   public void CIIHHCHIRCRRIHOIOCCCROHOIOCCII(double var1) {
      this.RCIHHIROCCHRHCRRICRICCCCRCIRRH = var1;
   }

   @Generated
   public void COIRRRCIORROCHIROCHROCHICCICIC(double var1) {
      this.HRICRHHHCOHROIRHIIICHCRCRIIRRH = var1;
   }

   @Generated
   public void HIHCCHCCOCOHRICOICHRCOIHIIRIHO(double var1) {
      this.HOCIORROCIHOROCIHOROOHIRHRORHO = var1;
   }

   @Generated
   public void RHOORRIIOCHIRRHOHOOHIROHCRICRO(long var1) {
      this.RIIHOCROCCIRCHOIRIOHOOIHHRIHCC = var1;
   }

   @Generated
   public void IIOIROIHIHHCCRICRCOOCHIICHRCOI(long var1) {
      this.startTime = var1;
   }

   @Generated
   public void OOHRICHCIIIICRCOOHCORHHIHICOHO(int var1) {
      this.ROOHRHORRCROOCORIRCIRRRHIOHCOC = var1;
   }

   @Generated
   public void OOHRIIOOHROIOHCIRIHRHRRICRRHOI(double var1) {
      this.ROIROHRIIHRCIRCRIROIOORCIROCHR = var1;
   }

   @Generated
   public void RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(double var1) {
      this.HOHHRROHRHCHIORORRIORRHHCHOCCH = var1;
   }

   @Generated
   public void OROOIRCCRHCCHHCCROHICRICHOHOCC(int var1) {
      this.HOCCIIIHRRICRRCRIHOHHROIRICCHC = var1;
   }

   @Generated
   public void HCIOICHICROOHROOCOROIHRHIICHCI(int var1) {
      this.OIRRCIHCCHOCRCOCHCCOICROCICHOH = var1;
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      GROWING(4259712),
      SHRINKING(16724016),
      STATIONARY(2138367);

      private final int id;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var3) {
         this.id = var3;
      }

      public int getID() {
         return this.id;
      }
   }
}
