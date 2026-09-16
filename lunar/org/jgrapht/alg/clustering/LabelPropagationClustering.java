package org.jgrapht.alg.clustering;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ClusteringAlgorithm;
import org.jgrapht.alg.util.Pair;

public class LabelPropagationClustering<V, E> implements ClusteringAlgorithm<V> {
   private Graph<V, E> graph;
   private int maxIterations;
   private Random rng;
   private ClusteringAlgorithm.Clustering<V> result;

   public LabelPropagationClustering(Graph<V, E> var1) {
      this(var1, 0, new Random());
   }

   public LabelPropagationClustering(Graph<V, E> var1, Random var2) {
      this(var1, 0, var2);
   }

   public LabelPropagationClustering(Graph<V, E> var1, int var2) {
      this(var1, var2, new Random());
   }

   public LabelPropagationClustering(Graph<V, E> var1, int var2, Random var3) {
      this.graph = GraphTests.requireUndirected(var1);
      this.maxIterations = var2;
      this.rng = Objects.requireNonNull(var3);
      if (var2 < 0) {
         throw new IllegalArgumentException("Max iterations cannot be negative");
      }
   }

   @Override
   public ClusteringAlgorithm.Clustering<V> getClustering() {
      if (this.result == null) {
         this.result = new ClusteringAlgorithm.ClusteringImpl<>(
            new LabelPropagationClustering.Implementation<>(this.graph, this.rng, this.maxIterations).compute()
         );
      }

      return this.result;
   }

   private static class Implementation<V, E> {
      private Graph<V, E> graph;
      private Random rng;
      private int maxIterations;
      private Map<V, String> labels;

      public Implementation(Graph<V, E> var1, Random var2, int var3) {
         this.graph = var1;
         this.rng = var2;
         this.maxIterations = var3;
         this.labels = new HashMap<>();
         int var4 = 0;

         for (Object var6 : var1.vertexSet()) {
            this.labels.put((V)var6, String.valueOf(var4++));
         }
      }

      public List<Set<V>> compute() {
         for (int var1 = 0; this.maxIterations <= 0 || var1 <= this.maxIterations; var1++) {
            boolean var2 = false;
            ArrayList var3 = new ArrayList<>(this.graph.vertexSet());
            Collections.shuffle(var3, this.rng);

            for (Object var5 : var3) {
               if (this.updateLabel((V)var5)) {
                  var2 = true;
               }
            }

            if (!var2 || this.shouldStop()) {
               break;
            }
         }

         return this.computeCommunities();
      }

      private boolean shouldStop() {
         for (Object var2 : this.graph.vertexSet()) {
            Pair var3 = this.getNeighborLabelCountsAndMaximum((V)var2);
            Map var4 = (Map)var3.getFirst();
            String var5 = this.labels.get(var2);
            int var6 = var4.getOrDefault(var5, 0);
            int var7 = (Integer)var3.getSecond();
            if (var7 > var6) {
               return false;
            }
         }

         return true;
      }

      private Pair<Map<String, Integer>, Integer> getNeighborLabelCountsAndMaximum(V var1) {
         HashMap var2 = new HashMap();
         String var3 = this.labels.get(var1);
         int var4 = 0;

         for (Object var6 : this.graph.edgesOf((V)var1)) {
            Object var7 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var1);
            String var8 = this.labels.get(var7);
            int var9 = var2.getOrDefault(var8, 0) + 1;
            var2.put(var8, var9);
            if (var9 > var4 && !var8.equals(var3)) {
               var4 = var9;
            }
         }

         return Pair.of(var2, var4);
      }

      private boolean updateLabel(V var1) {
         if (this.graph.degreeOf((V)var1) == 0) {
            return false;
         }

         Pair var2 = this.getNeighborLabelCountsAndMaximum((V)var1);
         Map var3 = (Map)var2.getFirst();
         String var4 = this.labels.get(var1);
         int var5 = var3.getOrDefault(var4, 0);
         int var6 = Math.max((Integer)var2.getSecond(), var5);
         ArrayList var7 = var3.entrySet()
            .stream()
            .filter(var1x -> (Integer)var1x.getValue() == var6)
            .map(Entry::getKey)
            .collect(Collectors.toCollection(ArrayList::new));
         String var8 = (String)var7.get(this.rng.nextInt(var7.size()));
         if (var4.equals(var8)) {
            return false;
         }

         this.labels.put((V)var1, var8);
         return true;
      }

      private List<Set<V>> computeCommunities() {
         HashMap var1 = new HashMap();
         int var2 = 0;

         for (Object var4 : this.graph.vertexSet()) {
            if (!var1.containsKey(var4)) {
               ArrayDeque var5 = new ArrayDeque();
               String var6 = String.valueOf(var2++);
               var1.put(var4, var6);
               var5.addLast(var4);

               while (!var5.isEmpty()) {
                  Object var7 = var5.removeFirst();
                  String var8 = this.labels.get(var7);

                  for (Object var10 : this.graph.edgesOf((V)var7)) {
                     Object var11 = Graphs.getOppositeVertex(this.graph, (E)var10, (V)var7);
                     String var12 = this.labels.get(var11);
                     if (var12.equals(var8) && !var1.containsKey(var11)) {
                        var1.put(var11, var6);
                        var5.addLast(var11);
                     }
                  }
               }
            }
         }

         return this.convert(this.graph, var1);
      }

      private List<Set<V>> convert(Graph<V, E> var1, Map<V, String> var2) {
         LinkedHashMap var3 = new LinkedHashMap();

         for (Object var5 : var1.vertexSet()) {
            String var6 = (String)var2.get(var5);
            if (var6 == null) {
               throw new IllegalArgumentException("Not all vertices have labels.");
            }

            Set var7 = (Set)var3.get(var6);
            if (var7 == null) {
               var7 = new LinkedHashSet();
               var3.put(var6, var7);
            }

            var7.add(var5);
         }

         return new ArrayList<>(var3.values());
      }
   }
}
