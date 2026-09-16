package com.moonsworth.lunar.client.util;

import java.util.Map;
import java.util.function.Function;

public class OCCCRRHIIOCOIHRIIHOIRRCIORHHHI<M extends Map<K, V>, K, V> {
   private final M map;

   public OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(M var1) {
      this.map = (M)var1;
   }

   public OCCCRRHIIOCOIHRIIHOIRRCIORHHHI<M, K, V> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(K var1, V var2) {
      this.map.put((K)var1, (V)var2);
      return this;
   }

   public OCCCRRHIIOCOIHRIIHOIRRCIORHHHI<M, K, V> ICICIOCHHHIHOCHCOHORIHRCOHHOCR(Map<? extends K, ? extends V> var1) {
      this.map.putAll(var1);
      return this;
   }

   public OCCCRRHIIOCOIHRIIHOIRRCIORHHHI<M, K, V> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(K var1, V var2) {
      this.map.putIfAbsent((K)var1, (V)var2);
      return this;
   }

   public OCCCRRHIIOCOIHRIIHOIRRCIORHHHI<M, K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var1, Function<? super K, ? extends V> var2) {
      this.map.computeIfAbsent((K)var1, var2);
      return this;
   }

   public M OCRHIOHCOIRRORRCRIRICOIHCCOHRC() {
      return this.map;
   }
}
