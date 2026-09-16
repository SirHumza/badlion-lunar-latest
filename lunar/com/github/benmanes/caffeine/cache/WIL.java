package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.nullness.qual.Nullable;

class WIL<K, V> extends WI<K, V> {
   static final LocalCacheFactory FACTORY = WIL::new;
   final RemovalListener<K, V> removalListener;

   WIL(Caffeine<K, V> var1, @Nullable AsyncCacheLoader<? super K, V> var2, boolean var3) {
      super(var1, var2, var3);
      this.removalListener = var1.getRemovalListener(var3);
   }

   @Override
   public final RemovalListener<K, V> removalListener() {
      return this.removalListener;
   }

   @Override
   protected final boolean hasRemovalListener() {
      return true;
   }
}
