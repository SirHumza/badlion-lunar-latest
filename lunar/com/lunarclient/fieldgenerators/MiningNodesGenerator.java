package com.lunarclient.fieldgenerators;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.Constants;
import com.lunarclient.Utils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map.Entry;

@Deprecated
public class MiningNodesGenerator {
   public static void generate() {
      File var0 = new File("src/main/java/com/lunarclient/profiles/profile/member/mining_core/nodes/Nodes.java");
      String var1 = "src/main/resources/nodes.json";

      try {
         String var2 = new String(Files.readAllBytes(Paths.get(var1)));
         JsonObject var3 = Constants.GSON.fromJson(var2, JsonObject.class);
         FileWriter var4 = new FileWriter(var0);
         var4.write(
            "package com.lunarclient.profiles.profile.member.mining_core.nodes;\n\nimport com.google.gson.annotations.SerializedName;\n\npublic record Nodes (\n"
         );

         for (Entry var6 : var3.entrySet()) {
            if (((JsonElement)var6.getValue()).isJsonPrimitive() && ((JsonElement)var6.getValue()).getAsJsonPrimitive().isNumber()) {
               var4.write("        @SerializedName(\"" + (String)var6.getKey() + "\") int " + Utils.snakeToCamelCase((String)var6.getKey()) + ",\n");
            } else {
               var4.write("        @SerializedName(\"" + (String)var6.getKey() + "\") boolean " + Utils.snakeToCamelCase((String)var6.getKey()) + ",\n");
            }
         }

         var4.write(") {\n}");
         var4.close();
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }
   }
}
