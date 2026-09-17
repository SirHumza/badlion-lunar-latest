import java.util.List;

public class FKUlx5wH5p1apv6ele4s4KLuhQyQijojfmLgPGHGVlYSjWVkebbEXiDVMgoelLlOhSAwPxFJM1wClXQsz3M7LYJXK3r0amO1WHEL
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "particle";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.particle.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 8) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.particle.usage");
      }

      boolean var3 = false;
      bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI var4 = null;

      for (bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI var8 : bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.values()) {
         if (var8.Checkbox()) {
            if (var2[0].startsWith(var8.Button())) {
               var3 = true;
               var4 = var8;
               break;
            }
         } else if (var2[0].equals(var8.Button())) {
            var3 = true;
            var4 = var8;
            break;
         }
      }

      if (!var3) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.particle.notFound", var2[0]);
      }

      String var30 = var2[0];
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var31 = var1.B_();
      double var32 = (float)Button(
         var31.BatModClient, var2[1], true
      );
      double var9 = (float)Button(
         var31.Button, var2[2], true
      );
      double var11 = (float)Button(
         var31.CustomSpinner, var2[3], true
      );
      double var13 = (float)CustomSpinner(var2[4]);
      double var15 = (float)CustomSpinner(var2[5]);
      double var17 = (float)CustomSpinner(var2[6]);
      double var19 = (float)CustomSpinner(var2[7]);
      int var21 = 0;
      if (var2.length > 8) {
         var21 = BatModClient(var2[8], 0);
      }

      boolean var22 = false;
      if (var2.length > 9 && "force".equals(var2[9])) {
         var22 = true;
      }

      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var23 = var1.ButtonAction();
      if (var23 instanceof hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3) {
         hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3 var24 = (hFZJAH3yIqfwCBV3b79FNqw6s6MptXUmJFkvggZ1hAcG7kdcmKvpDqxghz0xajK8jKFWyzGVF58QgJ3BGULiOg2PZcvuX82DqXK3)var23;
         int[] var25 = new int[var4.ButtonAction()];
         if (var4.Checkbox()) {
            String[] var26 = var2[0].split("_", 3);

            for (int var27 = 1; var27 < var26.length; var27++) {
               try {
                  var25[var27 - 1] = Integer.parseInt(var26[var27]);
               } catch (NumberFormatException var29) {
                  throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                     "commands.particle.notFound", var2[0]
                  );
               }
            }
         }

         var24.BatModClient(
            var4, var22, var32, var9, var11, var21, var13, var15, var17, var19, var25
         );
         BatModClient(
            var1, this, "commands.particle.success", var30, Math.max(var21, 1)
         );
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
            bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModClient()
         )
         : (
            var2.length > 1 && var2.length <= 4
               ? BatModClient(var2, 1, var3)
               : (
                  var2.length == 10
                     ? BatModClient(var2, "normal", "force")
                     : null
               )
         );
   }
}
