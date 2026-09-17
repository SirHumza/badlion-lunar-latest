import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class qxyXAy0SxWOmogRLX25jxveNLnGcu1xgDoCUVda6FWn31r3t36iUd2iT5kLCnFArk2RluMUNdnDmbp0xHftVlqy4rbVTHydVNnVG
   extends uouVmgxtX0Syn0M29kTkSl18odvMGAdh8WOw2IkpLL3G9nMuTnQdbPlAL5oUip5AYEaLTY0dHWdkJqh0hxtlEBygX4TmsbVCMCWB {
   @Override
   public String CustomSpinner() {
      return "achievement";
   }

   @Override
   public int BatModClient() {
      return 2;
   }

   @Override
   public String CustomSpinner(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1
   ) {
      return "commands.achievement.usage";
   }

   @Override
   public void BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1, String[] var2
   ) {
      if (var2.length < 2) {
         throw new m3HVDEgP6dYA382GFteMKpaMG7yUVYEpeBIGa3zbEv4DkMX3EussLqDIoVRAWefGOelpwaGnFy2F6oVItpSoWKX268BmmDfUP35k("commands.achievement.usage");
      }

      nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en var3 = hWMBbe1tOjEiAImIBH6FPljeGzgFkqwimOGmEMw740rfhtpEXwJTHpMWqJPXXtJXwCgg1q0TFBxFrqTzIEHfI11cHALyYAP79erU.BatModClient(
         var2[1]
      );
      if (var3 == null && !var2[1].equals("*")) {
         throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
            "commands.achievement.unknownAchievement", var2[1]
         );
      }

      egrlsF9YBDE494kTMhcXRiqL0F080ROxFyXFfM4tZeSuBymTYidxgV9U46ETOgmOl6o7fcTjvJJZYFHDlzMo8NBn47mncTnDrmRS var4 = var2.length >= 3
         ? BatModClient(var1, var2[2])
         : Button(var1);
      boolean var5 = var2[0].equalsIgnoreCase("give");
      boolean var6 = var2[0].equalsIgnoreCase("take");
      if (var5 || var6) {
         if (var3 == null) {
            if (var5) {
               for (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var8 : chaQVajAXz8QxkwU9UYTOZTVScQaY5vp6ym1bDnZcAv3Bpy0hiusINj6IO4owYaYX9alNh8FxCIJZsJqAI58MstYOWnZk5sqAfi.Spinner) {
                  var4.BatModClient(var8);
               }

               BatModClient(
                  var1, this, "commands.achievement.give.success.all", var4.C_()
               );
            } else if (var6) {
               for (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var16 : Lists.reverse(
                  chaQVajAXz8QxkwU9UYTOZTVScQaY5vp6ym1bDnZcAv3Bpy0hiusINj6IO4owYaYX9alNh8FxCIJZsJqAI58MstYOWnZk5sqAfi.Spinner
               )) {
                  var4.Button(var16);
               }

               BatModClient(
                  var1, this, "commands.achievement.take.success.all", var4.C_()
               );
            }
         } else {
            if (var3 instanceof DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F) {
               DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var15 = (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F)var3;
               if (var5) {
                  if (var4.NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9()
                     .BatModClient(var15)) {
                     throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                        "commands.achievement.alreadyHave",
                        var4.C_(),
                        var3.IntegerSpinner()
                     );
                  }

                  ArrayList var18 = Lists.newArrayList();

                  while (
                     var15.CustomSpinner != null
                        && !var4.NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9()
                           .BatModClient(
                              var15.CustomSpinner
                           )
                  ) {
                     var18.add(var15.CustomSpinner);
                     var15 = var15.CustomSpinner;
                  }

                  for (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var21 : Lists.reverse(var18)) {
                     var4.BatModClient(var21);
                  }
               } else if (var6) {
                  if (!var4.NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9()
                     .BatModClient(var15)) {
                     throw new idU6cKQRpAnHtyqFJvIb8hgPBjjUUYm6Ct9OSY6MQwB6XkEuP0uiQvo9DXNj2Csz9ZA9mb0z6YBVCZ72LpS1AOo81K4Sr2SCh9XO(
                        "commands.achievement.dontHave",
                        var4.C_(),
                        var3.IntegerSpinner()
                     );
                  }

                  ArrayList var17 = Lists.newArrayList(
                     Iterators.filter(
                        chaQVajAXz8QxkwU9UYTOZTVScQaY5vp6ym1bDnZcAv3Bpy0hiusINj6IO4owYaYX9alNh8FxCIJZsJqAI58MstYOWnZk5sqAfi.Spinner
                           .iterator(),
                        new QcI92KBKxtjJcbleLVOLTfuYDLVSzctIo7y2Z0mXOpfLaNjiZnLYwvW7IJRp7oQlyAV0ZIA8QxCpNGyPkC8hTw5RHnqv4LkqSNhQ(this, var4, var3)
                     )
                  );
                  ArrayList var9 = Lists.newArrayList(var17);

                  for (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var11 : var17) {
                     DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var12 = var11;
                     boolean var13 = false;

                     while (var12 != null) {
                        if (var12 == var3) {
                           var13 = true;
                        }

                        var12 = var12.CustomSpinner;
                     }

                     if (!var13) {
                        for (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var23 = var11;
                           var23 != null;
                           var23 = var23.CustomSpinner
                        ) {
                           var9.remove(var11);
                        }
                     }
                  }

                  for (DsQxVxAAKK7iQ72jkUmkc7zLEC04c6KtLJxjPyaBlexbxVF18hauCwOF0w3nlnRB5fVtGkv2pJfaQpEjKixi81ci7kPd4Ov2Q7F var22 : var9) {
                     var4.Button(var22);
                  }
               }
            }

            if (var5) {
               var4.BatModClient(var3);
               BatModClient(
                  var1,
                  this,
                  "commands.achievement.give.success.one",
                  var4.C_(),
                  var3.IntegerSpinner()
               );
            } else if (var6) {
               var4.Button(var3);
               BatModClient(
                  var1,
                  this,
                  "commands.achievement.take.success.one",
                  var3.IntegerSpinner(),
                  var4.C_()
               );
            }
         }
      }
   }

   @Override
   public List BatModClient(
      e1gLgW1QJxYgKHVbl2xMpy3l7yE24V36BHyMUCmatojNeIPBFolTbJQW5DlheBrFfW008TcENhMfcHnyoH0VFMoSrDBhmeElDRC var1,
      String[] var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3
   ) {
      if (var2.length == 1) {
         return BatModClient(var2, "give", "take");
      }

      if (var2.length != 2) {
         return var2.length == 3
            ? BatModClient(
               var2,
               TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ()
                  .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
            )
            : null;
      }

      ArrayList var4 = Lists.newArrayList();

      for (nZD97IYJgoCkqbY3eqh9DzbiIdeSrgaDt8d60eJWRNZ4ABlWrdayktqdGI2Ixo40gAJoaj4h3ajzpqk3iGm8gJ5iuMiRLLpgY3en var6 : hWMBbe1tOjEiAImIBH6FPljeGzgFkqwimOGmEMw740rfhtpEXwJTHpMWqJPXXtJXwCgg1q0TFBxFrqTzIEHfI11cHALyYAP79erU.Button) {
         var4.add(var6.Spinner);
      }

      return BatModClient(var2, var4);
   }

   @Override
   public boolean Button(String[] var1, int var2) {
      return var2 == 2;
   }
}
