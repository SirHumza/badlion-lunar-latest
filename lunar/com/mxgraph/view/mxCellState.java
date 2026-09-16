package com.mxgraph.view;

import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class mxCellState extends mxRectangle {
   private static final long serialVersionUID = 7588335615324083354L;
   protected mxGraphView view;
   protected Object cell;
   protected String label;
   protected Map<String, Object> style;
   protected mxPoint origin = new mxPoint();
   protected List<mxPoint> absolutePoints;
   protected mxPoint absoluteOffset = new mxPoint();
   protected double terminalDistance;
   protected double length;
   protected double[] segments;
   protected mxRectangle labelBounds;
   protected mxRectangle boundingBox;
   protected boolean invalid = true;
   protected mxCellState visibleSourceState;
   protected mxCellState visibleTargetState;

   public mxCellState() {
      this(null, null, null);
   }

   public mxCellState(mxGraphView var1, Object var2, Map<String, Object> var3) {
      this.setView(var1);
      this.setCell(var2);
      this.setStyle(var3);
   }

   public boolean isInvalid() {
      return this.invalid;
   }

   public void setInvalid(boolean var1) {
      this.invalid = var1;
   }

   public mxGraphView getView() {
      return this.view;
   }

   public void setView(mxGraphView var1) {
      this.view = var1;
   }

   public String getLabel() {
      return this.label;
   }

   public void setLabel(String var1) {
      this.label = var1;
   }

   public Object getCell() {
      return this.cell;
   }

   public void setCell(Object var1) {
      this.cell = var1;
   }

   public Map<String, Object> getStyle() {
      return this.style;
   }

   public void setStyle(Map<String, Object> var1) {
      this.style = var1;
   }

   public mxPoint getOrigin() {
      return this.origin;
   }

   public void setOrigin(mxPoint var1) {
      this.origin = var1;
   }

   public mxPoint getAbsolutePoint(int var1) {
      return this.absolutePoints.get(var1);
   }

   public mxPoint setAbsolutePoint(int var1, mxPoint var2) {
      return this.absolutePoints.set(var1, var2);
   }

   public int getAbsolutePointCount() {
      return this.absolutePoints != null ? this.absolutePoints.size() : 0;
   }

   public List<mxPoint> getAbsolutePoints() {
      return this.absolutePoints;
   }

   public void setAbsolutePoints(List<mxPoint> var1) {
      this.absolutePoints = var1;
   }

   public mxPoint getAbsoluteOffset() {
      return this.absoluteOffset;
   }

   public void setAbsoluteOffset(mxPoint var1) {
      this.absoluteOffset = var1;
   }

   public double getTerminalDistance() {
      return this.terminalDistance;
   }

   public void setTerminalDistance(double var1) {
      this.terminalDistance = var1;
   }

   public double getLength() {
      return this.length;
   }

   public void setLength(double var1) {
      this.length = var1;
   }

   public double[] getSegments() {
      return this.segments;
   }

   public void setSegments(double[] var1) {
      this.segments = var1;
   }

   public mxRectangle getLabelBounds() {
      return this.labelBounds;
   }

   public void setLabelBounds(mxRectangle var1) {
      this.labelBounds = var1;
   }

   public mxRectangle getBoundingBox() {
      return this.boundingBox;
   }

   public void setBoundingBox(mxRectangle var1) {
      this.boundingBox = var1;
   }

   public mxRectangle getPerimeterBounds() {
      return this.getPerimeterBounds(0.0);
   }

   public mxRectangle getPerimeterBounds(double var1) {
      mxRectangle var3 = new mxRectangle(this.getRectangle());
      if (var1 != 0.0) {
         var3.grow(var1);
      }

      return var3;
   }

   public void setAbsoluteTerminalPoint(mxPoint var1, boolean var2) {
      if (var2) {
         if (this.absolutePoints == null) {
            this.absolutePoints = new ArrayList<>();
         }

         if (this.absolutePoints.size() == 0) {
            this.absolutePoints.add(var1);
         } else {
            this.absolutePoints.set(0, var1);
         }
      } else if (this.absolutePoints == null) {
         this.absolutePoints = new ArrayList<>();
         this.absolutePoints.add(null);
         this.absolutePoints.add(var1);
      } else if (this.absolutePoints.size() == 1) {
         this.absolutePoints.add(var1);
      } else {
         this.absolutePoints.set(this.absolutePoints.size() - 1, var1);
      }
   }

   public Object getVisibleTerminal(boolean var1) {
      mxCellState var2 = this.getVisibleTerminalState(var1);
      return var2 != null ? var2.getCell() : null;
   }

   public mxCellState getVisibleTerminalState(boolean var1) {
      return var1 ? this.visibleSourceState : this.visibleTargetState;
   }

   public void setVisibleTerminalState(mxCellState var1, boolean var2) {
      if (var2) {
         this.visibleSourceState = var1;
      } else {
         this.visibleTargetState = var1;
      }
   }

   @Override
   public Object clone() {
      mxCellState var1 = new mxCellState(this.view, this.cell, this.style);
      if (this.label != null) {
         var1.label = this.label;
      }

      if (this.absolutePoints != null) {
         var1.absolutePoints = new ArrayList<>();

         for (int var2 = 0; var2 < this.absolutePoints.size(); var2++) {
            var1.absolutePoints.add((mxPoint)this.absolutePoints.get(var2).clone());
         }
      }

      if (this.origin != null) {
         var1.origin = (mxPoint)this.origin.clone();
      }

      if (this.absoluteOffset != null) {
         var1.absoluteOffset = (mxPoint)this.absoluteOffset.clone();
      }

      if (this.labelBounds != null) {
         var1.labelBounds = (mxRectangle)this.labelBounds.clone();
      }

      if (this.boundingBox != null) {
         var1.boundingBox = (mxRectangle)this.boundingBox.clone();
      }

      var1.terminalDistance = this.terminalDistance;
      var1.segments = this.segments;
      var1.length = this.length;
      var1.x = this.x;
      var1.y = this.y;
      var1.width = this.width;
      var1.height = this.height;
      return var1;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append(this.getClass().getSimpleName());
      var1.append(" [");
      var1.append("cell=");
      var1.append(this.cell);
      var1.append(", label=");
      var1.append(this.label);
      var1.append(", x=");
      var1.append(this.x);
      var1.append(", y=");
      var1.append(this.y);
      var1.append(", width=");
      var1.append(this.width);
      var1.append(", height=");
      var1.append(this.height);
      var1.append("]");
      return var1.toString();
   }
}
