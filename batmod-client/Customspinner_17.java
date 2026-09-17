import java.util.List;

public class DyEYxQG2zuesgui6SUr7I1CEbDEdMnkIRuTn9tq0cyUi7iGaDf7lFZDxhR9ehdfjel7NToymBPPuTwSCKS6FRXRPBuEB7P2Rfks5
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "playsound";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.playsound.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 2) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k(
            this.CustomSpinner(var1)
         );
      }

      int var3 = 0;
      String var4 = var2[var3++];
      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var5 = BatModClient(
         var1, var2[var3++]
      );
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var6 = var1.B_();
      double var7 = var6.BatModClient;
      if (var2.length > var3) {
         var7 = Button(var7, var2[var3++], true);
      }

      double var9 = var6.Button;
      if (var2.length > var3) {
         var9 = Button(var9, var2[var3++], 0, 0, false);
      }

      double var11 = var6.CustomSpinner;
      if (var2.length > var3) {
         var11 = Button(var11, var2[var3++], true);
      }

      double var13 = 1.0;
      if (var2.length > var3) {
         var13 = BatModClient(
            var2[var3++], (double)0.0, (double)Float.MAX_VALUE
         );
      }

      double var15 = 1.0;
      if (var2.length > var3) {
         var15 = BatModClient(var2[var3++], (double)0.0, (double)2.0);
      }

      double var17 = 0.0;
      if (var2.length > var3) {
         var17 = BatModClient(var2[var3], (double)0.0, (double)1.0);
      }

      double var19 = var13 > 1.0 ? var13 * 16.0 : 16.0;
      double var21 = var5.Checkbox(var7, var9, var11);
      if (var21 > var19) {
         if (var17 <= 0.0) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.playsound.playerTooFar", var5.C_()
            );
         }

         double var23 = var7 - var5.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
         double var25 = var9 - var5.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
         double var27 = var11 - var5.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
         double var29 = Math.sqrt(var23 * var23 + var25 * var25 + var27 * var27);
         if (var29 > 0.0) {
            var7 = var5.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 + var23 / var29 * 2.0;
            var9 = var5.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa + var25 / var29 * 2.0;
            var11 = var5.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 + var27 / var29 * 2.0;
         }

         var13 = var17;
      }

      var5.BatModClient
         .BatModClient(
            new aQYJ5vTS77hirgh00au6tVSO0XDCdR5TldlRwa3LQoWMkBDePGAV0nD8kd8gUYiATAH304mplM2YUd08tiAj3PYctQhmqljGAOop(
               var4, var7, var9, var11, (float)var13, (float)var15
            )
         );
      BatModClient(
         var1, this, "commands.playsound.success", var4, var5.C_()
      );
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 2
         ? BatModClient(
            var2,
            TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
         )
         : (
            var2.length > 2 && var2.length <= 5
               ? BatModClient(var2, 2, var3)
               : null
         );
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var2 == 1;
   }
}
