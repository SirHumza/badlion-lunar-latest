package com.moonsworth.lunar.lib.adventure.text.serializer.gson.impl;

import com.google.auto.service.AutoService;
import com.moonsworth.lunar.lib.adventure.text.serializer.gson.GsonComponentSerializer;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.Services;
import java.util.function.Supplier;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
@AutoService(JSONComponentSerializer.Provider.class)
public final class JSONComponentSerializerProviderImpl implements JSONComponentSerializer.Provider, Services.Fallback {
   @NotNull
   @Override
   public JSONComponentSerializer instance() {
      return GsonComponentSerializer.gson();
   }

   @NotNull
   @Override
   public Supplier<JSONComponentSerializer.Builder> builder() {
      return GsonComponentSerializer::builder;
   }

   @Override
   public String toString() {
      return "JSONComponentSerializerProviderImpl[GsonComponentSerializer]";
   }
}
