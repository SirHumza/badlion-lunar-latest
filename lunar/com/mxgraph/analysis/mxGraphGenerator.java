package com.mxgraph.analysis;

import com.mxgraph.costfunction.mxCostFunction;
import com.mxgraph.costfunction.mxDoubleValCostFunction;
import com.mxgraph.generatorfunction.mxGeneratorFunction;
import com.mxgraph.generatorfunction.mxGeneratorRandomFunction;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mxGraphGenerator {
   private static final Logger log = Logger.getLogger(mxGraphGenerator.class.getName());
   private mxGeneratorFunction generatorFunction = null;
   private mxCostFunction costFunction = null;

   public mxGraphGenerator(mxGeneratorFunction var1, mxCostFunction var2) {
      if (var1 != null) {
         this.generatorFunction = var1;
      }

      if (var2 != null) {
         this.costFunction = var2;
      } else {
         this.costFunction = new mxDoubleValCostFunction();
      }
   }

   public void getNullGraph(mxAnalysisGraph var1, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException();
      }

      mxGraph var3 = var1.getGraph();
      Object var4 = var3.getDefaultParent();

      for (int var5 = 0; var5 < var2; var5++) {
         var3.insertVertex(var4, null, new Integer(var5).toString(), var5 * 50, 0.0, 25.0, 25.0);
      }
   }

   public void getCompleteGraph(mxAnalysisGraph var1, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException();
      }

      mxGraph var3 = var1.getGraph();
      Object var4 = var3.getDefaultParent();
      Object[] var5 = new Object[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var5[var6] = var3.insertVertex(var4, null, new Integer(var6).toString(), var6 * 50, 0.0, 25.0, 25.0);
      }

      for (int var10 = 0; var10 < var2; var10++) {
         Object var7 = var5[var10];

         for (int var8 = 0; var8 < var2; var8++) {
            Object var9 = var5[var8];
            if (var7 != var9 && !mxGraphStructure.areConnected(var1, var7, var9)) {
               var3.insertEdge(var4, null, this.getNewEdgeValue(var1), var7, var9);
            }
         }
      }
   }

   public void getGridGraph(mxAnalysisGraph var1, int var2, int var3) {
      if (var2 >= 0 && var3 >= 0) {
         mxGraph var4 = var1.getGraph();
         Object var5 = var4.getDefaultParent();
         int var6 = var2 * var3;
         Object[] var7 = new Object[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            var7[var8] = var4.insertVertex(var5, null, new Integer(var8).toString(), 0.0, 0.0, 25.0, 25.0);
         }

         int var12 = 0;

         for (int var9 = 0; var9 < var3; var9++) {
            for (int var10 = 0; var10 < var2; var10++) {
               Object var11 = var7[var12];
               if (var10 > 0) {
                  var4.insertEdge(var5, null, this.getNewEdgeValue(var1), var7[var12 - 1], var11);
               }

               if (var9 > 0) {
                  var4.insertEdge(var5, null, this.getNewEdgeValue(var1), var7[var12 - var2], var11);
               }

               var12++;
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void setGridGraphSpacing(mxAnalysisGraph var1, double var2, double var4, int var6, int var7) {
      mxGraph var8 = var1.getGraph();
      if (!(var2 < 0.0) && !(var4 < 0.0) && var6 >= 1 && var7 >= 1) {
         Object var9 = var8.getDefaultParent();
         Object[] var10 = var1.getChildVertices(var9);
         mxIGraphModel var11 = var8.getModel();

         for (int var12 = 0; var12 < var7; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
               Object var14 = var10[var12 * var6 + var13];
               mxGeometry var15 = var11.getGeometry(var14);
               var15.setX(var13 * var2);
               var15.setY(var12 * var4);
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void getBipartiteGraph(mxAnalysisGraph var1, int var2, int var3) {
      if (var2 >= 0 && var3 >= 0) {
         int var4 = var2 + var3;
         mxGraph var5 = var1.getGraph();
         Object var6 = var5.getDefaultParent();
         Object[] var7 = new Object[var4];

         for (int var8 = 0; var8 < var4; var8++) {
            var7[var8] = var5.insertVertex(var6, null, new Integer(var8).toString(), 0.0, 0.0, 25.0, 25.0);
         }

         for (int var12 = 0; var12 < var2; var12++) {
            Object var9 = var7[var12];
            Object var10 = var7[this.getRandomInt(var2, var4 - 1)];
            var5.insertEdge(var6, null, this.getNewEdgeValue(var1), var9, var10);
         }

         for (int var13 = 0; var13 < var3; var13++) {
            Object var14 = var7[var2 + var13];
            int var15 = var1.getOpposites(var1.getEdges(var14, null, true, true, false, true), var14, true, true).length;
            if (var15 == 0) {
               Object var11 = var7[this.getRandomInt(0, var2 - 1)];
               var5.insertEdge(var6, null, this.getNewEdgeValue(var1), var14, var11);
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void setBipartiteGraphSpacing(mxAnalysisGraph var1, int var2, int var3, double var4, double var6) {
      if (var2 >= 0 && var3 >= 0) {
         mxGraph var8 = var1.getGraph();
         double var9 = 0.0;
         double var11 = 0.0;
         Object var13 = var8.getDefaultParent();
         mxIGraphModel var14 = var8.getModel();
         if (var2 < var3) {
            double var15 = var3 * var4;
            var9 = (var15 - var2 * var4) / 2.0;
         } else {
            double var19 = var2 * var4;
            var11 = (var19 - var3 * var4) / 2.0;
         }

         Object[] var20 = var1.getChildVertices(var13);

         for (int var16 = 0; var16 < var2; var16++) {
            Object var17 = var20[var16];
            mxGeometry var18 = var14.getGeometry(var17);
            var18.setX(0.0);
            var18.setY(var9 + var16 * var4);
         }

         for (int var21 = var2; var21 < var2 + var3; var21++) {
            Object var22 = var20[var21];
            mxGeometry var23 = var14.getGeometry(var22);
            var23.setX(var6);
            var23.setY(var11 + (var21 - var2) * var4);
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void getCompleteBipartiteGraph(mxAnalysisGraph var1, int var2, int var3) {
      if (var2 >= 0 && var3 >= 0) {
         int var4 = var2 + var3;
         mxGraph var5 = var1.getGraph();
         Object var6 = var5.getDefaultParent();
         Object[] var7 = new Object[var4];

         for (int var8 = 0; var8 < var4; var8++) {
            var7[var8] = var5.insertVertex(var6, null, new Integer(var8).toString(), 0.0, 0.0, 25.0, 25.0);
         }

         for (int var12 = 0; var12 < var2; var12++) {
            for (int var9 = var2; var9 < var4; var9++) {
               Object var10 = var7[var12];
               Object var11 = var7[var9];
               var5.insertEdge(var6, null, this.getNewEdgeValue(var1), var10, var11);
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void getKnightGraph(mxAnalysisGraph var1, int var2, int var3) {
      if (var2 >= 3 && var3 >= 3) {
         int var4 = var2 * var3;
         mxGraph var5 = var1.getGraph();
         Object var6 = var5.getDefaultParent();
         Object[] var7 = new Object[var4];

         for (int var8 = 0; var8 < var4; var8++) {
            var7[var8] = var5.insertVertex(var6, null, new Integer(var8).toString(), 0.0, 0.0, 25.0, 25.0);
         }

         int[] var12 = new int[2];

         for (int var9 = 0; var9 < var2 * var3; var9++) {
            var12 = this.getVertexGridCoords(var2, var3, var9);
            Object[] var10 = this.getKnightMoveVertexes(var1, var2, var3, var12[0], var12[1]);

            for (int var11 = 0; var11 < var10.length; var11++) {
               if (!mxGraphStructure.areConnected(var1, var7[var9], var10[var11])) {
                  var5.insertEdge(var6, null, this.getNewEdgeValue(var1), var7[var9], var10[var11]);
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Object[] getKnightMoveVertexes(mxAnalysisGraph var1, int var2, int var3, int var4, int var5) {
      if (var4 <= var2 && var5 <= var3 && var2 >= 1 && var3 >= 1 && var4 >= 1 && var5 >= 1) {
         mxGraph var6 = var1.getGraph();
         Object[] var7 = var1.getChildVertices(var6.getDefaultParent());
         int var8 = var4 + 1;
         int var9 = var5 - 2;
         ArrayList var10 = new ArrayList();
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var11 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var11);
         }

         var8 = var4 + 2;
         var9 = var5 - 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var26 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var26);
         }

         var8 = var4 + 2;
         var9 = var5 + 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var27 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var27);
         }

         var8 = var4 + 1;
         var9 = var5 + 2;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var28 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var28);
         }

         var8 = var4 - 1;
         var9 = var5 + 2;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var29 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var29);
         }

         var8 = var4 - 2;
         var9 = var5 + 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var30 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var30);
         }

         var8 = var4 - 2;
         var9 = var5 - 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var31 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var31);
         }

         var8 = var4 - 1;
         var9 = var5 - 2;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var32 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var32);
         }

         return var10.toArray();
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int[] getVertexGridCoords(int var1, int var2, int var3) {
      if (var3 <= var2 * var1 - 1 && var1 >= 0 && var2 >= 0 && var3 >= 0) {
         int var4 = (int)Math.floor(var3 / var1);
         int var5 = var3 - var4 * var1 + 1;
         return new int[]{var5, ++var4};
      } else {
         throw new IllegalArgumentException();
      }
   }

   private Object getVertexFromGrid(Object[] var1, int var2, int var3, int var4, int var5) {
      if (var4 <= var2 && var5 <= var3 && var2 >= 1 && var3 >= 1 && var4 >= 1 && var5 >= 1) {
         int var6 = (var5 - 1) * var2 + var4 - 1;
         return var1[var6];
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void getKingGraph(mxAnalysisGraph var1, int var2, int var3) {
      if (var2 >= 2 && var3 >= 2) {
         int var4 = var2 * var3;
         mxGraph var5 = var1.getGraph();
         Object var6 = var5.getDefaultParent();
         Object[] var7 = new Object[var4];

         for (int var8 = 0; var8 < var4; var8++) {
            var7[var8] = var5.insertVertex(var6, null, new Integer(var8).toString(), 0.0, 0.0, 25.0, 25.0);
         }

         int[] var12 = new int[2];

         for (int var9 = 0; var9 < var2 * var3; var9++) {
            var12 = this.getVertexGridCoords(var2, var3, var9);
            Object[] var10 = this.getKingMoveVertexes(var1, var2, var3, var12[0], var12[1]);

            for (int var11 = 0; var11 < var10.length; var11++) {
               if (!mxGraphStructure.areConnected(var1, var7[var9], var10[var11])) {
                  var5.insertEdge(var6, null, this.getNewEdgeValue(var1), var7[var9], var10[var11]);
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Object[] getKingMoveVertexes(mxAnalysisGraph var1, int var2, int var3, int var4, int var5) {
      if (var2 >= 0 && var3 >= 0 && var4 >= 0 && var5 >= 0) {
         mxGraph var6 = var1.getGraph();
         Object[] var7 = var1.getChildVertices(var6.getDefaultParent());
         int var8 = var4 + 1;
         int var9 = var5 - 1;
         ArrayList var10 = new ArrayList();
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var11 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var11);
         }

         var8 = var4 + 1;
         var9 = var5;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var26 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var26);
         }

         var8 = var4 + 1;
         var9 = var5 + 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var27 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var27);
         }

         var8 = var4;
         var9 = var5 + 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var28 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var28);
         }

         var8 = var4 - 1;
         var9 = var5 + 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var29 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var29);
         }

         var8 = var4 - 1;
         var9 = var5;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var30 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var30);
         }

         var8 = var4 - 1;
         var9 = var5 + 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var31 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var31);
         }

         var8 = var4;
         var9 = var5 - 1;
         if (var8 > 0 && var8 <= var2 && var9 > 0 && var9 <= var3) {
            Object var32 = this.getVertexFromGrid(var7, var2, var3, var8, var9);
            var10.add(var32);
         }

         return var10.toArray();
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void getPetersenGraph(mxAnalysisGraph var1) {
      mxGraph var2 = var1.getGraph();
      Object var3 = var2.getDefaultParent();
      Object[] var4 = new Object[10];

      for (int var5 = 0; var5 < 10; var5++) {
         var4[var5] = var2.insertVertex(var3, null, new Integer(var5).toString(), 0.0, 0.0, 25.0, 25.0);
      }

      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[0], var4[2]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[0], var4[8]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[0], var4[9]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[1], var4[2]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[1], var4[5]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[1], var4[7]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[2], var4[4]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[3], var4[4]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[3], var4[7]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[3], var4[9]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[4], var4[6]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[5], var4[6]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[5], var4[9]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[6], var4[8]);
      var2.insertEdge(var3, null, this.getNewEdgeValue(var1), var4[7], var4[8]);
   }

   public void getPathGraph(mxAnalysisGraph var1, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException();
      }

      mxGraph var3 = var1.getGraph();
      Object var4 = var3.getDefaultParent();
      Object[] var5 = new Object[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var5[var6] = var3.insertVertex(var4, null, new Integer(var6).toString(), 0.0, 0.0, 25.0, 25.0);
      }

      for (int var7 = 0; var7 < var2 - 1; var7++) {
         var3.insertEdge(var4, null, this.getNewEdgeValue(var1), var5[var7], var5[var7 + 1]);
      }
   }

   public void setPathGraphSpacing(mxAnalysisGraph var1, double var2) {
      if (var2 < 0.0) {
         throw new IllegalArgumentException();
      }

      mxGraph var4 = var1.getGraph();
      Object var5 = var4.getDefaultParent();
      Object[] var6 = var1.getChildVertices(var5);
      mxIGraphModel var7 = var4.getModel();

      for (int var8 = 0; var8 < var6.length; var8++) {
         Object var9 = var6[var8];
         mxGeometry var10 = var7.getGeometry(var9);
         var10.setX(0.0);
         var10.setY(var8 * var2);
      }
   }

   public void getStarGraph(mxAnalysisGraph var1, int var2) {
      if (var2 < 4) {
         throw new IllegalArgumentException();
      }

      mxGraph var3 = var1.getGraph();
      Object var4 = var3.getDefaultParent();
      Object[] var5 = new Object[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var5[var6] = var3.insertVertex(var4, null, new Integer(var6).toString(), 0.0, 0.0, 25.0, 25.0);
      }

      int var8 = var2 - 1;

      for (int var7 = 0; var7 < var8; var7++) {
         var3.insertEdge(var4, null, this.getNewEdgeValue(var1), var5[var8], var5[var7]);
      }
   }

   public void setStarGraphLayout(mxAnalysisGraph var1, double var2) {
      if (var2 < 4.0) {
         throw new IllegalArgumentException();
      }

      mxGraph var4 = var1.getGraph();
      Object var5 = var4.getDefaultParent();
      Object[] var6 = var1.getChildVertices(var5);
      mxIGraphModel var7 = var4.getModel();
      int var8 = var6.length;
      double var9 = var2 / 2.0;
      double var11 = var9;
      int var13 = var8 - 1;

      for (int var14 = 0; var14 < var13; var14++) {
         double var15 = 0.0;
         double var17 = 0.0;
         double var19 = (double)var14 / var13;
         var19 *= 2.0;
         var19 *= Math.PI;
         var15 = Math.round(var9 + Math.round(var2 * Math.sin(var19) / 2.0));
         var17 = Math.round(var11 - Math.round(var2 * Math.cos(var19) / 2.0));
         Object var21 = var6[var14];
         mxGeometry var22 = var7.getGeometry(var21);
         var22.setX(var15);
         var22.setY(var17);
      }

      mxGeometry var23 = var7.getGeometry(var6[var8 - 1]);
      var23.setX(var9);
      var23.setY(var11);
   }

   public void getWheelGraph(mxAnalysisGraph var1, int var2) {
      if (var2 < 4) {
         throw new IllegalArgumentException();
      }

      mxGraph var3 = var1.getGraph();
      Object var4 = var3.getDefaultParent();
      Object[] var5 = new Object[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var5[var6] = var3.insertVertex(var4, null, new Integer(var6).toString(), 0.0, 0.0, 25.0, 25.0);
      }

      int var8 = var2 - 1;

      for (int var7 = 0; var7 < var8; var7++) {
         var3.insertEdge(var4, null, this.getNewEdgeValue(var1), var5[var8], var5[var7]);
         if (var7 < var8 - 1) {
            var3.insertEdge(var4, null, this.getNewEdgeValue(var1), var5[var7], var5[var7 + 1]);
         } else {
            var3.insertEdge(var4, null, this.getNewEdgeValue(var1), var5[var7], var5[0]);
         }
      }
   }

   public void getFriendshipWindmillGraph(mxAnalysisGraph var1, int var2, int var3) {
      if (var2 >= 2 && var3 >= 2) {
         mxGraph var4 = var1.getGraph();
         Object var5 = var4.getDefaultParent();
         int var6 = var2 * var3 + 1;
         Object[] var7 = new Object[var6];
         int var8 = 0;

         for (int var9 = 0; var9 < var2; var9++) {
            for (int var10 = 0; var10 < var3; var10++) {
               var7[var8] = var4.insertVertex(var5, null, new Integer(var8).toString(), 0.0, 0.0, 25.0, 25.0);
               var8++;
            }
         }

         var7[var6 - 1] = var4.insertVertex(var5, null, new Integer(var6 - 1).toString(), 0.0, 0.0, 25.0, 25.0);

         for (int var13 = 0; var13 < var2; var13++) {
            Object var14 = var7[var6 - 1];

            for (int var11 = 0; var11 < var3; var11++) {
               Object var12 = var7[var13 * var3 + var11];
               var4.insertEdge(var5, null, this.getNewEdgeValue(var1), var14, var12);
               var14 = var12;
            }

            Object var15 = var7[var6 - 1];
            var4.insertEdge(var5, null, this.getNewEdgeValue(var1), var14, var15);
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void getWindmillGraph(mxAnalysisGraph var1, int var2, int var3) {
      if (var2 >= 2 && var3 >= 2) {
         mxGraph var4 = var1.getGraph();
         Object var5 = var4.getDefaultParent();
         int var6 = var2 * var3 + 1;
         Object[] var7 = new Object[var6];
         int var8 = 0;

         for (int var9 = 0; var9 < var2; var9++) {
            for (int var10 = 0; var10 < var3; var10++) {
               var7[var8] = var4.insertVertex(var5, null, new Integer(var8).toString(), 0.0, 0.0, 25.0, 25.0);
               var8++;
            }
         }

         var7[var6 - 1] = var4.insertVertex(var5, null, new Integer(var6 - 1).toString(), 0.0, 0.0, 25.0, 25.0);
         Object var15 = var7[var6 - 1];

         for (int var16 = 0; var16 < var2; var16++) {
            for (int var11 = 0; var11 < var3; var11++) {
               Object var12 = var7[var16 * var3 + var11];
               if (!mxGraphStructure.areConnected(var1, var15, var12)) {
                  var4.insertEdge(var5, null, this.getNewEdgeValue(var1), var15, var12);
               }

               for (int var13 = 0; var13 < var3; var13++) {
                  Object var14 = var7[var16 * var3 + var13];
                  if (var11 != var13 && !mxGraphStructure.areConnected(var1, var12, var14)) {
                     var4.insertEdge(var5, null, this.getNewEdgeValue(var1), var12, var14);
                  }
               }
            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void setWindmillGraphLayout(mxAnalysisGraph var1, int var2, int var3, double var4) {
      if (!(var4 < 0.0) && var2 >= 2 && var3 >= 1) {
         mxGraph var6 = var1.getGraph();
         Object var7 = var6.getDefaultParent();
         Object[] var8 = var1.getChildVertices(var7);
         mxIGraphModel var9 = var6.getModel();
         int var10 = var8.length;
         double var11 = var4 / 2.0;
         double var13 = var11;
         boolean var15 = var3 % 2 == 0;
         int var16 = (int)Math.ceil(var3 / 2.0F);

         for (int var17 = 0; var17 < var2; var17++) {
            for (int var18 = 0; var18 < var3; var18++) {
               double var19 = this.getRingSize(var18 + 1, var3, var4);
               double var21 = 0.0;
               double var23 = 0.0;
               int var25 = 0;
               double var26 = 0.0;
               var25 = var2;
               if (var15 && var18 == var16 - 1) {
                  var26 = (var17 - 5.0E-4F * var4 / Math.pow(var3, 1.0)) / var25;
               } else if (var15 && var18 == var16) {
                  var26 = (var17 + 5.0E-4F * var4 / Math.pow(var3, 1.0)) / var25;
               } else if (!var15 && var19 == var4) {
                  var26 = (double)var17 / var25;
               } else if (var18 + 1 < var16) {
                  var26 = (var17 - 1.0 / Math.pow(var19, 0.25) + 1.5E-13F * Math.pow(var19, 4.0)) / var25;
               } else {
                  var26 = (var17 + 1.0 / Math.pow(var19, 0.25) - 1.5E-13F * Math.pow(var19, 4.0)) / var25;
               }

               var26 *= 2.0;
               var26 *= Math.PI;
               var21 = Math.round(var11 + Math.round(var19 * Math.sin(var26) / 2.0));
               var23 = Math.round(var13 - Math.round(var19 * Math.cos(var26) / 2.0));
               int var28 = var17 * var3 + var18;
               Object var29 = var8[var28];
               mxGeometry var30 = var9.getGeometry(var29);
               var30.setX(var21);
               var30.setY(var23);
            }
         }

         Object var31 = var8[var10 - 1];
         mxGeometry var32 = var9.getGeometry(var31);
         var32.setX(var11);
         var32.setY(var13);
      } else {
         throw new IllegalArgumentException();
      }
   }

   private double getRingSize(int var1, int var2, double var3) {
      if (var1 >= 1 && var1 <= var2 && var2 >= 1 && !(var3 < 0.0)) {
         int var5 = 0;
         boolean var6 = var2 % 2 == 0;
         var5 = (int)Math.ceil(var2 / 2.0F);
         if (var1 != var5 && (!var6 || var1 != var5 + 1)) {
            if (var1 >= var5) {
               var1 = var2 - var1 + 1;
            }

            return (float)Math.pow(var1, 0.75) / (float)Math.pow(var5, 0.75) * var3;
         } else {
            return var3;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void getSimpleRandomGraph(mxAnalysisGraph var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      mxGraph var7 = var1.getGraph();
      Object var8 = var7.getDefaultParent();
      Object[] var9 = new Object[var2];

      for (int var10 = 0; var10 < var2; var10++) {
         var9[var10] = var7.insertVertex(var8, null, new Integer(var10).toString(), 0.0, 0.0, 25.0, 25.0);
      }

      for (int var14 = 0; var14 < var3; var14++) {
         boolean var11 = true;

         Object var12;
         Object var13;
         do {
            var11 = true;
            var12 = var9[(int)Math.round(Math.random() * (var9.length - 1))];
            var13 = var9[(int)Math.round(Math.random() * (var9.length - 1))];
            if (!var4 && var12.equals(var13)) {
               var11 = false;
            } else if (!var5 && mxGraphStructure.areConnected(var1, var12, var13)) {
               var11 = false;
            }
         } while (!var11);

         var7.insertEdge(var8, null, this.getNewEdgeValue(var1), var12, var13);
      }

      if (var6) {
         mxGraphStructure.makeConnected(var1);
      }
   }

   public void getSimpleRandomTree(mxAnalysisGraph var1, int var2) {
      int var3 = Math.round(var2 * 2);
      this.getSimpleRandomGraph(var1, var2, var3, false, false, true);
      Object[] var4 = var1.getChildVertices(var1.getGraph().getDefaultParent());

      try {
         this.oneSpanningTree(var1, true, true);
      } catch (StructuralException var7) {
         log.log(Level.SEVERE, "Failed to generate a random tree graph", var7);
      }

      try {
         mxGraphStructure.makeTreeDirected(var1, var4[(int)Math.round(Math.random() * (var4.length - 1))]);
      } catch (StructuralException var6) {
         log.log(Level.SEVERE, "Failed to generate a random tree graph", var6);
      }
   }

   public Double getNewEdgeValue(mxAnalysisGraph var1) {
      if (this.getGeneratorFunction() != null) {
         mxGraph var2 = var1.getGraph();
         return this.getGeneratorFunction().getCost(var2.getView().getState(var2.getDefaultParent()));
      } else {
         return null;
      }
   }

   public static mxGeneratorFunction getGeneratorFunction(mxGraph var0, boolean var1, double var2, double var4) {
      return var1 ? new mxGeneratorRandomFunction(var2, var4, 2) : null;
   }

   public mxGeneratorFunction getGeneratorFunction() {
      return this.generatorFunction;
   }

   public int getRandomInt(int var1, int var2) {
      if (var1 == var2) {
         return var1;
      }

      if (var1 > var2) {
         int var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      boolean var4 = false;
      return var1 + (int)Math.round(Math.random() * (var2 - var1));
   }

   public void oneSpanningTree(mxAnalysisGraph var1, boolean var2, boolean var3) {
      mxGraph var4 = var1.getGraph();
      boolean var5 = mxGraphStructure.isSimple(var1);
      boolean var6 = mxGraphStructure.isConnected(var1);
      if (!var5) {
         if (!var3) {
            throw new StructuralException("Graph is not simple.");
         }

         mxGraphStructure.makeSimple(var1);
      }

      if (!var6) {
         if (!var2) {
            throw new StructuralException("Graph is not connected.");
         }

         mxGraphStructure.makeConnected(var1);
      }

      for (Object var10 : var1.getChildEdges(var4.getDefaultParent())) {
         var4.removeCells(new Object[]{var10});
         if (!mxGraphStructure.isConnected(var1)) {
            var4.addCell(var10);
         }
      }
   }

   public void getKnightTour(mxAnalysisGraph var1, int var2, int var3, int var4) {
      if (var2 >= 5 && var3 >= 5) {
         ArrayList var5 = new ArrayList();
         int var6 = var2 * var3;
         mxGraph var7 = var1.getGraph();
         Object var8 = var7.getDefaultParent();
         int var9 = 0;

         for (int var10 = 0; var10 < var6; var10++) {
            var7.insertVertex(var8, null, new Integer(var9).toString(), 0.0, 0.0, 25.0, 25.0);
            var9++;
         }

         Object[] var17 = var1.getChildVertices(var8);
         int[] var12 = new int[2];
         Object var13 = var17[var4];
         var12 = this.getVertexGridCoords(var2, var3, var4);
         var5.add(var13);
         Object var14 = this.getNextKnightMove(var1, var2, var3, var12[0], var12[1], var5);
         mxCostFunction var15 = var1.getGenerator().getCostFunction();
         mxGraphView var16 = var7.getView();

         while (var14 != null) {
            var7.insertEdge(var8, null, null, var13, var14);
            var5.add(var14);
            int var11 = (int)var15.getCost(new mxCellState(var16, var14, null));
            var12 = this.getVertexGridCoords(var2, var3, var11);
            var13 = var14;
            var14 = this.getNextKnightMove(var1, var2, var3, var12[0], var12[1], var5);
         }

         if (var5.size() < var6) {
            throw new StructuralException("Could not generate a correct Knight tour with size " + var2 + " x " + var3 + ".");
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   private Object getNextKnightMove(mxAnalysisGraph var1, int var2, int var3, int var4, int var5, ArrayList<Object> var6) {
      Object[] var7 = this.getKnightMoveVertexes(var1, var2, var3, var4, var5);
      int var8 = 9;
      float var9 = 0.0F;
      Object var10 = null;
      mxCostFunction var11 = var1.getGenerator().getCostFunction();
      mxGraphView var12 = var1.getGraph().getView();

      for (int var13 = 0; var13 < var7.length; var13++) {
         int var14 = (int)var11.getCost(new mxCellState(var12, var7[var13], null));
         int[] var15 = this.getVertexGridCoords(var2, var3, var14);
         int var16 = this.getPossibleKnightMoveCount(var1, var2, var3, var15[0], var15[1]);
         float var17 = this.getDistanceFromGridCenter(var2, var3, var14);
         if ((var16 < var8 || var16 == var8 && var17 > var9) && !var6.contains(var7[var13])) {
            var9 = var17;
            var8 = var16;
            var10 = var7[var13];
         }
      }

      return var10;
   }

   private int getPossibleKnightMoveCount(mxAnalysisGraph var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 + 1;
      int var7 = var5 - 2;
      int var8 = 0;
      Object var9 = var1.getGraph().getDefaultParent();
      Object[] var10 = var1.getChildVertices(var9);
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      var6 = var4 + 2;
      var7 = var5 - 1;
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      var6 = var4 + 2;
      var7 = var5 + 1;
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      var6 = var4 + 1;
      var7 = var5 + 2;
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      var6 = var4 - 1;
      var7 = var5 + 2;
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      var6 = var4 - 2;
      var7 = var5 + 1;
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      var6 = var4 - 2;
      var7 = var5 - 1;
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      var6 = var4 - 1;
      var7 = var5 - 2;
      if (var6 > 0
         && var6 <= var2
         && var7 > 0
         && var7 <= var3
         && var1.getEdges(this.getVertexFromGrid(var10, var2, var3, var6, var7), var9, false, true).length == 0) {
         var8++;
      }

      return var8;
   }

   private float getDistanceFromGridCenter(int var1, int var2, int var3) {
      float var4 = (var1 + 1) / 2.0F;
      float var5 = (var2 + 1) / 2.0F;
      int[] var6 = this.getVertexGridCoords(var1, var2, var3);
      float var7 = Math.abs(var4 - var6[0]);
      float var8 = Math.abs(var5 - var6[1]);
      return (float)Math.sqrt(var7 * var7 + var8 * var8);
   }

   public mxCostFunction getCostFunction() {
      return this.costFunction;
   }

   public void setCostFunction(mxCostFunction var1) {
      this.costFunction = var1;
   }
}
