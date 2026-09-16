package org.jgrapht.alg.isomorphism;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphMapping;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.AsGraphUnion;
import org.jgrapht.graph.builder.GraphTypeBuilder;

public class AHUForestIsomorphismInspector<V, E> implements IsomorphismInspector<V, E> {
   private final Graph<V, E> forest1;
   private final Graph<V, E> forest2;
   private final Set<V> roots1;
   private final Set<V> roots2;
   private boolean computed = false;
   private IsomorphicGraphMapping<V, E> isomorphicMapping;

   public AHUForestIsomorphismInspector(Graph<V, E> var1, Set<V> var2, Graph<V, E> var3, Set<V> var4) {
      this.validateForest(var1, var2);
      this.forest1 = var1;
      this.roots1 = var2;
      this.validateForest(var3, var4);
      this.forest2 = var3;
      this.roots2 = var4;
   }

   private void validateForest(Graph<V, E> var1, Set<V> var2) {
      assert GraphTests.isSimple(var1);
      Objects.requireNonNull(var1, "input forest cannot be null");
      Objects.requireNonNull(var2, "set of roots cannot be null");
      if (var1.vertexSet().isEmpty()) {
         throw new IllegalArgumentException("input forest cannot be empty");
      }

      if (var2.isEmpty()) {
         throw new IllegalArgumentException("set of roots cannot be empty");
      }

      if (!var1.vertexSet().containsAll(var2)) {
         throw new IllegalArgumentException("root not contained in forest");
      }
   }

   @Override
   public Iterator<GraphMapping<V, E>> getMappings() {
      IsomorphicGraphMapping var1 = this.getMapping();
      return var1 == null ? Collections.emptyIterator() : Collections.singletonList(var1).iterator();
   }

   @Override
   public boolean isomorphismExists() {
      return this.getMapping() != null;
   }

   private Pair<V, Graph<V, E>> createSingleRootGraph(Graph<V, E> var1, Set<V> var2) {
      Graph var3 = GraphTypeBuilder.forGraph(var1).weighted(false).buildGraph();
      var2.forEach(var3::addVertex);
      Object var4 = var3.addVertex();

      for (Object var6 : var2) {
         var3.addEdge(var4, var6);
      }

      return Pair.of((V)var4, new AsGraphUnion<>(var3, var1));
   }

   public IsomorphicGraphMapping<V, E> getMapping() {
      if (this.computed) {
         return this.isomorphicMapping;
      }

      if (this.roots1.size() == 1 && this.roots2.size() == 1) {
         Object var10 = this.roots1.iterator().next();
         Object var11 = this.roots2.iterator().next();
         this.isomorphicMapping = new AHURootedTreeIsomorphismInspector<>(this.forest1, (V)var10, this.forest2, (V)var11).getMapping();
      } else {
         Pair var1 = this.createSingleRootGraph(this.forest1, this.roots1);
         Pair var2 = this.createSingleRootGraph(this.forest2, this.roots2);
         Object var3 = var1.getFirst();
         Graph var4 = (Graph)var1.getSecond();
         Object var5 = var2.getFirst();
         Graph var6 = (Graph)var2.getSecond();
         IsomorphicGraphMapping var7 = new AHURootedTreeIsomorphismInspector<Object, E>(var4, var3, var6, var5).getMapping();
         if (var7 != null) {
            HashMap var8 = new HashMap(var7.getForwardMapping());
            HashMap var9 = new HashMap(var7.getBackwardMapping());
            var8.remove(var3);
            var9.remove(var5);
            this.isomorphicMapping = new IsomorphicGraphMapping<>(var8, var9, this.forest1, this.forest2);
         }
      }

      this.computed = true;
      return this.isomorphicMapping;
   }
}
