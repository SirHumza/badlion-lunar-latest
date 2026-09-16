package org.jgrapht.alg.util;

import java.util.Comparator;
import org.jgrapht.Graph;

public class VertexDegreeComparator<V, E> implements Comparator<V> {
   private Graph<V, E> graph;
   private VertexDegreeComparator.Order order;

   public static <V> Comparator<V> of(Graph<V, ?> var0) {
      return Comparator.comparingInt(var0::degreeOf);
   }

   @Deprecated(forRemoval = true, since = "1.5.1")
   public VertexDegreeComparator(Graph<V, E> var1) {
      this(var1, VertexDegreeComparator.Order.ASCENDING);
   }

   @Deprecated(forRemoval = true, since = "1.5.1")
   public VertexDegreeComparator(Graph<V, E> var1, VertexDegreeComparator.Order var2) {
      this.graph = var1;
      this.order = var2;
   }

   @Deprecated(forRemoval = true, since = "1.5.1")
   @Override
   public int compare(V var1, V var2) {
      int var3 = Integer.compare(this.graph.degreeOf((V)var1), this.graph.degreeOf((V)var2));
      return this.order == VertexDegreeComparator.Order.ASCENDING ? var3 : -1 * var3;
   }

   @Deprecated(forRemoval = true, since = "1.5.1")
   public enum Order {
      ASCENDING,
      DESCENDING;
   }
}
