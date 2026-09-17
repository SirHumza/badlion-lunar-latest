public class ZTawB0VxuLzn4kpnQXeTZO8smWyxA0ikaDryyR0pulbFF04msdiibnPuKqzj0HljsQBRclNlwWLUYjfzaav1K5vC6u9Z3bKt56Xq
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private int Button;
   private k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 CustomSpinner;

   public ZTawB0VxuLzn4kpnQXeTZO8smWyxA0ikaDryyR0pulbFF04msdiibnPuKqzj0HljsQBRclNlwWLUYjfzaav1K5vC6u9Z3bKt56Xq() {
   }

   public ZTawB0VxuLzn4kpnQXeTZO8smWyxA0ikaDryyR0pulbFF04msdiibnPuKqzj0HljsQBRclNlwWLUYjfzaav1K5vC6u9Z3bKt56Xq(
      int var1, int var2, k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var3
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3 == null
         ? null
         : var3.IntegerSpinner();
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
      this.BatModClient = var1.readByte();
      this.Button = var1.readShort();
      this.CustomSpinner = var1.BatModProgressBar();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.writeShort(this.Button);
      var1.BatModClient(
         this.CustomSpinner
      );
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 CustomSpinner() {
      return this.CustomSpinner;
   }
}
