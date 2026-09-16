package org.jgrapht.traverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.util.CollectionUtil;

public class MaximumCardinalityIterator<V, E> extends AbstractGraphIterator<V, E> {
   private int maxCardinality;
   private int remainingVertices;
   private V current;
   private ArrayList<Set<V>> buckets;
   private Map<V, Integer> cardinalityMap;

   public MaximumCardinalityIterator(Graph<V, E> var1) {
      super(var1);
      this.remainingVertices = var1.vertexSet().size();
      if (this.remainingVertices > 0) {
         GraphTests.requireUndirected(var1);
         this.buckets = new ArrayList<>(Collections.nCopies(var1.vertexSet().size(), null));
         this.buckets.set(0, (Set<V>)(new LinkedHashSet<>(var1.vertexSet())));
         this.cardinalityMap = CollectionUtil.newHashMapWithExpectedSize(var1.vertexSet().size());

         for (Object var3 : var1.vertexSet()) {
            this.cardinalityMap.put((V)var3, 0);
         }

         this.maxCardinality = 0;
      }
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
      if (this.remainingVertices <= 0) {
         return null;
      }

      Set var1 = this.buckets.get(this.maxCardinality);
      Object var2 = var1.iterator().next();
      this.removeFromBucket((V)var2);
      if (var1.isEmpty()) {
         this.buckets.set(this.maxCardinality, null);

         do {
            this.maxCardinality--;
         } while (this.maxCardinality >= 0 && this.buckets.get(this.maxCardinality) == null);
      }

      this.updateNeighbours((V)var2);
      this.remainingVertices--;
      return (V)var2;
   }

   private int removeFromBucket(V var1) {
      if (this.cardinalityMap.containsKey(var1)) {
         int var2 = this.cardinalityMap.get(var1);
         this.buckets.get(var2).remove(var1);
         this.cardinalityMap.remove(var1);
         if (this.buckets.get(var2).isEmpty()) {
            this.buckets.set(var2, null);
         }

         return var2;
      } else {
         return -1;
      }
   }

   private void addToBucket(V var1, int var2) {
      this.cardinalityMap.put((V)var1, var2);
      if (this.buckets.get(var2) == null) {
         this.buckets.set(var2, new LinkedHashSet());
      }

      this.buckets.get(var2).add((V)var1);
   }

   private void updateNeighbours(V var1) {
      HashSet var2 = new HashSet();

      for (Object var4 : this.graph.edgesOf((V)var1)) {
         Object var5 = Graphs.getOppositeVertex(this.graph, (E)var4, (V)var1);
         if (this.cardinalityMap.containsKey(var5) && !var2.contains(var5)) {
            var2.add(var5);
            this.addToBucket((V)var5, this.removeFromBucket((V)var5) + 1);
         }
      }

      if (this.maxCardinality < this.graph.vertexSet().size() && this.maxCardinality >= 0 && this.buckets.get(this.maxCardinality + 1) != null) {
         this.maxCardinality++;
      }
   }
}
