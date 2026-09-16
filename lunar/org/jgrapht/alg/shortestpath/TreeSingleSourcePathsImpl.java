package org.jgrapht.alg.shortestpath;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.GraphWalk;

public class TreeSingleSourcePathsImpl<V, E> implements Serializable, ShortestPathAlgorithm.SingleSourcePaths<V, E> {
   private static final long serialVersionUID = -5914007312734512847L;
   protected Graph<V, E> g;
   protected V source;
   protected Map<V, Pair<Double, E>> map;

   public TreeSingleSourcePathsImpl(Graph<V, E> var1, V var2, Map<V, Pair<Double, E>> var3) {
      this.g = Objects.requireNonNull(var1, "Graph is null");
      this.source = Objects.requireNonNull((V)var2, "Source vertex is null");
      this.map = Objects.requireNonNull(var3, "Distance and predecessor map is null");
   }

   @Override
   public Graph<V, E> getGraph() {
      return this.g;
   }

   @Override
   public V getSourceVertex() {
      return this.source;
   }

   public Map<V, Pair<Double, E>> getDistanceAndPredecessorMap() {
      return Collections.unmodifiableMap(this.map);
   }

   @Override
   public double getWeight(V var1) {
      Pair var2 = this.map.get(var1);
      if (var2 == null) {
         return this.source.equals(var1) ? 0.0 : Double.POSITIVE_INFINITY;
      } else {
         return (Double)var2.getFirst();
      }
   }

   @Override
   public GraphPath<V, E> getPath(V var1) {
      if (this.source.equals(var1)) {
         return GraphWalk.singletonWalk(this.g, this.source, 0.0);
      }

      LinkedList var2 = new LinkedList();
      Object var3 = var1;
      Pair var4 = this.map.get(var3);
      if (var4 != null && !((Double)var4.getFirst()).equals(Double.POSITIVE_INFINITY)) {
         double var5 = 0.0;

         while (var4 != null && !var3.equals(this.source)) {
            Object var7 = var4.getSecond();
            if (var7 == null) {
               break;
            }

            var2.addFirst(var7);
            var5 += this.g.getEdgeWeight((E)var7);
            var3 = Graphs.getOppositeVertex(this.g, (E)var7, (V)var3);
            var4 = this.map.get(var3);
         }

         return new GraphWalk<>(this.g, this.source, (V)var1, null, var2, var5);
      } else {
         return null;
      }
   }
}
