package com.moonsworth.lunar.client.util;

public class IHRHHHORORIROOCORCIORRCOCHHHRI {
   private final byte[] CIRRHICRIHIOCRHOHCRCHIHICHHIHH;
   private final Object HHIOHCCRCRRCIICRROCOICRRIORCCR = new Object();
   private int HORRHIIRRROOCRIICHHROIHOHROIHH;
   private int OIRIHIRHROIROHHHOROOOIROORHIHI;
   private int IIOCORRIIORICIRROCHOOHCROCICCC;

   public IHRHHHORORIROOCORCIORRCOCHHHRI(int var1) {
      this.CIRRHICRIHIOCRHOHCRCHIHICHHIHH = new byte[var1];
   }

   public int CCOOICHCHIORCIHOIRHOCHHRHROHCO() {
      synchronized (this.HHIOHCCRCRRCIICRROCOICRRIORCCR) {
         return this.IIOCORRIIORICIRROCHOOHCROCICCC;
      }
   }

   public void write(byte[] var1, int var2, int var3) {
      synchronized (this.HHIOHCCRCRRCIICRROCOICRRIORCCR) {
         if (var3 > this.CIRRHICRIHIOCRHOHCRCHIHICHHIHH.length - this.IIOCORRIIORICIRROCHOOHCROCICCC) {
            System.err.println("RingBuffer overflow! Dropping " + var3 + " bytes.");
         } else {
            for (int var5 = 0; var5 < var3; var5++) {
               this.CIRRHICRIHIOCRHOHCRCHIHICHHIHH[this.HORRHIIRRROOCRIICHHROIHOHROIHH] = var1[var2 + var5];
               this.HORRHIIRRROOCRIICHHROIHOHROIHH = (this.HORRHIIRRROOCRIICHHROIHOHROIHH + 1) % this.CIRRHICRIHIOCRHOHCRCHIHICHHIHH.length;
            }

            this.IIOCORRIIORICIRROCHOOHCROCICCC += var3;
            this.HHIOHCCRCRRCIICRROCOICRRIORCCR.notifyAll();
         }
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, boolean var2) {
      int var3 = var1.length;
      synchronized (this.HHIOHCCRCRRCIICRROCOICRRIORCCR) {
         while (this.IIOCORRIIORICIRROCHOOHCROCICCC < var3) {
            if (!var2) {
               return false;
            }

            this.HHIOHCCRCRRCIICRROCOICRRIORCCR.wait();
         }

         for (int var5 = 0; var5 < var3; var5++) {
            var1[var5] = this.CIRRHICRIHIOCRHOHCRCHIHICHHIHH[this.OIRIHIRHROIROHHHOROOOIROORHIHI];
            this.OIRIHIRHROIROHHHOROOOIROORHIHI = (this.OIRIHIRHROIROHHHOROOOIROORHIHI + 1) % this.CIRRHICRIHIOCRHOHCRCHIHICHHIHH.length;
         }

         this.IIOCORRIIORICIRROCHOOHCROCICCC -= var3;
         return true;
      }
   }
}
