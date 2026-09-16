package org.jgrapht.alg.interfaces;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.alg.util.Pair;

public interface LowestCommonAncestorAlgorithm<V> {
   V getLCA(V var1, V var2);

   default List<V> getBatchLCA(List<Pair<V, V>> var1) {
      return var1.stream().map(var1x -> this.getLCA((V)var1x.getFirst(), (V)var1x.getSecond())).collect(Collectors.toList());
   }

   Set<V> getLCASet(V var1, V var2);

   default List<Set<V>> getBatchLCASet(List<Pair<V, V>> var1) {
      return var1.stream().map(var1x -> this.getLCASet((V)var1x.getFirst(), (V)var1x.getSecond())).collect(Collectors.toList());
   }
}
