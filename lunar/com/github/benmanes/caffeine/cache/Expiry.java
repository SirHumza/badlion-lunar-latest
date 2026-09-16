package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.index.qual.NonNegative;

public interface Expiry<K, V> {
   long expireAfterCreate(K var1, V var2, long var3);

   long expireAfterUpdate(K var1, V var2, long var3, @NonNegative long var5);

   long expireAfterRead(K var1, V var2, long var3, @NonNegative long var5);
}
