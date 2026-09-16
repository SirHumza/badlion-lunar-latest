package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.VertexDegreeComparator;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.util.CollectionUtil;
import org.jgrapht.util.TypeUtil;

public class FloydWarshallShortestPaths<V, E> extends BaseShortestPathAlgorithm<V, E> {
   private final List<V> vertices;
   private final List<Integer> degrees;
   private final Map<V, Integer> vertexIndices;
   private final int minDegreeOne;
   private final int minDegreeTwo;
   private double[][] d = null;
   private Object[][] backtrace = null;
   private Object[][] lastHopMatrix = null;

   public FloydWarshallShortestPaths(Graph<V, E> var1) {
      super(var1);
      this.vertices = (List<V>)(new ArrayList<>(var1.vertexSet()));
      Collections.sort(this.vertices, VertexDegreeComparator.of(var1));
      this.degrees = new ArrayList<>();
      this.vertexIndices = CollectionUtil.newHashMapWithExpectedSize(this.vertices.size());
      int var2 = 0;
      int var3 = this.vertices.size();
      int var4 = this.vertices.size();

      for (Object var6 : this.vertices) {
         this.vertexIndices.put((V)var6, var2);
         int var7 = var1.degreeOf(var6);
         this.degrees.add(var7);
         if (var7 > 1) {
            if (var2 < var3) {
               var3 = var2;
            }

            if (var2 < var4) {
               var4 = var2;
            }
         } else if (var2 < var3 && var7 == 1) {
            var3 = var2;
         }

         var2++;
      }

      this.minDegreeOne = var3;
      this.minDegreeTwo = var4;
   }

   public int getShortestPathsCount() {
      this.lazyCalculateMatrix();
      int var1 = this.vertices.size();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         for (int var4 = 0; var4 < var1; var4++) {
            if (var3 != var4 && Double.isFinite(this.d[var3][var4])) {
               var2++;
            }
         }
      }

