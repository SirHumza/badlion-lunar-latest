package org.jgrapht.alg.clique;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.MaximalCliqueEnumerationAlgorithm;

abstract class BaseBronKerboschCliqueFinder<V, E> implements MaximalCliqueEnumerationAlgorithm<V, E> {
   protected final Graph<V, E> graph;
   protected final long nanos;
   protected boolean timeLimitReached;
   protected List<Set<V>> allMaximalCliques;
   protected int maxSize;

   public BaseBronKerboschCliqueFinder(Graph<V, E> var1, long var2, TimeUnit var4) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
      if (var2 == 0L) {
         this.nanos = Long.MAX_VALUE;
      } else {
         this.nanos = var4.toNanos(var2);
      }

      if (this.nanos < 1L) {
         throw new IllegalArgumentException("Invalid timeout, must be positive");
      }

      this.timeLimitReached = false;
   }

   @Override
   public Iterator<Set<V>> iterator() {
      this.lazyRun();
      return this.allMaximalCliques.iterator();
   }

   public Iterator<Set<V>> maximumIterator() {
      this.lazyRun();
      return this.allMaximalCliques.stream().filter(var1 -> var1.size() == this.maxSize).iterator();
   }

   public boolean isTimeLimitReached() {
      return this.timeLimitReached;
   }

   protected abstract void lazyRun();
}
