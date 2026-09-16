package org.jgrapht.alg.drawing;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;
import org.jgrapht.Graph;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.alg.util.ToleranceDoubleComparator;

public class CircularLayoutAlgorithm2D<V, E> extends BaseLayoutAlgorithm2D<V, E> {
   protected double radius;
   protected Comparator<Double> comparator = new ToleranceDoubleComparator();
   protected Comparator<V> vertexComparator;

   public CircularLayoutAlgorithm2D() {
      this(0.5);
   }

   public CircularLayoutAlgorithm2D(double var1) {
      this(var1, null);
   }

   public CircularLayoutAlgorithm2D(double var1, Comparator<V> var3) {
      this.radius = var1;
      if (this.comparator.compare(var1, 0.0) <= 0) {
         throw new IllegalArgumentException("Radius must be positive");
      }

      this.vertexComparator = var3;
   }

   @Override
   public void layout(Graph<V, E> var1, LayoutModel2D<V> var2) {
      super.init(var1, var2);
      Box2D var3 = var2.getDrawableArea();
      double var4 = var3.getWidth();
      if (this.comparator.compare(2.0 * this.radius, var4) > 0) {
         throw new IllegalArgumentException("Circle does not fit into drawable area width");
      }

      double var6 = var3.getHeight();
      if (this.comparator.compare(2.0 * this.radius, var6) > 0) {
         throw new IllegalArgumentException("Circle does not fit into drawable area height");
      }

      double var8 = var3.getMinX();
      double var10 = var3.getMinY();
      int var12 = var1.vertexSet().size();
      double var13 = (Math.PI * 2) / var12;
      Stream var15;
      if (this.vertexComparator != null) {
         var15 = var1.vertexSet().stream().sorted(this.vertexComparator);
      } else {
         var15 = var1.vertexSet().stream();
      }

      Iterator var16 = var15.iterator();

      for (int var17 = 0; var16.hasNext(); var17++) {
         double var18 = this.radius * Math.cos(var13 * var17) + var4 / 2.0;
         double var20 = this.radius * Math.sin(var13 * var17) + var6 / 2.0;
         Object var22 = var16.next();
         var2.put(var22, Point2D.of(var8 + var18, var10 + var20));
      }
   }
}
