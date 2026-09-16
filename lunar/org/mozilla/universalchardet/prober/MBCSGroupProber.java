package org.mozilla.universalchardet.prober;

import java.util.ArrayList;
import java.util.List;

public class MBCSGroupProber extends CharsetProber {
   private CharsetProber.ProbingState state;
   private List<CharsetProber> probers = new ArrayList<>();
   private CharsetProber bestGuess;
   private int activeNum;

   public MBCSGroupProber() {
      this.probers.add(new UTF8Prober());
      this.probers.add(new SJISProber());
      this.probers.add(new EUCJPProber());
      this.probers.add(new GB18030Prober());
      this.probers.add(new EUCKRProber());
      this.probers.add(new Big5Prober());
      this.probers.add(new EUCTWProber());
      this.reset();
   }

   @Override
   public String getCharSetName() {
      if (this.bestGuess == null) {
         this.getConfidence();
         if (this.bestGuess == null) {
            this.bestGuess = this.probers.get(0);
         }
      }

      return this.bestGuess.getCharSetName();
   }

   @Override
   public float getConfidence() {
      float var1 = 0.0F;
      if (this.state == CharsetProber.ProbingState.FOUND_IT) {
         return 0.99F;
      }

      if (this.state == CharsetProber.ProbingState.NOT_ME) {
         return 0.01F;
      }

      for (CharsetProber var4 : this.probers) {
         if (var4.isActive()) {
            float var2 = var4.getConfidence();
            if (var1 < var2) {
               var1 = var2;
               this.bestGuess = var4;
            }
         }
      }

      return var1;
   }

   @Override
   public CharsetProber.ProbingState getState() {
      return this.state;
   }

   @Override
   public CharsetProber.ProbingState handleData(byte[] var1, int var2, int var3) {
      boolean var5 = true;
      byte[] var6 = new byte[var3];
      int var7 = 0;
      int var8 = var2 + var3;

      for (int var9 = var2; var9 < var8; var9++) {
         if ((var1[var9] & 128) != 0) {
            var6[var7++] = var1[var9];
            var5 = true;
         } else if (var5) {
            var6[var7++] = var1[var9];
            var5 = false;
         }
      }

      for (CharsetProber var10 : this.probers) {
         if (var10.isActive()) {
            CharsetProber.ProbingState var4 = var10.handleData(var6, 0, var7);
            if (var4 == CharsetProber.ProbingState.FOUND_IT) {
               this.bestGuess = var10;
               this.state = CharsetProber.ProbingState.FOUND_IT;
               break;
            }

            if (var4 == CharsetProber.ProbingState.NOT_ME) {
               var10.setActive(false);
               this.activeNum--;
               if (this.activeNum <= 0) {
                  this.state = CharsetProber.ProbingState.NOT_ME;
                  break;
               }
            }
         }
      }

      return this.state;
   }

   @Override
   public final void reset() {
      this.activeNum = 0;

      for (CharsetProber var2 : this.probers) {
         var2.reset();
         var2.setActive(true);
         this.activeNum++;
      }

      this.bestGuess = null;
      this.state = CharsetProber.ProbingState.DETECTING;
   }

   @Override
   public void setOption() {
   }
}
