package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

final class ClickCallbackOptionsImpl implements ClickCallback.Options {
   static final ClickCallback.Options DEFAULT = new ClickCallbackOptionsImpl.BuilderImpl().build();
   private final int uses;
   private final Duration lifetime;

   ClickCallbackOptionsImpl(int var1, Duration var2) {
      this.uses = var1;
      this.lifetime = var2;
   }

   @Override
   public int uses() {
      return this.uses;
   }

   @NotNull
   @Override
   public Duration lifetime() {
      return this.lifetime;
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("uses", this.uses), ExaminableProperty.of("expiration", this.lifetime));
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class BuilderImpl implements ClickCallback.Options.Builder {
      private static final int DEFAULT_USES = 1;
      private int uses;
      private Duration lifetime;

      BuilderImpl() {
         this.uses = 1;
         this.lifetime = ClickCallback.DEFAULT_LIFETIME;
      }

      BuilderImpl(ClickCallback.@NotNull Options var1) {
         this.uses = var1.uses();
         this.lifetime = var1.lifetime();
      }

      public ClickCallback.@NotNull Options build() {
         return new ClickCallbackOptionsImpl(this.uses, this.lifetime);
      }

      @NotNull
      @Override
      public ClickCallback.Options.Builder uses(int var1) {
         this.uses = var1;
         return this;
      }

      @NotNull
      @Override
      public ClickCallback.Options.Builder lifetime(@NotNull TemporalAmount var1) {
         this.lifetime = var1 instanceof Duration ? (Duration)var1 : Duration.from(Objects.requireNonNull(var1, "lifetime"));
         return this;
      }
   }
}
