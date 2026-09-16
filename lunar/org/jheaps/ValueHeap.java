package org.jheaps;

public interface ValueHeap<K, V> extends Heap<K> {
   void insert(K var1, V var2);

   V findMinValue();
}
