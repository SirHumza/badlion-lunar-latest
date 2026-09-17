public class vMsnOiJLKaMYXmT4GEfVE0YjeAkEqlisc9H6IDmZ4z8eFNqGWds3zgsvl13Neme3Q7OfAVdcjBkief6QxMeFMDYWDsuU2qVqmVIe
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY BatModClient;
   private byte Button;

   public vMsnOiJLKaMYXmT4GEfVE0YjeAkEqlisc9H6IDmZ4z8eFNqGWds3zgsvl13Neme3Q7OfAVdcjBkief6QxMeFMDYWDsuU2qVqmVIe() {
   }

   public vMsnOiJLKaMYXmT4GEfVE0YjeAkEqlisc9H6IDmZ4z8eFNqGWds3zgsvl13Neme3Q7OfAVdcjBkief6QxMeFMDYWDsuU2qVqmVIe(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1
   ) {
      this(var1, (byte)1);
   }

   public vMsnOiJLKaMYXmT4GEfVE0YjeAkEqlisc9H6IDmZ4z8eFNqGWds3zgsvl13Neme3Q7OfAVdcjBkief6QxMeFMDYWDsuU2qVqmVIe(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1, byte var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.CustomSpinner();
      this.Button = var1.readByte();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.BatModClient(
         this.BatModClient
      );
      var1.writeByte(this.Button);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY BatModClient() {
      return this.BatModClient;
   }

   public boolean Button() {
      return this.Button == 1
         || this.Button == 2;
   }

   public byte CustomSpinner() {
      return this.Button;
   }
}
