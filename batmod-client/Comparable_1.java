import com.google.common.base.Objects;

public class u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU implements Comparable {
   public static final u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU Button = new u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU(
      0, 0, 0
   );
   private final int BatModClient;
   private final int CustomSpinner;
   private final int ButtonAction;

   public u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU(int var1, int var2, int var3) {
      this.BatModClient = var1;
      this.CustomSpinner = var2;
      this.ButtonAction = var3;
   }

   public u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU(double var1, double var3, double var5) {
      this(
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
            var1
         ),
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
            var3
         ),
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
            var5
         )
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU)) {
         return false;
      }

      u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var2 = (u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU)var1;
      return this.BatModProgressBar()
            != var2.BatModProgressBar()
         ? false
         : (
            this.ColorChooser()
                  != var2.ColorChooser()
               ? false
               : this.IntegerSpinner()
                  == var2.IntegerSpinner()
         );
   }

   @Override
   public int hashCode() {
      return (
               this.ColorChooser()
                  + this.IntegerSpinner() * 31
            )
            * 31
         + this.BatModProgressBar();
   }

   public int Spinner(
      u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var1
   ) {
      return this.ColorChooser()
            == var1.ColorChooser()
         ? (
            this.IntegerSpinner()
                  == var1.IntegerSpinner()
               ? this.BatModProgressBar()
                  - var1.BatModProgressBar()
               : this.IntegerSpinner()
                  - var1.IntegerSpinner()
         )
         : this.ColorChooser()
            - var1.ColorChooser();
   }

   public int BatModProgressBar() {
      return this.BatModClient;
   }

   public int ColorChooser() {
      return this.CustomSpinner;
   }

   public int IntegerSpinner() {
      return this.ButtonAction;
   }

   public u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU ButtonAction(
      u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var1
   ) {
      return new u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU(
         this.ColorChooser()
               * var1.IntegerSpinner()
            - this.IntegerSpinner()
               * var1.ColorChooser(),
         this.IntegerSpinner()
               * var1.BatModProgressBar()
            - this.BatModProgressBar()
               * var1.IntegerSpinner(),
         this.BatModProgressBar()
               * var1.ColorChooser()
            - this.ColorChooser()
               * var1.BatModProgressBar()
      );
   }

   public double Button(double var1, double var3, double var5) {
      double var7 = this.BatModProgressBar() - var1;
      double var9 = this.ColorChooser() - var3;
      double var11 = this.IntegerSpinner() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double CustomSpinner(double var1, double var3, double var5) {
      double var7 = this.BatModProgressBar() + 0.5 - var1;
      double var9 = this.ColorChooser() + 0.5 - var3;
      double var11 = this.IntegerSpinner() + 0.5 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double Checkbox(
      u4pIRj1SAponZy3z1A8GRscS5bkrzeZvkFdHbeuDvkL10ZNGRXL5DfBblckFgujwZNlawbzfy7NrrkPm4EU5NBV9WI8eUbz8D1aU var1
   ) {
      return this.Button(
         var1.BatModProgressBar(),
         var1.ColorChooser(),
         var1.IntegerSpinner()
      );
   }

   @Override
   public String toString() {
      return Objects.toStringHelper(this)
         .add("x", this.BatModProgressBar())
         .add("y", this.ColorChooser())
         .add("z", this.IntegerSpinner())
         .toString();
   }
}
