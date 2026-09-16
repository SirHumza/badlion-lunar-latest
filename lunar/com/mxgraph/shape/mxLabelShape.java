package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.util.Map;

public class mxLabelShape extends mxImageShape {
   @Override
   public void paintShape(mxGraphics2DCanvas var1, mxCellState var2) {
      super.paintShape(var1, var2);
      if (mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_GLASS, false)) {
         drawGlassEffect(var1, var2);
      }
   }

   public static void drawGlassEffect(mxGraphics2DCanvas var0, mxCellState var1) {
      double var2 = 0.4;
      var0.getGraphics()
         .setPaint(
            new GradientPaint(
               (float)var1.getX(),
               (float)var1.getY(),
               new Color(1.0F, 1.0F, 1.0F, 0.9F),
               (float)var1.getX(),
               (float)(var1.getY() + var1.getHeight() * var2),
               new Color(1.0F, 1.0F, 1.0F, 0.3F)
            )
         );
      float var4 = (float)(mxUtils.getFloat(var1.getStyle(), mxConstants.STYLE_STROKEWIDTH, 1.0F) * var0.getScale() / 2.0);
      GeneralPath var5 = new GeneralPath();
      var5.moveTo((float)var1.getX() - var4, (float)var1.getY() - var4);
      var5.lineTo((float)var1.getX() - var4, (float)(var1.getY() + var1.getHeight() * var2));
      var5.quadTo(
         (float)(var1.getX() + var1.getWidth() * 0.5),
         (float)(var1.getY() + var1.getHeight() * 0.7),
         (float)(var1.getX() + var1.getWidth() + var4),
         (float)(var1.getY() + var1.getHeight() * var2)
      );
      var5.lineTo((float)(var1.getX() + var1.getWidth() + var4), (float)var1.getY() - var4);
      var5.closePath();
      var0.getGraphics().fill(var5);
   }

   @Override
   public Rectangle getImageBounds(mxGraphics2DCanvas var1, mxCellState var2) {
      Map var3 = var2.getStyle();
      double var4 = var1.getScale();
      String var6 = mxUtils.getString(var3, mxConstants.STYLE_IMAGE_ALIGN, "left");
      String var7 = mxUtils.getString(var3, mxConstants.STYLE_IMAGE_VERTICAL_ALIGN, "middle");
      int var8 = (int)(mxUtils.getInt(var3, mxConstants.STYLE_IMAGE_WIDTH, mxConstants.DEFAULT_IMAGESIZE) * var4);
      int var9 = (int)(mxUtils.getInt(var3, mxConstants.STYLE_IMAGE_HEIGHT, mxConstants.DEFAULT_IMAGESIZE) * var4);
      int var10 = (int)(mxUtils.getInt(var3, mxConstants.STYLE_SPACING, 2) * var4);
      mxRectangle var11 = new mxRectangle(var2);
      if (var6.equals("center")) {
         var11.setX(var11.getX() + (var11.getWidth() - var8) / 2.0);
      } else if (var6.equals("right")) {
         var11.setX(var11.getX() + var11.getWidth() - var8 - var10 - 2.0);
      } else {
         var11.setX(var11.getX() + var10 + 4.0);
      }

      if (var7.equals("top")) {
         var11.setY(var11.getY() + var10);
      } else if (var7.equals("bottom")) {
         var11.setY(var11.getY() + var11.getHeight() - var9 - var10);
      } else {
         var11.setY(var11.getY() + (var11.getHeight() - var9) / 2.0);
      }

      var11.setWidth(var8);
      var11.setHeight(var9);
      return var11.getRectangle();
   }

   @Override
   public Color getFillColor(mxGraphics2DCanvas var1, mxCellState var2) {
      return mxUtils.getColor(var2.getStyle(), mxConstants.STYLE_FILLCOLOR);
   }

   @Override
   public Color getStrokeColor(mxGraphics2DCanvas var1, mxCellState var2) {
      return mxUtils.getColor(var2.getStyle(), mxConstants.STYLE_STROKECOLOR);
   }

   @Override
   public boolean hasGradient(mxGraphics2DCanvas var1, mxCellState var2) {
      return true;
   }
}
