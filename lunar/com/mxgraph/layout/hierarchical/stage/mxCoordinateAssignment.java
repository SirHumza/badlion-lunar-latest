package com.mxgraph.layout.hierarchical.stage;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.layout.hierarchical.model.mxGraphAbstractHierarchyCell;
import com.mxgraph.layout.hierarchical.model.mxGraphHierarchyEdge;
import com.mxgraph.layout.hierarchical.model.mxGraphHierarchyModel;
import com.mxgraph.layout.hierarchical.model.mxGraphHierarchyNode;
import com.mxgraph.layout.hierarchical.model.mxGraphHierarchyRank;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxGraph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class mxCoordinateAssignment implements mxHierarchicalLayoutStage {
   private static final Logger log = Logger.getLogger(mxCoordinateAssignment.class.getName());
   protected mxHierarchicalLayout layout;
   protected double intraCellSpacing = 30.0;
   protected double interRankCellSpacing = 30.0;
   protected double parallelEdgeSpacing = 4.0;
   protected double vertexConnectionBuffer = 0.0;
   protected int maxIterations = 8;
   protected int prefHozEdgeSep = 5;
   protected int prefVertEdgeOff = 2;
   protected int minEdgeJetty = 12;
   protected int channelBuffer = 4;
   protected Map<mxGraphHierarchyEdge, double[]> jettyPositions = new HashMap<>();
   protected int orientation = 1;
   protected double initialX;
   protected double limitX;
   protected double currentXDelta;
   protected int widestRank;
   protected double[] rankTopY;
   protected double[] rankBottomY;
   protected double widestRankValue;
   protected double[] rankWidths;
   protected double[] rankY;
   protected boolean fineTuning = true;
   protected boolean disableEdgeStyle = true;
   protected mxCoordinateAssignment.HierarchicalEdgeStyle edgeStyle = mxCoordinateAssignment.HierarchicalEdgeStyle.POLYLINE;
   protected mxGraphAbstractHierarchyCell[][] nextLayerConnectedCache;
   protected int groupPadding = 10;
   protected mxGraphAbstractHierarchyCell[][] previousLayerConnectedCache;

   public mxCoordinateAssignment(mxHierarchicalLayout var1, double var2, double var4, int var6, double var7, double var9) {
      this.layout = var1;
      this.intraCellSpacing = var2;
      this.interRankCellSpacing = var4;
      this.orientation = var6;
      this.initialX = var7;
      this.parallelEdgeSpacing = var9;
   }

   public void printStatus() {
      mxGraphHierarchyModel var1 = this.layout.getModel();
      log.fine("======Coord assignment debug=======");

      for (int var2 = 0; var2 < var1.ranks.size(); var2++) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Rank ");
         var3.append(var2);
         var3.append(" : ");

         for (mxGraphAbstractHierarchyCell var6 : var1.ranks.get(new Integer(var2))) {
            var3.append(var6.getX(var2));
            var3.append("  ");
         }

         log.fine(var3.toString());
      }

      log.fine("====================================");
   }

   @Override
   public void execute(Object var1) {
      mxGraphHierarchyModel var2 = this.layout.getModel();
      this.currentXDelta = 0.0;
      this.initialCoords(this.layout.getGraph(), var2);
      if (this.fineTuning) {
         this.minNode(var2);
      }

      double var3 = 1.0E8;
      if (this.fineTuning) {
         for (int var5 = 0; var5 < this.maxIterations; var5++) {
            if (var5 != 0) {
               this.medianPos(var5, var2);
               this.minNode(var2);
            }

            if (this.currentXDelta < var3) {
               for (int var10 = 0; var10 < var2.ranks.size(); var10++) {
                  for (mxGraphAbstractHierarchyCell var13 : var2.ranks.get(new Integer(var10))) {
                     var13.setX(var10, var13.getGeneralPurposeVariable(var10));
                  }
               }

               var3 = this.currentXDelta;
            } else {
               for (int var6 = 0; var6 < var2.ranks.size(); var6++) {
                  for (mxGraphAbstractHierarchyCell var9 : var2.ranks.get(new Integer(var6))) {
                     var9.setGeneralPurposeVariable(var6, (int)var9.getX(var6));
                  }
               }
            }

            this.minPath(var2);
            this.currentXDelta = 0.0;
         }
      }

      this.setCellLocations(this.layout.getGraph(), var2);
   }

   private void minNode(mxGraphHierarchyModel var1) {
      LinkedList var2 = new LinkedList();
      Hashtable var3 = new Hashtable();
      mxGraphAbstractHierarchyCell[][] var4 = new mxGraphAbstractHierarchyCell[var1.maxRank + 1][];

      for (int var5 = 0; var5 <= var1.maxRank; var5++) {
         mxGraphHierarchyRank var6 = var1.ranks.get(new Integer(var5));
         var4[var5] = var6.toArray(new mxGraphAbstractHierarchyCell[var6.size()]);

         for (int var7 = 0; var7 < var4[var5].length; var7++) {
            mxGraphAbstractHierarchyCell var8 = var4[var5][var7];
            mxCoordinateAssignment.WeightedCellSorter var9 = new mxCoordinateAssignment.WeightedCellSorter(var8, var5);
            var9.rankIndex = var7;
            var9.visited = true;
            var2.add(var9);
            var3.put(var8, var9);
         }
      }

      int var26 = var2.size() * 10;
      int var27 = 0;
      byte var28 = 1;

      while (!var2.isEmpty() && var27 <= var26) {
         mxCoordinateAssignment.WeightedCellSorter var29 = (mxCoordinateAssignment.WeightedCellSorter)var2.getFirst();
         mxGraphAbstractHierarchyCell var30 = var29.cell;
         int var10 = var29.weightedValue;
         int var11 = var29.rankIndex;
         Object[] var12 = var30.getNextLayerConnectedCells(var10).toArray();
         Object[] var13 = var30.getPreviousLayerConnectedCells(var10).toArray();
         int var14 = var12.length;
         int var15 = var13.length;
         int var16 = this.medianXValue(var12, var10 + 1);
         int var17 = this.medianXValue(var13, var10 - 1);
         int var18 = var14 + var15;
         int var19 = var30.getGeneralPurposeVariable(var10);
         double var20 = var19;
         if (var18 > 0) {
            var20 = (var16 * var14 + var17 * var15) / var18;
         }

         boolean var22 = false;
         if (var20 < var19 - var28) {
            if (var11 == 0) {
               var30.setGeneralPurposeVariable(var10, (int)var20);
               var22 = true;
            } else {
               mxGraphAbstractHierarchyCell var23 = var4[var10][var11 - 1];
               int var24 = var23.getGeneralPurposeVariable(var10);
               var24 = var24 + (int)var23.width / 2 + (int)this.intraCellSpacing + (int)var30.width / 2;
               if (var24 < var20) {
                  var30.setGeneralPurposeVariable(var10, (int)var20);
                  var22 = true;
               } else if (var24 < var30.getGeneralPurposeVariable(var10) - var28) {
                  var30.setGeneralPurposeVariable(var10, var24);
                  var22 = true;
               }
            }
         } else if (var20 > var19 + var28) {
            int var31 = var4[var10].length;
            if (var11 == var31 - 1) {
               var30.setGeneralPurposeVariable(var10, (int)var20);
               var22 = true;
            } else {
               mxGraphAbstractHierarchyCell var35 = var4[var10][var11 + 1];
               int var25 = var35.getGeneralPurposeVariable(var10);
               var25 = var25 - (int)var35.width / 2 - (int)this.intraCellSpacing - (int)var30.width / 2;
               if (var25 > var20) {
                  var30.setGeneralPurposeVariable(var10, (int)var20);
                  var22 = true;
               } else if (var25 > var30.getGeneralPurposeVariable(var10) + var28) {
                  var30.setGeneralPurposeVariable(var10, var25);
                  var22 = true;
               }
            }
         }

         if (var22) {
            for (int var32 = 0; var32 < var12.length; var32++) {
               mxGraphAbstractHierarchyCell var36 = (mxGraphAbstractHierarchyCell)var12[var32];
               mxCoordinateAssignment.WeightedCellSorter var39 = (mxCoordinateAssignment.WeightedCellSorter)var3.get(var36);
               if (var39 != null && !var39.visited) {
                  var39.visited = true;
                  var2.add(var39);
               }
            }

            for (int var33 = 0; var33 < var13.length; var33++) {
               mxGraphAbstractHierarchyCell var37 = (mxGraphAbstractHierarchyCell)var13[var33];
               mxCoordinateAssignment.WeightedCellSorter var40 = (mxCoordinateAssignment.WeightedCellSorter)var3.get(var37);
               if (var40 != null && !var40.visited) {
                  var40.visited = true;
                  var2.add(var40);
               }
            }
         }

         var2.removeFirst();
         var29.visited = false;
         var27++;
      }
   }

   private void medianPos(int var1, mxGraphHierarchyModel var2) {
      boolean var3 = var1 % 2 == 0;
      if (var3) {
         for (int var4 = var2.maxRank; var4 > 0; var4--) {
            this.rankMedianPosition(var4 - 1, var2, var4);
         }
      } else {
         for (int var5 = 0; var5 < var2.maxRank - 1; var5++) {
            this.rankMedianPosition(var5 + 1, var2, var5);
         }
      }
   }

   protected void rankMedianPosition(int var1, mxGraphHierarchyModel var2, int var3) {
      mxGraphHierarchyRank var4 = var2.ranks.get(new Integer(var1));
      Object[] var5 = var4.toArray();
      mxCoordinateAssignment.WeightedCellSorter[] var6 = new mxCoordinateAssignment.WeightedCellSorter[var5.length];
      Hashtable var7 = new Hashtable(var5.length);

      for (int var8 = 0; var8 < var5.length; var8++) {
         mxGraphAbstractHierarchyCell var9 = (mxGraphAbstractHierarchyCell)var5[var8];
         var6[var8] = new mxCoordinateAssignment.WeightedCellSorter();
         var6[var8].cell = var9;
         var6[var8].rankIndex = var8;
         var7.put(var9, var6[var8]);
         Collection var10 = null;
         if (var3 < var1) {
            var10 = var9.getPreviousLayerConnectedCells(var1);
         } else {
            var10 = var9.getNextLayerConnectedCells(var1);
         }

         var6[var8].weightedValue = this.calculatedWeightedValue(var9, var10);
      }

      Arrays.sort(var6);

      for (int var24 = 0; var24 < var6.length; var24++) {
         int var25 = 0;
         mxGraphAbstractHierarchyCell var28 = var6[var24].cell;
         Object[] var11 = null;
         int var12 = 0;
         if (var3 < var1) {
            var11 = var28.getPreviousLayerConnectedCells(var1).toArray();
         } else {
            var11 = var28.getNextLayerConnectedCells(var1).toArray();
         }

         if (var11 != null) {
            var25 = var11.length;
            if (var25 > 0) {
               var12 = this.medianXValue(var11, var3);
            } else {
               var12 = var28.getGeneralPurposeVariable(var1);
            }
         }

         double var13 = 0.0;
         double var15 = -1.0E8;
         int var17 = var6[var24].rankIndex - 1;

         while (var17 >= 0) {
            mxCoordinateAssignment.WeightedCellSorter var18 = (mxCoordinateAssignment.WeightedCellSorter)var7.get(var5[var17]);
            if (var18 != null) {
               mxGraphAbstractHierarchyCell var19 = var18.cell;
               if (var18.visited) {
                  var15 = var19.getGeneralPurposeVariable(var1) + var19.width / 2.0 + this.intraCellSpacing + var13 + var28.width / 2.0;
                  var17 = -1;
               } else {
                  var13 += var19.width + this.intraCellSpacing;
                  var17--;
               }
            }
         }

         double var30 = 0.0;
         double var31 = 1.0E8;
         int var21 = var6[var24].rankIndex + 1;

         while (var21 < var6.length) {
            mxCoordinateAssignment.WeightedCellSorter var22 = (mxCoordinateAssignment.WeightedCellSorter)var7.get(var5[var21]);
            if (var22 != null) {
               mxGraphAbstractHierarchyCell var23 = var22.cell;
               if (var22.visited) {
                  var31 = var23.getGeneralPurposeVariable(var1) - var23.width / 2.0 - this.intraCellSpacing - var30 - var28.width / 2.0;
                  var21 = var6.length;
               } else {
                  var30 += var23.width + this.intraCellSpacing;
                  var21++;
               }
            }
         }

         if (var12 >= var15 && var12 <= var31) {
            var28.setGeneralPurposeVariable(var1, var12);
         } else if (var12 < var15) {
            var28.setGeneralPurposeVariable(var1, (int)var15);
            this.currentXDelta += var15 - var12;
         } else if (var12 > var31) {
            var28.setGeneralPurposeVariable(var1, (int)var31);
            this.currentXDelta += var12 - var31;
         }

         var6[var24].visited = true;
      }
   }

   private int calculatedWeightedValue(mxGraphAbstractHierarchyCell var1, Collection<mxGraphAbstractHierarchyCell> var2) {
      int var3 = 0;

      for (mxGraphAbstractHierarchyCell var5 : var2) {
         if (var1.isVertex() && var5.isVertex()) {
            var3++;
         } else if (var1.isEdge() && var5.isEdge()) {
            var3 += 8;
         } else {
            var3 += 2;
         }
      }

      return var3;
   }

   private int medianXValue(Object[] var1, int var2) {
      if (var1.length == 0) {
         return 0;
      }

      int[] var3 = new int[var1.length];

      for (int var4 = 0; var4 < var1.length; var4++) {
         var3[var4] = ((mxGraphAbstractHierarchyCell)var1[var4]).getGeneralPurposeVariable(var2);
      }

      Arrays.sort(var3);
      if (var1.length % 2 == 1) {
         return var3[var1.length / 2];
      }

      int var7 = var1.length / 2;
      int var5 = var3[var7 - 1];
      int var6 = var3[var7];
      return (var5 + var6) / 2;
   }

   private void initialCoords(mxGraph var1, mxGraphHierarchyModel var2) {
      this.calculateWidestRank(var1, var2);

      for (int var3 = this.widestRank; var3 >= 0; var3--) {
         if (var3 < var2.maxRank) {
            this.rankCoordinates(var3, var1, var2);
         }
      }

      for (int var4 = this.widestRank + 1; var4 <= var2.maxRank; var4++) {
         if (var4 > 0) {
            this.rankCoordinates(var4, var1, var2);
         }
      }
   }

   protected void rankCoordinates(int var1, mxGraph var2, mxGraphHierarchyModel var3) {
      mxGraphHierarchyRank var4 = var3.ranks.get(new Integer(var1));
      double var5 = 0.0;
      double var7 = this.initialX + (this.widestRankValue - this.rankWidths[var1]) / 2.0;
      boolean var9 = false;

      for (mxGraphAbstractHierarchyCell var11 : var4) {
         if (var11.isVertex()) {
            mxGraphHierarchyNode var12 = (mxGraphHierarchyNode)var11;
            mxRectangle var13 = this.layout.getVertexBounds(var12.cell);
            if (var13 != null) {
               if (this.orientation != 1 && this.orientation != 5) {
                  var11.width = var13.getHeight();
                  var11.height = var13.getWidth();
               } else {
                  var11.width = var13.getWidth();
                  var11.height = var13.getHeight();
               }
            } else {
               var9 = true;
            }

            var5 = Math.max(var5, var11.height);
         } else if (var11.isEdge()) {
            mxGraphHierarchyEdge var16 = (mxGraphHierarchyEdge)var11;
            int var17 = 1;
            if (var16.edges != null) {
               var17 = var16.edges.size();
            } else {
               log.finer("edge.edges is null");
            }

            var11.width = (var17 - 1) * this.parallelEdgeSpacing;
         }

         var7 += var11.width / 2.0;
         var11.setX(var1, var7);
         var11.setGeneralPurposeVariable(var1, (int)var7);
         var7 += var11.width / 2.0;
         var7 += this.intraCellSpacing;
      }

      if (var9) {
         log.warning("At least one cell has no bounds");
      }
   }

   protected void calculateWidestRank(mxGraph var1, mxGraphHierarchyModel var2) {
      double var3 = -this.interRankCellSpacing;
      double var5 = 0.0;
      this.rankWidths = new double[var2.maxRank + 1];
      this.rankY = new double[var2.maxRank + 1];

      for (int var7 = var2.maxRank; var7 >= 0; var7--) {
         double var8 = 0.0;
         mxGraphHierarchyRank var10 = var2.ranks.get(new Integer(var7));
         double var11 = this.initialX;
         boolean var13 = false;

         for (mxGraphAbstractHierarchyCell var15 : var10) {
            if (var15.isVertex()) {
               mxGraphHierarchyNode var16 = (mxGraphHierarchyNode)var15;
               mxRectangle var17 = this.layout.getVertexBounds(var16.cell);
               if (var17 != null) {
                  if (this.orientation != 1 && this.orientation != 5) {
                     var15.width = var17.getHeight();
                     var15.height = var17.getWidth();
                  } else {
                     var15.width = var17.getWidth();
                     var15.height = var17.getHeight();
                  }
               } else {
                  var13 = true;
               }

               var8 = Math.max(var8, var15.height);
            } else if (var15.isEdge()) {
               mxGraphHierarchyEdge var22 = (mxGraphHierarchyEdge)var15;
               int var23 = 1;
               if (var22.edges != null) {
                  var23 = var22.edges.size();
               } else {
                  log.finer("edge.edges is null");
               }

               var15.width = (var23 - 1) * this.parallelEdgeSpacing;
            }

            var11 += var15.width / 2.0;
            var15.setX(var7, var11);
            var15.setGeneralPurposeVariable(var7, (int)var11);
            var11 += var15.width / 2.0;
            var11 += this.intraCellSpacing;
            if (var11 > this.widestRankValue) {
               this.widestRankValue = var11;
               this.widestRank = var7;
            }

            this.rankWidths[var7] = var11;
         }

         if (var13) {
            log.warning("At least one cell has no bounds");
         }

         this.rankY[var7] = var3;
         double var21 = var8 / 2.0 + var5 / 2.0 + this.interRankCellSpacing;
         var5 = var8;
         if (this.orientation != 1 && this.orientation != 7) {
            var3 -= var21;
         } else {
            var3 += var21;
         }

         for (mxGraphAbstractHierarchyCell var24 : var10) {
            var24.setY(var7, var3);
         }
      }
   }

   protected void minPath(mxGraphHierarchyModel var1) {
      Map var2 = var1.getEdgeMapper();

      for (mxGraphAbstractHierarchyCell var4 : var2.values()) {
         if (var4.maxRank > var4.minRank + 2) {
            int var5 = var4.maxRank - var4.minRank - 1;
            int var6 = var4.getGeneralPurposeVariable(var4.minRank + 1);
            boolean var7 = true;
            int var8 = 0;

            for (int var9 = var4.minRank + 2; var9 < var4.maxRank; var9++) {
               int var10 = var4.getGeneralPurposeVariable(var9);
               if (var6 != var10) {
                  var7 = false;
                  var6 = var10;
               } else {
                  var8++;
               }
            }

            if (!var7) {
               int var18 = 0;
               int var19 = 0;
               double[] var11 = new double[var5 - 1];
               double[] var12 = new double[var5 - 1];
               double var13 = var4.getX(var4.minRank + 1);

               for (int var15 = var4.minRank + 1; var15 < var4.maxRank - 1; var15++) {
                  double var16 = var4.getX(var15 + 1);
                  if (var13 == var16) {
                     var11[var15 - var4.minRank - 1] = var13;
                     var18++;
                  } else if (this.repositionValid(var1, var4, var15 + 1, var13)) {
                     var11[var15 - var4.minRank - 1] = var13;
                     var18++;
                  } else {
                     var11[var15 - var4.minRank - 1] = var16;
                     var13 = var16;
                  }
               }

               var13 = var4.getX(var4.maxRank - 1);

               for (int var21 = var4.maxRank - 1; var21 > var4.minRank + 1; var21--) {
                  double var24 = var4.getX(var21 - 1);
                  if (var13 == var24) {
                     var12[var21 - var4.minRank - 2] = var13;
                     var19++;
                  } else if (this.repositionValid(var1, var4, var21 - 1, var13)) {
                     var12[var21 - var4.minRank - 2] = var13;
                     var19++;
                  } else {
                     var12[var21 - var4.minRank - 2] = var4.getX(var21 - 1);
                     var13 = var24;
                  }
               }

               if (var19 > var8 || var18 > var8) {
                  if (var19 >= var18) {
                     for (int var23 = var4.maxRank - 2; var23 > var4.minRank; var23--) {
                        var4.setX(var23, (int)var12[var23 - var4.minRank - 1]);
                     }
                  } else if (var18 > var19) {
                     for (int var22 = var4.minRank + 2; var22 < var4.maxRank; var22++) {
                        var4.setX(var22, (int)var11[var22 - var4.minRank - 2]);
                     }
                  }
               }
            }
         }
      }
   }

   protected boolean repositionValid(mxGraphHierarchyModel var1, mxGraphAbstractHierarchyCell var2, int var3, double var4) {
      mxGraphHierarchyRank var6 = var1.ranks.get(new Integer(var3));
      mxGraphAbstractHierarchyCell[] var7 = var6.toArray(new mxGraphAbstractHierarchyCell[var6.size()]);
      int var8 = -1;

      for (int var9 = 0; var9 < var7.length; var9++) {
         if (var2 == var7[var9]) {
            var8 = var9;
            break;
         }
      }

      if (var8 < 0) {
         return false;
      }

      int var12 = var2.getGeneralPurposeVariable(var3);
      if (var4 < var12) {
         if (var8 == 0) {
            return true;
         }

         mxGraphAbstractHierarchyCell var13 = var7[var8 - 1];
         int var15 = var13.getGeneralPurposeVariable(var3);
         var15 = var15 + (int)var13.width / 2 + (int)this.intraCellSpacing + (int)var2.width / 2;
         return var15 <= var4;
      } else if (var4 > var12) {
         if (var8 == var7.length - 1) {
            return true;
         }

         mxGraphAbstractHierarchyCell var10 = var7[var8 + 1];
         int var11 = var10.getGeneralPurposeVariable(var3);
         var11 = var11 - (int)var10.width / 2 - (int)this.intraCellSpacing - (int)var2.width / 2;
         return var11 >= var4;
      } else {
         return true;
      }
   }

   protected void setCellLocations(mxGraph var1, mxGraphHierarchyModel var2) {
      this.rankTopY = new double[var2.ranks.size()];
      this.rankBottomY = new double[var2.ranks.size()];

      for (int var3 = 0; var3 < var2.ranks.size(); var3++) {
         this.rankTopY[var3] = Double.MAX_VALUE;
         this.rankBottomY[var3] = -Double.MAX_VALUE;
      }

      HashSet var8 = null;
      if (this.layout.isResizeParent()) {
         var8 = new HashSet();
      }

      Map var4 = var2.getEdgeMapper();
      Map var5 = var2.getVertexMapper();

      for (mxGraphHierarchyNode var7 : var5.values()) {
         this.setVertexLocation(var7);
         if (this.layout.isResizeParent()) {
            var8.add(var1.getModel().getParent(var7.cell));
         }
      }

      if (this.layout.isResizeParent()) {
         this.adjustParents(var8);
      }

      if (this.edgeStyle == mxCoordinateAssignment.HierarchicalEdgeStyle.ORTHOGONAL || this.edgeStyle == mxCoordinateAssignment.HierarchicalEdgeStyle.POLYLINE) {
         this.localEdgeProcessing(var2);
      }

      for (mxGraphAbstractHierarchyCell var10 : var4.values()) {
         this.setEdgePosition(var10);
      }
   }

   protected void adjustParents(Set<Object> var1) {
      this.layout.arrangeGroups(mxUtils.sortCells(var1, true).toArray(), this.groupPadding);
   }

   protected void localEdgeProcessing(mxGraphHierarchyModel var1) {
      Map var2 = var1.getEdgeMapper();
      if (var2 != null && this.jettyPositions.size() != var2.size()) {
         this.jettyPositions = new HashMap<>();
      }

      for (int var3 = 0; var3 < var1.ranks.size(); var3++) {
         for (mxGraphAbstractHierarchyCell var6 : var1.ranks.get(new Integer(var3))) {
            if (var6.isVertex()) {
               mxGraphAbstractHierarchyCell[] var7 = var6.getPreviousLayerConnectedCells(var3)
                  .toArray(new mxGraphAbstractHierarchyCell[var6.getPreviousLayerConnectedCells(var3).size()]);
               int var8 = var3 - 1;

               for (int var9 = 0; var9 < 2; var9++) {
                  if (var8 > -1 && var8 < var1.ranks.size() && var7 != null && var7.length > 0) {
                     mxCoordinateAssignment.WeightedCellSorter[] var10 = new mxCoordinateAssignment.WeightedCellSorter[var7.length];

                     for (int var11 = 0; var11 < var7.length; var11++) {
                        var10[var11] = new mxCoordinateAssignment.WeightedCellSorter(var7[var11], -((int)var7[var11].getX(var8)));
                     }

                     Arrays.sort(var10);
                     mxGraphHierarchyNode var35 = (mxGraphHierarchyNode)var6;
                     double var12 = var35.x[0] - var35.width / 2.0;
                     double var14 = var12 + var35.width;
                     int var16 = 0;
                     int var17 = 0;
                     mxGraphHierarchyEdge[] var18 = new mxGraphHierarchyEdge[var10.length];

                     for (int var19 = 0; var19 < var10.length; var19++) {
                        mxGraphAbstractHierarchyCell var20 = var10[var19].cell;
                        if (!var20.isVertex()) {
                           var16 += ((mxGraphHierarchyEdge)var20).edges.size();
                           var17++;
                           var18[var19] = (mxGraphHierarchyEdge)var20;
                        } else {
                           Collection var21;
                           if (var9 == 0) {
                              var21 = ((mxGraphHierarchyNode)var6).connectsAsSource;
                           } else {
                              var21 = ((mxGraphHierarchyNode)var6).connectsAsTarget;
                           }

                           for (mxGraphHierarchyEdge var23 : var21) {
                              if (var23.source == var20 || var23.target == var20) {
                                 var16 += var23.edges.size();
                                 var17++;
                                 var18[var19] = var23;
                              }
                           }
                        }
                     }

                     double var36 = (var16 + 1) * this.prefHozEdgeSep;
                     if (var6.width > var36 + 2 * this.prefHozEdgeSep) {
                        var12 += this.prefHozEdgeSep;
                        var14 -= this.prefHozEdgeSep;
                     }

                     double var37 = var14 - var12;
                     double var38 = var37 / var16;
                     double var25 = var12 + var38 / 2.0;
                     double var27 = this.minEdgeJetty - this.prefVertEdgeOff;
                     double var29 = 0.0;

                     for (int var31 = 0; var31 < var18.length; var31++) {
                        int var32 = var18[var31].edges.size();
                        double[] var33 = this.jettyPositions.get(var18[var31]);
                        if (var33 == null || var33.length != 4 * var32) {
                           var33 = new double[4 * var32];
                           this.jettyPositions.put(var18[var31], var33);
                        }

                        if (var31 < var16 / 2.0F) {
                           var27 += this.prefVertEdgeOff;
                        } else if (var31 > var16 / 2.0F) {
                           var27 -= this.prefVertEdgeOff;
                        }

                        for (int var34 = 0; var34 < var32; var34++) {
                           var33[var34 * 4 + var9 * 2] = var25;
                           var25 += var38;
                           var33[var34 * 4 + var9 * 2 + 1] = var27;
                        }

                        var29 = Math.max(var29, var27);
                     }
                  }

                  var7 = var6.getNextLayerConnectedCells(var3).toArray(new mxGraphAbstractHierarchyCell[var6.getNextLayerConnectedCells(var3).size()]);
                  var8 = var3 + 1;
               }
            }
         }
      }
   }

   protected void setEdgePosition(mxGraphAbstractHierarchyCell var1) {
      mxGraphHierarchyEdge var2 = (mxGraphHierarchyEdge)var1;
      double var3 = 0.0;
      if (var2.temp[0] != 101207) {
         int var5 = var2.maxRank;
         int var6 = var2.minRank;
         if (var5 == var6) {
            var5 = var2.source.maxRank;
            var6 = var2.target.minRank;
         }

         Iterator var7 = var2.edges.iterator();
         int var8 = 0;
         double[] var9 = this.jettyPositions.get(var2);
         Object var10 = var2.isReversed() ? var2.target.cell : var2.source.cell;
         boolean var11 = this.orientation == 3 || this.orientation == 5;

         while (var7.hasNext()) {
            Object var12 = var7.next();
            Object var13 = this.layout.getGraph().getView().getVisibleTerminal(var12, true);
            ArrayList var14 = new ArrayList(var2.x.length);
            boolean var15 = var2.isReversed();
            if (var13 != var10) {
               var15 = !var15;
            }

            if (var9 != null) {
               int var16 = var15 ? 2 : 0;
               double var17 = var15 ? (var11 ? this.rankBottomY[var6] : this.rankTopY[var6]) : (var11 ? this.rankTopY[var5] : this.rankBottomY[var5]);
               double var19 = var9[var8 * 4 + 1 + var16];
               if (var15 != var11) {
                  var19 = -var19;
               }

               var17 += var19;
               double var21 = var9[var8 * 4 + var16];
               if (this.orientation != 1 && this.orientation != 5) {
                  var14.add(new mxPoint(var17, var21));
               } else {
                  var14.add(new mxPoint(var21, var17));
               }
            }

            int var29 = var2.x.length - 1;
            int var31 = -1;
            byte var18 = -1;
            int var32 = var2.maxRank - 1;
            if (var15) {
               var29 = 0;
               var31 = var2.x.length;
               var18 = 1;
               var32 = var2.minRank + 1;
            }

            for (int var20 = var29; var2.maxRank != var2.minRank && var20 != var31; var20 += var18) {
               double var34 = var2.x[var20] + var3;
               double var23 = (this.rankTopY[var32] + this.rankBottomY[var32 + 1]) / 2.0;
               double var25 = (this.rankTopY[var32 - 1] + this.rankBottomY[var32]) / 2.0;
               if (var15) {
                  double var27 = var23;
                  var23 = var25;
                  var25 = var27;
               }

               if (this.orientation != 1 && this.orientation != 5) {
                  var14.add(new mxPoint(var23, var34));
                  var14.add(new mxPoint(var25, var34));
               } else {
                  var14.add(new mxPoint(var34, var23));
                  var14.add(new mxPoint(var34, var25));
               }

               this.limitX = Math.max(this.limitX, var34);
               var32 += var18;
            }

            if (var9 != null) {
               int var33 = var15 ? 2 : 0;
               double var35 = var15 ? (var11 ? this.rankTopY[var5] : this.rankBottomY[var5]) : (var11 ? this.rankBottomY[var6] : this.rankTopY[var6]);
               double var36 = var9[var8 * 4 + 3 - var33];
               if (var15 != var11) {
                  var36 = -var36;
               }

               double var37 = var35 - var36;
               double var38 = var9[var8 * 4 + 2 - var33];
               if (this.orientation != 1 && this.orientation != 5) {
                  var14.add(new mxPoint(var37, var38));
               } else {
                  var14.add(new mxPoint(var38, var37));
               }
            }

            if (var2.isReversed()) {
               this.processReversedEdge(var2, var12);
            }

            this.layout.setEdgePoints(var12, var14);
            if (var3 == 0.0) {
               var3 = this.parallelEdgeSpacing;
            } else if (var3 > 0.0) {
               var3 = -var3;
            } else {
               var3 = -var3 + this.parallelEdgeSpacing;
            }

            var8++;
         }

         var2.temp[0] = 101207;
      }
   }

   protected void setVertexLocation(mxGraphAbstractHierarchyCell var1) {
      mxGraphHierarchyNode var2 = (mxGraphHierarchyNode)var1;
      Object var3 = var2.cell;
      double var4 = var2.x[0] - var2.width / 2.0;
      double var6 = var2.y[0] - var2.height / 2.0;
      this.rankTopY[var1.minRank] = Math.min(this.rankTopY[var1.minRank], var6);
      this.rankBottomY[var1.minRank] = Math.max(this.rankBottomY[var1.minRank], var6 + var2.height);
      if (this.orientation != 1 && this.orientation != 5) {
         this.layout.setVertexLocation(var3, var6, var4);
      } else {
         this.layout.setVertexLocation(var3, var4, var6);
      }

      this.limitX = Math.max(this.limitX, var4 + var2.width);
   }

   protected void processReversedEdge(mxGraphHierarchyEdge var1, Object var2) {
   }

   public double getInterRankCellSpacing() {
      return this.interRankCellSpacing;
   }

   public void setInterRankCellSpacing(double var1) {
      this.interRankCellSpacing = var1;
   }

   public double getIntraCellSpacing() {
      return this.intraCellSpacing;
   }

   public void setIntraCellSpacing(double var1) {
      this.intraCellSpacing = var1;
   }

   public int getOrientation() {
      return this.orientation;
   }

   public void setOrientation(int var1) {
      this.orientation = var1;
   }

   public double getLimitX() {
      return this.limitX;
   }

   public void setLimitX(double var1) {
      this.limitX = var1;
   }

   public boolean isFineTuning() {
      return this.fineTuning;
   }

   public void setFineTuning(boolean var1) {
      this.fineTuning = var1;
   }

   protected class AreaSpatialCache extends java.awt.geom.Rectangle2D.Double {
      public Set<Object> cells = new HashSet<>();
   }

   enum HierarchicalEdgeStyle {
      ORTHOGONAL,
      POLYLINE,
      STRAIGHT;
   }

   protected class WeightedCellSorter implements Comparable<Object> {
      public int weightedValue = 0;
      public boolean nudge = false;
      public boolean visited = false;
      public int rankIndex;
      public mxGraphAbstractHierarchyCell cell = null;

      public WeightedCellSorter() {
         this(null, 0);
      }

      public WeightedCellSorter(mxGraphAbstractHierarchyCell var2, int var3) {
         this.cell = var2;
         this.weightedValue = var3;
      }

      @Override
      public int compareTo(Object var1) {
         if (var1 instanceof mxCoordinateAssignment.WeightedCellSorter) {
            if (this.weightedValue > ((mxCoordinateAssignment.WeightedCellSorter)var1).weightedValue) {
               return -1;
            }

            if (this.weightedValue < ((mxCoordinateAssignment.WeightedCellSorter)var1).weightedValue) {
               return 1;
            }
         }

         return 0;
      }
   }
}
