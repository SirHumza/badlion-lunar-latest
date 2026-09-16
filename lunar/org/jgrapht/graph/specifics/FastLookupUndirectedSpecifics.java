package org.jgrapht.graph.specifics;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.alg.util.UnorderedPair;
import org.jgrapht.graph.EdgeSetFactory;

public class FastLookupUndirectedSpecifics<V, E> extends UndirectedSpecifics<V, E> {
   private static final long serialVersionUID = 225772727571597846L;
   protected Map<Pair<V, V>, Set<E>> touchingVerticesToEdgeMap;

   public FastLookupUndirectedSpecifics(Graph<V, E> var1, Map<V, UndirectedEdgeContainer<V, E>> var2, Map<Pair<V, V>, Set<E>> var3, EdgeSetFactory<V, E> var4) {
      super(var1, var2, var4);
      this.touchingVerticesToEdgeMap = Objects.requireNonNull(var3);
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      if (this.graph.containsVertex((V)var1) && this.graph.containsVertex((V)var2)) {
         Set var3 = this.touchingVerticesToEdgeMap.get(new UnorderedPair<>(var1, var2));
         if (var3 == null) {
            return Collections.emptySet();
         }

         Set var4 = this.edgeSetFactory.createEdgeSet((V)var1);
         var4.addAll(var3);
         return var4;
      } else {
         return null;
      }
   }

   @Override
   public E getEdge(V var1, V var2) {
      Set var3 = this.touchingVerticesToEdgeMap.get(new UnorderedPair<>(var1, var2));
      return (E)(var3 != null && !var3.isEmpty() ? var3.iterator().next() : null);
   }

   @Override
   public boolean addEdgeToTouchingVertices(V var1, V var2, E var3) {
      if (!super.addEdgeToTouchingVertices((V)var1, (V)var2, (E)var3)) {
         return false;
      }

      this.addToIndex((V)var1, (V)var2, (E)var3);
      return true;
   }

   @Override
   public boolean addEdgeToTouchingVerticesIfAbsent(V var1, V var2, E var3) {
      Object var4 = this.getEdge((V)var1, (V)var2);
      return var4 != null ? false : this.addEdgeToTouchingVertices((V)var1, (V)var2, (E)var3);
   }

   @Override
   public E createEdgeToTouchingVerticesIfAbsent(V var1, V var2, Supplier<E> var3) {
      Object var4 = this.getEdge((V)var1, (V)var2);
      if (var4 != null) {
         return null;
      }

      Object var5 = var3.get();
      this.addEdgeToTouchingVertices((V)var1, (V)var2, (E)var5);
      return (E)var5;
   }

   @Override
   public void removeEdgeFromTouchingVertices(V var1, V var2, E var3) {
      super.removeEdgeFromTouchingVertices((V)var1, (V)var2, (E)var3);
      this.removeFromIndex((V)var1, (V)var2, (E)var3);
   }

   protected void addToIndex(V var1, V var2, E var3) {
      UnorderedPair var4 = new UnorderedPair<>(var1, var2);
      Set var5 = this.touchingVerticesToEdgeMap.get(var4);
      if (var5 != null) {
         var5.add(var3);
      } else {
         var5 = this.edgeSetFactory.createEdgeSet((V)var1);
         var5.add(var3);
         this.touchingVerticesToEdgeMap.put(var4, var5);
      }
   }

   protected void removeFromIndex(V var1, V var2, E var3) {
      UnorderedPair var4 = new UnorderedPair<>(var1, var2);
      Set var5 = this.touchingVerticesToEdgeMap.get(var4);
      if (var5 != null) {
         var5.remove(var3);
         if (var5.isEmpty()) {
            this.touchingVerticesToEdgeMap.remove(var4);
         }
      }
   }
}
