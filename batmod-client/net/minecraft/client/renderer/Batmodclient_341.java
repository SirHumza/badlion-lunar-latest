package net.minecraft.client.renderer;

public class BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv {
   protected final net.minecraft.client.renderer.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C BatModClient;
   protected final xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY Button;
   protected int CustomSpinner;
   protected int ButtonAction;
   protected int Spinner;
   public KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ[] Checkbox;
   private static final String ProgressBar = "CL_00002531";

   public BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1,
      int var2,
      net.minecraft.client.renderer.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C var3,
      BK6PxO5O1zsAhVfm2igzkRn6VGzjRmpZIydM6weCuSn439OQilbp1kqmFMRleTLeoNMaehlxBqrUg7DSB81E3PgjSjJsQhd9C1w4 var4
   ) {
      this.BatModClient = var3;
      this.Button = var1;
      this.BatModClient(var2);
      this.BatModClient(var4);
   }

   protected void BatModClient(
      BK6PxO5O1zsAhVfm2igzkRn6VGzjRmpZIydM6weCuSn439OQilbp1kqmFMRleTLeoNMaehlxBqrUg7DSB81E3PgjSjJsQhd9C1w4 var1
   ) {
      int var2 = this.ButtonAction
         * this.CustomSpinner
         * this.Spinner;
      this.Checkbox = new KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ[var2];
      int var3 = 0;

      for (int var4 = 0; var4 < this.ButtonAction; var4++) {
         for (int var5 = 0; var5 < this.CustomSpinner; var5++) {
            for (int var6 = 0; var6 < this.Spinner; var6++) {
               int var7 = (var6 * this.CustomSpinner + var5)
                     * this.ButtonAction
                  + var4;
               q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var8 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                  var4 * 16, var5 * 16, var6 * 16
               );
               this.Checkbox[var7] = var1.BatModClient(
                  this.Button,
                  this.BatModClient,
                  var8,
                  var3++
               );
            }
         }
      }
   }

   public void BatModClient() {
      for (KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var4 : this.Checkbox) {
         var4.BatModClient();
      }
   }

   protected void BatModClient(int var1) {
      int var2 = var1 * 2 + 1;
      this.ButtonAction = var2;
      this.CustomSpinner = 16;
      this.Spinner = var2;
   }

   public void BatModClient(double var1, double var3) {
      int var5 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
            var1
         )
         - 8;
      int var6 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
            var3
         )
         - 8;
      int var7 = this.ButtonAction * 16;

      for (int var8 = 0; var8 < this.ButtonAction; var8++) {
         int var9 = this.BatModClient(var5, var7, var8);

         for (int var10 = 0; var10 < this.Spinner; var10++) {
            int var11 = this.BatModClient(var6, var7, var10);

            for (int var12 = 0; var12 < this.CustomSpinner; var12++) {
               int var13 = var12 * 16;
               KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var14 = this.Checkbox[(
                        var10 * this.CustomSpinner + var12
                     )
                     * this.ButtonAction
                  + var8];
               q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var15 = var14.ColorChooser();
               if (var15.BatModProgressBar() != var9
                  || var15.ColorChooser() != var13
                  || var15.IntegerSpinner() != var11) {
                  q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var16 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                     var9, var13, var11
                  );
                  if (!var16.equals(var14.ColorChooser())) {
                     var14.BatModClient(var16);
                  }
               }
            }
         }
      }
   }

   private int BatModClient(int var1, int var2, int var3) {
      int var4 = var3 * 16;
      int var5 = var4 - var1 + var2 / 2;
      if (var5 < 0) {
         var5 -= var2 - 1;
      }

      return var4 - var5 / var2 * var2;
   }

   public void BatModClient(
      int var1, int var2, int var3, int var4, int var5, int var6
   ) {
      int var7 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var1, 16
      );
      int var8 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var2, 16
      );
      int var9 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var3, 16
      );
      int var10 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var4, 16
      );
      int var11 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var5, 16
      );
      int var12 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         var6, 16
      );

      for (int var13 = var7; var13 <= var10; var13++) {
         int var14 = var13 % this.ButtonAction;
         if (var14 < 0) {
            var14 += this.ButtonAction;
         }

         for (int var15 = var8; var15 <= var11; var15++) {
            int var16 = var15 % this.CustomSpinner;
            if (var16 < 0) {
               var16 += this.CustomSpinner;
            }

            for (int var17 = var9; var17 <= var12; var17++) {
               int var18 = var17 % this.Spinner;
               if (var18 < 0) {
                  var18 += this.Spinner;
               }

               int var19 = (var18 * this.CustomSpinner + var16)
                     * this.ButtonAction
                  + var14;
               KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var20 = this.Checkbox[var19];
               var20.BatModClient(true);
            }
         }
      }
   }

   public KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      int var2 = var1.BatModProgressBar() >> 4;
      int var3 = var1.ColorChooser() >> 4;
      int var4 = var1.IntegerSpinner() >> 4;
      if (var3 >= 0 && var3 < this.CustomSpinner) {
         var2 %= this.ButtonAction;
         if (var2 < 0) {
            var2 += this.ButtonAction;
         }

         var4 %= this.Spinner;
         if (var4 < 0) {
            var4 += this.Spinner;
         }

         int var5 = (var4 * this.CustomSpinner + var3)
               * this.ButtonAction
            + var2;
         return this.Checkbox[var5];
      } else {
         return null;
      }
   }
}
