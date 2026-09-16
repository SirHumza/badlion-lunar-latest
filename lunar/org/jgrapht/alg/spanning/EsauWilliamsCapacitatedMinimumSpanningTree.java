package org.jgrapht.alg.spanning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.CapacitatedSpanningTreeAlgorithm;
import org.jgrapht.alg.util.Pair;

public class EsauWilliamsCapacitatedMinimumSpanningTree<V, E> extends AbstractCapacitatedMinimumSpanningTree<V, E> {
   private final int numberOfOperationsParameter;
   private boolean isAlgorithmExecuted;

   public EsauWilliamsCapacitatedMinimumSpanningTree(Graph<V, E> var1, V var2, double var3, Map<V, Double> var5, int var6) {
      super(var1, (V)var2, var3, var5);
      this.numberOfOperationsParameter = var6;
      this.isAlgorithmExecuted = false;
   }

   @Override
   public CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> getCapacitatedSpanningTree() {
      if (this.isAlgorithmExecuted) {
         return this.bestSolution.calculateResultingSpanningTree();
      } else {
         this.bestSolution = this.getSolution();
         CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree var1 = this.bestSolution.calculateResultingSpanningTree();
         this.isAlgorithmExecuted = true;
         if (!var1.isCapacitatedSpanningTree(this.graph, this.root, this.capacity, this.demands)) {
            throw new IllegalArgumentException("This graph does not have a capacitated minimum spanning tree with the given capacity and demands.");
         } else {
            return var1;
         }
      }
   }

   protected AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation getSolution() {
      HashMap var1 = new HashMap();
      HashMap var2 = new HashMap();
      int var3 = 0;

      for (Object var5 : this.graph.vertexSet()) {
         if (var5 != this.root) {
            var1.put(var5, var3);
            HashSet var6 = new HashSet();
            var6.add(var5);
            var2.put(var3, Pair.of(var6, this.demands.get(var5)));
            var3++;
         }
      }

      this.bestSolution = new AbstractCapacitatedMinimumSpanningTree.CapacitatedSpanningTreeSolutionRepresentation(var1, var2);
      HashMap var16 = new HashMap();
      HashMap var17 = new HashMap();
      HashMap var18 = new HashMap();
      HashMap var7 = new HashMap();
      HashSet var8 = new HashSet<>(this.graph.vertexSet());
      var8.remove(this.root);

      while (true) {
         Iterator var9 = var8.iterator();

         while (var9.hasNext()) {
            Object var10 = var9.next();
            Object var11 = this.calculateClosestVertex((V)var10, var18, var7);
            if (var11 == null) {
               var9.remove();
               var16.remove(var10);
            } else {
               var17.put(var10, var11);
               var16.put(
                  var10, this.getDistance((V)var7.getOrDefault(this.bestSolution.getLabel((V)var10), var10), this.root) - this.getDistance((V)var10, (V)var11)
               );
            }
         }

         LinkedList var19 = this.getListOfBestOptions(var16);
         if (var19.isEmpty()) {
            AbstractCapacitatedMinimumSpanningTree.CapacitatedSpanningTreeSolutionRepresentation var20 = new AbstractCapacitatedMinimumSpanningTree.CapacitatedSpanningTreeSolutionRepresentation(
               var1, var2
            );
            var20.cleanUp();

            for (Integer var25 : new HashSet<>(var20.getLabels())) {
               var20.partitionSubtreesOfSubset(var20.getPartitionSet(var25), var25);
            }

            return var20;
         }

         Object var21 = var19.get((int)(Math.random() * var19.size()));
         Integer var23 = this.bestSolution.getLabel((V)var21);
         Object var12 = var17.get(var21);
         Integer var13 = this.bestSolution.getLabel((V)var12);
         Object var14 = var7.getOrDefault(var23, var21);
         Object var15 = var7.getOrDefault(var13, var12);
         if (this.bestSolution.getPartitionWeight(var23) < this.bestSolution.getPartitionWeight(var13)) {
            this.bestSolution.moveVertices(this.bestSolution.getPartitionSet(var23), var23, var13);
            if (this.getDistance((V)var14, this.root) < this.getDistance((V)var15, this.root)) {
               var7.put(var13, var14);
            } else {
               var7.put(var13, var15);
            }
         } else {
            this.bestSolution.moveVertices(this.bestSolution.getPartitionSet(var13), var13, var23);
            if (this.getDistance((V)var14, this.root) < this.getDistance((V)var15, this.root)) {
               var7.put(var23, var14);
            } else {
               var7.put(var23, var15);
            }
         }
      }
   }

   private LinkedList<V> getListOfBestOptions(Map<V, Double> var1) {
      LinkedList var2 = new LinkedList();

      for (Entry var4 : var1.entrySet()) {
         int var5 = 0;

         for (Object var7 : var2) {
            if ((Double)var1.get(var7) < (Double)var4.getValue()) {
               break;
            }

            var5++;
         }

         if (var2.size() == this.numberOfOperationsParameter) {
            if (var5 < var2.size()) {
               var2.removeLast();
               var2.add(var5, var4.getKey());
            }
         } else {
            var2.addLast(var4.getKey());
         }
      }

      return var2;
   }

   private V calculateClosestVertex(V var1, Map<V, Set<Integer>> var2, Map<Integer, V> var3) {
      Object var4 = null;
      Object var7 = var3.get(this.bestSolution.getLabel((V)var1));
      double var5;
      if (var7 != null) {
         var5 = this.getDistance((V)var7, this.root);
      } else {
         var5 = this.getDistance((V)var1, this.root);
      }

      for (Integer var9 : this.bestSolution.getLabels()) {
         Set var10 = (Set)var2.get(var1);
         if (var10 == null || !var10.contains(var9)) {
            Set var11 = this.bestSolution.getPartitionSet(var9);
            if (!var11.contains(var1)) {
               for (Object var13 : var11) {
                  if (this.graph.containsEdge((V)var1, (V)var13)) {
                     double var14 = this.bestSolution.getPartitionWeight(this.bestSolution.getLabel((V)var13))
                        + this.bestSolution.getPartitionWeight(this.bestSolution.getLabel((V)var1));
                     if (!(var14 <= this.capacity)) {
                        Set var18 = var2.computeIfAbsent(var1, var0 -> new HashSet());
                        var18.add(this.bestSolution.getLabel((V)var13));
                        break;
                     }

                     double var16 = this.getDistance((V)var1, (V)var13);
                     if (var16 < var5) {
                        var4 = var13;
                        var5 = var16;
                     }
                  }
               }
            }
         }
      }

      return (V)var4;
   }

   private double getDistance(V var1, V var2) {
      Object var3 = this.graph.getEdge((V)var1, (V)var2);
      return var3 == null ? Double.MAX_VALUE : this.graph.getEdgeWeight((E)var3);
   }
}
