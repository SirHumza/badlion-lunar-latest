package org.jgrapht.alg.matching.blossom.v5;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MatchingAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.AsWeightedGraph;

public class KolmogorovWeightedPerfectMatching<V, E> implements MatchingAlgorithm<V, E> {
   public static final double EPS = 1.0E-9;
   public static final double INFINITY = 1.0E100;
   public static final double NO_PERFECT_MATCHING_THRESHOLD = 1.0E10;
   public static final BlossomVOptions DEFAULT_OPTIONS = new BlossomVOptions();
   static final boolean DEBUG = false;
   static final String NO_PERFECT_MATCHING = "There is no perfect matching in the specified graph";
   private final Graph<V, E> initialGraph;
   private final Graph<V, E> graph;
   BlossomVState<V, E> state;
   private BlossomVPrimalUpdater<V, E> primalUpdater;
   private BlossomVDualUpdater<V, E> dualUpdater;
   private MatchingAlgorithm.Matching<V, E> matching;
   private KolmogorovWeightedPerfectMatching.DualSolution<V, E> dualSolution;
   private BlossomVOptions options;
   private ObjectiveSense objectiveSense;

   public KolmogorovWeightedPerfectMatching(Graph<V, E> var1) {
      this(var1, DEFAULT_OPTIONS, ObjectiveSense.MINIMIZE);
   }

   public KolmogorovWeightedPerfectMatching(Graph<V, E> var1, ObjectiveSense var2) {
      this(var1, DEFAULT_OPTIONS, var2);
   }

   public KolmogorovWeightedPerfectMatching(Graph<V, E> var1, BlossomVOptions var2) {
      this(var1, var2, ObjectiveSense.MINIMIZE);
   }

   public KolmogorovWeightedPerfectMatching(Graph<V, E> var1, BlossomVOptions var2, ObjectiveSense var3) {
      Objects.requireNonNull(var1);
      this.objectiveSense = var3;
      if ((var1.vertexSet().size() & 1) == 1) {
         throw new IllegalArgumentException("There is no perfect matching in the specified graph");
      }

      if (var3 == ObjectiveSense.MAXIMIZE) {
         this.graph = new AsWeightedGraph<>(var1, var1x -> -var1.getEdgeWeight(var1x), true, false);
      } else {
         this.graph = var1;
      }

      this.initialGraph = var1;
      this.options = Objects.requireNonNull(var2);
   }

   @Override
   public MatchingAlgorithm.Matching<V, E> getMatching() {
      if (this.matching == null) {
         this.lazyComputeWeightedPerfectMatching();
      }

      return this.matching;
   }

   public KolmogorovWeightedPerfectMatching.DualSolution<V, E> getDualSolution() {
      this.dualSolution = this.lazyComputeDualSolution();
      return this.dualSolution;
   }

   public boolean testOptimality() {
      this.lazyComputeWeightedPerfectMatching();
      return this.getError() < 1.0E-9;
   }

   public double getError() {
      this.lazyComputeWeightedPerfectMatching();
      double var1 = this.testNonNegativity();
      Set var3 = this.matching.getEdges();

      for (int var4 = 0; var4 < this.state.graphEdges.size(); var4++) {
         Object var5 = this.state.graphEdges.get(var4);
         BlossomVEdge var6 = this.state.edges[var4];
         double var7 = this.graph.getEdgeWeight((E)var5);
         var7 -= this.state.minEdgeWeight;
         BlossomVNode var9 = var6.headOriginal[0];
         BlossomVNode var10 = var6.headOriginal[1];
         Pair var11 = this.lca(var9, var10);
         var7 -= this.totalDual(var9, (BlossomVNode)var11.getFirst());
         var7 -= this.totalDual(var10, (BlossomVNode)var11.getSecond());
         if (var11.getFirst() == var11.getSecond()) {
            var7 += 2.0 * ((BlossomVNode)var11.getFirst()).getTrueDual();
         }

         if (var7 < 0.0 || var3.contains(var5)) {
            var1 += Math.abs(var7);
         }
      }

      return var1;
   }

