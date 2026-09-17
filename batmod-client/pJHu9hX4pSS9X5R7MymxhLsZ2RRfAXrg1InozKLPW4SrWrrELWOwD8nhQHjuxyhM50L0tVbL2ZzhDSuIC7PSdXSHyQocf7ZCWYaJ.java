import java.util.EnumSet;
import java.util.Set;

public enum pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ {
   BatModClient(0),
   Button(1),
   CustomSpinner(2),
   ButtonAction(3),
   Spinner(4);

   private int Checkbox;

   pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ(int var3) {
      this.Checkbox = var3;
   }

   private int BatModClient() {
      return 1 << this.Checkbox;
   }

   private boolean Button(int var1) {
      return (var1 & this.BatModClient())
         == this.BatModClient();
   }

   public static Set BatModClient(int var0) {
      EnumSet var1 = EnumSet.noneOf(pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ.class);

      for (pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ var5 : values()) {
         if (var5.Button(var0)) {
            var1.add(var5);
         }
      }

      return var1;
   }

   public static int BatModClient(Set var0) {
      int var1 = 0;

      for (pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ var3 : var0) {
         var1 |= var3.BatModClient();
      }

      return var1;
   }
}
