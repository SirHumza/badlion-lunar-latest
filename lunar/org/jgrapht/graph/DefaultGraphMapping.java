package org.jgrapht.graph;

import java.util.Map;
import org.jgrapht.Graph;
import org.jgrapht.GraphMapping;

public class DefaultGraphMapping<V, E> implements GraphMapping<V, E> {
   private Map<V, V> graphMappingForward;
   private Map<V, V> graphMappingReverse;
   private Graph<V, E> graph1;
   private Graph<V, E> graph2;

   public DefaultGraphMapping(Map<V, V> var1, Map<V, V> var2, Graph<V, E> var3, Graph<V, E> var4) {
      this.graph1 = var3;
      this.graph2 = var4;
      this.graphMappingForward = var1;
      this.graphMappingReverse = var2;
   }

   @Override
   public E getEdgeCorrespondence(E var1, boolean var2) {
      Graph var3;
      Graph var4;
      if (var2) {
         var3 = this.graph1;
         var4 = this.graph2;
      } else {
         var3 = this.graph2;
         var4 = this.graph1;
      }

      Object var5 = this.getVertexCorrespondence((V)var3.getEdgeSource(var1), var2);
      Object var6 = this.getVertexCorrespondence((V)var3.getEdgeTarget(var1), var2);
      return (E)(var5 != null && var6 != null ? var4.getEdge(var5, var6) : null);
   }

   @Override
   public V getVertexCorrespondence(V var1, boolean var2) {
      Map var3;
      if (var2) {
         var3 = this.graphMappingForward;
      } else {
         var3 = this.graphMappingReverse;
      }

      return (V)var3.get(var1);
   }
}
