package com.mxgraph.util;

import java.util.List;

public class mxSpline {
   private double[] t;
   private mxSpline1D splineX;
   private mxSpline1D splineY;
   private double length;

   public mxSpline(List<mxPoint> var1) {
      if (var1 != null) {
         double[] var2 = new double[var1.size()];
         double[] var3 = new double[var1.size()];
         int var4 = 0;

         for (mxPoint var6 : var1) {
            var2[var4] = var6.getX();
            var3[var4++] = var6.getY();
         }

         this.init(var2, var3);
      }
   }

   public void Spline2D(double[] var1, double[] var2) {
      this.init(var1, var2);
   }

   protected void init(double[] var1, double[] var2) {
      if (var1.length == var2.length) {
         if (var1.length >= 2) {
            this.t = new double[var1.length];
            this.t[0] = 0.0;
            this.length = 0.0;

            for (int var3 = 1; var3 < this.t.length; var3++) {
               double var4 = var1[var3] - var1[var3 - 1];
               double var6 = var2[var3] - var2[var3 - 1];
               if (0.0 == var4) {
                  this.t[var3] = Math.abs(var6);
               } else if (0.0 == var6) {
                  this.t[var3] = Math.abs(var4);
               } else {
                  this.t[var3] = Math.sqrt(var4 * var4 + var6 * var6);
               }

               this.length = this.length + this.t[var3];
               this.t[var3] = this.t[var3] + this.t[var3 - 1];
            }

            for (int var8 = 1; var8 < this.t.length - 1; var8++) {
               this.t[var8] = this.t[var8] / this.length;
            }

            this.t[this.t.length - 1] = 1.0;
            this.splineX = new mxSpline1D(this.t, var1);
            this.splineY = new mxSpline1D(this.t, var2);
         }
      }
   }

   public mxPoint getPoint(double var1) {
      return new mxPoint(this.splineX.getValue(var1), this.splineY.getValue(var1));
   }

   public boolean checkValues() {
      return this.splineX.len.length > 1 && this.splineY.len.length > 1;
   }

   public double getDx(double var1) {
      return this.splineX.getDx(var1);
   }

   public double getDy(double var1) {
      return this.splineY.getDx(var1);
   }

   public mxSpline1D getSplineX() {
      return this.splineX;
   }

   public mxSpline1D getSplineY() {
      return this.splineY;
   }

   public double getLength() {
      return this.length;
   }
}
