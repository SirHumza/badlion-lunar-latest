import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;

public class i14wIFIztHfv83X0NvQ4sxs1sqfMHjwuoQEJ8ZNynJePKBMgurrbWhQgtIY315iYu4altAPsAmWnEAmBYvK67mV2h7AVoOnzMXY implements JsonDeserializer {
   public arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      List var5 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3, var4);
      String var6 = this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var4);
      boolean var7 = StringUtils.isEmpty(var6);
      boolean var8 = var5.isEmpty();
      if (var8 && var7) {
         throw new JsonParseException("BlockModel requires either elements or parent, found neither");
      }

      if (!var7 && !var8) {
         throw new JsonParseException("BlockModel requires either elements or parent, found both");
      }

      Map var9 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var4);
      boolean var10 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4);
      yKTXE7HQ88q91YedQPRJ5dR4HmE8g2Sy2jB3TlmEAQkr73gZBi2i98r8cAk8lu7LuHhRiPY4GI22GqwUUTXManMpCXgvgpFlEeG var11 = yKTXE7HQ88q91YedQPRJ5dR4HmE8g2Sy2jB3TlmEAQkr73gZBi2i98r8cAk8lu7LuHhRiPY4GI22GqwUUTXManMpCXgvgpFlEeG.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I;
      if (var4.has("display")) {
         JsonObject var12 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ(
            var4, "display"
         );
         var11 = (yKTXE7HQ88q91YedQPRJ5dR4HmE8g2Sy2jB3TlmEAQkr73gZBi2i98r8cAk8lu7LuHhRiPY4GI22GqwUUTXManMpCXgvgpFlEeG)var3.deserialize(
            var12, yKTXE7HQ88q91YedQPRJ5dR4HmE8g2Sy2jB3TlmEAQkr73gZBi2i98r8cAk8lu7LuHhRiPY4GI22GqwUUTXManMpCXgvgpFlEeG.class
         );
      }

      return var8
         ? new arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir(
            new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(var6), var9, var10, true, var11
         )
         : new arCBxT5bdkyLYwya4fMX97PjzGBfDRjVa1ms2flNvXW9VT5E5IntIHKd9uUQa0kJKvG9ZOFDPrhq5rV6WDBUFgmi2Ge2tFnvh5ir(var5, var9, var10, true, var11);
   }

   private Map BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(JsonObject var1) {
      HashMap var2 = Maps.newHashMap();
      if (var1.has("textures")) {
         JsonObject var3 = var1.getAsJsonObject("textures");

         for (Entry var5 : var3.entrySet()) {
            var2.put(var5.getKey(), ((JsonElement)var5.getValue()).getAsString());
         }
      }

      return var2;
   }

   private String vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(JsonObject var1) {
      return QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, "parent", ""
      );
   }

   protected boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(JsonObject var1) {
      return QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var1, "ambientocclusion", true
      );
   }

   protected List Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonDeserializationContext var1, JsonObject var2
   ) {
      ArrayList var3 = Lists.newArrayList();
      if (var2.has("elements")) {
         for (JsonElement var5 : QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x(
            var2, "elements"
         )) {
            var3.add(
               (aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM)var1.deserialize(
                  var5, aYRi21YNpTmxaDUuHMqczMc6UGQr7kkknFfOueaoAgH0SGLM1lT7ofBbs8LfxQrqmB1u2rjjiZE6ZMVizHQzJ51GvCkdYjR9LWLM.class
               )
            );
         }
      }

      return var3;
   }
}
