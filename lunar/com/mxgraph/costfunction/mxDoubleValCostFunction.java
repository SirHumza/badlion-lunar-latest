package com.mxgraph.costfunction;

import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;

public class mxDoubleValCostFunction extends mxCostFunction {
   @Override
   public double getCost(mxCellState var1) {
      if (var1 != null && var1.getView() != null && var1.getView().getGraph() != null) {
         mxGraph var2 = var1.getView().getGraph();
         Object var3 = var1.getCell();
         Double var4 = null;
         if (var2.getModel().getValue(var3) != null && var2.getModel().getValue(var3) != "") {
            if (var2.getModel().getValue(var3) instanceof String) {
               var4 = Double.parseDouble((String)var2.getModel().getValue(var3));
            } else {
               var4 = (Double)var2.getModel().getValue(var3);
            }

            return var4;
         } else {
            return 1.0;
         }
      } else {
         return 1.0;
      }
   }
}
