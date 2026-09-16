package org.jgrapht.alg.matching.blossom.v5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.jgrapht.Graph;
import org.jgrapht.util.CollectionUtil;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.PairingHeap;

class BlossomVInitializer<V, E> {
   private final Graph<V, E> graph;
   private int nodeNum;
   private int edgeNum = 0;
   private BlossomVNode[] nodes;
   private BlossomVEdge[] edges;
   private List<V> graphVertices;
   private List<E> graphEdges;

   public BlossomVInitializer(Graph<V, E> var1) {
      this.graph = var1;
      this.nodeNum = var1.vertexSet().size();
   }

   public BlossomVState<V, E> initialize(BlossomVOptions var1) {
      switch (var1.initializationType) {
         case NONE:
            return this.simpleInitialization(var1);
         case GREEDY:
            return this.greedyInitialization(var1);
         case FRACTIONAL:
            return this.fractionalMatchingInitialization(var1);
         default:
            return null;
      }
   }

   private BlossomVState<V, E> simpleInitialization(BlossomVOptions var1) {
      double var2 = this.initGraph();

      for (BlossomVNode var7 : this.nodes) {
         var7.isOuter = true;
      }

      this.allocateTrees();
      this.initAuxiliaryGraph();
      return new BlossomVState<>(this.graph, this.nodes, this.edges, this.nodeNum, this.edgeNum, this.nodeNum, this.graphVertices, this.graphEdges, var1, var2);
   }

   private BlossomVState<V, E> greedyInitialization(BlossomVOptions var1) {
      double var2 = this.initGraph();
      int var4 = this.initGreedy();
      this.allocateTrees();
      this.initAuxiliaryGraph();
      return new BlossomVState<>(this.graph, this.nodes, this.edges, this.nodeNum, this.edgeNum, var4, this.graphVertices, this.graphEdges, var1, var2);
   }

   private BlossomVState<V, E> fractionalMatchingInitialization(BlossomVOptions var1) {
      double var2 = this.initGraph();
      this.initGreedy();
      this.allocateTrees();
      int var4 = this.initFractional();
      this.initAuxiliaryGraph();
      return new BlossomVState<>(this.graph, this.nodes, this.edges, this.nodeNum, this.edgeNum, var4, this.graphVertices, this.graphEdges, var1, var2);
   }

   private double initGraph() {
      int var1 = this.graph.edgeSet().size();
      this.nodes = new BlossomVNode[this.nodeNum + 1];
      this.edges = new BlossomVEdge[var1];
      this.graphVertices = new ArrayList(this.nodeNum);
      this.graphEdges = new ArrayList<>(var1);
      HashMap var2 = CollectionUtil.newHashMapWithExpectedSize(this.nodeNum);
      int var3 = 0;

      for (Object var5 : this.graph.vertexSet()) {
         this.nodes[var3] = new BlossomVNode(var3);
         this.graphVertices.add((V)var5);
         var2.put(var5, this.nodes[var3]);
         var3++;
      }

      this.nodes[this.nodeNum] = new BlossomVNode(this.nodeNum);
      var3 = 0;
      double var12 = this.graph.edgeSet().stream().map(this.graph::getEdgeWeight).min(Comparator.naturalOrder()).orElse(0.0);

      for (Object var7 : this.graph.edgeSet()) {
         BlossomVNode var8 = (BlossomVNode)var2.get(this.graph.getEdgeSource((E)var7));
         BlossomVNode var9 = (BlossomVNode)var2.get(this.graph.getEdgeTarget((E)var7));
         if (var8 != var9) {
            this.edgeNum++;
            BlossomVEdge var10 = this.addEdge(var8, var9, this.graph.getEdgeWeight((E)var7) - var12, var3);
            this.edges[var3] = var10;
            this.graphEdges.add((E)var7);
            var3++;
         }
      }

      return var12;
   }

   public BlossomVEdge addEdge(BlossomVNode var1, BlossomVNode var2, double var3, int var5) {
      BlossomVEdge var6 = new BlossomVEdge(var5);
      var6.slack = var3;
      var6.headOriginal[0] = var2;
      var6.headOriginal[1] = var1;
      var1.addEdge(var6, 0);
      var2.addEdge(var6, 1);
      return var6;
   }

