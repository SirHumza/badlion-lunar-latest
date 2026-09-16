package org.jgrapht.alg.transform;

import java.util.Objects;
import java.util.function.BiFunction;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;

public class LineGraphConverter<V, E, EE> {
   private final Graph<V, E> graph;

   public LineGraphConverter(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
   }

   public void convertToLineGraph(Graph<E, EE> var1) {
      this.convertToLineGraph(var1, null);
   }

   public void convertToLineGraph(Graph<E, EE> var1, BiFunction<E, E, Double> var2) {
      Graphs.addAllVertices(var1, this.graph.edgeSet());
      if (this.graph.getType().isDirected()) {
         for (Object var4 : this.graph.vertexSet()) {
            for (Object var6 : this.graph.incomingEdgesOf((V)var4)) {
               for (Object var8 : this.graph.outgoingEdgesOf((V)var4)) {
                  Object var9 = var1.addEdge(var6, var8);
                  if (var2 != null) {
                     var1.setEdgeWeight(var9, (Double)var2.apply(var6, var8));
                  }
               }
            }
         }
      } else {
         for (Object var11 : this.graph.vertexSet()) {
            for (Object var13 : this.graph.edgesOf((V)var11)) {
               for (Object var15 : this.graph.edgesOf((V)var11)) {
                  if (var13 != var15) {
                     Object var16 = var1.addEdge(var13, var15);
                     if (var2 != null) {
                        var1.setEdgeWeight(var16, (Double)var2.apply(var13, var15));
                     }
                  }
               }
            }
         }
      }
   }
}
