import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class OS3eRJ3PKxLxTrCbT63jmZNdxGqpHtb4WQ9SqlnWJkNDnwDWL6HY8wFrEkfV7jjWBo6gmkQf9BKBqlGb0PDzCY5OVwX0EIbSFYzI {
   public static float Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonObject var0, String var1, float var2
   ) {
      JsonElement var3 = var0.get(var1);
      return var3 == null ? var2 : var3.getAsFloat();
   }

   public static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonObject var0, String var1, boolean var2
   ) {
      JsonElement var3 = var0.get(var1);
      return var3 == null ? var2 : var3.getAsBoolean();
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(JsonObject var0, String var1) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, (String)null);
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonObject var0, String var1, String var2
   ) {
      JsonElement var3 = var0.get(var1);
      return var3 == null ? var2 : var3.getAsString();
   }

   public static float[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(JsonElement var0, int var1) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, (float[])null);
   }

   public static float[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var0, int var1, float[] var2
   ) {
      if (var0 == null) {
         return var2;
      }

      JsonArray var3 = var0.getAsJsonArray();
      if (var3.size() != var1) {
         throw new JsonParseException("Wrong array length: " + var3.size() + ", should be: " + var1 + ", array: " + var3);
      }

      float[] var4 = new float[var3.size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var3.get(var5).getAsFloat();
      }

      return var4;
   }

   public static int[] BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(JsonElement var0, int var1) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, (int[])null);
   }

   public static int[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var0, int var1, int[] var2
   ) {
      if (var0 == null) {
         return var2;
      }

      JsonArray var3 = var0.getAsJsonArray();
      if (var3.size() != var1) {
         throw new JsonParseException("Wrong array length: " + var3.size() + ", should be: " + var1 + ", array: " + var3);
      }

      int[] var4 = new int[var3.size()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var3.get(var5).getAsInt();
      }

      return var4;
   }
}
