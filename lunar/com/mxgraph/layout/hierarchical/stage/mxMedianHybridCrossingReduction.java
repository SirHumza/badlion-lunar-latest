package com.mxgraph.layout.hierarchical.stage;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.layout.hierarchical.model.mxGraphAbstractHierarchyCell;
import com.mxgraph.layout.hierarchical.model.mxGraphHierarchyModel;
import com.mxgraph.layout.hierarchical.model.mxGraphHierarchyRank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class mxMedianHybridCrossingReduction implements mxHierarchicalLayoutStage {
   protected mxHierarchicalLayout layout;
   protected int maxIterations = 24;
   protected mxGraphAbstractHierarchyCell[][] nestedBestRanks = (mxGraphAbstractHierarchyCell[][])null;
   protected int currentBestCrossings = 0;
   protected int iterationsWithoutImprovement = 0;
   protected int maxNoImprovementIterations = 2;

   public mxMedianHybridCrossingReduction(mxHierarchicalLayout var1) {
      this.layout = var1;
   }

   @Override
   public void execute(Object var1) {
      mxGraphHierarchyModel var2 = this.layout.getModel();
      this.nestedBestRanks = new mxGraphAbstractHierarchyCell[var2.ranks.size()][];

      for (int var3 = 0; var3 < this.nestedBestRanks.length; var3++) {
         mxGraphHierarchyRank var4 = var2.ranks.get(new Integer(var3));
         this.nestedBestRanks[var3] = new mxGraphAbstractHierarchyCell[var4.size()];
         var4.toArray(this.nestedBestRanks[var3]);
      }

      this.iterationsWithoutImprovement = 0;
      this.currentBestCrossings = this.calculateCrossings(var2);

      for (int var10 = 0; var10 < this.maxIterations && this.iterationsWithoutImprovement < this.maxNoImprovementIterations; var10++) {
         this.weightedMedian(var10, var2);
         this.transpose(var10, var2);
         int var12 = this.calculateCrossings(var2);
         if (var12 < this.currentBestCrossings) {
            this.currentBestCrossings = var12;
            this.iterationsWithoutImprovement = 0;

            for (int var5 = 0; var5 < this.nestedBestRanks.length; var5++) {
               mxGraphHierarchyRank var6 = var2.ranks.get(new Integer(var5));
               Iterator var7 = var6.iterator();

               for (int var8 = 0; var8 < var6.size(); var8++) {
                  mxGraphAbstractHierarchyCell var9 = (mxGraphAbstractHierarchyCell)var7.next();
                  this.nestedBestRanks[var5][var9.getGeneralPurposeVariable(var5)] = var9;
               }
            }
         } else {
            this.iterationsWithoutImprovement++;

            for (int var14 = 0; var14 < this.nestedBestRanks.length; var14++) {
               mxGraphHierarchyRank var17 = var2.ranks.get(new Integer(var14));
               Iterator var19 = var17.iterator();

               for (int var20 = 0; var20 < var17.size(); var20++) {
                  mxGraphAbstractHierarchyCell var21 = (mxGraphAbstractHierarchyCell)var19.next();
                  var21.setGeneralPurposeVariable(var14, var20);
               }
            }
         }

         if (this.currentBestCrossings == 0) {
            break;
         }
      }

      LinkedHashMap var11 = new LinkedHashMap(var2.maxRank + 1);
      mxGraphHierarchyRank[] var13 = new mxGraphHierarchyRank[var2.maxRank + 1];

      for (int var15 = 0; var15 < var2.maxRank + 1; var15++) {
         var13[var15] = new mxGraphHierarchyRank();
         var11.put(new Integer(var15), var13[var15]);
      }

      for (int var16 = 0; var16 < this.nestedBestRanks.length; var16++) {
         for (int var18 = 0; var18 < this.nestedBestRanks[var16].length; var18++) {
            var13[var16].add(this.nestedBestRanks[var16][var18]);
         }
      }

      var2.ranks = var11;
   }

   private int calculateCrossings(mxGraphHierarchyModel var1) {
      int var2 = var1.ranks.size();
      int var3 = 0;

      for (int var4 = 1; var4 < var2; var4++) {
         var3 += this.calculateRankCrossing(var4, var1);
      }

      return var3;
   }

   protected int calculateRankCrossing(int var1, mxGraphHierarchyModel var2) {
      int var3 = 0;
      mxGraphHierarchyRank var4 = var2.ranks.get(new Integer(var1));
      mxGraphHierarchyRank var5 = var2.ranks.get(new Integer(var1 - 1));
      int var6 = var4.size();
      int var7 = var5.size();
      int[][] var8 = new int[var6][var7];

      for (mxGraphAbstractHierarchyCell var10 : var4) {
         int var11 = var10.getGeneralPurposeVariable(var1);

         for (mxGraphAbstractHierarchyCell var14 : var10.getPreviousLayerConnectedCells(var1)) {
            int var15 = var14.getGeneralPurposeVariable(var1 - 1);
            var8[var11][var15] = 201207;
         }
      }

      for (int var16 = 0; var16 < var6; var16++) {
         for (int var17 = 0; var17 < var7; var17++) {
            if (var8[var16][var17] == 201207) {
               for (int var18 = var16 + 1; var18 < var6; var18++) {
                  for (int var20 = 0; var20 < var17; var20++) {
                     if (var8[var18][var20] == 201207) {
                        var3++;
                     }
                  }
               }

               for (int var19 = 0; var19 < var16; var19++) {
                  for (int var21 = var17 + 1; var21 < var7; var21++) {
                     if (var8[var19][var21] == 201207) {
                        var3++;
                     }
                  }
               }
            }
         }
      }

      return var3 / 2;
   }

   private void transpose(int var1, mxGraphHierarchyModel var2) {
      boolean var3 = true;
      int var4 = 0;
      byte var5 = 10;

      while (var3 && var4++ < var5) {
         boolean var6 = var1 % 2 == 1 && var4 % 2 == 1;
         var3 = false;

         for (int var7 = 0; var7 < var2.ranks.size(); var7++) {
            mxGraphHierarchyRank var8 = var2.ranks.get(new Integer(var7));
            mxGraphAbstractHierarchyCell[] var9 = new mxGraphAbstractHierarchyCell[var8.size()];
            Iterator var10 = var8.iterator();

            for (int var11 = 0; var11 < var9.length; var11++) {
               mxGraphAbstractHierarchyCell var12 = (mxGraphAbstractHierarchyCell)var10.next();
               var9[var12.getGeneralPurposeVariable(var7)] = var12;
            }

            List var26 = null;
            List var28 = null;
            List var13 = null;
            List var14 = null;
            Object var15 = null;
            Object var16 = null;
            int[] var17 = null;
            int[] var18 = null;
            mxGraphAbstractHierarchyCell var19 = null;
            mxGraphAbstractHierarchyCell var20 = null;

            for (int var21 = 0; var21 < var8.size() - 1; var21++) {
               if (var21 != 0) {
                  var26 = var13;
                  var28 = var14;
                  var15 = var17;
                  var16 = var18;
                  var19 = var20;
               } else {
                  var19 = var9[var21];
                  var26 = var19.getNextLayerConnectedCells(var7);
                  var28 = var19.getPreviousLayerConnectedCells(var7);
                  var15 = new int[var26.size()];
                  var16 = new int[var28.size()];

                  for (int var22 = 0; var22 < ((Object[])var15).length; var22++) {
                     ((Object[])var15)[var22] = ((mxGraphAbstractHierarchyCell)var26.get(var22)).getGeneralPurposeVariable(var7 + 1);
                  }

                  for (int var33 = 0; var33 < ((Object[])var16).length; var33++) {
                     ((Object[])var16)[var33] = ((mxGraphAbstractHierarchyCell)var28.get(var33)).getGeneralPurposeVariable(var7 - 1);
                  }
               }

               var20 = var9[var21 + 1];
               var13 = var20.getNextLayerConnectedCells(var7);
               var14 = var20.getPreviousLayerConnectedCells(var7);
               var17 = new int[var13.size()];
               var18 = new int[var14.size()];

               for (int var34 = 0; var34 < var17.length; var34++) {
                  var17[var34] = ((mxGraphAbstractHierarchyCell)var13.get(var34)).getGeneralPurposeVariable(var7 + 1);
               }

               for (int var35 = 0; var35 < var18.length; var35++) {
                  var18[var35] = ((mxGraphAbstractHierarchyCell)var14.get(var35)).getGeneralPurposeVariable(var7 - 1);
               }

               int var36 = 0;
               int var23 = 0;

               for (int var24 = 0; var24 < ((Object[])var15).length; var24++) {
                  for (int var25 = 0; var25 < var17.length; var25++) {
                     if (((Object[])var15)[var24] > var17[var25]) {
                        var36++;
                     }

                     if (((Object[])var15)[var24] < var17[var25]) {
                        var23++;
                     }
                  }
               }

               for (int var37 = 0; var37 < ((Object[])var16).length; var37++) {
                  for (int var39 = 0; var39 < var18.length; var39++) {
                     if (((Object[])var16)[var37] > var18[var39]) {
                        var36++;
                     }

                     if (((Object[])var16)[var37] < var18[var39]) {
                        var23++;
                     }
                  }
               }

               if (var23 < var36 || var23 == var36 && var6) {
                  int var38 = var19.getGeneralPurposeVariable(var7);
                  var19.setGeneralPurposeVariable(var7, var20.getGeneralPurposeVariable(var7));
                  var20.setGeneralPurposeVariable(var7, var38);
                  var13 = var26;
                  var14 = var28;
                  var17 = (int[])var15;
                  var18 = (int[])var16;
                  var20 = var19;
                  if (!var6) {
                     var3 = true;
                  }
               }
            }
         }
      }
   }

   private void weightedMedian(int var1, mxGraphHierarchyModel var2) {
      boolean var3 = var1 % 2 == 0;
      if (var3) {
         for (int var4 = var2.maxRank - 1; var4 >= 0; var4--) {
            this.medianRank(var4, var3);
         }
      } else {
         for (int var5 = 1; var5 < var2.maxRank; var5++) {
            this.medianRank(var5, var3);
         }
      }
   }

   private void medianRank(int var1, boolean var2) {
      int var3 = this.nestedBestRanks[var1].length;
      ArrayList var4 = new ArrayList(var3);
      boolean[] var5 = new boolean[var3];

      for (int var6 = 0; var6 < var3; var6++) {
         mxGraphAbstractHierarchyCell var7 = this.nestedBestRanks[var1][var6];
         mxMedianHybridCrossingReduction.MedianCellSorter var8 = new mxMedianHybridCrossingReduction.MedianCellSorter();
         var8.cell = var7;
         List var9;
         if (var2) {
            var9 = var7.getNextLayerConnectedCells(var1);
         } else {
            var9 = var7.getPreviousLayerConnectedCells(var1);
         }

         int var10;
         if (var2) {
            var10 = var1 + 1;
         } else {
            var10 = var1 - 1;
         }

         if (var9 != null && var9.size() != 0) {
            var8.medianValue = this.medianValue(var9, var10);
            var4.add(var8);
         } else {
            var5[var7.getGeneralPurposeVariable(var1)] = true;
         }
      }

      mxMedianHybridCrossingReduction.MedianCellSorter[] var11 = var4.toArray(new mxMedianHybridCrossingReduction.MedianCellSorter[var4.size()]);
      Arrays.sort(var11);
      int var12 = 0;

      for (int var13 = 0; var13 < var3; var13++) {
         if (!var5[var13]) {
            mxMedianHybridCrossingReduction.MedianCellSorter var14 = var11[var12++];
            var14.cell.setGeneralPurposeVariable(var1, var13);
         }
      }
   }

   private double medianValue(Collection<mxGraphAbstractHierarchyCell> var1, int var2) {
      double[] var3 = new double[var1.size()];
      int var4 = 0;
      Iterator var5 = var1.iterator();

      while (var5.hasNext()) {
         var3[var4++] = ((mxGraphAbstractHierarchyCell)var5.next()).getGeneralPurposeVariable(var2);
      }

      Arrays.sort(var3);
      if (var4 % 2 == 1) {
         return var3[var4 / 2];
      }

      if (var4 == 2) {
         return (var3[0] + var3[1]) / 2.0;
      }

      int var6 = var4 / 2;
      double var7 = var3[var6 - 1] - var3[0];
      double var9 = var3[var4 - 1] - var3[var6];
      return (var3[var6 - 1] * var9 + var3[var6] * var7) / (var7 + var9);
   }

   protected class MedianCellSorter implements Comparable<Object> {
      public double medianValue = 0.0;
      mxGraphAbstractHierarchyCell cell = null;

      @Override
      public int compareTo(Object var1) {
         if (var1 instanceof mxMedianHybridCrossingReduction.MedianCellSorter) {
            if (this.medianValue < ((mxMedianHybridCrossingReduction.MedianCellSorter)var1).medianValue) {
               return -1;
            }

            if (this.medianValue > ((mxMedianHybridCrossingReduction.MedianCellSorter)var1).medianValue) {
               return 1;
            }
         }

         return 0;
      }
   }
}
