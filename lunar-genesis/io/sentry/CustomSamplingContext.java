package io.sentry;

import io.sentry.util.Objects;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CustomSamplingContext {
   @NotNull
   private final Map<String, Object> data = new HashMap<>();

   public void set(@NotNull String var1, @Nullable Object var2) {
      Objects.requireNonNull(var1, "key is required");
      this.data.put(var1, var2);
   }

   @Nullable
   public Object get(@NotNull String var1) {
      Objects.requireNonNull(var1, "key is required");
      return this.data.get(var1);
   }

   @NotNull
   public Map<String, Object> getData() {
      return this.data;
   }
}
