package com.lunarclient.apollo.common.button;

import com.lunarclient.apollo.player.ApolloPlayer;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public final class ApolloButtonTooltip {
   public static final int MAX_LINES = 100;
   @Nullable
   private final List<Component> lines;
   @Nullable
   private final Function<ApolloPlayer, List<Component>> resolver;
   @Nullable
   private final Duration updateInterval;

   public static ApolloButtonTooltip of(@NonNull Component... var0) {
      if (var0 == null) {
         throw new NullPointerException("lines is marked non-null but is null");
      } else {
         return of(Arrays.asList(var0));
      }
   }

   public static ApolloButtonTooltip of(@NonNull List<Component> var0) {
      if (var0 == null) {
         throw new NullPointerException("lines is marked non-null but is null");
      }

      if (var0.size() > 100) {
         throw new IllegalArgumentException("ApolloButtonTooltip supports at most 100 lines");
      }

      for (Component var2 : var0) {
         if (var2 == null) {
            throw new IllegalArgumentException("ApolloButtonTooltip lines must not contain null");
         }
      }

      return new ApolloButtonTooltip(var0, null, null);
   }

   public static ApolloButtonTooltip live(@NonNull Function<ApolloPlayer, List<Component>> var0, @NonNull Duration var1) {
      if (var0 == null) {
         throw new NullPointerException("resolver is marked non-null but is null");
      } else if (var1 == null) {
         throw new NullPointerException("updateInterval is marked non-null but is null");
      } else if (!var1.isNegative() && !var1.isZero()) {
         return new ApolloButtonTooltip(null, var0, var1);
      } else {
         throw new IllegalArgumentException("ApolloButtonTooltip#updateInterval must be positive");
      }
   }

   private ApolloButtonTooltip(@Nullable List<Component> var1, @Nullable Function<ApolloPlayer, List<Component>> var2, @Nullable Duration var3) {
      this.lines = var1 == null ? null : Collections.unmodifiableList(new ArrayList<>(var1));
      this.resolver = var2;
      this.updateInterval = var3;
   }

   public boolean isLive() {
      return this.resolver != null;
   }

   @Nullable
   @Generated
   public List<Component> getLines() {
      return this.lines;
   }

   @Nullable
   @Generated
   public Function<ApolloPlayer, List<Component>> getResolver() {
      return this.resolver;
   }

   @Nullable
   @Generated
   public Duration getUpdateInterval() {
      return this.updateInterval;
   }
}
