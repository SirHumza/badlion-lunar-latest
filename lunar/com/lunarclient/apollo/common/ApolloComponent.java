package com.lunarclient.apollo.common;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.serializer.gson.GsonComponentSerializer;
import com.moonsworth.lunar.lib.adventure.text.serializer.legacy.LegacyComponentSerializer;
import lombok.NonNull;

public final class ApolloComponent {
   public static Component fromJson(@NonNull String var0) {
      if (var0 == null) {
         throw new NullPointerException("json is marked non-null but is null");
      } else {
         return GsonComponentSerializer.gson().deserializeOrNull(var0);
      }
   }

   public static String toJson(@NonNull Component var0) {
      if (var0 == null) {
         throw new NullPointerException("component is marked non-null but is null");
      } else {
         return GsonComponentSerializer.gson().serialize(var0);
      }
   }

   public static String toLegacy(@NonNull Component var0) {
      if (var0 == null) {
         throw new NullPointerException("component is marked non-null but is null");
      } else {
         return LegacyComponentSerializer.legacySection().serialize(var0);
      }
   }

   public static Component fromLegacyAmpersand(@NonNull String var0) {
      if (var0 == null) {
         throw new NullPointerException("legacy is marked non-null but is null");
      } else {
         return LegacyComponentSerializer.legacyAmpersand().deserialize(var0);
      }
   }

   public static String toLegacyAmpersand(@NonNull Component var0) {
      if (var0 == null) {
         throw new NullPointerException("component is marked non-null but is null");
      } else {
         return LegacyComponentSerializer.legacyAmpersand().serialize(var0);
      }
   }

   private ApolloComponent() {
   }
}
