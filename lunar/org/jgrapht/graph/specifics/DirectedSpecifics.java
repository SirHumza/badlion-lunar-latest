package org.jgrapht.graph.specifics;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.graph.EdgeSetFactory;
import org.jgrapht.util.ArrayUnenforcedSet;

public class DirectedSpecifics<V, E> implements Serializable, Specifics<V, E> {
   private static final long serialVersionUID = 5964807709682219859L;
   protected Graph<V, E> graph;
   protected Map<V, DirectedEdgeContainer<V, E>> vertexMap;
   protected EdgeSetFactory<V, E> edgeSetFactory;

   public DirectedSpecifics(Graph<V, E> var1, Map<V, DirectedEdgeContainer<V, E>> var2, EdgeSetFactory<V, E> var3) {
      this.graph = Objects.requireNonNull(var1);
      this.vertexMap = Objects.requireNonNull(var2);
      this.edgeSetFactory = Objects.requireNonNull(var3);
   }

   @Override
   public boolean addVertex(V var1) {
      DirectedEdgeContainer var2 = this.vertexMap.get(var1);
      if (var2 == null) {
         this.vertexMap.put((V)var1, new DirectedEdgeContainer<>(this.edgeSetFactory, (V)var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public Set<V> getVertexSet() {
      return this.vertexMap.keySet();
   }

   @Override
   public Set<E> getAllEdges(V var1, V var2) {
      ArrayUnenforcedSet var3 = null;
      if (this.graph.containsVertex((V)var1) && this.graph.containsVertex((V)var2)) {
         var3 = new ArrayUnenforcedSet();
         DirectedEdgeContainer var4 = this.getEdgeContainer((V)var1);

         for (Object var6 : var4.outgoing) {
            if (this.graph.getEdgeTarget((E)var6).equals(var2)) {
               var3.add(var6);
            }
         }
      }

      return var3;
   }

   @Override
   public E getEdge(V var1, V var2) {
      if (this.graph.containsVertex((V)var1) && this.graph.containsVertex((V)var2)) {
         DirectedEdgeContainer var3 = this.getEdgeContainer((V)var1);

         for (Object var5 : var3.outgoing) {
            if (this.graph.getEdgeTarget((E)var5).equals(var2)) {
               return (E)var5;
            }
         }
      }

      return null;
   }

   @Override
   public boolean addEdgeToTouchingVertices(V var1, V var2, E var3) {
      this.getEdgeContainer((V)var1).addOutgoingEdge((E)var3);
      this.getEdgeContainer((V)var2).addIncomingEdge((E)var3);
      return true;
   }

   @Override
   public boolean addEdgeToTouchingVerticesIfAbsent(V var1, V var2, E var3) {
      DirectedEdgeContainer var4 = this.getEdgeContainer((V)var1);

      for (Object var6 : var4.outgoing) {
         if (this.graph.getEdgeTarget((E)var6).equals(var2)) {
            return false;
         }
      }

      var4.addOutgoingEdge(var3);
      this.getEdgeContainer((V)var2).addIncomingEdge((E)var3);
      return true;
   }

   @Override
   public E createEdgeToTouchingVerticesIfAbsent(V var1, V var2, Supplier<E> var3) {
      DirectedEdgeContainer var4 = this.getEdgeContainer((V)var1);

      for (Object var6 : var4.outgoing) {
         if (this.graph.getEdgeTarget((E)var6).equals(var2)) {
            return null;
         }
      }

      Object var7 = var3.get();
      var4.addOutgoingEdge(var7);
      this.getEdgeContainer((V)var2).addIncomingEdge((E)var7);
      return (E)var7;
   }

   @Override
   public int degreeOf(V var1) {
      return this.inDegreeOf((V)var1) + this.outDegreeOf((V)var1);
   }

   @Override
   public Set<E> edgesOf(V var1) {
      ArrayUnenforcedSet var2 = new ArrayUnenforcedSet<>(this.getEdgeContainer((V)var1).incoming);
      if (this.graph.getType().isAllowingSelfLoops()) {
         for (Object var4 : this.getEdgeContainer((V)var1).outgoing) {
            Object var5 = this.graph.getEdgeTarget((E)var4);
            if (!var1.equals(var5)) {
               var2.add(var4);
            }
         }
      } else {
         var2.addAll(this.getEdgeContainer((V)var1).outgoing);
      }

      return Collections.unmodifiableSet(var2);
   }

   @Override
   public int inDegreeOf(V var1) {
      return this.getEdgeContainer((V)var1).incoming.size();
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      return this.getEdgeContainer((V)var1).getUnmodifiableIncomingEdges();
   }

   @Override
   public int outDegreeOf(V var1) {
      return this.getEdgeContainer((V)var1).outgoing.size();
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      return this.getEdgeContainer((V)var1).getUnmodifiableOutgoingEdges();
   }

   @Override
   public void removeEdgeFromTouchingVertices(V var1, V var2, E var3) {
      this.getEdgeContainer((V)var1).removeOutgoingEdge((E)var3);
      this.getEdgeContainer((V)var2).removeIncomingEdge((E)var3);
   }

   protected DirectedEdgeContainer<V, E> getEdgeContainer(V var1) {
      DirectedEdgeContainer var2 = this.vertexMap.get(var1);
      if (var2 == null) {
         var2 = new DirectedEdgeContainer<>(this.edgeSetFactory, (V)var1);
         this.vertexMap.put((V)var1, var2);
      }

      return var2;
   }
}
