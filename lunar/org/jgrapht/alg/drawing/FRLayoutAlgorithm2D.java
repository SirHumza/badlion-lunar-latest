package org.jgrapht.alg.drawing;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.function.BiFunction;
import org.jgrapht.Graph;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.MapLayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.alg.drawing.model.Points;
import org.jgrapht.alg.util.ToleranceDoubleComparator;

public class FRLayoutAlgorithm2D<V, E> extends BaseLayoutAlgorithm2D<V, E> {
   public static final int DEFAULT_ITERATIONS = 100;
   public static final double DEFAULT_NORMALIZATION_FACTOR = 0.5;
   protected Random rng;
   protected double optimalDistance;
   protected double normalizationFactor;
   protected int iterations;
   protected BiFunction<LayoutModel2D<V>, Integer, FRLayoutAlgorithm2D.TemperatureModel> temperatureModelSupplier;
   protected final ToleranceDoubleComparator comparator;

   public FRLayoutAlgorithm2D() {
      this(100, 0.5, new Random());
   }

   public FRLayoutAlgorithm2D(int var1) {
      this(var1, 0.5, new Random());
   }

   public FRLayoutAlgorithm2D(int var1, double var2) {
      this(var1, var2, new Random());
   }

   public FRLayoutAlgorithm2D(int var1, double var2, Random var4) {
      this(var1, var2, var4, 1.0E-9);
   }

   public FRLayoutAlgorithm2D(int var1, double var2, Random var4, double var5) {
      this.rng = Objects.requireNonNull(var4);
      this.iterations = var1;
      this.normalizationFactor = var2;
      this.temperatureModelSupplier = (var1x, var2x) -> {
         double var3 = Math.min(var1x.getDrawableArea().getWidth(), var1x.getDrawableArea().getHeight());
         return new FRLayoutAlgorithm2D.InverseLinearTemperatureModel(-1.0 * var3 / (10.0 * var2x.intValue()), var3 / 10.0);
      };
      this.comparator = new ToleranceDoubleComparator(var5);
   }

   public FRLayoutAlgorithm2D(int var1, double var2, BiFunction<LayoutModel2D<V>, Integer, FRLayoutAlgorithm2D.TemperatureModel> var4, Random var5) {
      this(var1, var2, var4, var5, 1.0E-9);
   }

   public FRLayoutAlgorithm2D(int var1, double var2, BiFunction<LayoutModel2D<V>, Integer, FRLayoutAlgorithm2D.TemperatureModel> var4, Random var5, double var6) {
      this.rng = Objects.requireNonNull(var5);
      this.iterations = var1;
      this.normalizationFactor = var2;
      this.temperatureModelSupplier = Objects.requireNonNull(var4);
      this.comparator = new ToleranceDoubleComparator(var6);
   }

   @Override
   public void layout(Graph<V, E> var1, LayoutModel2D<V> var2) {
      Box2D var3 = var2.getDrawableArea();
      double var4 = var3.getMinX();
      double var6 = var3.getMinY();
      if (this.getInitializer() != null) {
         this.init(var1, var2);

         for (Object var9 : var1.vertexSet()) {
            Point2D var10 = var2.get(var9);
            if (var10 == null) {
               var2.put(var9, Point2D.of(var4, var6));
            }
         }
      } else {
         MapLayoutModel2D var27 = new MapLayoutModel2D(var3);
         new RandomLayoutAlgorithm2D<V, E>(this.rng).layout(var1, var27);

         for (Object var30 : var1.vertexSet()) {
            var2.put(var30, var27.get(var30));
         }
      }

      double var28 = var3.getWidth();
      double var31 = var3.getHeight();
      double var12 = var28 * var31;
      int var14 = var1.vertexSet().size();
      if (var14 != 0) {
         this.optimalDistance = this.normalizationFactor * Math.sqrt(var12 / var14);
         FRLayoutAlgorithm2D.TemperatureModel var15 = this.temperatureModelSupplier.apply(var2, this.iterations);

         for (int var16 = 0; var16 < this.iterations; var16++) {
            Map var17 = this.calculateRepulsiveForces(var1, var2);
            Map var18 = this.calculateAttractiveForces(var1, var2);
            double var19 = var15.temperature(var16, this.iterations);

            for (Object var22 : var1.vertexSet()) {
               Point2D var23 = Points.add((Point2D)var17.get(var22), var18.getOrDefault(var22, Point2D.of(0.0, 0.0)));
               double var24 = Points.length(var23);
               Point2D var26 = Points.add(var2.get(var22), Points.scalarMultiply(var23, Math.min(var24, var19) / var24));
               var26 = Point2D.of(Math.min(var4 + var28, Math.max(var4, var26.getX())), Math.min(var6 + var31, Math.max(var6, var26.getY())));
               var2.put(var22, var26);
            }
         }
      }
   }

