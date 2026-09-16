package com.mxgraph.view;

import com.mxgraph.util.mxRectangle;
import java.util.Hashtable;

public class mxTemporaryCellStates {
   protected mxGraphView view;
   protected Hashtable<Object, mxCellState> oldStates;
   protected mxRectangle oldBounds;
   protected double oldScale;

   public mxTemporaryCellStates(mxGraphView var1) {
      this(var1, 1.0, null);
   }

   public mxTemporaryCellStates(mxGraphView var1, double var2) {
      this(var1, var2, null);
   }

   public mxTemporaryCellStates(mxGraphView var1, double var2, Object[] var4) {
      this.view = var1;
      this.oldBounds = var1.getGraphBounds();
      this.oldStates = var1.getStates();
      this.oldScale = var1.getScale();
      var1.setStates(new Hashtable<>());
      var1.setScale(var2);
      if (var4 != null) {
         mxRectangle var5 = null;

         for (int var6 = 0; var6 < var4.length; var6++) {
            mxRectangle var7 = var1.getBoundingBox(var1.validateCellState(var1.validateCell(var4[var6])));
            if (var5 == null) {
               var5 = var7;
            } else {
               var5.add(var7);
            }
         }

         if (var5 == null) {
            var5 = new mxRectangle();
         }

         var1.setGraphBounds(var5);
      }
   }

   public void destroy() {
      this.view.setScale(this.oldScale);
      this.view.setStates(this.oldStates);
      this.view.setGraphBounds(this.oldBounds);
   }
}
