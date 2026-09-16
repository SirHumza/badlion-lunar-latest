package org.jgrapht.alg.util;

import java.util.Comparator;

@Deprecated(forRemoval = true, since = "1.5.1")
public class AlwaysEqualComparator<T> implements Comparator<T> {
   @Override
   public int compare(T var1, T var2) {
      return 0;
   }
}
