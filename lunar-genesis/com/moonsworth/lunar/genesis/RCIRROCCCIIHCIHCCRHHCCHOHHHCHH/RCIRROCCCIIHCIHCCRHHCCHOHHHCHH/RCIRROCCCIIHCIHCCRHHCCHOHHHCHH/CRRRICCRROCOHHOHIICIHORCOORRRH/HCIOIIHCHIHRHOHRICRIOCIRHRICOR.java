package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use Maps.difference")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface HCIOIIHCHIHRHOHRICRIOCIRHRICOR<K, V> {
   boolean areEqual();

   Map<K, V> entriesOnlyOnLeft();

   Map<K, V> entriesOnlyOnRight();

   Map<K, V> entriesInCommon();

   Map<K, HCIOIIHCHIHRHOHRICRIOCIRHRICOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>> entriesDiffering();

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   int hashCode();

   @DoNotMock("Use Maps.difference")
   interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> {
      V leftValue();

      V rightValue();

      @Override
      boolean equals(@Nullable Object var1);

      @Override
      int hashCode();
   }
}
