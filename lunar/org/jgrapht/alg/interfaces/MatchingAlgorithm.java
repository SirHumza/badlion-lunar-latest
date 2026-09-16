package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jgrapht.Graph;

public interface MatchingAlgorithm<V, E> {
   double DEFAULT_EPSILON = 1.0E-9;

   MatchingAlgorithm.Matching<V, E> getMatching();

   interface Matching<V, E> extends Iterable<E> {
      Graph<V, E> getGraph();

      double getWeight();

      Set<E> getEdges();

      default boolean isMatched(V var1) {
         Set var2 = this.getEdges();
         return this.getGraph().edgesOf((V)var1).stream().anyMatch(var2::contains);
      }

      default boolean isPerfect() {
         return this.getEdges().size() == this.getGraph().vertexSet().size() / 2.0;
      }

      @Override
      default Iterator<E> iterator() {
         return this.getEdges().iterator();
      }
   }

   class MatchingImpl<V, E> implements Serializable, MatchingAlgorithm.Matching<V, E> {
      private static final long serialVersionUID = 4767675421846527768L;
      private Graph<V, E> graph;
      private Set<E> edges;
      private double weight;
      private Set<V> matchedVertices = null;

      public MatchingImpl(Graph<V, E> var1, Set<E> var2, double var3) {
         this.graph = var1;
         this.edges = var2;
         this.weight = var3;
      }

      @Override
      public Graph<V, E> getGraph() {
         return this.graph;
      }

      @Override
      public double getWeight() {
         return this.weight;
      }

      @Override
      public Set<E> getEdges() {
         return this.edges;
      }

      @Override
      public boolean isMatched(V var1) {
         if (this.matchedVertices == null) {
            this.matchedVertices = new HashSet();

            for (Object var3 : this.edges) {
               this.matchedVertices.add(this.graph.getEdgeSource((E)var3));
               this.matchedVertices.add(this.graph.getEdgeTarget((E)var3));
            }
         }

         return this.matchedVertices.contains(var1);
      }

      @Override
      public String toString() {
         return "Matching [edges=" + this.edges + ", weight=" + this.weight + "]";
      }
   }
}