   private void lazyComputeWeightedPerfectMatching() {
      if (this.matching == null) {
         BlossomVInitializer var1 = new BlossomVInitializer<>(this.graph);
         this.state = var1.initialize(this.options);
         this.primalUpdater = new BlossomVPrimalUpdater<>(this.state);
         this.dualUpdater = new BlossomVDualUpdater<>(this.state, this.primalUpdater);

         while (true) {
            int var2 = this.state.treeNum;
            BlossomVNode var3 = this.state.nodes[this.state.nodeNum].treeSiblingNext;

            while (var3 != null) {
               BlossomVNode var4 = var3.treeSiblingNext;
               BlossomVNode var5 = null;
               if (var4 != null) {
                  var5 = var4.treeSiblingNext;
               }

               BlossomVTree var6 = var3.tree;
               int var7 = this.state.treeNum;
               this.setCurrentEdgesAndTryToAugment(var6);
               if (var7 == this.state.treeNum && this.options.updateDualsBefore) {
                  this.dualUpdater.updateDualsSingle(var6);
               }

               while (var7 == this.state.treeNum) {
                  if (!var6.plusInfinityEdges.isEmpty()) {
                     BlossomVEdge var8 = var6.plusInfinityEdges.findMin().getValue();
                     if (var8.slack <= var6.eps) {
                        this.primalUpdater.grow(var8, true, true);
                        continue;
                     }
                  }

                  if (!var6.plusPlusEdges.isEmpty()) {
                     BlossomVEdge var9 = var6.plusPlusEdges.findMin().getValue();
                     if (var9.slack <= 2.0 * var6.eps) {
                        this.primalUpdater.shrink(var9, true);
                        continue;
                     }
                  }

                  if (var6.minusBlossoms.isEmpty()) {
                     break;
                  }

                  BlossomVNode var10 = var6.minusBlossoms.findMin().getValue();
                  if (!(var10.dual <= var6.eps)) {
                     break;
                  }

                  this.primalUpdater.expand(var10, true);
               }

               if (this.state.treeNum == var7) {
                  var6.currentEdge = null;
                  if (this.options.updateDualsAfter && this.dualUpdater.updateDualsSingle(var6)) {
                     continue;
                  }

                  var6.clearCurrentEdges();
               }

               var3 = var4;
               if (var4 != null && var4.isInfinityNode()) {
                  var3 = var5;
               }
            }

            if (this.state.treeNum == 0) {
               this.finish();
               return;
            }

            if (var2 == this.state.treeNum && this.dualUpdater.updateDuals(this.options.dualUpdateStrategy) <= 0.0) {
               this.dualUpdater.updateDuals(BlossomVOptions.DualUpdateStrategy.MULTIPLE_TREE_CONNECTED_COMPONENTS);
            }
         }
      }
   }

   private void setCurrentEdgesAndTryToAugment(BlossomVTree var1) {
      BlossomVTree.TreeEdgeIterator var2 = var1.treeEdgeIterator();

      while (var2.hasNext()) {
         BlossomVTreeEdge var3 = var2.next();
         BlossomVTree var4 = var3.head[var2.getCurrentDirection()];
         if (!var3.plusPlusEdges.isEmpty()) {
            BlossomVEdge var5 = var3.plusPlusEdges.findMin().getValue();
            if (var5.slack <= var1.eps + var4.eps) {
               this.primalUpdater.augment(var5);
               break;
            }
         }

         var4.currentEdge = var3;
         var4.currentDirection = var2.getCurrentDirection();
      }
   }

   private double testNonNegativity() {
      BlossomVNode[] var1 = this.state.nodes;
      double var2 = 0.0;

      for (int var4 = 0; var4 < this.state.nodeNum; var4++) {
         for (BlossomVNode var5 = var1[var4].blossomParent; var5 != null && !var5.isMarked; var5 = var5.blossomParent) {
            if (var5.dual < 0.0) {
               var2 += Math.abs(var5.dual);
               break;
            }

            var5.isMarked = true;
         }
      }

      this.clearMarked();
      return var2;
   }

   private double totalDual(BlossomVNode var1, BlossomVNode var2) {
      if (var2 == var1) {
         return var1.getTrueDual();
      }

      double var3 = 0.0;
      BlossomVNode var5 = var1;

      do {
         var3 += var5.getTrueDual();
         var5 = var5.blossomParent;
      } while (var5 != null && var5 != var2);

      return var3 + var2.getTrueDual();
   }

