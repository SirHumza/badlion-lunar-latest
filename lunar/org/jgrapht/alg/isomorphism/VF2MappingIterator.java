package org.jgrapht.alg.isomorphism;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jgrapht.GraphMapping;

abstract class VF2MappingIterator<V, E> implements Iterator<GraphMapping<V, E>> {
   protected Comparator<V> vertexComparator;
   protected Comparator<E> edgeComparator;
   protected IsomorphicGraphMapping<V, E> nextMapping;
   protected Boolean hadOneMapping;
   protected GraphOrdering<V, E> ordering1;
   protected GraphOrdering<V, E> ordering2;
   protected ArrayDeque<VF2State<V, E>> stateStack;

   public VF2MappingIterator(GraphOrdering<V, E> var1, GraphOrdering<V, E> var2, Comparator<V> var3, Comparator<E> var4) {
      this.ordering1 = var1;
      this.ordering2 = var2;
      this.vertexComparator = var3;
      this.edgeComparator = var4;
      this.stateStack = new ArrayDeque<>();
   }

   protected abstract IsomorphicGraphMapping<V, E> match();

   protected IsomorphicGraphMapping<V, E> matchAndCheck() {
      IsomorphicGraphMapping var1 = this.match();
      if (var1 != null) {
         this.hadOneMapping = true;
      }

      return var1;
   }

   @Override
   public boolean hasNext() {
      return this.nextMapping != null || (this.nextMapping = this.matchAndCheck()) != null;
   }

   public IsomorphicGraphMapping<V, E> next() {
      if (this.nextMapping != null) {
         IsomorphicGraphMapping var2 = this.nextMapping;
         this.nextMapping = null;
         return var2;
      } else {
         IsomorphicGraphMapping var1 = this.matchAndCheck();
         if (var1 == null) {
            throw new NoSuchElementException();
         } else {
            return var1;
         }
      }
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
