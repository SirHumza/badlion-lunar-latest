package org.jgrapht.alg.flow;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MaximumFlowAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.alg.util.extension.ExtensionFactory;

public class PushRelabelMFImpl<V, E> extends MaximumFlowAlgorithmBase<V, E> {
   private static final boolean DIAGNOSTIC_ENABLED = false;
   public static boolean USE_GLOBAL_RELABELING_HEURISTIC = true;
   public static boolean USE_GAP_RELABELING_HEURISTIC = true;
   private final ExtensionFactory<PushRelabelMFImpl<V, E>.VertexExtension> vertexExtensionsFactory = () -> new PushRelabelMFImpl.VertexExtension();
   private final ExtensionFactory<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> edgeExtensionsFactory = () -> new MaximumFlowAlgorithmBase.AnnotatedFlowEdge(
      
   );
   private int[] countHeight;
   private Queue<PushRelabelMFImpl<V, E>.VertexExtension> activeVertices;
   private PushRelabelMFImpl<V, E>.PushRelabelDiagnostic diagnostic;
   private final int N;
   private final PushRelabelMFImpl<V, E>.VertexExtension[] vertexExtension;
   private int relabelCounter;
   private static ToleranceDoubleComparator comparator = new ToleranceDoubleComparator();

   public PushRelabelMFImpl(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public PushRelabelMFImpl(Graph<V, E> var1, double var2) {
      super(var1, var2);
      this.N = var1.vertexSet().size();
      this.vertexExtension = (PushRelabelMFImpl.VertexExtension[])Array.newInstance(PushRelabelMFImpl.VertexExtension.class, this.N);
   }

   private void enqueue(PushRelabelMFImpl<V, E>.VertexExtension var1) {
      if (!var1.active && var1.hasExcess()) {
         var1.active = true;
         this.activeVertices.add(var1);
      }
   }

   void init(V var1, V var2) {
      super.init((V)var1, (V)var2, this.vertexExtensionsFactory, this.edgeExtensionsFactory);
      this.countHeight = new int[2 * this.N + 1];
      int var3 = 0;

      for (Object var5 : this.network.vertexSet()) {
         PushRelabelMFImpl.VertexExtension var6 = this.getVertexExtension((V)var5);
         var6.id = var3;
         this.vertexExtension[var3] = var6;
         var3++;
      }
   }

   public void initialize(
      PushRelabelMFImpl<V, E>.VertexExtension var1, PushRelabelMFImpl<V, E>.VertexExtension var2, Queue<PushRelabelMFImpl<V, E>.VertexExtension> var3
   ) {
      this.activeVertices = var3;

      for (int var4 = 0; var4 < this.N; var4++) {
         this.vertexExtension[var4].excess = 0.0;
         this.vertexExtension[var4].height = 0;
         this.vertexExtension[var4].active = false;
         this.vertexExtension[var4].currentArc = 0;
      }

      var1.height = this.N;
      var1.active = true;
      var2.active = true;
      this.countHeight[this.N] = 1;
      this.countHeight[0] = this.N - 1;

      for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 : var1.getOutgoing()) {
         var1.excess = var1.excess + var5.capacity;
         this.push(var5);
      }

      if (USE_GLOBAL_RELABELING_HEURISTIC) {
         this.recomputeHeightsHeuristic();
         this.relabelCounter = 0;
      }
   }

   @Override
   public MaximumFlowAlgorithm.MaximumFlow<E> getMaximumFlow(V var1, V var2) {
      this.calculateMaximumFlow((V)var1, (V)var2);
      this.maxFlow = this.composeFlow();
      return new MaximumFlowAlgorithm.MaximumFlowImpl<>(this.maxFlowValue, this.maxFlow);
   }

