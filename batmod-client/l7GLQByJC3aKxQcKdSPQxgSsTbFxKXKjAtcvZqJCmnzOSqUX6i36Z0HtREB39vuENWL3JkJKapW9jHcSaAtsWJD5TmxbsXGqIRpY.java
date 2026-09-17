public class l7GLQByJC3aKxQcKdSPQxgSsTbFxKXKjAtcvZqJCmnzOSqUX6i36Z0HtREB39vuENWL3JkJKapW9jHcSaAtsWJD5TmxbsXGqIRpY {
   private static int[] BatModClient = new int[65536];

   public static void BatModClient(int[] var0) {
      BatModClient = var0;
   }

   public static int BatModClient(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0 - var0) * 255.0);
      int var5 = (int)((1.0 - var2) * 255.0);
      return BatModClient[var5 << 8 | var4];
   }

   public static int BatModClient() {
      return 6396257;
   }

   public static int Button() {
      return 8431445;
   }

   public static int CustomSpinner() {
      return 4764952;
   }
}
