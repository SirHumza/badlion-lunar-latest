package com.lunarclient.minecraft.hypixel.skyblock;

import com.google.gson.reflect.TypeToken;
import com.lunarclient.AbstractApiUtil;
import com.lunarclient.ApiUtils;
import com.lunarclient.election.ElectionResponse;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public final class SkyBlockElectionUtil extends AbstractApiUtil {
   @Nullable
   public static ElectionResponse getElectionSync() {
      return getElectionAsync().join();
   }

   public static CompletableFuture<@Nullable ElectionResponse> getElectionAsync() {
      return getObjectAsync(TypeToken.get(ElectionResponse.class), getElectionStringAsync());
   }

   @Nullable
   public static String getElectionStringSync() {
      return getElectionStringAsync().join();
   }

   public static CompletableFuture<@Nullable String> getElectionStringAsync() {
      return ApiUtils.getApiResponseStringAsync("https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/election");
   }

   private SkyBlockElectionUtil() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
