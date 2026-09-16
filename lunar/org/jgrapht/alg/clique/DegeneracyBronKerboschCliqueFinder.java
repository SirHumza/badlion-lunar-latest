package org.jgrapht.alg.clique;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;
import org.jgrapht.traverse.DegeneracyOrderingIterator;

public class DegeneracyBronKerboschCliqueFinder<V, E> extends PivotBronKerboschCliqueFinder<V, E> {
   public DegeneracyBronKerboschCliqueFinder(Graph<V, E> var1) {
      this(var1, 0L, TimeUnit.SECONDS);
   }

   public DegeneracyBronKerboschCliqueFinder(Graph<V, E> var1, long var2, TimeUnit var4) {
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
         } catch (ArithmeticException var13) {
            var1 = Long.MAX_VALUE;
         }

         ArrayList var3 = new ArrayList();
         new DegeneracyOrderingIterator<>(this.graph).forEachRemaining(var3::add);
         int var4 = var3.size();

         for (int var5 = 0; var5 < var4; var5++) {
            Object var6 = var3.get(var5);
            HashSet var7 = new HashSet();

            for (Object var9 : this.graph.edgesOf((V)var6)) {
               var7.add(Graphs.getOppositeVertex(this.graph, (E)var9, (V)var6));
            }

            HashSet var14 = new HashSet();

            for (int var15 = var5 + 1; var15 < var4; var15++) {
               Object var10 = var3.get(var15);
               if (var7.contains(var10)) {
                  var14.add(var10);
               }
            }

            HashSet var16 = new HashSet();
            var16.add(var6);
            HashSet var17 = new HashSet();

            for (int var11 = 0; var11 < var5; var11++) {
               Object var12 = var3.get(var11);
               if (var7.contains(var12)) {
                  var17.add(var12);
               }
            }

            this.findCliques(var14, var16, var17, var1);
         }
      }
   }
}
