package org.jgrapht.alg.vertexcover;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.VertexCoverAlgorithm;
import org.jgrapht.alg.vertexcover.util.RatioVertex;

public class ClarksonTwoApproxVCImpl<V, E> implements VertexCoverAlgorithm<V> {
   private static int vertexCounter = 0;
   private final Graph<V, E> graph;
   private final Map<V, Double> vertexWeightMap;

   public ClarksonTwoApproxVCImpl(Graph<V, E> var1) {
      this.graph = GraphTests.requireUndirected(var1);
      this.vertexWeightMap = var1.vertexSet().stream().collect(Collectors.toMap(Function.identity(), var0 -> 1.0));
   }

   public ClarksonTwoApproxVCImpl(Graph<V, E> var1, Map<V, Double> var2) {
      this.graph = GraphTests.requireUndirected(var1);
      this.vertexWeightMap = Objects.requireNonNull(var2);
   }

   @Override
   public VertexCoverAlgorithm.VertexCover<V> getVertexCover() {
      LinkedHashSet var1 = new LinkedHashSet();
      double var2 = 0.0;
      HashMap var4 = new HashMap();
      this.graph
         .vertexSet()
         .stream()
         .filter(var1x -> this.graph.degreeOf((V)var1x) > 0)
         .forEach(var2x -> var4.put(var2x, new RatioVertex(vertexCounter++, (V)var2x, this.vertexWeightMap.get(var2x))));

      for (Object var6 : this.graph.edgeSet()) {
         Object var7 = this.graph.getEdgeSource((E)var6);
         RatioVertex var8 = (RatioVertex)var4.get(var7);
         Object var9 = this.graph.getEdgeTarget((E)var6);
         RatioVertex var10 = (RatioVertex)var4.get(var9);
         var8.addNeighbor(var10);
         var10.addNeighbor(var8);
         assert var8.neighbors.get(var10).equals(var10.neighbors.get(var8)) : " in an undirected graph, if vx is a neighbor of ux, then ux must be a neighbor of vx";
      }

      TreeSet var11 = new TreeSet();
      var11.addAll(var4.values());
      assert var11.size() == var4.size() : "vertices in vertexEncapsulationMap: "
         + this.graph.vertexSet().size()
         + "vertices in working graph: "
         + var11.size();

      while (!var11.isEmpty()) {
         RatioVertex var12 = (RatioVertex)var11.pollFirst();
         assert var11.parallelStream().allMatch(var1x -> var12.getRatio() <= var1x.getRatio()) : "vx does not have the smallest ratio among all elements. VX: "
            + var12
            + " WorkingGraph: "
            + var11;
         double var13 = var12.getRatio();

         for (RatioVertex var15 : var12.neighbors.keySet()) {
            if (var15 != var12) {
               var11.remove(var15);
               var15.weight = var15.weight - var13 * var12.neighbors.get(var15).intValue();
               var15.removeNeighbor(var12);
               if (var15.getDegree() > 0) {
                  var11.add(var15);
               }
            }
         }

         var1.add(var12.v);
         var2 += this.vertexWeightMap.get(var12.v);
         assert !var11.parallelStream().anyMatch(var1x -> var1x.ID == var12.ID) : "vx should no longer exist in the working graph";
      }

      return new VertexCoverAlgorithm.VertexCoverImpl<>(var1, var2);
   }
}
