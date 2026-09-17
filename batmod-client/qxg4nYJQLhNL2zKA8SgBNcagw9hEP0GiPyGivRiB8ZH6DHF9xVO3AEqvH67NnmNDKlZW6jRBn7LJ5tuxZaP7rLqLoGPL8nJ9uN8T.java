import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class qxg4nYJQLhNL2zKA8SgBNcagw9hEP0GiPyGivRiB8ZH6DHF9xVO3AEqvH67NnmNDKlZW6jRBn7LJ5tuxZaP7rLqLoGPL8nJ9uN8T
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "clone";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.clone.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 9) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.clone.usage");
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
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var5 = BatModClient(
         var1, var2, 6, false
      );
      SovOs95rmCFAA8NMiCIFoZuS752f32zil4WLGX5bueqs1VBNiTnRSRCTZ6BLTvVlzPIiE9lo8nZSxh7NJhYhQZ518SiOdZiI31ED var6 = new SovOs95rmCFAA8NMiCIFoZuS752f32zil4WLGX5bueqs1VBNiTnRSRCTZ6BLTvVlzPIiE9lo8nZSxh7NJhYhQZ518SiOdZiI31ED(
         var3, var4
      );
      SovOs95rmCFAA8NMiCIFoZuS752f32zil4WLGX5bueqs1VBNiTnRSRCTZ6BLTvVlzPIiE9lo8nZSxh7NJhYhQZ518SiOdZiI31ED var7 = new SovOs95rmCFAA8NMiCIFoZuS752f32zil4WLGX5bueqs1VBNiTnRSRCTZ6BLTvVlzPIiE9lo8nZSxh7NJhYhQZ518SiOdZiI31ED(
         var5,
         var5.BatModClient(
            var6.Button()
         )
      );
      int var8 = var6.CustomSpinner()
         * var6.ButtonAction()
         * var6.Spinner();
      if (var8 > 32768) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.clone.tooManyBlocks", var8, 32768
         );
      }

      boolean var9 = false;
      c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var10 = null;
      int var11 = -1;
      if ((var2.length < 11 || !var2[10].equals("force") && !var2[10].equals("move"))
         && var6.BatModClient(var7)) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.clone.noOverlap");
      }

      if (var2.length >= 11 && var2[10].equals("move")) {
         var9 = true;
      }

      if (var6.Button >= 0
         && var6.Spinner < 256
         && var7.Button >= 0
         && var7.Spinner < 256) {
         xDjs4YCZLUvHVJGII20owVT8rXpk3nSu1jLsjzeLtjo7r8lq7RYaHZp1O5oLhmXPyqOR2Eev73tmbyPF4I049uP0lj5ZD5blgUPY var12 = var1.ButtonAction();
         if (var12.BatModClient(var6)
            && var12.BatModClient(var7)) {
            boolean var13 = false;
            if (var2.length >= 10) {
               if (var2[9].equals("masked")) {
                  var13 = true;
               } else if (var2[9].equals("filtered")) {
                  if (var2.length < 12) {
                     throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.clone.usage");
                  }

                  var10 = ProgressBar(var1, var2[11]);
                  if (var2.length >= 13) {
                     var11 = BatModClient(var2[12], 0, 15);
                  }
               }
            }

            ArrayList var14 = Lists.newArrayList();
            ArrayList var15 = Lists.newArrayList();
            ArrayList var16 = Lists.newArrayList();
            LinkedList var17 = Lists.newLinkedList();
            q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var18 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
               var7.BatModClient
                  - var6.BatModClient,
               var7.Button
                  - var6.Button,
               var7.CustomSpinner
                  - var6.CustomSpinner
            );

            for (int var19 = var6.CustomSpinner;
               var19 <= var6.Checkbox;
               var19++
            ) {
               for (int var20 = var6.Button;
                  var20 <= var6.Spinner;
                  var20++
               ) {
                  for (int var21 = var6.BatModClient;
                     var21 <= var6.ButtonAction;
                     var21++
                  ) {
                     q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var22 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                        var21, var20, var19
                     );
                     q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var23 = var22.BatModClient(
                        var18
                     );
                     jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var24 = var12.Button(
                        var22
                     );
                     if ((
                           !var13
                              || var24.CustomSpinner()
                                 != fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
                        )
                        && (
                           var10 == null
                              || var24.CustomSpinner() == var10
                                 && (
                                    var11 < 0
                                       || var24.CustomSpinner()
                                             .CustomSpinner(var24)
                                          == var11
                                 )
                        )) {
                        gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var25 = var12.BatModClient(
                           var22
                        );
                        if (var25 != null) {
                           YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var26 = new YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm();
                           var25.Button(var26);
                           var15.add(
                              new lErofevxkowstopFcZXuRTKsRCQIFH44MnnbfnV9RDdvUVEIsNI9ijVDY9Ndhermc1quPizjp2nqNmOlQMrEHQldSrcpi5j2ZKu(var23, var24, var26)
                           );
                           var17.addLast(var22);
                        } else if (!var24.CustomSpinner()
                              .BatModClient()
                           && !var24.CustomSpinner()
                              .IntegerSpinner()) {
                           var16.add(
                              new lErofevxkowstopFcZXuRTKsRCQIFH44MnnbfnV9RDdvUVEIsNI9ijVDY9Ndhermc1quPizjp2nqNmOlQMrEHQldSrcpi5j2ZKu(
                                 var23, var24, (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)null
                              )
                           );
                           var17.addFirst(var22);
                        } else {
                           var14.add(
                              new lErofevxkowstopFcZXuRTKsRCQIFH44MnnbfnV9RDdvUVEIsNI9ijVDY9Ndhermc1quPizjp2nqNmOlQMrEHQldSrcpi5j2ZKu(
                                 var23, var24, (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)null
                              )
                           );
                           var17.addLast(var22);
                        }
                     }
                  }
               }
            }

            if (var9) {
               for (q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var31 : var17) {
                  gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var34 = var12.BatModClient(
                     var31
                  );
                  if (var34 instanceof r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr) {
                     ((r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr)var34)
                        .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
                  }

                  var12.BatModClient(
                     var31,
                     fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
                        .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                     2
                  );
               }

               for (q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var32 : var17) {
                  var12.BatModClient(
                     var32,
                     fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.BatModClient
                        .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                     3
                  );
               }
            }

            ArrayList var30 = Lists.newArrayList();
            var30.addAll(var14);
            var30.addAll(var15);
            var30.addAll(var16);
            List var33 = Lists.reverse(var30);

            for (lErofevxkowstopFcZXuRTKsRCQIFH44MnnbfnV9RDdvUVEIsNI9ijVDY9Ndhermc1quPizjp2nqNmOlQMrEHQldSrcpi5j2ZKu var40 : var33) {
               gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var45 = var12.BatModClient(
                  var40.BatModClient
               );
               if (var45 instanceof r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr) {
                  ((r1zsJjh5ajbebBfyemSr8KnZYm2Ri167rUFBS8fvYUKTzttPKeSe1WFbpz3ZhKoZpTxLCOnqkaz8AYVu6VzFuJYjvDZFDdjfYGrr)var45)
                     .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
               }

               var12.BatModClient(
                  var40.BatModClient,
                  fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
                     .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
                  2
               );
            }

            var8 = 0;

            for (lErofevxkowstopFcZXuRTKsRCQIFH44MnnbfnV9RDdvUVEIsNI9ijVDY9Ndhermc1quPizjp2nqNmOlQMrEHQldSrcpi5j2ZKu var41 : var30) {
               if (var12.BatModClient(
                  var41.BatModClient,
                  var41.Button,
                  2
               )) {
                  var8++;
               }
            }

            for (lErofevxkowstopFcZXuRTKsRCQIFH44MnnbfnV9RDdvUVEIsNI9ijVDY9Ndhermc1quPizjp2nqNmOlQMrEHQldSrcpi5j2ZKu var42 : var15) {
               gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var46 = var12.BatModClient(
                  var42.BatModClient
               );
               if (var42.CustomSpinner != null && var46 != null) {
                  var42.CustomSpinner
                     .BatModClient(
                        "x",
                        var42.BatModClient
                           .BatModProgressBar()
                     );
                  var42.CustomSpinner
                     .BatModClient(
                        "y",
                        var42.BatModClient
                           .ColorChooser()
                     );
                  var42.CustomSpinner
                     .BatModClient(
                        "z",
                        var42.BatModClient
                           .IntegerSpinner()
                     );
                  var46.BatModClient(
                     var42.CustomSpinner
                  );
                  var46.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
               }

               var12.BatModClient(
                  var42.BatModClient,
                  var42.Button,
                  2
               );
            }

            for (lErofevxkowstopFcZXuRTKsRCQIFH44MnnbfnV9RDdvUVEIsNI9ijVDY9Ndhermc1quPizjp2nqNmOlQMrEHQldSrcpi5j2ZKu var43 : var33) {
               var12.BatModClient(
                  var43.BatModClient,
                  var43.Button
                     .CustomSpinner()
               );
            }

            List var39 = var12.Button(var6, false);
            if (var39 != null) {
               for (c5yjVoYlQQ2rPK2XYckKiKNAaBdIPJ7B2WWxur0KUr3NMhMScmaRIHc1OAnmAJ1NYGzVEtEsax72BjPSab83VALHft6aNBSVhQgC var47 : var39) {
                  if (var6.BatModClient(
                     var47.BatModClient
                  )) {
                     q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var48 = var47.BatModClient
                        .BatModClient(var18);
                     var12.Button(
                        var48,
                        var47.BatModClient(),
                        (int)(
                           var47.Button
                              - var12.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
                                 .Checkbox()
                        ),
                        var47.CustomSpinner
                     );
                  }
               }
            }

            if (var8 <= 0) {
               throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.clone.failed");
            }

            var1.BatModClient(
               OBpoHjRiUW8lxrPt7SzpCpBNzVlozGWh03CmP9dARZGbrmJRcYJYPGL7wlCRwODnnJ5EXIfVkA2lAbB0KacsuKDEv1t896Eo6YUE.Button,
               var8
            );
            BatModClient(var1, this, "commands.clone.success", var8);
         } else {
            throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.clone.outOfWorld");
         }
      } else {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO("commands.clone.outOfWorld");
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
                  var2.length > 6 && var2.length <= 9
                     ? BatModClient(var2, 6, var3)
                     : (
                        var2.length == 10
                           ? BatModClient(
                              var2, "replace", "masked", "filtered"
                           )
                           : (
                              var2.length == 11
                                 ? BatModClient(
                                    var2, "normal", "force", "move"
                                 )
                                 : (
                                    var2.length == 12 && "filtered".equals(var2[9])
                                       ? BatModClient(
                                          var2,
                                          c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient
                                             .CustomSpinner()
                                       )
                                       : null
                                 )
                           )
                     )
               )
         );
   }
}