      return var2;
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      }

      this.lazyCalculateMatrix();
      int var3 = this.vertexIndices.get(var1);
      int var4 = this.vertexIndices.get(var2);
      if (this.backtrace[var3][var4] == null) {
         return this.createEmptyPath((V)var1, (V)var2);
      }

      ArrayList var5 = new ArrayList();
      Object var6 = var1;

      while (!var6.equals(var2)) {
         int var7 = this.vertexIndices.get(var6);
         Object var8 = TypeUtil.uncheckedCast(this.backtrace[var7][var4]);
         var5.add(var8);
         var6 = Graphs.getOppositeVertex(this.graph, (E)var8, (V)var6);
      }

      return new GraphWalk<>(this.graph, (V)var1, (V)var2, null, var5, this.d[var3][var4]);
   }

   @Override
   public double getPathWeight(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      }

      this.lazyCalculateMatrix();
      return this.d[this.vertexIndices.get(var1)][this.vertexIndices.get(var2)];
   }

   @Override
   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1) {
      return new FloydWarshallShortestPaths.FloydWarshallSingleSourcePaths(var1);
   }

   public V getFirstHop(V var1, V var2) {
      this.lazyCalculateMatrix();
      int var3 = this.vertexIndices.get(var1);
      int var4 = this.vertexIndices.get(var2);
      if (this.backtrace[var3][var4] == null) {
         return null;
      }

      Object var5 = TypeUtil.uncheckedCast(this.backtrace[var3][var4]);
      return Graphs.getOppositeVertex(this.graph, (E)var5, (V)var1);
   }

   public V getLastHop(V var1, V var2) {
      this.lazyCalculateMatrix();
      int var3 = this.vertexIndices.get(var1);
      int var4 = this.vertexIndices.get(var2);
      if (this.backtrace[var3][var4] == null) {
         return null;
      }

      this.populateLastHopMatrix();
      Object var5 = TypeUtil.uncheckedCast(this.lastHopMatrix[var3][var4]);
      return Graphs.getOppositeVertex(this.graph, (E)var5, (V)var2);
   }

   private void lazyCalculateMatrix() {
      if (this.d == null) {
         int var1 = this.vertices.size();
         this.backtrace = new Object[var1][var1];
         this.d = new double[var1][var1];

         for (int var2 = 0; var2 < var1; var2++) {
            Arrays.fill(this.d[var2], Double.POSITIVE_INFINITY);
         }

         for (int var11 = 0; var11 < var1; var11++) {
            this.d[var11][var11] = 0.0;
         }

         if (this.graph.getType().isUndirected()) {
            for (Object var3 : this.graph.edgeSet()) {
               Object var4 = this.graph.getEdgeSource((E)var3);
               Object var5 = this.graph.getEdgeTarget((E)var3);
               if (!var4.equals(var5)) {
                  int var6 = this.vertexIndices.get(var4);
                  int var7 = this.vertexIndices.get(var5);
                  double var8 = this.graph.getEdgeWeight((E)var3);
                  if (Double.compare(var8, this.d[var6][var7]) < 0) {
                     this.d[var6][var7] = this.d[var7][var6] = var8;
                     this.backtrace[var6][var7] = var3;
                     this.backtrace[var7][var6] = var3;
                  }
               }
            }
         } else {
            for (Object var15 : this.graph.vertexSet()) {
               int var17 = this.vertexIndices.get(var15);

               for (Object var21 : this.graph.outgoingEdgesOf((V)var15)) {
                  Object var22 = Graphs.getOppositeVertex(this.graph, (E)var21, (V)var15);
                  if (!var15.equals(var22)) {
                     int var23 = this.vertexIndices.get(var22);
                     double var9 = this.graph.getEdgeWeight((E)var21);
                     if (Double.compare(var9, this.d[var17][var23]) < 0) {
                        this.d[var17][var23] = var9;
                        this.backtrace[var17][var23] = var21;
                     }
                  }
               }
            }
         }

         for (int var14 = this.minDegreeTwo; var14 < var1; var14++) {
            for (int var16 = this.minDegreeOne; var16 < var1; var16++) {
               if (var16 != var14) {
                  for (int var18 = this.minDegreeOne; var18 < var1; var18++) {
                     if (var16 != var18 && var18 != var14) {
                        double var20 = this.d[var16][var14] + this.d[var14][var18];
                        if (Double.compare(var20, this.d[var16][var18]) < 0) {
                           this.d[var16][var18] = var20;
                           this.backtrace[var16][var18] = this.backtrace[var16][var14];
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void populateLastHopMatrix() {
      this.lazyCalculateMatrix();
      if (this.lastHopMatrix == null) {
         int var1 = this.vertices.size();
         this.lastHopMatrix = new Object[var1][var1];

         for (int var2 = 0; var2 < var1; var2++) {
            for (int var3 = 0; var3 < var1; var3++) {
               if (var2 != var3 && this.lastHopMatrix[var2][var3] == null && this.backtrace[var2][var3] != null) {
                  Object var4 = this.vertices.get(var2);
                  Object var5 = this.vertices.get(var3);

                  while (!var4.equals(var5)) {
                     int var6 = this.vertexIndices.get(var4);
                     Object var7 = TypeUtil.uncheckedCast(this.backtrace[var6][var3]);
                     Object var8 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var4);
                     this.lastHopMatrix[var2][this.vertexIndices.get(var8)] = var7;
                     var4 = var8;
                  }
               }
            }
         }
      }
   }

   class FloydWarshallSingleSourcePaths implements ShortestPathAlgorithm.SingleSourcePaths<V, E> {
      private final Object source;

      public FloydWarshallSingleSourcePaths(V var2) {
         this.source = var2;
      }

      @Override
      public Graph<V, E> getGraph() {
         return FloydWarshallShortestPaths.this.graph;
      }

      @Override
      public V getSourceVertex() {
         return (V)this.source;
      }

      @Override
      public double getWeight(V var1) {
         return FloydWarshallShortestPaths.this.getPathWeight((V)this.source, (V)var1);
      }

      @Override
      public GraphPath<V, E> getPath(V var1) {
         return FloydWarshallShortestPaths.this.getPath((V)this.source, (V)var1);
      }
   }
}
