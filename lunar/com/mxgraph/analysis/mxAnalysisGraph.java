package com.mxgraph.analysis;

import com.mxgraph.costfunction.mxDoubleValCostFunction;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.view.mxGraph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class mxAnalysisGraph {
   protected Map<String, Object> properties = new HashMap<>();
   protected mxGraphGenerator generator;
   protected mxGraph graph;

   public Object[] getEdges(Object var1, Object var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (!mxGraphProperties.isTraverseVisible(this.properties, mxGraphProperties.DEFAULT_TRAVERSE_VISIBLE)) {
         return this.graph.getEdges(var1, var2, var3, var4, var5, var6);
      }

      Object[] var7 = this.graph.getEdges(var1, var2, var3, var4, var5, var6);
      ArrayList var8 = new ArrayList(var7.length);
      mxIGraphModel var9 = this.graph.getModel();

      for (int var10 = 0; var10 < var7.length; var10++) {
         Object var11 = var9.getTerminal(var7[var10], true);
         Object var12 = var9.getTerminal(var7[var10], false);
         if ((var5 && var11 == var12 || var11 != var12 && (var3 && var12 == var1 || var4 && var11 == var1)) && var9.isVisible(var7[var10])) {
            var8.add(var7[var10]);
         }
      }

      return var8.toArray();
   }

   public Object[] getEdges(Object var1, Object var2, boolean var3, boolean var4) {
      return mxGraphProperties.isDirected(this.properties, mxGraphProperties.DEFAULT_DIRECTED)
         ? this.getEdges(var1, var2, false, true, var3, var4)
         : this.getEdges(var1, var2, true, true, var3, var4);
   }

   public Object[] getChildVertices(Object var1) {
      return this.graph.getChildVertices(var1);
   }

   public Object[] getChildEdges(Object var1) {
      return this.graph.getChildEdges(var1);
   }

   public Object getTerminal(Object var1, boolean var2) {
      return this.graph.getModel().getTerminal(var1, var2);
   }

   public Object[] getChildCells(Object var1, boolean var2, boolean var3) {
      return this.graph.getChildCells(var1, var2, var3);
   }

   public Object[] getOpposites(Object[] var1, Object var2, boolean var3, boolean var4) {
      return this.graph.getOpposites(var1, var2, var3, var4);
   }

   public Object[] getOpposites(Object[] var1, Object var2) {
      return mxGraphProperties.isDirected(this.properties, mxGraphProperties.DEFAULT_DIRECTED)
         ? this.getOpposites(var1, var2, false, true)
         : this.getOpposites(var1, var2, true, true);
   }

   public Map<String, Object> getProperties() {
      return this.properties;
   }

   public void setProperties(Map<String, Object> var1) {
      this.properties = var1;
   }

   public mxGraph getGraph() {
      return this.graph;
   }

   public void setGraph(mxGraph var1) {
      this.graph = var1;
   }

   public mxGraphGenerator getGenerator() {
      return this.generator != null ? this.generator : new mxGraphGenerator(null, new mxDoubleValCostFunction());
   }

   public void setGenerator(mxGraphGenerator var1) {
      this.generator = var1;
   }
}
