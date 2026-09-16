package com.github.benmanes.caffeine.cache;

@FunctionalInterface
public interface Interner<E> {
   E intern(E var1);

   static <E> Interner<E> newStrongInterner() {
      return new StrongInterner<>();
   }

   static <E> Interner<E> newWeakInterner() {
      return new WeakInterner<>();
   }
}
