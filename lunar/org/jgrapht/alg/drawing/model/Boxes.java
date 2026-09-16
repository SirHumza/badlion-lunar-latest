package org.jgrapht.alg.drawing.model;

import java.util.Comparator;
import org.jgrapht.alg.util.Pair;

public abstract class Boxes {
   public static boolean containsPoint(Box2D var0, Point2D var1) {
      double var2 = var0.getMinX() + var0.getWidth();
      if (var1.getX() > var2) {
         return false;
      }

      if (var1.getX() < var0.getMinX()) {
         return false;
      }

      double var4 = var0.getMinY() + var0.getHeight();
      return var1.getY() > var4 ? false : !(var1.getY() < var0.getMinY());
   }

   public static Pair<Box2D, Box2D> splitAlongXAxis(Box2D var0) {
      double var1 = var0.getWidth() / 2.0;
      double var3 = var0.getHeight();
      return Pair.of(Box2D.of(var0.getMinX(), var0.getMinY(), var1, var3), Box2D.of(var0.getMinX() + var1, var0.getMinY(), var1, var3));
   }

   public static Pair<Box2D, Box2D> splitAlongYAxis(Box2D var0) {
      double var1 = var0.getWidth();
      double var3 = var0.getHeight() / 2.0;
      return Pair.of(Box2D.of(var0.getMinX(), var0.getMinY(), var1, var3), Box2D.of(var0.getMinX(), var0.getMinY() + var3, var1, var3));
   }

   public static boolean containsPoint(Box2D var0, Point2D var1, Comparator<Double> var2) {
      double var3 = var0.getMinX() + var0.getWidth();
      if (var2.compare(var1.getX(), var3) > 0) {
         return false;
      }

      if (var2.compare(var1.getX(), var0.getMinX()) < 0) {
         return false;
      }

      double var5 = var0.getMinY() + var0.getHeight();
      return var2.compare(var1.getY(), var5) > 0 ? false : var2.compare(var1.getY(), var0.getMinY()) >= 0;
   }
}
