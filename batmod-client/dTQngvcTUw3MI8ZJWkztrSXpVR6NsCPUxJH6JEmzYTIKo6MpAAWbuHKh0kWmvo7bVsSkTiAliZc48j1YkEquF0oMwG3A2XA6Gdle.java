import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;

public class dTQngvcTUw3MI8ZJWkztrSXpVR6NsCPUxJH6JEmzYTIKo6MpAAWbuHKh0kWmvo7bVsSkTiAliZc48j1YkEquF0oMwG3A2XA6Gdle
   extends ixIOQ9ecTxFervga3TDuqWJzAM0NvNFogAWcYDIA3rAdEveiZvIP35o7bCaSuxu9L4qeO65NV5CEGYu7VdU9ydyKmuaaAgU9snzJ {
   private final ImmutableSet BatModClient;

   protected dTQngvcTUw3MI8ZJWkztrSXpVR6NsCPUxJH6JEmzYTIKo6MpAAWbuHKh0kWmvo7bVsSkTiAliZc48j1YkEquF0oMwG3A2XA6Gdle(String var1, int var2, int var3) {
      super(var1, Integer.class);
      if (var2 < 0) {
         throw new IllegalArgumentException("Min value of " + var1 + " must be 0 or greater");
      }

      if (var3 <= var2) {
         throw new IllegalArgumentException("Max value of " + var1 + " must be greater than min (" + var2 + ")");
      }

      HashSet var4 = Sets.newHashSet();

      for (int var5 = var2; var5 <= var3; var5++) {
         var4.add(var5);
      }

      this.BatModClient = ImmutableSet.copyOf(var4);
   }

   @Override
   public Collection Button() {
      return this.BatModClient;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null || this.getClass() != var1.getClass()) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      dTQngvcTUw3MI8ZJWkztrSXpVR6NsCPUxJH6JEmzYTIKo6MpAAWbuHKh0kWmvo7bVsSkTiAliZc48j1YkEquF0oMwG3A2XA6Gdle var2 = (dTQngvcTUw3MI8ZJWkztrSXpVR6NsCPUxJH6JEmzYTIKo6MpAAWbuHKh0kWmvo7bVsSkTiAliZc48j1YkEquF0oMwG3A2XA6Gdle)var1;
      return this.BatModClient
         .equals(var2.BatModClient);
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.BatModClient.hashCode();
   }

   public static dTQngvcTUw3MI8ZJWkztrSXpVR6NsCPUxJH6JEmzYTIKo6MpAAWbuHKh0kWmvo7bVsSkTiAliZc48j1YkEquF0oMwG3A2XA6Gdle BatModClient(
      String var0, int var1, int var2
   ) {
      return new dTQngvcTUw3MI8ZJWkztrSXpVR6NsCPUxJH6JEmzYTIKo6MpAAWbuHKh0kWmvo7bVsSkTiAliZc48j1YkEquF0oMwG3A2XA6Gdle(var0, var1, var2);
   }

   public String BatModClient(Integer var1) {
      return var1.toString();
   }
}
