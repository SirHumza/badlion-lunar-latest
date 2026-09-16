package org.jheaps;

public interface DoubleEndedAddressableHeap<K, V> extends AddressableHeap<K, V> {
   DoubleEndedAddressableHeap.Handle<K, V> insert(K var1, V var2);

   DoubleEndedAddressableHeap.Handle<K, V> insert(K var1);

   DoubleEndedAddressableHeap.Handle<K, V> findMin();

   DoubleEndedAddressableHeap.Handle<K, V> deleteMin();

   DoubleEndedAddressableHeap.Handle<K, V> findMax();

   DoubleEndedAddressableHeap.Handle<K, V> deleteMax();

   interface Handle<K, V> extends AddressableHeap.Handle<K, V> {
      void increaseKey(K var1);
   }
}
