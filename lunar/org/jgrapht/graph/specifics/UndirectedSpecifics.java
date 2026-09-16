package org.jgrapht.graph.specifics;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.graph.EdgeSetFactory;
import org.jgrapht.util.ArrayUnenforcedSet;

public class UndirectedSpecifics<V, E> implements Serializable, Specifics<V, E> {
   private static final long serialVersionUID = 4206026440450450992L;
   protected Graph<V, E> graph;
   protected Map<V, UndirectedEdgeContainer<V, E>> vertexMap;
   protected EdgeSetFactory<V, E> edgeSetFactory;

   public UndirectedSpecifics(Graph<V, E> var1, Map<V, UndirectedEdgeContainer<V, E>> var2, EdgeSetFactory<V, E> var3) {
      this.graph = Objects.requireNonNull(var1);
      this.vertexMap = Objects.requireNonNull(var2);
      this.edgeSetFactory = Objects.requireNonNull(var3);
   }

   @Override
   public boolean addVertex(V var1) {
      UndirectedEdgeContainer var2 = this.vertexMap.get(var1);
      if (var2 == null) {
         this.vertexMap.put((V)var1, new UndirectedEdgeContainer<>(this.edgeSetFactory, (V)var1));
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

         for (Object var5 : this.getEdgeContainer((V)var1).vertexEdges) {
            boolean var6 = this.isEqualsStraightOrInverted(var1, var2, (E)var5);
            if (var6) {
               var3.add(var5);
            }
         }
      }

      return var3;
   }

   @Override
   public E getEdge(V var1, V var2) {
      if (this.graph.containsVertex((V)var1) && this.graph.containsVertex((V)var2)) {
         for (Object var4 : this.getEdgeContainer((V)var1).vertexEdges) {
            boolean var5 = this.isEqualsStraightOrInverted(var1, var2, (E)var4);
            if (var5) {
               return (E)var4;
            }
         }
      }

      return null;
   }

   private boolean isEqualsStraightOrInverted(Object var1, Object var2, E var3) {
      boolean var4 = var1.equals(this.graph.getEdgeSource((E)var3)) && var2.equals(this.graph.getEdgeTarget((E)var3));
      boolean var5 = var1.equals(this.graph.getEdgeTarget((E)var3)) && var2.equals(this.graph.getEdgeSource((E)var3));
      return var4 || var5;
   }

   @Override
   public boolean addEdgeToTouchingVertices(V var1, V var2, E var3) {
      this.getEdgeContainer((V)var1).addEdge((E)var3);
      if (!var1.equals(var2)) {
         this.getEdgeContainer((V)var2).addEdge((E)var3);
      }

      return true;
   }

   @Override
   public boolean addEdgeToTouchingVerticesIfAbsent(V var1, V var2, E var3) {
      UndirectedEdgeContainer var4 = this.getEdgeContainer((V)var1);

      for (Object var6 : var4.vertexEdges) {
         if (this.isEqualsStraightOrInverted(var1, var2, (E)var6)) {
            return false;
         }
      }

      var4.addEdge(var3);
      this.getEdgeContainer((V)var2).addEdge((E)var3);
      return true;
   }

   @Override
   public E createEdgeToTouchingVerticesIfAbsent(V var1, V var2, Supplier<E> var3) {
      UndirectedEdgeContainer var4 = this.getEdgeContainer((V)var1);

      for (Object var6 : var4.vertexEdges) {
         if (this.isEqualsStraightOrInverted(var1, var2, (E)var6)) {
            return null;
         }
      }

      Object var7 = var3.get();
      var4.addEdge(var7);
      this.getEdgeContainer((V)var2).addEdge((E)var7);
      return (E)var7;
   }

   @Override
   public int degreeOf(V var1) {
      if (this.graph.getType().isAllowingSelfLoops()) {
         int var2 = 0;

         for (Object var5 : this.getEdgeContainer((V)var1).vertexEdges) {
            if (this.graph.getEdgeSource((E)var5).equals(this.graph.getEdgeTarget((E)var5))) {
               var2 += 2;
            } else {
               var2++;
            }
         }

         return var2;
      } else {
         return this.getEdgeContainer((V)var1).edgeCount();
      }
   }

   @Override
   public Set<E> edgesOf(V var1) {
      return this.getEdgeContainer((V)var1).getUnmodifiableVertexEdges();
   }

   @Override
   public int inDegreeOf(V var1) {
      return this.degreeOf((V)var1);
   }

   @Override
   public Set<E> incomingEdgesOf(V var1) {
      return this.getEdgeContainer((V)var1).getUnmodifiableVertexEdges();
   }

   @Override
   public int outDegreeOf(V var1) {
      return this.degreeOf((V)var1);
   }

   @Override
   public Set<E> outgoingEdgesOf(V var1) {
      return this.getEdgeContainer((V)var1).getUnmodifiableVertexEdges();
   }

   @Override
   public void removeEdgeFromTouchingVertices(V var1, V var2, E var3) {
      this.getEdgeContainer((V)var1).removeEdge((E)var3);
      if (!var1.equals(var2)) {
         this.getEdgeContainer((V)var2).removeEdge((E)var3);
      }
   }

   protected UndirectedEdgeContainer<V, E> getEdgeContainer(V var1) {
      UndirectedEdgeContainer var2 = this.vertexMap.get(var1);
      if (var2 == null) {
         var2 = new UndirectedEdgeContainer<>(this.edgeSetFactory, (V)var1);
         this.vertexMap.put((V)var1, var2);
      }

      return var2;
   }
}
