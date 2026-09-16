package com.lunarclient.minecraft.hypixel.skyblock;

import com.google.gson.reflect.TypeToken;
import com.lunarclient.AbstractApiUtil;
import com.lunarclient.ApiUtils;
import com.lunarclient.garden.GardenResponse;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public class SkyBlockGardenUtil extends AbstractApiUtil {
   @Nullable
   public static GardenResponse getGardenSync(String var0) {
      return getGardenAsync(var0).join();
   }

   public static CompletableFuture<@Nullable GardenResponse> getGardenAsync(String var0) {
      return getObjectAsync(TypeToken.get(GardenResponse.class), getGardenStringAsync(var0));
   }

   @Nullable
   public static String getGardenStringSync(String var0) {
      return getGardenStringAsync(var0).join();
   }

   public static CompletableFuture<@Nullable String> getGardenStringAsync(String var0) {
      return ApiUtils.getApiResponseWeirdParam("https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/garden", var0);
   }
}
