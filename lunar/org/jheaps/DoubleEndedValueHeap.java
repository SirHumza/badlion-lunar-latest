package org.jheaps;

public interface DoubleEndedValueHeap<K, V> extends DoubleEndedHeap<K> {
   void insert(K var1, V var2);

   V findMinValue();

   V findMaxValue();
}
