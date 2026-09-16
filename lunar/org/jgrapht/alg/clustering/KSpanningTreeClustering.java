package org.jgrapht.alg.clustering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.ClusteringAlgorithm;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.spanning.PrimMinimumSpanningTree;
import org.jgrapht.alg.util.UnionFind;

public class KSpanningTreeClustering<V, E> implements ClusteringAlgorithm<V> {
   private Graph<V, E> graph;
   private int k;

   public KSpanningTreeClustering(Graph<V, E> var1, int var2) {
      this.graph = GraphTests.requireUndirected(var1);
      if (var2 >= 1 && var2 <= var1.vertexSet().size()) {
         this.k = var2;
      } else {
         throw new IllegalArgumentException("Illegal number of clusters");
      }
   }

   @Override
   public ClusteringAlgorithm.Clustering<V> getClustering() {
      SpanningTreeAlgorithm.SpanningTree var1 = new PrimMinimumSpanningTree<>(this.graph).getSpanningTree();
      UnionFind var2 = new UnionFind<>(this.graph.vertexSet());
      ArrayList var3 = new ArrayList<>(var1.getEdges());
      var3.sort(Comparator.comparingDouble(this.graph::getEdgeWeight));

      for (Object var5 : var3) {
         if (var2.numberOfSets() == this.k) {
            break;
         }

         Object var6 = this.graph.getEdgeSource((E)var5);
         Object var7 = this.graph.getEdgeTarget((E)var5);
         if (!var2.find(var6).equals(var2.find(var7))) {
            var2.union(var6, var7);
         }
      }

      LinkedHashMap var9 = new LinkedHashMap();

      for (Object var11 : this.graph.vertexSet()) {
         Object var12 = var2.find(var11);
         Set var8 = (Set)var9.get(var12);
         if (var8 == null) {
            var8 = new LinkedHashSet();
            var9.put(var12, var8);
         }

         var8.add(var11);
      }

      return new ClusteringAlgorithm.ClusteringImpl<>(new ArrayList<>(var9.values()));
   }
}
