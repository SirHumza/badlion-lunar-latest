package com.batmod.gui.button;

import java.awt.Color;

public class GuiToggleButton extends dQzeRsa3fcaXtNWNPauml6R6nQvxrxCwaHAilgFEjrTnDgyNdDJiJ3WwXZXmxN4IyUmFs4BamJ8rvO1sXVaOybtfYqqZsAnOqRDR {
   protected int width;
   protected int height;
   public int BatModClient;
   public int Button;
   public int CustomSpinner;
   public boolean ButtonAction;
   public boolean Spinner;
   protected boolean Checkbox;
   protected boolean ProgressBar;
   private boolean BatModProgressBar;
   private String ColorChooser;
   private int IntegerSpinner;
   private boolean TextField;
   private waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW ColorTextPane = new waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW();
   private float BatModInstallerMain;
   private final int aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   private long LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;

   public GuiToggleButton(int var1) {
      this(var1, false);
   }

   public GuiToggleButton(int var1, boolean var2) {
      this(var1, var2, false);
   }

   public GuiToggleButton(int var1, boolean var2, boolean var3) {
      this(var1, var2, var3, null);
   }

   public GuiToggleButton(int var1, boolean var2, boolean var3, String var4) {
      this(var1, var2, var3, var4, false);
   }

   public GuiToggleButton(int var1, boolean var2, boolean var3, String var4, boolean var5) {
      this(var1, var2, var3, var4, -1, var5);
   }

   public GuiToggleButton(int var1, boolean var2, boolean var3, String var4, int var5) {
      this(var1, var2, var3, var4, var5, false);
   }

   public GuiToggleButton(int var1, boolean var2, boolean var3, String var4, int var5, boolean var6) {
      this.width = var3 ? 20 : 30;
      this.height = var3 ? 10 : 15;
      this.ButtonAction = true;
      this.Spinner = true;
      this.CustomSpinner = var1;
      this.ProgressBar = var2;
      this.BatModProgressBar = var3;
      this.ColorChooser = var4;
      this.IntegerSpinner = var5;
      this.TextField = var6;
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = (int)(
         this.width - 2 - (this.width - 4) / 2.0F
      );
      if (var2) {
         this.BatModInstallerMain = this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
      }
   }

   public GuiToggleButton(int var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public GuiToggleButton(int var1, int var2, int var3, boolean var4) {
      this(var1, var4);
      this.BatModClient = var2;
      this.Button = var3;
   }

   public void setPosition(int var1, int var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public void BatModClient(int var1) {
      this.height = var1;
   }

   public void Button(int var1) {
      this.width = var1;
   }

   public void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.Spinner) {
         this.Checkbox = this.Button(
            var2, var3
         );
         this.ColorTextPane
            .BatModClient(
               this.ButtonAction
                  && this.Checkbox
            );
         if (this.ButtonAction
            && this.ProgressBar
            && this.BatModInstallerMain
               < this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA) {
            this.BatModInstallerMain = this.BatModInstallerMain
               + (float)(System.currentTimeMillis() - this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN)
                  / (this.BatModProgressBar ? 10.0F : 5.0F);
            if (this.BatModInstallerMain
               > this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA) {
               this.BatModInstallerMain = this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
            }
         }

         if ((
               !this.ButtonAction
                  || !this.ProgressBar
            )
            && this.BatModInstallerMain > 0.0F) {
            this.BatModInstallerMain = this.BatModInstallerMain
               - (float)(System.currentTimeMillis() - this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN)
                  / (this.BatModProgressBar ? 10.0F : 5.0F);
            if (this.BatModInstallerMain < 0.0F) {
               this.BatModInstallerMain = 0.0F;
            }
         }

         this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = System.currentTimeMillis();
         float var4 = this.BatModInstallerMain
            / this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
         Color var5 = new Color((255.0F - 170.0F * var4) / 255.0F, (85.0F + 170.0F * var4) / 255.0F, 0.33333334F, 0.8F);
         int var6 = this.TextField
            ? this.BatModClient - this.width
            : this.BatModClient;
         int var7 = this.ColorTextPane
            .BatModClient();
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            var6,
            this.Button,
            var6 + this.width,
            this.Button + this.height,
            var7
         );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            var6,
            this.Button,
            var6 + 1,
            this.Button + this.height - 1,
            var7
         );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            var6 + 1,
            this.Button,
            var6 + this.width,
            this.Button + 1,
            var7
         );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            var6 + this.width - 1,
            this.Button + 1,
            var6 + this.width,
            this.Button + this.height,
            var7
         );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            var6,
            this.Button + this.height - 1,
            var6 + this.width - 1,
            this.Button + this.height,
            var7
         );
         O4JzH5GMgUHGlKecm4hxPzaf3zuoPZnpuAM4mQgZh64rtjlZNDY1KXoH0lbMUXqC2UQPeWECQqnpwhpqHNTYtonTSyw0zwslrH.Button(
            var6 + this.BatModInstallerMain + 2.0F,
            this.Button + 2,
            var6 + this.BatModInstallerMain + (this.width - 4) / 2.0F,
            this.Button + this.height - 2,
            var5.getRGB()
         );
         if (this.ColorChooser != null) {
            var6 = this.TextField
               ? var6
                  - var1.ColorTextPane
                     .BatModClient(
                        this.ColorChooser
                     )
                  - 4
               : var6 + this.width + 4;
            var1.ColorTextPane
               .BatModClient(
                  this.ColorChooser,
                  var6,
                  this.Button
                     + this.height / 2.0F
                     - var1.ColorTextPane.Spinner
                        / 2.0F
                     + 1.0F,
                  this.IntegerSpinner,
                  true
               );
         }
      }
   }

   public int BatModClient() {
      return this.ColorChooser == null
         ? this.width
         : this.width
            + 4
            + AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .ColorTextPane
               .BatModClient(
                  this.ColorChooser
               );
   }

   public int Button() {
      return this.width;
   }

   public int CustomSpinner() {
      return this.height;
   }

   public boolean ButtonAction() {
      return this.ProgressBar;
   }

   public void BatModClient(boolean var1) {
      this.ProgressBar = var1;
   }

   public boolean Spinner() {
      return this.BatModProgressBar;
   }

   public void Button(boolean var1) {
      this.BatModProgressBar = var1;
   }

   public String Checkbox() {
      return this.ColorChooser;
   }

   public void BatModClient(String var1) {
      this.ColorChooser = var1;
   }

   public int ProgressBar() {
      return this.IntegerSpinner;
   }

   public void CustomSpinner(int var1) {
      this.IntegerSpinner = var1;
   }

   public boolean BatModProgressBar() {
      return this.TextField;
   }

   public void CustomSpinner(boolean var1) {
      this.TextField = var1;
   }

   public void BatModClient(int var1, int var2) {
   }

   public boolean Button(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      return this.ButtonAction
         && this.Spinner
         && this.Button(var2, var3);
   }

   public boolean Button(int var1, int var2) {
      int var3 = this.TextField
         ? this.BatModClient - this.width
         : this.BatModClient;
      return var1 >= var3
         && var2 >= this.Button
         && var1 < var3 + this.width
         && var2 < this.Button + this.height;
   }

   public boolean ColorChooser() {
      return this.Checkbox;
   }

   public void CustomSpinner(int var1, int var2) {
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
