package com.mxgraph.swing.view;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.shape.mxBasicShape;
import com.mxgraph.shape.mxIShape;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;

public class mxInteractiveCanvas extends mxGraphics2DCanvas {
   protected ImageObserver imageObserver = null;

   public mxInteractiveCanvas() {
      this(null);
   }

   public mxInteractiveCanvas(ImageObserver var1) {
      this.setImageObserver(var1);
   }

   public void setImageObserver(ImageObserver var1) {
      this.imageObserver = var1;
   }

   public ImageObserver getImageObserver() {
      return this.imageObserver;
   }

   @Override
   protected void drawImageImpl(Image var1, int var2, int var3) {
      this.g.drawImage(var1, var2, var3, this.imageObserver);
   }

   @Override
   protected Dimension getImageSize(Image var1) {
      return new Dimension(var1.getWidth(this.imageObserver), var1.getHeight(this.imageObserver));
   }

   public boolean contains(mxGraphComponent var1, Rectangle var2, mxCellState var3) {
      return var3 != null
         && var3.getX() >= var2.x
         && var3.getY() >= var2.y
         && var3.getX() + var3.getWidth() <= var2.x + var2.width
         && var3.getY() + var3.getHeight() <= var2.y + var2.height;
   }

   public boolean intersects(mxGraphComponent var1, Rectangle var2, mxCellState var3) {
      if (var3 != null) {
         if (var3.getLabelBounds() != null && var3.getLabelBounds().getRectangle().intersects(var2)) {
            return true;
         }

         int var4 = var3.getAbsolutePointCount();
         if (var4 <= 0) {
            return var3.getRectangle().intersects(var2);
         }

         var2 = (Rectangle)var2.clone();
         int var5 = var1.getTolerance();
         var2.grow(var5, var5);
         Shape var6 = null;
         if (mxUtils.getString(var3.getStyle(), mxConstants.STYLE_SHAPE, "").equals("arrow")) {
            mxIShape var7 = this.getShape(var3.getStyle());
            if (var7 instanceof mxBasicShape) {
               var6 = ((mxBasicShape)var7).createShape(this, var3);
            }
         }

         if (var6 != null && var6.intersects(var2)) {
            return true;
         }

         mxPoint var11 = var3.getAbsolutePoint(0);

         for (int var8 = 0; var8 < var4; var8++) {
            mxPoint var9 = var3.getAbsolutePoint(var8);
            if (var2.intersectsLine(var11.getX(), var11.getY(), var9.getX(), var9.getY())) {
               return true;
            }

            var11 = var9;
         }
      }

      return false;
   }

   public boolean hitSwimlaneContent(mxGraphComponent var1, mxCellState var2, int var3, int var4) {
      if (var2 != null) {
         int var5 = (int)Math.max(
            2L, Math.round(mxUtils.getInt(var2.getStyle(), mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_STARTSIZE) * var1.getGraph().getView().getScale())
         );
         Rectangle var6 = var2.getRectangle();
         if (mxUtils.isTrue(var2.getStyle(), mxConstants.STYLE_HORIZONTAL, true)) {
            var6.y += var5;
            var6.height -= var5;
         } else {
            var6.x += var5;
            var6.width -= var5;
         }

         return var6.contains(var3, var4);
      } else {
         return false;
      }
   }
}
