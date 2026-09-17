package net.minecraft.client.renderer;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Downloader {
   private double CustomSpinner;
   private double ButtonAction;
   private double Spinner;
   protected List BatModClient = Lists.newArrayListWithCapacity(17424);
   protected boolean Button;

   public void BatModClient(double var1, double var3, double var5) {
      this.Button = true;
      this.BatModClient.clear();
      this.CustomSpinner = var1;
      this.ButtonAction = var3;
      this.Spinner = var5;
   }

   public void BatModClient(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1
   ) {
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2 = var1.ColorChooser();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
         (float)(
            var2.BatModProgressBar()
               - this.CustomSpinner
         ),
         (float)(
            var2.ColorChooser()
               - this.ButtonAction
         ),
         (float)(
            var2.IntegerSpinner()
               - this.Spinner
         )
      );
   }

   public void BatModClient(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1,
      ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi var2
   ) {
      this.BatModClient.add(var1);
   }

   public abstract void BatModClient(
      ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi var1
   );
}
