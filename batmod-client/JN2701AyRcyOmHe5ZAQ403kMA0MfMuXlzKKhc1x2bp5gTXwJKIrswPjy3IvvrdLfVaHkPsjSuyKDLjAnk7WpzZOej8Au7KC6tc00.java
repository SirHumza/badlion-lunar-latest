import java.util.List;

public class JN2701AyRcyOmHe5ZAQ403kMA0MfMuXlzKKhc1x2bp5gTXwJKIrswPjy3IvvrdLfVaHkPsjSuyKDLjAnk7WpzZOej8Au7KC6tc00
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "difficulty";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.difficulty.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length <= 0) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.difficulty.usage");
      }

      jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi var3 = this.Spinner(
         var2[0]
      );
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .BatModClient(var3);
      BatModClient(
         var1,
         this,
         "commands.difficulty.success",
         new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            var3.Button()
         )
      );
   }

   protected jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi Spinner(
      String var1
   ) {
      return var1.equalsIgnoreCase("peaceful") || var1.equalsIgnoreCase("p")
         ? jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.BatModClient
         : (
            var1.equalsIgnoreCase("easy") || var1.equalsIgnoreCase("e")
               ? jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.Button
               : (
                  !var1.equalsIgnoreCase("normal") && !var1.equalsIgnoreCase("n")
                     ? (
                        !var1.equalsIgnoreCase("hard") && !var1.equalsIgnoreCase("h")
                           ? jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.BatModClient(
                              BatModClient(var1, 0, 3)
                           )
                           : jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.ButtonAction
                     )
                     : jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.CustomSpinner
               )
         );
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 1
         ? BatModClient(var2, "peaceful", "easy", "normal", "hard")
         : null;
   }
}
