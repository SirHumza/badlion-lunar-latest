package org.jgrapht.alg.color;

import java.lang.reflect.Array;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;
import org.jgrapht.util.CollectionUtil;

public class SaturationDegreeColoring<V, E> implements VertexColoringAlgorithm<V> {
   private final Graph<V, E> graph;

   public SaturationDegreeColoring(Graph<V, E> var1) {
      this.graph = Objects.requireNonNull(var1, "Graph cannot be null");
   }

   @Override
   public VertexColoringAlgorithm.Coloring<V> getColoring() {
      int var1 = this.graph.vertexSet().size();
      int var2 = -1;
      HashMap var3 = CollectionUtil.newHashMapWithExpectedSize(var1);
      HashMap var4 = CollectionUtil.newHashMapWithExpectedSize(var1);
      HashMap var5 = CollectionUtil.newHashMapWithExpectedSize(var1);
      int var6 = 0;
      HashMap var7 = CollectionUtil.newHashMapWithExpectedSize(var1);

      for (Object var9 : this.graph.vertexSet()) {
         int var10 = this.graph.edgesOf((V)var9).size();
         var7.put(var9, var10);
         var6 = Math.max(var6, var10);
         var4.put(var9, new BitSet());
         var5.put(var9, 0);
      }

      SaturationDegreeColoring.Heap var19 = new SaturationDegreeColoring.Heap(var1, new SaturationDegreeColoring.DSaturComparator(var5, var7));
      HashMap var20 = new HashMap();

      for (Object var11 : this.graph.vertexSet()) {
         var20.put(var11, new SaturationDegreeColoring.HeapHandle(var11));
      }

      var19.bulkInsert(var20.values().toArray((SaturationDegreeColoring.HeapHandle[])Array.newInstance(SaturationDegreeColoring.HeapHandle.class, 0)));

      while (var19.size() > 0) {
         Object var22 = var19.deleteMin().vertex;
         BitSet var23 = (BitSet)var4.get(var22);
         int var12 = var23.nextClearBit(0);
         var2 = Math.max(var2, var12);
         var3.put(var22, var12);
         var4.remove(var22);

         for (Object var14 : this.graph.edgesOf((V)var22)) {
            Object var15 = Graphs.getOppositeVertex(this.graph, (E)var14, (V)var22);
            if (!var3.containsKey(var15)) {
               int var16 = (Integer)var5.get(var15);
               BitSet var17 = (BitSet)var4.get(var15);
               SaturationDegreeColoring.HeapHandle var18 = (SaturationDegreeColoring.HeapHandle)var20.get(var15);
               if (var17.get(var12)) {
                  var19.delete(var18);
                  var7.put(var15, (Integer)var7.get(var15) - 1);
                  var19.insert(var18);
               } else {
                  var17.set(var12);
                  var5.put(var15, var16 + 1);
                  var7.put(var15, (Integer)var7.get(var15) - 1);
                  var19.fixup(var18);
               }
            }
         }
      }

      return new VertexColoringAlgorithm.ColoringImpl<>(var3, var2 + 1);
   }

   private class DSaturComparator implements Comparator<V> {
      private Map<V, Integer> saturation;
      private Map<V, Integer> degree;

      public DSaturComparator(Map<V, Integer> var2, Map<V, Integer> var3) {
         this.saturation = var2;
         this.degree = var3;
      }

      @Override
      public int compare(V var1, V var2) {
         int var3 = this.saturation.get(var1);
         int var4 = this.saturation.get(var2);
         if (var3 > var4) {
            return -1;
         } else {
            return var3 < var4 ? 1 : -1 * Integer.compare(this.degree.get(var1), this.degree.get(var2));
         }
      }
   }

   private class Heap {
      private Comparator<V> comparator;
      private int size;
      private SaturationDegreeColoring<V, E>.HeapHandle[] array;

      public Heap(int var2, Comparator<V> var3) {
         this.comparator = var3;
         this.size = 0;
         this.array = (SaturationDegreeColoring.HeapHandle[])Array.newInstance(SaturationDegreeColoring.HeapHandle.class, var2 + 1);
      }

      private void fixdown(int var1) {
         SaturationDegreeColoring.HeapHandle var2 = this.array[var1];

         while (2 * var1 <= this.size) {
            int var3 = 2 * var1;
            if (var3 < this.size && this.comparator.compare(this.array[var3].vertex, this.array[var3 + 1].vertex) > 0) {
               var3++;
            }

            if (this.comparator.compare(var2.vertex, this.array[var3].vertex) <= 0) {
               break;
            }

            this.array[var1] = this.array[var3];
            this.array[var1].index = var1;
            var1 = var3;
         }

         this.array[var1] = var2;
         var2.index = var1;
      }

      private void fixup(int var1) {
         SaturationDegreeColoring.HeapHandle var2;
         for (var2 = this.array[var1]; var1 > 1 && this.comparator.compare(this.array[var1 / 2].vertex, var2.vertex) > 0; var1 /= 2) {
            this.array[var1] = this.array[var1 / 2];
            this.array[var1].index = var1;
         }

         this.array[var1] = var2;
         var2.index = var1;
      }

      private void forceFixup(int var1) {
         SaturationDegreeColoring.HeapHandle var2 = this.array[var1];

         while (var1 > 1) {
            this.array[var1] = this.array[var1 / 2];
            this.array[var1].index = var1;
            var1 /= 2;
         }

         this.array[var1] = var2;
         var2.index = var1;
      }

      public SaturationDegreeColoring<V, E>.HeapHandle deleteMin() {
         SaturationDegreeColoring.HeapHandle var1 = this.array[1];
         if (this.size == 1) {
            this.array[1] = null;
            this.size = 0;
         } else {
            this.array[1] = this.array[this.size];
            this.array[this.size] = null;
            this.size--;
            this.fixdown(1);
         }

         var1.index = -1;
         return var1;
      }

      public int size() {
         return this.size;
      }

      public void fixup(SaturationDegreeColoring<V, E>.HeapHandle var1) {
         this.fixup(var1.index);
      }

      public void delete(SaturationDegreeColoring<V, E>.HeapHandle var1) {
         this.forceFixup(var1.index);
         this.deleteMin();
      }

      public void insert(SaturationDegreeColoring<V, E>.HeapHandle var1) {
         this.size++;
         this.array[this.size] = var1;
         var1.index = this.size;
         this.fixup(this.size);
      }

      public void bulkInsert(SaturationDegreeColoring<V, E>.HeapHandle[] var1) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            this.size++;
            this.array[this.size] = var1[var2];
            var1[var2].index = this.size;
         }

         for (int var3 = this.size / 2; var3 > 0; var3--) {
            this.fixdown(var3);
         }
      }
   }

   private class HeapHandle {
      int index;
      V vertex;

      public HeapHandle(V var2) {
         this.vertex = (V)var2;
         this.index = -1;
      }
   }
}
