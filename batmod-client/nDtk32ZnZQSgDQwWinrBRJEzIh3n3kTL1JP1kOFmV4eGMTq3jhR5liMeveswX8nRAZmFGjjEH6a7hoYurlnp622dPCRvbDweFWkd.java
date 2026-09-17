public class nDtk32ZnZQSgDQwWinrBRJEzIh3n3kTL1JP1kOFmV4eGMTq3jhR5liMeveswX8nRAZmFGjjEH6a7hoYurlnp622dPCRvbDweFWkd
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private int Button;

   public nDtk32ZnZQSgDQwWinrBRJEzIh3n3kTL1JP1kOFmV4eGMTq3jhR5liMeveswX8nRAZmFGjjEH6a7hoYurlnp622dPCRvbDweFWkd() {
   }

   public nDtk32ZnZQSgDQwWinrBRJEzIh3n3kTL1JP1kOFmV4eGMTq3jhR5liMeveswX8nRAZmFGjjEH6a7hoYurlnp622dPCRvbDweFWkd(int var1, int var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public void BatModClient(
      jd1UHCmzVHuD5ZneEIeTLT5Remfkv7gUaHdafrw3DCDp0i41GXNSGz8qOpX0zdN2dh03gpkqwmwA2uRLDZmHuYpWgk7EL6w0WsnO var1
   ) {
      var1.BatModClient(this);
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readByte();
      this.Button = var1.readByte();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.writeByte(this.Button);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }
}
