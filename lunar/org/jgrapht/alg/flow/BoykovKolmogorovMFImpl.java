package org.jgrapht.alg.flow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MaximumFlowAlgorithm;
import org.jgrapht.alg.util.extension.ExtensionFactory;

public class BoykovKolmogorovMFImpl<V, E> extends MaximumFlowAlgorithmBase<V, E> {
   private static final boolean DEBUG = false;
   private static final long FREE_NODE_TIMESTAMP = 0L;
   private static final long INITIAL_TIMESTAMP = 1L;
   private long currentTimestamp;
   private final ExtensionFactory<BoykovKolmogorovMFImpl<V, E>.VertexExtension> vertexExtensionsFactory = () -> new BoykovKolmogorovMFImpl.VertexExtension();
   private final ExtensionFactory<MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge> edgeExtensionsFactory = () -> new MaximumFlowAlgorithmBase.AnnotatedFlowEdge(
      
   );
   private BoykovKolmogorovMFImpl<V, E>.VertexExtension currentSource;
   private BoykovKolmogorovMFImpl<V, E>.VertexExtension currentSink;
   private final Deque<BoykovKolmogorovMFImpl<V, E>.VertexExtension> activeVertices = new ArrayDeque<>();
   private final List<BoykovKolmogorovMFImpl<V, E>.VertexExtension> orphans = new ArrayList<>();
   private final Deque<BoykovKolmogorovMFImpl<V, E>.VertexExtension> childOrphans = new ArrayDeque<>();

   public BoykovKolmogorovMFImpl(Graph<V, E> var1) {
      this(var1, 1.0E-9);
   }

   public BoykovKolmogorovMFImpl(Graph<V, E> var1, double var2) {
      super(Objects.requireNonNull(var1, "Network must be not null!"), var2);
   }

   @Override
   public MaximumFlowAlgorithm.MaximumFlow<E> getMaximumFlow(V var1, V var2) {
      this.calculateMaximumFlow((V)var1, (V)var2);
      this.maxFlow = this.composeFlow();
      return new MaximumFlowAlgorithm.MaximumFlowImpl<>(this.maxFlowValue, this.maxFlow);
   }

   private void calculateMaximumFlow(V var1, V var2) {
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
      this.currentTimestamp = 1L;
      this.augmentShortPaths(this.currentSource, this.currentSink);
      this.currentSource.treeStatus = BoykovKolmogorovMFImpl.VertexTreeStatus.SOURCE_TREE_VERTEX;
      this.currentSink.treeStatus = BoykovKolmogorovMFImpl.VertexTreeStatus.SINK_TREE_VERTEX;
      this.makeActive(this.currentSource);
      this.makeActive(this.currentSink);

      while (true) {
         MaximumFlowAlgorithmBase.AnnotatedFlowEdge var3 = this.grow();
         if (var3 == null) {
            return;
         }

         this.augment(var3);
         this.nextIteration();
         this.adopt();
      }
   }

