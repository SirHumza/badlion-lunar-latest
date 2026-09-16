package org.jgrapht.alg.connectivity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class BlockCutpointGraph<V, E> extends SimpleGraph<Graph<V, E>, DefaultEdge> {
   private static final long serialVersionUID = -9101341117013163934L;
   private Graph<V, E> graph;
   private Set<V> cutpoints;
   private Set<Graph<V, E>> blocks;
   private Map<V, Graph<V, E>> vertex2block = new HashMap<>();

   public BlockCutpointGraph(Graph<V, E> var1) {
      super(DefaultEdge.class);
      this.graph = var1;
      BiconnectivityInspector var2 = new BiconnectivityInspector(var1);
      this.cutpoints = var2.getCutpoints();
      this.blocks = var2.getBlocks();

      for (Graph var4 : this.blocks) {
         for (Object var6 : var4.vertexSet()) {
            this.vertex2block.put((V)var6, var4);
         }
      }

      Graphs.addAllVertices(this, this.blocks);

      for (Object var9 : this.cutpoints) {
         AsSubgraph var10 = new AsSubgraph<>(var1, Collections.singleton(var9));
         this.vertex2block.put((V)var9, var10);
         this.addVertex(var10);

         for (Graph var7 : var2.getBlocks(var9)) {
            this.addEdge(var10, var7);
         }
      }
   }

   public Graph<V, E> getBlock(V var1) {
      assert this.graph.containsVertex((V)var1);
      return this.vertex2block.get(var1);
   }

   public Set<Graph<V, E>> getBlocks() {
      return this.blocks;
   }

   public Set<V> getCutpoints() {
      return this.cutpoints;
   }

   public boolean isCutpoint(V var1) {
      return this.cutpoints.contains(var1);
   }
}
