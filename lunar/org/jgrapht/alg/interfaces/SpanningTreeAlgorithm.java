package org.jgrapht.alg.interfaces;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

public interface SpanningTreeAlgorithm<E> {
   SpanningTreeAlgorithm.SpanningTree<E> getSpanningTree();

   interface SpanningTree<E> extends Iterable<E> {
      double getWeight();

      Set<E> getEdges();

      @Override
      default Iterator<E> iterator() {
         return this.getEdges().iterator();
      }
   }

   class SpanningTreeImpl<E> implements Serializable, SpanningTreeAlgorithm.SpanningTree<E> {
      private static final long serialVersionUID = 402707108331703333L;
      private final double weight;
      private final Set<E> edges;

      public SpanningTreeImpl(Set<E> var1, double var2) {
         this.edges = var1;
         this.weight = var2;
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
      public String toString() {
         return "Spanning-Tree [weight=" + this.weight + ", edges=" + this.edges + "]";
      }
   }
}
