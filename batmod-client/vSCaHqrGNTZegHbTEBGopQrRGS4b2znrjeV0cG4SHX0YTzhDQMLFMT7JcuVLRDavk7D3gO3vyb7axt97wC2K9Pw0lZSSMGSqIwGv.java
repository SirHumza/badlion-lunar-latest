public class vSCaHqrGNTZegHbTEBGopQrRGS4b2znrjeV0cG4SHX0YTzhDQMLFMT7JcuVLRDavk7D3gO3vyb7axt97wC2K9Pw0lZSSMGSqIwGv {
   public static String BatModClient(int var0) {
      byte var1;
      if (var0 < 0) {
         var1 = 5;
      } else if (var0 < 20) {
         var1 = 4;
      } else if (var0 < 40) {
         var1 = 2;
      } else if (var0 < 60) {
         var1 = 1;
      } else if (var0 <= 100) {
         var1 = 0;
      } else {
         var1 = 4;
      }

      return var1 == 5 ? "§a" : (var1 == 0 ? "§a" : (var1 == 1 ? "§2" : (var1 == 2 ? "§c" : "§4")));
   }

   public static String Button(int var0) {
      byte var1;
      if (var0 < 0) {
         var1 = 5;
      } else if (var0 < 150) {
         var1 = 0;
      } else if (var0 < 300) {
         var1 = 1;
      } else if (var0 < 600) {
         var1 = 2;
      } else if (var0 < 1000) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      return var1 == 5 ? "§a" : (var1 == 0 ? "§a" : (var1 == 1 ? "§2" : (var1 == 2 ? "§c" : "§4")));
   }
}
