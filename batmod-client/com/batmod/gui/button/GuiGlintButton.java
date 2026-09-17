package com.batmod.gui.button;

public class GuiGlintButton extends dQzeRsa3fcaXtNWNPauml6R6nQvxrxCwaHAilgFEjrTnDgyNdDJiJ3WwXZXmxN4IyUmFs4BamJ8rvO1sXVaOybtfYqqZsAnOqRDR {
   protected int width;
   protected int height;
   public int BatModClient;
   public int Button;
   public String CustomSpinner;
   public int ButtonAction;
   public boolean Spinner;
   public boolean Checkbox;
   protected boolean ProgressBar;
   private float BatModProgressBar;
   private long ColorChooser;
   private boolean IntegerSpinner;
   private waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW TextField = new waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW();

   public GuiGlintButton(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 100, 30, var4);
   }

   public GuiGlintButton(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.Spinner = true;
      this.Checkbox = true;
      this.ButtonAction = var1;
      this.BatModClient = var2;
      this.Button = var3;
      this.width = var4;
      this.height = var5;
      this.CustomSpinner = var6;
   }

   public void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.Checkbox) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         this.ProgressBar = this.Button(
            var2, var3
         );
         this.TextField
            .BatModClient(
               this.Spinner
                  && this.ProgressBar
            );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            this.BatModClient,
            this.Button,
            this.BatModClient + this.width,
            this.Button + this.height,
            this.TextField
               .BatModClient()
         );
         if (this.Spinner
            && this.ProgressBar
            && !this.IntegerSpinner
            && this.BatModProgressBar < this.width - 60) {
            this.BatModProgressBar = this.BatModProgressBar
               + (float)(System.currentTimeMillis() - this.ColorChooser)
                  / 1.5F;
            if (this.BatModProgressBar > this.width - 60) {
               this.BatModProgressBar = this.width - 60;
               this.IntegerSpinner = true;
            }
         } else if (this.IntegerSpinner) {
            this.BatModProgressBar = this.BatModProgressBar
               - (float)(System.currentTimeMillis() - this.ColorChooser)
                  / 10.0F;
            if (this.BatModProgressBar < this.width / 4.0F) {
               this.BatModProgressBar = this.width / 4.0F;
               if (!this.ProgressBar
                  || !this.Spinner) {
                  this.IntegerSpinner = false;
               }
            }
         }

         if (!this.ProgressBar
            && this.BatModProgressBar > -this.width - 10) {
            this.BatModProgressBar = this.BatModProgressBar
               - (float)(System.currentTimeMillis() - this.ColorChooser)
                  / 1.5F;
            if (this.BatModProgressBar < -this.width - 10) {
               this.BatModProgressBar = -this.width - 10;
            }
         }

         this.ColorChooser = System.currentTimeMillis();
         if (this.BatModProgressBar != -this.width - 10
            && this.BatModProgressBar != this.width) {
            float var4 = 0.0F;
            float var5 = this.height;

            for (int var6 = this.height * 10; 0.0F < var6; var6--) {
               O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
                  Math.max(
                     this.BatModClient,
                     Math.min(
                        this.BatModClient + this.width,
                        this.BatModClient
                           + var4
                           + this.BatModProgressBar
                           + 60.0F
                     )
                  ),
                  this.Button + var5,
                  Math.max(
                     this.BatModClient,
                     Math.min(
                        this.BatModClient + this.width,
                        this.BatModClient
                           + var4
                           + this.BatModProgressBar
                           + 50.0F
                           + (this.BatModProgressBar + this.width + 10.0F)
                              / 3.0F
                     )
                  ),
                  this.Button + var5 + 0.1F,
                  -1
               );
               var4 += 0.05F;
               var5 -= 0.1F;
            }
         }

         this.BatModClient(
            var1.ColorTextPane,
            (this.Spinner ? "" : "§c")
               + this.CustomSpinner,
            this.BatModClient + this.width / 2,
            this.Button + (this.height - 8) / 2,
            this.ProgressBar ? 16777120 : -1
         );
      }
   }

   public void BatModClient(int var1, int var2) {
   }

   public boolean Button(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      return this.Spinner
         && this.Checkbox
         && this.Button(var2, var3);
   }

   public boolean Button(int var1, int var2) {
      return var1 >= this.BatModClient
         && var2 >= this.Button
         && var1 < this.BatModClient + this.width
         && var2 < this.Button + this.height;
   }

   public boolean BatModClient() {
      return this.ProgressBar;
   }

   public void BatModClient(
      omlx0pF7bmKBPeOIQYt5GAFPmzI90wRLKQBvGkRdZAslUABfNQx644UnEYIQCviE5iDBzGqJnb9vGplA40J9mLbFxDvXOeJiE0xq var1
   ) {
      var1.BatModClient(
         CV0EZoWdhrRYDvOo6smFif8msBV9p0cOxv5q78CBboRaq4FY9IXRuv5BxwvAC7HBZQT1PFRhZcXKCjv2oRzSEylxDOw0VXijWtDu.BatModClient(
            new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD("gui.button.press"), 1.0F
         )
      );
   }
}
