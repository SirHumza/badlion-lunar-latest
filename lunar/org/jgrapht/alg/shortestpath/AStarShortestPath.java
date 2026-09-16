package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.AStarAdmissibleHeuristic;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.graph.GraphWalk;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class AStarShortestPath<V, E> extends BaseShortestPathAlgorithm<V, E> {
   protected final Supplier<AddressableHeap<Double, V>> heapSupplier;
   protected AddressableHeap<Double, V> openList;
   protected Map<V, AddressableHeap.Handle<Double, V>> vertexToHeapNodeMap;
   protected Set<V> closedList;
   protected Map<V, Double> gScoreMap;
   protected Map<V, E> cameFrom;
   protected AStarAdmissibleHeuristic<V> admissibleHeuristic;
   protected int numberOfExpandedNodes;
   protected Comparator<Double> comparator;

   public AStarShortestPath(Graph<V, E> var1, AStarAdmissibleHeuristic<V> var2) {
      this(var1, var2, PairingHeap::new);
   }

   public AStarShortestPath(Graph<V, E> var1, AStarAdmissibleHeuristic<V> var2, Supplier<AddressableHeap<Double, V>> var3) {
      super(var1);
      this.admissibleHeuristic = Objects.requireNonNull(var2, "Heuristic function cannot be null!");
      this.comparator = new ToleranceDoubleComparator();
      this.heapSupplier = Objects.requireNonNull(var3, "Heap supplier cannot be null!");
   }

   private void initialize(AStarAdmissibleHeuristic<V> var1) {
      this.admissibleHeuristic = var1;
      this.openList = this.heapSupplier.get();
      this.vertexToHeapNodeMap = new HashMap<>();
      this.closedList = new HashSet();
      this.gScoreMap = new HashMap<>();
      this.cameFrom = (Map<V, E>)(new HashMap<>());
      this.numberOfExpandedNodes = 0;
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1) || !this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Source or target vertex not contained in the graph!");
      }

      if (var1.equals(var2)) {
         return this.createEmptyPath((V)var1, (V)var2);
      }

      this.initialize(this.admissibleHeuristic);
      this.gScoreMap.put((V)var1, 0.0);
      AddressableHeap.Handle var3 = this.openList.insert(0.0, (V)var1);
      this.vertexToHeapNodeMap.put((V)var1, var3);

      do {
         AddressableHeap.Handle var4 = this.openList.deleteMin();
         if (var4.getValue().equals(var2)) {
            return this.buildGraphPath((V)var1, (V)var2, (Double)var4.getKey());
         }

         this.expandNode(var4, (V)var2);
         this.closedList.add((V)var4.getValue());
      } while (!this.openList.isEmpty());

      return this.createEmptyPath((V)var1, (V)var2);
   }

   public int getNumberOfExpandedNodes() {
      return this.numberOfExpandedNodes;
   }

   private void expandNode(AddressableHeap.Handle<Double, V> var1, V var2) {
      this.numberOfExpandedNodes++;

      for (Object var5 : this.graph.outgoingEdgesOf((V)var1.getValue())) {
         Object var6 = Graphs.getOppositeVertex(this.graph, (E)var5, (V)var1.getValue());
         if (!var6.equals(var1.getValue())) {
            double var7 = this.gScoreMap.get(var1.getValue());
            double var9 = var7 + this.graph.getEdgeWeight((E)var5);
            double var11 = var9 + this.admissibleHeuristic.getCostEstimate((V)var6, (V)var2);
            if (this.vertexToHeapNodeMap.containsKey(var6)) {
               if (!(var9 >= this.gScoreMap.get(var6))) {
                  this.cameFrom.put((V)var6, (E)var5);
                  this.gScoreMap.put((V)var6, var9);
                  if (this.closedList.contains(var6)) {
                     this.closedList.remove(var6);
                     this.openList.insert(var11, this.vertexToHeapNodeMap.get(var6).getValue());
                  } else {
                     this.vertexToHeapNodeMap.get(var6).decreaseKey(var11);
                  }
               }
            } else {
               this.cameFrom.put((V)var6, (E)var5);
               this.gScoreMap.put((V)var6, var9);
               AddressableHeap.Handle var13 = this.openList.insert(var11, (V)var6);
               this.vertexToHeapNodeMap.put((V)var6, var13);
            }
         }
      }
   }

   private GraphPath<V, E> buildGraphPath(V var1, V var2, double var3) {
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      var6.add(var2);
      Object var7 = var2;

      while (!var7.equals(var1)) {
         var5.add(this.cameFrom.get(var7));
         var7 = Graphs.getOppositeVertex(this.graph, this.cameFrom.get(var7), (V)var7);
         var6.add(var7);
      }

      Collections.reverse(var5);
      Collections.reverse(var6);
      return new GraphWalk<>(this.graph, (V)var1, (V)var2, var6, var5, var3);
   }
}
