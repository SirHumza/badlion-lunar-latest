package org.jgrapht.traverse;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;

public class DegeneracyOrderingIterator<V, E> extends AbstractGraphIterator<V, E> {
   private Set<V>[] buckets;
   private Map<V, Integer> degrees;
   private int minDegree = Integer.MAX_VALUE;
   private V cur;

   public DegeneracyOrderingIterator(Graph<V, E> var1) {
      super(var1);
      int var2 = 0;
      this.degrees = new HashMap<>();

      for (Object var4 : var1.vertexSet()) {
         int var5 = 0;

         for (Object var7 : var1.edgesOf(var4)) {
            Object var8 = Graphs.getOppositeVertex(var1, var7, var4);
            if (!var4.equals(var8)) {
               var5++;
            }
         }

         this.degrees.put((V)var4, var5);
         this.minDegree = Math.min(this.minDegree, var5);
         var2 = Math.max(var2, var5);
      }

      this.minDegree = Math.min(this.minDegree, var2);
      this.buckets = (Set<V>[])Array.newInstance(Set.class, var2 + 1);

      for (int var9 = 0; var9 < this.buckets.length; var9++) {
         this.buckets[var9] = new HashSet();
      }

      for (Object var11 : var1.vertexSet()) {
         this.buckets[this.degrees.get(var11)].add((V)var11);
      }
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

   @Override
   public boolean hasNext() {
      if (this.cur != null) {
         return true;
      }

      this.cur = this.advance();
      if (this.cur != null && this.nListeners != 0) {
         this.fireVertexTraversed(this.createVertexTraversalEvent(this.cur));
      }

      return this.cur != null;
   }

   @Override
   public V next() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      }

      Object var1 = this.cur;
      this.cur = null;
      if (this.nListeners != 0) {
         this.fireVertexFinished(this.createVertexTraversalEvent((V)var1));
      }

      return (V)var1;
   }

   private V advance() {
      while (this.minDegree < this.buckets.length && this.buckets[this.minDegree].isEmpty()) {
         this.minDegree++;
      }

      Object var1 = null;
      if (this.minDegree < this.buckets.length) {
         Set var2 = this.buckets[this.minDegree];
         Object var3 = var2.iterator().next();
         var2.remove(var3);
         this.degrees.remove(var3);

         for (Object var5 : this.graph.edgesOf((V)var3)) {
            Object var6 = Graphs.getOppositeVertex(this.graph, (E)var5, (V)var3);
            if (!var3.equals(var6) && this.degrees.containsKey(var6)) {
               int var7 = this.degrees.get(var6);
               if (var7 > this.minDegree) {
                  this.buckets[var7].remove(var6);
                  this.degrees.put((V)var6, --var7);
                  this.buckets[var7].add((V)var6);
               }
            }
         }

         var1 = var3;
      }

      return (V)var1;
   }
}
