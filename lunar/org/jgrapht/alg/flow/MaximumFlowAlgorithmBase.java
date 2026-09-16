package org.jgrapht.alg.flow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MaximumFlowAlgorithm;
import org.jgrapht.alg.interfaces.MinimumSTCutAlgorithm;
import org.jgrapht.alg.util.ToleranceDoubleComparator;
import org.jgrapht.alg.util.extension.Extension;
import org.jgrapht.alg.util.extension.ExtensionFactory;
import org.jgrapht.alg.util.extension.ExtensionManager;
import org.jgrapht.util.TypeUtil;

public abstract class MaximumFlowAlgorithmBase<V, E> implements MaximumFlowAlgorithm<V, E>, MinimumSTCutAlgorithm<V, E> {
   public static final double DEFAULT_EPSILON = 1.0E-9;
   protected Graph<V, E> network;
   protected final boolean directedGraph;
   protected Comparator<Double> comparator;
   protected ExtensionManager<V, ? extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase> vertexExtensionManager;
   protected ExtensionManager<E, ? extends MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> edgeExtensionManager;
   protected V source = (V)null;
   protected V sink = (V)null;
   protected double maxFlowValue = -1.0;
   protected Map<E, Double> maxFlow = null;
   protected Set<V> sourcePartition;
   protected Set<V> sinkPartition;
   protected Set<E> cutEdges;

   public MaximumFlowAlgorithmBase(Graph<V, E> var1, double var2) {
      this.network = var1;
      this.directedGraph = var1.getType().isDirected();
      this.comparator = new ToleranceDoubleComparator(var2);
   }

   protected <VE extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase> void init(
      V var1, V var2, ExtensionFactory<VE> var3, ExtensionFactory<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> var4
   ) {
      this.vertexExtensionManager = new ExtensionManager<>(var3);
      this.edgeExtensionManager = new ExtensionManager<>(var4);
      this.buildInternal();
      this.source = (V)var1;
      this.sink = (V)var2;
      this.maxFlowValue = 0.0;
      this.maxFlow = null;
      this.sourcePartition = null;
      this.sinkPartition = null;
      this.cutEdges = null;
   }

   private void buildInternal() {
      if (this.directedGraph) {
         for (Object var2 : this.network.vertexSet()) {
            MaximumFlowAlgorithmBase.VertexExtensionBase var3 = this.vertexExtensionManager.getExtension((V)var2);
            var3.prototype = (V)var2;
         }

         for (Object var13 : this.network.vertexSet()) {
            MaximumFlowAlgorithmBase.VertexExtensionBase var16 = this.vertexExtensionManager.getExtension((V)var13);

            for (Object var5 : this.network.outgoingEdgesOf((V)var13)) {
               Object var6 = this.network.getEdgeTarget((E)var5);
               MaximumFlowAlgorithmBase.VertexExtensionBase var7 = this.vertexExtensionManager.getExtension((V)var6);
               MaximumFlowAlgorithmBase.AnnotatedFlowEdge var8 = this.createEdge(var16, var7, (E)var5, this.network.getEdgeWeight((E)var5));
               MaximumFlowAlgorithmBase.AnnotatedFlowEdge var9 = this.createBackwardEdge(var8);
               var16.getOutgoing().add(var8);
               if (var9.prototype == null) {
                  var7.getOutgoing().add(var9);
               }
            }
         }
      } else {
         for (Object var14 : this.network.vertexSet()) {
            MaximumFlowAlgorithmBase.VertexExtensionBase var17 = this.vertexExtensionManager.getExtension((V)var14);
            var17.prototype = (V)var14;
         }

         for (Object var15 : this.network.edgeSet()) {
            MaximumFlowAlgorithmBase.VertexExtensionBase var18 = this.vertexExtensionManager.getExtension(this.network.getEdgeSource((E)var15));
            MaximumFlowAlgorithmBase.VertexExtensionBase var19 = this.vertexExtensionManager.getExtension(this.network.getEdgeTarget((E)var15));
            MaximumFlowAlgorithmBase.AnnotatedFlowEdge var20 = this.createEdge(var18, var19, (E)var15, this.network.getEdgeWeight((E)var15));
            MaximumFlowAlgorithmBase.AnnotatedFlowEdge var21 = this.createBackwardEdge(var20);
            var18.getOutgoing().add(var20);
            var19.getOutgoing().add(var21);
         }
      }
   }

   private MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge createEdge(
      MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase var1, MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase var2, E var3, double var4
   ) {
      MaximumFlowAlgorithmBase.AnnotatedFlowEdge var6 = this.edgeExtensionManager.getExtension((E)var3);
      var6.source = var1;
      var6.target = var2;
      var6.capacity = var4;
      var6.prototype = (E)var3;
      return var6;
   }

   private MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge createBackwardEdge(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1) {
      Object var3 = this.network.getEdge(var1.target.prototype, var1.source.prototype);
      MaximumFlowAlgorithmBase.AnnotatedFlowEdge var2;
      if (this.directedGraph && var3 != null) {
         var2 = this.createEdge(var1.target, var1.source, (E)var3, this.network.getEdgeWeight((E)var3));
      } else {
         var2 = this.edgeExtensionManager.createExtension();
         var2.source = var1.target;
         var2.target = var1.source;
         if (!this.directedGraph) {
            var2.capacity = this.network.getEdgeWeight((E)var3);
            var2.prototype = (E)var3;
         }
      }

      var1.inverse = var2;
      var2.inverse = var1;
      return var2;
   }

