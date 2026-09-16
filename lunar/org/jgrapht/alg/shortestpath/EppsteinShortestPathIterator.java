package org.jgrapht.alg.shortestpath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphType;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.traverse.DepthFirstIterator;

public class EppsteinShortestPathIterator<V, E> implements Iterator<GraphPath<V, E>> {
   private final Graph<V, E> graph;
   private final V source;
   private final V sink;
   private EppsteinShortestPathIterator<V, E>.PathsGraphVertex pathsGraphRoot;
   private Map<V, Pair<Double, E>> distanceAndPredecessorMap;
   private Queue<EppsteinShortestPathIterator<V, E>.EppsteinGraphPath> pathsQueue;
   private Map<V, EppsteinShortestPathIterator<V, E>.PathsGraphVertex> hMapping;

   public EppsteinShortestPathIterator(Graph<V, E> var1, V var2, V var3) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null!");
      GraphType var4 = var1.getType();
      if (!var4.isDirected() || !var4.isSimple()) {
         throw new IllegalArgumentException("graph must be simple and directed");
      }

      if (!var1.containsVertex(var2)) {
         throw new IllegalArgumentException("Graph does not contain source vertex");
      }

      this.source = (V)var2;
      if (!var1.containsVertex(var3)) {
         throw new IllegalArgumentException("Graph does not contain sink vertex");
      }

