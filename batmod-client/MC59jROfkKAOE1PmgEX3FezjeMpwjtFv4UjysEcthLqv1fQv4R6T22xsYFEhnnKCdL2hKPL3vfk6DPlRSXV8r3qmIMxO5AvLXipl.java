import org.apache.commons.lang3.Validate;

public class MC59jROfkKAOE1PmgEX3FezjeMpwjtFv4UjysEcthLqv1fQv4R6T22xsYFEhnnKCdL2hKPL3vfk6DPlRSXV8r3qmIMxO5AvLXipl
   extends vcXJltRXlzEPksL0O7qizMdTR6oUr9zB237wuFBtwUIVFR7kcKWjEmgmN5E8WoN6mQal0KdrhslndKrQBFYz31IFzj8iy53nJqvh {
   private final Object ButtonAction;
   private Object Spinner;

   public MC59jROfkKAOE1PmgEX3FezjeMpwjtFv4UjysEcthLqv1fQv4R6T22xsYFEhnnKCdL2hKPL3vfk6DPlRSXV8r3qmIMxO5AvLXipl(Object var1) {
      this.ButtonAction = var1;
   }

   @Override
   public void BatModClient(int var1, Object var2, Object var3) {
      if (this.ButtonAction.equals(var2)) {
         this.Spinner = var3;
      }

      super.BatModClient(var1, var2, var3);
   }

   public void Button() {
      Validate.notNull(this.ButtonAction);
   }

   @Override
   public Object BatModClient(Object var1) {
      Object var2 = super.BatModClient(var1);
      return var2 == null ? this.Spinner : var2;
   }

   @Override
   public Object BatModClient(int var1) {
      Object var2 = super.BatModClient(var1);
      return var2 == null ? this.Spinner : var2;
   }
}
