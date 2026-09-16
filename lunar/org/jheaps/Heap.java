package org.jheaps;

import java.util.Comparator;

public interface Heap<K> {
   Comparator<? super K> comparator();

   void insert(K var1);

   K findMin();

   K deleteMin();

   boolean isEmpty();

   long size();

   void clear();
}
