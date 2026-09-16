package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.audience.Audience;
import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.permission.PermissionChecker;
import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.CheckReturnValue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface ClickCallback<T extends Audience> {
   Duration DEFAULT_LIFETIME = Duration.ofHours(12L);
   int UNLIMITED_USES = -1;

   @CheckReturnValue
   @Contract(pure = true)
   @NotNull
   static <W extends Audience, N extends W> ClickCallback<W> widen(
      @NotNull ClickCallback<N> var0, @NotNull Class<N> var1, @Nullable Consumer<? super Audience> var2
   ) {
      return var3 -> {
         if (var1.isInstance(var3)) {
            var0.accept((T)var1.cast(var3));
         } else if (var2 != null) {
            var2.accept(var3);
         }
      };
   }

   @CheckReturnValue
   @Contract(pure = true)
   @NotNull
   static <W extends Audience, N extends W> ClickCallback<W> widen(@NotNull ClickCallback<N> var0, @NotNull Class<N> var1) {
      return widen(var0, var1, null);
   }

   void accept(@NotNull T var1);

   @CheckReturnValue
   @Contract(pure = true)
   @NotNull
   default ClickCallback<T> filter(@NotNull Predicate<T> var1) {
      return this.filter(var1, null);
   }

   @CheckReturnValue
   @Contract(pure = true)
   @NotNull
   default ClickCallback<T> filter(@NotNull Predicate<T> var1, @Nullable Consumer<? super Audience> var2) {
      return var3 -> {
         if (var1.test(var3)) {
            this.accept(var3);
         } else if (var2 != null) {
            var2.accept(var3);
         }
      };
   }

   @CheckReturnValue
   @Contract(pure = true)
   @NotNull
   default ClickCallback<T> requiringPermission(@NotNull String var1) {
      return this.requiringPermission(var1, null);
   }

   @CheckReturnValue
   @Contract(pure = true)
   @NotNull
   default ClickCallback<T> requiringPermission(@NotNull String var1, @Nullable Consumer<? super Audience> var2) {
      return this.filter(var1x -> var1x.getOrDefault(PermissionChecker.POINTER, ClickCallbackInternals.ALWAYS_FALSE).test(var1), var2);
   }

   @ApiStatus.NonExtendable
   interface Options extends Examinable {
      @NotNull
      static ClickCallback.Options.Builder builder() {
         return new ClickCallbackOptionsImpl.BuilderImpl();
      }

      @NotNull
      static ClickCallback.Options.Builder builder(@NotNull ClickCallback.Options var0) {
         return new ClickCallbackOptionsImpl.BuilderImpl(var0);
      }

      int uses();

      @NotNull
      Duration lifetime();

      @ApiStatus.NonExtendable
      interface Builder extends AbstractBuilder<ClickCallback.Options> {
         @NotNull
         ClickCallback.Options.Builder uses(int var1);

         @NotNull
         ClickCallback.Options.Builder lifetime(@NotNull TemporalAmount var1);
      }
   }

   @PlatformAPI
   @ApiStatus.Internal
   interface Provider {
      @NotNull
      ClickEvent create(@NotNull ClickCallback<Audience> var1, @NotNull ClickCallback.Options var2);
   }
}
