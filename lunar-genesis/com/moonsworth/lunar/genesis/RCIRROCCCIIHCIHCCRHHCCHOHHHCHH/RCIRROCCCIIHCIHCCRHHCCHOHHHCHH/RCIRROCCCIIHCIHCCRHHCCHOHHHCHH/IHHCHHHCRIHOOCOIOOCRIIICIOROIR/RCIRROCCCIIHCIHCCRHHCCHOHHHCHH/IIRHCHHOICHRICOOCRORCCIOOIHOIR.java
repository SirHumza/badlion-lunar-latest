package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   private IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
   }

   public static <V> AtomicReference<V> newReference() {
      return new AtomicReference<>();
   }

   public static <V> AtomicReference<V> newReference(@Nullable V var0) {
      return new AtomicReference<>((V)var0);
   }

   public static <E> AtomicReferenceArray<E> newReferenceArray(int var0) {
      return new AtomicReferenceArray<>(var0);
   }

   public static <E> AtomicReferenceArray<E> newReferenceArray(E[] var0) {
      return new AtomicReferenceArray<>((E[])var0);
   }
}
