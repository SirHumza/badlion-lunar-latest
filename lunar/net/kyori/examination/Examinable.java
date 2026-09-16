package net.kyori.examination;

import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;

public interface Examinable {
   @NotNull
   default String examinableName() {
      return this.getClass().getSimpleName();
   }

   @NotNull
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.empty();
   }

   @NotNull
   default <R> R examine(@NotNull Examiner<R> var1) {
      return (R)var1.examine(this);
   }
}
