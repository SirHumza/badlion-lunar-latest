package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.MaskSubgraph;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.ConcurrencyUtil;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

public class ContractionHierarchyPrecomputation<V, E> {
   private Graph<V, E> graph;
   private Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> contractionGraph;
   private Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionMapping;
   private Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> maskedContractionGraph;
   private List<ContractionHierarchyPrecomputation.ContractionVertex<V>> vertices;
   private List<List<Pair<ContractionHierarchyPrecomputation.ContractionEdge<E>, ContractionHierarchyPrecomputation.ContractionEdge<E>>>> shortcutEdges;
   private List<ContractionHierarchyPrecomputation.VertexData> verticesData;
   private AtomicInteger contractionLevelCounter;
   private Supplier<AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> shortcutsSearchHeapSupplier;
   private ExecutorCompletionService<Void> completionService;
   private int parallelism;
   private List<ContractionHierarchyPrecomputation<V, E>.ContractionTask> tasks;
   private List<Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>>> computeInitialPrioritiesConsumers;
   private Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>> computeIndependentSetConsumer;
   private Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>> computeShortcutsConsumer;
   private Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>> updateNeighboursConsumer;
   private Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>> markUpwardEdgesConsumer;

   @Deprecated
   public ContractionHierarchyPrecomputation(Graph<V, E> var1) {
      this(var1, Runtime.getRuntime().availableProcessors());
   }

   public ContractionHierarchyPrecomputation(Graph<V, E> var1, ThreadPoolExecutor var2) {
      this(var1, Random::new, var2);
   }

   @Deprecated
   public ContractionHierarchyPrecomputation(Graph<V, E> var1, int var2) {
      this(var1, var2, Random::new, PairingHeap::new);
   }

   @Deprecated
   public ContractionHierarchyPrecomputation(Graph<V, E> var1, Supplier<Random> var2) {
      this(var1, Runtime.getRuntime().availableProcessors(), var2);
   }

   public ContractionHierarchyPrecomputation(Graph<V, E> var1, Supplier<Random> var2, ThreadPoolExecutor var3) {
      this(var1, var2, PairingHeap::new, var3);
   }

   @Deprecated
   public ContractionHierarchyPrecomputation(Graph<V, E> var1, int var2, Supplier<Random> var3) {
      this(var1, var2, var3, PairingHeap::new);
   }

   @Deprecated
   public ContractionHierarchyPrecomputation(
      Graph<V, E> var1, int var2, Supplier<Random> var3, Supplier<AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var4
   ) {
      this.init(var1, var3, var4, ConcurrencyUtil.createThreadPoolExecutor(var2));
   }

   public ContractionHierarchyPrecomputation(
      Graph<V, E> var1,
      Supplier<Random> var2,
      Supplier<AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var3,
      ThreadPoolExecutor var4
   ) {
      this.init(var1, var2, var3, var4);
   }

