package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.view.mxCellState;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class mxCloudShape extends mxBasicShape {
   @Override
   public Shape createShape(mxGraphics2DCanvas var1, mxCellState var2) {
      Rectangle var3 = var2.getRectangle();
      int var4 = var3.x;
      int var5 = var3.y;
      int var6 = var3.width;
      int var7 = var3.height;
      GeneralPath var8 = new GeneralPath();
      var8.moveTo((float)(var4 + 0.25 * var6), (float)(var5 + 0.25 * var7));
      var8.curveTo(
         (float)(var4 + 0.05 * var6), (float)(var5 + 0.25 * var7), var4, (float)(var5 + 0.5 * var7), (float)(var4 + 0.16 * var6), (float)(var5 + 0.55 * var7)
      );
      var8.curveTo(
         var4, (float)(var5 + 0.66 * var7), (float)(var4 + 0.18 * var6), (float)(var5 + 0.9 * var7), (float)(var4 + 0.31 * var6), (float)(var5 + 0.8 * var7)
      );
      var8.curveTo((float)(var4 + 0.4 * var6), var5 + var7, (float)(var4 + 0.7 * var6), var5 + var7, (float)(var4 + 0.8 * var6), (float)(var5 + 0.8 * var7));
      var8.curveTo(var4 + var6, (float)(var5 + 0.8 * var7), var4 + var6, (float)(var5 + 0.6 * var7), (float)(var4 + 0.875 * var6), (float)(var5 + 0.5 * var7));
      var8.curveTo(
         var4 + var6,
         (float)(var5 + 0.3 * var7),
         (float)(var4 + 0.8 * var6),
         (float)(var5 + 0.1 * var7),
         (float)(var4 + 0.625 * var6),
         (float)(var5 + 0.2 * var7)
      );
      var8.curveTo(
         (float)(var4 + 0.5 * var6),
         (float)(var5 + 0.05 * var7),
         (float)(var4 + 0.3 * var6),
         (float)(var5 + 0.05 * var7),
         (float)(var4 + 0.25 * var6),
         (float)(var5 + 0.25 * var7)
      );
      var8.closePath();
      return var8;
   }
}
