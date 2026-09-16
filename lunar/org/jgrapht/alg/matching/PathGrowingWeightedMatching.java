package org.jgrapht.alg.matching;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.ToleranceDoubleComparator;

public class PathGrowingWeightedMatching<V, E> implements MatchingAlgorithm<V, E> {
   public static final boolean DEFAULT_USE_HEURISTICS = true;
   private final Graph<V, E> graph;
   private final Comparator<Double> comparator;
   private final boolean useHeuristics;

   public PathGrowingWeightedMatching(Graph<V, E> var1) {
      this(var1, true, 1.0E-9);
   }

   public PathGrowingWeightedMatching(Graph<V, E> var1, boolean var2) {
      this(var1, var2, 1.0E-9);
   }

   public PathGrowingWeightedMatching(Graph<V, E> var1, boolean var2, double var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("Input graph cannot be null");
      }

      this.graph = var1;
      this.comparator = new ToleranceDoubleComparator(var3);
      this.useHeuristics = var2;
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      return this.useHeuristics ? this.runWithHeuristics() : this.run();
   }

   private Set<V> initVisibleVertices() {
      HashSet var1 = new HashSet();

      for (Object var3 : this.graph.edgeSet()) {
         Object var4 = this.graph.getEdgeSource((E)var3);
         Object var5 = this.graph.getEdgeTarget((E)var3);
         if (!var4.equals(var5)) {
            var1.add(var4);
            var1.add(var5);
         }
      }

      return var1;
   }

   private MatchingAlgorithm.Matching<V, E> run() {
      Set var1 = this.initVisibleVertices();
      HashSet var2 = new HashSet();
      HashSet var3 = new HashSet();
      double var4 = 0.0;
      double var6 = 0.0;
      int var8 = 1;

      while (!var1.isEmpty()) {
         Object var9 = var1.stream().findAny().get();

         while (var9 != null) {
            double var10 = 0.0;
            Object var12 = null;
            Object var13 = null;

            for (Object var15 : this.graph.edgesOf((V)var9)) {
               Object var16 = Graphs.getOppositeVertex(this.graph, (E)var15, (V)var9);
               if (var1.contains(var16) && !var16.equals(var9)) {
                  double var17 = this.graph.getEdgeWeight((E)var15);
                  if (this.comparator.compare(var17, 0.0) > 0 && (var12 == null || this.comparator.compare(var17, var10) > 0)) {
                     var10 = var17;
                     var12 = var15;
                     var13 = var16;
                  }
               }
            }

            if (var12 != null) {
               switch (var8) {
                  case 1:
                     var2.add(var12);
                     var4 += var10;
                     break;
                  case 2:
                     var3.add(var12);
                     var6 += var10;
                     break;
                  default:
                     throw new RuntimeException("Failed to figure out matching, seems to be a bug");
               }

               var8 = 3 - var8;
            }

            var1.remove(var9);
            var9 = var13;
         }
      }

      return this.comparator.compare(var4, var6) > 0
         ? new MatchingAlgorithm.MatchingImpl<>(this.graph, var2, var4)
         : new MatchingAlgorithm.MatchingImpl<>(this.graph, var3, var6);
   }

   private MatchingAlgorithm.Matching<V, E> runWithHeuristics() {
      Set var1 = this.initVisibleVertices();
      PathGrowingWeightedMatching.DynamicProgrammingPathSolver var2 = new PathGrowingWeightedMatching.DynamicProgrammingPathSolver();
      HashSet var3 = new HashSet();
      double var4 = 0.0;
      HashSet var6 = new HashSet();

      while (!var1.isEmpty()) {
         Object var7 = var1.stream().findAny().get();
         LinkedList var8 = new LinkedList();

         while (var7 != null) {
            double var9 = 0.0;
            Object var11 = null;
            Object var12 = null;

            for (Object var14 : this.graph.edgesOf((V)var7)) {
               Object var15 = Graphs.getOppositeVertex(this.graph, (E)var14, (V)var7);
               if (var1.contains(var15) && !var15.equals(var7)) {
                  double var16 = this.graph.getEdgeWeight((E)var14);
                  if (this.comparator.compare(var16, 0.0) > 0 && (var11 == null || this.comparator.compare(var16, var9) > 0)) {
                     var9 = var16;
                     var11 = var14;
                     var12 = var15;
                  }
               }
            }

            if (var11 != null) {
               var8.add(var11);
            }

            var1.remove(var7);
            var7 = var12;
         }

         Pair var20 = var2.getMaximumWeightMatching(this.graph, var8);
         var4 += var20.getFirst();

         for (Object var22 : (Set)var20.getSecond()) {
            Object var24 = this.graph.getEdgeSource((E)var22);
            Object var26 = this.graph.getEdgeTarget((E)var22);
            if (!var6.add(var24)) {
               throw new RuntimeException("Set is not a valid matching, please submit a bug report");
            }

            if (!var6.add(var26)) {
               throw new RuntimeException("Set is not a valid matching, please submit a bug report");
            }

            var3.add(var22);
         }
      }

      for (Object var19 : this.graph.edgeSet()) {
         double var21 = this.graph.getEdgeWeight((E)var19);
         if (this.comparator.compare(var21, 0.0) > 0) {
            Object var23 = this.graph.getEdgeSource((E)var19);
            if (!var6.contains(var23)) {
               Object var25 = this.graph.getEdgeTarget((E)var19);
               if (!var6.contains(var25)) {
                  var3.add(var19);
                  var4 += var21;
               }
            }
         }
      }

      return new MatchingAlgorithm.MatchingImpl<>(this.graph, var3, var4);
   }

   class DynamicProgrammingPathSolver {
      private static final int WORK_ARRAY_INITIAL_SIZE = 256;
      private double[] a = new double[256];

      public Pair<Double, Set<E>> getMaximumWeightMatching(Graph<V, E> var1, LinkedList<E> var2) {
         int var3 = var2.size();
         switch (var3) {
            case 0:
               return Pair.of(0.0, Collections.emptySet());
            case 1:
               Object var11 = var2.getFirst();
               double var15 = var1.getEdgeWeight(var11);
               if (PathGrowingWeightedMatching.this.comparator.compare(var15, 0.0) > 0) {
                  return Pair.of(var15, Collections.singleton((E)var11));
               }

               return Pair.of(0.0, Collections.emptySet());
            default:
               if (this.a.length < var3 + 1) {
                  this.a = new double[var3 + 1];
               }

               Iterator var4 = var2.iterator();
               Object var5 = var4.next();
               double var6 = var1.getEdgeWeight(var5);
               this.a[0] = 0.0;
               this.a[1] = PathGrowingWeightedMatching.this.comparator.compare(var6, 0.0) > 0 ? var6 : 0.0;

               for (int var8 = 2; var8 <= var3; var8++) {
                  var5 = var4.next();
                  var6 = var1.getEdgeWeight(var5);
                  if (PathGrowingWeightedMatching.this.comparator.compare(this.a[var8 - 1], this.a[var8 - 2] + var6) > 0) {
                     this.a[var8] = this.a[var8 - 1];
                  } else {
                     this.a[var8] = this.a[var8 - 2] + var6;
                  }
               }

               HashSet var17 = new HashSet();
               var4 = var2.descendingIterator();

               for (int var9 = var3; var9 >= 1; var9--) {
                  var5 = var4.next();
                  if (PathGrowingWeightedMatching.this.comparator.compare(this.a[var9], this.a[var9 - 1]) > 0) {
                     var17.add(var5);
                     if (var9 > 1) {
                        var5 = var4.next();
                     }

                     var9--;
                  }
               }

               return Pair.of(this.a[var3], var17);
         }
      }
   }
}
