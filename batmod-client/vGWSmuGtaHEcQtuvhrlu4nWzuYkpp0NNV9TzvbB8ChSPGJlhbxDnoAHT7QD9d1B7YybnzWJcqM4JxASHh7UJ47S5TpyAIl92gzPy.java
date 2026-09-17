public class vGWSmuGtaHEcQtuvhrlu4nWzuYkpp0NNV9TzvbB8ChSPGJlhbxDnoAHT7QD9d1B7YybnzWJcqM4JxASHh7UJ47S5TpyAIl92gzPy
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private float BatModClient;
   private int Button;
   private int CustomSpinner;

   public vGWSmuGtaHEcQtuvhrlu4nWzuYkpp0NNV9TzvbB8ChSPGJlhbxDnoAHT7QD9d1B7YybnzWJcqM4JxASHh7UJ47S5TpyAIl92gzPy() {
   }

   public vGWSmuGtaHEcQtuvhrlu4nWzuYkpp0NNV9TzvbB8ChSPGJlhbxDnoAHT7QD9d1B7YybnzWJcqM4JxASHh7UJ47S5TpyAIl92gzPy(float var1, int var2, int var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readFloat();
      this.CustomSpinner = var1.ButtonAction();
      this.Button = var1.ButtonAction();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeFloat(this.BatModClient);
      var1.Button(
         this.CustomSpinner
      );
      var1.Button(
         this.Button
      );
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   public float BatModClient() {
      return this.BatModClient;
   }

   public int Button() {
      return this.Button;
   }

   public int CustomSpinner() {
      return this.CustomSpinner;
   }
}
