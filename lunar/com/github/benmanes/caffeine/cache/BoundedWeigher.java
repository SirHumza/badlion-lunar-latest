package com.github.benmanes.caffeine.cache;

import java.io.Serializable;
import java.util.Objects;

final class BoundedWeigher<K, V> implements Weigher<K, V>, Serializable {
   private static final long serialVersionUID = 1L;
   final Weigher<? super K, ? super V> delegate;

   BoundedWeigher(Weigher<? super K, ? super V> var1) {
      this.delegate = Objects.requireNonNull(var1);
   }

   @Override
   public int weigh(K var1, V var2) {
      int var3 = this.delegate.weigh((K)var1, (V)var2);
      Caffeine.requireArgument(var3 >= 0);
      return var3;
   }

   Object writeReplace() {
      return this.delegate;
   }
}