   private void init(
      Graph<V, E> var1,
      final Supplier<Random> var2,
      Supplier<AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var3,
      ThreadPoolExecutor var4
   ) {
      this.graph = var1;
      this.contractionGraph = GraphTypeBuilder.<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>>directed()
         .weighted(true)
         .allowingMultipleEdges(false)
         .allowingSelfLoops(false)
         .buildGraph();
      this.parallelism = var4.getMaximumPoolSize();
      this.shortcutsSearchHeapSupplier = var3;
      this.vertices = new ArrayList<>(var1.vertexSet().size());
      this.shortcutEdges = new ArrayList<>(Collections.nCopies(var1.vertexSet().size(), null));
      this.verticesData = new ArrayList<>(Collections.nCopies(var1.vertexSet().size(), null));
      this.contractionLevelCounter = new AtomicInteger();
      this.maskedContractionGraph = new MaskSubgraph<>(
         this.contractionGraph, var1x -> this.verticesData.get(var1x.vertexId) != null && this.verticesData.get(var1x.vertexId).isContracted, var0 -> false
      );
      this.contractionMapping = new HashMap<>();
      this.completionService = new ExecutorCompletionService<>(var4);
      this.tasks = new ArrayList<>(this.parallelism);
      this.computeInitialPrioritiesConsumers = new ArrayList<>(this.parallelism);

      for (int var5 = 0; var5 < this.parallelism; var5++) {
         this.tasks.add(new ContractionHierarchyPrecomputation.ContractionTask(var5));
         this.computeInitialPrioritiesConsumers
            .add(
               new Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>>() {
                  Random random = (Random)var2.get();

                  public void accept(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
                     ContractionHierarchyPrecomputation.this.verticesData
                        .set(var1.vertexId, ContractionHierarchyPrecomputation.this.getVertexData(var1, this.random.nextInt()));
                  }
               }
            );
      }

      this.computeIndependentSetConsumer = var1x -> this.verticesData.get(var1x.vertexId).isIndependent = this.vertexIsIndependent(var1x);
      this.computeShortcutsConsumer = var1x -> this.shortcutEdges.set(var1x.vertexId, this.getShortcuts(var1x));
      this.updateNeighboursConsumer = var1x -> this.updateNeighboursData(var1x);
      this.markUpwardEdgesConsumer = var1x -> this.contractionGraph
         .outgoingEdgesOf(var1x)
         .forEach(
            var1xx -> var1xx.isUpward = this.contractionGraph.getEdgeSource((ContractionHierarchyPrecomputation.ContractionEdge<E>)var1xx).contractionLevel
               < this.contractionGraph.getEdgeTarget((ContractionHierarchyPrecomputation.ContractionEdge<E>)var1xx).contractionLevel
         );
   }

   public ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> computeContractionHierarchy() {
      this.fillContractionGraphAndVerticesArray();
      this.submitTasks(0, this.contractionGraph.vertexSet().size(), this.computeInitialPrioritiesConsumers);
      this.contractVertices();
      this.submitTasks(0, this.contractionGraph.vertexSet().size(), this.markUpwardEdgesConsumer);
      return new ContractionHierarchyPrecomputation.ContractionHierarchy<>(this.graph, this.contractionGraph, this.contractionMapping);
   }

   private void fillContractionGraphAndVerticesArray() {
      int var1 = 0;

      for (Object var3 : this.graph.vertexSet()) {
         ContractionHierarchyPrecomputation.ContractionVertex var4 = new ContractionHierarchyPrecomputation.ContractionVertex<>(var3, var1);
         this.vertices.add(var4);
         var1++;
         this.contractionGraph.addVertex(var4);
         this.contractionMapping.put((V)var3, var4);
      }

      for (Object var15 : this.graph.edgeSet()) {
         Object var16 = this.graph.getEdgeSource((E)var15);
         Object var5 = this.graph.getEdgeTarget((E)var15);
         if (!var16.equals(var5)) {
            ContractionHierarchyPrecomputation.ContractionVertex var6 = this.contractionMapping.get(var16);
            ContractionHierarchyPrecomputation.ContractionVertex var7 = this.contractionMapping.get(var5);
            double var8 = this.graph.getEdgeWeight((E)var15);
            ContractionHierarchyPrecomputation.ContractionEdge var10 = this.contractionGraph.getEdge(var6, var7);
            if (var10 == null) {
               ContractionHierarchyPrecomputation.ContractionEdge var11 = new ContractionHierarchyPrecomputation.ContractionEdge<>(var15);
               this.contractionGraph.addEdge(var6, var7, var11);
               this.contractionGraph.setEdgeWeight(var11, var8);
               if (this.graph.getType().isUndirected()) {
                  ContractionHierarchyPrecomputation.ContractionEdge var12 = new ContractionHierarchyPrecomputation.ContractionEdge<>(var15);
                  this.contractionGraph.addEdge(var7, var6, var12);
                  this.contractionGraph.setEdgeWeight(var12, var8);
               }
            } else {
               double var17 = this.contractionGraph.getEdgeWeight(var10);
               if (var8 < var17) {
                  this.contractionGraph.setEdgeWeight(var10, var8);
                  var10.edge = (E1)var15;
                  if (this.graph.getType().isUndirected()) {
                     ContractionHierarchyPrecomputation.ContractionEdge var13 = this.contractionGraph.getEdge(var7, var6);
                     var13.edge = (E1)var15;
                     this.contractionGraph.setEdgeWeight(var13, var8);
                  }
               }
            }
         }
      }
   }

