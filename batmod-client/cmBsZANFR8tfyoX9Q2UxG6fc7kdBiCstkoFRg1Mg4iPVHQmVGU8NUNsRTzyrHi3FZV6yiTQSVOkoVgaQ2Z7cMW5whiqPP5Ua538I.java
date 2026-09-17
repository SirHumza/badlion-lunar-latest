import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cmBsZANFR8tfyoX9Q2UxG6fc7kdBiCstkoFRg1Mg4iPVHQmVGU8NUNsRTzyrHi3FZV6yiTQSVOkoVgaQ2Z7cMW5whiqPP5Ua538I {
   private static final Logger BatModClient = LogManager.getLogger();
   private final Map Button = Maps.newHashMap();

   public cmBsZANFR8tfyoX9Q2UxG6fc7kdBiCstkoFRg1Mg4iPVHQmVGU8NUNsRTzyrHi3FZV6yiTQSVOkoVgaQ2Z7cMW5whiqPP5Ua538I(File var1, String var2) {
      if (var2 != null) {
         File var3 = new File(var1, "objects");
         File var4 = new File(var1, "indexes/" + var2 + ".json");
         BufferedReader var5 = null;

         try {
            var5 = Files.newReader(var4, Charsets.UTF_8);
            JsonObject var6 = new JsonParser().parse(var5).getAsJsonObject();
            JsonObject var7 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.BatModClient(
               var6, "objects", (JsonObject)null
            );
            if (var7 != null) {
               for (Entry var9 : var7.entrySet()) {
                  JsonObject var10 = (JsonObject)var9.getValue();
                  String var11 = (String)var9.getKey();
                  String[] var12 = var11.split("/", 2);
                  String var13 = var12.length == 1 ? var12[0] : var12[0] + ":" + var12[1];
                  String var14 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.Checkbox(
                     var10, "hash"
                  );
                  File var15 = new File(var3, var14.substring(0, 2) + "/" + var14);
                  this.Button.put(var13, var15);
               }
            }
         } catch (JsonParseException var20) {
            BatModClient.error(
               "Unable to parse resource index file: " + var4
            );
         } catch (FileNotFoundException var21) {
            BatModClient.error(
               "Can't find the resource index file: " + var4
            );
         } finally {
            IOUtils.closeQuietly(var5);
         }
      }
   }

   public Map BatModClient() {
      return this.Button;
   }
}
