package net.minecraft.client.renderer;

import java.util.BitSet;

public class ButtonAction {
   private final float[] BatModClient = new float[4];
   private final int[] Button = new int[4];
   private static final String CustomSpinner = "CL_00002515";

   public ButtonAction(
      net.minecraft.client.renderer.CustomSpinner var1
   ) {
   }

   public ButtonAction() {
   }

   public void BatModClient(
      kQBUKVbQYNqWTdjw7hwBOcBSlmjaMudn5zTLs2guhXVtjteHYYcaoYMGVaZl0SMBQx9NR9bHQLUIRovrNwuWpEspYuVQawexr1t var1,
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var4,
      float[] var5,
      BitSet var6
   ) {
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var7 = var6.get(0)
         ? var3.BatModClient(var4)
         : var3;
      net.minecraft.client.renderer.Checkbox var8 = net.minecraft.client.renderer.Checkbox.BatModClient(
         var4
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var9 = var7.BatModClient(
         var8.ProgressBar[0]
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var10 = var7.BatModClient(
         var8.ProgressBar[1]
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var11 = var7.BatModClient(
         var8.ProgressBar[2]
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var12 = var7.BatModClient(
         var8.ProgressBar[3]
      );
      int var13 = var2.Button(var1, var9);
      int var14 = var2.Button(var1, var10);
      int var15 = var2.Button(var1, var11);
      int var16 = var2.Button(var1, var12);
      float var17 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
         var1.Button(var9)
            .CustomSpinner()
            .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
      );
      float var18 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
         var1.Button(var10)
            .CustomSpinner()
            .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
      );
      float var19 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
         var1.Button(var11)
            .CustomSpinner()
            .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
      );
      float var20 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
         var1.Button(var12)
            .CustomSpinner()
            .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
      );
      boolean var21 = var1.Button(
            var9.BatModClient(var4)
         )
         .CustomSpinner()
         .CustomSpinner();
      boolean var22 = var1.Button(
            var10.BatModClient(var4)
         )
         .CustomSpinner()
         .CustomSpinner();
      boolean var23 = var1.Button(
            var11.BatModClient(var4)
         )
         .CustomSpinner()
         .CustomSpinner();
      boolean var24 = var1.Button(
            var12.BatModClient(var4)
         )
         .CustomSpinner()
         .CustomSpinner();
      float var25;
      int var26;
      if (!var23 && !var21) {
         var25 = var17;
         var26 = var13;
      } else {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var27 = var9.BatModClient(
            var8.ProgressBar[2]
         );
         var25 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
            var1.Button(var27)
               .CustomSpinner()
               .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
         );
         var26 = var2.Button(var1, var27);
      }

