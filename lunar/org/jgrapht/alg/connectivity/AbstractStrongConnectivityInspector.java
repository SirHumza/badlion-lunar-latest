package org.jgrapht.alg.connectivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.interfaces.StrongConnectivityAlgorithm;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.util.CollectionUtil;

abstract class AbstractStrongConnectivityInspector<V, E> implements StrongConnectivityAlgorithm<V, E> {
   protected final Graph<V, E> graph;
   protected List<Set<V>> stronglyConnectedSets;
   protected List<Graph<V, E>> stronglyConnectedSubgraphs;

   protected AbstractStrongConnectivityInspector(Graph<V, E> var1) {
      this.graph = GraphTests.requireDirected(var1);
   }

   @Override
   public Graph<V, E> getGraph() {
      return this.graph;
   }

   @Override
   public boolean isStronglyConnected() {
      return this.stronglyConnectedSets().size() == 1;
   }

   @Override
   public List<Graph<V, E>> getStronglyConnectedComponents() {
      if (this.stronglyConnectedSubgraphs == null) {
         List var1 = this.stronglyConnectedSets();
         this.stronglyConnectedSubgraphs = new ArrayList<>(var1.size());

         for (Set var3 : var1) {
            this.stronglyConnectedSubgraphs.add(new AsSubgraph<>(this.graph, var3, null));
         }
      }

      return this.stronglyConnectedSubgraphs;
   }

   @Override
   public Graph<Graph<V, E>, DefaultEdge> getCondensation() {
      List var1 = this.stronglyConnectedSets();
      SimpleDirectedGraph var2 = new SimpleDirectedGraph<>(DefaultEdge.class);
      HashMap var3 = CollectionUtil.newHashMapWithExpectedSize(this.graph.vertexSet().size());

      for (Set var5 : var1) {
         AsSubgraph var6 = new AsSubgraph<>(this.graph, var5, null);
         var2.addVertex(var6);

         for (Object var8 : var5) {
            var3.put(var8, var6);
         }
      }

      for (Object var11 : this.graph.edgeSet()) {
         Object var12 = this.graph.getEdgeSource((E)var11);
         Graph var13 = (Graph)var3.get(var12);
         Object var14 = this.graph.getEdgeTarget((E)var11);
         Graph var9 = (Graph)var3.get(var14);
         if (var13 != var9) {
            var2.addEdge(var13, var9);
         }
      }

      return var2;
   }
}
