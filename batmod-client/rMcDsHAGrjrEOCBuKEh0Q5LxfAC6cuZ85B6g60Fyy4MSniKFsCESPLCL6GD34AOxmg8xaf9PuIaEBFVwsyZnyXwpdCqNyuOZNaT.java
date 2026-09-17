public class rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT {
   public final double BatModClient;
   public final double Button;
   public final double CustomSpinner;
   public final double ButtonAction;
   public final double Spinner;
   public final double Checkbox;

   public rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(
      double var1, double var3, double var5, double var7, double var9, double var11
   ) {
      this.BatModClient = Math.min(var1, var7);
      this.Button = Math.min(var3, var9);
      this.CustomSpinner = Math.min(var5, var11);
      this.ButtonAction = Math.max(var1, var7);
      this.Spinner = Math.max(var3, var9);
      this.Checkbox = Math.max(var5, var11);
   }

   public rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2
   ) {
      this.BatModClient = var1.BatModProgressBar();
      this.Button = var1.ColorChooser();
      this.CustomSpinner = var1.IntegerSpinner();
      this.ButtonAction = var2.BatModProgressBar();
      this.Spinner = var2.ColorChooser();
      this.Checkbox = var2.IntegerSpinner();
   }

   public rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT BatModClient(
      double var1, double var3, double var5
   ) {
      double var7 = this.BatModClient;
      double var9 = this.Button;
      double var11 = this.CustomSpinner;
      double var13 = this.ButtonAction;
      double var15 = this.Spinner;
      double var17 = this.Checkbox;
      if (var1 < 0.0) {
         var7 += var1;
      } else if (var1 > 0.0) {
         var13 += var1;
      }

      if (var3 < 0.0) {
         var9 += var3;
      } else if (var3 > 0.0) {
         var15 += var3;
      }

      if (var5 < 0.0) {
         var11 += var5;
      } else if (var5 > 0.0) {
         var17 += var5;
      }

      return new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(var7, var9, var11, var13, var15, var17);
   }

   public rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT Button(
      double var1, double var3, double var5
   ) {
      double var7 = this.BatModClient - var1;
      double var9 = this.Button - var3;
      double var11 = this.CustomSpinner - var5;
      double var13 = this.ButtonAction + var1;
      double var15 = this.Spinner + var3;
      double var17 = this.Checkbox + var5;
      return new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(var7, var9, var11, var13, var15, var17);
   }

   public rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT BatModClient(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var1
   ) {
      double var2 = Math.min(
         this.BatModClient,
         var1.BatModClient
      );
      double var4 = Math.min(
         this.Button,
         var1.Button
      );
      double var6 = Math.min(
         this.CustomSpinner,
         var1.CustomSpinner
      );
      double var8 = Math.max(
         this.ButtonAction,
         var1.ButtonAction
      );
      double var10 = Math.max(
         this.Spinner,
         var1.Spinner
      );
      double var12 = Math.max(
         this.Checkbox,
         var1.Checkbox
      );
      return new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(var2, var4, var6, var8, var10, var12);
   }

   public static rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT BatModClient(
      double var0, double var2, double var4, double var6, double var8, double var10
   ) {
      double var12 = Math.min(var0, var6);
      double var14 = Math.min(var2, var8);
      double var16 = Math.min(var4, var10);
      double var18 = Math.max(var0, var6);
      double var20 = Math.max(var2, var8);
      double var22 = Math.max(var4, var10);
      return new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(var12, var14, var16, var18, var20, var22);
   }

   public rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT CustomSpinner(
      double var1, double var3, double var5
   ) {
      return new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(
         this.BatModClient + var1,
         this.Button + var3,
         this.CustomSpinner + var5,
         this.ButtonAction + var1,
         this.Spinner + var3,
         this.Checkbox + var5
      );
   }

   public double BatModClient(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var1, double var2
   ) {
      if (var1.Spinner
            > this.Button
         && var1.Button
            < this.Spinner
         && var1.Checkbox
            > this.CustomSpinner
         && var1.CustomSpinner
            < this.Checkbox) {
         if (var2 > 0.0
            && var1.ButtonAction
               <= this.BatModClient) {
            double var6 = this.BatModClient
               - var1.ButtonAction;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0
            && var1.BatModClient
               >= this.ButtonAction) {
            double var4 = this.ButtonAction
               - var1.BatModClient;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double Button(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var1, double var2
   ) {
      if (var1.ButtonAction
            > this.BatModClient
         && var1.BatModClient
            < this.ButtonAction
         && var1.Checkbox
            > this.CustomSpinner
         && var1.CustomSpinner
            < this.Checkbox) {
         if (var2 > 0.0
            && var1.Spinner
               <= this.Button) {
            double var6 = this.Button
               - var1.Spinner;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0
            && var1.Button
               >= this.Spinner) {
            double var4 = this.Spinner
               - var1.Button;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double CustomSpinner(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var1, double var2
   ) {
      if (var1.ButtonAction
            > this.BatModClient
         && var1.BatModClient
            < this.ButtonAction
         && var1.Spinner
            > this.Button
         && var1.Button
            < this.Spinner) {
         if (var2 > 0.0
            && var1.Checkbox
               <= this.CustomSpinner) {
            double var6 = this.CustomSpinner
               - var1.Checkbox;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0
            && var1.CustomSpinner
               >= this.Checkbox) {
            double var4 = this.Checkbox
               - var1.CustomSpinner;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public boolean Button(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var1
   ) {
      return !(
               var1.ButtonAction
                  > this.BatModClient
            )
            || !(
               var1.BatModClient
                  < this.ButtonAction
            )
         ? false
         : (
            var1.Spinner
                     > this.Button
                  && var1.Button
                     < this.Spinner
               ? var1.Checkbox
                     > this.CustomSpinner
                  && var1.CustomSpinner
                     < this.Checkbox
               : false
         );
   }

   public boolean BatModClient(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return !(
               var1.BatModClient
                  > this.BatModClient
            )
            || !(
               var1.BatModClient
                  < this.ButtonAction
            )
         ? false
         : (
            var1.Button
                     > this.Button
                  && var1.Button
                     < this.Spinner
               ? var1.CustomSpinner
                     > this.CustomSpinner
                  && var1.CustomSpinner
                     < this.Checkbox
               : false
         );
   }

   public double BatModClient() {
      double var1 = this.ButtonAction
         - this.BatModClient;
      double var3 = this.Spinner
         - this.Button;
      double var5 = this.Checkbox
         - this.CustomSpinner;
      return (var1 + var3 + var5) / 3.0;
   }

   public rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT ButtonAction(
      double var1, double var3, double var5
   ) {
      double var7 = this.BatModClient + var1;
      double var9 = this.Button + var3;
      double var11 = this.CustomSpinner + var5;
      double var13 = this.ButtonAction - var1;
      double var15 = this.Spinner - var3;
      double var17 = this.Checkbox - var5;
      return new rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT(var7, var9, var11, var13, var15, var17);
   }

   public tr5q0GOmD0yw0kez9WIWiwusnJR8KXYXx5G1VkLWqLsRMTT9JhhAeVCOzwkc1jYFYNDNES03f87QEbOZZGRpGQfyo0cDCbDpqH BatModClient(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1,
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var2
   ) {
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var3 = var1.BatModClient(
         var2, this.BatModClient
      );
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var4 = var1.BatModClient(
         var2, this.ButtonAction
      );
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var5 = var1.Button(
         var2, this.Button
      );
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var6 = var1.Button(
         var2, this.Spinner
      );
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var7 = var1.CustomSpinner(
         var2, this.CustomSpinner
      );
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var8 = var1.CustomSpinner(
         var2, this.Checkbox
      );
      if (!this.Button(var3)) {
         var3 = null;
      }

      if (!this.Button(var4)) {
         var4 = null;
      }

      if (!this.CustomSpinner(var5)) {
         var5 = null;
      }

      if (!this.CustomSpinner(var6)) {
         var6 = null;
      }

      if (!this.ButtonAction(var7)) {
         var7 = null;
      }

      if (!this.ButtonAction(var8)) {
         var8 = null;
      }

      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var9 = null;
      if (var3 != null) {
         var9 = var3;
      }

      if (var4 != null
         && (
            var9 == null
               || var1.ProgressBar(var4)
                  < var1.ProgressBar(var9)
         )) {
         var9 = var4;
      }

      if (var5 != null
         && (
            var9 == null
               || var1.ProgressBar(var5)
                  < var1.ProgressBar(var9)
         )) {
         var9 = var5;
      }

      if (var6 != null
         && (
            var9 == null
               || var1.ProgressBar(var6)
                  < var1.ProgressBar(var9)
         )) {
         var9 = var6;
      }

      if (var7 != null
         && (
            var9 == null
               || var1.ProgressBar(var7)
                  < var1.ProgressBar(var9)
         )) {
         var9 = var7;
      }

      if (var8 != null
         && (
            var9 == null
               || var1.ProgressBar(var8)
                  < var1.ProgressBar(var9)
         )) {
         var9 = var8;
      }

      if (var9 == null) {
         return null;
      }

      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var10 = null;
      if (var9 == var3) {
         var10 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner;
      } else if (var9 == var4) {
         var10 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Checkbox;
      } else if (var9 == var5) {
         var10 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient;
      } else if (var9 == var6) {
         var10 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Button;
      } else if (var9 == var7) {
         var10 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner;
      } else {
         var10 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ButtonAction;
      }

      return new tr5q0GOmD0yw0kez9WIWiwusnJR8KXYXx5G1VkLWqLsRMTT9JhhAeVCOzwkc1jYFYNDNES03f87QEbOZZGRpGQfyo0cDCbDpqH(var9, var10);
   }

   private boolean Button(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return var1 == null
         ? false
         : var1.Button
               >= this.Button
            && var1.Button
               <= this.Spinner
            && var1.CustomSpinner
               >= this.CustomSpinner
            && var1.CustomSpinner
               <= this.Checkbox;
   }

   private boolean CustomSpinner(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return var1 == null
         ? false
         : var1.BatModClient
               >= this.BatModClient
            && var1.BatModClient
               <= this.ButtonAction
            && var1.CustomSpinner
               >= this.CustomSpinner
            && var1.CustomSpinner
               <= this.Checkbox;
   }

   private boolean ButtonAction(
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var1
   ) {
      return var1 == null
         ? false
         : var1.BatModClient
               >= this.BatModClient
            && var1.BatModClient
               <= this.ButtonAction
            && var1.Button
               >= this.Button
            && var1.Button
               <= this.Spinner;
   }

   @Override
   public String toString() {
      return "box["
         + this.BatModClient
         + ", "
         + this.Button
         + ", "
         + this.CustomSpinner
         + " -> "
         + this.ButtonAction
         + ", "
         + this.Spinner
         + ", "
         + this.Checkbox
         + "]";
   }

   public boolean Button() {
      return Double.isNaN(this.BatModClient)
         || Double.isNaN(this.Button)
         || Double.isNaN(this.CustomSpinner)
         || Double.isNaN(this.ButtonAction)
         || Double.isNaN(this.Spinner)
         || Double.isNaN(this.Checkbox);
   }
}
