package org.jgrapht.alg.isomorphism;

import java.util.Comparator;

class VF2GraphIsomorphismState<V, E> extends VF2State<V, E> {
   public VF2GraphIsomorphismState(GraphOrdering<V, E> var1, GraphOrdering<V, E> var2, Comparator<V> var3, Comparator<E> var4) {
      super(var1, var2, var3, var4);
   }

   public VF2GraphIsomorphismState(VF2State<V, E> var1) {
      super(var1);
   }

   @Override
   public boolean isFeasiblePair() {
      Object var1 = null;
      Object var2 = null;
      if (!this.areCompatibleVertexes(this.addVertex1, this.addVertex2)) {
         return false;
      }

      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int[] var15 = this.g1.getOutEdges(this.addVertex1);

      for (int var16 = 0; var16 < var15.length; var16++) {
         int var17 = var15[var16];
         if (this.core1[var17] != -1) {
            int var18 = this.core1[var17];
            if (!this.g2.hasEdge(this.addVertex2, var18) || !this.areCompatibleEdges(this.addVertex1, var17, this.addVertex2, var18)) {
               return false;
            }
         } else {
            int var26 = this.in1[var17];
            int var19 = this.out1[var17];
            if (var26 == 0 && var19 == 0) {
               var13++;
            } else {
               if (var26 > 0) {
                  var11++;
               }

               if (var19 > 0) {
                  var9++;
               }
            }
         }
      }

      int[] var23 = this.g2.getOutEdges(this.addVertex2);

      for (int var24 = 0; var24 < var23.length; var24++) {
         int var27 = var23[var24];
         if (this.core2[var27] != -1) {
            int var30 = this.core2[var27];
            if (!this.g1.hasEdge(this.addVertex1, var30)) {
               return false;
            }
         } else {
            int var31 = this.in2[var27];
            int var20 = this.out2[var27];
            if (var31 == 0 && var20 == 0) {
               var14++;
            } else {
               if (var31 > 0) {
                  var12++;
               }

               if (var20 > 0) {
                  var10++;
               }
            }
         }
      }

      if (var11 == var12 && var9 == var10 && var13 == var14) {
         int[] var25 = this.g1.getInEdges(this.addVertex1);

         for (int var28 = 0; var28 < var25.length; var28++) {
            int var32 = var25[var28];
            if (this.core1[var32] != -1) {
               int var34 = this.core1[var32];
               if (!this.g2.hasEdge(var34, this.addVertex2) || !this.areCompatibleEdges(var32, this.addVertex1, var34, this.addVertex2)) {
                  return false;
               }
            } else {
               int var35 = this.in1[var32];
               int var21 = this.out1[var32];
               if (var35 == 0 && var21 == 0) {
                  var7++;
               } else {
                  if (var35 > 0) {
                     var5++;
                  }

                  if (var21 > 0) {
                     var3++;
                  }
               }
            }
         }

         int[] var29 = this.g2.getInEdges(this.addVertex2);

         for (int var33 = 0; var33 < var29.length; var33++) {
            int var36 = var29[var33];
            if (this.core2[var36] != -1) {
               int var37 = this.core2[var36];
               if (!this.g1.hasEdge(var37, this.addVertex1)) {
                  return false;
               }
            } else {
               int var38 = this.in2[var36];
               int var22 = this.out2[var36];
               if (var38 == 0 && var22 == 0) {
                  var8++;
               } else {
                  if (var38 > 0) {
                     var6++;
                  }

                  if (var22 > 0) {
                     var4++;
                  }
               }
            }
         }

         return var5 == var6 && var3 == var4 && var7 == var8;
      } else {
         return false;
      }
   }
}
