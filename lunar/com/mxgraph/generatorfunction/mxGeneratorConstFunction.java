package com.mxgraph.generatorfunction;

import com.mxgraph.view.mxCellState;

public class mxGeneratorConstFunction extends mxGeneratorFunction {
   private double cost;

   public mxGeneratorConstFunction(double var1) {
      this.cost = var1;
   }

   @Override
   public double getCost(mxCellState var1) {
      return this.cost;
   }
}
