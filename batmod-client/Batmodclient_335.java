public class Pmf6FvWzCnyssLjl5cg6xWM1Fkyu3V8azroY7FtKTRgFe4GVLQgkhZEOlCIbbCMOCEvzfPm2YR4AY0WGHQiFiFqtIuCHGlNXU9YU
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private int Button;
   private int CustomSpinner;

   public Pmf6FvWzCnyssLjl5cg6xWM1Fkyu3V8azroY7FtKTRgFe4GVLQgkhZEOlCIbbCMOCEvzfPm2YR4AY0WGHQiFiFqtIuCHGlNXU9YU() {
   }

   public Pmf6FvWzCnyssLjl5cg6xWM1Fkyu3V8azroY7FtKTRgFe4GVLQgkhZEOlCIbbCMOCEvzfPm2YR4AY0WGHQiFiFqtIuCHGlNXU9YU(int var1, int var2, int var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readUnsignedByte();
      this.Button = var1.readShort();
      this.CustomSpinner = var1.readShort();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.writeShort(this.Button);
      var1.writeShort(this.CustomSpinner);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }
}
