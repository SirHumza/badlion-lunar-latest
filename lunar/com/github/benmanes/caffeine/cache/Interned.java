package com.github.benmanes.caffeine.cache;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Objects;

final class Interned<K, V> extends Node<K, V> implements NodeFactory<K, V> {
   static final NodeFactory<Object, Object> FACTORY = new Interned<>();
   volatile Reference<?> keyReference;

   Interned() {
   }

   Interned(Reference<K> var1) {
      this.keyReference = var1;
   }

   @Override
   public K getKey() {
      return (K)this.keyReference.get();
   }

   @Override
   public Object getKeyReference() {
      return this.keyReference;
   }

   @Override
   public V getValue() {
      return (V)Boolean.TRUE;
   }

   @Override
   public V getValueReference() {
      return (V)Boolean.TRUE;
   }

   @Override
   public void setValue(V var1, ReferenceQueue<V> var2) {
   }

   @Override
   public boolean containsValue(Object var1) {
      return Objects.equals(var1, this.getValue());
   }

   @Override
   public Node<K, V> newNode(K var1, ReferenceQueue<K> var2, V var3, ReferenceQueue<V> var4, int var5, long var6) {
      return new Interned<>(new References.WeakKeyEqualsReference<>((K)var1, var2));
   }

   @Override
   public Node<K, V> newNode(Object var1, V var2, ReferenceQueue<V> var3, int var4, long var5) {
      return new Interned<>((Reference<K>)var1);
   }

   @Override
   public Object newLookupKey(Object var1) {
      return new References.LookupKeyEqualsReference<>(var1);
   }

   @Override
   public Object newReferenceKey(K var1, ReferenceQueue<K> var2) {
      return new References.WeakKeyEqualsReference<>(var1, var2);
   }

   @Override
   public boolean isAlive() {
      Reference var1 = this.keyReference;
      return var1 != RETIRED_WEAK_KEY && var1 != DEAD_WEAK_KEY;
   }

   @Override
   public boolean isRetired() {
      return this.keyReference == RETIRED_WEAK_KEY;
   }

   @Override
   public void retire() {
      Reference var1 = this.keyReference;
      this.keyReference = RETIRED_WEAK_KEY;
      var1.clear();
   }

   @Override
   public boolean isDead() {
      return this.keyReference == DEAD_WEAK_KEY;
   }

   @Override
   public void die() {
      Reference var1 = this.keyReference;
      this.keyReference = DEAD_WEAK_KEY;
      var1.clear();
   }
}
