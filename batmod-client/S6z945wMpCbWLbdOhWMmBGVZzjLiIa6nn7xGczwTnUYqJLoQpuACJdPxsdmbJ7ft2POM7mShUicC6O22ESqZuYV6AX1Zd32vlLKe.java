import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public class S6z945wMpCbWLbdOhWMmBGVZzjLiIa6nn7xGczwTnUYqJLoQpuACJdPxsdmbJ7ft2POM7mShUicC6O22ESqZuYV6AX1Zd32vlLKe
   extends edUG7FYUKILmr1KaUjgCEQPb7AdbBVrk2aebEAHYLT8lzdGbdwX2S9ElQ4QzVLFdvod9EYPnPFD0f0arUeowYyrUnEXvjOgnnMi5
   implements JsonSerializer {
   public irN4eiey9xRK8jG07M1zcbZeL1UxE8HFmEFUaXt6z8iLgJrw9uGrF0umVtWLVCRHs9Xgx54Gv8tpIS2WbY9JzUgg9DoY1NHR6W06 Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      ArrayList var4 = Lists.newArrayList();
      JsonObject var5 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
         var1, "metadata section"
      );
      int var6 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var5, "frametime", 1
      );
      if (var6 != 1) {
         Validate.inclusiveBetween(1L, 2147483647L, var6, "Invalid default frame time");
      }

      if (var5.has("frames")) {
         try {
            JsonArray var7 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x(
               var5, "frames"
            );

            for (int var8 = 0; var8 < var7.size(); var8++) {
               JsonElement var9 = var7.get(var8);
               BTSbEwE9t8gnupizw5D63HhrwpSmWWJd2dCXfPBCqlg0V6qIbuR5mRcdx2NWT8aDyiIfZD8HkLOoLlJvJIwIdbasCstT4hliYPTa var10 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var8, var9
               );
               if (var10 != null) {
                  var4.add(var10);
               }
            }
         } catch (ClassCastException var11) {
            throw new JsonParseException("Invalid animation->frames: expected array, was " + var5.get("frames"), var11);
         }
      }

      int var12 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var5, "width", -1
      );
      int var13 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var5, "height", -1
      );
      if (var12 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, var12, "Invalid width");
      }

      if (var13 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, var13, "Invalid height");
      }

      boolean var14 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var5, "interpolate", false
      );
      return new irN4eiey9xRK8jG07M1zcbZeL1UxE8HFmEFUaXt6z8iLgJrw9uGrF0umVtWLVCRHs9Xgx54Gv8tpIS2WbY9JzUgg9DoY1NHR6W06(var4, var12, var13, var6, var14);
   }

   private BTSbEwE9t8gnupizw5D63HhrwpSmWWJd2dCXfPBCqlg0V6qIbuR5mRcdx2NWT8aDyiIfZD8HkLOoLlJvJIwIdbasCstT4hliYPTa Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      int var1, JsonElement var2
   ) {
      if (var2.isJsonPrimitive()) {
         return new BTSbEwE9t8gnupizw5D63HhrwpSmWWJd2dCXfPBCqlg0V6qIbuR5mRcdx2NWT8aDyiIfZD8HkLOoLlJvJIwIdbasCstT4hliYPTa(
            QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
               var2, "frames[" + var1 + "]"
            )
         );
      }

      if (var2.isJsonObject()) {
         JsonObject var3 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
            var2, "frames[" + var1 + "]"
         );
         int var4 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var3, "time", -1
         );
         if (var3.has("time")) {
            Validate.inclusiveBetween(1L, 2147483647L, var4, "Invalid frame time");
         }

         int var5 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9(
            var3, "index"
         );
         Validate.inclusiveBetween(0L, 2147483647L, var5, "Invalid frame index");
         return new BTSbEwE9t8gnupizw5D63HhrwpSmWWJd2dCXfPBCqlg0V6qIbuR5mRcdx2NWT8aDyiIfZD8HkLOoLlJvJIwIdbasCstT4hliYPTa(var5, var4);
      } else {
         return null;
      }
   }

   public JsonElement Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      irN4eiey9xRK8jG07M1zcbZeL1UxE8HFmEFUaXt6z8iLgJrw9uGrF0umVtWLVCRHs9Xgx54Gv8tpIS2WbY9JzUgg9DoY1NHR6W06 var1, Type var2, JsonSerializationContext var3
   ) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("frametime", var1.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u());
      if (var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() != -1) {
         var4.addProperty("width", var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW());
      }

      if (var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() != -1) {
         var4.addProperty("height", var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I());
      }

      if (var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() > 0) {
         JsonArray var5 = new JsonArray();

         for (int var6 = 0; var6 < var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(); var6++) {
            if (var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var6)) {
               JsonObject var7 = new JsonObject();
               var7.addProperty("index", var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var6));
               var7.addProperty("time", var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var6));
               var5.add(var7);
            } else {
               var5.add(new JsonPrimitive(var1.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var6)));
            }
         }

         var4.add("frames", var5);
      }

      return var4;
   }

   @Override
   public String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      return "animation";
   }
}
