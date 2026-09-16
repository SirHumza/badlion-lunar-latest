package org.jgrapht.alg.matching.blossom.v5;

class BlossomVPrimalUpdater<V, E> {
   private BlossomVState<V, E> state;

   public BlossomVPrimalUpdater(BlossomVState<V, E> var1) {
      this.state = var1;
   }

   public void grow(BlossomVEdge var1, boolean var2, boolean var3) {
      long var4 = System.nanoTime();
      int var6 = this.state.treeNum;
      int var7 = var1.head[0].isInfinityNode() ? 0 : 1;
      BlossomVNode var8 = var1.head[1 - var7];
      BlossomVNode var9 = var1.head[var7];
      BlossomVNode var10 = var9.getOppositeMatched();
      var8.addChild(var9, var1, true);
      var9.addChild(var10, var9.matched, true);
      BlossomVNode var11 = var10;

      while (true) {
         var9.label = BlossomVNode.Label.MINUS;
         var10.label = BlossomVNode.Label.PLUS;
         var9.isMarked = var10.isMarked = false;
         this.processMinusNodeGrow(var9);
         this.processPlusNodeGrow(var10, var2, var3);
         if (var6 != this.state.treeNum) {
            break;
         }

         if (var10.firstTreeChild != null) {
            var9 = var10.firstTreeChild;
            var10 = var9.getOppositeMatched();
         } else {
            while (var10 != var11 && var10.treeSiblingNext == null) {
               var10 = var10.getTreeParent();
            }

            if (!var10.isMinusNode()) {
               break;
            }

            var9 = var10.treeSiblingNext;
            var10 = var9.getOppositeMatched();
         }
      }

      this.state.statistics.growTime = this.state.statistics.growTime + (System.nanoTime() - var4);
   }

   public void augment(BlossomVEdge var1) {
      long var2 = System.nanoTime();

      for (int var4 = 0; var4 < 2; var4++) {
         BlossomVNode var5 = var1.head[var4];
         this.augmentBranch(var5, var1);
         var5.matched = var1;
      }

      this.state.statistics.augmentTime = this.state.statistics.augmentTime + (System.nanoTime() - var2);
   }

   public BlossomVNode shrink(BlossomVEdge var1, boolean var2) {
      long var3 = System.nanoTime();
      BlossomVNode var5 = this.findBlossomRoot(var1);
      BlossomVTree var6 = var5.tree;
      BlossomVNode var7 = new BlossomVNode(this.state.nodeNum + this.state.blossomNum);
      var7.tree = var6;
      var7.isBlossom = true;
      var7.isOuter = true;
      var7.isTreeRoot = var5.isTreeRoot;
      var7.dual = -var6.eps;
      if (var7.isTreeRoot) {
         var6.root = var7;
      } else {
         var7.matched = var5.matched;
      }

      BlossomVEdge.BlossomNodesIterator var8 = var1.blossomNodesIterator(var5);

      while (var8.hasNext()) {
         var8.next().isMarked = true;
      }

      BlossomVEdge var10 = this.updateTreeStructure(var5, var1, var7);
      this.setBlossomSiblings(var5, var1);
      var5.isMarked = false;
      var5.isProcessed = false;

      for (BlossomVNode var9 = var5.blossomSibling.getOpposite(var5); var9 != var5; var9 = var9.blossomSibling.getOpposite(var9)) {
         var9.isMarked = false;
         var9.isProcessed = false;
      }

      var5.matched = null;
      this.state.statistics.shrinkNum++;
      this.state.blossomNum++;
      this.state.statistics.shrinkTime = this.state.statistics.shrinkTime + (System.nanoTime() - var3);
      if (var10 != null && var2) {
         this.augment(var10);
      }

      return var7;
   }

