package net.minecraft.client.renderer;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;

public class amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY
   implements net.minecraft.client.renderer.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj {
   private int[] BatModClient;
   private int Button;
   private int CustomSpinner;
   private static final String ButtonAction = "CL_00000956";

   @Override
   public BufferedImage BatModClient(BufferedImage var1) {
      if (var1 == null) {
         return null;
      }

      this.Button = 64;
      this.CustomSpinner = 64;
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();

      byte var4;
      for (var4 = 1;
         this.Button < var2
            || this.CustomSpinner < var3;
         var4 *= 2
      ) {
         this.Button *= 2;
         this.CustomSpinner *= 2;
      }

      BufferedImage var5 = new BufferedImage(
         this.Button,
         this.CustomSpinner,
         2
      );
      Graphics var6 = var5.getGraphics();
      var6.drawImage(var1, 0, 0, (ImageObserver)null);
      if (var1.getHeight() == 32 * var4) {
         var6.drawImage(var5, 24 * var4, 48 * var4, 20 * var4, 52 * var4, 4 * var4, 16 * var4, 8 * var4, 20 * var4, (ImageObserver)null);
         var6.drawImage(var5, 28 * var4, 48 * var4, 24 * var4, 52 * var4, 8 * var4, 16 * var4, 12 * var4, 20 * var4, (ImageObserver)null);
         var6.drawImage(var5, 20 * var4, 52 * var4, 16 * var4, 64 * var4, 8 * var4, 20 * var4, 12 * var4, 32 * var4, (ImageObserver)null);
         var6.drawImage(var5, 24 * var4, 52 * var4, 20 * var4, 64 * var4, 4 * var4, 20 * var4, 8 * var4, 32 * var4, (ImageObserver)null);
         var6.drawImage(var5, 28 * var4, 52 * var4, 24 * var4, 64 * var4, 0 * var4, 20 * var4, 4 * var4, 32 * var4, (ImageObserver)null);
         var6.drawImage(var5, 32 * var4, 52 * var4, 28 * var4, 64 * var4, 12 * var4, 20 * var4, 16 * var4, 32 * var4, (ImageObserver)null);
         var6.drawImage(var5, 40 * var4, 48 * var4, 36 * var4, 52 * var4, 44 * var4, 16 * var4, 48 * var4, 20 * var4, (ImageObserver)null);
         var6.drawImage(var5, 44 * var4, 48 * var4, 40 * var4, 52 * var4, 48 * var4, 16 * var4, 52 * var4, 20 * var4, (ImageObserver)null);
         var6.drawImage(var5, 36 * var4, 52 * var4, 32 * var4, 64 * var4, 48 * var4, 20 * var4, 52 * var4, 32 * var4, (ImageObserver)null);
         var6.drawImage(var5, 40 * var4, 52 * var4, 36 * var4, 64 * var4, 44 * var4, 20 * var4, 48 * var4, 32 * var4, (ImageObserver)null);
         var6.drawImage(var5, 44 * var4, 52 * var4, 40 * var4, 64 * var4, 40 * var4, 20 * var4, 44 * var4, 32 * var4, (ImageObserver)null);
         var6.drawImage(var5, 48 * var4, 52 * var4, 44 * var4, 64 * var4, 52 * var4, 20 * var4, 56 * var4, 32 * var4, (ImageObserver)null);
      }

      var6.dispose();
      this.BatModClient = ((DataBufferInt)var5.getRaster()
            .getDataBuffer())
         .getData();
      this.Button(0, 0, 32 * var4, 16 * var4);
      this.BatModClient(32 * var4, 0, 64 * var4, 32 * var4);
      this.Button(0, 16 * var4, 64 * var4, 32 * var4);
      this.BatModClient(0, 32 * var4, 16 * var4, 48 * var4);
      this.BatModClient(16 * var4, 32 * var4, 40 * var4, 48 * var4);
      this.BatModClient(40 * var4, 32 * var4, 56 * var4, 48 * var4);
      this.BatModClient(0, 48 * var4, 16 * var4, 64 * var4);
      this.Button(16 * var4, 48 * var4, 48 * var4, 64 * var4);
      this.BatModClient(48 * var4, 48 * var4, 64 * var4, 64 * var4);
      return var5;
   }

   @Override
   public void BatModClient() {
   }

   private void BatModClient(int var1, int var2, int var3, int var4) {
      if (!this.CustomSpinner(var1, var2, var3, var4)) {
         for (int var5 = var1; var5 < var3; var5++) {
            for (int var6 = var2; var6 < var4; var6++) {
               this.BatModClient[var5
                  + var6 * this.Button] = this.BatModClient[var5
                     + var6 * this.Button]
                  & 16777215;
            }
         }
      }
   }

   private void Button(int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            this.BatModClient[var5
               + var6 * this.Button] = this.BatModClient[var5
                  + var6 * this.Button]
               | 0xFF000000;
         }
      }
   }

   private boolean CustomSpinner(int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var3; var5++) {
         for (int var6 = var2; var6 < var4; var6++) {
            int var7 = this.BatModClient[var5
               + var6 * this.Button];
            if ((var7 >> 24 & 0xFF) < 128) {
               return true;
            }
         }
      }

      return false;
   }
}
