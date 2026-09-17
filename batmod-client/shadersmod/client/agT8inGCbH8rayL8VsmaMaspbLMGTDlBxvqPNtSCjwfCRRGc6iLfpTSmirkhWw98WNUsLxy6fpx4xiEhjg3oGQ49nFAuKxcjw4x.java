package shadersmod.client;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import org.lwjgl.Sys;

public class TextField
   extends nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000 {
   protected nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000 BatModClient;
   protected String Button = "Shaders";
   private int BatModProgressBar = -1;
   private shadersmod.client.BatModInstallerMain z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP;
   private boolean LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = false;
   private static float[] xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = new float[]{
      0.5F, 0.70710677F, 1.0F, 1.4142135F, 2.0F
   };
   private static String[] o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = new String[]{
      "0.5x", "0.7x", "1x", "1.5x", "2x"
   };
   private static float[] K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = new float[]{
      0.0625F, 0.125F, 0.25F
   };
   private static String[] sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = new String[]{
      "0.5x", "1x", "2x"
   };
   public static final int CustomSpinner = 0;
   public static final int ButtonAction = 1;
   public static final int Spinner = 2;
   public static final int Checkbox = 3;
   public static final int ProgressBar = 4;

   public TextField(
      nlQHGb65ewaG8lYb63OqGLbjwXVQjbDax0OQ6gKd9gjqy8pJJvo1ENhVvU3iFRCZ36Ig1BqTq82T1H0S7nFuy0i5NH7R0lWnV000 var1,
      fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx var2
   ) {
      this.BatModClient = var1;
   }

   @Override
   public void BatModClient() {
      this.Button = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
         "of.options.shadersTitle"
      );
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.oVUlF2kimA5AgzoC6vC0JayzmSTXZm5cvWsXrpitO7ZkmGEYfnJOFbfvNwsUJYd9Pklbx4OeWIQVuNGBlTcUyuWlZCpyW2q9djct
         == null) {
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient();
      }

      byte var1 = 120;
      byte var2 = 20;
      int var3 = this.TextField - var1 - 10;
      byte var4 = 30;
      byte var5 = 20;
      int var6 = this.TextField - var1 - 20;
      this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = new shadersmod.client.BatModInstallerMain(
         this,
         var6,
         this.ColorTextPane,
         var4,
         this.ColorTextPane - 50,
         16
      );
      this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         .ButtonAction(7, 8);
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.BatModClient,
               var3,
               0 * var5 + var4,
               var1,
               var2
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.Button,
               var3,
               1 * var5 + var4,
               var1,
               var2
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.CustomSpinner,
               var3,
               2 * var5 + var4,
               var1,
               var2
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.ButtonAction,
               var3,
               3 * var5 + var4,
               var1,
               var2
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.Spinner,
               var3,
               4 * var5 + var4,
               var1,
               var2
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.Checkbox,
               var3,
               5 * var5 + var4,
               var1,
               var2
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.BatModProgressBar,
               var3,
               6 * var5 + var4,
               var1,
               var2
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new shadersmod.client.ProgressBar(
               shadersmod.client.Checkbox.ColorChooser,
               var3,
               7 * var5 + var4,
               var1,
               var2
            )
         );
      int var7 = Math.min(150, var6 / 2 - 10);
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               201,
               var6 / 4 - var7 / 2,
               this.ColorTextPane - 25,
               var7,
               var2,
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.options.shaders.shadersFolder"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               202,
               var6 / 4 * 3 - var7 / 2,
               this.ColorTextPane - 25,
               var7,
               var2,
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "gui.done"
               )
            )
         );
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         .add(
            new knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3(
               203,
               var3,
               this.ColorTextPane - 25,
               var1,
               var2,
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.options.shaders.shaderOptions"
               )
            )
         );
      this.Checkbox();
   }

   public void Checkbox() {
      boolean var1 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68();

      for (knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 var3 : this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM) {
         if (var3.Spinner != 201
            && var3.Spinner != 202
            && var3.Spinner
               != shadersmod.client.Checkbox.BatModClient
                  .ordinal()) {
            var3.Checkbox = var1;
         }
      }
   }

   @Override
   public void CustomSpinner() {
      super.CustomSpinner();
      this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         .Checkbox();
   }

   @Override
   protected void BatModClient(
      knyzFixQmG5VbXtSsmCB2LMaviGLpi3aT1TwXZXVXbSvMIUETJiZz7lWrD8HqqaIetiWeF5cd8G4jLteWo3DxFj3VhtaYCk8HYT3 var1
   ) {
      if (var1.Checkbox) {
         if (var1 instanceof shadersmod.client.ProgressBar) {
            shadersmod.client.ProgressBar var2 = (shadersmod.client.ProgressBar)var1;
            switch (var2.BatModClient()) {
               case BatModClient:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2();
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Downloader();
                  break;
               case Button:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87 = !shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87;
                  this.ColorChooser
                     .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
                  break;
               case CustomSpinner:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ = !shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.FOJK2onwcI9NcuZ3vd3WlIO6WDdoPP0P8hYkyc9ERGcQGDV9qk2HYFJdZuJYOlBz0qJlbZ28LqXqQbNVnDuyqm75bQqfYbWCO4oJ;
                  this.ColorChooser
                     .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
                  break;
               case ButtonAction:
                  float var3 = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9;
                  float[] var4 = xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
                  String[] var5 = o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
                  int var6 = BatModClient(var3, var4);
                  if (G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr()) {
                     if (--var6 < 0) {
                        var6 = var4.length - 1;
                     }
                  } else if (++var6 >= var4.length) {
                     var6 = 0;
                  }

                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9 = var4[var6];
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.InstallationLogger();
                  break;
               case Spinner:
                  float var7 = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.NFEXvfzASCBo1uoADfO7B6Zd2HFrS9cQLXZ1j8I7xQ7tcvlH6T1xCQUszLrHp4Q2bcUEXEGvrIjfFqgn1Lq9961mMvBMiUdNnRz;
                  float[] var8 = xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
                  String[] var9 = o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
                  int var10 = BatModClient(var7, var8);
                  if (G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr()) {
                     if (--var10 < 0) {
                        var10 = var8.length - 1;
                     }
                  } else if (++var10 >= var8.length) {
                     var10 = 0;
                  }

                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.NFEXvfzASCBo1uoADfO7B6Zd2HFrS9cQLXZ1j8I7xQ7tcvlH6T1xCQUszLrHp4Q2bcUEXEGvrIjfFqgn1Lq9961mMvBMiUdNnRz = var8[var10];
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM();
                  break;
               case Checkbox:
                  float var11 = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.MslRoVEB2kSbxcg7IXSCe4LFLFC97mmJ9f4o2C87S1yJ4n5xWehfY82YTaAg91VonNq71K1xA68TrD8BRJYxjNJ6SpqzNrwdo3pI;
                  float[] var12 = K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL;
                  String[] var13 = sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr;
                  int var14 = BatModClient(var11, var12);
                  if (G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr()) {
                     if (--var14 < 0) {
                        var14 = var12.length - 1;
                     }
                  } else if (++var14 >= var12.length) {
                     var14 = 0;
                  }

                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.MslRoVEB2kSbxcg7IXSCe4LFLFC97mmJ9f4o2C87S1yJ4n5xWehfY82YTaAg91VonNq71K1xA68TrD8BRJYxjNJ6SpqzNrwdo3pI = var12[var14];
                  break;
               case ProgressBar:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.YtRK8BjzsTggjXOD6DkCjcXC8CXCXKdAQEX8FrueJBaXhjlPRb1xLyBdP4MsdO976zQBZ26fDqwDavPi90Lnj92GleUXQwPSQsSu = !shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.YtRK8BjzsTggjXOD6DkCjcXC8CXCXKdAQEX8FrueJBaXhjlPRb1xLyBdP4MsdO976zQBZ26fDqwDavPi90Lnj92GleUXQwPSQsSu;
                  break;
               case BatModProgressBar:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ctANUWxwbkQCSgSO6IJsYMhBgE83CZ7uv2MKz9ljm6ebyGeoEkmtaMv1lAPgZ8c8AcYJG3S2MjxTbDq8W46cL9MKwDHMwszXoaR8
                     .BatModClient();
                  break;
               case ColorChooser:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.qyI8j5c1X446418TeHqdFaXCUL5RDNGSA5qVl44x3a8FW0x91TDlWtkuH1XvPM961qmOBEGzTLSAtIbtzVdg0RjBiyvDqPESdZbx
                     .BatModClient();
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModProgressBar();
                  this.ColorChooser
                     .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
                  break;
               case TextField:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ZhnNhTXe9crzzTUylC0JahHDfGNPCyEnOb2OqkvbH7Bar057g7DRjrVEMJHug4xSrC5wvpJSxULjVuY8Pq7gjZFa1I7RDupfHBlk = !shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ZhnNhTXe9crzzTUylC0JahHDfGNPCyEnOb2OqkvbH7Bar057g7DRjrVEMJHug4xSrC5wvpJSxULjVuY8Pq7gjZFa1I7RDupfHBlk;
                  break;
               case BatModInstallerMain:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd = (
                        shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd
                           + 1
                     )
                     % 3;
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1 = shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd;
                  var1.ButtonAction = "Tex Min: "
                     + shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ux60PXpaZowA9ZSvz4gGC3yG16SrQX1cLvChl4bThEWpS3SWokOIEpx2pMwHEbTh4Yp9pWk10ACpoGLGDY2DhDu1noW29UX4Udup[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd];
                  shadersmod.client.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3.Button();
                  break;
               case iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh = (
                        shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh
                           + 1
                     )
                     % 2;
                  var1.ButtonAction = "Tex_n Mag: "
                     + shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ZBg3eOo6s8AWIxitZfOJ3Z1qMA6la1qc6Ei6eXBO1d4aTj3nMc13WCzbjLNMZp0Pr4wsuCTUY8VIfNLvAvDaGAvn5TlwSAotOF13[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh];
                  shadersmod.client.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3.Button();
                  break;
               case bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn = (
                        shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
                           + 1
                     )
                     % 2;
                  var1.ButtonAction = "Tex_s Mag: "
                     + shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ZBg3eOo6s8AWIxitZfOJ3Z1qMA6la1qc6Ei6eXBO1d4aTj3nMc13WCzbjLNMZp0Pr4wsuCTUY8VIfNLvAvDaGAvn5TlwSAotOF13[shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn];
                  shadersmod.client.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3.Button();
                  break;
               case ColorTextPane:
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt = !shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt;
                  var1.ButtonAction = "ShadowClipFrustrum: "
                     + BatModClient(
                        shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt
                     );
                  shadersmod.client.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3.Button();
            }

            var2.Button();
         } else {
            switch (var1.Spinner) {
               case 201:
                  switch (BatModProgressBar()) {
                     case 1:
                        String var18 = String.format(
                           "cmd.exe /C start \"Open file\" \"%s\"",
                           shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.QQ5D56KfxSyi6rEyp0zL1s4ez6ATsphkLVBKrMJBOvjZUhYnhiLkucwAxMRJWNzDjeOotGPyHLZAME7h6nrNIBd3mVG8IurJOAqi
                              .getAbsolutePath()
                        );

                        try {
                           Runtime.getRuntime().exec(var18);
                           return;
                        } catch (IOException var17) {
                           var17.printStackTrace();
                           break;
                        }
                     case 2:
                        try {
                           Runtime.getRuntime()
                              .exec(
                                 new String[]{
                                    "/usr/bin/open",
                                    shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.QQ5D56KfxSyi6rEyp0zL1s4ez6ATsphkLVBKrMJBOvjZUhYnhiLkucwAxMRJWNzDjeOotGPyHLZAME7h6nrNIBd3mVG8IurJOAqi
                                       .getAbsolutePath()
                                 }
                              );
                           return;
                        } catch (IOException var16) {
                           var16.printStackTrace();
                        }
                  }

                  boolean var19 = false;

                  try {
                     Class var21 = Class.forName("java.awt.Desktop");
                     Object var22 = var21.getMethod("getDesktop").invoke(null);
                     var21.getMethod("browse", URI.class)
                        .invoke(
                           var22,
                           new File(
                                 this.ColorChooser.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY,
                                 shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Hnx1SucrXGk1EgLdePgO8WMFREP8Aw8My78UqDJLyqPNdVVXQSzfCKMO8EMOvDaScz0NNLzo539Mh9gjeuNGKhxZQ0mzvdKa5BtO
                              )
                              .toURI()
                        );
                  } catch (Throwable var15) {
                     var15.printStackTrace();
                     var19 = true;
                  }

                  if (var19) {
                     xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                        "Opening via system class!"
                     );
                     Sys.openURL(
                        "file://"
                           + shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.QQ5D56KfxSyi6rEyp0zL1s4ez6ATsphkLVBKrMJBOvjZUhYnhiLkucwAxMRJWNzDjeOotGPyHLZAME7h6nrNIBd3mVG8IurJOAqi
                              .getAbsolutePath()
                     );
                  }
                  break;
               case 202:
                  new File(
                     shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.V4U8zSbV5oGxHkoqeymSeS5NNp4QZkluA2psMXeWc1QFDhlTT6Ia4s2FfvRRbFoRvpX9b7d0uvZ41uDCSIDH4XAriWOOq4F6Cwcj,
                     "current.cfg"
                  );
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button();
                  this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = true;
                  this.ColorChooser
                     .BatModClient(
                        this.BatModClient
                     );
                  break;
               case 203:
                  shadersmod.client.IntegerSpinner var20 = new shadersmod.client.IntegerSpinner(
                     this,
                     xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae()
                  );
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ()
                     .BatModClient(var20);
                  break;
               default:
                  this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                     .BatModClient(var1);
            }
         }
      }
   }

   @Override
   public void q_() {
      super.q_();
      if (!this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8) {
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button();
      }
   }

   @Override
   public void BatModClient(int var1, int var2, float var3) {
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA();
      this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         .BatModClient(var1, var2, var3);
      if (this.BatModProgressBar <= 0) {
         this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
            .Spinner();
         this.BatModProgressBar += 20;
      }

      this.BatModClient(
         this.BatModJson,
         this.Button + " ",
         this.TextField / 2,
         15,
         16777215
      );
      String var4 = "OpenGL: "
         + shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Checkbox
         + ", "
         + shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ProgressBar
         + ", "
         + shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModProgressBar;
      int var5 = this.BatModJson
         .BatModClient(var4);
      if (var5 < this.TextField - 5) {
         this.BatModClient(
            this.BatModJson,
            var4,
            this.TextField / 2,
            this.ColorTextPane - 40,
            8421504
         );
      } else {
         this.Button(
            this.BatModJson,
            var4,
            5,
            this.ColorTextPane - 40,
            8421504
         );
      }

      super.BatModClient(var1, var2, var3);
   }

   @Override
   public void a_() {
      super.a_();
      this.BatModProgressBar--;
   }

   public AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB ProgressBar() {
      return this.ColorChooser;
   }

   public void BatModClient(String var1, int var2, int var3, int var4) {
      this.BatModClient(
         this.BatModJson, var1, var2, var3, var4
      );
   }

   public static String BatModClient(boolean var0) {
      String var1 = FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button();
      String var2 = FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
      return var0 ? var1 : var2;
   }

   public static String BatModClient(int var0) {
      return var0 == 2
         ? "FXAA 2x"
         : (
            var0 == 4
               ? "FXAA 4x"
               : FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner()
         );
   }

   public static String BatModClient(
      float var0, float[] var1, String[] var2
   ) {
      int var3 = BatModClient(var0, var1);
      return var2[var3];
   }

   public static int BatModClient(float var0, float[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         float var3 = var1[var2];
         if (var3 >= var0) {
            return var2;
         }
      }

      return var1.length - 1;
   }

   public static String BatModClient(float var0) {
      return BatModClient(
         var0,
         xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
         o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
      );
   }

   public static String Button(float var0) {
      return BatModClient(
         var0,
         K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL,
         sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
      );
   }

   public static int BatModProgressBar() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")
         ? 1
         : (
            var0.contains("mac")
               ? 2
               : (var0.contains("solaris") ? 3 : (var0.contains("sunos") ? 3 : (var0.contains("linux") ? 4 : (var0.contains("unix") ? 4 : 0))))
         );
   }
}
