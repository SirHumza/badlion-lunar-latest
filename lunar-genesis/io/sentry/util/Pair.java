package io.sentry.util;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class Pair<A, B> {
   @Nullable
   private final A first;
   @Nullable
   private final B second;

   public Pair(@Nullable A var1, @Nullable B var2) {
      this.first = (A)var1;
      this.second = (B)var2;
   }

   @Nullable
   public A getFirst() {
      return this.first;
   }

   @Nullable
   public B getSecond() {
      return this.second;
   }
}
