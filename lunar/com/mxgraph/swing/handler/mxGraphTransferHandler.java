package com.mxgraph.swing.handler;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.util.mxGraphTransferable;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;
import java.awt.Color;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class mxGraphTransferHandler extends TransferHandler {
   private static final long serialVersionUID = -6443287704811197675L;
   private static final Logger log = Logger.getLogger(mxGraphTransferHandler.class.getName());
   public static boolean DEFAULT_TRANSFER_IMAGE_ENABLED = true;
   public static Color DEFAULT_BACKGROUNDCOLOR = Color.WHITE;
   protected Object[] originalCells;
   protected Transferable lastImported;
   protected int initialImportCount = 1;
   protected int importCount = 0;
   protected boolean transferImageEnabled = DEFAULT_TRANSFER_IMAGE_ENABLED;
   protected Color transferImageBackground = DEFAULT_BACKGROUNDCOLOR;
   protected Point location;
   protected Point offset;

   public int getImportCount() {
      return this.importCount;
   }

   public void setImportCount(int var1) {
      this.importCount = var1;
   }

   public void setTransferImageEnabled(boolean var1) {
      this.transferImageEnabled = var1;
   }

   public boolean isTransferImageEnabled() {
      return this.transferImageEnabled;
   }

   public void setTransferImageBackground(Color var1) {
      this.transferImageBackground = var1;
   }

   public Color getTransferImageBackground() {
      return this.transferImageBackground;
   }

   public boolean isLocalDrag() {
      return this.originalCells != null;
   }

   public void setLocation(Point var1) {
      this.location = var1;
   }

   public void setOffset(Point var1) {
      this.offset = var1;
   }

   @Override
   public boolean canImport(JComponent var1, DataFlavor[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         if (var2[var3] != null && var2[var3].equals(mxGraphTransferable.dataFlavor)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public Transferable createTransferable(JComponent var1) {
      if (var1 instanceof mxGraphComponent) {
         mxGraphComponent var2 = (mxGraphComponent)var1;
         mxGraph var3 = var2.getGraph();
         if (!var3.isSelectionEmpty()) {
            this.originalCells = var2.getExportableCells(var3.getSelectionCells());
            if (this.originalCells.length > 0) {
               ImageIcon var4 = this.transferImageEnabled ? this.createTransferableImage(var2, this.originalCells) : null;
               return this.createGraphTransferable(var2, this.originalCells, var4);
            }
         }
      }

      return null;
   }

   public mxGraphTransferable createGraphTransferable(mxGraphComponent var1, Object[] var2, ImageIcon var3) {
      mxGraph var4 = var1.getGraph();
      mxPoint var5 = var4.getView().getTranslate();
      double var6 = var4.getView().getScale();
      mxRectangle var8 = var4.getPaintBounds(var2);
      var8.setX(var8.getX() / var6 - var5.getX());
      var8.setY(var8.getY() / var6 - var5.getY());
      var8.setWidth(var8.getWidth() / var6);
      var8.setHeight(var8.getHeight() / var6);
      return this.createGraphTransferable(var1, var2, var8, var3);
   }

   public mxGraphTransferable createGraphTransferable(mxGraphComponent var1, Object[] var2, mxRectangle var3, ImageIcon var4) {
      return new mxGraphTransferable(var1.getGraph().cloneCells(var2), var3, var4);
   }

   public ImageIcon createTransferableImage(mxGraphComponent var1, Object[] var2) {
      ImageIcon var3 = null;
      Color var4 = this.transferImageBackground != null ? this.transferImageBackground : var1.getBackground();
      BufferedImage var5 = mxCellRenderer.createBufferedImage(var1.getGraph(), var2, 1.0, var4, var1.isAntiAlias(), null, var1.getCanvas());
      if (var5 != null) {
         var3 = new ImageIcon(var5);
      }

      return var3;
   }

   @Override
   public void exportDone(JComponent var1, Transferable var2, int var3) {
      this.initialImportCount = 1;
      if (var1 instanceof mxGraphComponent && var2 instanceof mxGraphTransferable) {
         boolean var4 = this.location != null;
         if (var3 == 2 && !var4) {
            this.removeCells((mxGraphComponent)var1, this.originalCells);
            this.initialImportCount = 0;
         }
      }

      this.originalCells = null;
      this.location = null;
      this.offset = null;
   }

   protected void removeCells(mxGraphComponent var1, Object[] var2) {
      var1.getGraph().removeCells(var2);
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return 3;
   }

   @Override
   public boolean importData(JComponent var1, Transferable var2) {
      boolean var3 = false;
      if (this.isLocalDrag()) {
         var3 = true;
      } else {
         try {
            this.updateImportCount(var2);
            if (var1 instanceof mxGraphComponent) {
               mxGraphComponent var4 = (mxGraphComponent)var1;
               if (var4.isEnabled() && var2.isDataFlavorSupported(mxGraphTransferable.dataFlavor)) {
                  mxGraphTransferable var5 = (mxGraphTransferable)var2.getTransferData(mxGraphTransferable.dataFlavor);
                  if (var5.getCells() != null) {
                     var3 = this.importGraphTransferable(var4, var5);
                  }
               }
            }
         } catch (Exception var6) {
            log.log(Level.SEVERE, "Failed to import data", var6);
         }
      }

      return var3;
   }

   protected void updateImportCount(Transferable var1) {
      if (this.lastImported != var1) {
         this.importCount = this.initialImportCount;
      } else {
         this.importCount++;
      }

      this.lastImported = var1;
   }

   protected boolean importGraphTransferable(mxGraphComponent var1, mxGraphTransferable var2) {
      boolean var3 = false;

      try {
         mxGraph var4 = var1.getGraph();
         double var5 = var4.getView().getScale();
         mxRectangle var7 = var2.getBounds();
         double var8 = 0.0;
         double var10 = 0.0;
         if (this.location != null && var7 != null) {
            mxPoint var18 = var4.getView().getTranslate();
            var8 = this.location.getX() - (var7.getX() + var18.getX()) * var5;
            var10 = this.location.getY() - (var7.getY() + var18.getY()) * var5;
            var8 = var4.snap(var8 / var5);
            var10 = var4.snap(var10 / var5);
         } else {
            int var12 = var4.getGridSize();
            var8 = this.importCount * var12;
            var10 = this.importCount * var12;
         }

         if (this.offset != null) {
            var8 += this.offset.x;
            var10 += this.offset.y;
         }

         this.importCells(var1, var2, var8, var10);
         this.location = null;
         this.offset = null;
         var3 = true;
         var1.requestFocus();
      } catch (Exception var13) {
         log.log(Level.SEVERE, "Failed to import graph", var13);
      }

      return var3;
   }

   protected Object getDropTarget(mxGraphComponent var1, mxGraphTransferable var2) {
      Object[] var3 = var2.getCells();
      Object var4 = null;
      if (this.location != null) {
         var4 = var1.getGraph().getDropTarget(var3, this.location, var1.getCellAt(this.location.x, this.location.y));
         if (var3.length > 0 && var1.getGraph().getModel().getParent(var3[0]) == var4) {
            var4 = null;
         }
      }

      return var4;
   }

   protected Object[] importCells(mxGraphComponent var1, mxGraphTransferable var2, double var3, double var5) {
      Object var7 = this.getDropTarget(var1, var2);
      mxGraph var8 = var1.getGraph();
      Object[] var9 = var2.getCells();
      var9 = var1.getImportableCells(var9);
      if (var8.isSplitEnabled() && var8.isSplitTarget(var7, var9)) {
         var8.splitEdge(var7, var9, var3, var5);
      } else {
         var9 = var1.importCells(var9, var3, var5, var7, this.location);
         var8.setSelectionCells(var9);
      }

      return var9;
   }
}
