package org.spongepowered.include.com.google.common.collect;

import javax.annotation.Nullable;

class ImmutableMapEntry<K, V> extends ImmutableEntry<K, V> {
   static <K, V> ImmutableMapEntry<K, V>[] createEntryArray(int var0) {
      return new ImmutableMapEntry[var0];
   }

   ImmutableMapEntry(K var1, V var2) {
      super((K)var1, (V)var2);
      CollectPreconditions.checkEntryNotNull(var1, var2);
   }

   @Nullable
   ImmutableMapEntry<K, V> getNextInKeyBucket() {
      return null;
   }

   @Nullable
   ImmutableMapEntry<K, V> getNextInValueBucket() {
      return null;
   }

   boolean isReusable() {
      return true;
   }

   static class NonTerminalImmutableMapEntry<K, V> extends ImmutableMapEntry<K, V> {
      private final transient ImmutableMapEntry<K, V> nextInKeyBucket;

      NonTerminalImmutableMapEntry(K var1, V var2, ImmutableMapEntry<K, V> var3) {
         super((K)var1, (V)var2);
         this.nextInKeyBucket = var3;
      }

      @Nullable
      @Override
      final ImmutableMapEntry<K, V> getNextInKeyBucket() {
         return this.nextInKeyBucket;
      }

      @Override
      final boolean isReusable() {
         return false;
      }
   }
}
