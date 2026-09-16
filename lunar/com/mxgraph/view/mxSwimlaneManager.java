package com.mxgraph.view;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxUtils;
import java.util.Map;

public class mxSwimlaneManager extends mxEventSource {
   protected mxGraph graph;
   protected boolean enabled;
   protected boolean horizontal;
   protected boolean addEnabled;
   protected boolean resizeEnabled;
   protected mxEventSource.mxIEventListener addHandler = new mxEventSource.mxIEventListener() {
      @Override
      public void invoke(Object var1, mxEventObject var2) {
         if (mxSwimlaneManager.this.isEnabled() && mxSwimlaneManager.this.isAddEnabled()) {
            mxSwimlaneManager.this.cellsAdded((Object[])var2.getProperty("cells"));
         }
      }
   };
   protected mxEventSource.mxIEventListener resizeHandler = new mxEventSource.mxIEventListener() {
      @Override
      public void invoke(Object var1, mxEventObject var2) {
         if (mxSwimlaneManager.this.isEnabled() && mxSwimlaneManager.this.isResizeEnabled()) {
            mxSwimlaneManager.this.cellsResized((Object[])var2.getProperty("cells"));
         }
      }
   };

   public mxSwimlaneManager(mxGraph var1) {
      this.setGraph(var1);
   }

   public boolean isEnabled() {
      return this.enabled;
   }

   public void setEnabled(boolean var1) {
      this.enabled = var1;
   }

   public boolean isHorizontal() {
      return this.horizontal;
   }

   public void setHorizontal(boolean var1) {
      this.horizontal = var1;
   }

   public boolean isAddEnabled() {
      return this.addEnabled;
   }

   public void setAddEnabled(boolean var1) {
      this.addEnabled = var1;
   }

   public boolean isResizeEnabled() {
      return this.resizeEnabled;
   }

   public void setResizeEnabled(boolean var1) {
      this.resizeEnabled = var1;
   }

   public mxGraph getGraph() {
      return this.graph;
   }

   public void setGraph(mxGraph var1) {
      if (this.graph != null) {
         this.graph.removeListener(this.addHandler);
         this.graph.removeListener(this.resizeHandler);
      }

      this.graph = var1;
      if (this.graph != null) {
         this.graph.addListener("addCells", this.addHandler);
         this.graph.addListener("cellsResized", this.resizeHandler);
      }
   }

   protected boolean isSwimlaneIgnored(Object var1) {
      return !this.getGraph().isSwimlane(var1);
   }

   protected boolean isCellHorizontal(Object var1) {
      if (this.graph.isSwimlane(var1)) {
         mxCellState var2 = this.graph.getView().getState(var1);
         Map var3 = var2 != null ? var2.getStyle() : this.graph.getCellStyle(var1);
         return mxUtils.isTrue(var3, mxConstants.STYLE_HORIZONTAL, true);
      } else {
         return !this.isHorizontal();
      }
   }

   protected void cellsAdded(Object[] var1) {
      if (var1 != null) {
         mxIGraphModel var2 = this.getGraph().getModel();
         var2.beginUpdate();

         try {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (!this.isSwimlaneIgnored(var1[var3])) {
                  this.swimlaneAdded(var1[var3]);
               }
            }
         } finally {
            var2.endUpdate();
         }
      }
   }

   protected void swimlaneAdded(Object var1) {
      mxIGraphModel var2 = this.getGraph().getModel();
      Object var3 = var2.getParent(var1);
      int var4 = var2.getChildCount(var3);
      mxGeometry var5 = null;

      for (int var6 = 0; var6 < var4; var6++) {
         Object var7 = var2.getChildAt(var3, var6);
         if (var7 != var1 && !this.isSwimlaneIgnored(var7)) {
            var5 = var2.getGeometry(var7);
            if (var5 != null) {
               break;
            }
         }
      }

      if (var5 != null) {
         boolean var8 = var3 != null ? this.isCellHorizontal(var3) : this.horizontal;
         this.resizeSwimlane(var1, var5.getWidth(), var5.getHeight(), var8);
      }
   }

   protected void cellsResized(Object[] var1) {
      if (var1 != null) {
         mxIGraphModel var2 = this.getGraph().getModel();
         var2.beginUpdate();

         try {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (!this.isSwimlaneIgnored(var1[var3])) {
                  mxGeometry var4 = var2.getGeometry(var1[var3]);
                  if (var4 != null) {
                     mxRectangle var5 = new mxRectangle(0.0, 0.0, var4.getWidth(), var4.getHeight());
                     Object var6 = var1[var3];
                     Object var7 = var6;

                     while (var7 != null) {
                        var6 = var7;
                        var7 = var2.getParent(var7);
                        mxRectangle var8 = this.graph.isSwimlane(var7) ? this.graph.getStartSize(var7) : new mxRectangle();
                        var5.setWidth(var5.getWidth() + var8.getWidth());
                        var5.setHeight(var5.getHeight() + var8.getHeight());
                     }

                     boolean var12 = var7 != null ? this.isCellHorizontal(var7) : this.horizontal;
                     this.resizeSwimlane(var6, var5.getWidth(), var5.getHeight(), var12);
                  }
               }
            }
         } finally {
            var2.endUpdate();
         }
      }
   }

   protected void resizeSwimlane(Object var1, double var2, double var4, boolean var6) {
      mxIGraphModel var7 = this.getGraph().getModel();
      var7.beginUpdate();

      try {
         boolean var8 = this.isCellHorizontal(var1);
         if (!this.isSwimlaneIgnored(var1)) {
            mxGeometry var9 = var7.getGeometry(var1);
            if (var9 != null && (var6 && var9.getHeight() != var4 || !var6 && var9.getWidth() != var2)) {
               var9 = (mxGeometry)var9.clone();
               if (var6) {
                  var9.setHeight(var4);
               } else {
                  var9.setWidth(var2);
               }

               var7.setGeometry(var1, var9);
            }
         }

         mxRectangle var19 = this.graph.isSwimlane(var1) ? this.graph.getStartSize(var1) : new mxRectangle();
         var2 -= var19.getWidth();
         var4 -= var19.getHeight();
         int var10 = var7.getChildCount(var1);

         for (int var11 = 0; var11 < var10; var11++) {
            Object var12 = var7.getChildAt(var1, var11);
            this.resizeSwimlane(var12, var2, var4, var8);
         }
      } finally {
         var7.endUpdate();
      }
   }

   public void destroy() {
      this.setGraph(null);
   }
}
