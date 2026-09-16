package org.jgrapht.alg.drawing;

import java.util.function.Function;
import org.jgrapht.Graph;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;

abstract class BaseLayoutAlgorithm2D<V, E> implements LayoutAlgorithm2D<V, E> {
   protected Function<V, Point2D> initializer;

   public BaseLayoutAlgorithm2D() {
      this(null);
   }

   public BaseLayoutAlgorithm2D(Function<V, Point2D> var1) {
      this.initializer = var1;
   }

   public Function<V, Point2D> getInitializer() {
      return this.initializer;
   }

   public void setInitializer(Function<V, Point2D> var1) {
      this.initializer = var1;
   }

   protected void init(Graph<V, E> var1, LayoutModel2D<V> var2) {
      Function var3 = this.getInitializer();
      if (var3 != null) {
         for (Object var5 : var1.vertexSet()) {
            Point2D var6 = (Point2D)var3.apply(var5);
            if (var6 != null) {
               var2.put(var5, var6);
            }
         }
      }
   }
}
