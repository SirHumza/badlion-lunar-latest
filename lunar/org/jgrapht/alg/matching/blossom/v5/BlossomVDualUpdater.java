package org.jgrapht.alg.matching.blossom.v5;

import org.jheaps.MergeableAddressableHeap;

class BlossomVDualUpdater<V, E> {
   private BlossomVState<V, E> state;
   private BlossomVPrimalUpdater<V, E> primalUpdater;

   public BlossomVDualUpdater(BlossomVState<V, E> var1, BlossomVPrimalUpdater<V, E> var2) {
      this.state = var1;
      this.primalUpdater = var2;
   }

   public double updateDuals(BlossomVOptions.DualUpdateStrategy var1) {
      long var2 = System.nanoTime();
      BlossomVEdge var4 = null;

      for (BlossomVNode var5 = this.state.nodes[this.state.nodeNum].treeSiblingNext; var5 != null; var5 = var5.treeSiblingNext) {
         BlossomVTree var6 = var5.tree;
         double var7 = this.getEps(var6);
         var6.accumulatedEps = var7 - var6.eps;
      }

      if (var1 == BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_FIXED_DELTA) {
         var4 = this.multipleTreeFixedDelta();
      } else if (var1 == BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS) {
         var4 = this.updateDualsConnectedComponents();
      }

      double var9 = 0.0;

      for (BlossomVNode var10 = this.state.nodes[this.state.nodeNum].treeSiblingNext; var10 != null; var10 = var10.treeSiblingNext) {
         if (var10.tree.accumulatedEps > 1.0E-9) {
            var9 += var10.tree.accumulatedEps;
            var10.tree.eps = var10.tree.eps + var10.tree.accumulatedEps;
         }
      }

      this.state.statistics.dualUpdatesTime = this.state.statistics.dualUpdatesTime + (System.nanoTime() - var2);
      if (var4 != null) {
         this.primalUpdater.augment(var4);
      }

      return var9;
   }

   private double getEps(BlossomVTree var1) {
      double var2 = 1.0E100;
      if (!var1.plusInfinityEdges.isEmpty()) {
         BlossomVEdge var4 = var1.plusInfinityEdges.findMin().getValue();
         if (var4.slack < var2) {
            var2 = var4.slack;
         }
      }

      if (!var1.minusBlossoms.isEmpty()) {
         BlossomVNode var5 = var1.minusBlossoms.findMin().getValue();
         if (var5.dual < var2) {
            var2 = var5.dual;
         }
      }

      if (!var1.plusPlusEdges.isEmpty()) {
         BlossomVEdge var6 = var1.plusPlusEdges.findMin().getValue();
         if (2.0 * var2 > var6.slack) {
            var2 = var6.slack / 2.0;
         }
      }

      return var2;
   }

   public boolean updateDualsSingle(BlossomVTree var1) {
      long var2 = System.nanoTime();
      double var4 = this.getEps(var1);
      double var6 = 1.0E100;
      BlossomVEdge var8 = null;
      double var9 = 0.0;
      BlossomVTree.TreeEdgeIterator var11 = var1.treeEdgeIterator();

      while (var11.hasNext()) {
         BlossomVTreeEdge var12 = var11.next();
         BlossomVTree var13 = var12.head[var11.getCurrentDirection()];
         if (!var12.plusPlusEdges.isEmpty()) {
            BlossomVEdge var14 = var12.plusPlusEdges.findMin().getValue();
            if (var14.slack - var13.eps < var6) {
               var6 = var14.slack - var13.eps;
               var8 = var14;
            }
         }

         MergeableAddressableHeap var16 = var12.getCurrentPlusMinusHeap(var13.currentDirection);
         if (!var16.isEmpty()) {
            BlossomVEdge var15 = (BlossomVEdge)var16.findMin().getValue();
            if (var15.slack + var13.eps < var4) {
               var4 = var15.slack + var13.eps;
            }
         }
      }

      if (var4 > var6) {
         var4 = var6;
      }

      if (var4 > 1.0E10) {
         throw new IllegalArgumentException("There is no perfect matching in the specified graph");
      }

      if (var4 > var1.eps) {
         var9 = var4 - var1.eps;
         var1.eps = var4;
      }

      this.state.statistics.dualUpdatesTime = this.state.statistics.dualUpdatesTime + (System.nanoTime() - var2);
      if (var8 != null && var6 <= var1.eps) {
         this.primalUpdater.augment(var8);
         return false;
      } else {
         return var9 > 1.0E-9;
      }
   }

