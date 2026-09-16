package com.mxgraph.layout;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.util.List;
import java.util.Map;

public abstract class mxGraphLayout implements mxIGraphLayout {
   protected mxGraph graph;
   protected Object parent;
   protected boolean useBoundingBox = true;

   public mxGraphLayout(mxGraph var1) {
      this.graph = var1;
   }

   @Override
   public void execute(Object var1) {
      this.parent = var1;
   }

   @Override
   public void moveCell(Object var1, double var2, double var4) {
   }

   public mxGraph getGraph() {
      return this.graph;
   }

   public Object getConstraint(Object var1, Object var2) {
      return this.getConstraint(var1, var2, null, false);
   }

   public Object getConstraint(Object var1, Object var2, Object var3, boolean var4) {
      mxCellState var5 = this.graph.getView().getState(var2);
      Map var6 = var5 != null ? var5.getStyle() : this.graph.getCellStyle(var2);
      return var6 != null ? var6.get(var1) : null;
   }

   public boolean isUseBoundingBox() {
      return this.useBoundingBox;
   }

   public void setUseBoundingBox(boolean var1) {
      this.useBoundingBox = var1;
   }

   public boolean isVertexMovable(Object var1) {
      return this.graph.isCellMovable(var1);
   }

   public boolean isVertexIgnored(Object var1) {
      return !this.graph.getModel().isVertex(var1) || !this.graph.isCellVisible(var1);
   }

   public boolean isEdgeIgnored(Object var1) {
      mxIGraphModel var2 = this.graph.getModel();
      return !var2.isEdge(var1) || !this.graph.isCellVisible(var1) || var2.getTerminal(var1, true) == null || var2.getTerminal(var1, false) == null;
   }

   public void setEdgeStyleEnabled(Object var1, boolean var2) {
      this.graph.setCellStyles(mxConstants.STYLE_NOEDGESTYLE, var2 ? "0" : "1", new Object[]{var1});
   }

   public void setOrthogonalEdge(Object var1, boolean var2) {
      this.graph.setCellStyles(mxConstants.STYLE_ORTHOGONAL, var2 ? "1" : "0", new Object[]{var1});
   }

   public mxPoint getParentOffset(Object var1) {
      mxPoint var2 = new mxPoint();
      if (var1 != null && var1 != this.parent) {
         mxIGraphModel var3 = this.graph.getModel();
         if (var3.isAncestor(this.parent, var1)) {
            for (mxGeometry var4 = var3.getGeometry(var1); var1 != this.parent; var4 = var3.getGeometry(var1)) {
               var2.setX(var2.getX() + var4.getX());
               var2.setY(var2.getY() + var4.getY());
               var1 = var3.getParent(var1);
            }
         }
      }

      return var2;
   }

   public void setEdgePoints(Object var1, List<mxPoint> var2) {
      mxIGraphModel var3 = this.graph.getModel();
      mxGeometry var4 = var3.getGeometry(var1);
      if (var4 == null) {
         var4 = new mxGeometry();
         var4.setRelative(true);
      } else {
         var4 = (mxGeometry)var4.clone();
      }

      if (this.parent != null && var2 != null) {
         Object var5 = this.graph.getModel().getParent(var1);
         mxPoint var6 = this.getParentOffset(var5);

         for (mxPoint var8 : var2) {
            var8.setX(var8.getX() - var6.getX());
            var8.setY(var8.getY() - var6.getY());
         }
      }

      var4.setPoints(var2);
      var3.setGeometry(var1, var4);
   }

   public mxRectangle getVertexBounds(Object var1) {
      mxRectangle var2 = this.graph.getModel().getGeometry(var1);
      if (this.useBoundingBox) {
         mxCellState var3 = this.graph.getView().getState(var1);
         if (var3 != null) {
            double var4 = this.graph.getView().getScale();
            mxRectangle var6 = var3.getBoundingBox();
            double var7 = (var6.getX() - var3.getX()) / var4;
            double var9 = (var6.getY() - var3.getY()) / var4;
            double var11 = (var6.getX() + var6.getWidth() - var3.getX() - var3.getWidth()) / var4;
            double var13 = (var6.getY() + var6.getHeight() - var3.getY() - var3.getHeight()) / var4;
            var2 = new mxRectangle(var2.getX() + var7, var2.getY() + var9, var2.getWidth() - var7 + var11, var2.getHeight() + -var9 + var13);
         }
      }

      if (this.parent != null) {
         Object var15 = this.graph.getModel().getParent(var1);
         var2 = (mxRectangle)var2.clone();
         if (var15 != null && var15 != this.parent) {
            mxPoint var16 = this.getParentOffset(var15);
            var2.setX(var2.getX() + var16.getX());
            var2.setY(var2.getY() + var16.getY());
         }
      }

      return new mxRectangle(var2);
   }

   public mxRectangle setVertexLocation(Object var1, double var2, double var4) {
      mxIGraphModel var6 = this.graph.getModel();
      mxGeometry var7 = var6.getGeometry(var1);
      mxRectangle var8 = null;
      if (var7 != null) {
         var8 = new mxRectangle(var2, var4, var7.getWidth(), var7.getHeight());
         mxGraphView var9 = this.graph.getView();
         if (this.useBoundingBox) {
            mxCellState var10 = var9.getState(var1);
            if (var10 != null) {
               double var11 = this.graph.getView().getScale();
               mxRectangle var13 = var10.getBoundingBox();
               if (var10.getBoundingBox().getX() < var10.getX()) {
                  var2 += (var10.getX() - var13.getX()) / var11;
                  var8.setWidth(var13.getWidth());
               }

               if (var10.getBoundingBox().getY() < var10.getY()) {
                  var4 += (var10.getY() - var13.getY()) / var11;
                  var8.setHeight(var13.getHeight());
               }
            }
         }

         if (this.parent != null) {
            Object var15 = var6.getParent(var1);
            if (var15 != null && var15 != this.parent) {
               mxPoint var16 = this.getParentOffset(var15);
               var2 -= var16.getX();
               var4 -= var16.getY();
            }
         }

         if (var7.getX() != var2 || var7.getY() != var4) {
            var7 = (mxGeometry)var7.clone();
            var7.setX(var2);
            var7.setY(var4);
            var6.setGeometry(var1, var7);
         }
      }

      return var8;
   }

   public void arrangeGroups(Object[] var1, int var2) {
      this.graph.getModel().beginUpdate();

      try {
         for (int var3 = var1.length - 1; var3 >= 0; var3--) {
            Object var4 = var1[var3];
            Object[] var5 = this.graph.getChildVertices(var4);
            mxRectangle var6 = this.graph.getBoundingBoxFromGeometry(var5);
            mxGeometry var7 = this.graph.getCellGeometry(var4);
            double var8 = 0.0;
            double var10 = 0.0;
            if (this.graph.isSwimlane(var4)) {
               mxRectangle var12 = this.graph.getStartSize(var4);
               var8 = var12.getWidth();
               var10 = var12.getHeight();
            }

            if (var6 != null && var7 != null) {
               var7 = (mxGeometry)var7.clone();
               var7.setX(var7.getX() + var6.getX() - var2 - var8);
               var7.setY(var7.getY() + var6.getY() - var2 - var10);
               var7.setWidth(var6.getWidth() + 2 * var2 + var8);
               var7.setHeight(var6.getHeight() + 2 * var2 + var10);
               this.graph.getModel().setGeometry(var4, var7);
               this.graph.moveCells(var5, var2 + var8 - var6.getX(), var2 + var10 - var6.getY());
            }
         }
      } finally {
         this.graph.getModel().endUpdate();
      }
   }
}
