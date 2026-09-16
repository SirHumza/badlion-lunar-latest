package com.mxgraph.swing.handler;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.view.mxInteractiveCanvas;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class mxConnectPreview extends mxEventSource {
   protected mxGraphComponent graphComponent;
   protected mxCellState previewState;
   protected mxCellState sourceState;
   protected mxPoint startPoint;

   public mxConnectPreview(mxGraphComponent var1) {
      this.graphComponent = var1;
      var1.addListener("afterPaint", new mxEventSource.mxIEventListener() {
         @Override
         public void invoke(Object var1, mxEventObject var2) {
            Graphics var3 = (Graphics)var2.getProperty("g");
            mxConnectPreview.this.paint(var3);
         }
      });
   }

   protected Object createCell(mxCellState var1, String var2) {
      mxGraph var3 = this.graphComponent.getGraph();
      mxICell var4 = (mxICell)var3.createEdge(null, null, "", var1 != null ? var1.getCell() : null, null, var2);
      ((mxICell)var1.getCell()).insertEdge(var4, true);
      return var4;
   }

   public boolean isActive() {
      return this.sourceState != null;
   }

   public mxCellState getSourceState() {
      return this.sourceState;
   }

   public mxCellState getPreviewState() {
      return this.previewState;
   }

   public mxPoint getStartPoint() {
      return this.startPoint;
   }

   public void start(MouseEvent var1, mxCellState var2, String var3) {
      mxGraph var4 = this.graphComponent.getGraph();
      this.sourceState = var2;
      this.startPoint = this.transformScreenPoint(var2.getCenterX(), var2.getCenterY());
      Object var5 = this.createCell(var2, var3);
      var4.getView().validateCell(var5);
      this.previewState = var4.getView().getState(var5);
      this.fireEvent(new mxEventObject(mxEvent.START, "event", var1, "state", this.previewState));
   }

   public void update(MouseEvent var1, mxCellState var2, double var3, double var5) {
      mxGraph var7 = this.graphComponent.getGraph();
      mxICell var8 = (mxICell)this.previewState.getCell();
      mxRectangle var9 = this.graphComponent.getGraph().getPaintBounds(new Object[]{this.previewState.getCell()});
      if (var8.getTerminal(false) != null) {
         var8.getTerminal(false).removeEdge(var8, false);
      }

      if (var2 != null) {
         ((mxICell)var2.getCell()).insertEdge(var8, false);
      }

      mxGeometry var10 = var7.getCellGeometry(this.previewState.getCell());
      var10.setTerminalPoint(this.startPoint, true);
      var10.setTerminalPoint(this.transformScreenPoint(var3, var5), false);
      this.revalidate(this.previewState);
      this.fireEvent(new mxEventObject(mxEvent.CONTINUE, "event", var1, "x", var3, "y", var5));
      Rectangle var11 = this.getDirtyRect(var9);
      if (var11 != null) {
         this.graphComponent.getGraphControl().repaint(var11);
      } else {
         this.graphComponent.getGraphControl().repaint();
      }
   }

   protected Rectangle getDirtyRect() {
      return this.getDirtyRect(null);
   }

   protected Rectangle getDirtyRect(mxRectangle var1) {
      if (this.previewState != null) {
         mxRectangle var2 = this.graphComponent.getGraph().getPaintBounds(new Object[]{this.previewState.getCell()});
         if (var1 != null) {
            var1.add(var2);
         } else {
            var1 = var2;
         }

         if (var1 != null) {
            var1.grow(2.0);
            return var1.getRectangle();
         }
      }

      return null;
   }

   protected mxPoint transformScreenPoint(double var1, double var3) {
      mxGraph var5 = this.graphComponent.getGraph();
      mxPoint var6 = var5.getView().getTranslate();
      double var7 = var5.getView().getScale();
      return new mxPoint(var5.snap(var1 / var7 - var6.getX()), var5.snap(var3 / var7 - var6.getY()));
   }

   public void revalidate(mxCellState var1) {
      var1.getView().invalidate(var1.getCell());
      var1.getView().validateCellState(var1.getCell());
   }

   public void paint(Graphics var1) {
      if (this.previewState != null) {
         mxInteractiveCanvas var2 = this.graphComponent.getCanvas();
         if (this.graphComponent.isAntiAlias()) {
            mxUtils.setAntiAlias((Graphics2D)var1, true, false);
         }

         float var3 = this.graphComponent.getPreviewAlpha();
         if (var3 < 1.0F) {
            ((Graphics2D)var1).setComposite(AlphaComposite.getInstance(3, var3));
         }

         Graphics2D var4 = var2.getGraphics();
         mxPoint var5 = var2.getTranslate();
         double var6 = var2.getScale();

         try {
            var2.setScale(this.graphComponent.getGraph().getView().getScale());
            var2.setTranslate(0.0, 0.0);
            var2.setGraphics((Graphics2D)var1);
            this.paintPreview(var2);
         } finally {
            var2.setScale(var6);
            var2.setTranslate(var5.getX(), var5.getY());
            var2.setGraphics(var4);
         }
      }
   }

   protected void paintPreview(mxGraphics2DCanvas var1) {
      this.graphComponent.getGraphControl().drawCell(this.graphComponent.getCanvas(), this.previewState.getCell());
   }

   public Object stop(boolean var1) {
      return this.stop(var1, null);
   }

   public Object stop(boolean var1, MouseEvent var2) {
      Object var3 = this.sourceState != null ? this.sourceState.getCell() : null;
      if (this.previewState != null) {
         mxGraph var4 = this.graphComponent.getGraph();
         var4.getModel().beginUpdate();

         try {
            mxICell var5 = (mxICell)this.previewState.getCell();
            mxICell var6 = var5.getTerminal(true);
            mxICell var7 = var5.getTerminal(false);
            if (var6 != null) {
               var6.removeEdge(var5, true);
            }

            if (var7 != null) {
               var7.removeEdge(var5, false);
            }

            if (var1) {
               var3 = var4.addCell(var5, null, null, var6, var7);
            }

            this.fireEvent(new mxEventObject(mxEvent.STOP, "event", var2, "commit", var1, "cell", var1 ? var3 : null));
            if (this.previewState != null) {
               Rectangle var8 = this.getDirtyRect();
               var4.getView().clear(var5, false, true);
               this.previewState = null;
               if (!var1 && var8 != null) {
                  this.graphComponent.getGraphControl().repaint(var8);
               }
            }
         } finally {
            var4.getModel().endUpdate();
         }
      }

      this.sourceState = null;
      this.startPoint = null;
      return var3;
   }
}
