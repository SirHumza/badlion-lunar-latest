import java.util.List;

public class XqZmHSQAiKUlIicrDXSyGLW6az91gwZkIFT61804ovWdLzZwltS63rZIMgFo632gmeA5cx8Lv8x0MhABzFYNLqH9blQAnFosinUJ
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "effect";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.effect.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 2) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.effect.usage");
      }

      B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R var3 = (B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R)BatModClient(
         var1, var2[0], B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R.class
      );
      if (var2[1].equals("clear")) {
         if (var3.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD().isEmpty()) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
               "commands.effect.failure.notActive.all", var3.C_()
            );
         }

         var3.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt();
         BatModClient(
            var1, this, "commands.effect.success.removed.all", var3.C_()
         );
      } else {
         int var4;
         try {
            var4 = BatModClient(var2[1], 1);
         } catch (AC7DHVQ77uvXF5QCLMnJsah5UmUnPopMXXEx6PtFJK7ErlEaGWbe3YW49QICJyfOJolaoUELWqAzC1t1DKTl1VKnsy46hxAXVYxR var11) {
            ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x var6 = ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient(
               var2[1]
            );
            if (var6 == null) {
               throw var11;
            }

            var4 = var6.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb;
         }

         int var5 = 600;
         int var12 = 30;
         int var7 = 0;
         if (var4 < 0
            || var4
               >= ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient.length
            || ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[var4]
               == null) {
            throw new AC7DHVQ77uvXF5QCLMnJsah5UmUnPopMXXEx6PtFJK7ErlEaGWbe3YW49QICJyfOJolaoUELWqAzC1t1DKTl1VKnsy46hxAXVYxR("commands.effect.notFound", var4);
         }

         ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x var8 = ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient[var4];
         if (var2.length >= 3) {
            var12 = BatModClient(var2[2], 0, 1000000);
            if (var8.CustomSpinner()) {
               var5 = var12;
            } else {
               var5 = var12 * 20;
            }
         } else if (var8.CustomSpinner()) {
            var5 = 1;
         }

         if (var2.length >= 4) {
            var7 = BatModClient(var2[3], 0, 255);
         }

         boolean var9 = true;
         if (var2.length >= 5 && "true".equalsIgnoreCase(var2[4])) {
            var9 = false;
         }

         if (var12 > 0) {
            Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn var10 = new Vh7hQbBPS72k8EM0hg01W4cU79DjSwdIWjh8U37Ozd2ALBjThi1P2PD0mISh9o6Q7PIhiyBdspisZbvXngtkpaH1RGfSdZz0LTOn(
               var4, var5, var7, false, var9
            );
            var3.BatModClient(var10);
            BatModClient(
               var1,
               this,
               "commands.effect.success",
               new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
                  var10.Checkbox()
               ),
               var4,
               var7,
               var3.C_(),
               var12
            );
         } else {
            if (!var3.BatModInstallerMain(var4)) {
               throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                  "commands.effect.failure.notActive",
                  new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
                     var8.ButtonAction()
                  ),
                  var3.C_()
               );
            }

            var3.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN(var4);
            BatModClient(
               var1,
               this,
               "commands.effect.success.removed",
               new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
                  var8.ButtonAction()
               ),
               var3.C_()
            );
         }
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
            var2, this.ButtonAction()
         )
         : (
            var2.length == 2
               ? BatModClient(
                  var2,
                  ZUDwYNjCeINqRWF6FAPpMunfGjQvU0YXZjnXsNgleGrjLXPzaRQ6pMmpMMxUGNbFkZePhihxN2n4JALpHneODYzNOvRvyRQiG2x.BatModClient()
               )
               : (
                  var2.length == 5
                     ? BatModClient(var2, "true", "false")
                     : null
               )
         );
   }

   protected String[] ButtonAction() {
      return TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
         .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var2 == 0;
   }
}
