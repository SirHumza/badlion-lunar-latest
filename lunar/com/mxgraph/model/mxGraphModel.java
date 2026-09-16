package com.mxgraph.model;

import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUndoableEdit;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mxGraphModel extends mxEventSource implements mxIGraphModel, Serializable {
   private static final Logger log = Logger.getLogger(mxGraphModel.class.getName());
   protected mxICell root;
   protected Map<String, Object> cells;
   protected boolean maintainEdgeParent = true;
   protected boolean createIds = true;
   protected int nextId = 0;
   protected transient mxUndoableEdit currentEdit;
   protected transient int updateLevel = 0;
   protected transient boolean endingUpdate = false;

   public mxGraphModel() {
      this(null);
   }

   public mxGraphModel(Object var1) {
      this.currentEdit = this.createUndoableEdit();
      if (var1 != null) {
         this.setRoot(var1);
      } else {
         this.clear();
      }
   }

   public void clear() {
      this.setRoot(this.createRoot());
   }

   public int getUpdateLevel() {
      return this.updateLevel;
   }

   public Object createRoot() {
      mxCell var1 = new mxCell();
      var1.insert(new mxCell());
      return var1;
   }

   public Map<String, Object> getCells() {
      return this.cells;
   }

   public Object getCell(String var1) {
      Object var2 = null;
      if (this.cells != null) {
         var2 = this.cells.get(var1);
      }

      return var2;
   }

   public boolean isMaintainEdgeParent() {
      return this.maintainEdgeParent;
   }

   public void setMaintainEdgeParent(boolean var1) {
      this.maintainEdgeParent = var1;
   }

   public boolean isCreateIds() {
      return this.createIds;
   }

   public void setCreateIds(boolean var1) {
      this.createIds = var1;
   }

   @Override
   public Object getRoot() {
      return this.root;
   }

   @Override
   public Object setRoot(Object var1) {
      this.execute(new mxGraphModel.mxRootChange(this, var1));
      return var1;
   }

   protected Object rootChanged(Object var1) {
      mxICell var2 = this.root;
      this.root = (mxICell)var1;
      this.nextId = 0;
      this.cells = null;
      this.cellAdded(var1);
      return var2;
   }

   protected mxUndoableEdit createUndoableEdit() {
      return new mxUndoableEdit(this) {
         @Override
         public void dispatch() {
            ((mxGraphModel)this.source).fireEvent(new mxEventObject("change", "edit", this, "changes", this.changes));
         }
      };
   }

   @Override
   public Object[] cloneCells(Object[] var1, boolean var2) {
      Hashtable var3 = new Hashtable();
      Object[] var4 = new Object[var1.length];

      for (int var5 = 0; var5 < var1.length; var5++) {
         try {
            var4[var5] = this.cloneCell(var1[var5], var3, var2);
         } catch (CloneNotSupportedException var7) {
            log.log(Level.SEVERE, "Failed to clone cells", var7);
         }
      }

      for (int var8 = 0; var8 < var1.length; var8++) {
         this.restoreClone(var4[var8], var1[var8], var3);
      }

      return var4;
   }

   protected Object cloneCell(Object var1, Map<Object, Object> var2, boolean var3) {
      if (!(var1 instanceof mxICell)) {
         return null;
      }

      mxICell var4 = (mxICell)var2.get(var1);
      if (var4 == null) {
         var4 = (mxICell)((mxICell)var1).clone();
         var2.put(var1, var4);
         if (var3) {
            int var5 = this.getChildCount(var1);

            for (int var6 = 0; var6 < var5; var6++) {
               Object var7 = this.cloneCell(this.getChildAt(var1, var6), var2, true);
               var4.insert((mxICell)var7);
            }
         }
      }

      return var4;
   }

   protected void restoreClone(Object var1, Object var2, Map<Object, Object> var3) {
      if (var1 instanceof mxICell) {
         mxICell var4 = (mxICell)var1;
         Object var5 = this.getTerminal(var2, true);
         if (var5 instanceof mxICell) {
            mxICell var6 = (mxICell)var3.get(var5);
            if (var6 != null) {
               var6.insertEdge(var4, true);
            }
         }

         Object var10 = this.getTerminal(var2, false);
         if (var10 instanceof mxICell) {
            mxICell var7 = (mxICell)var3.get(var10);
            if (var7 != null) {
               var7.insertEdge(var4, false);
            }
         }
      }

      int var8 = this.getChildCount(var1);

      for (int var9 = 0; var9 < var8; var9++) {
         this.restoreClone(this.getChildAt(var1, var9), this.getChildAt(var2, var9), var3);
      }
   }

   @Override
   public boolean isAncestor(Object var1, Object var2) {
      while (var2 != null && var2 != var1) {
         var2 = this.getParent(var2);
      }

      return var2 == var1;
   }

   @Override
   public boolean contains(Object var1) {
      return this.isAncestor(this.getRoot(), var1);
   }

   @Override
   public Object getParent(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).getParent() : null;
   }

   @Override
   public Object add(Object var1, Object var2, int var3) {
      if (var2 != var1 && var1 != null && var2 != null) {
         boolean var4 = var1 != this.getParent(var2);
         this.execute(new mxGraphModel.mxChildChange(this, var1, var2, var3));
         if (this.maintainEdgeParent && var4) {
            this.updateEdgeParents(var2);
         }
      }

      return var2;
   }

   protected void cellAdded(Object var1) {
      if (var1 instanceof mxICell) {
         mxICell var2 = (mxICell)var1;
         if (var2.getId() == null && this.isCreateIds()) {
            var2.setId(this.createId(var1));
         }

         if (var2.getId() != null) {
            Object var3 = this.getCell(var2.getId());
            if (var3 != var1) {
               while (var3 != null) {
                  var2.setId(this.createId(var1));
                  var3 = this.getCell(var2.getId());
               }

               if (this.cells == null) {
                  this.cells = new Hashtable<>();
               }

               this.cells.put(var2.getId(), var1);
            }
         }

         try {
            int var6 = Integer.parseInt(var2.getId());
            this.nextId = Math.max(this.nextId, var6 + 1);
         } catch (NumberFormatException var5) {
            log.log(Level.FINEST, "Failed to parse cell id", var5);
         }

         int var7 = var2.getChildCount();

         for (int var4 = 0; var4 < var7; var4++) {
            this.cellAdded(var2.getChildAt(var4));
         }
      }
   }

   public String createId(Object var1) {
      String var2 = String.valueOf(this.nextId);
      this.nextId++;
      return var2;
   }

   @Override
   public Object remove(Object var1) {
      if (var1 == this.root) {
         this.setRoot(null);
      } else if (this.getParent(var1) != null) {
         this.execute(new mxGraphModel.mxChildChange(this, null, var1));
      }

      return var1;
   }

   protected void cellRemoved(Object var1) {
      if (var1 instanceof mxICell) {
         mxICell var2 = (mxICell)var1;
         int var3 = var2.getChildCount();

         for (int var4 = 0; var4 < var3; var4++) {
            this.cellRemoved(var2.getChildAt(var4));
         }

         if (this.cells != null && var2.getId() != null) {
            this.cells.remove(var2.getId());
         }
      }
   }

   protected Object parentForCellChanged(Object var1, Object var2, int var3) {
      mxICell var4 = (mxICell)var1;
      mxICell var5 = (mxICell)this.getParent(var1);
      if (var2 != null) {
         if (var2 != var5 || var5.getIndex(var4) != var3) {
            ((mxICell)var2).insert(var4, var3);
         }
      } else if (var5 != null) {
         int var6 = var5.getIndex(var4);
         var5.remove(var6);
      }

      if (!this.contains(var5) && var2 != null) {
         this.cellAdded(var1);
      } else if (var2 == null) {
         this.cellRemoved(var1);
      }

      return var5;
   }

   @Override
   public int getChildCount(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).getChildCount() : 0;
   }

   @Override
   public Object getChildAt(Object var1, int var2) {
      return var1 instanceof mxICell ? ((mxICell)var1).getChildAt(var2) : null;
   }

   @Override
   public Object getTerminal(Object var1, boolean var2) {
      return var1 instanceof mxICell ? ((mxICell)var1).getTerminal(var2) : null;
   }

   @Override
   public Object setTerminal(Object var1, Object var2, boolean var3) {
      boolean var4 = var2 != this.getTerminal(var1, var3);
      this.execute(new mxGraphModel.mxTerminalChange(this, var1, var2, var3));
      if (this.maintainEdgeParent && var4) {
         this.updateEdgeParent(var1, this.getRoot());
      }

      return var2;
   }

   protected Object terminalForCellChanged(Object var1, Object var2, boolean var3) {
      mxICell var4 = (mxICell)this.getTerminal(var1, var3);
      if (var2 != null) {
         ((mxICell)var2).insertEdge((mxICell)var1, var3);
      } else if (var4 != null) {
         var4.removeEdge((mxICell)var1, var3);
      }

      return var4;
   }

   public void updateEdgeParents(Object var1) {
      this.updateEdgeParents(var1, this.getRoot());
   }

   public void updateEdgeParents(Object var1, Object var2) {
      int var3 = this.getChildCount(var1);

      for (int var4 = 0; var4 < var3; var4++) {
         Object var5 = this.getChildAt(var1, var4);
         this.updateEdgeParents(var5, var2);
      }

      int var8 = this.getEdgeCount(var1);
      ArrayList var9 = new ArrayList(var8);

      for (int var6 = 0; var6 < var8; var6++) {
         var9.add(this.getEdgeAt(var1, var6));
      }

      for (Object var7 : var9) {
         if (this.isAncestor(var2, var7)) {
            this.updateEdgeParent(var7, var2);
         }
      }
   }

   public void updateEdgeParent(Object var1, Object var2) {
      Object var3 = this.getTerminal(var1, true);
      Object var4 = this.getTerminal(var1, false);
      Object var5 = null;

      while (var3 != null && !this.isEdge(var3) && this.getGeometry(var3) != null && this.getGeometry(var3).isRelative()) {
         var3 = this.getParent(var3);
      }

      while (var4 != null && !this.isEdge(var4) && this.getGeometry(var4) != null && this.getGeometry(var4).isRelative()) {
         var4 = this.getParent(var4);
      }

      if (this.isAncestor(var2, var3) && this.isAncestor(var2, var4)) {
         if (var3 == var4) {
            var5 = this.getParent(var3);
         } else {
            var5 = this.getNearestCommonAncestor(var3, var4);
         }

         if (var5 != null && (this.getParent(var5) != var2 || this.isAncestor(var5, var1)) && this.getParent(var1) != var5) {
            mxGeometry var6 = this.getGeometry(var1);
            if (var6 != null) {
               mxPoint var7 = this.getOrigin(this.getParent(var1));
               mxPoint var8 = this.getOrigin(var5);
               double var9 = var8.getX() - var7.getX();
               double var11 = var8.getY() - var7.getY();
               var6 = (mxGeometry)var6.clone();
               var6.translate(-var9, -var11);
               this.setGeometry(var1, var6);
            }

            this.add(var5, var1, this.getChildCount(var5));
         }
      }
   }

   public mxPoint getOrigin(Object var1) {
      mxPoint var2 = null;
      if (var1 != null) {
         var2 = this.getOrigin(this.getParent(var1));
         if (!this.isEdge(var1)) {
            mxGeometry var3 = this.getGeometry(var1);
            if (var3 != null) {
               var2.setX(var2.getX() + var3.getX());
               var2.setY(var2.getY() + var3.getY());
            }
         }
      } else {
         var2 = new mxPoint();
      }

      return var2;
   }

   public Object getNearestCommonAncestor(Object var1, Object var2) {
      if (var1 != null && var2 != null) {
         String var3 = mxCellPath.create((mxICell)var2);
         if (var3 != null && var3.length() > 0) {
            Object var4 = var1;
            String var5 = mxCellPath.create((mxICell)var4);

            while (var4 != null) {
               Object var6 = this.getParent(var4);
               if (var3.indexOf(var5 + mxCellPath.PATH_SEPARATOR) == 0 && var6 != null) {
                  return var4;
               }

               var5 = mxCellPath.getParentPath(var5);
               var4 = var6;
            }
         }
      }

      return null;
   }

   @Override
   public int getEdgeCount(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).getEdgeCount() : 0;
   }

   @Override
   public Object getEdgeAt(Object var1, int var2) {
      return var1 instanceof mxICell ? ((mxICell)var1).getEdgeAt(var2) : null;
   }

   @Override
   public boolean isVertex(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).isVertex() : false;
   }

   @Override
   public boolean isEdge(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).isEdge() : false;
   }

   @Override
   public boolean isConnectable(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).isConnectable() : true;
   }

   @Override
   public Object getValue(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).getValue() : null;
   }

   @Override
   public Object setValue(Object var1, Object var2) {
      this.execute(new mxGraphModel.mxValueChange(this, var1, var2));
      return var2;
   }

   protected Object valueForCellChanged(Object var1, Object var2) {
      Object var3 = ((mxICell)var1).getValue();
      ((mxICell)var1).setValue(var2);
      return var3;
   }

   @Override
   public mxGeometry getGeometry(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).getGeometry() : null;
   }

   @Override
   public mxGeometry setGeometry(Object var1, mxGeometry var2) {
      if (var2 != this.getGeometry(var1)) {
         this.execute(new mxGraphModel.mxGeometryChange(this, var1, var2));
      }

      return var2;
   }

   protected mxGeometry geometryForCellChanged(Object var1, mxGeometry var2) {
      mxGeometry var3 = this.getGeometry(var1);
      ((mxICell)var1).setGeometry(var2);
      return var3;
   }

   @Override
   public String getStyle(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).getStyle() : null;
   }

   @Override
   public String setStyle(Object var1, String var2) {
      if (var2 == null || !var2.equals(this.getStyle(var1))) {
         this.execute(new mxGraphModel.mxStyleChange(this, var1, var2));
      }

      return var2;
   }

   protected String styleForCellChanged(Object var1, String var2) {
      String var3 = this.getStyle(var1);
      ((mxICell)var1).setStyle(var2);
      return var3;
   }

   @Override
   public boolean isCollapsed(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).isCollapsed() : false;
   }

   @Override
   public boolean setCollapsed(Object var1, boolean var2) {
      if (var2 != this.isCollapsed(var1)) {
         this.execute(new mxGraphModel.mxCollapseChange(this, var1, var2));
      }

      return var2;
   }

   protected boolean collapsedStateForCellChanged(Object var1, boolean var2) {
      boolean var3 = this.isCollapsed(var1);
      ((mxICell)var1).setCollapsed(var2);
      return var3;
   }

   @Override
   public boolean isVisible(Object var1) {
      return var1 instanceof mxICell ? ((mxICell)var1).isVisible() : false;
   }

   @Override
   public boolean setVisible(Object var1, boolean var2) {
      if (var2 != this.isVisible(var1)) {
         this.execute(new mxGraphModel.mxVisibleChange(this, var1, var2));
      }

      return var2;
   }

   protected boolean visibleStateForCellChanged(Object var1, boolean var2) {
      boolean var3 = this.isVisible(var1);
      ((mxICell)var1).setVisible(var2);
      return var3;
   }

   public void execute(mxIGraphModel.mxAtomicGraphModelChange var1) {
      var1.execute();
      this.beginUpdate();
      this.currentEdit.add(var1);
      this.fireEvent(new mxEventObject("execute", "change", var1));
      this.endUpdate();
   }

   @Override
   public void beginUpdate() {
      this.updateLevel++;
      this.fireEvent(new mxEventObject("beginUpdate"));
   }

   @Override
   public void endUpdate() {
      this.updateLevel--;
      if (!this.endingUpdate) {
         this.endingUpdate = this.updateLevel == 0;
         this.fireEvent(new mxEventObject("endUpdate", "edit", this.currentEdit));

         try {
            if (this.endingUpdate && !this.currentEdit.isEmpty()) {
               this.fireEvent(new mxEventObject("beforeUndo", "edit", this.currentEdit));
               mxUndoableEdit var1 = this.currentEdit;
               this.currentEdit = this.createUndoableEdit();
               var1.dispatch();
               this.fireEvent(new mxEventObject("undo", "edit", var1));
            }
         } finally {
            this.endingUpdate = false;
         }
      }
   }

   public void mergeChildren(mxICell var1, mxICell var2, boolean var3) {
      this.beginUpdate();

      try {
         Hashtable var4 = new Hashtable();
         this.mergeChildrenImpl(var1, var2, var3, var4);

         for (Object var6 : var4.keySet()) {
            Object var7 = var4.get(var6);
            Object var8 = this.getTerminal(var6, true);
            if (var8 != null) {
               var8 = var4.get(var8);
               this.setTerminal(var7, var8, true);
            }

            var8 = this.getTerminal(var6, false);
            if (var8 != null) {
               var8 = var4.get(var8);
               this.setTerminal(var7, var8, false);
            }
         }
      } finally {
         this.endUpdate();
      }
   }

   protected void mergeChildrenImpl(mxICell var1, mxICell var2, boolean var3, Hashtable<Object, Object> var4) {
      this.beginUpdate();

      try {
         int var5 = var1.getChildCount();

         for (int var6 = 0; var6 < var5; var6++) {
            mxICell var7 = var1.getChildAt(var6);
            String var8 = var7.getId();
            var var9 = (mxICell & mxICell)(var8 == null || this.isEdge(var7) && var3 ? null : this.getCell(var8));
            if (var9 == null) {
               mxCell var10 = (mxCell)var7.clone();
               var10.setId(var8);
               var9 = var2.insert(var10);
               this.cellAdded(var9);
            }

            var4.put(var7, var9);
            this.mergeChildrenImpl(var7, var9, var3, var4);
         }
      } finally {
         this.endUpdate();
      }
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.currentEdit = this.createUndoableEdit();
   }

   public static int getDirectedEdgeCount(mxIGraphModel var0, Object var1, boolean var2) {
      return getDirectedEdgeCount(var0, var1, var2, null);
   }

   public static int getDirectedEdgeCount(mxIGraphModel var0, Object var1, boolean var2, Object var3) {
      int var4 = 0;
      int var5 = var0.getEdgeCount(var1);

      for (int var6 = 0; var6 < var5; var6++) {
         Object var7 = var0.getEdgeAt(var1, var6);
         if (var7 != var3 && var0.getTerminal(var7, var2) == var1) {
            var4++;
         }
      }

      return var4;
   }

   public static Object[] getEdges(mxIGraphModel var0, Object var1) {
      return getEdges(var0, var1, true, true, true);
   }

   public static Object[] getConnections(mxIGraphModel var0, Object var1) {
      return getEdges(var0, var1, true, true, false);
   }

   public static Object[] getIncomingEdges(mxIGraphModel var0, Object var1) {
      return getEdges(var0, var1, true, false, false);
   }

   public static Object[] getOutgoingEdges(mxIGraphModel var0, Object var1) {
      return getEdges(var0, var1, false, true, false);
   }

   public static Object[] getEdges(mxIGraphModel var0, Object var1, boolean var2, boolean var3, boolean var4) {
      int var5 = var0.getEdgeCount(var1);
      ArrayList var6 = new ArrayList(var5);

      for (int var7 = 0; var7 < var5; var7++) {
         Object var8 = var0.getEdgeAt(var1, var7);
         Object var9 = var0.getTerminal(var8, true);
         Object var10 = var0.getTerminal(var8, false);
         if (var4 && var9 == var10 || var9 != var10 && (var2 && var10 == var1 || var3 && var9 == var1)) {
            var6.add(var8);
         }
      }

      return var6.toArray();
   }

   public static Object[] getEdgesBetween(mxIGraphModel var0, Object var1, Object var2) {
      return getEdgesBetween(var0, var1, var2, false);
   }

   public static Object[] getEdgesBetween(mxIGraphModel var0, Object var1, Object var2, boolean var3) {
      int var4 = var0.getEdgeCount(var1);
      int var5 = var0.getEdgeCount(var2);
      Object var6 = var1;
      int var7 = var4;
      if (var5 < var4) {
         var7 = var5;
         var6 = var2;
      }

      ArrayList var8 = new ArrayList(var7);

      for (int var9 = 0; var9 < var7; var9++) {
         Object var10 = var0.getEdgeAt(var6, var9);
         Object var11 = var0.getTerminal(var10, true);
         Object var12 = var0.getTerminal(var10, false);
         boolean var13 = var11 == var1 && var12 == var2;
         boolean var14 = var12 == var1 && var11 == var2;
         if (var13 || !var3 && var14) {
            var8.add(var10);
         }
      }

      return var8.toArray();
   }

   public static Object[] getOpposites(mxIGraphModel var0, Object[] var1, Object var2) {
      return getOpposites(var0, var1, var2, true, true);
   }

   public static Object[] getOpposites(mxIGraphModel var0, Object[] var1, Object var2, boolean var3, boolean var4) {
      ArrayList var5 = new ArrayList();
      if (var1 != null) {
         for (int var6 = 0; var6 < var1.length; var6++) {
            Object var7 = var0.getTerminal(var1[var6], true);
            Object var8 = var0.getTerminal(var1[var6], false);
            if (var4 && var7 == var2 && var8 != null && var8 != var2) {
               var5.add(var8);
            } else if (var3 && var8 == var2 && var7 != null && var7 != var2) {
               var5.add(var7);
            }
         }
      }

      return var5.toArray();
   }

   public static void setTerminals(mxIGraphModel var0, Object var1, Object var2, Object var3) {
      var0.beginUpdate();

      try {
         var0.setTerminal(var1, var2, true);
         var0.setTerminal(var1, var3, false);
      } finally {
         var0.endUpdate();
      }
   }

   public static Object[] getChildren(mxIGraphModel var0, Object var1) {
      return getChildCells(var0, var1, false, false);
   }

   public static Object[] getChildVertices(mxIGraphModel var0, Object var1) {
      return getChildCells(var0, var1, true, false);
   }

   public static Object[] getChildEdges(mxIGraphModel var0, Object var1) {
      return getChildCells(var0, var1, false, true);
   }

   public static Object[] getChildCells(mxIGraphModel var0, Object var1, boolean var2, boolean var3) {
      int var4 = var0.getChildCount(var1);
      ArrayList var5 = new ArrayList(var4);

      for (int var6 = 0; var6 < var4; var6++) {
         Object var7 = var0.getChildAt(var1, var6);
         if (!var3 && !var2 || var3 && var0.isEdge(var7) || var2 && var0.isVertex(var7)) {
            var5.add(var7);
         }
      }

      return var5.toArray();
   }

   public static Object[] getParents(mxIGraphModel var0, Object[] var1) {
      HashSet var2 = new HashSet();
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            Object var4 = var0.getParent(var1[var3]);
            if (var4 != null) {
               var2.add(var4);
            }
         }
      }

      return var2.toArray();
   }

   public static Object[] filterCells(Object[] var0, mxGraphModel.Filter var1) {
      ArrayList var2 = null;
      if (var0 != null) {
         var2 = new ArrayList(var0.length);

         for (int var3 = 0; var3 < var0.length; var3++) {
            if (var1.filter(var0[var3])) {
               var2.add(var0[var3]);
            }
         }
      }

      return var2 != null ? var2.toArray() : null;
   }

   public static Collection<Object> getDescendants(mxIGraphModel var0, Object var1) {
      return filterDescendants(var0, null, var1);
   }

   public static Collection<Object> filterDescendants(mxIGraphModel var0, mxGraphModel.Filter var1) {
      return filterDescendants(var0, var1, var0.getRoot());
   }

   public static Collection<Object> filterDescendants(mxIGraphModel var0, mxGraphModel.Filter var1, Object var2) {
      ArrayList var3 = new ArrayList();
      if (var1 == null || var1.filter(var2)) {
         var3.add(var2);
      }

      int var4 = var0.getChildCount(var2);

      for (int var5 = 0; var5 < var4; var5++) {
         Object var6 = var0.getChildAt(var2, var5);
         var3.addAll(filterDescendants(var0, var1, var6));
      }

      return var3;
   }

   public static Object[] getTopmostCells(mxIGraphModel var0, Object[] var1) {
      HashSet var2 = new HashSet();
      var2.addAll(Arrays.asList(var1));
      ArrayList var3 = new ArrayList(var1.length);

      for (int var4 = 0; var4 < var1.length; var4++) {
         Object var5 = var1[var4];
         boolean var6 = true;

         for (Object var7 = var0.getParent(var5); var7 != null; var7 = var0.getParent(var7)) {
            if (var2.contains(var7)) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            var3.add(var5);
         }
      }

      return var3.toArray();
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getClass().getSimpleName());
      var1.append(" [");
      var1.append("root=");
      var1.append(this.root);
      var1.append(", cells=");
      if (this.cells != null) {
         var1.append("<");
         var1.append(this.cells.size());
         var1.append(" entries>");
      } else {
         var1.append("null");
      }

      var1.append(", maintainEdgeParent=");
      var1.append(this.maintainEdgeParent);
      var1.append(", createIds=");
      var1.append(this.createIds);
      var1.append(", nextId=");
      var1.append(this.nextId);
      var1.append(", currentEdit=");
      var1.append(this.currentEdit);
      var1.append(", updateLevel=");
      var1.append(this.updateLevel);
      var1.append(", endingUpdate=");
      var1.append(this.endingUpdate);
      var1.append("]");
      return var1.toString();
   }

   public interface Filter {
      boolean filter(Object var1);
   }

   public static class mxChildChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object parent;
      protected Object previous;
      protected Object child;
      protected int index;
      protected int previousIndex;

      public mxChildChange() {
         this(null, null, null, 0);
      }

      public mxChildChange(mxGraphModel var1, Object var2, Object var3) {
         this(var1, var2, var3, 0);
      }

      public mxChildChange(mxGraphModel var1, Object var2, Object var3, int var4) {
         super(var1);
         this.parent = var2;
         this.previous = this.parent;
         this.child = var3;
         this.index = var4;
         this.previousIndex = var4;
      }

      public void setParent(Object var1) {
         this.parent = var1;
      }

      public Object getParent() {
         return this.parent;
      }

      public void setPrevious(Object var1) {
         this.previous = var1;
      }

      public Object getPrevious() {
         return this.previous;
      }

      public void setChild(Object var1) {
         this.child = var1;
      }

      public Object getChild() {
         return this.child;
      }

      public void setIndex(int var1) {
         this.index = var1;
      }

      public int getIndex() {
         return this.index;
      }

      public void setPreviousIndex(int var1) {
         this.previousIndex = var1;
      }

      public int getPreviousIndex() {
         return this.previousIndex;
      }

      protected Object getTerminal(Object var1, boolean var2) {
         return this.model.getTerminal(var1, var2);
      }

      protected void setTerminal(Object var1, Object var2, boolean var3) {
         ((mxICell)var1).setTerminal((mxICell)var2, var3);
      }

      protected void connect(Object var1, boolean var2) {
         Object var3 = this.getTerminal(var1, true);
         Object var4 = this.getTerminal(var1, false);
         if (var3 != null) {
            if (var2) {
               ((mxGraphModel)this.model).terminalForCellChanged(var1, var3, true);
            } else {
               ((mxGraphModel)this.model).terminalForCellChanged(var1, null, true);
            }
         }

         if (var4 != null) {
            if (var2) {
               ((mxGraphModel)this.model).terminalForCellChanged(var1, var4, false);
            } else {
               ((mxGraphModel)this.model).terminalForCellChanged(var1, null, false);
            }
         }

         this.setTerminal(var1, var3, true);
         this.setTerminal(var1, var4, false);
         int var5 = this.model.getChildCount(var1);

         for (int var6 = 0; var6 < var5; var6++) {
            this.connect(this.model.getChildAt(var1, var6), var2);
         }
      }

      protected int getChildIndex(Object var1, Object var2) {
         return var1 instanceof mxICell && var2 instanceof mxICell ? ((mxICell)var1).getIndex((mxICell)var2) : 0;
      }

      @Override
      public void execute() {
         Object var1 = this.model.getParent(this.child);
         int var2 = this.getChildIndex(var1, this.child);
         if (this.previous == null) {
            this.connect(this.child, false);
         }

         var1 = ((mxGraphModel)this.model).parentForCellChanged(this.child, this.previous, this.previousIndex);
         if (this.previous != null) {
            this.connect(this.child, true);
         }

         this.parent = this.previous;
         this.previous = var1;
         this.index = this.previousIndex;
         this.previousIndex = var2;
      }
   }

   public static class mxCollapseChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object cell;
      protected boolean collapsed;
      protected boolean previous;

      public mxCollapseChange() {
         this(null, null, false);
      }

      public mxCollapseChange(mxGraphModel var1, Object var2, boolean var3) {
         super(var1);
         this.cell = var2;
         this.collapsed = var3;
         this.previous = this.collapsed;
      }

      public void setCell(Object var1) {
         this.cell = var1;
      }

      public Object getCell() {
         return this.cell;
      }

      public void setCollapsed(boolean var1) {
         this.collapsed = var1;
      }

      public boolean isCollapsed() {
         return this.collapsed;
      }

      public void setPrevious(boolean var1) {
         this.previous = var1;
      }

      public boolean getPrevious() {
         return this.previous;
      }

      @Override
      public void execute() {
         this.collapsed = this.previous;
         this.previous = ((mxGraphModel)this.model).collapsedStateForCellChanged(this.cell, this.previous);
      }
   }

   public static class mxGeometryChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object cell;
      protected mxGeometry geometry;
      protected mxGeometry previous;

      public mxGeometryChange() {
         this(null, null, null);
      }

      public mxGeometryChange(mxGraphModel var1, Object var2, mxGeometry var3) {
         super(var1);
         this.cell = var2;
         this.geometry = var3;
         this.previous = this.geometry;
      }

      public void setCell(Object var1) {
         this.cell = var1;
      }

      public Object getCell() {
         return this.cell;
      }

      public void setGeometry(mxGeometry var1) {
         this.geometry = var1;
      }

      public mxGeometry getGeometry() {
         return this.geometry;
      }

      public void setPrevious(mxGeometry var1) {
         this.previous = var1;
      }

      public mxGeometry getPrevious() {
         return this.previous;
      }

      @Override
      public void execute() {
         this.geometry = this.previous;
         this.previous = ((mxGraphModel)this.model).geometryForCellChanged(this.cell, this.previous);
      }
   }

   public static class mxRootChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object root;
      protected Object previous;

      public mxRootChange() {
         this(null, null);
      }

      public mxRootChange(mxGraphModel var1, Object var2) {
         super(var1);
         this.root = var2;
         this.previous = var2;
      }

      public void setRoot(Object var1) {
         this.root = var1;
      }

      public Object getRoot() {
         return this.root;
      }

      public void setPrevious(Object var1) {
         this.previous = var1;
      }

      public Object getPrevious() {
         return this.previous;
      }

      @Override
      public void execute() {
         this.root = this.previous;
         this.previous = ((mxGraphModel)this.model).rootChanged(this.previous);
      }
   }

   public static class mxStyleChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object cell;
      protected String style;
      protected String previous;

      public mxStyleChange() {
         this(null, null, null);
      }

      public mxStyleChange(mxGraphModel var1, Object var2, String var3) {
         super(var1);
         this.cell = var2;
         this.style = var3;
         this.previous = this.style;
      }

      public void setCell(Object var1) {
         this.cell = var1;
      }

      public Object getCell() {
         return this.cell;
      }

      public void setStyle(String var1) {
         this.style = var1;
      }

      public String getStyle() {
         return this.style;
      }

      public void setPrevious(String var1) {
         this.previous = var1;
      }

      public String getPrevious() {
         return this.previous;
      }

      @Override
      public void execute() {
         this.style = this.previous;
         this.previous = ((mxGraphModel)this.model).styleForCellChanged(this.cell, this.previous);
      }
   }

   public static class mxTerminalChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object cell;
      protected Object terminal;
      protected Object previous;
      protected boolean source;

      public mxTerminalChange() {
         this(null, null, null, false);
      }

      public mxTerminalChange(mxGraphModel var1, Object var2, Object var3, boolean var4) {
         super(var1);
         this.cell = var2;
         this.terminal = var3;
         this.previous = this.terminal;
         this.source = var4;
      }

      public void setCell(Object var1) {
         this.cell = var1;
      }

      public Object getCell() {
         return this.cell;
      }

      public void setTerminal(Object var1) {
         this.terminal = var1;
      }

      public Object getTerminal() {
         return this.terminal;
      }

      public void setPrevious(Object var1) {
         this.previous = var1;
      }

      public Object getPrevious() {
         return this.previous;
      }

      public void setSource(boolean var1) {
         this.source = var1;
      }

      public boolean isSource() {
         return this.source;
      }

      @Override
      public void execute() {
         this.terminal = this.previous;
         this.previous = ((mxGraphModel)this.model).terminalForCellChanged(this.cell, this.previous, this.source);
      }
   }

   public static class mxValueChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object cell;
      protected Object value;
      protected Object previous;

      public mxValueChange() {
         this(null, null, null);
      }

      public mxValueChange(mxGraphModel var1, Object var2, Object var3) {
         super(var1);
         this.cell = var2;
         this.value = var3;
         this.previous = this.value;
      }

      public void setCell(Object var1) {
         this.cell = var1;
      }

      public Object getCell() {
         return this.cell;
      }

      public void setValue(Object var1) {
         this.value = var1;
      }

      public Object getValue() {
         return this.value;
      }

      public void setPrevious(Object var1) {
         this.previous = var1;
      }

      public Object getPrevious() {
         return this.previous;
      }

      @Override
      public void execute() {
         this.value = this.previous;
         this.previous = ((mxGraphModel)this.model).valueForCellChanged(this.cell, this.previous);
      }
   }

   public static class mxVisibleChange extends mxIGraphModel.mxAtomicGraphModelChange {
      protected Object cell;
      protected boolean visible;
      protected boolean previous;

      public mxVisibleChange() {
         this(null, null, false);
      }

      public mxVisibleChange(mxGraphModel var1, Object var2, boolean var3) {
         super(var1);
         this.cell = var2;
         this.visible = var3;
         this.previous = this.visible;
      }

      public void setCell(Object var1) {
         this.cell = var1;
      }

      public Object getCell() {
         return this.cell;
      }

      public void setVisible(boolean var1) {
         this.visible = var1;
      }

      public boolean isVisible() {
         return this.visible;
      }

      public void setPrevious(boolean var1) {
         this.previous = var1;
      }

      public boolean getPrevious() {
         return this.previous;
      }

      @Override
      public void execute() {
         this.visible = this.previous;
         this.previous = ((mxGraphModel)this.model).visibleStateForCellChanged(this.cell, this.previous);
      }
   }
}
