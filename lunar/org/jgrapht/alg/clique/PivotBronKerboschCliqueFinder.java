package org.jgrapht.alg.clique;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;
import org.jgrapht.Graphs;

public class PivotBronKerboschCliqueFinder<V, E> extends BaseBronKerboschCliqueFinder<V, E> {
   public PivotBronKerboschCliqueFinder(Graph<V, E> var1) {
      this(var1, 0L, TimeUnit.SECONDS);
   }

   public PivotBronKerboschCliqueFinder(Graph<V, E> var1, long var2, TimeUnit var4) {
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

         this.findCliques(new HashSet<>(this.graph.vertexSet()), new HashSet(), new HashSet(), var1);
      }
   }

   private V choosePivot(Set<V> var1, Set<V> var2) {
      int var3 = -1;
      Object var4 = null;
      Iterator var5 = Stream.concat(var1.stream(), var2.stream()).iterator();

      while (var5.hasNext()) {
         Object var6 = var5.next();
         int var7 = 0;

         for (Object var9 : this.graph.edgesOf((V)var6)) {
            if (var1.contains(Graphs.getOppositeVertex(this.graph, (E)var9, (V)var6))) {
               var7++;
            }
         }

         if (var7 > var3) {
            var3 = var7;
            var4 = var6;
         }
      }

      return (V)var4;
   }

   protected void findCliques(Set<V> var1, Set<V> var2, Set<V> var3, long var4) {
      if (var1.isEmpty() && var3.isEmpty()) {
         HashSet var15 = new HashSet<>(var2);
         this.allMaximalCliques.add(var15);
         this.maxSize = Math.max(this.maxSize, var15.size());
      } else if (var4 - System.nanoTime() < 0L) {
         this.timeLimitReached = true;
      } else {
         Object var6 = this.choosePivot(var1, var3);
         HashSet var7 = new HashSet();

         for (Object var9 : this.graph.edgesOf((V)var6)) {
            var7.add(Graphs.getOppositeVertex(this.graph, (E)var9, (V)var6));
         }

         HashSet var16 = new HashSet();

         for (Object var10 : var1) {
            if (!var7.contains(var10)) {
               var16.add(var10);
            }
         }

         for (Object var19 : var16) {
            HashSet var11 = new HashSet();

            for (Object var13 : this.graph.edgesOf((V)var19)) {
               var11.add(Graphs.getOppositeVertex(this.graph, (E)var13, (V)var19));
            }

            Set var20 = var1.stream().filter(var11::contains).collect(Collectors.toSet());
            Set var21 = var3.stream().filter(var11::contains).collect(Collectors.toSet());
            HashSet var14 = new HashSet<>(var2);
            var14.add(var19);
            this.findCliques(var20, var14, var21, var4);
            var1.remove(var19);
            var3.add(var19);
         }
      }
   }
}
