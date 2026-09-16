package org.jgrapht.alg.tour;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.util.ArrayUtil;

public class NearestNeighborHeuristicTSP<V, E> extends HamiltonianCycleAlgorithmBase<V, E> {
   private Random rng;
   private Iterator<V> initiaVertex;

   public NearestNeighborHeuristicTSP() {
      this(null, new Random());
   }

   public NearestNeighborHeuristicTSP(V var1) {
      this(Collections.singletonList(Objects.requireNonNull((V)var1, "Specified initial vertex cannot be null")), new Random());
   }

   public NearestNeighborHeuristicTSP(Iterable<V> var1) {
      this(Objects.requireNonNull(var1, "Specified initial vertices cannot be null"), new Random());
   }

   public NearestNeighborHeuristicTSP(long var1) {
      this(null, new Random(var1));
   }

   public NearestNeighborHeuristicTSP(Random var1) {
      this(null, Objects.requireNonNull(var1, "Random number generator cannot be null"));
   }

   private NearestNeighborHeuristicTSP(Iterable<V> var1, Random var2) {
      if (var1 != null) {
         Iterator var3 = var1.iterator();
         this.initiaVertex = var3.hasNext() ? var3 : null;
      }

      this.rng = var2;
   }

   @Override
   public GraphPath<V, E> getTour(Graph<V, E> var1) {
      this.checkGraph(var1);
      if (var1.vertexSet().size() == 1) {
         return this.getSingletonTour(var1);
      }

      Set var2 = var1.vertexSet();
      int var3 = var2.size();
      Object[] var4 = var2.toArray(new Object[var3 + 1]);
      List var5 = Arrays.asList(var4);
      int var6 = this.getFirstVertexIndex(var5);
      ArrayUtil.swap(var4, 0, var6);
      int var7 = var3 - 1;

      for (int var8 = 1; var8 < var7; var8++) {
         Object var9 = var4[var8 - 1];
         int var10 = getNearestNeighbor(var9, var4, var8, var1);
         ArrayUtil.swap(var4, var8, var10);
      }

      var4[var3] = var4[0];
      return this.closedVertexListToTour(var5, var1);
   }

   private int getFirstVertexIndex(List<V> var1) {
      if (this.initiaVertex != null) {
         Object var2 = this.initiaVertex.next();
         if (!this.initiaVertex.hasNext()) {
            this.initiaVertex = null;
         }

         int var3 = var1.indexOf(var2);
         if (var3 < 0) {
            throw new IllegalArgumentException("Specified initial vertex is not in graph");
         } else {
            return var3;
         }
      } else {
         return this.rng.nextInt(var1.size() - 1);
      }
   }

   private static <V, E> int getNearestNeighbor(V var0, V[] var1, int var2, Graph<V, E> var3) {
      int var4 = -1;
      double var5 = Double.MAX_VALUE;
      int var7 = var1.length - 1;

      for (int var8 = var2; var8 < var7; var8++) {
         Object var9 = var1[var8];
         double var10 = var3.getEdgeWeight(var3.getEdge(var0, var9));
         if (var10 < var5) {
            var4 = var8;
            var5 = var10;
         }
      }

      return var4;
   }
}
