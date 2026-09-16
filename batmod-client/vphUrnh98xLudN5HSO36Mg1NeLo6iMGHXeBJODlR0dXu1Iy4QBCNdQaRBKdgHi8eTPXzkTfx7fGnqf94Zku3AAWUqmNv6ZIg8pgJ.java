import java.util.Stack;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vphUrnh98xLudN5HSO36Mg1NeLo6iMGHXeBJODlR0dXu1Iy4QBCNdQaRBKdgHi8eTPXzkTfx7fGnqf94Zku3AAWUqmNv6ZIg8pgJ {
   private static final Logger Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = LogManager.getLogger();
   private static final Pattern BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = Pattern.compile(
      "\\[[-+\\d|,\\s]+\\]"
   );

   public static YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0
   ) {
      var0 = var0.trim();
      if (!var0.startsWith("{")) {
         throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
            "Invalid tag encountered, expected '{' as first char."
         );
      } else if (BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0) != 1) {
         throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
            "Encountered multiple top tags, only one expected"
         );
      } else {
         return (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "tag", var0
            )
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
      }
   }

   static int BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var0) {
      int var1 = 0;
      boolean var2 = false;
      Stack var3 = new Stack();

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == '"') {
            if (BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var4)) {
               if (!var2) {
                  throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a("Illegal use of \\\": " + var0);
               }
            } else {
               var2 = !var2;
            }
         } else if (!var2) {
            if (var5 != '{' && var5 != '[') {
               if (var5 == '}' && (var3.isEmpty() || (Character)var3.pop() != '{')) {
                  throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
                     "Unbalanced curly brackets {}: " + var0
                  );
               }

               if (var5 == ']' && (var3.isEmpty() || (Character)var3.pop() != '[')) {
                  throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
                     "Unbalanced square brackets []: " + var0
                  );
               }
            } else {
               if (var3.isEmpty()) {
                  var1++;
               }

               var3.push(var5);
            }
         }
      }

      if (var2) {
         throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a("Unbalanced quotation: " + var0);
      }

      if (!var3.isEmpty()) {
         throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a("Unbalanced brackets: " + var0);
      }

      if (var1 == 0 && !var0.isEmpty()) {
         var1 = 1;
      }

      return var1;
   }

   static h591mukmiLr0vJDKnnXtNoDvOBDLG8uMU7FdnK6kMpQ2SvXfMCHeD5FbacfP3NzAtSAQvZlMSmIl5E7OLWgKHmpMSplYTcSbD1uk Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String... var0
   ) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0[0], var0[1]);
   }

   static h591mukmiLr0vJDKnnXtNoDvOBDLG8uMU7FdnK6kMpQ2SvXfMCHeD5FbacfP3NzAtSAQvZlMSmIl5E7OLWgKHmpMSplYTcSbD1uk Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0, String var1
   ) {
      var1 = var1.trim();
      if (var1.startsWith("{")) {
         var1 = var1.substring(1, var1.length() - 1);
         ujFw2IfReA2lM57IxHc9MaSlj019qanLO86vogx3h3cS2zFQxpuBLR5LuwicMfJD9BlwfnlboegoOgheP1zzQDeysQ6pFKJdyUR9 var8 = new ujFw2IfReA2lM57IxHc9MaSlj019qanLO86vogx3h3cS2zFQxpuBLR5LuwicMfJD9BlwfnlboegoOgheP1zzQDeysQ6pFKJdyUR9(
            var0
         );

         while (var1.length() > 0) {
            String var9 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1, true);
            if (var9.length() > 0) {
               boolean var11 = false;
               var8.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
                  .add(Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var9, var11));
            }

            if (var1.length() < var9.length() + 1) {
               break;
            }

            char var12 = var1.charAt(var9.length());
            if (var12 != ',' && var12 != '{' && var12 != '}' && var12 != '[' && var12 != ']') {
               throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
                  "Unexpected token '" + var12 + "' at: " + var1.substring(var9.length())
               );
            }

            var1 = var1.substring(var9.length() + 1);
         }

         return var8;
      } else if (var1.startsWith("[")
         && !BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.matcher(var1).matches()) {
         var1 = var1.substring(1, var1.length() - 1);
         iS4VeHjNxgojg6xWYNCbUAOtf64dS4RnjpCMtm1SjVcSDty1P9EYHNwPjsYicSHPCpRfSsQnLNbgiyCbneOBx8hmITaeU8PltYXU var2 = new iS4VeHjNxgojg6xWYNCbUAOtf64dS4RnjpCMtm1SjVcSDty1P9EYHNwPjsYicSHPCpRfSsQnLNbgiyCbneOBx8hmITaeU8PltYXU(
            var0
         );

         while (var1.length() > 0) {
            String var3 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1, false);
            if (var3.length() > 0) {
               boolean var4 = true;
               var2.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
                  .add(Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3, var4));
            }

            if (var1.length() < var3.length() + 1) {
               break;
            }

            char var10 = var1.charAt(var3.length());
            if (var10 != ',' && var10 != '{' && var10 != '}' && var10 != '[' && var10 != ']') {
               throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
                  "Unexpected token '" + var10 + "' at: " + var1.substring(var3.length())
               );
            }

            var1 = var1.substring(var3.length() + 1);
         }

         return var2;
      } else {
         return new uKMbuZu5Qvw7zB4bHTUlPgETwehSlfRtfHAg14CXmbEZ0iZz0ZDEF63WfLRiVn236Tu47eFjfmeZG5UrRbvENXmvm5G1j9d4g2gW(var0, var1);
      }
   }

   private static h591mukmiLr0vJDKnnXtNoDvOBDLG8uMU7FdnK6kMpQ2SvXfMCHeD5FbacfP3NzAtSAQvZlMSmIl5E7OLWgKHmpMSplYTcSbD1uk Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0, boolean var1
   ) {
      String var2 = vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var0, var1);
      String var3 = PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var0, var1);
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2, var3);
   }

   private static String BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var0, boolean var1) {
      int var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, ':');
      int var3 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, ',');
      if (var1) {
         if (var2 == -1) {
            throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
               "Unable to locate name/value separator for string: " + var0
            );
         }

         if (var3 != -1 && var3 < var2) {
            throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a("Name error at: " + var0);
         }
      } else if (var2 == -1 || var2 > var3) {
         var2 = -1;
      }

      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var2);
   }

   private static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0, int var1) {
      Stack var2 = new Stack();
      int var3 = var1 + 1;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      int var7 = 0;

      while (var3 < var0.length()) {
         char var8 = var0.charAt(var3);
         if (var8 == '"') {
            if (BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var3)) {
               if (!var4) {
                  throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a("Illegal use of \\\": " + var0);
               }
            } else {
               var4 = !var4;
               if (var4 && !var6) {
                  var5 = true;
               }

               if (!var4) {
                  var7 = var3;
               }
            }
         } else if (!var4) {
            if (var8 != '{' && var8 != '[') {
               if (var8 == '}' && (var2.isEmpty() || (Character)var2.pop() != '{')) {
                  throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
                     "Unbalanced curly brackets {}: " + var0
                  );
               }

               if (var8 == ']' && (var2.isEmpty() || (Character)var2.pop() != '[')) {
                  throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
                     "Unbalanced square brackets []: " + var0
                  );
               }

               if (var8 == ',' && var2.isEmpty()) {
                  return var0.substring(0, var3);
               }
            } else {
               var2.push(var8);
            }
         }

         if (!Character.isWhitespace(var8)) {
            if (!var4 && var5 && var7 != var3) {
               return var0.substring(0, var7 + 1);
            }

            var6 = true;
         }

         var3++;
      }

      return var0.substring(0, var3);
   }

   private static String vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(String var0, boolean var1) {
      if (var1) {
         var0 = var0.trim();
         if (var0.startsWith("{") || var0.startsWith("[")) {
            return "";
         }
      }

      int var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, ':');
      if (var2 != -1) {
         return var0.substring(0, var2).trim();
      } else if (var1) {
         return "";
      } else {
         throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
            "Unable to locate name/value separator for string: " + var0
         );
      }
   }

   private static String PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(String var0, boolean var1) {
      if (var1) {
         var0 = var0.trim();
         if (var0.startsWith("{") || var0.startsWith("[")) {
            return var0;
         }
      }

      int var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, ':');
      if (var2 != -1) {
         return var0.substring(var2 + 1).trim();
      } else if (var1) {
         return var0;
      } else {
         throw new HZtPxJrE3tKmOInnCUZK402OcWQWFuA0NZ7h8121Fc28S0nohPsJXwnJCBUuu5KLWL0pZY44OdjiThLKL4KVW3fY32YFUApRcZ7a(
            "Unable to locate name/value separator for string: " + var0
         );
      }
   }

   private static int Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0, char var1) {
      int var2 = 0;
      boolean var3 = true;

      while (var2 < var0.length()) {
         char var4 = var0.charAt(var2);
         if (var4 == '"') {
            if (!BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var2)) {
               var3 = !var3;
            }
         } else if (var3) {
            if (var4 == var1) {
               return var2;
            }

            if (var4 == '{' || var4 == '[') {
               return -1;
            }
         }

         var2++;
      }

      return -1;
   }

   private static boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var0, int var1) {
      return var1 > 0
         && var0.charAt(var1 - 1) == '\\'
         && !BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var1 - 1);
   }
}
