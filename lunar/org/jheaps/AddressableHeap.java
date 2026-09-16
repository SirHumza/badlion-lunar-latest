package org.jheaps;

import java.util.Comparator;

public interface AddressableHeap<K, V> {
   Comparator<? super K> comparator();

   AddressableHeap.Handle<K, V> insert(K var1, V var2);

   AddressableHeap.Handle<K, V> insert(K var1);

   AddressableHeap.Handle<K, V> findMin();

   AddressableHeap.Handle<K, V> deleteMin();

   boolean isEmpty();

   long size();

   void clear();

   interface Handle<K, V> {
      K getKey();

      V getValue();

      void setValue(V var1);

      void decreaseKey(K var1);

      void delete();
   }
}
