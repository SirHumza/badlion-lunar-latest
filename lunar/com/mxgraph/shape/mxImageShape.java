package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Color;
import java.awt.Rectangle;

public class mxImageShape extends mxRectangleShape {
   @Override
   public void paintShape(mxGraphics2DCanvas var1, mxCellState var2) {
      super.paintShape(var1, var2);
      boolean var3 = mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_IMAGE_FLIPH, false);
      boolean var4 = mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_IMAGE_FLIPV, false);
      var1.drawImage(this.getImageBounds(var1, var2), this.getImageForStyle(var1, var2), mxGraphics2DCanvas.PRESERVE_IMAGE_ASPECT, var3, var4);
   }

   public Rectangle getImageBounds(mxGraphics2DCanvas var1, mxCellState var2) {
      return var2.getRectangle();
   }

   @Override
   public boolean hasGradient(mxGraphics2DCanvas var1, mxCellState var2) {
      return false;
   }

   public String getImageForStyle(mxGraphics2DCanvas var1, mxCellState var2) {
      return var1.getImageForStyle(var2.getStyle());
   }

   @Override
   public Color getFillColor(mxGraphics2DCanvas var1, mxCellState var2) {
      return mxUtils.getColor(var2.getStyle(), mxConstants.STYLE_IMAGE_BACKGROUND);
   }

   @Override
   public Color getStrokeColor(mxGraphics2DCanvas var1, mxCellState var2) {
      return mxUtils.getColor(var2.getStyle(), mxConstants.STYLE_IMAGE_BORDER);
   }
}