   private BlossomVEdge updateDualsConnectedComponents() {
      BlossomVTree var1 = new BlossomVTree();
      BlossomVEdge var2 = null;
      double var3 = 1.0E100;

      for (BlossomVNode var7 = this.state.nodes[this.state.nodeNum].treeSiblingNext; var7 != null; var7 = var7.treeSiblingNext) {
         var7.tree.nextTree = null;
      }

      label97:
      for (BlossomVNode var21 = this.state.nodes[this.state.nodeNum].treeSiblingNext; var21 != null; var21 = var21.treeSiblingNext) {
         BlossomVTree var8 = var21.tree;
         if (var8.nextTree == null) {
            double var9 = var8.accumulatedEps;
            var8.nextTree = var8;
            BlossomVTree var11 = var8;
            BlossomVTree var12 = var8;

            while (true) {
               BlossomVTree.TreeEdgeIterator var13 = var12.treeEdgeIterator();

               while (var13.hasNext()) {
                  BlossomVTreeEdge var14 = var13.next();
                  int var15 = var13.getCurrentDirection();
                  BlossomVTree var16 = var14.head[var15];
                  double var17 = 1.0E100;
                  int var19 = 1 - var15;
                  if (!var14.plusPlusEdges.isEmpty()) {
                     var17 = var14.plusPlusEdges.findMin().getKey() - var12.eps - var16.eps;
                     if (var3 > var17) {
                        var3 = var17;
                        var2 = var14.plusPlusEdges.findMin().getValue();
                     }
                  }

                  if (var16.nextTree != null && var16.nextTree != var1) {
                     if (2.0 * var9 > var17) {
                        var9 = var17 / 2.0;
                     }
                  } else {
                     double[] var20 = new double[2];
                     var20[var15] = 1.0E100;
                     if (!var14.getCurrentPlusMinusHeap(var15).isEmpty()) {
                        var20[var15] = var14.getCurrentPlusMinusHeap(var15).findMin().getKey() - var12.eps + var16.eps;
                     }

                     var20[var19] = 1.0E100;
                     if (!var14.getCurrentPlusMinusHeap(var19).isEmpty()) {
                        var20[var19] = var14.getCurrentPlusMinusHeap(var19).findMin().getKey() - var16.eps + var12.eps;
                     }

                     double var5;
                     if (var16.nextTree == var1) {
                        var5 = var16.accumulatedEps;
                     } else {
                        if (!(var20[0] > 0.0) || !(var20[1] > 0.0)) {
                           var11.nextTree = var16;
                           var11 = var16.nextTree = var16;
                           if (var9 > var16.accumulatedEps) {
                              var9 = var16.accumulatedEps;
                           }
                           continue;
                        }

                        var5 = 0.0;
                     }

                     if (var9 > var17 - var5) {
                        var9 = var17 - var5;
                     }

                     if (var9 > var20[var15] + var5) {
                        var9 = var20[var15] + var5;
                     }
                  }
               }

               if (var12.nextTree == var12) {
                  if (var9 > 1.0E10) {
                     throw new IllegalArgumentException("There is no perfect matching in the specified graph");
                  }

                  BlossomVTree var23 = var8;

                  while (true) {
                     var12 = var23;
                     var23 = var23.nextTree;
                     var12.nextTree = var1;
                     var12.accumulatedEps = var9;
                     if (var12 == var23) {
                        continue label97;
                     }
                  }
               }

               var12 = var12.nextTree;
            }
         }
      }

      return var2 != null && var3 - var2.head[0].tree.accumulatedEps - var2.head[1].tree.accumulatedEps <= 0.0 ? var2 : null;
   }

   private BlossomVEdge multipleTreeFixedDelta() {
      BlossomVEdge var1 = null;
      double var2 = 1.0E100;
      double var4 = 1.0E100;

      for (BlossomVNode var6 = this.state.nodes[this.state.nodeNum].treeSiblingNext; var6 != null; var6 = var6.treeSiblingNext) {
         BlossomVTree var7 = var6.tree;
         double var8 = var7.eps;
         var2 = Math.min(var2, var7.accumulatedEps);

         for (BlossomVTreeEdge var10 = var7.first[0]; var10 != null; var10 = var10.next[0]) {
            if (!var10.plusPlusEdges.isEmpty()) {
               BlossomVEdge var11 = var10.plusPlusEdges.findMin().getValue();
               double var12 = var11.slack - var8 - var10.head[0].eps;
               var2 = Math.min(var2, var12 / 2.0);
               if (var4 > var12) {
                  var4 = var12;
                  var1 = var11;
               }
            }
         }
      }

      if (var2 > 1.0E10) {
         throw new IllegalArgumentException("There is no perfect matching in the specified graph");
      }

      for (BlossomVNode var14 = this.state.nodes[this.state.nodeNum].treeSiblingNext; var14 != null; var14 = var14.treeSiblingNext) {
         var14.tree.accumulatedEps = var2;
      }

      return var4 <= 2.0 * var2 ? var1 : null;
   }
}