   public void expand(BlossomVNode var1, boolean var2) {
      long var3 = System.nanoTime();
      BlossomVTree var5 = var1.tree;
      double var6 = var5.eps;
      var1.dual -= var6;
      var1.tree.removeMinusBlossom(var1);
      BlossomVNode var8 = var1.parentEdge.getCurrentOriginal(var1).getPenultimateBlossom();
      BlossomVNode var9 = var1.matched.getCurrentOriginal(var1).getPenultimateBlossom();
      BlossomVNode var10 = var9;

      do {
         var10.isMarked = true;
         var10 = var10.blossomSibling.getOpposite(var10);
      } while (var10 != var9);

      var1.removeFromChildList();
      BlossomVNode.IncidentEdgeIterator var11 = var1.incidentEdgesIterator();

      while (var11.hasNext()) {
         BlossomVEdge var12 = var11.next();
         BlossomVNode var13 = var12.headOriginal[1 - var11.getDir()].getPenultimateBlossomAndFixBlossomGrandparent();
         var12.moveEdgeTail(var1, var13);
      }

      if (!this.forwardDirection(var9, var8)) {
         this.reverseBlossomSiblings(var9);
      }

      this.expandOddBranch(var9, var8, var5);
      BlossomVEdge var15 = this.expandEvenBranch(var9, var8, var1);
      var10 = var9;

      do {
         var10.isMarked = false;
         var10.isProcessed = false;
         var10 = var10.blossomSibling.getOpposite(var10);
      } while (var10 != var9);

      this.state.statistics.expandNum++;
      this.state.removedNum++;
      this.state.statistics.expandTime = this.state.statistics.expandTime + (System.nanoTime() - var3);
      if (var2 && var15 != null) {
         this.augment(var15);
      }
   }

   private void processMinusNodeGrow(BlossomVNode var1) {
      double var2 = var1.tree.eps;
      var1.dual += var2;
      if (var1.isBlossom) {
         var1.tree.addMinusBlossom(var1);
      }

      BlossomVNode.IncidentEdgeIterator var4 = var1.incidentEdgesIterator();

      while (var4.hasNext()) {
         BlossomVEdge var5 = var4.next();
         BlossomVNode var6 = var5.head[var4.getDir()];
         var5.slack -= var2;
         if (var6.isPlusNode()) {
            if (var6.tree != var1.tree) {
               if (var6.tree.currentEdge == null) {
                  BlossomVTree.addTreeEdge(var1.tree, var6.tree);
               }

               var6.tree.removePlusInfinityEdge(var5);
               var6.tree.currentEdge.addToCurrentMinusPlusHeap(var5, var6.tree.currentDirection);
            } else if (var6 != var1.getOppositeMatched()) {
               var1.tree.removePlusInfinityEdge(var5);
            }
         }
      }
   }

   private void processPlusNodeGrow(BlossomVNode var1, boolean var2, boolean var3) {
      double var4 = var1.tree.eps;
      var1.dual -= var4;
      BlossomVEdge var6 = null;
      BlossomVNode.IncidentEdgeIterator var7 = var1.incidentEdgesIterator();

      while (var7.hasNext()) {
         BlossomVEdge var8 = var7.next();
         BlossomVNode var9 = var8.head[var7.getDir()];
         var8.slack += var4;
         if (var9.isPlusNode()) {
            if (var9.tree == var1.tree) {
               var1.tree.removePlusInfinityEdge(var8);
               var1.tree.addPlusPlusEdge(var8);
            } else {
               if (var9.tree.currentEdge == null) {
                  BlossomVTree.addTreeEdge(var1.tree, var9.tree);
               }

               var9.tree.removePlusInfinityEdge(var8);
               var9.tree.currentEdge.addPlusPlusEdge(var8);
               if (var8.slack <= var1.tree.eps + var9.tree.eps) {
                  var6 = var8;
               }
            }
         } else if (var9.isMinusNode()) {
            if (var9.tree != var1.tree) {
               if (var9.tree.currentEdge == null) {
                  BlossomVTree.addTreeEdge(var1.tree, var9.tree);
               }

               var9.tree.currentEdge.addToCurrentPlusMinusHeap(var8, var9.tree.currentDirection);
            }
         } else if (var9.isInfinityNode()) {
            var1.tree.addPlusInfinityEdge(var8);
            if (var2 && var8.slack <= var4 && !var8.getOpposite(var1).isMarked) {
               BlossomVNode var10 = var8.getOpposite(var1);
               BlossomVNode var11 = var10.getOppositeMatched();
               var10.isMarked = var11.isMarked = true;
               var1.addChild(var10, var8, true);
               var10.addChild(var11, var10.matched, true);
            }
         }
      }

      if (var3 && var6 != null) {
         this.augment(var6);
      }

      this.state.statistics.growNum++;
   }

