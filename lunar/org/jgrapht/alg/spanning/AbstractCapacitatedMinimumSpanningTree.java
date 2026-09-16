package org.jgrapht.alg.spanning;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.interfaces.CapacitatedSpanningTreeAlgorithm;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.util.TypeUtil;

public abstract class AbstractCapacitatedMinimumSpanningTree<V, E> implements CapacitatedSpanningTreeAlgorithm<V, E> {
   protected final Graph<V, E> graph;
   protected final V root;
   protected final double capacity;
   protected final Map<V, Double> demands;
   protected AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation bestSolution;

   protected AbstractCapacitatedMinimumSpanningTree(Graph<V, E> var1, V var2, double var3, Map<V, Double> var5) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      if (!var1.getType().isUndirected()) {
         throw new IllegalArgumentException("Graph must be undirected");
      }

      if (!new ConnectivityInspector(var1).isConnected()) {
         throw new IllegalArgumentException("Graph must be connected. Otherwise, there is no capacitated minimum spanning tree.");
      }

      this.root = Objects.requireNonNull((V)var2, "Root cannot be null");
      this.capacity = var3;
      this.demands = Objects.requireNonNull(var5, "Demands cannot be null");

      for (Object var7 : var1.vertexSet()) {
         if (var7 != var2) {
            Double var8 = (Double)var5.get(var7);
            if (var8 == null) {
               throw new IllegalArgumentException("Demands does not provide a demand for every vertex.");
            }

            if (var8 > var3) {
               throw new IllegalArgumentException("Demands must not be greater than the capacity. Otherwise, there is no capacitated minimum spanning tree.");
            }
         }
      }

