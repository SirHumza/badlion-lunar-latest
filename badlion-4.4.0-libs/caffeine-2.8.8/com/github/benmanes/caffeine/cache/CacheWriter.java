package com.github.benmanes.caffeine.cache;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface CacheWriter<K, V> {
   void write(@NonNull K var1, @NonNull V var2);

   void delete(@NonNull K var1, @Nullable V var2, @NonNull RemovalCause var3);

   static <K, V> @NonNull CacheWriter<K, V> disabledWriter() {
      return DisabledWriter.INSTANCE;
   }
}
