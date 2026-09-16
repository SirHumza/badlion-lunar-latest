package com.moonsworth.lunar.lib.adventure.text.object;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

@ApiStatus.NonExtendable
public interface PlayerHeadObjectContents extends ObjectContents {
   boolean DEFAULT_HAT = true;

   @Nullable
   String name();

   @Nullable
   UUID id();

   @NotNull
   @Unmodifiable List<PlayerHeadObjectContents.ProfileProperty> profileProperties();

   boolean hat();

   @Nullable
   Key texture();

   @Contract(value = "-> new", pure = true)
   @NotNull
   PlayerHeadObjectContents.Builder toBuilder();

   @Contract(value = "_, _ -> new", pure = true)
   static PlayerHeadObjectContents.ProfileProperty property(@NotNull String var0, @NotNull String var1) {
      return new PlayerHeadObjectContentsImpl.ProfilePropertyImpl(Objects.requireNonNull(var0, "name"), Objects.requireNonNull(var1, "value"), null);
   }

   @Contract(value = "_, _, _ -> new", pure = true)
   static PlayerHeadObjectContents.ProfileProperty property(@NotNull String var0, @NotNull String var1, @Nullable String var2) {
      return new PlayerHeadObjectContentsImpl.ProfilePropertyImpl(Objects.requireNonNull(var0, "name"), Objects.requireNonNull(var1, "value"), var2);
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("name", this.name()),
         ExaminableProperty.of("id", this.id()),
         ExaminableProperty.of("profileProperties", this.profileProperties()),
         ExaminableProperty.of("hat", this.hat()),
         ExaminableProperty.of("texture", this.texture())
      );
   }

   interface Builder {
      @Contract("_ -> this")
      @NotNull
      PlayerHeadObjectContents.Builder name(@Nullable String var1);

      @Contract("_ -> this")
      @NotNull
      PlayerHeadObjectContents.Builder id(@Nullable UUID var1);

      @Contract("_ -> this")
      @NotNull
      PlayerHeadObjectContents.Builder profileProperty(@NotNull PlayerHeadObjectContents.ProfileProperty var1);

      @Contract("_ -> this")
      @NotNull
      PlayerHeadObjectContents.Builder profileProperties(@NotNull Collection<PlayerHeadObjectContents.ProfileProperty> var1);

      @Contract("_ -> this")
      @NotNull
      PlayerHeadObjectContents.Builder skin(@NotNull PlayerHeadObjectContents.SkinSource var1);

      @Contract("_ -> this")
      @NotNull
      PlayerHeadObjectContents.Builder hat(boolean var1);

      @Contract("_ -> this")
      @NotNull
      PlayerHeadObjectContents.Builder texture(@Nullable Key var1);

      @Contract(value = "-> new", pure = true)
      @NotNull
      PlayerHeadObjectContents build();
   }

   interface ProfileProperty extends Examinable {
      @NotNull
      String name();

      @NotNull
      String value();

      @Nullable
      String signature();

      @NotNull
      @Override
      default Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(
            ExaminableProperty.of("name", this.name()), ExaminableProperty.of("value", this.value()), ExaminableProperty.of("signature", this.signature())
         );
      }
   }

   interface SkinSource {
      @PlatformAPI
      @ApiStatus.Internal
      void applySkinToPlayerHeadContents(@NotNull PlayerHeadObjectContents.Builder var1);
   }
}
