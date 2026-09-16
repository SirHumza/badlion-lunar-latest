package com.mxgraph.view;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import java.util.List;

public class mxEdgeStyle {
   public static mxEdgeStyle.mxEdgeStyleFunction EntityRelation = new mxEdgeStyle.mxEdgeStyleFunction() {
      @Override
      public void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5) {
         mxGraphView var6 = var1.getView();
         mxIGraphModel var7 = var6.getGraph().getModel();
         double var8 = mxUtils.getDouble(var1.getStyle(), mxConstants.STYLE_SEGMENT, mxConstants.ENTITY_SEGMENT) * var1.view.getScale();
         mxPoint var10 = var1.getAbsolutePoint(0);
         mxPoint var11 = var1.getAbsolutePoint(var1.getAbsolutePointCount() - 1);
         boolean var12 = false;
         if (var10 != null) {
            var2 = new mxCellState();
            var2.setX(var10.getX());
            var2.setY(var10.getY());
         } else if (var2 != null) {
            int var13 = mxUtils.getPortConstraints(var2, var1, true, 0);
            if (var13 != 0) {
               var12 = var13 == 1;
            } else {
               mxGeometry var14 = var7.getGeometry(var2.cell);
               if (var14.isRelative()) {
                  var12 = var14.getX() <= 0.5;
               } else if (var3 != null) {
                  var12 = var3.getX() + var3.getWidth() < var2.getX();
               }
            }
         }

         boolean var30 = true;
         if (var11 != null) {
            var3 = new mxCellState();
            var3.setX(var11.getX());
            var3.setY(var11.getY());
         } else if (var3 != null) {
            int var31 = mxUtils.getPortConstraints(var3, var1, false, 0);
            if (var31 != 0) {
               var30 = var31 == 1;
            } else {
               mxGeometry var15 = var7.getGeometry(var3.cell);
               if (var15.isRelative()) {
                  var30 = var15.getX() <= 0.5;
               } else if (var2 != null) {
                  var30 = var2.getX() + var2.getWidth() < var3.getX();
               }
            }
         }

         if (var2 != null && var3 != null) {
            double var32 = var12 ? var2.getX() : var2.getX() + var2.getWidth();
            double var16 = var6.getRoutingCenterY(var2);
            double var18 = var30 ? var3.getX() : var3.getX() + var3.getWidth();
            double var20 = var6.getRoutingCenterY(var3);
            double var22 = var8;
            double var24 = var12 ? -var22 : var22;
            mxPoint var26 = new mxPoint(var32 + var24, var16);
            var5.add(var26);
            var24 = var30 ? -var22 : var22;
            mxPoint var27 = new mxPoint(var18 + var24, var20);
            if (var12 == var30) {
               double var28 = var12 ? Math.min(var32, var18) - var8 : Math.max(var32, var18) + var8;
               var5.add(new mxPoint(var28, var16));
               var5.add(new mxPoint(var28, var20));
            } else if (var26.getX() < var27.getX() == var12) {
               double var34 = var16 + (var20 - var16) / 2.0;
               var5.add(new mxPoint(var26.getX(), var34));
               var5.add(new mxPoint(var27.getX(), var34));
            }

            var5.add(var27);
         }
      }
   };
   public static mxEdgeStyle.mxEdgeStyleFunction Loop = new mxEdgeStyle.mxEdgeStyleFunction() {
      @Override
      public void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5) {
         if (var2 != null) {
            mxGraphView var6 = var1.getView();
            mxGraph var7 = var6.getGraph();
            mxPoint var8 = var4 != null && var4.size() > 0 ? (mxPoint)var4.get(0) : null;
            if (var8 != null) {
               var8 = var6.transformControlPoint(var1, var8);
               if (var2.contains(var8.getX(), var8.getY())) {
                  var8 = null;
               }
            }

            double var9 = 0.0;
            double var11 = 0.0;
            double var13 = 0.0;
            double var15 = 0.0;
            double var17 = mxUtils.getDouble(var1.getStyle(), mxConstants.STYLE_SEGMENT, var7.getGridSize()) * var6.getScale();
            String var19 = mxUtils.getString(var1.getStyle(), mxConstants.STYLE_DIRECTION, "west");
            if (!var19.equals("north") && !var19.equals("south")) {
               var13 = var6.getRoutingCenterY(var2);
               var15 = var17;
            } else {
               var9 = var6.getRoutingCenterX(var2);
               var11 = var17;
            }

            if (var8 != null && !(var8.getX() < var2.getX()) && !(var8.getX() > var2.getX() + var2.getWidth())) {
               var9 = var6.getRoutingCenterX(var2);
               var11 = Math.max(Math.abs(var9 - var8.getX()), var15);
               var13 = var8.getY();
               var15 = 0.0;
            } else if (var8 != null) {
               var9 = var8.getX();
               var15 = Math.max(Math.abs(var13 - var8.getY()), var15);
            } else if (var19.equals("north")) {
               var13 = var2.getY() - 2.0 * var11;
            } else if (var19.equals("south")) {
               var13 = var2.getY() + var2.getHeight() + 2.0 * var11;
            } else if (var19.equals("east")) {
               var9 = var2.getX() - 2.0 * var15;
            } else {
               var9 = var2.getX() + var2.getWidth() + 2.0 * var15;
            }

            var5.add(new mxPoint(var9 - var11, var13 - var15));
            var5.add(new mxPoint(var9 + var11, var13 + var15));
         }
      }
   };
   public static mxEdgeStyle.mxEdgeStyleFunction ElbowConnector = new mxEdgeStyle.mxEdgeStyleFunction() {
      @Override
      public void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5) {
         mxPoint var6 = var4 != null && var4.size() > 0 ? (mxPoint)var4.get(0) : null;
         boolean var7 = false;
         boolean var8 = false;
         if (var2 != null && var3 != null) {
            if (var6 != null) {
               double var9 = Math.min(var2.getX(), var3.getX());
               double var11 = Math.max(var2.getX() + var2.getWidth(), var3.getX() + var3.getWidth());
               double var13 = Math.min(var2.getY(), var3.getY());
               double var15 = Math.max(var2.getY() + var2.getHeight(), var3.getY() + var3.getHeight());
               var6 = var1.getView().transformControlPoint(var1, var6);
               var7 = var6.getY() < var13 || var6.getY() > var15;
               var8 = var6.getX() < var9 || var6.getX() > var11;
            } else {
               double var18 = Math.max(var2.getX(), var3.getX());
               double var19 = Math.min(var2.getX() + var2.getWidth(), var3.getX() + var3.getWidth());
               var7 = var18 == var19;
               if (!var7) {
                  double var20 = Math.max(var2.getY(), var3.getY());
                  double var21 = Math.min(var2.getY() + var2.getHeight(), var3.getY() + var3.getHeight());
                  var8 = var20 == var21;
               }
            }
         }

         if (var8 || !var7 && !mxUtils.getString(var1.getStyle(), mxConstants.STYLE_ELBOW, "").equals("vertical")) {
            mxEdgeStyle.SideToSide.apply(var1, var2, var3, var4, var5);
         } else {
            mxEdgeStyle.TopToBottom.apply(var1, var2, var3, var4, var5);
         }
      }
   };
   public static mxEdgeStyle.mxEdgeStyleFunction SideToSide = new mxEdgeStyle.mxEdgeStyleFunction() {
      @Override
      public void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5) {
         mxGraphView var6 = var1.getView();
         mxPoint var7 = var4 != null && var4.size() > 0 ? (mxPoint)var4.get(0) : null;
         mxPoint var8 = var1.getAbsolutePoint(0);
         mxPoint var9 = var1.getAbsolutePoint(var1.getAbsolutePointCount() - 1);
         if (var7 != null) {
            var7 = var6.transformControlPoint(var1, var7);
         }

         if (var8 != null) {
            var2 = new mxCellState();
            var2.setX(var8.getX());
            var2.setY(var8.getY());
         }

         if (var9 != null) {
            var3 = new mxCellState();
            var3.setX(var9.getX());
            var3.setY(var9.getY());
         }

         if (var2 != null && var3 != null) {
            double var10 = Math.max(var2.getX(), var3.getX());
            double var12 = Math.min(var2.getX() + var2.getWidth(), var3.getX() + var3.getWidth());
            double var14 = var7 != null ? var7.getX() : var12 + (var10 - var12) / 2.0;
            double var16 = var6.getRoutingCenterY(var2);
            double var18 = var6.getRoutingCenterY(var3);
            if (var7 != null) {
               if (var7.getY() >= var2.getY() && var7.getY() <= var2.getY() + var2.getHeight()) {
                  var16 = var7.getY();
               }

               if (var7.getY() >= var3.getY() && var7.getY() <= var3.getY() + var3.getHeight()) {
                  var18 = var7.getY();
               }
            }

            if (!var3.contains(var14, var16) && !var2.contains(var14, var16)) {
               var5.add(new mxPoint(var14, var16));
            }

            if (!var3.contains(var14, var18) && !var2.contains(var14, var18)) {
               var5.add(new mxPoint(var14, var18));
            }

            if (var5.size() == 1) {
               if (var7 != null) {
                  if (!var3.contains(var14, var7.getY()) && !var2.contains(var14, var7.getY())) {
                     var5.add(new mxPoint(var14, var7.getY()));
                  }
               } else {
                  double var20 = Math.max(var2.getY(), var3.getY());
                  double var22 = Math.min(var2.getY() + var2.getHeight(), var3.getY() + var3.getHeight());
                  var5.add(new mxPoint(var14, var20 + (var22 - var20) / 2.0));
               }
            }
         }
      }
   };
   public static mxEdgeStyle.mxEdgeStyleFunction TopToBottom = new mxEdgeStyle.mxEdgeStyleFunction() {
      @Override
      public void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5) {
         mxGraphView var6 = var1.getView();
         mxPoint var7 = var4 != null && var4.size() > 0 ? (mxPoint)var4.get(0) : null;
         mxPoint var8 = var1.getAbsolutePoint(0);
         mxPoint var9 = var1.getAbsolutePoint(var1.getAbsolutePointCount() - 1);
         if (var7 != null) {
            var7 = var6.transformControlPoint(var1, var7);
         }

         if (var8 != null) {
            var2 = new mxCellState();
            var2.setX(var8.getX());
            var2.setY(var8.getY());
         }

         if (var9 != null) {
            var3 = new mxCellState();
            var3.setX(var9.getX());
            var3.setY(var9.getY());
         }

         if (var2 != null && var3 != null) {
            double var10 = Math.max(var2.getY(), var3.getY());
            double var12 = Math.min(var2.getY() + var2.getHeight(), var3.getY() + var3.getHeight());
            double var14 = var6.getRoutingCenterX(var2);
            if (var7 != null && var7.getX() >= var2.getX() && var7.getX() <= var2.getX() + var2.getWidth()) {
               var14 = var7.getX();
            }

            double var16 = var7 != null ? var7.getY() : var12 + (var10 - var12) / 2.0;
            if (!var3.contains(var14, var16) && !var2.contains(var14, var16)) {
               var5.add(new mxPoint(var14, var16));
            }

            if (var7 != null && var7.getX() >= var3.getX() && var7.getX() <= var3.getX() + var3.getWidth()) {
               var14 = var7.getX();
            } else {
               var14 = var6.getRoutingCenterX(var3);
            }

            if (!var3.contains(var14, var16) && !var2.contains(var14, var16)) {
               var5.add(new mxPoint(var14, var16));
            }

            if (var5.size() == 1) {
               if (var7 != null) {
                  if (!var3.contains(var7.getX(), var16) && !var2.contains(var7.getX(), var16)) {
                     var5.add(new mxPoint(var7.getX(), var16));
                  }
               } else {
                  double var18 = Math.max(var2.getX(), var3.getX());
                  double var20 = Math.min(var2.getX() + var2.getWidth(), var3.getX() + var3.getWidth());
                  var5.add(new mxPoint(var18 + (var20 - var18) / 2.0, var16));
               }
            }
         }
      }
   };
   public static mxEdgeStyle.mxEdgeStyleFunction SegmentConnector = new mxEdgeStyle.mxEdgeStyleFunction() {
      @Override
      public void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5) {
         List var6 = var1.absolutePoints;
         boolean var7 = true;
         mxPoint var8 = null;
         mxPoint var9 = (mxPoint)var6.get(0);
         if (var9 == null && var2 != null) {
            var9 = new mxPoint(var1.view.getRoutingCenterX(var2), var1.view.getRoutingCenterY(var2));
         } else if (var9 != null) {
            var9 = (mxPoint)var9.clone();
         }

         int var10 = var6.size() - 1;
         if (var4 != null && var4.size() > 0) {
            var8 = var1.view.transformControlPoint(var1, (mxPoint)var4.get(0));
            mxCellState var11 = var2;
            mxPoint var12 = (mxPoint)var6.get(0);
            boolean var13 = false;
            boolean var14 = false;
            mxPoint var15 = var8;
            int var16 = var4.size();
            int var17 = 0;

            while (var17 < 2) {
               boolean var18 = var12 != null && var12.getX() == var15.getX();
               boolean var19 = var12 != null && var12.getY() == var15.getY();
               boolean var20 = var11 != null && var15.getY() >= var11.getY() && var15.getY() <= var11.getY() + var11.getHeight();
               boolean var21 = var11 != null && var15.getX() >= var11.getX() && var15.getX() <= var11.getX() + var11.getWidth();
               var13 = var19 || var12 == null && var20;
               var14 = var18 || var12 == null && var21;
               if (var12 == null || var19 || var18 || !var20 && !var21) {
                  if (!var14 && !var13) {
                     var11 = var3;
                     var12 = (mxPoint)var6.get(var10);
                     var15 = var1.view.transformControlPoint(var1, (mxPoint)var4.get(var16 - 1));
                     var17++;
                     continue;
                  }

                  var7 = var13;
                  if (var17 == 1) {
                     var7 = var4.size() % 2 == 0 ? var13 : var14;
                  }
                  break;
               }

               var7 = !var20;
               break;
            }

            if (!var7
               || (var6.get(0) == null || ((mxPoint)var6.get(0)).getY() == var8.getY())
                  && (var6.get(0) != null || var2 == null || !(var8.getY() < var2.getY()) && !(var8.getY() > var2.getY() + var2.getHeight()))) {
               if (!var7
                  && (
                     var6.get(0) != null && ((mxPoint)var6.get(0)).getX() != var8.getX()
                        || var6.get(0) == null && var2 != null && (var8.getX() < var2.getX() || var8.getX() > var2.getX() + var2.getWidth())
                  )) {
                  var5.add(new mxPoint(var8.getX(), var9.getY()));
               }
            } else {
               var5.add(new mxPoint(var9.getX(), var8.getY()));
            }

            if (var7) {
               var9.setY(var8.getY());
            } else {
               var9.setX(var8.getX());
            }

            for (int var26 = 0; var26 < var4.size(); var26++) {
               var7 = !var7;
               var8 = var1.view.transformControlPoint(var1, (mxPoint)var4.get(var26));
               if (var7) {
                  var9.setY(var8.getY());
               } else {
                  var9.setX(var8.getX());
               }

               var5.add((mxPoint)var9.clone());
            }
         } else {
            var8 = var9;
            var7 = true;
         }

         var9 = (mxPoint)var6.get(var10);
         if (var9 == null && var3 != null) {
            var9 = new mxPoint(var1.view.getRoutingCenterX(var3), var1.view.getRoutingCenterY(var3));
         }

         if (!var7
            || (var6.get(var10) == null || ((mxPoint)var6.get(var10)).getY() == var8.getY())
               && (var6.get(var10) != null || var3 == null || !(var8.getY() < var3.getY()) && !(var8.getY() > var3.getY() + var3.getHeight()))) {
            if (!var7
               && (
                  var6.get(var10) != null && ((mxPoint)var6.get(var10)).getX() != var8.getX()
                     || var6.get(var10) == null && var3 != null && (var8.getX() < var3.getX() || var8.getX() > var3.getX() + var3.getWidth())
               )) {
               var5.add(new mxPoint(var8.getX(), var9.getY()));
            }
         } else {
            var5.add(new mxPoint(var9.getX(), var8.getY()));
         }

         if (var6.get(0) == null && var2 != null) {
            while (var5.size() > 1 && var2.contains(((mxPoint)var5.get(1)).getX(), ((mxPoint)var5.get(1)).getY())) {
               var5.remove(1);
            }
         }

         if (var6.get(var10) == null && var3 != null) {
            while (var5.size() > 1 && var3.contains(((mxPoint)var5.get(var5.size() - 1)).getX(), ((mxPoint)var5.get(var5.size() - 1)).getY())) {
               var5.remove(var5.size() - 1);
            }
         }
      }
   };
   public static double orthBuffer = 10.0;
   public static double[][] dirVectors = new double[][]{{-1.0, 0.0}, {0.0, -1.0}, {1.0, 0.0}, {0.0, 1.0}, {-1.0, 0.0}, {0.0, -1.0}, {1.0, 0.0}};
   public static double[][] wayPoints1 = new double[128][2];
   public static int[][][] routePatterns = new int[][][]{
      {{513, 2308, 2081, 2562}, {513, 1090, 514, 2184, 2114, 2561}, {513, 1090, 514, 2564, 2184, 2562}, {513, 2308, 2561, 1090, 514, 2568, 2308}},
      {{514, 1057, 513, 2308, 2081, 2562}, {514, 2184, 2114, 2561}, {514, 2184, 2562, 1057, 513, 2564, 2184}, {514, 1057, 513, 2568, 2308, 2561}},
      {{1090, 514, 1057, 513, 2308, 2081, 2562}, {2114, 2561}, {1090, 2562, 1057, 513, 2564, 2184}, {1090, 514, 1057, 513, 2308, 2561, 2568}},
      {{2081, 2562}, {1057, 513, 1090, 514, 2184, 2114, 2561}, {1057, 513, 1090, 514, 2184, 2562, 2564}, {1057, 2561, 1090, 514, 2568, 2308}}
   };
   public static int[][][] inlineRoutePatterns = new int[][][]{
      {null, {2114, 2568}, null, null},
      {null, {514, 2081, 2114, 2568}, null, null},
      {null, {2114, 2561}, null, null},
      {{2081, 2562}, {1057, 2114, 2568}, {2184, 2562}, null}
   };
   public static double[] vertexSeperations = new double[5];
   public static double[][] limits = new double[2][9];
   public static int LEFT_MASK = 32;
   public static int TOP_MASK = 64;
   public static int RIGHT_MASK = 128;
   public static int BOTTOM_MASK = 256;
   public static int LEFT = 1;
   public static int TOP = 2;
   public static int RIGHT = 4;
   public static int BOTTOM = 8;
   public static int SIDE_MASK = LEFT_MASK | TOP_MASK | RIGHT_MASK | BOTTOM_MASK;
   public static int CENTER_MASK = 512;
   public static int SOURCE_MASK = 1024;
   public static int TARGET_MASK = 2048;
   public static int VERTEX_MASK = SOURCE_MASK | TARGET_MASK;
   public static double vertBendProportion = 0.5;
   public static double hozBendProportion = 0.5;
   public static mxEdgeStyle.mxEdgeStyleFunction OrthConnector = new mxEdgeStyle.mxEdgeStyleFunction() {
      @Override
      public void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5) {
         mxGraph var6 = var1.view.graph;
         boolean var7 = var2 == null ? false : var6.getModel().isEdge(var2.cell);
         boolean var8 = var3 == null ? false : var6.getModel().isEdge(var3.cell);
         if ((var4 == null || var4.size() <= 0) && !var7 && !var8) {
            if (var2 != null && var3 != null) {
               double var9 = mxEdgeStyle.orthBuffer * var1.getView().getScale();
               int[] var11 = new int[]{mxUtils.getPortConstraints(var2, var1, true), mxUtils.getPortConstraints(var3, var1, false)};
               int[] var12 = new int[2];
               double[][] var13 = new double[2][4];
               var13[0][0] = var2.getX();
               var13[0][1] = var2.getY();
               var13[0][2] = var2.getWidth();
               var13[0][3] = var2.getHeight();
               var13[1][0] = var3.getX();
               var13[1][1] = var3.getY();
               var13[1][2] = var3.getWidth();
               var13[1][3] = var3.getHeight();

               for (int var14 = 0; var14 < 2; var14++) {
                  mxEdgeStyle.limits[var14][1] = var13[var14][0] - var9;
                  mxEdgeStyle.limits[var14][2] = var13[var14][1] - var9;
                  mxEdgeStyle.limits[var14][4] = var13[var14][0] + var13[var14][2] + var9;
                  mxEdgeStyle.limits[var14][8] = var13[var14][1] + var13[var14][3] + var9;
               }

               double var67 = var13[0][0] + var13[0][2] / 2.0;
               double var16 = var13[0][1] + var13[0][3] / 2.0;
               double var18 = var13[1][0] + var13[1][2] / 2.0;
               double var20 = var13[1][1] + var13[1][3] / 2.0;
               double var22 = var67 - var18;
               double var24 = var16 - var20;
               byte var26 = 0;
               if (var22 < 0.0) {
                  if (var24 < 0.0) {
                     var26 = 2;
                  } else {
                     var26 = 1;
                  }
               } else if (var24 <= 0.0) {
                  var26 = 3;
                  if (var22 == 0.0) {
                     var26 = 2;
                  }
               }

               mxPoint var27 = var1.getAbsolutePoint(0);
               mxPoint var28 = var1.getAbsolutePoint(var1.getAbsolutePointCount() - 1);
               mxPoint var29 = var27;
               double[][] var30 = new double[][]{{0.5, 0.5}, {0.5, 0.5}};

               for (int var31 = 0; var31 < 2; var31++) {
                  if (var29 != null) {
                     var30[var31][0] = (var29.getX() - var13[var31][0]) / var13[var31][2];
                     if (var30[var31][0] < 0.01) {
                        var12[var31] = 1;
                     } else if (var30[var31][0] > 0.99) {
                        var12[var31] = 8;
                     }

                     var30[var31][1] = (var29.getY() - var13[var31][1]) / var13[var31][3];
                     if (var30[var31][1] < 0.01) {
                        var12[var31] = 2;
                     } else if (var30[var31][1] > 0.99) {
                        var12[var31] = 4;
                     }
                  }

                  var29 = var28;
               }

               double var68 = var13[0][1] - (var13[1][1] + var13[1][3]);
               double var33 = var13[0][0] - (var13[1][0] + var13[1][2]);
               double var35 = var13[1][1] - (var13[0][1] + var13[0][3]);
               double var37 = var13[1][0] - (var13[0][0] + var13[0][2]);
               mxEdgeStyle.vertexSeperations[1] = Math.max(var33 - 2.0 * var9, 0.0);
               mxEdgeStyle.vertexSeperations[2] = Math.max(var68 - 2.0 * var9, 0.0);
               mxEdgeStyle.vertexSeperations[4] = Math.max(var35 - 2.0 * var9, 0.0);
               mxEdgeStyle.vertexSeperations[3] = Math.max(var37 - 2.0 * var9, 0.0);
               int[] var39 = new int[2];
               int[] var40 = new int[2];
               int[] var41 = new int[2];
               var40[0] = var33 >= var37 ? 1 : 8;
               var41[0] = var68 >= var35 ? 2 : 4;
               var40[1] = mxUtils.reversePortConstraints(var40[0]);
               var41[1] = mxUtils.reversePortConstraints(var41[0]);
               double var42 = var33 >= var37 ? var33 : var37;
               double var44 = var68 >= var35 ? var68 : var35;
               int[][] var46 = new int[2][2];
               boolean var47 = false;

               for (int var48 = 0; var48 < 2; var48++) {
                  if (var12[var48] == 0) {
                     if ((var40[var48] & var11[var48]) == 0) {
                        var40[var48] = mxUtils.reversePortConstraints(var40[var48]);
                     }

                     if ((var41[var48] & var11[var48]) == 0) {
                        var41[var48] = mxUtils.reversePortConstraints(var41[var48]);
                     }

                     var46[var48][0] = var41[var48];
                     var46[var48][1] = var40[var48];
                  }
               }

               if (var44 > var9 * 2.0 && var42 > var9 * 2.0) {
                  if ((var40[0] & var11[0]) > 0 && (var41[1] & var11[1]) > 0) {
                     var46[0][0] = var40[0];
                     var46[0][1] = var41[0];
                     var46[1][0] = var41[1];
                     var46[1][1] = var40[1];
                     var47 = true;
                  } else if ((var41[0] & var11[0]) > 0 && (var40[1] & var11[1]) > 0) {
                     var46[0][0] = var41[0];
                     var46[0][1] = var40[0];
                     var46[1][0] = var40[1];
                     var46[1][1] = var41[1];
                     var47 = true;
                  }
               }

               if (var44 > var9 * 2.0 && !var47) {
                  var46[0][0] = var41[0];
                  var46[0][1] = var40[0];
                  var46[1][0] = var41[1];
                  var46[1][1] = var40[1];
                  var47 = true;
               }

               if (var42 > var9 * 2.0 && !var47) {
                  var46[0][0] = var40[0];
                  var46[0][1] = var41[0];
                  var46[1][0] = var40[1];
                  var46[1][1] = var41[1];
                  var47 = true;
               }

               for (int var70 = 0; var70 < 2; var70++) {
                  if (var12[var70] == 0) {
                     if ((var46[var70][0] & var11[var70]) == 0) {
                        var46[var70][0] = var46[var70][1];
                     }

                     var39[var70] = var46[var70][0] & var11[var70];
                     var39[var70] |= (var46[var70][1] & var11[var70]) << 8;
                     var39[var70] |= (var46[1 - var70][var70] & var11[var70]) << 16;
                     var39[var70] |= (var46[1 - var70][1 - var70] & var11[var70]) << 24;
                     if ((var39[var70] & 15) == 0) {
                        var39[var70] <<= 8;
                     }

                     if ((var39[var70] & 3840) == 0) {
                        var39[var70] = var39[var70] & 15 | var39[var70] >> 8;
                     }

                     if ((var39[var70] & 983040) == 0) {
                        var39[var70] = var39[var70] & 65535 | (var39[var70] & 251658240) >> 8;
                     }

                     var12[var70] = var39[var70] & 15;
                     if (var11[var70] == 1 || var11[var70] == 2 || var11[var70] == 8 || var11[var70] == 4) {
                        var12[var70] = var11[var70];
                     }
                  }
               }

               int[] var71 = this.getRoutePattern(var12, var26, var22, var24);
               if (var22 != 0.0 && var24 == 0.0) {
               }

               mxEdgeStyle.wayPoints1[0][0] = var13[0][0];
               mxEdgeStyle.wayPoints1[0][1] = var13[0][1];
               switch (var12[0]) {
                  case 1:
                     mxEdgeStyle.wayPoints1[0][0] = mxEdgeStyle.wayPoints1[0][0] - var9;
                     mxEdgeStyle.wayPoints1[0][1] = mxEdgeStyle.wayPoints1[0][1] + var30[0][1] * var13[0][3];
                     break;
                  case 2:
                     mxEdgeStyle.wayPoints1[0][0] = mxEdgeStyle.wayPoints1[0][0] + var30[0][0] * var13[0][2];
                     mxEdgeStyle.wayPoints1[0][1] = mxEdgeStyle.wayPoints1[0][1] - var9;
                  case 3:
                  case 5:
                  case 6:
                  case 7:
                  default:
                     break;
                  case 4:
                     mxEdgeStyle.wayPoints1[0][0] = mxEdgeStyle.wayPoints1[0][0] + var30[0][0] * var13[0][2];
                     mxEdgeStyle.wayPoints1[0][1] = mxEdgeStyle.wayPoints1[0][1] + (var13[0][3] + var9);
                     break;
                  case 8:
                     mxEdgeStyle.wayPoints1[0][0] = mxEdgeStyle.wayPoints1[0][0] + (var13[0][2] + var9);
                     mxEdgeStyle.wayPoints1[0][1] = mxEdgeStyle.wayPoints1[0][1] + var30[0][1] * var13[0][3];
               }

               int var49 = 0;
               int var50 = (var12[0] & 9) > 0 ? 0 : 1;
               int var51 = 0;

               for (int var52 = 0; var52 < var71.length; var52++) {
                  int var53 = var71[var52] & 15;
                  int var54 = var53 == 8 ? 3 : var53;
                  var54 += var26;
                  if (var54 > 4) {
                     var54 -= 4;
                  }

                  double[] var55 = mxEdgeStyle.dirVectors[var54 - 1];
                  var51 = var54 % 2 > 0 ? 0 : 1;
                  if (var51 != var50) {
                     mxEdgeStyle.wayPoints1[++var49][0] = mxEdgeStyle.wayPoints1[var49 - 1][0];
                     mxEdgeStyle.wayPoints1[var49][1] = mxEdgeStyle.wayPoints1[var49 - 1][1];
                  }

                  boolean var56 = (var71[var52] & mxEdgeStyle.TARGET_MASK) > 0;
                  boolean var57 = (var71[var52] & mxEdgeStyle.SOURCE_MASK) > 0;
                  int var58 = (var71[var52] & mxEdgeStyle.SIDE_MASK) >> 5;
                  var58 <<= var26;
                  if (var58 > 15) {
                     var58 >>= 4;
                  }

                  boolean var59 = (var71[var52] & mxEdgeStyle.CENTER_MASK) > 0;
                  if ((var57 || var56) && var58 < 9) {
                     double var60 = 0.0;
                     int var62 = var57 ? 0 : 1;
                     if (var59 && var51 == 0) {
                        var60 = var13[var62][0] + var30[var62][0] * var13[var62][2];
                     } else if (var59) {
                        var60 = var13[var62][1] + var30[var62][1] * var13[var62][3];
                     } else {
                        var60 = mxEdgeStyle.limits[var62][var58];
                     }

                     if (var51 == 0) {
                        double var63 = mxEdgeStyle.wayPoints1[var49][0];
                        double var65 = (var60 - var63) * var55[0];
                        if (var65 > 0.0) {
                           mxEdgeStyle.wayPoints1[var49][0] = mxEdgeStyle.wayPoints1[var49][0] + var55[0] * var65;
                        }
                     } else {
                        double var77 = mxEdgeStyle.wayPoints1[var49][1];
                        double var78 = (var60 - var77) * var55[1];
                        if (var78 > 0.0) {
                           mxEdgeStyle.wayPoints1[var49][1] = mxEdgeStyle.wayPoints1[var49][1] + var55[1] * var78;
                        }
                     }
                  } else if (var59) {
                     mxEdgeStyle.wayPoints1[var49][0] = mxEdgeStyle.wayPoints1[var49][0] + var55[0] * Math.abs(mxEdgeStyle.vertexSeperations[var54] / 2.0);
                     mxEdgeStyle.wayPoints1[var49][1] = mxEdgeStyle.wayPoints1[var49][1] + var55[1] * Math.abs(mxEdgeStyle.vertexSeperations[var54] / 2.0);
                  }

                  if (var49 > 0 && mxEdgeStyle.wayPoints1[var49][var51] == mxEdgeStyle.wayPoints1[var49 - 1][var51]) {
                     var49--;
                  } else {
                     var50 = var51;
                  }
               }

               for (int var73 = 0; var73 <= var49; var73++) {
                  var5.add(new mxPoint(mxEdgeStyle.wayPoints1[var73][0], mxEdgeStyle.wayPoints1[var73][1]));
               }
            }
         } else {
            mxEdgeStyle.SegmentConnector.apply(var1, var2, var3, var4, var5);
         }
      }

      protected int[] getRoutePattern(int[] var1, double var2, double var4, double var6) {
         int var8 = var1[0] == 8 ? 3 : var1[0];
         int var9 = var1[1] == 8 ? 3 : var1[1];
         var8 = (int)(var8 - var2);
         var9 = (int)(var9 - var2);
         if (var8 < 1) {
            var8 += 4;
         }

         if (var9 < 1) {
            var9 += 4;
         }

         int[] var10 = mxEdgeStyle.routePatterns[var8 - 1][var9 - 1];
         if ((var4 == 0.0 || var6 == 0.0) && mxEdgeStyle.inlineRoutePatterns[var8 - 1][var9 - 1] != null) {
            var10 = mxEdgeStyle.inlineRoutePatterns[var8 - 1][var9 - 1];
         }

         return var10;
      }
   };

   public interface mxEdgeStyleFunction {
      void apply(mxCellState var1, mxCellState var2, mxCellState var3, List<mxPoint> var4, List<mxPoint> var5);
   }
}
