public class KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   public static final String[] BatModClient = new String[]{
      "tile.bed.notValid"
   };
   private int Button;
   private float CustomSpinner;

   public KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb() {
   }

   public KKTbr4YAhF6NEtr2T2tEBd2P57A9cMrzTyuEKN7rrA9Itc22BhNcwbXKTewsC3Y0ME7fHgaehWAJ7cVnV0jHDgTzfYyH34ej34Yb(int var1, float var2) {
      this.Button = var1;
      this.CustomSpinner = var2;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.Button = var1.readUnsignedByte();
      this.CustomSpinner = var1.readFloat();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.Button);
      var1.writeFloat(this.CustomSpinner);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public int BatModClient() {
      return this.Button;
   }

   public float Button() {
      return this.CustomSpinner;
   }
}
