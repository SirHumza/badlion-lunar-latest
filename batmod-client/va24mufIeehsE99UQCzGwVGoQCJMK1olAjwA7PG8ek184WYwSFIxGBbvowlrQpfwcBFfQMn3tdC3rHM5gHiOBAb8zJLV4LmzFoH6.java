import java.util.EnumSet;
import java.util.List;

public class va24mufIeehsE99UQCzGwVGoQCJMK1olAjwA7PG8ek184WYwSFIxGBbvowlrQpfwcBFfQMn3tdC3rHM5gHiOBAb8zJLV4LmzFoH6
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "tp";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.tp.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 1) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.tp.usage");
      }

      byte var3 = 0;
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var4;
      if (var2.length != 2 && var2.length != 4 && var2.length != 6) {
         var4 = Button(var1);
      } else {
         var4 = Button(var1, var2[0]);
         var3 = 1;
      }

      if (var2.length != 1 && var2.length != 2) {
         if (var2.length < var3 + 3) {
            throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.tp.usage");
         }

         if (var4.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY != null) {
            int var14 = var3 + 1;
            hd5xDwzDpYnkgwbeKDbB71GXrTNMZbLVzdP8vePrJ77RLSQeUAaHdoXTaigXcABKIvZajcWgvq4BBNXnN9wY5nRSwFoUfVEMAhuv var6 = BatModClient(
               var4.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8, var2[var3], true
            );
            hd5xDwzDpYnkgwbeKDbB71GXrTNMZbLVzdP8vePrJ77RLSQeUAaHdoXTaigXcABKIvZajcWgvq4BBNXnN9wY5nRSwFoUfVEMAhuv var7 = BatModClient(
               var4.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa, var2[var14++], 0, 0, false
            );
            hd5xDwzDpYnkgwbeKDbB71GXrTNMZbLVzdP8vePrJ77RLSQeUAaHdoXTaigXcABKIvZajcWgvq4BBNXnN9wY5nRSwFoUfVEMAhuv var8 = BatModClient(
               var4.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4, var2[var14++], true
            );
            hd5xDwzDpYnkgwbeKDbB71GXrTNMZbLVzdP8vePrJ77RLSQeUAaHdoXTaigXcABKIvZajcWgvq4BBNXnN9wY5nRSwFoUfVEMAhuv var9 = BatModClient(
               var4.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
               var2.length > var14 ? var2[var14++] : "~",
               false
            );
            hd5xDwzDpYnkgwbeKDbB71GXrTNMZbLVzdP8vePrJ77RLSQeUAaHdoXTaigXcABKIvZajcWgvq4BBNXnN9wY5nRSwFoUfVEMAhuv var10 = BatModClient(
               var4.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb,
               var2.length > var14 ? var2[var14] : "~",
               false
            );
            if (var4 instanceof egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS) {
               EnumSet var17 = EnumSet.noneOf(pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ.class);
               if (var6.CustomSpinner()) {
                  var17.add(
                     pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ.BatModClient
                  );
               }

               if (var7.CustomSpinner()) {
                  var17.add(
                     pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ.Button
                  );
               }

               if (var8.CustomSpinner()) {
                  var17.add(
                     pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ.CustomSpinner
                  );
               }

               if (var10.CustomSpinner()) {
                  var17.add(
                     pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ.Spinner
                  );
               }

               if (var9.CustomSpinner()) {
                  var17.add(
                     pJHu9hX4pSS9X5R7MymxhLsZ2RRfAXrg1InozKLPW4SrWrrELWOwD8nhQHjuxyhM50L0tVbL2ZzhDSuIC7PSdXSHyQocf7ZCWYaJ.ButtonAction
                  );
               }

               float var18 = (float)var9.Button();
               if (!var9.CustomSpinner()) {
                  var18 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                     var18
                  );
               }

               float var13 = (float)var10.Button();
               if (!var10.CustomSpinner()) {
                  var13 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                     var13
                  );
               }

               if (var13 > 90.0F || var13 < -90.0F) {
                  var13 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                     180.0F - var13
                  );
                  var18 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                     var18 + 180.0F
                  );
               }

               var4.BatModClient(
                  (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)null
               );
               ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)var4)
                  .BatModClient
                  .BatModClient(
                     var6.Button(),
                     var7.Button(),
                     var8.Button(),
                     var18,
                     var13,
                     var17
                  );
               var4.BatModProgressBar(var18);
            } else {
               float var11 = (float)u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                  var9.BatModClient()
               );
               float var12 = (float)u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                  var10.BatModClient()
               );
               if (var12 > 90.0F || var12 < -90.0F) {
                  var12 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                     180.0F - var12
                  );
                  var11 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.ProgressBar(
                     var11 + 180.0F
                  );
               }

               var4.Button(
                  var6.BatModClient(),
                  var7.BatModClient(),
                  var8.BatModClient(),
                  var11,
                  var12
               );
               var4.BatModProgressBar(var11);
            }

            BatModClient(
               var1,
               this,
               "commands.tp.success.coordinates",
               var4.C_(),
               var6.BatModClient(),
               var7.BatModClient(),
               var8.BatModClient()
            );
         }
      } else {
         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var5 = Button(
            var1, var2[var2.length - 1]
         );
         if (var5.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
            != var4.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.tp.notSameDimension");
         }

         var4.BatModClient(
            (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)null
         );
         if (var4 instanceof egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS) {
            ((egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS)var4)
               .BatModClient
               .BatModClient(
                  var5.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
                  var5.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
                  var5.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4,
                  var5.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
                  var5.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
               );
         } else {
            var4.Button(
               var5.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
               var5.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
               var5.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4,
               var5.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
               var5.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
            );
         }

         BatModClient(
            var1, this, "commands.tp.success", var4.C_(), var5.C_()
         );
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length != 1 && var2.length != 2
         ? null
         : BatModClient(
            var2,
            TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
         );
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var2 == 0;
   }
}
