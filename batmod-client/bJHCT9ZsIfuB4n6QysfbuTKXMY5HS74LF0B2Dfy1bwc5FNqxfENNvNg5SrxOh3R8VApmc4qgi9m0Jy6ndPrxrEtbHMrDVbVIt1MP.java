import java.util.Properties;

public class bJHCT9ZsIfuB4n6QysfbuTKXMY5HS74LF0B2Dfy1bwc5FNqxfENNvNg5SrxOh3R8VApmc4qgi9m0Jy6ndPrxrEtbHMrDVbVIt1MP {
   public String BatModClient = null;
   private int ButtonAction = -1;
   private int Spinner = -1;
   private int Checkbox = -1;
   private int ProgressBar = -1;
   private int BatModProgressBar = 1;
   private boolean ColorChooser = false;
   private float IntegerSpinner = 1.0F;
   private float[] TextField;
   private K1UX3nJv0y1dzJuhvxNEk7lcIe10JhHtpwe4pH07H4HR9vHZi2ooU23Oe5KFxuPv8gQXFIhnHVOJ8IHvG5ppS5JYnb74t98hbEB ColorTextPane;
   private int BatModInstallerMain;
   public int Button;
   public static final float[] CustomSpinner = new float[]{
      1.0F, 0.0F, 0.0F
   };

   public bJHCT9ZsIfuB4n6QysfbuTKXMY5HS74LF0B2Dfy1bwc5FNqxfENNvNg5SrxOh3R8VApmc4qgi9m0Jy6ndPrxrEtbHMrDVbVIt1MP(Properties var1, String var2) {
      this.TextField = CustomSpinner;
      this.ColorTextPane = null;
      this.BatModInstallerMain = 8;
      this.Button = -1;
      dCwDAAXl6wq2u1wZDfNeMusgX51e7h45lpzpVPSImSau0fbkor33y4akJwhNR7XmSHxqVZ9mp4GAK97bNNg2AOvnXpyl9t672Jo7 var3 = new dCwDAAXl6wq2u1wZDfNeMusgX51e7h45lpzpVPSImSau0fbkor33y4akJwhNR7XmSHxqVZ9mp4GAK97bNNg2AOvnXpyl9t672Jo7(
         "CustomSky"
      );
      this.BatModClient = var1.getProperty("source", var2);
      this.ButtonAction = this.Button(
         var1.getProperty("startFadeIn")
      );
      this.Spinner = this.Button(
         var1.getProperty("endFadeIn")
      );
      this.Checkbox = this.Button(
         var1.getProperty("startFadeOut")
      );
      this.ProgressBar = this.Button(
         var1.getProperty("endFadeOut")
      );
      this.BatModProgressBar = G8qlhXcK1iHNz5LYyKPMrGWRkD2W0rlOTl2scVhjPaSRKqw2g8MYTt6yFyoDRAwZutHJjoT7S2WM8gsf3CmR3lFpbTFiTPjacZyk.BatModClient(
         var1.getProperty("blend")
      );
      this.ColorChooser = this.BatModClient(
         var1.getProperty("rotate"), true
      );
      this.IntegerSpinner = this.BatModClient(
         var1.getProperty("speed"), 1.0F
      );
      this.TextField = this.BatModClient(
         var1.getProperty("axis"), CustomSpinner
      );
      this.ColorTextPane = var3.BatModInstallerMain(
         var1.getProperty("days")
      );
      this.BatModInstallerMain = var3.BatModClient(
         var1.getProperty("daysLoop"), 8
      );
   }

