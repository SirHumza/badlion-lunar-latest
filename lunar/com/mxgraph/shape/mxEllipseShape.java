package com.mxgraph.shape;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.view.mxCellState;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D.Float;

public class mxEllipseShape extends mxBasicShape {
   @Override
   public Shape createShape(mxGraphics2DCanvas var1, mxCellState var2) {
      Rectangle var3 = var2.getRectangle();
      return new Float(var3.x, var3.y, var3.width, var3.height);
   }
}
