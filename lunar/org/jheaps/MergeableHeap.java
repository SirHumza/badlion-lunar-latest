package org.jheaps;

public interface MergeableHeap<K> extends Heap<K> {
   void meld(MergeableHeap<K> var1);
}