   private BlossomVEdge expandEvenBranch(BlossomVNode var1, BlossomVNode var2, BlossomVNode var3) {
      BlossomVEdge var4 = null;
      BlossomVTree var5 = var3.tree;
      var1.matched = var3.matched;
      var1.tree = var5;
      var1.addChild(var3.matched.getOpposite(var1), var1.matched, false);
      BlossomVNode var6 = var1;
      BlossomVNode var7 = var6;
      var6.label = BlossomVNode.Label.MINUS;
      var6.isOuter = true;

      for (var6.parentEdge = var3.parentEdge; var6 != var2; var7 = var6) {
         BlossomVNode var9 = var6.blossomSibling.getOpposite(var6);
         var9.label = BlossomVNode.Label.PLUS;
         var9.isOuter = true;
         var9.tree = var5;
         var9.matched = var9.blossomSibling;
         BlossomVEdge var8 = var9.blossomSibling;
         var9.addChild(var7, var7.blossomSibling, false);
         var7 = var9;
         var6 = var9.blossomSibling.getOpposite(var9);
         var6.label = BlossomVNode.Label.MINUS;
         var6.isOuter = true;
         var6.tree = var5;
         var6.matched = var8;
         var6.addChild(var7, var7.blossomSibling, false);
      }

      var3.parentEdge.getOpposite(var2).addChild(var2, var3.parentEdge, false);
      var6 = var1;
      this.expandMinusNode(var6);

      while (var6 != var2) {
         var6 = var6.blossomSibling.getOpposite(var6);
         BlossomVEdge var13 = this.expandPlusNode(var6);
         if (var13 != null) {
            var4 = var13;
         }

         var6.isProcessed = true;
         var6 = var6.blossomSibling.getOpposite(var6);
         this.expandMinusNode(var6);
      }

      return var4;
   }

   private void expandOddBranch(BlossomVNode var1, BlossomVNode var2, BlossomVTree var3) {
      BlossomVNode var4 = var2.blossomSibling.getOpposite(var2);

      while (var4 != var1) {
         var4.label = BlossomVNode.Label.INFINITY;
         var4.isOuter = true;
         var4.tree = null;
         var4.matched = var4.blossomSibling;
         BlossomVEdge var5 = var4.blossomSibling;
         this.expandInfinityNode(var4, var3);
         var4 = var4.blossomSibling.getOpposite(var4);
         var4.label = BlossomVNode.Label.INFINITY;
         var4.isOuter = true;
         var4.tree = null;
         var4.matched = var5;
         this.expandInfinityNode(var4, var3);
         var4 = var4.blossomSibling.getOpposite(var4);
      }
   }

