package org.jheaps;

public interface DoubleEndedHeap<K> extends Heap<K> {
   K findMax();

   K deleteMax();
}
