package org.jgrapht.alg.cycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;
import org.jgrapht.alg.interfaces.EulerianCycleAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.util.TypeUtil;

public class HierholzerEulerianCycle<V, E> implements EulerianCycleAlgorithm<V, E> {
   protected Graph<V, E> g;
   protected boolean isDirected;
   protected HierholzerEulerianCycle<V, E>.VertexNode verticesHead;
   protected HierholzerEulerianCycle<V, E>.EdgeNode eulerianHead;
   protected V startVertex;

   public boolean isEulerian(Graph<V, E> var1) {
      GraphTests.requireDirectedOrUndirected(var1);
      if (var1.vertexSet().isEmpty()) {
         return false;
      }

      if (var1.edgeSet().isEmpty()) {
         return true;
      }

      if (var1.getType().isUndirected()) {
         for (Object var11 : var1.vertexSet()) {
            if (var1.degreeOf(var11) % 2 == 1) {
               return false;
            }
         }

         boolean var9 = false;

         for (Set var13 : new ConnectivityInspector(var1).connectedSets()) {
            for (Object var15 : var13) {
               if (var1.degreeOf(var15) > 0) {
                  if (var9) {
                     return false;
                  }

                  var9 = true;
                  break;
               }
            }
         }

         return true;
      } else {
         for (Object var3 : var1.vertexSet()) {
            if (var1.inDegreeOf(var3) != var1.outDegreeOf(var3)) {
               return false;
            }
         }

         boolean var7 = false;

         for (Set var4 : new KosarajuStrongConnectivityInspector(var1).stronglyConnectedSets()) {
            for (Object var6 : var4) {
               if (var1.inDegreeOf(var6) > 0 || var1.outDegreeOf(var6) > 0) {
                  if (var7) {
                     return false;
                  }

                  var7 = true;
                  break;
               }
            }
         }

         return true;
      }
   }

   @Override
   public GraphPath<V, E> getEulerianCycle(Graph<V, E> var1) {
      if (!this.isEulerian(var1)) {
         throw new IllegalArgumentException("Graph is not Eulerian");
      }

      if (var1.vertexSet().isEmpty()) {
         throw new IllegalArgumentException("Null graph not permitted");
      }

      if (GraphTests.isEmpty(var1)) {
         return GraphWalk.emptyWalk(var1);
      }

      this.initialize(var1);

      while (this.verticesHead != null) {
         HierholzerEulerianCycle.EdgeNode var2 = this.verticesHead.insertLocation;
         Pair var3 = this.computePartialCycle();
         this.updateGraphAndInsertLocations(var3, this.verticesHead);
         if (var2 == null) {
            this.eulerianHead = (HierholzerEulerianCycle.EdgeNode)var3.getFirst();
         } else {
            ((HierholzerEulerianCycle.EdgeNode)var3.getSecond()).next = var2.next;
            var2.next = (HierholzerEulerianCycle.EdgeNode)var3.getFirst();
         }
      }

      GraphWalk var4 = this.buildWalk();
      this.cleanup();
      return var4;
   }

   protected void initialize(Graph<V, E> var1) {
      this.g = var1;
      this.isDirected = var1.getType().isDirected();
      this.verticesHead = null;
      this.eulerianHead = null;
      this.startVertex = null;
      HashMap var2 = new HashMap();

      for (Object var4 : var1.vertexSet()) {
         if (var1.outDegreeOf(var4) > 0) {
            HierholzerEulerianCycle.VertexNode var5 = new HierholzerEulerianCycle.VertexNode(null, var4, this.verticesHead);
            if (this.verticesHead != null) {
               this.verticesHead.prev = var5;
            }

            this.verticesHead = var5;
            var2.put(var4, var5);
         }
      }

      for (Object var8 : var1.edgeSet()) {
         HierholzerEulerianCycle.VertexNode var9 = (HierholzerEulerianCycle.VertexNode)var2.get(var1.getEdgeSource(var8));
         HierholzerEulerianCycle.VertexNode var6 = (HierholzerEulerianCycle.VertexNode)var2.get(var1.getEdgeTarget(var8));
         this.addEdge(var9, var6, (E)var8);
      }
   }

   protected void cleanup() {
      this.g = null;
      this.verticesHead = null;
      this.eulerianHead = null;
      this.startVertex = null;
   }

