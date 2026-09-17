import com.google.common.base.Objects;

public abstract class ixIOQ9ecTxFervga3TDuqWJzAM0NvNFogAWcYDIA3rAdEveiZvIP35o7bCaSuxu9L4qeO65NV5CEGYu7VdU9ydyKmuaaAgU9snzJ
   implements pmaYRMICclkAQYKkxNEIqvsKic8qANgyaBQS266gAaVuCwlZlMGzKhH09DJCxJqhoGRJwYBtAiPtfmjNC1T5aDFR7TaAtGDf7iIH {
   private final Class BatModClient;
   private final String Button;

   protected ixIOQ9ecTxFervga3TDuqWJzAM0NvNFogAWcYDIA3rAdEveiZvIP35o7bCaSuxu9L4qeO65NV5CEGYu7VdU9ydyKmuaaAgU9snzJ(String var1, Class var2) {
      this.BatModClient = var2;
      this.Button = var1;
   }

   @Override
   public String BatModClient() {
      return this.Button;
   }

   @Override
   public Class CustomSpinner() {
      return this.BatModClient;
   }

   @Override
   public String toString() {
      return Objects.toStringHelper(this)
         .add("name", this.Button)
         .add("clazz", this.BatModClient)
         .add("values", this.Button())
         .toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ixIOQ9ecTxFervga3TDuqWJzAM0NvNFogAWcYDIA3rAdEveiZvIP35o7bCaSuxu9L4qeO65NV5CEGYu7VdU9ydyKmuaaAgU9snzJ var2 = (ixIOQ9ecTxFervga3TDuqWJzAM0NvNFogAWcYDIA3rAdEveiZvIP35o7bCaSuxu9L4qeO65NV5CEGYu7VdU9ydyKmuaaAgU9snzJ)var1;
         return this.BatModClient
               .equals(var2.BatModClient)
            && this.Button
               .equals(var2.Button);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.BatModClient.hashCode()
         + this.Button.hashCode();
   }
}
