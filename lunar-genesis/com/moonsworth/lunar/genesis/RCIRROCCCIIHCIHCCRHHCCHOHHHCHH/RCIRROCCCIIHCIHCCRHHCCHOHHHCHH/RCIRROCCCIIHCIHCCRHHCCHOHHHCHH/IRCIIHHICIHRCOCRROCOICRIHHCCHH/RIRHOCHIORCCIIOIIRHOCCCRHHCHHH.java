package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.function.Predicate;
import org.checkerframework.checker.nullness.qual.Nullable;

@FunctionalInterface
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<T> extends Predicate<T> {
   @CanIgnoreReturnValue
   boolean apply(@Nullable T var1);

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   default boolean test(@Nullable T var1) {
      return this.apply((T)var1);
   }
}