   private BlossomVEdge expandPlusNode(BlossomVNode var1) {
      BlossomVEdge var2 = null;
      double var3 = var1.tree.eps;
      var1.dual -= var3;
      BlossomVNode.IncidentEdgeIterator var5 = var1.incidentEdgesIterator();

      while (var5.hasNext()) {
         BlossomVEdge var6 = var5.next();
         BlossomVNode var7 = var6.head[var5.getDir()];
         if (var7.isMarked && var7.isPlusNode()) {
            if (!var7.isProcessed) {
               var6.slack += 2.0 * var3;
            }
         } else if (!var7.isMarked) {
            var6.slack += 2.0 * var3;
         } else if (!var7.isMinusNode()) {
            var6.slack += var3;
         }

         if (var7.isPlusNode()) {
            if (var7.tree == var1.tree) {
               if (!var7.isProcessed) {
                  var1.tree.addPlusPlusEdge(var6);
               }
            } else {
               var7.tree.currentEdge.removeFromCurrentMinusPlusHeap(var6);
               var7.tree.currentEdge.addPlusPlusEdge(var6);
               if (var6.slack <= var3 + var7.tree.eps) {
                  var2 = var6;
               }
            }
         } else if (var7.isMinusNode()) {
            if (var7.tree != var1.tree) {
               if (var7.tree.currentEdge == null) {
                  BlossomVTree.addTreeEdge(var1.tree, var7.tree);
               }

               var7.tree.currentEdge.addToCurrentPlusMinusHeap(var6, var7.tree.currentDirection);
            }
         } else {
            var1.tree.addPlusInfinityEdge(var6);
         }
      }

      return var2;
   }

   private void expandMinusNode(BlossomVNode var1) {
      double var2 = var1.tree.eps;
      var1.dual += var2;
      if (var1.isBlossom) {
         var1.tree.addMinusBlossom(var1);
      }

      BlossomVNode.IncidentEdgeIterator var4 = var1.incidentEdgesIterator();

      while (var4.hasNext()) {
         BlossomVEdge var5 = var4.next();
         BlossomVNode var6 = var5.head[var4.getDir()];
         if (var6.isMarked && !var6.isPlusNode()) {
            var5.slack -= var2;
         }
      }
   }

   private void expandInfinityNode(BlossomVNode var1, BlossomVTree var2) {
      double var3 = var2.eps;
      BlossomVNode.IncidentEdgeIterator var5 = var1.incidentEdgesIterator();

      while (var5.hasNext()) {
         BlossomVEdge var6 = var5.next();
         BlossomVNode var7 = var6.head[var5.getDir()];
         if (!var7.isMarked) {
            var6.slack += var3;
            if (var7.isPlusNode()) {
               if (var7.tree != var2) {
                  var7.tree.currentEdge.removeFromCurrentMinusPlusHeap(var6);
               }

               var7.tree.addPlusInfinityEdge(var6);
            }
         }
      }
   }

   private void augmentBranch(BlossomVNode var1, BlossomVEdge var2) {
      BlossomVTree var3 = var1.tree;
      double var4 = var3.eps;
      BlossomVNode var6 = var3.root;
      var3.setCurrentEdges();
      BlossomVTree.TreeNodeIterator var7 = var3.treeNodeIterator();

      while (var7.hasNext()) {
         BlossomVNode var8 = var7.next();
         if (!var8.isMarked) {
            if (var8.isPlusNode()) {
               var8.dual += var4;
            } else {
               var8.dual -= var4;
            }

            BlossomVNode.IncidentEdgeIterator var9 = var8.incidentEdgesIterator();

            while (var9.hasNext()) {
               BlossomVEdge var10 = var9.next();
               int var11 = var9.getDir();
               BlossomVNode var12 = var10.head[var11];
               BlossomVTree var13 = var12.tree;
               if (var8.isPlusNode()) {
                  var10.slack -= var4;
                  if (var13 != null && var13 != var3) {
                     BlossomVTreeEdge var14 = var13.currentEdge;
                     if (var12.isPlusNode()) {
                        var14.removeFromPlusPlusHeap(var10);
                        var13.addPlusInfinityEdge(var10);
                     } else if (var12.isMinusNode()) {
                        var14.removeFromCurrentPlusMinusHeap(var10);
                     }
                  }
               } else {
                  var10.slack += var4;
                  if (var13 != null && var13 != var3 && var12.isPlusNode()) {
                     BlossomVTreeEdge var22 = var13.currentEdge;
                     var22.removeFromCurrentMinusPlusHeap(var10);
                     var13.addPlusInfinityEdge(var10);
                  }
               }
            }

            var8.label = BlossomVNode.Label.INFINITY;
         } else {
            var8.isMarked = false;
         }
      }

      BlossomVTree.TreeEdgeIterator var15 = var3.treeEdgeIterator();

      while (var15.hasNext()) {
         BlossomVTreeEdge var17 = var15.next();
         int var19 = var15.getCurrentDirection();
         BlossomVTree var21 = var17.head[var19];
         var21.currentEdge = null;
         var21.plusPlusEdges.meld(var17.plusPlusEdges);
         var21.plusPlusEdges.meld(var17.getCurrentMinusPlusHeap(var19));
         var17.removeFromTreeEdgeList();
      }

      BlossomVEdge var16 = var2;
      BlossomVNode var18 = var1;

      for (BlossomVNode var20 = var18.getTreeParent(); var20 != null; var20 = var18.getTreeParent()) {
         var18.matched = var16;
         var16 = var20.parentEdge;
         var20.matched = var16;
         var18 = var20.getTreeParent();
      }

      var6.matched = var16;
      var6.removeFromChildList();
      var6.isTreeRoot = false;
      this.state.treeNum--;
   }

