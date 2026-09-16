package com.lunarclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;

public final class ApiUtils {
   public static CompletableFuture<@Nullable String> getApiResponseStringAsync(String var0, RequestParameter... var1) {
      HttpClient var2 = HttpClient.newHttpClient();
      CompletableFuture var3 = new CompletableFuture();
      StringBuilder var4 = new StringBuilder();
      var4.append(var0);

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4.append(var1[var5].getUrlComponent(var5));
      }

      HttpRequest var9 = HttpRequest.newBuilder().uri(URI.create(var4.toString())).timeout(Duration.ofSeconds(10L)).GET().build();
      Consumer var6 = var1x -> var3.complete((String)var1x.body());

      try {
         var2.sendAsync(var9, BodyHandlers.ofString()).thenAccept(var6);
      } catch (Exception var8) {
      }

      return var3;
   }

   public static CompletableFuture<@Nullable String> getApiResponseWeirdParam(String var0, String var1) {
      return getApiResponseStringAsync(var0 + "/" + var1);
   }

   private ApiUtils() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
