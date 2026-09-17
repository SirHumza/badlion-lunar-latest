import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class eCBZMJWpPapWAz99LyFcHOHleBGzM7NWFTIuWMUSvImcJTefN9b4gd4NxU1Fyqnzwnk0iLWRxZpw3hx2iLw4E2IcYj5mEtmVjr9
   extends edUG7FYUKILmr1KaUjgCEQPb7AdbBVrk2aebEAHYLT8lzdGbdwX2S9ElQ4QzVLFdvod9EYPnPFD0f0arUeowYyrUnEXvjOgnnMi5 {
   public XJcgdvuLNsXIlm5G5erYlH18USBqAjsuZmw72psB9HD2BLCxvnYKTLAvBogLlmcLkuY0GKVu6O8Gxp1In2vmfRBVWE0yvoA8cjyw BatModClient(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      boolean var5 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
         var4, "blur", false
      );
      boolean var6 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
         var4, "clamp", false
      );
      ArrayList var7 = Lists.newArrayList();
      if (var4.has("mipmaps")) {
         try {
            JsonArray var8 = var4.getAsJsonArray("mipmaps");

            for (int var9 = 0; var9 < var8.size(); var9++) {
               JsonElement var10 = var8.get(var9);
               if (var10.isJsonPrimitive()) {
                  try {
                     var7.add(var10.getAsInt());
                  } catch (NumberFormatException var12) {
                     throw new JsonParseException("Invalid texture->mipmap->" + var9 + ": expected number, was " + var10, var12);
                  }
               } else if (var10.isJsonObject()) {
                  throw new JsonParseException("Invalid texture->mipmap->" + var9 + ": expected number, was " + var10);
               }
            }
         } catch (ClassCastException var13) {
            throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + var4.get("mipmaps"), var13);
         }
      }

      return new XJcgdvuLNsXIlm5G5erYlH18USBqAjsuZmw72psB9HD2BLCxvnYKTLAvBogLlmcLkuY0GKVu6O8Gxp1In2vmfRBVWE0yvoA8cjyw(var5, var6, var7);
   }

   @Override
   public String BatModClient() {
      return "texture";
   }
}
