package com.lunarclient.apollo.option.config;

import org.spongepowered.configurate.serialize.TypeSerializer;

public interface Serializer {
   default <T> void serializer(Class<T> var1, TypeSerializer<T> var2) {
      Serializers.register(var1, var2);
   }
}