   private void contractVertices() {
      int var2 = this.graph.vertexSet().size();

      while (var2 != 0) {
         this.submitTasks(0, var2, this.computeIndependentSetConsumer);
         int var1 = this.partitionIndependentSet(var2);
         this.submitTasks(var1, var2, this.computeShortcutsConsumer);
         this.contractIndependentSet(var1, var2);
         this.submitTasks(var1, var2, this.updateNeighboursConsumer);
         this.markContracted(var1, var2);
         var2 = var1;
      }
   }

   private boolean vertexIsIndependent(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
      for (ContractionHierarchyPrecomputation.ContractionVertex var3 : Graphs.neighborSetOf(this.maskedContractionGraph, var1)) {
         if (this.isGreater(var1, var3)) {
            return false;
         }

         for (ContractionHierarchyPrecomputation.ContractionVertex var5 : Graphs.neighborSetOf(this.maskedContractionGraph, var3)) {
            if (!var5.equals(var1) && this.isGreater(var1, var5)) {
               return false;
            }
         }
      }

      return true;
   }

   private boolean isGreater(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, ContractionHierarchyPrecomputation.ContractionVertex<V> var2) {
      ContractionHierarchyPrecomputation.VertexData var3 = this.verticesData.get(var1.vertexId);
      ContractionHierarchyPrecomputation.VertexData var4 = this.verticesData.get(var2.vertexId);
      if (var3.priority != var4.priority) {
         return var3.priority > var4.priority;
      } else {
         return var3.random != var4.random ? var3.random > var4.random : var1.vertexId > var2.vertexId;
      }
   }

   private int partitionIndependentSet(int var1) {
      int var2 = 0;
      int var3 = var1 - 1;

      while (var2 <= var3) {
         while (!this.verticesData.get(var2).isIndependent) {
            var2++;
         }

         while (var3 >= 0 && this.verticesData.get(var3).isIndependent) {
            var3--;
         }

         if (var2 <= var3) {
            ContractionHierarchyPrecomputation.ContractionVertex var4 = this.vertices.get(var2);
            ContractionHierarchyPrecomputation.ContractionVertex var5 = this.vertices.get(var3);
            this.swap(this.verticesData, var2, var3);
            this.swap(this.vertices, var2, var3);
            this.swap(this.shortcutEdges, var2, var3);
            int var6 = var4.vertexId;
            var4.vertexId = var5.vertexId;
            var5.vertexId = var6;
         }
      }

      return var2;
   }

   private <T> void swap(List<T> var1, int var2, int var3) {
      Object var4 = var1.get(var2);
      var1.set(var2, var1.get(var3));
      var1.set(var3, var4);
   }

   private void contractIndependentSet(int var1, int var2) {
      this.vertices
         .subList(var1, var2)
         .forEach(var1x -> this.contractVertex((ContractionHierarchyPrecomputation.ContractionVertex<V>)var1x, this.contractionLevelCounter.getAndIncrement()));
   }

