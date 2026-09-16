package net.kyori.examination;

import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Examiner<R> {
   @NotNull
   default R examine(@NotNull Examinable var1) {
      return this.examine(var1.examinableName(), var1.examinableProperties());
   }

   @NotNull
   R examine(@NotNull String var1, @NotNull Stream<? extends ExaminableProperty> var2);

   @NotNull
   R examine(@Nullable Object var1);

   @NotNull
   R examine(boolean var1);

   @NotNull
   R examine(boolean @Nullable [] var1);

   @NotNull
   R examine(byte var1);

   @NotNull
   R examine(byte @Nullable [] var1);

   @NotNull
   R examine(char var1);

   @NotNull
   R examine(char @Nullable [] var1);

   @NotNull
   R examine(double var1);

   @NotNull
   R examine(double @Nullable [] var1);

   @NotNull
   R examine(float var1);

   @NotNull
   R examine(float @Nullable [] var1);

   @NotNull
   R examine(int var1);

   @NotNull
   R examine(int @Nullable [] var1);

   @NotNull
   R examine(long var1);

   @NotNull
   R examine(long @Nullable [] var1);

   @NotNull
   R examine(short var1);

   @NotNull
   R examine(short @Nullable [] var1);

   @NotNull
   R examine(@Nullable String var1);
}
