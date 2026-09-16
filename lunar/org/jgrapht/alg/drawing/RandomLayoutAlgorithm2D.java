package org.jgrapht.alg.drawing;

import java.util.Objects;
import java.util.Random;
import org.jgrapht.Graph;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;

public class RandomLayoutAlgorithm2D<V, E> extends BaseLayoutAlgorithm2D<V, E> {
   private Random rng;

   public RandomLayoutAlgorithm2D() {
      this(new Random());
   }

   public RandomLayoutAlgorithm2D(long var1) {
      this(new Random(var1));
   }

   public RandomLayoutAlgorithm2D(Random var1) {
      this.rng = Objects.requireNonNull(var1, "Random number generator cannot be null");
   }

   @Override
   public void layout(Graph<V, E> var1, LayoutModel2D<V> var2) {
      super.init(var1, var2);
      Box2D var3 = var2.getDrawableArea();
      double var4 = var3.getMinX();
      double var6 = var3.getMinX();
      double var8 = var3.getWidth();
      double var10 = var3.getHeight();

      for (Object var13 : var1.vertexSet()) {
         double var14 = this.rng.nextDouble() * var8;
         double var16 = this.rng.nextDouble() * var10;
         var2.put(var13, Point2D.of(var4 + var14, var6 + var16));
      }
   }
}
