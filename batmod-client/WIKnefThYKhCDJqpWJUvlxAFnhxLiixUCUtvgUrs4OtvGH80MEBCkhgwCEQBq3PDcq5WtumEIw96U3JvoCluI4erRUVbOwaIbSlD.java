import java.util.List;
import java.util.Random;

public class WIKnefThYKhCDJqpWJUvlxAFnhxLiixUCUtvgUrs4OtvGH80MEBCkhgwCEQBq3PDcq5WtumEIw96U3JvoCluI4erRUVbOwaIbSlD
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "weather";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.weather.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length >= 1 && var2.length <= 2) {
         int var3 = (300 + new Random().nextInt(600)) * 20;
         if (var2.length >= 2) {
            var3 = BatModClient(var2[1], 1, 1000000) * 20;
         }

         hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var4 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
            .ButtonAction[0];
         KitVScYE9kT111hKrLPkEwp7zG3KSm9e3NBwqloD0cWi3xqPVuWeW5wgEZsUOSSFuyDI5vihOc1q1MDgkBoUdUsYT0oFWcNPr7oC var5 = var4.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL();
         if ("clear".equalsIgnoreCase(var2[0])) {
            var5.ProgressBar(var3);
            var5.Checkbox(0);
            var5.Spinner(0);
            var5.Button(false);
            var5.BatModClient(false);
            BatModClient(var1, this, "commands.weather.clear");
         } else if ("rain".equalsIgnoreCase(var2[0])) {
            var5.ProgressBar(0);
            var5.Checkbox(var3);
            var5.Spinner(var3);
            var5.Button(true);
            var5.BatModClient(false);
            BatModClient(var1, this, "commands.weather.rain");
         } else {
            if (!"thunder".equalsIgnoreCase(var2[0])) {
               throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.weather.usage");
            }

            var5.ProgressBar(0);
            var5.Checkbox(var3);
            var5.Spinner(var3);
            var5.Button(true);
            var5.BatModClient(true);
            BatModClient(var1, this, "commands.weather.thunder");
         }
      } else {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.weather.usage");
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 1
         ? BatModClient(var2, "clear", "rain", "thunder")
         : null;
   }
}
