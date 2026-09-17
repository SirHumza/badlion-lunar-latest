import org.lwjgl.opengl.GL11;

public class hLCGzMS9IDGMPqcijX2oIFVLZ7GBg8N9woz4eqn4yEWgNWW0QE783d1hc6sJr79fpL8Rc0BJUT19gPrImBcqes3hWOgoZWA1A8Cu {
   private orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ BatModClient = null;
   private int Button = 0;
   private int CustomSpinner = 0;
   private float ButtonAction = 0.0F;
   private float Spinner = 0.0F;
   private float Checkbox = 0.0F;
   private int ProgressBar = 0;
   private int BatModProgressBar = 0;
   private int ColorChooser = 0;
   private float IntegerSpinner = 0.0F;
   private float TextField = 0.0F;
   private float ColorTextPane = 0.0F;
   private float BatModInstallerMain = 0.0F;
   private float aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = 0.0F;

   public hLCGzMS9IDGMPqcijX2oIFVLZ7GBg8N9woz4eqn4yEWgNWW0QE783d1hc6sJr79fpL8Rc0BJUT19gPrImBcqes3hWOgoZWA1A8Cu(
      orPwXKfLSnVvAlH3rtllhSwaCzk3PInw1cwmL08aSh2jUGEUGxPWeOtkszv85SJeAFRvsF8UZCMoC4XEUtmZPWdr9eJnwrDkgZ var1,
      int var2,
      int var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      int var9,
      float var10
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
      this.Checkbox = var6;
      this.ProgressBar = var7;
      this.BatModProgressBar = var8;
      this.ColorChooser = var9;
      this.IntegerSpinner = var10;
      this.TextField = var2
         / var1.BatModClient;
      this.ColorTextPane = var3
         / var1.Button;
      this.BatModInstallerMain = (var2 + var7)
         / var1.BatModClient;
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = (var3 + var8)
         / var1.Button;
   }

   public void BatModClient(
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1, float var2
   ) {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
         this.ButtonAction * var2,
         this.Spinner * var2,
         this.Checkbox * var2
      );
      float var3 = this.TextField;
      float var4 = this.BatModInstallerMain;
      float var5 = this.ColorTextPane;
      float var6 = this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
      if (this.BatModClient.TextField
         )
       {
         var3 = this.BatModInstallerMain;
         var4 = this.TextField;
      }

      if (this.BatModClient.InstallationLogger
         )
       {
         var5 = this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
         var6 = this.ColorTextPane;
      }

      BatModClient(
         var1,
         var3,
         var5,
         var4,
         var6,
         this.ProgressBar,
         this.BatModProgressBar,
         var2 * this.ColorChooser,
         this.BatModClient.BatModClient,
         this.BatModClient.Button
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
         -this.ButtonAction * var2,
         -this.Spinner * var2,
         -this.Checkbox * var2
      );
   }

   public static void BatModClient(
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var0,
      float var1,
      float var2,
      float var3,
      float var4,
      int var5,
      int var6,
      float var7,
      float var8,
      float var9
   ) {
      if (var7 < 6.25E-4F) {
         var7 = 6.25E-4F;
      }

      float var10 = var3 - var1;
      float var11 = var4 - var2;
      double var12 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Spinner(
            var10
         )
         * (var8 / 16.0F);
      double var14 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Spinner(
            var11
         )
         * (var9 / 16.0F);
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var16 = var0.CustomSpinner();
      GL11.glNormal3f(0.0F, 0.0F, -1.0F);
      var16.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
      );
      var16.Button(0.0, var14, 0.0)
         .BatModClient(var1, var4)
         .Spinner();
      var16.Button(var12, var14, 0.0)
         .BatModClient(var3, var4)
         .Spinner();
      var16.Button(var12, 0.0, 0.0)
         .BatModClient(var3, var2)
         .Spinner();
      var16.Button(0.0, 0.0, 0.0)
         .BatModClient(var1, var2)
         .Spinner();
      var0.Button();
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      var16.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
      );
      var16.Button(0.0, 0.0, var7)
         .BatModClient(var1, var2)
         .Spinner();
      var16.Button(var12, 0.0, var7)
         .BatModClient(var3, var2)
         .Spinner();
      var16.Button(var12, var14, var7)
         .BatModClient(var3, var4)
         .Spinner();
      var16.Button(0.0, var14, var7)
         .BatModClient(var1, var4)
         .Spinner();
      var0.Button();
      float var17 = 0.5F * var10 / var5;
      float var18 = 0.5F * var11 / var6;
      GL11.glNormal3f(-1.0F, 0.0F, 0.0F);
      var16.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
      );

      for (int var19 = 0; var19 < var5; var19++) {
         float var20 = (float)var19 / var5;
         float var21 = var1 + var10 * var20 + var17;
         var16.Button(var20 * var12, var14, var7)
            .BatModClient(var21, var4)
            .Spinner();
         var16.Button(var20 * var12, var14, 0.0)
            .BatModClient(var21, var4)
            .Spinner();
         var16.Button(var20 * var12, 0.0, 0.0)
            .BatModClient(var21, var2)
            .Spinner();
         var16.Button(var20 * var12, 0.0, var7)
            .BatModClient(var21, var2)
            .Spinner();
      }

      var0.Button();
      GL11.glNormal3f(1.0F, 0.0F, 0.0F);
      var16.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
      );

      for (int var23 = 0; var23 < var5; var23++) {
         float var26 = (float)var23 / var5;
         float var29 = var1 + var10 * var26 + var17;
         float var22 = var26 + 1.0F / var5;
         var16.Button(var22 * var12, 0.0, var7)
            .BatModClient(var29, var2)
            .Spinner();
         var16.Button(var22 * var12, 0.0, 0.0)
            .BatModClient(var29, var2)
            .Spinner();
         var16.Button(var22 * var12, var14, 0.0)
            .BatModClient(var29, var4)
            .Spinner();
         var16.Button(var22 * var12, var14, var7)
            .BatModClient(var29, var4)
            .Spinner();
      }

      var0.Button();
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      var16.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
      );

      for (int var24 = 0; var24 < var6; var24++) {
         float var27 = (float)var24 / var6;
         float var30 = var2 + var11 * var27 + var18;
         float var32 = var27 + 1.0F / var6;
         var16.Button(0.0, var32 * var14, var7)
            .BatModClient(var1, var30)
            .Spinner();
         var16.Button(var12, var32 * var14, var7)
            .BatModClient(var3, var30)
            .Spinner();
         var16.Button(var12, var32 * var14, 0.0)
            .BatModClient(var3, var30)
            .Spinner();
         var16.Button(0.0, var32 * var14, 0.0)
            .BatModClient(var1, var30)
            .Spinner();
      }

      var0.Button();
      GL11.glNormal3f(0.0F, -1.0F, 0.0F);
      var16.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
      );

      for (int var25 = 0; var25 < var6; var25++) {
         float var28 = (float)var25 / var6;
         float var31 = var2 + var11 * var28 + var18;
         var16.Button(var12, var28 * var14, var7)
            .BatModClient(var3, var31)
            .Spinner();
         var16.Button(0.0, var28 * var14, var7)
            .BatModClient(var1, var31)
            .Spinner();
         var16.Button(0.0, var28 * var14, 0.0)
            .BatModClient(var1, var31)
            .Spinner();
         var16.Button(var12, var28 * var14, 0.0)
            .BatModClient(var3, var31)
            .Spinner();
      }

      var0.Button();
   }
}
