package com.lunarclient.minecraft.hypixel.skyblock;

import com.lunarclient.AbstractApiUtil;
import com.lunarclient.ApiUtils;
import com.lunarclient.RequestParameter;
import com.lunarclient.profiles.MaskedProfileResponse;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public class SkyBlockProfileUtil extends AbstractApiUtil {
   @Nullable
   public static MaskedProfileResponse getProfileSync(String var0, String var1) {
      return getProfileAsync(var0, var1).join();
   }

   public static CompletableFuture<@Nullable MaskedProfileResponse> getProfileAsync(String var0, String var1) {
      return getBetterJsonAsync(MaskedProfileResponse::new, getProfileStringAsync(var0, var1));
   }

   @Nullable
   public static String getProfileStringSync(String var0, String var1) {
      return getProfileStringAsync(var0, var1).join();
   }

   public static CompletableFuture<@Nullable String> getProfileStringAsync(String var0, String var1) {
      return ApiUtils.getApiResponseStringAsync(
         "https://thirdpartycache.lunarclientprod.com/hypixel/skyblock/profile",
         new RequestParameter("profileId", var0),
         new RequestParameter("playerUuid", var1)
      );
   }
}