   private void contractVertex(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, int var2) {
      for (Pair var5 : this.shortcutEdges.get(var1.vertexId)) {
         ContractionHierarchyPrecomputation.ContractionVertex var6 = this.maskedContractionGraph
            .getEdgeSource((ContractionHierarchyPrecomputation.ContractionEdge<E>)var5.getFirst());
         ContractionHierarchyPrecomputation.ContractionVertex var7 = this.maskedContractionGraph
            .getEdgeTarget((ContractionHierarchyPrecomputation.ContractionEdge<E>)var5.getSecond());
         ContractionHierarchyPrecomputation.ContractionEdge var8 = new ContractionHierarchyPrecomputation.ContractionEdge(var5);
         double var9 = this.maskedContractionGraph.getEdgeWeight((ContractionHierarchyPrecomputation.ContractionEdge<E>)var5.getFirst())
            + this.maskedContractionGraph.getEdgeWeight((ContractionHierarchyPrecomputation.ContractionEdge<E>)var5.getSecond());
         boolean var11 = this.contractionGraph.addEdge(var6, var7, var8);
         if (var11) {
            this.contractionGraph.setEdgeWeight(var8, var9);
         } else {
            ContractionHierarchyPrecomputation.ContractionEdge var12 = this.contractionGraph.getEdge(var6, var7);
            var12.edge = null;
            var12.bypassedEdges = var5;
            var12.originalEdges = ((ContractionHierarchyPrecomputation.ContractionEdge)var5.getFirst()).originalEdges
               + ((ContractionHierarchyPrecomputation.ContractionEdge)var5.getSecond()).originalEdges;
            this.contractionGraph.setEdgeWeight(var12, var9);
         }
      }

      var1.contractionLevel = var2;
   }

   private void updateNeighboursData(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
      ContractionHierarchyPrecomputation.VertexData var2 = this.verticesData.get(var1.vertexId);

      for (ContractionHierarchyPrecomputation.ContractionVertex var4 : Graphs.neighborSetOf(this.maskedContractionGraph, var1)) {
         ContractionHierarchyPrecomputation.VertexData var5 = this.verticesData.get(var4.vertexId);
         var5.depth = Math.max(var5.depth, var2.depth + 1);
         this.updatePriority(var4, var5);
      }
   }

   private ContractionHierarchyPrecomputation.VertexData getVertexData(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, int var2) {
      ContractionHierarchyPrecomputation.VertexData var3 = new ContractionHierarchyPrecomputation.VertexData(var2);
      this.updatePriority(var1, var3);
      return var3;
   }

   private void updatePriority(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, ContractionHierarchyPrecomputation.VertexData var2) {
      ContractionHierarchyPrecomputation.VertexStatistics var3 = this.getStatistics(var1);
      if (var3.removedContractionEdges * var3.removedOriginalEdges == 0) {
         var2.priority = var2.depth;
      } else {
         var2.priority = 4.0 * var3.addedContractionEdges / var3.removedContractionEdges
            + 2.0 * var3.addedOriginalEdges / var3.removedOriginalEdges
            + 1.0 * var2.depth;
      }
   }

   private ContractionHierarchyPrecomputation.VertexStatistics getStatistics(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
      ContractionHierarchyPrecomputation.ToStatisticsConsumer var2 = new ContractionHierarchyPrecomputation.ToStatisticsConsumer();
      this.iterateShortcutEdges(var1, var2);
      this.maskedContractionGraph.edgesOf(var1).forEach(var1x -> {
         var2.statistics.removedContractionEdges++;
         var2.statistics.removedOriginalEdges = var2.statistics.removedOriginalEdges + var1x.originalEdges;
      });
      return var2.statistics;
   }

   private List<Pair<ContractionHierarchyPrecomputation.ContractionEdge<E>, ContractionHierarchyPrecomputation.ContractionEdge<E>>> getShortcuts(
      ContractionHierarchyPrecomputation.ContractionVertex<V> var1
   ) {
      ContractionHierarchyPrecomputation.ToListConsumer var2 = new ContractionHierarchyPrecomputation.ToListConsumer();
      this.iterateShortcutEdges(var1, var2);
      return var2.shortcuts;
   }

