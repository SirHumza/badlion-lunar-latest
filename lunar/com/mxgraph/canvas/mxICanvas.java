package com.mxgraph.canvas;

import com.mxgraph.util.mxPoint;
import com.mxgraph.view.mxCellState;

public interface mxICanvas {
   void setTranslate(double var1, double var3);

   mxPoint getTranslate();

   void setScale(double var1);

   double getScale();

   Object drawCell(mxCellState var1);

   Object drawLabel(String var1, mxCellState var2, boolean var3);
}
