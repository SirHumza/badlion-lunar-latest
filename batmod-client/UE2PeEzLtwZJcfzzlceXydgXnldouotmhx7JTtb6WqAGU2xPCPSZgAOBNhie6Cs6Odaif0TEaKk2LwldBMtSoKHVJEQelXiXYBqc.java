public enum UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc {
   BatModClient(-1, ""),
   Button(0, "survival"),
   CustomSpinner(1, "creative"),
   ButtonAction(2, "adventure"),
   Spinner(3, "spectator");

   int Checkbox;
   String ProgressBar;

   UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc(int var3, String var4) {
      this.Checkbox = var3;
      this.ProgressBar = var4;
   }

   public int BatModClient() {
      return this.Checkbox;
   }

   public String Button() {
      return this.ProgressBar;
   }

   public void BatModClient(
      oZwwM95fsfc2dbcznQ4anQrneIHMgvPZkEqfnJuRxfoGp3fnnmDccijByy77ioJkcQh7yfsoWxikaf6y9IAryDixoGvTLTg7aUzV var1
   ) {
      if (this == CustomSpinner) {
         var1.CustomSpinner = true;
         var1.ButtonAction = true;
         var1.BatModClient = true;
      } else if (this == Spinner) {
         var1.CustomSpinner = true;
         var1.ButtonAction = false;
         var1.BatModClient = true;
         var1.Button = true;
      } else {
         var1.CustomSpinner = false;
         var1.ButtonAction = false;
         var1.BatModClient = false;
         var1.Button = false;
      }

      var1.Spinner = !this.CustomSpinner();
   }

   public boolean CustomSpinner() {
      return this == ButtonAction
         || this == Spinner;
   }

   public boolean ButtonAction() {
      return this == CustomSpinner;
   }

   public boolean Spinner() {
      return this == Button
         || this == ButtonAction;
   }

   public static UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc BatModClient(
      int var0
   ) {
      for (UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc var4 : values()) {
         if (var4.Checkbox == var0) {
            return var4;
         }
      }

      return Button;
   }

   public static UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc BatModClient(
      String var0
   ) {
      for (UE2PeEzLtwZJcfzzlceXydgXnldouotmhx7JTtb6WqAGU2xPCPSZgAOBNhie6Cs6Odaif0TEaKk2LwldBMtSoKHVJEQelXiXYBqc var4 : values()) {
         if (var4.ProgressBar.equals(var0)) {
            return var4;
         }
      }

      return Button;
   }
}
