public class UowDAEgH5tZ6ynjNlAhbBt2RkV5Uct4sxdsYQu1Nr3vONuBGL4AvyldtLWUhxd2qtB9l6v2offwjVAEUiSY2KnR8t3tR2WaQ2zA0
   extends vSFCOihOVdb66WnFUJWD1xQzkxJAMLd8np6U0YutbJZxdsR2j1zSkcs6E7ViMKrSeu5zm9Ruy6PgYoxy6sBYYuuEUtrR1hy03CgG {
   public UowDAEgH5tZ6ynjNlAhbBt2RkV5Uct4sxdsYQu1Nr3vONuBGL4AvyldtLWUhxd2qtB9l6v2offwjVAEUiSY2KnR8t3tR2WaQ2zA0() {
   }

   public UowDAEgH5tZ6ynjNlAhbBt2RkV5Uct4sxdsYQu1Nr3vONuBGL4AvyldtLWUhxd2qtB9l6v2offwjVAEUiSY2KnR8t3tR2WaQ2zA0(
      int var1, byte var2, byte var3, byte var4, boolean var5
   ) {
      super(var1);
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
      this.ProgressBar = var5;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      super.BatModClient(var1);
      this.Button = var1.readByte();
      this.CustomSpinner = var1.readByte();
      this.ButtonAction = var1.readByte();
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
      var1.writeBoolean(this.ProgressBar);
   }
}