      int var28;
      float var60;
      if (!var24 && !var21) {
         var60 = var17;
         var28 = var13;
      } else {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var29 = var9.BatModClient(
            var8.ProgressBar[3]
         );
         var60 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
            var1.Button(var29)
               .CustomSpinner()
               .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
         );
         var28 = var2.Button(var1, var29);
      }

      int var30;
      float var61;
      if (!var23 && !var22) {
         var61 = var18;
         var30 = var14;
      } else {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var31 = var10.BatModClient(
            var8.ProgressBar[2]
         );
         var61 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
            var1.Button(var31)
               .CustomSpinner()
               .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
         );
         var30 = var2.Button(var1, var31);
      }

      int var32;
      float var62;
      if (!var24 && !var22) {
         var62 = var18;
         var32 = var14;
      } else {
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var33 = var10.BatModClient(
            var8.ProgressBar[3]
         );
         var62 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
            var1.Button(var33)
               .CustomSpinner()
               .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
         );
         var32 = var2.Button(var1, var33);
      }

      int var63 = var2.Button(var1, var3);
      if (var6.get(0)
         || !var1.Button(
               var3.BatModClient(var4)
            )
            .CustomSpinner()
            .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()) {
         var63 = var2.Button(
            var1, var3.BatModClient(var4)
         );
      }

      float var34 = var6.get(0)
         ? var1.Button(var7)
            .CustomSpinner()
            .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
         : var1.Button(var3)
            .CustomSpinner()
            .f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb();
      var34 = net.minecraft.client.renderer.CustomSpinner.BatModClient(
         var34
      );
      net.minecraft.client.renderer.BatModProgressBar var35 = net.minecraft.client.renderer.BatModProgressBar.BatModClient(
         var4
      );
      if (var6.get(1) && var8.ColorChooser) {
         float var65 = (var20 + var17 + var60 + var34) * 0.25F;
         float var66 = (var19 + var17 + var25 + var34) * 0.25F;
         float var67 = (var19 + var18 + var61 + var34) * 0.25F;
         float var68 = (var20 + var18 + var62 + var34) * 0.25F;
         float var40 = var5[var8.IntegerSpinner[0].BatModInstallerMain]
            * var5[var8.IntegerSpinner[1].BatModInstallerMain];
         float var41 = var5[var8.IntegerSpinner[2].BatModInstallerMain]
            * var5[var8.IntegerSpinner[3].BatModInstallerMain];
         float var42 = var5[var8.IntegerSpinner[4].BatModInstallerMain]
            * var5[var8.IntegerSpinner[5].BatModInstallerMain];
         float var43 = var5[var8.IntegerSpinner[6].BatModInstallerMain]
            * var5[var8.IntegerSpinner[7].BatModInstallerMain];
         float var44 = var5[var8.TextField[0].BatModInstallerMain]
            * var5[var8.TextField[1].BatModInstallerMain];
         float var45 = var5[var8.TextField[2].BatModInstallerMain]
            * var5[var8.TextField[3].BatModInstallerMain];
         float var46 = var5[var8.TextField[4].BatModInstallerMain]
            * var5[var8.TextField[5].BatModInstallerMain];
         float var47 = var5[var8.TextField[6].BatModInstallerMain]
            * var5[var8.TextField[7].BatModInstallerMain];
         float var48 = var5[var8.ColorTextPane[0].BatModInstallerMain]
            * var5[var8.ColorTextPane[1].BatModInstallerMain];
         float var49 = var5[var8.ColorTextPane[2].BatModInstallerMain]
            * var5[var8.ColorTextPane[3].BatModInstallerMain];
         float var50 = var5[var8.ColorTextPane[4].BatModInstallerMain]
            * var5[var8.ColorTextPane[5].BatModInstallerMain];
         float var51 = var5[var8.ColorTextPane[6].BatModInstallerMain]
            * var5[var8.ColorTextPane[7].BatModInstallerMain];
         float var52 = var5[var8.BatModInstallerMain[0].BatModInstallerMain]
            * var5[var8.BatModInstallerMain[1].BatModInstallerMain];
         float var53 = var5[var8.BatModInstallerMain[2].BatModInstallerMain]
            * var5[var8.BatModInstallerMain[3].BatModInstallerMain];
         float var54 = var5[var8.BatModInstallerMain[4].BatModInstallerMain]
            * var5[var8.BatModInstallerMain[5].BatModInstallerMain];
         float var55 = var5[var8.BatModInstallerMain[6].BatModInstallerMain]
            * var5[var8.BatModInstallerMain[7].BatModInstallerMain];
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.BatModClient(
            var35
         )] = var65 * var40 + var66 * var41 + var67 * var42 + var68 * var43;
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.Button(
            var35
         )] = var65 * var44 + var66 * var45 + var67 * var46 + var68 * var47;
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.CustomSpinner(
            var35
         )] = var65 * var48 + var66 * var49 + var67 * var50 + var68 * var51;
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.ButtonAction(
            var35
         )] = var65 * var52 + var66 * var53 + var67 * var54 + var68 * var55;
         int var56 = this.BatModClient(var16, var13, var28, var63);
         int var57 = this.BatModClient(var15, var13, var26, var63);
         int var58 = this.BatModClient(var15, var14, var30, var63);
         int var59 = this.BatModClient(var16, var14, var32, var63);
         this.Button[net.minecraft.client.renderer.BatModProgressBar.BatModClient(
            var35
         )] = this.BatModClient(
            var56, var57, var58, var59, var40, var41, var42, var43
         );
         this.Button[net.minecraft.client.renderer.BatModProgressBar.Button(
            var35
         )] = this.BatModClient(
            var56, var57, var58, var59, var44, var45, var46, var47
         );
         this.Button[net.minecraft.client.renderer.BatModProgressBar.CustomSpinner(
            var35
         )] = this.BatModClient(
            var56, var57, var58, var59, var48, var49, var50, var51
         );
         this.Button[net.minecraft.client.renderer.BatModProgressBar.ButtonAction(
            var35
         )] = this.BatModClient(
            var56, var57, var58, var59, var52, var53, var54, var55
         );
      } else {
         float var36 = (var20 + var17 + var60 + var34) * 0.25F;
         float var37 = (var19 + var17 + var25 + var34) * 0.25F;
         float var38 = (var19 + var18 + var61 + var34) * 0.25F;
         float var39 = (var20 + var18 + var62 + var34) * 0.25F;
         this.Button[net.minecraft.client.renderer.BatModProgressBar.BatModClient(
            var35
         )] = this.BatModClient(var16, var13, var28, var63);
         this.Button[net.minecraft.client.renderer.BatModProgressBar.Button(
            var35
         )] = this.BatModClient(var15, var13, var26, var63);
         this.Button[net.minecraft.client.renderer.BatModProgressBar.CustomSpinner(
            var35
         )] = this.BatModClient(var15, var14, var30, var63);
         this.Button[net.minecraft.client.renderer.BatModProgressBar.ButtonAction(
            var35
         )] = this.BatModClient(var16, var14, var32, var63);
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.BatModClient(
            var35
         )] = var36;
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.Button(
            var35
         )] = var37;
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.CustomSpinner(
            var35
         )] = var38;
         this.BatModClient[net.minecraft.client.renderer.BatModProgressBar.ButtonAction(
            var35
         )] = var39;
      }
   }

   private int BatModClient(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         var1 = var4;
      }

      if (var2 == 0) {
         var2 = var4;
      }

      if (var3 == 0) {
         var3 = var4;
      }

      return var1 + var2 + var3 + var4 >> 2 & 16711935;
   }

   private int BatModClient(
      int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8
   ) {
      int var9 = (int)((var1 >> 16 & 0xFF) * var5 + (var2 >> 16 & 0xFF) * var6 + (var3 >> 16 & 0xFF) * var7 + (var4 >> 16 & 0xFF) * var8) & 0xFF;
      int var10 = (int)((var1 & 0xFF) * var5 + (var2 & 0xFF) * var6 + (var3 & 0xFF) * var7 + (var4 & 0xFF) * var8) & 0xFF;
      return var9 << 16 | var10;
   }
}
