package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ManyToManyShortestPathsAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.graph.MaskSubgraph;
import org.jgrapht.util.CollectionUtil;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

class TransitNodeRoutingPrecomputation<V, E> {
   private static final int NO_VORONOI_CELL = -1;
   private ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> contractionHierarchy;
   private Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> contractionGraph;
   private Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionMapping;
   private int numberOfTransitVertices;
   private int parallelism;
   private Supplier<AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> heapSupplier;
   private List<ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionVertices;
   private ManyToManyShortestPathsAlgorithm<V, E> manyToManyShortestPathsAlgorithm;
   private Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> contractedTransitVerticesSet;
   private Set<V> transitVerticesSet;
   private List<V> transitVerticesList;
   private TransitNodeRoutingPrecomputation.VoronoiDiagram<V> voronoiDiagram;
   private ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> transitVerticesPaths;
   private ExecutorService executor;
   private ExecutorCompletionService<Void> completionService;

   public TransitNodeRoutingPrecomputation(Graph<V, E> var1, ThreadPoolExecutor var2) {
      this(new ContractionHierarchyPrecomputation<V, E>(var1, var2).computeContractionHierarchy(), var2);
   }

   public TransitNodeRoutingPrecomputation(ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var1, ThreadPoolExecutor var2) {
      this(var1, (int)Math.sqrt(var1.getGraph().vertexSet().size()), var2);
   }

   public TransitNodeRoutingPrecomputation(ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var1, int var2, ThreadPoolExecutor var3) {
      this(var1, var2, PairingHeap::new, var3);
   }

   public TransitNodeRoutingPrecomputation(
      ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var1,
      int var2,
      Supplier<AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> var3,
      ThreadPoolExecutor var4
   ) {
      if (var2 > var1.getGraph().vertexSet().size()) {
         throw new IllegalArgumentException("number of transit vertices is larger than the number of vertices in the graph");
      }

      this.contractionHierarchy = var1;
      this.contractionGraph = var1.getContractionGraph();
      this.contractionMapping = var1.getContractionMapping();
      this.numberOfTransitVertices = var2;
      this.parallelism = var4.getMaximumPoolSize();
      this.heapSupplier = var3;
      this.contractionVertices = new ArrayList<>(Collections.nCopies(this.contractionGraph.vertexSet().size(), null));
      this.manyToManyShortestPathsAlgorithm = new CHManyToManyShortestPaths<>(var1);
      this.executor = var4;
      this.completionService = new ExecutorCompletionService<>(this.executor);
   }

   public TransitNodeRoutingPrecomputation.TransitNodeRouting<V, E> computeTransitNodeRouting() {
      this.fillContractionVerticesList();
      this.contractedTransitVerticesSet = this.selectTopKTransitVertices(this.numberOfTransitVertices);
      this.transitVerticesSet = this.contractedTransitVerticesSet
         .stream()
         .map(var0 -> var0.vertex)
         .collect(Collectors.toCollection((Supplier<Set<V>>)(HashSet::new)));
      this.transitVerticesList = new ArrayList<>(this.transitVerticesSet);
      TransitNodeRoutingPrecomputation.VoronoiDiagramComputation var1 = new TransitNodeRoutingPrecomputation.VoronoiDiagramComputation();
      this.voronoiDiagram = var1.computeVoronoiDiagram();
      ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths var2 = this.manyToManyShortestPathsAlgorithm
         .getManyToManyPaths(this.transitVerticesSet, this.transitVerticesSet);
      this.transitVerticesPaths = this.unpackPaths(var2);
      Pair var3 = this.computeAVAndLF();
      return new TransitNodeRoutingPrecomputation.TransitNodeRouting<>(
         this.contractionHierarchy,
         this.contractedTransitVerticesSet,
         this.transitVerticesPaths,
         this.voronoiDiagram,
         (TransitNodeRoutingPrecomputation.AccessVertices<V, E>)var3.getFirst(),
         (TransitNodeRoutingPrecomputation.LocalityFilter<V>)var3.getSecond()
      );
   }

   private void fillContractionVerticesList() {
      for (ContractionHierarchyPrecomputation.ContractionVertex var2 : this.contractionGraph.vertexSet()) {
         this.contractionVertices.set(var2.vertexId, var2);
      }
   }

