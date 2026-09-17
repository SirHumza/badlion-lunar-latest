public class L8cw7BwwjaycvmbCRY1jomapqMooyDHPS1vNKcMZwPvIoqI5ZshWy96QOnVdU5MfXLwrMHppkaY7szBBL1JtK8zvXNJpqfsxfqtd
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI BatModClient;
   private float Button;
   private float CustomSpinner;
   private float ButtonAction;
   private float Spinner;
   private float Checkbox;
   private float ProgressBar;
   private float BatModProgressBar;
   private int ColorChooser;
   private boolean IntegerSpinner;
   private int[] TextField;

   public L8cw7BwwjaycvmbCRY1jomapqMooyDHPS1vNKcMZwPvIoqI5ZshWy96QOnVdU5MfXLwrMHppkaY7szBBL1JtK8zvXNJpqfsxfqtd() {
   }

   public L8cw7BwwjaycvmbCRY1jomapqMooyDHPS1vNKcMZwPvIoqI5ZshWy96QOnVdU5MfXLwrMHppkaY7szBBL1JtK8zvXNJpqfsxfqtd(
      bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI var1,
      boolean var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int... var11
   ) {
      this.BatModClient = var1;
      this.IntegerSpinner = var2;
      this.Button = var3;
      this.CustomSpinner = var4;
      this.ButtonAction = var5;
      this.Spinner = var6;
      this.Checkbox = var7;
      this.ProgressBar = var8;
      this.BatModProgressBar = var9;
      this.ColorChooser = var10;
      this.TextField = var11;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModClient(
         var1.readInt()
      );
      if (this.BatModClient == null) {
         this.BatModClient = bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m;
      }

      this.IntegerSpinner = var1.readBoolean();
      this.Button = var1.readFloat();
      this.CustomSpinner = var1.readFloat();
      this.ButtonAction = var1.readFloat();
      this.Spinner = var1.readFloat();
      this.Checkbox = var1.readFloat();
      this.ProgressBar = var1.readFloat();
      this.BatModProgressBar = var1.readFloat();
      this.ColorChooser = var1.readInt();
      int var2 = this.BatModClient
         .ButtonAction();
      this.TextField = new int[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.TextField[var3] = var1.ButtonAction();
      }
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeInt(
         this.BatModClient
            .CustomSpinner()
      );
      var1.writeBoolean(this.IntegerSpinner);
      var1.writeFloat(this.Button);
      var1.writeFloat(this.CustomSpinner);
      var1.writeFloat(this.ButtonAction);
      var1.writeFloat(this.Spinner);
      var1.writeFloat(this.Checkbox);
      var1.writeFloat(this.ProgressBar);
      var1.writeFloat(this.BatModProgressBar);
      var1.writeInt(this.ColorChooser);
      int var2 = this.BatModClient
         .ButtonAction();

      for (int var3 = 0; var3 < var2; var3++) {
         var1.Button(
            this.TextField[var3]
         );
      }
   }

   public bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI BatModClient() {
      return this.BatModClient;
   }

   public boolean Button() {
      return this.IntegerSpinner;
   }

   public double CustomSpinner() {
      return this.Button;
   }

   public double ButtonAction() {
      return this.CustomSpinner;
   }

   public double Spinner() {
      return this.ButtonAction;
   }

   public float Checkbox() {
      return this.Spinner;
   }

   public float ProgressBar() {
      return this.Checkbox;
   }

   public float BatModProgressBar() {
      return this.ProgressBar;
   }

   public float ColorChooser() {
      return this.BatModProgressBar;
   }

   public int IntegerSpinner() {
      return this.ColorChooser;
   }

   public int[] TextField() {
      return this.TextField;
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }
}
