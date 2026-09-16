package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.MaskSubgraph;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class YenShortestPathIterator<V, E> implements Iterator<GraphPath<V, E>> {
   private final Graph<V, E> graph;
   private final V source;
   private final V sink;
   private PathValidator<V, E> pathValidator;
   private List<GraphPath<V, E>> resultList;
   private AddressableHeap<Double, Pair<GraphPath<V, E>, Boolean>> candidatePaths;
   private Map<GraphPath<V, E>, V> firstDeviations;
   private Map<GraphPath<V, E>, V> lastDeviations;
   private int numberOfValidPathInQueue;
   private boolean shortestPathComputed;

   public YenShortestPathIterator(Graph<V, E> var1, V var2, V var3) {
      this(var1, (V)var2, (V)var3, PairingHeap::new);
   }

   public YenShortestPathIterator(Graph<V, E> var1, V var2, V var3, PathValidator<V, E> var4) {
      this(var1, (V)var2, (V)var3, PairingHeap::new, var4);
   }

   public YenShortestPathIterator(Graph<V, E> var1, V var2, V var3, Supplier<AddressableHeap<Double, Pair<GraphPath<V, E>, Boolean>>> var4) {
      this(var1, (V)var2, (V)var3, var4, null);
   }

   public YenShortestPathIterator(
      Graph<V, E> var1, V var2, V var3, Supplier<AddressableHeap<Double, Pair<GraphPath<V, E>, Boolean>>> var4, PathValidator<V, E> var5
   ) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null!");
      if (!var1.containsVertex(var2)) {
         throw new IllegalArgumentException("Graph should contain source vertex!");
      }

      this.source = (V)var2;
      if (!var1.containsVertex(var3)) {
         throw new IllegalArgumentException("Graph should contain sink vertex!");
      }

      this.sink = (V)var3;
      this.pathValidator = var5;
      Objects.requireNonNull(var4, "Heap supplier cannot be null");
      this.resultList = new ArrayList<>();
      this.candidatePaths = (AddressableHeap<Double, Pair<GraphPath<V, E>, Boolean>>)var4.get();
      this.firstDeviations = new HashMap<>();
      this.lastDeviations = new HashMap<>();
   }

   private void lazyInitializePathHeap() {
      if (!this.shortestPathComputed) {
         GraphPath var1 = DijkstraShortestPath.findPathBetween(this.graph, this.source, this.sink);
         if (var1 != null) {
            Object var2 = this.getLastValidDeviation(var1, this.source);
            boolean var3 = var2 == null;
            this.candidatePaths.insert(var1.getWeight(), Pair.of(var1, var3));
            this.firstDeviations.put(var1, this.source);
            this.lastDeviations.put(var1, (V)var2);
            if (var3) {
               this.numberOfValidPathInQueue++;
            }

            this.ensureAtLeastOneValidPathInQueue();
         }
      }

      this.shortestPathComputed = true;
   }

   private void ensureAtLeastOneValidPathInQueue() {
      while (this.numberOfValidPathInQueue == 0 && !this.candidatePaths.isEmpty()) {
         Pair var1 = this.candidatePaths.deleteMin().getValue();
         GraphPath var2 = (GraphPath)var1.getFirst();
         this.resultList.add(var2);
         int var3 = this.addDeviations(var2);
         this.numberOfValidPathInQueue += var3;
      }
   }

   private V getLastValidDeviation(GraphPath<V, E> var1, V var2) {
      if (this.pathValidator == null) {
         return null;
      }

      List var3 = var1.getVertexList();
      List var4 = var1.getEdgeList();
      Object var5 = null;
      double var6 = 0.0;
      int var8 = var3.indexOf(var2);

      for (int var9 = var8; var9 < var4.size(); var9++) {
         GraphWalk var10 = new GraphWalk<>(var1.getGraph(), var1.getStartVertex(), var3.get(var9), var3.subList(0, var9 + 1), var4.subList(0, var9), var6);
         Object var11 = var4.get(var9);
         boolean var12 = this.pathValidator.isValidPath(var10, (E)var11);
         if (!var12) {
            var5 = var3.get(var9);
            break;
         }

         var6 += this.graph.getEdgeWeight((E)var11);
      }

      return (V)var5;
   }

   @Override
   public boolean hasNext() {
      this.lazyInitializePathHeap();
      return !this.candidatePaths.isEmpty();
   }

   public GraphPath<V, E> next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      GraphPath var1 = null;

      while (var1 == null) {
         Pair var2 = this.candidatePaths.deleteMin().getValue();
         GraphPath var3 = (GraphPath)var2.getFirst();
         boolean var4 = (Boolean)var2.getSecond();
         if (var4) {
            var1 = var3;
            this.numberOfValidPathInQueue--;
         }

         this.resultList.add(var3);
         int var5 = this.addDeviations(var3);
         this.numberOfValidPathInQueue += var5;
      }

      this.ensureAtLeastOneValidPathInQueue();
      return var1;
   }

   private int addDeviations(GraphPath<V, E> var1) {
      int var2 = 0;
      Object var3 = this.firstDeviations.get(var1);
      List var4 = var1.getVertexList();
      List var5 = var1.getEdgeList();
      int var6 = var4.size();
      int var7 = var4.indexOf(var3);
      Pair var8 = this.getMaskedVerticesAndEdges(var1, (V)var3, var7);
      Set var9 = (Set)var8.getFirst();
      Set var10 = (Set)var8.getSecond();
      MaskSubgraph var11 = new MaskSubgraph<>(this.graph, var9::contains, var10::contains);
      EdgeReversedGraph var12 = new EdgeReversedGraph<>(var11);
      DijkstraShortestPath var13 = new DijkstraShortestPath<>(var12);
      TreeSingleSourcePathsImpl var14 = (TreeSingleSourcePathsImpl)var13.getPaths(this.sink);
      HashMap var15 = new HashMap(var14.getDistanceAndPredecessorMap());
      YenShortestPathIterator.YenShortestPathsTree var16 = new YenShortestPathIterator.YenShortestPathsTree(var11, var9, var10, var15, this.sink);
      Object var17 = this.lastDeviations.get(var1);
      int var18;
      if (var17 == null) {
         var18 = var6 - 2;
      } else {
         var18 = var4.indexOf(var17);
      }

      boolean var19 = true;

      for (int var20 = var6 - 2; var20 >= 0 && var19; var20--) {
         Object var21 = var4.get(var20);
         if (var21.equals(var3)) {
            var19 = false;
         }

         var16.recoverVertex((V)var21);
         var16.correctDistanceForward((V)var21);
         GraphPath var22 = var16.getPath((V)var21);
         if (var22 != null) {
            var16.correctDistanceBackward((V)var21);
            if (var20 <= var18) {
               GraphPath var23 = this.getCandidatePath(var1, var20, var22);
               double var24 = var23.getWeight();
               Object var26 = this.getLastValidDeviation(var23, (V)var21);
               boolean var27 = var26 == null;
               this.candidatePaths.insert(var24, Pair.of(var23, var27));
               this.firstDeviations.put(var23, (V)var21);
               this.lastDeviations.put(var23, (V)var26);
               if (var27) {
                  var2++;
               }
            }
         }

         Object var28 = var4.get(var20 + 1);
         Object var29 = var5.get(var20);
         var16.recoverEdge((E)var29);
         double var25 = var11.getEdgeWeight(var29) + var16.map.get(var28).getFirst();
         if (var16.map.get(var21).getFirst() > var25) {
            var16.map.put((V)var21, Pair.of(var25, (E)var29));
            var16.correctDistanceBackward((V)var21);
         }
      }

      return var2;
   }

   private Pair<Set<V>, Set<E>> getMaskedVerticesAndEdges(GraphPath<V, E> var1, V var2, int var3) {
      List var4 = var1.getVertexList();
      List var5 = var1.getEdgeList();
      HashSet var6 = new HashSet();
      HashSet var7 = new HashSet();
      int var8 = var4.size();

      for (int var9 = 0; var9 < var8 - 1; var9++) {
         var6.add(var4.get(var9));
         var7.add(var5.get(var9));
      }

      int var14 = this.resultList.size();

      for (int var10 = 0; var10 < var14 - 1; var10++) {
         GraphPath var11 = this.resultList.get(var10);
         List var12 = var11.getVertexList();
         int var13 = var12.indexOf(var2);
         if (var13 >= 0 && var13 == var3 && this.equalLists(var4, var12, var13)) {
            var7.add(var11.getEdgeList().get(var13));
         }
      }

      return Pair.of(var6, var7);
   }

   private GraphPath<V, E> getCandidatePath(GraphPath<V, E> var1, int var2, GraphPath<V, E> var3) {
      List var4 = var1.getVertexList();
      List var5 = var1.getEdgeList();
      LinkedList var6 = new LinkedList();
      LinkedList var7 = new LinkedList();
      double var8 = 0.0;

      for (int var10 = 0; var10 < var2; var10++) {
         Object var11 = var5.get(var10);
         var8 += this.graph.getEdgeWeight((E)var11);
         var7.add(var11);
         var6.add(var4.get(var10));
      }

      ListIterator var14 = var3.getVertexList().listIterator(var3.getVertexList().size());

      while (var14.hasPrevious()) {
         var6.add(var14.previous());
      }

      ListIterator var15 = var3.getEdgeList().listIterator(var3.getEdgeList().size());

      while (var15.hasPrevious()) {
         var7.add(var15.previous());
      }

      double var12 = var8 + var3.getWeight();
      return new GraphWalk<>(this.graph, this.source, this.sink, var6, var7, var12);
   }

   private boolean equalLists(List<V> var1, List<V> var2, int var3) {
      for (int var4 = 0; var4 <= var3; var4++) {
         if (!var1.get(var4).equals(var2.get(var4))) {
            return false;
         }
      }

      return true;
   }

   class YenShortestPathsTree extends TreeSingleSourcePathsImpl<V, E> {
      Set<V> maskedVertices;
      Set<E> maskedEdges;

      YenShortestPathsTree(Graph<V, E> var2, Set<V> var3, Set<E> var4, Map<V, Pair<Double, E>> var5, V var6) {
         super(var2, (V)var6, var5);
         this.maskedVertices = var3;
         this.maskedEdges = var4;
      }

      void recoverVertex(V var1) {
         this.maskedVertices.remove(var1);
      }

      void recoverEdge(E var1) {
         this.maskedEdges.remove(var1);
      }

      void correctDistanceForward(V var1) {
         super.map.putIfAbsent((V)var1, new Pair<>(Double.POSITIVE_INFINITY, null));

         for (Object var3 : super.g.outgoingEdgesOf((V)var1)) {
            Object var4 = Graphs.getOppositeVertex(super.g, (E)var3, (V)var1);
            if (!var4.equals(var1)) {
               double var5 = Double.POSITIVE_INFINITY;
               if (super.map.containsKey(var4)) {
                  var5 = super.map.get(var4).getFirst();
               }

               var5 += super.g.getEdgeWeight((E)var3);
               double var7 = super.map.get(var1).getFirst();
               if (var7 > var5) {
                  super.map.put((V)var1, Pair.of(var5, (E)var3));
               }
            }
         }
      }

      void correctDistanceBackward(V var1) {
         LinkedList var2 = new LinkedList();
         var2.add(var1);

         while (!var2.isEmpty()) {
            Object var3 = var2.remove(0);
            double var4 = super.map.get(var3).getFirst();

            for (Object var7 : super.g.incomingEdgesOf((V)var3)) {
               Object var8 = Graphs.getOppositeVertex(super.g, (E)var7, (V)var3);
               if (!var8.equals(var3)) {
                  double var9 = Double.POSITIVE_INFINITY;
                  if (super.map.containsKey(var8)) {
                     var9 = super.map.get(var8).getFirst();
                  }

                  double var11 = var4 + super.g.getEdgeWeight((E)var7);
                  if (var9 > var11) {
                     super.map.put((V)var8, Pair.of(var11, (E)var7));
                     var2.add(var8);
                  }
               }
            }
         }
      }
   }
}
