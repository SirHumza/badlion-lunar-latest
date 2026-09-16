package com.github.benmanes.caffeine.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class StrongInterner<E> implements Interner<E> {
   final ConcurrentMap<E, E> map = new ConcurrentHashMap<>();

   @Override
   public E intern(E var1) {
      Object var2 = this.map.get(var1);
      if (var2 != null) {
         return (E)var2;
      }

      Object var3 = this.map.putIfAbsent((E)var1, (E)var1);
      return (E)(var3 == null ? var1 : var3);
   }
}
