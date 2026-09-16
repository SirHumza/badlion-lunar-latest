package com.mxgraph.layout.hierarchical.model;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.view.mxGraph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mxGraphHierarchyModel {
   public int maxRank;
   protected Map<Object, mxGraphHierarchyNode> vertexMapper = null;
   protected Map<Object, mxGraphHierarchyEdge> edgeMapper = null;
   public Map<Integer, mxGraphHierarchyRank> ranks = null;
   public List<Object> roots;
   public Object parent = null;
   protected int dfsCount = 0;
   private final int SOURCESCANSTARTRANK = 100000000;

   public mxGraphHierarchyModel(mxHierarchicalLayout var1, Object[] var2, List<Object> var3, Object var4) {
      mxGraph var5 = var1.getGraph();
      this.roots = var3;
      this.parent = var4;
      if (var2 == null) {
         var2 = var5.getChildVertices(var4);
      }

      this.vertexMapper = new Hashtable<>(var2.length);
      this.edgeMapper = new Hashtable<>(var2.length);
      this.maxRank = 100000000;
      mxGraphHierarchyNode[] var6 = new mxGraphHierarchyNode[var2.length];
      this.createInternalCells(var1, var2, var6);

      for (int var7 = 0; var7 < var2.length; var7++) {
         for (mxGraphHierarchyEdge var10 : var6[var7].connectsAsSource) {
            List var11 = var10.edges;
            Iterator var12 = var11.iterator();
            if (var12.hasNext()) {
               Object var13 = var12.next();
               Object var14 = var5.getView().getVisibleTerminal(var13, false);
               mxGraphHierarchyNode var15 = this.vertexMapper.get(var14);
               if (var6[var7] == var15) {
                  var14 = var5.getView().getVisibleTerminal(var13, true);
                  var15 = this.vertexMapper.get(var14);
               }

               if (var15 != null && var6[var7] != var15) {
                  var10.target = var15;
                  if (var15.connectsAsTarget.size() == 0) {
                     var15.connectsAsTarget = new LinkedHashSet<>(4);
                  }

                  var15.connectsAsTarget.add(var10);
               }
            }
         }

         var6[var7].temp[0] = 1;
      }
   }

   protected void createInternalCells(mxHierarchicalLayout var1, Object[] var2, mxGraphHierarchyNode[] var3) {
      mxGraph var4 = var1.getGraph();

      for (int var5 = 0; var5 < var2.length; var5++) {
         var3[var5] = new mxGraphHierarchyNode(var2[var5]);
         this.vertexMapper.put(var2[var5], var3[var5]);
         Object[] var6 = var1.getEdges(var2[var5]);
         List var7 = Arrays.asList(var4.getOpposites(var6, var2[var5]));
         var3[var5].connectsAsSource = new LinkedHashSet<>(var7.size());

         for (Object var9 : var7) {
            if (var9 != var2[var5] && var4.getModel().isVertex(var9) && !var1.isVertexIgnored(var9)) {
               Object[] var10 = var4.getEdgesBetween(var2[var5], var9, false);
               Object[] var11 = var4.getEdgesBetween(var2[var5], var9, true);
               if (var10 != null && var10.length > 0 && this.edgeMapper.get(var10[0]) == null && var11.length * 2 >= var10.length) {
                  ArrayList var12 = new ArrayList(var10.length);

                  for (int var13 = 0; var13 < var10.length; var13++) {
                     var12.add(var10[var13]);
                  }

                  mxGraphHierarchyEdge var16 = new mxGraphHierarchyEdge(var12);

                  for (Object var15 : var12) {
                     this.edgeMapper.put(var15, var16);
                     var4.resetEdge(var15);
                     if (var1.isDisableEdgeStyle()) {
                        var1.setEdgeStyleEnabled(var15, false);
                        var1.setOrthogonalEdge(var15, true);
                     }
                  }

                  var16.source = var3[var5];
                  var3[var5].connectsAsSource.add(var16);
               }
            }
         }

         var3[var5].temp[0] = 0;
      }
   }

   public void initialRank() {
      Collection var1 = this.vertexMapper.values();
      LinkedList var2 = new LinkedList();
      if (this.roots != null) {
         Iterator var3 = this.roots.iterator();

         while (var3.hasNext()) {
            mxGraphHierarchyNode var4 = this.vertexMapper.get(var3.next());
            if (var4 != null) {
               var2.add(var4);
            }
         }
      }

      for (mxGraphHierarchyNode var16 : var1) {
         var16.temp[0] = -1;
      }

      ArrayList var17 = new ArrayList(var2);

      while (!var2.isEmpty()) {
         mxGraphHierarchyNode var5 = (mxGraphHierarchyNode)var2.getFirst();
         Collection var6 = var5.connectsAsTarget;
         Collection var7 = var5.connectsAsSource;
         boolean var8 = true;
         Iterator var9 = var6.iterator();
         int var10 = 100000000;

         while (var8 && var9.hasNext()) {
            mxGraphHierarchyEdge var11 = (mxGraphHierarchyEdge)var9.next();
            if (var11.temp[0] == 5270620) {
               mxGraphHierarchyNode var12 = var11.source;
               var10 = Math.min(var10, var12.temp[0] - 1);
            } else {
               var8 = false;
            }
         }

         if (!var8) {
            Object var26 = var2.removeFirst();
            var2.addLast(var5);
            if (var26 == var5 && var2.size() == 1) {
               break;
            }
         } else {
            var5.temp[0] = var10;
            this.maxRank = Math.min(this.maxRank, var10);
            if (var7 != null) {
               for (mxGraphHierarchyEdge var27 : var7) {
                  var27.temp[0] = 5270620;
                  mxGraphHierarchyNode var13 = var27.target;
                  if (var13.temp[0] == -1) {
                     var2.addLast(var13);
                     var13.temp[0] = -2;
                  }
               }
            }

            var2.removeFirst();
         }
      }

      for (mxGraphHierarchyNode var18 : var1) {
         var18.temp[0] = var18.temp[0] - this.maxRank;
      }

      for (int var19 = 0; var19 < var17.size(); var19++) {
         mxGraphHierarchyNode var20 = (mxGraphHierarchyNode)var17.get(var19);
         int var21 = 0;

         for (mxGraphHierarchyEdge var23 : var20.connectsAsSource) {
            mxGraphHierarchyNode var24 = var23.target;
            var20.temp[0] = Math.max(var21, var24.temp[0] + 1);
            var21 = var20.temp[0];
         }
      }

      this.maxRank = 100000000 - this.maxRank;
   }

   public void fixRanks() {
      final mxGraphHierarchyRank[] var1 = new mxGraphHierarchyRank[this.maxRank + 1];
      this.ranks = new LinkedHashMap<>(this.maxRank + 1);

      for (int var2 = 0; var2 < this.maxRank + 1; var2++) {
         var1[var2] = new mxGraphHierarchyRank();
         this.ranks.put(new Integer(var2), var1[var2]);
      }

      mxGraphHierarchyNode[] var7 = null;
      if (this.roots != null) {
         Object[] var3 = this.roots.toArray();
         var7 = new mxGraphHierarchyNode[var3.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            Object var5 = var3[var4];
            mxGraphHierarchyNode var6 = this.vertexMapper.get(var5);
            var7[var4] = var6;
         }
      }

      this.visit(new mxGraphHierarchyModel.CellVisitor() {
         @Override
         public void visit(mxGraphHierarchyNode var1x, mxGraphHierarchyNode var2, mxGraphHierarchyEdge var3, int var4, int var5) {
            mxGraphHierarchyNode var6 = var2;
            if (var5 == 0 && var6.maxRank < 0 && var6.minRank < 0) {
               var1[var6.temp[0]].add(var2);
               var6.maxRank = var6.temp[0];
               var6.minRank = var6.temp[0];
               var6.temp[0] = var1[var6.maxRank].size() - 1;
            }

            if (var1x != null && var3 != null) {
               int var7x = var1x.maxRank - var6.maxRank;
               if (var7x > 1) {
                  mxGraphHierarchyEdge var8 = var3;
                  var8.maxRank = var1x.maxRank;
                  var8.minRank = var2.maxRank;
                  var8.temp = new int[var7x - 1];
                  var8.x = new double[var7x - 1];
                  var8.y = new double[var7x - 1];

                  for (int var9 = var8.minRank + 1; var9 < var8.maxRank; var9++) {
                     var1[var9].add(var8);
                     var8.setGeneralPurposeVariable(var9, var1[var9].size() - 1);
                  }
               }
            }
         }
      }, var7, false, null);
   }

   public void visit(mxGraphHierarchyModel.CellVisitor var1, mxGraphHierarchyNode[] var2, boolean var3, Set<mxGraphHierarchyNode> var4) {
      if (var2 != null) {
         for (int var5 = 0; var5 < var2.length; var5++) {
            mxGraphHierarchyNode var6 = var2[var5];
            if (var6 != null) {
               if (var4 == null) {
                  var4 = new HashSet();
               }

               if (var3) {
                  var6.hashCode = new int[2];
                  var6.hashCode[0] = this.dfsCount;
                  var6.hashCode[1] = var5;
                  this.dfs(null, var6, null, var1, var4, var6.hashCode, var5, 0);
               } else {
                  this.dfs(null, var6, null, var1, var4, 0);
               }
            }
         }

         this.dfsCount++;
      }
   }

   public void dfs(
      mxGraphHierarchyNode var1,
      mxGraphHierarchyNode var2,
      mxGraphHierarchyEdge var3,
      mxGraphHierarchyModel.CellVisitor var4,
      Set<mxGraphHierarchyNode> var5,
      int var6
   ) {
      if (var2 != null) {
         if (!var5.contains(var2)) {
            var4.visit(var1, var2, var3, var6, 0);
            var5.add(var2);
            Object[] var7 = var2.connectsAsSource.toArray();

            for (int var8 = 0; var8 < var7.length; var8++) {
               mxGraphHierarchyEdge var9 = (mxGraphHierarchyEdge)var7[var8];
               mxGraphHierarchyNode var10 = var9.target;
               this.dfs(var2, var10, var9, var4, var5, var6 + 1);
            }
         } else {
            var4.visit(var1, var2, var3, var6, 1);
         }
      }
   }

   public void dfs(
      mxGraphHierarchyNode var1,
      mxGraphHierarchyNode var2,
      mxGraphHierarchyEdge var3,
      mxGraphHierarchyModel.CellVisitor var4,
      Set<mxGraphHierarchyNode> var5,
      int[] var6,
      int var7,
      int var8
   ) {
      if (var2 != null) {
         if (var1 != null && (var2.hashCode == null || var2.hashCode[0] != var1.hashCode[0])) {
            int var9 = var1.hashCode.length + 1;
            var2.hashCode = new int[var9];
            System.arraycopy(var1.hashCode, 0, var2.hashCode, 0, var1.hashCode.length);
            var2.hashCode[var9 - 1] = var7;
         }

         if (!var5.contains(var2)) {
            var4.visit(var1, var2, var3, var8, 0);
            var5.add(var2);
            Object[] var13 = var2.connectsAsSource.toArray();

            for (int var10 = 0; var10 < var13.length; var10++) {
               mxGraphHierarchyEdge var11 = (mxGraphHierarchyEdge)var13[var10];
               mxGraphHierarchyNode var12 = var11.target;
               this.dfs(var2, var12, var11, var4, var5, var2.hashCode, var10, var8 + 1);
            }
         } else {
            var4.visit(var1, var2, var3, var8, 1);
         }
      }
   }

   public Map<Object, mxGraphHierarchyNode> getVertexMapper() {
      if (this.vertexMapper == null) {
         this.vertexMapper = new Hashtable<>();
      }

      return this.vertexMapper;
   }

   public void setVertexMapper(Map<Object, mxGraphHierarchyNode> var1) {
      this.vertexMapper = var1;
   }

   public Map<Object, mxGraphHierarchyEdge> getEdgeMapper() {
      return this.edgeMapper;
   }

   public void setEdgeMapper(Map<Object, mxGraphHierarchyEdge> var1) {
      this.edgeMapper = var1;
   }

   public int getDfsCount() {
      return this.dfsCount;
   }

   public void setDfsCount(int var1) {
      this.dfsCount = var1;
   }

   public interface CellVisitor {
      void visit(mxGraphHierarchyNode var1, mxGraphHierarchyNode var2, mxGraphHierarchyEdge var3, int var4, int var5);
   }
}
