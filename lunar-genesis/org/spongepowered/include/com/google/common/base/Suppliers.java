package org.spongepowered.include.com.google.common.base;

import java.io.Serializable;

public final class Suppliers {
   public static <T> Supplier<T> memoize(Supplier<T> var0) {
      if (!(var0 instanceof Suppliers.NonSerializableMemoizingSupplier) && !(var0 instanceof Suppliers.MemoizingSupplier)) {
         return var0 instanceof Serializable ? new Suppliers.MemoizingSupplier<>(var0) : new Suppliers.NonSerializableMemoizingSupplier<>(var0);
      } else {
         return var0;
      }
   }

   static class MemoizingSupplier<T> implements Serializable, Supplier<T> {
      final Supplier<T> delegate;
      transient volatile boolean initialized;
      transient T value;

      MemoizingSupplier(Supplier<T> var1) {
         this.delegate = Preconditions.checkNotNull(var1);
      }

      @Override
      public T get() {
         if (!this.initialized) {
            synchronized (this) {
               if (!this.initialized) {
                  Object var2 = this.delegate.get();
                  this.value = (T)var2;
                  this.initialized = true;
                  return (T)var2;
               }
            }
         }

         return this.value;
      }

      @Override
      public String toString() {
         return "Suppliers.memoize(" + this.delegate + ")";
      }
   }

   static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
      volatile Supplier<T> delegate;
      volatile boolean initialized;
      T value;

      NonSerializableMemoizingSupplier(Supplier<T> var1) {
         this.delegate = Preconditions.checkNotNull(var1);
      }

      @Override
      public T get() {
         if (!this.initialized) {
            synchronized (this) {
               if (!this.initialized) {
                  Object var2 = this.delegate.get();
                  this.value = (T)var2;
                  this.initialized = true;
                  this.delegate = null;
                  return (T)var2;
               }
            }
         }

         return this.value;
      }

      @Override
      public String toString() {
         return "Suppliers.memoize(" + this.delegate + ")";
      }
   }
}
