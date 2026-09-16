package org.jheaps;

import java.util.Comparator;

public interface AddressableHeapFactory<K, V> {
   AddressableHeap<K, V> get(Comparator<? super K> var1);
}
