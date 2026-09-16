package org.jgrapht.graph;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;

public class GraphWalk<V, E> implements Serializable, GraphPath<V, E> {
   private static final long serialVersionUID = 7663410644865380676L;
   protected Graph<V, E> graph;
   protected List<V> vertexList;
   protected List<E> edgeList;
   protected V startVertex;
   protected V endVertex;
   protected double weight;

   public GraphWalk(Graph<V, E> var1, V var2, V var3, List<E> var4, double var5) {
      this(var1, (V)var2, (V)var3, null, var4, var5);
   }

   public GraphWalk(Graph<V, E> var1, List<V> var2, double var3) {
      this(var1, (V)(var2.isEmpty() ? null : var2.get(0)), (V)(var2.isEmpty() ? null : var2.get(var2.size() - 1)), var2, null, var3);
   }

   public GraphWalk(Graph<V, E> var1, V var2, V var3, List<V> var4, List<E> var5, double var6) {
      if (var4 == null && var5 == null) {
         throw new IllegalArgumentException("Vertex list and edge list cannot both be null!");
      }

      if (var2 != null && var4 != null && var5 != null && var5.size() + 1 != var4.size()) {
         throw new IllegalArgumentException(
            "VertexList and edgeList do not correspond to the same path (cardinality of vertexList +1 must equal the cardinality of the edgeList)"
         );
      }

      if (var2 == null ^ var3 == null) {
         throw new IllegalArgumentException("Either the start and end vertices must both be null, or they must both be not null (one of them is null)");
      }

      this.graph = Objects.requireNonNull(var1);
      this.startVertex = (V)var2;
      this.endVertex = (V)var3;
      this.vertexList = var4;
      this.edgeList = var5;
      this.weight = var6;
   }

   @Override
   public Graph<V, E> getGraph() {
      return this.graph;
   }

   @Override
   public V getStartVertex() {
      return this.startVertex;
   }

   @Override
   public V getEndVertex() {
      return this.endVertex;
   }

   @Override
   public List<E> getEdgeList() {
      return this.edgeList != null ? this.edgeList : GraphPath.super.getEdgeList();
   }

   @Override
   public List<V> getVertexList() {
      return this.vertexList != null ? this.vertexList : GraphPath.super.getVertexList();
   }

   @Override
   public double getWeight() {
      return this.weight;
   }

   public void setWeight(double var1) {
      this.weight = var1;
   }

   @Override
   public int getLength() {
      if (this.edgeList != null) {
         return this.edgeList.size();
      } else {
         return this.vertexList != null && !this.vertexList.isEmpty() ? this.vertexList.size() - 1 : 0;
      }
   }

