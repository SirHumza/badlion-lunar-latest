package org.jgrapht.alg.matching.blossom.v5;

import java.util.List;
import org.jgrapht.Graph;

class BlossomVState<V, E> {
   final int nodeNum;
   final int edgeNum;
   Graph<V, E> graph;
   BlossomVNode[] nodes;
   BlossomVEdge[] edges;
   int treeNum;
   int removedNum;
   int blossomNum;
   KolmogorovWeightedPerfectMatching.Statistics statistics;
   BlossomVOptions options;
   List<V> graphVertices;
   List<E> graphEdges;
   double minEdgeWeight;

   public BlossomVState(
      Graph<V, E> var1, BlossomVNode[] var2, BlossomVEdge[] var3, int var4, int var5, int var6, List<V> var7, List<E> var8, BlossomVOptions var9, double var10
   ) {
      this.graph = var1;
      this.nodes = var2;
      this.edges = var3;
      this.nodeNum = var4;
      this.edgeNum = var5;
      this.treeNum = var6;
      this.graphVertices = var7;
      this.graphEdges = var8;
      this.options = var9;
      this.statistics = new KolmogorovWeightedPerfectMatching.Statistics();
      this.minEdgeWeight = var10;
   }
}
