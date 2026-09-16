package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface RCCICOCCCHROHOCCHIHORIHHCOHOHH<R, C, V> {
   boolean contains(@CompatibleWith("R") @Nullable Object var1, @CompatibleWith("C") @Nullable Object var2);

   boolean containsRow(@CompatibleWith("R") @Nullable Object var1);

   boolean containsColumn(@CompatibleWith("C") @Nullable Object var1);

   boolean containsValue(@CompatibleWith("V") @Nullable Object var1);

   @Nullable V get(@CompatibleWith("R") @Nullable Object var1, @CompatibleWith("C") @Nullable Object var2);

   boolean isEmpty();

   int size();

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   int hashCode();

   void clear();

   @CanIgnoreReturnValue
   @Nullable V put(R var1, C var2, V var3);

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCICOCCCHROHOCCHIHORIHHCOHOHH<? extends R, ? extends C, ? extends V> var1);

   @CanIgnoreReturnValue
   @Nullable V remove(@CompatibleWith("R") @Nullable Object var1, @CompatibleWith("C") @Nullable Object var2);

   Map<C, V> row(R var1);

   Map<R, V> column(C var1);

   Set<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSet();

   Set<R> rowKeySet();

   Set<C> columnKeySet();

   Collection<V> values();

   Map<R, Map<C, V>> rowMap();

   Map<C, Map<R, V>> columnMap();

   interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V> {
      @Nullable R getRowKey();

      @Nullable C getColumnKey();

      @Nullable V getValue();

      @Override
      boolean equals(@Nullable Object var1);

      @Override
      int hashCode();
   }
}
