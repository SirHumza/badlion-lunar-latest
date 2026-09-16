package com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import lombok.Generated;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private static final int RHIRRRROOCHOOIHRCHIHHHIOCORHIC = 60000;
   private static final int CHCCORICCORCRCCCROIRRRHHICIORO = 15000;
   private static final long CIIIRRRRCOIRHRRRHHIORRHHCHOHIO = 60000000000L;
   private static final long ICRHRHIIIOHHIHOCCRHIRCROICHORC = 15000000000L;
   private int OCRRHIOHHOOCIOIROOOCRHRIOHRHCR = 0;
   private long HRHORHCHCROORIOCHCRRIHRRRHRHIH;

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO() {
      this.OOHORHCCCIHOCCRIHIIOCRORHOROII();
   }

   public void OOHORHCCCIHOCCRIHIIOCRORHOROII() {
      this.HRHORHCHCROORIOCHCRRIHRRRHRHIH = System.nanoTime();
   }

   public boolean IORRORCRRHRRORHIRHRROHCRRIHRII(long var1) {
      return var1 - this.HRHORHCHCROORIOCHCRRIHRRRHRHIH >= 60000000000L;
   }

   public float OIICIRRCOOCIHRHOIOIOOROCRHCHIC(long var1) {
      long var3 = var1 - this.HRHORHCHCROORIOCHCRRIHRRRHRHIH;
      if (var3 > 60000000000L) {
         return 1.0F;
      }

      if (var3 < 15000000000L) {
         return 0.0F;
      }

      float var5 = (int)(var3 / 1000000L);
      return var5 / 45000.0F;
   }

   @Generated
   public void IIOOCCIIOHHIIRRIOHRIHROIOCHOCH(int var1) {
      this.OCRRHIOHHOOCIOIROOOCRHRIOHRHCR = var1;
   }

   @Generated
   public int HIOIIRIOOIICIIIIIOROIHICIRRRRI() {
      return this.OCRRHIOHHOOCIOIROOOCRHRIOHRHCR;
   }
}
