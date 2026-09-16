package org.jgrapht.alg.drawing;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.alg.drawing.model.Points;

public class IndexedFRLayoutAlgorithm2D<V, E> extends FRLayoutAlgorithm2D<V, E> {
   public static final double DEFAULT_THETA_FACTOR = 0.5;
   protected double theta;
   protected long savedComparisons;

   public IndexedFRLayoutAlgorithm2D() {
      this(100, 0.5, 0.5);
   }

   public IndexedFRLayoutAlgorithm2D(int var1, double var2) {
      this(var1, var2, 0.5);
   }

   public IndexedFRLayoutAlgorithm2D(int var1, double var2, double var4) {
      this(var1, var2, var4, new Random());
   }

   public IndexedFRLayoutAlgorithm2D(int var1, double var2, double var4, Random var6) {
      this(var1, var2, var4, var6, 1.0E-9);
   }

   public IndexedFRLayoutAlgorithm2D(int var1, double var2, double var4, Random var6, double var7) {
      super(var1, var4, var6, var7);
      this.theta = var2;
      if (!(var2 < 0.0) && !(var2 > 1.0)) {
         this.savedComparisons = 0L;
      } else {
         throw new IllegalArgumentException("Illegal theta value");
      }
   }

   @Override
   public void layout(Graph<V, E> var1, LayoutModel2D<V> var2) {
      this.savedComparisons = 0L;
      super.layout(var1, var2);
   }

   @Override
   protected Map<V, Point2D> calculateRepulsiveForces(Graph<V, E> var1, LayoutModel2D<V> var2) {
      FRQuadTree var3 = new FRQuadTree(var2.getDrawableArea());

      for (Object var5 : var1.vertexSet()) {
         var3.insert(var2.get(var5));
      }

      Point2D var20 = Point2D.of(var2.getDrawableArea().getMinX(), var2.getDrawableArea().getMinY());
      HashMap var21 = new HashMap();

      for (Object var7 : var1.vertexSet()) {
         Point2D var8 = Points.subtract(var2.get(var7), var20);
         Point2D var9 = Point2D.of(0.0, 0.0);
         ArrayDeque var10 = new ArrayDeque();
         var10.add(var3.getRoot());

         while (!var10.isEmpty()) {
            FRQuadTree.Node var11 = (FRQuadTree.Node)var10.removeFirst();
            Box2D var12 = var11.getBox();
            double var13 = var12.getWidth();
            Point2D var15 = null;
            if (var11.isLeaf()) {
               if (!var11.hasPoints()) {
                  continue;
               }

               var15 = Points.subtract(var11.getPoints().iterator().next(), var20);
            } else {
               double var16 = Points.length(Points.subtract(var8, var11.getCentroid()));
               if (this.comparator.compare(var16, 0.0) == 0) {
                  this.savedComparisons = this.savedComparisons + (var11.getNumberOfPoints() - 1);
                  continue;
               }

               if (this.comparator.compare(var13 / var16, this.theta) >= 0) {
                  for (FRQuadTree.Node var24 : var11.getChildren()) {
                     var10.add(var24);
                  }
                  continue;
               }

               var15 = Points.subtract(var11.getCentroid(), var20);
               this.savedComparisons = this.savedComparisons + (var11.getNumberOfPoints() - 1);
            }

            if (this.comparator.compare(var8.getX(), var15.getX()) != 0 || this.comparator.compare(var8.getY(), var15.getY()) != 0) {
               Point2D var23 = Points.subtract(var8, var15);
               double var17 = Points.length(var23);
               Point2D var19 = Points.scalarMultiply(var23, this.repulsiveForce(var17) / var17);
               var9 = Points.add(var9, var19);
            }
         }

         var21.put(var7, var9);
      }

      return var21;
   }

   public long getSavedComparisons() {
      return this.savedComparisons;
   }
}
