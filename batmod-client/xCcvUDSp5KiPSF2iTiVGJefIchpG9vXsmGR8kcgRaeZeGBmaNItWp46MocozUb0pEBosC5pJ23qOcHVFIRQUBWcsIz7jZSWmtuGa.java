import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa {
   protected static final List BatModClient = new ArrayList();
   private final String Button;
   private final boolean CustomSpinner;

   public static xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] BatModClient() {
      return BatModClient.toArray(
         new xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[0]
      );
   }

   public static String[] Button() {
      return BatModClient.stream()
         .map(
            xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa::CustomSpinner
         )
         .toArray(String[]::new);
   }

   public static xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa BatModClient(
      String var0
   ) {
      return BatModClient.stream()
         .filter(var1 -> var1.CustomSpinner().equalsIgnoreCase(var0))
         .findFirst()
         .orElse(null);
   }

   public xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa(String var1) {
      this(var1, false);
   }

   public xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa(String var1, boolean var2) {
      this.Button = var1.toLowerCase(Locale.ROOT);
      this.CustomSpinner = var2;
      BatModClient.add(this);
   }

   public String CustomSpinner() {
      return this.Button;
   }

   public boolean ButtonAction() {
      return this.CustomSpinner;
   }

   @Override
   public String toString() {
      return this.Button;
   }
}
