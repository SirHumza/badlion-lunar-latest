package org.jgrapht.alg.scoring;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexScoringAlgorithm;

public final class Coreness<V, E> implements VertexScoringAlgorithm<V, Integer> {
   private final Graph<V, E> g;
   private Map<V, Integer> scores;
   private int degeneracy;

   public Coreness(Graph<V, E> var1) {
      this.g = GraphTests.requireUndirected(var1);
   }

   @Override
   public Map<V, Integer> getScores() {
      this.lazyRun();
      return Collections.unmodifiableMap(this.scores);
   }

   public Integer getVertexScore(V var1) {
      if (!this.g.containsVertex((V)var1)) {
         throw new IllegalArgumentException("Cannot return score of unknown vertex");
      }

      this.lazyRun();
      return this.scores.get(var1);
   }

   public int getDegeneracy() {
      this.lazyRun();
      return this.degeneracy;
   }

   private void lazyRun() {
      if (this.scores == null) {
         if (!GraphTests.isSimple(this.g)) {
            throw new IllegalArgumentException("Graph must be simple");
         }

         this.scores = new HashMap<>();
         this.degeneracy = 0;
         int var1 = this.g.vertexSet().size();
         int var2 = var1 - 1;
         Set[] var3 = (Set[])Array.newInstance(Set.class, var2 + 1);

         for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = new HashSet();
         }

         int var12 = var1;
         HashMap var5 = new HashMap();

         for (Object var7 : this.g.vertexSet()) {
            int var8 = this.g.degreeOf((V)var7);
            var3[var8].add(var7);
            var5.put(var7, var8);
            var12 = Math.min(var12, var8);
         }

         while (var12 < var1) {
            Set var13 = var3[var12];
            if (var13.isEmpty()) {
               var12++;
            } else {
               Object var14 = var13.iterator().next();
               var13.remove(var14);
               this.scores.put((V)var14, var12);
               this.degeneracy = Math.max(this.degeneracy, var12);

               for (Object var9 : this.g.edgesOf((V)var14)) {
                  Object var10 = Graphs.getOppositeVertex(this.g, (E)var9, (V)var14);
                  int var11 = (Integer)var5.get(var10);
                  if (var11 > var12 && !this.scores.containsKey(var10)) {
                     var3[var11].remove(var10);
                     var5.put(var10, --var11);
                     var3[var11].add(var10);
                     var12 = Math.min(var12, var11);
                  }
               }
            }
         }
      }
   }
}
