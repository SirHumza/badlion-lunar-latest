public class aiutL4S02sRQK8W7LwGYrDGp3rKgqqbZ0eIYEqC23nTKBUhRaejJhbs0ZaLsVpEPvUTqLGochNspzoJM52tsc0rQooZV860kju
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private long BatModClient;
   private long Button;

   public aiutL4S02sRQK8W7LwGYrDGp3rKgqqbZ0eIYEqC23nTKBUhRaejJhbs0ZaLsVpEPvUTqLGochNspzoJM52tsc0rQooZV860kju() {
   }

   public aiutL4S02sRQK8W7LwGYrDGp3rKgqqbZ0eIYEqC23nTKBUhRaejJhbs0ZaLsVpEPvUTqLGochNspzoJM52tsc0rQooZV860kju(long var1, long var3, boolean var5) {
      this.BatModClient = var1;
      this.Button = var3;
      if (!var5) {
         this.Button = -this.Button;
         if (this.Button == 0L) {
            this.Button = -1L;
         }
      }
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readLong();
      this.Button = var1.readLong();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeLong(this.BatModClient);
      var1.writeLong(this.Button);
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public long BatModClient() {
      return this.BatModClient;
   }

   public long Button() {
      return this.Button;
   }
}
