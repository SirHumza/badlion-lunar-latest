public class FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC {
   private final byte[] BatModClient;

   public FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC() {
      this.BatModClient = new byte[2048];
   }

   public FQGZT1C5K0m5IMi5Xm28uKbvKTAhVMSteAl9c0P5qvWcn3jnoF6QP4UXmCnrnfdPzhiUyyL7z0pmVgbjctO4tXfbac9mOJdlvC(byte[] var1) {
      this.BatModClient = var1;
      if (var1.length != 2048) {
         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length);
      }
   }

   public int BatModClient(int var1, int var2, int var3) {
      return this.BatModClient(
         this.Button(var1, var2, var3)
      );
   }

   public void BatModClient(int var1, int var2, int var3, int var4) {
      this.BatModClient(
         this.Button(var1, var2, var3), var4
      );
   }

   private int Button(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }

   public int BatModClient(int var1) {
      int var2 = this.CustomSpinner(var1);
      return this.Button(var1)
         ? this.BatModClient[var2] & 15
         : this.BatModClient[var2] >> 4 & 15;
   }

   public void BatModClient(int var1, int var2) {
      int var3 = this.CustomSpinner(var1);
      if (this.Button(var1)) {
         this.BatModClient[var3] = (byte)(
            this.BatModClient[var3] & 240 | var2 & 15
         );
      } else {
         this.BatModClient[var3] = (byte)(
            this.BatModClient[var3] & 15 | (var2 & 15) << 4
         );
      }
   }

   private boolean Button(int var1) {
      return (var1 & 1) == 0;
   }

   private int CustomSpinner(int var1) {
      return var1 >> 1;
   }

   public byte[] BatModClient() {
      return this.BatModClient;
   }
}
