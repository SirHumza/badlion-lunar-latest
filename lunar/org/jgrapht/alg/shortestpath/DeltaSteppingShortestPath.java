package org.jgrapht.alg.shortestpath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.util.ConcurrencyUtil;

public class DeltaSteppingShortestPath<V, E> extends BaseShortestPathAlgorithm<V, E> {
   private static final String NEGATIVE_EDGE_WEIGHT_NOT_ALLOWED = "Negative edge weight not allowed";
   private static final String DELTA_MUST_BE_NON_NEGATIVE = "Delta must be non-negative";
   private static final int DEFAULT_PARALLELISM = Runtime.getRuntime().availableProcessors();
   private static final int TASKS_TO_THREADS_RATIO = 20;
   private double delta;
   private int parallelism;
   private int numOfBuckets;
   private double maxEdgeWeight;
   private Map<V, Pair<Double, E>> distanceAndPredecessorMap;
   private List<Set<V>> bucketStructure;
   private ExecutorCompletionService<Void> completionService;
   private Queue<V> verticesQueue;
   private Runnable lightRelaxTask;
   private Runnable heavyRelaxTask;
   private volatile boolean allVerticesAdded;

   @Deprecated
   public DeltaSteppingShortestPath(Graph<V, E> var1) {
      this(var1, DEFAULT_PARALLELISM);
   }

   public DeltaSteppingShortestPath(Graph<V, E> var1, ThreadPoolExecutor var2) {
      this(var1, 0.0, var2);
   }

   @Deprecated
   public DeltaSteppingShortestPath(Graph<V, E> var1, double var2) {
      this(var1, var2, DEFAULT_PARALLELISM);
   }

   public DeltaSteppingShortestPath(Graph<V, E> var1, double var2, ThreadPoolExecutor var4) {
      super(var1);
      this.init(var1, var2, var4);
   }

   @Deprecated
   public DeltaSteppingShortestPath(Graph<V, E> var1, int var2) {
      this(var1, 0.0, var2);
   }

   @Deprecated
   public DeltaSteppingShortestPath(Graph<V, E> var1, double var2, int var4) {
      super(var1);
      this.init(var1, var2, ConcurrencyUtil.createThreadPoolExecutor(var4));
   }

   private void init(Graph<V, E> var1, double var2, ThreadPoolExecutor var4) {
      if (var2 < 0.0) {
         throw new IllegalArgumentException("Delta must be non-negative");
      }

      this.delta = var2;
      this.parallelism = var4.getMaximumPoolSize();
      this.distanceAndPredecessorMap = new ConcurrentHashMap<>(var1.vertexSet().size());
      this.completionService = new ExecutorCompletionService<>(var4);
      this.verticesQueue = new ConcurrentLinkedQueue();
      this.lightRelaxTask = new DeltaSteppingShortestPath.LightRelaxTask(this.verticesQueue);
      this.heavyRelaxTask = new DeltaSteppingShortestPath.HeavyRelaxTask(this.verticesQueue);
   }

   private double getMaxEdgeWeight() {
      ForkJoinTask var1 = ForkJoinPool.commonPool()
         .submit(new DeltaSteppingShortestPath.MaxEdgeWeightTask(this.graph.edgeSet().spliterator(), this.graph.edgeSet().size() / (20 * this.parallelism) + 1));
      return (Double)var1.join();
   }