   private int initGreedy() {
      for (int var1 = 0; var1 < this.nodeNum; var1++) {
         this.nodes[var1].dual = 1.0E100;
      }

      for (int var11 = 0; var11 < this.edgeNum; var11++) {
         BlossomVEdge var2 = this.edges[var11];
         if (var2.head[0].dual > var2.slack) {
            var2.head[0].dual = var2.slack;
         }

         if (var2.head[1].dual > var2.slack) {
            var2.head[1].dual = var2.slack;
         }
      }

      for (int var12 = 0; var12 < this.edgeNum; var12++) {
         BlossomVEdge var14 = this.edges[var12];
         BlossomVNode var3 = var14.head[0];
         BlossomVNode var4 = var14.head[1];
         if (!var3.isOuter) {
            var3.isOuter = true;
            var3.dual /= 2.0;
         }

         var14.slack = var14.slack - var3.dual;
         if (!var4.isOuter) {
            var4.isOuter = true;
            var4.dual /= 2.0;
         }

         var14.slack = var14.slack - var4.dual;
      }

      int var13 = this.nodeNum;

      for (int var15 = 0; var15 < this.nodeNum; var15++) {
         BlossomVNode var16 = this.nodes[var15];
         if (!var16.isInfinityNode()) {
            double var17 = 1.0E100;
            BlossomVNode.IncidentEdgeIterator var6 = var16.incidentEdgesIterator();

            while (var6.hasNext()) {
               BlossomVEdge var7 = var6.next();
               if (var7.slack < var17) {
                  var17 = var7.slack;
               }
            }

            var16.dual += var17;
            double var18 = var17;
            BlossomVNode.IncidentEdgeIterator var8 = var16.incidentEdgesIterator();

            while (var8.hasNext()) {
               BlossomVEdge var9 = var8.next();
               int var10 = var8.getDir();
               if (var9.slack <= var18 && var16.isPlusNode() && var9.head[var10].isPlusNode()) {
                  var16.label = BlossomVNode.Label.INFINITY;
                  var9.head[var10].label = BlossomVNode.Label.INFINITY;
                  var16.matched = var9;
                  var9.head[var10].matched = var9;
                  var13 -= 2;
               }

               var9.slack -= var18;
            }
         }
      }

      return var13;
   }

   private void initAuxiliaryGraph() {
      for (BlossomVNode var1 = this.nodes[this.nodeNum].treeSiblingNext; var1 != null; var1 = var1.treeSiblingNext) {
         BlossomVTree var2 = var1.tree;
         BlossomVNode.IncidentEdgeIterator var3 = var1.incidentEdgesIterator();

         while (var3.hasNext()) {
            BlossomVEdge var4 = var3.next();
            BlossomVNode var5 = var4.head[var3.getDir()];
            if (var5.isInfinityNode()) {
               var2.addPlusInfinityEdge(var4);
            } else if (!var5.isProcessed) {
               if (var5.tree.currentEdge == null) {
                  BlossomVTree.addTreeEdge(var2, var5.tree);
               }

               var5.tree.currentEdge.addPlusPlusEdge(var4);
            }
         }

         var1.isProcessed = true;
         BlossomVTree.TreeEdgeIterator var7 = var2.treeEdgeIterator();

         while (var7.hasNext()) {
            BlossomVTreeEdge var8 = var7.next();
            var8.head[var7.getCurrentDirection()].currentEdge = null;
         }
      }

      for (BlossomVNode var6 = this.nodes[this.nodeNum].treeSiblingNext; var6 != null; var6 = var6.treeSiblingNext) {
         var6.isProcessed = false;
      }
   }

   private void allocateTrees() {
      BlossomVNode var1 = this.nodes[this.nodeNum];

      for (int var2 = 0; var2 < this.nodeNum; var2++) {
         BlossomVNode var3 = this.nodes[var2];
         if (var3.isPlusNode()) {
            var3.treeSiblingPrev = var1;
            var1.treeSiblingNext = var3;
            var1 = var3;
            new BlossomVTree(var3);
         }
      }

      var1.treeSiblingNext = null;
   }

