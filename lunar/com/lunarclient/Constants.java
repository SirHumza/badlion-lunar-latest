package com.lunarclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class Constants {
   public static final Gson GSON = new GsonBuilder().serializeNulls().create();
   public static final String HYPIXEL_PROFILES_URL = "https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/profiles";
   public static final String HYPIXEL_GARDEN_URL = "https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/garden";
   public static final String HYPIXEL_MAYOR_URL = "https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/election";
   public static final String HYPIXEL_PLAYER_URL = "https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/player";
   public static final String HYPIXEL_ITEMS_URL = "https://thirdpartycache.lunarclientprod.com/hypixel/ursa-minor/v2/items";
   public static final String HYPIXEL_PROFILE_URL = "https://thirdpartycache.lunarclientprod.com/hypixel/skyblock/profile";

   private Constants() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
