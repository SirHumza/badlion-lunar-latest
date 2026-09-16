package com.moonsworth.lunar.lib.adventure.title;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.util.Ticks;
import java.time.Duration;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;

@ApiStatus.NonExtendable
public interface Title extends Examinable {
   Title.Times DEFAULT_TIMES = Title.Times.times(Ticks.duration(10L), Ticks.duration(70L), Ticks.duration(20L));

   @NotNull
   static Title title(@NotNull Component var0, @NotNull Component var1) {
      return title(var0, var1, DEFAULT_TIMES);
   }

   @NotNull
   static Title title(@NotNull Component var0, @NotNull Component var1, @Nullable Title.Times var2) {
      return new TitleImpl(var0, var1, var2);
   }

   @NotNull
   static Title title(@NotNull Component var0, @NotNull Component var1, int var2, int var3, int var4) {
      return new TitleImpl(var0, var1, Title.Times.times(Ticks.duration(var2), Ticks.duration(var3), Ticks.duration(var4)));
   }

   @NotNull
   Component title();

   @NotNull
   Component subtitle();

   @Nullable
   Title.Times times();

   <T> @UnknownNullability T part(@NotNull TitlePart<T> var1);

   interface Times extends Examinable {
      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      static Title.Times of(@NotNull Duration var0, @NotNull Duration var1, @NotNull Duration var2) {
         return times(var0, var1, var2);
      }

      @NotNull
      static Title.Times times(@NotNull Duration var0, @NotNull Duration var1, @NotNull Duration var2) {
         return new TitleImpl.TimesImpl(var0, var1, var2);
      }

      @NotNull
      Duration fadeIn();

      @NotNull
      Duration stay();

      @NotNull
      Duration fadeOut();
   }
}
