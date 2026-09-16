package com.lunarclient.minecraft.hypixel;

import com.google.gson.reflect.TypeToken;
import com.lunarclient.AbstractApiUtil;
import com.lunarclient.ApiUtils;
import com.lunarclient.player.PlayerResponse;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public class HypixelPlayerUtil extends AbstractApiUtil {
   @Nullable
   public static PlayerResponse getPlayerSync(String var0) {
      return getPlayerAsync(var0).join();
   }

   public static CompletableFuture<@Nullable PlayerResponse> getPlayerAsync(String var0) {
      return getObjectAsync(TypeToken.get(PlayerResponse.class), getPlayerStringAsync(var0));
   }

   @Nullable
   public static String getPlayerStringSync(String var0) {
      return getPlayerStringAsync(var0).join();
   }

   public static CompletableFuture<@Nullable String> getPlayerStringAsync(String var0) {
      return ApiUtils.getApiResponseWeirdParam("https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/player", var0);
   }
}
