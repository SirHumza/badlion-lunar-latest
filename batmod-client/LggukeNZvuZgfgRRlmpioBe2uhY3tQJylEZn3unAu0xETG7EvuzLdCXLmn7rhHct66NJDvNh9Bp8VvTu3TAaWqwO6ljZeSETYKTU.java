import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class LggukeNZvuZgfgRRlmpioBe2uhY3tQJylEZn3unAu0xETG7EvuzLdCXLmn7rhHct66NJDvNh9Bp8VvTu3TAaWqwO6ljZeSETYKTU
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "spreadplayers";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.spreadplayers.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 6) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.spreadplayers.usage");
      }

      int var3 = 0;
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = var1.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
      double var5 = Button(
         var4.BatModProgressBar(), var2[var3++], true
      );
      double var7 = Button(
         var4.IntegerSpinner(), var2[var3++], true
      );
      double var9 = BatModClient(var2[var3++], (double)0.0);
      double var11 = BatModClient(var2[var3++], (double)(var9 + 1.0));
      boolean var13 = ButtonAction(var2[var3++]);
      ArrayList var14 = Lists.newArrayList();

      while (var3 < var2.length) {
         String var15 = var2[var3++];
         if (ZHe8k1rhxETrynnZllNzGfnZRfwbQyNFZ4kMMP5nNZ1ImIeSsVqWJwZAwn0TTNwEus4bIpxZLH7MvSBPdCXRgdGNHNg8aDhbmk1y.Button(
            var15
         )) {
            List var16 = ZHe8k1rhxETrynnZllNzGfnZRfwbQyNFZ4kMMP5nNZ1ImIeSsVqWJwZAwn0TTNwEus4bIpxZLH7MvSBPdCXRgdGNHNg8aDhbmk1y.Button(
               var1, var15, Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM.class
            );
            if (var16.size() == 0) {
               throw new chda7zJNcIRbDK6drQMBTHAHWSSFNUbAmYCkbgKgFnfdaM5m7pdHyb6mpuOYdIsn0njspCGk58Phc8AqGr76eFDhJ0jSDQBoomz5();
            }

            var14.addAll(var16);
         } else {
            egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var22 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
               .AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
               .BatModClient(var15);
            if (var22 == null) {
               throw new KwyBlSYS5qWSxgRJU7Lnc511bwTMTf6RUwoFx89t795yVpRN3M8pcjUfWjtbjVTmMxdjUaptCLqCd59NCmn2jN5VXYiYCaapmpeE();
            }

            var14.add(var22);
         }
      }

      var1.BatModClient(
         OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.CustomSpinner,
         var14.size()
      );
      if (var14.isEmpty()) {
         throw new chda7zJNcIRbDK6drQMBTHAHWSSFNUbAmYCkbgKgFnfdaM5m7pdHyb6mpuOYdIsn0njspCGk58Phc8AqGr76eFDhJ0jSDQBoomz5();
      }

      var1.BatModClient(
         new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
            "commands.spreadplayers.spreading." + (var13 ? "teams" : "players"), var14.size(), var11, var5, var7, var9
         )
      );
      this.BatModClient(
         var1,
         var14,
         new bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk(var5, var7),
         var9,
         var11,
         ((Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var14.get(0)).K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY,
         var13
      );
   }

   private void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      List var2,
      bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var3,
      double var4,
      double var6,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var8,
      boolean var9
   ) {
      Random var10 = new Random();
      double var11 = var3.BatModClient - var6;
      double var13 = var3.Button - var6;
      double var15 = var3.BatModClient + var6;
      double var17 = var3.Button + var6;
      bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk[] var19 = this.BatModClient(
         var10,
         var9 ? this.Button(var2) : var2.size(),
         var11,
         var13,
         var15,
         var17
      );
      int var20 = this.BatModClient(
         var3, var4, var8, var10, var11, var13, var15, var17, var19, var9
      );
      double var21 = this.BatModClient(var2, var8, var19, var9);
      BatModClient(
         var1,
         this,
         "commands.spreadplayers.success." + (var9 ? "teams" : "players"),
         var19.length,
         var3.BatModClient,
         var3.Button
      );
      if (var19.length > 1) {
         var1.BatModClient(
            new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(
               "commands.spreadplayers.info." + (var9 ? "teams" : "players"), String.format("%.2f", var21), var20
            )
         );
      }
   }

   private int Button(List var1) {
      HashSet var2 = Sets.newHashSet();

      for (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var4 : var1) {
         if (var4 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u) {
            var2.add(
               ((EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)var4)
                  .DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p()
            );
         } else {
            var2.add((nkZ2LEdPKII0cv7VetNuVbL8COdy8CmUZo7KwtV7VZkEEe3RqCXmXMfHyitqZb01HIFR3w1WOgourQDDqGNkutCVZbryTQU0D3W6)null);
         }
      }

      return var2.size();
   }

   private int BatModClient(
      bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var1,
      double var2,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var4,
      Random var5,
      double var6,
      double var8,
      double var10,
      double var12,
      bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk[] var14,
      boolean var15
   ) {
      boolean var16 = true;
      double var17 = Float.MAX_VALUE;

      int var19;
      for (var19 = 0; var19 < 10000 && var16; var19++) {
         var16 = false;
         var17 = Float.MAX_VALUE;

         for (int var20 = 0; var20 < var14.length; var20++) {
            bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var21 = var14[var20];
            int var22 = 0;
            bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var23 = new bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk();

            for (int var24 = 0; var24 < var14.length; var24++) {
               if (var20 != var24) {
                  bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var25 = var14[var24];
                  double var26 = var21.BatModClient(var25);
                  var17 = Math.min(var26, var17);
                  if (var26 < var2) {
                     var22++;
                     var23.BatModClient = var23.BatModClient
                        + (
                           var25.BatModClient
                              - var21.BatModClient
                        );
                     var23.Button = var23.Button
                        + (
                           var25.Button
                              - var21.Button
                        );
                  }
               }
            }

            if (var22 > 0) {
               var23.BatModClient /= var22;
               var23.Button /= var22;
               double var32 = var23.Button();
               if (var32 > 0.0) {
                  var23.BatModClient();
                  var21.Button(var23);
               } else {
                  var21.BatModClient(var5, var6, var8, var10, var12);
               }

               var16 = true;
            }

            if (var21.BatModClient(var6, var8, var10, var12)) {
               var16 = true;
            }
         }

         if (!var16) {
            for (bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var31 : var14) {
               if (!var31.Button(var4)) {
                  var31.BatModClient(var5, var6, var8, var10, var12);
                  var16 = true;
               }
            }
         }
      }

      if (var19 >= 10000) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.spreadplayers.failure." + (var15 ? "teams" : "players"),
            var14.length,
            var1.BatModClient,
            var1.Button,
            String.format("%.2f", var17)
         );
      } else {
         return var19;
      }
   }

   private double BatModClient(
      List var1,
      xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var2,
      bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk[] var3,
      boolean var4
   ) {
      double var5 = 0.0;
      int var7 = 0;
      HashMap var8 = Maps.newHashMap();

      for (int var9 = 0; var9 < var1.size(); var9++) {
         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var10 = (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var1.get(
            var9
         );
         bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var11;
         if (var4) {
            nkZ2LEdPKII0cv7VetNuVbL8COdy8CmUZo7KwtV7VZkEEe3RqCXmXMfHyitqZb01HIFR3w1WOgourQDDqGNkutCVZbryTQU0D3W6 var12 = var10 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u
               ? ((EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u)var10)
                  .DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p()
               : null;
            if (!var8.containsKey(var12)) {
               var8.put(var12, var3[var7++]);
            }

            var11 = (bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk)var8.get(var12);
         } else {
            var11 = var3[var7++];
         }

         var10.IntegerSpinner(
            u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                  var11.BatModClient
               )
               + 0.5F,
            var11.BatModClient(var2),
            u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                  var11.Button
               )
               + 0.5
         );
         double var17 = Double.MAX_VALUE;

         for (int var14 = 0; var14 < var3.length; var14++) {
            if (var11 != var3[var14]) {
               double var15 = var11.BatModClient(var3[var14]);
               var17 = Math.min(var15, var17);
            }
         }

         var5 += var17;
      }

      return var5 / var1.size();
   }

   private bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk[] BatModClient(
      Random var1, int var2, double var3, double var5, double var7, double var9
   ) {
      bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk[] var11 = new bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk[var2];

      for (int var12 = 0; var12 < var11.length; var12++) {
         bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk var13 = new bZkz4iG0PdCZQZZg6kLKdx2fUR0SEqv5pUUHbPx3lxpRW2aPdZpwSlEQzpbRCtZeV41DpaMdLb1eXv3rZrD3CvnjSff1sFgjEYWk();
         var13.BatModClient(var1, var3, var5, var7, var9);
         var11[var12] = var13;
      }

      return var11;
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length >= 1 && var2.length <= 2
         ? Button(var2, 0, var3)
         : null;
   }
}
