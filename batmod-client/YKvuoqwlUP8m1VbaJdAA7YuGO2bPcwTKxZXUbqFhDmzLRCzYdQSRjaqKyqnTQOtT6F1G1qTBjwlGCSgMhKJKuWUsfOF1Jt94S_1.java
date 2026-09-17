import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class Y9I6GlqbSg83ebTtUcl3a4t3DmU1Q5KYeJK3sv35UsBDBi1JEqDl1Q9F3h01UaWAwOkvAoslNvwcm2dMbbzP6TAJMb6ekih3bwPl
   extends YKvuoqwlUP8m1VbaJdAA7YuGO2bPcwTKxZXUbqFhDmzLRCzYdQSRjaqKyqnTQOtT6F1G1qTBjwlGCSgMhKJKuWUsfOF1Jt94S {
   private int Checkbox = 32;
   private int ProgressBar = 5;
   public static final List Spinner = Arrays.asList(
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o,
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY,
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP,
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
   );
   private static final List BatModProgressBar = Lists.newArrayList();

   public Y9I6GlqbSg83ebTtUcl3a4t3DmU1Q5KYeJK3sv35UsBDBi1JEqDl1Q9F3h01UaWAwOkvAoslNvwcm2dMbbzP6TAJMb6ekih3bwPl() {
   }

   public Y9I6GlqbSg83ebTtUcl3a4t3DmU1Q5KYeJK3sv35UsBDBi1JEqDl1Q9F3h01UaWAwOkvAoslNvwcm2dMbbzP6TAJMb6ekih3bwPl(Map var1) {
      this();

      for (Entry var3 : var1.entrySet()) {
         if (((String)var3.getKey()).equals("spacing")) {
            this.Checkbox = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               (String)var3.getValue(), this.Checkbox, 1
            );
         } else if (((String)var3.getKey()).equals("separation")) {
            this.ProgressBar = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               (String)var3.getValue(), this.ProgressBar, 1
            );
         }
      }
   }

   @Override
   public String BatModClient() {
      return "Monument";
   }

   @Override
   protected boolean BatModClient(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      if (var1 < 0) {
         var1 -= this.Checkbox - 1;
      }

      if (var2 < 0) {
         var2 -= this.Checkbox - 1;
      }

      int var5 = var1 / this.Checkbox;
      int var6 = var2 / this.Checkbox;
      Random var7 = this.CustomSpinner
         .Button(var5, var6, 10387313);
      var5 *= this.Checkbox;
      var6 *= this.Checkbox;
      var5 += (
            var7.nextInt(
                  this.Checkbox
                     - this.ProgressBar
               )
               + var7.nextInt(
                  this.Checkbox
                     - this.ProgressBar
               )
         )
         / 2;
      var6 += (
            var7.nextInt(
                  this.Checkbox
                     - this.ProgressBar
               )
               + var7.nextInt(
                  this.Checkbox
                     - this.ProgressBar
               )
         )
         / 2;
      if (var3 == var5 && var4 == var6) {
         if (this.CustomSpinner
               .IntegerSpinner()
               .BatModClient(
                  new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var3 * 16 + 8, 64, var4 * 16 + 8),
                  (Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF)null
               )
            != Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
            )
          {
            return false;
         }

         boolean var8 = this.CustomSpinner
            .IntegerSpinner()
            .BatModClient(
               var3 * 16 + 8, var4 * 16 + 8, 29, Spinner
            );
         if (var8) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected lmGpsHWfgruU6R0D9ud0H5Jp2r9xkezQ8UkI9FCTC83XJ7VxWqi0MyTqquqseEc7buI8NDQigAt0sAauOiFXoiCCZ13l7ZRiEMA7 Button(
      int var1, int var2
   ) {
      return new BbCCYnq031kONMXvKfkkyNcqluA3zAJMqYuz1WhEGwes8usoSKq2y80VBgPNnUVUwchAwmV4DSU33CfNSTMVbyKjQ5nxzuGNrcOj(
         this.CustomSpinner,
         this.Button,
         var1,
         var2
      );
   }

   public List CustomSpinner() {
      return BatModProgressBar;
   }

   static {
      BatModProgressBar.add(
         new n42PsycJ1wsA2TfjrqQrpFar7c4ababcmIl03rr87eT3AzpwqPAVt9NRKEDBIjTAuKtupqzeBuvSt7onBWDznr42hL69RILEMmmk(
            ZtyM8qo9IZpZIVkcj0FAny1WT8jpiZ6oXSvx5U2ex48ZOwaVCiixFwuKSJWN3XJyiKYTaMnvvxdh6ZMCsHgByvXMbZ3gbg5F0ePF.class, 1, 2, 4
         )
      );
   }
}
