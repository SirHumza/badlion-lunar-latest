package org.jgrapht.alg.spanning;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.util.CollectionUtil;
import org.jgrapht.util.VertexToIntegerMapping;
import org.jheaps.AddressableHeap;
import org.jheaps.tree.FibonacciHeap;

public class PrimMinimumSpanningTree<V, E> implements SpanningTreeAlgorithm<E> {
   private final Graph<V, E> g;

   public PrimMinimumSpanningTree(Graph<V, E> var1) {
      this.g = Objects.requireNonNull(var1, "Graph cannot be null");
   }

   @Override
   public SpanningTreeAlgorithm.SpanningTree<E> getSpanningTree() {
      HashSet var1 = CollectionUtil.newHashSetWithExpectedSize(this.g.vertexSet().size());
      double var2 = 0.0;
      int var4 = this.g.vertexSet().size();
      VertexToIntegerMapping var5 = Graphs.getVertexToIntegerMapping(this.g);
      Map var6 = var5.getVertexMap();
      List var7 = var5.getIndexList();
      PrimMinimumSpanningTree.VertexInfo[] var8 = (PrimMinimumSpanningTree.VertexInfo[])Array.newInstance(PrimMinimumSpanningTree.VertexInfo.class, var4);
      AddressableHeap.Handle[] var9 = (AddressableHeap.Handle[])Array.newInstance(AddressableHeap.Handle.class, var4);
      FibonacciHeap var10 = new FibonacciHeap();

      for (int var11 = 0; var11 < var4; var11++) {
         var8[var11] = new PrimMinimumSpanningTree.VertexInfo();
         var8[var11].id = var11;
         var8[var11].distance = Double.MAX_VALUE;
         var9[var11] = var10.insert(var8[var11].distance, var8[var11]);
      }

      while (!var10.isEmpty()) {
         AddressableHeap.Handle var20 = var10.deleteMin();
         PrimMinimumSpanningTree.VertexInfo var12 = (PrimMinimumSpanningTree.VertexInfo)var20.getValue();
         Object var13 = var7.get(var12.id);
         var12.spanned = true;
         if (var12.edgeFromParent != null) {
            var1.add(var12.edgeFromParent);
            var2 += this.g.getEdgeWeight(var12.edgeFromParent);
         }

         for (Object var15 : this.g.edgesOf((V)var13)) {
            Object var16 = Graphs.getOppositeVertex(this.g, (E)var15, (V)var13);
            int var17 = (Integer)var6.get(var16);
            if (!var8[var17].spanned) {
               double var18 = this.g.getEdgeWeight((E)var15);
               if (var18 < var8[var17].distance) {
                  var8[var17].distance = var18;
                  var8[var17].edgeFromParent = (E)var15;
                  var9[var17].decreaseKey(var18);
               }
            }
         }
      }

      return new SpanningTreeAlgorithm.SpanningTreeImpl<>(var1, var2);
   }

   private class VertexInfo {
      public int id;
      public boolean spanned;
      public double distance;
      public E edgeFromParent;
   }
}
