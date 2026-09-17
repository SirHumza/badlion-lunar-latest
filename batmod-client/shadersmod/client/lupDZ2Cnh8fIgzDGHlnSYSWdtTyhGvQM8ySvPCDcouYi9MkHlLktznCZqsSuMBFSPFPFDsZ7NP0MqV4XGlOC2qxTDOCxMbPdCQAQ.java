package shadersmod.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSpinner
   extends eWL3X7b2uCJvQQ7AZYTdfFl5WpsvgkDQYd4UPgUmwx30I40bRhAatVO2D55s4wyNIJTaFdDeVxLtv8mh5tsAyfh9ZiuZQqQ1wPz {
   private nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000 Spinner;
   protected String BatModClient;
   private fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx Checkbox;
   private int ProgressBar = 0;
   private int BatModProgressBar = 0;
   private long z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = 0L;
   private String LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = null;
   private String xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = null;
   private boolean o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = false;
   public static final String Button = "<profile>";
   public static final String CustomSpinner = "<empty>";
   public static final String ButtonAction = "*";

   public IntegerSpinner(
      nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000 var1,
      fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx var2
   ) {
      this.BatModClient = "Shader Options";
      this.Spinner = var1;
      this.Checkbox = var2;
   }

   public IntegerSpinner(
      nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000 var1,
      fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx var2,
      String var3
   ) {
      this(var1, var2);
      this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = var3;
      if (var3 != null) {
         this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button(
            "screen." + var3, var3
         );
      }
   }

   @Override
   public void BatModClient() {
      this.BatModClient = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
         "of.options.shaderOptionsTitle"
      );
      byte var1 = 100;
      int var2 = 0;
      byte var3 = 30;
      byte var4 = 20;
      int var5 = this.TextField - 130;
      byte var6 = 120;
      byte var7 = 20;
      int var8 = 2;
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var9 = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button(
         this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
      );
      if (var9 != null) {
         if (var9.length > 18) {
            var8 = var9.length / 9 + 1;
         }

         for (int var10 = 0; var10 < var9.length; var10++) {
            shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var11 = var9[var10];
            if (var11 != null && var11.ColorTextPane()) {
               int var12 = var10 % var8;
               int var13 = var10 / var8;
               int var14 = Math.min(this.TextField / var8, 200);
               var2 = (this.TextField - var14 * var8) / 2;
               int var15 = var12 * var14 + 5 + var2;
               int var16 = var3 + var13 * var4;
               int var17 = var14 - 10;
               String var18 = this.BatModClient(var11, var17);
               shadersmod.client.ColorChooser var19 = new shadersmod.client.ColorChooser(
                  var1 + var10, var15, var16, var17, var7, var11, var18
               );
               var19.Checkbox = var11.IntegerSpinner();
               this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM.add(var19);
            }
         }
      }

      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               201,
               this.TextField / 2 - var6 - 20,
               this.ColorTextPane / 6 + 168 + 11,
               var6,
               var7,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "controls.reset"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               200,
               this.TextField / 2 + 20,
               this.ColorTextPane / 6 + 168 + 11,
               var6,
               var7,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "gui.done"
               )
            )
         );
   }

   private String BatModClient(
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var1, int var2
   ) {
      String var3 = var1.BatModInstallerMain();
      if (var1 instanceof shadersmod.client.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr) {
         shadersmod.client.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr var7 = (shadersmod.client.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr)var1;
         return var3 + "...";
      }

      UuNRPdngxLJ1piSbtVWTy5d1r0yYnVPdrWVdJIzhO5AWQSs4oLD4MB0wnDcMfN6xGgAGeksJvSQysKaZzGku3I7UiwUCohf4THta var4 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ()
         .ColorTextPane;
      int var5 = var4.BatModClient(
            ": "
               + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner()
         )
         + 5;

      while (
         var4.BatModClient(var3) + var5 >= var2 && var3.length() > 0
      ) {
         var3 = var3.substring(0, var3.length() - 1);
      }

      String var8 = var1.TextField()
         ? var1.Spinner(
            var1.ButtonAction()
         )
         : "";
      String var6 = var1.ButtonAction(
         var1.ButtonAction()
      );
      return var3 + ": " + var8 + var6;
   }

   @Override
   protected void BatModClient(
      knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 var1
   ) {
      if (var1.Checkbox) {
         if (var1.Spinner < 200
            && var1 instanceof shadersmod.client.ColorChooser) {
            shadersmod.client.ColorChooser var2 = (shadersmod.client.ColorChooser)var1;
            shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var3 = var2.BatModClient();
            if (var3 instanceof shadersmod.client.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr) {
               String var8 = var3.BatModClient();
               shadersmod.client.IntegerSpinner var5 = new shadersmod.client.IntegerSpinner(
                  this, this.Checkbox, var8
               );
               this.ColorChooser
                  .BatModClient(var5);
               return;
            }

            if (G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr()) {
               var3.Checkbox();
            } else {
               var3.ProgressBar();
            }

            this.Checkbox();
            this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = true;
         }

         if (var1.Spinner == 201) {
            shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var6 = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ButtonAction()
            );

            for (int var7 = 0; var7 < var6.length; var7++) {
               shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var4 = var6[var7];
               var4.Checkbox();
               this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = true;
            }

            this.Checkbox();
         }

         if (var1.Spinner == 200) {
            if (this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4) {
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Spinner();
               this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = false;
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Downloader();
            }

            this.ColorChooser
               .BatModClient(
                  this.Spinner
               );
         }
      }
   }

   @Override
   protected void Button(
      knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 var1
   ) {
      if (var1 instanceof shadersmod.client.ColorChooser) {
         shadersmod.client.ColorChooser var2 = (shadersmod.client.ColorChooser)var1;
         shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var3 = var2.BatModClient();
         if (G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr()) {
            var3.Checkbox();
         } else {
            var3.BatModProgressBar();
         }

         this.Checkbox();
         this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = true;
      }
   }

   @Override
   public void q_() {
      super.q_();
      if (this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4) {
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Spinner();
         this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = false;
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Downloader();
      }
   }

   private void Checkbox() {
      for (knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 var2 : this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM) {
         if (var2 instanceof shadersmod.client.ColorChooser) {
            shadersmod.client.ColorChooser var3 = (shadersmod.client.ColorChooser)var2;
            shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var4 = var3.BatModClient();
            if (var4 instanceof shadersmod.client.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4) {
               shadersmod.client.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 var5 = (shadersmod.client.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4)var4;
               var5.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
            }

            var3.ButtonAction = this.BatModClient(
               var4, var3.ColorTextPane()
            );
         }
      }
   }

   @Override
   public void BatModClient(int var1, int var2, float var3) {
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA();
      if (this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa != null) {
         this.BatModClient(
            this.BatModJson,
            this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
            this.TextField / 2,
            15,
            16777215
         );
      } else {
         this.BatModClient(
            this.BatModJson,
            this.BatModClient,
            this.TextField / 2,
            15,
            16777215
         );
      }

      super.BatModClient(var1, var2, var3);
      if (Math.abs(var1 - this.ProgressBar) <= 5
         && Math.abs(var2 - this.BatModProgressBar) <= 5) {
         this.BatModClient(
            var1, var2, this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         );
      } else {
         this.ProgressBar = var1;
         this.BatModProgressBar = var2;
         this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = System.currentTimeMillis();
      }
   }

   private void BatModClient(int var1, int var2, List var3) {
      short var4 = 700;
      if (System.currentTimeMillis() >= this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP + var4) {
         int var5 = this.TextField / 2 - 150;
         int var6 = this.ColorTextPane / 6 - 7;
         if (var2 <= var6 + 98) {
            var6 += 105;
         }

         int var7 = var5 + 150 + 150;
         int var8 = var6 + 84 + 10;
         knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 var9 = Button(
            var3, var1, var2
         );
         if (var9 instanceof shadersmod.client.ColorChooser) {
            shadersmod.client.ColorChooser var10 = (shadersmod.client.ColorChooser)var9;
            shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var11 = var10.BatModClient();
            String[] var12 = this.Button(var11, var7 - var5);
            if (var12 == null) {
               return;
            }

            this.BatModClient(
               var5, var6, var7, var8, -536870912, -536870912
            );

            for (int var13 = 0; var13 < var12.length; var13++) {
               String var14 = var12[var13];
               int var15 = 14540253;
               if (var14.endsWith("!")) {
                  var15 = 16719904;
               }

               this.BatModJson
                  .BatModClient(
                     var14, (float)(var5 + 5), (float)(var6 + 5 + var13 * 11), var15
                  );
            }
         }
      }
   }

   private String[] Button(
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var1, int var2
   ) {
      if (var1 instanceof shadersmod.client.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4) {
         return null;
      }

      String var3 = var1.BatModInstallerMain();
      String var4 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ProgressBar(
            var1.CustomSpinner()
         )
         .trim();
      String[] var5 = this.BatModClient(var4);
      String var6 = null;
      if (!var3.equals(var1.BatModClient())
         && this.Checkbox.BatModJson
         )
       {
         var6 = "§8"
            + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
               "of.general.id"
            )
            + ": "
            + var1.BatModClient();
      }

      String var7 = null;
      if (var1.ColorChooser() != null
         && this.Checkbox.BatModJson
         )
       {
         var7 = "§8"
            + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
               "of.general.from"
            )
            + ": "
            + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               var1.ColorChooser()
            );
      }

      String var8 = null;
      if (var1.Spinner() != null
         && this.Checkbox.BatModJson
         )
       {
         String var9 = var1.IntegerSpinner()
            ? var1.ButtonAction(
               var1.Spinner()
            )
            : FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
               "of.general.ambiguous"
            );
         var8 = "§8"
            + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox()
            + ": "
            + var9;
      }

      ArrayList var11 = new ArrayList();
      var11.add(var3);
      var11.addAll(Arrays.asList(var5));
      if (var6 != null) {
         var11.add(var6);
      }

      if (var7 != null) {
         var11.add(var7);
      }

      if (var8 != null) {
         var11.add(var8);
      }

      return this.BatModClient(var2, var11);
   }

   private String[] BatModClient(String var1) {
      if (var1.length() <= 0) {
         return new String[0];
      }

      var1 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.ButtonAction(
         var1, "//"
      );
      String[] var2 = var1.split("\\. ");

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = "- " + var2[var3].trim();
         var2[var3] = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.Spinner(
            var2[var3], "."
         );
      }

      return var2;
   }

   private String[] BatModClient(int var1, List var2) {
      UuNRPdngxLJ1piSbtVWTy5d1r0yYnVPdrWVdJIzhO5AWQSs4oLD4MB0wnDcMfN6xGgAGeksJvSQysKaZzGku3I7UiwUCohf4THta var3 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ()
         .ColorTextPane;
      ArrayList var4 = new ArrayList();

      for (int var5 = 0; var5 < var2.size(); var5++) {
         String var6 = (String)var2.get(var5);
         if (var6 != null && var6.length() > 0) {
            for (Object var8 : var3.CustomSpinner(var6, var1)) {
               var4.add((String)var8);
            }
         }
      }

      return var4.toArray(new String[var4.size()]);
   }
}
