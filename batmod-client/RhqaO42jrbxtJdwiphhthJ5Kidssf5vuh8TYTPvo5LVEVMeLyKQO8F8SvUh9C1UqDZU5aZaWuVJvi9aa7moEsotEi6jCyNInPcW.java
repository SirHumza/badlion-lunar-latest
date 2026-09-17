public class RhqaO42jrbxtJdwiphhthJ5Kidssf5vuh8TYTPvo5LVEVMeLyKQO8F8SvUh9C1UqDZU5aZaWuVJvi9aa7moEsotEi6jCyNInPcW
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private int Button;
   private int CustomSpinner;
   private short ButtonAction;
   private k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Spinner;
   private int Checkbox;

   public RhqaO42jrbxtJdwiphhthJ5Kidssf5vuh8TYTPvo5LVEVMeLyKQO8F8SvUh9C1UqDZU5aZaWuVJvi9aa7moEsotEi6jCyNInPcW() {
   }

   public RhqaO42jrbxtJdwiphhthJ5Kidssf5vuh8TYTPvo5LVEVMeLyKQO8F8SvUh9C1UqDZU5aZaWuVJvi9aa7moEsotEi6jCyNInPcW(
      int var1,
      int var2,
      int var3,
      int var4,
      k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var5,
      short var6
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.Spinner = var5 != null
         ? var5.IntegerSpinner()
         : null;
      this.ButtonAction = var6;
      this.Checkbox = var4;
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
      this.CustomSpinner = var1.readByte();
      this.ButtonAction = var1.readShort();
      this.Checkbox = var1.readByte();
      this.Spinner = var1.BatModProgressBar();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.writeShort(this.Button);
      var1.writeByte(this.CustomSpinner);
      var1.writeShort(this.ButtonAction);
      var1.writeByte(this.Checkbox);
      var1.BatModClient(
         this.Spinner
      );
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

   public short ButtonAction() {
      return this.ButtonAction;
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 Spinner() {
      return this.Spinner;
   }

   public int Checkbox() {
      return this.Checkbox;
   }
}
