public class aPUNLBpY0ukf7HWXMNx6Owyyrdcu3wAWkgXZsINTO3X99ZSSXKStE2rz3ZfADa1bYnRUpFCQuoGkBC6QOYy4XI005u08RCTsOdf
   extends vSFCOihOVdb66WnFUJWD1xQzkxJAMLd8np6U0YutbJZxdsR2j1zSkcs6E7ViMKrSeu5zm9Ruy6PgYoxy6sBYYuuEUtrR1hy03CgG {
   public aPUNLBpY0ukf7HWXMNx6Owyyrdcu3wAWkgXZsINTO3X99ZSSXKStE2rz3ZfADa1bYnRUpFCQuoGkBC6QOYy4XI005u08RCTsOdf() {
      this.BatModProgressBar = true;
   }

   public aPUNLBpY0ukf7HWXMNx6Owyyrdcu3wAWkgXZsINTO3X99ZSSXKStE2rz3ZfADa1bYnRUpFCQuoGkBC6QOYy4XI005u08RCTsOdf(int var1, byte var2, byte var3, boolean var4) {
      super(var1);
      this.Spinner = var2;
      this.Checkbox = var3;
      this.BatModProgressBar = true;
      this.ProgressBar = var4;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      super.BatModClient(var1);
      this.Spinner = var1.readByte();
      this.Checkbox = var1.readByte();
      this.ProgressBar = var1.readBoolean();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      super.Button(var1);
      var1.writeByte(this.Spinner);
      var1.writeByte(this.Checkbox);
      var1.writeBoolean(this.ProgressBar);
   }
}
