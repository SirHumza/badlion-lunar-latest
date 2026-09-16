package org.jgrapht.alg.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.event.GraphEdgeChangeEvent;
import org.jgrapht.event.GraphListener;
import org.jgrapht.event.GraphVertexChangeEvent;
import org.jgrapht.util.ModifiableInteger;

public class NeighborCache<V, E> implements GraphListener<V, E> {
   private Map<V, NeighborCache.Neighbors<V>> successors = new HashMap<>();
   private Map<V, NeighborCache.Neighbors<V>> predecessors = new HashMap<>();
   private Map<V, NeighborCache.Neighbors<V>> neighbors = new HashMap<>();
   private Graph<V, E> graph;

   public NeighborCache(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1);
   }

   public Set<V> predecessorsOf(V var1) {
      return this.fetch((V)var1, this.predecessors, var2 -> new NeighborCache.Neighbors<>(Graphs.predecessorListOf(this.graph, (V)var1)));
   }

   public Set<V> successorsOf(V var1) {
      return this.fetch((V)var1, this.successors, var2 -> new NeighborCache.Neighbors<>(Graphs.successorListOf(this.graph, (V)var1)));
   }

   public Set<V> neighborsOf(V var1) {
      return this.fetch((V)var1, this.neighbors, var2 -> new NeighborCache.Neighbors<>(Graphs.neighborListOf(this.graph, (V)var1)));
   }

   public List<V> neighborListOf(V var1) {
      NeighborCache.Neighbors var2 = this.neighbors.get(var1);
      if (var2 == null) {
         var2 = new NeighborCache.Neighbors<>(Graphs.neighborListOf(this.graph, (V)var1));
         this.neighbors.put((V)var1, var2);
      }

      return var2.getNeighborList();
   }

   private Set<V> fetch(V var1, Map<V, NeighborCache.Neighbors<V>> var2, Function<V, NeighborCache.Neighbors<V>> var3) {
      return ((NeighborCache.Neighbors)var2.computeIfAbsent(var1, var3)).getNeighbors();
   }

   @Override
   public void edgeAdded(GraphEdgeChangeEvent<V, E> var1) {
      assert var1.getSource() == this.graph : "This NeighborCache is added as a listener to a graph other than the one specified during the construction of this NeighborCache!";
      Object var2 = var1.getEdgeSource();
      Object var3 = var1.getEdgeTarget();
      if (this.successors.containsKey(var2)) {
         this.successors.get(var2).addNeighbor((V)var3);
      }

      if (this.predecessors.containsKey(var3)) {
         this.predecessors.get(var3).addNeighbor((V)var2);
      }

      if (this.neighbors.containsKey(var2)) {
         this.neighbors.get(var2).addNeighbor((V)var3);
      }

      if (this.neighbors.containsKey(var3)) {
         this.neighbors.get(var3).addNeighbor((V)var2);
      }
   }

   @Override
   public void edgeRemoved(GraphEdgeChangeEvent<V, E> var1) {
      assert var1.getSource() == this.graph : "This NeighborCache is added as a listener to a graph other than the one specified during the construction of this NeighborCache!";
      Object var2 = var1.getEdgeSource();
      Object var3 = var1.getEdgeTarget();
      if (this.successors.containsKey(var2)) {
         this.successors.get(var2).removeNeighbor((V)var3);
      }

      if (this.predecessors.containsKey(var3)) {
         this.predecessors.get(var3).removeNeighbor((V)var2);
      }

      if (this.neighbors.containsKey(var2)) {
         this.neighbors.get(var2).removeNeighbor((V)var3);
      }

      if (this.neighbors.containsKey(var3)) {
         this.neighbors.get(var3).removeNeighbor((V)var2);
      }
   }

   @Override
   public void vertexAdded(GraphVertexChangeEvent<V> var1) {
   }

   @Override
   public void vertexRemoved(GraphVertexChangeEvent<V> var1) {
      assert var1.getSource() == this.graph : "This NeighborCache is added as a listener to a graph other than the one specified during the construction of this NeighborCache!";
      this.successors.remove(var1.getVertex());
      this.predecessors.remove(var1.getVertex());
      this.neighbors.remove(var1.getVertex());
   }

   static class Neighbors<V> {
      private Map<V, ModifiableInteger> neighborCounts = new LinkedHashMap<>();
      private Set<V> neighborSet = Collections.unmodifiableSet(this.neighborCounts.keySet());

      public Neighbors(Collection<V> var1) {
         for (Object var3 : var1) {
            this.addNeighbor((V)var3);
         }
      }

      public void addNeighbor(V var1) {
         ModifiableInteger var2 = this.neighborCounts.get(var1);
         if (var2 == null) {
            var2 = new ModifiableInteger(1);
            this.neighborCounts.put((V)var1, var2);
         } else {
            var2.increment();
         }
      }

      public void removeNeighbor(V var1) {
         ModifiableInteger var2 = this.neighborCounts.get(var1);
         if (var2 == null) {
            throw new IllegalArgumentException("Attempting to remove a neighbor that wasn't present");
         }

         var2.decrement();
         if (var2.getValue() == 0) {
            this.neighborCounts.remove(var1);
         }
      }

      public Set<V> getNeighbors() {
         return this.neighborSet;
      }

      public List<V> getNeighborList() {
         ArrayList var1 = new ArrayList();

         for (Entry var3 : this.neighborCounts.entrySet()) {
            Object var4 = var3.getKey();
            int var5 = ((ModifiableInteger)var3.getValue()).intValue();

            for (int var6 = 0; var6 < var5; var6++) {
               var1.add(var4);
            }
         }

         return var1;
      }

      @Override
      public String toString() {
         return this.neighborSet.toString();
      }
   }
}
