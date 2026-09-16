import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.util.vector.Vector3f;

class smGjFj4gspruBbd6sF8W023zzUKdnPs0LJOprpF3gjdgR6Vbfw1t9PDD5zkx7x6eJOK6ktEPFAf5JGgGzrDgXE3CiXRsbKQQmExE implements JsonDeserializer {
   public aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      Vector3f var5 = this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var4);
      Vector3f var6 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var4);
      J7IQIDkJBXDmohBfxy4U1H2qA5ond7mZMkgbkJwUgi44g83SruSZFpdl4U63pLROuvdB8tA8Gji4lbm7QsQrZIMY3X4khPsPwsKz var7 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var4
      );
      Map var8 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3, var4);
      if (var4.has("shade")
         && !QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var4, "shade"
         )) {
         throw new JsonParseException("Expected shade to be a Boolean");
      }

      boolean var9 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var4, "shade", true
      );
      return new aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM(var5, var6, var8, var7, var9);
   }

   private J7IQIDkJBXDmohBfxy4U1H2qA5ond7mZMkgbkJwUgi44g83SruSZFpdl4U63pLROuvdB8tA8Gji4lbm7QsQrZIMY3X4khPsPwsKz Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonObject var1
   ) {
      J7IQIDkJBXDmohBfxy4U1H2qA5ond7mZMkgbkJwUgi44g83SruSZFpdl4U63pLROuvdB8tA8Gji4lbm7QsQrZIMY3X4khPsPwsKz var2 = null;
      if (var1.has("rotation")) {
         JsonObject var3 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ(
            var1, "rotation"
         );
         Vector3f var4 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3, "origin");
         var4.scale(0.0625F);
         VOV84XzuMWrwpvkwu5LJHXBhpVvfHxiUkItS93saq12VjZEG0se88QHdeCp4DwciHolhZQ2v0URvP1bziGTpNQYa1K11aNqHenW var5 = this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var3
         );
         float var6 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var3);
         boolean var7 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var3, "rescale", false
         );
         var2 = new J7IQIDkJBXDmohBfxy4U1H2qA5ond7mZMkgbkJwUgi44g83SruSZFpdl4U63pLROuvdB8tA8Gji4lbm7QsQrZIMY3X4khPsPwsKz(var4, var5, var6, var7);
      }

      return var2;
   }

   private float BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(JsonObject var1) {
      float var2 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(
         var1, "angle"
      );
      if (var2 != 0.0F
         && u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
               var2
            )
            != 22.5F
         && u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(
               var2
            )
            != 45.0F) {
         throw new JsonParseException("Invalid rotation " + var2 + " found, only -45/-22.5/0/22.5/45 allowed");
      } else {
         return var2;
      }
   }

   private VOV84XzuMWrwpvkwu5LJHXBhpVvfHxiUkItS93saq12VjZEG0se88QHdeCp4DwciHolhZQ2v0URvP1bziGTpNQYa1K11aNqHenW vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      JsonObject var1
   ) {
      String var2 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
         var1, "axis"
      );
      VOV84XzuMWrwpvkwu5LJHXBhpVvfHxiUkItS93saq12VjZEG0se88QHdeCp4DwciHolhZQ2v0URvP1bziGTpNQYa1K11aNqHenW var3 = VOV84XzuMWrwpvkwu5LJHXBhpVvfHxiUkItS93saq12VjZEG0se88QHdeCp4DwciHolhZQ2v0URvP1bziGTpNQYa1K11aNqHenW.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2.toLowerCase()
      );
      if (var3 == null) {
         throw new JsonParseException("Invalid rotation axis: " + var2);
      } else {
         return var3;
      }
   }

   private Map Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonDeserializationContext var1, JsonObject var2
   ) {
      Map var3 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1, var2);
      if (var3.isEmpty()) {
         throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
      } else {
         return var3;
      }
   }

   private Map BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      JsonDeserializationContext var1, JsonObject var2
   ) {
      EnumMap var3 = Maps.newEnumMap(NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.class);
      JsonObject var4 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ(
         var2, "faces"
      );

      for (Entry var6 : var4.entrySet()) {
         NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var7 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            (String)var6.getKey()
         );
         var3.put(
            var7,
            (q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3)var1.deserialize(
               (JsonElement)var6.getValue(), q1yjJRUICkA9ePz2QIcXFQwi7yA5av6bI7ToQAngVMcAShJkfUYll7DwFOPB2HoDWQ0R1UjypmRd20s8U1QfGf0mJvEJRaqZH5z3.class
            )
         );
      }

      return var3;
   }

   private NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var1
   ) {
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1
      );
      if (var2 == null) {
         throw new JsonParseException("Unknown facing: " + var1);
      } else {
         return var2;
      }
   }

   private Vector3f PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(JsonObject var1) {
      Vector3f var2 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, "to");
      if (var2.x >= -16.0F && var2.y >= -16.0F && var2.z >= -16.0F && var2.x <= 32.0F && var2.y <= 32.0F && var2.z <= 32.0F) {
         return var2;
      } else {
         throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + var2);
      }
   }

   private Vector3f uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(JsonObject var1) {
      Vector3f var2 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, "from");
      if (var2.x >= -16.0F && var2.y >= -16.0F && var2.z >= -16.0F && var2.x <= 32.0F && var2.y <= 32.0F && var2.z <= 32.0F) {
         return var2;
      } else {
         throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + var2);
      }
   }

   private Vector3f Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(JsonObject var1, String var2) {
      JsonArray var3 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x(
         var1, var2
      );
      if (var3.size() != 3) {
         throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var3.size());
      }

      float[] var4 = new float[3];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var3.get(var5), var2 + "[" + var5 + "]"
         );
      }

      return new Vector3f(var4[0], var4[1], var4[2]);
   }
}
