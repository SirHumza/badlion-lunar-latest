package org.jgrapht.alg.planar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.PlanarityTestingAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.util.DoublyLinkedList;
import org.jgrapht.util.TypeUtil;

public class BoyerMyrvoldPlanarityInspector<V, E> implements PlanarityTestingAlgorithm<V, E> {
   private static final boolean DEBUG = false;
   private static final boolean PRINT_CASES = false;
   private Graph<V, E> graph;
   private int n;
   private PlanarityTestingAlgorithm.Embedding<V, E> embedding;
   private Graph<V, E> kuratowskiSubdivision;
   private List<BoyerMyrvoldPlanarityInspector<V, E>.Node> nodes;
   private List<BoyerMyrvoldPlanarityInspector<V, E>.Node> dfsTreeRoots;
   private List<BoyerMyrvoldPlanarityInspector<V, E>.Node> componentRoots;
   private List<BoyerMyrvoldPlanarityInspector<V, E>.MergeInfo> stack;
   private BoyerMyrvoldPlanarityInspector<V, E>.Node failedV;
   private boolean tested;
   private boolean planar;

   public BoyerMyrvoldPlanarityInspector(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph can't be null");
      this.n = var1.vertexSet().size();
      this.nodes = new ArrayList<>(this.n);
      this.dfsTreeRoots = new ArrayList<>();
      this.componentRoots = new ArrayList<>(this.n);
      this.stack = new ArrayList<>();
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Node createNewNode(
      Map<V, BoyerMyrvoldPlanarityInspector<V, E>.Node> var1, V var2, E var3, BoyerMyrvoldPlanarityInspector<V, E>.Node var4, int var5
   ) {
      BoyerMyrvoldPlanarityInspector.Node var6;
      if (var4 == null) {
         var6 = new BoyerMyrvoldPlanarityInspector.Node(var2, var5, 0, null, null);
         var6.outerFaceNeighbors[0] = var6.outerFaceNeighbors[1] = var6;
         this.dfsTreeRoots.add(var6);
      } else {
         BoyerMyrvoldPlanarityInspector.Edge var7 = new BoyerMyrvoldPlanarityInspector.Edge(var3, var4);
         BoyerMyrvoldPlanarityInspector.Node var8 = new BoyerMyrvoldPlanarityInspector.Node(var4.dfsIndex, var7);
         var6 = new BoyerMyrvoldPlanarityInspector.Node(var2, var5, var4.height + 1, var8, var7);
         var7.target = var6;
         this.componentRoots.add(var8);
         var4.treeEdges.add(var7);
         var6.outerFaceNeighbors[0] = var6.outerFaceNeighbors[1] = var8;
         var8.outerFaceNeighbors[0] = var8.outerFaceNeighbors[1] = var6;
      }

      this.nodes.add(var6);
      var1.put(var2, var6);
      return var6;
   }

   private int orientDfs(Map<V, BoyerMyrvoldPlanarityInspector<V, E>.Node> var1, V var2, int var3) {
      ArrayList var4 = new ArrayList();
      var4.add(new BoyerMyrvoldPlanarityInspector.OrientDfsStackInfo(var2, null, null, false));

      while (!var4.isEmpty()) {
         BoyerMyrvoldPlanarityInspector.OrientDfsStackInfo var5 = (BoyerMyrvoldPlanarityInspector.OrientDfsStackInfo)var4.remove(var4.size() - 1);
         if (var5.backtrack) {
            BoyerMyrvoldPlanarityInspector.Node var12 = (BoyerMyrvoldPlanarityInspector.Node)var1.get(var5.current);
            var12.leastAncestor = var12.lowpoint = var12.dfsIndex;

            for (BoyerMyrvoldPlanarityInspector.Edge var15 : var12.backEdges) {
               var12.leastAncestor = Math.min(var12.leastAncestor, var15.target.dfsIndex);
            }

            for (BoyerMyrvoldPlanarityInspector.Edge var16 : var12.treeEdges) {
               var12.lowpoint = Math.min(var12.lowpoint, var16.target.lowpoint);
            }

            var12.lowpoint = Math.min(var12.lowpoint, var12.leastAncestor);
         } else if (!var1.containsKey(var5.current)) {
            var4.add(new BoyerMyrvoldPlanarityInspector.OrientDfsStackInfo(var5.current, var5.parent, var5.parentEdge, true));
            BoyerMyrvoldPlanarityInspector.Node var6 = this.createNewNode(
               var1, var5.current, var5.parentEdge, (BoyerMyrvoldPlanarityInspector.Node)var1.get(var5.parent), var3
            );
            var3++;

            for (Object var8 : this.graph.edgesOf(var5.current)) {
               Object var9 = Graphs.getOppositeVertex(this.graph, (E)var8, var5.current);
               if (var1.containsKey(var9)) {
                  BoyerMyrvoldPlanarityInspector.Node var10 = (BoyerMyrvoldPlanarityInspector.Node)var1.get(var9);
                  if (!var9.equals(var5.parent)) {
                     BoyerMyrvoldPlanarityInspector.Edge var11 = new BoyerMyrvoldPlanarityInspector.Edge(var8, var6, var10);
                     var10.downEdges.add(var11);
                     var6.backEdges.add(var11);
                  }
               } else {
                  var4.add(new BoyerMyrvoldPlanarityInspector.OrientDfsStackInfo(var9, var6.graphVertex, var8, false));
               }
            }
         }
      }

      return var3;
   }

   private void orient() {
      HashMap var1 = new HashMap();
      int var2 = 0;

      for (Object var4 : this.graph.vertexSet()) {
         if (!var1.containsKey(var4)) {
            var2 = this.orientDfs(var1, (V)var4, var2);
         }
      }

      this.sortVertices();
   }

   private void sortVertices() {
      ArrayList var1 = new ArrayList<>(Collections.nCopies(this.n, null));

      for (BoyerMyrvoldPlanarityInspector.Node var3 : this.nodes) {
         int var4 = var3.lowpoint;
         if (var1.get(var4) == null) {
            var1.set(var4, new ArrayList());
         }

         ((List)var1.get(var4)).add(var3);
      }

      int var7 = 0;

      for (List var9 : var1) {
         if (var7 >= this.n) {
            break;
         }

         if (var9 != null) {
            for (BoyerMyrvoldPlanarityInspector.Node var6 : var9) {
               this.nodes.set(var7++, var6);
               if (var6.parentEdge != null) {
                  var6.listNode = var6.parentEdge.source.separatedDfsChildList.addElementLast(var6);
               }
            }
         }
      }
   }

   private boolean lazyTestPlanarity() {
      if (!this.tested) {
         this.tested = true;
         this.orient();

         for (int var1 = this.n - 1; var1 >= 0; var1--) {
            BoyerMyrvoldPlanarityInspector.Node var2 = this.nodes.get(var1);

            for (BoyerMyrvoldPlanarityInspector.Edge var4 : var2.downEdges) {
               this.walkUp(var4.source, var2, var4);
            }

            for (BoyerMyrvoldPlanarityInspector.Edge var7 : var2.treeEdges) {
               this.walkDown(var7.target.initialComponentRoot);
            }

            for (BoyerMyrvoldPlanarityInspector.Edge var8 : var2.downEdges) {
               if (!var8.embedded) {
                  this.failedV = var2;
                  return this.planar = false;
               }
            }
         }

         this.planar = true;
      }

      return this.planar;
   }

   private void mergeBiconnectedComponent() {
      BoyerMyrvoldPlanarityInspector.MergeInfo var1 = this.stack.get(this.stack.size() - 1);
      this.stack.remove(this.stack.size() - 1);
      BoyerMyrvoldPlanarityInspector.Node var2 = var1.child;
      if (var1.isInverted()) {
         var2.swapNeighbors();
      }

      BoyerMyrvoldPlanarityInspector.Node var3 = var1.parent;
      BoyerMyrvoldPlanarityInspector.Node var4 = var2.parentEdge.target;
      var3.pertinentRoots.removeNode(var2.listNode);
      var3.separatedDfsChildList.removeNode(var4.listNode);
      var3.mergeChildEdges(var2.embedded, var1.vIn, var1.vOut, var1.parentNext, var2.parentEdge);
      var3.substituteAnother(var1.parentNext, var1.childPrev);
      var1.childPrev.substitute(var2, var3);
      var2.outerFaceNeighbors[0] = var2.outerFaceNeighbors[1] = null;
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.OuterFaceCirculator embedBackEdge(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, int var2, BoyerMyrvoldPlanarityInspector<V, E>.Edge var3, BoyerMyrvoldPlanarityInspector<V, E>.Node var4
   ) {
      assert !var3.embedded;
      if (var2 == 0) {
         var1.embedded.addLast(var3);
      } else {
         var1.embedded.addFirst(var3);
      }

      BoyerMyrvoldPlanarityInspector.Node var5 = var3.source;
      var5.embedBackEdge(var3, var4);
      var5.edgeToEmbed = null;
      var5.backEdgeFlag = this.n;
      var3.embedded = true;
      var5.substitute(var4, var1);
      var1.outerFaceNeighbors[var2] = var5;
      BoyerMyrvoldPlanarityInspector.Node var6 = var5.nextOnOuterFace(var1);
      return new BoyerMyrvoldPlanarityInspector.OuterFaceCirculator(var6, var5);
   }

   private void embedShortCircuit(BoyerMyrvoldPlanarityInspector<V, E>.Node var1, int var2, BoyerMyrvoldPlanarityInspector<V, E>.OuterFaceCirculator var3) {
      BoyerMyrvoldPlanarityInspector.Node var4 = var3.getCurrent();
      BoyerMyrvoldPlanarityInspector.Node var5 = var3.getPrev();
      BoyerMyrvoldPlanarityInspector.Edge var6 = new BoyerMyrvoldPlanarityInspector.Edge(var4, var1.getParent());
      if (var2 == 0) {
         var1.embedded.addLast(var6);
         var1.outerFaceNeighbors[0] = var4;
      } else {
         var1.embedded.addFirst(var6);
         var1.outerFaceNeighbors[1] = var4;
      }

      var4.embedBackEdge(var6, var5);
      var4.substitute(var5, var1);
   }

   private void walkDown(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
      for (int var2 = 0; var2 < 2 && this.stack.isEmpty(); var2++) {
         int var3 = var2;
         BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var4 = var1.iterator(var3);
         BoyerMyrvoldPlanarityInspector.Node var5 = var4.next();

         while (var5 != var1) {
            if (var5.hasBackEdgeWrtTo(var1)) {
               BoyerMyrvoldPlanarityInspector.Node var6 = var4.getPrev();

               while (!this.stack.isEmpty()) {
                  this.mergeBiconnectedComponent();
               }

               var4 = this.embedBackEdge(var1, var2, var5.edgeToEmbed, var6);
            }

            if (!var5.pertinentRoots.isEmpty()) {
               int var12 = var3;
               BoyerMyrvoldPlanarityInspector.Node var7 = var5.pertinentRoots.getFirst();
               BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var8 = this.getActiveSuccessorOnOuterFace(var7, var1, 0);
               BoyerMyrvoldPlanarityInspector.Node var9 = var8.getCurrent();
               BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var10 = this.getActiveSuccessorOnOuterFace(var7, var1, 1);
               BoyerMyrvoldPlanarityInspector.Node var11 = var10.getCurrent();
               if (var9.isInternallyActiveWrtTo(var1)) {
                  var3 = 0;
               } else if (var11.isInternallyActiveWrtTo(var1)) {
                  var3 = 1;
               } else if (var9.isPertinentWrtTo(var1)) {
                  var3 = 0;
               } else {
                  var3 = 1;
               }

               if (var3 == 0) {
                  this.stack.add(new BoyerMyrvoldPlanarityInspector.MergeInfo(var5, var4.next(), var7, var7.outerFaceNeighbors[1], var12, var3));
                  var5 = var9;
                  var4 = var8;
                  if (!var11.hasRootNeighbor()) {
                     this.embedShortCircuit(var7, 1, var10);
                  }
               } else {
                  this.stack.add(new BoyerMyrvoldPlanarityInspector.MergeInfo(var5, var4.next(), var7, var7.outerFaceNeighbors[0], var12, var3));
                  var5 = var11;
                  var4 = var10;
                  if (!var9.hasRootNeighbor()) {
                     this.embedShortCircuit(var7, 0, var8);
                  }
               }
            } else {
               if (!var5.isInactiveWrtTo(var1)) {
                  if (!var5.hasRootNeighbor() && this.stack.isEmpty()) {
                     this.embedShortCircuit(var1, var2, var4);
                  }
                  break;
               }

               var5 = var4.next();
            }
         }
      }
   }

   private void walkUp(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2, BoyerMyrvoldPlanarityInspector<V, E>.Edge var3
   ) {
      int var4 = var2.dfsIndex;
      var1.backEdgeFlag = var4;
      var1.edgeToEmbed = var3;
      BoyerMyrvoldPlanarityInspector.Node var5 = var1.outerFaceNeighbors[0];
      BoyerMyrvoldPlanarityInspector.Node var6 = var1.outerFaceNeighbors[1];
      BoyerMyrvoldPlanarityInspector.Node var7 = var1;
      BoyerMyrvoldPlanarityInspector.Node var8 = var1;
      var1.visited = var4;

      while (var5 != var2 && !var5.isVisitedWrtTo(var2) && !var6.isVisitedWrtTo(var2)) {
         var5.visited = var6.visited = var4;
         BoyerMyrvoldPlanarityInspector.Node var9 = null;
         if (var5.isRootVertex()) {
            var9 = var5;
         } else if (var6.isRootVertex()) {
            var9 = var6;
         }

         if (var9 != null) {
            BoyerMyrvoldPlanarityInspector.Node var13 = var9.parentEdge.target;
            BoyerMyrvoldPlanarityInspector.Node var11 = var9.parentEdge.source;
            if (var11 == var2) {
               break;
            }

            if (var13.lowpoint < var2.dfsIndex) {
               var9.listNode = var11.pertinentRoots.addElementLast(var9);
            } else {
               var9.listNode = var11.pertinentRoots.addElementFirst(var9);
            }

            var11.visited = var4;
            var8 = var11;
            var7 = var11;
            var5 = var11.outerFaceNeighbors[0];
            var6 = var11.outerFaceNeighbors[1];
         } else {
            BoyerMyrvoldPlanarityInspector.Node var10 = var5;
            var5 = var5.nextOnOuterFace(var7);
            var7 = var10;
            var10 = var6;
            var6 = var6.nextOnOuterFace(var8);
            var8 = var10;
         }
      }
   }

   private PlanarityTestingAlgorithm.Embedding<V, E> lazyComputeEmbedding() {
      this.lazyTestPlanarity();
      if (!this.planar) {
         throw new IllegalArgumentException("Input graph is not planar, can't compute graph embedding");
      }

      if (this.embedding == null) {
         for (BoyerMyrvoldPlanarityInspector.Node var2 : this.dfsTreeRoots) {
            this.cleanUpDfs(var2);
         }

         HashMap var7 = new HashMap();

         for (BoyerMyrvoldPlanarityInspector.Node var3 : this.nodes) {
            for (BoyerMyrvoldPlanarityInspector.Node var5 : var3.separatedDfsChildList) {
               BoyerMyrvoldPlanarityInspector.Node var6 = var5.initialComponentRoot;
               var3.embedded.append(var6.embedded);
            }

            ArrayList var9 = new ArrayList(var3.embedded.size());

            for (BoyerMyrvoldPlanarityInspector.Edge var11 : var3.embedded) {
               var9.add(var11.graphEdge);
            }

            var7.put(var3.graphVertex, var9);
         }

         this.embedding = new PlanarityTestingAlgorithm.EmbeddingImpl<>(this.graph, var7);
      }

      return this.embedding;
   }

   private void printBiconnectedComponent(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
      StringBuilder var2 = new StringBuilder(var1.toString(false));
      BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var3 = var1.iterator(0);
      BoyerMyrvoldPlanarityInspector.Node var4 = var3.next();
      BoyerMyrvoldPlanarityInspector.Node var5 = var4;

      do {
         var2.append(" -> ").append(var4.toString(false));
         var4 = var3.next();
      } while (var4 != var5);

      System.out.println("Biconnected component after merge: " + var2.toString());
   }

   private void printState() {
      System.out.println("\nPrinting state:");
      System.out.println("Dfs roots: " + this.dfsTreeRoots);
      System.out.println("Nodes:");

      for (BoyerMyrvoldPlanarityInspector.Node var2 : this.nodes) {
         System.out.println(var2.toString(true));
      }

      System.out.println("Virtual nodes:");

      for (BoyerMyrvoldPlanarityInspector.Node var8 : this.componentRoots) {
         System.out.println(var8.toString(true));
      }

      ArrayList var7 = new ArrayList();

      for (BoyerMyrvoldPlanarityInspector.Node var3 : this.nodes) {
         for (BoyerMyrvoldPlanarityInspector.Edge var5 : var3.treeEdges) {
            if (var5.sign < 0) {
               var7.add(var5);
            }
         }
      }

      System.out.println("Inverted edges = " + var7);
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.OuterFaceCirculator selectOnOuterFace(
      Predicate<BoyerMyrvoldPlanarityInspector<V, E>.Node> var1,
      BoyerMyrvoldPlanarityInspector<V, E>.Node var2,
      BoyerMyrvoldPlanarityInspector<V, E>.Node var3,
      int var4
   ) {
      BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var5 = var2.iterator(var4);
      BoyerMyrvoldPlanarityInspector.Node var6 = var5.next();

      while (var6 != var3 && !var1.test(var6)) {
         var6 = var5.next();
      }

      return var5;
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.OuterFaceCirculator getActiveSuccessorOnOuterFace(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2, int var3
   ) {
      return this.selectOnOuterFace(var1x -> var1x.isActiveWrtTo(var2), var1, var1, var3);
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.OuterFaceCirculator getExternallyActiveSuccessorOnOuterFace(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3, int var4
   ) {
      return this.selectOnOuterFace(var1x -> var1x.isExternallyActiveWrtTo(var3), var1, var2, var4);
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Node getComponentRoot(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
      return this.selectOnOuterFace(BoyerMyrvoldPlanarityInspector.Node::isRootVertex, var1, var1, 0).getCurrent();
   }

   private void addPathEdges(
      Set<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var1, BoyerMyrvoldPlanarityInspector<V, E>.Edge var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3
   ) {
      var1.add(var2);

      for (BoyerMyrvoldPlanarityInspector.Node var4 = var2.source; var4 != var3; var4 = var4.getParent()) {
         var1.add(var4.parentEdge);
      }
   }

   private void addPathEdges(
      Set<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3
   ) {
      if (var2 != var3) {
         this.addPathEdges(var1, var2.parentEdge, var3);
      }
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Edge searchEdge(BoyerMyrvoldPlanarityInspector<V, E>.Node var1, int var2) {
      return this.searchEdge(var1, var2, null);
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Edge searchEdge(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, int var2, BoyerMyrvoldPlanarityInspector<V, E>.Edge var3
   ) {
      Predicate var4 = var2x -> var3 == var2x ? false : var2x.target.height < var2;
      return this.searchEdge(var1, var4);
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Edge searchEdge(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, Predicate<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var2
   ) {
      for (BoyerMyrvoldPlanarityInspector.Node var4 : var1.separatedDfsChildList) {
         BoyerMyrvoldPlanarityInspector.Edge var5 = this.searchSubtreeDfs(var4, var2);
         if (var5 != null) {
            return var5;
         }
      }

      for (BoyerMyrvoldPlanarityInspector.Edge var7 : var1.backEdges) {
         if (var2.test(var7)) {
            return var7;
         }
      }

      return null;
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Edge searchSubtreeDfs(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, Predicate<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var2
   ) {
      ArrayList var3 = new ArrayList();
      var3.add(var1);

      while (!var3.isEmpty()) {
         BoyerMyrvoldPlanarityInspector.Node var4 = (BoyerMyrvoldPlanarityInspector.Node)var3.remove(var3.size() - 1);

         for (BoyerMyrvoldPlanarityInspector.Edge var6 : var4.backEdges) {
            if (var2.test(var6)) {
               return var6;
            }
         }

         for (BoyerMyrvoldPlanarityInspector.Edge var8 : var4.treeEdges) {
            var3.add(var8.target);
         }
      }

      return null;
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Node highest(BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2) {
      return var1.height > var2.height ? var1 : var2;
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Node lowest(BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2) {
      return var1.height < var2.height ? var1 : var2;
   }

   private void setBoundaryDepth(BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2, int var3, int var4) {
      BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var5 = var1.iterator(var3);
      BoyerMyrvoldPlanarityInspector.Node var6 = var5.next();
      int var7 = var4;

      while (var6 != var2) {
         var6.boundaryHeight = var7;
         var7 += var4;
         var6 = var5.next();
      }
   }

   private void clearVisited() {
      this.nodes.forEach(var0 -> var0.visited = 0);
      this.componentRoots.forEach(var0 -> var0.visited = 0);
   }

   private boolean findPathDfs(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1,
      BoyerMyrvoldPlanarityInspector<V, E>.Edge var2,
      Predicate<BoyerMyrvoldPlanarityInspector<V, E>.Node> var3,
      Predicate<BoyerMyrvoldPlanarityInspector<V, E>.Node> var4,
      List<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var5
   ) {
      ArrayList var6 = new ArrayList();
      var6.add(new BoyerMyrvoldPlanarityInspector.SearchInfo(var1, var2, false));

      while (!var6.isEmpty()) {
         BoyerMyrvoldPlanarityInspector.SearchInfo var7 = (BoyerMyrvoldPlanarityInspector.SearchInfo)var6.remove(var6.size() - 1);
         if (var4.test(var7.current)) {
            var5.add(var7.prevEdge);
            var5.remove(0);
            return true;
         }

         if (var7.backtrack) {
            var5.remove(var5.size() - 1);
         } else if (var7.current.visited == 0) {
            var7.current.visited = 1;
            var6.add(new BoyerMyrvoldPlanarityInspector.SearchInfo(var7.current, var7.prevEdge, true));
            var5.add(var7.prevEdge);
            DoublyLinkedList.NodeIterator var8 = var7.current.embedded.reverseCircularIterator(var7.prevEdge);

            while (var8.hasNext()) {
               BoyerMyrvoldPlanarityInspector.Edge var9 = (BoyerMyrvoldPlanarityInspector.Edge)var8.next();
               BoyerMyrvoldPlanarityInspector.Node var10 = var9.getOpposite(var7.current);
               if (var3.test(var10) && var10.visited == 0 || var4.test(var10)) {
                  var6.add(new BoyerMyrvoldPlanarityInspector.SearchInfo(var10, var9, false));
               }
            }
         }
      }

      return false;
   }

   private List<BoyerMyrvoldPlanarityInspector<V, E>.Edge> findHighestObstructingPath(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2
   ) {
      this.clearVisited();
      ArrayList var3 = new ArrayList();
      BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var4 = var1.iterator(0);

      for (BoyerMyrvoldPlanarityInspector.Node var5 = var4.next(); var5 != var2; var5 = var4.next()) {
         if (this.findPathDfs(var5, var5.embedded.getFirst(), var0 -> !var0.marked, var0 -> var0.boundaryHeight < 0, var3)) {
            return var3;
         }
      }

      return var3;
   }

   private Graph<V, E> finish(Set<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var1) {
      HashSet var2 = new HashSet();
      HashSet var3 = new HashSet();
      var1.forEach(var2x -> {
         var2.add(var2x.graphEdge);
         var3.add(var2x.target.graphVertex);
         var3.add(var2x.source.graphVertex);
      });
      this.kuratowskiSubdivision = new AsSubgraph<>(this.graph, var3, var2);
      return this.kuratowskiSubdivision;
   }

   private void addBoundaryEdges(Set<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2) {
      BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var3 = var2.iterator(0);

      BoyerMyrvoldPlanarityInspector.Node var4;
      do {
         BoyerMyrvoldPlanarityInspector.Edge var5 = var3.edgeToNext();
         var5.source.marked = var5.target.marked = true;
         var1.add(var5);
         var4 = var3.next();
      } while (var4 != var2);
   }

   private void kuratowskiCleanUp() {
      for (BoyerMyrvoldPlanarityInspector.Node var2 : this.dfsTreeRoots) {
         this.cleanUpDfs(var2);
      }

      for (BoyerMyrvoldPlanarityInspector.Node var4 : this.componentRoots) {
         if (var4.outerFaceNeighbors[0] != null) {
            var4.removeShortCircuitEdges();
            this.fixBoundaryOrder(var4);
         }
      }
   }

   private void cleanUpDfs(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
      ArrayList var2 = new ArrayList();
      var2.add(Pair.of(var1, 1));

      while (!var2.isEmpty()) {
         Pair var3 = (Pair)var2.remove(var2.size() - 1);
         BoyerMyrvoldPlanarityInspector.Node var4 = (BoyerMyrvoldPlanarityInspector.Node)var3.getFirst();
         int var5 = (Integer)var3.getSecond();
         if (var5 < 0) {
            var4.embedded.invert();
         }

         var4.removeShortCircuitEdges();

         for (BoyerMyrvoldPlanarityInspector.Node var7 : var4.separatedDfsChildList) {
            var7.parentEdge.sign = var5;
         }

         for (BoyerMyrvoldPlanarityInspector.Edge var9 : var4.treeEdges) {
            var2.add(Pair.of(var9.target, var5 * var9.sign));
         }
      }
   }

   private void fixBoundaryOrder(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
      if (var1.embedded.size() >= 2) {
         BoyerMyrvoldPlanarityInspector.Node var2 = var1.getParent();
         BoyerMyrvoldPlanarityInspector.Edge var3 = var1.embedded.getLast();
         BoyerMyrvoldPlanarityInspector.Edge var4 = var1.embedded.getFirst();
         BoyerMyrvoldPlanarityInspector.Node var5 = var3.getOpposite(var2);
         BoyerMyrvoldPlanarityInspector.Node var6 = var4.getOpposite(var2);
         var1.outerFaceNeighbors[0] = var5;
         var1.outerFaceNeighbors[1] = var6;
         var5.outerFaceNeighbors[1] = var1;
         var6.outerFaceNeighbors[0] = var1;
         BoyerMyrvoldPlanarityInspector.Node var7 = var1.outerFaceNeighbors[0];

         do {
            var3 = var7.embedded.getLast();
            var4 = var7.embedded.getFirst();
            var5 = var3.getOpposite(var7);
            var6 = var4.getOpposite(var7);
            if (var6 != var2) {
               var7.outerFaceNeighbors[1] = var6;
            }

            if (var5 != var2) {
               var7.outerFaceNeighbors[0] = var5;
            }

            var7 = var5;
         } while (var7 != var2);
      }
   }

   private void removeUp(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1,
      BoyerMyrvoldPlanarityInspector<V, E>.Node var2,
      int var3,
      Set<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var4
   ) {
      if (var1 != var2) {
         BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var5 = var1.iterator(var3);

         BoyerMyrvoldPlanarityInspector.Node var6;
         do {
            BoyerMyrvoldPlanarityInspector.Edge var7 = var5.edgeToNext();
            var4.remove(var7);
            var6 = var5.next();
         } while (var6 != var2);
      }
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Node getNextOnPath(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Edge var2
   ) {
      if (var2.source == var1) {
         return null;
      }

      BoyerMyrvoldPlanarityInspector.Node var3 = var2.source;

      for (BoyerMyrvoldPlanarityInspector.Node var4 = var2.source.getParent(); var4 != var1; var4 = var4.getParent()) {
         var3 = var4;
      }

      return var3;
   }

   private List<BoyerMyrvoldPlanarityInspector<V, E>.Edge> findPathToV(
      List<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2
   ) {
      this.clearVisited();
      int var3 = 0;
      BoyerMyrvoldPlanarityInspector.Edge var4 = (BoyerMyrvoldPlanarityInspector.Edge)var1.get(var3);
      BoyerMyrvoldPlanarityInspector.Node var5 = var4.source.boundaryHeight != 0 ? var4.target : var4.source;
      ArrayList var6 = new ArrayList();

      while (var3 < var1.size() - 1) {
         if (this.findPathDfs(var5, var4, var0 -> !var0.marked, var1x -> var1x == var2, var6)) {
            return var6;
         }

         var4 = (BoyerMyrvoldPlanarityInspector.Edge)var1.get(++var3);
         var5 = var4.getOpposite(var5);
      }

      return var6;
   }

   private boolean firstStrictlyHigher(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3
   ) {
      return var1.height > var2.height && var1.height > var3.height;
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Edge checkComponentForFailedEdge(
      BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2
   ) {
      BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var3 = this.getExternallyActiveSuccessorOnOuterFace(var1, var1, var2, 0);
      BoyerMyrvoldPlanarityInspector.Node var4 = var3.getCurrent();
      BoyerMyrvoldPlanarityInspector.OuterFaceCirculator var5 = this.getExternallyActiveSuccessorOnOuterFace(var1, var1, var2, 1);
      BoyerMyrvoldPlanarityInspector.Node var6 = var5.getCurrent();
      if (var4 != var1 && var4 != var6) {
         for (BoyerMyrvoldPlanarityInspector.Node var7 = var3.next(); var7 != var6; var7 = var3.next()) {
            if (var7.isPertinentWrtTo(var2)) {
               return this.searchEdge(var7, var1x -> var1x.target == var2 && !var1x.embedded);
            }
         }
      }

      return null;
   }

   private BoyerMyrvoldPlanarityInspector<V, E>.Edge findFailedEdge(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
      if (this.stack.isEmpty()) {
         for (BoyerMyrvoldPlanarityInspector.Node var3 : var1.separatedDfsChildList) {
            BoyerMyrvoldPlanarityInspector.Node var4 = var3.initialComponentRoot;
            BoyerMyrvoldPlanarityInspector.Edge var5 = this.checkComponentForFailedEdge(var4, var1);
            if (var5 != null) {
               return var5;
            }
         }

         return null;
      } else {
         BoyerMyrvoldPlanarityInspector.MergeInfo var2 = this.stack.get(this.stack.size() - 1);
         return this.checkComponentForFailedEdge(var2.child, var1);
      }
   }

   private Graph<V, E> lazyExtractKuratowskiSubdivision() {
      if (this.kuratowskiSubdivision != null) {
         return this.kuratowskiSubdivision;
      }

      this.kuratowskiCleanUp();
      HashSet var1 = new HashSet();
      BoyerMyrvoldPlanarityInspector.Edge var2 = this.findFailedEdge(this.failedV);
      assert var2 != null;
      BoyerMyrvoldPlanarityInspector.Node var5 = var2.target;
      BoyerMyrvoldPlanarityInspector.Node var6 = var2.source;

      while (true) {
         BoyerMyrvoldPlanarityInspector.Node var7 = this.getComponentRoot(var6);
         BoyerMyrvoldPlanarityInspector.Node var3 = this.getExternallyActiveSuccessorOnOuterFace(var6, var7, var5, 1).getCurrent();
         BoyerMyrvoldPlanarityInspector.Node var4 = this.getExternallyActiveSuccessorOnOuterFace(var6, var7, var5, 0).getCurrent();
         if (var3.isRootVertex()) {
            var6 = var3.getParent();
         } else {
            if (!var4.isRootVertex()) {
               var7 = this.getComponentRoot(var6);
               BoyerMyrvoldPlanarityInspector.Edge var8 = this.searchEdge(var3, var5.height);
               BoyerMyrvoldPlanarityInspector.Edge var9 = this.searchEdge(var4, var5.height);
               BoyerMyrvoldPlanarityInspector.Node var10 = this.lowest(var8.target, var9.target);
               BoyerMyrvoldPlanarityInspector.Node var11 = this.highest(var8.target, var9.target);
               this.addPathEdges(var1, var8, var3);
               this.addPathEdges(var1, var9, var4);
               this.addBoundaryEdges(var1, var7);
               if (var7.getParent() != var5) {
                  this.addPathEdges(var1, var7.getParent(), var10);
                  this.addPathEdges(var1, var2, var6);
                  return this.finish(var1);
               }

               BoyerMyrvoldPlanarityInspector.Node var12 = this.getNextOnPath(var6, var2);
               BoyerMyrvoldPlanarityInspector.Edge var13 = null;
               if (var12 != null) {
                  var13 = this.searchSubtreeDfs(var12, var2x -> var2x.target.height < var5.height && var2x != var2);
               }

               if (var13 != null) {
                  this.addPathEdges(var1, var13, var6);
                  this.addPathEdges(var1, var2, var6);
                  BoyerMyrvoldPlanarityInspector.Node var22 = this.highest(var8.target, this.highest(var9.target, var13.target));
                  BoyerMyrvoldPlanarityInspector.Node var23 = this.lowest(var8.target, this.lowest(var9.target, var13.target));
                  this.addPathEdges(var1, var22, var23);
                  return this.finish(var1);
               }

               this.setBoundaryDepth(var7, var6, 0, 1);
               this.setBoundaryDepth(var7, var6, 1, -1);
               assert var3.boundaryHeight > 0;
               List var14 = this.findHighestObstructingPath(var7, var6);
               assert !var14.isEmpty();
               BoyerMyrvoldPlanarityInspector.Edge var15 = (BoyerMyrvoldPlanarityInspector.Edge)var14.get(0);
               BoyerMyrvoldPlanarityInspector.Edge var16 = (BoyerMyrvoldPlanarityInspector.Edge)var14.get(var14.size() - 1);
               BoyerMyrvoldPlanarityInspector.Node var17 = var15.source.boundaryHeight > 0 ? var15.source : var15.target;
               BoyerMyrvoldPlanarityInspector.Node var18 = var16.source.boundaryHeight < 0 ? var16.source : var16.target;
               if (var17.boundaryHeight >= var3.boundaryHeight && var18.boundaryHeight <= var4.boundaryHeight) {
                  var14.forEach(var0 -> var0.source.marked = var0.target.marked = true);
                  List var24 = this.findPathToV(var14, var5);
                  if (!var24.isEmpty()) {
                     this.removeUp(var3, var7, 1, var1);
                     this.removeUp(var4, var7, 0, var1);
                     var1.addAll(var14);
                     var1.addAll(var24);
                     this.addPathEdges(var1, var5, var10);
                     this.addPathEdges(var1, var2, var6);
                     return this.finish(var1);
                  }

                  BoyerMyrvoldPlanarityInspector.Edge var20 = this.searchEdge(var6, var5.height, var2);
                  assert var20 != null;
                  this.addPathEdges(var1, var20, var6);
                  if (this.firstStrictlyHigher(var20.target, var8.target, var9.target)) {
                     this.addPathEdges(var1, var7.getParent(), var10);
                  } else if (this.firstStrictlyHigher(var8.target, var9.target, var20.target)) {
                     this.removeUp(var7, var3, 0, var1);
                     this.removeUp(var6, var18, 0, var1);
                     var1.addAll(var14);
                     this.addPathEdges(var1, var2, var6);
                     this.addPathEdges(var1, var5, this.lowest(var10, var20.target));
                  } else if (this.firstStrictlyHigher(var9.target, var8.target, var20.target)) {
                     this.removeUp(var4, var7, 0, var1);
                     this.removeUp(var17, var6, 0, var1);
                     var1.addAll(var14);
                     this.addPathEdges(var1, var2, var6);
                     this.addPathEdges(var1, var5, this.lowest(var10, var20.target));
                  } else if (var17.boundaryHeight > var3.boundaryHeight) {
                     this.removeUp(var6, var18, 0, var1);
                     var1.addAll(var14);
                     this.addPathEdges(var1, var2, var6);
                     this.addPathEdges(var1, this.highest(var11, var20.target), this.lowest(var10, var20.target));
                  } else if (var18.boundaryHeight < var4.boundaryHeight) {
                     this.removeUp(var17, var6, 0, var1);
                     var1.addAll(var14);
                     this.addPathEdges(var1, var2, var6);
                     this.addPathEdges(var1, this.highest(var11, var20.target), this.lowest(var10, var20.target));
                  } else {
                     var1.addAll(var14);
                     this.addPathEdges(var1, var5, this.lowest(var10, var20.target));
                     this.addPathEdges(var1, var2, var6);
                  }

                  return this.finish(var1);
               }

               if (var18.boundaryHeight > var4.boundaryHeight) {
                  BoyerMyrvoldPlanarityInspector.Node var19 = var17.boundaryHeight < var3.boundaryHeight ? var17 : var3;
                  this.removeUp(var19, var7, 1, var1);
               } else {
                  this.removeUp(var4, var7, 0, var1);
               }

               this.addPathEdges(var1, var2, var6);
               var1.addAll(var14);
               this.addPathEdges(var1, var5, var10);
               return this.finish(var1);
            }

            var6 = var4.getParent();
         }
      }
   }

   @Override
   public boolean isPlanar() {
      return this.lazyTestPlanarity();
   }

   @Override
   public PlanarityTestingAlgorithm.Embedding<V, E> getEmbedding() {
      if (this.isPlanar()) {
         return this.lazyComputeEmbedding();
      } else {
         throw new IllegalArgumentException("Graph is not planar");
      }
   }

   @Override
   public Graph<V, E> getKuratowskiSubdivision() {
      if (this.isPlanar()) {
         throw new IllegalArgumentException("Graph is planar");
      } else {
         return this.lazyExtractKuratowskiSubdivision();
      }
   }

   private class Edge {
      E graphEdge;
      BoyerMyrvoldPlanarityInspector<V, E>.Node source;
      BoyerMyrvoldPlanarityInspector<V, E>.Node target;
      int sign;
      boolean embedded;
      boolean shortCircuit;

      Edge(BoyerMyrvoldPlanarityInspector<V, E>.Node var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3) {
         this(null, var2, var3);
         this.shortCircuit = true;
         this.embedded = true;
      }

      Edge(E var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3) {
         this(var2, var3, null);
      }

      Edge(E var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3, BoyerMyrvoldPlanarityInspector<V, E>.Node var4) {
         this.graphEdge = (E)var2;
         this.source = var3;
         this.target = var4;
         this.sign = 1;
      }

      boolean isIncidentTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return this.source == var1 || this.target == var1;
      }

      BoyerMyrvoldPlanarityInspector<V, E>.Node getOpposite(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         assert this.isIncidentTo(var1);
         return this.source == var1 ? this.target : this.source;
      }

      @Override
      public String toString() {
         String var1 = "%s -> %s";
         if (this.shortCircuit) {
            var1 = "%s ~ %s";
         }

         return String.format(var1, this.source.toString(false), this.target.toString(false));
      }
   }

   private class MergeInfo {
      BoyerMyrvoldPlanarityInspector<V, E>.Node parent;
      BoyerMyrvoldPlanarityInspector<V, E>.Node parentNext;
      BoyerMyrvoldPlanarityInspector<V, E>.Node child;
      BoyerMyrvoldPlanarityInspector<V, E>.Node childPrev;
      int vIn;
      int vOut;

      MergeInfo(
         BoyerMyrvoldPlanarityInspector<V, E>.Node var2,
         BoyerMyrvoldPlanarityInspector<V, E>.Node var3,
         BoyerMyrvoldPlanarityInspector<V, E>.Node var4,
         BoyerMyrvoldPlanarityInspector<V, E>.Node var5,
         int var6,
         int var7
      ) {
         this.parent = var2;
         this.parentNext = var3;
         this.child = var4;
         this.childPrev = var5;
         this.vIn = var6;
         this.vOut = var7;
      }

      boolean isInverted() {
         return this.vIn != this.vOut;
      }

      @Override
      public String toString() {
         return String.format(
            "Parent dir = {%s -> %s}, child_dir = {%s -> %s}, inverted = %b, vIn = %d, vOut = %d",
            this.parent.toString(false),
            this.parentNext.toString(false),
            this.childPrev.toString(false),
            this.child.toString(false),
            this.isInverted(),
            this.vIn,
            this.vOut
         );
      }
   }

   private class Node {
      V graphVertex;
      boolean rootVertex;
      int dfsIndex;
      int height;
      int lowpoint;
      int leastAncestor;
      int visited;
      int backEdgeFlag;
      int boundaryHeight;
      boolean marked;
      BoyerMyrvoldPlanarityInspector<V, E>.Edge parentEdge;
      BoyerMyrvoldPlanarityInspector<V, E>.Edge edgeToEmbed;
      BoyerMyrvoldPlanarityInspector<V, E>.Node initialComponentRoot;
      BoyerMyrvoldPlanarityInspector<V, E>.Node[] outerFaceNeighbors;
      DoublyLinkedList<BoyerMyrvoldPlanarityInspector<V, E>.Node> separatedDfsChildList;
      DoublyLinkedList<BoyerMyrvoldPlanarityInspector<V, E>.Node> pertinentRoots;
      List<BoyerMyrvoldPlanarityInspector<V, E>.Edge> treeEdges;
      List<BoyerMyrvoldPlanarityInspector<V, E>.Edge> downEdges;
      List<BoyerMyrvoldPlanarityInspector<V, E>.Edge> backEdges;
      DoublyLinkedList.ListNode<BoyerMyrvoldPlanarityInspector<V, E>.Node> listNode;
      DoublyLinkedList<BoyerMyrvoldPlanarityInspector<V, E>.Edge> embedded;

      Node(V var2, int var3, int var4, BoyerMyrvoldPlanarityInspector<V, E>.Node var5, BoyerMyrvoldPlanarityInspector<V, E>.Edge var6) {
         this(var2, var3, var6, false);
         this.height = var4;
         this.initialComponentRoot = var5;
      }

      Node(int var2, BoyerMyrvoldPlanarityInspector<V, E>.Edge var3) {
         this(null, var2, var3, true);
      }

      Node(V var2, int var3, BoyerMyrvoldPlanarityInspector<V, E>.Edge var4, boolean var5) {
         this.graphVertex = (V)var2;
         this.dfsIndex = var3;
         this.parentEdge = var4;
         this.rootVertex = var5;
         this.outerFaceNeighbors = TypeUtil.uncheckedCast(Array.newInstance(BoyerMyrvoldPlanarityInspector.Node.class, 2));
         this.embedded = new DoublyLinkedList<>();
         if (var4 != null) {
            this.embedded.add(var4);
         }

         this.visited = this.backEdgeFlag = BoyerMyrvoldPlanarityInspector.this.n;
         if (!var5) {
            this.separatedDfsChildList = new DoublyLinkedList<>();
            this.pertinentRoots = new DoublyLinkedList<>();
            this.treeEdges = new ArrayList<>();
            this.downEdges = new ArrayList<>();
            this.backEdges = new ArrayList<>();
         }
      }

      boolean isVisitedWrtTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return var1.dfsIndex == this.visited;
      }

      boolean isPertinentWrtTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return this.backEdgeFlag == var1.dfsIndex || !this.pertinentRoots.isEmpty();
      }

      boolean hasBackEdgeWrtTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return this.backEdgeFlag == var1.dfsIndex;
      }

      boolean isExternallyActiveWrtTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return this.leastAncestor < var1.dfsIndex || !this.separatedDfsChildList.isEmpty() && this.separatedDfsChildList.getFirst().lowpoint < var1.dfsIndex;
      }

      boolean isRootVertex() {
         return this.rootVertex;
      }

      boolean isInternallyActiveWrtTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return this.isPertinentWrtTo(var1) && !this.isExternallyActiveWrtTo(var1);
      }

      boolean isInactiveWrtTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return !this.isExternallyActiveWrtTo(var1) && !this.isPertinentWrtTo(var1);
      }

      boolean isActiveWrtTo(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return !this.isInactiveWrtTo(var1);
      }

      BoyerMyrvoldPlanarityInspector<V, E>.OuterFaceCirculator iterator(int var1) {
         return BoyerMyrvoldPlanarityInspector.this.new OuterFaceCirculator(this.outerFaceNeighbors[var1], this);
      }

      void removeShortCircuitEdges() {
         this.embedded.removeIf(var0 -> var0.shortCircuit);
      }

      BoyerMyrvoldPlanarityInspector<V, E>.Node getParent() {
         return this.parentEdge == null ? null : this.parentEdge.source;
      }

      void checkIsAdjacent(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         assert var1 == this.outerFaceNeighbors[0] || var1 == this.outerFaceNeighbors[1];
      }

      void swapNeighbors() {
         BoyerMyrvoldPlanarityInspector.Node var1 = this.outerFaceNeighbors[0];
         this.outerFaceNeighbors[0] = this.outerFaceNeighbors[1];
         this.outerFaceNeighbors[1] = var1;
      }

      void substitute(BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2) {
         this.checkIsAdjacent(var1);
         if (this.outerFaceNeighbors[0] == var1) {
            this.outerFaceNeighbors[0] = var2;
         } else {
            this.outerFaceNeighbors[1] = var2;
         }
      }

      void substituteAnother(BoyerMyrvoldPlanarityInspector<V, E>.Node var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2) {
         this.checkIsAdjacent(var1);
         if (this.outerFaceNeighbors[0] == var1) {
            this.outerFaceNeighbors[1] = var2;
         } else {
            this.outerFaceNeighbors[0] = var2;
         }
      }

      boolean hasRootNeighbor() {
         return this.outerFaceNeighbors[0].isRootVertex() || this.outerFaceNeighbors[1].isRootVertex();
      }

      BoyerMyrvoldPlanarityInspector<V, E>.Node nextOnOuterFace(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         this.checkIsAdjacent(var1);
         return this.outerFaceNeighbors[0] == var1 ? this.outerFaceNeighbors[1] : this.outerFaceNeighbors[0];
      }

      void embedBackEdge(BoyerMyrvoldPlanarityInspector<V, E>.Edge var1, BoyerMyrvoldPlanarityInspector<V, E>.Node var2) {
         assert !this.embedded.isEmpty();
         if (var2.isRootVertex()) {
            var2 = var2.getParent();
         }

         BoyerMyrvoldPlanarityInspector.Edge var3 = this.embedded.getFirst();
         if (var3.getOpposite(this) == var2) {
            this.embedded.addFirst(var1);
         } else {
            this.embedded.addLast(var1);
         }
      }

      void mergeChildEdges(
         DoublyLinkedList<BoyerMyrvoldPlanarityInspector<V, E>.Edge> var1,
         int var2,
         int var3,
         BoyerMyrvoldPlanarityInspector<V, E>.Node var4,
         BoyerMyrvoldPlanarityInspector<V, E>.Edge var5
      ) {
         assert !this.embedded.isEmpty();
         BoyerMyrvoldPlanarityInspector.Node var6 = this.embedded.getFirst().getOpposite(this);
         boolean var7 = var6 != var4;
         boolean var8 = false;
         boolean var9 = false;
         if (var2 == 0) {
            if (var3 == 0) {
               if (!var7) {
                  var8 = true;
                  var9 = true;
               }
            } else if (var7) {
               var9 = true;
            } else {
               var8 = true;
            }
         } else if (var3 == 0) {
            if (!var7) {
               var8 = true;
               var9 = true;
            }
         } else if (var7) {
            var9 = true;
         } else {
            var8 = true;
         }

         if (var9) {
            var5.sign = -1;
            var1.invert();
         }

         if (var8) {
            this.embedded.append(var1);
         } else {
            this.embedded.prepend(var1);
         }
      }

      @Override
      public String toString() {
         String var1 = this.outerFaceNeighbors[0] == null ? "null" : this.outerFaceNeighbors[0].toString(false);
         String var2 = this.outerFaceNeighbors[1] == null ? "null" : this.outerFaceNeighbors[1].toString(false);
         String var3 = "null";
         if (this.separatedDfsChildList != null) {
            StringBuilder var4 = new StringBuilder("{");
            this.separatedDfsChildList.forEach(var1x -> var4.append(var1x.toString(false)).append(", "));
            var3 = var4.append("}").toString();
         }

         return this.rootVertex
            ? String.format(
               "R {%s}: neighbors = [%s, %s], embedded = %s, visited = %d, back_edge_flag = %d, dfs_index = %d",
               this.toString(false),
               var1,
               var2,
               this.embedded.toString(),
               this.visited,
               this.backEdgeFlag,
               this.dfsIndex
            )
            : String.format(
               "{%s}:  neighbors = [%s, %s], embedded = %s, visited = %d, back_edge_flag = %d, dfs_index = %d, separated = %s, tree_edges = %s, down_edges = %s, back_edges = %s, parent = %s, lowpoint = %d, least_ancestor = %d",
               this.toString(false),
               var1,
               var2,
               this.embedded.toString(),
               this.visited,
               this.backEdgeFlag,
               this.dfsIndex,
               var3,
               this.treeEdges.toString(),
               this.downEdges.toString(),
               this.backEdges.toString(),
               this.parentEdge == null ? "null" : this.parentEdge.source.toString(false),
               this.lowpoint,
               this.leastAncestor
            );
      }

      public String toString(boolean var1) {
         if (!var1) {
            return this.rootVertex
               ? String.format("%s^%s", this.parentEdge.source.graphVertex.toString(), this.parentEdge.target.graphVertex.toString())
               : this.graphVertex.toString();
         } else {
            return this.toString();
         }
      }
   }

   private class OrientDfsStackInfo {
      V current;
      V parent;
      E parentEdge;
      boolean backtrack;

      OrientDfsStackInfo(V var2, V var3, E var4, boolean var5) {
         this.current = (V)var2;
         this.parent = (V)var3;
         this.parentEdge = (E)var4;
         this.backtrack = var5;
      }
   }

   private class OuterFaceCirculator implements Iterator<BoyerMyrvoldPlanarityInspector<V, E>.Node> {
      private BoyerMyrvoldPlanarityInspector<V, E>.Node current;
      private BoyerMyrvoldPlanarityInspector<V, E>.Node prev;

      OuterFaceCirculator(BoyerMyrvoldPlanarityInspector<V, E>.Node var2, BoyerMyrvoldPlanarityInspector<V, E>.Node var3) {
         this.current = var2;
         this.prev = var3;
      }

      @Override
      public boolean hasNext() {
         return true;
      }

      public BoyerMyrvoldPlanarityInspector<V, E>.Node next() {
         BoyerMyrvoldPlanarityInspector.Node var1 = this.current;
         this.current = this.current.nextOnOuterFace(this.prev);
         this.prev = var1;
         return this.prev;
      }

      BoyerMyrvoldPlanarityInspector<V, E>.Edge edgeToNext() {
         BoyerMyrvoldPlanarityInspector.Edge var1 = this.prev.embedded.getFirst();
         BoyerMyrvoldPlanarityInspector.Node var2 = this.toExistingNode(this.current);
         BoyerMyrvoldPlanarityInspector.Node var3 = this.toExistingNode(this.prev);
         return var1.getOpposite(var3) == var2 ? var1 : this.prev.embedded.getLast();
      }

      BoyerMyrvoldPlanarityInspector<V, E>.Node getCurrent() {
         return this.prev;
      }

      BoyerMyrvoldPlanarityInspector<V, E>.Node getPrev() {
         return this.prev.nextOnOuterFace(this.current);
      }

      private BoyerMyrvoldPlanarityInspector<V, E>.Node toExistingNode(BoyerMyrvoldPlanarityInspector<V, E>.Node var1) {
         return var1.isRootVertex() ? var1.getParent() : var1;
      }

      @Override
      public String toString() {
         return String.format("%s -> %s", this.prev.toString(false), this.current.toString(false));
      }
   }

   private class SearchInfo {
      BoyerMyrvoldPlanarityInspector<V, E>.Node current;
      BoyerMyrvoldPlanarityInspector<V, E>.Edge prevEdge;
      boolean backtrack;

      SearchInfo(BoyerMyrvoldPlanarityInspector<V, E>.Node var2, BoyerMyrvoldPlanarityInspector<V, E>.Edge var3, boolean var4) {
         this.current = var2;
         this.prevEdge = var3;
         this.backtrack = var4;
      }
   }
}
