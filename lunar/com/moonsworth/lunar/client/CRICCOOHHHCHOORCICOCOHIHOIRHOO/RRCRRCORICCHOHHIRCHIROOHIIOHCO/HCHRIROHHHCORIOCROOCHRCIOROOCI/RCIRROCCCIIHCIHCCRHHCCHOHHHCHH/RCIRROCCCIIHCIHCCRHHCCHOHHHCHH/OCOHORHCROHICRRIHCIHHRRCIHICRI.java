package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.BitSet;
import java.util.concurrent.ThreadLocalRandom;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final BitSet IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR = new BitSet(64);
   private long OORICRIRHRCIRCHOHOIIOCORHOIHOR = System.nanoTime();
   private int count = 0;

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      float var2,
      int var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
   ) {
      long var5 = System.nanoTime();

      while (var5 - this.OORICRIRHRCIRCHOHOIIOCORHOIHOR > 10000000L) {
         this.HIOIRHOCIIIORCIOHCIRRCRRHRCHOC();
         if (this.count < 64) {
            int var7 = ThreadLocalRandom.current().nextInt(2) + 3;
            if (this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.get(getIndex(var7, 7))) {
               do {
                  var7 = ThreadLocalRandom.current().nextInt(8);
               } while (this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.get(getIndex(var7, 7)));
            }

            this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.set(getIndex(var7, 7));
            this.count++;
         }

         this.OORICRIRHRCIRCHOHOIIOCORHOIHOR += 10000000L;
      }

      var4.push();
      var4.scale(var1.getWidth() / 8.0F, var1.getHeight() / 8.0F, 1.0F);
      var4.IIHRRHORCRCROCHHOHORCHCROCIHRO(180.0F);
      var4.CRICCOOHHHCHOORCICOCOHIHOIRHOO(-8.0F, -8.0F, 0.0F);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var3);
      var4.pop();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2
   ) {
      for (int var3 = 0; var3 < 8; var3++) {
         for (int var4 = 0; var4 < 8; var4++) {
            if (this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.get(getIndex(var3, var4))) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var4, 1.0F, 1.0F, var2);
            }
         }
      }
   }

   private void HIOIRHOCIIIORCIOHCIRRCRRHRCHOC() {
      for (int var1 = 0; var1 < 8; var1++) {
         for (int var2 = 0; var2 < 8; var2++) {
            boolean var3 = this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.get(getIndex(var1, var2));
            if (var3) {
               boolean var4 = var2 == 0;
               if (!var4) {
                  boolean var5 = this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.get(getIndex(var1, var2 - 1));
                  if (!var5) {
                     this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.set(getIndex(var1, var2 - 1));
                     this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.clear(getIndex(var1, var2));
                  } else {
                     if (var1 > 0) {
                        boolean var6 = this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.get(getIndex(var1 - 1, var2 - 1));
                        if (!var6) {
                           this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.set(getIndex(var1 - 1, var2 - 1));
                           this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.clear(getIndex(var1, var2));
                           continue;
                        }
                     }

                     if (var1 < 7) {
                        boolean var7 = this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.get(getIndex(var1 + 1, var2 - 1));
                        if (!var7) {
                           this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.set(getIndex(var1 + 1, var2 - 1));
                           this.IOHOIIHRCHCCCCCHHCHRHOCRCHOIRR.clear(getIndex(var1, var2));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static int getIndex(int var0, int var1) {
      return var1 * 8 + var0;
   }
}
