package com.github.benmanes.caffeine.cache;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.Nullable;

final class References {
   private References() {
   }

   interface InternalReference<E> {
      @Nullable E get();

      Object getKeyReference();

      default boolean referenceEquals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         } else if (var1 instanceof References.InternalReference) {
            References.InternalReference var2 = (References.InternalReference)var1;
            return this.get() == var2.get();
         } else {
            return false;
         }
      }

      default boolean objectEquals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (var1 instanceof References.InternalReference) {
            References.InternalReference var2 = (References.InternalReference)var1;
            return Objects.equals(this.get(), var2.get());
         } else {
            return false;
         }
      }
   }

   static final class LookupKeyEqualsReference<K> implements References.InternalReference<K> {
      private final int hashCode;
      private final K key;

      public LookupKeyEqualsReference(K var1) {
         this.hashCode = var1.hashCode();
         this.key = Objects.requireNonNull((K)var1);
      }

      @Override
      public K get() {
         return this.key;
      }

      @Override
      public Object getKeyReference() {
         return this;
      }

      @Override
      public boolean equals(Object var1) {
         return this.objectEquals(var1);
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }

      @Override
      public String toString() {
         return String.format(Locale.US, "%s{key=%s, hashCode=%d}", this.getClass().getSimpleName(), this.get(), this.hashCode);
      }
   }

   static final class LookupKeyReference<K> implements References.InternalReference<K> {
      private final int hashCode;
      private final K key;

      public LookupKeyReference(K var1) {
         this.hashCode = System.identityHashCode(var1);
         this.key = Objects.requireNonNull((K)var1);
      }

      @Override
      public K get() {
         return this.key;
      }

      @Override
      public Object getKeyReference() {
         return this;
      }

      @Override
      public boolean equals(Object var1) {
         return this.referenceEquals(var1);
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }

      @Override
      public String toString() {
         return String.format(Locale.US, "%s{key=%s, hashCode=%d}", this.getClass().getSimpleName(), this.get(), this.hashCode);
      }
   }

   static final class SoftValueReference<V> extends SoftReference<V> implements References.InternalReference<V> {
      private Object keyReference;

      public SoftValueReference(Object var1, @Nullable V var2, @Nullable ReferenceQueue<V> var3) {
         super((V)var2, var3);
         this.keyReference = var1;
      }

      @Override
      public Object getKeyReference() {
         return this.keyReference;
      }

      public void setKeyReference(Object var1) {
         this.keyReference = var1;
      }

      @Override
      public boolean equals(Object var1) {
         return this.referenceEquals(var1);
      }

      @Override
      public int hashCode() {
         Object var1 = this.get();
         return var1 == null ? 0 : var1.hashCode();
      }

      @Override
      public String toString() {
         return String.format(Locale.US, "%s{value=%s}", this.getClass().getSimpleName(), this.get());
      }
   }

   static final class WeakKeyEqualsReference<K> extends WeakReference<K> implements References.InternalReference<K> {
      private final int hashCode;

      public WeakKeyEqualsReference(K var1, @Nullable ReferenceQueue<K> var2) {
         super((K)var1, var2);
         this.hashCode = var1.hashCode();
      }

      @Override
      public Object getKeyReference() {
         return this;
      }

      @Override
      public boolean equals(Object var1) {
         return this.objectEquals(var1);
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }

      @Override
      public String toString() {
         return String.format(Locale.US, "%s{key=%s, hashCode=%d}", this.getClass().getSimpleName(), this.get(), this.hashCode);
      }
   }

   static class WeakKeyReference<K> extends WeakReference<K> implements References.InternalReference<K> {
      private final int hashCode;

      public WeakKeyReference(@Nullable K var1, @Nullable ReferenceQueue<K> var2) {
         super((K)var1, var2);
         this.hashCode = System.identityHashCode(var1);
      }

      @Override
      public Object getKeyReference() {
         return this;
      }

      @Override
      public boolean equals(Object var1) {
         return this.referenceEquals(var1);
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }

      @Override
      public String toString() {
         return String.format(Locale.US, "%s{key=%s, hashCode=%d}", this.getClass().getSimpleName(), this.get(), this.hashCode);
      }
   }

   static final class WeakValueReference<V> extends WeakReference<V> implements References.InternalReference<V> {
      private Object keyReference;

      public WeakValueReference(Object var1, @Nullable V var2, @Nullable ReferenceQueue<V> var3) {
         super((V)var2, var3);
         this.keyReference = var1;
      }

      @Override
      public Object getKeyReference() {
         return this.keyReference;
      }

      public void setKeyReference(Object var1) {
         this.keyReference = var1;
      }

      @Override
      public boolean equals(Object var1) {
         return this.referenceEquals(var1);
      }

      @Override
      public int hashCode() {
         Object var1 = this.get();
         return var1 == null ? 0 : var1.hashCode();
      }

      @Override
      public String toString() {
         return String.format(Locale.US, "%s{value=%s}", this.getClass().getSimpleName(), this.get());
      }
   }
}
