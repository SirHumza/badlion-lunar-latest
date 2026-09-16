package org.jgrapht.alg.shortestpath;

import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public final class DijkstraShortestPath<V, E> extends BaseShortestPathAlgorithm<V, E> {
   private final double radius;
   private final Supplier<AddressableHeap<Double, Pair<V, E>>> heapSupplier;

   public DijkstraShortestPath(Graph<V, E> var1) {
      this(var1, Double.POSITIVE_INFINITY, PairingHeap::new);
   }

   public DijkstraShortestPath(Graph<V, E> var1, double var2) {
      this(var1, var2, PairingHeap::new);
   }

   public DijkstraShortestPath(Graph<V, E> var1, Supplier<AddressableHeap<Double, Pair<V, E>>> var2) {
      this(var1, Double.POSITIVE_INFINITY, var2);
   }

   public DijkstraShortestPath(Graph<V, E> var1, double var2, Supplier<AddressableHeap<Double, Pair<V, E>>> var4) {
      super(var1);
      if (var2 < 0.0) {
         throw new IllegalArgumentException("Radius must be non-negative");
      }

      this.heapSupplier = var4;
      this.radius = var2;
   }

   public static <V, E> GraphPath<V, E> findPathBetween(Graph<V, E> var0, V var1, V var2) {
      return new DijkstraShortestPath<V, E>(var0).getPath((V)var1, (V)var2);
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      }

      if (var1.equals(var2)) {
         return this.createEmptyPath((V)var1, (V)var2);
      }

      DijkstraClosestFirstIterator var3 = new DijkstraClosestFirstIterator<>(this.graph, (V)var1, this.radius, this.heapSupplier);

      while (var3.hasNext()) {
         Object var4 = var3.next();
         if (var4.equals(var2)) {
            break;
         }
      }

      return (GraphPath<V, E>)var3.getPaths().getPath(var2);
   }

   @Override
   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      DijkstraClosestFirstIterator var2 = new DijkstraClosestFirstIterator<>(this.graph, (V)var1, this.radius, this.heapSupplier);

      while (var2.hasNext()) {
         var2.next();
      }

      return var2.getPaths();
   }
}
