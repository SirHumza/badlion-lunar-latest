import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class KLOGB2iu2bqnVn5fTtC1ZTurxSXk7RqrSlLrkWBte0dnhF5uuLW0MggmAyMZcZE9UJPmUqWxMybKSuXwEO9Q3Me5CB2pM2D6y9CZ
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "fill";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.fill.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 7) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.fill.usage");
      }

      var1.BatModClient(
         OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.Button,
         0
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = BatModClient(
         var1, var2, 0, false
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = BatModClient(
         var1, var2, 3, false
      );
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var5 = uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB.ProgressBar(
         var1, var2[6]
      );
      int var6 = 0;
      if (var2.length >= 8) {
         var6 = BatModClient(var2[7], 0, 15);
      }

      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var7 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         Math.min(
            var3.BatModProgressBar(),
            var4.BatModProgressBar()
         ),
         Math.min(
            var3.ColorChooser(),
            var4.ColorChooser()
         ),
         Math.min(
            var3.IntegerSpinner(),
            var4.IntegerSpinner()
         )
      );
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var8 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         Math.max(
            var3.BatModProgressBar(),
            var4.BatModProgressBar()
         ),
         Math.max(
            var3.ColorChooser(),
            var4.ColorChooser()
         ),
         Math.max(
            var3.IntegerSpinner(),
            var4.IntegerSpinner()
         )
      );
      int var9 = (
            var8.BatModProgressBar()
               - var7.BatModProgressBar()
               + 1
         )
         * (
            var8.ColorChooser()
               - var7.ColorChooser()
               + 1
         )
         * (
            var8.IntegerSpinner()
               - var7.IntegerSpinner()
               + 1
         );
      if (var9 > 32768) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.fill.tooManyBlocks", var9, 32768
         );
      }

      if (var7.ColorChooser() >= 0
         && var8.ColorChooser() < 256) {
         xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var10 = var1.ButtonAction();

         for (int var11 = var7.IntegerSpinner();
            var11 < var8.IntegerSpinner() + 16;
            var11 += 16
         ) {
            for (int var12 = var7.BatModProgressBar();
               var12 < var8.BatModProgressBar() + 16;
               var12 += 16
            ) {
               if (!var10.Checkbox(
                  new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                     var12,
                     var8.ColorChooser()
                        - var7.ColorChooser(),
                     var11
                  )
               )) {
                  throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.fill.outOfWorld");
               }
            }
         }

         YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var23 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
         boolean var24 = false;
         if (var2.length >= 10 && var5.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()) {
            String var13 = BatModClient(var1, var2, 9)
               .BatModProgressBar();

            try {
               var23 = vphUrnh98xLudN5HSO36Mg1NeLo6iMGHXeBJODlR0dXu1Iy4QBCNdQaRBKdgHi8eTPXzkTfx7fGnqf94Zku3AAWUqmNv6ZIg8pgJ.BatModClient(
                  var13
               );
               var24 = true;
            } catch (HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a var21) {
               throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                  "commands.fill.tagError", var21.getMessage()
               );
            }
         }

         ArrayList var25 = Lists.newArrayList();
         var9 = 0;

         for (int var14 = var7.IntegerSpinner();
            var14 <= var8.IntegerSpinner();
            var14++
         ) {
            for (int var15 = var7.ColorChooser();
               var15 <= var8.ColorChooser();
               var15++
            ) {
               for (int var16 = var7.BatModProgressBar();
                  var16 <= var8.BatModProgressBar();
                  var16++
               ) {
                  q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var17 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                     var16, var15, var14
                  );
                  if (var2.length >= 9) {
                     if (!var2[8].equals("outline") && !var2[8].equals("hollow")) {
                        if (var2[8].equals("destroy")) {
                           var10.Button(var17, true);
                        } else if (var2[8].equals("keep")) {
                           if (!var10.ButtonAction(var17)) {
                              continue;
                           }
                        } else if (var2[8].equals("replace")
                           && !var5.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()) {
                           if (var2.length > 9) {
                              c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var18 = uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB.ProgressBar(
                                 var1, var2[9]
                              );
                              if (var10.Button(var17)
                                    .CustomSpinner()
                                 != var18) {
                                 continue;
                              }
                           }

                           if (var2.length > 10) {
                              int var29 = uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB.BatModClient(
                                 var2[10]
                              );
                              jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var19 = var10.Button(
                                 var17
                              );
                              if (var19.CustomSpinner()
                                    .CustomSpinner(var19)
                                 != var29) {
                                 continue;
                              }
                           }
                        }
                     } else if (var16 != var7.BatModProgressBar()
                        && var16 != var8.BatModProgressBar()
                        && var15 != var7.ColorChooser()
                        && var15 != var8.ColorChooser()
                        && var14 != var7.IntegerSpinner()
                        && var14 != var8.IntegerSpinner()) {
                        if (var2[8].equals("hollow")) {
                           var10.BatModClient(
                              var17,
                              fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
                                 .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                              2
                           );
                           var25.add(var17);
                        }
                        continue;
                     }
                  }

                  gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var30 = var10.BatModClient(
                     var17
                  );
                  if (var30 != null) {
                     if (var30 instanceof r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr) {
                        ((r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr)var30)
                           .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
                     }

                     var10.BatModClient(
                        var17,
                        fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
                           .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                        var5
                              == fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
                           ? 2
                           : 4
                     );
                  }

                  jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var31 = var5.CustomSpinner(
                     var6
                  );
                  if (var10.BatModClient(var17, var31, 2)) {
                     var25.add(var17);
                     var9++;
                     if (var24) {
                        gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var20 = var10.BatModClient(
                           var17
                        );
                        if (var20 != null) {
                           var23.BatModClient(
                              "x", var17.BatModProgressBar()
                           );
                           var23.BatModClient(
                              "y", var17.ColorChooser()
                           );
                           var23.BatModClient(
                              "z", var17.IntegerSpinner()
                           );
                           var20.BatModClient(var23);
                        }
                     }
                  }
               }
            }
         }

         for (q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var27 : var25) {
            c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var28 = var10.Button(
                  var27
               )
               .CustomSpinner();
            var10.BatModClient(var27, var28);
         }

         if (var9 <= 0) {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.fill.failed");
         }

         var1.BatModClient(
            OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.Button,
            var9
         );
         BatModClient(var1, this, "commands.fill.success", var9);
      } else {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.fill.outOfWorld");
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      return var2.length > 0 && var2.length <= 3
         ? BatModClient(var2, 0, var3)
         : (
            var2.length > 3 && var2.length <= 6
               ? BatModClient(var2, 3, var3)
               : (
                  var2.length == 7
                     ? BatModClient(
                        var2,
                        c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient
                           .CustomSpinner()
                     )
                     : (
                        var2.length == 9
                           ? BatModClient(
                              var2, "replace", "destroy", "keep", "hollow", "outline"
                           )
                           : (
                              var2.length == 10 && "replace".equals(var2[8])
                                 ? BatModClient(
                                    var2,
                                    c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient
                                       .CustomSpinner()
                                 )
                                 : null
                           )
                     )
               )
         );
   }
}
