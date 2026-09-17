import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class rlz6jOVtimlfQjJbehUvXQeQS9ehPAZna2tRcCF28bQ5LehPjLAOSXYzUJYJvGrqI9f7OpjnlQ1ivVLlPrTtAie55jroMiaIjxyj
   extends YKvuoqwlUP8m1VbaJdAA7YuGO2bPcwTKxZXUbqFhDmzLRCzYdQSRjaqKyqnTQOtT6F1G1qTBjwlGCSgMhKJKuWUsfOF1Jt94S {
   public static final List Spinner = Arrays.asList(
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF,
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ,
      Ewr7HHrT3jHDdkBN79u1MCqblzovs8KYqZFy0ySaEgK8u06b1UD1FOdENa544pcLDdrgsU0fKPHeLOK7EJv58Nq3uFFZioXAlqLF.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
   );
   private int Checkbox;
   private int ProgressBar = 32;
   private int BatModProgressBar = 8;

   public rlz6jOVtimlfQjJbehUvXQeQS9ehPAZna2tRcCF28bQ5LehPjLAOSXYzUJYJvGrqI9f7OpjnlQ1ivVLlPrTtAie55jroMiaIjxyj() {
   }

   public rlz6jOVtimlfQjJbehUvXQeQS9ehPAZna2tRcCF28bQ5LehPjLAOSXYzUJYJvGrqI9f7OpjnlQ1ivVLlPrTtAie55jroMiaIjxyj(Map var1) {
      this();

      for (Entry var3 : var1.entrySet()) {
         if (((String)var3.getKey()).equals("size")) {
            this.Checkbox = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               (String)var3.getValue(), this.Checkbox, 0
            );
         } else if (((String)var3.getKey()).equals("distance")) {
            this.ProgressBar = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               (String)var3.getValue(),
               this.ProgressBar,
               this.BatModProgressBar + 1
            );
         }
      }
   }

   @Override
   public String BatModClient() {
      return "Village";
   }

   @Override
   protected boolean BatModClient(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      if (var1 < 0) {
         var1 -= this.ProgressBar - 1;
      }

      if (var2 < 0) {
         var2 -= this.ProgressBar - 1;
      }

      int var5 = var1 / this.ProgressBar;
      int var6 = var2 / this.ProgressBar;
      Random var7 = this.CustomSpinner
         .Button(var5, var6, 10387312);
      var5 *= this.ProgressBar;
      var6 *= this.ProgressBar;
      var5 += var7.nextInt(
         this.ProgressBar
            - this.BatModProgressBar
      );
      var6 += var7.nextInt(
         this.ProgressBar
            - this.BatModProgressBar
      );
      if (var3 == var5 && var4 == var6) {
         boolean var8 = this.CustomSpinner
            .IntegerSpinner()
            .BatModClient(
               var3 * 16 + 8, var4 * 16 + 8, 0, Spinner
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
      return new gV8J6qlVcCfVfQAs3EMclBWoOH2Wuq2ZNIaiR51jibUEu5HQOBpKh4wRVtnG7MpUmL2e2HW4FNKCQHY3nZ9K9qkorOCAuFKM8qso(
         this.CustomSpinner,
         this.Button,
         var1,
         var2,
         this.Checkbox
      );
   }
}
