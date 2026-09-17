public class uYXyc2lzUmTLdjMMZJN8rlOAhUcGOEBMVGwrvJIX9NNk9cnkZ06FAYur4LnusULU1zkAYfbZYFlZEDiohgPC9WL1V9ZZ7ALd25z
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private int Button;
   private int CustomSpinner;

   public uYXyc2lzUmTLdjMMZJN8rlOAhUcGOEBMVGwrvJIX9NNk9cnkZ06FAYur4LnusULU1zkAYfbZYFlZEDiohgPC9WL1V9ZZ7ALd25z() {
   }

   public uYXyc2lzUmTLdjMMZJN8rlOAhUcGOEBMVGwrvJIX9NNk9cnkZ06FAYur4LnusULU1zkAYfbZYFlZEDiohgPC9WL1V9ZZ7ALd25z(
      int var1,
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var2,
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var3
   ) {
      this.BatModClient = var1;
      this.Button = var2.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb();
      this.CustomSpinner = var3 != null
         ? var3.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb()
         : -1;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.Button = var1.readInt();
      this.CustomSpinner = var1.readInt();
      this.BatModClient = var1.readUnsignedByte();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeInt(this.Button);
      var1.writeInt(this.CustomSpinner);
      var1.writeByte(this.BatModClient);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
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
