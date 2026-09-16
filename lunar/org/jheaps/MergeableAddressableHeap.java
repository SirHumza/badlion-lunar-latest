package org.jheaps;

public interface MergeableAddressableHeap<K, V> extends AddressableHeap<K, V> {
   void meld(MergeableAddressableHeap<K, V> var1);
}
