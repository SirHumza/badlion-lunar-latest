import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map.Entry;

public class Vcek70SzfSjAFTjLMcyQMN86ULcwymBKPS3cUxPSAwkBaB7MkUSRfu0FL3Z96MT3f3ctm0mzGXDdrMSrDMgA0CIxxkpCGnzKwFOc
   extends edUG7FYUKILmr1KaUjgCEQPb7AdbBVrk2aebEAHYLT8lzdGbdwX2S9ElQ4QzVLFdvod9EYPnPFD0f0arUeowYyrUnEXvjOgnnMi5 {
   public hy8zOjTDPYxl3XHWAbtYssjHOaAiCuXiloKEUngjzcauJUtIBKBkwSqh20Og7jxzuio8HBsIwzdxH2ROPKM3pzviZGBpfL457JIO BatModClient(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      HashSet var5 = Sets.newHashSet();

      for (Entry var7 : var4.entrySet()) {
         String var8 = (String)var7.getKey();
         JsonObject var9 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Spinner(
            (JsonElement)var7.getValue(), "language"
         );
         String var10 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Checkbox(
            var9, "region"
         );
         String var11 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Checkbox(
            var9, "name"
         );
         boolean var12 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
            var9, "bidirectional", false
         );
         if (var10.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var8 + "'->region: empty value");
         }

         if (var11.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var8 + "'->name: empty value");
         }

         if (!var5.add(new AwZD3372Wu7ynyN9PkJbp3BxZY2JDnGv2ej0SXXPTftJXoZP36SrvOQoWAHzWcgLpyTl7aUXh6qUKil0mggc2ytkvJKFWQRHmjro(var8, var10, var11, var12))) {
            throw new JsonParseException("Duplicate language->'" + var8 + "' defined");
         }
      }

      return new hy8zOjTDPYxl3XHWAbtYssjHOaAiCuXiloKEUngjzcauJUtIBKBkwSqh20Og7jxzuio8HBsIwzdxH2ROPKM3pzviZGBpfL457JIO(var5);
   }

   @Override
   public String BatModClient() {
      return "language";
   }
}
