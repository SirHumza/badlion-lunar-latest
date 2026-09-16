package org.jgrapht.alg.cycle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.util.TypeUtil;

public class AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E> {
   private Graph<V, E> graph;
   private Map<V, Integer> labelMap;
   private int lengthBound;
   private boolean bestImprovement;

   public AhujaOrlinSharmaCyclicExchangeLocalAugmentation(Graph<V, E> var1, int var2, Map<V, Integer> var3, boolean var4) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      if (!var1.getType().isDirected()) {
         throw new IllegalArgumentException("The graph has to be directed.");
      }

      this.lengthBound = var2;
      this.labelMap = Objects.requireNonNull(var3, "Labels cannot be null");

      for (Object var6 : var1.vertexSet()) {
         if (!var3.containsKey(var6)) {
            throw new IllegalArgumentException("Every vertex has to be labeled, that is, every vertex needs an entry in labelMap.");
         }
      }

      this.bestImprovement = var4;
   }

   public GraphWalk<V, E> getLocalAugmentationCycle() {
      int var1 = 1;
      AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var2 = new AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath(
         new ArrayList(this.lengthBound), Double.MAX_VALUE, new HashSet<>()
      );
      LinkedHashMap var3 = new LinkedHashMap();
      LinkedHashMap var4 = new LinkedHashMap();

      for (Object var6 : this.graph.edgeSet()) {
         if (this.graph.getEdgeWeight((E)var6) < 0.0) {
            Object var7 = this.graph.getEdgeSource((E)var6);
            Object var8 = this.graph.getEdgeTarget((E)var6);
            if (var7 == var8) {
               ArrayList var9 = new ArrayList();
               var9.add(var7);
               var9.add(var8);
               double var10 = this.graph.getEdgeWeight((E)var6);
               double var12 = this.graph.getEdgeWeight(this.graph.getEdge((V)var8, (V)var7));
               if (!this.bestImprovement) {
                  return new GraphWalk<>(this.graph, var9, var10 + var12);
               }

               if (var2.cost > var10 + var12) {
                  HashSet var14 = new HashSet();
                  var14.add(this.labelMap.get(var7));
                  var2 = new AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath(var9, var10 + var12, var14);
               }
            }

            if (!this.labelMap.get(var7).equals(this.labelMap.get(var8))) {
               ArrayList var21 = new ArrayList(this.lengthBound);
               HashSet var23 = new HashSet();
               var21.add(var7);
               var21.add(var8);
               var23.add(this.labelMap.get(var7));
               var23.add(this.labelMap.get(var8));
               AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var11 = new AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath(
                  var21, this.graph.getEdgeWeight((E)var6), var23
               );
               this.updatePathIndex(var3, var11);
            }
         }
      }

      while (var1 < this.lengthBound) {
         for (AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var18 : var3.values()) {
            Object var19 = var18.getHead();
            Object var20 = var18.getTail();
            Object var22 = this.graph.getEdge((V)var20, (V)var19);
            if (var22 != null) {
               double var24 = var18.cost + this.graph.getEdgeWeight((E)var22);
               if (var24 < var2.cost) {
                  AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var27 = var18.clone();
                  var27.addVertex((double)var19, this.graph.getEdgeWeight((E)var22), this.labelMap.get(var19));
                  if (!this.bestImprovement && var24 < 0.0) {
                     return new GraphWalk<>(this.graph, var27.vertices, var27.cost);
                  }

                  var2 = var27;
               }
            }

            for (Object var26 : this.graph.outgoingEdgesOf((V)var20)) {
               Object var28 = this.graph.getEdgeTarget((E)var26);
               double var13 = this.graph.getEdgeWeight((E)var26);
               int var15 = this.labelMap.get(var28);
               if (!var18.labels.contains(var15) && var18.cost + var13 < 0.0) {
                  AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var16 = var18.clone();
                  var16.addVertex((double)var28, var13, var15);
                  if (!this.checkDominatedPathsOfLengthKplus1(var16, var4) && !this.checkDominatedPathsOfLengthK(var16, var3)) {
                     this.updatePathIndex(var4, var16);
                  }
               }
            }
         }

         var1++;
         var3 = var4;
         var4 = new LinkedHashMap();
      }

      return new GraphWalk<>(this.graph, var2.vertices, var2.cost);
   }

   private boolean checkDominatedPathsOfLengthKplus1(
      AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.LabeledPath<V> var1,
      Map<AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.PathSetKey<V>, AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.LabeledPath<V>> var2
   ) {
      AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var3 = (AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath)var2.get(
         new AhujaOrlinSharmaCyclicExchangeLocalAugmentation.PathSetKey<>(var1.getHead(), var1.getTail(), var1.labels)
      );
      return var3 != null ? var3.cost < var1.cost : false;
   }

   private boolean checkDominatedPathsOfLengthK(
      AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.LabeledPath<V> var1,
      Map<AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.PathSetKey<V>, AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.LabeledPath<V>> var2
   ) {
      HashSet var3 = new HashSet<>(var1.labels);

      for (Integer var5 : var1.labels) {
         var3.remove(var5);
         AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var6 = (AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath)var2.get(
            new AhujaOrlinSharmaCyclicExchangeLocalAugmentation.PathSetKey<>(var1.getHead(), var1.getTail(), var3)
         );
         if (var6 != null && var6.cost < var1.cost) {
            return true;
         }

         var3.add(var5);
      }

      return false;
   }

   private void updatePathIndex(
      Map<AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.PathSetKey<V>, AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.LabeledPath<V>> var1,
      AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.LabeledPath<V> var2
   ) {
      AhujaOrlinSharmaCyclicExchangeLocalAugmentation.PathSetKey var3 = new AhujaOrlinSharmaCyclicExchangeLocalAugmentation.PathSetKey<>(
         var2.getHead(), var2.getTail(), var2.labels
      );
      var1.put(var3, var2);
   }

   private class LabeledPath<V> implements Cloneable {
      public ArrayList<V> vertices;
      public HashSet<Integer> labels;
      public double cost;

      public LabeledPath(ArrayList<V> var2, double var3, HashSet<Integer> var5) {
         this.vertices = var2;
         this.cost = var3;
         this.labels = var5;
      }

      public void addVertex(V var1, double var2, int var4) {
         this.vertices.add((V)var1);
         this.cost += var2;
         this.labels.add(var4);
      }

      public V getHead() {
         return this.vertices.get(0);
      }

      public V getTail() {
         return this.vertices.get(this.vertices.size() - 1);
      }

      public boolean isEmpty() {
         return this.vertices.isEmpty();
      }

      public AhujaOrlinSharmaCyclicExchangeLocalAugmentation<V, E>.LabeledPath<V> clone() {
         try {
            AhujaOrlinSharmaCyclicExchangeLocalAugmentation.LabeledPath var1 = TypeUtil.uncheckedCast(super.clone());
            var1.vertices = TypeUtil.uncheckedCast(this.vertices.clone());
            var1.labels = TypeUtil.uncheckedCast(this.labels.clone());
            var1.cost = this.cost;
            return var1;
         } catch (CloneNotSupportedException var2) {
            var2.printStackTrace();
            throw new RuntimeException();
         }
      }
   }

   private class PathSetKey<V> {
      private V head;
      private V tail;
      private Set<Integer> labels;

      private PathSetKey(V var2, V var3, Set<Integer> var4) {
         this.head = (V)var2;
         this.tail = (V)var3;
         this.labels = var4;
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.head, this.tail, this.labels);
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof AhujaOrlinSharmaCyclicExchangeLocalAugmentation.PathSetKey)) {
            return false;
         }

         AhujaOrlinSharmaCyclicExchangeLocalAugmentation.PathSetKey var2 = (AhujaOrlinSharmaCyclicExchangeLocalAugmentation.PathSetKey)var1;
         return Objects.equals(this.head, var2.head) && Objects.equals(this.tail, var2.tail) && Objects.equals(this.labels, var2.labels);
      }
   }
}
