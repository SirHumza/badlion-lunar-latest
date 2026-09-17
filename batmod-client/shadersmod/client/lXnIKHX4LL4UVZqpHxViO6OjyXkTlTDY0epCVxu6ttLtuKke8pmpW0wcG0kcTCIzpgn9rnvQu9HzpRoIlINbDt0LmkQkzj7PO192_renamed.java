package shadersmod.client;

public class GsonTypeAdapter {
   public static shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa BatModClient(
      String var0, shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var1
   ) {
      if (var1 == null) {
         return null;
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var3 = var1[var2];
         if (var3.BatModClient().equals(var0)) {
            return var3;
         }
      }

      return null;
   }

   public static shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP BatModClient(
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] var0,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var1,
      boolean var2
   ) {
      if (var0 == null) {
         return null;
      }

      for (int var3 = 0; var3 < var0.length; var3++) {
         shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var4 = var0[var3];
         if (BatModClient(var4, var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   public static boolean BatModClient(
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var0,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var1,
      boolean var2
   ) {
      if (var0 == null) {
         return false;
      }

      if (var1 == null) {
         return false;
      }

      String[] var3 = var0.Button();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var6 = BatModClient(
            var5, var1
         );
         if (var6 != null) {
            String var7 = var2
               ? var6.Spinner()
               : var6.ButtonAction();
            String var8 = var0.BatModClient(var5);
            if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               (Object)var7, (Object)var8
            )) {
               return false;
            }
         }
      }

      return true;
   }
}
