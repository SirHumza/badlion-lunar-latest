public class Uu1gPsIXl6w7zx4Ol3AaYmSzj1mW00E1JFYMpxjjZYoKx3hKaAt4M4501HKRDTwi5l3qTCylFiy9kmlBZp2WOxpJYnmUU3tkq1NA
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private float BatModClient;
   private float Button;
   private boolean CustomSpinner;
   private boolean ButtonAction;

   public Uu1gPsIXl6w7zx4Ol3AaYmSzj1mW00E1JFYMpxjjZYoKx3hKaAt4M4501HKRDTwi5l3qTCylFiy9kmlBZp2WOxpJYnmUU3tkq1NA() {
   }

   public Uu1gPsIXl6w7zx4Ol3AaYmSzj1mW00E1JFYMpxjjZYoKx3hKaAt4M4501HKRDTwi5l3qTCylFiy9kmlBZp2WOxpJYnmUU3tkq1NA(
      float var1, float var2, boolean var3, boolean var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readFloat();
      this.Button = var1.readFloat();
      byte var2 = var1.readByte();
      this.CustomSpinner = (var2 & 1) > 0;
      this.ButtonAction = (var2 & 2) > 0;
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeFloat(this.BatModClient);
      var1.writeFloat(this.Button);
      byte var2 = 0;
      if (this.CustomSpinner) {
         var2 = (byte)(var2 | 1);
      }

      if (this.ButtonAction) {
         var2 = (byte)(var2 | 2);
      }

      var1.writeByte(var2);
   }

   public void BatModClient(
      jd1UHCmzVHuD5ZneEIeTLT5Remfkv7gUaHdafrw3DCDp0i41GXNSGz8qOpX0zdN2dh03gpkqwmwA2uRLDZmHuYpWgk7EL6w0WsnO var1
   ) {
      var1.BatModClient(this);
   }

   public float BatModClient() {
      return this.BatModClient;
   }

   public float Button() {
      return this.Button;
   }

   public boolean CustomSpinner() {
      return this.CustomSpinner;
   }

   public boolean ButtonAction() {
      return this.ButtonAction;
   }
}
