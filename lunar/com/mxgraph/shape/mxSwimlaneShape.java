package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.canvas.mxGraphicsCanvas2D;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;

public class mxSwimlaneShape extends mxBasicShape {
   protected double getTitleSize(mxGraphics2DCanvas var1, mxCellState var2) {
      return Math.max(0.0, mxUtils.getFloat(var2.getStyle(), mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_STARTSIZE) * var1.getScale());
   }

   @Override
   protected mxRectangle getGradientBounds(mxGraphics2DCanvas var1, mxCellState var2) {
      double var3 = this.getTitleSize(var1, var2);
      if (mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_HORIZONTAL, true)) {
         var3 = Math.min(var3, var2.getHeight());
         return new mxRectangle(var2.getX(), var2.getY(), var2.getWidth(), var3);
      } else {
         var3 = Math.min(var3, var2.getWidth());
         return new mxRectangle(var2.getX(), var2.getY(), var3, var2.getHeight());
      }
   }

   @Override
   public void paintShape(mxGraphics2DCanvas var1, mxCellState var2) {
      double var3 = this.getTitleSize(var1, var2);
      String var5 = mxUtils.getString(var2.getStyle(), mxConstants.STYLE_SWIMLANE_FILLCOLOR, mxConstants.NONE);
      boolean var6 = mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_SWIMLANE_LINE, true);
      double var7 = 0.0;
      if (mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_HORIZONTAL, true)) {
         var3 = Math.min(var3, var2.getHeight());
      } else {
         var3 = Math.min(var3, var2.getWidth());
      }

      var1.getGraphics().translate(var2.getX(), var2.getY());
      if (!mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_ROUNDED)) {
         this.paintSwimlane(var1, var2, var3, var5, var6);
      } else {
         var7 = this.getArcSize(var2, var3);
         this.paintRoundedSwimlane(var1, var2, var3, var7, var5, var6);
      }

      String var9 = mxUtils.getString(var2.getStyle(), mxConstants.STYLE_SEPARATORCOLOR, mxConstants.NONE);
      this.paintSeparator(var1, var2, var3, var9);
   }

   protected double getArcSize(mxCellState var1, double var2) {
      double var4 = mxUtils.getDouble(var1.getStyle(), mxConstants.STYLE_ARCSIZE, mxConstants.RECTANGLE_ROUNDING_FACTOR * 100.0) / 100.0;
      return var2 * var4 * 3.0;
   }

   protected mxGraphicsCanvas2D configureCanvas(mxGraphics2DCanvas var1, mxCellState var2, mxGraphicsCanvas2D var3) {
      var3.setShadow(this.hasShadow(var1, var2));
      var3.setStrokeColor(mxUtils.getString(var2.getStyle(), mxConstants.STYLE_STROKECOLOR, mxConstants.NONE));
      var3.setStrokeWidth(mxUtils.getInt(var2.getStyle(), mxConstants.STYLE_STROKEWIDTH, 1));
      var3.setDashed(mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_DASHED, false));
      String var4 = mxUtils.getString(var2.getStyle(), mxConstants.STYLE_FILLCOLOR, mxConstants.NONE);
      String var5 = mxUtils.getString(var2.getStyle(), mxConstants.STYLE_GRADIENTCOLOR, mxConstants.NONE);
      if (!mxConstants.NONE.equals(var4) && !mxConstants.NONE.equals(var5)) {
         mxRectangle var6 = this.getGradientBounds(var1, var2);
         var3.setGradient(
            var4,
            var5,
            var6.getX(),
            var6.getY(),
            var6.getWidth(),
            var6.getHeight(),
            mxUtils.getString(var2.getStyle(), mxConstants.STYLE_GRADIENT_DIRECTION, "north"),
            1.0,
            1.0
         );
      } else {
         var3.setFillColor(var4);
      }

      return var3;
   }

   protected void paintSwimlane(mxGraphics2DCanvas var1, mxCellState var2, double var3, String var5, boolean var6) {
      mxGraphicsCanvas2D var7 = this.configureCanvas(var1, var2, new mxGraphicsCanvas2D(var1.getGraphics()));
      double var8 = var2.getWidth();
      double var10 = var2.getHeight();
      if (!mxConstants.NONE.equals(var5)) {
         var7.save();
         var7.setFillColor(var5);
         var7.rect(0.0, 0.0, var8, var10);
         var7.fillAndStroke();
         var7.restore();
         var7.setShadow(false);
      }

      var7.begin();
      if (mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_HORIZONTAL, true)) {
         var7.moveTo(0.0, var3);
         var7.lineTo(0.0, 0.0);
         var7.lineTo(var8, 0.0);
         var7.lineTo(var8, var3);
         if (var6 || var3 >= var10) {
            var7.close();
         }

         var7.fillAndStroke();
         if (var3 < var10 && mxConstants.NONE.equals(var5)) {
            var7.begin();
            var7.moveTo(0.0, var3);
            var7.lineTo(0.0, var10);
            var7.lineTo(var8, var10);
            var7.lineTo(var8, var3);
            var7.stroke();
         }
      } else {
         var7.moveTo(var3, 0.0);
         var7.lineTo(0.0, 0.0);
         var7.lineTo(0.0, var10);
         var7.lineTo(var3, var10);
         if (var6 || var3 >= var8) {
            var7.close();
         }

         var7.fillAndStroke();
         if (var3 < var8 && mxConstants.NONE.equals(var5)) {
            var7.begin();
            var7.moveTo(var3, 0.0);
            var7.lineTo(var8, 0.0);
            var7.lineTo(var8, var10);
            var7.lineTo(var3, var10);
            var7.stroke();
         }
      }
   }

   protected void paintRoundedSwimlane(mxGraphics2DCanvas var1, mxCellState var2, double var3, double var5, String var7, boolean var8) {
      mxGraphicsCanvas2D var9 = this.configureCanvas(var1, var2, new mxGraphicsCanvas2D(var1.getGraphics()));
      double var10 = var2.getWidth();
      double var12 = var2.getHeight();
      if (!mxConstants.NONE.equals(var7)) {
         var9.save();
         var9.setFillColor(var7);
         var9.roundrect(0.0, 0.0, var10, var12, var5, var5);
         var9.fillAndStroke();
         var9.restore();
         var9.setShadow(false);
      }

      var9.begin();
      if (mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_HORIZONTAL, true)) {
         var9.moveTo(var10, var3);
         var9.lineTo(var10, var5);
         var9.quadTo(var10, 0.0, var10 - Math.min(var10 / 2.0, var5), 0.0);
         var9.lineTo(Math.min(var10 / 2.0, var5), 0.0);
         var9.quadTo(0.0, 0.0, 0.0, var5);
         var9.lineTo(0.0, var3);
         if (var8 || var3 >= var12) {
            var9.close();
         }

         var9.fillAndStroke();
         if (var3 < var12 && mxConstants.NONE.equals(var7)) {
            var9.begin();
            var9.moveTo(0.0, var3);
            var9.lineTo(0.0, var12 - var5);
            var9.quadTo(0.0, var12, Math.min(var10 / 2.0, var5), var12);
            var9.lineTo(var10 - Math.min(var10 / 2.0, var5), var12);
            var9.quadTo(var10, var12, var10, var12 - var5);
            var9.lineTo(var10, var3);
            var9.stroke();
         }
      } else {
         var9.moveTo(var3, 0.0);
         var9.lineTo(var5, 0.0);
         var9.quadTo(0.0, 0.0, 0.0, Math.min(var12 / 2.0, var5));
         var9.lineTo(0.0, var12 - Math.min(var12 / 2.0, var5));
         var9.quadTo(0.0, var12, var5, var12);
         var9.lineTo(var3, var12);
         if (var8 || var3 >= var10) {
            var9.close();
         }

         var9.fillAndStroke();
         if (var3 < var10 && mxConstants.NONE.equals(var7)) {
            var9.begin();
            var9.moveTo(var3, var12);
            var9.lineTo(var10 - var5, var12);
            var9.quadTo(var10, var12, var10, var12 - Math.min(var12 / 2.0, var5));
            var9.lineTo(var10, Math.min(var12 / 2.0, var5));
            var9.quadTo(var10, 0.0, var10 - var5, 0.0);
            var9.lineTo(var3, 0.0);
            var9.stroke();
         }
      }
   }

   protected void paintSeparator(mxGraphics2DCanvas var1, mxCellState var2, double var3, String var5) {
      mxGraphicsCanvas2D var6 = new mxGraphicsCanvas2D(var1.getGraphics());
      double var7 = var2.getWidth();
      double var9 = var2.getHeight();
      if (!mxConstants.NONE.equals(var5)) {
         var6.setStrokeColor(var5);
         var6.setDashed(true);
         var6.begin();
         if (mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_HORIZONTAL, true)) {
            var6.moveTo(var7, var3);
            var6.lineTo(var7, var9);
         } else {
            var6.moveTo(var3, 0.0);
            var6.lineTo(var7, 0.0);
         }

         var6.stroke();
         var6.setDashed(false);
      }
   }
}