   protected double attractiveForce(double var1) {
      return var1 * var1 / this.optimalDistance;
   }

   protected double repulsiveForce(double var1) {
      return this.optimalDistance * this.optimalDistance / var1;
   }

   protected Map<V, Point2D> calculateRepulsiveForces(Graph<V, E> var1, LayoutModel2D<V> var2) {
      Point2D var3 = Point2D.of(var2.getDrawableArea().getMinX(), var2.getDrawableArea().getMinY());
      HashMap var4 = new HashMap();

      for (Object var6 : var1.vertexSet()) {
         Point2D var7 = Points.subtract(var2.get(var6), var3);
         Point2D var8 = Point2D.of(0.0, 0.0);

         for (Object var10 : var1.vertexSet()) {
            if (var6 != var10) {
               Point2D var11 = Points.subtract(var2.get(var10), var3);
               if (this.comparator.compare(var7.getX(), var11.getX()) != 0 || this.comparator.compare(var7.getY(), var11.getY()) != 0) {
                  Point2D var12 = Points.subtract(var7, var11);
                  double var13 = Points.length(var12);
                  Point2D var15 = Points.scalarMultiply(var12, this.repulsiveForce(var13) / var13);
                  var8 = Points.add(var8, var15);
               }
            }
         }

         var4.put(var6, var8);
      }

      return var4;
   }

   protected Map<V, Point2D> calculateAttractiveForces(Graph<V, E> var1, LayoutModel2D<V> var2) {
      Point2D var3 = Point2D.of(var2.getDrawableArea().getMinX(), var2.getDrawableArea().getMinY());
      HashMap var4 = new HashMap();

      for (Object var6 : var1.edgeSet()) {
         Object var7 = var1.getEdgeSource(var6);
         Object var8 = var1.getEdgeTarget(var6);
         Point2D var9 = Points.subtract(var2.get(var7), var3);
         Point2D var10 = Points.subtract(var2.get(var8), var3);
         if (this.comparator.compare(var9.getX(), var10.getX()) != 0 || this.comparator.compare(var9.getY(), var10.getY()) != 0) {
            Point2D var11 = Points.subtract(var9, var10);
            double var12 = Points.length(var11);
            Point2D var14 = Points.scalarMultiply(var11, this.attractiveForce(var12) / var12);
            var4.put(var7, Points.add(var4.getOrDefault(var7, Point2D.of(0.0, 0.0)), Points.negate(var14)));
            var4.put(var8, Points.add(var4.getOrDefault(var8, Point2D.of(0.0, 0.0)), var14));
         }
      }

      return var4;
   }

   protected class InverseLinearTemperatureModel implements FRLayoutAlgorithm2D.TemperatureModel {
      private double a;
      private double b;

      public InverseLinearTemperatureModel(double var2, double var4) {
         this.a = var2;
         this.b = var4;
      }

      @Override
      public double temperature(int var1, int var2) {
         return var1 >= var2 - 1 ? 0.0 : this.a * var1 + this.b;
      }
   }

   public interface TemperatureModel {
      double temperature(int var1, int var2);
   }
}
