package org.jgrapht.alg.color;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;
import org.jgrapht.util.CollectionUtil;

public class BrownBacktrackColoring<V, E> implements VertexColoringAlgorithm<V> {
   private final List<V> vertexList;
   private final int[][] neighbors;
   private final Map<V, Integer> indexMap;
   private int[] partialColorAssignment;
   private int[] colorCount;
   private BitSet[] allowedColors;
   private int chi;
   private int[] completeColorAssignment;
   private VertexColoringAlgorithm.Coloring<V> vertexColoring;

   public BrownBacktrackColoring(Graph<V, E> var1) {
      Objects.requireNonNull(var1, "Graph cannot be null");
      int var2 = var1.vertexSet().size();
      this.vertexList = new ArrayList(var2);
      this.neighbors = new int[var2][];
      this.indexMap = CollectionUtil.newHashMapWithExpectedSize(var2);

      for (Object var4 : var1.vertexSet()) {
         this.neighbors[this.vertexList.size()] = new int[var1.edgesOf(var4).size()];
         this.indexMap.put((V)var4, this.vertexList.size());
         this.vertexList.add((V)var4);
      }

      for (int var8 = 0; var8 < var2; var8++) {
         int var9 = 0;
         Object var5 = this.vertexList.get(var8);

         for (Object var7 : var1.edgesOf(var5)) {
            this.neighbors[var8][var9++] = this.indexMap.get(Graphs.getOppositeVertex(var1, var7, var5));
         }
      }
   }

   private void recursiveColor(int var1) {
      this.colorCount[var1] = this.colorCount[var1 - 1];
      this.allowedColors[var1].set(0, this.colorCount[var1] + 1);

      for (int var2 = 0; var2 < this.neighbors[var1].length; var2++) {
         int var3 = this.neighbors[var1][var2];
         if (this.partialColorAssignment[var3] > 0) {
            this.allowedColors[var1].clear(this.partialColorAssignment[var3]);
         }
      }

      for (int var4 = 1; var4 <= this.colorCount[var1] && this.colorCount[var1] < this.chi; var4++) {
         if (this.allowedColors[var1].get(var4)) {
            this.partialColorAssignment[var1] = var4;
            if (var1 < this.neighbors.length - 1) {
               this.recursiveColor(var1 + 1);
            } else {
               this.chi = this.colorCount[var1];
               System.arraycopy(this.partialColorAssignment, 0, this.completeColorAssignment, 0, this.partialColorAssignment.length);
            }
         }
      }

      if (this.colorCount[var1] + 1 < this.chi) {
         this.colorCount[var1]++;
         this.partialColorAssignment[var1] = this.colorCount[var1];
         if (var1 < this.neighbors.length - 1) {
            this.recursiveColor(var1 + 1);
         } else {
            this.chi = this.colorCount[var1];
            System.arraycopy(this.partialColorAssignment, 0, this.completeColorAssignment, 0, this.partialColorAssignment.length);
         }
      }

      this.partialColorAssignment[var1] = 0;
   }

   private void lazyComputeColoring() {
      if (this.vertexColoring == null) {
         this.chi = this.neighbors.length + 1;
         this.partialColorAssignment = new int[this.neighbors.length];
         this.completeColorAssignment = new int[this.neighbors.length];
         this.partialColorAssignment[0] = 1;
         this.colorCount = new int[this.neighbors.length];
         this.colorCount[0] = 1;
         this.allowedColors = new BitSet[this.neighbors.length];

         for (int var1 = 0; var1 < this.neighbors.length; var1++) {
            this.allowedColors[var1] = new BitSet(1);
         }

         this.recursiveColor(1);
         LinkedHashMap var3 = new LinkedHashMap();

         for (int var2 = 0; var2 < this.vertexList.size(); var2++) {
            var3.put(this.vertexList.get(var2), this.completeColorAssignment[var2]);
         }

         this.vertexColoring = new VertexColoringAlgorithm.ColoringImpl<>(var3, this.chi);
      }
   }

   public int getChromaticNumber() {
      this.lazyComputeColoring();
      return this.vertexColoring.getNumberColors();
   }

   @Override
   public VertexColoringAlgorithm.Coloring<V> getColoring() {
      this.lazyComputeColoring();
      return this.vertexColoring;
   }
}
