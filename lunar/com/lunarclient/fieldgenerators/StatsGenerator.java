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
public class StatsGenerator {
   public static void generate() {
      File var0 = new File("src/main/java/com/lunarclient/profiles/profile/member/stats/Stats.java");
      String var1 = "src/main/resources/stats.json";

      try {
         String var2 = new String(Files.readAllBytes(Paths.get(var1)));
         JsonObject var3 = Constants.GSON.fromJson(var2, JsonObject.class);
         FileWriter var4 = new FileWriter(var0);
         var4.write(
            "package com.lunarclient.profiles.profile.member.stats;\n\nimport com.google.gson.annotations.SerializedName;\n\n/**\n * Note: A lot of these fields are actually floats or ints in practice, but maintaining this isn't straightforward\n * because JsonPrimitives can be whatever type of number they want. This should make maintenance a bit easier, but I\n * could consider refactoring this later.\n * <p>\n * Also, this can't be a record, as there are too many fields.\n */\npublic class Stats {\n"
         );

         for (Entry var6 : var3.entrySet()) {
            if (((JsonElement)var6.getValue()).isJsonPrimitive() && ((JsonElement)var6.getValue()).getAsJsonPrimitive().isNumber()) {
               var4.write("    @SerializedName(\"" + (String)var6.getKey() + "\")\n");
               var4.write("    public double " + Utils.snakeToCamelCase((String)var6.getKey()) + ";\n");
            } else {
               System.out.println("Field " + (String)var6.getKey() + " is not a number?");
            }
         }

         var4.write("}");
         var4.close();
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }
   }
}