   private int finish() {
      BlossomVNode var1 = this.nodes[this.nodeNum];
      int var2 = 0;

      for (int var3 = 0; var3 < this.nodeNum; var3++) {
         BlossomVNode var4 = this.nodes[var3];
         var4.firstTreeChild = var4.treeSiblingNext = var4.treeSiblingPrev = null;
         if (!var4.isOuter) {
            this.expandInit(var4, null);
            var4.parentEdge = null;
            var4.label = BlossomVNode.Label.PLUS;
            new BlossomVTree(var4);
            var1.treeSiblingNext = var4;
            var4.treeSiblingPrev = var1;
            var1 = var4;
            var2++;
         }
      }

      return var2;
   }

   private void updateDuals(AddressableHeap<Double, BlossomVEdge> var1, BlossomVNode var2, double var3) {
      BlossomVTree.TreeNodeIterator var5 = new BlossomVTree.TreeNodeIterator(var2);

      while (var5.hasNext()) {
         BlossomVNode var6 = var5.next();
         if (var6.isProcessed) {
            var6.dual += var3;
            if (!var6.isTreeRoot) {
               BlossomVNode var7 = var6.getOppositeMatched();
               var7.dual -= var3;
               double var8 = var3 - var6.matched.slack;
               BlossomVNode.IncidentEdgeIterator var10 = var7.incidentEdgesIterator();

               while (var10.hasNext()) {
                  var10.next().slack += var8;
               }
            }

            BlossomVNode.IncidentEdgeIterator var13 = var6.incidentEdgesIterator();

            while (var13.hasNext()) {
               var13.next().slack -= var3;
            }

            var6.isProcessed = false;
         }
      }

      while (!var1.isEmpty()) {
         BlossomVEdge var11 = (BlossomVEdge)var1.findMin().getValue();
         BlossomVNode var12 = var11.head[0].isInfinityNode() ? var11.head[0] : var11.head[1];
         this.removeFromHeap(var12);
      }
   }

   private void addToHead(AddressableHeap<Double, BlossomVEdge> var1, BlossomVNode var2, BlossomVEdge var3) {
      var3.handle = var1.insert(var3.slack, var3);
      var2.bestEdge = var3;
   }

   private void removeFromHeap(BlossomVNode var1) {
      var1.bestEdge.handle.delete();
      var1.bestEdge.handle = null;
      var1.bestEdge = null;
   }

   private BlossomVNode findBlossomRootInit(BlossomVEdge var1) {
      BlossomVNode[] var2 = new BlossomVNode[]{var1.head[0], var1.head[1]};
      int var5 = 0;

      BlossomVNode var3;
      BlossomVNode var4;
      while (true) {
         if (!var2[var5].isOuter) {
            var3 = var2[var5];
            var4 = var2[1 - var5];
            break;
         }

         var2[var5].isOuter = false;
         if (var2[var5].isTreeRoot) {
            var4 = var2[var5];
            BlossomVNode var7 = var2[1 - var5];

            while (var7.isOuter) {
               var7.isOuter = false;
               var7 = var7.getTreeParent();
               var7.isOuter = false;
               var7 = var7.getTreeParent();
            }

            var3 = var7;
            break;
         }

         BlossomVNode var6 = var2[var5].getTreeParent();
         var6.isOuter = false;
         var2[var5] = var6.getTreeParent();
         var5 = 1 - var5;
      }

      for (BlossomVNode var9 = var3; var9 != var4; var9.isOuter = true) {
         var9 = var9.getTreeParent();
         var9.isOuter = true;
         var9 = var9.getTreeParent();
      }

      return var3;
   }

