package com.mxgraph.view;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUndoableEdit;
import com.mxgraph.util.mxUtils;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class mxGraphView extends mxEventSource {
   private static mxPoint EMPTY_POINT = new mxPoint();
   protected mxGraph graph;
   protected Object currentRoot = null;
   protected mxRectangle graphBounds = new mxRectangle();
   protected double scale = 1.0;
   protected mxPoint translate = new mxPoint(0.0, 0.0);
   protected Hashtable<Object, mxCellState> states = new Hashtable<>();

   public mxGraphView(mxGraph var1) {
      this.graph = var1;
   }

   public mxGraph getGraph() {
      return this.graph;
   }

   public Hashtable<Object, mxCellState> getStates() {
      return this.states;
   }

   public void setStates(Hashtable<Object, mxCellState> var1) {
      this.states = var1;
   }

   public mxRectangle getGraphBounds() {
      return this.graphBounds;
   }

   public void setGraphBounds(mxRectangle var1) {
      this.graphBounds = var1;
   }

   public Object getCurrentRoot() {
      return this.currentRoot;
   }

   public Object setCurrentRoot(Object var1) {
      if (this.currentRoot != var1) {
         mxGraphView.mxCurrentRootChange var2 = new mxGraphView.mxCurrentRootChange(this, var1);
         var2.execute();
         mxUndoableEdit var3 = new mxUndoableEdit(this, false);
         var3.add(var2);
         this.fireEvent(new mxEventObject("undo", "edit", var3));
      }

      return var1;
   }

   public void scaleAndTranslate(double var1, double var3, double var5) {
      double var7 = this.scale;
      Object var9 = this.translate.clone();
      if (var1 != this.scale || var3 != this.translate.getX() || var5 != this.translate.getY()) {
         this.scale = var1;
         this.translate = new mxPoint(var3, var5);
         if (this.isEventsEnabled()) {
            this.revalidate();
         }
      }

      this.fireEvent(new mxEventObject("scaleAndTranslate", "scale", var1, "previousScale", var7, "translate", this.translate, "previousTranslate", var9));
   }

   public double getScale() {
      return this.scale;
   }

   public void setScale(double var1) {
      double var3 = this.scale;
      if (this.scale != var1) {
         this.scale = var1;
         if (this.isEventsEnabled()) {
            this.revalidate();
         }
      }

      this.fireEvent(new mxEventObject("scale", "scale", this.scale, "previousScale", var3));
   }

   public mxPoint getTranslate() {
      return this.translate;
   }

   public void setTranslate(mxPoint var1) {
      Object var2 = this.translate.clone();
      if (var1 != null && (var1.getX() != this.translate.getX() || var1.getY() != this.translate.getY())) {
         this.translate = var1;
         if (this.isEventsEnabled()) {
            this.revalidate();
         }
      }

      this.fireEvent(new mxEventObject("translate", "translate", this.translate, "previousTranslate", var2));
   }

   public mxRectangle getBounds(Object[] var1) {
      return this.getBounds(var1, false);
   }

   public mxRectangle getBoundingBox(Object[] var1) {
      return this.getBounds(var1, true);
   }

   public mxRectangle getBounds(Object[] var1, boolean var2) {
      mxRectangle var3 = null;
      if (var1 != null && var1.length > 0) {
         mxIGraphModel var4 = this.graph.getModel();

         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var4.isVertex(var1[var5]) || var4.isEdge(var1[var5])) {
               mxCellState var6 = this.getState(var1[var5]);
               if (var6 != null) {
                  mxRectangle var7 = var2 ? var6.getBoundingBox() : var6;
                  if (var7 != null) {
                     if (var3 == null) {
                        var3 = new mxRectangle(var7);
                     } else {
                        var3.add(var7);
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   public void reload() {
      this.states.clear();
      this.validate();
   }

   public void revalidate() {
      this.invalidate();
      this.validate();
   }

   public void invalidate() {
      this.invalidate(null);
   }

   public void clear(Object var1, boolean var2, boolean var3) {
      this.removeState(var1);
      if (var3 && (var2 || var1 != this.currentRoot)) {
         mxIGraphModel var4 = this.graph.getModel();
         int var5 = var4.getChildCount(var1);

         for (int var6 = 0; var6 < var5; var6++) {
            this.clear(var4.getChildAt(var1, var6), var2, var3);
         }
      } else {
         this.invalidate(var1);
      }
   }

   public void invalidate(Object var1) {
      mxIGraphModel var2 = this.graph.getModel();
      var1 = var1 != null ? var1 : var2.getRoot();
      mxCellState var3 = this.getState(var1);
      if (var3 == null || !var3.isInvalid()) {
         if (var3 != null) {
            var3.setInvalid(true);
         }

         int var4 = var2.getChildCount(var1);

         for (int var5 = 0; var5 < var4; var5++) {
            Object var6 = var2.getChildAt(var1, var5);
            this.invalidate(var6);
         }

         int var8 = var2.getEdgeCount(var1);

         for (int var9 = 0; var9 < var8; var9++) {
            this.invalidate(var2.getEdgeAt(var1, var9));
         }
      }
   }

   public void validate() {
      mxRectangle var1 = this.getBoundingBox(
         this.validateCellState(this.validateCell(this.currentRoot != null ? this.currentRoot : this.graph.getModel().getRoot()))
      );
      this.setGraphBounds(var1 != null ? var1 : new mxRectangle());
   }

   public mxRectangle getBoundingBox(mxCellState var1) {
      return this.getBoundingBox(var1, true);
   }

   public mxRectangle getBoundingBox(mxCellState var1, boolean var2) {
      mxRectangle var3 = null;
      if (var1 != null) {
         if (var1.getBoundingBox() != null) {
            var3 = (mxRectangle)var1.getBoundingBox().clone();
         }

         if (var2) {
            mxIGraphModel var4 = this.graph.getModel();
            int var5 = var4.getChildCount(var1.getCell());

            for (int var6 = 0; var6 < var5; var6++) {
               mxRectangle var7 = this.getBoundingBox(this.getState(var4.getChildAt(var1.getCell(), var6)), true);
               if (var7 != null) {
                  if (var3 == null) {
                     var3 = var7;
                  } else {
                     var3.add(var7);
                  }
               }
            }
         }
      }

      return var3;
   }

   public Object validateCell(Object var1) {
      return this.validateCell(var1, true);
   }

   public Object validateCell(Object var1, boolean var2) {
      if (var1 != null) {
         var2 = var2 && this.graph.isCellVisible(var1);
         mxCellState var3 = this.getState(var1, var2);
         if (var3 != null && !var2) {
            this.removeState(var1);
         } else {
            mxIGraphModel var4 = this.graph.getModel();
            int var5 = var4.getChildCount(var1);

            for (int var6 = 0; var6 < var5; var6++) {
               this.validateCell(var4.getChildAt(var1, var6), var2 && (!this.graph.isCellCollapsed(var1) || var1 == this.currentRoot));
            }
         }
      }

      return var1;
   }

   public mxCellState validateCellState(Object var1) {
      return this.validateCellState(var1, true);
   }

   public mxCellState validateCellState(Object var1, boolean var2) {
      mxCellState var3 = null;
      if (var1 != null) {
         var3 = this.getState(var1);
         if (var3 != null) {
            mxIGraphModel var4 = this.graph.getModel();
            if (var3.isInvalid()) {
               var3.setInvalid(false);
               if (var1 != this.currentRoot) {
                  this.validateCellState(var4.getParent(var1), false);
               }

               var3.setVisibleTerminalState(this.validateCellState(this.getVisibleTerminal(var1, true), false), true);
               var3.setVisibleTerminalState(this.validateCellState(this.getVisibleTerminal(var1, false), false), false);
               this.updateCellState(var3);
               if (var4.isEdge(var1) || var4.isVertex(var1)) {
                  this.updateLabelBounds(var3);
                  this.updateBoundingBox(var3);
               }
            }

            if (var2) {
               int var5 = var4.getChildCount(var1);

               for (int var6 = 0; var6 < var5; var6++) {
                  this.validateCellState(var4.getChildAt(var1, var6));
               }
            }
         }
      }

      return var3;
   }

   public void updateCellState(mxCellState var1) {
      var1.getAbsoluteOffset().setX(0.0);
      var1.getAbsoluteOffset().setY(0.0);
      var1.getOrigin().setX(0.0);
      var1.getOrigin().setY(0.0);
      var1.setLength(0.0);
      if (var1.getCell() != this.currentRoot) {
         mxIGraphModel var2 = this.graph.getModel();
         mxCellState var3 = this.getState(var2.getParent(var1.getCell()));
         if (var3 != null && var3.getCell() != this.currentRoot) {
            var1.getOrigin().setX(var1.getOrigin().getX() + var3.getOrigin().getX());
            var1.getOrigin().setY(var1.getOrigin().getY() + var3.getOrigin().getY());
         }

         mxPoint var4 = this.graph.getChildOffsetForCell(var1.getCell());
         if (var4 != null) {
            var1.getOrigin().setX(var1.getOrigin().getX() + var4.getX());
            var1.getOrigin().setY(var1.getOrigin().getY() + var4.getY());
         }

         mxGeometry var5 = this.graph.getCellGeometry(var1.getCell());
         if (var5 != null) {
            if (!var2.isEdge(var1.getCell())) {
               mxPoint var6 = var1.getOrigin();
               var4 = var5.getOffset();
               if (var4 == null) {
                  var4 = EMPTY_POINT;
               }

               if (!var5.isRelative() || var3 == null) {
                  var1.setAbsoluteOffset(new mxPoint(this.scale * var4.getX(), this.scale * var4.getY()));
                  var6.setX(var6.getX() + var5.getX());
                  var6.setY(var6.getY() + var5.getY());
               } else if (var2.isEdge(var3.getCell())) {
                  mxPoint var7 = this.getPoint(var3, var5);
                  if (var7 != null) {
                     var6.setX(var6.getX() + var7.getX() / this.scale - var3.getOrigin().getX() - this.translate.getX());
                     var6.setY(var6.getY() + var7.getY() / this.scale - var3.getOrigin().getY() - this.translate.getY());
                  }
               } else {
                  var6.setX(var6.getX() + var5.getX() * var3.getWidth() / this.scale + var4.getX());
                  var6.setY(var6.getY() + var5.getY() * var3.getHeight() / this.scale + var4.getY());
               }
            }

            var1.setX(this.scale * (this.translate.getX() + var1.getOrigin().getX()));
            var1.setY(this.scale * (this.translate.getY() + var1.getOrigin().getY()));
            var1.setWidth(this.scale * var5.getWidth());
            var1.setHeight(this.scale * var5.getHeight());
            if (var2.isVertex(var1.getCell())) {
               this.updateVertexState(var1, var5);
            }

            if (var2.isEdge(var1.getCell())) {
               this.updateEdgeState(var1, var5);
            }

            this.updateLabel(var1);
         }
      }
   }

   public void updateVertexState(mxCellState var1, mxGeometry var2) {
      this.updateVertexLabelOffset(var1);
   }

   public void updateEdgeState(mxCellState var1, mxGeometry var2) {
      mxCellState var3 = var1.getVisibleTerminalState(true);
      mxCellState var4 = var1.getVisibleTerminalState(false);
      if ((this.graph.getModel().getTerminal(var1.getCell(), true) == null || var3 != null)
         && (var3 != null || var2.getTerminalPoint(true) != null)
         && (this.graph.getModel().getTerminal(var1.getCell(), false) == null || var4 != null)
         && (var4 != null || var2.getTerminalPoint(false) != null)) {
         this.updateFixedTerminalPoints(var1, var3, var4);
         this.updatePoints(var1, var2.getPoints(), var3, var4);
         this.updateFloatingTerminalPoints(var1, var3, var4);
         if (var1.getCell() == this.getCurrentRoot()
            || var1.getAbsolutePointCount() >= 2 && var1.getAbsolutePoint(0) != null && var1.getAbsolutePoint(var1.getAbsolutePointCount() - 1) != null) {
            this.updateEdgeBounds(var1);
            var1.setAbsoluteOffset(this.getPoint(var1, var2));
         } else {
            this.clear(var1.getCell(), true, true);
         }
      } else {
         this.clear(var1.getCell(), true, true);
      }
   }

   public void updateVertexLabelOffset(mxCellState var1) {
      String var2 = mxUtils.getString(var1.getStyle(), mxConstants.STYLE_LABEL_POSITION, "center");
      if (var2.equals("left")) {
         var1.absoluteOffset.setX(var1.absoluteOffset.getX() - var1.getWidth());
      } else if (var2.equals("right")) {
         var1.absoluteOffset.setX(var1.absoluteOffset.getX() + var1.getWidth());
      }

      String var3 = mxUtils.getString(var1.getStyle(), mxConstants.STYLE_VERTICAL_LABEL_POSITION, "middle");
      if (var3.equals("top")) {
         var1.absoluteOffset.setY(var1.absoluteOffset.getY() - var1.getHeight());
      } else if (var3.equals("bottom")) {
         var1.absoluteOffset.setY(var1.absoluteOffset.getY() + var1.getHeight());
      }
   }

   public void updateLabel(mxCellState var1) {
      String var2 = this.graph.getLabel(var1.getCell());
      Map var3 = var1.getStyle();
      if (var2 != null
         && var2.length() > 0
         && !this.graph.isHtmlLabel(var1.getCell())
         && !this.graph.getModel().isEdge(var1.getCell())
         && mxUtils.getString(var3, mxConstants.STYLE_WHITE_SPACE, "nowrap").equals("wrap")) {
         double var4 = this.getWordWrapWidth(var1);
         String[] var6 = mxUtils.wordWrap(var2, mxUtils.getFontMetrics(mxUtils.getFont(var1.getStyle())), var4 * mxConstants.LABEL_SCALE_BUFFER);
         if (var6.length > 0) {
            StringBuffer var7 = new StringBuffer();

            for (String var11 : var6) {
               var7.append(var11 + '\n');
            }

            var2 = var7.substring(0, var7.length() - 1);
         }
      }

      var1.setLabel(var2);
   }

   public double getWordWrapWidth(mxCellState var1) {
      Map var2 = var1.getStyle();
      boolean var3 = mxUtils.isTrue(var2, mxConstants.STYLE_HORIZONTAL, true);
      double var4 = 0.0;
      if (var3) {
         var4 = var1.getWidth() / this.scale
            - 2 * mxConstants.LABEL_INSET
            - 2.0 * mxUtils.getDouble(var2, mxConstants.STYLE_SPACING)
            - mxUtils.getDouble(var2, mxConstants.STYLE_SPACING_LEFT)
            - mxUtils.getDouble(var2, mxConstants.STYLE_SPACING_RIGHT);
      } else {
         var4 = var1.getHeight() / this.scale
            - 2 * mxConstants.LABEL_INSET
            - 2.0 * mxUtils.getDouble(var2, mxConstants.STYLE_SPACING)
            - mxUtils.getDouble(var2, mxConstants.STYLE_SPACING_TOP)
            + mxUtils.getDouble(var2, mxConstants.STYLE_SPACING_BOTTOM);
      }

      return var4;
   }

   public void updateLabelBounds(mxCellState var1) {
      Object var2 = var1.getCell();
      Map var3 = var1.getStyle();
      String var4 = mxUtils.getString(var3, mxConstants.STYLE_OVERFLOW, "");
      if (var4.equals("fill")) {
         var1.setLabelBounds(new mxRectangle(var1));
      } else if (var1.getLabel() != null) {
         mxRectangle var5 = var1;
         if (this.graph.getModel().isEdge(var2)) {
            mxGeometry var6 = this.graph.getCellGeometry(var2);
            if (var6 != null && var6.getWidth() > 0.0) {
               var5 = new mxRectangle(0.0, 0.0, var6.getWidth() * this.getScale(), 0.0);
            } else {
               var5 = null;
            }
         }

         var1.setLabelBounds(
            mxUtils.getLabelPaintBounds(
               var1.getLabel(), var3, this.graph.isHtmlLabel(var2), var1.getAbsoluteOffset(), var5, this.scale, this.graph.getModel().isEdge(var2)
            )
         );
         if (var4.equals("width")) {
            var1.getLabelBounds().setX(var1.getX());
            var1.getLabelBounds().setWidth(var1.getWidth());
         }
      }
   }

   public mxRectangle updateBoundingBox(mxCellState var1) {
      mxRectangle var2 = new mxRectangle(var1);
      Map var3 = var1.getStyle();
      double var4 = Math.max(1L, Math.round(mxUtils.getInt(var3, mxConstants.STYLE_STROKEWIDTH, 1) * this.scale));
      var4 -= Math.max(1.0, var4 / 2.0);
      if (this.graph.getModel().isEdge(var1.getCell())) {
         int var6 = 0;
         if (var3.containsKey(mxConstants.STYLE_ENDARROW) || var3.containsKey(mxConstants.STYLE_STARTARROW)) {
            var6 = (int)Math.round(mxConstants.DEFAULT_MARKERSIZE * this.scale);
         }

         var2.grow(var6 + var4);
         if (mxUtils.getString(var3, mxConstants.STYLE_SHAPE, "").equals("arrow")) {
            var2.grow(mxConstants.ARROW_WIDTH / 2);
         }
      } else {
         var2.grow(var4);
      }

      if (mxUtils.isTrue(var3, mxConstants.STYLE_SHADOW)) {
         var2.setWidth(var2.getWidth() + mxConstants.SHADOW_OFFSETX);
         var2.setHeight(var2.getHeight() + mxConstants.SHADOW_OFFSETY);
      }

      if (mxUtils.getString(var3, mxConstants.STYLE_SHAPE, "").equals("label") && mxUtils.getString(var3, mxConstants.STYLE_IMAGE) != null) {
         double var17 = mxUtils.getInt(var3, mxConstants.STYLE_IMAGE_WIDTH, mxConstants.DEFAULT_IMAGESIZE) * this.scale;
         double var8 = mxUtils.getInt(var3, mxConstants.STYLE_IMAGE_HEIGHT, mxConstants.DEFAULT_IMAGESIZE) * this.scale;
         double var10 = var1.getX();
         double var12 = 0.0;
         String var14 = mxUtils.getString(var3, mxConstants.STYLE_IMAGE_ALIGN, "left");
         String var15 = mxUtils.getString(var3, mxConstants.STYLE_IMAGE_VERTICAL_ALIGN, "middle");
         if (var14.equals("right")) {
            var10 += var1.getWidth() - var17;
         } else if (var14.equals("center")) {
            var10 += (var1.getWidth() - var17) / 2.0;
         }

         if (var15.equals("top")) {
            var12 = var1.getY();
         } else if (var15.equals("bottom")) {
            var12 = var1.getY() + var1.getHeight() - var8;
         } else {
            var12 = var1.getY() + (var1.getHeight() - var8) / 2.0;
         }

         var2.add(new mxRectangle(var10, var12, var17, var8));
      }

      double var18 = mxUtils.getDouble(var3, mxConstants.STYLE_ROTATION);
      mxRectangle var19 = mxUtils.getBoundingBox(var2, var18);
      var2.add(var19);
      var2.add(var1.getLabelBounds());
      var1.setBoundingBox(var2);
      return var2;
   }

   public void updateFixedTerminalPoints(mxCellState var1, mxCellState var2, mxCellState var3) {
      this.updateFixedTerminalPoint(var1, var2, true, this.graph.getConnectionConstraint(var1, var2, true));
      this.updateFixedTerminalPoint(var1, var3, false, this.graph.getConnectionConstraint(var1, var3, false));
   }

   public void updateFixedTerminalPoint(mxCellState var1, mxCellState var2, boolean var3, mxConnectionConstraint var4) {
      mxPoint var5 = null;
      if (var4 != null) {
         var5 = this.graph.getConnectionPoint(var2, var4);
      }

      if (var5 == null && var2 == null) {
         mxPoint var6 = var1.getOrigin();
         mxGeometry var7 = this.graph.getCellGeometry(var1.getCell());
         var5 = var7.getTerminalPoint(var3);
         if (var5 != null) {
            var5 = new mxPoint(
               this.scale * (this.translate.getX() + var5.getX() + var6.getX()), this.scale * (this.translate.getY() + var5.getY() + var6.getY())
            );
         }
      }

      var1.setAbsoluteTerminalPoint(var5, var3);
   }

   public void updatePoints(mxCellState var1, List<mxPoint> var2, mxCellState var3, mxCellState var4) {
      if (var1 != null) {
         ArrayList var5 = new ArrayList();
         var5.add(var1.getAbsolutePoint(0));
         mxEdgeStyle.mxEdgeStyleFunction var6 = this.getEdgeStyle(var1, var2, var3, var4);
         if (var6 != null) {
            mxCellState var9 = this.getTerminalPort(var1, var3, true);
            mxCellState var8 = this.getTerminalPort(var1, var4, false);
            var6.apply(var1, var9, var8, var2, var5);
         } else if (var2 != null) {
            for (int var7 = 0; var7 < var2.size(); var7++) {
               var5.add(this.transformControlPoint(var1, (mxPoint)var2.get(var7)));
            }
         }

         var5.add(var1.getAbsolutePoint(var1.getAbsolutePointCount() - 1));
         var1.setAbsolutePoints(var5);
      }
   }

   public mxPoint transformControlPoint(mxCellState var1, mxPoint var2) {
      mxPoint var3 = var1.getOrigin();
      return new mxPoint(this.scale * (var2.getX() + this.translate.getX() + var3.getX()), this.scale * (var2.getY() + this.translate.getY() + var3.getY()));
   }

   public mxEdgeStyle.mxEdgeStyleFunction getEdgeStyle(mxCellState var1, List<mxPoint> var2, Object var3, Object var4) {
      Object var5 = null;
      if (var3 != null && var3 == var4) {
         var5 = var1.getStyle().get(mxConstants.STYLE_LOOP);
         if (var5 == null) {
            var5 = this.graph.getDefaultLoopStyle();
         }
      } else if (!mxUtils.isTrue(var1.getStyle(), mxConstants.STYLE_NOEDGESTYLE, false)) {
         var5 = var1.getStyle().get(mxConstants.STYLE_EDGE);
      }

      if (var5 instanceof String) {
         String var6 = String.valueOf(var5);
         Object var7 = mxStyleRegistry.getValue(var6);
         if (var7 == null) {
            var7 = mxUtils.eval(var6);
         }

         var5 = var7;
      }

      return var5 instanceof mxEdgeStyle.mxEdgeStyleFunction ? (mxEdgeStyle.mxEdgeStyleFunction)var5 : null;
   }

   public void updateFloatingTerminalPoints(mxCellState var1, mxCellState var2, mxCellState var3) {
      mxPoint var4 = var1.getAbsolutePoint(0);
      mxPoint var5 = var1.getAbsolutePoint(var1.getAbsolutePointCount() - 1);
      if (var5 == null && var3 != null) {
         this.updateFloatingTerminalPoint(var1, var3, var2, false);
      }

      if (var4 == null && var2 != null) {
         this.updateFloatingTerminalPoint(var1, var2, var3, true);
      }
   }

   public void updateFloatingTerminalPoint(mxCellState var1, mxCellState var2, mxCellState var3, boolean var4) {
      var2 = this.getTerminalPort(var1, var2, var4);
      mxPoint var5 = this.getNextPoint(var1, var3, var4);
      double var6 = mxUtils.getDouble(var1.getStyle(), mxConstants.STYLE_PERIMETER_SPACING);
      var6 += mxUtils.getDouble(var1.getStyle(), var4 ? mxConstants.STYLE_SOURCE_PERIMETER_SPACING : mxConstants.STYLE_TARGET_PERIMETER_SPACING);
      mxPoint var8 = this.getPerimeterPoint(var2, var5, this.graph.isOrthogonal(var1), var6);
      var1.setAbsoluteTerminalPoint(var8, var4);
   }

   public mxCellState getTerminalPort(mxCellState var1, mxCellState var2, boolean var3) {
      String var4 = var3 ? mxConstants.STYLE_SOURCE_PORT : mxConstants.STYLE_TARGET_PORT;
      String var5 = mxUtils.getString(var1.style, var4);
      if (var5 != null && this.graph.getModel() instanceof mxGraphModel) {
         mxCellState var6 = this.getState(((mxGraphModel)this.graph.getModel()).getCell(var5));
         if (var6 != null) {
            var2 = var6;
         }
      }

      return var2;
   }

   public mxPoint getPerimeterPoint(mxCellState var1, mxPoint var2, boolean var3) {
      return this.getPerimeterPoint(var1, var2, var3, 0.0);
   }

   public mxPoint getPerimeterPoint(mxCellState var1, mxPoint var2, boolean var3, double var4) {
      mxPoint var6 = null;
      if (var1 != null) {
         mxPerimeter.mxPerimeterFunction var7 = this.getPerimeterFunction(var1);
         if (var7 != null && var2 != null) {
            mxRectangle var8 = this.getPerimeterBounds(var1, var4);
            if (var8.getWidth() > 0.0 || var8.getHeight() > 0.0) {
               var6 = var7.apply(var8, var1, var2, var3);
            }
         }

         if (var6 == null) {
            var6 = this.getPoint(var1);
         }
      }

      return var6;
   }

   public double getRoutingCenterX(mxCellState var1) {
      float var2 = var1.getStyle() != null ? mxUtils.getFloat(var1.getStyle(), mxConstants.STYLE_ROUTING_CENTER_X) : 0.0F;
      return var1.getCenterX() + var2 * var1.getWidth();
   }

   public double getRoutingCenterY(mxCellState var1) {
      float var2 = var1.getStyle() != null ? mxUtils.getFloat(var1.getStyle(), mxConstants.STYLE_ROUTING_CENTER_Y) : 0.0F;
      return var1.getCenterY() + var2 * var1.getHeight();
   }

   public mxRectangle getPerimeterBounds(mxCellState var1, double var2) {
      if (var1 != null) {
         var2 += mxUtils.getDouble(var1.getStyle(), mxConstants.STYLE_PERIMETER_SPACING);
      }

      return var1.getPerimeterBounds(var2 * this.scale);
   }

   public mxPerimeter.mxPerimeterFunction getPerimeterFunction(mxCellState var1) {
      Object var2 = var1.getStyle().get(mxConstants.STYLE_PERIMETER);
      if (var2 instanceof String) {
         String var3 = String.valueOf(var2);
         Object var4 = mxStyleRegistry.getValue(var3);
         if (var4 == null) {
            var4 = mxUtils.eval(var3);
         }

         var2 = var4;
      }

      return var2 instanceof mxPerimeter.mxPerimeterFunction ? (mxPerimeter.mxPerimeterFunction)var2 : null;
   }

   public mxPoint getNextPoint(mxCellState var1, mxCellState var2, boolean var3) {
      List var4 = var1.getAbsolutePoints();
      mxPoint var5 = null;
      if (var4 != null && var4.size() >= 2) {
         int var6 = var4.size();
         int var7 = var3 ? Math.min(1, var6 - 1) : Math.max(0, var6 - 2);
         var5 = (mxPoint)var4.get(var7);
      }

      if (var5 == null && var2 != null) {
         var5 = new mxPoint(var2.getCenterX(), var2.getCenterY());
      }

      return var5;
   }

   public Object getVisibleTerminal(Object var1, boolean var2) {
      mxIGraphModel var3 = this.graph.getModel();
      Object var4 = var3.getTerminal(var1, var2);
      Object var5 = var4;

      while (var4 != null && var4 != this.currentRoot) {
         if (!this.graph.isCellVisible(var5) || this.graph.isCellCollapsed(var4)) {
            var5 = var4;
         }

         var4 = var3.getParent(var4);
      }

      if (var3.getParent(var5) == var3.getRoot()) {
         var5 = null;
      }

      return var5;
   }

   public void updateEdgeBounds(mxCellState var1) {
      List var2 = var1.getAbsolutePoints();
      mxPoint var3 = (mxPoint)var2.get(0);
      mxPoint var4 = (mxPoint)var2.get(var2.size() - 1);
      if (var3.getX() == var4.getX() && var3.getY() == var4.getY()) {
         var1.setTerminalDistance(0.0);
      } else {
         double var5 = var4.getX() - var3.getX();
         double var7 = var4.getY() - var3.getY();
         var1.setTerminalDistance(Math.sqrt(var5 * var5 + var7 * var7));
      }

      double var25 = 0.0;
      double[] var26 = new double[var2.size() - 1];
      mxPoint var8 = var3;
      double var9 = var8.getX();
      double var11 = var8.getY();
      double var13 = var9;
      double var15 = var11;

      for (int var17 = 1; var17 < var2.size(); var17++) {
         mxPoint var18 = (mxPoint)var2.get(var17);
         if (var18 != null) {
            double var19 = var8.getX() - var18.getX();
            double var21 = var8.getY() - var18.getY();
            double var23 = Math.sqrt(var19 * var19 + var21 * var21);
            var26[var17 - 1] = var23;
            var25 += var23;
            var8 = var18;
            var9 = Math.min(var8.getX(), var9);
            var11 = Math.min(var8.getY(), var11);
            var13 = Math.max(var8.getX(), var13);
            var15 = Math.max(var8.getY(), var15);
         }
      }

      var1.setLength(var25);
      var1.setSegments(var26);
      double var27 = 1.0;
      var1.setX(var9);
      var1.setY(var11);
      var1.setWidth(Math.max(var27, var13 - var9));
      var1.setHeight(Math.max(var27, var15 - var11));
   }

   public mxPoint getPoint(mxCellState var1) {
      return this.getPoint(var1, null);
   }

   public mxPoint getPoint(mxCellState var1, mxGeometry var2) {
      double var3 = var1.getCenterX();
      double var5 = var1.getCenterY();
      if (var1.getSegments() != null && (var2 == null || var2.isRelative())) {
         double var36 = var2 != null ? var2.getX() / 2.0 : 0.0;
         int var9 = var1.getAbsolutePointCount();
         double var10 = (var36 + 0.5) * var1.getLength();
         double[] var12 = var1.getSegments();
         double var13 = var12[0];
         double var15 = 0.0;

         int var17;
         for (var17 = 1; var10 > var15 + var13 && var17 < var9 - 1; var13 = var12[var17++]) {
            var15 += var13;
         }

         double var18 = var13 == 0.0 ? 0.0 : (var10 - var15) / var13;
         mxPoint var20 = var1.getAbsolutePoint(var17 - 1);
         mxPoint var21 = var1.getAbsolutePoint(var17);
         if (var20 != null && var21 != null) {
            double var22 = 0.0;
            double var24 = 0.0;
            double var26 = 0.0;
            if (var2 != null) {
               var22 = var2.getY();
               mxPoint var28 = var2.getOffset();
               if (var28 != null) {
                  var24 = var28.getX();
                  var26 = var28.getY();
               }
            }

            double var37 = var21.getX() - var20.getX();
            double var30 = var21.getY() - var20.getY();
            double var32 = var13 == 0.0 ? 0.0 : var30 / var13;
            double var34 = var13 == 0.0 ? 0.0 : var37 / var13;
            var3 = var20.getX() + var37 * var18 + (var32 * var22 + var24) * this.scale;
            var5 = var20.getY() + var30 * var18 - (var34 * var22 - var26) * this.scale;
         }
      } else if (var2 != null) {
         mxPoint var7 = var2.getOffset();
         if (var7 != null) {
            var3 += var7.getX();
            var5 += var7.getY();
         }
      }

      return new mxPoint(var3, var5);
   }

   public mxPoint getRelativePoint(mxCellState var1, double var2, double var4) {
      mxIGraphModel var6 = this.graph.getModel();
      mxGeometry var7 = var6.getGeometry(var1.getCell());
      if (var7 != null) {
         int var8 = var1.getAbsolutePointCount();
         if (var7.isRelative() && var8 > 1) {
            double var9 = var1.getLength();
            double[] var11 = var1.getSegments();
            mxPoint var12 = var1.getAbsolutePoint(0);
            mxPoint var13 = var1.getAbsolutePoint(1);
            Double var14 = new Double(var12.getPoint(), var13.getPoint());
            double var15 = var14.ptSegDistSq(var2, var4);
            int var17 = 0;
            double var18 = 0.0;
            double var20 = 0.0;

            for (int var22 = 2; var22 < var8; var22++) {
               var18 += var11[var22 - 2];
               var13 = var1.getAbsolutePoint(var22);
               var14 = new Double(var12.getPoint(), var13.getPoint());
               double var23 = var14.ptSegDistSq(var2, var4);
               if (var23 < var15) {
                  var15 = var23;
                  var17 = var22 - 1;
                  var20 = var18;
               }

               var12 = var13;
            }

            double var53 = var11[var17];
            var12 = var1.getAbsolutePoint(var17);
            var13 = var1.getAbsolutePoint(var17 + 1);
            double var24 = var12.getX();
            double var26 = var12.getY();
            double var28 = var13.getX();
            double var30 = var13.getY();
            double var32 = var2;
            double var34 = var4;
            double var36 = var24 - var28;
            double var38 = var26 - var30;
            var32 -= var28;
            var34 -= var30;
            double var40 = 0.0;
            var32 = var36 - var32;
            var34 = var38 - var34;
            double var42 = var32 * var36 + var34 * var38;
            if (var42 <= 0.0) {
               var40 = 0.0;
            } else {
               var40 = var42 * var42 / (var36 * var36 + var38 * var38);
            }

            double var44 = Math.sqrt(var40);
            if (var44 > var53) {
               var44 = var53;
            }

            double var46 = Line2D.ptLineDist(var12.getX(), var12.getY(), var13.getX(), var13.getY(), var2, var4);
            int var48 = Line2D.relativeCCW(var12.getX(), var12.getY(), var13.getX(), var13.getY(), var2, var4);
            if (var48 == -1) {
               var46 = -var46;
            }

            return new mxPoint(Math.round((var9 / 2.0 - var20 - var44) / var9 * -2.0), Math.round(var46 / this.scale));
         }
      }

      return new mxPoint();
   }

   public mxCellState[] getCellStates(Object[] var1) {
      ArrayList var2 = new ArrayList(var1.length);

      for (int var3 = 0; var3 < var1.length; var3++) {
         mxCellState var4 = this.getState(var1[var3]);
         if (var4 != null) {
            var2.add(var4);
         }
      }

      mxCellState[] var5 = new mxCellState[var2.size()];
      return var2.toArray(var5);
   }

   public mxCellState getState(Object var1) {
      return this.getState(var1, false);
   }

   public mxCellState getState(Object var1, boolean var2) {
      mxCellState var3 = null;
      if (var1 != null) {
         var3 = this.states.get(var1);
         if (var3 == null && var2 && this.graph.isCellVisible(var1)) {
            var3 = this.createState(var1);
            this.states.put(var1, var3);
         }
      }

      return var3;
   }

   public mxCellState removeState(Object var1) {
      return var1 != null ? this.states.remove(var1) : null;
   }

   public mxCellState createState(Object var1) {
      return new mxCellState(this, var1, this.graph.getCellStyle(var1));
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append(this.getClass().getSimpleName());
      var1.append(" [");
      var1.append("currentRoot=");
      var1.append(this.currentRoot);
      var1.append(", graphBounds=");
      var1.append(this.graphBounds);
      var1.append(", scale=");
      var1.append(this.scale);
      var1.append(", translate=");
      var1.append(this.translate);
      var1.append("]");
      return var1.toString();
   }

   public static class mxCurrentRootChange implements mxUndoableEdit.mxUndoableChange {
      protected mxGraphView view;
      protected Object root;
      protected Object previous;
      protected boolean up;

      public mxCurrentRootChange(mxGraphView var1, Object var2) {
         this.view = var1;
         this.root = var2;
         this.previous = this.root;
         this.up = var2 == null;
         if (!this.up) {
            Object var3 = var1.getCurrentRoot();

            for (mxIGraphModel var4 = var1.graph.getModel(); var3 != null; var3 = var4.getParent(var3)) {
               if (var3 == var2) {
                  this.up = true;
                  break;
               }
            }
         }
      }

      public mxGraphView getView() {
         return this.view;
      }

      public Object getRoot() {
         return this.root;
      }

      public Object getPrevious() {
         return this.previous;
      }

      public boolean isUp() {
         return this.up;
      }

      @Override
      public void execute() {
         Object var1 = this.view.getCurrentRoot();
         this.view.currentRoot = this.previous;
         this.previous = var1;
         mxPoint var2 = this.view.graph.getTranslateForRoot(this.view.getCurrentRoot());
         if (var2 != null) {
            this.view.translate = new mxPoint(-var2.getX(), var2.getY());
         }

         this.view.reload();
         this.up = !this.up;
         String var3 = this.up ? "up" : "down";
         this.view.fireEvent(new mxEventObject(var3, "root", this.view.currentRoot, "previous", this.previous));
      }
   }
}
