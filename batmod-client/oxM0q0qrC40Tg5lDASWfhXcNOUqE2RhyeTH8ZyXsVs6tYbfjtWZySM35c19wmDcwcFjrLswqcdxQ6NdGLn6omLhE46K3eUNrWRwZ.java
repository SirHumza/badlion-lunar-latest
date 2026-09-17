public class oxM0q0qrC40Tg5lDASWfhXcNOUqE2RhyeTH8ZyXsVs6tYbfjtWZySM35c19wmDcwcFjrLswqcdxQ6NdGLn6omLhE46K3eUNrWRwZ
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private float BatModClient;
   private int Button;
   private float CustomSpinner;

   public oxM0q0qrC40Tg5lDASWfhXcNOUqE2RhyeTH8ZyXsVs6tYbfjtWZySM35c19wmDcwcFjrLswqcdxQ6NdGLn6omLhE46K3eUNrWRwZ() {
   }

   public oxM0q0qrC40Tg5lDASWfhXcNOUqE2RhyeTH8ZyXsVs6tYbfjtWZySM35c19wmDcwcFjrLswqcdxQ6NdGLn6omLhE46K3eUNrWRwZ(float var1, int var2, float var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readFloat();
      this.Button = var1.ButtonAction();
      this.CustomSpinner = var1.readFloat();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeFloat(this.BatModClient);
      var1.Button(
         this.Button
      );
      var1.writeFloat(this.CustomSpinner);
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

   public float CustomSpinner() {
      return this.CustomSpinner;
   }
}
