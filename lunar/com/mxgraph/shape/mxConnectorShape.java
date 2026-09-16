package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxLine;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class mxConnectorShape extends mxBasicShape {
   @Override
   public void paintShape(mxGraphics2DCanvas var1, mxCellState var2) {
      if (var2.getAbsolutePointCount() > 1 && this.configureGraphics(var1, var2, false)) {
         ArrayList var3 = new ArrayList<>(var2.getAbsolutePoints());
         Map var4 = var2.getStyle();
         boolean var5 = mxUtils.isTrue(var4, mxConstants.STYLE_DASHED);
         Object var6 = var4.get(mxConstants.STYLE_DASHED);
         if (var5) {
            var4.remove(mxConstants.STYLE_DASHED);
            var1.getGraphics().setStroke(var1.createStroke(var4));
         }

         this.translatePoint(var3, 0, this.paintMarker(var1, var2, true));
         this.translatePoint(var3, var3.size() - 1, this.paintMarker(var1, var2, false));
         if (var5) {
            var4.put(mxConstants.STYLE_DASHED, var6);
            var1.getGraphics().setStroke(var1.createStroke(var4));
         }

         this.paintPolyline(var1, var3, var2.getStyle());
      }
   }

   protected void paintPolyline(mxGraphics2DCanvas var1, List<mxPoint> var2, Map<String, Object> var3) {
      boolean var4 = this.isRounded(var3) && var1.getScale() > mxConstants.MIN_SCALE_FOR_ROUNDED_LINES;
      var1.paintPolyline(var2.toArray(new mxPoint[var2.size()]), var4);
   }

   public boolean isRounded(Map<String, Object> var1) {
      return mxUtils.isTrue(var1, mxConstants.STYLE_ROUNDED, false);
   }

   private void translatePoint(List<mxPoint> var1, int var2, mxPoint var3) {
      if (var3 != null) {
         mxPoint var4 = (mxPoint)((mxPoint)var1.get(var2)).clone();
         var4.setX(var4.getX() + var3.getX());
         var4.setY(var4.getY() + var3.getY());
         var1.set(var2, var4);
      }
   }

   public mxPoint paintMarker(mxGraphics2DCanvas var1, mxCellState var2, boolean var3) {
      Map var4 = var2.getStyle();
      float var5 = (float)(mxUtils.getFloat(var4, mxConstants.STYLE_STROKEWIDTH, 1.0F) * var1.getScale());
      String var6 = mxUtils.getString(var4, var3 ? mxConstants.STYLE_STARTARROW : mxConstants.STYLE_ENDARROW, "");
      float var7 = mxUtils.getFloat(var4, var3 ? mxConstants.STYLE_STARTSIZE : mxConstants.STYLE_ENDSIZE, mxConstants.DEFAULT_MARKERSIZE);
      Color var8 = mxUtils.getColor(var4, mxConstants.STYLE_STROKECOLOR);
      var1.getGraphics().setColor(var8);
      double var9 = var7 * var1.getScale();
      List var11 = var2.getAbsolutePoints();
      mxLine var12 = this.getMarkerVector(var11, var3, var9);
      mxPoint var13 = new mxPoint(var12.getX(), var12.getY());
      mxPoint var14 = var12.getEndPoint();
      mxPoint var15 = null;
      double var16 = var14.getX() - var13.getX();
      double var18 = var14.getY() - var13.getY();
      double var20 = Math.max(1.0, Math.sqrt(var16 * var16 + var18 * var18));
      double var22 = var16 / var20;
      double var24 = var18 / var20;
      double var26 = var22 * var9;
      double var28 = var24 * var9;
      double var30 = var22 * var5;
      double var32 = var24 * var5;
      var14 = (mxPoint)var14.clone();
      var14.setX(var14.getX() - var30 / 2.0);
      var14.setY(var14.getY() - var32 / 2.0);
      mxIMarker var34 = mxMarkerRegistry.getMarker(var6);
      if (var34 != null) {
         var15 = var34.paintMarker(var1, var2, var6, var14, var26, var28, var9, var3);
         if (var15 != null) {
            var15.setX(var15.getX() - var30 / 2.0);
            var15.setY(var15.getY() - var32 / 2.0);
         }
      } else {
         var26 = var16 * var5 / var20;
         var28 = var18 * var5 / var20;
         var15 = new mxPoint(-var30 / 2.0, -var32 / 2.0);
      }

      return var15;
   }

   protected mxLine getMarkerVector(List<mxPoint> var1, boolean var2, double var3) {
      int var5 = var1.size();
      mxPoint var6 = var2 ? (mxPoint)var1.get(1) : (mxPoint)var1.get(var5 - 2);
      mxPoint var7 = var2 ? (mxPoint)var1.get(0) : (mxPoint)var1.get(var5 - 1);

      for (int var8 = 1; var8 < var5 - 1 && Math.round(var6.getX() - var7.getX()) == 0L && Math.round(var6.getY() - var7.getY()) == 0L; var8++) {
         var6 = var2 ? (mxPoint)var1.get(1 + var8) : (mxPoint)var1.get(var5 - 2 - var8);
      }

      return new mxLine(var6, var7);
   }
}
