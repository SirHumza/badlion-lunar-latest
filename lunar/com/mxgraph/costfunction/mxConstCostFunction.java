package com.mxgraph.costfunction;

import com.mxgraph.view.mxCellState;

public class mxConstCostFunction extends mxCostFunction {
   private double cost;

   public mxConstCostFunction(double var1) {
      this.cost = var1;
   }

   @Override
   public double getCost(mxCellState var1) {
      return this.cost;
   }
}
