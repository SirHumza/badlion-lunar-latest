package org.jheaps;

public interface MergeableDoubleEndedAddressableHeap<K, V> extends DoubleEndedAddressableHeap<K, V> {
   void meld(MergeableDoubleEndedAddressableHeap<K, V> var1);
}
