package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.moonsworth.lunar.lib.adventure.text.event.DataComponentValue;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface GsonDataComponentValue extends DataComponentValue {
   static GsonDataComponentValue gsonDataComponentValue(@NotNull JsonElement var0) {
      return var0 instanceof JsonNull
         ? GsonDataComponentValueImpl.RemovedGsonComponentValueImpl.INSTANCE
         : new GsonDataComponentValueImpl(Objects.requireNonNull(var0, "data"));
   }

   @NotNull
   JsonElement element();
}
