package com.mxgraph.layout;

import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;
import java.util.ArrayList;

public class mxCircleLayout extends mxGraphLayout {
   protected double radius;
   protected boolean moveCircle = true;
   protected double x0 = 0.0;
   protected double y0 = 0.0;
   protected boolean resetEdges = false;
   protected boolean disableEdgeStyle = true;

   public mxCircleLayout(mxGraph var1) {
      this(var1, 100.0);
   }

   public mxCircleLayout(mxGraph var1, double var2) {
      super(var1);
      this.radius = var2;
   }

   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double var1) {
      this.radius = var1;
   }

   public boolean isMoveCircle() {
      return this.moveCircle;
   }

   public void setMoveCircle(boolean var1) {
      this.moveCircle = var1;
   }

   public double getX0() {
      return this.x0;
   }

   public void setX0(double var1) {
      this.x0 = var1;
   }

   public double getY0() {
      return this.y0;
   }

   public void setY0(double var1) {
      this.y0 = var1;
   }

   public boolean isResetEdges() {
      return this.resetEdges;
   }

   public void setResetEdges(boolean var1) {
      this.resetEdges = var1;
   }

   public boolean isDisableEdgeStyle() {
      return this.disableEdgeStyle;
   }

   public void setDisableEdgeStyle(boolean var1) {
      this.disableEdgeStyle = var1;
   }

   @Override
   public void execute(Object var1) {
      mxIGraphModel var2 = this.graph.getModel();
      var2.beginUpdate();

      try {
         double var3 = 0.0;
         Double var5 = null;
         Double var6 = null;
         ArrayList var7 = new ArrayList();
         int var8 = var2.getChildCount(var1);

         for (int var9 = 0; var9 < var8; var9++) {
            Object var10 = var2.getChildAt(var1, var9);
            if (!this.isVertexIgnored(var10)) {
               var7.add(var10);
               mxRectangle var11 = this.getVertexBounds(var10);
               if (var5 == null) {
                  var5 = var11.getY();
               } else {
                  var5 = Math.min(var5, var11.getY());
               }

               if (var6 == null) {
                  var6 = var11.getX();
               } else {
                  var6 = Math.min(var6, var11.getX());
               }

               var3 = Math.max(var3, Math.max(var11.getWidth(), var11.getHeight()));
            } else if (!this.isEdgeIgnored(var10)) {
               if (this.isResetEdges()) {
                  this.graph.resetEdge(var10);
               }

               if (this.isDisableEdgeStyle()) {
                  this.setEdgeStyleEnabled(var10, false);
               }
            }
         }

         int var15 = var7.size();
         double var16 = Math.max(var15 * var3 / Math.PI, this.radius);
         if (this.moveCircle) {
            var6 = this.x0;
            var5 = this.y0;
         }

         this.circle(var7.toArray(), var16, var6, var5);
      } finally {
         var2.endUpdate();
      }
   }

   public void circle(Object[] var1, double var2, double var4, double var6) {
      int var8 = var1.length;
      double var9 = (Math.PI * 2) / var8;

      for (int var11 = 0; var11 < var8; var11++) {
         if (this.isVertexMovable(var1[var11])) {
            this.setVertexLocation(var1[var11], var4 + var2 + var2 * Math.sin(var11 * var9), var6 + var2 + var2 * Math.cos(var11 * var9));
         }
      }
   }
}
