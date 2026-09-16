package com.mxgraph.swing.handler;

import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.util.mxGraphTransferable;
import com.mxgraph.swing.util.mxMouseAdapter;
import com.mxgraph.swing.util.mxSwingConstants;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import com.mxgraph.view.mxGraph;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;

public class mxGraphHandler extends mxMouseAdapter implements DropTargetListener {
   private static final long serialVersionUID = 3241109976696510225L;
   private static final Logger log = Logger.getLogger(mxGraphHandler.class.getName());
   public static Cursor DEFAULT_CURSOR = new Cursor(0);
   public static Cursor MOVE_CURSOR = new Cursor(13);
   public static Cursor FOLD_CURSOR = new Cursor(12);
   protected mxGraphComponent graphComponent;
   protected boolean enabled = true;
   protected boolean cloneEnabled = true;
   protected boolean moveEnabled = true;
   protected boolean selectEnabled = true;
   protected boolean markerEnabled = true;
   protected boolean removeCellsFromParent = true;
   protected mxMovePreview movePreview;
   protected boolean livePreview = false;
   protected boolean imagePreview = true;
   protected boolean centerPreview = true;
   protected boolean keepOnTop = true;
   protected transient Object[] cells;
   protected transient ImageIcon dragImage;
   protected transient Point first;
   protected transient Object cell;
   protected transient Object initialCell;
   protected transient Object[] dragCells;
   protected transient mxCellMarker marker;
   protected transient boolean canImport;
   protected transient mxRectangle cellBounds;
   protected transient mxRectangle bbox;
   protected transient mxRectangle transferBounds;
   protected transient boolean visible = false;
   protected transient Rectangle previewBounds = null;
   protected transient boolean gridEnabledEvent = false;
   protected transient boolean constrainedEvent = false;
   protected transient DropTarget currentDropTarget = null;

   public mxGraphHandler(mxGraphComponent var1) {
      this.graphComponent = var1;
      this.marker = this.createMarker();
      this.movePreview = this.createMovePreview();
      var1.addListener("afterPaint", new mxEventSource.mxIEventListener() {
         @Override
         public void invoke(Object var1, mxEventObject var2) {
            Graphics var3 = (Graphics)var2.getProperty("g");
            mxGraphHandler.this.paint(var3);
         }
      });
      var1.getGraphControl().addMouseListener(this);
      var1.getGraphControl().addMouseMotionListener(this);
      this.installDragGestureHandler();
      this.installDropTargetHandler();
      var1.addPropertyChangeListener(new PropertyChangeListener() {
         @Override
         public void propertyChange(PropertyChangeEvent var1) {
            if (var1.getPropertyName().equals("transferHandler")) {
               if (mxGraphHandler.this.currentDropTarget != null) {
                  mxGraphHandler.this.currentDropTarget.removeDropTargetListener(mxGraphHandler.this);
               }

               mxGraphHandler.this.installDropTargetHandler();
            }
         }
      });
      this.setVisible(false);
   }

   protected void installDragGestureHandler() {
      DragGestureListener var1 = new DragGestureListener() {
         @Override
         public void dragGestureRecognized(DragGestureEvent var1) {
            if (mxGraphHandler.this.graphComponent.isDragEnabled() && mxGraphHandler.this.first != null) {
               final TransferHandler var2 = mxGraphHandler.this.graphComponent.getTransferHandler();
               if (var2 instanceof mxGraphTransferHandler) {
                  final mxGraphTransferable var3 = (mxGraphTransferable)((mxGraphTransferHandler)var2).createTransferable(mxGraphHandler.this.graphComponent);
                  if (var3 != null) {
                     var1.startDrag(null, mxSwingConstants.EMPTY_IMAGE, new Point(), var3, new DragSourceAdapter() {
                        @Override
                        public void dragDropEnd(DragSourceDropEvent var1) {
                           ((mxGraphTransferHandler)var2).exportDone(mxGraphHandler.this.graphComponent, var3, 0);
                           mxGraphHandler.this.first = null;
                        }
                     });
                  }
               }
            }
         }
      };
      DragSource var2 = new DragSource();
      var2.createDefaultDragGestureRecognizer(this.graphComponent.getGraphControl(), this.isCloneEnabled() ? 3 : 2, var1);
   }

