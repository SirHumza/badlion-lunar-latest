package org.jgrapht.traverse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.util.CollectionUtil;

public class LexBreadthFirstIterator<V, E> extends AbstractGraphIterator<V, E> {
   private LexBreadthFirstIterator<V, E>.BucketList bucketList;
   private V current;

   public LexBreadthFirstIterator(Graph<V, E> var1) {
      super(var1);
      GraphTests.requireUndirected(var1);
      this.bucketList = new LexBreadthFirstIterator.BucketList(var1.vertexSet());
   }

   @Override
   public boolean hasNext() {
      if (this.current != null) {
         return true;
      }

      this.current = this.advance();
      if (this.current != null && this.nListeners != 0) {
         this.fireVertexTraversed(this.createVertexTraversalEvent(this.current));
      }

      return this.current != null;
   }

   @Override
   public V next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      Object var1 = this.current;
      this.current = null;
      if (this.nListeners != 0) {
         this.fireVertexFinished(this.createVertexTraversalEvent((V)var1));
      }

      return (V)var1;
   }

   @Override
   public boolean isCrossComponentTraversal() {
      return true;
   }

   @Override
   public void setCrossComponentTraversal(boolean var1) {
      if (!var1) {
         throw new IllegalArgumentException("Iterator is always cross-component");
      }
   }

   private V advance() {
      Object var1 = this.bucketList.poll();
      if (var1 != null) {
         this.bucketList.updateBuckets(this.getUnvisitedNeighbours((V)var1));
      }

      return (V)var1;
   }

   private Set<V> getUnvisitedNeighbours(V var1) {
      HashSet var2 = new HashSet();

      for (Object var5 : this.graph.edgesOf((V)var1)) {
         Object var6 = Graphs.getOppositeVertex(this.graph, (E)var5, (V)var1);
         if (this.bucketList.containsBucketWith((V)var6)) {
            var2.add(var6);
         }
      }

      return var2;
   }

   class BucketList {
      private LexBreadthFirstIterator<V, E>.BucketList.Bucket head;
      private Map<V, LexBreadthFirstIterator<V, E>.BucketList.Bucket> bucketMap;

      BucketList(Collection<V> var2) {
         this.head = new LexBreadthFirstIterator.BucketList.Bucket(var2);
         this.bucketMap = CollectionUtil.newHashMapWithExpectedSize(var2.size());

         for (Object var4 : var2) {
            this.bucketMap.put((V)var4, this.head);
         }
      }

      boolean containsBucketWith(V var1) {
         return this.bucketMap.containsKey(var1);
      }

      V poll() {
         if (this.bucketMap.size() > 0) {
            Object var1 = this.head.poll();
            this.bucketMap.remove(var1);
            if (this.head.isEmpty()) {
               this.head = this.head.next;
               if (this.head != null) {
                  this.head.prev = null;
               }
            }

            return (V)var1;
         } else {
            return null;
         }
      }

      void updateBuckets(Set<V> var1) {
         HashSet var2 = new HashSet();

         for (Object var4 : var1) {
            LexBreadthFirstIterator.BucketList.Bucket var5 = this.bucketMap.get(var4);
            if (var2.contains(var5)) {
               var5.prev.addVertex((V)var4);
               this.bucketMap.put((V)var4, var5.prev);
            } else {
               var2.add(var5);
               LexBreadthFirstIterator.BucketList.Bucket var6 = new LexBreadthFirstIterator.BucketList.Bucket(var4);
               var6.insertBefore(var5);
               this.bucketMap.put((V)var4, var6);
               if (this.head == var5) {
                  this.head = var6;
               }
            }

            var5.removeVertex((V)var4);
            if (var5.isEmpty()) {
               var2.remove(var5);
               var5.removeSelf();
            }
         }
      }

      private class Bucket {
         private LexBreadthFirstIterator<V, E>.BucketList.Bucket next;
         private LexBreadthFirstIterator<V, E>.BucketList.Bucket prev;
         private Set<V> vertices;

         Bucket(Collection<V> var2) {
            this.vertices = new HashSet(var2);
         }

         Bucket(V var2) {
            this.vertices = new HashSet();
            this.vertices.add((V)var2);
         }

         void removeVertex(V var1) {
            this.vertices.remove(var1);
         }

         void removeSelf() {
            if (this.next != null) {
               this.next.prev = this.prev;
            }

            if (this.prev != null) {
               this.prev.next = this.next;
            }
         }

         void insertBefore(LexBreadthFirstIterator<V, E>.BucketList.Bucket var1) {
            this.next = var1;
            if (var1 != null) {
               this.prev = var1.prev;
               if (var1.prev != null) {
                  var1.prev.next = this;
               }

               var1.prev = this;
            } else {
               this.prev = null;
            }
         }

         void addVertex(V var1) {
            this.vertices.add((V)var1);
         }

         V poll() {
            if (this.vertices.isEmpty()) {
               return null;
            }

            Object var1 = this.vertices.iterator().next();
            this.vertices.remove(var1);
            return (V)var1;
         }

         boolean isEmpty() {
            return this.vertices.size() == 0;
         }
      }
   }
}
