package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<E> extends Collection<E> {
   @Override
   int size();

   int count(@CompatibleWith("E") @Nullable Object var1);

   @CanIgnoreReturnValue
   int add(@Nullable E var1, int var2);

   @CanIgnoreReturnValue
   @Override
   boolean add(E var1);

   @CanIgnoreReturnValue
   int remove(@CompatibleWith("E") @Nullable Object var1, int var2);

   @CanIgnoreReturnValue
   @Override
   boolean remove(@Nullable Object var1);

   @CanIgnoreReturnValue
   int setCount(E var1, int var2);

   @CanIgnoreReturnValue
   boolean setCount(E var1, int var2, int var3);

   Set<E> elementSet();

   Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entrySet();

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   default void forEachEntry(ObjIntConsumer<? super E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.entrySet().forEach(var1x -> var1.accept(var1x.getElement(), var1x.getCount()));
   }

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   int hashCode();

   @Override
   String toString();

   @Override
   Iterator<E> iterator();

   @Override
   boolean contains(@Nullable Object var1);

   @Override
   boolean containsAll(Collection<?> var1);

   @CanIgnoreReturnValue
   @Override
   boolean removeAll(Collection<?> var1);

   @CanIgnoreReturnValue
   @Override
   boolean retainAll(Collection<?> var1);

   @Override
   default void forEach(Consumer<? super E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.entrySet().forEach(var1x -> {
         Object var2 = var1x.getElement();
         int var3 = var1x.getCount();

         for (int var4 = 0; var4 < var3; var4++) {
            var1.accept(var2);
         }
      });
   }

   @Override
   default Spliterator<E> spliterator() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CRRRICCRROCOHHOHIICIHORCOORRRH(this);
   }

   interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> {
      E getElement();

      int getCount();

      @Override
      boolean equals(Object var1);

      @Override
      int hashCode();

      @Override
      String toString();
   }
}