   protected void installDropTargetHandler() {
      DropTarget var1 = this.graphComponent.getDropTarget();

      try {
         if (var1 != null) {
            var1.addDropTargetListener(this);
            this.currentDropTarget = var1;
         }
      } catch (TooManyListenersException var3) {
         log.log(Level.SEVERE, "Failed to install drop target handler", var3);
      }
   }

   public boolean isVisible() {
      return this.visible;
   }

   public void setVisible(boolean var1) {
      if (this.visible != var1) {
         this.visible = var1;
         if (this.previewBounds != null) {
            this.graphComponent.getGraphControl().repaint(this.previewBounds);
         }
      }
   }

   public void setPreviewBounds(Rectangle var1) {
      if (var1 == null && this.previewBounds != null
         || var1 != null && this.previewBounds == null
         || var1 != null && this.previewBounds != null && !var1.equals(this.previewBounds)) {
         Rectangle var2 = null;
         if (this.isVisible()) {
            var2 = this.previewBounds;
            if (var2 != null) {
               var2.add(var1);
            } else {
               var2 = var1;
            }
         }

         this.previewBounds = var1;
         if (var2 != null) {
            this.graphComponent.getGraphControl().repaint(var2.x - 1, var2.y - 1, var2.width + 2, var2.height + 2);
         }
      }
   }

   protected mxMovePreview createMovePreview() {
      return new mxMovePreview(this.graphComponent);
   }

   public mxMovePreview getMovePreview() {
      return this.movePreview;
   }

