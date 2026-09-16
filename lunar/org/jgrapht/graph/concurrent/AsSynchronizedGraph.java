package org.jgrapht.graph.concurrent;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jgrapht.Graph;
import org.jgrapht.graph.GraphDelegator;

public class AsSynchronizedGraph<V, E> extends GraphDelegator<V, E> implements Serializable, Graph<V, E> {
   private static final long serialVersionUID = 5144561442831050752L;
   private final ReentrantReadWriteLock readWriteLock;
   private transient AsSynchronizedGraph.CopyOnDemandSet<V> allVerticesSet;
   private transient AsSynchronizedGraph.CopyOnDemandSet<E> allEdgesSet;
   private AsSynchronizedGraph.CacheStrategy<V, E> cacheStrategy;

   public AsSynchronizedGraph(Graph<V, E> var1) {
      this(var1, false, false, false);
   }

   private AsSynchronizedGraph(Graph<V, E> var1, boolean var2, boolean var3, boolean var4) {
      super(var1);
      this.readWriteLock = new ReentrantReadWriteLock(var3);
      if (var4) {
         this.cacheStrategy = new AsSynchronizedGraph.NoCopy();
      } else if (var2) {
         this.cacheStrategy = new AsSynchronizedGraph.CacheAccess();
      } else {
         this.cacheStrategy = new AsSynchronizedGraph.NoCache();
      }

      this.allEdgesSet = new AsSynchronizedGraph.CopyOnDemandSet<>(super.edgeSet(), this.readWriteLock, var4);
      this.allVerticesSet = new AsSynchronizedGraph.CopyOnDemandSet<>(super.vertexSet(), this.readWriteLock, var4);
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      this.readWriteLock.readLock().lock();

      try {
         return super.getAllEdges((V)var1, (V)var2);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public E getEdge(V var1, V var2) {
      this.readWriteLock.readLock().lock();

      try {
         return super.getEdge((V)var1, (V)var2);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public E addEdge(V var1, V var2) {
      this.readWriteLock.writeLock().lock();

      try {
         Object var3 = this.cacheStrategy.addEdge((V)var1, (V)var2);
         if (var3 != null) {
            this.edgeSetModified();
         }

         return (E)var3;
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public boolean addEdge(V var1, V var2, E var3) {
      this.readWriteLock.writeLock().lock();

      try {
         if (this.cacheStrategy.addEdge((V)var1, (V)var2, (E)var3)) {
            this.edgeSetModified();
            return true;
         } else {
            return false;
         }
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public boolean addVertex(V var1) {
      this.readWriteLock.writeLock().lock();

      try {
         if (super.addVertex((V)var1)) {
            this.vertexSetModified();
            return true;
         } else {
            return false;
         }
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public boolean containsEdge(V var1, V var2) {
      this.readWriteLock.readLock().lock();

      try {
         return super.containsEdge((V)var1, (V)var2);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public boolean containsEdge(E var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.containsEdge((E)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public boolean containsVertex(V var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.containsVertex((V)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public int degreeOf(V var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.degreeOf((V)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public Set<E> edgeSet() {
      return this.allEdgesSet;
   }

   @Override
   public Set<E> edgesOf(V var1) {
      this.readWriteLock.readLock().lock();

      try {
         return this.cacheStrategy.edgesOf((V)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public int inDegreeOf(V var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.inDegreeOf((V)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      this.readWriteLock.readLock().lock();

      try {
         return this.cacheStrategy.incomingEdgesOf((V)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public int outDegreeOf(V var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.outDegreeOf((V)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      this.readWriteLock.readLock().lock();

      try {
         return this.cacheStrategy.outgoingEdgesOf((V)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public boolean removeAllEdges(Collection<? extends E> var1) {
      this.readWriteLock.writeLock().lock();

      try {
         return super.removeAllEdges(var1);
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public Set<E> removeAllEdges(V var1, V var2) {
      this.readWriteLock.writeLock().lock();

      try {
         return super.removeAllEdges((V)var1, (V)var2);
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public boolean removeAllVertices(Collection<? extends V> var1) {
      this.readWriteLock.writeLock().lock();

      try {
         return super.removeAllVertices(var1);
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public boolean removeEdge(E var1) {
      this.readWriteLock.writeLock().lock();

      try {
         if (this.cacheStrategy.removeEdge((E)var1)) {
            this.edgeSetModified();
            return true;
         } else {
            return false;
         }
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public E removeEdge(V var1, V var2) {
      this.readWriteLock.writeLock().lock();

      try {
         Object var3 = this.cacheStrategy.removeEdge((V)var1, (V)var2);
         if (var3 != null) {
            this.edgeSetModified();
         }

         return (E)var3;
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public boolean removeVertex(V var1) {
      this.readWriteLock.writeLock().lock();

      try {
         if (this.cacheStrategy.removeVertex((V)var1)) {
            this.edgeSetModified();
            this.vertexSetModified();
            return true;
         } else {
            return false;
         }
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public String toString() {
      this.readWriteLock.readLock().lock();

      try {
         return super.toString();
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public Set<V> vertexSet() {
      return this.allVerticesSet;
   }

   @Override
   public V getEdgeSource(E var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.getEdgeSource((E)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public V getEdgeTarget(E var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.getEdgeTarget((E)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public double getEdgeWeight(E var1) {
      this.readWriteLock.readLock().lock();

      try {
         return super.getEdgeWeight((E)var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public void setEdgeWeight(E var1, double var2) {
      this.readWriteLock.writeLock().lock();

      try {
         super.setEdgeWeight((E)var1, var2);
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   public boolean isCacheEnabled() {
      this.readWriteLock.readLock().lock();

      try {
         return this.cacheStrategy.isCacheEnabled();
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   public boolean isCopyless() {
      return this.allVerticesSet.isCopyless();
   }

   public AsSynchronizedGraph<V, E> setCache(boolean var1) {
      this.readWriteLock.writeLock().lock();

      try {
         if (var1 == this.isCacheEnabled()) {
            return this;
         }

         if (var1) {
            this.cacheStrategy = new AsSynchronizedGraph.CacheAccess();
         } else {
            this.cacheStrategy = new AsSynchronizedGraph.NoCache();
         }

         return this;
      } finally {
         this.readWriteLock.writeLock().unlock();
      }
   }

   @Override
   public int hashCode() {
      this.readWriteLock.readLock().lock();

      try {
         return this.getDelegate().hashCode();
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      this.readWriteLock.readLock().lock();

      try {
         return this.getDelegate().equals(var1);
      } finally {
         this.readWriteLock.readLock().unlock();
      }
   }

   private <C> Set<C> copySet(Set<C> var1) {
      return Collections.unmodifiableSet(new LinkedHashSet<>(var1));
   }

   private void vertexSetModified() {
      this.allVerticesSet.modified();
   }

   private void edgeSetModified() {
      this.allEdgesSet.modified();
   }

   public boolean isFair() {
      return this.readWriteLock.isFair();
   }

   public ReentrantReadWriteLock getLock() {
      return this.readWriteLock;
   }

   public static class Builder<V, E> {
      private boolean cacheEnable;
      private boolean fair;
      private boolean copyless;

      public Builder() {
         this.cacheEnable = false;
         this.fair = false;
         this.copyless = false;
      }

      public Builder(AsSynchronizedGraph<V, E> var1) {
         this.cacheEnable = var1.isCacheEnabled();
         this.fair = var1.isFair();
         this.copyless = var1.isCopyless();
      }

      public AsSynchronizedGraph.Builder<V, E> cacheDisable() {
         this.cacheEnable = false;
         return this;
      }

      public AsSynchronizedGraph.Builder<V, E> cacheEnable() {
         this.cacheEnable = true;
         return this;
      }

      public boolean isCacheEnable() {
         return this.cacheEnable;
      }

      public AsSynchronizedGraph.Builder<V, E> setCopyless() {
         this.copyless = true;
         return this;
      }

      public AsSynchronizedGraph.Builder<V, E> clearCopyless() {
         this.copyless = false;
         return this;
      }

      public boolean isCopyless() {
         return this.copyless;
      }

      public AsSynchronizedGraph.Builder<V, E> setFair() {
         this.fair = true;
         return this;
      }

      public AsSynchronizedGraph.Builder<V, E> setNonfair() {
         this.fair = false;
         return this;
      }

      public boolean isFair() {
         return this.fair;
      }

      public AsSynchronizedGraph<V, E> build(Graph<V, E> var1) {
         return new AsSynchronizedGraph<>(var1, this.cacheEnable, this.fair, this.copyless);
      }
   }

   private class CacheAccess implements Serializable, AsSynchronizedGraph.CacheStrategy<V, E> {
      private static final long serialVersionUID = -18262921841829294L;
      private final transient Map<V, Set<E>> incomingEdgesMap = new ConcurrentHashMap<>();
      private final transient Map<V, Set<E>> outgoingEdgesMap = new ConcurrentHashMap<>();
      private final transient Map<V, Set<E>> edgesOfMap = new ConcurrentHashMap<>();

      @Override
      public E addEdge(V var1, V var2) {
         Object var3 = AsSynchronizedGraph.super.addEdge((V)var1, (V)var2);
         if (var3 != null) {
            this.edgeModified(var1, var2);
         }

         return (E)var3;
      }

      @Override
      public boolean addEdge(V var1, V var2, E var3) {
         if (AsSynchronizedGraph.super.addEdge((V)var1, (V)var2, (E)var3)) {
            this.edgeModified(var1, var2);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public Set<E> edgesOf(V var1) {
         Set var2 = this.edgesOfMap.get(var1);
         if (var2 != null) {
            return var2;
         }

         var2 = AsSynchronizedGraph.this.copySet(AsSynchronizedGraph.super.edgesOf((V)var1));
         this.edgesOfMap.put((V)var1, var2);
         return var2;
      }

      @Override
      public Set<E> incomingEdgesOf(V var1) {
         Set var2 = this.incomingEdgesMap.get(var1);
         if (var2 != null) {
            return var2;
         }

         var2 = AsSynchronizedGraph.this.copySet(AsSynchronizedGraph.super.incomingEdgesOf((V)var1));
         this.incomingEdgesMap.put((V)var1, var2);
         return var2;
      }

      @Override
      public Set<E> outgoingEdgesOf(V var1) {
         Set var2 = this.outgoingEdgesMap.get(var1);
         if (var2 != null) {
            return var2;
         }

         var2 = AsSynchronizedGraph.this.copySet(AsSynchronizedGraph.super.outgoingEdgesOf((V)var1));
         this.outgoingEdgesMap.put((V)var1, var2);
         return var2;
      }

      @Override
      public boolean removeEdge(E var1) {
         Object var2 = AsSynchronizedGraph.this.getEdgeSource((E)var1);
         Object var3 = AsSynchronizedGraph.this.getEdgeTarget((E)var1);
         if (AsSynchronizedGraph.super.removeEdge((E)var1)) {
            this.edgeModified(var2, var3);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public E removeEdge(V var1, V var2) {
         Object var3 = AsSynchronizedGraph.super.removeEdge((V)var1, (V)var2);
         if (var3 != null) {
            this.edgeModified(var1, var2);
         }

         return (E)var3;
      }

      @Override
      public boolean removeVertex(V var1) {
         if (AsSynchronizedGraph.super.removeVertex((V)var1)) {
            this.edgesOfMap.clear();
            this.incomingEdgesMap.clear();
            this.outgoingEdgesMap.clear();
            return true;
         } else {
            return false;
         }
      }

      private void edgeModified(V var1, V var2) {
         this.outgoingEdgesMap.remove(var1);
         this.incomingEdgesMap.remove(var2);
         this.edgesOfMap.remove(var1);
         this.edgesOfMap.remove(var2);
         if (!AsSynchronizedGraph.super.getType().isDirected()) {
            this.outgoingEdgesMap.remove(var2);
            this.incomingEdgesMap.remove(var1);
         }
      }

      @Override
      public boolean isCacheEnabled() {
         return true;
      }
   }

   private interface CacheStrategy<V, E> {
      E addEdge(V var1, V var2);

      boolean addEdge(V var1, V var2, E var3);

      Set<E> edgesOf(V var1);

      Set<E> incomingEdgesOf(V var1);

      Set<E> outgoingEdgesOf(V var1);

      boolean removeEdge(E var1);

      E removeEdge(V var1, V var2);

      boolean removeVertex(V var1);

      boolean isCacheEnabled();
   }

   private static class CopyOnDemandSet<E> implements Serializable, Set<E> {
      private static final long serialVersionUID = 5553953818148294283L;
      private Set<E> set;
      private final boolean copyless;
      private transient volatile Set<E> copy;
      final ReadWriteLock readWriteLock;
      private static final String UNMODIFIABLE = "this set is unmodifiable";

      private CopyOnDemandSet(Set<E> var1, ReadWriteLock var2, boolean var3) {
         this.set = Objects.requireNonNull(var1, "s must not be null");
         this.copy = null;
         this.readWriteLock = var2;
         this.copyless = var3;
      }

      public boolean isCopyless() {
         return this.copyless;
      }

      @Override
      public int size() {
         this.readWriteLock.readLock().lock();

         try {
            return this.set.size();
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public boolean isEmpty() {
         this.readWriteLock.readLock().lock();

         try {
            return this.set.isEmpty();
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public boolean contains(Object var1) {
         this.readWriteLock.readLock().lock();

         try {
            return this.set.contains(var1);
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public Iterator<E> iterator() {
         return this.getCopy().iterator();
      }

      @Override
      public Object[] toArray() {
         this.readWriteLock.readLock().lock();

         try {
            return this.set.toArray();
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         this.readWriteLock.readLock().lock();

         try {
            return (T[])this.set.toArray(var1);
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public boolean add(E var1) {
         throw new UnsupportedOperationException("this set is unmodifiable");
      }

      @Override
      public boolean remove(Object var1) {
         throw new UnsupportedOperationException("this set is unmodifiable");
      }

      @Override
      public boolean containsAll(Collection<?> var1) {
         this.readWriteLock.readLock().lock();

         try {
            return this.set.containsAll(var1);
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public boolean addAll(Collection<? extends E> var1) {
         throw new UnsupportedOperationException("this set is unmodifiable");
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         throw new UnsupportedOperationException("this set is unmodifiable");
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         throw new UnsupportedOperationException("this set is unmodifiable");
      }

      @Override
      public void clear() {
         throw new UnsupportedOperationException("this set is unmodifiable");
      }

      @Override
      public void forEach(Consumer<? super E> var1) {
         this.readWriteLock.readLock().lock();

         try {
            this.set.forEach(var1);
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public boolean removeIf(Predicate<? super E> var1) {
         throw new UnsupportedOperationException("this set is unmodifiable");
      }

      @Override
      public Spliterator<E> spliterator() {
         return this.getCopy().spliterator();
      }

      @Override
      public Stream<E> stream() {
         return this.getCopy().stream();
      }

      @Override
      public Stream<E> parallelStream() {
         return this.getCopy().parallelStream();
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         this.readWriteLock.readLock().lock();

         try {
            return this.set.equals(var1);
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public int hashCode() {
         this.readWriteLock.readLock().lock();

         try {
            return this.set.hashCode();
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      @Override
      public String toString() {
         this.readWriteLock.readLock().lock();

         try {
            return this.set.toString();
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      private Set<E> getCopy() {
         if (this.copyless) {
            return this.set;
         }

         this.readWriteLock.readLock().lock();

         try {
            Set var1 = this.copy;
            if (var1 == null) {
               synchronized (this) {
                  var1 = this.copy;
                  if (var1 == null) {
                     this.copy = var1 = new LinkedHashSet<>(this.set);
                  }
               }
            }

            return var1;
         } finally {
            this.readWriteLock.readLock().unlock();
         }
      }

      private void modified() {
         this.copy = null;
      }
   }

   private class NoCache implements Serializable, AsSynchronizedGraph.CacheStrategy<V, E> {
      private static final long serialVersionUID = 19246150051213471L;

      @Override
      public E addEdge(V var1, V var2) {
         return AsSynchronizedGraph.super.addEdge((V)var1, (V)var2);
      }

      @Override
      public boolean addEdge(V var1, V var2, E var3) {
         return AsSynchronizedGraph.super.addEdge((V)var1, (V)var2, (E)var3);
      }

      @Override
      public Set<E> edgesOf(V var1) {
         return AsSynchronizedGraph.this.copySet(AsSynchronizedGraph.super.edgesOf((V)var1));
      }

      @Override
      public Set<E> incomingEdgesOf(V var1) {
         return AsSynchronizedGraph.this.copySet(AsSynchronizedGraph.super.incomingEdgesOf((V)var1));
      }

      @Override
      public Set<E> outgoingEdgesOf(V var1) {
         return AsSynchronizedGraph.this.copySet(AsSynchronizedGraph.super.outgoingEdgesOf((V)var1));
      }

      @Override
      public boolean removeEdge(E var1) {
         return AsSynchronizedGraph.super.removeEdge((E)var1);
      }

      @Override
      public E removeEdge(V var1, V var2) {
         return AsSynchronizedGraph.super.removeEdge((V)var1, (V)var2);
      }

      @Override
      public boolean removeVertex(V var1) {
         return AsSynchronizedGraph.super.removeVertex((V)var1);
      }

      @Override
      public boolean isCacheEnabled() {
         return false;
      }
   }

   private class NoCopy extends AsSynchronizedGraph<V, E>.NoCache {
      private static final long serialVersionUID = -5046944235164395939L;

      @Override
      public Set<E> edgesOf(V var1) {
         return AsSynchronizedGraph.super.edgesOf((V)var1);
      }

      @Override
      public Set<E> incomingEdgesOf(V var1) {
         return AsSynchronizedGraph.super.incomingEdgesOf((V)var1);
      }

      @Override
      public Set<E> outgoingEdgesOf(V var1) {
         return AsSynchronizedGraph.super.outgoingEdgesOf((V)var1);
      }
   }
}
