package org.jheaps.tree;

import java.util.Comparator;
import org.jheaps.AddressableHeap;
import org.jheaps.AddressableHeapFactory;

public class ReflectedFibonacciHeap<K, V> extends ReflectedHeap<K, V> {
   private static final long serialVersionUID = 651281438828109106L;

   public ReflectedFibonacciHeap() {
      this(null);
   }

   public ReflectedFibonacciHeap(Comparator<? super K> var1) {
      super(new ReflectedFibonacciHeap.Factory<>(), var1);
   }

   private static class Factory<K, V> implements AddressableHeapFactory<K, V> {
      private Factory() {
      }

      @Override
      public AddressableHeap<K, V> get(Comparator<? super K> var1) {
         return new FibonacciHeap<>(var1);
      }
   }
}
