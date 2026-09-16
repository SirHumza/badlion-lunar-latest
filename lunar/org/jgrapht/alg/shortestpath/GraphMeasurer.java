package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.ToleranceDoubleComparator;

public class GraphMeasurer<V, E> {
   private final Graph<V, E> graph;
   private final ShortestPathAlgorithm<V, E> shortestPathAlgorithm;
   private Map<V, Double> eccentricityMap = null;
   private double diameter = 0.0;
   private double radius = Double.POSITIVE_INFINITY;

   public GraphMeasurer(Graph<V, E> var1) {
      this(var1, new FloydWarshallShortestPaths<>(var1));
   }

   public GraphMeasurer(Graph<V, E> var1, ShortestPathAlgorithm<V, E> var2) {
      this.graph = var1;
      this.shortestPathAlgorithm = var2;
   }

   public double getDiameter() {
      this.computeEccentricityMap();
      return this.diameter;
   }

   public double getRadius() {
      this.computeEccentricityMap();
      return this.radius;
   }

   public Map<V, Double> getVertexEccentricityMap() {
      this.computeEccentricityMap();
      return Collections.unmodifiableMap(this.eccentricityMap);
   }

   public Set<V> getGraphCenter() {
      this.computeEccentricityMap();
      LinkedHashSet var1 = new LinkedHashSet();
      ToleranceDoubleComparator var2 = new ToleranceDoubleComparator();

      for (Entry var4 : this.eccentricityMap.entrySet()) {
         if (var2.compare((Double)var4.getValue(), this.radius) == 0) {
            var1.add(var4.getKey());
         }
      }

      return var1;
   }

   public Set<V> getGraphPeriphery() {
      this.computeEccentricityMap();
      LinkedHashSet var1 = new LinkedHashSet();
      ToleranceDoubleComparator var2 = new ToleranceDoubleComparator();

      for (Entry var4 : this.eccentricityMap.entrySet()) {
         if (var2.compare((Double)var4.getValue(), this.diameter) == 0) {
            var1.add(var4.getKey());
         }
      }

      return var1;
   }

   public Set<V> getGraphPseudoPeriphery() {
      this.computeEccentricityMap();
      LinkedHashSet var1 = new LinkedHashSet();
      ToleranceDoubleComparator var2 = new ToleranceDoubleComparator();

      for (Entry var4 : this.eccentricityMap.entrySet()) {
         Object var5 = var4.getKey();

         for (Object var7 : this.graph.vertexSet()) {
            if (var2.compare(this.shortestPathAlgorithm.getPathWeight((V)var5, (V)var7), (Double)var4.getValue()) == 0
               && var2.compare((Double)var4.getValue(), this.eccentricityMap.get(var7)) == 0) {
               var1.add(var4.getKey());
            }
         }
      }

      return var1;
   }

   private void computeEccentricityMap() {
      if (this.eccentricityMap == null) {
         this.eccentricityMap = new LinkedHashMap<>();
         if (this.graph.getType().isUndirected()) {
            ArrayList var1 = new ArrayList<>(this.graph.vertexSet());
            double[] var2 = new double[var1.size()];

            for (int var3 = 0; var3 < var1.size() - 1; var3++) {
               for (int var4 = var3 + 1; var4 < var1.size(); var4++) {
                  double var5 = this.shortestPathAlgorithm.getPathWeight((V)var1.get(var3), (V)var1.get(var4));
                  var2[var3] = Math.max(var2[var3], var5);
                  var2[var4] = Math.max(var2[var4], var5);
               }
            }

            for (int var11 = 0; var11 < var1.size(); var11++) {
               this.eccentricityMap.put((V)var1.get(var11), var2[var11]);
            }
         } else {
            for (Object var9 : this.graph.vertexSet()) {
               double var12 = 0.0;

               for (Object var6 : this.graph.vertexSet()) {
                  var12 = Double.max(var12, this.shortestPathAlgorithm.getPathWeight((V)var9, (V)var6));
               }

               this.eccentricityMap.put((V)var9, var12);
            }
         }

         if (this.eccentricityMap.isEmpty()) {
            this.diameter = 0.0;
            this.radius = 0.0;
         } else {
            for (Object var10 : this.graph.vertexSet()) {
               this.diameter = Math.max(this.diameter, this.eccentricityMap.get(var10));
               this.radius = Math.min(this.radius, this.eccentricityMap.get(var10));
            }
         }
      }
   }
}