   private void handleInfinityEdgeInit(AddressableHeap<Double, BlossomVEdge> var1, BlossomVEdge var2, int var3, double var4, double var6) {
      BlossomVNode var8 = var2.head[1 - var3];
      BlossomVNode var9 = var2.head[var3];
      if (var2.slack > var4) {
         if (var2.slack < var6) {
            if (var9.bestEdge == null) {
               this.addToHead(var1, var9, var2);
            } else if (var2.slack < var9.bestEdge.slack) {
               this.removeFromHeap(var9);
               this.addToHead(var1, var9, var2);
            }
         }
      } else {
         if (var9.bestEdge != null) {
            this.removeFromHeap(var9);
         }

         var9.label = BlossomVNode.Label.MINUS;
         var8.addChild(var9, var2, true);
         BlossomVNode var10 = var9.matched.getOpposite(var9);
         if (var10.bestEdge != null) {
            this.removeFromHeap(var10);
         }

         var10.label = BlossomVNode.Label.PLUS;
         var9.addChild(var10, var10.matched, true);
      }
   }

   private void augmentBranchInit(BlossomVNode var1, BlossomVNode var2, BlossomVEdge var3) {
      BlossomVTree.TreeNodeIterator var4 = new BlossomVTree.TreeNodeIterator(var1);

      while (var4.hasNext()) {
         var4.next().label = BlossomVNode.Label.INFINITY;
      }

      BlossomVNode var7 = var2;
      BlossomVNode var5 = var2.getTreeParent();
      BlossomVEdge var6 = var3;

      while (var5 != null) {
         var7.matched = var6;
         var6 = var5.parentEdge;
         var5.matched = var5.parentEdge;
         var7 = var5.getTreeParent();
         var5 = var7.getTreeParent();
      }

      var1.matched = var6;
      var1.removeFromChildList();
      var1.isTreeRoot = false;
   }

   private void shrinkInit(BlossomVEdge var1, BlossomVNode var2) {
      BlossomVTree.TreeNodeIterator var3 = new BlossomVTree.TreeNodeIterator(var2);

      while (var3.hasNext()) {
         var3.next().label = BlossomVNode.Label.INFINITY;
      }

      BlossomVNode var7 = this.findBlossomRootInit(var1);
      if (!var7.isTreeRoot) {
         BlossomVNode var4 = var7.getTreeParent();
         BlossomVEdge var5 = var4.parentEdge;
         var4.matched = var4.parentEdge;
         BlossomVNode var6 = var4.getTreeParent();

         while (var6 != var2) {
            var4 = var6.getTreeParent();
            var6.matched = var5;
            var5 = var4.parentEdge;
            var4.matched = var4.parentEdge;
            var6 = var4.getTreeParent();
         }

         var6.matched = var5;
      }

      BlossomVEdge var9 = var1;
      BlossomVEdge.BlossomNodesIterator var10 = var1.blossomNodesIterator(var7);

      while (var10.hasNext()) {
         BlossomVNode var11 = var10.next();
         var11.label = BlossomVNode.Label.PLUS;
         if (var10.getCurrentDirection() == 0) {
            var11.blossomSibling = var9;
            var9 = var11.parentEdge;
         } else {
            var11.blossomSibling = var11.parentEdge;
         }
      }

      var2.removeFromChildList();
      var2.isTreeRoot = false;
   }

   private void expandInit(BlossomVNode var1, BlossomVEdge var2) {
      BlossomVNode var3 = var1.blossomSibling.getOpposite(var1);
      var1.isOuter = true;
      var1.label = BlossomVNode.Label.INFINITY;
      var1.matched = var2;

      do {
         var3.matched = var3.blossomSibling;
         BlossomVEdge var4 = var3.blossomSibling;
         var3.isOuter = true;
         var3.label = BlossomVNode.Label.INFINITY;
         var3 = var3.blossomSibling.getOpposite(var3);
         var3.matched = var4;
         var3.isOuter = true;
         var3.label = BlossomVNode.Label.INFINITY;
         var3 = var3.blossomSibling.getOpposite(var3);
      } while (var3 != var1);
   }

