public class DR0ZsscUCYcTVO9kuIO2P69E2meYQwj586tAxbfYjy0a6CkH9mbjJga0YQBqkiGzeK254tk0NXgHr0FsjlIgs1aTYpF6d3FYMF8C
   extends NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD {
   private double InstallationLogger;
   private double RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
   private static final String K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = "CL_00001070";

   public DR0ZsscUCYcTVO9kuIO2P69E2meYQwj586tAxbfYjy0a6CkH9mbjJga0YQBqkiGzeK254tk0NXgHr0FsjlIgs1aTYpF6d3FYMF8C(String var1) {
      super(var1);
   }

   @Override
   public void IntegerSpinner() {
      if (!this.BatModClient.isEmpty()) {
         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson();
         double var2 = 0.0;
         if (var1.Checkbox != null
            && var1.BatModProgressBar != null) {
            var2 = var1.Checkbox
               .CustomSpinner(1.0F);
            if (!var1.Checkbox
               .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .ButtonAction()) {
               var2 = Math.random();
            }
         }

         double var4 = var2 - this.InstallationLogger;

         while (var4 < -0.5) {
            var4++;
         }

         while (var4 >= 0.5) {
            var4--;
         }

         var4 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var4, -1.0, 1.0
         );
         this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM += var4 * 0.1;
         this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM *= 0.8;
         this.InstallationLogger = this.InstallationLogger
            + this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
         int var6 = (int)(
               (this.InstallationLogger + 1.0)
                  * this.BatModClient.size()
            )
            % this.BatModClient.size();

         while (var6 < 0) {
            var6 = (var6 + this.BatModClient.size())
               % this.BatModClient.size();
         }

         if (var6 != this.BatModProgressBar) {
            this.BatModProgressBar = var6;
            if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
               )
             {
               shadersmod.client.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3.Button(
                  (int[][])this.BatModClient
                     .get(this.BatModProgressBar),
                  this.Checkbox,
                  this.ProgressBar,
                  this.ButtonAction,
                  this.Spinner,
                  false,
                  false
               );
            } else {
               oDBPGLL6ZgGrp7WNspe0IqS6Wr2sAhGlbgDh2Xxt2fdUDnXEnLAsRaDAqplHLjL3fHNyUhY3lHz0dlAb69rckfOCUW4pPTphC8FY.BatModClient(
                  (int[][])this.BatModClient
                     .get(this.BatModProgressBar),
                  this.Checkbox,
                  this.ProgressBar,
                  this.ButtonAction,
                  this.Spinner,
                  false,
                  false
               );
            }
         }
      }
   }
}