   public double calculateMaximumFlow(V var1, V var2) {
      this.init((V)var1, (V)var2);
      this.activeVertices = new ArrayDeque<>(this.N);
      this.initialize(this.getVertexExtension((V)var1), this.getVertexExtension((V)var2), this.activeVertices);

      while (!this.activeVertices.isEmpty()) {
         PushRelabelMFImpl.VertexExtension var3 = this.activeVertices.poll();
         var3.active = false;
         this.discharge(var3);
      }

      for (Object var4 : this.network.edgesOf((V)var2)) {
         MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 = this.edgeExtensionManager.getExtension((E)var4);
         this.maxFlowValue = this.maxFlowValue + (this.directedGraph ? var5.flow : var5.flow + var5.getInverse().flow);
      }

      return this.maxFlowValue;
   }

   @Override
   protected void pushFlowThrough(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1, double var2) {
      var1.getSource().excess -= var2;
      var1.getTarget().excess += var2;
      assert var1.getSource().excess >= 0.0 && var1.getTarget().excess >= 0.0;
      super.pushFlowThrough(var1, var2);
   }

   private void push(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1) {
      PushRelabelMFImpl.VertexExtension var2 = var1.getSource();
      PushRelabelMFImpl.VertexExtension var3 = var1.getTarget();
      double var4 = Math.min(var2.excess, var1.capacity - var1.flow);
      if (var2.height > var3.height && comparator.compare(var4, 0.0) > 0) {
         this.pushFlowThrough(var1, var4);
         this.enqueue(var3);
      }
   }

   private void gapHeuristic(int var1) {
      for (int var2 = 0; var2 < this.N; var2++) {
         if (var1 < this.vertexExtension[var2].height && this.vertexExtension[var2].height < this.N) {
            this.countHeight[this.vertexExtension[var2].height]--;
            this.vertexExtension[var2].height = Math.max(this.vertexExtension[var2].height, this.N + 1);
            this.countHeight[this.vertexExtension[var2].height]++;
         }
      }
   }

   private void relabel(PushRelabelMFImpl<V, E>.VertexExtension var1) {
      int var2 = var1.height;
      this.countHeight[var1.height]--;
      var1.height = 2 * this.N;

      for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var4 : var1.getOutgoing()) {
         if (var4.hasCapacity()) {
            var1.height = Math.min(var1.height, var4.getTarget().height + 1);
         }
      }

