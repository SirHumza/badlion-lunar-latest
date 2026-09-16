package org.jgrapht;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jgrapht.graph.AsUndirectedGraph;
import org.jgrapht.util.VertexToIntegerMapping;

public abstract class Graphs {
   public static <V, E> E addEdge(Graph<V, E> var0, V var1, V var2, double var3) {
      Supplier var5 = var0.getEdgeSupplier();
      if (var5 == null) {
         throw new UnsupportedOperationException("Graph contains no edge supplier");
      } else {
         Object var6 = var5.get();
         if (var0.addEdge(var1, var2, var6)) {
            var0.setEdgeWeight(var6, var3);
            return (E)var6;
         } else {
            return null;
         }
      }
   }

   public static <V, E> E addEdgeWithVertices(Graph<V, E> var0, V var1, V var2) {
      var0.addVertex(var1);
      var0.addVertex(var2);
      return (E)var0.addEdge(var1, var2);
   }

   public static <V, E> boolean addEdgeWithVertices(Graph<V, E> var0, Graph<V, E> var1, E var2) {
      Object var3 = var1.getEdgeSource(var2);
      Object var4 = var1.getEdgeTarget(var2);
      var0.addVertex(var3);
      var0.addVertex(var4);
      return var0.addEdge(var3, var4, var2);
   }

   public static <V, E> E addEdgeWithVertices(Graph<V, E> var0, V var1, V var2, double var3) {
      var0.addVertex(var1);
      var0.addVertex(var2);
      return addEdge(var0, var1, var2, var3);
   }

   public static <V, E> boolean addGraph(Graph<? super V, ? super E> var0, Graph<V, E> var1) {
      boolean var2 = addAllVertices(var0, var1.vertexSet());
      return var2 | addAllEdges(var0, var1, var1.edgeSet());
   }

   public static <V, E> void addGraphReversed(Graph<? super V, ? super E> var0, Graph<V, E> var1) {
      if (var1.getType().isDirected() && var0.getType().isDirected()) {
         addAllVertices(var0, var1.vertexSet());

         for (Object var3 : var1.edgeSet()) {
            var0.addEdge(var1.getEdgeTarget(var3), var1.getEdgeSource(var3));
         }
      } else {
         throw new IllegalArgumentException("graph must be directed");
      }
   }

   public static <V, E> boolean addAllEdges(Graph<? super V, ? super E> var0, Graph<V, E> var1, Collection<? extends E> var2) {
      boolean var3 = false;

      for (Object var5 : var2) {
         Object var6 = var1.getEdgeSource(var5);
         Object var7 = var1.getEdgeTarget(var5);
         var0.addVertex(var6);
         var0.addVertex(var7);
         var3 |= var0.addEdge(var6, var7, var5);
      }

      return var3;
   }

   public static <V, E> boolean addAllVertices(Graph<? super V, ? super E> var0, Collection<? extends V> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         var2 |= var0.addVertex(var4);
      }

      return var2;
   }

   public static <V, E> List<V> neighborListOf(Graph<V, E> var0, V var1) {
      ArrayList var2 = new ArrayList();

      for (Object var4 : var0.iterables().edgesOf(var1)) {
         var2.add(getOppositeVertex(var0, var4, var1));
      }

      return var2;
   }

   public static <V, E> Set<V> neighborSetOf(Graph<V, E> var0, V var1) {
      LinkedHashSet var2 = new LinkedHashSet();

      for (Object var4 : var0.iterables().edgesOf(var1)) {
         var2.add(getOppositeVertex(var0, var4, var1));
      }

      return var2;
   }

   public static <V, E> List<V> predecessorListOf(Graph<V, E> var0, V var1) {
      ArrayList var2 = new ArrayList();

      for (Object var4 : var0.iterables().incomingEdgesOf(var1)) {
         var2.add(getOppositeVertex(var0, var4, var1));
      }

      return var2;
   }

   public static <V, E> List<V> successorListOf(Graph<V, E> var0, V var1) {
      ArrayList var2 = new ArrayList();

      for (Object var4 : var0.iterables().outgoingEdgesOf(var1)) {
         var2.add(getOppositeVertex(var0, var4, var1));
      }

      return var2;
   }

   public static <V, E> Graph<V, E> undirectedGraph(Graph<V, E> var0) {
      if (var0.getType().isDirected()) {
         return new AsUndirectedGraph<>(var0);
      } else if (var0.getType().isUndirected()) {
         return var0;
      } else {
         throw new IllegalArgumentException("graph must be either directed or undirected");
      }
   }

   public static <V, E> boolean testIncidence(Graph<V, E> var0, E var1, V var2) {
      return var0.getEdgeSource(var1).equals(var2) || var0.getEdgeTarget(var1).equals(var2);
   }

   public static <V, E> V getOppositeVertex(Graph<V, E> var0, E var1, V var2) {
      Object var3 = var0.getEdgeSource(var1);
      Object var4 = var0.getEdgeTarget(var1);
      if (var2.equals(var3)) {
         return (V)var4;
      } else if (var2.equals(var4)) {
         return (V)var3;
      } else {
         throw new IllegalArgumentException("no such vertex: " + var2.toString());
      }
   }

   public static <V, E> boolean removeVertexAndPreserveConnectivity(Graph<V, E> var0, V var1) {
      if (!var0.containsVertex(var1)) {
         return false;
      }

      if (vertexHasPredecessors(var0, var1)) {
         List var2 = predecessorListOf(var0, var1);
         List var3 = successorListOf(var0, var1);

         for (Object var5 : var2) {
            addOutgoingEdges(var0, var5, var3);
         }
      }

      var0.removeVertex(var1);
      return true;
   }

   public static <V, E> boolean removeVerticesAndPreserveConnectivity(Graph<V, E> var0, Predicate<V> var1) {
      ArrayList var2 = new ArrayList();

      for (Object var4 : var0.vertexSet()) {
         if (var1.test(var4)) {
            var2.add(var4);
         }
      }

      return removeVertexAndPreserveConnectivity(var0, var2);
   }

   public static <V, E> boolean removeVertexAndPreserveConnectivity(Graph<V, E> var0, Iterable<V> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         if (removeVertexAndPreserveConnectivity(var0, var4)) {
            var2 = true;
         }
      }

      return var2;
   }

   public static <V, E> void addOutgoingEdges(Graph<V, E> var0, V var1, Iterable<V> var2) {
      if (!var0.containsVertex(var1)) {
         var0.addVertex(var1);
      }

      for (Object var4 : var2) {
         if (!var0.containsVertex(var4)) {
            var0.addVertex(var4);
         }

         var0.addEdge(var1, var4);
      }
   }

   public static <V, E> void addIncomingEdges(Graph<V, E> var0, V var1, Iterable<V> var2) {
      if (!var0.containsVertex(var1)) {
         var0.addVertex(var1);
      }

      for (Object var4 : var2) {
         if (!var0.containsVertex(var4)) {
            var0.addVertex(var4);
         }

         var0.addEdge(var4, var1);
      }
   }

   public static <V, E> boolean vertexHasSuccessors(Graph<V, E> var0, V var1) {
      return !var0.outgoingEdgesOf(var1).isEmpty();
   }

   public static <V, E> boolean vertexHasPredecessors(Graph<V, E> var0, V var1) {
      return !var0.incomingEdgesOf(var1).isEmpty();
   }

   public static <V, E> VertexToIntegerMapping<V> getVertexToIntegerMapping(Graph<V, E> var0) {
      return new VertexToIntegerMapping<>(Objects.requireNonNull(var0).vertexSet());
   }
}
