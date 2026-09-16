package net.kyori.ansi;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface ANSIComponentRenderer<S> {
   @NotNull
   static <T> ANSIComponentRenderer.ToString<T> toString(@NotNull StyleOps<T> var0) {
      return toString(var0, ColorLevel.compute());
   }

   @NotNull
   static <T> ANSIComponentRenderer.ToString<T> toString(@NotNull StyleOps<T> var0, @NotNull ColorLevel var1) {
      return new ANSIComponentRendererImpl.ToString(var0, var1);
   }

   @NotNull
   static <T> ANSIComponentRenderer.ToStringBuilder<T> toStringBuilder(@NotNull StyleOps<T> var0) {
      return toStringBuilder(var0, ColorLevel.compute());
   }

   @NotNull
   static <T> ANSIComponentRenderer.ToStringBuilder<T> toStringBuilder(@NotNull StyleOps<T> var0, @NotNull ColorLevel var1) {
      return new ANSIComponentRendererImpl.ToStringBuilder(var0, var1);
   }

   @NotNull
   ANSIComponentRenderer<S> pushStyle(@NotNull S var1);

   @NotNull
   ANSIComponentRenderer<S> text(@NotNull String var1);

   @NotNull
   ANSIComponentRenderer<S> popStyle(@NotNull S var1);

   @NotNull
   ANSIComponentRenderer<S> complete();

   interface ToString<S> extends ANSIComponentRenderer<S> {
      @Contract(pure = false)
      @NotNull
      String asString();
   }

   interface ToStringBuilder<S> extends ANSIComponentRenderer<S> {
      void builder(@NotNull StringBuilder var1);

      @Contract(pure = true)
      @NotNull
      StringBuilder builder();
   }
}
