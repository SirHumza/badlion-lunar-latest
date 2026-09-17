package shadersmod.client;

import java.util.ArrayList;

public class o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
   extends shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa {
   private shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] ButtonAction = null;
   private shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] Spinner = null;
   private static final String Checkbox = "<profile>";
   private static final String ProgressBar = "<custom>";

   public o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4(
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] var1,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var2
   ) {
      super(
         "<profile>",
         "",
         BatModClient(var1, var2),
         BatModClient(var1),
         BatModClient(var1, var2, true),
         (String)null
      );
      this.ButtonAction = var1;
      this.Spinner = var2;
   }

   @Override
   public void ProgressBar() {
      super.ProgressBar();
      if (this.ButtonAction().equals("<custom>")) {
         super.ProgressBar();
      }

      this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
   }

   public void iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF() {
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var1 = this.ColorChooser(
         this.ButtonAction()
      );
      if (var1 == null
         || !shadersmod.client.GsonTypeAdapter.BatModClient(
            var1, this.Spinner, false
         )) {
         String var2 = BatModClient(
            this.ButtonAction,
            this.Spinner
         );
         this.Button(var2);
      }
   }

   private void bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ() {
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var1 = this.ColorChooser(
         this.ButtonAction()
      );
      if (var1 != null) {
         String[] var2 = var1.Button();

         for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var5 = this.BatModProgressBar(
               var4
            );
            if (var5 != null) {
               String var6 = var1.BatModClient(var4);
               var5.Button(var6);
            }
         }
      }
   }

   private shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa BatModProgressBar(
      String var1
   ) {
      for (int var2 = 0; var2 < this.Spinner.length; var2++) {
         shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var3 = this.Spinner[var2];
         if (var3.BatModClient().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP ColorChooser(
      String var1
   ) {
      for (int var2 = 0; var2 < this.ButtonAction.length; var2++) {
         shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var3 = this.ButtonAction[var2];
         if (var3.BatModClient().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public String BatModInstallerMain() {
      return FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
         "of.shaders.profile"
      );
   }

   @Override
   public String ButtonAction(String var1) {
      return var1.equals("<custom>")
         ? FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
            "of.general.custom", "<custom>"
         )
         : shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button(
            "profile." + var1, var1
         );
   }

   @Override
   public String Spinner(String var1) {
      return var1.equals("<custom>") ? "§c" : "§a";
   }

   private static String BatModClient(
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] var0,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var1
   ) {
      return BatModClient(var0, var1, false);
   }

   private static String BatModClient(
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] var0,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var1,
      boolean var2
   ) {
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var3 = shadersmod.client.GsonTypeAdapter.BatModClient(
         var0, var1, var2
      );
      return var3 == null ? "<custom>" : var3.BatModClient();
   }

   private static String[] BatModClient(
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] var0
   ) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var3 = var0[var2];
         var1.add(var3.BatModClient());
      }

      var1.add("<custom>");
      return var1.toArray(new String[var1.size()]);
   }
}
