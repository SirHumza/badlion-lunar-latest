package org.jgrapht.alg.shortestpath;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MultiObjectiveShortestPathAlgorithm;
import org.jgrapht.graph.GraphWalk;
import org.jheaps.Heap;
import org.jheaps.array.DaryArrayHeap;

public class MartinShortestPath<V, E> extends BaseMultiObjectiveShortestPathAlgorithm<V, E> {
   private final Function<E, double[]> edgeWeightFunction;
   private final int objectives;
   private final Map<V, LinkedList<MartinShortestPath<V, E>.Label>> nodeLabels;
   private final Heap<MartinShortestPath<V, E>.Label> heap;

   public MartinShortestPath(Graph<V, E> var1, Function<E, double[]> var2) {
      super(var1);
      this.edgeWeightFunction = Objects.requireNonNull(var2, "Function cannot be null");
      this.objectives = this.validateEdgeWeightFunction(var2);
      this.nodeLabels = new HashMap<>();
      this.heap = new DaryArrayHeap<>(3, new MartinShortestPath.LabelComparator());
   }

   @Override
   public List<GraphPath<V, E>> getPaths(V var1, V var2) {
      return this.getPaths((V)var1).getPaths((V)var2);
   }

   @Override
   public MultiObjectiveShortestPathAlgorithm.MultiObjectiveSingleSourcePaths<V, E> getPaths(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      if (!this.graph.vertexSet().isEmpty() && !this.graph.edgeSet().isEmpty()) {
         if (this.nodeLabels.isEmpty()) {
            this.runAlgorithm((V)var1);
         }

         Map var2 = this.buildPaths((V)var1);
         return new ListMultiObjectiveSingleSourcePathsImpl<>(this.graph, (V)var1, var2);
      } else {
         return new ListMultiObjectiveSingleSourcePathsImpl<>(this.graph, (V)var1, Collections.emptyMap());
      }
   }

   private void runAlgorithm(V var1) {
      MartinShortestPath.Label var2 = new MartinShortestPath.Label(var1, new double[this.objectives], null, null);

      for (Object var4 : this.graph.vertexSet()) {
         this.nodeLabels.put((V)var4, new LinkedList<>());
      }

      this.nodeLabels.get(var1).add(var2);
      this.heap.insert(var2);

      while (!this.heap.isEmpty()) {
         MartinShortestPath.Label var13 = this.heap.deleteMin();
         Object var14 = var13.node;

         for (Object var6 : this.graph.outgoingEdgesOf((V)var14)) {
            Object var7 = Graphs.getOppositeVertex(this.graph, (E)var6, (V)var14);
            MartinShortestPath.Label var8 = new MartinShortestPath.Label(var7, sum(var13.value, this.edgeWeightFunction.apply((E)var6)), var13, var6);
            boolean var9 = false;
            LinkedList var10 = this.nodeLabels.get(var7);
            ListIterator var11 = var10.listIterator();

            while (var11.hasNext()) {
               MartinShortestPath.Label var12 = (MartinShortestPath.Label)var11.next();
               if (dominates(var12.value, var8.value)) {
                  var9 = true;
                  break;
               }

               if (dominates(var8.value, var12.value)) {
                  var11.remove();
               }
            }

            if (!var9) {
               var10.add(var8);
               this.heap.insert(var8);
            }
         }
      }
   }

   private Map<V, List<GraphPath<V, E>>> buildPaths(V var1) {
      HashMap var2 = new HashMap();

      for (Object var4 : this.graph.vertexSet()) {
         if (var4.equals(var1)) {
            var2.put(var4, Arrays.asList(this.createEmptyPath((V)var1, (V)var4)));
         } else {
            var2.put(var4, this.nodeLabels.get(var4).stream().map(var3 -> {
               double var4x = 0.0;
               LinkedList var6 = new LinkedList();

               for (MartinShortestPath.Label var7 = var3; var7 != null && var7.fromPrevious != null; var7 = var7.previous) {
                  var4x += this.graph.getEdgeWeight(var7.fromPrevious);
                  var6.push(var7.fromPrevious);
               }

               return new GraphWalk<>(this.graph, (V)var1, (V)var4, var6, var4x);
            }).collect(Collectors.toList()));
         }
      }

      return var2;
   }

   private static double[] sum(double[] var0, double[] var1) {
      int var2 = var0.length;
      double[] var3 = new double[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = var0[var4] + var1[var4];
      }

      return var3;
   }

   private static boolean dominates(double[] var0, double[] var1) {
      boolean var2 = false;
      int var3 = var0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var0[var4] > var1[var4]) {
            return false;
         }

         if (var0[var4] < var1[var4]) {
            var2 = true;
         }
      }

      return var2;
   }

   private int validateEdgeWeightFunction(Function<E, double[]> var1) {
      int var2 = 0;

      for (Object var4 : this.graph.edgeSet()) {
         double[] var5 = (double[])var1.apply(var4);
         if (var5 == null) {
            throw new IllegalArgumentException("Invalid edge weight function");
         }

         if (var2 == 0) {
            var2 = var5.length;
         } else if (var2 != var5.length) {
            throw new IllegalArgumentException("Invalid edge weight function");
         }

         for (int var6 = 0; var6 < var2; var6++) {
            if (Double.compare(var5[var6], 0.0) < 0) {
               throw new IllegalArgumentException("Edge weight must be non-negative");
            }
         }
      }

      return var2;
   }

   private class Label {
      public V node;
      public double[] value;
      public MartinShortestPath<V, E>.Label previous;
      public E fromPrevious;

      public Label(V var2, double[] var3, MartinShortestPath<V, E>.Label var4, E var5) {
         this.node = (V)var2;
         this.value = var3;
         this.previous = var4;
         this.fromPrevious = (E)var5;
      }

      @Override
      public String toString() {
         return "Label [node=" + this.node + ", value=" + Arrays.toString(this.value) + ", fromPrevious=" + this.fromPrevious + "]";
      }
   }

   private class LabelComparator implements Comparator<MartinShortestPath<V, E>.Label> {
      public int compare(MartinShortestPath<V, E>.Label var1, MartinShortestPath<V, E>.Label var2) {
         for (int var3 = 0; var3 < MartinShortestPath.this.objectives; var3++) {
            if (var1.value[var3] < var2.value[var3]) {
               return -1;
            }

            if (var1.value[var3] > var2.value[var3]) {
               return 1;
            }
         }

         return 0;
      }
   }
}