   protected Pair<HierholzerEulerianCycle<V, E>.EdgeNode, HierholzerEulerianCycle<V, E>.EdgeNode> computePartialCycle() {
      if (this.startVertex == null) {
         this.startVertex = this.verticesHead.v;
      }

      HierholzerEulerianCycle.EdgeNode var1 = null;
      HierholzerEulerianCycle.EdgeNode var2 = null;
      HierholzerEulerianCycle.VertexNode var3 = this.verticesHead;

      do {
         HierholzerEulerianCycle.EdgeNode var4 = var3.adjEdgesHead;
         var3 = this.getOppositeVertex(var3, var4);
         this.unlink(var4);
         if (var2 == null) {
            var2 = var4;
            var1 = var2;
         } else {
            var2.next = var4;
            var2 = var2.next;
         }
      } while (!var3.equals(this.verticesHead));

      return Pair.of(var1, var2);
   }

   protected void updateGraphAndInsertLocations(
      Pair<HierholzerEulerianCycle<V, E>.EdgeNode, HierholzerEulerianCycle<V, E>.EdgeNode> var1, HierholzerEulerianCycle<V, E>.VertexNode var2
   ) {
      HierholzerEulerianCycle.EdgeNode var3 = (HierholzerEulerianCycle.EdgeNode)var1.getFirst();
      assert var3 != null : "Graph is not Eulerian";
      HierholzerEulerianCycle.VertexNode var4 = this.getOppositeVertex(var2, var3);

      while (true) {
         if (var4.adjEdgesHead != null) {
            var4.insertLocation = var3;
            this.moveToFront(var4);
         } else {
            this.unlink(var4);
         }

         var3 = var3.next;
         if (var3 == null) {
            return;
         }

         var4 = this.getOppositeVertex(var4, var3);
      }
   }

   protected GraphWalk<V, E> buildWalk() {
      double var1 = 0.0;
      ArrayList var3 = new ArrayList();

      for (HierholzerEulerianCycle.EdgeNode var4 = this.eulerianHead; var4 != null; var4 = var4.next) {
         var3.add(var4.e);
         var1 += this.g.getEdgeWeight(var4.e);
      }

      return new GraphWalk<>(this.g, this.startVertex, this.startVertex, var3, var1);
   }

   protected void addEdge(HierholzerEulerianCycle<V, E>.VertexNode var1, HierholzerEulerianCycle<V, E>.VertexNode var2, E var3) {
      HierholzerEulerianCycle.EdgeNode var4 = var1.adjEdgesHead;
      if (var4 == null) {
         var4 = new HierholzerEulerianCycle.EdgeNode(var1, var2, null, var3, null, null);
      } else {
         HierholzerEulerianCycle.EdgeNode var5 = new HierholzerEulerianCycle.EdgeNode(var1, var2, null, var3, null, var4);
         var4.prev = var5;
         var4 = var5;
      }

      var1.adjEdgesHead = var4;
      if (!this.isDirected && !var1.equals(var2)) {
         HierholzerEulerianCycle.EdgeNode var8 = var2.adjEdgesHead;
         if (var8 == null) {
            var8 = new HierholzerEulerianCycle.EdgeNode(var2, var1, null, var3, var4, null);
         } else {
            HierholzerEulerianCycle.EdgeNode var6 = new HierholzerEulerianCycle.EdgeNode(var2, var1, null, var3, var4, var8);
            var8.prev = var6;
            var8 = var6;
         }

         var4.reverse = var8;
         var2.adjEdgesHead = var8;
      }
   }

   protected void unlink(HierholzerEulerianCycle<V, E>.VertexNode var1) {
      if (this.verticesHead != null) {
         if (this.verticesHead.equals(var1) || var1.prev != null || var1.next != null) {
            if (var1.prev != null) {
               var1.prev.next = var1.next;
               if (var1.next != null) {
                  var1.next.prev = var1.prev;
               }
            } else {
               this.verticesHead = var1.next;
               if (this.verticesHead != null) {
                  this.verticesHead.prev = null;
               }
            }

            var1.next = null;
            var1.prev = null;
         }
      }
   }

   protected void moveToFront(HierholzerEulerianCycle<V, E>.VertexNode var1) {
      if (var1.prev != null) {
         var1.prev.next = var1.next;
         if (var1.next != null) {
            var1.next.prev = var1.prev;
         }

         this.verticesHead.prev = var1;
         var1.next = this.verticesHead;
         var1.prev = null;
         this.verticesHead = var1;
      }
   }

