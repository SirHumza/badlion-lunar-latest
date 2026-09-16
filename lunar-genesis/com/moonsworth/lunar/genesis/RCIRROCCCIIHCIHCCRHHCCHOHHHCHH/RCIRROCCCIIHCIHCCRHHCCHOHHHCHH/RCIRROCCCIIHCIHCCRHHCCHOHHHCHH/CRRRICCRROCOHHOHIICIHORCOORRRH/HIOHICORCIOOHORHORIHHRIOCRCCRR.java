package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class HIOHICORCIOOHORHORIHHRIOCRCCRR {
   private static final Collector<Object, ?, Optional<Object>> ROCROCRIOIIRRIIIHIHICHCRICHIOC = Collector.of(
      HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::new,
      HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::add,
      HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::IRCIIHHICIHRCOCRROCOICRIHHCCHH,
      HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::getOptional,
      Characteristics.UNORDERED
   );
   private static final Object CHCOHHHRRIIIHOCCROCOICOIORIHIC = new Object();
   private static final Collector<Object, ?, Object> IIIOCICIRIIOOIIRROOHHCHHCRHCCR = Collector.of(
      HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::new,
      (var0, var1) -> var0.add(var1 == null ? CHCOHHHRRIIIHOCCROCOICOIORIHIC : var1),
      HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::IRCIIHHICIHRCOCRROCOICRIHHCCHH,
      var0 -> {
         Object var1 = var0.getElement();
         return var1 == CHCOHHHRRIIIHOCCROCOICOIORIHIC ? null : var1;
      },
      Characteristics.UNORDERED
   );

   public static <T> Collector<T, ?, Optional<T>> toOptional() {
      return (Collector<T, ?, Optional<T>>)ROCROCRIOIIRRIIIHIHICHCRICHIOC;
   }

   public static <T> Collector<T, ?, T> onlyElement() {
      return (Collector<T, ?, T>)IIIOCICIRIIOOIIRROOHHCHHCRHCCR;
   }

   private HIOHICORCIOOHORHORIHHRIOCRCCRR() {
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      static final int OOIRRHROHICIRRCIORCIHIHCCOCCOR = 4;
      @Nullable Object element = null;
      @Nullable List<Object> extras = null;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      IllegalArgumentException multiples(boolean var1) {
         StringBuilder var2 = new StringBuilder().append("expected one element but was: <").append(this.element);

         for (Object var4 : this.extras) {
            var2.append(", ").append(var4);
         }

         if (var1) {
            var2.append(", ...");
         }

         var2.append('>');
         throw new IllegalArgumentException(var2.toString());
      }

      void add(Object var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (this.element == null) {
            this.element = var1;
         } else if (this.extras == null) {
            this.extras = new ArrayList<>(4);
            this.extras.add(var1);
         } else {
            if (this.extras.size() >= 4) {
               throw this.multiples(true);
            }

            this.extras.add(var1);
         }
      }

      HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         HIOHICORCIOOHORHORIHHRIOCRCCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         if (this.element == null) {
            return var1;
         }

         if (var1.element == null) {
            return this;
         }

         if (this.extras == null) {
            this.extras = new ArrayList<>();
         }

         this.extras.add(var1.element);
         if (var1.extras != null) {
            this.extras.addAll(var1.extras);
         }

         if (this.extras.size() > 4) {
            this.extras.subList(4, this.extras.size()).clear();
            throw this.multiples(true);
         } else {
            return this;
         }
      }

      Optional<Object> getOptional() {
         if (this.extras == null) {
            return Optional.ofNullable(this.element);
         } else {
            throw this.multiples(false);
         }
      }

      Object getElement() {
         if (this.element == null) {
            throw new NoSuchElementException();
         } else if (this.extras == null) {
            return this.element;
         } else {
            throw this.multiples(false);
         }
      }
   }
}
