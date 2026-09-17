import java.util.List;

public class BxKadZrqUgcpxKYc41JkpYaedUCX3EKSIWxsjIZEvnwHZ2mHoqklHXSf2YsLdDoYd03oyGzAg8f1EeqXG24Qzat16yX7lzPNHrYl
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "time";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.time.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length > 1) {
         if (var2[0].equals("set")) {
            int var6;
            if (var2[1].equals("day")) {
               var6 = 1000;
            } else if (var2[1].equals("night")) {
               var6 = 13000;
            } else {
               var6 = BatModClient(var2[1], 0);
            }

            this.BatModClient(var1, var6);
            BatModClient(var1, this, "commands.time.set", var6);
            return;
         }

         if (var2[0].equals("add")) {
            int var5 = BatModClient(var2[1], 0);
            this.Button(var1, var5);
            BatModClient(var1, this, "commands.time.added", var5);
            return;
         }

         if (var2[0].equals("query")) {
            if (var2[1].equals("daytime")) {
               int var4 = (int)(
                  var1.ButtonAction()
                        .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP()
                     % 2147483647L
               );
               var1.BatModClient(
                  OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.Spinner,
                  var4
               );
               BatModClient(var1, this, "commands.time.query", var4);
               return;
            }

            if (var2[1].equals("gametime")) {
               int var3 = (int)(
                  var1.ButtonAction()
                        .BatModJson()
                     % 2147483647L
               );
               var1.BatModClient(
                  OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.Spinner,
                  var3
               );
               BatModClient(var1, this, "commands.time.query", var3);
               return;
            }
         }
      }

      throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.time.usage");
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 1
         ? BatModClient(var2, "set", "add", "query")
         : (
            var2.length == 2 && var2[0].equals("set")
               ? BatModClient(var2, "day", "night")
               : (
                  var2.length == 2 && var2[0].equals("query")
                     ? BatModClient(var2, "daytime", "gametime")
                     : null
               )
         );
   }

   protected void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, int var2
   ) {
      for (int var3 = 0;
         var3
            < TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .ButtonAction.length;
         var3++
      ) {
         TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .ButtonAction[var3]
            .BatModClient((long)var2);
      }
   }

   protected void Button(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, int var2
   ) {
      for (int var3 = 0;
         var3
            < TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .ButtonAction.length;
         var3++
      ) {
         hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var4 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
            .ButtonAction[var3];
         var4.BatModClient(
            var4.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP() + var2
         );
      }
   }
}
