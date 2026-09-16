package org.jgrapht.alg.flow;

import java.util.ArrayDeque;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MaximumFlowAlgorithm;
import org.jgrapht.alg.util.extension.ExtensionFactory;

public class DinicMFImpl<V, E> extends MaximumFlowAlgorithmBase<V, E> {
   private DinicMFImpl<V, E>.VertexExtension currentSource;
   private DinicMFImpl<V, E>.VertexExtension currentSink;
   private final ExtensionFactory<DinicMFImpl<V, E>.VertexExtension> vertexExtensionsFactory = () -> new DinicMFImpl.VertexExtension();
   private final ExtensionFactory<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> edgeExtensionsFactory = () -> new MaximumFlowAlgorithmBase.AnnotatedFlowEdge(
      
   );

   public DinicMFImpl(Graph<V, E> var1, double var2) {
      super(var1, var2);
      if (var2 <= 0.0) {
         throw new IllegalArgumentException("Epsilon must be positive!");
      }

      for (Object var5 : var1.edgeSet()) {
         if (var1.getEdgeWeight(var5) < -var2) {
            throw new IllegalArgumentException("Capacity must be non-negative!");
         }
      }
   }

   public DinicMFImpl(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   @Override
   public MaximumFlowAlgorithm.MaximumFlow<E> getMaximumFlow(V var1, V var2) {
      this.calculateMaxFlow((V)var1, (V)var2);
      this.maxFlow = this.composeFlow();
      return new MaximumFlowAlgorithm.MaximumFlowImpl<>(this.maxFlowValue, this.maxFlow);
   }

   private double calculateMaxFlow(V var1, V var2) {
      super.init((V)var1, (V)var2, this.vertexExtensionsFactory, this.edgeExtensionsFactory);
      if (!this.network.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Network does not contain source!");
      }

      if (!this.network.containsVertex((V)var2)) {
         throw new IllegalArgumentException("Network does not contain sink!");
      }

      if (var1.equals(var2)) {
         throw new IllegalArgumentException("Source is equal to sink!");
      }

      this.currentSource = this.getVertexExtension((V)var1);
      this.currentSink = this.getVertexExtension((V)var2);
      this.dinic();
      return this.maxFlowValue;
   }

   private boolean bfs() {
      for (Object var2 : this.network.vertexSet()) {
         this.getVertexExtension((V)var2).level = -1;
      }

      ArrayDeque var6 = new ArrayDeque();
      var6.offer(this.currentSource);
      this.currentSource.level = 0;

      while (!var6.isEmpty() && this.currentSink.level == -1) {
         DinicMFImpl.VertexExtension var7 = (DinicMFImpl.VertexExtension)var6.poll();

         for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var4 : var7.getOutgoing()) {
            DinicMFImpl.VertexExtension var5 = var4.getTarget();
            if (this.comparator.compare(var4.flow, var4.capacity) < 0 && var5.level == -1) {
               var5.level = var7.level + 1;
               var6.offer(var5);
            }
         }
      }

      return this.currentSink.level != -1;
   }

   public double dfs(DinicMFImpl<V, E>.VertexExtension var1, double var2) {
      if (this.comparator.compare(0.0, var2) == 0) {
         return var2;
      }

      if (var1.equals(this.currentSink)) {
         return var2;
      }

      for (; var1.index < var1.getOutgoing().size(); var1.index++) {
         MaximumFlowAlgorithmBase.AnnotatedFlowEdge var6 = var1.getOutgoing().get(var1.index);
         DinicMFImpl.VertexExtension var7 = var6.getTarget();
         if (this.comparator.compare(var6.flow, var6.capacity) < 0 && var7.level == var1.level + 1) {
            double var4 = this.dfs(var7, Math.min(var2, var6.capacity - var6.flow));
            if (this.comparator.compare(var4, 0.0) != 0) {
               this.pushFlowThrough(var6, var4);
               return var4;
            }
         }
      }

      return 0.0;
   }

   public void dinic() {
      while (this.bfs()) {
         for (Object var2 : this.network.vertexSet()) {
            this.getVertexExtension((V)var2).index = 0;
         }

         while (true) {
            double var3 = this.dfs(this.currentSource, Double.POSITIVE_INFINITY);
            if (var3 == 0.0) {
               break;
            }

            this.maxFlowValue += var3;
         }
      }
   }

   private DinicMFImpl<V, E>.VertexExtension getVertexExtension(V var1) {
      return (DinicMFImpl.VertexExtension)this.vertexExtensionManager.getExtension((V)var1);
   }

   class VertexExtension extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase {
      int index;
      int level;
   }
}
