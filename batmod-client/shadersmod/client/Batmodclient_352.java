package shadersmod.client;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY {
   int BatModClient;
   int Button;
   int CustomSpinner;
   int ButtonAction;
   boolean Spinner;
   boolean Checkbox;
   boolean ProgressBar;
   boolean BatModProgressBar;
   long[] ColorChooser = new long[10];
   int IntegerSpinner = 0;

   public K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY() {
      this.ColorChooser[this.IntegerSpinner] = 0L;
   }

   public static void BatModClient(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0
   ) {
      var0.Spinner = new shadersmod.client.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY();
   }

   public void BatModClient(long var1) {
      this.IntegerSpinner++;
      this.ColorChooser[this.IntegerSpinner] = var1;
   }

   public void BatModClient() {
      this.ColorChooser[this.IntegerSpinner] = 0L;
      this.IntegerSpinner--;
   }

   public static void BatModClient(
      jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var0,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      kQBUKVbQYNqWTdjw7hwBOcBSlmjaMudn5zTLs2guhXVtjteHYYcaoYMGVaZl0SMBQx9NR9bHQLUIRovrNwuWpEspYuVQawexr1t var2,
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var3
   ) {
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var4 = var0.CustomSpinner();
      int var5;
      int var6;
      if (var0 instanceof v8mSf68oadPo4sAYUwPQVkNjNQIAXfFzUrQ51Ir4NLv3s9MrO3arF75RO8yO6PKKGPzEaG09zKtfLZ4eLKQS0MGmpHRe6KMV0Ijo) {
         v8mSf68oadPo4sAYUwPQVkNjNQIAXfFzUrQ51Ir4NLv3s9MrO3arF75RO8yO6PKKGPzEaG09zKtfLZ4eLKQS0MGmpHRe6KMV0Ijo var7 = (v8mSf68oadPo4sAYUwPQVkNjNQIAXfFzUrQ51Ir4NLv3s9MrO3arF75RO8yO6PKKGPzEaG09zKtfLZ4eLKQS0MGmpHRe6KMV0Ijo)var0;
         var5 = var7.ButtonAction();
         var6 = var7.Checkbox();
      } else {
         var5 = c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
            var4
         );
         var6 = var4.CustomSpinner(var0);
      }

      var5 = shadersmod.client.Button.BatModClient(
         var5, var6
      );
      int var11 = var4.TextField();
      int var8 = ((var11 & 65535) << 16) + (var5 & 65535);
      int var9 = var6 & 65535;
      var3.Spinner
         .BatModClient(((long)var9 << 32) + var8);
   }

   public static void Button(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0
   ) {
      var0.Spinner
         .BatModClient();
   }

   public static boolean BatModClient(
      boolean var0, net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1
   ) {
      var1.Spinner
         .BatModClient();
      return var0;
   }

   public static void CustomSpinner(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0
   ) {
      shadersmod.client.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY var1 = var0.Spinner;
      Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ var2 = var0.BatModProgressBar();
      var1.BatModClient = var2.ProgressBar()
         / 4;
      var1.Spinner = var2.Button();
      var1.Checkbox = var1.Spinner;
      var1.ProgressBar = var2.BatModClient(
         0
      );
      var1.Button = var1.Spinner
         ? var2.CustomSpinner() / 4
         : 0;
      var1.CustomSpinner = var1.ProgressBar
         ? var2.Button(0) / 4
         : 0;
      var1.ButtonAction = 8;
   }

   public static void ButtonAction(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0
   ) {
      if (var0.CustomSpinner == 0) {
         CustomSpinner(var0);
      }
   }

   public static void Spinner(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0
   ) {
      shadersmod.client.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY var1 = var0.Spinner;
      if (var1.BatModClient == 14) {
         if (var0.ButtonAction == 7
            && var0.CustomSpinner % 4 == 0) {
            var1.BatModClient(
               var0,
               var0.Button()
                  - 4 * var1.BatModClient
            );
         }

         long var2 = var1.ColorChooser[var1.IntegerSpinner];
         int var4 = var0.Button() - 14 + 12;
         var0.BatModClient.put(var4, (int)var2);
         var0.BatModClient.put(var4 + 1, (int)(var2 >> 32));
      }
   }

   public static void BatModClient(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0, int[] var1
   ) {
      if (var0.CustomSpinner == 0) {
         CustomSpinner(var0);
      }

      shadersmod.client.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY var2 = var0.Spinner;
      if (var2.BatModClient == 14) {
         long var3 = var2.ColorChooser[var2.IntegerSpinner];

         for (byte var5 = 12; var5 + 1 < var1.length; var5 += 14) {
            var1[var5] = (int)var3;
            var1[var5 + 1] = (int)(var3 >> 32);
         }
      }
   }

   public static void Checkbox(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0
   ) {
      shadersmod.client.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY var1 = var0.Spinner;
      if (var1.BatModClient == 14
         && var0.ButtonAction == 7
         && var0.CustomSpinner % 4 == 0) {
         var1.BatModClient(
            var0,
            var0.Button()
               - 4 * var1.BatModClient
         );
      }
   }

   public void BatModClient(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1, int var2
   ) {
      FloatBuffer var3 = var1.Button;
      IntBuffer var4 = var1.BatModClient;
      int var5 = var1.Button();
      float var6 = var3.get(var2 + 0 * this.BatModClient);
      float var7 = var3.get(var2 + 0 * this.BatModClient + 1);
      float var8 = var3.get(var2 + 0 * this.BatModClient + 2);
      float var9 = var3.get(
         var2
            + 0 * this.BatModClient
            + this.CustomSpinner
      );
      float var10 = var3.get(
         var2
            + 0 * this.BatModClient
            + this.CustomSpinner
            + 1
      );
      float var11 = var3.get(var2 + 1 * this.BatModClient);
      float var12 = var3.get(var2 + 1 * this.BatModClient + 1);
      float var13 = var3.get(var2 + 1 * this.BatModClient + 2);
      float var14 = var3.get(
         var2
            + 1 * this.BatModClient
            + this.CustomSpinner
      );
      float var15 = var3.get(
         var2
            + 1 * this.BatModClient
            + this.CustomSpinner
            + 1
      );
      float var16 = var3.get(var2 + 2 * this.BatModClient);
      float var17 = var3.get(var2 + 2 * this.BatModClient + 1);
      float var18 = var3.get(var2 + 2 * this.BatModClient + 2);
      float var19 = var3.get(
         var2
            + 2 * this.BatModClient
            + this.CustomSpinner
      );
      float var20 = var3.get(
         var2
            + 2 * this.BatModClient
            + this.CustomSpinner
            + 1
      );
      float var21 = var3.get(var2 + 3 * this.BatModClient);
      float var22 = var3.get(var2 + 3 * this.BatModClient + 1);
      float var23 = var3.get(var2 + 3 * this.BatModClient + 2);
      float var24 = var3.get(
         var2
            + 3 * this.BatModClient
            + this.CustomSpinner
      );
      float var25 = var3.get(
         var2
            + 3 * this.BatModClient
            + this.CustomSpinner
            + 1
      );
      float var26 = var16 - var6;
      float var27 = var17 - var7;
      float var28 = var18 - var8;
      float var29 = var21 - var11;
      float var30 = var22 - var12;
      float var31 = var23 - var13;
      float var32 = var27 * var31 - var30 * var28;
      float var33 = var28 * var29 - var31 * var26;
      float var34 = var26 * var30 - var29 * var27;
      float var35 = var32 * var32 + var33 * var33 + var34 * var34;
      float var36 = var35 != 0.0 ? (float)(1.0 / Math.sqrt(var35)) : 1.0F;
      var32 *= var36;
      var33 *= var36;
      var34 *= var36;
      var26 = var11 - var6;
      var27 = var12 - var7;
      var28 = var13 - var8;
      float var37 = var14 - var9;
      float var38 = var15 - var10;
      var29 = var16 - var6;
      var30 = var17 - var7;
      var31 = var18 - var8;
      float var39 = var19 - var9;
      float var40 = var20 - var10;
      float var41 = var37 * var40 - var39 * var38;
      float var42 = var41 != 0.0F ? 1.0F / var41 : 1.0F;
      float var43 = (var40 * var26 - var38 * var29) * var42;
      float var44 = (var40 * var27 - var38 * var30) * var42;
      float var45 = (var40 * var28 - var38 * var31) * var42;
      float var46 = (var37 * var29 - var39 * var26) * var42;
      float var47 = (var37 * var30 - var39 * var27) * var42;
      float var48 = (var37 * var31 - var39 * var28) * var42;
      var35 = var43 * var43 + var44 * var44 + var45 * var45;
      var36 = var35 != 0.0 ? (float)(1.0 / Math.sqrt(var35)) : 1.0F;
      var43 *= var36;
      var44 *= var36;
      var45 *= var36;
      var35 = var46 * var46 + var47 * var47 + var48 * var48;
      var36 = var35 != 0.0 ? (float)(1.0 / Math.sqrt(var35)) : 1.0F;
      var46 *= var36;
      var47 *= var36;
      var48 *= var36;
      float var49 = var34 * var44 - var33 * var45;
      float var50 = var32 * var45 - var34 * var43;
      float var51 = var33 * var43 - var32 * var44;
      float var52 = var46 * var49 + var47 * var50 + var48 * var51 < 0.0F ? -1.0F : 1.0F;
      int var53 = (int)(var32 * 127.0F) & 0xFF;
      int var54 = (int)(var33 * 127.0F) & 0xFF;
      int var55 = (int)(var34 * 127.0F) & 0xFF;
      int var56 = (var55 << 16) + (var54 << 8) + var53;
      var4.put(
         var2
            + 0 * this.BatModClient
            + this.Button,
         var56
      );
      var4.put(
         var2
            + 1 * this.BatModClient
            + this.Button,
         var56
      );
      var4.put(
         var2
            + 2 * this.BatModClient
            + this.Button,
         var56
      );
      var4.put(
         var2
            + 3 * this.BatModClient
            + this.Button,
         var56
      );
      int var57 = ((int)(var43 * 32767.0F) & 65535) + (((int)(var44 * 32767.0F) & 65535) << 16);
      int var58 = ((int)(var45 * 32767.0F) & 65535) + (((int)(var52 * 32767.0F) & 65535) << 16);
      var4.put(var2 + 0 * this.BatModClient + 10, var57);
      var4.put(var2 + 0 * this.BatModClient + 10 + 1, var58);
      var4.put(var2 + 1 * this.BatModClient + 10, var57);
      var4.put(var2 + 1 * this.BatModClient + 10 + 1, var58);
      var4.put(var2 + 2 * this.BatModClient + 10, var57);
      var4.put(var2 + 2 * this.BatModClient + 10 + 1, var58);
      var4.put(var2 + 3 * this.BatModClient + 10, var57);
      var4.put(var2 + 3 * this.BatModClient + 10 + 1, var58);
      float var59 = (var9 + var14 + var19 + var24) / 4.0F;
      float var60 = (var10 + var15 + var20 + var25) / 4.0F;
      var3.put(var2 + 0 * this.BatModClient + 8, var59);
      var3.put(var2 + 0 * this.BatModClient + 8 + 1, var60);
      var3.put(var2 + 1 * this.BatModClient + 8, var59);
      var3.put(var2 + 1 * this.BatModClient + 8 + 1, var60);
      var3.put(var2 + 2 * this.BatModClient + 8, var59);
      var3.put(var2 + 2 * this.BatModClient + 8 + 1, var60);
      var3.put(var2 + 3 * this.BatModClient + 8, var59);
      var3.put(var2 + 3 * this.BatModClient + 8 + 1, var60);
   }

   public static void ProgressBar(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var0
   ) {
      if (var0.BatModProgressBar()
            .Button()
         && var0.ButtonAction == 7
         && var0.CustomSpinner % 4 == 0) {
         shadersmod.client.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY var1 = var0.Spinner;
         CustomSpinner(var0);
         int var2 = var0.CustomSpinner
            * var1.BatModClient;

         for (int var3 = 0; var3 < var2; var3 += var1.BatModClient * 4) {
            var1.BatModClient(var0, var3);
         }
      }
   }

   public static void BatModClient(
      int var0,
      int var1,
      int var2,
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var3
   ) {
      if (var2 != 0) {
         Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ var4 = var3.BatModProgressBar();
         int var5 = var4.ProgressBar();
         if (var5 == 56) {
            ByteBuffer var6 = var3.ProgressBar();
            ((Buffer)var6).position(32);
            GL20.glVertexAttribPointer(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE,
               2,
               5126,
               false,
               var5,
               var6
            );
            ((Buffer)var6).position(40);
            GL20.glVertexAttribPointer(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR,
               4,
               5122,
               false,
               var5,
               var6
            );
            ((Buffer)var6).position(48);
            GL20.glVertexAttribPointer(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj,
               3,
               5122,
               false,
               var5,
               var6
            );
            ((Buffer)var6).position(0);
            GL20.glEnableVertexAttribArray(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE
            );
            GL20.glEnableVertexAttribArray(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
            );
            GL20.glEnableVertexAttribArray(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            );
            GL11.glDrawArrays(var0, var1, var2);
            GL20.glDisableVertexAttribArray(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE
            );
            GL20.glDisableVertexAttribArray(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
            );
            GL20.glDisableVertexAttribArray(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            );
         } else {
            GL11.glDrawArrays(var0, var1, var2);
         }
      }
   }
}