   @Override
   public String toString() {
      return this.vertexList != null ? this.vertexList.toString() : this.edgeList.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null || !(var1 instanceof GraphWalk)) {
         return false;
      } else if (this == var1) {
         return true;
      } else {
         GraphWalk var2 = (GraphWalk)var1;
         if (this.isEmpty() && var2.isEmpty()) {
            return true;
         } else if (this.isEmpty()) {
            return false;
         } else if (!this.startVertex.equals(var2.getStartVertex()) || !this.endVertex.equals(var2.getEndVertex())) {
            return false;
         } else {
            return this.edgeList == null && !var2.getGraph().getType().isAllowingMultipleEdges()
               ? this.vertexList.equals(var2.getVertexList())
               : this.getEdgeList().equals(var2.getEdgeList());
         }
      }
   }

   @Override
   public int hashCode() {
      int var1 = 1;
      if (this.isEmpty()) {
         return var1;
      }

      var1 = 31 * var1 + this.startVertex.hashCode();
      var1 = 31 * var1 + this.endVertex.hashCode();
      return this.edgeList != null ? 31 * var1 + this.edgeList.hashCode() : 31 * var1 + this.vertexList.hashCode();
   }

   public GraphWalk<V, E> reverse() {
      return this.reverse(null);
   }

   public GraphWalk<V, E> reverse(Function<GraphWalk<V, E>, Double> var1) {
      ArrayList var2 = null;
      ArrayList var3 = null;
      double var4 = 0.0;
      if (this.vertexList != null) {
         var2 = new ArrayList<>(this.vertexList);
         Collections.reverse(var2);
         if (this.graph.getType().isUndirected()) {
            var4 = this.weight;
         }

         if (!this.graph.getType().isUndirected() && this.edgeList == null) {
            for (int var6 = 0; var6 < var2.size() - 1; var6++) {
               Object var7 = var2.get(var6);
               Object var8 = var2.get(var6 + 1);
               Object var9 = this.graph.getEdge((V)var7, (V)var8);
               if (var9 == null) {
                  throw new InvalidGraphWalkException(
                     "this walk cannot be reversed. The graph does not contain a reverse arc for arc " + this.graph.getEdge((V)var8, (V)var7)
                  );
               }

               var4 += this.graph.getEdgeWeight((E)var9);
            }
         }
      }

      if (this.edgeList != null) {
         var3 = new ArrayList(this.edgeList.size());
         if (this.graph.getType().isUndirected()) {
            var3.addAll(this.edgeList);
            Collections.reverse(var3);
            var4 = this.weight;
         } else {
            ListIterator var11 = this.edgeList.listIterator(this.edgeList.size());

            while (var11.hasPrevious()) {
               Object var13 = var11.previous();
               Object var14 = this.graph.getEdgeSource((E)var13);
               Object var15 = this.graph.getEdgeTarget((E)var13);
               Object var10 = this.graph.getEdge((V)var15, (V)var14);
               if (var10 == null) {
                  throw new InvalidGraphWalkException("this walk cannot be reversed. The graph does not contain a reverse arc for arc " + var13);
               }

               var3.add(var10);
               var4 += this.graph.getEdgeWeight((E)var10);
            }
         }
      }

      GraphWalk var12 = new GraphWalk<>(this.graph, this.endVertex, this.startVertex, var2, var3, 0.0);
      if (var1 == null) {
         var12.weight = var4;
      } else {
         var12.weight = (Double)var1.apply(var12);
      }

      return var12;
   }

   public GraphWalk<V, E> concat(GraphWalk<V, E> var1, Function<GraphWalk<V, E>, Double> var2) {
      if (this.isEmpty()) {
         throw new IllegalArgumentException("An empty path cannot be extended");
      }

      if (!this.endVertex.equals(var1.getStartVertex())) {
         throw new IllegalArgumentException(
            "This path can only be extended by another path if the end vertex of the orginal path and the start vertex of the extension are equal."
         );
      }

      ArrayList var3 = null;
      ArrayList var4 = null;
      if (this.vertexList != null) {
         var3 = new ArrayList<>(this.vertexList);
         List var5 = var1.getVertexList();
         var3.addAll(var5.subList(1, var5.size()));
      }

      if (this.edgeList != null) {
         var4 = new ArrayList<>(this.edgeList);
         var4.addAll(var1.getEdgeList());
      }

      GraphWalk var6 = new GraphWalk<>(this.graph, this.startVertex, (V)var1.getEndVertex(), var3, var4, 0.0);
      var6.setWeight((Double)var2.apply(var6));
      return var6;
   }

   public boolean isEmpty() {
      return this.startVertex == null;
   }

   public void verify() {
      if (!this.isEmpty()) {
         if (this.vertexList != null && !this.vertexList.isEmpty()) {
            if (!this.startVertex.equals(this.vertexList.get(0))) {
               throw new InvalidGraphWalkException("The start vertex must be the first vertex in the vertex list");
            }

            if (!this.endVertex.equals(this.vertexList.get(this.vertexList.size() - 1))) {
               throw new InvalidGraphWalkException("The end vertex must be the last vertex in the vertex list");
            }

            if (!this.graph.vertexSet().containsAll(this.vertexList)) {
               throw new InvalidGraphWalkException("Not all vertices in the path are contained in the graph");
            }

            if (this.edgeList == null) {
               Iterator var1 = this.vertexList.iterator();
               Object var2 = var1.next();

               while (var1.hasNext()) {
                  Object var3 = var1.next();
                  if (this.graph.getEdge((V)var2, (V)var3) == null) {
                     throw new InvalidGraphWalkException(
                        "The vertexList does not constitute to a feasible path. Edge (" + var2 + "," + var3 + " does not exist in the graph."
                     );
                  }

                  var2 = var3;
               }
            }
         }

         if (this.edgeList != null && !this.edgeList.isEmpty()) {
            if (!Graphs.testIncidence(this.graph, this.edgeList.get(0), this.startVertex)) {
               throw new InvalidGraphWalkException("The first edge in the edge list must leave the start vertex");
            }

            if (!this.graph.edgeSet().containsAll(this.edgeList)) {
               throw new InvalidGraphWalkException("Not all edges in the path are contained in the graph");
            }

            if (this.vertexList == null) {
               Object var5 = this.startVertex;

               for (Object var9 : this.edgeList) {
                  if (!Graphs.testIncidence(this.graph, (E)var9, (V)var5)) {
                     throw new InvalidGraphWalkException("The edgeList does not constitute to a feasible path. Conflicting edge: " + var9);
                  }

                  var5 = Graphs.getOppositeVertex(this.graph, (E)var9, (V)var5);
               }

               if (!var5.equals(this.endVertex)) {
                  throw new InvalidGraphWalkException("The path defined by the edgeList does not end in the endVertex.");
               }
            }
         }

         if (this.vertexList != null && this.edgeList != null) {
            if (this.edgeList.size() + 1 != this.vertexList.size()) {
               throw new InvalidGraphWalkException(
                  "VertexList and edgeList do not correspond to the same path (cardinality of vertexList +1 must equal the cardinality of the edgeList)"
               );
            }

            for (int var6 = 0; var6 < this.vertexList.size() - 1; var6++) {
               Object var8 = this.vertexList.get(var6);
               Object var10 = this.vertexList.get(var6 + 1);
               Object var4 = this.getEdgeList().get(var6);
               if (this.graph.getType().isDirected()) {
                  if (!this.graph.getEdgeSource((E)var4).equals(var8) || !this.graph.getEdgeTarget((E)var4).equals(var10)) {
                     throw new InvalidGraphWalkException("VertexList and edgeList do not form a feasible path");
                  }
               } else if (!Graphs.testIncidence(this.graph, (E)var4, (V)var8) || !Graphs.getOppositeVertex(this.graph, (E)var4, (V)var8).equals(var10)) {
                  throw new InvalidGraphWalkException("VertexList and edgeList do not form a feasible path");
               }
            }
         }
      }
   }

   public static <V, E> GraphWalk<V, E> emptyWalk(Graph<V, E> var0) {
      return new GraphWalk<>(var0, null, null, Collections.emptyList(), Collections.emptyList(), 0.0);
   }

   public static <V, E> GraphWalk<V, E> singletonWalk(Graph<V, E> var0, V var1) {
      return singletonWalk(var0, (V)var1, 0.0);
   }

   public static <V, E> GraphWalk<V, E> singletonWalk(Graph<V, E> var0, V var1, double var2) {
      return new GraphWalk<>(var0, (V)var1, (V)var1, Collections.singletonList((V)var1), Collections.emptyList(), var2);
   }
}
