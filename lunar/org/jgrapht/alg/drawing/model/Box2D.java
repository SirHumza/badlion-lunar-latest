package org.jgrapht.alg.drawing.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Box2D implements Serializable {
   private static final long serialVersionUID = -1855277817131669241L;
   protected double[] coordinates;
   protected double[] sides;

   public Box2D(double var1, double var3) {
      this(0.0, 0.0, var1, var3);
   }

   public Box2D(double var1, double var3, double var5, double var7) {
      this(new double[2], new double[2]);
      assert var5 >= 0.0 && var7 >= 0.0;
      this.coordinates[0] = var1;
      this.coordinates[1] = var3;
      this.sides[0] = var5;
      this.sides[1] = var7;
   }

   public Box2D(double[] var1, double[] var2) {
      assert var1.length == 2;
      assert var2.length == 2;
      this.coordinates = Objects.requireNonNull(var1);
      this.sides = Objects.requireNonNull(var2);
      if (var1.length != var2.length) {
         throw new IllegalArgumentException("Box dimensions do not match");
      }
   }

   public double getMinX() {
      return this.coordinates[0];
   }

   public double getMinY() {
      return this.coordinates[1];
   }

   public double getWidth() {
      return this.sides[0];
   }

   public double getHeight() {
      return this.sides[1];
   }

   public double getMaxX() {
      return this.coordinates[0] + this.sides[0];
   }

   public double getMaxY() {
      return this.coordinates[1] + this.sides[1];
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = 31 * var2 + Arrays.hashCode(this.coordinates);
      return 31 * var2 + Arrays.hashCode(this.sides);
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

      Box2D var2 = (Box2D)var1;
      return !Arrays.equals(this.coordinates, var2.coordinates) ? false : Arrays.equals(this.sides, var2.sides);
   }

   @Override
   public String toString() {
      return "Box2D [minX=" + this.coordinates[0] + ", minY=" + this.coordinates[1] + ", width=" + this.sides[0] + ", height=" + this.sides[1] + "]";
   }

   public static Box2D of(double var0, double var2) {
      return new Box2D(new double[]{0.0, 0.0}, new double[]{var0, var2});
   }

   public static Box2D of(double var0, double var2, double var4, double var6) {
      return new Box2D(new double[]{var0, var2}, new double[]{var4, var6});
   }
}
