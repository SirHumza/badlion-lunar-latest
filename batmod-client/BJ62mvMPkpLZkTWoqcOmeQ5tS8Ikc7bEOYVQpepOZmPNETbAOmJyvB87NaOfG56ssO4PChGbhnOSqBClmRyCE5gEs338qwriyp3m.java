import java.util.List;

public class BJ62mvMPkpLZkTWoqcOmeQ5tS8Ikc7bEOYVQpepOZmPNETbAOmJyvB87NaOfG56ssO4PChGbhnOSqBClmRyCE5gEs338qwriyp3m
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] Button;

   public BJ62mvMPkpLZkTWoqcOmeQ5tS8Ikc7bEOYVQpepOZmPNETbAOmJyvB87NaOfG56ssO4PChGbhnOSqBClmRyCE5gEs338qwriyp3m() {
   }

   public BJ62mvMPkpLZkTWoqcOmeQ5tS8Ikc7bEOYVQpepOZmPNETbAOmJyvB87NaOfG56ssO4PChGbhnOSqBClmRyCE5gEs338qwriyp3m(int var1, List var2) {
      this.BatModClient = var1;
      this.Button = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[var2.size()];

      for (int var3 = 0; var3 < this.Button.length; var3++) {
         k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var4 = (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65)var2.get(
            var3
         );
         this.Button[var3] = var4 == null
            ? null
            : var4.IntegerSpinner();
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readUnsignedByte();
      short var2 = var1.readShort();
      this.Button = new k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[var2];

      for (int var3 = 0; var3 < var2; var3++) {
         this.Button[var3] = var1.BatModProgressBar();
      }
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.writeShort(this.Button.length);

      for (k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65 var5 : this.Button) {
         var1.BatModClient(var5);
      }
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public k33yhS54VsUaLK6nSB7INIBmgwLgC1mJf55Nusrui954a0w74ZkYHHNokvenOdo4c65vY3YxmJit097jtJ6TFLqqeS5AarwF7q65[] Button() {
      return this.Button;
   }
}
