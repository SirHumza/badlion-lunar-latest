import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

public class y4RVf9xrblSa6XMoTqo38x3yDt9iLwsVKaSTROLpadXcZ7ZlMToPbSJZc3pF7kBaEa6NL19ZpMBs2DtDgjiWYqsv2jSXCaEhLdcc {
   private final Predicate[][][] BatModClient;
   private final int Button;
   private final int CustomSpinner;
   private final int ButtonAction;

   public y4RVf9xrblSa6XMoTqo38x3yDt9iLwsVKaSTROLpadXcZ7ZlMToPbSJZc3pF7kBaEa6NL19ZpMBs2DtDgjiWYqsv2jSXCaEhLdcc(Predicate[][][] var1) {
      this.BatModClient = var1;
      this.Button = var1.length;
      if (this.Button > 0) {
         this.CustomSpinner = var1[0].length;
         if (this.CustomSpinner > 0) {
            this.ButtonAction = var1[0][0].length;
         } else {
            this.ButtonAction = 0;
         }
      } else {
         this.CustomSpinner = 0;
         this.ButtonAction = 0;
      }
   }

   public int BatModClient() {
      return this.CustomSpinner;
   }

   public int Button() {
      return this.ButtonAction;
   }

   private nXEc7ni4z3IOw8YAl9zMIfkdqbSVelnk1Hd77idlwHYVUxgrWYBX7dgJazdiM2adPd8eksqLp1AfwJRqx4qcPEsti6q9aoJgMgt BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var3,
      LoadingCache var4
   ) {
      for (int var5 = 0; var5 < this.ButtonAction; var5++) {
         for (int var6 = 0; var6 < this.CustomSpinner; var6++) {
            for (int var7 = 0; var7 < this.Button; var7++) {
               if (!this.BatModClient[var7][var6][var5]
                  .apply(
                     var4.getUnchecked(
                        BatModClient(var1, var2, var3, var5, var6, var7)
                     )
                  )) {
                  return null;
               }
            }
         }
      }

      return new nXEc7ni4z3IOw8YAl9zMIfkdqbSVelnk1Hd77idlwHYVUxgrWYBX7dgJazdiM2adPd8eksqLp1AfwJRqx4qcPEsti6q9aoJgMgt(
         var1,
         var2,
         var3,
         var4,
         this.ButtonAction,
         this.CustomSpinner,
         this.Button
      );
   }

   public nXEc7ni4z3IOw8YAl9zMIfkdqbSVelnk1Hd77idlwHYVUxgrWYBX7dgJazdiM2adPd8eksqLp1AfwJRqx4qcPEsti6q9aoJgMgt BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2
   ) {
      LoadingCache var3 = BatModClient(var1, false);
      int var4 = Math.max(
         Math.max(
            this.ButtonAction,
            this.CustomSpinner
         ),
         this.Button
      );

      for (q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var6 : q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW.BatModClient(
         var2, var2.BatModClient(var4 - 1, var4 - 1, var4 - 1)
      )) {
         for (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var10 : NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.values()) {
            for (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var14 : NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.values()) {
               if (var14 != var10 && var14 != var10.Spinner()) {
                  nXEc7ni4z3IOw8YAl9zMIfkdqbSVelnk1Hd77idlwHYVUxgrWYBX7dgJazdiM2adPd8eksqLp1AfwJRqx4qcPEsti6q9aoJgMgt var15 = this.BatModClient(
                     var6, var10, var14, var3
                  );
                  if (var15 != null) {
                     return var15;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var0, boolean var1
   ) {
      return CacheBuilder.newBuilder()
         .build(new J7Nfg1MsRpFkqeQmzopw0dmA5GRcoHZqWf19sd2oLFonu9H6UfWVhCJpt8k3eHyhenlERc26oSzPGnClTC2lsYmFcnowEhfG55l(var0, var1));
   }

   protected static q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var0,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2,
      int var3,
      int var4,
      int var5
   ) {
      if (var1 != var2 && var1 != var2.Spinner()) {
         u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var6 = new u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU(
            var1.BatModProgressBar(),
            var1.ColorChooser(),
            var1.IntegerSpinner()
         );
         u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var7 = new u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU(
            var2.BatModProgressBar(),
            var2.ColorChooser(),
            var2.IntegerSpinner()
         );
         u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var8 = var6.ButtonAction(
            var7
         );
         return var0.BatModClient(
            var7.BatModProgressBar() * -var4
               + var8.BatModProgressBar() * var3
               + var6.BatModProgressBar() * var5,
            var7.ColorChooser() * -var4
               + var8.ColorChooser() * var3
               + var6.ColorChooser() * var5,
            var7.IntegerSpinner() * -var4
               + var8.IntegerSpinner() * var3
               + var6.IntegerSpinner() * var5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }
}