   private int Button(String var1) {
      if (var1 == null) {
         return -1;
      }

      String[] var2 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var1, ":"
      );
      if (var2.length != 2) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Invalid time: " + var1
         );
         return -1;
      }

      String var3 = var2[0];
      String var4 = var2[1];
      int var5 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var3, -1
      );
      int var6 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var4, -1
      );
      if (var5 >= 0 && var5 <= 23 && var6 >= 0 && var6 <= 59) {
         var5 -= 6;
         if (var5 < 0) {
            var5 += 24;
         }

         return var5 * 1000 + (int)(var6 / 60.0 * 1000.0);
      } else {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Invalid time: " + var1
         );
         return -1;
      }
   }

   private boolean BatModClient(String var1, boolean var2) {
      if (var1 == null) {
         return var2;
      }

      if (var1.toLowerCase().equals("true")) {
         return true;
      }

      if (var1.toLowerCase().equals("false")) {
         return false;
      }

      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
         "Unknown boolean: " + var1
      );
      return var2;
   }

   private float BatModClient(String var1, float var2) {
      if (var1 == null) {
         return var2;
      } else {
         float var3 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var1, Float.MIN_VALUE
         );
         if (var3 == Float.MIN_VALUE) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "Invalid value: " + var1
            );
            return var2;
         } else {
            return var3;
         }
      }
   }

   private float[] BatModClient(String var1, float[] var2) {
      if (var1 == null) {
         return var2;
      }

      String[] var3 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var1, " "
      );
      if (var3.length != 3) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Invalid axis: " + var1
         );
         return var2;
      }

      float[] var4 = new float[3];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4[var5] = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var3[var5], Float.MIN_VALUE
         );
         if (var4[var5] == Float.MIN_VALUE) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "Invalid axis: " + var1
            );
            return var2;
         }

         if (var4[var5] < -1.0F || var4[var5] > 1.0F) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "Invalid axis values: " + var1
            );
            return var2;
         }
      }

      float var9 = var4[0];
      float var6 = var4[1];
      float var7 = var4[2];
      if (var9 * var9 + var6 * var6 + var7 * var7 < 1.0E-5F) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Invalid axis values: " + var1
         );
         return var2;
      } else {
         return new float[]{var7, var6, -var9};
      }
   }

   public boolean BatModClient(String var1) {
      if (this.BatModClient == null) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "No source texture: " + var1
         );
         return false;
      }

      this.BatModClient = uBMlMKyXwmX0EK0kfsijZNTp4hBUYFfRWKJefXsPH5ivKSSRJfU3L3LDkO7zU6NlrKIEe3qCdknVdKZ4HcZJIorv59e9TNi5jaQf.BatModClient(
         this.BatModClient,
         uBMlMKyXwmX0EK0kfsijZNTp4hBUYFfRWKJefXsPH5ivKSSRJfU3L3LDkO7zU6NlrKIEe3qCdknVdKZ4HcZJIorv59e9TNi5jaQf.BatModClient(
            var1
         )
      );
      if (this.ButtonAction >= 0
         && this.Spinner >= 0
         && this.ProgressBar >= 0) {
         int var2 = this.BatModClient(
            this.Spinner
               - this.ButtonAction
         );
         if (this.Checkbox < 0) {
            this.Checkbox = this.BatModClient(
               this.ProgressBar - var2
            );
            if (this.BatModClient(
               this.Checkbox,
               this.ButtonAction,
               this.Spinner
            )) {
               this.Checkbox = this.Spinner;
            }
         }

         int var3 = this.BatModClient(
            this.Checkbox
               - this.Spinner
         );
         int var4 = this.BatModClient(
            this.ProgressBar
               - this.Checkbox
         );
         int var5 = this.BatModClient(
            this.ButtonAction
               - this.ProgressBar
         );
         int var6 = var2 + var3 + var4 + var5;
         if (var6 != 24000) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "Invalid fadeIn/fadeOut times, sum is not 24h: " + var6
            );
            return false;
         } else if (this.IntegerSpinner < 0.0F) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "Invalid speed: " + this.IntegerSpinner
            );
            return false;
         } else if (this.BatModInstallerMain <= 0) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "Invalid daysLoop: " + this.BatModInstallerMain
            );
            return false;
         } else {
            return true;
         }
      } else {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Invalid times, required are: startFadeIn, endFadeIn and endFadeOut."
         );
         return false;
      }
   }

   private int BatModClient(int var1) {
      while (var1 >= 24000) {
         var1 -= 24000;
      }

      while (var1 < 0) {
         var1 += 24000;
      }

      return var1;
   }

   public void BatModClient(int var1, float var2, float var3) {
      float var4 = var3 * this.Button(var1);
      var4 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var4, 0.0F, 1.0F
      );
      if (var4 >= 1.0E-4F) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
            this.Button
         );
         G8qlhXcK1iHNz5LYyKPMrGWRkD2W0rlOTl2scVhjPaSRKqw2g8MYTt6yFyoDRAwZutHJjoT7S2WM8gsf3CmR3lFpbTFiTPjacZyk.BatModClient(
            this.BatModProgressBar, var4
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         if (this.ColorChooser) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
               var2 * 360.0F * this.IntegerSpinner,
               this.TextField[0],
               this.TextField[1],
               this.TextField[2]
            );
         }

         net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var5 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            90.0F, 1.0F, 0.0F, 0.0F
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            -90.0F, 0.0F, 0.0F, 1.0F
         );
         this.BatModClient(var5, 4);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            90.0F, 1.0F, 0.0F, 0.0F
         );
         this.BatModClient(var5, 1);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            -90.0F, 1.0F, 0.0F, 0.0F
         );
         this.BatModClient(var5, 0);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            90.0F, 0.0F, 0.0F, 1.0F
         );
         this.BatModClient(var5, 5);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            90.0F, 0.0F, 0.0F, 1.0F
         );
         this.BatModClient(var5, 2);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            90.0F, 0.0F, 0.0F, 1.0F
         );
         this.BatModClient(var5, 3);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      }
   }

   private float Button(int var1) {
      if (this.BatModClient(
         var1,
         this.ButtonAction,
         this.Spinner
      )) {
         int var4 = this.BatModClient(
            this.Spinner
               - this.ButtonAction
         );
         int var5 = this.BatModClient(
            var1 - this.ButtonAction
         );
         return (float)var5 / var4;
      } else if (this.BatModClient(
         var1,
         this.Spinner,
         this.Checkbox
      )) {
         return 1.0F;
      } else if (this.BatModClient(
         var1,
         this.Checkbox,
         this.ProgressBar
      )) {
         int var2 = this.BatModClient(
            this.ProgressBar
               - this.Checkbox
         );
         int var3 = this.BatModClient(
            var1 - this.Checkbox
         );
         return 1.0F - (float)var3 / var2;
      } else {
         return 0.0F;
      }
   }

   private void BatModClient(
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1, int var2
   ) {
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var3 = var1.CustomSpinner();
      double var4 = var2 % 3 / 3.0;
      double var6 = var2 / 3 / 2.0;
      var3.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
      );
      var3.Button(-100.0, -100.0, -100.0)
         .BatModClient(var4, var6)
         .Spinner();
      var3.Button(-100.0, -100.0, 100.0)
         .BatModClient(var4, var6 + 0.5)
         .Spinner();
      var3.Button(100.0, -100.0, 100.0)
         .BatModClient(var4 + 0.3333333333333333, var6 + 0.5)
         .Spinner();
      var3.Button(100.0, -100.0, -100.0)
         .BatModClient(var4 + 0.3333333333333333, var6)
         .Spinner();
      var1.Button();
   }

   public boolean BatModClient(
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var1, int var2
   ) {
      if (this.BatModClient(
         var2,
         this.ProgressBar,
         this.ButtonAction
      )) {
         return false;
      }

      if (this.ColorTextPane != null) {
         long var3 = var1.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
         long var5 = var3 - this.ButtonAction;

         while (var5 < 0L) {
            var5 += 24000 * this.BatModInstallerMain;
         }

         int var7 = (int)(var5 / 24000L);
         int var8 = var7 % this.BatModInstallerMain;
         if (!this.ColorTextPane
            .BatModClient(var8)) {
            return false;
         }
      }

      return true;
   }

   private boolean BatModClient(int var1, int var2, int var3) {
      return var2 <= var3 ? var1 >= var2 && var1 <= var3 : var1 >= var2 || var1 <= var3;
   }
}
