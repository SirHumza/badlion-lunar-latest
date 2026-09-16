package com.mxgraph.swing.handler;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.swing.SwingUtilities;

public class mxSelectionCellsHandler implements MouseListener, MouseMotionListener {
   private static final long serialVersionUID = -882368002120921842L;
   public static int DEFAULT_MAX_HANDLERS = 100;
   protected mxGraphComponent graphComponent;
   protected boolean enabled = true;
   protected boolean visible = true;
   protected Rectangle bounds = null;
   protected int maxHandlers = DEFAULT_MAX_HANDLERS;
   protected transient LinkedHashMap<Object, mxCellHandler> handlers = new LinkedHashMap<>();
   protected transient mxEventSource.mxIEventListener refreshHandler = new mxEventSource.mxIEventListener() {
      @Override
      public void invoke(Object var1, mxEventObject var2) {
         if (mxSelectionCellsHandler.this.isEnabled()) {
            mxSelectionCellsHandler.this.refresh();
         }
      }
   };
   protected transient PropertyChangeListener labelMoveHandler = new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent var1) {
         if (var1.getPropertyName().equals("vertexLabelsMovable") || var1.getPropertyName().equals("edgeLabelsMovable")) {
            mxSelectionCellsHandler.this.refresh();
         }
      }
   };

   public mxSelectionCellsHandler(mxGraphComponent var1) {
      this.graphComponent = var1;
      var1.getGraphControl().addMouseListener(this);
      var1.getGraphControl().addMouseMotionListener(this);
      this.addGraphListeners(var1.getGraph());
      var1.addPropertyChangeListener(new PropertyChangeListener() {
         @Override
         public void propertyChange(PropertyChangeEvent var1) {
            if (var1.getPropertyName().equals("graph")) {
               mxSelectionCellsHandler.this.removeGraphListeners((mxGraph)var1.getOldValue());
               mxSelectionCellsHandler.this.addGraphListeners((mxGraph)var1.getNewValue());
            }
         }
      });
      var1.addListener("paint", new mxEventSource.mxIEventListener() {
         @Override
         public void invoke(Object var1, mxEventObject var2) {
            Graphics var3 = (Graphics)var2.getProperty("g");
            mxSelectionCellsHandler.this.paintHandles(var3);
         }
      });
   }

   protected void addGraphListeners(mxGraph var1) {
      if (var1 != null) {
         var1.getSelectionModel().addListener("change", this.refreshHandler);
         var1.getModel().addListener("change", this.refreshHandler);
         var1.getView().addListener("scale", this.refreshHandler);
         var1.getView().addListener("translate", this.refreshHandler);
         var1.getView().addListener("scaleAndTranslate", this.refreshHandler);
         var1.getView().addListener("down", this.refreshHandler);
         var1.getView().addListener("up", this.refreshHandler);
         var1.addPropertyChangeListener(this.labelMoveHandler);
      }
   }

   protected void removeGraphListeners(mxGraph var1) {
      if (var1 != null) {
         var1.getSelectionModel().removeListener(this.refreshHandler, "change");
         var1.getModel().removeListener(this.refreshHandler, "change");
         var1.getView().removeListener(this.refreshHandler, "scale");
         var1.getView().removeListener(this.refreshHandler, "translate");
         var1.getView().removeListener(this.refreshHandler, "scaleAndTranslate");
         var1.getView().removeListener(this.refreshHandler, "down");
         var1.getView().removeListener(this.refreshHandler, "up");
         var1.removePropertyChangeListener(this.labelMoveHandler);
      }
   }

   public mxGraphComponent getGraphComponent() {
      return this.graphComponent;
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean var1) {
      this.enabled = var1;
   }

   public boolean isVisible() {
      return this.visible;
   }

   public void setVisible(boolean var1) {
      this.visible = var1;
   }

   public int getMaxHandlers() {
      return this.maxHandlers;
   }

   public void setMaxHandlers(int var1) {
      this.maxHandlers = var1;
   }

   public mxCellHandler getHandler(Object var1) {
      return this.handlers.get(var1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.graphComponent.isEnabled() && !this.graphComponent.isForceMarqueeEvent(var1) && this.isEnabled()) {
         Iterator var2 = this.handlers.values().iterator();

         while (var2.hasNext() && !var1.isConsumed()) {
            ((mxCellHandler)var2.next()).mousePressed(var1);
         }
      }
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      if (this.graphComponent.isEnabled() && this.isEnabled()) {
         Iterator var2 = this.handlers.values().iterator();

         while (var2.hasNext() && !var1.isConsumed()) {
            ((mxCellHandler)var2.next()).mouseMoved(var1);
         }
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (this.graphComponent.isEnabled() && this.isEnabled()) {
         Iterator var2 = this.handlers.values().iterator();

         while (var2.hasNext() && !var1.isConsumed()) {
            ((mxCellHandler)var2.next()).mouseDragged(var1);
         }
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.graphComponent.isEnabled() && this.isEnabled()) {
         Iterator var2 = this.handlers.values().iterator();

         while (var2.hasNext() && !var1.isConsumed()) {
            ((mxCellHandler)var2.next()).mouseReleased(var1);
         }
      }

      this.reset();
   }

   public String getToolTipText(MouseEvent var1) {
      MouseEvent var2 = SwingUtilities.convertMouseEvent(var1.getComponent(), var1, this.graphComponent.getGraphControl());
      Iterator var3 = this.handlers.values().iterator();
      String var4 = null;

      while (var3.hasNext() && var4 == null) {
         var4 = ((mxCellHandler)var3.next()).getToolTipText(var2);
      }

      return var4;
   }

   public void reset() {
      Iterator var1 = this.handlers.values().iterator();

      while (var1.hasNext()) {
         ((mxCellHandler)var1.next()).reset();
      }
   }

   public void refresh() {
      mxGraph var1 = this.graphComponent.getGraph();
      LinkedHashMap var2 = this.handlers;
      this.handlers = new LinkedHashMap<>();
      Object[] var3 = var1.getSelectionCells();
      boolean var4 = var3.length <= this.getMaxHandlers();
      Rectangle var5 = null;

      for (int var6 = 0; var6 < var3.length; var6++) {
         mxCellState var7 = var1.getView().getState(var3[var6]);
         if (var7 != null && var7.getCell() != var1.getView().getCurrentRoot()) {
            mxCellHandler var8 = (mxCellHandler)var2.remove(var3[var6]);
            if (var8 != null) {
               var8.refresh(var7);
            } else {
               var8 = this.graphComponent.createHandler(var7);
            }

            if (var8 != null) {
               var8.setHandlesVisible(var4);
               this.handlers.put(var3[var6], var8);
               Rectangle var9 = var8.getBounds();
               Stroke var10 = var8.getSelectionStroke();
               if (var10 != null) {
                  var9 = var10.createStrokedShape(var9).getBounds();
               }

               if (var5 == null) {
                  var5 = var9;
               } else {
                  var5.add(var9);
               }
            }
         }
      }

      for (mxCellHandler var13 : var2.values()) {
         var13.destroy();
      }

      Rectangle var12 = this.bounds;
      if (var5 != null) {
         if (var12 != null) {
            var12.add(var5);
         } else {
            var12 = var5;
         }
      }

      if (var12 != null) {
         this.graphComponent.getGraphControl().repaint(var12);
      }

      this.bounds = var5;
   }

   public void paintHandles(Graphics var1) {
      Iterator var2 = this.handlers.values().iterator();

      while (var2.hasNext()) {
         ((mxCellHandler)var2.next()).paint(var1);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
