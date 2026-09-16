package com.mxgraph.util;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class mxCurve {
   protected Map<String, mxPoint[]> points;
   protected double minXBounds = 1.0E7;
   protected double maxXBounds = 0.0;
   protected double minYBounds = 1.0E7;
   protected double maxYBounds = 0.0;
   protected Map<String, double[]> intervals;
   protected Map<String, Double> curveLengths;
   public static String CORE_CURVE = "Center_curve";
   public static String LABEL_CURVE = "Label_curve";
   public static mxLine INVALID_POSITION = new mxLine(new mxPoint(0.0, 0.0), new mxPoint(1.0, 0.0));
   protected double labelBuffer = mxConstants.DEFAULT_LABEL_BUFFER;
   public List<mxPoint> guidePoints = new ArrayList<>();
   protected boolean valid = false;

   public void setLabelBuffer(double var1) {
      this.labelBuffer = var1;
   }

   public mxRectangle getBounds() {
      if (!this.valid) {
         this.createCoreCurve();
      }

      return new mxRectangle(this.minXBounds, this.minYBounds, this.maxXBounds - this.minXBounds, this.maxYBounds - this.minYBounds);
   }

   public mxCurve() {
   }

   public mxCurve(List<mxPoint> var1) {
      boolean var2 = false;

      for (mxPoint var4 : var1) {
         if (var4 == null) {
            var2 = true;
            break;
         }
      }

      if (!var2) {
         this.guidePoints = new ArrayList<>(var1);
      }
   }

   protected int getLowerIndexOfSegment(String var1, double var2) {
      double[] var4 = this.getIntervals(var1);
      if (var4 == null) {
         return 0;
      }

      int var5 = var4.length;
      if (var2 <= 0.0 || var5 < 3) {
         return 0;
      }

      if (var2 >= 1.0) {
         return var5 - 2;
      }

      int var6 = (int)(var5 * var2);
      if (var6 >= var5) {
         var6 = var5 - 1;
      }

      int var7 = -1;
      int var8 = var5;

      for (int var9 = 0; var9 < var5; var9++) {
         double var10 = var4[var6];
         double var12 = 0.5;
         if (var2 < var10) {
            var8 = Math.min(var8, var6);
            var12 = -0.5;
         } else if (var2 > var10) {
            var7 = Math.max(var7, var6);
         } else if (var6 == 0) {
            var7 = 0;
            var8 = 1;
         } else {
            var7 = var6 - 1;
            var8 = var6;
         }

         int var14 = var8 - var7;
         if (var14 == 1) {
            break;
         }

         var6 = (int)(var6 + var14 * var12);
         if (var6 == var7) {
            var6 = var7 + 1;
         }

         if (var6 == var8) {
            var6 = var8 - 1;
         }
      }

      return var7 != var8 - 1 ? -1 : var7;
   }

   public mxLine getCurveParallel(String var1, double var2) {
      mxPoint[] var4 = this.getCurvePoints(var1);
      double[] var5 = this.getIntervals(var1);
      if (var4 != null && var4.length > 0 && var5 != null && var2 >= 0.0 && var2 <= 1.0) {
         if (var4.length == 1) {
            mxPoint var21 = var4[0];
            return new mxLine(var21.getX(), var21.getY(), new mxPoint(1.0, 0.0));
         } else {
            int var6 = this.getLowerIndexOfSegment(var1, var2);
            mxPoint var7 = var4[var6];
            double var8 = var4[var6 + 1].getX() - var7.getX();
            double var10 = var4[var6 + 1].getY() - var7.getY();
            double var12 = (var2 - var5[var6]) / (var5[var6 + 1] - var5[var6]);
            double var14 = Math.sqrt(var8 * var8 + var10 * var10);
            double var16 = var7.getX() + var8 * var12;
            double var18 = var7.getY() + var10 * var12;
            mxPoint var20 = new mxPoint(var8 / var14, var10 / var14);
            return new mxLine(var16, var18, var20);
         }
      } else {
         return INVALID_POSITION;
      }
   }

   public mxPoint[] getCurveSection(String var1, double var2, double var4) {
      mxPoint[] var6 = this.getCurvePoints(var1);
      double[] var7 = this.getIntervals(var1);
      if (var6 != null && var6.length > 0 && var7 != null && var2 >= 0.0 && var2 <= 1.0 && var4 >= 0.0 && var4 <= 1.0) {
         if (var6.length == 1) {
            mxPoint var22 = var6[0];
            return new mxPoint[]{new mxPoint(var22.getX(), var22.getY())};
         }

         int var8 = this.getLowerIndexOfSegment(var1, var2);
         mxPoint var9 = var6[var8];
         double var10 = var6[var8 + 1].getX() - var9.getX();
         double var12 = var6[var8 + 1].getY() - var9.getY();
         double var14 = (var2 - var7[var8]) / (var7[var8 + 1] - var7[var8]);
         mxPoint var16 = new mxPoint(var9.getX() + var10 * var14, var9.getY() + var12 * var14);
         ArrayList var17 = new ArrayList();
         var17.add(var16);

         for (double var18 = var7[++var8]; var18 <= var4; var18 = var7[++var8]) {
            mxPoint var20 = var6[var8];
            var17.add(var20);
         }

         if (var8 > 0 && var8 < var6.length && var4 > var7[var8 - 1]) {
            var9 = var6[var8 - 1];
            var10 = var6[var8].getX() - var9.getX();
            var12 = var6[var8].getY() - var9.getY();
            var14 = (var4 - var7[var8 - 1]) / (var7[var8] - var7[var8 - 1]);
            mxPoint var27 = new mxPoint(var9.getX() + var10 * var14, var9.getY() + var12 * var14);
            var17.add(var27);
         }

         mxPoint[] var28 = new mxPoint[var17.size()];
         return var17.toArray(var28);
      } else {
         return null;
      }
   }

   public boolean intersectsRect(Rectangle var1) {
      if (!this.getBounds().getRectangle().intersects(var1)) {
         return false;
      }

      mxPoint[] var2 = this.getCurvePoints(CORE_CURVE);
      if (var2 != null && var2.length > 1) {
         mxRectangle var3 = new mxRectangle(var1);

         for (int var4 = 1; var4 < var2.length; var4++) {
            if (var3.contains(var2[var4].getX(), var2[var4].getY()) || var3.contains(var2[var4 - 1].getX(), var2[var4 - 1].getY())) {
               return true;
            }
         }

         for (int var5 = 1; var5 < var2.length; var5++) {
            if (var3.intersectLine(var2[var5].getX(), var2[var5].getY(), var2[var5 - 1].getX(), var2[var5 - 1].getY()) != null) {
               return true;
            }
         }
      }

      return false;
   }

   public mxPoint intersectsRectPerimeter(String var1, mxRectangle var2) {
      mxPoint var3 = null;
      mxPoint[] var4 = this.getCurvePoints(var1);
      if (var4 != null && var4.length > 1) {
         int var5 = this.intersectRectPerimeterSeg(var1, var2);
         if (var5 != -1) {
            var3 = this.intersectRectPerimeterPoint(var1, var2, var5);
         }
      }

      return var3;
   }

   public double intersectsRectPerimeterDist(String var1, mxRectangle var2) {
      double var3 = -1.0;
      mxPoint[] var5 = this.getCurvePoints(var1);
      double[] var6 = this.getIntervals(var1);
      if (var5 != null && var5.length > 1) {
         int var7 = this.intersectRectPerimeterSeg(var1, var2);
         mxPoint var8 = null;
         if (var7 != -1) {
            var8 = this.intersectRectPerimeterPoint(var1, var2, var7);
         }

         if (var8 != null) {
            double var9 = var5[var7 - 1].getX();
            double var11 = var5[var7 - 1].getY();
            double var13 = var6[var7 - 1] * this.getCurveLength(var1);
            double var15 = var8.getX() - var9;
            double var17 = var8.getY() - var11;
            double var19 = Math.sqrt(var15 * var15 + var17 * var17);
            var3 = var13 + var19;
         }
      }

      return var3;
   }

   public mxPoint collisionMove(String var1, mxRectangle var2, double var3) {
      int var5 = this.intersectRectPerimeterSeg(var1, var2);
      if (var5 == -1) {
         return null;
      }

      mxPoint[] var6 = this.getCurvePoints(var1);
      double var7 = var6[var5 - 1].getX();
      double var9 = var6[var5 - 1].getY();
      double var11 = var6[var5].getX();
      double var13 = var6[var5].getY();
      double var15 = var2.getX();
      double var17 = var2.getY();
      double var19 = var2.getWidth();
      double var21 = var2.getHeight();
      boolean var23 = false;
      mxPoint var24 = mxUtils.intersection(var15, var17, var15 + var19, var17, var7, var9, var11, var13);
      if (var24 != null) {
         var23 = true;
      } else {
         var24 = mxUtils.intersection(var15 + var19, var17, var15 + var19, var17 + var21, var7, var9, var11, var13);
      }

      if (var24 == null) {
         var24 = mxUtils.intersection(var15 + var19, var17 + var21, var15, var17 + var21, var7, var9, var11, var13);
         if (var24 != null) {
            var23 = true;
         } else {
            var24 = mxUtils.intersection(var15, var17, var15, var17 + var21, var7, var9, var11, var13);
         }
      }

      if (var24 != null) {
      }

      return null;
   }

   protected int intersectRectPerimeterSeg(String var1, mxRectangle var2) {
      return this.intersectRectPerimeterSeg(var1, var2, 1);
   }

   protected int intersectRectPerimeterSeg(String var1, mxRectangle var2, int var3) {
      mxPoint[] var4 = this.getCurvePoints(var1);
      if (var4 != null && var4.length > 1) {
         for (int var5 = var3; var5 < var4.length; var5++) {
            if (var2.intersectLine(var4[var5].getX(), var4[var5].getY(), var4[var5 - 1].getX(), var4[var5 - 1].getY()) != null) {
               return var5;
            }
         }
      }

      return -1;
   }

   protected mxPoint intersectRectPerimeterPoint(String var1, mxRectangle var2, int var3) {
      mxPoint var4 = null;
      mxPoint[] var5 = this.getCurvePoints(var1);
      if (var5 != null && var5.length > 1 && var3 >= 0 && var3 < var5.length) {
         double var6 = var5[var3 - 1].getX();
         double var8 = var5[var3 - 1].getY();
         double var10 = var5[var3].getX();
         double var12 = var5[var3].getY();
         var4 = var2.intersectLine(var6, var8, var10, var12);
      }

      return var4;
   }

   public mxRectangle getRelativeFromAbsPoint(mxPoint var1, String var2) {
      mxPoint[] var3 = this.getCurvePoints(var2);
      double[] var4 = this.getIntervals(var2);
      int var5 = 0;
      double var6 = 1.0E7;
      mxLine var8 = new mxLine(var3[0], var3[1]);

      for (int var9 = 1; var9 < var3.length; var9++) {
         var8.setPoints(var3[var9 - 1], var3[var9]);
         double var10 = var8.ptSegDistSq(var1);
         if (var10 < var6) {
            var6 = var10;
            var5 = var9 - 1;
         }
      }

      mxPoint var56 = var3[var5];
      mxPoint var57 = var3[var5 + 1];
      mxLine var11 = new mxLine(var56, var57);
      double var12 = var11.ptLineDistSq(var1);
      double var14 = Math.sqrt(Math.min(var12, var6));
      double var16 = var57.getX() - var56.getX();
      double var18 = var57.getY() - var56.getY();
      double var20 = Math.sqrt(var16 * var16 + var18 * var18);
      double var22 = var16 / var20;
      double var24 = var18 / var20;
      double var26 = var1.getX() - var24 * var14 - var57.getX();
      double var28 = var1.getY() + var22 * var14 - var57.getY();
      double var30 = var1.getX() + var24 * var14 - var57.getX();
      double var32 = var1.getY() - var22 * var14 - var57.getY();
      double var34 = var26 * var26 + var28 * var28;
      double var36 = var30 * var30 + var32 * var32;
      double var38 = 0.0;
      double var40 = 0.0;
      if (var36 < var34) {
         var14 = -var14;
      }

      var38 = var1.getX() - var24 * var14;
      var40 = var1.getY() + var22 * var14;
      double var42 = 0.0;
      double var44 = 0.0;
      double var46 = 0.0;
      if (Math.abs(var6 - var12) > 1.0E-4) {
         double var48 = Math.abs(var38 - var56.getX()) + Math.abs(var40 - var56.getY());
         double var50 = Math.abs(var38 - var57.getX()) + Math.abs(var40 - var57.getY());
         if (var48 < var50) {
            var42 = var4[var5];
            var44 = var38 - var56.getX();
            var46 = var40 - var56.getY();
         } else {
            var42 = var4[var5 + 1];
            var44 = var38 - var57.getX();
            var46 = var40 - var57.getY();
         }
      } else {
         double var61 = Math.sqrt((var57.getX() - var56.getX()) * (var57.getX() - var56.getX()) + (var57.getY() - var56.getY()) * (var57.getY() - var56.getY()));
         double var62 = Math.sqrt((var38 - var56.getX()) * (var38 - var56.getX()) + (var40 - var56.getY()) * (var40 - var56.getY()));
         double var52 = var62 / var61;
         double var54 = var4[var5 + 1] - var4[var5];
         var42 = var4[var5] + var54 * var52;
      }

      if (var42 > 1.0) {
         var42 = 1.0;
      }

      return new mxRectangle(var42, var14, var44, var46);
   }

   protected void createCoreCurve() {
      this.valid = false;
      if (this.guidePoints != null && !this.guidePoints.isEmpty()) {
         for (int var1 = 0; var1 < this.guidePoints.size(); var1++) {
            if (this.guidePoints.get(var1) == null) {
               return;
            }
         }

         this.minXBounds = this.minYBounds = 1.0E7;
         this.maxXBounds = this.maxYBounds = 0.0;
         mxSpline var44 = new mxSpline(this.guidePoints);
         double var2 = var44.getLength();
         if (!Double.isNaN(var2) && var44.checkValues() && !(var2 < 1.0)) {
            mxSpline1D var4 = var44.getSplineX();
            mxSpline1D var5 = var44.getSplineY();
            double var6 = 12.0 / var2;
            double var8 = 1.0 / var2;
            double var10 = var6;
            double var12 = 0.15;
            double var14 = 0.3;
            double var16 = (var14 + var12) / 2.0;
            double var18 = -1.0;
            double var20 = -1.0;
            double var22 = -1.0;
            double var24 = -1.0;
            double var26 = 1.0;
            ArrayList var28 = new ArrayList();
            ArrayList var29 = new ArrayList();
            boolean var30 = false;

            for (double var31 = 0.0; var31 <= 1.5; var31 += var10) {
               if (var31 > 1.0) {
                  var31 = 1.0001;
                  mxPoint var48 = this.guidePoints.get(this.guidePoints.size() - 1);
                  mxPoint var51 = new mxPoint(var48.getX(), var48.getY());
                  var28.add(var51);
                  var29.add(var31);
                  this.updateBounds(var48.getX(), var48.getY());
                  break;
               }

               boolean var33 = true;
               double var34 = var4.getFastValue(var31);
               double var36 = var5.getFastValue(var31);
               if (var18 != -1.0 && var30 && var31 != 1.0001) {
                  double var38 = Math.abs((var20 - var18) * var26 + var20 - var34);
                  double var40 = Math.abs((var24 - var22) * var26 + var24 - var36);
                  if ((var38 > var14 || var40 > var14) && var10 != var8) {
                     double var55 = var14 / Math.max(var38, var40);
                     if (var10 * var55 <= var8) {
                        var26 = var8 / var10;
                     } else {
                        var26 = var55;
                     }

                     var31 -= var10;
                     var10 *= var26;
                     var33 = false;
                  } else if (var38 < var12 && var40 < var12) {
                     var26 = 1.4;
                     var10 *= var26;
                  } else {
                     double var42 = var16 / Math.max(var38, var40);
                     var26 = var42 / 4.0;
                     var10 *= var26;
                  }

                  if (var33) {
                     var18 = var20;
                     var22 = var24;
                     var20 = var34;
                     var24 = var36;
                  }
               } else if (var18 == -1.0) {
                  var20 = var34;
                  var18 = var34;
                  var24 = var36;
                  var22 = var36;
               } else if (var18 == var20 && var22 == var24) {
                  var20 = var34;
                  var24 = var36;
                  var30 = true;
               }

               if (var33) {
                  mxPoint var54 = new mxPoint(var34, var36);
                  var28.add(var54);
                  var29.add(var31);
                  this.updateBounds(var34, var36);
               }
            }

            if (var28.size() >= 2) {
               mxPoint[] var46 = new mxPoint[var28.size()];
               int var32 = 0;

               for (mxPoint var52 : var28) {
                  var46[var32++] = var52;
               }

               this.points = new Hashtable<>();
               this.curveLengths = new Hashtable<>();
               this.points.put(CORE_CURVE, var46);
               this.curveLengths.put(CORE_CURVE, var2);
               double[] var50 = new double[var29.size()];
               var32 = 0;

               for (Double var35 : var29) {
                  var50[var32++] = var35;
               }

               this.intervals = new Hashtable<>();
               this.intervals.put(CORE_CURVE, var50);
               this.valid = true;
            }
         }
      }
   }

   public boolean isLabelReversed() {
      if (this.valid) {
         mxPoint[] var1 = this.getCurvePoints(CORE_CURVE);
         if (var1 != null) {
            double var2 = var1[var1.length - 1].getX() - var1[0].getX();
            if (var2 < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   protected void createLabelCurve() {
      mxPoint[] var1 = this.getBaseLabelCurve();
      boolean var2 = this.isLabelReversed();
      ArrayList var3 = new ArrayList();

      for (int var4 = 1; var4 < var1.length; var4++) {
         int var5 = var4;
         int var6 = var4 - 1;
         if (var2) {
            var5 = var1.length - var4 - 1;
            var6 = var1.length - var4;
         }

         mxPoint var7 = var1[var5];
         mxPoint var8 = var1[var6];
         double var9 = var8.getX() - var7.getX();
         double var11 = var8.getY() - var7.getY();
         double var13 = Math.sqrt(var9 * var9 + var11 * var11);
         double var15 = var9 / var13;
         double var17 = var11 / var13;
         double var19 = (var8.getX() + var7.getX()) / 2.0;
         double var21 = (var8.getY() + var7.getY()) / 2.0;
         if (var4 == 1) {
            mxPoint var23 = new mxPoint(var8.getX() - var17 * this.labelBuffer, var8.getY() + var15 * this.labelBuffer);
            var3.add(var23);
            this.updateBounds(var23.getX(), var23.getY());
         }

         double var30 = var19 - var17 * this.labelBuffer;
         double var25 = var21 + var15 * this.labelBuffer;
         mxPoint var27 = new mxPoint(var30, var25);
         this.updateBounds(var30, var25);
         var3.add(var27);
         if (var4 == var1.length - 1) {
            mxPoint var28 = new mxPoint(var7.getX() - var17 * this.labelBuffer, var7.getY() + var15 * this.labelBuffer);
            var3.add(var28);
            this.updateBounds(var28.getX(), var28.getY());
         }
      }

      mxPoint[] var29 = new mxPoint[var3.size()];
      this.points.put(LABEL_CURVE, var3.toArray(var29));
      this.populateIntervals(LABEL_CURVE);
   }

   protected mxPoint[] getBaseLabelCurve() {
      return this.getCurvePoints(CORE_CURVE);
   }

   protected void populateIntervals(String var1) {
      mxPoint[] var2 = this.points.get(var1);
      double[] var3 = new double[var2.length];
      double var4 = 0.0;
      var3[0] = 0.0;

      for (int var6 = 0; var6 < var2.length - 1; var6++) {
         double var7 = var2[var6 + 1].getX() - var2[var6].getX();
         double var9 = var2[var6 + 1].getY() - var2[var6].getY();
         double var11 = Math.sqrt(var7 * var7 + var9 * var9);
         var4 += var11;
         var3[var6 + 1] = var4;
      }

      for (int var13 = 0; var13 < var3.length; var13++) {
         if (var13 == var3.length - 1) {
            var3[var13] = 1.0001;
         } else {
            var3[var13] /= var4;
         }
      }

      this.intervals.put(var1, var3);
      this.curveLengths.put(var1, var4);
   }

   public void updateCurve(List<mxPoint> var1) {
      boolean var2 = false;

      for (mxPoint var4 : var1) {
         if (var4 == null) {
            return;
         }
      }

      if (var1.size() != this.guidePoints.size()) {
         var2 = true;
      } else if (var1.size() == this.guidePoints.size() && var1.size() > 1 && this.guidePoints.size() > 1) {
         boolean var16 = true;
         boolean var17 = true;
         mxPoint var5 = (mxPoint)var1.get(0);
         mxPoint var6 = this.guidePoints.get(0);
         double var7 = var5.getX() - var6.getX();
         double var9 = var5.getY() - var6.getY();
         if (Math.abs(var7) > 0.01 || Math.abs(var9) > 0.01) {
            var17 = false;
         }

         for (int var11 = 1; var11 < var1.size(); var11++) {
            double var12 = ((mxPoint)var1.get(var11)).getX() - this.guidePoints.get(var11).getX();
            double var14 = ((mxPoint)var1.get(var11)).getY() - this.guidePoints.get(var11).getY();
            if (Math.abs(var7 - var12) > 0.01 || Math.abs(var9 - var14) > 0.01) {
               var16 = false;
            }

            if (Math.abs(var12) > 0.01 || Math.abs(var14) > 0.01) {
               var17 = false;
            }
         }

         if (var17) {
            var2 = false;
         } else if (var16) {
            var2 = false;

            for (mxPoint[] var13 : this.points.values()) {
               for (int var20 = 0; var20 < var13.length; var20++) {
                  var13[var20].setX(var13[var20].getX() + var7);
                  var13[var20].setY(var13[var20].getY() + var9);
               }
            }

            this.guidePoints = new ArrayList<>(var1);
            this.minXBounds += var7;
            this.minYBounds += var9;
            this.maxXBounds += var7;
            this.maxYBounds += var9;
         } else {
            var2 = true;
         }
      }

      if (var2) {
         this.guidePoints = new ArrayList<>(var1);
         this.points = new Hashtable<>();
         this.valid = false;
      }
   }

   public mxPoint[] getCurvePoints(String var1) {
      if (this.validateCurve()) {
         if (this.points.get(LABEL_CURVE) == null && var1 == LABEL_CURVE) {
            this.createLabelCurve();
         }

         return this.points.get(var1);
      } else {
         return null;
      }
   }

   public double[] getIntervals(String var1) {
      if (this.validateCurve()) {
         if (this.points.get(LABEL_CURVE) == null && var1 == LABEL_CURVE) {
            this.createLabelCurve();
         }

         return this.intervals.get(var1);
      } else {
         return null;
      }
   }

   public double getCurveLength(String var1) {
      if (this.validateCurve()) {
         if (this.intervals.get(var1) == null) {
            this.createLabelCurve();
         }

         return this.curveLengths.get(var1);
      } else {
         return 0.0;
      }
   }

   protected boolean validateCurve() {
      if (!this.valid) {
         this.createCoreCurve();
      }

      return this.valid;
   }

   protected void updateBounds(double var1, double var3) {
      this.minXBounds = Math.min(this.minXBounds, var1);
      this.maxXBounds = Math.max(this.maxXBounds, var1);
      this.minYBounds = Math.min(this.minYBounds, var3);
      this.maxYBounds = Math.max(this.maxYBounds, var3);
   }

   public List<mxPoint> getGuidePoints() {
      return this.guidePoints;
   }
}