   private void augmentShortPaths(BoykovKolmogorovMFImpl<V, E>.VertexExtension var1, BoykovKolmogorovMFImpl<V, E>.VertexExtension var2) {
      for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var4 : var1.getOutgoing()) {
         BoykovKolmogorovMFImpl.VertexExtension var5 = var4.getTarget();
         if (var5 == var2) {
            double var11 = var4.getResidualCapacity();
            this.pushFlowThrough(var4, var11);
            this.maxFlowValue += var11;
         } else {
            for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var7 : var5.getOutgoing()) {
               BoykovKolmogorovMFImpl.VertexExtension var8 = var7.getTarget();
               if (var8 == var2) {
                  double var9 = Math.min(var4.getResidualCapacity(), var7.getResidualCapacity());
                  this.pushFlowThrough(var4, var9);
                  this.pushFlowThrough(var7, var9);
                  this.maxFlowValue += var9;
               }

               if (!var4.hasCapacity()) {
                  break;
               }
            }
         }
      }
   }

   private MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge grow() {
      for (BoykovKolmogorovMFImpl.VertexExtension var1 = this.nextActiveVertex(); var1 != null; var1 = this.nextActiveVertex()) {
         if (var1.isSourceTreeVertex()) {
            for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var6 : var1.getOutgoing()) {
               if (var6.hasCapacity()) {
                  BoykovKolmogorovMFImpl.VertexExtension var7 = var6.getTarget();
                  if (var7.isSinkTreeVertex()) {
                     return var6;
                  }

                  if (var7.isFreeVertex()) {
                     var7.parentEdge = var6;
                     var7.treeStatus = BoykovKolmogorovMFImpl.VertexTreeStatus.SOURCE_TREE_VERTEX;
                     var7.distance = var1.distance + 1;
                     var7.timestamp = var1.timestamp;
                     this.makeActive(var7);
                  } else {
                     assert var7.isSourceTreeVertex();
                     if (this.isCloserToTerminal(var1, var7)) {
                        var7.parentEdge = var6;
                        var7.distance = var1.distance + 1;
                        var7.timestamp = var1.timestamp;
                     }
                  }
               }
            }
         } else {
            assert var1.isSinkTreeVertex();

            for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var3 : var1.getOutgoing()) {
               if (var3.hasCapacity()) {
                  BoykovKolmogorovMFImpl.VertexExtension var4 = var3.getSource();
                  if (var4.isSourceTreeVertex()) {
                     return var3;
                  }

                  if (var4.isFreeVertex()) {
                     var4.parentEdge = var3;
                     var4.treeStatus = BoykovKolmogorovMFImpl.VertexTreeStatus.SINK_TREE_VERTEX;
                     var4.distance = var1.distance + 1;
                     var4.timestamp = var1.timestamp;
                     this.makeActive(var4);
                  } else {
                     assert var4.isSinkTreeVertex();
                     if (this.isCloserToTerminal(var1, var4)) {
                        var4.parentEdge = var3;
                        var4.distance = var1.distance + 1;
                        var4.timestamp = var1.timestamp;
                     }
                  }
               }
            }
         }

         this.finishVertex(var1);
      }

      return null;
   }

   private void augment(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1) {
      double var2 = this.findBottleneck(var1);
      this.pushFlowThrough(var1, var2);
      BoykovKolmogorovMFImpl.VertexExtension var4 = var1.getSource();

      while (var4 != this.currentSource) {
         MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 = var4.parentEdge;
         this.pushFlowThrough(var5, var2);
         if (!var5.hasCapacity()) {
            var4.makeOrphan();
            this.orphans.add(var4);
         }

         var4 = var5.getSource();
      }

      BoykovKolmogorovMFImpl.VertexExtension var7 = var1.getTarget();

      while (var7 != this.currentSink) {
         MaximumFlowAlgorithmBase.AnnotatedFlowEdge var6 = var7.parentEdge;
         this.pushFlowThrough(var7.parentEdge, var2);
         if (!var6.hasCapacity()) {
            var7.makeOrphan();
            this.orphans.add(var7);
         }

         var7 = var6.getTarget();
      }

      this.maxFlowValue += var2;
   }

   private double findBottleneck(MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge var1) {
      double var2 = var1.getResidualCapacity();

      for (BoykovKolmogorovMFImpl.VertexExtension var4 = var1.getSource(); var4 != this.currentSource; var4 = var4.parentEdge.getSource()) {
         var2 = Math.min(var2, var4.parentEdge.getResidualCapacity());
      }

      for (BoykovKolmogorovMFImpl.VertexExtension var5 = var1.getTarget(); var5 != this.currentSink; var5 = var5.parentEdge.getTarget()) {
         var2 = Math.min(var2, var5.parentEdge.getResidualCapacity());
      }

      return var2;
   }

   private void adopt() {
      while (!this.orphans.isEmpty() || !this.childOrphans.isEmpty()) {
         BoykovKolmogorovMFImpl.VertexExtension var1;
         if (this.childOrphans.isEmpty()) {
            var1 = this.orphans.get(this.orphans.size() - 1);
            this.orphans.remove(this.orphans.size() - 1);
         } else {
            var1 = this.childOrphans.removeLast();
         }

         if (var1.isSourceTreeVertex()) {
            MaximumFlowAlgorithmBase.AnnotatedFlowEdge var7 = null;
            int var8 = Integer.MAX_VALUE;

            for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var13 : var1.getOutgoing()) {
               if (var13.getInverse().hasCapacity()) {
                  BoykovKolmogorovMFImpl.VertexExtension var16 = var13.getTarget();
                  if (var16.isSourceTreeVertex() && this.hasConnectionToTerminal(var16) && var16.distance < var8) {
                     var8 = var16.distance;
                     var7 = var13.getInverse();
                  }
               }
            }

            if (var7 == null) {
               var1.timestamp = 0L;
               var1.treeStatus = BoykovKolmogorovMFImpl.VertexTreeStatus.FREE_VERTEX;

               for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var14 : var1.getOutgoing()) {
                  BoykovKolmogorovMFImpl.VertexExtension var17 = var14.getTarget();
                  if (var17.isSourceTreeVertex()) {
                     if (var14.getInverse().hasCapacity()) {
                        this.makeActive(var17);
                     }

                     if (var17.parentEdge == var14) {
                        var17.makeOrphan();
                        this.childOrphans.addFirst(var17);
                     }
                  }
               }
            } else {
               this.makeCheckedInThisIteration(var1);
               var1.parentEdge = var7;
               var1.distance = var8 + 1;
            }
         } else {
            assert var1.isSinkTreeVertex();
            MaximumFlowAlgorithmBase.AnnotatedFlowEdge var2 = null;
            int var3 = Integer.MAX_VALUE;

            for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var5 : var1.getOutgoing()) {
               if (var5.hasCapacity()) {
                  BoykovKolmogorovMFImpl.VertexExtension var6 = var5.getTarget();
                  if (var6.isSinkTreeVertex() && this.hasConnectionToTerminal(var6) && var6.distance < var3) {
                     var3 = var6.distance;
                     var2 = var5;
                  }
               }
            }

            if (var2 == null) {
               var1.timestamp = 0L;
               var1.treeStatus = BoykovKolmogorovMFImpl.VertexTreeStatus.FREE_VERTEX;

               for (MaximumFlowAlgorithmBase.AnnotatedFlowEdge var12 : var1.getOutgoing()) {
                  BoykovKolmogorovMFImpl.VertexExtension var15 = var12.getTarget();
                  if (var15.isSinkTreeVertex()) {
                     if (var12.hasCapacity()) {
                        this.makeActive(var15);
                     }

                     if (var15.parentEdge == var12.getInverse()) {
                        var15.makeOrphan();
                        this.childOrphans.addFirst(var15);
                     }
                  }
               }
            } else {
               this.makeCheckedInThisIteration(var1);
               var1.parentEdge = var2;
               var1.distance = var3 + 1;
            }
         }
      }
   }

   private void nextIteration() {
      this.currentTimestamp++;
      this.makeCheckedInThisIteration(this.currentSource);
      this.makeCheckedInThisIteration(this.currentSink);
   }

   private void makeActive(BoykovKolmogorovMFImpl<V, E>.VertexExtension var1) {
      if (!var1.active) {
         var1.active = true;
         this.activeVertices.addFirst(var1);
      }
   }

   private BoykovKolmogorovMFImpl<V, E>.VertexExtension nextActiveVertex() {
      while (!this.activeVertices.isEmpty()) {
         BoykovKolmogorovMFImpl.VertexExtension var1 = this.activeVertices.getLast();
         assert var1.active;
         if (!var1.isFreeVertex()) {
            return var1;
         }

         this.activeVertices.removeLast();
         var1.active = false;
      }

      return null;
   }

   private void finishVertex(BoykovKolmogorovMFImpl<V, E>.VertexExtension var1) {
      assert this.activeVertices.getLast() == var1;
      this.activeVertices.pollLast();
      var1.active = false;
   }

   private void makeCheckedInThisIteration(BoykovKolmogorovMFImpl<V, E>.VertexExtension var1) {
      var1.timestamp = this.currentTimestamp;
   }

   private boolean wasCheckedInThisIteration(BoykovKolmogorovMFImpl<V, E>.VertexExtension var1) {
      return var1.timestamp == this.currentTimestamp;
   }

   private boolean hasConnectionToTerminal(BoykovKolmogorovMFImpl<V, E>.VertexExtension var1) {
      int var2 = 0;

      for (BoykovKolmogorovMFImpl.VertexExtension var3 = var1; var3 != this.currentSource && var3 != this.currentSink; var3 = var3.getParent()) {
         if (var3.parentEdge == null) {
            return false;
         }

         if (this.wasCheckedInThisIteration(var1)) {
            var2 += var3.distance;
            break;
         }

         var2++;
      }

      for (BoykovKolmogorovMFImpl.VertexExtension var4 = var1; !this.wasCheckedInThisIteration(var4); var4 = var4.getParent()) {
         var4.distance = var2--;
         this.makeCheckedInThisIteration(var4);
      }

      return true;
   }

   private boolean isCloserToTerminal(BoykovKolmogorovMFImpl<V, E>.VertexExtension var1, BoykovKolmogorovMFImpl<V, E>.VertexExtension var2) {
      return var1.timestamp >= var2.timestamp && var1.distance + 1 < var2.distance;
   }

   private BoykovKolmogorovMFImpl<V, E>.VertexExtension getVertexExtension(V var1) {
      return (BoykovKolmogorovMFImpl.VertexExtension)this.vertexExtensionManager.getExtension((V)var1);
   }

   private class VertexExtension extends MaximumFlowAlgorithmBase<V, E>.VertexExtensionBase {
      long timestamp;
      int distance;
      boolean active;
      MaximumFlowAlgorithmBase<V, E>.AnnotatedFlowEdge parentEdge = null;
      BoykovKolmogorovMFImpl.VertexTreeStatus treeStatus = BoykovKolmogorovMFImpl.VertexTreeStatus.FREE_VERTEX;

      VertexExtension() {
      }

      boolean isSourceTreeVertex() {
         return this.treeStatus == BoykovKolmogorovMFImpl.VertexTreeStatus.SOURCE_TREE_VERTEX;
      }

      boolean isSinkTreeVertex() {
         return this.treeStatus == BoykovKolmogorovMFImpl.VertexTreeStatus.SINK_TREE_VERTEX;
      }

      boolean isFreeVertex() {
         return this.treeStatus == BoykovKolmogorovMFImpl.VertexTreeStatus.FREE_VERTEX;
      }

      void makeOrphan() {
         this.parentEdge = null;
      }

      BoykovKolmogorovMFImpl<V, E>.VertexExtension getParent() {
         assert this.parentEdge != null;
         return this == this.parentEdge.getSource() ? this.parentEdge.getTarget() : this.parentEdge.getSource();
      }

      @Override
      public String toString() {
         return String.format(
            "{%s}: parent_edge = %s, tree_status = %s, distance = %d, timestamp = %d",
            this.prototype,
            this.parentEdge == null ? "null" : String.format("(%s, %s)", this.parentEdge.getSource().prototype, this.parentEdge.getTarget().prototype),
            this.treeStatus,
            this.distance,
            this.timestamp
         );
      }
   }

   private enum VertexTreeStatus {
      SOURCE_TREE_VERTEX {
         @Override
         public String toString() {
            return "SOURCE_TREE_VERTEX";
         }
      },
      SINK_TREE_VERTEX {
         @Override
         public String toString() {
            return "SINK_TREE_VERTEX";
         }
      },
      FREE_VERTEX {
         @Override
         public String toString() {
            return "FREE_VERTEX";
         }
      };

      @Override
      public abstract String toString();
   }
}
