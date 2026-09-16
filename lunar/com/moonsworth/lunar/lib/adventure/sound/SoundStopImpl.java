package com.moonsworth.lunar.lib.adventure.sound;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class SoundStopImpl implements SoundStop {
   static final SoundStop ALL = new SoundStopImpl(null) {
      @Nullable
      @Override
      public Key sound() {
         return null;
      }
   };
   private final Sound.@Nullable Source source;

   SoundStopImpl(Sound.@Nullable Source var1) {
      this.source = var1;
   }

   @Override
   public Sound.@Nullable Source source() {
      return this.source;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof SoundStopImpl)) {
         return false;
      }

      SoundStopImpl var2 = (SoundStopImpl)var1;
      return Objects.equals(this.sound(), var2.sound()) && Objects.equals(this.source, var2.source);
   }

   @Override
   public int hashCode() {
      int var1 = Objects.hashCode(this.sound());
      return 31 * var1 + Objects.hashCode(this.source);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("name", this.sound()), ExaminableProperty.of("source", this.source));
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }
}
