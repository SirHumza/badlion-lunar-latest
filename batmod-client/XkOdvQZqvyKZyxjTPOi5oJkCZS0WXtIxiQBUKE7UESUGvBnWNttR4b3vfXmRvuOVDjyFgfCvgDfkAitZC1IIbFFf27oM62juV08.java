import java.awt.Color;

public class XkOdvQZqvyKZyxjTPOi5oJkCZS0WXtIxiQBUKE7UESUGvBnWNttR4b3vfXmRvuOVDjyFgfCvgDfkAitZC1IIbFFf27oM62juV08
   extends knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 {
   private float IntegerSpinner;
   private long TextField;
   private float ColorTextPane = 1.0F;
   public boolean ColorChooser;
   private String BatModInstallerMain;
   private final float aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   private final float LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
   private final dPWfrBbXVnvmF8DqMJ0eiFgoGuuStVex0qRTdLMxpsUwtMoemJjOFmugsiEvgsECP51pO08IKfa2OkPyC6Kw5murEkTgqlSNbES4 Downloader;
   private BajoLweHiEhn4k66yrDKQEVZfHPG2eGRFGAxL2InvUHwKHXwosnJM6hmR3PDp3UOVwhLUn5ObUNXLw5zgBUAVjjZV1cmM19vwKm InstallationLogger;

   public XkOdvQZqvyKZyxjTPOi5oJkCZS0WXtIxiQBUKE7UESUGvBnWNttR4b3vfXmRvuOVDjyFgfCvgDfkAitZC1IIbFFf27oM62juV08(
      dPWfrBbXVnvmF8DqMJ0eiFgoGuuStVex0qRTdLMxpsUwtMoemJjOFmugsiEvgsECP51pO08IKfa2OkPyC6Kw5murEkTgqlSNbES4 var1,
      int var2,
      int var3,
      int var4,
      String var5,
      float var6,
      float var7,
      float var8,
      BajoLweHiEhn4k66yrDKQEVZfHPG2eGRFGAxL2InvUHwKHXwosnJM6hmR3PDp3UOVwhLUn5ObUNXLw5zgBUAVjjZV1cmM19vwKm var9
   ) {
      super(var2, var3, var4, 150, 20, "");
      this.BatModInstallerMain = var5;
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = var6;
      this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = var7;
      this.ColorTextPane = (var8 - var6) / (var7 - var6);
      this.InstallationLogger = var9;
      this.Downloader = var1;
      this.ButtonAction = this.CustomSpinner();
   }

   public float BatModClient() {
      return this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         + (
               this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                  - this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            )
            * this.ColorTextPane;
   }

   public void BatModClient(float var1, boolean var2) {
      this.ColorTextPane = (
            var1 - this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         )
         / (
            this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
               - this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         );
      this.ButtonAction = this.CustomSpinner();
      if (var2) {
         this.Downloader
            .BatModClient(
               this.Spinner,
               this.BatModClient()
            );
      }
   }

   public float Button() {
      return this.ColorTextPane;
   }

   private String CustomSpinner() {
      return this.InstallationLogger == null
         ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               this.BatModInstallerMain
            )
            + ": "
            + this.BatModClient()
         : this.InstallationLogger
            .BatModClient(
               this.Spinner,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  this.BatModInstallerMain
               ),
               this.BatModClient()
            );
   }

   @Override
   protected int Button(boolean var1) {
      return 0;
   }

   public void ButtonAction(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.ProgressBar) {
         UuNRPdngxLJ1piSbtVWTy5d1r0yYnVPdrWVdJIzhO5AWQSs4oLD4MB0wnDcMfN6xGgAGeksJvSQysKaZzGku3I7UiwUCohf4THta var4 = var1.ColorTextPane;
         var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            .BatModClient(
               BatModClient
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         this.BatModProgressBar = var2
               >= this.Button
            && var3 >= this.CustomSpinner
            && var2 < this.Button + this.width
            && var3 < this.CustomSpinner + this.height;
         int var5 = this.Button(
            this.BatModProgressBar
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            770, 771, 1, 0
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            770, 771
         );
         this.Button(
            this.Button,
            this.CustomSpinner,
            0,
            46 + var5 * 20,
            this.width / 2,
            this.height
         );
         this.Button(
            this.Button + this.width / 2,
            this.CustomSpinner,
            200 - this.width / 2,
            46 + var5 * 20,
            this.width / 2,
            this.height
         );
         this.CustomSpinner(var1, var2, var3);
         int var6 = 14737632;
         if (!this.Checkbox) {
            var6 = 10526880;
         } else if (this.BatModProgressBar) {
            var6 = 16777120;
         }

         this.BatModClient(
            var4,
            this.ButtonAction,
            this.Button + this.width / 2,
            this.CustomSpinner + (this.height - 8) / 2,
            var6
         );
      }
   }

   @Override
   protected void CustomSpinner(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.ProgressBar) {
         if (this.ColorChooser) {
            this.ColorTextPane = (float)(
                  var2 - (this.Button + 4)
               )
               / (this.width - 8);
            if (this.ColorTextPane < 0.0F) {
               this.ColorTextPane = 0.0F;
            }

            if (this.ColorTextPane > 1.0F) {
               this.ColorTextPane = 1.0F;
            }

            this.ButtonAction = this.CustomSpinner();
            this.Downloader
               .BatModClient(
                  this.Spinner,
                  this.BatModClient()
               );
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY var4 = BatModClient.BatModClient()
            .ProgressBar();
         if (var4.fancyButtons) {
            if (this.Checkbox
               && this.BatModProgressBar
               && this.IntegerSpinner < 5.0F) {
               this.IntegerSpinner = this.IntegerSpinner
                  + (float)(
                        System.currentTimeMillis() - this.TextField
                     )
                     / 20.0F;
               if (this.IntegerSpinner > 5.0F) {
                  this.IntegerSpinner = 5.0F;
               }
            }

            if ((
                  !this.Checkbox
                     || !this.BatModProgressBar
               )
               && this.IntegerSpinner > 0.0F) {
               this.IntegerSpinner = this.IntegerSpinner
                  - (float)(
                        System.currentTimeMillis() - this.TextField
                     )
                     / 20.0F;
               if (this.IntegerSpinner < 0.0F) {
                  this.IntegerSpinner = 0.0F;
               }
            }

            this.TextField = System.currentTimeMillis();
            int var5 = Integer.MAX_VALUE;
            if (var4.fancyButtonsFading && 0.0F < this.IntegerSpinner) {
               Color var6 = new Color(Integer.MAX_VALUE, true);

               for (int var7 = 0; var7 < (int)this.IntegerSpinner; var7++) {
                  var6 = var6.darker();
               }

               var5 = var6.getRGB();
            }

            float var10 = this.Button
               + (int)(this.ColorTextPane * (this.width - 8));
            float var11 = this.CustomSpinner;
            float var8 = 8.0F;
            float var9 = 20.0F;
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
               var10 + 1.0F, var11 + 1.0F, var10 + 8.0F - 1.0F, var11 + 20.0F - 1.0F, var5
            );
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.BatModClient(
               var10, var11 + 1.0F, var10 + 1.0F, var11 + var9 - 1.0F, -861756766
            );
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.BatModClient(
               var10 + 1.0F, var11, var10 + var8 - 1.0F, var11 + 1.0F, -861756766
            );
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.BatModClient(
               var10 + var8 - 1.0F, var11 + 1.0F, var10 + var8, var11 + var9 - 1.0F, -861756766
            );
            O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.BatModClient(
               var10 + 1.0F, var11 + var9 - 1.0F, var10 + var8 - 1.0F, var11 + var9, -861756766
            );
         } else {
            this.Button(
               this.Button
                  + (int)(this.ColorTextPane * (this.width - 8)),
               this.CustomSpinner,
               0,
               66,
               4,
               20
            );
            this.Button(
               this.Button
                  + (int)(this.ColorTextPane * (this.width - 8))
                  + 4,
               this.CustomSpinner,
               196,
               66,
               4,
               20
            );
         }
      }
   }

   public void CustomSpinner(float var1) {
      this.ColorTextPane = var1;
      this.ButtonAction = this.CustomSpinner();
      this.Downloader
         .BatModClient(
            this.Spinner,
            this.BatModClient()
         );
   }

   @Override
   public boolean Button(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (super.Button(var1, var2, var3)) {
         this.ColorTextPane = (float)(
               var2 - (this.Button + 4)
            )
            / (this.width - 8);
         if (this.ColorTextPane < 0.0F) {
            this.ColorTextPane = 0.0F;
         }

         if (this.ColorTextPane > 1.0F) {
            this.ColorTextPane = 1.0F;
         }

         this.ButtonAction = this.CustomSpinner();
         this.Downloader
            .BatModClient(
               this.Spinner,
               this.BatModClient()
            );
         this.ColorChooser = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void BatModClient(int var1, int var2) {
      this.ColorChooser = false;
   }
}
