public class O5nlqetnHKFCwP3B7N7xBXEFo86xhQOIU2dKuWqNolRAHXuiPbOw78PcSDGJ2G44pA2KqGRO1ZrV7AWNlZiadZ9IFxbU2kC74Kbo {
   private static int[] BatModClient = new int[65536];

   public static void BatModClient(int[] var0) {
      BatModClient = var0;
   }

   public static int BatModClient(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0 - var0) * 255.0);
      int var5 = (int)((1.0 - var2) * 255.0);
      int var6 = var5 << 8 | var4;
      return var6 > BatModClient.length
         ? -65281
         : BatModClient[var6];
   }
}
