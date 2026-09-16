package com.mxgraph.generatorfunction;

import com.mxgraph.view.mxCellState;

public class mxGeneratorRandomIntFunction extends mxGeneratorFunction {
   private double maxWeight = 10.0;
   private double minWeight = 0.0;

   public mxGeneratorRandomIntFunction(double var1, double var3) {
      this.setWeightRange(var1, var3);
   }

   @Override
   public double getCost(mxCellState var1) {
      return this.minWeight == this.maxWeight ? this.minWeight : this.minWeight + Math.round(Math.random() * (this.maxWeight - this.minWeight));
   }

   public double getMaxWeight() {
      return this.maxWeight;
   }

   public void setWeightRange(double var1, double var3) {
      this.maxWeight = Math.round(Math.max(var1, var3));
      this.minWeight = Math.round(Math.min(var1, var3));
   }

   public double getMinWeight() {
      return this.minWeight;
   }
}
