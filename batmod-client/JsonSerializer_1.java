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
   public pp9QP5kDl8GGUJFmtkKBHREByltCvip1S5qPpsF6zejacpBOnPR2jkDQ8Hv6R3goJB8HMvNykFEBWdxTHp6fLD7zbQtrlgRHnkdl BatModClient(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var5 = (WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY)var3.deserialize(
         var4.get("description"), WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY.class
      );
      if (var5 == null) {
         throw new JsonParseException("Invalid/missing description!");
      }

      int var6 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.ColorChooser(
         var4, "pack_format"
      );
      return new pp9QP5kDl8GGUJFmtkKBHREByltCvip1S5qPpsF6zejacpBOnPR2jkDQ8Hv6R3goJB8HMvNykFEBWdxTHp6fLD7zbQtrlgRHnkdl(var5, var6);
   }

   public JsonElement BatModClient(
      pp9QP5kDl8GGUJFmtkKBHREByltCvip1S5qPpsF6zejacpBOnPR2jkDQ8Hv6R3goJB8HMvNykFEBWdxTHp6fLD7zbQtrlgRHnkdl var1, Type var2, JsonSerializationContext var3
   ) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("pack_format", var1.Button());
      var4.add("description", var3.serialize(var1.BatModClient()));
      return var4;
   }

   @Override
   public String BatModClient() {
      return "pack";
   }
}