   protected mxCellMarker createMarker() {
      mxCellMarker var1 = new mxCellMarker(this.graphComponent, Color.BLUE) {
         private static final long serialVersionUID = -8451338653189373347L;

         @Override
         public boolean isEnabled() {
            return this.graphComponent.getGraph().isDropEnabled();
         }

         @Override
         public Object getCell(MouseEvent var1) {
            mxIGraphModel var2 = this.graphComponent.getGraph().getModel();
            TransferHandler var3 = this.graphComponent.getTransferHandler();
            boolean var4 = var3 instanceof mxGraphTransferHandler && ((mxGraphTransferHandler)var3).isLocalDrag();
            mxGraph var5 = this.graphComponent.getGraph();
            Object var6 = super.getCell(var1);
            Object[] var7 = var4 ? var5.getSelectionCells() : mxGraphHandler.this.dragCells;
            var6 = var5.getDropTarget(var7, var1.getPoint(), var6);

            for (Object var8 = var6; var8 != null; var8 = var2.getParent(var8)) {
               if (mxUtils.contains(var7, var8)) {
                  return null;
               }
            }

            boolean var9 = this.graphComponent.isCloneEvent(var1) && mxGraphHandler.this.isCloneEnabled();
            if (var4 && var6 != null && var7.length > 0 && !var9 && var5.getModel().getParent(var7[0]) == var6) {
               var6 = null;
            }

            return var6;
         }
      };
      var1.setSwimlaneContentEnabled(true);
      return var1;
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

   public boolean isCloneEnabled() {
      return this.cloneEnabled;
   }

   public void setCloneEnabled(boolean var1) {
      this.cloneEnabled = var1;
   }

   public boolean isMoveEnabled() {
      return this.moveEnabled;
   }

   public void setMoveEnabled(boolean var1) {
      this.moveEnabled = var1;
   }

   public boolean isMarkerEnabled() {
      return this.markerEnabled;
   }

   public void setMarkerEnabled(boolean var1) {
      this.markerEnabled = var1;
   }

   public mxCellMarker getMarker() {
      return this.marker;
   }

   public void setMarker(mxCellMarker var1) {
      this.marker = var1;
   }

   public boolean isSelectEnabled() {
      return this.selectEnabled;
   }

   public void setSelectEnabled(boolean var1) {
      this.selectEnabled = var1;
   }

   public boolean isRemoveCellsFromParent() {
      return this.removeCellsFromParent;
   }

   public void setRemoveCellsFromParent(boolean var1) {
      this.removeCellsFromParent = var1;
   }

   public boolean isLivePreview() {
      return this.livePreview;
   }

   public void setLivePreview(boolean var1) {
      this.livePreview = var1;
   }

   public boolean isImagePreview() {
      return this.imagePreview;
   }

   public void setImagePreview(boolean var1) {
      this.imagePreview = var1;
   }

   public boolean isCenterPreview() {
      return this.centerPreview;
   }

   public void setCenterPreview(boolean var1) {
      this.centerPreview = var1;
   }

   public void updateDragImage(Object[] var1) {
      this.dragImage = null;
      if (var1 != null && var1.length > 0) {
         BufferedImage var2 = mxCellRenderer.createBufferedImage(
            this.graphComponent.getGraph(),
            var1,
            this.graphComponent.getGraph().getView().getScale(),
            null,
            this.graphComponent.isAntiAlias(),
            null,
            this.graphComponent.getCanvas()
         );
         if (var2 != null) {
            this.dragImage = new ImageIcon(var2);
            this.previewBounds.setSize(this.dragImage.getIconWidth(), this.dragImage.getIconHeight());
         }
      }
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      if (this.graphComponent.isEnabled() && this.isEnabled() && !var1.isConsumed()) {
         Cursor var2 = this.getCursor(var1);
         if (var2 != null) {
            this.graphComponent.getGraphControl().setCursor(var2);
            var1.consume();
         } else {
            this.graphComponent.getGraphControl().setCursor(DEFAULT_CURSOR);
         }
      }
   }

   protected Cursor getCursor(MouseEvent var1) {
      Cursor var2 = null;
      if (this.isMoveEnabled()) {
         Object var3 = this.graphComponent.getCellAt(var1.getX(), var1.getY(), false);
         if (var3 != null) {
            if (this.graphComponent.isFoldingEnabled() && this.graphComponent.hitFoldingIcon(var3, var1.getX(), var1.getY())) {
               var2 = FOLD_CURSOR;
            } else if (this.graphComponent.getGraph().isCellMovable(var3)) {
               var2 = MOVE_CURSOR;
            }
         }
      }

      return var2;
   }

   @Override
   public void dragEnter(DropTargetDragEvent var1) {
      JComponent var2 = getDropTarget(var1);
      TransferHandler var3 = var2.getTransferHandler();
      boolean var4 = var3 instanceof mxGraphTransferHandler && ((mxGraphTransferHandler)var3).isLocalDrag();
      if (var4) {
         this.canImport = true;
      } else {
         this.canImport = this.graphComponent.isImportEnabled() && var3.canImport(var2, var1.getCurrentDataFlavors());
      }

      if (this.canImport) {
         this.transferBounds = null;
         this.setVisible(false);

         try {
            Transferable var5 = var1.getTransferable();
            if (var5.isDataFlavorSupported(mxGraphTransferable.dataFlavor)) {
               mxGraphTransferable var6 = (mxGraphTransferable)var5.getTransferData(mxGraphTransferable.dataFlavor);
               this.dragCells = var6.getCells();
               if (var6.getBounds() != null) {
                  mxGraph var7 = this.graphComponent.getGraph();
                  double var8 = var7.getView().getScale();
                  this.transferBounds = var6.getBounds();
                  int var10 = (int)Math.ceil((this.transferBounds.getWidth() + 1.0) * var8);
                  int var11 = (int)Math.ceil((this.transferBounds.getHeight() + 1.0) * var8);
                  this.setPreviewBounds(new Rectangle((int)this.transferBounds.getX(), (int)this.transferBounds.getY(), var10, var11));
                  if (this.imagePreview) {
                     if (var4) {
                        if (!this.isLivePreview()) {
                           this.updateDragImage(var7.getMovableCells(this.dragCells));
                        }
                     } else {
                        Object[] var12 = this.graphComponent.getImportableCells(this.dragCells);
                        this.updateDragImage(var12);
                        if (var12 == null || var12.length == 0) {
                           this.canImport = false;
                           var1.rejectDrag();
                           return;
                        }
                     }
                  }

                  this.setVisible(true);
               }
            }

            var1.acceptDrag(3);
         } catch (Exception var13) {
            log.log(Level.SEVERE, "Failed to handle dragEnter", var13);
         }
      } else {
         var1.rejectDrag();
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (this.graphComponent.isEnabled() && this.isEnabled() && !var1.isConsumed() && !this.graphComponent.isForceMarqueeEvent(var1)) {
         this.cell = this.graphComponent.getCellAt(var1.getX(), var1.getY(), false);
         this.initialCell = this.cell;
         if (this.cell != null) {
            if (this.isSelectEnabled() && !this.graphComponent.getGraph().isCellSelected(this.cell)) {
               this.graphComponent.selectCellForEvent(this.cell, var1);
               this.cell = null;
            }

            if (this.isMoveEnabled() && !var1.isPopupTrigger()) {
               this.start(var1);
               var1.consume();
            }
         } else if (var1.isPopupTrigger()) {
            this.graphComponent.getGraph().clearSelection();
         }
      }
   }

   public Object[] getCells(Object var1) {
      mxGraph var2 = this.graphComponent.getGraph();
      return var2.getMovableCells(var2.getSelectionCells());
   }

   public void start(MouseEvent var1) {
      if (this.isLivePreview()) {
         this.movePreview.start(var1, this.graphComponent.getGraph().getView().getState(this.initialCell));
      } else {
         mxGraph var2 = this.graphComponent.getGraph();
         this.cells = this.getCells(this.initialCell);
         this.cellBounds = var2.getView().getBounds(this.cells);
         if (this.cellBounds != null) {
            this.bbox = var2.getView().getBoundingBox(this.cells);
            Rectangle var3 = this.cellBounds.getRectangle();
            var3.width++;
            var3.height++;
            this.setPreviewBounds(var3);
         }
      }

      this.first = var1.getPoint();
   }

   @Override
   public void dropActionChanged(DropTargetDragEvent var1) {
   }

   @Override
   public void dragOver(DropTargetDragEvent var1) {
      if (this.canImport) {
         this.mouseDragged(this.createEvent(var1));
         mxGraphTransferHandler var2 = getGraphTransferHandler(var1);
         if (var2 != null) {
            mxGraph var3 = this.graphComponent.getGraph();
            double var4 = var3.getView().getScale();
            Point var6 = SwingUtilities.convertPoint(this.graphComponent, var1.getLocation(), this.graphComponent.getGraphControl());
            var6 = this.graphComponent.snapScaledPoint(new mxPoint(var6)).getPoint();
            var2.setLocation(new Point(var6));
            int var7 = 0;
            int var8 = 0;
            if (this.centerPreview && this.transferBounds != null) {
               var7 = (int)(var7 - Math.round(this.transferBounds.getWidth() * var4 / 2.0));
               var8 = (int)(var8 - Math.round(this.transferBounds.getHeight() * var4 / 2.0));
            }

            var2.setOffset(new Point((int)var3.snap(var7 / var4), (int)var3.snap(var8 / var4)));
            var6.translate(var7, var8);
            if (this.transferBounds != null && this.dragImage != null) {
               var7 = (int)Math.round((this.dragImage.getIconWidth() - 2 - this.transferBounds.getWidth() * var4) / 2.0);
               var8 = (int)Math.round((this.dragImage.getIconHeight() - 2 - this.transferBounds.getHeight() * var4) / 2.0);
               var6.translate(-var7, -var8);
            }

            if (!var2.isLocalDrag() && this.previewBounds != null) {
               this.setPreviewBounds(new Rectangle(var6, this.previewBounds.getSize()));
            }
         }
      } else {
         var1.rejectDrag();
      }
   }

   public Point convertPoint(Point var1) {
      var1 = SwingUtilities.convertPoint(this.graphComponent, var1, this.graphComponent.getGraphControl());
      var1.x = var1.x - this.graphComponent.getHorizontalScrollBar().getValue();
      var1.y = var1.y - this.graphComponent.getVerticalScrollBar().getValue();
      return var1;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (this.graphComponent.isAutoScroll()) {
         this.graphComponent.getGraphControl().scrollRectToVisible(new Rectangle(var1.getPoint()));
      }

      if (!var1.isConsumed()) {
         this.gridEnabledEvent = this.graphComponent.isGridEnabledEvent(var1);
         this.constrainedEvent = this.graphComponent.isConstrainedEvent(var1);
         if (this.constrainedEvent && this.first != null) {
            int var2 = var1.getX();
            int var3 = var1.getY();
            if (Math.abs(var1.getX() - this.first.x) > Math.abs(var1.getY() - this.first.y)) {
               var3 = this.first.y;
            } else {
               var2 = this.first.x;
            }

            var1 = new MouseEvent(
               var1.getComponent(),
               var1.getID(),
               var1.getWhen(),
               var1.getModifiers(),
               var2,
               var3,
               var1.getClickCount(),
               var1.isPopupTrigger(),
               var1.getButton()
            );
         }

         if (this.isVisible() && this.isMarkerEnabled()) {
            this.marker.process(var1);
         }

         if (this.first != null) {
            if (this.movePreview.isActive()) {
               double var7 = var1.getX() - this.first.x;
               double var4 = var1.getY() - this.first.y;
               if (this.graphComponent.isGridEnabledEvent(var1)) {
                  mxGraph var6 = this.graphComponent.getGraph();
                  var7 = var6.snap(var7);
                  var4 = var6.snap(var4);
               }

               boolean var10 = this.isCloneEnabled() && this.graphComponent.isCloneEvent(var1);
               this.movePreview.update(var1, var7, var4, var10);
               var1.consume();
            } else if (this.cellBounds != null) {
               double var8 = var1.getX() - this.first.x;
               double var9 = var1.getY() - this.first.y;
               if (this.previewBounds != null) {
                  this.setPreviewBounds(new Rectangle(this.getPreviewLocation(var1, this.gridEnabledEvent), this.previewBounds.getSize()));
               }

               if (!this.isVisible() && this.graphComponent.isSignificant(var8, var9)) {
                  if (this.imagePreview && this.dragImage == null && !this.graphComponent.isDragEnabled()) {
                     this.updateDragImage(this.cells);
                  }

                  this.setVisible(true);
               }

               var1.consume();
            }
         }
      }
   }

   protected Point getPreviewLocation(MouseEvent var1, boolean var2) {
      int var3 = 0;
      int var4 = 0;
      if (this.first != null && this.cellBounds != null) {
         mxGraph var5 = this.graphComponent.getGraph();
         double var6 = var5.getView().getScale();
         mxPoint var8 = var5.getView().getTranslate();
         double var9 = var1.getX() - this.first.x;
         double var11 = var1.getY() - this.first.y;
         double var13 = (this.cellBounds.getX() + var9) / var6 - var8.getX();
         double var15 = (this.cellBounds.getY() + var11) / var6 - var8.getY();
         if (var2) {
            var13 = var5.snap(var13);
            var15 = var5.snap(var15);
         }

         var3 = (int)Math.round((var13 + var8.getX()) * var6) + (int)Math.round(this.bbox.getX()) - (int)Math.round(this.cellBounds.getX());
         var4 = (int)Math.round((var15 + var8.getY()) * var6) + (int)Math.round(this.bbox.getY()) - (int)Math.round(this.cellBounds.getY());
      }

      return new Point(var3, var4);
   }

   @Override
   public void dragExit(DropTargetEvent var1) {
      mxGraphTransferHandler var2 = getGraphTransferHandler(var1);
      if (var2 != null) {
         var2.setLocation(null);
      }

      this.dragCells = null;
      this.setVisible(false);
      this.marker.reset();
      this.reset();
   }

   @Override
   public void drop(DropTargetDropEvent var1) {
      if (this.canImport) {
         mxGraphTransferHandler var2 = getGraphTransferHandler(var1);
         MouseEvent var3 = this.createEvent(var1);
         if (var2 != null && !var2.isLocalDrag()) {
            var3.consume();
         }

         this.mouseReleased(var3);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (this.graphComponent.isEnabled() && this.isEnabled() && !var1.isConsumed()) {
         mxGraph var2 = this.graphComponent.getGraph();
         double var3 = 0.0;
         double var5 = 0.0;
         if (this.first != null && (this.cellBounds != null || this.movePreview.isActive())) {
            double var7 = var2.getView().getScale();
            mxPoint var9 = var2.getView().getTranslate();
            var3 = var1.getX() - this.first.x;
            var5 = var1.getY() - this.first.y;
            if (this.cellBounds != null) {
               double var10 = (this.cellBounds.getX() + var3) / var7 - var9.getX();
               double var12 = (this.cellBounds.getY() + var5) / var7 - var9.getY();
               if (this.gridEnabledEvent) {
                  var10 = var2.snap(var10);
                  var12 = var2.snap(var12);
               }

               double var14 = (var10 + var9.getX()) * var7 + this.bbox.getX() - this.cellBounds.getX();
               double var16 = (var12 + var9.getY()) * var7 + this.bbox.getY() - this.cellBounds.getY();
               var3 = Math.round((var14 - this.bbox.getX()) / var7);
               var5 = Math.round((var16 - this.bbox.getY()) / var7);
            }
         }

         if (this.first != null && this.graphComponent.isSignificant(var1.getX() - this.first.x, var1.getY() - this.first.y)) {
            if (this.movePreview.isActive()) {
               if (this.graphComponent.isConstrainedEvent(var1)) {
                  if (Math.abs(var3) > Math.abs(var5)) {
                     var5 = 0.0;
                  } else {
                     var3 = 0.0;
                  }
               }

               mxCellState var19 = this.marker.getMarkedState();
               Object var8 = var19 != null ? var19.getCell() : null;
               if (var8 == null
                  && this.isRemoveCellsFromParent()
                  && this.shouldRemoveCellFromParent(var2.getModel().getParent(this.initialCell), this.cells, var1)) {
                  var8 = var2.getDefaultParent();
               }

               boolean var22 = this.isCloneEnabled() && this.graphComponent.isCloneEvent(var1);
               Object[] var23 = this.movePreview.stop(true, var1, var3, var5, var22, var8);
               if (this.cells != var23) {
                  var2.setSelectionCells(var23);
               }

               var1.consume();
            } else if (this.isVisible()) {
               if (this.constrainedEvent) {
                  if (Math.abs(var3) > Math.abs(var5)) {
                     var5 = 0.0;
                  } else {
                     var3 = 0.0;
                  }
               }

               mxCellState var20 = this.marker.getValidState();
               Object var21 = var20 != null ? var20.getCell() : null;
               if (var2.isSplitEnabled() && var2.isSplitTarget(var21, this.cells)) {
                  var2.splitEdge(var21, this.cells, var3, var5);
               } else {
                  this.moveCells(this.cells, var3, var5, var21, var1);
               }

               var1.consume();
            }
         } else {
            if (this.cell != null && !var1.isPopupTrigger() && this.isSelectEnabled() && (this.first != null || !this.isMoveEnabled())) {
               this.graphComponent.selectCellForEvent(this.cell, var1);
            }

            if (this.graphComponent.isFoldingEnabled() && this.graphComponent.hitFoldingIcon(this.initialCell, var1.getX(), var1.getY())) {
               this.fold(this.initialCell);
            } else {
               Object var18 = this.graphComponent.getCellAt(var1.getX(), var1.getY(), this.graphComponent.isSwimlaneSelectionEnabled());
               if (this.cell == null && this.first == null) {
                  if (var18 == null) {
                     if (!this.graphComponent.isToggleEvent(var1)) {
                        var2.clearSelection();
                     }
                  } else if (var2.isSwimlane(var18)
                     && this.graphComponent.getCanvas().hitSwimlaneContent(this.graphComponent, var2.getView().getState(var18), var1.getX(), var1.getY())) {
                     this.graphComponent.selectCellForEvent(var18, var1);
                  }
               }

               if (this.graphComponent.isFoldingEnabled() && this.graphComponent.hitFoldingIcon(var18, var1.getX(), var1.getY())) {
                  this.fold(var18);
                  var1.consume();
               }
            }
         }
      }

      this.reset();
   }

   protected void fold(Object var1) {
      boolean var2 = !this.graphComponent.getGraph().isCellCollapsed(var1);
      this.graphComponent.getGraph().foldCells(var2, false, new Object[]{var1});
   }

   public void reset() {
      if (this.movePreview.isActive()) {
         this.movePreview.stop(false, null, 0.0, 0.0, false, null);
      }

      this.setVisible(false);
      this.marker.reset();
      this.initialCell = null;
      this.dragCells = null;
      this.dragImage = null;
      this.cells = null;
      this.first = null;
      this.cell = null;
   }

   protected boolean shouldRemoveCellFromParent(Object var1, Object[] var2, MouseEvent var3) {
      if (!this.graphComponent.getGraph().getModel().isVertex(var1)) {
         return false;
      }

      mxCellState var4 = this.graphComponent.getGraph().getView().getState(var1);
      return var4 != null && !var4.contains(var3.getX(), var3.getY());
   }

   protected void moveCells(Object[] var1, double var2, double var4, Object var6, MouseEvent var7) {
      mxGraph var8 = this.graphComponent.getGraph();
      boolean var9 = var7.isControlDown() && this.isCloneEnabled();
      if (var9) {
         var1 = var8.getCloneableCells(var1);
      }

      if (var1.length > 0) {
         if (var6 == null && this.isRemoveCellsFromParent() && this.shouldRemoveCellFromParent(var8.getModel().getParent(this.initialCell), var1, var7)) {
            var6 = var8.getDefaultParent();
         }

         Object[] var10 = var8.moveCells(var1, var2, var4, var9, var6, var7.getPoint());
         if (this.isSelectEnabled() && var9 && var10 != null && var10.length == var1.length) {
            var8.setSelectionCells(var10);
         }
      }
   }

   public void paint(Graphics var1) {
      if (this.isVisible() && this.previewBounds != null) {
         if (this.dragImage != null) {
            Graphics2D var2 = (Graphics2D)var1.create();
            if (this.graphComponent.getPreviewAlpha() < 1.0F) {
               var2.setComposite(AlphaComposite.getInstance(3, this.graphComponent.getPreviewAlpha()));
            }

            var2.drawImage(
               this.dragImage.getImage(), this.previewBounds.x, this.previewBounds.y, this.dragImage.getIconWidth(), this.dragImage.getIconHeight(), null
            );
            var2.dispose();
         } else if (!this.imagePreview) {
            mxSwingConstants.PREVIEW_BORDER
               .paintBorder(this.graphComponent, var1, this.previewBounds.x, this.previewBounds.y, this.previewBounds.width, this.previewBounds.height);
         }
      }
   }

   protected MouseEvent createEvent(DropTargetEvent var1) {
      JComponent var2 = getDropTarget(var1);
      Point var3 = null;
      int var4 = 0;
      if (var1 instanceof DropTargetDropEvent) {
         var3 = ((DropTargetDropEvent)var1).getLocation();
         var4 = ((DropTargetDropEvent)var1).getDropAction();
      } else if (var1 instanceof DropTargetDragEvent) {
         var3 = ((DropTargetDragEvent)var1).getLocation();
         var4 = ((DropTargetDragEvent)var1).getDropAction();
      }

      if (var3 != null) {
         var3 = this.convertPoint(var3);
         Rectangle var5 = this.graphComponent.getViewport().getViewRect();
         var3.translate(var5.x, var5.y);
      }

      int var6 = var4 == 1 ? 2 : 0;
      return new MouseEvent(var2, 0, System.currentTimeMillis(), var6, var3.x, var3.y, 1, false, 1);
   }

   protected static final mxGraphTransferHandler getGraphTransferHandler(DropTargetEvent var0) {
      JComponent var1 = getDropTarget(var0);
      TransferHandler var2 = var1.getTransferHandler();
      return var2 instanceof mxGraphTransferHandler ? (mxGraphTransferHandler)var2 : null;
   }

   protected static final JComponent getDropTarget(DropTargetEvent var0) {
      return (JComponent)var0.getDropTargetContext().getComponent();
   }
}
