package com.moonsworth.lunar.lib.adventure.internal.properties;

import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.util.Objects;
import java.util.function.Function;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class AdventureProperties {
   public static final AdventureProperties.Property<Boolean> DEBUG = property("debug", Boolean::parseBoolean, false);
   public static final AdventureProperties.Property<String> DEFAULT_TRANSLATION_LOCALE = property("defaultTranslationLocale", Function.identity(), null);
   public static final AdventureProperties.Property<Boolean> SERVICE_LOAD_FAILURES_ARE_FATAL = property(
      "serviceLoadFailuresAreFatal", Boolean::parseBoolean, Boolean.TRUE, false
   );
   public static final AdventureProperties.Property<Boolean> TEXT_WARN_WHEN_LEGACY_FORMATTING_DETECTED = property(
      "text.warnWhenLegacyFormattingDetected", Boolean::parseBoolean, Boolean.FALSE
   );
   public static final AdventureProperties.Property<Integer> DEFAULT_FLATTENER_NESTING_LIMIT = property("defaultFlattenerNestingLimit", Integer::parseInt, -1);

   private AdventureProperties() {
   }

   @NotNull
   public static <T> AdventureProperties.Property<T> property(@NotNull String var0, @NotNull Function<String, T> var1, @Nullable T var2) {
      return property(var0, var1, (T)var2, true);
   }

   @NotNull
   public static <T> AdventureProperties.Property<T> property(@NotNull String var0, @NotNull Function<String, T> var1, @Nullable T var2, boolean var3) {
      return AdventurePropertiesImpl.property(var0, var1, (T)var2, var3);
   }

   @PlatformAPI
   @ApiStatus.Internal
   public interface DefaultOverrideProvider {
      @Nullable
      <T> T overrideDefault(@NotNull AdventureProperties.Property<T> var1, @Nullable T var2);
   }

   @ApiStatus.Internal
   @ApiStatus.NonExtendable
   public interface Property<T> {
      @Nullable
      T value();

      @NotNull
      default T valueOr(@NotNull T var1) {
         Object var2 = this.value();
         return (T)(var2 == null ? Objects.requireNonNull((T)var1, "defaultValue") : var2);
      }
   }
}
