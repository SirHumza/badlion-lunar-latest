package com.moonsworth.lunar.lib.adventure.title;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.time.Duration;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

final class TitleImpl implements Title {
   private final Component title;
   private final Component subtitle;
   @Nullable
   private final Title.Times times;

   TitleImpl(@NotNull Component var1, @NotNull Component var2, @Nullable Title.Times var3) {
      this.title = Objects.requireNonNull(var1, "title");
      this.subtitle = Objects.requireNonNull(var2, "subtitle");
      this.times = var3;
   }

   @NotNull
   @Override
   public Component title() {
      return this.title;
   }

   @NotNull
   @Override
   public Component subtitle() {
      return this.subtitle;
   }

   @Nullable
   @Override
   public Title.Times times() {
      return this.times;
   }

   @Override
   public <T> @UnknownNullability T part(@NotNull TitlePart<T> var1) {
      Objects.requireNonNull(var1, "part");
      if (var1 == TitlePart.TITLE) {
         return (T)this.title;
      } else if (var1 == TitlePart.SUBTITLE) {
         return (T)this.subtitle;
      } else if (var1 == TitlePart.TIMES) {
         return (T)this.times;
      } else {
         throw new IllegalArgumentException("Don't know what " + var1 + " is.");
      }
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         TitleImpl var2 = (TitleImpl)var1;
         return this.title.equals(var2.title) && this.subtitle.equals(var2.subtitle) && Objects.equals(this.times, var2.times);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.title.hashCode();
      var1 = 31 * var1 + this.subtitle.hashCode();
      return 31 * var1 + Objects.hashCode(this.times);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("title", this.title), ExaminableProperty.of("subtitle", this.subtitle), ExaminableProperty.of("times", this.times));
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static class TimesImpl implements Title.Times {
      private final Duration fadeIn;
      private final Duration stay;
      private final Duration fadeOut;

      TimesImpl(@NotNull Duration var1, @NotNull Duration var2, @NotNull Duration var3) {
         this.fadeIn = Objects.requireNonNull(var1, "fadeIn");
         this.stay = Objects.requireNonNull(var2, "stay");
         this.fadeOut = Objects.requireNonNull(var3, "fadeOut");
      }

      @NotNull
      @Override
      public Duration fadeIn() {
         return this.fadeIn;
      }

      @NotNull
      @Override
      public Duration stay() {
         return this.stay;
      }

      @NotNull
      @Override
      public Duration fadeOut() {
         return this.fadeOut;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof TitleImpl.TimesImpl)) {
            return false;
         }

         TitleImpl.TimesImpl var2 = (TitleImpl.TimesImpl)var1;
         return this.fadeIn.equals(var2.fadeIn) && this.stay.equals(var2.stay) && this.fadeOut.equals(var2.fadeOut);
      }

      @Override
      public int hashCode() {
         int var1 = this.fadeIn.hashCode();
         var1 = 31 * var1 + this.stay.hashCode();
         return 31 * var1 + this.fadeOut.hashCode();
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(
            ExaminableProperty.of("fadeIn", this.fadeIn), ExaminableProperty.of("stay", this.stay), ExaminableProperty.of("fadeOut", this.fadeOut)
         );
      }

      @Override
      public String toString() {
         return Internals.toString(this);
      }
   }
}
