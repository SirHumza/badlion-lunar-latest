package org.mozilla.universalchardet.prober;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.universalchardet.prober.sequence.HebrewModel;
import org.mozilla.universalchardet.prober.sequence.Ibm855Model;
import org.mozilla.universalchardet.prober.sequence.Ibm866Model;
import org.mozilla.universalchardet.prober.sequence.Koi8rModel;
import org.mozilla.universalchardet.prober.sequence.Latin5BulgarianModel;
import org.mozilla.universalchardet.prober.sequence.Latin5Model;
import org.mozilla.universalchardet.prober.sequence.Latin7Model;
import org.mozilla.universalchardet.prober.sequence.MacCyrillicModel;
import org.mozilla.universalchardet.prober.sequence.ThaiModel;
import org.mozilla.universalchardet.prober.sequence.Win1251BulgarianModel;
import org.mozilla.universalchardet.prober.sequence.Win1251Model;
import org.mozilla.universalchardet.prober.sequence.Win1253Model;

public class SBCSGroupProber extends CharsetProber {
   private CharsetProber.ProbingState state;
   private List<CharsetProber> probers = new ArrayList<>();
   private CharsetProber bestGuess;
   private int activeNum;

   public SBCSGroupProber() {
      this.probers.add(new SingleByteCharsetProber(new Win1251Model()));
      this.probers.add(new SingleByteCharsetProber(new Koi8rModel()));
      this.probers.add(new SingleByteCharsetProber(new Latin5Model()));
      this.probers.add(new SingleByteCharsetProber(new MacCyrillicModel()));
      this.probers.add(new SingleByteCharsetProber(new Ibm866Model()));
      this.probers.add(new SingleByteCharsetProber(new Ibm855Model()));
      this.probers.add(new SingleByteCharsetProber(new Latin7Model()));
      this.probers.add(new SingleByteCharsetProber(new Win1253Model()));
      this.probers.add(new SingleByteCharsetProber(new Latin5BulgarianModel()));
      this.probers.add(new SingleByteCharsetProber(new Win1251BulgarianModel()));
      this.probers.add(new SingleByteCharsetProber(new ThaiModel()));
      HebrewModel var1 = new HebrewModel();
      HebrewProber var2 = new HebrewProber();
      SingleByteCharsetProber var3 = new SingleByteCharsetProber(var1, false, var2);
      SingleByteCharsetProber var4 = new SingleByteCharsetProber(var1, true, var2);
      var2.setModalProbers(var3, var4);
      this.probers.add(var2);
      this.probers.add(var3);
      this.probers.add(var4);
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
      ByteBuffer var5 = this.filterWithoutEnglishLetters(var1, var2, var3);
      if (var5.position() != 0) {
         for (CharsetProber var7 : this.probers) {
            if (var7.isActive()) {
               CharsetProber.ProbingState var4 = var7.handleData(var5.array(), 0, var5.position());
               if (var4 == CharsetProber.ProbingState.FOUND_IT) {
                  this.bestGuess = var7;
                  this.state = CharsetProber.ProbingState.FOUND_IT;
                  break;
               }

               if (var4 == CharsetProber.ProbingState.NOT_ME) {
                  var7.setActive(false);
                  this.activeNum--;
                  if (this.activeNum <= 0) {
                     this.state = CharsetProber.ProbingState.NOT_ME;
                     break;
                  }
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