   private void iterateShortcutEdges(
      ContractionHierarchyPrecomputation.ContractionVertex<V> var1,
      BiConsumer<ContractionHierarchyPrecomputation.ContractionEdge<E>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var2
   ) {
      HashSet var3 = new HashSet();
      double var4 = Double.MIN_VALUE;

      for (ContractionHierarchyPrecomputation.ContractionEdge var7 : this.maskedContractionGraph.outgoingEdgesOf(var1)) {
         ContractionHierarchyPrecomputation.ContractionVertex var8 = this.maskedContractionGraph.getEdgeTarget(var7);
         if (this.verticesData.get(var8.vertexId) == null || !this.verticesData.get(var8.vertexId).isIndependent) {
            var3.add(var8);
            var4 = Math.max(var4, this.contractionGraph.getEdgeWeight(var7));
         }
      }

      for (ContractionHierarchyPrecomputation.ContractionEdge var17 : this.maskedContractionGraph.incomingEdgesOf(var1)) {
         ContractionHierarchyPrecomputation.ContractionVertex var18 = this.contractionGraph.getEdgeSource(var17);
         if (this.verticesData.get(var18.vertexId) == null || !this.verticesData.get(var18.vertexId).isIndependent) {
            boolean var9 = var3.remove(var18);
            Map var10 = this.iterateToSuccessors(this.maskedContractionGraph, var18, var3, var1, this.contractionGraph.getEdgeWeight(var17) + var4);

            for (ContractionHierarchyPrecomputation.ContractionVertex var12 : var3) {
               ContractionHierarchyPrecomputation.ContractionEdge var13 = this.contractionGraph.getEdge(var1, var12);
               double var14 = this.contractionGraph.getEdgeWeight(var17) + this.contractionGraph.getEdgeWeight(var13);
               if (!var10.containsKey(var12) || (Double)((AddressableHeap.Handle)var10.get(var12)).getKey() > var14) {
                  var2.accept(var17, var13);
                  if (this.graph.getType().isUndirected()) {
                     var2.accept(this.contractionGraph.getEdge(var12, var1), this.contractionGraph.getEdge(var1, var18));
                  }
               }
            }

            if (var9 && this.graph.getType().isDirected()) {
               var3.add(var18);
            }
         }
      }
   }

   private Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, AddressableHeap.Handle<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> iterateToSuccessors(
      Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var1,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var2,
      Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> var3,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var4,
      double var5
   ) {
      AddressableHeap var7 = this.shortcutsSearchHeapSupplier.get();
      HashMap var8 = new HashMap();
      this.updateDistance(var2, 0.0, var7, var8);
      int var9 = var3.size();
      int var10 = 0;

      while (!var7.isEmpty()) {
         AddressableHeap.Handle var11 = var7.deleteMin();
         ContractionHierarchyPrecomputation.ContractionVertex var12 = (ContractionHierarchyPrecomputation.ContractionVertex)var11.getValue();
         double var13 = (Double)var11.getKey();
         if (var13 > var5) {
            break;
         }

         if (var3.contains(var12)) {
            if (++var10 == var9) {
               break;
            }
         }

         this.relaxNode(var1, var7, var8, var12, var13, var4);
      }

      return var8;
   }

   private void relaxNode(
      Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var1,
      AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>> var2,
      Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, AddressableHeap.Handle<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var3,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var4,
      double var5,
      ContractionHierarchyPrecomputation.ContractionVertex<V> var7
   ) {
      for (ContractionHierarchyPrecomputation.ContractionEdge var9 : var1.outgoingEdgesOf(var4)) {
         ContractionHierarchyPrecomputation.ContractionVertex var10 = (ContractionHierarchyPrecomputation.ContractionVertex)var1.getEdgeTarget(var9);
         double var11 = var1.getEdgeWeight(var9);
         if (var11 < 0.0) {
            throw new IllegalArgumentException("Negative edge weight not allowed");
         }

         if (!var10.equals(var7) && (this.verticesData.get(var10.vertexId) == null || !this.verticesData.get(var10.vertexId).isIndependent)) {
            double var13 = var5 + var11;
            this.updateDistance(var10, var13, var2, var3);
         }
      }
   }

