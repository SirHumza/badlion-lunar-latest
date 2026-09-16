package com.lunarclient.apollo.option.config;

import lombok.NonNull;
import org.spongepowered.configurate.serialize.TypeSerializer;
import org.spongepowered.configurate.serialize.TypeSerializerCollection;
import org.spongepowered.configurate.serialize.TypeSerializerCollection.Builder;

public final class Serializers {
   private static final Builder builder = TypeSerializerCollection.builder();

   public static <T> void register(@NonNull Class<T> var0, @NonNull TypeSerializer<T> var1) {
      if (var0 == null) {
         throw new NullPointerException("type is marked non-null but is null");
      }

      if (var1 == null) {
         throw new NullPointerException("serializer is marked non-null but is null");
      }

      builder.register(var0, var1);
   }

   public static TypeSerializerCollection serializers() {
      return builder.build();
   }

   private Serializers() {
   }
}
