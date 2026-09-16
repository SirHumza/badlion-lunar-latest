package org.jgrapht.alg.isomorphism;

import java.util.Comparator;
import org.jgrapht.Graph;

public class VF2SubgraphIsomorphismInspector<V, E> extends VF2AbstractIsomorphismInspector<V, E> {
   public VF2SubgraphIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2, Comparator<V> var3, Comparator<E> var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
   }

   public VF2SubgraphIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2, Comparator<V> var3, Comparator<E> var4) {
      super(var1, var2, var3, var4, true);
   }

   public VF2SubgraphIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2, boolean var3) {
      super(var1, var2, null, null, var3);
   }

   public VF2SubgraphIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2) {
      super(var1, var2, true);
   }

   public VF2SubgraphMappingIterator<V, E> getMappings() {
      return new VF2SubgraphMappingIterator<>(this.ordering1, this.ordering2, this.vertexComparator, this.edgeComparator);
   }
}