   private void updateDistance(
      ContractionHierarchyPrecomputation.ContractionVertex<V> var1,
      double var2,
      AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>> var4,
      Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, AddressableHeap.Handle<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var5
   ) {
      AddressableHeap.Handle var6 = (AddressableHeap.Handle)var5.get(var1);
      if (var6 == null) {
         var6 = var4.insert(var2, var1);
         var5.put(var1, var6);
      } else if (var2 < (Double)var6.getKey()) {
         var6.decreaseKey(var2);
      }
   }

   private void markContracted(int var1, int var2) {
      for (int var3 = var1; var3 < var2; var3++) {
         this.verticesData.get(this.vertices.get(var3).vertexId).isContracted = true;
      }
   }

   private void submitTasks(int var1, int var2, Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>> var3) {
      for (ContractionHierarchyPrecomputation.ContractionTask var5 : this.tasks) {
         var5.consumer = var3;
         var5.segmentStart = var1;
         var5.segmentsEnd = var2;
         this.completionService.submit(var5, null);
      }

      this.waitForTasksCompletion(this.tasks.size());
   }

   private void submitTasks(int var1, int var2, List<Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>>> var3) {
      for (int var4 = 0; var4 < this.tasks.size(); var4++) {
         ContractionHierarchyPrecomputation.ContractionTask var5 = this.tasks.get(var4);
         var5.consumer = (Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>>)var3.get(var4);
         var5.segmentStart = var1;
         var5.segmentsEnd = var2;
         this.completionService.submit(var5, null);
      }

      this.waitForTasksCompletion(this.tasks.size());
   }

