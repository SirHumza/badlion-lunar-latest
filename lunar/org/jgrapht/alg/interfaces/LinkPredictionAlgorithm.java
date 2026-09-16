package org.jgrapht.alg.interfaces;

import java.util.ArrayList;
import java.util.List;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.Triple;

public interface LinkPredictionAlgorithm<V, E> {
   default List<Triple<V, V, Double>> predict(List<Pair<V, V>> var1) {
      ArrayList var2 = new ArrayList();

      for (Pair var4 : var1) {
         var2.add(Triple.of(var4.getFirst(), var4.getSecond(), this.predict((V)var4.getFirst(), (V)var4.getSecond())));
      }

      return var2;
   }

   double predict(V var1, V var2);
}
