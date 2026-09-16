package com.mxgraph.swing.handler;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.util.mxSwingConstants;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxConnectionConstraint;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D.Float;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mxEdgeHandler extends mxCellHandler {
   protected boolean cloneEnabled = true;
   protected Point[] p;
   protected transient String error;
   protected transient boolean gridEnabledEvent = false;
   protected transient boolean constrainedEvent = false;
   protected mxCellMarker marker = new mxCellMarker(this.graphComponent) {
      private static final long serialVersionUID = 8826073441093831764L;

      @Override
      protected Object getCell(MouseEvent var1) {
         mxGraph var2 = this.graphComponent.getGraph();
         mxIGraphModel var3 = var2.getModel();
         Object var4 = super.getCell(var1);
         if (var4 == mxEdgeHandler.this.state.getCell() || !var2.isConnectableEdges() && var3.isEdge(var4)) {
            var4 = null;
         }

         return var4;
      }

      @Override
      protected boolean isValidState(mxCellState var1) {
         mxGraphView var2 = this.graphComponent.getGraph().getView();
         mxIGraphModel var3 = this.graphComponent.getGraph().getModel();
         Object var4 = mxEdgeHandler.this.state.getCell();
         boolean var5 = mxEdgeHandler.this.isSource(mxEdgeHandler.this.index);
         mxCellState var6 = var2.getTerminalPort(var1, var2.getState(var3.getTerminal(var4, !var5)), !var5);
         Object var7 = var6 != null ? var6.getCell() : null;
         Object var8 = var5 ? var1.getCell() : var7;
         Object var9 = var5 ? var7 : var1.getCell();
         mxEdgeHandler.this.error = mxEdgeHandler.this.validateConnection(var8, var9);
         return mxEdgeHandler.this.error == null;
      }
   };

   public mxEdgeHandler(mxGraphComponent var1, mxCellState var2) {
      super(var1, var2);
   }

   public void setCloneEnabled(boolean var1) {
      this.cloneEnabled = var1;
   }

   public boolean isCloneEnabled() {
      return this.cloneEnabled;
   }

   @Override
   protected boolean isIgnoredEvent(MouseEvent var1) {
      return !this.isFlipEvent(var1) && super.isIgnoredEvent(var1);
   }

   protected boolean isFlipEvent(MouseEvent var1) {
      return false;
   }

   public String validateConnection(Object var1, Object var2) {
      return this.graphComponent.getGraph().getEdgeValidationError(this.state.getCell(), var1, var2);
   }

   public boolean isSource(int var1) {
      return var1 == 0;
   }

   public boolean isTarget(int var1) {
      return var1 == this.getHandleCount() - 2;
   }

   @Override
   protected boolean isHandleVisible(int var1) {
      return super.isHandleVisible(var1) && (this.isSource(var1) || this.isTarget(var1) || this.isCellBendable());
   }

   protected boolean isCellBendable() {
      return this.graphComponent.getGraph().isCellBendable(this.state.getCell());
   }

   @Override
   protected Rectangle[] createHandles() {
      this.p = this.createPoints(this.state);
      Rectangle[] var1 = new Rectangle[this.p.length + 1];

      for (int var2 = 0; var2 < var1.length - 1; var2++) {
         var1[var2] = this.createHandle(this.p[var2]);
      }

      var1[this.p.length] = this.createHandle(this.state.getAbsoluteOffset().getPoint(), mxConstants.LABEL_HANDLE_SIZE);
      return var1;
   }

   @Override
   protected Color getHandleFillColor(int var1) {
      boolean var2 = this.isSource(var1);
      if (var2 || this.isTarget(var1)) {
         mxGraph var3 = this.graphComponent.getGraph();
         Object var4 = var3.getModel().getTerminal(this.state.getCell(), var2);
         if (var4 == null && !this.graphComponent.getGraph().isTerminalPointMovable(this.state.getCell(), var2)) {
            return mxSwingConstants.LOCKED_HANDLE_FILLCOLOR;
         }

         if (var4 != null) {
            return this.graphComponent.getGraph().isCellDisconnectable(this.state.getCell(), var4, var2)
               ? mxSwingConstants.CONNECT_HANDLE_FILLCOLOR
               : mxSwingConstants.LOCKED_HANDLE_FILLCOLOR;
         }
      }

      return super.getHandleFillColor(var1);
   }

   @Override
   public int getIndexAt(int var1, int var2) {
      int var3 = super.getIndexAt(var1, var2);
      if (var3 < 0 && this.handles != null && this.handlesVisible && this.isLabelMovable() && this.state.getLabelBounds().getRectangle().contains(var1, var2)) {
         var3 = this.handles.length - 1;
      }

      return var3;
   }

   protected Rectangle createHandle(Point var1) {
      return this.createHandle(var1, mxConstants.HANDLE_SIZE);
   }

   protected Rectangle createHandle(Point var1, int var2) {
      return new Rectangle(var1.x - var2 / 2, var1.y - var2 / 2, var2, var2);
   }

   protected Point[] createPoints(mxCellState var1) {
      Point[] var2 = new Point[var1.getAbsolutePointCount()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.getAbsolutePoint(var3).getPoint();
      }

      return var2;
   }

   @Override
   protected JComponent createPreview() {
      JPanel var1 = new JPanel() {
         private static final long serialVersionUID = -894546588972313020L;

         @Override
         public void paint(Graphics var1) {
            super.paint(var1);
            if (!mxEdgeHandler.this.isLabel(mxEdgeHandler.this.index) && mxEdgeHandler.this.p != null) {
               ((Graphics2D)var1).setStroke(mxSwingConstants.PREVIEW_STROKE);
               if (!mxEdgeHandler.this.isSource(mxEdgeHandler.this.index) && !mxEdgeHandler.this.isTarget(mxEdgeHandler.this.index)) {
                  var1.setColor(Color.BLACK);
               } else if (!mxEdgeHandler.this.marker.hasValidState() && !mxEdgeHandler.this.graphComponent.getGraph().isAllowDanglingEdges()) {
                  var1.setColor(mxSwingConstants.DEFAULT_INVALID_COLOR);
               } else {
                  var1.setColor(mxSwingConstants.DEFAULT_VALID_COLOR);
               }

               Point var2 = this.getLocation();
               Point var3 = mxEdgeHandler.this.p[0];

               for (int var4 = 1; var4 < mxEdgeHandler.this.p.length; var4++) {
                  var1.drawLine(var3.x - var2.x, var3.y - var2.y, mxEdgeHandler.this.p[var4].x - var2.x, mxEdgeHandler.this.p[var4].y - var2.y);
                  var3 = mxEdgeHandler.this.p[var4];
               }
            }
         }
      };
      if (this.isLabel(this.index)) {
         var1.setBorder(mxSwingConstants.PREVIEW_BORDER);
      }

      var1.setOpaque(false);
      var1.setVisible(false);
      return var1;
   }

   protected mxPoint convertPoint(mxPoint var1, boolean var2) {
      mxGraph var3 = this.graphComponent.getGraph();
      double var4 = var3.getView().getScale();
      mxPoint var6 = var3.getView().getTranslate();
      double var7 = var1.getX() / var4 - var6.getX();
      double var9 = var1.getY() / var4 - var6.getY();
      if (var2) {
         var7 = var3.snap(var7);
         var9 = var3.snap(var9);
      }

      var1.setX(var7 - this.state.getOrigin().getX());
      var1.setY(var9 - this.state.getOrigin().getY());
      return var1;
   }

   protected Rectangle getPreviewBounds() {
      Rectangle var1 = null;
      if (this.isLabel(this.index)) {
         var1 = this.state.getLabelBounds().getRectangle();
      } else {
         var1 = new Rectangle(this.p[0]);

         for (int var2 = 0; var2 < this.p.length; var2++) {
            var1.add(this.p[var2]);
         }

         var1.height++;
         var1.width++;
      }

      return var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      super.mousePressed(var1);
      boolean var2 = this.isSource(this.index);
      if (var2 || this.isTarget(this.index)) {
         mxGraph var3 = this.graphComponent.getGraph();
         mxIGraphModel var4 = var3.getModel();
         Object var5 = var4.getTerminal(this.state.getCell(), var2);
         if (var5 == null && !var3.isTerminalPointMovable(this.state.getCell(), var2)
            || var5 != null && !var3.isCellDisconnectable(this.state.getCell(), var5, var2)) {
            this.first = null;
         }
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (!var1.isConsumed() && this.first != null) {
         this.gridEnabledEvent = this.graphComponent.isGridEnabledEvent(var1);
         this.constrainedEvent = this.graphComponent.isConstrainedEvent(var1);
         boolean var2 = this.isSource(this.index);
         boolean var3 = this.isTarget(this.index);
         Object var4 = null;
         Object var5 = null;
         if (this.isLabel(this.index)) {
            mxPoint var15 = this.state.getAbsoluteOffset();
            double var16 = var15.getX() - this.first.x;
            double var17 = var15.getY() - this.first.y;
            mxPoint var22 = new mxPoint(var1.getPoint());
            if (this.gridEnabledEvent) {
               var22 = this.graphComponent.snapScaledPoint(var22, var16, var17);
            }

            if (this.constrainedEvent) {
               if (Math.abs(var1.getX() - this.first.x) > Math.abs(var1.getY() - this.first.y)) {
                  var22.setY(var15.getY());
               } else {
                  var22.setX(var15.getX());
               }
            }

            Rectangle var23 = this.getPreviewBounds();
            var23.translate((int)Math.round(var22.getX() - this.first.x), (int)Math.round(var22.getY() - this.first.y));
            this.preview.setBounds(var23);
         } else {
            mxGeometry var6 = this.graphComponent.getGraph().getCellGeometry(this.state.getCell());
            mxCellState var7 = (mxCellState)this.state.clone();
            List var8 = var6.getPoints();
            mxGraphView var9 = var7.getView();
            if (!var2 && !var3) {
               mxPoint var18 = this.convertPoint(new mxPoint(var1.getPoint()), this.gridEnabledEvent);
               if (var8 == null) {
                  var8 = Arrays.asList(var18);
               } else if (this.index - 1 < var8.size()) {
                  var8 = new ArrayList(var8);
                  var8.set(this.index - 1, var18);
               }

               var4 = var9.getVisibleTerminal(this.state.getCell(), true);
               var5 = var9.getVisibleTerminal(this.state.getCell(), false);
            } else {
               this.marker.process(var1);
               mxCellState var10 = this.marker.getValidState();
               var5 = this.state.getVisibleTerminal(!var2);
               if (var10 != null) {
                  var4 = var10.getCell();
               } else {
                  mxPoint var11 = new mxPoint(var1.getPoint());
                  if (this.gridEnabledEvent) {
                     var11 = this.graphComponent.snapScaledPoint(var11);
                  }

                  var7.setAbsoluteTerminalPoint(var11, var2);
               }

               if (!var2) {
                  Object var20 = var4;
                  var4 = var5;
                  var5 = var20;
               }
            }

            mxCellState var19 = var9.getState(var4);
            mxCellState var21 = var9.getState(var5);
            mxConnectionConstraint var12 = this.graphComponent.getGraph().getConnectionConstraint(var7, var19, true);
            mxConnectionConstraint var13 = this.graphComponent.getGraph().getConnectionConstraint(var7, var21, false);
            if (!var2 || var19 != null) {
               var9.updateFixedTerminalPoint(var7, var19, true, var12);
            }

            if (!var3 || var21 != null) {
               var9.updateFixedTerminalPoint(var7, var21, false, var13);
            }

            var9.updatePoints(var7, var8, var19, var21);
            var9.updateFloatingTerminalPoints(var7, var19, var21);
            this.p = this.createPoints(var7);
            this.preview.setBounds(this.getPreviewBounds());
         }

         if (!this.preview.isVisible() && this.graphComponent.isSignificant(var1.getX() - this.first.x, var1.getY() - this.first.y)) {
            this.preview.setVisible(true);
         } else if (this.preview.isVisible()) {
            this.preview.repaint();
         }

         var1.consume();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      mxGraph var2 = this.graphComponent.getGraph();
      if (!var1.isConsumed() && this.first != null) {
         double var3 = var1.getX() - this.first.x;
         double var5 = var1.getY() - this.first.y;
         if (this.graphComponent.isSignificant(var3, var5)) {
            if (this.error != null) {
               if (this.error.length() > 0) {
                  JOptionPane.showMessageDialog(this.graphComponent, this.error);
               }
            } else if (this.isLabel(this.index)) {
               mxPoint var7 = this.state.getAbsoluteOffset();
               var3 = var7.getX() - this.first.x;
               var5 = var7.getY() - this.first.y;
               mxPoint var8 = new mxPoint(var1.getPoint());
               if (this.gridEnabledEvent) {
                  var8 = this.graphComponent.snapScaledPoint(var8, var3, var5);
               }

               if (this.constrainedEvent) {
                  if (Math.abs(var1.getX() - this.first.x) > Math.abs(var1.getY() - this.first.y)) {
                     var8.setY(var7.getY());
                  } else {
                     var8.setX(var7.getX());
                  }
               }

               this.moveLabelTo(this.state, var8.getX() + var3, var8.getY() + var5);
            } else if (!this.marker.hasValidState() || !this.isSource(this.index) && !this.isTarget(this.index)) {
               if (!this.isSource(this.index) && !this.isTarget(this.index) || this.graphComponent.getGraph().isAllowDanglingEdges()) {
                  this.movePoint(this.state.getCell(), this.index, this.convertPoint(new mxPoint(var1.getPoint()), this.gridEnabledEvent));
               }
            } else {
               this.connect(
                  this.state.getCell(),
                  this.marker.getValidState().getCell(),
                  this.isSource(this.index),
                  this.graphComponent.isCloneEvent(var1) && this.isCloneEnabled()
               );
            }

            var1.consume();
         }
      }

      if (!var1.isConsumed() && this.isFlipEvent(var1)) {
         var2.flipEdge(this.state.getCell());
         var1.consume();
      }

      super.mouseReleased(var1);
   }

   @Override
   public void reset() {
      super.reset();
      this.marker.reset();
      this.error = null;
   }

   protected void movePoint(Object var1, int var2, mxPoint var3) {
      mxIGraphModel var4 = this.graphComponent.getGraph().getModel();
      mxGeometry var5 = var4.getGeometry(var1);
      if (var5 != null) {
         var4.beginUpdate();

         try {
            var5 = (mxGeometry)var5.clone();
            if (!this.isSource(this.index) && !this.isTarget(this.index)) {
               List var6 = var5.getPoints();
               if (var6 == null) {
                  var6 = new ArrayList();
                  var5.setPoints(var6);
               }

               if (var6 != null) {
                  if (var2 <= var6.size()) {
                     var6.set(var2 - 1, var3);
                  } else if (var2 - 1 <= var6.size()) {
                     var6.add(var2 - 1, var3);
                  }
               }
            } else {
               this.connect(var1, null, this.isSource(this.index), false);
               var5.setTerminalPoint(var3, this.isSource(this.index));
            }

            var4.setGeometry(var1, var5);
         } finally {
            var4.endUpdate();
         }
      }
   }

   protected void connect(Object var1, Object var2, boolean var3, boolean var4) {
      mxGraph var5 = this.graphComponent.getGraph();
      mxIGraphModel var6 = var5.getModel();
      var6.beginUpdate();

      try {
         if (var4) {
            Object var7 = var5.cloneCells(new Object[]{var1})[0];
            Object var8 = var6.getParent(var1);
            var5.addCells(new Object[]{var7}, var8);
            Object var9 = var6.getTerminal(var1, !var3);
            var5.connectCell(var7, var9, !var3);
            var5.setSelectionCell(var7);
            var1 = var7;
         }

         var5.connectCell(var1, var2, var3, new mxConnectionConstraint());
      } finally {
         var6.endUpdate();
      }
   }

   protected void moveLabelTo(mxCellState var1, double var2, double var4) {
      mxGraph var6 = this.graphComponent.getGraph();
      mxIGraphModel var7 = var6.getModel();
      mxGeometry var8 = var7.getGeometry(this.state.getCell());
      if (var8 != null) {
         var8 = (mxGeometry)var8.clone();
         mxPoint var9 = var6.getView().getRelativePoint(var1, var2, var4);
         var8.setX(var9.getX());
         var8.setY(var9.getY());
         double var10 = var6.getView().getScale();
         var8.setOffset(new mxPoint(0.0, 0.0));
         var9 = var6.getView().getPoint(var1, var8);
         var8.setOffset(new mxPoint(Math.round((var2 - var9.getX()) / var10), Math.round((var4 - var9.getY()) / var10)));
         var7.setGeometry(var1.getCell(), var8);
      }
   }

   @Override
   protected Cursor getCursor(MouseEvent var1, int var2) {
      Cursor var3 = null;
      if (this.isLabel(var2)) {
         var3 = new Cursor(13);
      } else {
         var3 = new Cursor(12);
      }

      return var3;
   }

   @Override
   public Color getSelectionColor() {
      return mxSwingConstants.EDGE_SELECTION_COLOR;
   }

   @Override
   public Stroke getSelectionStroke() {
      return mxSwingConstants.EDGE_SELECTION_STROKE;
   }

   @Override
   public void paint(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      Stroke var3 = var2.getStroke();
      var2.setStroke(this.getSelectionStroke());
      var1.setColor(this.getSelectionColor());
      Point var4 = this.state.getAbsolutePoint(0).getPoint();

      for (int var5 = 1; var5 < this.state.getAbsolutePointCount(); var5++) {
         Point var6 = this.state.getAbsolutePoint(var5).getPoint();
         Float var7 = new Float(var4.x, var4.y, var6.x, var6.y);
         Rectangle var8 = var2.getStroke().createStrokedShape(var7).getBounds();
         if (var1.hitClip(var8.x, var8.y, var8.width, var8.height)) {
            var2.draw(var7);
         }

         var4 = var6;
      }

      var2.setStroke(var3);
      super.paint(var1);
   }
}
