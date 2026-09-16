package com.lunarclient.adventure.utils;

public class Duo<K, V> {
   private final K key;
   private final V value;

   public Duo(K var1, V var2) {
      this.key = (K)var1;
      this.value = (V)var2;
   }

   public K key() {
      return this.key;
   }

   public V value() {
      return this.value;
   }

   public static <K, V> Duo<K, V> of(K var0, V var1) {
      return new Duo<>((K)var0, (V)var1);
   }
}
