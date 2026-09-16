package org.jgrapht.ext;

import com.mxgraph.model.mxICell;
import com.mxgraph.view.mxGraph;
import java.util.ArrayList;
import java.util.HashMap;
import org.jgrapht.Graph;
import org.jgrapht.ListenableGraph;
import org.jgrapht.event.GraphEdgeChangeEvent;
import org.jgrapht.event.GraphListener;
import org.jgrapht.event.GraphVertexChangeEvent;

public class JGraphXAdapter<V, E> extends mxGraph implements GraphListener<V, E> {
   private Graph<V, E> graphT;
   private HashMap<V, mxICell> vertexToCellMap = new HashMap<>();
   private HashMap<E, mxICell> edgeToCellMap = new HashMap<>();
   private HashMap<mxICell, V> cellToVertexMap = new HashMap<>();
   private HashMap<mxICell, E> cellToEdgeMap = (HashMap<mxICell, E>)(new HashMap<>());

   public JGraphXAdapter(ListenableGraph<V, E> var1) {
      this((Graph<V, E>)var1);
      var1.addGraphListener(this);
   }

   public JGraphXAdapter(Graph<V, E> var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      }

      this.graphT = var1;
      this.insertJGraphT(var1);
      this.setAutoSizeCells(true);
   }

   public HashMap<V, mxICell> getVertexToCellMap() {
      return this.vertexToCellMap;
   }

   public HashMap<E, mxICell> getEdgeToCellMap() {
      return this.edgeToCellMap;
   }

   public HashMap<mxICell, E> getCellToEdgeMap() {
      return this.cellToEdgeMap;
   }

   public HashMap<mxICell, V> getCellToVertexMap() {
      return this.cellToVertexMap;
   }

   @Override
   public void vertexAdded(GraphVertexChangeEvent<V> var1) {
      this.addJGraphTVertex((V)var1.getVertex());
   }

   @Override
   public void vertexRemoved(GraphVertexChangeEvent<V> var1) {
      mxICell var2 = this.vertexToCellMap.remove(var1.getVertex());
      this.removeCells(new Object[]{var2});
      this.cellToVertexMap.remove(var2);
      this.vertexToCellMap.remove(var1.getVertex());
      ArrayList var3 = new ArrayList();

      for (Object var5 : this.cellToEdgeMap.values()) {
         if (!this.graphT.containsEdge((E)var5)) {
            var3.add(var5);
         }
      }

      for (Object var7 : var3) {
         this.removeEdge((E)var7);
      }
   }

   @Override
   public void edgeAdded(GraphEdgeChangeEvent<V, E> var1) {
      this.addJGraphTEdge((E)var1.getEdge());
   }

   @Override
   public void edgeRemoved(GraphEdgeChangeEvent<V, E> var1) {
      this.removeEdge((E)var1.getEdge());
   }

   private void removeEdge(E var1) {
      mxICell var2 = this.edgeToCellMap.remove(var1);
      this.removeCells(new Object[]{var2});
      this.cellToEdgeMap.remove(var2);
      this.edgeToCellMap.remove(var1);
   }

   private void addJGraphTVertex(V var1) {
      this.getModel().beginUpdate();

      try {
         mxICell var2 = (mxICell)this.insertVertex(this.defaultParent, null, var1, 0.0, 0.0, 0.0, 0.0);
         this.updateCellSize(var2);
         this.vertexToCellMap.put((V)var1, var2);
         this.cellToVertexMap.put(var2, (V)var1);
      } finally {
         this.getModel().endUpdate();
      }
   }

   private void addJGraphTEdge(E var1) {
      this.getModel().beginUpdate();

      try {
         Object var2 = this.graphT.getEdgeSource((E)var1);
         Object var3 = this.graphT.getEdgeTarget((E)var1);
         if (this.vertexToCellMap.containsKey(var2) && this.vertexToCellMap.containsKey(var3)) {
            Object var4 = this.vertexToCellMap.get(var2);
            Object var5 = this.vertexToCellMap.get(var3);
            mxICell var6 = (mxICell)this.insertEdge(this.defaultParent, null, var1, var4, var5);
            this.updateCellSize(var6);
            this.edgeToCellMap.put((E)var1, var6);
            this.cellToEdgeMap.put(var6, (E)var1);
            return;
         }
      } finally {
         this.getModel().endUpdate();
      }
   }

   private void insertJGraphT(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         this.addJGraphTVertex((V)var3);
      }

      for (Object var5 : var1.edgeSet()) {
         this.addJGraphTEdge((E)var5);
      }
   }
}