   private ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> unpackPaths(ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> var1) {
      HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(this.numberOfTransitVertices);

      for (Object var4 : this.transitVerticesList) {
         var2.put(var4, CollectionUtil.newHashMapWithExpectedSize(this.numberOfTransitVertices));
      }

      for (int var5 = 0; var5 < this.parallelism; var5++) {
         TransitNodeRoutingPrecomputation.PathsUnpackingTask var6 = new TransitNodeRoutingPrecomputation.PathsUnpackingTask(
            var5, this.transitVerticesList, var2, var1
         );
         this.completionService.submit(var6, null);
      }

      this.waitForTasksCompletion(this.parallelism);
      return new DefaultManyToManyShortestPaths.DefaultManyToManyShortestPathsImpl<>(this.transitVerticesSet, this.transitVerticesSet, var2);
   }

   private Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> selectTopKTransitVertices(int var1) {
      int var2 = this.contractionGraph.vertexSet().size();
      HashSet var3 = CollectionUtil.newHashSetWithExpectedSize(var1);

      for (ContractionHierarchyPrecomputation.ContractionVertex var5 : this.contractionGraph.vertexSet()) {
         if (var5.contractionLevel >= var2 - var1) {
            var3.add(var5);
         }
      }

      return var3;
   }

   private Pair<TransitNodeRoutingPrecomputation.AccessVertices<V, E>, TransitNodeRoutingPrecomputation.LocalityFilter<V>> computeAVAndLF() {
      TransitNodeRoutingPrecomputation.LocalityFilterBuilder var1 = new TransitNodeRoutingPrecomputation.LocalityFilterBuilder(
         this.contractionGraph.vertexSet().size()
      );
      TransitNodeRoutingPrecomputation.AccessVerticesBuilder var2 = new TransitNodeRoutingPrecomputation.AccessVerticesBuilder(
         this.contractionGraph.vertexSet().size()
      );
      TransitNodeRoutingPrecomputation.ContractionHierarchyBFS var3 = new TransitNodeRoutingPrecomputation.ContractionHierarchyBFS(
         new MaskSubgraph<>(this.contractionGraph, var0 -> false, var0 -> !var0.isUpward)
      );
      TransitNodeRoutingPrecomputation.ContractionHierarchyBFS var4 = new TransitNodeRoutingPrecomputation.ContractionHierarchyBFS(
         new MaskSubgraph<>(new EdgeReversedGraph<>(this.contractionGraph), var0 -> false, var0 -> var0.isUpward)
      );

      for (int var5 = 0; var5 < this.parallelism; var5++) {
         TransitNodeRoutingPrecomputation.AVAndLFConstructionTask var6 = new TransitNodeRoutingPrecomputation.AVAndLFConstructionTask(
            var5, var1, var2, var3, var4
         );
         this.completionService.submit(var6, null);
      }

      this.waitForTasksCompletion(this.parallelism);
      return Pair.of(var2.buildVertices(), var1.buildLocalityFilter());
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

   private int workerSegmentStart(int var1, int var2, int var3) {
      return var1 + (var2 - var1) * var3 / this.parallelism;
   }

   private int workerSegmentEnd(int var1, int var2, int var3) {
      return var1 + (var2 - var1) * (var3 + 1) / this.parallelism;
   }

   private class AVAndLFConstructionTask implements Runnable {
      private int taskId;
      private TransitNodeRoutingPrecomputation<V, E>.LocalityFilterBuilder localityFilterBuilder;
      private TransitNodeRoutingPrecomputation<V, E>.AccessVerticesBuilder accessVerticesBuilder;
      private TransitNodeRoutingPrecomputation<V, E>.ContractionHierarchyBFS forwardBFS;
      private TransitNodeRoutingPrecomputation<V, E>.ContractionHierarchyBFS backwardBFS;

      public AVAndLFConstructionTask(
         int var2,
         TransitNodeRoutingPrecomputation<V, E>.LocalityFilterBuilder var3,
         TransitNodeRoutingPrecomputation<V, E>.AccessVerticesBuilder var4,
         TransitNodeRoutingPrecomputation<V, E>.ContractionHierarchyBFS var5,
         TransitNodeRoutingPrecomputation<V, E>.ContractionHierarchyBFS var6
      ) {
         this.taskId = var2;
         this.localityFilterBuilder = var3;
         this.accessVerticesBuilder = var4;
         this.forwardBFS = var5;
         this.backwardBFS = var6;
      }

      @Override
      public void run() {
         int var1 = TransitNodeRoutingPrecomputation.this.workerSegmentStart(0, TransitNodeRoutingPrecomputation.this.contractionVertices.size(), this.taskId);
         int var2 = TransitNodeRoutingPrecomputation.this.workerSegmentEnd(0, TransitNodeRoutingPrecomputation.this.contractionVertices.size(), this.taskId);

         for (int var3 = var1; var3 < var2; var3++) {
            ContractionHierarchyPrecomputation.ContractionVertex var4 = TransitNodeRoutingPrecomputation.this.contractionVertices.get(var3);
            Pair var5 = this.forwardBFS.runSearch(var4);
            Pair var6 = this.backwardBFS.runSearch(var4);
            this.accessVerticesBuilder.addForwardAccessVertices(var4, (Set<V>)var5.getFirst());
            this.accessVerticesBuilder.addBackwardAccessVertices(var4, (Set<V>)var6.getFirst());
            this.localityFilterBuilder.addForwardVisitedVoronoiCells(var4, (Set<Integer>)var5.getSecond());
            this.localityFilterBuilder.addBackwardVisitedVoronoiCells(var4, (Set<Integer>)var6.getSecond());
         }
      }
   }

   public static class AccessVertex<V, E> {
      private V vertex;
      private GraphPath<V, E> path;

      public V getVertex() {
         return this.vertex;
      }

      public GraphPath<V, E> getPath() {
         return this.path;
      }

      public AccessVertex(V var1, GraphPath<V, E> var2) {
         this.vertex = (V)var1;
         this.path = var2;
      }
   }

   public static class AccessVertices<V, E> {
      private List<List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>>> forwardAccessVertices;
      private List<List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>>> backwardAccessVertices;

      public AccessVertices(
         List<List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>>> var1, List<List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>>> var2
      ) {
         this.forwardAccessVertices = var1;
         this.backwardAccessVertices = var2;
      }

      public List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>> getForwardAccessVertices(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
         return this.forwardAccessVertices.get(var1.vertexId);
      }

      public List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>> getBackwardAccessVertices(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
         return this.backwardAccessVertices.get(var1.vertexId);
      }
   }

   private class AccessVerticesBuilder {
      private List<List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>>> forwardAccessVertices;
      private List<List<TransitNodeRoutingPrecomputation.AccessVertex<V, E>>> backwardAccessVertices;

      public AccessVerticesBuilder(int var2) {
         this.forwardAccessVertices = new ArrayList<>(var2);
         this.backwardAccessVertices = new ArrayList<>(var2);

         for (int var3 = 0; var3 < var2; var3++) {
            this.forwardAccessVertices.add(new ArrayList<>());
            this.backwardAccessVertices.add(new ArrayList<>());
         }
      }

      public TransitNodeRoutingPrecomputation.AccessVertices<V, E> buildVertices() {
         return new TransitNodeRoutingPrecomputation.AccessVertices<>(this.forwardAccessVertices, this.backwardAccessVertices);
      }

      public void addForwardAccessVertices(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, Set<V> var2) {
         ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths var3 = TransitNodeRoutingPrecomputation.this.manyToManyShortestPathsAlgorithm
            .getManyToManyPaths(Collections.singleton((V)var1.vertex), var2);
         Set var4 = this.getPrunedAccessVertices(var1.vertex, var2, var3, true);
         List var5 = this.forwardAccessVertices.get(var1.vertexId);

         for (Object var7 : var2) {
            if (!var4.contains(var7)) {
               var5.add(new TransitNodeRoutingPrecomputation.AccessVertex<>(var7, var3.getPath(var1.vertex, var7)));
            }
         }
      }

      public void addBackwardAccessVertices(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, Set<V> var2) {
         ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths var3 = TransitNodeRoutingPrecomputation.this.manyToManyShortestPathsAlgorithm
            .getManyToManyPaths(var2, Collections.singleton((V)var1.vertex));
         Set var4 = this.getPrunedAccessVertices(var1.vertex, var2, var3, false);
         List var5 = this.backwardAccessVertices.get(var1.vertexId);

         for (Object var7 : var2) {
            if (!var4.contains(var7)) {
               var5.add(new TransitNodeRoutingPrecomputation.AccessVertex<>(var7, var3.getPath(var7, var1.vertex)));
            }
         }
      }

      private Set<V> getPrunedAccessVertices(V var1, Set<V> var2, ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> var3, boolean var4) {
         HashSet var5 = new HashSet();

         for (Object var7 : var2) {
            if (!var5.contains(var7)) {
               for (Object var9 : var2) {
                  if (!var7.equals(var9) && !var5.contains(var9)) {
                     if (var4) {
                        if (var3.getWeight(var1, var7) + TransitNodeRoutingPrecomputation.this.transitVerticesPaths.getWeight((V)var7, (V)var9)
                           <= var3.getWeight(var1, var9)) {
                           var5.add(var9);
                        }
                     } else if (TransitNodeRoutingPrecomputation.this.transitVerticesPaths.getWeight((V)var9, (V)var7) + var3.getWeight(var7, var1)
                        <= var3.getWeight(var9, var1)) {
                        var5.add(var9);
                     }
                  }
               }
            }
         }

         return var5;
      }
   }

   private class ContractionHierarchyBFS {
      private Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> contractionGraph;

      public ContractionHierarchyBFS(Graph<ContractionHierarchyPrecomputation.ContractionVertex<V>, ContractionHierarchyPrecomputation.ContractionEdge<E>> var2) {
         this.contractionGraph = var2;
      }

      public Pair<Set<V>, Set<Integer>> runSearch(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
         HashSet var2 = new HashSet();
         HashSet var3 = new HashSet();
         HashSet var4 = new HashSet();
         LinkedList var5 = new LinkedList();
         var5.add(var1);

         while (!var5.isEmpty()) {
            ContractionHierarchyPrecomputation.ContractionVertex var6 = (ContractionHierarchyPrecomputation.ContractionVertex)var5.remove();
            var4.add(var6.vertexId);
            if (TransitNodeRoutingPrecomputation.this.contractedTransitVerticesSet.contains(var6)) {
               var2.add((E)var6.vertex);
            } else {
               var3.add(TransitNodeRoutingPrecomputation.this.voronoiDiagram.getVoronoiCellId(var6));

               for (ContractionHierarchyPrecomputation.ContractionEdge var8 : this.contractionGraph.outgoingEdgesOf(var6)) {
                  ContractionHierarchyPrecomputation.ContractionVertex var9 = Graphs.getOppositeVertex(this.contractionGraph, var8, var6);
                  if (!var4.contains(var9.vertexId)) {
                     var5.add(var9);
                  }
               }
            }
         }

         return Pair.of(var2, var3);
      }
   }

   public static class LocalityFilter<V> {
      private Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> contractionMapping;
      private List<Set<Integer>> visitedForwardVoronoiCells;
      private List<Set<Integer>> visitedBackwardVoronoiCells;

      public LocalityFilter(Map<V, ContractionHierarchyPrecomputation.ContractionVertex<V>> var1, List<Set<Integer>> var2, List<Set<Integer>> var3) {
         this.contractionMapping = var1;
         this.visitedForwardVoronoiCells = var2;
         this.visitedBackwardVoronoiCells = var3;
      }

      public boolean isLocal(V var1, V var2) {
         ContractionHierarchyPrecomputation.ContractionVertex var3 = this.contractionMapping.get(var1);
         ContractionHierarchyPrecomputation.ContractionVertex var4 = this.contractionMapping.get(var2);
         Set var5 = this.visitedForwardVoronoiCells.get(var3.vertexId);
         Set var6 = this.visitedBackwardVoronoiCells.get(var4.vertexId);
         if (!var5.contains(-1) && !var6.contains(-1)) {
            Set var7;
            Set var8;
            if (var5.size() <= var6.size()) {
               var7 = var5;
               var8 = var6;
            } else {
               var7 = var6;
               var8 = var5;
            }

            for (Integer var10 : var7) {
               if (var8.contains(var10)) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      }
   }

   private class LocalityFilterBuilder {
      private List<Set<Integer>> visitedForwardVoronoiCells;
      private List<Set<Integer>> visitedBackwardVoronoiCells;

      public LocalityFilterBuilder(int var2) {
         this.visitedForwardVoronoiCells = new ArrayList<>(var2);
         this.visitedBackwardVoronoiCells = new ArrayList<>(var2);

         for (int var3 = 0; var3 < var2; var3++) {
            this.visitedForwardVoronoiCells.add(null);
            this.visitedBackwardVoronoiCells.add(null);
         }
      }

      public void addForwardVisitedVoronoiCells(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, Set<Integer> var2) {
         this.visitedForwardVoronoiCells.set(var1.vertexId, var2);
      }

      public void addBackwardVisitedVoronoiCells(ContractionHierarchyPrecomputation.ContractionVertex<V> var1, Set<Integer> var2) {
         this.visitedBackwardVoronoiCells.set(var1.vertexId, var2);
      }

      public TransitNodeRoutingPrecomputation.LocalityFilter<V> buildLocalityFilter() {
         return new TransitNodeRoutingPrecomputation.LocalityFilter<>(
            TransitNodeRoutingPrecomputation.this.contractionMapping, this.visitedForwardVoronoiCells, this.visitedBackwardVoronoiCells
         );
      }
   }

   private class PathsUnpackingTask implements Runnable {
      private int taskId;
      private List<V> transitVertices;
      private Map<V, Map<V, GraphPath<V, E>>> pathsMap;
      private ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> shortestPaths;

      public PathsUnpackingTask(
         int var2, List<V> var3, Map<V, Map<V, GraphPath<V, E>>> var4, ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> var5
      ) {
         this.taskId = var2;
         this.transitVertices = var3;
         this.pathsMap = var4;
         this.shortestPaths = var5;
      }

      @Override
      public void run() {
         int var1 = TransitNodeRoutingPrecomputation.this.workerSegmentStart(0, this.transitVertices.size(), this.taskId);
         int var2 = TransitNodeRoutingPrecomputation.this.workerSegmentEnd(0, this.transitVertices.size(), this.taskId);

         for (int var3 = var1; var3 < var2; var3++) {
            Object var4 = this.transitVertices.get(var3);
            Map var5 = this.pathsMap.get(var4);

            for (Object var7 : this.transitVertices) {
               var5.put(var7, this.shortestPaths.getPath((V)var4, (V)var7));
            }
         }
      }
   }

   static class TransitNodeRouting<V, E> {
      private ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> contractionHierarchy;
      private Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> transitVertices;
      private ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> transitVerticesPaths;
      private TransitNodeRoutingPrecomputation.VoronoiDiagram<V> voronoiDiagram;
      private TransitNodeRoutingPrecomputation.AccessVertices<V, E> accessVertices;
      private TransitNodeRoutingPrecomputation.LocalityFilter<V> localityFilter;

      public ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> getContractionHierarchy() {
         return this.contractionHierarchy;
      }

      public Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> getTransitVertices() {
         return this.transitVertices;
      }

      public ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> getTransitVerticesPaths() {
         return this.transitVerticesPaths;
      }

      public TransitNodeRoutingPrecomputation.VoronoiDiagram<V> getVoronoiDiagram() {
         return this.voronoiDiagram;
      }

      public TransitNodeRoutingPrecomputation.AccessVertices<V, E> getAccessVertices() {
         return this.accessVertices;
      }

      public TransitNodeRoutingPrecomputation.LocalityFilter<V> getLocalityFilter() {
         return this.localityFilter;
      }

      public TransitNodeRouting(
         ContractionHierarchyPrecomputation.ContractionHierarchy<V, E> var1,
         Set<ContractionHierarchyPrecomputation.ContractionVertex<V>> var2,
         ManyToManyShortestPathsAlgorithm.ManyToManyShortestPaths<V, E> var3,
         TransitNodeRoutingPrecomputation.VoronoiDiagram<V> var4,
         TransitNodeRoutingPrecomputation.AccessVertices<V, E> var5,
         TransitNodeRoutingPrecomputation.LocalityFilter<V> var6
      ) {
         this.contractionHierarchy = var1;
         this.transitVertices = var2;
         this.transitVerticesPaths = var3;
         this.voronoiDiagram = var4;
         this.localityFilter = var6;
         this.accessVertices = var5;
      }
   }

   public static class VoronoiDiagram<V> {
      private int[] voronoiCells;

      public VoronoiDiagram(int[] var1) {
         this.voronoiCells = var1;
      }

      public int getVoronoiCellId(ContractionHierarchyPrecomputation.ContractionVertex<V> var1) {
         return this.voronoiCells[var1.vertexId];
      }
   }

   private class VoronoiDiagramComputation {
      private AddressableHeap<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>> heap = TransitNodeRoutingPrecomputation.this.heapSupplier.get();
      private Map<ContractionHierarchyPrecomputation.ContractionVertex<V>, AddressableHeap.Handle<Double, ContractionHierarchyPrecomputation.ContractionVertex<V>>> seen = new HashMap<>();
      private int[] voronoiCells;
      private double[] distanceToCenter;

      VoronoiDiagramComputation() {
      }

      TransitNodeRoutingPrecomputation.VoronoiDiagram<V> computeVoronoiDiagram() {
         int var1 = TransitNodeRoutingPrecomputation.this.contractionGraph.vertexSet().size();
         this.voronoiCells = new int[var1];
         this.distanceToCenter = new double[var1];
         Arrays.fill(this.voronoiCells, -1);
         Arrays.fill(this.distanceToCenter, Double.POSITIVE_INFINITY);
         EdgeReversedGraph var2 = new EdgeReversedGraph<>(
            new MaskSubgraph<>(TransitNodeRoutingPrecomputation.this.contractionGraph, var0 -> false, var0 -> var0.edge == null)
         );

         for (ContractionHierarchyPrecomputation.ContractionVertex var4 : TransitNodeRoutingPrecomputation.this.contractedTransitVerticesSet) {
            this.updateDistance(var4, var4, 0.0);
         }

         while (!this.heap.isEmpty()) {
            AddressableHeap.Handle var12 = this.heap.deleteMin();
            double var13 = (Double)var12.getKey();
            ContractionHierarchyPrecomputation.ContractionVertex var6 = (ContractionHierarchyPrecomputation.ContractionVertex)var12.getValue();

            for (ContractionHierarchyPrecomputation.ContractionEdge var8 : var2.outgoingEdgesOf(var6)) {
               ContractionHierarchyPrecomputation.ContractionVertex var9 = Graphs.getOppositeVertex(var2, (E)var8, var6);
               double var10 = var13 + var2.getEdgeWeight(var8);
               if (var10 < this.distanceToCenter[var9.vertexId]) {
                  this.updateDistance(var9, var6, var10);
               }
            }
         }

         return new TransitNodeRoutingPrecomputation.VoronoiDiagram<>(this.voronoiCells);
      }

      private void updateDistance(
         ContractionHierarchyPrecomputation.ContractionVertex<V> var1, ContractionHierarchyPrecomputation.ContractionVertex<V> var2, double var3
      ) {
         AddressableHeap.Handle var5 = this.seen.get(var1);
         if (var5 == null) {
            var5 = this.heap.insert(var3, var1);
            this.seen.put(var1, var5);
            this.visitVertex(var1, var2, var3);
         } else if (var3 < (Double)var5.getKey()) {
            var5.decreaseKey(var3);
            var5.setValue((ContractionHierarchyPrecomputation.ContractionVertex)var5.getValue());
            this.visitVertex(var1, var2, var3);
         }
      }

      private void visitVertex(
         ContractionHierarchyPrecomputation.ContractionVertex<V> var1, ContractionHierarchyPrecomputation.ContractionVertex<V> var2, double var3
      ) {
         int var5;
         if (var1.vertexId == var2.vertexId) {
            var5 = var1.vertexId;
         } else {
            var5 = this.voronoiCells[var2.vertexId];
         }

         this.voronoiCells[var1.vertexId] = var5;
         this.distanceToCenter[var1.vertexId] = var3;
      }
   }
}
