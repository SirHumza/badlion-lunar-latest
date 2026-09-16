package com.mxgraph.layout;

import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class mxCompactTreeLayout extends mxGraphLayout {
   protected boolean horizontal;
   protected boolean invert;
   protected boolean resizeParent = true;
   protected int groupPadding = 10;
   protected Set<Object> parentsChanged = null;
   protected boolean moveTree = false;
   protected boolean resetEdges = true;
   protected int levelDistance = 10;
   protected int nodeDistance = 20;
   protected int prefHozEdgeSep = 5;
   protected int prefVertEdgeOff = 2;
   protected int minEdgeJetty = 12;
   protected int channelBuffer = 4;
   protected boolean edgeRouting = true;

   public mxCompactTreeLayout(mxGraph var1) {
      this(var1, true);
   }

   public mxCompactTreeLayout(mxGraph var1, boolean var2) {
      this(var1, var2, false);
   }

   public mxCompactTreeLayout(mxGraph var1, boolean var2, boolean var3) {
      super(var1);
      this.horizontal = var2;
      this.invert = var3;
   }

   @Override
   public boolean isVertexIgnored(Object var1) {
      return super.isVertexIgnored(var1) || this.graph.getConnections(var1).length == 0;
   }

   public boolean isHorizontal() {
      return this.horizontal;
   }

   public void setHorizontal(boolean var1) {
      this.horizontal = var1;
   }

   public boolean isInvert() {
      return this.invert;
   }

   public void setInvert(boolean var1) {
      this.invert = var1;
   }

   public boolean isResizeParent() {
      return this.resizeParent;
   }

   public void setResizeParent(boolean var1) {
      this.resizeParent = var1;
   }

   public boolean isMoveTree() {
      return this.moveTree;
   }

   public void setMoveTree(boolean var1) {
      this.moveTree = var1;
   }

   public boolean isResetEdges() {
      return this.resetEdges;
   }

   public void setResetEdges(boolean var1) {
      this.resetEdges = var1;
   }

   public boolean isEdgeRouting() {
      return this.edgeRouting;
   }

   public void setEdgeRouting(boolean var1) {
      this.edgeRouting = var1;
   }

   public int getLevelDistance() {
      return this.levelDistance;
   }

   public void setLevelDistance(int var1) {
      this.levelDistance = var1;
   }

   public int getNodeDistance() {
      return this.nodeDistance;
   }

   public void setNodeDistance(int var1) {
      this.nodeDistance = var1;
   }

   public double getGroupPadding() {
      return this.groupPadding;
   }

   public void setGroupPadding(int var1) {
      this.groupPadding = var1;
   }

   @Override
   public void execute(Object var1) {
      super.execute(var1);
      this.execute(var1, null);
   }

   public void execute(Object var1, Object var2) {
      mxIGraphModel var3 = this.graph.getModel();
      if (var2 == null) {
         if (this.graph.getEdges(var1, var3.getParent(var1), this.invert, !this.invert, false).length > 0) {
            var2 = var1;
         } else {
            List var4 = this.findTreeRoots(var1, this.invert);
            if (var4.size() > 0) {
               for (int var5 = 0; var5 < var4.size(); var5++) {
                  if (!this.isVertexIgnored(var4.get(var5)) && this.graph.getEdges(var4.get(var5), null, this.invert, !this.invert, false).length > 0) {
                     var2 = var4.get(var5);
                     break;
                  }
               }
            }
         }
      }

      if (var2 != null) {
         if (this.resizeParent) {
            this.parentsChanged = new HashSet<>();
         } else {
            this.parentsChanged = null;
         }

         var3.beginUpdate();

         try {
            mxCompactTreeLayout.TreeNode var17 = this.dfs(var2, var1, null);
            if (var17 != null) {
               this.layout(var17);
               double var18 = this.graph.getGridSize();
               double var7 = var18;
               if (!this.moveTree) {
                  mxRectangle var9 = this.getVertexBounds(var2);
                  if (var9 != null) {
                     var18 = var9.getX();
                     var7 = var9.getY();
                  }
               }

               mxRectangle var19 = null;
               if (this.horizontal) {
                  var19 = this.horizontalLayout(var17, var18, var7, null);
               } else {
                  var19 = this.verticalLayout(var17, null, var18, var7, null);
               }

               if (var19 != null) {
                  double var10 = 0.0;
                  double var12 = 0.0;
                  if (var19.getX() < 0.0) {
                     var10 = Math.abs(var18 - var19.getX());
                  }

                  if (var19.getY() < 0.0) {
                     var12 = Math.abs(var7 - var19.getY());
                  }

                  if (var10 != 0.0 || var12 != 0.0) {
                     this.moveNode(var17, var10, var12);
                  }

                  if (this.resizeParent) {
                     this.adjustParents();
                  }

                  if (this.edgeRouting) {
                     this.localEdgeProcessing(var17);
                  }
               }
            }
         } finally {
            var3.endUpdate();
         }
      }
   }

   public List<Object> findTreeRoots(Object var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      if (var1 != null) {
         mxIGraphModel var4 = this.graph.getModel();
         int var5 = var4.getChildCount(var1);
         Object var6 = null;
         int var7 = 0;

         for (int var8 = 0; var8 < var5; var8++) {
            Object var9 = var4.getChildAt(var1, var8);
            if (var4.isVertex(var9) && this.graph.isCellVisible(var9)) {
               Object[] var10 = this.graph.getConnections(var9, var1, true);
               int var11 = 0;
               int var12 = 0;

               for (int var13 = 0; var13 < var10.length; var13++) {
                  Object var14 = this.graph.getView().getVisibleTerminal(var10[var13], true);
                  if (var14 == var9) {
                     var11++;
                  } else {
                     var12++;
                  }
               }

               if (var2 && var11 == 0 && var12 > 0 || !var2 && var12 == 0 && var11 > 0) {
                  var3.add(var9);
               }

               int var15 = var2 ? var12 - var11 : var11 - var12;
               if (var15 > var7) {
                  var7 = var15;
                  var6 = var9;
               }
            }
         }

         if (var3.isEmpty() && var6 != null) {
            var3.add(var6);
         }
      }

      return var3;
   }

   protected void moveNode(mxCompactTreeLayout.TreeNode var1, double var2, double var4) {
      var1.x += var2;
      var1.y += var4;
      this.apply(var1, null);

      for (mxCompactTreeLayout.TreeNode var6 = var1.child; var6 != null; var6 = var6.next) {
         this.moveNode(var6, var2, var4);
      }
   }

   protected mxCompactTreeLayout.TreeNode dfs(Object var1, Object var2, Set<Object> var3) {
      if (var3 == null) {
         var3 = new HashSet();
      }

      mxCompactTreeLayout.TreeNode var4 = null;
      if (var1 != null && !var3.contains(var1) && !this.isVertexIgnored(var1)) {
         var3.add(var1);
         var4 = this.createNode(var1);
         mxIGraphModel var5 = this.graph.getModel();
         mxCompactTreeLayout.TreeNode var6 = null;
         Object[] var7 = this.graph.getEdges(var1, var2, this.invert, !this.invert, false, true);
         mxGraphView var8 = this.graph.getView();

         for (int var9 = 0; var9 < var7.length; var9++) {
            Object var10 = var7[var9];
            if (!this.isEdgeIgnored(var10)) {
               if (this.resetEdges) {
                  this.setEdgePoints(var10, null);
               }

               if (this.edgeRouting) {
                  this.setEdgeStyleEnabled(var10, false);
                  this.setEdgePoints(var10, null);
               }

               mxCellState var11 = var8.getState(var10);
               Object var12 = var11 != null ? var11.getVisibleTerminal(this.invert) : var8.getVisibleTerminal(var10, this.invert);
               mxCompactTreeLayout.TreeNode var13 = this.dfs(var12, var2, var3);
               if (var13 != null && var5.getGeometry(var12) != null) {
                  if (var6 == null) {
                     var4.child = var13;
                  } else {
                     var6.next = var13;
                  }

                  var6 = var13;
               }
            }
         }
      }

      return var4;
   }

   protected void layout(mxCompactTreeLayout.TreeNode var1) {
      if (var1 != null) {
         for (mxCompactTreeLayout.TreeNode var2 = var1.child; var2 != null; var2 = var2.next) {
            this.layout(var2);
         }

         if (var1.child != null) {
            this.attachParent(var1, this.join(var1));
         } else {
            this.layoutLeaf(var1);
         }
      }
   }

   protected mxRectangle horizontalLayout(mxCompactTreeLayout.TreeNode var1, double var2, double var4, mxRectangle var6) {
      var1.x = var1.x + (var2 + var1.offsetX);
      var1.y = var1.y + (var4 + var1.offsetY);
      var6 = this.apply(var1, var6);
      mxCompactTreeLayout.TreeNode var7 = var1.child;
      if (var7 != null) {
         var6 = this.horizontalLayout(var7, var1.x, var1.y, var6);
         double var8 = var1.y + var7.offsetY;

         for (mxCompactTreeLayout.TreeNode var10 = var7.next; var10 != null; var10 = var10.next) {
            var6 = this.horizontalLayout(var10, var1.x + var7.offsetX, var8, var6);
            var8 += var10.offsetY;
         }
      }

      return var6;
   }

   protected mxRectangle verticalLayout(mxCompactTreeLayout.TreeNode var1, Object var2, double var3, double var5, mxRectangle var7) {
      var1.x = var1.x + (var3 + var1.offsetY);
      var1.y = var1.y + (var5 + var1.offsetX);
      var7 = this.apply(var1, var7);
      mxCompactTreeLayout.TreeNode var8 = var1.child;
      if (var8 != null) {
         var7 = this.verticalLayout(var8, var1, var1.x, var1.y, var7);
         double var9 = var1.x + var8.offsetY;

         for (mxCompactTreeLayout.TreeNode var11 = var8.next; var11 != null; var11 = var11.next) {
            var7 = this.verticalLayout(var11, var1, var9, var1.y + var8.offsetX, var7);
            var9 += var11.offsetY;
         }
      }

      return var7;
   }

   protected void attachParent(mxCompactTreeLayout.TreeNode var1, double var2) {
      double var4 = this.nodeDistance + this.levelDistance;
      double var6 = (var2 - var1.width) / 2.0 - this.nodeDistance;
      double var8 = var6 + var1.width + 2 * this.nodeDistance - var2;
      var1.child.offsetX = var4 + var1.height;
      var1.child.offsetY = var8;
      var1.contour.upperHead = this.createLine(var1.height, 0.0, this.createLine(var4, var8, var1.contour.upperHead));
      var1.contour.lowerHead = this.createLine(var1.height, 0.0, this.createLine(var4, var6, var1.contour.lowerHead));
   }

   protected void layoutLeaf(mxCompactTreeLayout.TreeNode var1) {
      double var2 = 2 * this.nodeDistance;
      var1.contour.upperTail = this.createLine(var1.height + var2, 0.0, null);
      var1.contour.upperHead = var1.contour.upperTail;
      var1.contour.lowerTail = this.createLine(0.0, -var1.width - var2, null);
      var1.contour.lowerHead = this.createLine(var1.height + var2, 0.0, var1.contour.lowerTail);
   }

   protected double join(mxCompactTreeLayout.TreeNode var1) {
      double var2 = 2 * this.nodeDistance;
      mxCompactTreeLayout.TreeNode var4 = var1.child;
      var1.contour = var4.contour;
      double var5 = var4.width + var2;
      double var7 = var5;

      for (mxCompactTreeLayout.TreeNode var11 = var4.next; var11 != null; var11 = var11.next) {
         double var9 = this.merge(var1.contour, var11.contour);
         var11.offsetY = var9 + var5;
         var11.offsetX = 0.0;
         var5 = var11.width + var2;
         var7 += var9 + var5;
      }

      return var7;
   }

   protected double merge(mxCompactTreeLayout.Polygon var1, mxCompactTreeLayout.Polygon var2) {
      double var3 = 0.0;
      double var5 = 0.0;
      double var7 = 0.0;
      mxCompactTreeLayout.Polyline var9 = var1.lowerHead;
      mxCompactTreeLayout.Polyline var10 = var2.upperHead;

      while (var10 != null && var9 != null) {
         double var11 = this.offset(var3, var5, var10.dx, var10.dy, var9.dx, var9.dy);
         var5 += var11;
         var7 += var11;
         if (var3 + var10.dx <= var9.dx) {
            var3 += var10.dx;
            var5 += var10.dy;
            var10 = var10.next;
         } else {
            var3 -= var9.dx;
            var5 -= var9.dy;
            var9 = var9.next;
         }
      }

      if (var10 != null) {
         mxCompactTreeLayout.Polyline var14 = this.bridge(var1.upperTail, 0.0, 0.0, var10, var3, var5);
         var1.upperTail = var14.next != null ? var2.upperTail : var14;
         var1.lowerTail = var2.lowerTail;
      } else {
         mxCompactTreeLayout.Polyline var15 = this.bridge(var2.lowerTail, var3, var5, var9, 0.0, 0.0);
         if (var15.next == null) {
            var1.lowerTail = var15;
         }
      }

      var1.lowerHead = var2.lowerHead;
      return var7;
   }

   protected double offset(double var1, double var3, double var5, double var7, double var9, double var11) {
      double var13 = 0.0;
      if (!(var9 <= var1) && !(var1 + var5 <= 0.0)) {
         double var15 = var9 * var7 - var5 * var11;
         if (var15 > 0.0) {
            if (var1 < 0.0) {
               double var17 = var1 * var7;
               var13 = var17 / var5 - var3;
            } else if (var1 > 0.0) {
               double var20 = var1 * var11;
               var13 = var20 / var9 - var3;
            } else {
               var13 = -var3;
            }
         } else if (var9 < var1 + var5) {
            double var21 = (var9 - var1) * var7;
            var13 = var11 - (var3 + var21 / var5);
         } else if (var9 > var1 + var5) {
            double var22 = (var5 + var1) * var11;
            var13 = var22 / var9 - (var3 + var7);
         } else {
            var13 = var11 - (var3 + var7);
         }

         return var13 > 0.0 ? var13 : 0.0;
      } else {
         return 0.0;
      }
   }

   protected mxCompactTreeLayout.Polyline bridge(
      mxCompactTreeLayout.Polyline var1, double var2, double var4, mxCompactTreeLayout.Polyline var6, double var7, double var9
   ) {
      double var11 = var7 + var6.dx - var2;
      double var13 = 0.0;
      double var15 = 0.0;
      if (var6.dx == 0.0) {
         var13 = var6.dy;
      } else {
         var15 = var11 * var6.dy;
         var13 = var15 / var6.dx;
      }

      mxCompactTreeLayout.Polyline var17 = this.createLine(var11, var13, var6.next);
      var1.next = this.createLine(0.0, var9 + var6.dy - var13 - var4, var17);
      return var17;
   }

   protected mxCompactTreeLayout.TreeNode createNode(Object var1) {
      mxCompactTreeLayout.TreeNode var2 = new mxCompactTreeLayout.TreeNode(var1);
      mxRectangle var3 = this.getVertexBounds(var1);
      if (var3 != null) {
         if (this.horizontal) {
            var2.width = var3.getHeight();
            var2.height = var3.getWidth();
         } else {
            var2.width = var3.getWidth();
            var2.height = var3.getHeight();
         }
      }

      return var2;
   }

   protected mxRectangle apply(mxCompactTreeLayout.TreeNode var1, mxRectangle var2) {
      mxIGraphModel var3 = this.graph.getModel();
      Object var4 = var1.cell;
      mxRectangle var5 = var3.getGeometry(var4);
      if (var4 != null && var5 != null) {
         if (this.isVertexMovable(var4)) {
            var5 = this.setVertexLocation(var4, var1.x, var1.y);
            if (this.resizeParent) {
               this.parentsChanged.add(var3.getParent(var4));
            }
         }

         if (var2 == null) {
            var2 = new mxRectangle(var5.getX(), var5.getY(), var5.getWidth(), var5.getHeight());
         } else {
            var2 = new mxRectangle(
               Math.min(var2.getX(), var5.getX()),
               Math.min(var2.getY(), var5.getY()),
               Math.max(var2.getX() + var2.getWidth(), var5.getX() + var5.getWidth()),
               Math.max(var2.getY() + var2.getHeight(), var5.getY() + var5.getHeight())
            );
         }
      }

      return var2;
   }

   protected mxCompactTreeLayout.Polyline createLine(double var1, double var3, mxCompactTreeLayout.Polyline var5) {
      return new mxCompactTreeLayout.Polyline(var1, var3, var5);
   }

   protected void adjustParents() {
      this.arrangeGroups(mxUtils.sortCells(this.parentsChanged, true).toArray(), this.groupPadding);
   }

   protected void localEdgeProcessing(mxCompactTreeLayout.TreeNode var1) {
      this.processNodeOutgoing(var1);

      for (mxCompactTreeLayout.TreeNode var2 = var1.child; var2 != null; var2 = var2.next) {
         this.localEdgeProcessing(var2);
      }
   }

   protected void processNodeOutgoing(mxCompactTreeLayout.TreeNode var1) {
      mxIGraphModel var2 = this.graph.getModel();
      mxCompactTreeLayout.TreeNode var3 = var1.child;
      Object var4 = var1.cell;
      int var5 = 0;
      ArrayList var6 = new ArrayList();

      while (var3 != null) {
         var5++;
         double var7 = var3.x;
         if (this.horizontal) {
            var7 = var3.y;
         }

         var6.add(new mxCompactTreeLayout.WeightedCellSorter(var3, (int)var7));
         var3 = var3.next;
      }

      mxCompactTreeLayout.WeightedCellSorter[] var32 = var6.toArray(new mxCompactTreeLayout.WeightedCellSorter[var6.size()]);
      Arrays.sort(var32);
      double var8 = var1.width;
      double var10 = (var5 + 1) * this.prefHozEdgeSep;
      if (var8 > var10 + 2 * this.prefHozEdgeSep) {
         var8 -= 2 * this.prefHozEdgeSep;
      }

      double var12 = var8 / var5;
      double var14 = var12 / 2.0;
      if (var8 > var10 + 2 * this.prefHozEdgeSep) {
         var14 += this.prefHozEdgeSep;
      }

      double var16 = this.minEdgeJetty - this.prefVertEdgeOff;
      double var18 = 0.0;
      mxRectangle var20 = this.getVertexBounds(var4);
      var3 = var1.child;

      for (int var21 = 0; var21 < var32.length; var21++) {
         Object var22 = var32[var21].cell.cell;
         mxRectangle var23 = this.getVertexBounds(var22);
         Object[] var24 = mxGraphModel.getEdgesBetween(var2, var4, var22);
         ArrayList var25 = new ArrayList(3);
         double var26 = 0.0;
         double var28 = 0.0;

         for (int var30 = 0; var30 < var24.length; var30++) {
            if (this.horizontal) {
               var26 = var20.getX() + var20.getWidth();
               var28 = var20.getY() + var14;
               var25.add(new mxPoint(var26, var28));
               var26 = var20.getX() + var20.getWidth() + var16;
               var25.add(new mxPoint(var26, var28));
               var28 = var23.getY() + var23.getHeight() / 2.0;
               var25.add(new mxPoint(var26, var28));
               this.setEdgePoints(var24[var30], var25);
            } else {
               var26 = var20.getX() + var14;
               var28 = var20.getY() + var20.getHeight();
               var25.add(new mxPoint(var26, var28));
               var28 = var20.getY() + var20.getHeight() + var16;
               var25.add(new mxPoint(var26, var28));
               var26 = var23.getX() + var23.getWidth() / 2.0;
               var25.add(new mxPoint(var26, var28));
               this.setEdgePoints(var24[var30], var25);
            }
         }

         if (var21 < var5 / 2.0F) {
            var16 += this.prefVertEdgeOff;
         } else if (var21 > var5 / 2.0F) {
            var16 -= this.prefVertEdgeOff;
         }

         var14 += var12;
         var18 = Math.max(var18, var16);
      }
   }

   protected static class Polygon {
      protected mxCompactTreeLayout.Polyline lowerHead;
      protected mxCompactTreeLayout.Polyline lowerTail;
      protected mxCompactTreeLayout.Polyline upperHead;
      protected mxCompactTreeLayout.Polyline upperTail;
   }

   protected static class Polyline {
      protected double dx;
      protected double dy;
      protected mxCompactTreeLayout.Polyline next;

      protected Polyline(double var1, double var3, mxCompactTreeLayout.Polyline var5) {
         this.dx = var1;
         this.dy = var3;
         this.next = var5;
      }
   }

   protected static class TreeNode {
      protected Object cell;
      protected double x;
      protected double y;
      protected double width;
      protected double height;
      protected double offsetX;
      protected double offsetY;
      protected mxCompactTreeLayout.TreeNode child;
      protected mxCompactTreeLayout.TreeNode next;
      protected mxCompactTreeLayout.Polygon contour = new mxCompactTreeLayout.Polygon();

      public TreeNode(Object var1) {
         this.cell = var1;
      }
   }

   protected class WeightedCellSorter implements Comparable<Object> {
      public int weightedValue = 0;
      public boolean nudge = false;
      public boolean visited = false;
      public mxCompactTreeLayout.TreeNode cell = null;

      public WeightedCellSorter() {
         this(null, 0);
      }

      public WeightedCellSorter(mxCompactTreeLayout.TreeNode var2, int var3) {
         this.cell = var2;
         this.weightedValue = var3;
      }

      @Override
      public int compareTo(Object var1) {
         if (var1 instanceof mxCompactTreeLayout.WeightedCellSorter) {
            if (this.weightedValue > ((mxCompactTreeLayout.WeightedCellSorter)var1).weightedValue) {
               return 1;
            }

            if (this.weightedValue < ((mxCompactTreeLayout.WeightedCellSorter)var1).weightedValue) {
               return -1;
            }
         }

         return 0;
      }
   }
}