   protected void unlink(HierholzerEulerianCycle<V, E>.EdgeNode var1) {
      HierholzerEulerianCycle.VertexNode var2 = var1.sourceNode;
      if (var1.prev != null) {
         var1.prev.next = var1.next;
         if (var1.next != null) {
            var1.next.prev = var1.prev;
         }
      } else {
         if (var1.next != null) {
            var1.next.prev = null;
         }

         var2.adjEdgesHead = var1.next;
      }

      if (!this.isDirected && var1.reverse != null) {
         HierholzerEulerianCycle.EdgeNode var3 = var1.reverse;
         HierholzerEulerianCycle.VertexNode var4 = var3.sourceNode;
         if (var3.prev != null) {
            var3.prev.next = var3.next;
            if (var3.next != null) {
               var3.next.prev = var3.prev;
            }
         } else {
            if (var3.next != null) {
               var3.next.prev = null;
            }

            var4.adjEdgesHead = var3.next;
         }
      }

      var1.next = null;
      var1.prev = null;
      var1.reverse = null;
   }

   protected HierholzerEulerianCycle<V, E>.VertexNode getOppositeVertex(
      HierholzerEulerianCycle<V, E>.VertexNode var1, HierholzerEulerianCycle<V, E>.EdgeNode var2
   ) {
      return var1.equals(var2.sourceNode) ? var2.targetNode : var2.sourceNode;
   }

   protected class EdgeNode {
      public E e;
      public HierholzerEulerianCycle<V, E>.EdgeNode next;
      public HierholzerEulerianCycle<V, E>.EdgeNode prev;
      public HierholzerEulerianCycle<V, E>.EdgeNode reverse;
      public HierholzerEulerianCycle<V, E>.VertexNode sourceNode;
      public HierholzerEulerianCycle<V, E>.VertexNode targetNode;

      public EdgeNode(
         HierholzerEulerianCycle<V, E>.VertexNode var2,
         HierholzerEulerianCycle<V, E>.VertexNode var3,
         HierholzerEulerianCycle<V, E>.EdgeNode var4,
         E var5,
         HierholzerEulerianCycle<V, E>.EdgeNode var6,
         HierholzerEulerianCycle<V, E>.EdgeNode var7
      ) {
         this.sourceNode = var2;
         this.targetNode = var3;
         this.prev = var4;
         this.e = (E)var5;
         this.reverse = var6;
         this.next = var7;
      }

      @Override
      public int hashCode() {
         byte var1 = 31;
         byte var2 = 1;
         return 31 * var2 + (this.e == null ? 0 : this.e.hashCode());
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (var1 == null) {
            return false;
         }

         if (this.getClass() != var1.getClass()) {
            return false;
         }

         HierholzerEulerianCycle.EdgeNode var2 = TypeUtil.uncheckedCast(var1);
         return Objects.equals(this.e, var2.e);
      }

      @Override
      public String toString() {
         return this.e.toString();
      }
   }

   protected class VertexNode {
      public V v;
      public HierholzerEulerianCycle<V, E>.VertexNode prev;
      public HierholzerEulerianCycle<V, E>.VertexNode next;
      public HierholzerEulerianCycle<V, E>.EdgeNode insertLocation;
      public HierholzerEulerianCycle<V, E>.EdgeNode adjEdgesHead;

      public VertexNode(HierholzerEulerianCycle<V, E>.VertexNode var2, V var3, HierholzerEulerianCycle<V, E>.VertexNode var4) {
         this.prev = var2;
         this.v = (V)var3;
         this.next = var4;
         this.adjEdgesHead = null;
         this.insertLocation = null;
      }

      @Override
      public int hashCode() {
         byte var1 = 31;
         byte var2 = 1;
         return 31 * var2 + (this.v == null ? 0 : this.v.hashCode());
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (var1 == null) {
            return false;
         }

         if (this.getClass() != var1.getClass()) {
            return false;
         }

         HierholzerEulerianCycle.VertexNode var2 = TypeUtil.uncheckedCast(var1);
         return Objects.equals(this.v, var2.v);
      }

      @Override
      public String toString() {
         return this.v.toString();
      }
   }
}
