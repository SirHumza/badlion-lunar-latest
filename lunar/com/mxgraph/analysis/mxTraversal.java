package com.mxgraph.analysis;

import com.mxgraph.costfunction.mxCostFunction;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mxTraversal {
   public static void dfs(mxAnalysisGraph var0, Object var1, mxGraph.mxICellVisitor var2) {
      dfsRec(var0, var1, null, new HashSet<>(), var2);
   }

   private static void dfsRec(mxAnalysisGraph var0, Object var1, Object var2, Set<Object> var3, mxGraph.mxICellVisitor var4) {
      if (var1 != null && !var3.contains(var1)) {
         var4.visit(var1, var2);
         var3.add(var1);
         Object[] var5 = var0.getEdges(var1, null, false, true);
         Object[] var6 = var0.getOpposites(var5, var1);

         for (int var7 = 0; var7 < var6.length; var7++) {
            dfsRec(var0, var6[var7], var5[var7], var3, var4);
         }
      }
   }

   public static void bfs(mxAnalysisGraph var0, Object var1, mxGraph.mxICellVisitor var2) {
      if (var0 != null && var1 != null && var2 != null) {
         HashSet var3 = new HashSet();
         LinkedList var4 = new LinkedList();
         Object[] var5 = new Object[]{var1, null};
         var4.addLast(var5);
         var3.add(var1);
         bfsRec(var0, var3, var4, var2);
      }
   }

   private static void bfsRec(mxAnalysisGraph var0, Set<Object> var1, LinkedList<Object[]> var2, mxGraph.mxICellVisitor var3) {
      if (var2.size() > 0) {
         Object[] var4 = (Object[])var2.removeFirst();
         Object var5 = var4[0];
         Object var6 = var4[1];
         var3.visit(var5, var6);
         Object[] var7 = var0.getEdges(var5, null, false, false);

         for (int var8 = 0; var8 < var7.length; var8++) {
            Object[] var9 = new Object[]{var7[var8]};
            Object var10 = var0.getOpposites(var9, var5)[0];
            if (!var1.contains(var10)) {
               Object[] var11 = new Object[]{var10, var7[var8]};
               var2.addLast(var11);
               var1.add(var10);
            }
         }

         bfsRec(var0, var1, var2, var3);
      }
   }

   public static void dijkstra(mxAnalysisGraph var0, Object var1, Object var2, mxGraph.mxICellVisitor var3) {
      if (!mxGraphStructure.isConnected(var0)) {
         throw new StructuralException("The current Dijkstra algorithm only works for connected graphs and this graph isn't connected");
      }

      Object var4 = var0.getGraph().getDefaultParent();
      Object[] var5 = var0.getChildVertices(var4);
      int var6 = var5.length;
      double[] var7 = new double[var6];
      Object[][] var8 = new Object[var6][2];
      ArrayList var9 = new ArrayList();
      ArrayList var10 = new ArrayList();

      for (int var11 = 0; var11 < var6; var11++) {
         var7[var11] = 2.147483647E9;
         var9.add(var5[var11]);
         var10.add(var5[var11]);
      }

      var7[var10.indexOf(var1)] = 0.0;
      mxCostFunction var33 = var0.getGenerator().getCostFunction();
      mxGraphView var12 = var0.getGraph().getView();

      while (var9.size() > 0) {
         Object var15 = var9.get(0);
         int var17 = var10.indexOf(var15);
         double var18 = var7[var17];
         double var13 = var18;
         Object var16 = var15;
         if (var9.size() > 1) {
            for (int var20 = 1; var20 < var9.size(); var20++) {
               var15 = var9.get(var20);
               var17 = var10.indexOf(var15);
               var18 = var7[var17];
               if (var18 < var13) {
                  var13 = var18;
                  var16 = var15;
               }
            }
         }

         var9.remove(var16);
         new Object();
         Object[] var21 = var0.getOpposites(var0.getEdges(var16, null, true, true, false, true), var16, true, true);

         for (int var22 = 0; var22 < var21.length; var22++) {
            Object var23 = var21[var22];
            if (var9.contains(var23)) {
               Object[] var24 = var0.getEdges(var23, null, true, true, false, true);
               Object var25 = null;

               for (int var26 = 0; var26 < var24.length; var26++) {
                  Object var40 = var24[var26];
                  if (var0.getTerminal(var40, true).equals(var16) || var0.getTerminal(var40, false).equals(var16)) {
                     var25 = var40;
                  }
               }

               int var41 = var10.indexOf(var23);
               double var27 = var7[var41];
               double var29 = var33.getCost(new mxCellState(var12, var25, null));
               double var31 = var13 + var29;
               if (var31 < var27) {
                  var7[var41] = var31;
                  var8[var41][0] = var16;
                  var8[var41][1] = var25;
               }
            }
         }
      }

      ArrayList var34 = new ArrayList();
      Object var14 = var2;

      while (var14 != var1) {
         int var36 = var10.indexOf(var14);
         var14 = var8[var36][0];
         var34.add(0, var8[var36]);
      }

      var34.add(var34.size(), new Object[]{var2, null});

      for (int var37 = 0; var37 < var34.size(); var37++) {
         var3.visit(((Object[])var34.get(var37))[0], ((Object[])var34.get(var37))[1]);
      }
   }

   public static List<Map<Object, Object>> bellmanFord(mxAnalysisGraph var0, Object var1) {
      mxGraph var2 = var0.getGraph();
      Object[] var3 = var0.getChildVertices(var2.getDefaultParent());
      Object[] var4 = var0.getChildEdges(var2.getDefaultParent());
      int var5 = var3.length;
      int var6 = var4.length;
      HashMap var7 = new HashMap();
      HashMap var8 = new HashMap();
      mxCostFunction var9 = var0.getGenerator().getCostFunction();
      mxGraphView var10 = var2.getView();

      for (int var11 = 0; var11 < var5; var11++) {
         Object var12 = var3[var11];
         var7.put(var12, Double.MAX_VALUE);
      }

      var7.put(var1, 0.0);
      var8.put(var1, var1);

      for (int var18 = 0; var18 < var5; var18++) {
         for (int var21 = 0; var21 < var6; var21++) {
            Object var13 = var4[var21];
            Object var14 = var0.getTerminal(var13, true);
            Object var15 = var0.getTerminal(var13, false);
            double var16 = (Double)var7.get(var14) + var9.getCost(new mxCellState(var10, var13, null));
            if (var16 < (Double)var7.get(var15)) {
               var7.put(var15, var16);
               var8.put(var15, var14);
            }

            if (!mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED)) {
               var16 = (Double)var7.get(var15) + var9.getCost(new mxCellState(var10, var13, null));
               if (var16 < (Double)var7.get(var14)) {
                  var7.put(var14, var16);
                  var8.put(var14, var15);
               }
            }
         }
      }

      for (int var19 = 0; var19 < var6; var19++) {
         Object var22 = var4[var19];
         Object var23 = var0.getTerminal(var22, true);
         Object var24 = var0.getTerminal(var22, false);
         double var25 = (Double)var7.get(var23) + var9.getCost(new mxCellState(var10, var22, null));
         if (var25 < (Double)var7.get(var24)) {
            throw new StructuralException("The graph contains a negative cycle, so Bellman-Ford can't be completed.");
         }
      }

      ArrayList var20 = new ArrayList();
      var20.add(var7);
      var20.add(var8);
      return var20;
   }

   public static ArrayList<Object[][]> floydRoyWarshall(mxAnalysisGraph var0) {
      Object[] var1 = var0.getChildVertices(var0.getGraph().getDefaultParent());
      Double[][] var2 = new Double[var1.length][var1.length];
      Object[][] var3 = new Object[var1.length][var1.length];
      HashMap var4 = new HashMap();

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4.put(var1[var5], var5);
      }

      Object[] var10 = var0.getChildEdges(var0.getGraph().getDefaultParent());
      var2 = initializeWeight(var0, var1, var10, var4);

      for (int var6 = 0; var6 < var1.length; var6++) {
         for (int var7 = 0; var7 < var1.length; var7++) {
            for (int var8 = 0; var8 < var1.length; var8++) {
               if (var2[var7][var8] > var2[var7][var6] + var2[var6][var8]) {
                  var3[var7][var8] = mxGraphStructure.getVertexWithValue(var0, var6);
                  var2[var7][var8] = var2[var7][var6] + var2[var6][var8];
               }
            }
         }
      }

      for (int var11 = 0; var11 < var2[0].length; var11++) {
         if (var2[var11][var11] < 0.0) {
            throw new StructuralException("The graph has negative cycles");
         }
      }

      ArrayList var12 = new ArrayList();
      var12.add(var2);
      var12.add(var3);
      return var12;
   }

   private static Double[][] initializeWeight(mxAnalysisGraph var0, Object[] var1, Object[] var2, Map<Object, Integer> var3) {
      Double[][] var4 = new Double[var1.length][var1.length];

      for (int var5 = 0; var5 < var1.length; var5++) {
         Arrays.fill(var4[var5], Double.valueOf(Double.MAX_VALUE));
      }

      boolean var14 = mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED);
      mxCostFunction var6 = var0.getGenerator().getCostFunction();
      mxGraphView var7 = var0.getGraph().getView();

      for (Object var11 : var2) {
         Object var12 = var0.getTerminal(var11, true);
         Object var13 = var0.getTerminal(var11, false);
         var4[var3.get(var12)][var3.get(var13)] = var6.getCost(var7.getState(var11));
         if (!var14) {
            var4[var3.get(var13)][var3.get(var12)] = var6.getCost(var7.getState(var11));
         }
      }

      for (int var15 = 0; var15 < var1.length; var15++) {
         var4[var15][var15] = 0.0;
      }

      return var4;
   }

   public static Object[] getWFIPath(mxAnalysisGraph var0, ArrayList<Object[][]> var1, Object var2, Object var3) {
      Object[][] var4 = (Object[][])var1.get(0);
      Object[][] var5 = (Object[][])var1.get(1);
      ArrayList var6 = null;
      if (var0 != null && var5 != null && var2 != null && var3 != null) {
         for (int var7 = 0; var7 < var4[0].length; var7++) {
            if ((Double)var4[var7][var7] < 0.0) {
               throw new StructuralException("The graph has negative cycles");
            }
         }

         if (var2 != var3) {
            mxCostFunction var10 = var0.getGenerator().getCostFunction();
            mxGraphView var8 = var0.getGraph().getView();
            ArrayList var9 = new ArrayList();
            var9.add(var2);

            while (var2 != var3) {
               var6 = getWFIPathRec(var0, var5, var2, var3, var9, var10, var8);
               var2 = var6.get(var6.size() - 1);
            }
         }

         if (var6 == null) {
            var6 = new ArrayList();
         }

         return var6.toArray();
      } else {
         throw new IllegalArgumentException();
      }
   }

   private static ArrayList<Object> getWFIPathRec(
      mxAnalysisGraph var0, Object[][] var1, Object var2, Object var3, ArrayList<Object> var4, mxCostFunction var5, mxGraphView var6
   ) {
      Double var7 = var5.getCost(var6.getState(var2));
      Object[] var8 = var1[var7.intValue()];
      Double var9 = var5.getCost(var6.getState(var3));
      int var10 = var9.intValue();
      if (var8[var10] != null) {
         var4 = getWFIPathRec(var0, var1, var2, var8[var10], var4, var5, var6);
      } else {
         if (!mxGraphStructure.areConnected(var0, var2, var3) && var2 != var3) {
            throw new StructuralException("The two vertices aren't connected");
         }

         var4.add(var3);
      }

      return var4;
   }
}
