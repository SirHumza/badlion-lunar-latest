import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QN3V7PxQQGv6zH8IQVJhLfqCsSiLEOEBXeExeYcOLzEklZndDlZFVHTM1zxxH9TxX14xJumYIuB6pqUD4Sdf1qwiS4NT41jcnaR7 {
   public static Field Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Class var0, Class var1) {
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

   public static Field[] BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Class var0, Class var1) {
      try {
         Field[] var2 = var0.getDeclaredFields();
         return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2, var1);
      } catch (Exception var3) {
         return null;
      }
   }

   public static Field[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Field[] var0, Class var1) {
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

   public static Field[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
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
         return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7, var2);
      } catch (Exception var8) {
         return null;
      }
   }

   public static Field[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
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

   public static Field Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Class var0, Class var1, int var2) {
      Field[] var3 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var1);
      return var2 >= 0 && var2 < var3.length ? var3[var2] : null;
   }

   public static Field Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Class var0, Field var1, Class var2, int var3
   ) {
      Field[] var4 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var2);
      return var3 >= 0 && var3 < var4.length ? var4[var3] : null;
   }

   public static Object Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Object var0, Class var1, Class var2
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var3 = vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
         var1, var2
      );
      return var3 == null
         ? null
         : (
            !var3.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
               ? null
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var0, var3
               )
         );
   }

   public static Object Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Object var0, Class var1, Class var2, int var3
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var4 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var1, var2, var3
      );
      return var4 == null
         ? null
         : (
            !var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
               ? null
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var0, var4
               )
         );
   }

   public static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Object var0, Class var1, Class var2, Object var3
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var4 = vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
         var1, var2
      );
      return var4 == null
         ? false
         : (
            !var4.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
               ? false
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var0, var4, var3
               )
         );
   }

   public static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Object var0, Class var1, Class var2, int var3, Object var4
   ) {
      c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF var5 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var1, var2, var3
      );
      return var5 == null
         ? false
         : (
            !var5.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
               ? false
               : uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var0, var5, var4
               )
         );
   }

   public static c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      Class var0, Class var1
   ) {
      Field var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1);
      if (var2 == null) {
         return null;
      }

      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var3 = new o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL(
         var0
      );
      return new c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF(var3, var2.getName());
   }

   public static c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      Class var0, Class var1, int var2
   ) {
      Field var3 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var2);
      if (var3 == null) {
         return null;
      }

      o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL var4 = new o5lWqoPw32K25KX4vBEcucWIF0JuTjrbVioGBuThcalnQpJ5BurjKTncCeCTw7psz6FCJUL7AdAaR2MWzrasBfquWOQIgSNxJtL(
         var0
      );
      return new c9L0vWcxcLRcrdzbcSafkClHzdfzlub3c0AYlQRblvILjalFTbQaUypTl2XgiNfrpjUtCMhhWq42XiYwsTWqKBBEdohUnxh9MCQF(var4, var3.getName());
   }
}
