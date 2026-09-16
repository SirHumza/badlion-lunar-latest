package com.lunarclient;

import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractApiUtil {
   protected static <T> CompletableFuture<@Nullable T> getObjectAsync(TypeToken<T> var0, CompletableFuture<String> var1) {
      CompletableFuture var2 = new CompletableFuture();
      Consumer var3 = var2x -> {
         try {
            Object var3x = Constants.GSON.fromJson(var2x, var0);
            var2.complete(var3x);
         } catch (Exception var4) {
            var2.complete(null);
         }
      };
      var1.thenAccept(var3);
      return var2;
   }

   protected static <T> CompletableFuture<@Nullable T> getBetterJsonAsync(Function<BetterJson, T> var0, CompletableFuture<String> var1) {
      return var1.thenApply(var1x -> {
         if (var1x == null) {
            return null;
         }

         try {
            return (T)var0.apply(new BetterJson(Constants.GSON.fromJson(var1x, JsonElement.class)));
         } catch (Exception var3) {
            return null;
         }
      });
   }
}
