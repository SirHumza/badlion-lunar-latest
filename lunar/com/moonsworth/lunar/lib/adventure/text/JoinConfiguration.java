package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import java.util.function.Function;
import java.util.function.Predicate;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.NonExtendable
public interface JoinConfiguration extends Buildable<JoinConfiguration, JoinConfiguration.Builder>, Examinable {
   @NotNull
   static JoinConfiguration.Builder builder() {
      return new JoinConfigurationImpl.BuilderImpl();
   }

   @NotNull
   static JoinConfiguration noSeparators() {
      return JoinConfigurationImpl.NULL;
   }

   @NotNull
   static JoinConfiguration newlines() {
      return JoinConfigurationImpl.STANDARD_NEW_LINES;
   }

   @NotNull
   static JoinConfiguration spaces() {
      return JoinConfigurationImpl.STANDARD_SPACES;
   }

   @NotNull
   static JoinConfiguration commas(boolean var0) {
      return var0 ? JoinConfigurationImpl.STANDARD_COMMA_SPACE_SEPARATED : JoinConfigurationImpl.STANDARD_COMMA_SEPARATED;
   }

   @NotNull
   static JoinConfiguration arrayLike() {
      return JoinConfigurationImpl.STANDARD_ARRAY_LIKE;
   }

   @NotNull
   static JoinConfiguration separator(@Nullable ComponentLike var0) {
      return var0 == null ? JoinConfigurationImpl.NULL : builder().separator(var0).build();
   }

   @NotNull
   static JoinConfiguration separators(@Nullable ComponentLike var0, @Nullable ComponentLike var1) {
      return var0 == null && var1 == null ? JoinConfigurationImpl.NULL : builder().separator(var0).lastSeparator(var1).build();
   }

   @Nullable
   Component prefix();

   @Nullable
   Component suffix();

   @Nullable
   Component separator();

   @Nullable
   Component lastSeparator();

   @Nullable
   Component lastSeparatorIfSerial();

   @NotNull
   Function<ComponentLike, Component> convertor();

   @NotNull
   Predicate<ComponentLike> predicate();

   @NotNull
   Style parentStyle();

   interface Builder extends AbstractBuilder<JoinConfiguration>, Buildable.Builder<JoinConfiguration> {
      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder prefix(@Nullable ComponentLike var1);

      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder suffix(@Nullable ComponentLike var1);

      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder separator(@Nullable ComponentLike var1);

      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder lastSeparator(@Nullable ComponentLike var1);

      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder lastSeparatorIfSerial(@Nullable ComponentLike var1);

      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder convertor(@NotNull Function<ComponentLike, Component> var1);

      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder predicate(@NotNull Predicate<ComponentLike> var1);

      @Contract("_ -> this")
      @NotNull
      JoinConfiguration.Builder parentStyle(@NotNull Style var1);
   }
}