      this.countHeight[var1.height]++;
      if (USE_GAP_RELABELING_HEURISTIC && 0 < var2 && var2 < this.N && this.countHeight[var2] == 0) {
         this.gapHeuristic(var2);
      }
   }

   private void bfs(Queue<Integer> var1, boolean[] var2) {
      while (!var1.isEmpty()) {
         int var3 = (Integer)var1.poll();

         for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 : this.vertexExtension[var3].getOutgoing()) {
            PushRelabelMFImpl.VertexExtension var6 = var5.getTarget();
            if (!var2[var6.id] && var5.getInverse().hasCapacity()) {
               var6.height = this.vertexExtension[var3].height + 1;
               var2[var6.id] = true;
               var1.add(var6.id);
            }
         }
      }
   }

   private void recomputeHeightsHeuristic() {
      Arrays.fill(this.countHeight, 0);
      ArrayDeque var1 = new ArrayDeque(this.N);
      boolean[] var2 = new boolean[this.N];

      for (int var3 = 0; var3 < this.N; var3++) {
         this.vertexExtension[var3].height = 2 * this.N;
      }

      int var6 = this.getVertexExtension(this.getCurrentSink()).id;
      int var4 = this.getVertexExtension(this.getCurrentSource()).id;
      this.vertexExtension[var4].height = this.N;
      var2[var4] = true;
      this.vertexExtension[var6].height = 0;
      var2[var6] = true;
      var1.add(var6);
      this.bfs(var1, var2);
      var1.add(var4);
      this.bfs(var1, var2);

      for (int var5 = 0; var5 < this.N; var5++) {
         this.countHeight[this.vertexExtension[var5].height]++;
      }
   }

   private void discharge(PushRelabelMFImpl<V, E>.VertexExtension var1) {
      while (var1.hasExcess()) {
         if (var1.currentArc < var1.getOutgoing().size()) {
            MaximumFlowAlgorithmBase.AnnotatedFlowEdge var3 = (MaximumFlowAlgorithmBase.AnnotatedFlowEdge)var1.getOutgoing().get(var1.currentArc);
            if (this.isAdmissible(var3)) {
               this.push(var3);
            } else {
               var1.currentArc++;
            }
         } else {
            this.relabel(var1);
            if (USE_GLOBAL_RELABELING_HEURISTIC && ++this.relabelCounter == this.N) {
               this.recomputeHeightsHeuristic();

               for (int var2 = 0; var2 < this.N; var2++) {
                  this.vertexExtension[var2].currentArc = 0;
               }

               this.relabelCounter = 0;
            }

            var1.currentArc = 0;
         }
      }
   }

   private boolean isAdmissible(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1) {
      return var1.hasCapacity() && var1.getSource().height == var1.getTarget().height + 1;
   }

   private PushRelabelMFImpl<V, E>.VertexExtension getVertexExtension(V var1) {
      assert this.vertexExtensionManager != null;
      return (PushRelabelMFImpl.VertexExtension)this.vertexExtensionManager.getExtension((V)var1);
   }

   private class PushRelabelDiagnostic {
      Map<Pair<V, V>, Integer> discharges = new HashMap<>();
      long dischargesCounter = 0L;
      Map<Pair<Integer, Integer>, Integer> relabels = new HashMap<>();
      long relabelsCounter = 0L;

      private void incrementDischarges(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1) {
         Pair var2 = Pair.of(var1.getSource().prototype, var1.getTarget().prototype);
         if (!this.discharges.containsKey(var2)) {
            this.discharges.put(var2, 0);
         }

         this.discharges.put(var2, this.discharges.get(var2) + 1);
         this.dischargesCounter++;
      }

      private void incrementRelabels(int var1, int var2) {
         Pair var3 = Pair.of(var1, var2);
         if (!this.relabels.containsKey(var3)) {
            this.relabels.put(var3, 0);
         }

         this.relabels.put(var3, this.relabels.get(var3) + 1);
         this.relabelsCounter++;
      }

      void dump() {
         HashMap var1 = new HashMap();

         for (Object var3 : PushRelabelMFImpl.this.network.vertexSet()) {
            PushRelabelMFImpl.VertexExtension var4 = PushRelabelMFImpl.this.getVertexExtension((V)var3);
            if (!var1.containsKey(var4.height)) {
               var1.put(var4.height, 0);
            }

            var1.put(var4.height, (Integer)var1.get(var4.height) + 1);
         }

         System.out.println("LABELS  ");
         System.out.println("------  ");
         System.out.println(var1);
         ArrayList var5 = new ArrayList<>(this.relabels.entrySet());
         var5.sort((var0, var1x) -> -((Integer)var0.getValue() - (Integer)var1x.getValue()));
         System.out.println("RELABELS    ");
         System.out.println("--------    ");
         System.out.println("    Count:  " + this.relabelsCounter);
         System.out.println("            " + var5);
         ArrayList var6 = new ArrayList<>(this.discharges.entrySet());
         var6.sort((var0, var1x) -> -((Integer)var0.getValue() - (Integer)var1x.getValue()));
         System.out.println("DISCHARGES  ");
         System.out.println("----------  ");
         System.out.println("    Count:  " + this.dischargesCounter);
         System.out.println("            " + var6);
      }
   }

   public class VertexExtension extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase {
      private int id;
      private int height;
      private boolean active;
      private int currentArc;

      private boolean hasExcess() {
         return PushRelabelMFImpl.comparator.compare(this.excess, 0.0) > 0;
      }

      @Override
      public String toString() {
         return this.prototype.toString() + String.format(" { HGT: %d } ", this.height);
      }
   }
}
