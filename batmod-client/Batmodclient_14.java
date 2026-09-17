public class IDSJd6Fwp0KybG7sFHpzlEjcUuiNmZWY6EQxdK8siKOYx8itVK8J5OasglhxLAcakAaGPQ2VFF6kOzx6s365otOY3WArwNorgyM8
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Button;

   public IDSJd6Fwp0KybG7sFHpzlEjcUuiNmZWY6EQxdK8siKOYx8itVK8J5OasglhxLAcakAaGPQ2VFF6kOzx6s365otOY3WArwNorgyM8() {
   }

   public IDSJd6Fwp0KybG7sFHpzlEjcUuiNmZWY6EQxdK8siKOYx8itVK8J5OasglhxLAcakAaGPQ2VFF6kOzx6s365otOY3WArwNorgyM8(
      int var1, k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var2
   ) {
      this.BatModClient = var1;
      this.Button = var2 != null
         ? var2.IntegerSpinner()
         : null;
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
      this.BatModClient = var1.readShort();
      this.Button = var1.BatModProgressBar();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeShort(this.BatModClient);
      var1.BatModClient(
         this.Button
      );
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Button() {
      return this.Button;
   }
}
