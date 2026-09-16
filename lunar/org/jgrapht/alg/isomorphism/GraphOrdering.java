package org.jgrapht.alg.isomorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.util.VertexDegreeComparator;
import org.jgrapht.util.VertexToIntegerMapping;

final class GraphOrdering<V, E> {
   private final Graph<V, E> graph;
   private final Map<V, Integer> mapVertexToOrder;
   private final List<V> mapOrderToVertex;
   private final int vertexCount;
   private final int[][] outgoingEdges;
   private final int[][] incomingEdges;
   private final E[] edgeCache;
   private final byte[] adjMatrix;
   private final boolean cacheEdges;

   public GraphOrdering(Graph<V, E> var1, boolean var2, boolean var3) {
      this.graph = var1;
      this.cacheEdges = var3;
      ArrayList var4 = new ArrayList<>(var1.vertexSet());
      if (var2) {
         var4.sort(VertexDegreeComparator.of(var1));
      }

      this.vertexCount = var4.size();
      this.mapVertexToOrder = (Map<V, Integer>)new VertexToIntegerMapping<>(var4).getVertexMap();
      this.mapOrderToVertex = var4;
      if (var3) {
         this.outgoingEdges = new int[this.vertexCount][];
         this.incomingEdges = new int[this.vertexCount][];
         this.edgeCache = (E[])(new Object[this.vertexCount * this.vertexCount]);
         this.adjMatrix = new byte[this.vertexCount * this.vertexCount];
      } else {
         this.outgoingEdges = null;
         this.incomingEdges = null;
         this.edgeCache = null;
         this.adjMatrix = null;
      }
   }

   public GraphOrdering(Graph<V, E> var1) {
      this(var1, false, true);
   }

   public int getVertexCount() {
      return this.vertexCount;
   }

   public int[] getOutEdges(int var1) {
      if (this.cacheEdges && this.outgoingEdges[var1] != null) {
         return this.outgoingEdges[var1];
      }

      Object var2 = this.getVertex(var1);
      Set var3 = this.graph.outgoingEdgesOf((V)var2);
      int[] var4 = new int[var3.size()];
      int var5 = 0;

      for (Object var7 : var3) {
         Object var8 = this.graph.getEdgeSource((E)var7);
         Object var9 = this.graph.getEdgeTarget((E)var7);
         var4[var5++] = this.mapVertexToOrder.get(var8.equals(var2) ? var9 : var8);
      }

      if (this.cacheEdges) {
         this.outgoingEdges[var1] = var4;
      }

      return var4;
   }

   public int[] getInEdges(int var1) {
      if (this.cacheEdges && this.incomingEdges[var1] != null) {
         return this.incomingEdges[var1];
      }

      Object var2 = this.getVertex(var1);
      Set var3 = this.graph.incomingEdgesOf((V)var2);
      int[] var4 = new int[var3.size()];
      int var5 = 0;

      for (Object var7 : var3) {
         Object var8 = this.graph.getEdgeSource((E)var7);
         Object var9 = this.graph.getEdgeTarget((E)var7);
         var4[var5++] = this.mapVertexToOrder.get(var8.equals(var2) ? var9 : var8);
      }

      if (this.cacheEdges) {
         this.incomingEdges[var1] = var4;
      }

      return var4;
   }

   public boolean hasEdge(int var1, int var2) {
      int var3 = 0;
      if (this.cacheEdges) {
         var3 = var1 * this.vertexCount + var2;
         byte var9 = this.adjMatrix[var3];
         if (var9 != 0) {
            return var9 > 0;
         } else {
            Object var10 = this.getVertex(var1);
            Object var6 = this.getVertex(var2);
            Object var7 = this.graph.getEdge((V)var10, (V)var6);
            if (var7 == null) {
               this.adjMatrix[var3] = -1;
               return false;
            } else {
               this.adjMatrix[var3] = 1;
               this.edgeCache[var3] = (E)var7;
               return true;
            }
         }
      } else {
         Object var4 = this.getVertex(var1);
         Object var5 = this.getVertex(var2);
         return this.graph.containsEdge((V)var4, (V)var5);
      }
   }

   public V getVertex(int var1) {
      return this.mapOrderToVertex.get(var1);
   }

   public E getEdge(int var1, int var2) {
      if (this.cacheEdges) {
         int var6 = var1 * this.vertexCount + var2;
         byte var7 = this.adjMatrix[var6];
         if (var7 == 0) {
            this.hasEdge(var1, var2);
         }

         return this.edgeCache[var6];
      } else {
         Object var3 = this.getVertex(var1);
         Object var4 = this.getVertex(var2);
         return this.graph.getEdge((V)var3, (V)var4);
      }
   }

   public int getVertexNumber(V var1) {
      return this.mapVertexToOrder.get(var1);
   }

   public int[] getEdgeNumbers(E var1) {
      Object var2 = this.graph.getEdgeSource((E)var1);
      Object var3 = this.graph.getEdgeTarget((E)var1);
      return new int[]{this.mapVertexToOrder.get(var2), this.mapVertexToOrder.get(var3)};
   }

   public Graph<V, E> getGraph() {
      return this.graph;
   }
}
