package org.jgrapht.alg.interfaces;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;

public interface PlanarityTestingAlgorithm<V, E> {
   boolean isPlanar();

   PlanarityTestingAlgorithm.Embedding<V, E> getEmbedding();

   Graph<V, E> getKuratowskiSubdivision();

   interface Embedding<V, E> {
      List<E> getEdgesAround(V var1);

      Graph<V, E> getGraph();
   }

   class EmbeddingImpl<V, E> implements PlanarityTestingAlgorithm.Embedding<V, E> {
      private Graph<V, E> graph;
      private Map<V, List<E>> embeddingMap;

      public EmbeddingImpl(Graph<V, E> var1, Map<V, List<E>> var2) {
         this.graph = var1;
         this.embeddingMap = var2;
      }

      @Override
      public List<E> getEdgesAround(V var1) {
         return this.embeddingMap.get(var1);
      }

      @Override
      public Graph<V, E> getGraph() {
         return this.graph;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder("[");

         for (Entry var3 : this.embeddingMap.entrySet()) {
            var1.append(var3.getKey().toString())
               .append(" -> ")
               .append(
                  ((List)var3.getValue())
                     .stream()
                     .map(var2 -> Graphs.getOppositeVertex(this.graph, (E)var2, (V)var3.getKey()).toString())
                     .collect(Collectors.joining(", ", "[", "]"))
               )
               .append(", ");
         }

         return var1.append("]").toString();
      }
   }
}
