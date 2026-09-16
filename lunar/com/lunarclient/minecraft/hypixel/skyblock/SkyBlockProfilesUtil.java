package com.lunarclient.minecraft.hypixel.skyblock;

import com.lunarclient.AbstractApiUtil;
import com.lunarclient.ApiUtils;
import com.lunarclient.generated.SkyblockProfileResponse;
import com.lunarclient.generated.skyblockprofileresponse.Profile;
import com.lunarclient.generated.skyblockprofileresponse.profile.Member;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public final class SkyBlockProfilesUtil extends AbstractApiUtil {
   @Nullable
   public static Member getSelectedProfileMemberSync(String var0) {
      return getSelectedProfileMemberAsync(var0).join();
   }

   public static CompletableFuture<@Nullable Member> getSelectedProfileMemberAsync(String var0) {
      String var1 = var0.replaceAll("-", "");
      return getSelectedProfileAsync(var0).thenApply(var1x -> {
         if (var1x == null) {
            return null;
         }

         try {
            return var1x.members().get(var1);
         } catch (Exception var3) {
            return null;
         }
      });
   }

   @Nullable
   public static Profile getSelectedProfileSync(String var0) {
      return getSelectedProfileAsync(var0).join();
   }

   public static CompletableFuture<@Nullable Profile> getSelectedProfileAsync(String var0) {
      return getProfilesAsync(var0).thenApply(var0x -> {
         if (var0x == null) {
            return null;
         }

         try {
            return var0x.profiles().find(var0xx -> var0xx.selected().orElse(false));
         } catch (Exception var2) {
            return null;
         }
      });
   }

   @Nullable
   public static SkyblockProfileResponse getProfilesSync(String var0) {
      return getProfilesAsync(var0).join();
   }

   public static CompletableFuture<@Nullable SkyblockProfileResponse> getProfilesAsync(String var0) {
      return getBetterJsonAsync(SkyblockProfileResponse::new, getProfilesStringAsync(var0));
   }

   @Nullable
   public static String getProfilesStringSync(String var0) {
      return getProfilesStringAsync(var0).join();
   }

   public static CompletableFuture<@Nullable String> getProfilesStringAsync(String var0) {
      return ApiUtils.getApiResponseWeirdParam("https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/profiles", var0);
   }

   private SkyBlockProfilesUtil() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
