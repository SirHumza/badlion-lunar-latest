package org.jgrapht.alg.decomposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.alg.matching.HopcroftKarpMaximumCardinalityBipartiteMatching;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.graph.builder.GraphBuilder;
import org.jgrapht.traverse.DepthFirstIterator;

public class DulmageMendelsohnDecomposition<V, E> {
   private final Graph<V, E> graph;
   private final Set<V> partition1;
   private final Set<V> partition2;

   public DulmageMendelsohnDecomposition(Graph<V, E> var1, Set<V> var2, Set<V> var3) {
      this.graph = Objects.requireNonNull(var1);
      this.partition1 = var2;
      this.partition2 = var3;
      assert GraphTests.isBipartite(var1);
   }

   public DulmageMendelsohnDecomposition.Decomposition<V, E> getDecomposition(boolean var1) {
      HopcroftKarpMaximumCardinalityBipartiteMatching var2 = new HopcroftKarpMaximumCardinalityBipartiteMatching<>(this.graph, this.partition1, this.partition2);
      MatchingAlgorithm.Matching var3 = var2.getMatching();
      return this.decompose(var3, var1);
   }

   public DulmageMendelsohnDecomposition.Decomposition<V, E> decompose(MatchingAlgorithm.Matching<V, E> var1, boolean var2) {
      HashSet var3 = new HashSet();
      HashSet var4 = new HashSet();
      this.getUnmatched(var1, var3, var4);
      Graph var5 = this.asDirectedGraph(var1);
      HashSet var6 = new HashSet();
      var3.stream().map(var1x -> {
         var6.add(var1x);
         return (Object)var1x;
      }).map(var1x -> new DepthFirstIterator<>(var5, var1x)).forEachOrdered(var1x -> {
         while (var1x.hasNext()) {
            var6.add(var1x.next());
         }
      });
      EdgeReversedGraph var7 = new EdgeReversedGraph(var5);
      HashSet var8 = new HashSet();
      var4.stream().map(var1x -> {
         var8.add(var1x);
         return (Object)var1x;
      }).map(var1x -> new DepthFirstIterator<>(var7, var1x)).forEachOrdered(var1x -> {
         while (var1x.hasNext()) {
            var8.add(var1x.next());
         }
      });
      HashSet var9 = new HashSet();
      var9.addAll(this.partition1);
      var9.addAll(this.partition2);
      var9.removeAll(var6);
      var9.removeAll(var8);
      if (!var2) {
         return new DulmageMendelsohnDecomposition.Decomposition<>(var6, var8, Collections.singletonList(var9));
      }

      ArrayList var10 = new ArrayList();
      Graph var11 = this.asDirectedEdgeGraph(var1, var9);
      KosarajuStrongConnectivityInspector var12 = new KosarajuStrongConnectivityInspector(var11);

      for (Set var14 : var12.stronglyConnectedSets()) {
         HashSet var15 = new HashSet();
         var14.stream().map(var2x -> {
            var15.add(this.graph.getEdgeSource((E)var2x));
            return (Object)var2x;
         }).forEachOrdered(var2x -> var15.add(this.graph.getEdgeTarget((E)var2x)));
         var10.add(var15);
      }

      return new DulmageMendelsohnDecomposition.Decomposition<>(var6, var8, var10);
   }

   private void getUnmatched(MatchingAlgorithm.Matching<V, E> var1, Set<V> var2, Set<V> var3) {
      var2.addAll(this.partition1);
      var3.addAll(this.partition2);
      var1.forEach(var3x -> {
         Object var4 = this.graph.getEdgeSource((E)var3x);
         Object var5 = this.graph.getEdgeTarget((E)var3x);
         if (this.partition1.contains(var4)) {
            var2.remove(var4);
            var3.remove(var5);
         } else {
            var3.remove(var4);
            var2.remove(var5);
         }
      });
   }

   private Graph<V, DefaultEdge> asDirectedGraph(MatchingAlgorithm.Matching<V, E> var1) {
      GraphBuilder var2 = DefaultDirectedGraph.createBuilder(DefaultEdge.class);
      this.graph.vertexSet().forEach(var1x -> var2.addVertex((V)var1x));
      this.graph.edgeSet().forEach(var3 -> {
         Object var4 = this.graph.getEdgeSource((E)var3);
         Object var5 = this.graph.getEdgeTarget((E)var3);
         if (this.partition1.contains(var4)) {
            var2.addEdge(var4, var5);
            if (var1.getEdges().contains(var3)) {
               var2.addEdge(var5, var4);
            }
         } else {
            var2.addEdge(var5, var4);
            if (var1.getEdges().contains(var3)) {
               var2.addEdge(var4, var5);
            }
         }
      });
      return var2.build();
   }

   private Graph<E, DefaultEdge> asDirectedEdgeGraph(MatchingAlgorithm.Matching<V, E> var1, Set<V> var2) {
      GraphBuilder var3 = DefaultDirectedGraph.createBuilder(DefaultEdge.class);

      for (Object var5 : this.graph.edgeSet()) {
         Object var6 = this.graph.getEdgeSource((E)var5);
         Object var7 = this.graph.getEdgeTarget((E)var5);
         if (var2.contains(var6) && var2.contains(var7)) {
            if (var1.getEdges().contains(var5)) {
               var3.addVertex(var5);
            } else {
               Object var8 = null;
               Object var9 = null;

               for (Object var11 : this.graph.edgesOf((V)var6)) {
                  if (var1.getEdges().contains(var11)) {
                     var8 = var11;
                     var3.addVertex(var8);
                     break;
                  }
               }

               Iterator var12 = this.graph.edgesOf((V)var7).iterator();

               while (true) {
                  if (var12.hasNext()) {
                     Object var13 = var12.next();
                     if (!var1.getEdges().contains(var13)) {
                        continue;
                     }

                     var9 = var13;
                     var3.addVertex(var9);
                  }

                  var3.addEdge(var8, var9);
                  break;
               }
            }
         }
      }

      return var3.build();
   }

   public static class Decomposition<V, E> {
      private final Set<V> subset1;
      private final Set<V> subset2;
      private final List<Set<V>> subset3;

      Decomposition(Set<V> var1, Set<V> var2, List<Set<V>> var3) {
         this.subset1 = var1;
         this.subset2 = var2;
         this.subset3 = var3;
      }

      public Set<V> getPartition1DominatedSet() {
         return this.subset1;
      }

      public Set<V> getPartition2DominatedSet() {
         return this.subset2;
      }

      public List<Set<V>> getPerfectMatchedSets() {
         return this.subset3;
      }
   }
}
