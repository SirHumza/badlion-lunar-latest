import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QN3V7PxQQGv6zH8IQVJhLfqCsSiLEOEBXeExeYcOLzEklZndDlZFVHTM1zxxH9TxX14xJumYIuB6pqUD4Sdf1qwiS4NT41jcnaR7 {
   public static Field BatModClient(Class var0, Class var1) {
      try {
         Field[] var2 = var0.getDeclaredFields();

         for (int var3 = 0; var3 < var2.length; var3++) {
            Field var4 = var2[var3];
            if (var4.getType() == var1) {
               var4.setAccessible(true);
               return var4;
            }
         }

         return null;
      } catch (Exception var5) {
         return null;
      }
   }

   public static Field[] Button(Class var0, Class var1) {
      try {
         Field[] var2 = var0.getDeclaredFields();
         return BatModClient(var2, var1);
      } catch (Exception var3) {
         return null;
      }
   }

   public static Field[] BatModClient(Field[] var0, Class var1) {
      try {
         ArrayList var2 = new ArrayList();

         for (int var3 = 0; var3 < var0.length; var3++) {
            Field var4 = var0[var3];
            if (var4.getType() == var1) {
               var4.setAccessible(true);
               var2.add(var4);
            }
         }

         return var2.toArray(new Field[var2.size()]);
      } catch (Exception var5) {
         return null;
      }
   }

   public static Field[] BatModClient(
      Class var0, Field var1, Class var2
   ) {
      try {
         Field[] var3 = var0.getDeclaredFields();
         List var4 = Arrays.asList(var3);
         int var5 = var4.indexOf(var1);
         if (var5 < 0) {
            return new Field[0];
         }

         List var6 = var4.subList(var5 + 1, var4.size());
         Field[] var7 = var6.toArray(new Field[var6.size()]);
         return BatModClient(var7, var2);
      } catch (Exception var8) {
         return null;
      }
   }

   public static Field[] BatModClient(
      Object var0, Field[] var1, Class var2, Object var3
   ) {
      try {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var1.length; var5++) {
            Field var6 = var1[var5];
            if (var6.getType() == var2) {
               boolean var7 = Modifier.isStatic(var6.getModifiers());
               if ((var0 != null || var7) && (var0 == null || !var7)) {
                  var6.setAccessible(true);
                  Object var8 = var6.get(var0);
                  if (var8 == var3) {
                     var4.add(var6);
                  } else if (var8 != null && var3 != null && var8.equals(var3)) {
                     var4.add(var6);
                  }
               }
            }
         }

         return var4.toArray(new Field[var4.size()]);
      } catch (Exception var9) {
         return null;
      }
   }

   public static Field BatModClient(Class var0, Class var1, int var2) {
      Field[] var3 = Button(var0, var1);
      return var2 >= 0 && var2 < var3.length ? var3[var2] : null;
   }

   public static Field BatModClient(
      Class var0, Field var1, Class var2, int var3
   ) {
      Field[] var4 = BatModClient(var0, var1, var2);
      return var3 >= 0 && var3 < var4.length ? var4[var3] : null;
   }

   public static Object BatModClient(
      Object var0, Class var1, Class var2
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var3 = CustomSpinner(
         var1, var2
      );
      return var3 == null
         ? null
         : (
            !var3.CustomSpinner()
               ? null
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
                  var0, var3
               )
         );
   }

   public static Object BatModClient(
      Object var0, Class var1, Class var2, int var3
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var4 = Button(
         var1, var2, var3
      );
      return var4 == null
         ? null
         : (
            !var4.CustomSpinner()
               ? null
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
                  var0, var4
               )
         );
   }

   public static boolean BatModClient(
      Object var0, Class var1, Class var2, Object var3
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var4 = CustomSpinner(
         var1, var2
      );
      return var4 == null
         ? false
         : (
            !var4.CustomSpinner()
               ? false
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
                  var0, var4, var3
               )
         );
   }

   public static boolean BatModClient(
      Object var0, Class var1, Class var2, int var3, Object var4
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var5 = Button(
         var1, var2, var3
      );
      return var5 == null
         ? false
         : (
            !var5.CustomSpinner()
               ? false
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
                  var0, var5, var4
               )
         );
   }

   public static c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF CustomSpinner(
      Class var0, Class var1
   ) {
      Field var2 = BatModClient(var0, var1);
      if (var2 == null) {
         return null;
      }

      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var3 = new o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL(
         var0
      );
      return new c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF(var3, var2.getName());
   }

   public static c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF Button(
      Class var0, Class var1, int var2
   ) {
      Field var3 = BatModClient(var0, var1, var2);
      if (var3 == null) {
         return null;
      }

      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var4 = new o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL(
         var0
      );
      return new c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF(var4, var3.getName());
   }
}
