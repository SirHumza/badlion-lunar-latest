import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.mojang.util.UUIDTypeAdapter;
import com.sun.webkit.network.CookieManager;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebView;
import javafx.scene.web.WebHistory.Entry;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;

public class TextField
   extends ColorChooser {
   private static final String ButtonAction = "00000000402b5328";
   private static boolean Spinner;
   private static BatModInstallerMain Checkbox;
   private aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA ProgressBar;
   private IntegerSpinner BatModProgressBar;
   private boolean ColorChooser;

   public TextField(
      aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA var1
   ) {
      this.ProgressBar = var1;
   }

   public TextField(
      ButtonAction var1
   ) {
      super(var1);
   }

   @Override
   public void BatModClient(
      IntegerSpinner var1
   ) {
      this.BatModProgressBar = var1;
      this.ColorChooser = false;
      if (!Spinner) {
         Spinner = true;
         new JFXPanel();
         Platform.setImplicitExit(false);
      }

      Platform.runLater(
         () -> {
            Checkbox = new BatModInstallerMain(
               this.ProgressBar
            );
            Checkbox.BatModClient(
               this.Button()
            );
         }
      );
   }

   @Override
   public void Button(
      IntegerSpinner var1
   ) {
      this.BatModProgressBar = var1;

      try {
         JsonObject var2 = new JsonObject();
         var2.addProperty(
            "Authorization",
            "Bearer "
               + this.CustomSpinner
                  .BatModClient()
         );
         HttpResponse var3 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.CustomSpinner(
            "https://api.minecraftservices.com/minecraft/profile", var2
         );
         int var4 = var3.getStatusLine().getStatusCode();
         if (var4 >= 200 && var4 < 300) {
            var1.BatModClient(
               this.CustomSpinner, null
            );
         } else {
            this.ColorChooser = true;
            String var5 = BatModClient.BatModClient()
               .IntegerSpinner()
               .BatModClient()
               .Button(
                  this.CustomSpinner
                     .Spinner()
               );

            try {
               this.BatModClient(var5);
            } catch (IOException var7) {
               var7.printStackTrace();
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         var1.BatModClient(var8.getMessage());
      }
   }

   public void BatModClient() {
      if (Spinner) {
         Platform.runLater(
            () -> Checkbox.BatModClient()
         );
      }
   }

   private WebView Button() {
      CookieHandler.setDefault(new CookieManager());
      WebView var1 = new WebView();
      var1.getEngine().setUserAgent("Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0");
      var1.getEngine().setJavaScriptEnabled(true);
      var1.setContextMenuEnabled(false);
      var1.setPrefWidth(1000.0);
      var1.setPrefHeight(650.0);
      var1.getEngine()
         .getHistory()
         .getEntries()
         .addListener(
            var1x -> {
               if (var1x.next() && var1x.wasAdded()) {
                  for (Entry var3 : var1x.getAddedSubList()) {
                     String var4 = var3.getUrl();
                     if (var4.startsWith("https://login.live.com/oauth20_desktop.srf?error=")) {
                        Map var5 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.ButtonAction(
                           var4
                        );
                        String var6 = (String)((List)var5.get("error")).get(0);
                        String var7 = null;
                        if (var5.containsKey("error_description")) {
                           var7 = (String)((List)var5.get("error_description")).get(0);
                           if (var7.equals("The user has denied access to the scope requested by the client application.")) {
                              this.BatModProgressBar
                                 .BatModClient();
                              return;
                           }
                        }

                        String var8 = var6 + (var7 != null ? ": " + var7 : "");
                        this.BatModProgressBar
                           .BatModClient(var8);
                        BatModClient.Button(
                           "Microsoft login returned an error: " + var8
                        );
                     }

                     if (var4.startsWith("https://login.live.com/oauth20_desktop.srf?code=")) {
                        this.BatModProgressBar
                           .BatModClient();
                        String var10 = var3.getUrl().substring(var3.getUrl().indexOf("=") + 1, var3.getUrl().indexOf("&"));

                        try {
                           this.BatModClient(var10);
                        } catch (IOException var9) {
                           var9.printStackTrace();
                        }
                     }
                  }
               }
            }
         );
      var1.getEngine()
         .load(
            "https://login.live.com/oauth20_authorize.srf?client_id=00000000402b5328&response_type=code&scope=service%3A%3Auser.auth.xboxlive.com%3A%3AMBI_SSL&redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf"
         );
      return var1;
   }

   private void BatModClient(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("Content-Type", ContentType.APPLICATION_FORM_URLENCODED.getMimeType());
      var2.addProperty("Accept", ContentType.APPLICATION_JSON.getMimeType());
      JsonObject var3 = new JsonObject();
      var3.addProperty("client_id", "00000000402b5328");
      var3.addProperty(
         this.ColorChooser ? "refresh_token" : "code", var1
      );
      var3.addProperty(
         "grant_type",
         this.ColorChooser ? "refresh_token" : "authorization_code"
      );
      var3.addProperty("redirect_uri", "https://login.live.com/oauth20_desktop.srf");
      var3.addProperty("scope", "service::user.auth.xboxlive.com::MBI_SSL");
      HttpResponse var4 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.CustomSpinner(
         "https://login.live.com/oauth20_token.srf", var2, var3
      );
      int var5 = var4.getStatusLine().getStatusCode();
      if (var5 >= 200 && var5 < 300) {
         JsonObject var6 = new JsonParser()
            .parse(
               nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
                  var4
               )
            )
            .getAsJsonObject();
         String var7 = var6.get("access_token").getAsString();
         this.Button(var7);
      } else {
         this.BatModProgressBar
            .BatModClient("Status Code: " + var5);
      }
   }

   private void Button(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
      var2.addProperty("Accept", ContentType.APPLICATION_JSON.getMimeType());
      JsonObject var3 = new JsonObject();
      JsonObject var4 = new JsonObject();
      var4.addProperty("AuthMethod", "RPS");
      var4.addProperty("SiteName", "user.auth.xboxlive.com");
      var4.addProperty("RpsTicket", var1);
      var3.add("Properties", var4);
      var3.addProperty("RelyingParty", "http://auth.xboxlive.com");
      var3.addProperty("TokenType", "JWT");
      HttpResponse var5 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
         "https://user.auth.xboxlive.com/user/authenticate", var2, var3, ContentType.APPLICATION_JSON
      );
      int var6 = var5.getStatusLine().getStatusCode();
      if (var6 >= 200 && var6 < 300) {
         JsonObject var7 = new JsonParser()
            .parse(
               nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
                  var5
               )
            )
            .getAsJsonObject();
         String var8 = var7.get("Token").getAsString();
         this.CustomSpinner(var8);
      } else {
         this.BatModProgressBar
            .BatModClient("Status Code: " + var6);
      }
   }

   private void CustomSpinner(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("Content-Type", "application/json");
      var2.addProperty("Accept", "application/json");
      JsonObject var3 = new JsonObject();
      JsonObject var4 = new JsonObject();
      var4.addProperty("SandboxId", "RETAIL");
      JsonArray var5 = new JsonArray();
      var5.add(new JsonPrimitive(var1));
      var4.add("UserTokens", var5);
      var3.add("Properties", var4);
      var3.addProperty("RelyingParty", "rp://api.minecraftservices.com/");
      var3.addProperty("TokenType", "JWT");
      HttpResponse var6 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
         "https://xsts.auth.xboxlive.com/xsts/authorize", var2, var3, ContentType.APPLICATION_JSON
      );
      int var7 = var6.getStatusLine().getStatusCode();
      if (var7 >= 200 && var7 < 300) {
         JsonObject var13 = new JsonParser()
            .parse(
               nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
                  var6
               )
            )
            .getAsJsonObject();
         String var14 = var13.get("Token").getAsString();
         JsonObject var10 = var13.getAsJsonObject("DisplayClaims");
         JsonArray var11 = var10.getAsJsonArray("xui");
         String var12 = var11.get(0).getAsJsonObject().get("uhs").getAsString();
         this.BatModClient(var12, var14);
      } else if (var7 == 401) {
         JsonObject var8 = new JsonParser()
            .parse(
               nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
                  var6
               )
            )
            .getAsJsonObject();
         String var9 = var8.get("XErr").getAsString();
         if (var9.equals("2148916233")) {
            this.BatModProgressBar
               .BatModClient(
                  rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "bm.accountmanager.error.xbox.missing"
                  )
               );
         } else if (var9.equals("2148916238")) {
            this.BatModProgressBar
               .BatModClient(
                  rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "bm.accountmanager.error.xbox.minor"
                  )
               );
         }

         BatModClient.Button(
            "Microsoft login returned an error (xsts): " + var9
         );
      } else {
         this.BatModProgressBar
            .BatModClient("Status Code: " + var7);
      }
   }

   private void BatModClient(String var1, String var2) {
      JsonObject var3 = new JsonObject();
      var3.addProperty("Content-Type", "application/json");
      var3.addProperty("Accept", "application/json");
      JsonObject var4 = new JsonObject();
      var4.addProperty("identityToken", "XBL3.0 x=" + var1 + ";" + var2);
      HttpResponse var5 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
         "https://api.minecraftservices.com/authentication/login_with_xbox", var3, var4, ContentType.APPLICATION_JSON
      );
      int var6 = var5.getStatusLine().getStatusCode();
      if (var6 >= 200 && var6 < 300) {
         JsonObject var7 = new JsonParser()
            .parse(
               nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
                  var5
               )
            )
            .getAsJsonObject();
         String var8 = var7.get("access_token").getAsString();
         this.ButtonAction(var8);
      } else {
         this.BatModProgressBar
            .BatModClient("Status Code: " + var6);
      }
   }

   private void ButtonAction(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("Authorization", "Bearer " + var1);
      HttpResponse var3 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.CustomSpinner(
         "https://api.minecraftservices.com/entitlements/mcstore", var2
      );
      int var4 = var3.getStatusLine().getStatusCode();
      if (var4 >= 200 && var4 < 300) {
         boolean var5 = false;
         String var6 = null;
         JsonObject var7 = new JsonParser()
            .parse(
               nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
                  var3
               )
            )
            .getAsJsonObject();

         for (JsonElement var10 : var7.getAsJsonArray("items")) {
            JsonObject var11 = var10.getAsJsonObject();
            if (var11.has("name") && (var11.get("name").getAsString().equals("game_minecraft") || var11.get("name").getAsString().equals("product_minecraft"))) {
               var5 = true;

               try {
                  JsonObject var12 = new JsonParser()
                     .parse(new String(Base64.getDecoder().decode(var11.get("signature").getAsString().split("\\.")[1])))
                     .getAsJsonObject();
                  var6 = var12.get("signerId").getAsString();
               } catch (Exception var13) {
               }
            }
         }

         if (var5) {
            if (var6 != null) {
               this.Button(var1, var6);
            } else {
               this.BatModProgressBar
                  .BatModClient(
                     rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                        "bm.accountmanager.error.missing_signature"
                     )
                  );
            }
         } else {
            this.BatModProgressBar
               .BatModClient(
                  rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "bm.accountmanager.error.missing_game"
                  )
               );
         }
      } else {
         this.BatModProgressBar
            .BatModClient("Status Code: " + var4);
      }
   }

   private void Button(String var1, String var2) {
      JsonObject var3 = new JsonObject();
      var3.addProperty("Authorization", "Bearer " + var1);
      HttpResponse var4 = nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.CustomSpinner(
         "https://api.minecraftservices.com/minecraft/profile", var3
      );
      int var5 = var4.getStatusLine().getStatusCode();
      if (var5 >= 200 && var5 < 300) {
         JsonObject var6 = new JsonParser()
            .parse(
               nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
                  var4
               )
            )
            .getAsJsonObject();
         if (this.ColorChooser) {
            this.CustomSpinner
               .BatModClient(var1);
            this.BatModProgressBar
               .BatModClient(
                  this.CustomSpinner, null
               );
         } else {
            this.BatModProgressBar
               .BatModClient(
                  new ButtonAction(
                     var1,
                     false,
                     UUID.randomUUID(),
                     new BatModProgressBar(
                        UUIDTypeAdapter.fromString(var6.get("id").getAsString()), var6.get("name").getAsString()
                     ),
                     var2,
                     ProgressBar.Button,
                     var6.get("name").getAsString()
                  ),
                  rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                     "bm.accountmanager.added_account"
                  )
               );
         }
      } else {
         this.BatModProgressBar
            .BatModClient(
               rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "bm.accountmanager.error.missing_game"
               )
            );
      }
   }
}
