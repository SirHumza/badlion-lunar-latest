package org.jgrapht.alg.connectivity;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.graph.EdgeReversedGraph;
import org.jgrapht.util.CollectionUtil;

public class KosarajuStrongConnectivityInspector<V, E> extends AbstractStrongConnectivityInspector<V, E> {
   private LinkedList<KosarajuStrongConnectivityInspector.VertexData<V>> orderedVertices;
   private Map<V, KosarajuStrongConnectivityInspector.VertexData<V>> vertexToVertexData;

   public KosarajuStrongConnectivityInspector(Graph<V, E> var1) {
      super(var1);
   }

   @Override
   public List<Set<V>> stronglyConnectedSets() {
      if (this.stronglyConnectedSets == null) {
         this.orderedVertices = new LinkedList<>();
         this.stronglyConnectedSets = new ArrayList<>();
         this.createVertexData();

         for (KosarajuStrongConnectivityInspector.VertexData var2 : this.vertexToVertexData.values()) {
            if (!var2.isDiscovered()) {
               this.dfsVisit(this.graph, var2, null);
            }
         }

         EdgeReversedGraph var5 = new EdgeReversedGraph<>(this.graph);
         this.resetVertexData();

         for (KosarajuStrongConnectivityInspector.VertexData var3 : this.orderedVertices) {
            if (!var3.isDiscovered()) {
               HashSet var4 = new HashSet();
               this.stronglyConnectedSets.add(var4);
               this.dfsVisit(var5, var3, var4);
            }
         }

         this.orderedVertices = null;
         this.vertexToVertexData = null;
      }

      return this.stronglyConnectedSets;
   }

   private void createVertexData() {
      this.vertexToVertexData = CollectionUtil.newHashMapWithExpectedSize(this.graph.vertexSet().size());

      for (Object var2 : this.graph.vertexSet()) {
         this.vertexToVertexData.put((V)var2, new KosarajuStrongConnectivityInspector.VertexData2<>((V)var2, false, false));
      }
   }

   private void dfsVisit(Graph<V, E> var1, KosarajuStrongConnectivityInspector.VertexData<V> var2, Set<V> var3) {
      ArrayDeque var4 = new ArrayDeque();
      var4.add(var2);

      while (!var4.isEmpty()) {
         KosarajuStrongConnectivityInspector.VertexData var5 = (KosarajuStrongConnectivityInspector.VertexData)var4.removeLast();
         if (!var5.isDiscovered()) {
            var5.setDiscovered(true);
            if (var3 != null) {
               var3.add(var5.getVertex());
            }

            var4.add(new KosarajuStrongConnectivityInspector.VertexData1(var5, true, true));

            for (Object var7 : var1.outgoingEdgesOf(var5.getVertex())) {
               KosarajuStrongConnectivityInspector.VertexData var8 = this.vertexToVertexData.get(var1.getEdgeTarget(var7));
               if (!var8.isDiscovered()) {
                  var4.add(var8);
               }
            }
         } else if (var5.isFinished() && var3 == null) {
            this.orderedVertices.addFirst(var5.getFinishedData());
         }
      }
   }

   private void resetVertexData() {
      for (KosarajuStrongConnectivityInspector.VertexData var2 : this.vertexToVertexData.values()) {
         var2.setDiscovered(false);
         var2.setFinished(false);
      }
   }

   private abstract static class VertexData<V> {
      private byte bitfield = 0;

      private VertexData(boolean var1, boolean var2) {
         this.setDiscovered(var1);
         this.setFinished(var2);
      }

      private boolean isDiscovered() {
         return (this.bitfield & 1) == 1;
      }

      private boolean isFinished() {
         return (this.bitfield & 2) == 2;
      }

      private void setDiscovered(boolean var1) {
         if (var1) {
            this.bitfield = (byte)(this.bitfield | 1);
         } else {
            this.bitfield = (byte)(this.bitfield & -2);
         }
      }

      private void setFinished(boolean var1) {
         if (var1) {
            this.bitfield = (byte)(this.bitfield | 2);
         } else {
            this.bitfield = (byte)(this.bitfield & -3);
         }
      }

      abstract KosarajuStrongConnectivityInspector.VertexData<V> getFinishedData();

      abstract V getVertex();
   }

   private static final class VertexData1<V> extends KosarajuStrongConnectivityInspector.VertexData<V> {
      private final KosarajuStrongConnectivityInspector.VertexData<V> finishedData;

      private VertexData1(KosarajuStrongConnectivityInspector.VertexData<V> var1, boolean var2, boolean var3) {
         super(var2, var3);
         this.finishedData = var1;
      }

      @Override
      KosarajuStrongConnectivityInspector.VertexData<V> getFinishedData() {
         return this.finishedData;
      }

      @Override
      V getVertex() {
         return null;
      }
   }

   private static final class VertexData2<V> extends KosarajuStrongConnectivityInspector.VertexData<V> {
      private final V vertex;

      private VertexData2(V var1, boolean var2, boolean var3) {
         super(var2, var3);
         this.vertex = (V)var1;
      }

      @Override
      KosarajuStrongConnectivityInspector.VertexData<V> getFinishedData() {
         return null;
      }

      @Override
      V getVertex() {
         return this.vertex;
      }
   }
}
