import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class IzxgAGSZ4gde03VIUlIFbw8h7GRqdhvFpb5NTBjbzbWiuWA9vcwdx0n5sEix62E6QtRHud7t8yw7Hi73MUfDzOaOb9kR8di42M7J
   extends edUG7FYUKILmr1KaUjgCEQPb7AdbBVrk2aebEAHYLT8lzdGbdwX2S9ElQ4QzVLFdvod9EYPnPFD0f0arUeowYyrUnEXvjOgnnMi5 {
   public zC3ZhroKA6yY2DxKsq5htCTALUkvrWp7XdVq55QpgwtpSpVRypEhY8SVQlCaW53MpEeeH5vjFDJUvYANFybIAvkUmYSwYr9avi1I BatModClient(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      float[] var5 = new float[256];
      float[] var6 = new float[256];
      float[] var7 = new float[256];
      float var8 = 1.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      if (var4.has("characters")) {
         if (!var4.get("characters").isJsonObject()) {
            throw new JsonParseException("Invalid font->characters: expected object, was " + var4.get("characters"));
         }

         JsonObject var11 = var4.getAsJsonObject("characters");
         if (var11.has("default")) {
            if (!var11.get("default").isJsonObject()) {
               throw new JsonParseException("Invalid font->characters->default: expected object, was " + var11.get("default"));
            }

            JsonObject var12 = var11.getAsJsonObject("default");
            var8 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
               var12, "width", var8
            );
            Validate.inclusiveBetween(0.0, Float.MAX_VALUE, var8, "Invalid default width");
            var9 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
               var12, "spacing", var9
            );
            Validate.inclusiveBetween(0.0, Float.MAX_VALUE, var9, "Invalid default spacing");
            var10 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
               var12, "left", var9
            );
            Validate.inclusiveBetween(0.0, Float.MAX_VALUE, var10, "Invalid default left");
         }

         for (int var18 = 0; var18 < 256; var18++) {
            JsonElement var13 = var11.get(Integer.toString(var18));
            float var14 = var8;
            float var15 = var9;
            float var16 = var10;
            if (var13 != null) {
               JsonObject var17 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Spinner(
                  var13, "characters[" + var18 + "]"
               );
               var14 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
                  var17, "width", var8
               );
               Validate.inclusiveBetween(0.0, Float.MAX_VALUE, var14, "Invalid width");
               var15 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
                  var17, "spacing", var9
               );
               Validate.inclusiveBetween(0.0, Float.MAX_VALUE, var15, "Invalid spacing");
               var16 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
                  var17, "left", var10
               );
               Validate.inclusiveBetween(0.0, Float.MAX_VALUE, var16, "Invalid left");
            }

            var5[var18] = var14;
            var6[var18] = var15;
            var7[var18] = var16;
         }
      }

      return new zC3ZhroKA6yY2DxKsq5htCTALUkvrWp7XdVq55QpgwtpSpVRypEhY8SVQlCaW53MpEeeH5vjFDJUvYANFybIAvkUmYSwYr9avi1I(var5, var7, var6);
   }

   @Override
   public String BatModClient() {
      return "font";
   }
}
