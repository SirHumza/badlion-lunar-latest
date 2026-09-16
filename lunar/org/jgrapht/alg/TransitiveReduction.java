package org.jgrapht.alg;

import java.util.ArrayList;
import java.util.BitSet;
import org.jgrapht.Graph;
import org.jgrapht.GraphTests;

public class TransitiveReduction {
   public static final TransitiveReduction INSTANCE = new TransitiveReduction();

   private TransitiveReduction() {
   }

   static void transformToPathMatrix(BitSet[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var1 != var2 && var0[var2].get(var1)) {
               for (int var3 = 0; var3 < var0.length; var3++) {
                  if (!var0[var2].get(var3)) {
                     var0[var2].set(var3, var0[var1].get(var3));
                  }
               }
            }
         }
      }
   }

   static void transitiveReduction(BitSet[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2].get(var1)) {
               for (int var3 = 0; var3 < var0.length; var3++) {
                  if (var0[var1].get(var3)) {
                     var0[var2].set(var3, false);
                  }
               }
            }
         }
      }
   }

   public <V, E> void reduce(Graph<V, E> var1) {
      GraphTests.requireDirected(var1, "Graph must be directed");
      ArrayList var2 = new ArrayList<>(var1.vertexSet());
      int var3 = var2.size();
      BitSet[] var4 = new BitSet[var3];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = new BitSet(var3);
      }

      for (Object var6 : var1.edgeSet()) {
         Object var7 = var1.getEdgeSource(var6);
         Object var8 = var1.getEdgeTarget(var6);
         int var9 = var2.indexOf(var7);
         int var10 = var2.indexOf(var8);
         var4[var9].set(var10);
      }

      BitSet[] var12 = var4;
      transformToPathMatrix(var12);
      BitSet[] var13 = var12;
      transitiveReduction(var13);

      for (int var14 = 0; var14 < var3; var14++) {
         for (int var15 = 0; var15 < var3; var15++) {
            if (!var13[var14].get(var15)) {
               var1.removeEdge(var1.getEdge(var2.get(var14), var2.get(var15)));
            }
         }
      }
   }
}
