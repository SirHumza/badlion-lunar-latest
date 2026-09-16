package com.mxgraph.analysis;

import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

public class mxGraphAnalysis {
   protected static mxGraphAnalysis instance = new mxGraphAnalysis();

   protected mxGraphAnalysis() {
   }

   public static mxGraphAnalysis getInstance() {
      return instance;
   }

   public static void setInstance(mxGraphAnalysis var0) {
      instance = var0;
   }

   public Object[] getShortestPath(mxGraph var1, Object var2, Object var3, mxICostFunction var4, int var5, boolean var6) {
      mxGraphView var7 = var1.getView();
      mxFibonacciHeap var8 = this.createPriorityQueue();
      Hashtable var9 = new Hashtable();
      var8.decreaseKey(var8.getNode(var2, true), 0.0);

      for (int var10 = 0; var10 < var5; var10++) {
         mxFibonacciHeap.Node var11 = var8.removeMin();
         double var12 = var11.getKey();
         Object var14 = var11.getUserObject();
         if (var14 == var3) {
            break;
         }

         Object[] var15 = var6 ? var1.getOutgoingEdges(var14) : var1.getConnections(var14);
         if (var15 != null) {
            for (int var16 = 0; var16 < var15.length; var16++) {
               Object[] var17 = var1.getOpposites(new Object[]{var15[var16]}, var14);
               if (var17 != null && var17.length > 0) {
                  Object var18 = var17[0];
                  if (var18 != null && var18 != var14 && var18 != var2) {
                     double var19 = var12 + (var4 != null ? var4.getCost(var7.getState(var15[var16])) : 1.0);
                     var11 = var8.getNode(var18, true);
                     double var21 = var11.getKey();
                     if (var19 < var21) {
                        var9.put(var18, var15[var16]);
                        var8.decreaseKey(var11, var19);
                     }
                  }
               }
            }
         }

         if (var8.isEmpty()) {
            break;
         }
      }

      ArrayList var23 = new ArrayList(2 * var5);
      Object var25 = var3;
      Object var26 = var9.get(var25);
      if (var26 != null) {
         var23.add(var25);

         while (var26 != null) {
            var23.add(0, var26);
            mxCellState var13 = var7.getState(var26);
            Object var27 = var13 != null ? var13.getVisibleTerminal(true) : var7.getVisibleTerminal(var26, true);
            boolean var28 = var27 == var25;
            var25 = var13 != null ? var13.getVisibleTerminal(!var28) : var7.getVisibleTerminal(var26, !var28);
            var23.add(0, var25);
            var26 = var9.get(var25);
         }
      }

      return var23.toArray();
   }

   public Object[] getMinimumSpanningTree(mxGraph var1, Object[] var2, mxICostFunction var3, boolean var4) {
      ArrayList var5 = new ArrayList(var2.length);
      mxFibonacciHeap var6 = this.createPriorityQueue();
      Hashtable var7 = new Hashtable();
      Object var8 = var2[0];
      var6.decreaseKey(var6.getNode(var8, true), 0.0);

      for (int var9 = 1; var9 < var2.length; var9++) {
         var6.getNode(var2[var9], true);
      }

      while (!var6.isEmpty()) {
         mxFibonacciHeap.Node var20 = var6.removeMin();
         var8 = var20.getUserObject();
         Object var10 = var7.get(var8);
         if (var10 != null) {
            var5.add(var10);
         }

         Object[] var11 = var4 ? var1.getOutgoingEdges(var8) : var1.getConnections(var8);
         Object[] var12 = var1.getOpposites(var11, var8);
         if (var11 != null) {
            for (int var13 = 0; var13 < var11.length; var13++) {
               Object var14 = var12[var13];
               if (var14 != null && var14 != var8) {
                  var20 = var6.getNode(var14, false);
                  if (var20 != null) {
                     double var15 = var3.getCost(var1.getView().getState(var11[var13]));
                     double var17 = var20.getKey();
                     if (var15 < var17) {
                        var7.put(var14, var11[var13]);
                        var6.decreaseKey(var20, var15);
                     }
                  }
               }
            }
         }
      }

      return var5.toArray();
   }

   public Object[] getMinimumSpanningTree(mxGraph var1, Object[] var2, Object[] var3, mxICostFunction var4) {
      mxGraphView var5 = var1.getView();
      mxUnionFind var6 = this.createUnionFind(var2);
      ArrayList var7 = new ArrayList(var3.length);
      mxCellState[] var8 = this.sort(var5.getCellStates(var3), var4);

      for (int var9 = 0; var9 < var8.length; var9++) {
         Object var10 = var8[var9].getVisibleTerminal(true);
         Object var11 = var8[var9].getVisibleTerminal(false);
         mxUnionFind.Node var12 = var6.find(var6.getNode(var10));
         mxUnionFind.Node var13 = var6.find(var6.getNode(var11));
         if (var12 == null || var13 == null || var12 != var13) {
            var6.union(var12, var13);
            var7.add(var8[var9].getCell());
         }
      }

      return var7.toArray();
   }

   public mxUnionFind getConnectionComponents(mxGraph var1, Object[] var2, Object[] var3) {
      mxGraphView var4 = var1.getView();
      mxUnionFind var5 = this.createUnionFind(var2);

      for (int var6 = 0; var6 < var3.length; var6++) {
         mxCellState var7 = var4.getState(var3[var6]);
         Object var8 = var7 != null ? var7.getVisibleTerminal(true) : var4.getVisibleTerminal(var3[var6], true);
         Object var9 = var7 != null ? var7.getVisibleTerminal(false) : var4.getVisibleTerminal(var3[var6], false);
         var5.union(var5.find(var5.getNode(var8)), var5.find(var5.getNode(var9)));
      }

      return var5;
   }

   public mxCellState[] sort(mxCellState[] var1, final mxICostFunction var2) {
      List var3 = Arrays.asList(var1);
      Collections.sort(var3, new Comparator<mxCellState>() {
         public int compare(mxCellState var1, mxCellState var2x) {
            Double var3x = new Double(var2.getCost(var1));
            Double var4 = new Double(var2.getCost(var2x));
            return var3x.compareTo(var4);
         }
      });
      return (mxCellState[])var3.toArray();
   }

   public double sum(mxCellState[] var1, mxICostFunction var2) {
      double var3 = 0.0;

      for (int var5 = 0; var5 < var1.length; var5++) {
         var3 += var2.getCost(var1[var5]);
      }

      return var3;
   }

   protected mxUnionFind createUnionFind(Object[] var1) {
      return new mxUnionFind(var1);
   }

   protected mxFibonacciHeap createPriorityQueue() {
      return new mxFibonacciHeap();
   }
}
