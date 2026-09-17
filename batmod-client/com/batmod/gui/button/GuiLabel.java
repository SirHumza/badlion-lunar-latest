package com.batmod.gui.button;

public class GuiLabel extends dQzeRsa3fcaXtNWNPauml6R6nQvxrxCwaHAilgFEjrTnDgyNdDJiJ3WwXZXmxN4IyUmFs4BamJ8rvO1sXVaOybtfYqqZsAnOqRDR {
   protected int width;
   protected int height;
   public int BatModClient;
   public int Button;
   public int CustomSpinner;
   public boolean ButtonAction;
   public boolean Spinner;
   public boolean Checkbox;
   private String ProgressBar;
   private int BatModProgressBar;
   private int ColorChooser = -1;
   private boolean IntegerSpinner;
   private boolean TextField;

   public GuiLabel(int var1, String var2) {
      this(var1, var2, 0, 0);
   }

   public GuiLabel(int var1, String var2, boolean var3) {
      this(var1, var2, 0, 0, var3);
   }

   public GuiLabel(int var1, String var2, int var3, int var4) {
      this(var1, var2, var3, var4, false);
   }

   public GuiLabel(int var1, String var2, int var3, int var4, boolean var5) {
      this.CustomSpinner = var1;
      this.ProgressBar = var2;
      this.BatModClient = var3;
      this.Button = var4;
      this.Checkbox = var5;
      this.ButtonAction = true;
      this.Spinner = true;
      this.width = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
         .ColorTextPane
         .BatModClient(var2);
      this.height = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
         .ColorTextPane
         .Spinner;
      this.BatModProgressBar = -1;
      this.IntegerSpinner = true;
   }

   public void BatModClient(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, int var2, int var3
   ) {
      if (this.Spinner) {
         UuNRPdngxLJ1piSbtVWTy5d1r0yYnVPdrWVdJIzhO5AWQSs4oLD4MB0wnDcMfN6xGgAGeksJvSQysKaZzGku3I7UiwUCohf4THta var4 = var1.ColorTextPane;
         boolean var5 = this.Button(var2, var3);
         var4.BatModClient(
            this.ProgressBar,
            this.TextField
               ? this.BatModClient
                  - var4.BatModClient(
                        this.ProgressBar
                     )
                     / 2.0F
               : this.BatModClient,
            this.Button,
            var5 && this.ColorChooser != -1
               ? this.ColorChooser
               : this.BatModProgressBar,
            this.IntegerSpinner
         );
      }
   }

   public String BatModClient() {
      return this.ProgressBar;
   }

   public int Button() {
      return this.BatModProgressBar;
   }

   public int CustomSpinner() {
      return this.ColorChooser;
   }

   public boolean ButtonAction() {
      return this.IntegerSpinner;
   }

   public boolean Spinner() {
      return this.TextField;
   }

   public GuiLabel BatModClient(String var1) {
      this.ProgressBar = var1;
      return this;
   }

   public GuiLabel BatModClient(int var1) {
      this.BatModProgressBar = var1;
      return this;
   }

   public GuiLabel Button(int var1) {
      this.ColorChooser = var1;
      return this;
   }

   public GuiLabel BatModClient(boolean var1) {
      this.IntegerSpinner = var1;
      return this;
   }

   public GuiLabel Button(boolean var1) {
      this.TextField = var1;
      return this;
   }

   public void setPosition(int var1, int var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public int Checkbox() {
      return this.width;
   }

   public int ProgressBar() {
      return this.height;
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
         ? (int)(
            this.BatModClient
               - AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
                     .ColorTextPane
                     .BatModClient(
                        this.ProgressBar
                     )
                  / 2.0F
         )
         : this.BatModClient;
      return var1 >= var3
         && var2 >= this.Button
         && var1 < var3 + this.width
         && var2 < this.Button + this.height;
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