   @Override
   public GraphPath<V, E> getPath(V var1, V var2) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      } else if (!this.graph.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Graph must contain the sink vertex!");
      } else {
         return this.getPaths((V)var1).getPath((V)var2);
      }
   }

   @Override
   public ShortestPathAlgorithm.SingleSourcePaths<V, E> getPaths(V var1) {
      if (!this.graph.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Graph must contain the source vertex!");
      }

      this.maxEdgeWeight = this.getMaxEdgeWeight();
      if (this.delta == 0.0) {
         this.delta = this.findDelta();
      }

      this.numOfBuckets = (int)(Math.ceil(this.maxEdgeWeight / this.delta) + 1.0);
      this.bucketStructure = new ArrayList<>(this.numOfBuckets);

      for (int var2 = 0; var2 < this.numOfBuckets; var2++) {
         this.bucketStructure.add(new ConcurrentSkipListSet());
      }

      this.fillDistanceAndPredecessorMap();
      this.computeShortestPaths((V)var1);
      return new TreeSingleSourcePathsImpl<>(this.graph, (V)var1, this.distanceAndPredecessorMap);
   }

   private double findDelta() {
      if (this.maxEdgeWeight == 0.0) {
         return 1.0;
      }

      int var1 = this.graph.vertexSet().parallelStream().mapToInt(this.graph::outDegreeOf).max().orElse(0);
      return this.maxEdgeWeight / var1;
   }

   private void fillDistanceAndPredecessorMap() {
      this.graph.vertexSet().parallelStream().forEach(var1 -> this.distanceAndPredecessorMap.put((V)var1, Pair.of(Double.POSITIVE_INFINITY, null)));
   }

   private void computeShortestPaths(V var1) {
      this.relax((V)var1, null, 0.0);
      ArrayList var2 = new ArrayList();

      while (true) {
         int var3 = 0;

         while (var3 < this.numOfBuckets && this.bucketStructure.get(var3).isEmpty()) {
            var3++;
         }

         if (var3 == this.numOfBuckets) {
            return;
         }

         for (Set var4 = this.getContentAndReplace(var3); !var4.isEmpty(); var4 = this.getContentAndReplace(var3)) {
            var2.add(var4);
            this.findAndRelaxLightRequests(var4);
         }

         this.findAndRelaxHeavyRequests(var2);
         var2.clear();
      }
   }

   private void findAndRelaxLightRequests(Set<V> var1) {
      this.allVerticesAdded = false;
      int var2 = var1.size();
      int var3;
      if (var2 >= this.parallelism) {
         var3 = this.parallelism;
         Iterator var4 = var1.iterator();
         this.addSetVertices(var4, this.parallelism);
         this.submitTasks(this.lightRelaxTask, this.parallelism - 1);
         this.addSetRemaining(var4);
         this.submitTasks(this.lightRelaxTask, 1);
      } else {
         var3 = var2;
         this.addSetRemaining(var1.iterator());
         this.submitTasks(this.lightRelaxTask, var2);
      }

      this.allVerticesAdded = true;
      this.waitForTasksCompletion(var3);
   }

   private void findAndRelaxHeavyRequests(List<Set<V>> var1) {
      this.allVerticesAdded = false;
      int var2 = var1.stream().mapToInt(Set::size).sum();
      int var3;
      if (var2 >= this.parallelism) {
         var3 = this.parallelism;
         Iterator var4 = var1.iterator();
         Iterator var5 = this.addSetsVertices(var4, this.parallelism);
         this.submitTasks(this.heavyRelaxTask, this.parallelism - 1);
         this.addSetRemaining(var5);
         this.addSetsRemaining(var4);
         this.submitTasks(this.heavyRelaxTask, 1);
      } else {
         var3 = var2;
         this.addSetsRemaining(var1.iterator());
         this.submitTasks(this.heavyRelaxTask, var2);
      }

      this.allVerticesAdded = true;
      this.waitForTasksCompletion(var3);
   }

   private void addSetVertices(Iterator<V> var1, int var2) {
      for (int var3 = 0; var3 < var2 && var1.hasNext(); var3++) {
         this.verticesQueue.add((V)var1.next());
      }
   }

   private void addSetRemaining(Iterator<V> var1) {
      while (var1.hasNext()) {
         this.verticesQueue.add((V)var1.next());
      }
   }

   private Iterator<V> addSetsVertices(Iterator<Set<V>> var1, int var2) {
      int var3 = 0;
      Iterator var4 = null;

      while (var1.hasNext() && var3 < var2) {
         for (var4 = ((Set)var1.next()).iterator(); var4.hasNext() && var3 < var2; var3++) {
            this.verticesQueue.add((V)var4.next());
         }
      }

      return var4;
   }

   private void addSetsRemaining(Iterator<Set<V>> var1) {
      while (var1.hasNext()) {
         this.verticesQueue.addAll((Collection<? extends V>)var1.next());
      }
   }

   private void submitTasks(Runnable var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         this.completionService.submit(var1, null);
      }
   }

   private void waitForTasksCompletion(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         try {
            this.completionService.take();
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }
      }
   }

   private void relax(V var1, E var2, double var3) {
      int var5 = this.bucketIndex(var3);
      synchronized (var1) {
         Pair var7 = this.distanceAndPredecessorMap.get(var1);
         if (var3 < (Double)var7.getFirst()) {
            if (!((Double)var7.getFirst()).equals(Double.POSITIVE_INFINITY)) {
               this.bucketStructure.get(this.bucketIndex((Double)var7.getFirst())).remove(var1);
            }

            this.bucketStructure.get(var5).add((V)var1);
            this.distanceAndPredecessorMap.put((V)var1, Pair.of(var3, (E)var2));
         }
      }
   }

   private int bucketIndex(double var1) {
      return (int)Math.round(var1 / this.delta) % this.numOfBuckets;
   }

   private Set<V> getContentAndReplace(int var1) {
      Set var2 = this.bucketStructure.get(var1);
      this.bucketStructure.set(var1, new ConcurrentSkipListSet());
      return var2;
   }

   class HeavyRelaxTask implements Runnable {
      private Queue<V> vertices;

      HeavyRelaxTask(Queue<V> var2) {
         this.vertices = var2;
      }

      @Override
      public void run() {
         while (true) {
            Object var1 = this.vertices.poll();
            if (var1 == null) {
               if (DeltaSteppingShortestPath.this.allVerticesAdded && this.vertices.isEmpty()) {
                  return;
               }
            } else {
               for (Object var3 : DeltaSteppingShortestPath.this.graph.outgoingEdgesOf((V)var1)) {
                  if (DeltaSteppingShortestPath.this.graph.getEdgeWeight((E)var3) > DeltaSteppingShortestPath.this.delta) {
                     DeltaSteppingShortestPath.this.relax(
                        Graphs.getOppositeVertex(DeltaSteppingShortestPath.this.graph, (E)var3, (V)var1),
                        (E)var3,
                        DeltaSteppingShortestPath.this.distanceAndPredecessorMap.get(var1).getFirst()
                           + DeltaSteppingShortestPath.this.graph.getEdgeWeight((E)var3)
                     );
                  }
               }
            }
         }
      }
   }

   class LightRelaxTask implements Runnable {
      private Queue<V> vertices;

      LightRelaxTask(Queue<V> var2) {
         this.vertices = var2;
      }

      @Override
      public void run() {
         while (true) {
            Object var1 = this.vertices.poll();
            if (var1 == null) {
               if (DeltaSteppingShortestPath.this.allVerticesAdded && this.vertices.isEmpty()) {
                  return;
               }
            } else {
               for (Object var3 : DeltaSteppingShortestPath.this.graph.outgoingEdgesOf((V)var1)) {
                  if (DeltaSteppingShortestPath.this.graph.getEdgeWeight((E)var3) <= DeltaSteppingShortestPath.this.delta) {
                     DeltaSteppingShortestPath.this.relax(
                        Graphs.getOppositeVertex(DeltaSteppingShortestPath.this.graph, (E)var3, (V)var1),
                        (E)var3,
                        DeltaSteppingShortestPath.this.distanceAndPredecessorMap.get(var1).getFirst()
                           + DeltaSteppingShortestPath.this.graph.getEdgeWeight((E)var3)
                     );
                  }
               }
            }
         }
      }
   }

   class MaxEdgeWeightTask extends RecursiveTask<Double> {
      Spliterator<E> spliterator;
      long loadBalancing;

      MaxEdgeWeightTask(Spliterator<E> var2, long var3) {
         this.spliterator = var2;
         this.loadBalancing = var3;
      }

      protected Double compute() {
         if (this.spliterator.estimateSize() <= this.loadBalancing) {
            double[] var3 = new double[]{0.0};
            this.spliterator.forEachRemaining(var2x -> {
               double var3x = DeltaSteppingShortestPath.this.graph.getEdgeWeight((E)var2x);
               if (var3x < 0.0) {
                  throw new IllegalArgumentException("Negative edge weight not allowed");
               }

               var3[0] = Math.max(var3x, var3[0]);
            });
            return var3[0];
         } else {
            DeltaSteppingShortestPath.MaxEdgeWeightTask var1 = DeltaSteppingShortestPath.this.new MaxEdgeWeightTask(
               this.spliterator.trySplit(), this.loadBalancing
            );
            var1.fork();
            DeltaSteppingShortestPath.MaxEdgeWeightTask var2 = DeltaSteppingShortestPath.this.new MaxEdgeWeightTask(this.spliterator, this.loadBalancing);
            return Math.max(var2.compute(), (Double)var1.join());
         }
      }
   }
}
