package com.mxgraph.swing;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.canvas.mxICanvas;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.handler.mxCellHandler;
import com.mxgraph.swing.handler.mxConnectionHandler;
import com.mxgraph.swing.handler.mxEdgeHandler;
import com.mxgraph.swing.handler.mxElbowEdgeHandler;
import com.mxgraph.swing.handler.mxGraphHandler;
import com.mxgraph.swing.handler.mxGraphTransferHandler;
import com.mxgraph.swing.handler.mxPanningHandler;
import com.mxgraph.swing.handler.mxSelectionCellsHandler;
import com.mxgraph.swing.handler.mxVertexHandler;
import com.mxgraph.swing.util.mxCellOverlay;
import com.mxgraph.swing.util.mxICellOverlay;
import com.mxgraph.swing.view.mxCellEditor;
import com.mxgraph.swing.view.mxICellEditor;
import com.mxgraph.swing.view.mxInteractiveCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxEdgeStyle;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import com.mxgraph.view.mxTemporaryCellStates;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventObject;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoundedRangeModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.RepaintManager;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.TransferHandler;

public class mxGraphComponent extends JScrollPane implements Printable {
   private static final Logger log = Logger.getLogger(mxGraphComponent.class.getName());
   private static final long serialVersionUID = -30203858391633447L;
   public static final int GRID_STYLE_DOT = 0;
   public static final int GRID_STYLE_CROSS = 1;
   public static final int GRID_STYLE_LINE = 2;
   public static final int GRID_STYLE_DASHED = 3;
   public static final int ZOOM_POLICY_NONE = 0;
   public static final int ZOOM_POLICY_PAGE = 1;
   public static final int ZOOM_POLICY_WIDTH = 2;
   public static ImageIcon DEFAULT_EXPANDED_ICON = null;
   public static ImageIcon DEFAULT_COLLAPSED_ICON = null;
   public static ImageIcon DEFAULT_WARNING_ICON = null;
   public static final double DEFAULT_PAGESCALE = 1.4;
   protected mxGraph graph;
   protected mxGraphComponent.mxGraphControl graphControl;
   protected mxEventSource eventSource = new mxEventSource(this);
   protected mxICellEditor cellEditor;
   protected mxConnectionHandler connectionHandler;
   protected mxPanningHandler panningHandler;
   protected mxSelectionCellsHandler selectionCellsHandler;
   protected mxGraphHandler graphHandler;
   protected float previewAlpha = 0.5F;
   protected ImageIcon backgroundImage;
   protected PageFormat pageFormat = new PageFormat();
   protected mxInteractiveCanvas canvas;
   protected BufferedImage tripleBuffer;
   protected Graphics2D tripleBufferGraphics;
   protected double pageScale = 1.4;
   protected boolean pageVisible = false;
   protected boolean preferPageSize = false;
   protected boolean pageBreaksVisible = true;
   protected Color pageBreakColor = Color.darkGray;
   protected int horizontalPageCount = 1;
   protected int verticalPageCount = 1;
   protected boolean centerPage = true;
   protected Color pageBackgroundColor = new Color(144, 153, 174);
   protected Color pageShadowColor = new Color(110, 120, 140);
   protected Color pageBorderColor = Color.black;
   protected boolean gridVisible = false;
   protected Color gridColor = new Color(192, 192, 192);
   protected boolean autoScroll = true;
   protected boolean autoExtend = true;
   protected boolean dragEnabled = true;
   protected boolean importEnabled = true;
   protected boolean exportEnabled = true;
   protected boolean foldingEnabled = true;
   protected int tolerance = 4;
   protected boolean swimlaneSelectionEnabled = true;
   protected boolean transparentSwimlaneContent = true;
   protected int gridStyle = 0;
   protected ImageIcon expandedIcon = DEFAULT_EXPANDED_ICON;
   protected ImageIcon collapsedIcon = DEFAULT_COLLAPSED_ICON;
   protected ImageIcon warningIcon = DEFAULT_WARNING_ICON;
   protected boolean antiAlias = true;
   protected boolean textAntiAlias = true;
   protected boolean escapeEnabled = true;
   protected boolean invokesStopCellEditing = true;
   protected boolean enterStopsCellEditing = false;
   protected int zoomPolicy = 1;
   private transient boolean zooming = false;
   protected double zoomFactor = 1.2;
   protected boolean keepSelectionVisibleOnZoom = false;
   protected boolean centerZoom = true;
   protected boolean tripleBuffered = false;
   public boolean showDirtyRectangle = false;
   protected Hashtable<Object, Component[]> components = new Hashtable<>();
   protected Hashtable<Object, mxICellOverlay[]> overlays = new Hashtable<>();
   private transient boolean centerOnResize = true;
   protected mxEventSource.mxIEventListener updateHandler = new mxEventSource.mxIEventListener() {
      @Override
      public void invoke(Object var1, mxEventObject var2) {
         mxGraphComponent.this.updateComponents();
         mxGraphComponent.this.graphControl.updatePreferredSize();
      }
   };
   protected mxEventSource.mxIEventListener repaintHandler = new mxEventSource.mxIEventListener() {
      @Override
      public void invoke(Object var1, mxEventObject var2) {
         mxRectangle var3 = (mxRectangle)var2.getProperty("region");
         Rectangle var4 = var3 != null ? var3.getRectangle() : null;
         if (var4 != null) {
            var4.grow(1, 1);
         }

         mxGraphComponent.this.repaintTripleBuffer(var4);
         mxGraphComponent.this.graphControl.repaint(var4 != null ? var4 : mxGraphComponent.this.getViewport().getViewRect());
         JPanel var5 = (JPanel)mxGraphComponent.this.getClientProperty("dirty");
         if (mxGraphComponent.this.showDirtyRectangle) {
            if (var5 == null) {
               var5 = new JPanel();
               var5.setOpaque(false);
               var5.setBorder(BorderFactory.createLineBorder(Color.RED));
               mxGraphComponent.this.putClientProperty("dirty", var5);
               mxGraphComponent.this.graphControl.add(var5);
            }

            if (var3 != null) {
               var5.setBounds(var3.getRectangle());
            }

            var5.setVisible(var3 != null);
         } else if (var5 != null && var5.getParent() != null) {
            var5.getParent().remove(var5);
            mxGraphComponent.this.putClientProperty("dirty", null);
            mxGraphComponent.this.repaint();
         }
      }
   };
   protected PropertyChangeListener viewChangeHandler = new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent var1) {
         if (var1.getPropertyName().equals("view")) {
            mxGraphView var2 = (mxGraphView)var1.getOldValue();
            mxGraphView var3 = (mxGraphView)var1.getNewValue();
            if (var2 != null) {
               var2.removeListener(mxGraphComponent.this.updateHandler);
            }

            if (var3 != null) {
               var3.addListener("scale", mxGraphComponent.this.updateHandler);
               var3.addListener("translate", mxGraphComponent.this.updateHandler);
               var3.addListener("scaleAndTranslate", mxGraphComponent.this.updateHandler);
               var3.addListener("up", mxGraphComponent.this.updateHandler);
               var3.addListener("down", mxGraphComponent.this.updateHandler);
            }
         } else if (var1.getPropertyName().equals("model")) {
            mxGraphModel var4 = (mxGraphModel)var1.getOldValue();
            mxGraphModel var5 = (mxGraphModel)var1.getNewValue();
            if (var4 != null) {
               var4.removeListener(mxGraphComponent.this.updateHandler);
            }

            if (var5 != null) {
               var5.addListener("change", mxGraphComponent.this.updateHandler);
            }
         }
      }
   };
   protected mxEventSource.mxIEventListener scaleHandler = new mxEventSource.mxIEventListener() {
      @Override
      public void invoke(Object var1, mxEventObject var2) {
         if (!mxGraphComponent.this.zooming) {
            mxGraphComponent.this.zoomPolicy = 0;
         }
      }
   };

   public mxGraphComponent(mxGraph var1) {
      this.setCellEditor(this.createCellEditor());
      this.canvas = this.createCanvas();
      this.graphControl = this.createGraphControl();
      this.installFocusHandler();
      this.installKeyHandler();
      this.installResizeHandler();
      this.setGraph(var1);
      this.setViewportView(this.graphControl);
      this.createHandlers();
      this.installDoubleClickHandler();
   }

   protected void installFocusHandler() {
      this.graphControl.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent var1) {
            if (!mxGraphComponent.this.hasFocus()) {
               mxGraphComponent.this.requestFocus();
            }
         }
      });
   }

   protected void installKeyHandler() {
      this.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent var1) {
            if (var1.getKeyCode() == 27 && mxGraphComponent.this.isEscapeEnabled()) {
               mxGraphComponent.this.escape(var1);
            }
         }
      });
   }

   protected void installResizeHandler() {
      this.addComponentListener(new ComponentAdapter() {
         @Override
         public void componentResized(ComponentEvent var1) {
            mxGraphComponent.this.zoomAndCenter();
         }
      });
   }

   protected void installDoubleClickHandler() {
      this.graphControl.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseReleased(MouseEvent var1) {
            if (mxGraphComponent.this.isEnabled()) {
               if (!var1.isConsumed() && mxGraphComponent.this.isEditEvent(var1)) {
                  Object var2 = mxGraphComponent.this.getCellAt(var1.getX(), var1.getY(), false);
                  if (var2 != null && mxGraphComponent.this.getGraph().isCellEditable(var2)) {
                     mxGraphComponent.this.startEditingAtCell(var2, var1);
                  }
               } else {
                  mxGraphComponent.this.stopEditing(!mxGraphComponent.this.invokesStopCellEditing);
               }
            }
         }
      });
   }

   protected mxICellEditor createCellEditor() {
      return new mxCellEditor(this);
   }

   public void setGraph(mxGraph var1) {
      mxGraph var2 = this.graph;
      if (this.graph != null) {
         this.graph.removeListener(this.repaintHandler);
         this.graph.getModel().removeListener(this.updateHandler);
         this.graph.getView().removeListener(this.updateHandler);
         this.graph.removePropertyChangeListener(this.viewChangeHandler);
         this.graph.getView().removeListener(this.scaleHandler);
      }

      this.graph = var1;
      this.graph.addListener("repaint", this.repaintHandler);
      this.graph.getModel().addListener("change", this.updateHandler);
      mxGraphView var3 = this.graph.getView();
      var3.addListener("scale", this.updateHandler);
      var3.addListener("translate", this.updateHandler);
      var3.addListener("scaleAndTranslate", this.updateHandler);
      var3.addListener("up", this.updateHandler);
      var3.addListener("down", this.updateHandler);
      this.graph.addPropertyChangeListener(this.viewChangeHandler);
      this.graph.getView().addListener("scale", this.scaleHandler);
      this.graph.getView().addListener("scaleAndTranslate", this.scaleHandler);
      this.updateHandler.invoke(this.graph.getView(), null);
      this.firePropertyChange("graph", var2, this.graph);
   }

   public mxGraph getGraph() {
      return this.graph;
   }

   protected mxGraphComponent.mxGraphControl createGraphControl() {
      return new mxGraphComponent.mxGraphControl();
   }

   public mxGraphComponent.mxGraphControl getGraphControl() {
      return this.graphControl;
   }

   protected void createHandlers() {
      this.setTransferHandler(this.createTransferHandler());
      this.panningHandler = this.createPanningHandler();
      this.selectionCellsHandler = this.createSelectionCellsHandler();
      this.connectionHandler = this.createConnectionHandler();
      this.graphHandler = this.createGraphHandler();
   }

   protected TransferHandler createTransferHandler() {
      return new mxGraphTransferHandler();
   }

   protected mxSelectionCellsHandler createSelectionCellsHandler() {
      return new mxSelectionCellsHandler(this);
   }

   protected mxGraphHandler createGraphHandler() {
      return new mxGraphHandler(this);
   }

   public mxSelectionCellsHandler getSelectionCellsHandler() {
      return this.selectionCellsHandler;
   }

   public mxGraphHandler getGraphHandler() {
      return this.graphHandler;
   }

   protected mxConnectionHandler createConnectionHandler() {
      return new mxConnectionHandler(this);
   }

   public mxConnectionHandler getConnectionHandler() {
      return this.connectionHandler;
   }

   protected mxPanningHandler createPanningHandler() {
      return new mxPanningHandler(this);
   }

   public mxPanningHandler getPanningHandler() {
      return this.panningHandler;
   }

   public boolean isEditing() {
      return this.getCellEditor().getEditingCell() != null;
   }

   public mxICellEditor getCellEditor() {
      return this.cellEditor;
   }

   public void setCellEditor(mxICellEditor var1) {
      mxICellEditor var2 = this.cellEditor;
      this.cellEditor = var1;
      this.firePropertyChange("cellEditor", var2, this.cellEditor);
   }

   public int getTolerance() {
      return this.tolerance;
   }

   public void setTolerance(int var1) {
      int var2 = this.tolerance;
      this.tolerance = var1;
      this.firePropertyChange("tolerance", (int)var2, (int)this.tolerance);
   }

   public PageFormat getPageFormat() {
      return this.pageFormat;
   }

   public void setPageFormat(PageFormat var1) {
      PageFormat var2 = this.pageFormat;
      this.pageFormat = var1;
      this.firePropertyChange("pageFormat", var2, this.pageFormat);
   }

   public double getPageScale() {
      return this.pageScale;
   }

   public void setPageScale(double var1) {
      double var3 = this.pageScale;
      this.pageScale = var1;
      this.firePropertyChange("pageScale", (double)var3, (double)this.pageScale);
   }

   public mxRectangle getLayoutAreaSize() {
      if (this.pageVisible) {
         Dimension var1 = this.getPreferredSizeForPage();
         return new mxRectangle(new Rectangle(var1));
      } else {
         return new mxRectangle(new Rectangle(this.graphControl.getSize()));
      }
   }

   public ImageIcon getBackgroundImage() {
      return this.backgroundImage;
   }

   public void setBackgroundImage(ImageIcon var1) {
      ImageIcon var2 = this.backgroundImage;
      this.backgroundImage = var1;
      this.firePropertyChange("backgroundImage", var2, this.backgroundImage);
   }

   public boolean isPageVisible() {
      return this.pageVisible;
   }

   public void setPageVisible(boolean var1) {
      boolean var2 = this.pageVisible;
      this.pageVisible = var1;
      this.firePropertyChange("pageVisible", var2, this.pageVisible);
   }

   public boolean isPreferPageSize() {
      return this.preferPageSize;
   }

   public void setPreferPageSize(boolean var1) {
      boolean var2 = this.preferPageSize;
      this.preferPageSize = var1;
      this.firePropertyChange("preferPageSize", var2, this.preferPageSize);
   }

   public boolean isPageBreaksVisible() {
      return this.pageBreaksVisible;
   }

   public void setPageBreaksVisible(boolean var1) {
      boolean var2 = this.pageBreaksVisible;
      this.pageBreaksVisible = var1;
      this.firePropertyChange("pageBreaksVisible", var2, this.pageBreaksVisible);
   }

   public Color getPageBreakColor() {
      return this.pageBreakColor;
   }

   public void setPageBreakColor(Color var1) {
      this.pageBreakColor = var1;
   }

   public void setHorizontalPageCount(int var1) {
      int var2 = this.horizontalPageCount;
      this.horizontalPageCount = var1;
      this.firePropertyChange("horizontalPageCount", (int)var2, (int)this.horizontalPageCount);
   }

   public int getHorizontalPageCount() {
      return this.horizontalPageCount;
   }

   public void setVerticalPageCount(int var1) {
      int var2 = this.verticalPageCount;
      this.verticalPageCount = var1;
      this.firePropertyChange("verticalPageCount", (int)var2, (int)this.verticalPageCount);
   }

   public int getVerticalPageCount() {
      return this.verticalPageCount;
   }

   public boolean isCenterPage() {
      return this.centerPage;
   }

   public void setCenterPage(boolean var1) {
      boolean var2 = this.centerPage;
      this.centerPage = var1;
      this.firePropertyChange("centerPage", var2, this.centerPage);
   }

   public Color getPageBackgroundColor() {
      return this.pageBackgroundColor;
   }

   public void setPageBackgroundColor(Color var1) {
      Color var2 = this.pageBackgroundColor;
      this.pageBackgroundColor = var1;
      this.firePropertyChange("pageBackgroundColor", var2, this.pageBackgroundColor);
   }

   public Color getPageShadowColor() {
      return this.pageShadowColor;
   }

   public void setPageShadowColor(Color var1) {
      Color var2 = this.pageShadowColor;
      this.pageShadowColor = var1;
      this.firePropertyChange("pageShadowColor", var2, this.pageShadowColor);
   }

   public Color getPageBorderColor() {
      return this.pageBorderColor;
   }

   public void setPageBorderColor(Color var1) {
      Color var2 = this.pageBorderColor;
      this.pageBorderColor = var1;
      this.firePropertyChange("pageBorderColor", var2, this.pageBorderColor);
   }

   public boolean isKeepSelectionVisibleOnZoom() {
      return this.keepSelectionVisibleOnZoom;
   }

   public void setKeepSelectionVisibleOnZoom(boolean var1) {
      boolean var2 = this.keepSelectionVisibleOnZoom;
      this.keepSelectionVisibleOnZoom = var1;
      this.firePropertyChange("keepSelectionVisibleOnZoom", var2, this.keepSelectionVisibleOnZoom);
   }

   public double getZoomFactor() {
      return this.zoomFactor;
   }

   public void setZoomFactor(double var1) {
      double var3 = this.zoomFactor;
      this.zoomFactor = var1;
      this.firePropertyChange("zoomFactor", (double)var3, (double)this.zoomFactor);
   }

   public boolean isCenterZoom() {
      return this.centerZoom;
   }

   public void setCenterZoom(boolean var1) {
      boolean var2 = this.centerZoom;
      this.centerZoom = var1;
      this.firePropertyChange("centerZoom", var2, this.centerZoom);
   }

   public void setZoomPolicy(int var1) {
      int var2 = this.zoomPolicy;
      this.zoomPolicy = var1;
      if (this.zoomPolicy != 0) {
         this.zoom(this.zoomPolicy == 1, true);
      }

      this.firePropertyChange("zoomPolicy", (int)var2, (int)this.zoomPolicy);
   }

   public int getZoomPolicy() {
      return this.zoomPolicy;
   }

   public void escape(KeyEvent var1) {
      if (this.selectionCellsHandler != null) {
         this.selectionCellsHandler.reset();
      }

      if (this.connectionHandler != null) {
         this.connectionHandler.reset();
      }

      if (this.graphHandler != null) {
         this.graphHandler.reset();
      }

      if (this.cellEditor != null) {
         this.cellEditor.stopEditing(true);
      }
   }

   public Object[] importCells(Object[] var1, double var2, double var4, Object var6, Point var7) {
      return this.graph.moveCells(var1, var2, var4, true, var6, var7);
   }

   public void refresh() {
      this.graph.refresh();
      this.selectionCellsHandler.refresh();
   }

   public mxPoint getPointForEvent(MouseEvent var1) {
      return this.getPointForEvent(var1, true);
   }

   public mxPoint getPointForEvent(MouseEvent var1, boolean var2) {
      double var3 = this.graph.getView().getScale();
      mxPoint var5 = this.graph.getView().getTranslate();
      double var6 = var2 ? this.graph.getGridSize() / 2 : 0.0;
      double var8 = this.graph.snap(var1.getX() / var3 - var5.getX() - var6);
      double var10 = this.graph.snap(var1.getY() / var3 - var5.getY() - var6);
      return new mxPoint(var8, var10);
   }

   public void startEditing() {
      this.startEditingAtCell(null);
   }

   public void startEditingAtCell(Object var1) {
      this.startEditingAtCell(var1, null);
   }

   public void startEditingAtCell(Object var1, EventObject var2) {
      if (var1 == null) {
         var1 = this.graph.getSelectionCell();
         if (var1 != null && !this.graph.isCellEditable(var1)) {
            var1 = null;
         }
      }

      if (var1 != null) {
         this.eventSource.fireEvent(new mxEventObject("startEditing", "cell", var1, "event", var2));
         this.cellEditor.startEditing(var1, var2);
      }
   }

   public String getEditingValue(Object var1, EventObject var2) {
      return this.graph.convertValueToString(var1);
   }

   public void stopEditing(boolean var1) {
      this.cellEditor.stopEditing(var1);
   }

   public Object labelChanged(Object var1, Object var2, EventObject var3) {
      mxIGraphModel var4 = this.graph.getModel();
      var4.beginUpdate();

      try {
         this.graph.cellLabelChanged(var1, var2, this.graph.isAutoSizeCell(var1));
         this.eventSource.fireEvent(new mxEventObject("labelChanged", "cell", var1, "value", var2, "event", var3));
      } finally {
         var4.endUpdate();
      }

      return var1;
   }

   protected Dimension getPreferredSizeForPage() {
      return new Dimension(
         (int)Math.round(this.pageFormat.getWidth() * this.pageScale * this.horizontalPageCount),
         (int)Math.round(this.pageFormat.getHeight() * this.pageScale * this.verticalPageCount)
      );
   }

   public int getVerticalPageBorder() {
      return (int)Math.round(this.pageFormat.getWidth() * this.pageScale);
   }

   public int getHorizontalPageBorder() {
      return (int)Math.round(0.5 * this.pageFormat.getHeight() * this.pageScale);
   }

   protected Dimension getScaledPreferredSizeForGraph() {
      mxRectangle var1 = this.graph.getGraphBounds();
      int var2 = this.graph.getBorder();
      return new Dimension((int)Math.round(var1.getX() + var1.getWidth()) + var2 + 1, (int)Math.round(var1.getY() + var1.getHeight()) + var2 + 1);
   }

   protected mxPoint getPageTranslate(double var1) {
      Dimension var3 = this.getPreferredSizeForPage();
      Dimension var4 = new Dimension(var3);
      if (!this.preferPageSize) {
         var4.width = var4.width + 2 * this.getHorizontalPageBorder();
         var4.height = var4.height + 2 * this.getVerticalPageBorder();
      }

      double var5 = Math.max(var4.width, (this.getViewport().getWidth() - 8) / var1);
      double var7 = Math.max(var4.height, (this.getViewport().getHeight() - 8) / var1);
      double var9 = Math.max(0.0, (var5 - var3.width) / 2.0);
      double var11 = Math.max(0.0, (var7 - var3.height) / 2.0);
      return new mxPoint(var9, var11);
   }

   public void zoomAndCenter() {
      if (this.zoomPolicy != 0) {
         this.zoom(this.zoomPolicy == 1, this.centerOnResize || this.zoomPolicy == 1);
         this.centerOnResize = false;
      } else if (this.pageVisible && this.centerPage) {
         mxPoint var1 = this.getPageTranslate(this.graph.getView().getScale());
         this.graph.getView().setTranslate(var1);
      } else {
         this.getGraphControl().updatePreferredSize();
      }
   }

   public void zoomIn() {
      this.zoom(this.zoomFactor);
   }

   public void zoomOut() {
      this.zoom(1.0 / this.zoomFactor);
   }

   public void zoom(double var1) {
      mxGraphView var3 = this.graph.getView();
      double var4 = (int)(var3.getScale() * 100.0 * var1) / 100.0;
      if (var4 != var3.getScale() && var4 > 0.04) {
         mxPoint var6 = this.pageVisible && this.centerPage ? this.getPageTranslate(var4) : new mxPoint();
         this.graph.getView().scaleAndTranslate(var4, var6.getX(), var6.getY());
         if (this.keepSelectionVisibleOnZoom && !this.graph.isSelectionEmpty()) {
            this.getGraphControl().scrollRectToVisible(var3.getBoundingBox(this.graph.getSelectionCells()).getRectangle());
         } else {
            this.maintainScrollBar(true, var1, this.centerZoom);
            this.maintainScrollBar(false, var1, this.centerZoom);
         }
      }
   }

   public void zoomTo(final double var1, final boolean var3) {
      mxGraphView var4 = this.graph.getView();
      final double var5 = var4.getScale();
      mxPoint var7 = this.pageVisible && this.centerPage ? this.getPageTranslate(var1) : new mxPoint();
      this.graph.getView().scaleAndTranslate(var1, var7.getX(), var7.getY());
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            mxGraphComponent.this.maintainScrollBar(true, var1 / var5, var3);
            mxGraphComponent.this.maintainScrollBar(false, var1 / var5, var3);
         }
      });
   }

   public void zoomActual() {
      mxPoint var1 = this.pageVisible && this.centerPage ? this.getPageTranslate(1.0) : new mxPoint();
      this.graph.getView().scaleAndTranslate(1.0, var1.getX(), var1.getY());
      if (this.isPageVisible()) {
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Dimension var1x = mxGraphComponent.this.getPreferredSizeForPage();
               if (mxGraphComponent.this.getViewport().getWidth() > var1x.getWidth()) {
                  mxGraphComponent.this.scrollToCenter(true);
               } else {
                  JScrollBar var2 = mxGraphComponent.this.getHorizontalScrollBar();
                  if (var2 != null) {
                     var2.setValue(var2.getMaximum() / 3 - 4);
                  }
               }

               if (mxGraphComponent.this.getViewport().getHeight() > var1x.getHeight()) {
                  mxGraphComponent.this.scrollToCenter(false);
               } else {
                  JScrollBar var3 = mxGraphComponent.this.getVerticalScrollBar();
                  if (var3 != null) {
                     var3.setValue(var3.getMaximum() / 4 - 4);
                  }
               }
            }
         });
      }
   }

   public void zoom(final boolean var1, final boolean var2) {
      if (this.pageVisible && !this.zooming) {
         this.zooming = true;

         try {
            int var3 = this.getPageShadowColor() != null ? 8 : 0;
            double var4 = this.getViewport().getWidth() - var3;
            double var6 = this.getViewport().getHeight() - var3;
            Dimension var8 = this.getPreferredSizeForPage();
            double var9 = var8.width;
            double var11 = var8.height;
            double var13 = var4 / var9;
            double var15 = var1 ? var6 / var11 : var13;
            double var17 = (int)(Math.min(var13, var15) * 20.0) / 20.0;
            if (var17 > 0.0) {
               mxGraphView var19 = this.graph.getView();
               double var20 = var19.getScale();
               mxPoint var22 = this.centerPage ? this.getPageTranslate(var17) : new mxPoint();
               var19.scaleAndTranslate(var17, var22.getX(), var22.getY());
               final double var23 = var17 / var20;
               SwingUtilities.invokeLater(new Runnable() {
                  @Override
                  public void run() {
                     if (var2) {
                        if (var1) {
                           mxGraphComponent.this.scrollToCenter(true);
                           mxGraphComponent.this.scrollToCenter(false);
                        } else {
                           mxGraphComponent.this.scrollToCenter(true);
                           mxGraphComponent.this.maintainScrollBar(false, var23, false);
                        }
                     } else if (var23 != 1.0) {
                        mxGraphComponent.this.maintainScrollBar(true, var23, false);
                        mxGraphComponent.this.maintainScrollBar(false, var23, false);
                     }
                  }
               });
            }
         } finally {
            this.zooming = false;
         }
      }
   }

   protected void maintainScrollBar(boolean var1, double var2, boolean var4) {
      JScrollBar var5 = var1 ? this.getHorizontalScrollBar() : this.getVerticalScrollBar();
      if (var5 != null) {
         BoundedRangeModel var6 = var5.getModel();
         int var7 = (int)Math.round(var6.getValue() * var2) + (int)Math.round(var4 ? var6.getExtent() * (var2 - 1.0) / 2.0 : 0.0);
         var6.setValue(var7);
      }
   }

   public void scrollToCenter(boolean var1) {
      JScrollBar var2 = var1 ? this.getHorizontalScrollBar() : this.getVerticalScrollBar();
      if (var2 != null) {
         BoundedRangeModel var3 = var2.getModel();
         int var4 = var3.getMaximum() / 2 - var3.getExtent() / 2;
         var3.setValue(var4);
      }
   }

   public void scrollCellToVisible(Object var1) {
      this.scrollCellToVisible(var1, false);
   }

   public void scrollCellToVisible(Object var1, boolean var2) {
      mxCellState var3 = this.graph.getView().getState(var1);
      if (var3 != null) {
         mxRectangle var4 = var3;
         if (var2) {
            var4 = (mxRectangle)var4.clone();
            var4.setX(var4.getCenterX() - this.getWidth() / 2);
            var4.setWidth(this.getWidth());
            var4.setY(var4.getCenterY() - this.getHeight() / 2);
            var4.setHeight(this.getHeight());
         }

         this.getGraphControl().scrollRectToVisible(var4.getRectangle());
      }
   }

   public Object getCellAt(int var1, int var2) {
      return this.getCellAt(var1, var2, true);
   }

   public Object getCellAt(int var1, int var2, boolean var3) {
      return this.getCellAt(var1, var2, var3, null);
   }

   public Object getCellAt(int var1, int var2, boolean var3, Object var4) {
      if (var4 == null) {
         var4 = this.graph.getDefaultParent();
      }

      if (var4 != null) {
         mxPoint var5 = this.canvas.getTranslate();
         double var6 = this.canvas.getScale();

         try {
            this.canvas.setScale(this.graph.getView().getScale());
            this.canvas.setTranslate(0.0, 0.0);
            mxIGraphModel var8 = this.graph.getModel();
            mxGraphView var9 = this.graph.getView();
            Rectangle var10 = new Rectangle(var1, var2, 1, 1);
            int var11 = var8.getChildCount(var4);

            for (int var12 = var11 - 1; var12 >= 0; var12--) {
               Object var13 = var8.getChildAt(var4, var12);
               Object var14 = this.getCellAt(var1, var2, var3, var13);
               if (var14 != null) {
                  return var14;
               }

               if (this.graph.isCellVisible(var13)) {
                  mxCellState var15 = var9.getState(var13);
                  if (var15 != null
                     && this.canvas.intersects(this, var10, var15)
                     && (!this.graph.isSwimlane(var13) || var3 || this.transparentSwimlaneContent && !this.canvas.hitSwimlaneContent(this, var15, var1, var2))) {
                     return var13;
                  }
               }
            }
         } finally {
            this.canvas.setScale(var6);
            this.canvas.setTranslate((int)var5.getX(), (int)var5.getY());
         }
      }

      return null;
   }

   public void setSwimlaneSelectionEnabled(boolean var1) {
      boolean var2 = this.swimlaneSelectionEnabled;
      this.swimlaneSelectionEnabled = var1;
      this.firePropertyChange("swimlaneSelectionEnabled", var2, this.swimlaneSelectionEnabled);
   }

   public boolean isSwimlaneSelectionEnabled() {
      return this.swimlaneSelectionEnabled;
   }

   public Object[] selectRegion(Rectangle var1, MouseEvent var2) {
      Object[] var3 = this.getCells(var1);
      if (var3.length > 0) {
         this.selectCellsForEvent(var3, var2);
      } else if (!this.graph.isSelectionEmpty() && !var2.isConsumed()) {
         this.graph.clearSelection();
      }

      return var3;
   }

   public Object[] getCells(Rectangle var1) {
      return this.getCells(var1, null);
   }

   public Object[] getCells(Rectangle var1, Object var2) {
      ArrayList var3 = new ArrayList();
      if (var1.width > 0 || var1.height > 0) {
         if (var2 == null) {
            var2 = this.graph.getDefaultParent();
         }

         if (var2 != null) {
            mxPoint var4 = this.canvas.getTranslate();
            double var5 = this.canvas.getScale();

            try {
               this.canvas.setScale(this.graph.getView().getScale());
               this.canvas.setTranslate(0.0, 0.0);
               mxIGraphModel var7 = this.graph.getModel();
               mxGraphView var8 = this.graph.getView();
               int var9 = var7.getChildCount(var2);

               for (int var10 = 0; var10 < var9; var10++) {
                  Object var11 = var7.getChildAt(var2, var10);
                  mxCellState var12 = var8.getState(var11);
                  if (this.graph.isCellVisible(var11) && var12 != null) {
                     if (this.canvas.contains(this, var1, var12)) {
                        var3.add(var11);
                     } else {
                        var3.addAll(Arrays.asList(this.getCells(var1, var11)));
                     }
                  }
               }
            } finally {
               this.canvas.setScale(var5);
               this.canvas.setTranslate(var4.getX(), var4.getY());
            }
         }
      }

      return var3.toArray();
   }

   public void selectCellsForEvent(Object[] var1, MouseEvent var2) {
      if (this.isToggleEvent(var2)) {
         this.graph.addSelectionCells(var1);
      } else {
         this.graph.setSelectionCells(var1);
      }
   }

   public void selectCellForEvent(Object var1, MouseEvent var2) {
      boolean var3 = this.graph.isCellSelected(var1);
      if (this.isToggleEvent(var2)) {
         if (var3) {
            this.graph.removeSelectionCell(var1);
         } else {
            this.graph.addSelectionCell(var1);
         }
      } else if (!var3 || this.graph.getSelectionCount() != 1) {
         this.graph.setSelectionCell(var1);
      }
   }

   public boolean isSignificant(double var1, double var3) {
      return Math.abs(var1) > this.tolerance || Math.abs(var3) > this.tolerance;
   }

   public ImageIcon getFoldingIcon(mxCellState var1) {
      if (var1 != null && this.isFoldingEnabled() && !this.getGraph().getModel().isEdge(var1.getCell())) {
         Object var2 = var1.getCell();
         boolean var3 = this.graph.isCellCollapsed(var2);
         if (this.graph.isCellFoldable(var2, !var3)) {
            return var3 ? this.collapsedIcon : this.expandedIcon;
         }
      }

      return null;
   }

   public Rectangle getFoldingIconBounds(mxCellState var1, ImageIcon var2) {
      mxIGraphModel var3 = this.graph.getModel();
      boolean var4 = var3.isEdge(var1.getCell());
      double var5 = this.getGraph().getView().getScale();
      int var7 = (int)Math.round(var1.getX() + 4.0 * var5);
      int var8 = (int)Math.round(var1.getY() + 4.0 * var5);
      int var9 = (int)Math.max(8.0, var2.getIconWidth() * var5);
      int var10 = (int)Math.max(8.0, var2.getIconHeight() * var5);
      if (var4) {
         mxPoint var11 = this.graph.getView().getPoint(var1);
         var7 = (int)var11.getX() - var9 / 2;
         var8 = (int)var11.getY() - var10 / 2;
      }

      return new Rectangle(var7, var8, var9, var10);
   }

   public boolean hitFoldingIcon(Object var1, int var2, int var3) {
      if (var1 != null) {
         mxIGraphModel var4 = this.graph.getModel();
         boolean var5 = var4.isEdge(var1);
         if (this.foldingEnabled && (var4.isVertex(var1) || var5)) {
            mxCellState var6 = this.graph.getView().getState(var1);
            if (var6 != null) {
               ImageIcon var7 = this.getFoldingIcon(var6);
               if (var7 != null) {
                  return this.getFoldingIconBounds(var6, var7).contains(var2, var3);
               }
            }
         }
      }

      return false;
   }

   public void setToolTips(boolean var1) {
      if (var1) {
         ToolTipManager.sharedInstance().registerComponent(this.graphControl);
      } else {
         ToolTipManager.sharedInstance().unregisterComponent(this.graphControl);
      }
   }

   public boolean isConnectable() {
      return this.connectionHandler.isEnabled();
   }

   public void setConnectable(boolean var1) {
      this.connectionHandler.setEnabled(var1);
   }

   public boolean isPanning() {
      return this.panningHandler.isEnabled();
   }

   public void setPanning(boolean var1) {
      this.panningHandler.setEnabled(var1);
   }

   public boolean isAutoScroll() {
      return this.autoScroll;
   }

   public void setAutoScroll(boolean var1) {
      this.autoScroll = var1;
   }

   public boolean isAutoExtend() {
      return this.autoExtend;
   }

   public void setAutoExtend(boolean var1) {
      this.autoExtend = var1;
   }

   public boolean isEscapeEnabled() {
      return this.escapeEnabled;
   }

   public void setEscapeEnabled(boolean var1) {
      boolean var2 = this.escapeEnabled;
      this.escapeEnabled = var1;
      this.firePropertyChange("escapeEnabled", var2, this.escapeEnabled);
   }

   public boolean isInvokesStopCellEditing() {
      return this.invokesStopCellEditing;
   }

   public void setInvokesStopCellEditing(boolean var1) {
      boolean var2 = this.invokesStopCellEditing;
      this.invokesStopCellEditing = var1;
      this.firePropertyChange("invokesStopCellEditing", var2, this.invokesStopCellEditing);
   }

   public boolean isEnterStopsCellEditing() {
      return this.enterStopsCellEditing;
   }

   public void setEnterStopsCellEditing(boolean var1) {
      boolean var2 = this.enterStopsCellEditing;
      this.enterStopsCellEditing = var1;
      this.firePropertyChange("enterStopsCellEditing", var2, this.enterStopsCellEditing);
   }

   public boolean isDragEnabled() {
      return this.dragEnabled;
   }

   public void setDragEnabled(boolean var1) {
      boolean var2 = this.dragEnabled;
      this.dragEnabled = var1;
      this.firePropertyChange("dragEnabled", var2, this.dragEnabled);
   }

   public boolean isGridVisible() {
      return this.gridVisible;
   }

   public void setGridVisible(boolean var1) {
      boolean var2 = this.gridVisible;
      this.gridVisible = var1;
      this.firePropertyChange("gridVisible", var2, this.gridVisible);
   }

   public boolean isAntiAlias() {
      return this.antiAlias;
   }

   public void setAntiAlias(boolean var1) {
      boolean var2 = this.antiAlias;
      this.antiAlias = var1;
      this.firePropertyChange("antiAlias", var2, this.antiAlias);
   }

   public boolean isTextAntiAlias() {
      return this.antiAlias;
   }

   public void setTextAntiAlias(boolean var1) {
      boolean var2 = this.textAntiAlias;
      this.textAntiAlias = var1;
      this.firePropertyChange("textAntiAlias", var2, this.textAntiAlias);
   }

   public float getPreviewAlpha() {
      return this.previewAlpha;
   }

   public void setPreviewAlpha(float var1) {
      float var2 = this.previewAlpha;
      this.previewAlpha = var1;
      this.firePropertyChange("previewAlpha", (float)var2, (float)this.previewAlpha);
   }

   public boolean isTripleBuffered() {
      return this.tripleBuffered;
   }

   public boolean isForceTripleBuffered() {
      return false;
   }

   public void setTripleBuffered(boolean var1) {
      boolean var2 = this.tripleBuffered;
      this.tripleBuffered = var1;
      this.firePropertyChange("tripleBuffered", var2, this.tripleBuffered);
   }

   public Color getGridColor() {
      return this.gridColor;
   }

   public void setGridColor(Color var1) {
      Color var2 = this.gridColor;
      this.gridColor = var1;
      this.firePropertyChange("gridColor", var2, this.gridColor);
   }

   public int getGridStyle() {
      return this.gridStyle;
   }

   public void setGridStyle(int var1) {
      int var2 = this.gridStyle;
      this.gridStyle = var1;
      this.firePropertyChange("gridStyle", (int)var2, (int)this.gridStyle);
   }

   public boolean isImportEnabled() {
      return this.importEnabled;
   }

   public void setImportEnabled(boolean var1) {
      boolean var2 = this.importEnabled;
      this.importEnabled = var1;
      this.firePropertyChange("importEnabled", var2, this.importEnabled);
   }

   public Object[] getImportableCells(Object[] var1) {
      return mxGraphModel.filterCells(var1, new mxGraphModel.Filter() {
         @Override
         public boolean filter(Object var1) {
            return mxGraphComponent.this.canImportCell(var1);
         }
      });
   }

   public boolean canImportCell(Object var1) {
      return this.isImportEnabled();
   }

   public boolean isExportEnabled() {
      return this.exportEnabled;
   }

   public void setExportEnabled(boolean var1) {
      boolean var2 = this.exportEnabled;
      this.exportEnabled = var1;
      this.firePropertyChange("exportEnabled", var2, this.exportEnabled);
   }

   public Object[] getExportableCells(Object[] var1) {
      return mxGraphModel.filterCells(var1, new mxGraphModel.Filter() {
         @Override
         public boolean filter(Object var1) {
            return mxGraphComponent.this.canExportCell(var1);
         }
      });
   }

   public boolean canExportCell(Object var1) {
      return this.isExportEnabled();
   }

   public boolean isFoldingEnabled() {
      return this.foldingEnabled;
   }

   public void setFoldingEnabled(boolean var1) {
      boolean var2 = this.foldingEnabled;
      this.foldingEnabled = var1;
      this.firePropertyChange("foldingEnabled", var2, this.foldingEnabled);
   }

   public boolean isEditEvent(MouseEvent var1) {
      return var1 != null ? var1.getClickCount() == 2 : false;
   }

   public boolean isCloneEvent(MouseEvent var1) {
      return var1 != null ? var1.isControlDown() : false;
   }

   public boolean isToggleEvent(MouseEvent var1) {
      return var1 != null
         ? (
            mxUtils.IS_MAC
               ? SwingUtilities.isLeftMouseButton(var1) && var1.isMetaDown() || SwingUtilities.isRightMouseButton(var1) && var1.isControlDown()
               : var1.isControlDown()
         )
         : false;
   }

   public boolean isGridEnabledEvent(MouseEvent var1) {
      return var1 != null ? !var1.isAltDown() : false;
   }

   public boolean isPanningEvent(MouseEvent var1) {
      return var1 != null ? var1.isShiftDown() && var1.isControlDown() : false;
   }

   public boolean isConstrainedEvent(MouseEvent var1) {
      return var1 != null ? var1.isShiftDown() : false;
   }

   public boolean isForceMarqueeEvent(MouseEvent var1) {
      return var1 != null ? var1.isAltDown() : false;
   }

   public mxPoint snapScaledPoint(mxPoint var1) {
      return this.snapScaledPoint(var1, 0.0, 0.0);
   }

   public mxPoint snapScaledPoint(mxPoint var1, double var2, double var4) {
      if (var1 != null) {
         double var6 = this.graph.getView().getScale();
         mxPoint var8 = this.graph.getView().getTranslate();
         var1.setX((this.graph.snap(var1.getX() / var6 - var8.getX() + var2 / var6) + var8.getX()) * var6 - var2);
         var1.setY((this.graph.snap(var1.getY() / var6 - var8.getY() + var4 / var6) + var8.getY()) * var6 - var4);
      }

      return var1;
   }

   @Override
   public int print(Graphics var1, PageFormat var2, int var3) {
      byte var4 = 1;
      RepaintManager var5 = RepaintManager.currentManager(this);
      var5.setDoubleBufferingEnabled(false);
      mxGraphView var6 = this.graph.getView();
      boolean var7 = var6.isEventsEnabled();
      mxPoint var8 = var6.getTranslate();
      var6.setEventsEnabled(false);
      mxTemporaryCellStates var9 = new mxTemporaryCellStates(var6, 1.0 / this.pageScale);

      try {
         var6.setTranslate(new mxPoint(0.0, 0.0));
         mxInteractiveCanvas var10 = this.createCanvas();
         var10.setGraphics((Graphics2D)var1);
         var10.setScale(1.0 / this.pageScale);
         var6.revalidate();
         mxRectangle var11 = this.graph.getGraphBounds();
         Dimension var12 = new Dimension((int)Math.ceil(var11.getX() + var11.getWidth()) + 1, (int)Math.ceil(var11.getY() + var11.getHeight()) + 1);
         int var13 = (int)var2.getImageableWidth();
         int var14 = (int)var2.getImageableHeight();
         int var15 = (int)Math.max(Math.ceil((double)(var12.width - 5) / var13), 1.0);
         int var16 = (int)Math.max(Math.ceil((double)(var12.height - 5) / var14), 1.0);
         if (var3 < var15 * var16) {
            int var17 = (int)(var3 % var15 * var2.getImageableWidth());
            int var18 = (int)(Math.floor(var3 / var15) * var2.getImageableHeight());
            var1.translate(-var17 + (int)var2.getImageableX(), -var18 + (int)var2.getImageableY());
            var1.setClip(var17, var18, (int)(var17 + var2.getWidth()), (int)(var18 + var2.getHeight()));
            this.graph.drawGraph(var10);
            var4 = 0;
         }
      } finally {
         var6.setTranslate(var8);
         var9.destroy();
         var6.setEventsEnabled(var7);
         var5.setDoubleBufferingEnabled(true);
      }

      return var4;
   }

   public mxInteractiveCanvas getCanvas() {
      return this.canvas;
   }

   public BufferedImage getTripleBuffer() {
      return this.tripleBuffer;
   }

   public mxInteractiveCanvas createCanvas() {
      return new mxInteractiveCanvas();
   }

   public mxCellHandler createHandler(mxCellState var1) {
      if (this.graph.getModel().isVertex(var1.getCell())) {
         return new mxVertexHandler(this, var1);
      } else if (this.graph.getModel().isEdge(var1.getCell())) {
         mxEdgeStyle.mxEdgeStyleFunction var2 = this.graph.getView().getEdgeStyle(var1, null, null, null);
         return !this.graph.isLoop(var1) && var2 != mxEdgeStyle.ElbowConnector && var2 != mxEdgeStyle.SideToSide && var2 != mxEdgeStyle.TopToBottom
            ? new mxEdgeHandler(this, var1)
            : new mxElbowEdgeHandler(this, var1);
      } else {
         return new mxCellHandler(this, var1);
      }
   }

   public Component[] createComponents(mxCellState var1) {
      return null;
   }

   public void insertComponent(mxCellState var1, Component var2) {
      this.getGraphControl().add(var2, 0);
   }

   public void removeComponent(Component var1, Object var2) {
      if (var1.getParent() != null) {
         var1.getParent().remove(var1);
      }
   }

   public void updateComponent(mxCellState var1, Component var2) {
      int var3 = (int)var1.getX();
      int var4 = (int)var1.getY();
      int var5 = (int)var1.getWidth();
      int var6 = (int)var1.getHeight();
      Dimension var7 = var2.getMinimumSize();
      if (var7.width > var5) {
         var3 -= (var7.width - var5) / 2;
         var5 = var7.width;
      }

      if (var7.height > var6) {
         var4 -= (var7.height - var6) / 2;
         var6 = var7.height;
      }

      var2.setBounds(var3, var4, var5, var6);
   }

   public void updateComponents() {
      Object var1 = this.graph.getModel().getRoot();
      Hashtable var2 = this.updateComponents(var1);
      this.removeAllComponents(this.components);
      this.components = var2;
      if (!this.overlays.isEmpty()) {
         Hashtable var3 = this.updateCellOverlays(var1);
         this.removeAllOverlays(this.overlays);
         this.overlays = var3;
      }
   }

   public void removeAllComponents(Hashtable<Object, Component[]> var1) {
      for (Entry var3 : var1.entrySet()) {
         Component[] var4 = (Component[])var3.getValue();

         for (int var5 = 0; var5 < var4.length; var5++) {
            this.removeComponent(var4[var5], var3.getKey());
         }
      }
   }

   public void removeAllOverlays(Hashtable<Object, mxICellOverlay[]> var1) {
      for (Entry var3 : var1.entrySet()) {
         mxICellOverlay[] var4 = (mxICellOverlay[])var3.getValue();

         for (int var5 = 0; var5 < var4.length; var5++) {
            this.removeCellOverlayComponent(var4[var5], var3.getKey());
         }
      }
   }

   public Hashtable<Object, Component[]> updateComponents(Object var1) {
      Hashtable var2 = new Hashtable();
      Component[] var3 = this.components.remove(var1);
      mxCellState var4 = this.getGraph().getView().getState(var1);
      if (var4 != null) {
         if (var3 == null) {
            var3 = this.createComponents(var4);
            if (var3 != null) {
               for (int var5 = 0; var5 < var3.length; var5++) {
                  this.insertComponent(var4, var3[var5]);
               }
            }
         }

         if (var3 != null) {
            var2.put(var1, var3);

            for (int var7 = 0; var7 < var3.length; var7++) {
               this.updateComponent(var4, var3[var7]);
            }
         }
      } else if (var3 != null) {
         this.components.put(var1, var3);
      }

      int var8 = this.getGraph().getModel().getChildCount(var1);

      for (int var6 = 0; var6 < var8; var6++) {
         var2.putAll(this.updateComponents(this.getGraph().getModel().getChildAt(var1, var6)));
      }

      return var2;
   }

   public String validateGraph() {
      return this.validateGraph(this.graph.getModel().getRoot(), new Hashtable<>());
   }

   public String validateGraph(Object var1, Hashtable<Object, Object> var2) {
      mxIGraphModel var3 = this.graph.getModel();
      mxGraphView var4 = this.graph.getView();
      boolean var5 = true;
      int var6 = var3.getChildCount(var1);

      for (int var7 = 0; var7 < var6; var7++) {
         Object var8 = var3.getChildAt(var1, var7);
         Hashtable var9 = var2;
         if (this.graph.isValidRoot(var8)) {
            var9 = new Hashtable();
         }

         String var10 = this.validateGraph(var8, var9);
         if (var10 != null) {
            String var11 = var10.replaceAll("\n", "<br>");
            int var12 = var11.length();
            this.setCellWarning(var8, var11.substring(0, Math.max(0, var12 - 4)));
         } else {
            this.setCellWarning(var8, null);
         }

         var5 = var5 && var10 == null;
      }

      StringBuffer var13 = new StringBuffer();
      if (this.graph.isCellCollapsed(var1) && !var5) {
         var13.append(mxResources.get("containsValidationErrors", "Contains Validation Errors") + "\n");
      }

      if (var3.isEdge(var1)) {
         String var14 = this.graph.getEdgeValidationError(var1, var3.getTerminal(var1, true), var3.getTerminal(var1, false));
         if (var14 != null) {
            var13.append(var14);
         }
      } else {
         String var15 = this.graph.getCellValidationError(var1);
         if (var15 != null) {
            var13.append(var15);
         }
      }

      String var16 = this.graph.validateCell(var1, var2);
      if (var16 != null) {
         var13.append(var16);
      }

      if (var3.getParent(var1) == null) {
         var4.validate();
      }

      return var13.length() <= 0 && var5 ? null : var13.toString();
   }

   public mxICellOverlay addCellOverlay(Object var1, mxICellOverlay var2) {
      mxICellOverlay[] var3 = this.getCellOverlays(var1);
      if (var3 == null) {
         var3 = new mxICellOverlay[]{var2};
      } else {
         mxICellOverlay[] var4 = new mxICellOverlay[var3.length + 1];
         System.arraycopy(var3, 0, var4, 0, var3.length);
         var4[var3.length] = var2;
         var3 = var4;
      }

      this.overlays.put(var1, var3);
      mxCellState var6 = this.graph.getView().getState(var1);
      if (var6 != null) {
         this.updateCellOverlayComponent(var6, var2);
      }

      this.eventSource.fireEvent(new mxEventObject("addOverlay", "cell", var1, "overlay", var2));
      return var2;
   }

   public mxICellOverlay[] getCellOverlays(Object var1) {
      return this.overlays.get(var1);
   }

   public mxICellOverlay removeCellOverlay(Object var1, mxICellOverlay var2) {
      if (var2 == null) {
         this.removeCellOverlays(var1);
      } else {
         mxICellOverlay[] var3 = this.getCellOverlays(var1);
         if (var3 != null) {
            ArrayList var4 = new ArrayList<>(Arrays.asList(var3));
            if (var4.remove(var2)) {
               this.removeCellOverlayComponent(var2, var1);
            }

            var3 = var4.toArray(new mxICellOverlay[var4.size()]);
            this.overlays.put(var1, var3);
         }
      }

      return var2;
   }

   public mxICellOverlay[] removeCellOverlays(Object var1) {
      mxICellOverlay[] var2 = this.overlays.remove(var1);
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            this.removeCellOverlayComponent(var2[var3], var1);
         }
      }

      return var2;
   }

   protected void removeCellOverlayComponent(mxICellOverlay var1, Object var2) {
      if (var1 instanceof Component) {
         Component var3 = (Component)var1;
         if (var3.getParent() != null) {
            var3.setVisible(false);
            var3.getParent().remove(var3);
            this.eventSource.fireEvent(new mxEventObject("removeOverlay", "cell", var2, "overlay", var1));
         }
      }
   }

   protected void updateCellOverlayComponent(mxCellState var1, mxICellOverlay var2) {
      if (var2 instanceof Component) {
         Component var3 = (Component)var2;
         if (var3.getParent() == null) {
            this.getGraphControl().add(var3, 0);
         }

         mxRectangle var4 = var2.getBounds(var1);
         if (var4 != null) {
            var3.setBounds(var4.getRectangle());
            var3.setVisible(true);
         } else {
            var3.setVisible(false);
         }
      }
   }

   public void clearCellOverlays() {
      this.clearCellOverlays(null);
   }

   public void clearCellOverlays(Object var1) {
      mxIGraphModel var2 = this.graph.getModel();
      if (var1 == null) {
         var1 = var2.getRoot();
      }

      this.removeCellOverlays(var1);
      int var3 = var2.getChildCount(var1);

      for (int var4 = 0; var4 < var3; var4++) {
         Object var5 = var2.getChildAt(var1, var4);
         this.clearCellOverlays(var5);
      }
   }

   public mxICellOverlay setCellWarning(Object var1, String var2) {
      return this.setCellWarning(var1, var2, null, false);
   }

   public mxICellOverlay setCellWarning(Object var1, String var2, ImageIcon var3) {
      return this.setCellWarning(var1, var2, var3, false);
   }

   public mxICellOverlay setCellWarning(final Object var1, String var2, ImageIcon var3, boolean var4) {
      if (var2 != null && var2.length() > 0) {
         var3 = var3 != null ? var3 : this.warningIcon;
         mxCellOverlay var5 = new mxCellOverlay(var3, var2);
         if (var4) {
            var5.addMouseListener(new MouseAdapter() {
               @Override
               public void mousePressed(MouseEvent var1x) {
                  if (mxGraphComponent.this.getGraph().isEnabled()) {
                     mxGraphComponent.this.getGraph().setSelectionCell(var1);
                  }
               }
            });
            var5.setCursor(new Cursor(12));
         }

         return this.addCellOverlay(var1, var5);
      } else {
         this.removeCellOverlays(var1);
         return null;
      }
   }

   public Hashtable<Object, mxICellOverlay[]> updateCellOverlays(Object var1) {
      Hashtable var2 = new Hashtable();
      mxICellOverlay[] var3 = this.overlays.remove(var1);
      mxCellState var4 = this.getGraph().getView().getState(var1);
      if (var3 != null) {
         if (var4 != null) {
            for (int var7 = 0; var7 < var3.length; var7++) {
               this.updateCellOverlayComponent(var4, var3[var7]);
            }
         } else {
            for (int var5 = 0; var5 < var3.length; var5++) {
               this.removeCellOverlayComponent(var3[var5], var1);
            }
         }

         var2.put(var1, var3);
      }

      int var8 = this.getGraph().getModel().getChildCount(var1);

      for (int var6 = 0; var6 < var8; var6++) {
         var2.putAll(this.updateCellOverlays(this.getGraph().getModel().getChildAt(var1, var6)));
      }

      return var2;
   }

   protected void paintBackground(Graphics var1) {
      Rectangle var2 = var1.getClipBounds();
      Rectangle var3 = this.paintBackgroundPage(var1);
      if (this.isPageVisible()) {
         var1.clipRect(var3.x + 1, var3.y + 1, var3.width - 1, var3.height - 1);
      }

      this.paintBackgroundImage(var1);
      this.paintGrid(var1);
      var1.setClip(var2);
   }

   protected Rectangle paintBackgroundPage(Graphics var1) {
      mxPoint var2 = this.graph.getView().getTranslate();
      double var3 = this.graph.getView().getScale();
      int var5 = (int)Math.round(var2.getX() * var3) - 1;
      int var6 = (int)Math.round(var2.getY() * var3) - 1;
      Dimension var7 = this.getPreferredSizeForPage();
      int var8 = (int)Math.round(var7.width * var3) + 2;
      int var9 = (int)Math.round(var7.height * var3) + 2;
      if (this.isPageVisible()) {
         Color var10 = this.getPageBackgroundColor();
         if (var10 != null) {
            var1.setColor(var10);
            mxUtils.fillClippedRect(var1, 0, 0, this.getGraphControl().getWidth(), this.getGraphControl().getHeight());
         }

         var10 = this.getPageShadowColor();
         if (var10 != null) {
            var1.setColor(var10);
            mxUtils.fillClippedRect(var1, var5 + var8, var6 + 6, 6, var9 - 6);
            mxUtils.fillClippedRect(var1, var5 + 8, var6 + var9, var8 - 2, 6);
         }

         Color var11 = this.getBackground();
         if (this.getViewport().isOpaque()) {
            var11 = this.getViewport().getBackground();
         }

         var1.setColor(var11);
         mxUtils.fillClippedRect(var1, var5 + 1, var6 + 1, var8, var9);
         var10 = this.getPageBorderColor();
         if (var10 != null) {
            var1.setColor(var10);
            var1.drawRect(var5, var6, var8, var9);
         }
      }

      if (this.isPageBreaksVisible() && (this.horizontalPageCount > 1 || this.verticalPageCount > 1)) {
         Graphics2D var16 = (Graphics2D)var1;
         Stroke var17 = var16.getStroke();
         var16.setStroke(new BasicStroke(1.0F, 0, 0, 10.0F, new float[]{1.0F, 2.0F}, 0.0F));
         var16.setColor(this.pageBreakColor);

         for (int var12 = 1; var12 <= this.horizontalPageCount - 1; var12++) {
            int var13 = var12 * var8 / this.horizontalPageCount;
            var16.drawLine(var5 + var13, var6 + 1, var5 + var13, var6 + var9);
         }

         for (int var18 = 1; var18 <= this.verticalPageCount - 1; var18++) {
            int var19 = var18 * var9 / this.verticalPageCount;
            var16.drawLine(var5 + 1, var6 + var19, var5 + var8, var6 + var19);
         }

         var16.setStroke(var17);
      }

      return new Rectangle(var5, var6, var8, var9);
   }

   protected void paintBackgroundImage(Graphics var1) {
      if (this.backgroundImage != null) {
         mxPoint var2 = this.graph.getView().getTranslate();
         double var3 = this.graph.getView().getScale();
         var1.drawImage(
            this.backgroundImage.getImage(),
            (int)(var2.getX() * var3),
            (int)(var2.getY() * var3),
            (int)(this.backgroundImage.getIconWidth() * var3),
            (int)(this.backgroundImage.getIconHeight() * var3),
            this
         );
      }
   }

   protected void paintGrid(Graphics var1) {
      if (this.isGridVisible()) {
         var1.setColor(this.getGridColor());
         Rectangle var2 = var1.getClipBounds();
         if (var2 == null) {
            var2 = this.getGraphControl().getBounds();
         }

         double var3 = var2.getX();
         double var5 = var2.getY();
         double var7 = var3 + var2.getWidth();
         double var9 = var5 + var2.getHeight();
         int var11 = this.getGridStyle();
         int var12 = this.graph.getGridSize();
         int var13 = var12;
         if (var11 == 1 || var11 == 0) {
            var13 /= 2;
         }

         mxPoint var14 = this.graph.getView().getTranslate();
         double var15 = this.graph.getView().getScale();
         double var17 = var14.getX() * var15;
         double var19 = var14.getY() * var15;
         double var21 = var12 * var15;
         if (var21 < var13) {
            int var23 = (int)Math.round(Math.ceil(var13 / var21) / 2.0) * 2;
            var21 = var23 * var21;
         }

         double var43 = Math.floor((var3 - var17) / var21) * var21 + var17;
         double var25 = Math.ceil(var7 / var21) * var21;
         double var27 = Math.floor((var5 - var19) / var21) * var21 + var19;
         double var29 = Math.ceil(var9 / var21) * var21;
         switch (var11) {
            case 1:
               int var50 = var21 > 16.0 ? 2 : 1;

               for (double var52 = var43; var52 <= var25; var52 += var21) {
                  double var57 = var27;

                  while (var57 <= var29) {
                     var52 = Math.round((var52 - var17) / var21) * var21 + var17;
                     var57 = Math.round((var57 - var19) / var21) * var21 + var19;
                     int var65 = (int)Math.round(var52);
                     int var69 = (int)Math.round(var57);
                     var1.drawLine(var65 - var50, var69, var65 + var50, var69);
                     var1.drawLine(var65, var69 - var50, var65, var69 + var50);
                     var57 += var21;
                  }
               }
               break;
            case 2:
               var25 += (int)Math.ceil(var21);
               var29 += (int)Math.ceil(var21);
               int var49 = (int)Math.round(var43);
               int var51 = (int)Math.round(var25);
               int var55 = (int)Math.round(var27);
               int var56 = (int)Math.round(var29);
               double var60 = var43;

               while (var60 <= var25) {
                  var60 = Math.round((var60 - var17) / var21) * var21 + var17;
                  int var67 = (int)Math.round(var60);
                  var1.drawLine(var67, var55, var67, var56);
                  var60 += var21;
               }

               var60 = var27;

               while (var60 <= var29) {
                  var60 = Math.round((var60 - var19) / var21) * var21 + var19;
                  int var68 = (int)Math.round(var60);
                  var1.drawLine(var49, var68, var51, var68);
                  var60 += var21;
               }
               break;
            case 3:
               Graphics2D var48 = (Graphics2D)var1;
               Stroke var32 = var48.getStroke();
               var25 += (int)Math.ceil(var21);
               var29 += (int)Math.ceil(var21);
               int var54 = (int)Math.round(var43);
               int var34 = (int)Math.round(var25);
               int var59 = (int)Math.round(var27);
               int var64 = (int)Math.round(var29);
               Stroke[] var37 = new Stroke[]{
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{3.0F, 1.0F}, Math.max(0, var59) % 4),
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{2.0F, 2.0F}, Math.max(0, var59) % 4),
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{1.0F, 1.0F}, 0.0F),
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{2.0F, 2.0F}, Math.max(0, var59) % 4)
               };

               for (double var38 = var43; var38 <= var25; var38 += var21) {
                  var48.setStroke(var37[(int)(var38 / var21) % var37.length]);
                  double var40 = Math.round((var38 - var17) / var21) * var21 + var17;
                  int var42 = (int)Math.round(var40);
                  var1.drawLine(var42, var59, var42, var64);
               }

               var37 = new Stroke[]{
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{3.0F, 1.0F}, Math.max(0, var54) % 4),
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{2.0F, 2.0F}, Math.max(0, var54) % 4),
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{1.0F, 1.0F}, 0.0F),
                  new BasicStroke(1.0F, 0, 0, 1.0F, new float[]{2.0F, 2.0F}, Math.max(0, var54) % 4)
               };

               for (double var70 = var27; var70 <= var29; var70 += var21) {
                  var48.setStroke(var37[(int)(var70 / var21) % var37.length]);
                  double var71 = Math.round((var70 - var19) / var21) * var21 + var19;
                  int var72 = (int)Math.round(var71);
                  var1.drawLine(var54, var72, var34, var72);
               }

               var48.setStroke(var32);
               break;
            default:
               for (double var31 = var43; var31 <= var25; var31 += var21) {
                  double var33 = var27;

                  while (var33 <= var29) {
                     var31 = Math.round((var31 - var17) / var21) * var21 + var17;
                     var33 = Math.round((var33 - var19) / var21) * var21 + var19;
                     int var35 = (int)Math.round(var31);
                     int var36 = (int)Math.round(var33);
                     var1.drawLine(var35, var36, var35, var36);
                     var33 += var21;
                  }
               }
         }
      }
   }

   public void redraw(mxCellState var1) {
      if (var1 != null) {
         Rectangle var2 = var1.getBoundingBox().getRectangle();
         this.repaintTripleBuffer(new Rectangle(var2));
         var2 = SwingUtilities.convertRectangle(this.graphControl, var2, this);
         this.repaint(var2);
      }
   }

   public void checkTripleBuffer() {
      mxRectangle var1 = this.graph.getGraphBounds();
      int var2 = (int)Math.ceil(var1.getX() + var1.getWidth() + 2.0);
      int var3 = (int)Math.ceil(var1.getY() + var1.getHeight() + 2.0);
      if (this.tripleBuffer != null && (this.tripleBuffer.getWidth() != var2 || this.tripleBuffer.getHeight() != var3)) {
         this.destroyTripleBuffer();
      }

      if (this.tripleBuffer == null) {
         this.createTripleBuffer(var2, var3);
      }
   }

   protected void createTripleBuffer(int var1, int var2) {
      try {
         this.tripleBuffer = mxUtils.createBufferedImage(var1, var2, null);
         this.tripleBufferGraphics = this.tripleBuffer.createGraphics();
         mxUtils.setAntiAlias(this.tripleBufferGraphics, this.antiAlias, this.textAntiAlias);
         this.repaintTripleBuffer(null);
      } catch (OutOfMemoryError var4) {
         log.log(Level.SEVERE, "Failed to create a triple buffer", var4);
      }
   }

   public void destroyTripleBuffer() {
      if (this.tripleBuffer != null) {
         this.tripleBuffer = null;
         this.tripleBufferGraphics.dispose();
         this.tripleBufferGraphics = null;
      }
   }

   public void repaintTripleBuffer(Rectangle var1) {
      if (this.tripleBuffered && this.tripleBufferGraphics != null) {
         if (var1 == null) {
            var1 = new Rectangle(this.tripleBuffer.getWidth(), this.tripleBuffer.getHeight());
         }

         mxUtils.clearRect(this.tripleBufferGraphics, var1, null);
         this.tripleBufferGraphics.setClip(var1);
         this.graphControl.drawGraph(this.tripleBufferGraphics, true);
         this.tripleBufferGraphics.setClip(null);
      }
   }

   public boolean isEventsEnabled() {
      return this.eventSource.isEventsEnabled();
   }

   public void setEventsEnabled(boolean var1) {
      this.eventSource.setEventsEnabled(var1);
   }

   public void addListener(String var1, mxEventSource.mxIEventListener var2) {
      this.eventSource.addListener(var1, var2);
   }

   public void removeListener(mxEventSource.mxIEventListener var1) {
      this.eventSource.removeListener(var1);
   }

   public void removeListener(mxEventSource.mxIEventListener var1, String var2) {
      this.eventSource.removeListener(var1, var2);
   }

   static {
      DEFAULT_EXPANDED_ICON = new ImageIcon(mxGraphComponent.class.getResource("/com/mxgraph/swing/images/expanded.gif"));
      DEFAULT_COLLAPSED_ICON = new ImageIcon(mxGraphComponent.class.getResource("/com/mxgraph/swing/images/collapsed.gif"));
      DEFAULT_WARNING_ICON = new ImageIcon(mxGraphComponent.class.getResource("/com/mxgraph/swing/images/warning.gif"));
   }

   public class mxGraphControl extends JComponent {
      private static final long serialVersionUID = -8916603170766739124L;
      protected Point translate = new Point(0, 0);

      public mxGraphControl() {
         this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent var1) {
               if (mxGraphControl.this.translate.x != 0 || mxGraphControl.this.translate.y != 0) {
                  mxGraphControl.this.translate = new Point(0, 0);
                  mxGraphControl.this.repaint();
               }
            }
         });
      }

      public Point getTranslate() {
         return this.translate;
      }

      public void setTranslate(Point var1) {
         this.translate = var1;
      }

      public mxGraphComponent getGraphContainer() {
         return mxGraphComponent.this;
      }

      public void scrollRectToVisible(Rectangle var1, boolean var2) {
         super.scrollRectToVisible(var1);
         if (var2) {
            this.extendComponent(var1);
         }
      }

      protected void extendComponent(Rectangle var1) {
         int var2 = var1.x + var1.width;
         int var3 = var1.y + var1.height;
         Dimension var4 = new Dimension(this.getPreferredSize());
         Dimension var5 = mxGraphComponent.this.getScaledPreferredSizeForGraph();
         mxRectangle var6 = mxGraphComponent.this.graph.getMinimumGraphSize();
         double var7 = mxGraphComponent.this.graph.getView().getScale();
         boolean var9 = false;
         if (var1.x < 0) {
            this.translate.x = Math.max(this.translate.x, Math.max(0, -var1.x));
            var4.width = var5.width;
            if (var6 != null) {
               var4.width = (int)Math.max(var4.width, Math.round(var6.getWidth() * var7));
            }

            var4.width = var4.width + this.translate.x;
            var9 = true;
         } else if (var2 > this.getWidth()) {
            var4.width = Math.max(var2, this.getWidth());
            var9 = true;
         }

         if (var1.y < 0) {
            this.translate.y = Math.max(this.translate.y, Math.max(0, -var1.y));
            var4.height = var5.height;
            if (var6 != null) {
               var4.height = (int)Math.max(var4.height, Math.round(var6.getHeight() * var7));
            }

            var4.height = var4.height + this.translate.y;
            var9 = true;
         } else if (var3 > this.getHeight()) {
            var4.height = Math.max(var3, this.getHeight());
            var9 = true;
         }

         if (var9) {
            this.setPreferredSize(var4);
            this.setMinimumSize(var4);
            this.revalidate();
         }
      }

      @Override
      public String getToolTipText(MouseEvent var1) {
         String var2 = mxGraphComponent.this.getSelectionCellsHandler().getToolTipText(var1);
         if (var2 == null) {
            Object var3 = mxGraphComponent.this.getCellAt(var1.getX(), var1.getY());
            if (var3 != null) {
               if (mxGraphComponent.this.hitFoldingIcon(var3, var1.getX(), var1.getY())) {
                  var2 = mxResources.get("collapse-expand");
               } else {
                  var2 = mxGraphComponent.this.graph.getToolTipForCell(var3);
               }
            }
         }

         return var2 != null && var2.length() > 0 ? var2 : super.getToolTipText(var1);
      }

      public void updatePreferredSize() {
         double var1 = mxGraphComponent.this.graph.getView().getScale();
         Dimension var3 = null;
         if (!mxGraphComponent.this.preferPageSize && !mxGraphComponent.this.pageVisible) {
            var3 = mxGraphComponent.this.getScaledPreferredSizeForGraph();
         } else {
            Dimension var4 = mxGraphComponent.this.getPreferredSizeForPage();
            if (!mxGraphComponent.this.preferPageSize) {
               var4.width = var4.width + 2 * mxGraphComponent.this.getHorizontalPageBorder();
               var4.height = var4.height + 2 * mxGraphComponent.this.getVerticalPageBorder();
            }

            var3 = new Dimension((int)(var4.width * var1), (int)(var4.height * var1));
         }

         mxRectangle var6 = mxGraphComponent.this.graph.getMinimumGraphSize();
         if (var6 != null) {
            var3.width = (int)Math.max(var3.width, Math.round(var6.getWidth() * var1));
            var3.height = (int)Math.max(var3.height, Math.round(var6.getHeight() * var1));
         }

         if (!this.getPreferredSize().equals(var3)) {
            this.setPreferredSize(var3);
            this.setMinimumSize(var3);
            this.revalidate();
         }
      }

      @Override
      public void paint(Graphics var1) {
         var1.translate(this.translate.x, this.translate.y);
         mxGraphComponent.this.eventSource.fireEvent(new mxEventObject("beforePaint", "g", var1));
         super.paint(var1);
         mxGraphComponent.this.eventSource.fireEvent(new mxEventObject("afterPaint", "g", var1));
         var1.translate(-this.translate.x, -this.translate.y);
      }

      @Override
      public void paintComponent(Graphics var1) {
         super.paintComponent(var1);
         mxGraphComponent.this.paintBackground(var1);
         if (mxGraphComponent.this.tripleBuffered) {
            mxGraphComponent.this.checkTripleBuffer();
         } else if (mxGraphComponent.this.tripleBuffer != null) {
            mxGraphComponent.this.destroyTripleBuffer();
         }

         if (mxGraphComponent.this.tripleBuffer != null) {
            mxUtils.drawImageClip(var1, mxGraphComponent.this.tripleBuffer, this);
         } else {
            Graphics2D var2 = (Graphics2D)var1;
            RenderingHints var3 = var2.getRenderingHints();

            try {
               mxUtils.setAntiAlias(var2, mxGraphComponent.this.antiAlias, mxGraphComponent.this.textAntiAlias);
               this.drawGraph(var2, true);
            } finally {
               var2.setRenderingHints(var3);
            }
         }

         mxGraphComponent.this.eventSource.fireEvent(new mxEventObject("paint", "g", var1));
      }

      public void drawGraph(Graphics2D var1, boolean var2) {
         Graphics2D var3 = mxGraphComponent.this.canvas.getGraphics();
         boolean var4 = mxGraphComponent.this.canvas.isDrawLabels();
         mxPoint var5 = mxGraphComponent.this.canvas.getTranslate();
         double var6 = mxGraphComponent.this.canvas.getScale();

         try {
            mxGraphComponent.this.canvas.setScale(mxGraphComponent.this.graph.getView().getScale());
            mxGraphComponent.this.canvas.setDrawLabels(var2);
            mxGraphComponent.this.canvas.setTranslate(0.0, 0.0);
            mxGraphComponent.this.canvas.setGraphics(var1);
            this.drawFromRootCell();
         } finally {
            mxGraphComponent.this.canvas.setScale(var6);
            mxGraphComponent.this.canvas.setTranslate(var5.getX(), var5.getY());
            mxGraphComponent.this.canvas.setDrawLabels(var4);
            mxGraphComponent.this.canvas.setGraphics(var3);
         }
      }

      protected void drawFromRootCell() {
         this.drawCell(mxGraphComponent.this.canvas, mxGraphComponent.this.graph.getModel().getRoot());
      }

      protected boolean hitClip(mxGraphics2DCanvas var1, mxCellState var2) {
         Rectangle var3 = this.getExtendedCellBounds(var2);
         return var3 == null || var1.getGraphics().hitClip(var3.x, var3.y, var3.width, var3.height);
      }

      protected Rectangle getExtendedCellBounds(mxCellState var1) {
         Object var2 = null;
         double var3 = mxUtils.getDouble(var1.getStyle(), mxConstants.STYLE_ROTATION);
         mxRectangle var5 = mxUtils.getBoundingBox(new mxRectangle(var1), var3);
         int var6 = (int)Math.ceil(mxUtils.getDouble(var1.getStyle(), mxConstants.STYLE_STROKEWIDTH) * mxGraphComponent.this.graph.getView().getScale()) + 1;
         var5.grow(var6);
         if (mxUtils.isTrue(var1.getStyle(), mxConstants.STYLE_SHADOW)) {
            var5.setWidth(var5.getWidth() + mxConstants.SHADOW_OFFSETX);
            var5.setHeight(var5.getHeight() + mxConstants.SHADOW_OFFSETX);
         }

         if (var1.getLabelBounds() != null) {
            var5.add(var1.getLabelBounds());
         }

         return var5.getRectangle();
      }

      public void drawCell(mxICanvas var1, Object var2) {
         mxCellState var3 = mxGraphComponent.this.graph.getView().getState(var2);
         if (var3 != null && this.isCellDisplayable(var3.getCell()) && (!(var1 instanceof mxGraphics2DCanvas) || this.hitClip((mxGraphics2DCanvas)var1, var3))) {
            mxGraphComponent.this.graph.drawState(var1, var3, var2 != mxGraphComponent.this.cellEditor.getEditingCell());
         }

         boolean var4 = mxGraphComponent.this.graph.isKeepEdgesInBackground();
         boolean var5 = mxGraphComponent.this.graph.isKeepEdgesInForeground();
         if (var4) {
            this.drawChildren(var2, true, false);
         }

         this.drawChildren(var2, !var4 && !var5, true);
         if (var5) {
            this.drawChildren(var2, true, false);
         }

         if (var3 != null) {
            this.cellDrawn(var1, var3);
         }
      }

      protected void drawChildren(Object var1, boolean var2, boolean var3) {
         mxIGraphModel var4 = mxGraphComponent.this.graph.getModel();
         int var5 = var4.getChildCount(var1);

         for (int var6 = 0; var6 < var5; var6++) {
            Object var7 = var4.getChildAt(var1, var6);
            boolean var8 = var4.isEdge(var7);
            if (var3 && !var8 || var2 && var8) {
               this.drawCell(mxGraphComponent.this.canvas, var4.getChildAt(var1, var6));
            }
         }
      }

      protected void cellDrawn(mxICanvas var1, mxCellState var2) {
         if (mxGraphComponent.this.isFoldingEnabled() && var1 instanceof mxGraphics2DCanvas) {
            mxIGraphModel var3 = mxGraphComponent.this.graph.getModel();
            mxGraphics2DCanvas var4 = (mxGraphics2DCanvas)var1;
            Graphics2D var5 = var4.getGraphics();
            boolean var6 = var3.isEdge(var2.getCell());
            if (var2.getCell() != mxGraphComponent.this.graph.getCurrentRoot() && (var3.isVertex(var2.getCell()) || var6)) {
               ImageIcon var7 = mxGraphComponent.this.getFoldingIcon(var2);
               if (var7 != null) {
                  Rectangle var8 = mxGraphComponent.this.getFoldingIconBounds(var2, var7);
                  var5.drawImage(var7.getImage(), var8.x, var8.y, var8.width, var8.height, this);
               }
            }
         }
      }

      protected boolean isCellDisplayable(Object var1) {
         return var1 != mxGraphComponent.this.graph.getView().getCurrentRoot() && var1 != mxGraphComponent.this.graph.getModel().getRoot();
      }
   }

   public static class mxMouseRedirector implements MouseListener, MouseMotionListener {
      protected mxGraphComponent graphComponent;

      public mxMouseRedirector(mxGraphComponent var1) {
         this.graphComponent = var1;
      }

      @Override
      public void mouseClicked(MouseEvent var1) {
         this.graphComponent
            .getGraphControl()
            .dispatchEvent(SwingUtilities.convertMouseEvent(var1.getComponent(), var1, this.graphComponent.getGraphControl()));
      }

      @Override
      public void mouseEntered(MouseEvent var1) {
      }

      @Override
      public void mouseExited(MouseEvent var1) {
         this.mouseClicked(var1);
      }

      @Override
      public void mousePressed(MouseEvent var1) {
         this.mouseClicked(var1);
      }

      @Override
      public void mouseReleased(MouseEvent var1) {
         this.mouseClicked(var1);
      }

      @Override
      public void mouseDragged(MouseEvent var1) {
         this.mouseClicked(var1);
      }

      @Override
      public void mouseMoved(MouseEvent var1) {
         this.mouseClicked(var1);
      }
   }
}
