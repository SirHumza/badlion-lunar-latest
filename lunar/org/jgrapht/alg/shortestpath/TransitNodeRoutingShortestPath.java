package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.interfaces.ManyToManyShortestPathsAlgorithm;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.GraphWalk;

public class TransitNodeRoutingShortestPath<V, E> extends BaseShortestPathAlgorithm<V, E> {
   private ThreadPoolExecutor executor;
   private ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> contractionHierarchy;
   private ShortestPathAlgorithm<V, E> localQueriesAlgorithm;
   private ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> manyToManyShortestPaths;
   private TransitNodeRoutingPrecomputation.AccessVertices<V, E> accessVertices;
   private TransitNodeRoutingPrecomputation.LocalityFilter<V> localityFilter;

   public TransitNodeRoutingShortestPath(Graph<V, E> var1, ThreadPoolExecutor var2) {
      super(var1);
      this.executor = Objects.requireNonNull(var2, "executor cannot be null!");
   }

   TransitNodeRoutingShortestPath(TransitNodeRoutingPrecomputation.TransitNodeRouting<V, E> var1) {
      super(var1.getContractionHierarchy().getGraph());
      this.initialize(var1);
   }

   public void performPrecomputation() {
      if (this.contractionHierarchy == null) {
         TransitNodeRoutingPrecomputation.TransitNodeRouting var1 = new TransitNodeRoutingPrecomputation<>(this.graph, this.executor)
            .computeTransitNodeRouting();
         this.initialize(var1);
      }
   }

   private void initialize(TransitNodeRoutingPrecomputation.TransitNodeRouting<V, E> var1) {
      this.contractionHierarchy = var1.getContractionHierarchy();
      this.localityFilter = var1.getLocalityFilter();
      this.accessVertices = var1.getAccessVertices();
      this.manyToManyShortestPaths = var1.getTransitVerticesPaths();
      this.localQueriesAlgorithm = new ContractionHierarchyBidirectionalDijkstra<>(var1.getContractionHierarchy());
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      this.performPrecomputation();
      if (this.localityFilter.isLocal((V)var1, (V)var2)) {
         return this.localQueriesAlgorithm.getPath((V)var1, (V)var2);
      }

      Pair var3 = this.getMinWeightAccessVertices((V)var1, (V)var2);
      TransitNodeRoutingPrecomputation.AccessVertex var4 = (TransitNodeRoutingPrecomputation.AccessVertex)var3.getFirst();
      TransitNodeRoutingPrecomputation.AccessVertex var5 = (TransitNodeRoutingPrecomputation.AccessVertex)var3.getSecond();
      return var4 == null
         ? this.createEmptyPath((V)var1, (V)var2)
         : this.mergePaths(var4.getPath(), this.manyToManyShortestPaths.getPath((V)var4.getVertex(), (V)var5.getVertex()), var5.getPath());
   }

   @Override
   public double getPathWeight(V var1, V var2) {
      this.performPrecomputation();
      if (this.localityFilter.isLocal((V)var1, (V)var2)) {
         return this.localQueriesAlgorithm.getPathWeight((V)var1, (V)var2);
      }

      Pair var3 = this.getMinWeightAccessVertices((V)var1, (V)var2);
      TransitNodeRoutingPrecomputation.AccessVertex var4 = (TransitNodeRoutingPrecomputation.AccessVertex)var3.getFirst();
      TransitNodeRoutingPrecomputation.AccessVertex var5 = (TransitNodeRoutingPrecomputation.AccessVertex)var3.getSecond();
      return var4 == null
         ? Double.POSITIVE_INFINITY
         : var4.getPath().getWeight() + this.manyToManyShortestPaths.getWeight((V)var4.getVertex(), (V)var5.getVertex()) + var5.getPath().getWeight();
   }

   private Pair<TransitNodeRoutingPrecomputation.AccessVertex<V, E>, TransitNodeRoutingPrecomputation.AccessVertex<V, E>> getMinWeightAccessVertices(
      V var1, V var2
   ) {
      ContractionHierarchyPrecomputation.ContractionVertex var3 = this.contractionHierarchy.getContractionMapping().get(var1);
      ContractionHierarchyPrecomputation.ContractionVertex var4 = this.contractionHierarchy.getContractionMapping().get(var2);
      TransitNodeRoutingPrecomputation.AccessVertex var5 = null;
      TransitNodeRoutingPrecomputation.AccessVertex var6 = null;
      double var7 = Double.POSITIVE_INFINITY;

      for (TransitNodeRoutingPrecomputation.AccessVertex var10 : this.accessVertices.getForwardAccessVertices(var3)) {
         for (TransitNodeRoutingPrecomputation.AccessVertex var12 : this.accessVertices.getBackwardAccessVertices(var4)) {
            double var13 = var10.getPath().getWeight()
               + this.manyToManyShortestPaths.getWeight((V)var10.getVertex(), (V)var12.getVertex())
               + var12.getPath().getWeight();
            if (var13 < var7) {
               var7 = var13;
               var5 = var10;
               var6 = var12;
            }
         }
      }

      return var7 == Double.POSITIVE_INFINITY ? new Pair<>(null, null) : Pair.of(var5, var6);
   }

   private GraphPath<V, E> mergePaths(GraphPath<V, E> var1, GraphPath<V, E> var2, GraphPath<V, E> var3) {
      Object var4 = var1.getStartVertex();
      Object var5 = var3.getEndVertex();
      double var6 = var1.getWeight() + var2.getWeight() + var3.getWeight();
      int var8 = var1.getVertexList().size() + var2.getVertexList().size() + var3.getVertexList().size() - 2;
      ArrayList var9 = new ArrayList(var8);
      int var10 = var1.getLength() + var2.getLength() + var3.getLength();
      ArrayList var11 = new ArrayList(var10);
      Iterator var12 = var1.getVertexList().iterator();

      while (var12.hasNext()) {
         Object var13 = var12.next();
         if (var12.hasNext()) {
            var9.add(var13);
         }
      }

      var9.addAll(var2.getVertexList());
      Iterator var14 = var3.getVertexList().iterator();
      var14.next();

      while (var14.hasNext()) {
         var9.add(var14.next());
      }

      var11.addAll(var1.getEdgeList());
      var11.addAll(var2.getEdgeList());
      var11.addAll(var3.getEdgeList());
      return new GraphWalk<>(this.graph, (V)var4, (V)var5, var9, var11, var6);
   }
}