      this.bestSolution = new AbstractCapacitatedMinimumSpanningTree.CapacitatedSpanningTreeSolutionRepresentation();
   }

   @Override
   public abstract CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> getCapacitatedSpanningTree();

   protected class CapacitatedSpanningTreeSolutionRepresentation implements Cloneable {
      private Map<V, Integer> labels;
      private Map<Integer, Pair<Set<V>, Double>> partition;
      private int nextFreeLabel;

      public CapacitatedSpanningTreeSolutionRepresentation() {
         this(new HashMap<>(), new HashMap<>());
      }

      public CapacitatedSpanningTreeSolutionRepresentation(Map<V, Integer> var2, Map<Integer, Pair<Set<V>, Double>> var3) {
         for (Integer var5 : var2.values()) {
            if (var5 < 0) {
               throw new IllegalArgumentException("Labels are not non-negative");
            }
         }

         for (Integer var7 : var3.keySet()) {
            if (var7 < 0) {
               throw new IllegalArgumentException("Labels are not non-negative");
            }
         }

         this.labels = var2;
         this.partition = var3;
         this.getNextFreeLabel();
      }

      public CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTree<V, E> calculateResultingSpanningTree() {
         HashSet var1 = new HashSet();
         double var2 = 0.0;

         for (Pair var5 : this.partition.values()) {
            Set var6 = (Set)var5.getFirst();
            var6.add(AbstractCapacitatedMinimumSpanningTree.this.root);
            SpanningTreeAlgorithm.SpanningTree var7 = new PrimMinimumSpanningTree<>(
                  new AsSubgraph<>(AbstractCapacitatedMinimumSpanningTree.this.graph, var6, AbstractCapacitatedMinimumSpanningTree.this.graph.edgeSet())
               )
               .getSpanningTree();
            var6.remove(AbstractCapacitatedMinimumSpanningTree.this.root);
            var1.addAll(var7.getEdges());
            var2 += var7.getWeight();
         }

         return new CapacitatedSpanningTreeAlgorithm.CapacitatedSpanningTreeImpl<>(this.labels, this.partition, var1, var2);
      }

      public void moveVertex(V var1, Integer var2, Integer var3) {
         this.labels.put((V)var1, var3);
         Set var4 = this.partition.get(var2).getFirst();
         var4.remove(var1);
         this.partition.put(var2, Pair.of(var4, this.partition.get(var2).getSecond() - AbstractCapacitatedMinimumSpanningTree.this.demands.get(var1)));
         if (!this.partition.keySet().contains(var3)) {
            this.partition.put(var3, Pair.of(new HashSet(), 0.0));
         }

         Set var5 = this.partition.get(var3).getFirst();
         var5.add(var1);
         this.partition.put(var3, Pair.of(var5, this.partition.get(var3).getSecond() + AbstractCapacitatedMinimumSpanningTree.this.demands.get(var1)));
      }

      public void moveVertices(Set<V> var1, Integer var2, Integer var3) {
         double var4 = 0.0;

         for (Object var7 : var1) {
            var4 += AbstractCapacitatedMinimumSpanningTree.this.demands.get(var7);
            this.labels.put((V)var7, var3);
         }

         if (!this.partition.keySet().contains(var3)) {
            this.partition.put(var3, Pair.of(new HashSet(), 0.0));
         }

         Set var8 = this.partition.get(var3).getFirst();
         var8.addAll(var1);
         this.partition.put(var3, Pair.of(var8, this.partition.get(var3).getSecond() + var4));
         Set var9 = this.partition.get(var2).getFirst();
         var9.removeAll(var1);
         this.partition.put(var2, Pair.of(var9, this.partition.get(var2).getSecond() - var4));
      }

      public Set<Integer> partitionSubtreesOfSubset(Set<V> var1, int var2) {
         LinkedList var3 = new LinkedList();
         if (var1.isEmpty()) {
            return new HashSet<>();
         }

         var1.add(AbstractCapacitatedMinimumSpanningTree.this.root);
         SpanningTreeAlgorithm.SpanningTree var4 = new PrimMinimumSpanningTree<>(
               new AsSubgraph<>(AbstractCapacitatedMinimumSpanningTree.this.graph, var1, AbstractCapacitatedMinimumSpanningTree.this.graph.edgeSet())
            )
            .getSpanningTree();
         AsSubgraph var5 = new AsSubgraph<>(AbstractCapacitatedMinimumSpanningTree.this.graph, var1, var4.getEdges());
         int var6 = var5.degreeOf(AbstractCapacitatedMinimumSpanningTree.this.root);
         if (var6 == 1) {
            var1.remove(AbstractCapacitatedMinimumSpanningTree.this.root);
            return new HashSet<>();
         }

         HashSet var7 = new HashSet();
         DepthFirstIterator var8 = new DepthFirstIterator<>(var5, AbstractCapacitatedMinimumSpanningTree.this.root);
         if (var8.hasNext()) {
            var8.next();
         }

         int var9 = 0;
         HashSet var10 = new HashSet();

         while (var8.hasNext()) {
            Object var11 = var8.next();
            if (var5.containsEdge(AbstractCapacitatedMinimumSpanningTree.this.root, var11)) {
               if (!var10.isEmpty()) {
                  var3.add(var10);
                  var10 = new HashSet();
               }

               if (++var9 == var6) {
                  break;
               }
            }

            var10.add(var11);
         }

         for (Set var12 : var3) {
            int var13 = this.getNextFreeLabel();
            this.moveVertices(var12, var2, var13);
            var7.add(var13);
         }

         var1.remove(AbstractCapacitatedMinimumSpanningTree.this.root);
         return var7;
      }

      public void cleanUp() {
         this.partition.entrySet().removeIf(var0 -> var0.getValue().getFirst().isEmpty());
      }

      public int getNextFreeLabel() {
         int var1 = this.nextFreeLabel++;

         while (this.partition.keySet().contains(this.nextFreeLabel)) {
            this.nextFreeLabel++;
         }

         return var1;
      }

      public int getLabel(V var1) {
         return this.labels.get(var1);
      }

      public Set<Integer> getLabels() {
         return this.partition.keySet();
      }

      public Set<V> getPartitionSet(Integer var1) {
         return this.partition.get(var1).getFirst();
      }

      public double getPartitionWeight(Integer var1) {
         return this.partition.get(var1).getSecond();
      }

      public AbstractCapacitatedMinimumSpanningTree<V, E>.CapacitatedSpanningTreeSolutionRepresentation clone() {
         try {
            AbstractCapacitatedMinimumSpanningTree.CapacitatedSpanningTreeSolutionRepresentation var1 = TypeUtil.uncheckedCast(super.clone());
            var1.labels = new HashMap<>(this.labels);
            var1.partition = new HashMap<>();

            for (Entry var3 : this.partition.entrySet()) {
               var1.partition
                  .put(
                     (Integer)var3.getKey(),
                     Pair.of(new HashSet((Collection<? extends E>)((Pair)var3.getValue()).getFirst()), (Double)((Pair)var3.getValue()).getSecond())
                  );
            }

            var1.nextFreeLabel = this.nextFreeLabel;
            return var1;
         } catch (CloneNotSupportedException var4) {
            var4.printStackTrace();
            throw new RuntimeException();
         }
      }
   }
}
