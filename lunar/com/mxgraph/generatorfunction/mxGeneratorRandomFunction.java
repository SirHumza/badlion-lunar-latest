package com.mxgraph.generatorfunction;

import com.mxgraph.view.mxCellState;

public class mxGeneratorRandomFunction extends mxGeneratorFunction {
   private double maxWeight = 1.0;
   private double minWeight = 0.0;
   private int roundToDecimals = 2;

   public mxGeneratorRandomFunction(double var1, double var3, int var5) {
      this.setWeightRange(var1, var3);
      this.setRoundToDecimals(var5);
   }

   @Override
   public double getCost(mxCellState var1) {
      Double var2 = null;
      var2 = Math.random() * (this.maxWeight - this.minWeight) + this.minWeight;
      var2 = Math.round(var2 * Math.pow(10.0, this.getRoundToDecimals())) / Math.pow(10.0, this.getRoundToDecimals());
      return var2;
   }

   public double getMaxWeight() {
      return this.maxWeight;
   }

   public void setWeightRange(double var1, double var3) {
      this.maxWeight = Math.max(var1, var3);
      this.minWeight = Math.min(var1, var3);
   }

   public double getMinWeight() {
      return this.minWeight;
   }

   public int getRoundToDecimals() {
      return this.roundToDecimals;
   }

   public void setRoundToDecimals(int var1) {
      this.roundToDecimals = var1;
   }
}
