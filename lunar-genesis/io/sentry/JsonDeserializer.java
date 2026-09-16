package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface JsonDeserializer<T> {
   @NotNull
   T deserialize(@NotNull ObjectReader var1, @NotNull ILogger var2);
}
