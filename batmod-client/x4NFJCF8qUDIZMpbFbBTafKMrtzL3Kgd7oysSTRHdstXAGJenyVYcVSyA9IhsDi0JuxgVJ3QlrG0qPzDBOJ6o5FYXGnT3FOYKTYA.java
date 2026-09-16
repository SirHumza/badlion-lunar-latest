import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class x4NFJCF8qUDIZMpbFbBTafKMrtzL3Kgd7oysSTRHdstXAGJenyVYcVSyA9IhsDi0JuxgVJ3QlrG0qPzDBOJ6o5FYXGnT3FOYKTYA
   extends edUG7FYUKILmr1KaUjgCEQPb7AdbBVrk2aebEAHYLT8lzdGbdwX2S9ElQ4QzVLFdvod9EYPnPFD0f0arUeowYyrUnEXvjOgnnMi5
   implements JsonSerializer {
   public pp9QP5kDl8GGUJFmtkKBHREByltCvip1S5qPpsF6zejacpBOnPR2jkDQ8Hv6R3goJB8HMvNykFEBWdxTHp6fLD7zbQtrlgRHnkdl Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var5 = (WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY)var3.deserialize(
         var4.get("description"), WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY.class
      );
      if (var5 == null) {
         throw new JsonParseException("Invalid/missing description!");
      }

      int var6 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9(
         var4, "pack_format"
      );
      return new pp9QP5kDl8GGUJFmtkKBHREByltCvip1S5qPpsF6zejacpBOnPR2jkDQ8Hv6R3goJB8HMvNykFEBWdxTHp6fLD7zbQtrlgRHnkdl(var5, var6);
   }

   public JsonElement Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      pp9QP5kDl8GGUJFmtkKBHREByltCvip1S5qPpsF6zejacpBOnPR2jkDQ8Hv6R3goJB8HMvNykFEBWdxTHp6fLD7zbQtrlgRHnkdl var1, Type var2, JsonSerializationContext var3
   ) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("pack_format", var1.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW());
      var4.add("description", var3.serialize(var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()));
      return var4;
   }

   @Override
   public String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      return "pack";
   }
}
