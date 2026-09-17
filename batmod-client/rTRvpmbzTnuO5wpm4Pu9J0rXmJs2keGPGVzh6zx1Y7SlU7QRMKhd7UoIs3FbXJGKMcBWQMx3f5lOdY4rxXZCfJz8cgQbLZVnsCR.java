import java.util.Collection;
import java.util.Random;

public class rTRvpmbzTnuO5wpm4Pu9J0rXmJs2keGPGVzh6zx1Y7SlU7QRMKhd7UoIs3FbXJGKMcBWQMx3f5lOdY4rxXZCfJz8cgQbLZVnsCR {
   public static int BatModClient(Collection var0) {
      int var1 = 0;

      for (gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE var3 : var0) {
         var1 += var3.CustomSpinner;
      }

      return var1;
   }

   public static gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE BatModClient(
      Random var0, Collection var1, int var2
   ) {
      if (var2 <= 0) {
         throw new IllegalArgumentException();
      }

      int var3 = var0.nextInt(var2);
      return BatModClient(var1, var3);
   }

   public static gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE BatModClient(
      Collection var0, int var1
   ) {
      for (gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE var3 : var0) {
         var1 -= var3.CustomSpinner;
         if (var1 < 0) {
            return var3;
         }
      }

      return (gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE)null;
   }

   public static gLB2ow59dvwp01jTByeC0JVoNcvtfE0PqBPv4PcBZYuwUJcEQuo19YGJTMUTBUIyXfz8nEbs4BA1xiIuS3we41ntyutIYeCgZPSE BatModClient(
      Random var0, Collection var1
   ) {
      return BatModClient(
         var0, var1, BatModClient(var1)
      );
   }
}
