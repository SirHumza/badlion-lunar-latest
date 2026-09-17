package com.moonsworth.lunar.lib.adventure.sound;

import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.Objects;
import java.util.function.Supplier;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.NonExtendable
public interface SoundStop extends Examinable {
   @NotNull
   static SoundStop all() {
      return SoundStopImpl.ALL;
   }

   @NotNull
   static SoundStop named(@NotNull final Key var0) {
      Objects.requireNonNull(var0, "sound");
      return new SoundStopImpl(null) {
         @NotNull
         @Override
         public Key sound() {
            return var0;
         }
      };
   }

   @NotNull
   static SoundStop named(final Sound.@NotNull Type var0) {
      Objects.requireNonNull(var0, "sound");
      return new SoundStopImpl(null) {
         @NotNull
         @Override
         public Key sound() {
            return var0.key();
         }
      };
   }

   @NotNull
   static SoundStop named(@NotNull final Supplier<? extends Sound.Type> var0) {
      Objects.requireNonNull(var0, "sound");
      return new SoundStopImpl(null) {
         @NotNull
         @Override
         public Key sound() {
            return ((Sound.Type)var0.get()).key();
         }
      };
   }

   @NotNull
   static SoundStop source(Sound.@NotNull Source var0) {
      Objects.requireNonNull(var0, "source");
      return new SoundStopImpl(var0) {
         @Nullable
         @Override
         public Key sound() {
            return null;
         }
      };
   }

   @NotNull
   static SoundStop namedOnSource(@NotNull final Key var0, Sound.@NotNull Source var1) {
      Objects.requireNonNull(var0, "sound");
      Objects.requireNonNull(var1, "source");
      return new SoundStopImpl(var1) {
         @NotNull
         @Override
         public Key sound() {
            return var0;
         }
      };
   }

   @NotNull
   static SoundStop namedOnSource(Sound.@NotNull Type var0, Sound.@NotNull Source var1) {
      Objects.requireNonNull(var0, "sound");
      return namedOnSource(var0.key(), var1);
   }

   @NotNull
   static SoundStop namedOnSource(@NotNull final Supplier<? extends Sound.Type> var0, Sound.@NotNull Source var1) {
      Objects.requireNonNull(var0, "sound");
      Objects.requireNonNull(var1, "source");
      return new SoundStopImpl(var1) {
         @NotNull
         @Override
         public Key sound() {
            return ((Sound.Type)var0.get()).key();
         }
      };
   }

   @Nullable
   Key sound();

   Sound.@Nullable Source source();
}
