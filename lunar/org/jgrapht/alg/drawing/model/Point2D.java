package org.jgrapht.alg.drawing.model;

import java.io.Serializable;

public class Point2D implements Serializable {
   private static final long serialVersionUID = -5410937389829502498L;
   protected double x;
   protected double y;

   public Point2D(double var1, double var3) {
      this.x = var1;
      this.y = var3;
   }

   public int getNumDimensions() {
      return 2;
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      long var3 = Double.doubleToLongBits(this.x);
      var2 = 31 * var2 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.y);
      return 31 * var2 + (int)(var3 ^ var3 >>> 32);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (this.getClass() != var1.getClass()) {
         return false;
      }

      Point2D var2 = (Point2D)var1;
      return Double.doubleToLongBits(this.x) != Double.doubleToLongBits(var2.x) ? false : Double.doubleToLongBits(this.y) == Double.doubleToLongBits(var2.y);
   }

   public static Point2D of(double var0, double var2) {
      return new Point2D(var0, var2);
   }

   @Override
   public String toString() {
      return "(" + this.x + ", " + this.y + ")";
   }
}