   private BlossomVEdge updateTreeStructure(BlossomVNode var1, BlossomVEdge var2, BlossomVNode var3) {
      BlossomVEdge var4 = null;
      BlossomVTree var5 = var1.tree;
      BlossomVEdge.BlossomNodesIterator var6 = var2.blossomNodesIterator(var1);

      while (var6.hasNext()) {
         BlossomVNode var7 = var6.next();
         if (var7 != var1) {
            if (var7.isPlusNode()) {
               var7.removeFromChildList();
               var7.moveChildrenTo(var3);
               BlossomVEdge var8 = this.shrinkPlusNode(var7, var3);
               if (var8 != null) {
                  var4 = var8;
               }

               var7.isProcessed = true;
            } else {
               if (var7.isBlossom) {
                  var5.removeMinusBlossom(var7);
               }

               var7.removeFromChildList();
               this.shrinkMinusNode(var7, var3);
            }
         }

         var7.blossomGrandparent = var7.blossomParent = var3;
      }

      var1.removeFromChildList();
      if (!var1.isTreeRoot) {
         var1.getTreeParent().addChild(var3, var1.parentEdge, false);
      } else {
         var3.treeSiblingNext = var1.treeSiblingNext;
         var3.treeSiblingPrev = var1.treeSiblingPrev;
         var1.treeSiblingPrev.treeSiblingNext = var3;
         if (var1.treeSiblingNext != null) {
            var1.treeSiblingNext.treeSiblingPrev = var3;
         }
      }

      var1.moveChildrenTo(var3);
      BlossomVEdge var9 = this.shrinkPlusNode(var1, var3);
      if (var9 != null) {
         var4 = var9;
      }

      var1.isTreeRoot = false;
      return var4;
   }

   private BlossomVEdge shrinkPlusNode(BlossomVNode var1, BlossomVNode var2) {
      BlossomVEdge var3 = null;
      BlossomVTree var4 = var1.tree;
      double var5 = var4.eps;
      var1.dual += var5;
      BlossomVNode.IncidentEdgeIterator var7 = var1.incidentEdgesIterator();

      while (var7.hasNext()) {
         BlossomVEdge var8 = var7.next();
         BlossomVNode var9 = var8.head[var7.getDir()];
         if (!var9.isMarked) {
            var8.moveEdgeTail(var1, var2);
            if (var9.tree != var4 && var9.isPlusNode() && var8.slack <= var5 + var9.tree.eps) {
               var3 = var8;
            }
         } else if (var9.isPlusNode()) {
            if (!var9.isProcessed) {
               var4.removePlusPlusEdge(var8);
            }

            var8.slack -= var5;
         }
      }

      return var3;
   }

