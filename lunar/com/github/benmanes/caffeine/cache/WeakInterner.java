package com.github.benmanes.caffeine.cache;

final class WeakInterner<E> implements Interner<E> {
   final BoundedLocalCache<E, Boolean> cache = Caffeine.newWeakInterner();

   @Override
   public E intern(E var1) {
      Boolean var3;
      do {
         Object var2 = this.cache.getKey((E)var1);
         if (var2 != null) {
            return (E)var2;
         }

         var3 = this.cache.putIfAbsent((E)var1, Boolean.TRUE);
      } while (var3 != null);

      return (E)var1;
   }
}
