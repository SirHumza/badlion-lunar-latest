package org.jgrapht.alg.clique;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;

public class BronKerboschCliqueFinder<V, E> extends BaseBronKerboschCliqueFinder<V, E> {
   public BronKerboschCliqueFinder(Graph<V, E> var1) {
      this(var1, 0L, TimeUnit.SECONDS);
   }

   public BronKerboschCliqueFinder(Graph<V, E> var1, long var2, TimeUnit var4) {
      super(var1, var2, var4);
   }

   @Override
   protected void lazyRun() {
      if (this.allMaximalCliques == null) {
         if (!GraphTests.isSimple(this.graph)) {
            throw new IllegalArgumentException("Graph must be simple");
         }

         this.allMaximalCliques = new ArrayList<>();

         long var1;
         try {
            var1 = Math.addExact(System.nanoTime(), this.nanos);
         } catch (ArithmeticException var4) {
            var1 = Long.MAX_VALUE;
         }

         this.findCliques(new ArrayList(), new ArrayList<>(this.graph.vertexSet()), new ArrayList(), var1);
      }
   }

   private void findCliques(List<V> var1, List<V> var2, List<V> var3, long var4) {
      for (Object var7 : var3) {
         if (var2.stream().allMatch(var2x -> this.graph.containsEdge((V)var7, (V)var2x))) {
            return;
         }
      }

      for (Object var13 : new ArrayList<>(var2)) {
         if (var4 - System.nanoTime() < 0L) {
            this.timeLimitReached = true;
            return;
         }

         ArrayList var8 = new ArrayList();
         ArrayList var9 = new ArrayList();
         var1.add(var13);
         var2.remove(var13);

         for (Object var11 : var2) {
            if (this.graph.containsEdge((V)var13, (V)var11)) {
               var8.add(var11);
            }
         }

         for (Object var16 : var3) {
            if (this.graph.containsEdge((V)var13, (V)var16)) {
               var9.add(var16);
            }
         }

         if (var8.isEmpty() && var9.isEmpty()) {
            HashSet var15 = new HashSet<>(var1);
            this.allMaximalCliques.add(var15);
            this.maxSize = Math.max(this.maxSize, var15.size());
         } else {
            this.findCliques(var1, var8, var9, var4);
         }

         var3.add(var13);
         var1.remove(var13);
      }
   }
}
