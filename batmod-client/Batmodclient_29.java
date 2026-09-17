public class OuqZkP1BMbDFUSmEKPOMSV3lHZLsb10QQ6eU5ooyNt4WOappWmLn3OALCmXqlHSgHT3pH9gTTJyhKPTVJQC7hykZp2QKeUSjtsT
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private short Button;
   private boolean CustomSpinner;

   public OuqZkP1BMbDFUSmEKPOMSV3lHZLsb10QQ6eU5ooyNt4WOappWmLn3OALCmXqlHSgHT3pH9gTTJyhKPTVJQC7hykZp2QKeUSjtsT() {
   }

   public OuqZkP1BMbDFUSmEKPOMSV3lHZLsb10QQ6eU5ooyNt4WOappWmLn3OALCmXqlHSgHT3pH9gTTJyhKPTVJQC7hykZp2QKeUSjtsT(int var1, short var2, boolean var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
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
      this.Button = var1.readShort();
      this.CustomSpinner = var1.readByte() != 0;
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.writeShort(this.Button);
      var1.writeByte(this.CustomSpinner ? 1 : 0);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public short Button() {
      return this.Button;
   }
}
