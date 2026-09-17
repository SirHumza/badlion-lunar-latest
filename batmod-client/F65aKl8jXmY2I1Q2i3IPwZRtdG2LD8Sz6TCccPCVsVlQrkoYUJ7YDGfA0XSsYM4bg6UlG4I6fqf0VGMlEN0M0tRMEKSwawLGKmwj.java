public class F65aKl8jXmY2I1Q2i3IPwZRtdG2LD8Sz6TCccPCVsVlQrkoYUJ7YDGfA0XSsYM4bg6UlG4I6fqf0VGMlEN0M0tRMEKSwawLGKmwj
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private static final q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
      -1, -1, -1
   );
   private q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Button;
   private int CustomSpinner;
   private k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 ButtonAction;
   private float Spinner;
   private float Checkbox;
   private float ProgressBar;

   public F65aKl8jXmY2I1Q2i3IPwZRtdG2LD8Sz6TCccPCVsVlQrkoYUJ7YDGfA0XSsYM4bg6UlG4I6fqf0VGMlEN0M0tRMEKSwawLGKmwj() {
   }

   public F65aKl8jXmY2I1Q2i3IPwZRtdG2LD8Sz6TCccPCVsVlQrkoYUJ7YDGfA0XSsYM4bg6UlG4I6fqf0VGMlEN0M0tRMEKSwawLGKmwj(
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var1
   ) {
      this(BatModClient, 255, var1, 0.0F, 0.0F, 0.0F);
   }

   public F65aKl8jXmY2I1Q2i3IPwZRtdG2LD8Sz6TCccPCVsVlQrkoYUJ7YDGfA0XSsYM4bg6UlG4I6fqf0VGMlEN0M0tRMEKSwawLGKmwj(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      int var2,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3,
      float var4,
      float var5,
      float var6
   ) {
      this.Button = var1;
      this.CustomSpinner = var2;
      this.ButtonAction = var3 != null
         ? var3.IntegerSpinner()
         : null;
      this.Spinner = var4;
      this.Checkbox = var5;
      this.ProgressBar = var6;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.Button = var1.Button();
      this.CustomSpinner = var1.readUnsignedByte();
      this.ButtonAction = var1.BatModProgressBar();
      this.Spinner = var1.readUnsignedByte() / 16.0F;
      this.Checkbox = var1.readUnsignedByte() / 16.0F;
      this.ProgressBar = var1.readUnsignedByte() / 16.0F;
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.BatModClient(
         this.Button
      );
      var1.writeByte(this.CustomSpinner);
      var1.BatModClient(
         this.ButtonAction
      );
      var1.writeByte((int)(this.Spinner * 16.0F));
      var1.writeByte((int)(this.Checkbox * 16.0F));
      var1.writeByte((int)(this.ProgressBar * 16.0F));
   }

   public void BatModClient(
      jd1UHCmzVHuD5ZneEIeTLT5Remfkv7gUaHdafrw3DCDp0i41GXNSGz8qOpX0zdN2dh03gpkqwmwA2uRLDZmHuYpWgk7EL6w0WsnO var1
   ) {
      var1.BatModClient(this);
   }

   public q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW BatModClient() {
      return this.Button;
   }

   public int Button() {
      return this.CustomSpinner;
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 CustomSpinner() {
      return this.ButtonAction;
   }

   public float ButtonAction() {
      return this.Spinner;
   }

   public float Spinner() {
      return this.Checkbox;
   }

   public float Checkbox() {
      return this.ProgressBar;
   }
}
