package com.lunarclient.minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.lunarclient.Constants;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;

public final class MinecraftUUID {
   private static final String MOJANG_UUID_URL = "https://api.minecraftservices.com/minecraft/profile/lookup/name/";

   @Nullable
   public static String getSync(String var0) {
      return getAsync(var0).join();
   }

   public static CompletableFuture<@Nullable String> getAsync(String var0) {
      HttpClient var1 = HttpClient.newHttpClient();
      CompletableFuture var2 = new CompletableFuture();
      HttpRequest var3 = HttpRequest.newBuilder()
         .uri(URI.create("https://api.minecraftservices.com/minecraft/profile/lookup/name/" + var0))
         .timeout(Duration.ofSeconds(10L))
         .GET()
         .build();
      Consumer var4 = var1x -> {
         JsonObject var2x;
         try {
            var2x = Constants.GSON.fromJson((String)var1x.body(), JsonObject.class);
         } catch (JsonSyntaxException var6x) {
            var2.complete(null);
            return;
         }

         try {
            JsonElement var3x = var2x.get("id");
            String var4x = var3x.getAsString();
            var2.complete(var4x);
         } catch (NullPointerException | UnsupportedOperationException var5) {
            var2.complete(null);
         }
      };

      try {
         var1.sendAsync(var3, BodyHandlers.ofString()).thenAccept(var4);
      } catch (Exception var6) {
      }

      return var2;
   }

   private MinecraftUUID() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