   private void shrinkMinusNode(BlossomVNode var1, BlossomVNode var2) {
      BlossomVTree var3 = var1.tree;
      double var4 = var3.eps;
      var1.dual -= var4;
      BlossomVNode.IncidentEdgeIterator var6 = var1.incidentEdgesIterator();

      while (var6.hasNext()) {
         BlossomVEdge var7 = var6.next();
         BlossomVNode var8 = var7.head[var6.getDir()];
         BlossomVTree var9 = var8.tree;
         if (!var8.isMarked) {
            var7.moveEdgeTail(var1, var2);
            var7.slack += 2.0 * var4;
            if (var8.tree == var3) {
               if (var8.isPlusNode()) {
                  var3.addPlusPlusEdge(var7);
               }
            } else if (var8.isPlusNode()) {
               var9.currentEdge.removeFromCurrentMinusPlusHeap(var7);
               var9.currentEdge.addPlusPlusEdge(var7);
            } else if (var8.isMinusNode()) {
               if (var9.currentEdge == null) {
                  BlossomVTree.addTreeEdge(var3, var9);
               }

               var9.currentEdge.addToCurrentPlusMinusHeap(var7, var9.currentDirection);
            } else {
               var3.addPlusInfinityEdge(var7);
            }
         } else if (var8.isMinusNode()) {
            var7.slack += var4;
         }
      }
   }

   private void setBlossomSiblings(BlossomVNode var1, BlossomVEdge var2) {
      BlossomVEdge var3 = var2;
      BlossomVEdge.BlossomNodesIterator var4 = var2.blossomNodesIterator(var1);

      while (var4.hasNext()) {
         BlossomVNode var5 = var4.next();
         if (var4.getCurrentDirection() == 0) {
            var5.blossomSibling = var3;
            var3 = var5.parentEdge;
         } else {
            var5.blossomSibling = var5.parentEdge;
         }
      }
   }

   BlossomVNode findBlossomRoot(BlossomVEdge var1) {
      BlossomVNode[] var4 = new BlossomVNode[]{var1.head[0], var1.head[1]};
      int var5 = 0;

      BlossomVNode var2;
      BlossomVNode var3;
      while (true) {
         if (var4[var5].isMarked) {
            var2 = var4[var5];
            var3 = var4[1 - var5];
            break;
         }

         var4[var5].isMarked = true;
         if (var4[var5].isTreeRoot) {
            var3 = var4[var5];
            BlossomVNode var6 = var4[1 - var5];

            while (!var6.isMarked) {
               var6 = var6.getTreeGrandparent();
            }

            var2 = var6;
            break;
         }

         var4[var5] = var4[var5].getTreeGrandparent();
         var5 = 1 - var5;
      }

      for (BlossomVNode var7 = var2; var7 != var3; var7.isMarked = false) {
         var7 = var7.getTreeGrandparent();
      }

      this.clearIsMarkedAndSetIsOuter(var2, var1.head[0]);
      this.clearIsMarkedAndSetIsOuter(var2, var1.head[1]);
      return var2;
   }

   private void clearIsMarkedAndSetIsOuter(BlossomVNode var1, BlossomVNode var2) {
      while (var2 != var1) {
         var2.isMarked = false;
         var2.isOuter = false;
         var2 = var2.getTreeParent();
         var2.isOuter = false;
         var2 = var2.getTreeParent();
      }

      var1.isOuter = false;
      var1.isMarked = false;
   }

   private void reverseBlossomSiblings(BlossomVNode var1) {
      BlossomVEdge var2 = var1.blossomSibling;
      BlossomVNode var3 = var1;

      do {
         var3 = var2.getOpposite(var3);
         BlossomVEdge var4 = var2;
         var2 = var3.blossomSibling;
         var3.blossomSibling = var4;
      } while (var3 != var1);
   }

   private boolean forwardDirection(BlossomVNode var1, BlossomVNode var2) {
      int var3 = 0;

      for (BlossomVNode var4 = var1; var4 != var2; var4 = var4.blossomSibling.getOpposite(var4)) {
         var3++;
      }

      return (var3 & 1) == 0;
   }

   public void printBlossomNodes(BlossomVNode var1) {
      System.out.println("Printing blossom nodes");
      BlossomVNode var2 = var1;

      do {
         System.out.println(var2);
         var2 = var2.blossomSibling.getOpposite(var2);
      } while (var2 != var1);
   }
}
