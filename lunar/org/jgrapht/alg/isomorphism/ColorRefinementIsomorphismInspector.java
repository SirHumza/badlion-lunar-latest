package org.jgrapht.alg.isomorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphMapping;
import org.jgrapht.GraphTests;
import org.jgrapht.GraphType;
import org.jgrapht.alg.color.ColorRefinementAlgorithm;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.AsGraphUnion;
import org.jgrapht.graph.builder.GraphTypeBuilder;

public class ColorRefinementIsomorphismInspector<V, E> implements IsomorphismInspector<V, E> {
   private Graph<V, E> graph1;
   private Graph<V, E> graph2;
   private IsomorphicGraphMapping<V, E> isomorphicGraphMapping;
   private Boolean isIsomorphic;
   private boolean isColoringDiscrete;
   private boolean isForest;
   private boolean isomorphismTestExecuted;

   public ColorRefinementIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2) {
      GraphType var3 = var1.getType();
      GraphType var4 = var2.getType();
      if (var3.isAllowingMultipleEdges() || var4.isAllowingMultipleEdges()) {
         throw new IllegalArgumentException("graphs with multiple (parallel) edges are not supported");
      }

      if (!var3.isMixed() && !var4.isMixed()) {
         if ((!var3.isUndirected() || !var4.isDirected()) && (!var3.isDirected() || !var4.isUndirected())) {
            this.graph1 = var1;
            this.graph2 = var2;
            this.isomorphicGraphMapping = null;
            this.isColoringDiscrete = false;
            this.isomorphismTestExecuted = false;
            this.isForest = false;
         } else {
            throw new IllegalArgumentException("can not match directed with undirected graphs");
         }
      } else {
         throw new IllegalArgumentException("mixed graphs not supported");
      }
   }

   @Override
   public Iterator<GraphMapping<V, E>> getMappings() {
      if (!this.isomorphismTestExecuted) {
         this.isomorphismExists();
      }

      ArrayList var1 = new ArrayList(1);
      if (this.isIsomorphic != null && this.isIsomorphic) {
         var1.add(this.isomorphicGraphMapping);
      }

      return var1.iterator();
   }

   @Override
   public boolean isomorphismExists() {
      if (this.isomorphismTestExecuted) {
         if (this.isIsomorphic != null) {
            return this.isIsomorphic;
         } else {
            throw new IsomorphismUndecidableException();
         }
      } else {
         if (this.graph1 == this.graph2) {
            this.isomorphismTestExecuted = true;
            this.isIsomorphic = true;
            this.isomorphicGraphMapping = IsomorphicGraphMapping.identity(this.graph1);
            return this.isIsomorphic;
         }

         if (this.graph1.vertexSet().size() != this.graph2.vertexSet().size()) {
            this.isomorphismTestExecuted = true;
            this.isIsomorphic = false;
            return this.isIsomorphic;
         }

         Graph var1 = this.getDisjointGraphUnion(this.graph1, this.graph2);
         ColorRefinementAlgorithm var2 = new ColorRefinementAlgorithm(var1);
         VertexColoringAlgorithm.Coloring var3 = var2.getColoring();
         this.isomorphismTestExecuted = true;
         this.isIsomorphic = this.coarseColoringAreEqual(var3);
         if (this.isIsomorphic) {
            assert this.isomorphicGraphMapping.isValidIsomorphism();
         }

         return this.isIsomorphic;
      }
   }

   boolean isColoringDiscrete() {
      if (!this.isomorphismTestExecuted) {
         this.isomorphismExists();
      }

      return this.isColoringDiscrete;
   }

   boolean isForest() {
      if (!this.isomorphismTestExecuted) {
         this.isomorphismExists();
      }

      return this.isForest;
   }

   private boolean coarseColoringAreEqual(VertexColoringAlgorithm.Coloring<ColorRefinementIsomorphismInspector.DistinctGraphObject<V, V, E>> var1) {
      Pair var2 = this.splitColoring(var1);
      VertexColoringAlgorithm.Coloring var3 = (VertexColoringAlgorithm.Coloring)var2.getFirst();
      VertexColoringAlgorithm.Coloring var4 = (VertexColoringAlgorithm.Coloring)var2.getSecond();
      if (var3.getNumberColors() != var4.getNumberColors()) {
         return false;
      }

      List var5 = var3.getColorClasses();
      List var6 = var4.getColorClasses();
      if (var5.size() != var6.size()) {
         return false;
      }

      this.sortColorClasses(var5, var3);
      this.sortColorClasses(var6, var4);
      Iterator var7 = var5.iterator();
      Iterator var8 = var6.iterator();

      while (var7.hasNext() && var8.hasNext()) {
         Set var9 = (Set)var7.next();
         Set var10 = (Set)var8.next();
         if (var9.size() != var10.size()) {
            return false;
         }

         if (var9.iterator().hasNext() && !((Integer)var3.getColors().get(var9.iterator().next())).equals(var4.getColors().get(var10.iterator().next()))) {
            return false;
         }
      }

      if (!var7.hasNext() && !var8.hasNext()) {
         if (var3.getColorClasses().size() == this.graph1.vertexSet().size() && var4.getColorClasses().size() == this.graph2.vertexSet().size()) {
            this.isColoringDiscrete = true;
            this.calculateGraphMapping(var3, var4);
            return true;
         } else if (GraphTests.isForest(this.graph1) && GraphTests.isForest(this.graph2)) {
            this.isForest = true;
            this.calculateGraphMapping(var3, var4);
            return true;
         } else {
            this.isIsomorphic = null;
            throw new IsomorphismUndecidableException("Color refinement cannot decide whether the two graphs are isomorphic or not.");
         }
      } else {
         return false;
      }
   }

   private Pair<VertexColoringAlgorithm.Coloring<V>, VertexColoringAlgorithm.Coloring<V>> splitColoring(
      VertexColoringAlgorithm.Coloring<ColorRefinementIsomorphismInspector.DistinctGraphObject<V, V, E>> var1
   ) {
      HashMap var2 = new HashMap();
      HashMap var3 = new HashMap();
      int var4 = 0;

      for (Set var6 : var1.getColorClasses()) {
         for (ColorRefinementIsomorphismInspector.DistinctGraphObject var8 : var6) {
            if (var8.getGraph() == this.graph1) {
               var2.put(var8.getObject(), var4);
            } else {
               var3.put(var8.getObject(), var4);
            }
         }

         var4++;
      }

      VertexColoringAlgorithm.ColoringImpl var9 = new VertexColoringAlgorithm.ColoringImpl(var2, var2.size());
      VertexColoringAlgorithm.ColoringImpl var10 = new VertexColoringAlgorithm.ColoringImpl(var3, var3.size());
      return new Pair<>(var9, var10);
   }

   private void sortColorClasses(List<Set<V>> var1, VertexColoringAlgorithm.Coloring<V> var2) {
      var1.sort(
         (var1x, var2x) -> {
            if (var1x.size() == var2x.size()) {
               Iterator var3 = var1x.iterator();
               Iterator var4 = var2x.iterator();
               return var3.hasNext() && var4.hasNext()
                  ? ((Integer)var2.getColors().get(var3.next())).compareTo((Integer)var2.getColors().get(var4.next()))
                  : Integer.compare(var1x.size(), var2x.size());
            } else {
               return Integer.compare(var1x.size(), var2x.size());
            }
         }
      );
   }

   private void calculateGraphMapping(VertexColoringAlgorithm.Coloring<V> var1, VertexColoringAlgorithm.Coloring<V> var2) {
      GraphOrdering var3 = new GraphOrdering<>(this.graph1);
      GraphOrdering var4 = new GraphOrdering<>(this.graph2);
      int[] var5 = new int[this.graph1.vertexSet().size()];
      int[] var6 = new int[this.graph2.vertexSet().size()];
      Iterator var7 = var1.getColorClasses().iterator();
      Iterator var8 = var2.getColorClasses().iterator();

      while (var7.hasNext()) {
         Iterator var9 = ((Set)var7.next()).iterator();
         Iterator var10 = ((Set)var8.next()).iterator();

         while (var9.hasNext()) {
            Object var11 = var9.next();
            Object var12 = var10.next();
            int var13 = var3.getVertexNumber(var11);
            int var14 = var4.getVertexNumber(var12);
            var5[var13] = var14;
            var6[var14] = var13;
         }
      }

      this.isomorphicGraphMapping = new IsomorphicGraphMapping<>(var3, var4, var5, var6);
   }

   private Graph<ColorRefinementIsomorphismInspector.DistinctGraphObject<V, V, E>, ColorRefinementIsomorphismInspector.DistinctGraphObject<E, V, E>> getDisjointGraphUnion(
      Graph<V, E> var1, Graph<V, E> var2
   ) {
      return new AsGraphUnion<>(this.getDistinctObjectGraph(var1), this.getDistinctObjectGraph(var2));
   }

   private Graph<ColorRefinementIsomorphismInspector.DistinctGraphObject<V, V, E>, ColorRefinementIsomorphismInspector.DistinctGraphObject<E, V, E>> getDistinctObjectGraph(
      Graph<V, E> var1
   ) {
      Graph var2 = GraphTypeBuilder.forGraphType(var1.getType()).buildGraph();

      for (Object var4 : var1.vertexSet()) {
         var2.addVertex(new ColorRefinementIsomorphismInspector.DistinctGraphObject<>(var4, var1));
      }

      for (Object var6 : var1.edgeSet()) {
         var2.addEdge(
            new ColorRefinementIsomorphismInspector.DistinctGraphObject<>(var1.getEdgeSource(var6), var1),
            new ColorRefinementIsomorphismInspector.DistinctGraphObject<>(var1.getEdgeTarget(var6), var1),
            new ColorRefinementIsomorphismInspector.DistinctGraphObject<>(var6, var1)
         );
      }

      return var2;
   }

   private static class DistinctGraphObject<T, V, E> {
      private Pair<T, Graph<V, E>> pair;

      private DistinctGraphObject(T var1, Graph<V, E> var2) {
         this.pair = Pair.of((T)var1, var2);
      }

      public T getObject() {
         return this.pair.getFirst();
      }

      public Graph<V, E> getGraph() {
         return this.pair.getSecond();
      }

      @Override
      public String toString() {
         return this.pair.toString();
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof ColorRefinementIsomorphismInspector.DistinctGraphObject)) {
            return false;
         }

         ColorRefinementIsomorphismInspector.DistinctGraphObject var2 = (ColorRefinementIsomorphismInspector.DistinctGraphObject)var1;
         return Objects.equals(this.getObject(), var2.getObject()) && this.getGraph() == var2.getGraph();
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.getObject(), System.identityHashCode(this.getGraph()));
      }

      public static <T, V, E> ColorRefinementIsomorphismInspector.DistinctGraphObject<T, V, E> of(T var0, Graph<V, E> var1) {
         return new ColorRefinementIsomorphismInspector.DistinctGraphObject<>((T)var0, var1);
      }
   }
}