   protected void pushFlowThrough(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1, double var2) {
      MaximumFlowAlgorithmBase.AnnotatedFlowEdge var4 = var1.getInverse();
      assert this.comparator.compare(var1.flow, 0.0) == 0 || this.comparator.compare(var4.flow, 0.0) == 0;
      if (this.comparator.compare(var4.flow, var2) < 0) {
         double var5 = var2 - var4.flow;
         var1.flow += var5;
         var1.capacity = var1.capacity - var4.flow;
         var4.flow = 0.0;
         var4.capacity += var5;
      } else {
         var1.capacity -= var2;
         var4.flow -= var2;
      }
   }

   protected Map<E, Double> composeFlow() {
      HashMap var1 = new HashMap();

      for (Object var3 : this.network.edgeSet()) {
         MaximumFlowAlgorithmBase.AnnotatedFlowEdge var4 = this.edgeExtensionManager.getExtension((E)var3);
         var1.put(var3, this.directedGraph ? var4.flow : Math.max(var4.flow, var4.inverse.flow));
      }

      return var1;
   }

   public V getCurrentSource() {
      return this.source;
   }

   public V getCurrentSink() {
      return this.sink;
   }

   public double getMaximumFlowValue() {
      return this.maxFlowValue;
   }

   @Override
   public Map<E, Double> getFlowMap() {
      if (this.maxFlow == null) {
         this.maxFlow = this.composeFlow();
      }

      return this.maxFlow;
   }

   @Override
   public V getFlowDirection(E var1) {
      if (!this.network.containsEdge((E)var1)) {
         throw new IllegalArgumentException("Cannot query the flow on an edge which does not exist in the input graph!");
      }

      MaximumFlowAlgorithmBase.AnnotatedFlowEdge var2 = this.edgeExtensionManager.getExtension((E)var1);
      if (this.directedGraph) {
         return var2.getTarget().prototype;
      }

      MaximumFlowAlgorithmBase.AnnotatedFlowEdge var3 = var2.getInverse();
      return var2.flow > var3.flow ? var2.getTarget().prototype : var3.getTarget().prototype;
   }

   @Override
   public double calculateMinCut(V var1, V var2) {
      return this.getMaximumFlowValue((V)var1, (V)var2);
   }

   @Override
   public double getCutCapacity() {
      return this.getMaximumFlowValue();
   }

   @Override
   public Set<V> getSourcePartition() {
      if (this.sourcePartition == null) {
         this.calculateSourcePartition();
      }

      return this.sourcePartition;
   }

   @Override
   public Set<V> getSinkPartition() {
      if (this.sinkPartition == null) {
         this.sinkPartition = new LinkedHashSet<>(this.network.vertexSet());
         this.sinkPartition.removeAll(this.getSourcePartition());
      }

      return this.sinkPartition;
   }

   @Override
   public Set<E> getCutEdges() {
      if (this.cutEdges != null) {
         return this.cutEdges;
      }

      this.cutEdges = new LinkedHashSet<>();
      Set var1 = this.getSourcePartition();
      if (this.directedGraph) {
         for (Object var3 : var1) {
            this.cutEdges
               .addAll(
                  this.network
                     .outgoingEdgesOf((V)var3)
                     .stream()
                     .filter(var2 -> !var1.contains(this.network.getEdgeTarget((E)var2)))
                     .collect(Collectors.toList())
               );
         }
      } else {
         this.cutEdges
            .addAll(
               this.network
                  .edgeSet()
                  .stream()
                  .filter(var2 -> var1.contains(this.network.getEdgeSource((E)var2)) ^ var1.contains(this.network.getEdgeTarget((E)var2)))
                  .collect(Collectors.toList())
            );
      }

      return this.cutEdges;
   }

   protected void calculateSourcePartition() {
      this.sourcePartition = new LinkedHashSet();
      ArrayDeque var1 = new ArrayDeque();
      var1.add(this.vertexExtensionManager.getExtension(this.getCurrentSource()));

      while (!var1.isEmpty()) {
         MaximumFlowAlgorithmBase.VertexExtensionBase var2 = (MaximumFlowAlgorithmBase.VertexExtensionBase)var1.poll();
         if (!this.sourcePartition.contains(var2.prototype)) {
            this.sourcePartition.add(var2.prototype);

            for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var4 : var2.getOutgoing()) {
               if (var4.hasCapacity()) {
                  var1.add(var4.getTarget());
               }
            }
         }
      }
   }

   class AnnotatedFlowEdge implements Extension {
      private MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase source;
      private MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase target;
      private MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge inverse;
      E prototype;
      double capacity;
      double flow;

      public <VE extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase> VE getSource() {
         return TypeUtil.uncheckedCast(this.source);
      }

      public void setSource(MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase var1) {
         this.source = var1;
      }

      public <VE extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase> VE getTarget() {
         return TypeUtil.uncheckedCast(this.target);
      }

      public void setTarget(MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase var1) {
         this.target = var1;
      }

      public MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge getInverse() {
         return this.inverse;
      }

      public boolean hasCapacity() {
         return MaximumFlowAlgorithmBase.this.comparator.compare(this.capacity, this.flow) > 0;
      }

      public double getResidualCapacity() {
         return this.capacity - this.flow;
      }

      @Override
      public String toString() {
         return "("
            + (this.source == null ? null : this.source.prototype)
            + ","
            + (this.target == null ? null : this.target.prototype)
            + ",c:"
            + this.capacity
            + " f: "
            + this.flow
            + ")";
      }
   }

   class VertexExtensionBase implements Extension {
      private final List<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> outgoing = new ArrayList<>();
      V prototype;
      double excess;

      public List<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> getOutgoing() {
         return this.outgoing;
      }
   }
}