   private void waitForTasksCompletion(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         try {
            this.completionService.take().get();
         } catch (InterruptedException | ExecutionException var4) {
            var4.printStackTrace();
         }
      }
   }

   public static class ContractionEdge<E1> {
      E1 edge;
      Pair<ContractionHierarchyPrecomputation.ContractionEdge<E1>, ContractionHierarchyPrecomputation.ContractionEdge<E1>> bypassedEdges;
      boolean isUpward;
      int originalEdges;

      ContractionEdge(E1 var1) {
         this.edge = (E1)var1;
         this.originalEdges = 1;
      }

      ContractionEdge(Pair<ContractionHierarchyPrecomputation.ContractionEdge<E1>, ContractionHierarchyPrecomputation.ContractionEdge<E1>> var1) {
         this.bypassedEdges = var1;
         this.originalEdges = ((ContractionHierarchyPrecomputation.ContractionEdge)var1.getFirst()).originalEdges
            + ((ContractionHierarchyPrecomputation.ContractionEdge)var1.getSecond()).originalEdges;
      }
   }

   public static class ContractionHierarchy<V, E> {
      private Graph<V, E> graph;
      private Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> contractionGraph;
      private Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionMapping;

      public Graph<V, E> getGraph() {
         return this.graph;
      }

      public Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> getContractionGraph() {
         return this.contractionGraph;
      }

      public Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> getContractionMapping() {
         return this.contractionMapping;
      }

      ContractionHierarchy(
         Graph<V, E> var1,
         Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var2,
         Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> var3
      ) {
         this.graph = var1;
         this.contractionGraph = var2;
         this.contractionMapping = var3;
      }

      public void unpackBackward(ContractionHierarchyPrecomputation.ContractionEdge<E> var1, LinkedList<V> var2, LinkedList<E> var3) {
         if (var1.bypassedEdges == null) {
            var2.addFirst((E)this.contractionGraph.getEdgeSource(var1).vertex);
            var3.addFirst((E)var1.edge);
         } else {
            this.unpackBackward((ContractionHierarchyPrecomputation.ContractionEdge<E>)var1.bypassedEdges.getSecond(), var2, var3);
            this.unpackBackward((ContractionHierarchyPrecomputation.ContractionEdge<E>)var1.bypassedEdges.getFirst(), var2, var3);
         }
      }

      public void unpackForward(ContractionHierarchyPrecomputation.ContractionEdge<E> var1, LinkedList<V> var2, LinkedList<E> var3) {
         if (var1.bypassedEdges == null) {
            var2.addLast((E)this.contractionGraph.getEdgeTarget(var1).vertex);
            var3.addLast((E)var1.edge);
         } else {
            this.unpackForward((ContractionHierarchyPrecomputation.ContractionEdge<E>)var1.bypassedEdges.getFirst(), var2, var3);
            this.unpackForward((ContractionHierarchyPrecomputation.ContractionEdge<E>)var1.bypassedEdges.getSecond(), var2, var3);
         }
      }
   }

   private class ContractionTask implements Runnable {
      int taskId;
      int segmentStart;
      int segmentsEnd;
      Consumer<ContractionHierarchyPrecomputation.ContractionVertex<V>> consumer;

      public ContractionTask(int var2) {
         this.taskId = var2;
      }

      @Override
      public void run() {
         int var1 = this.workerSegmentStart(this.segmentStart, this.segmentsEnd);
         int var2 = this.workerSegmentEnd(this.segmentStart, this.segmentsEnd);

         for (int var3 = var1; var3 < var2; var3++) {
            this.consumer.accept(ContractionHierarchyPrecomputation.this.vertices.get(var3));
         }
      }

      private int workerSegmentStart(int var1, int var2) {
         return var1 + (var2 - var1) * this.taskId / ContractionHierarchyPrecomputation.this.parallelism;
      }

      private int workerSegmentEnd(int var1, int var2) {
         return var1 + (var2 - var1) * (this.taskId + 1) / ContractionHierarchyPrecomputation.this.parallelism;
      }
   }

   public static class ContractionVertex<V1> {
      int vertexId;
      V1 vertex;
      int contractionLevel;

      ContractionVertex(V1 var1, int var2) {
         this.vertexId = var2;
         this.vertex = (V1)var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            ContractionHierarchyPrecomputation.ContractionVertex var2 = (ContractionHierarchyPrecomputation.ContractionVertex)var1;
            return Objects.equals(this.vertex, var2.vertex);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.vertex);
      }
   }

   private class ToListConsumer
      implements BiConsumer<ContractionHierarchyPrecomputation.ContractionEdge<E>, ContractionHierarchyPrecomputation.ContractionEdge<E>> {
      List<Pair<ContractionHierarchyPrecomputation.ContractionEdge<E>, ContractionHierarchyPrecomputation.ContractionEdge<E>>> shortcuts = new ArrayList<>();

      ToListConsumer() {
      }

      public void accept(ContractionHierarchyPrecomputation.ContractionEdge<E> var1, ContractionHierarchyPrecomputation.ContractionEdge<E> var2) {
         this.shortcuts.add(Pair.of(var1, var2));
      }
   }

   private class ToStatisticsConsumer
      implements BiConsumer<ContractionHierarchyPrecomputation.ContractionEdge<E>, ContractionHierarchyPrecomputation.ContractionEdge<E>> {
      ContractionHierarchyPrecomputation.VertexStatistics statistics = new ContractionHierarchyPrecomputation.VertexStatistics();

      ToStatisticsConsumer() {
      }

      public void accept(ContractionHierarchyPrecomputation.ContractionEdge<E> var1, ContractionHierarchyPrecomputation.ContractionEdge<E> var2) {
         this.statistics.addedContractionEdges++;
         this.statistics.addedOriginalEdges = this.statistics.addedOriginalEdges + var1.originalEdges + var2.originalEdges;
      }
   }

   private static class VertexData {
      int depth;
      int random;
      double priority;
      boolean isContracted;
      boolean isIndependent;

      VertexData(int var1) {
         this.random = var1;
      }
   }

   private static class VertexStatistics {
      int addedContractionEdges;
      int removedContractionEdges;
      int addedOriginalEdges;
      int removedOriginalEdges;
   }
}
