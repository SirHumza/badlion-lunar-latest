package org.jgrapht.alg.connectivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.event.ConnectedComponentTraversalEvent;
import org.jgrapht.event.GraphEdgeChangeEvent;
import org.jgrapht.event.GraphListener;
import org.jgrapht.event.GraphVertexChangeEvent;
import org.jgrapht.event.TraversalListenerAdapter;
import org.jgrapht.event.VertexTraversalEvent;
import org.jgrapht.graph.AsUndirectedGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.util.CollectionUtil;

public class ConnectivityInspector<V, E> implements GraphListener<V, E> {
   private List<Set<V>> connectedSets;
   private Map<V, Set<V>> vertexToConnectedSet;
   private Graph<V, E> graph;

   public ConnectivityInspector(Graph<V, E> var1) {
      this.init();
      this.graph = Objects.requireNonNull(var1);
      if (var1.getType().isDirected()) {
         this.graph = new AsUndirectedGraph<>(var1);
      }
   }

   public boolean isConnected() {
      return this.lazyFindConnectedSets().size() == 1;
   }

   public Set<V> connectedSetOf(V var1) {
      Set var2 = this.vertexToConnectedSet.get(var1);
      if (var2 == null) {
         var2 = new HashSet();
         BreadthFirstIterator var3 = new BreadthFirstIterator<>(this.graph, (V)var1);

         while (var3.hasNext()) {
            var2.add(var3.next());
         }

         this.vertexToConnectedSet.put((V)var1, var2);
      }

      return var2;
   }

   public List<Set<V>> connectedSets() {
      return this.lazyFindConnectedSets();
   }

   @Override
   public void edgeAdded(GraphEdgeChangeEvent<V, E> var1) {
      Object var2 = var1.getEdgeSource();
      Object var3 = var1.getEdgeTarget();
      Set var4 = this.connectedSetOf((V)var2);
      Set var5 = this.connectedSetOf((V)var3);
      if (var4 != var5) {
         HashSet var6 = CollectionUtil.newHashSetWithExpectedSize(var4.size() + var5.size());
         var6.addAll(var4);
         var6.addAll(var5);
         this.connectedSets.remove(var4);
         this.connectedSets.remove(var5);
         this.connectedSets.add(var6);

         for (Object var8 : var6) {
            this.vertexToConnectedSet.put((V)var8, var6);
         }
      }
   }

   @Override
   public void edgeRemoved(GraphEdgeChangeEvent<V, E> var1) {
      this.init();
   }

   public boolean pathExists(V var1, V var2) {
      return this.connectedSetOf((V)var1).contains(var2);
   }

   @Override
   public void vertexAdded(GraphVertexChangeEvent<V> var1) {
      HashSet var2 = new HashSet();
      var2.add(var1.getVertex());
      this.connectedSets.add(var2);
      this.vertexToConnectedSet.put((V)var1.getVertex(), var2);
   }

   @Override
   public void vertexRemoved(GraphVertexChangeEvent<V> var1) {
      this.init();
   }

   private void init() {
      this.connectedSets = null;
      this.vertexToConnectedSet = new HashMap<>();
   }

   private List<Set<V>> lazyFindConnectedSets() {
      if (this.connectedSets == null) {
         this.connectedSets = new ArrayList<>();
         Set var1 = this.graph.vertexSet();
         if (!var1.isEmpty()) {
            BreadthFirstIterator var2 = new BreadthFirstIterator<>(this.graph);
            var2.addTraversalListener(new ConnectivityInspector.MyTraversalListener());

            while (var2.hasNext()) {
               var2.next();
            }
         }
      }

      return this.connectedSets;
   }

   private class MyTraversalListener extends TraversalListenerAdapter<V, E> {
      private Set<V> currentConnectedSet;

      @Override
      public void connectedComponentFinished(ConnectedComponentTraversalEvent var1) {
         ConnectivityInspector.this.connectedSets.add(this.currentConnectedSet);
      }

      @Override
      public void connectedComponentStarted(ConnectedComponentTraversalEvent var1) {
         this.currentConnectedSet = new HashSet();
      }

      @Override
      public void vertexTraversed(VertexTraversalEvent<V> var1) {
         Object var2 = var1.getVertex();
         this.currentConnectedSet.add((V)var2);
         ConnectivityInspector.this.vertexToConnectedSet.put((V)var2, this.currentConnectedSet);
      }
   }
}
