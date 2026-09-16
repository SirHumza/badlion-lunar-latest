package com.moonsworth.lunar.lib.adventure.sound;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.util.ShadyPines;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

abstract class SoundImpl implements Sound {
   static final Sound.Emitter EMITTER_SELF = new Sound.Emitter() {
      @Override
      public String toString() {
         return "SelfSoundEmitter";
      }
   };
   private final Sound.Source source;
   private final float volume;
   private final float pitch;
   private final OptionalLong seed;
   private SoundStop stop;

   SoundImpl(@NotNull Sound.Source var1, float var2, float var3, OptionalLong var4) {
      this.source = var1;
      this.volume = var2;
      this.pitch = var3;
      this.seed = var4;
   }

   @NotNull
   @Override
   public Sound.Source source() {
      return this.source;
   }

   @Override
   public float volume() {
      return this.volume;
   }

   @Override
   public float pitch() {
      return this.pitch;
   }

   @NotNull
   @Override
   public OptionalLong seed() {
      return this.seed;
   }

   @NotNull
   @Override
   public SoundStop asStop() {
      if (this.stop == null) {
         this.stop = SoundStop.namedOnSource(this.name(), this.source());
      }

      return this.stop;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof SoundImpl)) {
         return false;
      }

      SoundImpl var2 = (SoundImpl)var1;
      return this.name().equals(var2.name())
         && this.source == var2.source
         && ShadyPines.equals(this.volume, var2.volume)
         && ShadyPines.equals(this.pitch, var2.pitch)
         && this.seed.equals(var2.seed);
   }

   @Override
   public int hashCode() {
      int var1 = this.name().hashCode();
      var1 = 31 * var1 + this.source.hashCode();
      var1 = 31 * var1 + Float.hashCode(this.volume);
      var1 = 31 * var1 + Float.hashCode(this.pitch);
      return 31 * var1 + this.seed.hashCode();
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("name", this.name()),
         ExaminableProperty.of("source", this.source),
         ExaminableProperty.of("volume", this.volume),
         ExaminableProperty.of("pitch", this.pitch),
         ExaminableProperty.of("seed", this.seed)
      );
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class BuilderImpl implements Sound.Builder {
      private static final float DEFAULT_VOLUME = 1.0F;
      private static final float DEFAULT_PITCH = 1.0F;
      private Key eagerType;
      private Supplier<? extends Sound.Type> lazyType;
      private Sound.Source source = Sound.Source.MASTER;
      private float volume = 1.0F;
      private float pitch = 1.0F;
      private OptionalLong seed = OptionalLong.empty();

      BuilderImpl() {
      }

      BuilderImpl(@NotNull Sound var1) {
         if (var1 instanceof SoundImpl.Eager) {
            this.type(((SoundImpl.Eager)var1).name);
         } else {
            if (!(var1 instanceof SoundImpl.Lazy)) {
               throw new IllegalArgumentException("Unknown sound type " + var1 + ", must be Eager or Lazy");
            }

            this.type(((SoundImpl.Lazy)var1).supplier);
         }

         this.source(var1.source()).volume(var1.volume()).pitch(var1.pitch()).seed(var1.seed());
      }

      @NotNull
      @Override
      public Sound.Builder type(@NotNull Key var1) {
         this.eagerType = Objects.requireNonNull(var1, "type");
         this.lazyType = null;
         return this;
      }

      @NotNull
      @Override
      public Sound.Builder type(@NotNull Sound.Type var1) {
         this.eagerType = Objects.requireNonNull(Objects.requireNonNull(var1, "type").key(), "type.key()");
         this.lazyType = null;
         return this;
      }

      @NotNull
      @Override
      public Sound.Builder type(@NotNull Supplier<? extends Sound.Type> var1) {
         this.lazyType = Objects.requireNonNull(var1, "typeSupplier");
         this.eagerType = null;
         return this;
      }

      @NotNull
      @Override
      public Sound.Builder source(@NotNull Sound.Source var1) {
         this.source = Objects.requireNonNull(var1, "source");
         return this;
      }

      @NotNull
      @Override
      public Sound.Builder source(Sound.Source.@NotNull Provider var1) {
         return this.source(var1.soundSource());
      }

      @NotNull
      @Override
      public Sound.Builder volume(@Range(from = 0L, to = 2147483647L) float var1) {
         this.volume = var1;
         return this;
      }

      @NotNull
      @Override
      public Sound.Builder pitch(@Range(from = -1L, to = 1L) float var1) {
         this.pitch = var1;
         return this;
      }

      @NotNull
      @Override
      public Sound.Builder seed(long var1) {
         this.seed = OptionalLong.of(var1);
         return this;
      }

      @NotNull
      @Override
      public Sound.Builder seed(@NotNull OptionalLong var1) {
         this.seed = Objects.requireNonNull(var1, "seed");
         return this;
      }

      @NotNull
      public Sound build() {
         if (this.eagerType != null) {
            return new SoundImpl.Eager(this.eagerType, this.source, this.volume, this.pitch, this.seed);
         } else if (this.lazyType != null) {
            return new SoundImpl.Lazy(this.lazyType, this.source, this.volume, this.pitch, this.seed);
         } else {
            throw new IllegalStateException("A sound type must be provided to build a sound");
         }
      }
   }

   static final class Eager extends SoundImpl {
      final Key name;

      Eager(@NotNull Key var1, @NotNull Sound.Source var2, float var3, float var4, OptionalLong var5) {
         super(var2, var3, var4, var5);
         this.name = var1;
      }

      @NotNull
      @Override
      public Key name() {
         return this.name;
      }
   }

   static final class Lazy extends SoundImpl {
      final Supplier<? extends Sound.Type> supplier;

      Lazy(@NotNull Supplier<? extends Sound.Type> var1, @NotNull Sound.Source var2, float var3, float var4, OptionalLong var5) {
         super(var2, var3, var4, var5);
         this.supplier = var1;
      }

      @NotNull
      @Override
      public Key name() {
         return this.supplier.get().key();
      }
   }
}
