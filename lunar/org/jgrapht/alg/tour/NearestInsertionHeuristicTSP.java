package org.jgrapht.alg.tour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;

public class NearestInsertionHeuristicTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   private GraphPath<V, E> subtour;

   public NearestInsertionHeuristicTSP() {
      this(null);
   }

   public NearestInsertionHeuristicTSP(GraphPath<V, E> var1) {
      this.subtour = var1;
   }

   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.checkGraph(var1);
      return var1.vertexSet().size() == 1 ? this.getSingletonTour(var1) : this.vertexListToTour(this.augment(this.subtour(var1), var1), var1);
   }

   private List<V> subtour(Graph<V, E> var1) {
      ArrayList var2 = new ArrayList();
      if (this.subtour != null) {
         if (this.subtour.getGraph() != null && !var1.equals(this.subtour.getGraph())) {
            throw new IllegalArgumentException("Specified sub-tour is for a different Graph instance");
         }

         if (!var1.vertexSet().containsAll(this.subtour.getVertexList())) {
            throw new IllegalArgumentException("Graph does not contain specified sub-tour vertices");
         }

         if (!var1.edgeSet().containsAll(this.subtour.getEdgeList())) {
            throw new IllegalArgumentException("Graph does not contain specified sub-tour edges");
         }

         if (this.subtour.getStartVertex().equals(this.subtour.getEndVertex())) {
            var2.addAll(this.subtour.getVertexList().subList(1, this.subtour.getVertexList().size()));
         } else {
            var2.addAll(this.subtour.getVertexList());
         }
      }

      if (var2.isEmpty()) {
         Object var3 = Collections.min(var1.edgeSet(), (var1x, var2x) -> Double.compare(var1.getEdgeWeight((E)var1x), var1.getEdgeWeight((E)var2x)));
         var2.add(var1.getEdgeSource(var3));
         var2.add(var1.getEdgeTarget(var3));
      }

      return var2;
   }

   private Map<V, NearestInsertionHeuristicTSP.Closest<V>> getClosest(List<V> var1, Set<V> var2, Graph<V, E> var3) {
      return var1.stream().collect(Collectors.toMap(var0 -> (V)var0, var3x -> this.getClosest((V)var3x, var2, var3)));
   }

   private NearestInsertionHeuristicTSP.Closest<V> getClosest(V var1, Set<V> var2, Graph<V, E> var3) {
      Object var4 = null;
      double var5 = Double.MAX_VALUE;

      for (Object var8 : var2) {
         double var9 = var3.getEdgeWeight(var3.getEdge(var1, var8));
         if (var9 < var5) {
            var4 = var8;
            var5 = var9;
         }
      }

      return new NearestInsertionHeuristicTSP.Closest<>((V)var1, (V)var4, var5);
   }

   private void updateClosest(Map<V, NearestInsertionHeuristicTSP.Closest<V>> var1, NearestInsertionHeuristicTSP.Closest<V> var2, Set<V> var3, Graph<V, E> var4) {
      var3.remove(var2.getUnvisitedVertex());
      if (var3.isEmpty()) {
         var1.clear();
      } else {
         var1.replaceAll(
            (var4x, var5) -> (NearestInsertionHeuristicTSP.Closest)(!var2.getTourVertex().equals(var4x)
                  && !var2.getUnvisitedVertex().equals(var5.getUnvisitedVertex())
               ? var5
               : this.getClosest((V)var4x, var3, var4))
         );
         var1.put(var2.getUnvisitedVertex(), this.getClosest((V)var2.getUnvisitedVertex(), var3, var4));
      }
   }

   private NearestInsertionHeuristicTSP.Closest<V> chooseClosest(Map<V, NearestInsertionHeuristicTSP.Closest<V>> var1) {
      return Collections.min(var1.values());
   }

   private List<V> augment(List<V> var1, Graph<V, E> var2) {
      HashSet var3 = new HashSet<>(var2.vertexSet());
      var3.removeAll(var1);
      return this.augment(var1, this.getClosest(var1, var3, var2), var3, var2);
   }

   private List<V> augment(List<V> var1, Map<V, NearestInsertionHeuristicTSP.Closest<V>> var2, Set<V> var3, Graph<V, E> var4) {
      while (!var3.isEmpty()) {
         NearestInsertionHeuristicTSP.Closest var5 = this.chooseClosest(var2);
         int var6 = var1.indexOf(var5.getTourVertex());
         Object var7 = var1.get(var6 == 0 ? var1.size() - 1 : var6 - 1);
         Object var8 = var1.get(var6 == var1.size() - 1 ? 0 : var6 + 1);
         double var9 = var4.getEdgeWeight(var4.getEdge(var7, var5.getUnvisitedVertex()))
            + var5.getDistance()
            - var4.getEdgeWeight(var4.getEdge(var7, var5.getTourVertex()));
         double var11 = var4.getEdgeWeight(var4.getEdge(var8, var5.getUnvisitedVertex()))
            + var5.getDistance()
            - var4.getEdgeWeight(var4.getEdge(var8, var5.getTourVertex()));
         if (var9 < var11) {
            var1.add(var6, var5.getUnvisitedVertex());
         } else {
            var1.add(var6 + 1, var5.getUnvisitedVertex());
         }

         this.updateClosest(var2, var5, var3, var4);
      }

      return var1;
   }

   private static class Closest<V> implements Comparable<NearestInsertionHeuristicTSP.Closest<V>> {
      private final V tourVertex;
      private final V unvisitedVertex;
      private final double distance;

      Closest(V var1, V var2, double var3) {
         this.tourVertex = (V)var1;
         this.unvisitedVertex = (V)var2;
         this.distance = var3;
      }

      public V getTourVertex() {
         return this.tourVertex;
      }

      public V getUnvisitedVertex() {
         return this.unvisitedVertex;
      }

      public double getDistance() {
         return this.distance;
      }

      public int compareTo(NearestInsertionHeuristicTSP.Closest<V> var1) {
         return Double.compare(this.distance, var1.distance);
      }
   }
}
