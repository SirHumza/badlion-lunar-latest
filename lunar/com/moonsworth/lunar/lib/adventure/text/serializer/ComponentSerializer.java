package com.moonsworth.lunar.lib.adventure.text.serializer;

import com.moonsworth.lunar.lib.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ComponentSerializer<I extends Component, O extends Component, R> extends ComponentDecoder<R, O>, ComponentEncoder<I, R> {
   @NotNull
   @Override
   O deserialize(@NotNull R var1);

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   @Contract(value = "!null -> !null; null -> null", pure = true)
   @Nullable
   default O deseializeOrNull(@Nullable R var1) {
      return ComponentDecoder.super.deserializeOrNull(var1);
   }

   @Contract(value = "!null -> !null; null -> null", pure = true)
   @Nullable
   @Override
   default O deserializeOrNull(@Nullable R var1) {
      return ComponentDecoder.super.deserializeOr(var1, null);
   }

   @Contract(value = "!null, _ -> !null; null, _ -> param2", pure = true)
   @Nullable
   @Override
   default O deserializeOr(@Nullable R var1, @Nullable O var2) {
      return ComponentDecoder.super.deserializeOr(var1, (O)var2);
   }

   @NotNull
   @Override
   R serialize(@NotNull I var1);

   @Contract(value = "!null -> !null; null -> null", pure = true)
   @Nullable
   @Override
   default R serializeOrNull(@Nullable I var1) {
      return this.serializeOr((I)var1, null);
   }

   @Contract(value = "!null, _ -> !null; null, _ -> param2", pure = true)
   @Nullable
   @Override
   default R serializeOr(@Nullable I var1, @Nullable R var2) {
      return (R)(var1 == null ? var2 : this.serialize((I)var1));
   }
}