   private Pair<BlossomVNode, BlossomVNode> lca(BlossomVNode var1, BlossomVNode var2) {
      BlossomVNode[] var3 = new BlossomVNode[]{var1, var2};
      int var4 = 0;

      Pair var5;
      while (true) {
         if (var3[var4].isMarked) {
            var5 = new Pair<>(var3[var4], var3[var4]);
            break;
         }

         var3[var4].isMarked = true;
         if (var3[var4].isOuter) {
            BlossomVNode var6 = var3[1 - var4];

            while (!var6.isOuter && !var6.isMarked) {
               var6 = var6.blossomParent;
            }

            if (var6.isMarked) {
               var5 = new Pair<>(var6, var6);
            } else {
               var5 = var4 == 0 ? new Pair<>(var3[var4], var6) : new Pair<>(var6, var3[var4]);
            }
            break;
         }

         var3[var4] = var3[var4].blossomParent;
         var4 = 1 - var4;
      }

      this.clearMarked(var1);
      this.clearMarked(var2);
      return var5;
   }

   private void clearMarked(BlossomVNode var1) {
      do {
         var1.isMarked = false;
         var1 = var1.blossomParent;
      } while (var1 != null && var1.isMarked);
   }

   private void clearMarked() {
      BlossomVNode[] var1 = this.state.nodes;

      for (int var2 = 0; var2 < this.state.nodeNum; var2++) {
         BlossomVNode var3 = var1[var2];

         do {
            var3.isMarked = false;
            var3 = var3.blossomParent;
         } while (var3 != null && var3.isMarked);
      }
   }

   private void finish() {
      HashSet var1 = new HashSet();
      BlossomVNode[] var2 = this.state.nodes;
      LinkedList var3 = new LinkedList();

      for (int var4 = 0; var4 < this.state.nodeNum; var4++) {
         if (var2[var4].matched == null) {
            BlossomVNode var5 = null;
            BlossomVNode var6 = var2[var4];

            do {
               var6.blossomGrandparent = var5;
               var5 = var6;
               var6 = var5.blossomParent;
            } while (!var6.isOuter);

            while (true) {
               BlossomVNode var7 = var6.matched.getCurrentOriginal(var6);
               if (var7 == null) {
                  var7 = var6.matched.head[0].isProcessed ? var6.matched.headOriginal[1] : var6.matched.headOriginal[0];
               }

               while (var7.blossomParent != var6) {
                  var7 = var7.blossomParent;
               }

               var7.matched = var6.matched;
               BlossomVNode var8 = var6.getOppositeMatched();
               if (var8 != null) {
                  var8.isProcessed = true;
                  var3.add(var8);
               }

               var8 = var7.blossomSibling.getOpposite(var7);

               while (var8 != var7) {
                  var8.matched = var8.blossomSibling;
                  BlossomVNode var9 = var8.blossomSibling.getOpposite(var8);
                  var9.matched = var8.matched;
                  var8 = var9.blossomSibling.getOpposite(var9);
               }

               if (!var5.isBlossom) {
                  for (BlossomVNode var15 : var3) {
                     var15.isProcessed = false;
                  }

                  var3.clear();
                  break;
               }

               var6 = var5;
               var5 = var6.blossomGrandparent;
            }
         }
      }

      double var10 = 0.0;

      for (int var11 = 0; var11 < this.state.nodeNum; var11++) {
         Object var13 = this.state.graphEdges.get(var2[var11].matched.pos);
         if (!var1.contains(var13)) {
            var1.add(var13);
            var10 += this.state.graph.getEdgeWeight((E)var13);
         }
      }

      if (this.objectiveSense == ObjectiveSense.MAXIMIZE) {
         var10 = -var10;
      }

      this.matching = new MatchingAlgorithm.MatchingImpl<>(this.state.graph, var1, var10);
   }

   private void prepareForDualSolution() {
      BlossomVNode[] var1 = this.state.nodes;

      for (int var2 = 0; var2 < this.state.nodeNum; var2++) {
         BlossomVNode var3 = var1[var2];
         BlossomVNode var4 = null;

         do {
            var3.blossomGrandparent = var4;
            var3.isMarked = true;
            var4 = var3;
            var3 = var3.blossomParent;
         } while (var3 != null && !var3.isMarked);
      }

      this.clearMarked();
   }

   private Set<V> getBlossomNodes(BlossomVNode var1, Map<BlossomVNode, Set<V>> var2) {
      if (var2.containsKey(var1)) {
         return (Set<V>)var2.get(var1);
      }

      HashSet var3 = new HashSet();
      BlossomVNode var4 = var1.blossomGrandparent;
      BlossomVNode var5 = var4;

      do {
         if (var5.isBlossom) {
            if (!var2.containsKey(var5)) {
               var3.addAll(this.getBlossomNodes(var5, var2));
            } else {
               var3.addAll((Collection<? extends E>)var2.get(var5));
            }
         } else {
            var3.add(this.state.graphVertices.get(var5.pos));
         }

         var5 = var5.blossomSibling.getOpposite(var5);
      } while (var5 != var4);

      var2.put(var1, var3);
      return var3;
   }

