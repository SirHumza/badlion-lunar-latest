package org.jgrapht.alg.drawing.model;

import java.util.function.BiFunction;
import org.jgrapht.alg.util.ToleranceDoubleComparator;

public abstract class Points {
   private static final ToleranceDoubleComparator TOLERANCE_DOUBLE_COMPARATOR = new ToleranceDoubleComparator(1.0E-9);

   public static double length(Point2D var0) {
      return Math.sqrt(var0.getX() * var0.getX() + var0.getY() * var0.getY());
   }

   public static Point2D add(Point2D var0, Point2D var1) {
      return Point2D.of(var0.getX() + var1.getX(), var0.getY() + var1.getY());
   }

   public static Point2D subtract(Point2D var0, Point2D var1) {
      return Point2D.of(var0.getX() - var1.getX(), var0.getY() - var1.getY());
   }

   public static Point2D negate(Point2D var0) {
      return scalarMultiply(var0, -1.0);
   }

   public static Point2D scalarMultiply(Point2D var0, double var1) {
      return scalarMultiply(var0, var1, (var0x, var1x) -> var0x * var1x);
   }

   public static <S> Point2D scalarMultiply(Point2D var0, S var1, BiFunction<Double, S, Double> var2) {
      return Point2D.of((Double)var2.apply(var0.getX(), var1), (Double)var2.apply(var0.getY(), var1));
   }

   public static boolean equals(Point2D var0, Point2D var1) {
      int var2 = TOLERANCE_DOUBLE_COMPARATOR.compare(var0.getX(), var1.getX());
      return var2 != 0 ? false : TOLERANCE_DOUBLE_COMPARATOR.compare(var0.getY(), var1.getY()) == 0;
   }
}
