package org.jgrapht.graph.builder;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.AsUnmodifiableGraph;

public abstract class AbstractGraphBuilder<V, E, G extends Graph<V, E>, B extends AbstractGraphBuilder<V, E, G, B>> {
   protected final G graph;

   public AbstractGraphBuilder(G var1) {
      this.graph = (G)var1;
   }

   protected abstract B self();

   public B addVertex(V var1) {
      this.graph.addVertex((V)var1);
      return this.self();
   }

   @SafeVarargs
   public final B addVertices(V... var1) {
      for (Object var5 : var1) {
         this.addVertex((V)var5);
      }

      return this.self();
   }

   public B addEdge(V var1, V var2) {
      Graphs.addEdgeWithVertices(this.graph, var1, var2);
      return this.self();
   }

   public B addEdge(V var1, V var2, E var3) {
      this.addVertex((V)var1);
      this.addVertex((V)var2);
      this.graph.addEdge((V)var1, (V)var2, (E)var3);
      return this.self();
   }

   @SafeVarargs
   public final B addEdgeChain(V var1, V var2, V... var3) {
      this.addEdge((V)var1, (V)var2);
      Object var4 = var2;

      for (Object var8 : var3) {
         this.addEdge((V)var4, (V)var8);
         var4 = var8;
      }

      return this.self();
   }

   public B addGraph(Graph<? extends V, ? extends E> var1) {
      Graphs.addGraph(this.graph, var1);
      return this.self();
   }

   public B removeVertex(V var1) {
      this.graph.removeVertex((V)var1);
      return this.self();
   }

   @SafeVarargs
   public final B removeVertices(V... var1) {
      for (Object var5 : var1) {
         this.removeVertex((V)var5);
      }

      return this.self();
   }

   public B removeEdge(V var1, V var2) {
      this.graph.removeEdge((V)var1, (V)var2);
      return this.self();
   }

   public B removeEdge(E var1) {
      this.graph.removeEdge((E)var1);
      return this.self();
   }

   public B addEdge(V var1, V var2, double var3) {
      Graphs.addEdgeWithVertices(this.graph, var1, var2, var3);
      return this.self();
   }

   public B addEdge(V var1, V var2, E var3, double var4) {
      this.addEdge((V)var1, (V)var2, (E)var3);
      this.graph.setEdgeWeight((E)var3, var4);
      return this.self();
   }

   public G build() {
      return this.graph;
   }

   public Graph<V, E> buildAsUnmodifiable() {
      return new AsUnmodifiableGraph<>(this.graph);
   }
}