   private KolmogorovWeightedPerfectMatching.DualSolution<V, E> lazyComputeDualSolution() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: No successor exists for {Do}:40
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getFirstSuccessor(Statement.java:837)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:289)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:478)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:257)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:478)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:458)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.flattenStatement(FlattenStatementsHelper.java:474)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.lazyComputeWeightedPerfectMatching ()V
      // 04: aload 0
      // 05: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.dualSolution Lorg/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching$DualSolution;
      // 08: ifnull 10
      // 0b: aload 0
      // 0c: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.dualSolution Lorg/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching$DualSolution;
      // 0f: areturn
      // 10: new java/util/HashMap
      // 13: dup
      // 14: invokespecial java/util/HashMap.<init> ()V
      // 17: astore 1
      // 18: new java/util/HashMap
      // 1b: dup
      // 1c: invokespecial java/util/HashMap.<init> ()V
      // 1f: astore 2
      // 20: aload 0
      // 21: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.state Lorg/jgrapht/alg/matching/blossom/v5/BlossomVState;
      // 24: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVState.nodes [Lorg/jgrapht/alg/matching/blossom/v5/BlossomVNode;
      // 27: astore 3
      // 28: aload 0
      // 29: invokevirtual org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.prepareForDualSolution ()V
      // 2c: aload 0
      // 2d: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.state Lorg/jgrapht/alg/matching/blossom/v5/BlossomVState;
      // 30: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVState.minEdgeWeight D
      // 33: ldc2_w 2.0
      // 36: ddiv
      // 37: dstore 4
      // 39: bipush 0
      // 3a: istore 6
      // 3c: iload 6
      // 3e: aload 0
      // 3f: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.state Lorg/jgrapht/alg/matching/blossom/v5/BlossomVState;
      // 42: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVState.nodeNum I
      // 45: if_icmpge e8
      // 48: aload 3
      // 49: iload 6
      // 4b: aaload
      // 4c: astore 7
      // 4e: aload 7
      // 50: invokevirtual org/jgrapht/alg/matching/blossom/v5/BlossomVNode.getTrueDual ()D
      // 53: dstore 8
      // 55: aload 7
      // 57: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVNode.isBlossom Z
      // 5a: ifne 64
      // 5d: dload 8
      // 5f: dload 4
      // 61: dadd
      // 62: dstore 8
      // 64: aload 0
      // 65: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.objectiveSense Lorg/jgrapht/alg/matching/blossom/v5/ObjectiveSense;
      // 68: getstatic org/jgrapht/alg/matching/blossom/v5/ObjectiveSense.MAXIMIZE Lorg/jgrapht/alg/matching/blossom/v5/ObjectiveSense;
      // 6b: if_acmpne 73
      // 6e: dload 8
      // 70: dneg
      // 71: dstore 8
      // 73: dload 8
      // 75: invokestatic java/lang/Math.abs (D)D
      // 78: ldc2_w 1.0E-9
      // 7b: dcmpl
      // 7c: ifle bd
      // 7f: aload 7
      // 81: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVNode.isBlossom Z
      // 84: ifeq 9d
      // 87: aload 1
      // 88: aload 0
      // 89: aload 7
      // 8b: aload 2
      // 8c: invokevirtual org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.getBlossomNodes (Lorg/jgrapht/alg/matching/blossom/v5/BlossomVNode;Ljava/util/Map;)Ljava/util/Set;
      // 8f: dload 8
      // 91: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 94: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 99: pop
      // 9a: goto bd
      // 9d: aload 1
      // 9e: aload 0
      // 9f: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.state Lorg/jgrapht/alg/matching/blossom/v5/BlossomVState;
      // a2: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVState.graphVertices Ljava/util/List;
      // a5: aload 7
      // a7: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVNode.pos I
      // aa: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // af: invokestatic java/util/Collections.singleton (Ljava/lang/Object;)Ljava/util/Set;
      // b2: dload 8
      // b4: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // b7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // bc: pop
      // bd: aload 7
      // bf: bipush 1
      // c0: putfield org/jgrapht/alg/matching/blossom/v5/BlossomVNode.isMarked Z
      // c3: aload 7
      // c5: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVNode.isOuter Z
      // c8: ifeq ce
      // cb: goto e2
      // ce: aload 7
      // d0: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVNode.blossomParent Lorg/jgrapht/alg/matching/blossom/v5/BlossomVNode;
      // d3: astore 7
      // d5: aload 7
      // d7: ifnull e2
      // da: aload 7
      // dc: getfield org/jgrapht/alg/matching/blossom/v5/BlossomVNode.isMarked Z
      // df: ifeq 4e
      // e2: iinc 6 1
      // e5: goto 3c
      // e8: aload 0
      // e9: invokevirtual org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.clearMarked ()V
      // ec: new org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching$DualSolution
      // ef: dup
      // f0: aload 0
      // f1: getfield org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching.initialGraph Lorg/jgrapht/Graph;
      // f4: aload 1
      // f5: invokespecial org/jgrapht/alg/matching/blossom/v5/KolmogorovWeightedPerfectMatching$DualSolution.<init> (Lorg/jgrapht/Graph;Ljava/util/Map;)V
      // f8: areturn
   }

   private void printState() {
      BlossomVNode[] var1 = this.state.nodes;
      BlossomVEdge[] var2 = this.state.edges;
      System.out.println();

      for (int var3 = 0; var3 < 20; var3++) {
         System.out.print("-");
      }

      System.out.println();
      HashSet var7 = new HashSet();

      for (int var4 = 0; var4 < this.state.nodeNum; var4++) {
         BlossomVNode var5 = var1[var4];
         if (var5.matched != null) {
            BlossomVEdge var6 = var5.matched;
            var7.add(var5.matched);
            if (var6.head[0].matched == null || var6.head[1].matched == null) {
               System.out.println("Problem with edge " + var6);
               throw new RuntimeException();
            }
         }

         System.out.println(var1[var4]);
      }

      for (int var8 = 0; var8 < 20; var8++) {
         System.out.print("-");
      }

      System.out.println();

      for (int var9 = 0; var9 < this.state.edgeNum; var9++) {
         System.out.println(var2[var9] + (var7.contains(var2[var9]) ? ", matched" : ""));
      }
   }

   private void printTrees() {
      System.out.println("Printing trees");

      for (BlossomVNode var1 = this.state.nodes[this.state.nodeNum].treeSiblingNext; var1 != null; var1 = var1.treeSiblingNext) {
         BlossomVTree var2 = var1.tree;
         System.out.println(var2);
      }
   }

   private void printMap() {
      System.out.println(this.state.nodeNum + " " + this.state.edgeNum);

      for (int var1 = 0; var1 < this.state.nodeNum; var1++) {
         System.out.println(this.state.graphVertices.get(var1) + " -> " + this.state.nodes[var1]);
      }
   }

   public KolmogorovWeightedPerfectMatching.Statistics getStatistics() {
      return this.state.statistics;
   }

   public static class DualSolution<V, E> {
      Graph<V, E> graph;
      Map<Set<V>, Double> dualVariables;

      public DualSolution(Graph<V, E> var1, Map<Set<V>, Double> var2) {
         this.graph = var1;
         this.dualVariables = var2;
      }

      public Graph<V, E> getGraph() {
         return this.graph;
      }

      public Map<Set<V>, Double> getDualVariables() {
         return this.dualVariables;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder("DualSolution{");
         var1.append("graph=").append(this.graph);
         var1.append(", dualVariables=").append(this.dualVariables);
         var1.append('}');
         return var1.toString();
      }
   }

   public static class Statistics {
      int shrinkNum = 0;
      int expandNum = 0;
      int growNum = 0;
      long augmentTime = 0L;
      long expandTime = 0L;
      long shrinkTime = 0L;
      long growTime = 0L;
      long dualUpdatesTime = 0L;

      public int getShrinkNum() {
         return this.shrinkNum;
      }

      public int getExpandNum() {
         return this.expandNum;
      }

      public int getGrowNum() {
         return this.growNum;
      }

      public long getAugmentTime() {
         return this.augmentTime;
      }

      public long getExpandTime() {
         return this.expandTime;
      }

      public long getShrinkTime() {
         return this.shrinkTime;
      }

      public long getGrowTime() {
         return this.growTime;
      }

      public long getDualUpdatesTime() {
         return this.dualUpdatesTime;
      }

      @Override
      public String toString() {
         return "Statistics{shrinkNum="
            + this.shrinkNum
            + ", expandNum="
            + this.expandNum
            + ", growNum="
            + this.growNum
            + ", augmentTime="
            + this.augmentTime
            + ", expandTime="
            + this.expandTime
            + ", shrinkTime="
            + this.shrinkTime
            + ", growTime="
            + this.growTime
            + "}";
      }
   }
}
