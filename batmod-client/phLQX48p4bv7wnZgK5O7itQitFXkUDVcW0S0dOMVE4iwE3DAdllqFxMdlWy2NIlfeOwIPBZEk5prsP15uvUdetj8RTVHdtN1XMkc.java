import java.util.List;

public class phLQX48p4bv7wnZgK5O7itQitFXkUDVcW0S0dOMVE4iwE3DAdllqFxMdlWy2NIlfeOwIPBZEk5prsP15uvUdetj8RTVHdtN1XMkc
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "summon";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.summon.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 1) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.summon.usage");
      }

      String var3 = var2[0];
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = var1.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var5 = var1.B_();
      double var6 = var5.BatModClient;
      double var8 = var5.Button;
      double var10 = var5.CustomSpinner;
      if (var2.length >= 4) {
         var6 = Button(var6, var2[1], true);
         var8 = Button(var8, var2[2], false);
         var10 = Button(var10, var2[3], true);
         var4 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var6, var8, var10);
      }

      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var12 = var1.ButtonAction();
      if (!var12.Checkbox(var4)) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.summon.outOfWorld");
      }

      if ("LightningBolt".equals(var3)) {
         var12.Spinner(
            new OeVe6x8UgYmdnjTvMmRtQrR1YqXwgTa8QbP6adPgOlMn7zAkOwj3KUII1IlR5JUacvOCYNJcgUX6W8VW2Ilp4moycemrBmQCQaH3(var12, var6, var8, var10)
         );
         BatModClient(var1, this, "commands.summon.success");
      } else {
         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var13 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         boolean var14 = false;
         if (var2.length >= 5) {
            WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var15 = BatModClient(
               var1, var2, 4
            );

            try {
               var13 = vphUrnh98xLudN5HSO36Mg1NeLo6iMGHXeBJODlR0dXu1Iy4QBCNdQaRBKdgHi8eTPXzkTfx7fGnqf94Zku3AAWUqmNv6ZIg8pgJ.BatModClient(
                  var15.BatModProgressBar()
               );
               var14 = true;
            } catch (HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a var20) {
               throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                  "commands.summon.tagError", var20.getMessage()
               );
            }
         }

         var13.BatModClient("id", var3);

         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var21;
         try {
            var21 = hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA.BatModClient(
               var13, var12
            );
         } catch (RuntimeException var19) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.summon.failed");
         }

         if (var21 == null) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.summon.failed");
         }

         var21.Button(
            var6,
            var8,
            var10,
            var21.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
            var21.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
         );
         if (!var14 && var21 instanceof it45MyBnm2IZZfPuRP66nD6SIdiJpqBCNKiOC2x6MO4Od0xAdGqRQUQFZBvu7XKXYghppBHFiQ7KJ2WG795NPnwzqu5fPMJ0fnuA) {
            ((it45MyBnm2IZZfPuRP66nD6SIdiJpqBCNKiOC2x6MO4Od0xAdGqRQUQFZBvu7XKXYghppBHFiQ7KJ2WG795NPnwzqu5fPMJ0fnuA)var21)
               .BatModClient(
                  var12.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL(
                     new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var21)
                  ),
                  (hM6oicVpdHa9ITKKi7gXDUUuQ0Ya2uKoBkZBP5lFonFWaHBxstRb4Mya29tQeD6BZO17gRZ099QFcvZTCfYmunEQnYRYB3MkMzAR)null
               );
         }

         var12.BatModClient(var21);
         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var16 = var21;

         for (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var17 = var13;
            var16 != null && var17.Button("Riding", 10);
            var17 = var17.BatModInstallerMain("Riding")
         ) {
            Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var18 = hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA.BatModClient(
               var17.BatModInstallerMain("Riding"), var12
            );
            if (var18 != null) {
               var18.Button(
                  var6,
                  var8,
                  var10,
                  var18.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF,
                  var18.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
               );
               var12.BatModClient(var18);
               var16.BatModClient(var18);
            }

            var16 = var18;
         }

         BatModClient(var1, this, "commands.summon.success");
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length == 1
         ? BatModClient(
            var2,
            hKPBOe3585WEzG4DP150uJQPNGxACsB5sNJBGIeVlmG7aFifjWp9gTp4sNfskpb6eHYTPSj8yHrMYptqaEgctEBusNqgap6lpZxA.Button()
         )
         : (
            var2.length > 1 && var2.length <= 4
               ? BatModClient(var2, 1, var3)
               : null
         );
   }
}
