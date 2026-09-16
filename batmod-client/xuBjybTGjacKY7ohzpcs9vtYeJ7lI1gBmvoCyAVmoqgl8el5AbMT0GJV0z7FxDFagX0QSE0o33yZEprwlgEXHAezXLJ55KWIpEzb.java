import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

class xuBjybTGjacKY7ohzpcs9vtYeJ7lI1gBmvoCyAVmoqgl8el5AbMT0GJV0z7FxDFagX0QSE0o33yZEprwlgEXHAezXLJ55KWIpEzb implements JsonDeserializer {
   public UtvNWIVlBANhYPlWDcDzEth3PZjwnCaD6HnI0I0Mi25TdZi1CVUkrN5h03hcGhtDl8FuKxUaRQnvtpN0A4nNUm6EsOM8QpVxMZ0m Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      float[] var5 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var4);
      int var6 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4);
      return new UtvNWIVlBANhYPlWDcDzEth3PZjwnCaD6HnI0I0Mi25TdZi1CVUkrN5h03hcGhtDl8FuKxUaRQnvtpN0A4nNUm6EsOM8QpVxMZ0m(var5, var6);
   }

   protected int Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(JsonObject var1) {
      int var2 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, "rotation", 0
      );
      if (var2 >= 0 && var2 % 90 == 0 && var2 / 90 <= 3) {
         return var2;
      } else {
         throw new JsonParseException("Invalid rotation " + var2 + " found, only 0/90/180/270 allowed");
      }
   }

   private float[] BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(JsonObject var1) {
      if (!var1.has("uv")) {
         return null;
      }

      JsonArray var2 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x(
         var1, "uv"
      );
      if (var2.size() != 4) {
         throw new JsonParseException("Expected 4 uv values, found: " + var2.size());
      }

      float[] var3 = new float[4];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var2.get(var4), "uv[" + var4 + "]"
         );
      }

      return var3;
   }
}
