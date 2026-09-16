import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

public class nMK8kAcK1E9JGdO8NcNynr3pQa53houHGTxyYWhful1qkKBREVWm9tMddCyyPojSsrXSOoQhgceK0oqnECW6Gh5SeiFl65AYu3z implements JsonDeserializer, JsonSerializer {
   private static final Gson Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;

   public WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      if (var1.isJsonPrimitive()) {
         return new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(var1.getAsString());
      }

      if (!var1.isJsonObject()) {
         if (var1.isJsonArray()) {
            JsonArray var11 = var1.getAsJsonArray();
            WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var12 = null;

            for (JsonElement var17 : var11) {
               WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var18 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var17, var17.getClass(), var3
               );
               if (var12 == null) {
                  var12 = var18;
               } else {
                  var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var18);
               }
            }

            return var12;
         } else {
            throw new JsonParseException("Don't know how to turn " + var1.toString() + " into a Component");
         }
      } else {
         JsonObject var4 = var1.getAsJsonObject();
         b6S3Bl6iNXeLaOvEmD3lWAI0AJfsXhSKxIciwzonvCkqzDBZHeD1AMBd6dY9JNwsdcHR0sOHxNpzKgMKyG5QmjuhtMOzaRT8OXb var5;
         if (var4.has("text")) {
            var5 = new E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl(var4.get("text").getAsString());
         } else if (var4.has("translate")) {
            String var6 = var4.get("translate").getAsString();
            if (var4.has("with")) {
               JsonArray var7 = var4.getAsJsonArray("with");
               Object[] var8 = new Object[var7.size()];

               for (int var9 = 0; var9 < var8.length; var9++) {
                  var8[var9] = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     var7.get(var9), var2, var3
                  );
                  if (var8[var9] instanceof E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl) {
                     E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl var10 = (E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl)var8[var9];
                     if (var10.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
                           .kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
                        && var10.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0().isEmpty()) {
                        var8[var9] = var10.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
                     }
                  }
               }

               var5 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(var6, var8);
            } else {
               var5 = new emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01(var6);
            }
         } else if (var4.has("score")) {
            JsonObject var13 = var4.getAsJsonObject("score");
            if (!var13.has("name") || !var13.has("objective")) {
               throw new JsonParseException("A score component needs a least a name and an objective");
            }

            var5 = new e4j8JtmTs5AGv2OygTOSkNOvWIqwD0japlIyLO2qHx7FgiDDtc3NNK27ATK8SmFMml7G0TIKz512jdhUS21ewnPw2knl4H3pWco6(
               QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
                  var13, "name"
               ),
               QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
                  var13, "objective"
               )
            );
            if (var13.has("value")) {
               ((e4j8JtmTs5AGv2OygTOSkNOvWIqwD0japlIyLO2qHx7FgiDDtc3NNK27ATK8SmFMml7G0TIKz512jdhUS21ewnPw2knl4H3pWco6)var5)
                  .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
                        var13, "value"
                     )
                  );
            }
         } else {
            if (!var4.has("selector")) {
               throw new JsonParseException("Don't know how to turn " + var1.toString() + " into a Component");
            }

            var5 = new m0KAznM3aAK38AtYnIWZVl5LHfNZQ51Ly2jQxNhGzFtb2Yf4vOHB6O6wOHdrVjCmbq4o8PQlYcPv3OW0alIAWqS110zDrDrc9IiH(
               QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
                  var4, "selector"
               )
            );
         }

         if (var4.has("extra")) {
            JsonArray var14 = var4.getAsJsonArray("extra");
            if (var14.size() <= 0) {
               throw new JsonParseException("Unexpected empty array of components");
            }

            for (int var16 = 0; var16 < var14.size(); var16++) {
               var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var14.get(var16), var2, var3)
               );
            }
         }

         var5.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            (yl0mZb2L6LsYutskbvdy92R5O0ucwqxLdFRSY88HQHekYrPd9yTOSLXzu590OIVgg9Qk21zwAmAaGRt3c1ubj2k0ZmcBHYGMFHag)var3.deserialize(
               var1, yl0mZb2L6LsYutskbvdy92R5O0ucwqxLdFRSY88HQHekYrPd9yTOSLXzu590OIVgg9Qk21zwAmAaGRt3c1ubj2k0ZmcBHYGMFHag.class
            )
         );
         return var5;
      }
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      yl0mZb2L6LsYutskbvdy92R5O0ucwqxLdFRSY88HQHekYrPd9yTOSLXzu590OIVgg9Qk21zwAmAaGRt3c1ubj2k0ZmcBHYGMFHag var1, JsonObject var2, JsonSerializationContext var3
   ) {
      JsonElement var4 = var3.serialize(var1);
      if (var4.isJsonObject()) {
         JsonObject var5 = (JsonObject)var4;

         for (Entry var7 : var5.entrySet()) {
            var2.add((String)var7.getKey(), (JsonElement)var7.getValue());
         }
      }
   }

   public JsonElement Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var1, Type var2, JsonSerializationContext var3
   ) {
      if (var1 instanceof E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl
         && var1.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
            .kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
         && var1.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0().isEmpty()) {
         return new JsonPrimitive(
            ((E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl)var1)
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
         );
      }

      JsonObject var4 = new JsonObject();
      if (!var1.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()
         .kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ()) {
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ(), var4, var3
         );
      }

      if (!var1.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0().isEmpty()) {
         JsonArray var5 = new JsonArray();

         for (WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var7 : var1.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()) {
            var5.add(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var7, var7.getClass(), var3));
         }

         var4.add("extra", var5);
      }

      if (var1 instanceof E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl) {
         var4.addProperty(
            "text",
            ((E2CgSq1b32QIHiGU1ign22OXmNS90IL1WGNCTiv4SdL7EzVWd66NSzSeKD8rm6JZqRkunqgdhWaRlFHGJlHuqdIrdPpJulQkRtvl)var1)
               .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()
         );
      } else if (var1 instanceof emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01) {
         emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01 var11 = (emMX69ZH4JV4WnYL7ZUfsXDGmJQWX52z0ynZj0TYL8OyU4SM48aqKdHun4wGz5ZYZHL0oE7ELsM7gDzpUphHJ9tQjtmOXAnZYy01)var1;
         var4.addProperty("translate", var11.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u());
         if (var11.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ() != null
            && var11.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ().length > 0) {
            JsonArray var14 = new JsonArray();

            for (Object var10 : var11.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ()) {
               if (var10 instanceof WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY) {
                  var14.add(
                     this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        (WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY)var10, var10.getClass(), var3
                     )
                  );
               } else {
                  var14.add(new JsonPrimitive(String.valueOf(var10)));
               }
            }

            var4.add("with", var14);
         }
      } else if (var1 instanceof e4j8JtmTs5AGv2OygTOSkNOvWIqwD0japlIyLO2qHx7FgiDDtc3NNK27ATK8SmFMml7G0TIKz512jdhUS21ewnPw2knl4H3pWco6) {
         e4j8JtmTs5AGv2OygTOSkNOvWIqwD0japlIyLO2qHx7FgiDDtc3NNK27ATK8SmFMml7G0TIKz512jdhUS21ewnPw2knl4H3pWco6 var12 = (e4j8JtmTs5AGv2OygTOSkNOvWIqwD0japlIyLO2qHx7FgiDDtc3NNK27ATK8SmFMml7G0TIKz512jdhUS21ewnPw2knl4H3pWco6)var1;
         JsonObject var15 = new JsonObject();
         var15.addProperty("name", var12.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I());
         var15.addProperty("objective", var12.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW());
         var15.addProperty("value", var12.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5());
         var4.add("score", var15);
      } else {
         if (!(var1 instanceof m0KAznM3aAK38AtYnIWZVl5LHfNZQ51Ly2jQxNhGzFtb2Yf4vOHB6O6wOHdrVjCmbq4o8PQlYcPv3OW0alIAWqS110zDrDrc9IiH)) {
            throw new IllegalArgumentException("Don't know how to serialize " + var1 + " as a Component");
         }

         m0KAznM3aAK38AtYnIWZVl5LHfNZQ51Ly2jQxNhGzFtb2Yf4vOHB6O6wOHdrVjCmbq4o8PQlYcPv3OW0alIAWqS110zDrDrc9IiH var13 = (m0KAznM3aAK38AtYnIWZVl5LHfNZQ51Ly2jQxNhGzFtb2Yf4vOHB6O6wOHdrVjCmbq4o8PQlYcPv3OW0alIAWqS110zDrDrc9IiH)var1;
         var4.addProperty("selector", var13.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I());
      }

      return var4;
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var0
   ) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.toJson(var0);
   }

   public static WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0
   ) {
      return (WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY)Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.fromJson(
         var0, WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY.class
      );
   }

   static {
      GsonBuilder var0 = new GsonBuilder();
      var0.registerTypeHierarchyAdapter(
         WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY.class,
         new nMK8kAcK1E9JGdO8NcNynr3pQa53houHGTxyYWhful1qkKBREVWm9tMddCyyPojSsrXSOoQhgceK0oqnECW6Gh5SeiFl65AYu3z()
      );
      var0.registerTypeHierarchyAdapter(
         yl0mZb2L6LsYutskbvdy92R5O0ucwqxLdFRSY88HQHekYrPd9yTOSLXzu590OIVgg9Qk21zwAmAaGRt3c1ubj2k0ZmcBHYGMFHag.class,
         new dC1BoUgIRnR8qMJBM3U4h5lxS0BqwdejxLTrOmDndzyHvpGvHaBU40Jft4sMSmq0rn852ge3hCS9fOFLqzjz1npDVZnBXnVJJF4r()
      );
      var0.registerTypeAdapterFactory(new pirT6lL2sekWRlDOCL8eRehsXt1QNyEERj9G5VDRk0Of26YX5yBKEDklQFIoyMfHszZu26zc4rUmobmy6xvPwLBl8ocI4JJfaOX());
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var0.create();
   }
}
