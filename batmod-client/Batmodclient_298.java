import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.util.UUIDTypeAdapter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.Map.Entry;

public class K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY {
   private File Spinner() {
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
            "launcher_accounts.json"
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

   private JsonObject Checkbox() {
      File var1 = this.Spinner();
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
         File var2 = this.Spinner();
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

   public String BatModClient() {
      JsonObject var1 = this.Checkbox();
      if (var1 == null) {
         return null;
      } else if (!var1.has("mojangClientToken")) {
         String var2 = UUIDTypeAdapter.fromUUID(UUID.randomUUID());
         this.BatModClient(var2);
         return var2;
      } else {
         return var1.get("mojangClientToken").getAsString();
      }
   }

   private boolean BatModClient(String var1) {
      JsonObject var2 = this.Checkbox();
      if (var2 == null) {
         return false;
      }

      var2.addProperty("mojangClientToken", var1);
      return this.BatModClient(var2);
   }

   public UUID Button() {
      Object var1 = null;
      JsonObject var2 = this.Checkbox();
      if (var2 == null) {
         return (UUID)var1;
      } else {
         return (UUID)(!var2.has("activeAccountLocalId") ? var1 : UUIDTypeAdapter.fromString(var2.get("activeAccountLocalId").getAsString()));
      }
   }

   public ButtonAction CustomSpinner() {
      UUID var1 = this.Button();
      return var1 == null
         ? null
         : BatModClient.BatModClient()
            .IntegerSpinner()
            .Button(var1);
   }

   public boolean BatModClient(UUID var1) {
      JsonObject var2 = this.Checkbox();
      if (var2 == null) {
         return false;
      }

      var2.addProperty("activeAccountLocalId", UUIDTypeAdapter.fromUUID(var1));
      return this.BatModClient(var2);
   }

   public boolean BatModClient(
      ButtonAction var1
   ) {
      return this.BatModClient(
         var1.CustomSpinner()
      );
   }

   public List ButtonAction() {
      ArrayList var1 = new ArrayList();
      if (this.BatModClient() == null) {
         return var1;
      }

      JsonObject var2 = this.Checkbox();
      if (var2 == null) {
         return var1;
      }

      if (!var2.has("accounts")) {
         return var1;
      }

      for (Entry var4 : var2.getAsJsonObject("accounts").entrySet()) {
         try {
            JsonObject var5 = ((JsonElement)var4.getValue()).getAsJsonObject();
            if (var5.has("accessToken")
               && var5.has("legacy")
               && var5.has("localId")
               && var5.has("minecraftProfile")
               && var5.has("remoteId")
               && var5.has("type")
               && var5.has("username")) {
               JsonObject var6 = var5.getAsJsonObject("minecraftProfile");
               if (var6.has("id") && var6.has("name")) {
                  BatModProgressBar var7 = new BatModProgressBar(
                     UUIDTypeAdapter.fromString(var6.get("id").getAsString()), var6.get("name").getAsString()
                  );
                  ProgressBar var8 = ProgressBar.valueOf(
                     var5.get("type").getAsString().toUpperCase(Locale.ROOT)
                  );
                  ButtonAction var9 = new ButtonAction(
                     var5.get("accessToken").getAsString(),
                     var5.get("legacy").getAsBoolean(),
                     UUIDTypeAdapter.fromString(var5.get("localId").getAsString()),
                     var7,
                     var5.get("remoteId").getAsString(),
                     var8,
                     var5.get("username").getAsString()
                  );
                  var1.add(var9);
               }
            }
         } catch (Exception var10) {
            BatModClient.Button(
               "Skipping bad stored account: " + (String)var4.getKey() + " / " + var4.getValue()
            );
            var10.printStackTrace();
         }
      }

      return var1;
   }

   public boolean BatModClient(List var1) {
      JsonObject var2 = this.Checkbox();
      if (var2 == null) {
         var2 = new JsonObject();
      }

      JsonObject var3 = new JsonObject();

      for (ButtonAction var5 : var1) {
         String var6 = UUIDTypeAdapter.fromUUID(var5.CustomSpinner());
         JsonObject var7 = var3.has(var6) ? var3.getAsJsonObject(var6) : new JsonObject();
         var7.addProperty("accessToken", var5.BatModClient());
         var7.addProperty("legacy", var5.Button());
         var7.addProperty("localId", var6);
         JsonObject var8 = new JsonObject();
         var8.addProperty(
            "id",
            UUIDTypeAdapter.fromUUID(
               var5.ButtonAction()
                  .BatModClient()
            )
         );
         var8.addProperty(
            "name",
            var5.ButtonAction()
               .Button()
         );
         var7.add("minecraftProfile", var8);
         var7.addProperty("remoteId", var5.Spinner());
         var7.addProperty(
            "type",
            var5.Checkbox()
               .BatModClient()
         );
         var7.addProperty("username", var5.ColorChooser());
         if (!var3.has(var6)) {
            var3.add(var6, var7);
         }
      }

      if (var2.has("accounts")) {
         var2.remove("accounts");
      }

      if (var3.entrySet().size() > 0) {
         var2.add("accounts", var3);
      }

      return this.BatModClient(var2);
   }
}
