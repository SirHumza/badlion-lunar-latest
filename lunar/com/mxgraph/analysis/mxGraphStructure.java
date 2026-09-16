package com.mxgraph.analysis;

import com.mxgraph.costfunction.mxCostFunction;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class mxGraphStructure {
   private static String basicVertexStyleString = "ellipse;strokeColor=black;fillColor=orange;gradientColor=none";
   private static String basicEdgeStyleString = "strokeColor=red;noEdgeStyle=1;";
   private static String basicArrowStyleString = "endArrow=block;";

   public static boolean isConnected(mxAnalysisGraph var0) {
      Object[] var1 = var0.getChildVertices(var0.getGraph().getDefaultParent());
      int var2 = var1.length;
      if (var2 == 0) {
         throw new IllegalArgumentException();
      }

      int var3 = 1;
      int[] var4 = new int[var2];
      var4[0] = 1;

      for (int var5 = 1; var5 < var2; var5++) {
         var4[var5] = 0;
      }

      ArrayList var11 = new ArrayList();
      var11.add(var1[0]);

      while (var11.size() > 0) {
         Object var6 = var11.get(0);
         var11.remove(0);
         Object[] var7 = var0.getOpposites(var0.getEdges(var6, null, true, true, false, true), var6, true, true);

         for (int var8 = 0; var8 < var7.length; var8++) {
            int var9 = 0;

            for (int var10 = 0; var10 < var2; var10++) {
               if (var1[var10].equals(var7[var8])) {
                  var9 = var10;
               }
            }

            if (var4[var9] == 0) {
               var11.add(var1[var9]);
               var4[var9] = 1;
               var3++;
            }
         }
      }

      return var3 == var2;
   }

   public static boolean isCyclicUndirected(mxAnalysisGraph var0) {
      mxGraph var1 = var0.getGraph();
      mxIGraphModel var2 = var1.getModel();
      Object[] var3 = var2.cloneCells(var0.getChildCells(var1.getDefaultParent(), true, true), true);
      mxGraphModel var4 = new mxGraphModel();
      mxGraph var5 = new mxGraph(var4);
      Object var6 = var5.getDefaultParent();
      var5.addCells(var3);
      mxAnalysisGraph var7 = new mxAnalysisGraph();
      var7.setGraph(var5);
      var7.setGenerator(var0.getGenerator());
      var7.setProperties(var0.getProperties());
      Object[] var8 = new Object[1];

      do {
         var8[0] = getUndirectedLeaf(var7);
         if (var8[0] != null) {
            var5.removeCells(var8);
         }
      } while (var8[0] != null);

      int var9 = var7.getChildVertices(var6).length;
      return var9 > 0;
   }

   private static Object getUndirectedLeaf(mxAnalysisGraph var0) {
      Object var1 = var0.getGraph().getDefaultParent();

      for (Object var4 : var0.getChildVertices(var1)) {
         int var6 = var0.getEdges(var4, var1, true, true, false, true).length;
         if (var6 <= 1) {
            return var4;
         }
      }

      return null;
   }

   public static boolean isSimple(mxAnalysisGraph var0) {
      Object var1 = var0.getGraph().getDefaultParent();
      Object[] var2 = var0.getChildEdges(var1);

      for (int var3 = 0; var3 < var2.length; var3++) {
         Object var4 = var2[var3];
         if (var0.getTerminal(var4, true) == var0.getTerminal(var4, false)) {
            return false;
         }

         for (int var5 = 0; var5 < var2.length; var5++) {
            Object var6 = var2[var5];
            if (var4 != var6) {
               if (var0.getTerminal(var4, true) == var0.getTerminal(var6, true) && var0.getTerminal(var4, false) == var0.getTerminal(var6, false)) {
                  return false;
               }

               if (var0.getTerminal(var4, true) == var0.getTerminal(var6, false) && var0.getTerminal(var4, false) == var0.getTerminal(var6, true)) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public static boolean isTree(mxAnalysisGraph var0) {
      return isConnected(var0) && !isCyclicUndirected(var0) && isSimple(var0);
   }

   public static Object getLowestDegreeVertex(mxAnalysisGraph var0, Object[] var1) {
      Object[] var2 = var0.getChildVertices(var0.getGraph().getDefaultParent());
      int var3 = var2.length;
      int var4 = Integer.MAX_VALUE;
      Object var5 = null;
      List var6 = null;
      if (var1 != null) {
         var6 = Arrays.asList(var1);
      }

      for (int var7 = 0; var7 < var3; var7++) {
         if (var1 == null || !var6.contains(var2[var7])) {
            int var8 = var0.getEdges(var2[var7], null, true, true, true, true).length;
            if (var8 == 0) {
               return var2[var7];
            }

            if (var8 < var4) {
               var4 = var8;
               var5 = var2[var7];
            }
         }
      }

      return var5;
   }

   public static boolean areConnected(mxAnalysisGraph var0, Object var1, Object var2) {
      Object[] var3 = var0.getEdges(var1, var0.getGraph().getDefaultParent(), true, true, false, true);
      List var4 = Arrays.asList(var0.getOpposites(var3, var1, true, true));
      return var4.contains(var2);
   }

   public static void makeSimple(mxAnalysisGraph var0) {
      mxGraph var1 = var0.getGraph();
      Object var2 = var1.getDefaultParent();
      Object[] var3 = var0.getChildEdges(var2);

      for (int var4 = 0; var4 < var3.length; var4++) {
         Object var5 = var3[var4];
         if (var0.getTerminal(var5, true) == var0.getTerminal(var5, false)) {
            var1.removeCells(new Object[]{var5});
         }
      }

      var3 = var1.getChildEdges(var2);
      HashSet var12 = new HashSet();
      ArrayList var13 = new ArrayList();

      for (int var6 = 0; var6 < var3.length; var6++) {
         Object var7 = var3[var6];
         Object var8 = var0.getTerminal(var7, true);
         Object var9 = var0.getTerminal(var7, false);
         HashSet var10 = new HashSet();
         var10.add(var8);
         var10.add(var9);
         if (var12.contains(var10)) {
            var13.add(var7);
         } else {
            var12.add(var10);
         }
      }

      Object[] var14 = var13.toArray();
      var1.removeCells(var14);
   }

   public static void makeConnected(mxAnalysisGraph var0) {
      if (!isConnected(var0)) {
         Object[][] var1 = getGraphComponents(var0);
         int var2 = var1.length;
         if (var2 >= 2) {
            mxGraph var3 = var0.getGraph();
            Object var4 = var3.getDefaultParent();

            for (int var5 = 1; var5 < var2; var5++) {
               Object var6 = var1[var5 - 1][(int)Math.round(Math.random() * (var1[var5 - 1].length - 1))];
               Object var7 = var1[var5][(int)Math.round(Math.random() * (var1[var5].length - 1))];
               var3.insertEdge(var4, null, var0.getGenerator().getNewEdgeValue(var0), var6, var7);
            }
         }
      }
   }

   public static Object[][] getGraphComponents(mxAnalysisGraph var0) {
      Object var1 = var0.getGraph().getDefaultParent();
      Object[] var2 = var0.getChildVertices(var1);
      int var3 = var2.length;
      if (var3 == 0) {
         return (Object[][])null;
      }

      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList<>(Arrays.asList(var2));
      boolean var6 = mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED);
      mxGraphProperties.setDirected(var0.getProperties(), false);

      while (var5.size() > 0) {
         Object var7 = var5.remove(0);
         int var8 = var4.size();
         boolean var9 = false;

         for (int var10 = 0; var10 < var8; var10++) {
            if (((ArrayList)var4.get(var10)).contains(var7)) {
               var9 = true;
            }
         }

         if (!var9) {
            final ArrayList var14 = new ArrayList();
            mxTraversal.bfs(var0, var7, new mxGraph.mxICellVisitor() {
               @Override
               public boolean visit(Object var1, Object var2x) {
                  var14.add(var1);
                  return false;
               }
            });

            for (int var11 = 0; var11 < var14.size(); var11++) {
               var5.remove(var14.get(var11));
            }

            var4.add(var14);
         }
      }

      mxGraphProperties.setDirected(var0.getProperties(), var6);
      Object[][] var12 = new Object[var4.size()][];

      for (int var13 = 0; var13 < var4.size(); var13++) {
         var12[var13] = ((ArrayList)var4.get(var13)).toArray();
      }

      return var12;
   }

   public static void makeTreeDirected(mxAnalysisGraph var0, Object var1) {
      if (!isTree(var0)) {
         throw new StructuralException("The graph is not a tree");
      }

      mxGraphProperties.setDirected(var0.getProperties(), false);
      final ArrayList var2 = new ArrayList();
      mxGraph var3 = var0.getGraph();
      mxIGraphModel var4 = var3.getModel();
      Object var5 = var3.getDefaultParent();
      mxTraversal.bfs(var0, var1, new mxGraph.mxICellVisitor() {
         @Override
         public boolean visit(Object var1, Object var2x) {
            var2.add(var1);
            return false;
         }
      });

      for (int var6 = 0; var6 < var2.size(); var6++) {
         Object var7 = var2.get(var6);
         Object[] var8 = var0.getEdges(var7, var5, true, true, false, true);
         Object[] var9 = var0.getOpposites(var8, var7, true, true);

         for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            int var12 = var2.indexOf(var11);
            if (var12 > var6) {
               Object var13 = getConnectingEdge(var0, var7, var11);
               var4.setTerminal(var13, var7, true);
               var4.setTerminal(var13, var11, false);
            }
         }
      }

      mxGraphProperties.setDirected(var0.getProperties(), true);
      setDefaultGraphStyle(var0, false);
   }

   public static Object getConnectingEdge(mxAnalysisGraph var0, Object var1, Object var2) {
      mxIGraphModel var3 = var0.getGraph().getModel();
      Object[] var4 = var0.getEdges(var1, null, true, true, false, true);

      for (int var5 = 0; var5 < var4.length; var5++) {
         Object var6 = var4[var5];
         Object var7 = var3.getTerminal(var6, true);
         Object var8 = var3.getTerminal(var6, false);
         if (var7.equals(var1) && var8.equals(var2)) {
            return var6;
         }

         if (var7.equals(var2) && var8.equals(var1)) {
            return var6;
         }
      }

      return null;
   }

   public static boolean isCyclicDirected(mxAnalysisGraph var0) {
      mxGraph var1 = var0.getGraph();
      mxIGraphModel var2 = var1.getModel();
      Object[] var3 = var2.cloneCells(var0.getChildCells(var1.getDefaultParent(), true, true), true);
      mxGraphModel var4 = new mxGraphModel();
      mxGraph var5 = new mxGraph(var4);
      Object var6 = var5.getDefaultParent();
      var5.addCells(var3);
      mxAnalysisGraph var7 = new mxAnalysisGraph();
      var7.setGraph(var5);
      var7.setGenerator(var0.getGenerator());
      var7.setProperties(var0.getProperties());
      Object[] var8 = new Object[1];

      do {
         var8[0] = getDirectedLeaf(var7, var6);
         if (var8[0] != null) {
            var5.removeCells(var8);
         }
      } while (var8[0] != null);

      int var9 = var7.getChildVertices(var6).length;
      return var9 > 0;
   }

   public static Object getDirectedLeaf(mxAnalysisGraph var0, Object var1) {
      for (Object var4 : var0.getChildVertices(var1)) {
         int var6 = var0.getEdges(var4, var1, true, false, false, true).length;
         int var7 = var0.getEdges(var4, var1, false, true, false, true).length;
         if (var7 == 0 || var6 == 0) {
            return var4;
         }
      }

      return null;
   }

   public static void complementaryGraph(mxAnalysisGraph var0) {
      ArrayList var1 = new ArrayList();
      mxGraph var2 = var0.getGraph();
      Object var3 = var2.getDefaultParent();
      Object[] var4 = var0.getChildVertices(var3);
      int var5 = var4.length;

      for (int var6 = 0; var6 < var5; var6++) {
         mxCell var7 = (mxCell)var4[var6];
         int var8 = var7.getEdgeCount();
         new mxCell();
         ArrayList var10 = new ArrayList();

         for (int var11 = 0; var11 < var8; var11++) {
            mxCell var9 = (mxCell)var7.getEdgeAt(var11);
            mxCell var12 = (mxCell)var9.getSource();
            mxCell var13 = (mxCell)var9.getTarget();
            if (!var12.equals(var7)) {
               var10.add(var11, var12);
            } else {
               var10.add(var11, var13);
            }
         }

         var1.add(var6, var10);
      }

      Object[] var14 = var0.getChildEdges(var3);
      var2.removeCells(var14);

      for (int var15 = 0; var15 < var5; var15++) {
         new ArrayList();
         ArrayList var16 = (ArrayList)var1.get(var15);
         mxCell var17 = (mxCell)var4[var15];

         for (int var18 = 0; var18 < var5; var18++) {
            mxCell var19 = (mxCell)var4[var18];
            boolean var20 = true;
            if (var16.contains(var19)) {
               var20 = false;
            } else if (var19.equals(var17)) {
               var20 = false;
            } else if (areConnected(var0, var17, var19)) {
               var20 = false;
            }

            if (var20) {
               var2.insertEdge(var3, null, null, var17, var19);
            }
         }
      }
   }

   public static Object getVertexWithValue(mxAnalysisGraph var0, int var1) {
      mxGraph var2 = var0.getGraph();
      Object[] var3 = var0.getChildVertices(var0.getGraph().getDefaultParent());
      int var4 = var3.length;
      int var5 = 0;
      mxCostFunction var6 = var0.getGenerator().getCostFunction();
      mxGraphView var7 = var2.getView();

      for (int var8 = 0; var8 < var4; var8++) {
         Object var9 = var3[var8];
         var5 = (int)var6.getCost(new mxCellState(var7, var9, null));
         if (var5 == var1) {
            return var9;
         }
      }

      return null;
   }

   public static void setDefaultGraphStyle(mxAnalysisGraph var0, boolean var1) {
      mxGraph var2 = var0.getGraph();
      Object var3 = var2.getDefaultParent();
      Object[] var4 = var0.getChildVertices(var3);
      mxIGraphModel var5 = var2.getModel();

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.setStyle(var4[var6], basicVertexStyleString);
      }

      Object[] var10 = var0.getChildEdges(var3);
      boolean var7 = mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED);
      String var8 = basicEdgeStyleString;
      if (var7) {
         var8 = var8 + basicArrowStyleString;
      } else {
         var8 = var8 + "endArrow=none";
      }

      for (int var9 = 0; var9 < var10.length; var9++) {
         var5.setStyle(var10[var9], var8);
      }

      if (var1) {
         for (int var12 = 0; var12 < var10.length; var12++) {
            var5.setValue(var10[var12], null);
         }

         for (int var13 = 0; var13 < var10.length; var13++) {
            var5.setValue(var10[var13], var0.getGenerator().getNewEdgeValue(var0));
         }
      }
   }

   public static int regularity(mxAnalysisGraph var0) {
      mxGraph var1 = var0.getGraph();
      Object[] var2 = var0.getChildVertices(var1.getDefaultParent());
      int var3 = var2.length;
      Object var4 = var2[0];
      int var5 = var0.getEdges(var4, null, true, true).length;

      for (int var6 = 1; var6 < var3; var6++) {
         var4 = var2[var6];
         if (var5 != var0.getEdges(var4, null, true, true).length) {
            throw new StructuralException("The graph is irregular.");
         }
      }

      return var5;
   }

   public static int indegree(mxAnalysisGraph var0, Object var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      } else {
         return mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED)
            ? var0.getEdges(var1, var0.getGraph().getDefaultParent(), true, false, true, true).length
            : var0.getEdges(var1, var0.getGraph().getDefaultParent(), true, true, true, true).length;
      }
   }

   public static int outdegree(mxAnalysisGraph var0, Object var1) {
      return mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED)
         ? var0.getEdges(var1, var0.getGraph().getDefaultParent(), false, true, true, true).length
         : var0.getEdges(var1, var0.getGraph().getDefaultParent(), true, true, true, true).length;
   }

   public static boolean isCutVertex(mxAnalysisGraph var0, Object var1) {
      mxGraph var2 = var0.getGraph();
      mxIGraphModel var3 = var2.getModel();
      if (var0.getEdges(var1, null, true, true, false, true).length >= 2) {
         Object[] var4 = var3.cloneCells(var0.getChildCells(var2.getDefaultParent(), true, true), true);
         mxGraphModel var5 = new mxGraphModel();
         mxGraph var6 = new mxGraph(var5);
         var6.addCells(var4);
         mxAnalysisGraph var7 = new mxAnalysisGraph();
         var7.setGraph(var6);
         var7.setGenerator(var0.getGenerator());
         var7.setProperties(var0.getProperties());
         Object var8 = getVertexWithValue(var7, (int)var0.getGenerator().getCostFunction().getCost(new mxCellState(var2.getView(), var1, null)));
         var6.removeCells(new Object[]{var8}, true);
         Object[][] var9 = getGraphComponents(var0);
         Object[][] var10 = getGraphComponents(var7);
         if (var10.length > var9.length) {
            return true;
         }
      }

      return false;
   }

   public static Object[] getCutVertices(mxAnalysisGraph var0) {
      ArrayList var1 = new ArrayList();
      Object[] var2 = var0.getChildVertices(var0.getGraph().getDefaultParent());
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (isCutVertex(var0, var2[var4])) {
            var1.add(var2[var4]);
         }
      }

      return var1.toArray();
   }

   public static boolean isCutEdge(mxAnalysisGraph var0, Object var1) {
      mxGraph var2 = var0.getGraph();
      mxIGraphModel var3 = var2.getModel();
      mxCostFunction var4 = var0.getGenerator().getCostFunction();
      mxGraphView var5 = var2.getView();
      int var6 = (int)var4.getCost(new mxCellState(var5, var0.getTerminal(var1, true), null));
      int var7 = (int)var4.getCost(new mxCellState(var5, var0.getTerminal(var1, false), null));
      if (var0.getTerminal(var1, false) != null || var0.getTerminal(var1, true) != null) {
         Object[] var8 = var3.cloneCells(var0.getChildCells(var2.getDefaultParent(), true, true), true);
         mxGraphModel var9 = new mxGraphModel();
         mxGraph var10 = new mxGraph(var9);
         var10.addCells(var8);
         mxAnalysisGraph var11 = new mxAnalysisGraph();
         var11.setGraph(var10);
         var11.setGenerator(var0.getGenerator());
         var11.setProperties(var0.getProperties());
         Object[] var12 = var11.getChildEdges(var11.getGraph().getDefaultParent());
         Object var13 = var12[0];
         mxCostFunction var14 = var11.getGenerator().getCostFunction();
         mxGraphView var15 = var10.getView();
         int var16 = (int)var14.getCost(new mxCellState(var15, var11.getTerminal(var13, true), null));
         int var17 = (int)var14.getCost(new mxCellState(var15, var11.getTerminal(var13, false), null));
         int var18 = 0;

         while (var16 != var6 || var17 != var7) {
            var13 = var12[++var18];
            var16 = Integer.parseInt((String)var9.getValue(var11.getTerminal(var13, true)));
            var17 = Integer.parseInt((String)var9.getValue(var11.getTerminal(var13, false)));
         }

         var10.removeCells(new Object[]{var13}, true);
         Object[][] var19 = getGraphComponents(var0);
         Object[][] var20 = getGraphComponents(var11);
         if (var20.length > var19.length) {
            return true;
         }
      }

      return false;
   }

   public static Object[] getCutEdges(mxAnalysisGraph var0) {
      ArrayList var1 = new ArrayList();
      Object[] var2 = var0.getChildEdges(var0.getGraph().getDefaultParent());
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (isCutEdge(var0, var2[var4])) {
            var1.add(var2[var4]);
         }
      }

      return var1.toArray();
   }

   public static Object[] getSourceVertices(mxAnalysisGraph var0) {
      if (!mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED)) {
         throw new StructuralException("The graph is undirected, so it can't have source vertices.");
      }

      ArrayList var1 = new ArrayList();
      Object[] var2 = var0.getChildVertices(var0.getGraph().getDefaultParent());

      for (int var3 = 0; var3 < var2.length; var3++) {
         Object var4 = var2[var3];
         Object[] var5 = var0.getEdges(var2[var3], null, false, true, true, true);
         Object[] var6 = var0.getEdges(var2[var3], null, true, false, true, true);
         if (var6.length == 0 && var5.length > 0) {
            var1.add(var4);
         }
      }

      return var1.toArray();
   }

   public static Object[] getSinkVertices(mxAnalysisGraph var0) {
      if (!mxGraphProperties.isDirected(var0.getProperties(), mxGraphProperties.DEFAULT_DIRECTED)) {
         throw new StructuralException("The graph is undirected, so it can't have sink vertices.");
      }

      ArrayList var1 = new ArrayList();
      Object[] var2 = var0.getChildVertices(var0.getGraph().getDefaultParent());

      for (int var3 = 0; var3 < var2.length; var3++) {
         Object var4 = var2[var3];
         Object[] var5 = var0.getEdges(var2[var3], null, false, true, true, true);
         Object[] var6 = var0.getEdges(var2[var3], null, true, false, true, true);
         if (var6.length > 0 && var5.length == 0) {
            var1.add(var4);
         }
      }

      return var1.toArray();
   }

   public static boolean isBiconnected(mxAnalysisGraph var0) {
      int var1 = var0.getChildEdges(var0.getGraph().getDefaultParent()).length;
      return getCutVertices(var0).length == 0 && var1 >= 1;
   }
}
