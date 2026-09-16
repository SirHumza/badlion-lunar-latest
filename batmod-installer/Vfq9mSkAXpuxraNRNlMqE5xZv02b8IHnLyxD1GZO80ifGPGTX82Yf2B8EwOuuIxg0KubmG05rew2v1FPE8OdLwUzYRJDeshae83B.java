import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B {
   public static DateFormat Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(int var0) {
      return new SimpleDateFormat(BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0), Locale.US);
   }

   public static DateFormat Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(int var0, int var1) {
      String var2 = vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var0)
         + " "
         + PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1);
      return new SimpleDateFormat(var2, Locale.US);
   }

   private static String BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(int var0) {
      switch (var0) {
         case 0:
            return "EEEE, MMMM d, y";
         case 1:
            return "MMMM d, y";
         case 2:
            return "MMM d, y";
         case 3:
            return "M/d/yy";
         default:
            throw new IllegalArgumentException("Unknown DateFormat style: " + var0);
      }
   }

   private static String vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(int var0) {
      switch (var0) {
         case 0:
            return "EEEE, MMMM d, yyyy";
         case 1:
            return "MMMM d, yyyy";
         case 2:
            return "MMM d, yyyy";
         case 3:
            return "M/d/yy";
         default:
            throw new IllegalArgumentException("Unknown DateFormat style: " + var0);
      }
   }

   private static String PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(int var0) {
      switch (var0) {
         case 0:
         case 1:
            return "h:mm:ss a z";
         case 2:
            return "h:mm:ss a";
         case 3:
            return "h:mm a";
         default:
            throw new IllegalArgumentException("Unknown DateFormat style: " + var0);
      }
   }
}
