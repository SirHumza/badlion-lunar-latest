import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileWriter;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map.Entry;

public class ExitCode {
   private File BatModClient() {
      try {
         if (!AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
            .K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
            .isDirectory()) {
            return null;
         }

         File var1 = new File(
            AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
               .getAbsolutePath(),
            "launcher_msa_credentials.json"
         );
         if (!var1.exists()) {
            var1.createNewFile();
         }

         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   private JsonObject Button() {
      File var1 = this.BatModClient();
      if (var1 == null) {
         return null;
      } else {
         String var2 = OJ2hS3dQ7PMJXfIMXkdJeUZ1pqHqeTHScHmrHbw2KxHAaKueCx8duIGDVQao92NslQdGf3JN3UWIJdtIKGnuuiXwT2gHy19iIiTM.BatModClient(
            var1
         );
         if (var2 == null) {
            return null;
         } else {
            return var2.equals("") ? new JsonObject() : (JsonObject)new JsonParser().parse(var2);
         }
      }
   }

   private boolean BatModClient(JsonObject var1) {
      try {
         File var2 = this.BatModClient();
         if (var2 == null) {
            return false;
         }

         FileWriter var3 = new FileWriter(var2.getAbsolutePath());
         var3.write(new GsonBuilder().setPrettyPrinting().create().toJson(var1));
         var3.close();
         return true;
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public boolean BatModClient(String var1) {
      JsonObject var2 = this.Button();
      if (var2 == null) {
         return false;
      }

      if (var2.has("activeUserXuid")) {
         var2.remove("activeUserXuid");
      }

      var2.addProperty("activeUserXuid", var1);
      return this.BatModClient(var2);
   }

   public String Button(String var1) {
      JsonObject var2 = this.CustomSpinner(var1);
      return var2 == null ? null : var2.get("refresh_token").getAsString();
   }

   private JsonObject CustomSpinner(String var1) {
      JsonObject var2 = this.Button();
      if (var2 == null) {
         return null;
      }

      if (!var2.has("credentials")) {
         return null;
      }

      label63:
      for (Entry var4 : var2.getAsJsonObject("credentials").entrySet()) {
         if (((String)var4.getKey()).equals(var1)) {
            try {
               JsonObject var5 = ((JsonElement)var4.getValue()).getAsJsonObject();
               String var6 = "Production.Msa.";

               for (Entry var8 : var5.entrySet()) {
                  if (((String)var8.getKey()).endsWith("Production.Default")) {
                     JsonObject var9 = (JsonObject)new JsonParser().parse(((JsonElement)var8.getValue()).getAsString());
                     if (var9 == null || !var9.has("default")) {
                        return null;
                     }

                     var6 = var6 + Base64.getEncoder().encodeToString(var9.get("default").getAsString().getBytes()).replace("=", "");
                     break;
                  }
               }

               Iterator var11 = var5.entrySet().iterator();

               Entry var12;
               do {
                  if (!var11.hasNext()) {
                     continue label63;
                  }

                  var12 = (Entry)var11.next();
               } while (!((String)var12.getKey()).endsWith(var6));

               return (JsonObject)new JsonParser().parse(((JsonElement)var12.getValue()).getAsString());
            } catch (Exception var10) {
               BatModClient.Button(
                  "Skipping bad stored msa credentials: " + (String)var4.getKey() + " / " + var4.getValue()
               );
               var10.printStackTrace();
            }
         }
      }

      return null;
   }
}