   private int initFractional() {
      PairingHeap var1 = new PairingHeap();
      BlossomVNode var2 = this.nodes[this.nodeNum].treeSiblingNext;

      while (var2 != null) {
         BlossomVNode var3 = var2.treeSiblingNext;
         BlossomVNode var4 = null;
         if (var3 != null) {
            var4 = var3.treeSiblingNext;
         }

         BlossomVNode var5 = var2;
         var1.clear();
         double var6 = 0.0;
         BlossomVInitializer.Action var8 = BlossomVInitializer.Action.NONE;
         BlossomVNode var9 = var5;
         BlossomVEdge var10 = null;
         double var11 = 1.0E100;
         int var13 = -1;
         boolean var14 = false;

         label139:
         while (true) {
            var5.isProcessed = true;
            var5.dual -= var6;
            if (!var5.isTreeRoot) {
               var5.getOppositeMatched().dual += var6;
            }

            BlossomVNode.IncidentEdgeIterator var15 = var5.incidentEdgesIterator();

            while (var15.hasNext()) {
               BlossomVEdge var16 = var15.next();
               int var17 = var15.getDir();
               var16.slack += var6;
               BlossomVNode var18 = var16.head[var17];
               if (var18.tree == var2.tree) {
                  if (var18.isPlusNode()) {
                     double var19 = var16.slack;
                     if (!var18.isProcessed) {
                        var19 += var6;
                     }

                     if (2.0 * var11 > var19 || var10 == null) {
                        var8 = BlossomVInitializer.Action.SHRINK;
                        var11 = var19 / 2.0;
                        var10 = var16;
                        var13 = var17;
                        if (var11 <= var6) {
                           var14 = true;
                           break;
                        }
                     }
                  }
               } else if (var18.isPlusNode()) {
                  if (var11 >= var16.slack || var10 == null) {
                     var8 = BlossomVInitializer.Action.AUGMENT;
                     var11 = var16.slack;
                     var10 = var16;
                     var13 = var17;
                     if (var11 <= var6) {
                        var14 = true;
                        break;
                     }
                  }
               } else {
                  this.handleInfinityEdgeInit(var1, var16, var17, var6, var11);
               }
            }

            if (var14) {
               while (true) {
                  if (!var15.hasNext()) {
                     break label139;
                  }

                  var15.next().slack += var6;
               }
            }

            if (var5.firstTreeChild == null) {
               while (var5 != var9 && var5.treeSiblingNext == null) {
                  var5 = var5.getTreeParent();
               }

               if (var5.isMinusNode()) {
                  var5 = var5.treeSiblingNext.getOppositeMatched();
               } else if (var5 == var9) {
                  BlossomVEdge var23 = var1.isEmpty() ? null : (BlossomVEdge)var1.findMin().getValue();
                  if (var23 == null || var23.slack >= var11) {
                     if (var11 > 1.0E10) {
                        throw new IllegalArgumentException("There is no perfect matching in the specified graph");
                     }

                     var6 = var11;
                     break;
                  }

                  int var25 = var23.head[0].isInfinityNode() ? 0 : 1;
                  var5 = var23.head[1 - var25];
                  BlossomVNode var26 = var23.head[var25];
                  this.removeFromHeap(var26);
                  var26.label = BlossomVNode.Label.MINUS;
                  var5.addChild(var26, var23, true);
                  var6 = var23.slack;
                  BlossomVNode var27 = var26.getOppositeMatched();
                  if (var27.bestEdge != null) {
                     this.removeFromHeap(var27);
                  }

                  var27.label = BlossomVNode.Label.PLUS;
                  var26.addChild(var27, var26.matched, true);
                  var9 = var27;
                  var5 = var27;
               }
            } else {
               var5 = var5.firstTreeChild.getOppositeMatched();
            }
         }

         this.updateDuals(var1, var2, var6);
         BlossomVNode var22 = var10.head[1 - var13];
         BlossomVNode var24 = var10.head[var13];
         if (var8 == BlossomVInitializer.Action.SHRINK) {
            this.shrinkInit(var10, var2);
         } else {
            this.augmentBranchInit(var2, var22, var10);
            if (var24.isOuter) {
               this.augmentBranchInit(var24, var24, var10);
            } else {
               this.expandInit(var24, var10);
            }
         }

         var2 = var3;
         if (var2 != null && !var2.isTreeRoot) {
            var2 = var4;
         }
      }

      return this.finish();
   }

   enum Action {
      NONE,
      SHRINK,
      AUGMENT;
   }
}
