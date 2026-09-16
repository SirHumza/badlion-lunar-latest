package org.jgrapht.alg.drawing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import org.jgrapht.Graph;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.alg.interfaces.PartitioningAlgorithm;
import org.jgrapht.alg.partition.BipartitePartitioning;
import org.jgrapht.alg.util.Pair;

public class TwoLayeredBipartiteLayout2D<V, E> implements LayoutAlgorithm2D<V, E> {
   protected Comparator<V> vertexComparator;
   protected boolean vertical;
   protected Set<V> partition;

   public TwoLayeredBipartiteLayout2D() {
      this(null, null, true);
   }

   public TwoLayeredBipartiteLayout2D(Set<V> var1, Comparator<V> var2, boolean var3) {
      this.partition = var1;
      this.vertexComparator = var2;
      this.vertical = var3;
   }

   public TwoLayeredBipartiteLayout2D<V, E> withVertexComparator(Comparator<V> var1) {
      this.vertexComparator = var1;
      return this;
   }

   public TwoLayeredBipartiteLayout2D<V, E> withVertical(boolean var1) {
      this.vertical = var1;
      return this;
   }

   public TwoLayeredBipartiteLayout2D<V, E> withFirstPartition(Set<V> var1) {
      this.partition = var1;
      return this;
   }

   @Override
   public void layout(Graph<V, E> var1, LayoutModel2D<V> var2) {
      Pair var3 = this.computePartitions(var1);
      this.drawFirstPartition(var1, (List<V>)var3.getFirst(), var2);
      this.drawSecondPartition(var1, (List<V>)var3.getSecond(), var2);
   }

   protected void drawFirstPartition(Graph<V, E> var1, List<V> var2, LayoutModel2D<V> var3) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Partition cannot be empty");
      }

      Box2D var4 = var3.getDrawableArea();
      double var5 = var4.getHeight();
      double var7 = var4.getWidth();
      double var9 = var4.getMinX();
      double var11 = var4.getMinY();
      int var13 = var2.size();
      double var14 = 0.0;
      if (var13 > 1) {
         var14 = (this.vertical ? var5 : var7) / (var13 - 1);
      }

      if (this.vertical) {
         double var16 = var11;

         for (Object var19 : var2) {
            var3.put(var19, Point2D.of(var9, var16));
            var16 += var14;
         }
      } else {
         double var20 = var9;

         for (Object var22 : var2) {
            var3.put(var22, Point2D.of(var20, var11));
            var20 += var14;
         }
      }
   }

   protected void drawSecondPartition(Graph<V, E> var1, List<V> var2, LayoutModel2D<V> var3) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Partition cannot be empty");
      }

      Box2D var4 = var3.getDrawableArea();
      double var5 = var4.getHeight();
      double var7 = var4.getWidth();
      double var9 = var4.getMinX();
      double var11 = var4.getMinY();
      int var13 = var2.size();
      double var14 = 0.0;
      if (var13 > 1) {
         var14 = (this.vertical ? var5 : var7) / (var13 - 1);
      }

      if (this.vertical) {
         double var16 = var11;

         for (Object var19 : var2) {
            var3.put(var19, Point2D.of(var9 + var7, var16));
            var16 += var14;
         }
      } else {
         double var20 = var9;

         for (Object var22 : var2) {
            var3.put(var22, Point2D.of(var20, var11 + var5));
            var20 += var14;
         }
      }
   }

   protected Pair<List<V>, List<V>> computePartitions(Graph<V, E> var1) {
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      if (this.partition != null) {
         for (Object var5 : var1.vertexSet()) {
            if (this.partition.contains(var5)) {
               var2.add(var5);
            } else {
               var3.add(var5);
            }
         }

         for (Object var10 : var1.edgeSet()) {
            Object var6 = var1.getEdgeSource(var10);
            Object var7 = var1.getEdgeTarget(var10);
            if (!(this.partition.contains(var6) ^ this.partition.contains(var7))) {
               throw new IllegalArgumentException("Invalid provided bipartite partition.");
            }
         }
      } else {
         PartitioningAlgorithm.Partitioning var9 = new BipartitePartitioning(var1).getPartitioning();
         if (var9 == null) {
            throw new IllegalArgumentException("Graph is not bipartite.");
         }

         var2.addAll(var9.getPartition(0));
         var3.addAll(var9.getPartition(1));
      }

      if (this.vertexComparator != null) {
         var2.sort(this.vertexComparator);
         var3.sort(this.vertexComparator);
      }

      return Pair.of(var2, var3);
   }
}
