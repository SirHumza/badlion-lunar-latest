import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class qpMiJccKir0zxp7RsQeI0MCcc8M3kXUDlH8b0FlczmxkrI4wltEJtWGUbgaiXmOBYmmmlaYHH2zCyqKnts4vdY1wMl11yip3ZMod {
   private static final int BatModClient = (int)Math.pow(16.0, 0.0);
   private static final int Button = (int)Math.pow(16.0, 1.0);
   private static final int CustomSpinner = (int)Math.pow(16.0, 2.0);
   private final BitSet ButtonAction = new BitSet(4096);
   private static final int[] Spinner = new int[1352];
   private int Checkbox = 4096;
   private static final String ProgressBar = "CL_00002450";

   public void BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      this.ButtonAction
         .set(CustomSpinner(var1), true);
      this.Checkbox--;
   }

   private static int CustomSpinner(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var0
   ) {
      return BatModClient(
         var0.BatModProgressBar() & 15,
         var0.ColorChooser() & 15,
         var0.IntegerSpinner() & 15
      );
   }

   private static int BatModClient(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }

   public tFZoOEmbdxYXS5za8QxbYMYDCTQtcJCNBEZKD1vUm1RarcbdO9FHvRX5KUJVPnLXvnHYAnTSw3R2WOttiQMqXb5Jyy49GL1HRUhu BatModClient() {
      tFZoOEmbdxYXS5za8QxbYMYDCTQtcJCNBEZKD1vUm1RarcbdO9FHvRX5KUJVPnLXvnHYAnTSw3R2WOttiQMqXb5Jyy49GL1HRUhu var1 = new tFZoOEmbdxYXS5za8QxbYMYDCTQtcJCNBEZKD1vUm1RarcbdO9FHvRX5KUJVPnLXvnHYAnTSw3R2WOttiQMqXb5Jyy49GL1HRUhu();
      if (4096 - this.Checkbox < 256) {
         var1.BatModClient(true);
      } else if (this.Checkbox == 0) {
         var1.BatModClient(false);
      } else {
         for (int var5 : Spinner) {
            if (!this.ButtonAction.get(var5)) {
               var1.BatModClient(
                  this.BatModClient(var5)
               );
            }
         }
      }

      return var1;
   }

   public Set Button(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return this.BatModClient(
         CustomSpinner(var1)
      );
   }

   private Set BatModClient(int var1) {
      EnumSet var2 = EnumSet.noneOf(NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.class);
      ArrayDeque var3 = new ArrayDeque(384);
      var3.add(
         cRGPahlSIHGMQRrHVwLlav3gSgGE8J5Plxn6NQJsK5UNlTKUYnWLWJ12aGucpjbwT8ODpKz1vVMBcoI9ZamuVLfxa0zZPGzUGex.BatModClient(
            var1
         )
      );
      this.ButtonAction.set(var1, true);

      while (!var3.isEmpty()) {
         int var4 = (Integer)var3.poll();
         this.BatModClient(var4, var2);

         for (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var8 : NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ProgressBar) {
            int var9 = this.BatModClient(var4, var8);
            if (var9 >= 0 && !this.ButtonAction.get(var9)) {
               this.ButtonAction.set(var9, true);
               var3.add(
                  cRGPahlSIHGMQRrHVwLlav3gSgGE8J5Plxn6NQJsK5UNlTKUYnWLWJ12aGucpjbwT8ODpKz1vVMBcoI9ZamuVLfxa0zZPGzUGex.BatModClient(
                     var9
                  )
               );
            }
         }
      }

      return var2;
   }

   private void BatModClient(int var1, Set var2) {
      int var3 = var1 >> 0 & 15;
      if (var3 == 0) {
         var2.add(
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner
         );
      } else if (var3 == 15) {
         var2.add(
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox
         );
      }

      int var4 = var1 >> 8 & 15;
      if (var4 == 0) {
         var2.add(
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient
         );
      } else if (var4 == 15) {
         var2.add(
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button
         );
      }

      int var5 = var1 >> 4 & 15;
      if (var5 == 0) {
         var2.add(
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner
         );
      } else if (var5 == 15) {
         var2.add(
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ButtonAction
         );
      }
   }

   private int BatModClient(
      int var1, NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2
   ) {
      switch (ctpBdcXcq9TWJYfYgKWNCkv3rzxpc5l6Z3k8M2y4CGImOXZ2CALIBMvqlHvEFFDioweuSBXKtA1Y43ZRuX2NACTWbLVPyvzMeSvW.BatModClient[var2.ordinal()]) {
         case 1:
            if ((var1 >> 8 & 15) == 0) {
               return -1;
            }

            return var1 - CustomSpinner;
         case 2:
            if ((var1 >> 8 & 15) == 15) {
               return -1;
            }

            return var1 + CustomSpinner;
         case 3:
            if ((var1 >> 4 & 15) == 0) {
               return -1;
            }

            return var1 - Button;
         case 4:
            if ((var1 >> 4 & 15) == 15) {
               return -1;
            }

            return var1 + Button;
         case 5:
            if ((var1 >> 0 & 15) == 0) {
               return -1;
            }

            return var1 - BatModClient;
         case 6:
            if ((var1 >> 0 & 15) == 15) {
               return -1;
            }

            return var1 + BatModClient;
         default:
            return -1;
      }
   }

   static {
      boolean var0 = false;
      boolean var1 = true;
      int var2 = 0;

      for (int var3 = 0; var3 < 16; var3++) {
         for (int var4 = 0; var4 < 16; var4++) {
            for (int var5 = 0; var5 < 16; var5++) {
               if (var3 == 0 || var3 == 15 || var4 == 0 || var4 == 15 || var5 == 0 || var5 == 15) {
                  Spinner[var2++] = BatModClient(
                     var3, var4, var5
                  );
               }
            }
         }
      }
   }
}
