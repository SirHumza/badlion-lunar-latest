import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

class ok8wRl1i184Aev9fLEMhIIT4R1qL13SfT59GqoFFi8OXDwa1KvQhRdLMXjQqM7hHT9fosJmWZDQFsrDML8IkPGWtpDaIFEgR1M2g implements JsonDeserializer, JsonSerializer {
   private ok8wRl1i184Aev9fLEMhIIT4R1qL13SfT59GqoFFi8OXDwa1KvQhRdLMXjQqM7hHT9fosJmWZDQFsrDML8IkPGWtpDaIFEgR1M2g(
      PEOBG8If3G8o4gPpc2dCmsCzcolpje8tGBE6KVbBgs2PH8lGmAptMKkdQW6OgEwjYRWPhGicLKjkMb9qjH2pI2GgtuBZvRl3NsB var1
   ) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
   }

   public JsonElement Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV var1, Type var2, JsonSerializationContext var3
   ) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I().getName());
      UUID var5 = var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I().getId();
      var4.addProperty("uuid", var5 == null ? "" : var5.toString());
      var4.addProperty(
         "expiresOn",
         PEOBG8If3G8o4gPpc2dCmsCzcolpje8tGBE6KVbBgs2PH8lGmAptMKkdQW6OgEwjYRWPhGicLKjkMb9qjH2pI2GgtuBZvRl3NsB.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            .format(var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW())
      );
      return var4;
   }

   public yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      if (var1.isJsonObject()) {
         JsonObject var4 = var1.getAsJsonObject();
         JsonElement var5 = var4.get("name");
         JsonElement var6 = var4.get("uuid");
         JsonElement var7 = var4.get("expiresOn");
         if (var5 != null && var6 != null) {
            String var8 = var6.getAsString();
            String var9 = var5.getAsString();
            Date var10 = null;
            if (var7 != null) {
               try {
                  var10 = PEOBG8If3G8o4gPpc2dCmsCzcolpje8tGBE6KVbBgs2PH8lGmAptMKkdQW6OgEwjYRWPhGicLKjkMb9qjH2pI2GgtuBZvRl3NsB.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                     .parse(var7.getAsString());
               } catch (ParseException var14) {
                  var10 = null;
               }
            }

            if (var9 != null && var8 != null) {
               UUID var11;
               try {
                  var11 = UUID.fromString(var8);
               } catch (Throwable var13) {
                  return null;
               }

               PEOBG8If3G8o4gPpc2dCmsCzcolpje8tGBE6KVbBgs2PH8lGmAptMKkdQW6OgEwjYRWPhGicLKjkMb9qjH2pI2GgtuBZvRl3NsB var10002 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
               this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.getClass();
               return new yqqaZbnizzohmuFgkEUD0Bl2ytHg2pyhc8lZNhG75SJzkpgWVvS8mLtL8pasZLNGK1g1GFcSiizqdgQG5igWYyTCj53VXV9tfMTV(
                  var10002, new GameProfile(var11, var9), var10, null
               );
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
