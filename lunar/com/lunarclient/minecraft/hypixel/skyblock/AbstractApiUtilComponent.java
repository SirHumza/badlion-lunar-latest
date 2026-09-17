package com.lunarclient.minecraft.hypixel.skyblock;

import com.google.gson.reflect.TypeToken;
import com.lunarclient.AbstractApiUtil;
import com.lunarclient.ApiUtils;
import com.lunarclient.items.ItemsResponse;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public final class SkyBlockItemsUtil extends AbstractApiUtil {
   @Nullable
   public static ItemsResponse getItemsSync() {
      return getItemsAsync().join();
   }

   public static CompletableFuture<@Nullable ItemsResponse> getItemsAsync() {
      return getObjectAsync(TypeToken.get(ItemsResponse.class), getItemsStringAsync());
   }

   @Nullable
   public static String getItemsStringSync() {
      return getItemsStringAsync().join();
   }

   public static CompletableFuture<@Nullable String> getItemsStringAsync() {
      return ApiUtils.getApiResponseStringAsync("https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/items");
   }

   private SkyBlockItemsUtil() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
