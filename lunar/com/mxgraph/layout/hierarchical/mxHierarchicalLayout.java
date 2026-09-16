package com.mxgraph.layout.hierarchical;

import com.mxgraph.layout.mxGraphLayout;
import com.mxgraph.layout.hierarchical.model.mxGraphHierarchyModel;
import com.mxgraph.layout.hierarchical.stage.mxCoordinateAssignment;
import com.mxgraph.layout.hierarchical.stage.mxMedianHybridCrossingReduction;
import com.mxgraph.layout.hierarchical.stage.mxMinimumCycleRemover;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class mxHierarchicalLayout extends mxGraphLayout {
   protected List<Object> roots = null;
   protected boolean resizeParent = true;
   protected boolean moveParent = false;
   protected int parentBorder = 0;
   protected double intraCellSpacing = 30.0;
   protected double interRankCellSpacing = 50.0;
   protected double interHierarchySpacing = 60.0;
   protected double parallelEdgeSpacing = 10.0;
   protected int orientation = 1;
   protected boolean disableEdgeStyle = true;
   protected boolean fineTuning = true;
   protected boolean traverseAncestors = true;
   protected mxGraphHierarchyModel model = null;

   public mxHierarchicalLayout(mxGraph var1) {
      this(var1, 1);
   }

   public mxHierarchicalLayout(mxGraph var1, int var2) {
      super(var1);
      this.orientation = var2;
   }

   public mxGraphHierarchyModel getModel() {
      return this.model;
   }

   @Override
   public void execute(Object var1) {
      this.execute(var1, null);
   }

   public void execute(Object var1, List<Object> var2) {
      super.execute(var1);
      mxIGraphModel var3 = this.graph.getModel();
      if (var2 != null || var1 != null) {
         if (var2 != null && var1 != null) {
            for (Object var5 : var2) {
               if (!var3.isAncestor(var1, var5)) {
                  var2.remove(var5);
               }
            }
         }

         this.roots = var2;
         var3.beginUpdate();

         try {
            this.run(var1);
            if (this.isResizeParent() && !this.graph.isCellCollapsed(var1)) {
               this.graph.updateGroupBounds(new Object[]{var1}, this.getParentBorder(), this.isMoveParent());
            }
         } finally {
            var3.endUpdate();
         }
      }
   }

   public List<Object> findRoots(Object var1, Set<Object> var2) {
      ArrayList var3 = new ArrayList();
      Object var4 = null;
      int var5 = -100000;
      mxIGraphModel var6 = this.graph.getModel();

      for (Object var8 : var2) {
         if (var6.isVertex(var8) && this.graph.isCellVisible(var8)) {
            Object[] var9 = this.getEdges(var8);
            int var10 = 0;
            int var11 = 0;

            for (int var12 = 0; var12 < var9.length; var12++) {
               Object var13 = this.graph.getView().getVisibleTerminal(var9[var12], true);
               if (var13 == var8) {
                  var10++;
               } else {
                  var11++;
               }
            }

            if (var11 == 0 && var10 > 0) {
               var3.add(var8);
            }

            int var14 = var10 - var11;
            if (var14 > var5) {
               var5 = var14;
               var4 = var8;
            }
         }
      }

      if (var3.isEmpty() && var4 != null) {
         var3.add(var4);
      }

      return var3;
   }

   public Object[] getEdges(Object var1) {
      mxIGraphModel var2 = this.graph.getModel();
      boolean var3 = this.graph.isCellCollapsed(var1);
      ArrayList var4 = new ArrayList();
      int var5 = var2.getChildCount(var1);

      for (int var6 = 0; var6 < var5; var6++) {
         Object var7 = var2.getChildAt(var1, var6);
         if (var3 || !this.graph.isCellVisible(var7)) {
            var4.addAll(Arrays.asList(mxGraphModel.getEdges(var2, var7, true, true, false)));
         }
      }

      var4.addAll(Arrays.asList(mxGraphModel.getEdges(var2, var1, true, true, false)));
      ArrayList var12 = new ArrayList(var4.size());

      for (Object var8 : var4) {
         mxCellState var9 = this.graph.getView().getState(var8);
         Object var10 = var9 != null ? var9.getVisibleTerminal(true) : this.graph.getView().getVisibleTerminal(var8, true);
         Object var11 = var9 != null ? var9.getVisibleTerminal(false) : this.graph.getView().getVisibleTerminal(var8, false);
         if (var10 != var11
            && (
               var11 == var1 && (this.parent == null || this.graph.isValidAncestor(var10, this.parent, this.traverseAncestors))
                  || var10 == var1 && (this.parent == null || this.graph.isValidAncestor(var11, this.parent, this.traverseAncestors))
            )) {
            var12.add(var8);
         }
      }

      return var12.toArray();
   }

   public void run(Object var1) {
      ArrayList var2 = new ArrayList();
      LinkedHashSet var3 = new LinkedHashSet();
      if (this.roots == null && var1 != null) {
         Set var9 = this.filterDescendants(var1);
         this.roots = new ArrayList<>();

         while (!var9.isEmpty()) {
            List var11 = this.findRoots(var1, var9);

            for (Object var7 : var11) {
               LinkedHashSet var8 = new LinkedHashSet();
               var2.add(var8);
               this.traverse(var7, true, null, var3, var8, var2, var9);
            }

            this.roots.addAll(var11);
         }
      } else {
         for (int var4 = 0; var4 < this.roots.size(); var4++) {
            LinkedHashSet var5 = new LinkedHashSet();
            var2.add(var5);
            this.traverse(this.roots.get(var4), true, null, var3, var5, var2, null);
         }
      }

      double var10 = 0.0;

      for (Set var13 : var2) {
         this.model = new mxGraphHierarchyModel(this, var13.toArray(), this.roots, var1);
         this.cycleStage(var1);
         this.layeringStage();
         this.crossingStage(var1);
         var10 = this.placementStage(var10, var1);
      }
   }

   public Set<Object> filterDescendants(Object var1) {
      mxIGraphModel var2 = this.graph.getModel();
      LinkedHashSet var3 = new LinkedHashSet();
      if (var2.isVertex(var1) && var1 != this.parent && this.graph.isCellVisible(var1)) {
         var3.add(var1);
      }

      if (this.traverseAncestors || var1 == this.parent && this.graph.isCellVisible(var1)) {
         int var4 = var2.getChildCount(var1);

         for (int var5 = 0; var5 < var4; var5++) {
            Object var6 = var2.getChildAt(var1, var5);
            var3.addAll(this.filterDescendants(var6));
         }
      }

      return var3;
   }

   protected void traverse(Object var1, boolean var2, Object var3, Set<Object> var4, Set<Object> var5, List<Set<Object>> var6, Set<Object> var7) {
      mxGraphView var8 = this.graph.getView();
      mxIGraphModel var9 = this.graph.getModel();
      if (var1 != null && var4 != null) {
         if (!var4.contains(var1) && (var7 == null || var7.contains(var1))) {
            var5.add(var1);
            var4.add(var1);
            if (var7 != null) {
               var7.remove(var1);
            }

            int var15 = var9.getEdgeCount(var1);
            if (var15 > 0) {
               for (int var16 = 0; var16 < var15; var16++) {
                  Object var17 = var9.getEdgeAt(var1, var16);
                  boolean var13 = var8.getVisibleTerminal(var17, true) == var1;
                  if (!var2 || var13) {
                     Object var14 = var8.getVisibleTerminal(var17, !var13);
                     this.traverse(var14, var2, var17, var4, var5, var6, var7);
                  }
               }
            }
         } else if (!var5.contains(var1)) {
            Set var10 = null;

            for (Set var12 : var6) {
               if (var12.contains(var1)) {
                  var5.addAll(var12);
                  var10 = var12;
                  break;
               }
            }

            if (var10 != null) {
               var6.remove(var10);
            }
         }
      }
   }

   public void cycleStage(Object var1) {
      mxMinimumCycleRemover var2 = new mxMinimumCycleRemover(this);
      var2.execute(var1);
   }

   public void layeringStage() {
      this.model.initialRank();
      this.model.fixRanks();
   }

   public void crossingStage(Object var1) {
      mxMedianHybridCrossingReduction var2 = new mxMedianHybridCrossingReduction(this);
      var2.execute(var1);
   }

   public double placementStage(double var1, Object var3) {
      mxCoordinateAssignment var4 = new mxCoordinateAssignment(
         this, this.intraCellSpacing, this.interRankCellSpacing, this.orientation, var1, this.parallelEdgeSpacing
      );
      var4.setFineTuning(this.fineTuning);
      var4.execute(var3);
      return var4.getLimitX() + this.interHierarchySpacing;
   }

   public boolean isResizeParent() {
      return this.resizeParent;
   }

   public void setResizeParent(boolean var1) {
      this.resizeParent = var1;
   }

   public boolean isMoveParent() {
      return this.moveParent;
   }

   public void setMoveParent(boolean var1) {
      this.moveParent = var1;
   }

   public int getParentBorder() {
      return this.parentBorder;
   }

   public void setParentBorder(int var1) {
      this.parentBorder = var1;
   }

   public double getIntraCellSpacing() {
      return this.intraCellSpacing;
   }

   public void setIntraCellSpacing(double var1) {
      this.intraCellSpacing = var1;
   }

   public double getInterRankCellSpacing() {
      return this.interRankCellSpacing;
   }

   public void setInterRankCellSpacing(double var1) {
      this.interRankCellSpacing = var1;
   }

   public int getOrientation() {
      return this.orientation;
   }

   public void setOrientation(int var1) {
      this.orientation = var1;
   }

   public double getInterHierarchySpacing() {
      return this.interHierarchySpacing;
   }

   public void setInterHierarchySpacing(double var1) {
      this.interHierarchySpacing = var1;
   }

   public double getParallelEdgeSpacing() {
      return this.parallelEdgeSpacing;
   }

   public void setParallelEdgeSpacing(double var1) {
      this.parallelEdgeSpacing = var1;
   }

   public boolean isFineTuning() {
      return this.fineTuning;
   }

   public void setFineTuning(boolean var1) {
      this.fineTuning = var1;
   }

   public boolean isDisableEdgeStyle() {
      return this.disableEdgeStyle;
   }

   public void setDisableEdgeStyle(boolean var1) {
      this.disableEdgeStyle = var1;
   }

   @Override
   public String toString() {
      return "Hierarchical";
   }
}
