package org.jgrapht.alg.isomorphism;

import java.util.Comparator;
import java.util.Iterator;
import org.jgrapht.Graph;
import org.jgrapht.GraphMapping;
import org.jgrapht.GraphType;

public abstract class VF2AbstractIsomorphismInspector<V, E> implements IsomorphismInspector<V, E> {
   protected Graph<V, E> graph1;
   protected Graph<V, E> graph2;
   protected Comparator<V> vertexComparator;
   protected Comparator<E> edgeComparator;
   protected GraphOrdering<V, E> ordering1;
   protected GraphOrdering<V, E> ordering2;

   public VF2AbstractIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2, Comparator<V> var3, Comparator<E> var4, boolean var5) {
      GraphType var6 = var1.getType();
      GraphType var7 = var2.getType();
      if (var6.isAllowingMultipleEdges() || var7.isAllowingMultipleEdges()) {
         throw new IllegalArgumentException("graphs with multiple (parallel) edges are not supported");
      }

      if (!var6.isMixed() && !var7.isMixed()) {
         if ((!var6.isUndirected() || !var7.isDirected()) && (!var6.isDirected() || !var7.isUndirected())) {
            this.graph1 = var1;
            this.graph2 = var2;
            this.vertexComparator = var3;
            this.edgeComparator = var4;
            this.ordering1 = new GraphOrdering<>(var1, true, var5);
            this.ordering2 = new GraphOrdering<>(var2, true, var5);
         } else {
            throw new IllegalArgumentException("can not match directed with undirected graphs");
         }
      } else {
         throw new IllegalArgumentException("mixed graphs not supported");
      }
   }

   public VF2AbstractIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2, Comparator<V> var3, Comparator<E> var4) {
      this(var1, var2, var3, var4, true);
   }

   public VF2AbstractIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2, boolean var3) {
      this(var1, var2, null, null, var3);
   }

   public VF2AbstractIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2) {
      this(var1, var2, true);
   }

   @Override
   public abstract Iterator<GraphMapping<V, E>> getMappings();

   @Override
   public boolean isomorphismExists() {
      Iterator var1 = this.getMappings();
      return var1.hasNext();
   }
}
