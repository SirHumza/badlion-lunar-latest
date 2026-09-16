package org.jgrapht.alg.drawing;

import java.util.OptionalDouble;
import java.util.stream.StreamSupport;
import org.jgrapht.Graph;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;

public class RescaleLayoutAlgorithm2D<V, E> extends BaseLayoutAlgorithm2D<V, E> {
   private double scale;

   public RescaleLayoutAlgorithm2D(double var1) {
      if (var1 <= 0.0) {
         throw new IllegalArgumentException("Scale must be positive");
      }

      this.scale = var1;
   }

   @Override
   public void layout(Graph<V, E> var1, LayoutModel2D<V> var2) {
      Box2D var3 = var2.getDrawableArea();
      double var4 = var3.getMinX() + var3.getWidth() / 2.0;
      double var6 = var3.getMinY() + var3.getHeight() / 2.0;
      double var8 = 0.0;
      double var10 = 0.0;
      OptionalDouble var12 = StreamSupport.stream(var2.spliterator(), false).mapToDouble(var0 -> var0.getValue().getX()).average();
      if (var12.isPresent()) {
         double var13 = var12.getAsDouble();

         for (Object var16 : var1.vertexSet()) {
            Point2D var17 = var2.get(var16);
            double var18 = var17.getX() - var13;
            Point2D var20 = Point2D.of(var18, var17.getY());
            var2.put(var16, var20);
            var8 = Math.max(Math.abs(var18), var8);
         }
      }

      OptionalDouble var22 = StreamSupport.stream(var2.spliterator(), false).mapToDouble(var0 -> var0.getValue().getY()).average();
      if (var22.isPresent()) {
         double var14 = var22.getAsDouble();

         for (Object var27 : var1.vertexSet()) {
            Point2D var30 = var2.get(var27);
            double var19 = var30.getY() - var14;
            Point2D var21 = Point2D.of(var30.getX(), var19);
            var2.put(var27, var21);
            var10 = Math.max(Math.abs(var19), var10);
         }
      }

      double var23 = Math.max(var8, var10);
      if (var23 > 0.0) {
         for (Object var28 : var1.vertexSet()) {
            Point2D var31 = var2.get(var28);
            double var33 = var4 + var31.getX() * this.scale / var23;
            Point2D var35 = Point2D.of(var33, var31.getY());
            var2.put(var28, var35);
         }
      }

      if (var23 > 0.0) {
         for (Object var29 : var1.vertexSet()) {
            Point2D var32 = var2.get(var29);
            double var34 = var6 + var32.getY() * this.scale / var23;
            Point2D var36 = Point2D.of(var32.getX(), var34);
            var2.put(var29, var36);
         }
      }

      var2.setDrawableArea(Box2D.of(var4 - this.scale, var6 - this.scale, 2.0 * this.scale, 2.0 * this.scale));
   }
}