      this.sink = (V)var3;
      this.pathsQueue = new PriorityQueue<>();
      TreeSingleSourcePathsImpl var5 = (TreeSingleSourcePathsImpl)new DijkstraShortestPath<>(new EdgeReversedGraph<>(var1)).getPaths((V)var3);
      GraphPath var6 = var5.getPath(var2);
      if (var6 != null) {
         this.distanceAndPredecessorMap = var5.getDistanceAndPredecessorMap();
         this.pathsQueue.add(new EppsteinShortestPathIterator.EppsteinGraphPath(var1, new ArrayList<>(0), this.distanceAndPredecessorMap, var6.getWeight()));
         this.hMapping = new HashMap<>();
         this.buildPathsGraph();
      }
   }

   @Override
   public boolean hasNext() {
      return !this.pathsQueue.isEmpty();
   }

   public GraphPath<V, E> next() {
      if (this.pathsQueue.isEmpty()) {
         throw new NoSuchElementException();
      }

      EppsteinShortestPathIterator.EppsteinGraphPath var1 = this.pathsQueue.remove();
      this.addOneEdgeExtension(var1);
      return var1;
   }

   private void addOneEdgeExtension(EppsteinShortestPathIterator<V, E>.EppsteinGraphPath var1) {
      EppsteinShortestPathIterator.PathsGraphVertex var2;
      if (var1.pathsGraphVertices.isEmpty()) {
         var2 = this.pathsGraphRoot;
      } else {
         var2 = var1.pathsGraphVertices.get(var1.pathsGraphVertices.size() - 1);
      }

      if (var2.left != null) {
         this.addExtension(var1, var2.left, var2.left.delta - var2.delta);
      }

      if (var2.right != null) {
         this.addExtension(var1, var2.right, var2.right.delta - var2.delta);
      }

      if (var2.rest != null) {
         this.addExtension(var1, var2.rest, var2.rest.delta - var2.delta);
      }

      if (var2.cross != null) {
         this.addExtension(var1, var2.cross, var2.cross.delta);
      }
   }

   private void addExtension(EppsteinShortestPathIterator<V, E>.EppsteinGraphPath var1, EppsteinShortestPathIterator<V, E>.PathsGraphVertex var2, double var3) {
      ArrayList var5 = new ArrayList<>(var1.pathsGraphVertices);
      var5.add(var2);
      this.pathsQueue.add(new EppsteinShortestPathIterator.EppsteinGraphPath(this.graph, var5, this.distanceAndPredecessorMap, var1.weight + var3));
   }

   private void buildPathsGraph() {
      this.buildDGraph();
      this.addCrossEdges();
      this.addPathGraphRoot();
   }

   private void buildDGraph() {
      DepthFirstIterator var1 = new DepthFirstIterator<>(this.graph, this.source);
      ArrayDeque var2 = new ArrayDeque();

      while (var1.hasNext()) {
         Object var3 = var1.next();
         if (this.distanceAndPredecessorMap.containsKey(var3) && !this.hMapping.containsKey(var3)) {
            var2.addLast(var3);

            while (!var2.isEmpty()) {
               Object var4 = var2.peekLast();
               if (var4.equals(this.sink)) {
                  var2.removeLast();
                  this.insertVertex((V)var4, null);
               } else {
                  Object var5 = Graphs.getOppositeVertex(this.graph, this.distanceAndPredecessorMap.get(var4).getSecond(), (V)var4);
                  if (this.hMapping.containsKey(var5)) {
                     var2.removeLast();
                     EppsteinShortestPathIterator.PathsGraphVertex var6 = this.hMapping.get(var5);
                     this.insertVertex((V)var4, var6);
                  } else {
                     var2.addLast(var5);
                  }
               }
            }
         }
      }
   }

   private void addCrossEdges() {
      ArrayDeque var1 = new ArrayDeque();
      EppsteinShortestPathIterator.PathsGraphVertex var2 = this.hMapping.get(this.source);
      HashSet var3 = new HashSet();
      if (var2 != null) {
         var1.add(var2);

         while (!var1.isEmpty()) {
            EppsteinShortestPathIterator.PathsGraphVertex var4 = (EppsteinShortestPathIterator.PathsGraphVertex)var1.remove();
            var3.add(var4);
            Object var5 = this.graph.getEdgeTarget((E)var4.edge);
            var4.cross = this.hMapping.get(var5);
            if (var4.left != null && !var3.contains(var4.left)) {
               var1.add(var4.left);
            }

            if (var4.right != null && !var3.contains(var4.right)) {
               var1.add(var4.right);
            }

            if (var4.rest != null && !var3.contains(var4.rest)) {
               var1.add(var4.rest);
            }

            if (var4.cross != null && !var3.contains(var4.cross)) {
               var1.add(var4.cross);
            }
         }
      }
   }

   private void addPathGraphRoot() {
      EppsteinShortestPathIterator.PathsGraphVertex var1 = new EppsteinShortestPathIterator.PathsGraphVertex(null, 0.0);
      var1.cross = this.hMapping.get(this.source);
      this.pathsGraphRoot = var1;
   }

   private void insertVertex(V var1, EppsteinShortestPathIterator<V, E>.PathsGraphVertex var2) {
      Pair var3 = this.getOutrootAndRestHeapRoot((V)var1);
      EppsteinShortestPathIterator.PathsGraphVertex var4 = (EppsteinShortestPathIterator.PathsGraphVertex)var3.getFirst();
      EppsteinShortestPathIterator.PathsGraphVertex var5 = (EppsteinShortestPathIterator.PathsGraphVertex)var3.getSecond();
      if (var4 == null) {
         this.hMapping.put((V)var1, var2);
      } else {
         EppsteinShortestPathIterator.PathsGraphVertex var6 = this.insertPersistently(var2, var4);
         this.hMapping.put((V)var1, var6);
         var6.rest = var5;
      }
   }

   private EppsteinShortestPathIterator<V, E>.PathsGraphVertex insertPersistently(
      EppsteinShortestPathIterator<V, E>.PathsGraphVertex var1, EppsteinShortestPathIterator<V, E>.PathsGraphVertex var2
   ) {
      if (var1 == null) {
         var2.left = null;
         var2.right = null;
         var2.size = 1;
         return var2;
      }

      EppsteinShortestPathIterator.PathsGraphVertex var3 = new EppsteinShortestPathIterator.PathsGraphVertex(var1);
      boolean var4 = var1.left == null || var1.right != null && var1.left.size <= var1.right.size;
      EppsteinShortestPathIterator.PathsGraphVertex var5;
      EppsteinShortestPathIterator.PathsGraphVertex var6;
      if (var2.delta >= var3.delta) {
         var5 = var3;
         var6 = var2;
      } else {
         var2.left = var3.left;
         var2.right = var3.right;
         var2.size = var3.size;
         var3.left = null;
         var3.right = null;
         var5 = var2;
         var6 = var3;
      }

      if (var4) {
         var5.left = this.insertPersistently(var5.left, var6);
      } else {
         var5.right = this.insertPersistently(var5.right, var6);
      }

      var5.size++;
      return var5;
   }

   private Pair<EppsteinShortestPathIterator<V, E>.PathsGraphVertex, EppsteinShortestPathIterator<V, E>.PathsGraphVertex> getOutrootAndRestHeapRoot(V var1) {
      ArrayList var2 = new ArrayList();
      EppsteinShortestPathIterator.PathsGraphVertex var3 = new EppsteinShortestPathIterator.PathsGraphVertex(null, Double.POSITIVE_INFINITY);
      Object var4 = this.distanceAndPredecessorMap.get(var1).getSecond();

      for (Object var6 : this.graph.outgoingEdgesOf((V)var1)) {
         if (this.distanceAndPredecessorMap.containsKey(this.graph.getEdgeTarget((E)var6)) && !var6.equals(var4)) {
            double var7 = this.delta((E)var6);
            if (var7 < var3.delta) {
               if (var3.edge != null) {
                  var2.add(var3);
               }

               var3 = new EppsteinShortestPathIterator.PathsGraphVertex(var6, var7);
            } else {
               var2.add(new EppsteinShortestPathIterator.PathsGraphVertex(var6, var7));
            }
         }
      }

      EppsteinShortestPathIterator.PathsGraphVertex var9 = null;
      int var10 = var2.size();
      if (var10 > 0) {
         this.heapify(var2, var10);
         var9 = this.getRestHeap(var2, 0, var10);
      }

      return var3.edge == null ? new Pair<>(null, var9) : new Pair<>(var3, var9);
   }

   private void heapify(List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> var1, int var2) {
      for (int var3 = var2 / 2 - 1; var3 >= 0; var3--) {
         this.siftDown(var1, var3, var2);
      }
   }

   private void siftDown(List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> var1, int var2, int var3) {
      int var7 = var2;

      while (true) {
         int var4 = 2 * var7 + 1;
         int var5 = 2 * var7 + 2;
         int var6 = var7;
         if (var4 < var3
            && ((EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var4)).compareTo((EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var6)) < 0) {
            var6 = var4;
         }

         if (var5 < var3
            && ((EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var5)).compareTo((EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var6)) < 0) {
            var6 = var5;
         }

         if (var6 == var7) {
            return;
         }

         this.swap(var1, var7, var6);
         var7 = var6;
      }
   }

   private EppsteinShortestPathIterator<V, E>.PathsGraphVertex getRestHeap(List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> var1, int var2, int var3) {
      int var4 = 2 * var2 + 1;
      int var5 = 2 * var2 + 2;
      if (var4 < var3) {
         ((EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var2)).left = this.getRestHeap(var1, var4, var3);
      }

      if (var5 < var3) {
         ((EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var2)).right = this.getRestHeap(var1, var5, var3);
      }

      return (EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var2);
   }

   private void swap(List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> var1, int var2, int var3) {
      if (var2 != var3) {
         EppsteinShortestPathIterator.PathsGraphVertex var4 = (EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var2);
         var1.set(var2, (EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var3));
         var1.set(var3, var4);
      }
   }

   private double delta(E var1) {
      return this.graph.getEdgeWeight((E)var1)
         + this.distanceAndPredecessorMap.get(this.graph.getEdgeTarget((E)var1)).getFirst()
         - this.distanceAndPredecessorMap.get(this.graph.getEdgeSource((E)var1)).getFirst();
   }

   private class EppsteinGraphPath implements Comparable<EppsteinShortestPathIterator<V, E>.EppsteinGraphPath>, GraphPath<V, E> {
      private Graph<V, E> graph;
      private List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> pathsGraphVertices;
      private Map<V, Pair<Double, E>> distanceAndPredecessorMap;
      private double weight;

      EppsteinGraphPath(Graph<V, E> var2, List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> var3, Map<V, Pair<Double, E>> var4, double var5) {
         this.graph = var2;
         this.pathsGraphVertices = var3;
         this.distanceAndPredecessorMap = var4;
         this.weight = var5;
      }

      @Override
      public Graph<V, E> getGraph() {
         return this.graph;
      }

      @Override
      public V getStartVertex() {
         return EppsteinShortestPathIterator.this.source;
      }

      @Override
      public V getEndVertex() {
         return EppsteinShortestPathIterator.this.sink;
      }

      @Override
      public double getWeight() {
         return this.weight;
      }

      @Override
      public List<E> getEdgeList() {
         List var1 = this.getSidetracks(this.pathsGraphVertices);
         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.iterator();
         Object var4 = EppsteinShortestPathIterator.this.source;
         EppsteinShortestPathIterator.PathsGraphVertex var5 = null;
         if (var3.hasNext()) {
            var5 = (EppsteinShortestPathIterator.PathsGraphVertex)var3.next();
         }

         while (var5 != null) {
            Object var6 = this.graph.getEdgeSource((E)var5.edge);

            while (!var4.equals(var6)) {
               Object var7 = this.distanceAndPredecessorMap.get(var4).getSecond();
               var2.add(var7);
               var4 = Graphs.getOppositeVertex(this.graph, (E)var7, (V)var4);
            }

            EppsteinShortestPathIterator.PathsGraphVertex var10 = var5;

            EppsteinShortestPathIterator.PathsGraphVertex var8;
            for (var8 = null; var3.hasNext(); var8 = null) {
               var8 = (EppsteinShortestPathIterator.PathsGraphVertex)var3.next();
               if (!this.graph.getEdgeTarget((E)var10.edge).equals(this.graph.getEdgeSource((E)var8.edge))) {
                  break;
               }

               var2.add(var10.edge);
               var10 = var8;
            }

            var2.add(var10.edge);
            var5 = var8;
            var4 = this.graph.getEdgeTarget((E)var10.edge);
         }

         while (!var4.equals(EppsteinShortestPathIterator.this.sink)) {
            Object var9 = this.distanceAndPredecessorMap.get(var4).getSecond();
            var2.add(var9);
            var4 = this.graph.getEdgeTarget((E)var9);
         }

         return var2;
      }

      private List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> getSidetracks(List<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> var1) {
         if (var1.size() <= 1) {
            return var1;
         }

         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.iterator();
         EppsteinShortestPathIterator.PathsGraphVertex var4 = (EppsteinShortestPathIterator.PathsGraphVertex)var3.next();

         for (int var6 = 0; var3.hasNext(); var6++) {
            EppsteinShortestPathIterator.PathsGraphVertex var5 = (EppsteinShortestPathIterator.PathsGraphVertex)var3.next();
            if (var4.left == var5 || var4.right == var5 || var4.rest == var5) {
               var2.add(var6);
            }

            var4 = var5;
         }

         ArrayList var7 = new ArrayList(var1.size() - var2.size());
         int var8 = var2.size();
         int var9 = 0;
         int var10 = 0;

         while (var9 < var1.size()) {
            if (var10 < var8 && ((Integer)var2.get(var10)).equals(var9)) {
               var10++;
            } else {
               var7.add((EppsteinShortestPathIterator.PathsGraphVertex)var1.get(var9));
            }

            var9++;
         }

         return var7;
      }

      public int compareTo(EppsteinShortestPathIterator<V, E>.EppsteinGraphPath var1) {
         return Double.compare(this.weight, var1.weight);
      }
   }

   private class PathsGraphVertex implements Comparable<EppsteinShortestPathIterator<V, E>.PathsGraphVertex> {
      Object edge;
      double delta;
      int size;
      EppsteinShortestPathIterator<V, E>.PathsGraphVertex left;
      EppsteinShortestPathIterator<V, E>.PathsGraphVertex right;
      EppsteinShortestPathIterator<V, E>.PathsGraphVertex rest;
      EppsteinShortestPathIterator<V, E>.PathsGraphVertex cross;

      PathsGraphVertex(E var2, double var3) {
         this.edge = var2;
         this.delta = var3;
         this.size = 1;
      }

      PathsGraphVertex(EppsteinShortestPathIterator<V, E>.PathsGraphVertex var2) {
         this.edge = var2.edge;
         this.size = var2.size;
         this.delta = var2.delta;
         this.left = var2.left;
         this.right = var2.right;
         this.cross = var2.cross;
         this.rest = var2.rest;
      }

      public int compareTo(EppsteinShortestPathIterator<V, E>.PathsGraphVertex var1) {
         return Double.compare(this.delta, var1.delta);
      }
   }
}
