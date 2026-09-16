package com.mxgraph.swing.handler;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.util.mxSwingConstants;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxUtils;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class mxRubberband implements MouseListener, MouseMotionListener {
   protected Color borderColor = mxSwingConstants.RUBBERBAND_BORDERCOLOR;
   protected Color fillColor = mxSwingConstants.RUBBERBAND_FILLCOLOR;
   protected mxGraphComponent graphComponent;
   protected boolean enabled = true;
   protected transient Point first;
   protected transient Rectangle bounds;

   public mxRubberband(final mxGraphComponent var1) {
      this.graphComponent = var1;
      var1.getGraphControl().addMouseListener(this);
      var1.getGraphControl().addMouseMotionListener(this);
      var1.addListener("afterPaint", new mxEventSource.mxIEventListener() {
         @Override
         public void invoke(Object var1, mxEventObject var2) {
            mxRubberband.this.paintRubberband((Graphics)var2.getProperty("g"));
         }
      });
      var1.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent var1x) {
            if (var1x.getKeyCode() == 27 && var1.isEscapeEnabled()) {
               mxRubberband.this.reset();
            }
         }
      });
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean var1) {
      this.enabled = var1;
   }

   public Color getBorderColor() {
      return this.borderColor;
   }

   public void setBorderColor(Color var1) {
      this.borderColor = var1;
   }

   public Color getFillColor() {
      return this.fillColor;
   }

   public void setFillColor(Color var1) {
      this.fillColor = var1;
   }

   public boolean isRubberbandTrigger(MouseEvent var1) {
      return true;
   }

   public void start(Point var1) {
      this.first = var1;
      this.bounds = new Rectangle(this.first);
   }

   public void reset() {
      this.first = null;
      if (this.bounds != null) {
         this.graphComponent.getGraphControl().repaint(this.bounds);
         this.bounds = null;
      }
   }

   public Object[] select(Rectangle var1, MouseEvent var2) {
      return this.graphComponent.selectRegion(var1, var2);
   }

   public void paintRubberband(Graphics var1) {
      if (this.first != null && this.bounds != null && this.graphComponent.isSignificant(this.bounds.width, this.bounds.height)) {
         Rectangle var2 = new Rectangle(this.bounds);
         var1.setColor(this.fillColor);
         mxUtils.fillClippedRect(var1, var2.x, var2.y, var2.width, var2.height);
         var1.setColor(this.borderColor);
         var2.width--;
         var2.height--;
         var1.drawRect(var2.x, var2.y, var2.width, var2.height);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (!var1.isConsumed() && this.isEnabled() && this.isRubberbandTrigger(var1) && !var1.isPopupTrigger()) {
         this.start(var1.getPoint());
         var1.consume();
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (!var1.isConsumed() && this.first != null) {
         Rectangle var2 = new Rectangle(this.bounds);
         this.bounds = new Rectangle(this.first);
         this.bounds.add(var1.getPoint());
         if (this.graphComponent.isSignificant(this.bounds.width, this.bounds.height)) {
            mxGraphComponent.mxGraphControl var3 = this.graphComponent.getGraphControl();
            Rectangle var4 = new Rectangle(var2);
            var4.add(this.bounds);
            if (this.bounds.x != var2.x) {
               int var5 = Math.max(this.bounds.x, var2.x);
               Rectangle var6 = new Rectangle(var4.x - 1, var4.y, var5 - var4.x + 2, var4.height);
               var3.repaint(var6);
            }

            if (this.bounds.x + this.bounds.width != var2.x + var2.width) {
               int var7 = Math.min(this.bounds.x + this.bounds.width, var2.x + var2.width);
               Rectangle var10 = new Rectangle(var7 - 1, var4.y, var4.x + var4.width - var7 + 1, var4.height);
               var3.repaint(var10);
            }

            if (this.bounds.y != var2.y) {
               int var8 = Math.max(this.bounds.y, var2.y);
               Rectangle var11 = new Rectangle(var4.x, var4.y - 1, var4.width, var8 - var4.y + 2);
               var3.repaint(var11);
            }

            if (this.bounds.y + this.bounds.height != var2.y + var2.height) {
               int var9 = Math.min(this.bounds.y + this.bounds.height, var2.y + var2.height);
               Rectangle var12 = new Rectangle(var4.x, var9 - 1, var4.width, var4.y + var4.height - var9 + 1);
               var3.repaint(var12);
            }

            if (!this.graphComponent.isToggleEvent(var1) && !this.graphComponent.getGraph().isSelectionEmpty()) {
               this.graphComponent.getGraph().clearSelection();
            }
         }

         var1.consume();
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Rectangle var2 = this.bounds;
      this.reset();
      if (!var1.isConsumed() && var2 != null && this.graphComponent.isSignificant(var2.width, var2.height)) {
         this.select(var2, var1);
         var1.consume();
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

   @Override
   public void mouseMoved(MouseEvent var1) {
   }
}
