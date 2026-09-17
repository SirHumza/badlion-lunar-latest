public class S4bLhQrIvZLmuSAthf7LS3opKxhWlulsLMV0zC1TWqR6rIeOHJPCiMiNWOhGNHu5J73U3vItHWS3LCLKZs9JFFDImWT17FxEbm5o
   extends vSFCOihOVdb66WnFUJWD1xQzkxJAMLd8np6U0YutbJZxdsR2j1zSkcs6E7ViMKrSeu5zm9Ruy6PgYoxy6sBYYuuEUtrR1hy03CgG {
   public S4bLhQrIvZLmuSAthf7LS3opKxhWlulsLMV0zC1TWqR6rIeOHJPCiMiNWOhGNHu5J73U3vItHWS3LCLKZs9JFFDImWT17FxEbm5o() {
      this.BatModProgressBar = true;
   }

   public S4bLhQrIvZLmuSAthf7LS3opKxhWlulsLMV0zC1TWqR6rIeOHJPCiMiNWOhGNHu5J73U3vItHWS3LCLKZs9JFFDImWT17FxEbm5o(
      int var1, byte var2, byte var3, byte var4, byte var5, byte var6, boolean var7
   ) {
      super(var1);
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.Spinner = var5;
      this.Checkbox = var6;
      this.ProgressBar = var7;
      this.BatModProgressBar = true;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      super.BatModClient(var1);
      this.Button = var1.readByte();
      this.CustomSpinner = var1.readByte();
      this.ButtonAction = var1.readByte();
      this.Spinner = var1.readByte();
      this.Checkbox = var1.readByte();
      this.ProgressBar = var1.readBoolean();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      super.Button(var1);
      var1.writeByte(this.Button);
      var1.writeByte(this.CustomSpinner);
      var1.writeByte(this.ButtonAction);
      var1.writeByte(this.Spinner);
      var1.writeByte(this.Checkbox);
      var1.writeBoolean(this.ProgressBar);
   }
}
