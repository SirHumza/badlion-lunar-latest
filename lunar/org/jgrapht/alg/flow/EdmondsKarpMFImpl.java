package org.jgrapht.alg.flow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MaximumFlowAlgorithm;
import org.jgrapht.alg.util.extension.ExtensionFactory;

public final class EdmondsKarpMFImpl<V, E> extends MaximumFlowAlgorithmBase<V, E> {
   private EdmondsKarpMFImpl<V, E>.VertexExtension currentSource;
   private EdmondsKarpMFImpl<V, E>.VertexExtension currentSink;
   private final ExtensionFactory<EdmondsKarpMFImpl<V, E>.VertexExtension> vertexExtensionsFactory = () -> new EdmondsKarpMFImpl.VertexExtension();
   private final ExtensionFactory<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> edgeExtensionsFactory = () -> new MaximumFlowAlgorithmBase.AnnotatedFlowEdge(
      
   );

   public EdmondsKarpMFImpl(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public EdmondsKarpMFImpl(Graph<V, E> var1, double var2) {
      super(var1, var2);
      if (var1 == null) {
         throw new NullPointerException("network is null");
      }

      if (var2 <= 0.0) {
         throw new IllegalArgumentException("invalid epsilon (must be positive)");
      }

      for (Object var5 : var1.edgeSet()) {
         if (var1.getEdgeWeight(var5) < -var2) {
            throw new IllegalArgumentException("invalid capacity (must be non-negative)");
         }
      }
   }

   @Override
   public MaximumFlowAlgorithm.MaximumFlow<E> getMaximumFlow(V var1, V var2) {
      this.calculateMaximumFlow((V)var1, (V)var2);
      this.maxFlow = this.composeFlow();
      return new MaximumFlowAlgorithm.MaximumFlowImpl<>(this.maxFlowValue, this.maxFlow);
   }

   public double calculateMaximumFlow(V var1, V var2) {
      super.init((V)var1, (V)var2, this.vertexExtensionsFactory, this.edgeExtensionsFactory);
      if (!this.network.containsVertex((V)var1)) {
         throw new IllegalArgumentException("invalid source (null or not from this network)");
      }

      if (!this.network.containsVertex((V)var2)) {
         throw new IllegalArgumentException("invalid sink (null or not from this network)");
      }

      if (var1.equals(var2)) {
         throw new IllegalArgumentException("source is equal to sink");
      }

      this.currentSource = this.getVertexExtension((V)var1);
      this.currentSink = this.getVertexExtension((V)var2);

      while (true) {
         this.breadthFirstSearch();
         if (!this.currentSink.visited) {
            return this.maxFlowValue;
         }

         this.maxFlowValue = this.maxFlowValue + this.augmentFlow();
      }
   }

   private void breadthFirstSearch() {
      for (Object var2 : this.network.vertexSet()) {
         this.getVertexExtension((V)var2).visited = false;
         this.getVertexExtension((V)var2).lastArcs = null;
      }

      ArrayDeque var7 = new ArrayDeque();
      var7.offer(this.currentSource);
      this.currentSource.visited = true;
      this.currentSource.excess = Double.POSITIVE_INFINITY;
      this.currentSink.excess = 0.0;
      boolean var8 = false;

      while (var7.size() != 0) {
         EdmondsKarpMFImpl.VertexExtension var3 = (EdmondsKarpMFImpl.VertexExtension)var7.poll();

         for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 : var3.getOutgoing()) {
            if (this.comparator.compare(var5.flow, var5.capacity) < 0) {
               EdmondsKarpMFImpl.VertexExtension var6 = var5.getTarget();
               if (var6 == this.currentSink) {
                  var6.visited = true;
                  if (var6.lastArcs == null) {
                     var6.lastArcs = new ArrayList<>();
                  }

                  var6.lastArcs.add(var5);
                  var6.excess = var6.excess + Math.min(var3.excess, var5.capacity - var5.flow);
                  var8 = true;
               } else if (!var6.visited) {
                  var6.visited = true;
                  var6.excess = Math.min(var3.excess, var5.capacity - var5.flow);
                  var6.lastArcs = Collections.singletonList(var5);
                  if (!var8) {
                     var7.add(var6);
                  }
               }
            }
         }
      }
   }

   private double augmentFlow() {
      double var1 = 0.0;
      HashSet var3 = new HashSet();

      for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 : this.currentSink.lastArcs) {
         double var6 = Math.min(var5.getSource().excess, var5.capacity - var5.flow);
         if (this.augmentFlowAlongInternal(var6, var5.getSource(), var3)) {
            this.pushFlowThrough(var5, var6);
            var1 += var6;
         }
      }

      return var1;
   }

   private boolean augmentFlowAlongInternal(double var1, EdmondsKarpMFImpl<V, E>.VertexExtension var3, Set<EdmondsKarpMFImpl<V, E>.VertexExtension> var4) {
      if (var3 == this.currentSource) {
         return true;
      } else if (var4.contains(var3)) {
         return false;
      } else {
         var4.add(var3);
         MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 = var3.lastArcs.get(0);
         if (this.augmentFlowAlongInternal(var1, var5.getSource(), var4)) {
            this.pushFlowThrough(var5, var1);
            return true;
         } else {
            return false;
         }
      }
   }

   private EdmondsKarpMFImpl<V, E>.VertexExtension getVertexExtension(V var1) {
      return (EdmondsKarpMFImpl.VertexExtension)this.vertexExtensionManager.getExtension((V)var1);
   }

   class VertexExtension extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase {
      boolean visited;
      List<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> lastArcs;
   }
}
