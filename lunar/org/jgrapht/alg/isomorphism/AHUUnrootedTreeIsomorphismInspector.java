package org.jgrapht.alg.isomorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.jgrapht.Graph;
import org.jgrapht.GraphMapping;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.shortestpath.TreeMeasurer;

public class AHUUnrootedTreeIsomorphismInspector<V, E> implements IsomorphismInspector<V, E> {
   private final Graph<V, E> tree1;
   private final Graph<V, E> tree2;
   private boolean computed;
   private AHURootedTreeIsomorphismInspector<V, E> ahuRootedTreeIsomorphismInspector;

   public AHUUnrootedTreeIsomorphismInspector(Graph<V, E> var1, Graph<V, E> var2) {
      this.validateTree(var1);
      this.tree1 = var1;
      this.validateTree(var2);
      this.tree2 = var2;
   }

   private void validateTree(Graph<V, E> var1) {
      GraphTests.requireUndirected(var1);
      assert GraphTests.isSimple(var1);
      if (var1.vertexSet().isEmpty()) {
         throw new IllegalArgumentException("tree cannot be empty");
      }
   }

   @Override
   public Iterator<GraphMapping<V, E>> getMappings() {
      IsomorphicGraphMapping var1 = this.getMapping();
      return var1 == null ? Collections.emptyIterator() : Collections.singletonList(var1).iterator();
   }

   @Override
   public boolean isomorphismExists() {
      if (this.computed) {
         return this.ahuRootedTreeIsomorphismInspector != null ? this.ahuRootedTreeIsomorphismInspector.isomorphismExists() : false;
      }

      this.computed = true;
      TreeMeasurer var1 = new TreeMeasurer<>(this.tree1);
      ArrayList var2 = new ArrayList<>(var1.getGraphCenter());
      TreeMeasurer var3 = new TreeMeasurer<>(this.tree2);
      ArrayList var4 = new ArrayList<>(var3.getGraphCenter());
      if (var2.size() == 1 && var4.size() == 1) {
         this.ahuRootedTreeIsomorphismInspector = new AHURootedTreeIsomorphismInspector<>(this.tree1, (V)var2.get(0), this.tree2, (V)var4.get(0));
      } else {
         if (var2.size() != 2 || var4.size() != 2) {
            return false;
         }

         this.ahuRootedTreeIsomorphismInspector = new AHURootedTreeIsomorphismInspector<>(this.tree1, (V)var2.get(0), this.tree2, (V)var4.get(0));
         if (!this.ahuRootedTreeIsomorphismInspector.isomorphismExists()) {
            this.ahuRootedTreeIsomorphismInspector = new AHURootedTreeIsomorphismInspector<>(this.tree1, (V)var2.get(1), this.tree2, (V)var4.get(0));
         }
      }

      return this.ahuRootedTreeIsomorphismInspector.isomorphismExists();
   }

   public IsomorphicGraphMapping<V, E> getMapping() {
      return this.isomorphismExists() ? this.ahuRootedTreeIsomorphismInspector.getMapping() : null;
   }
}
