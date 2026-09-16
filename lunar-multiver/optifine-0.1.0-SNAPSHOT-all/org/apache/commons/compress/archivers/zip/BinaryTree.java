package org.apache.commons.compress.archivers.zip;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

class BinaryTree {
   private static final int UNDEFINED = -1;
   private static final int NODE = -2;
   private final int[] tree;

   public BinaryTree(int var1) {
      this.tree = new int[(1 << var1 + 1) - 1];
      Arrays.fill(this.tree, -1);
   }

   public void addLeaf(int var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         if (this.tree[var1] != -1) {
            throw new IllegalArgumentException("Tree value at index " + var1 + " has already been assigned (" + this.tree[var1] + ")");
         }

         this.tree[var1] = var4;
      } else {
         this.tree[var1] = -2;
         int var5 = 2 * var1 + 1 + (var2 & 1);
         this.addLeaf(var5, var2 >>> 1, var3 - 1, var4);
      }
   }

   public int read(BitStream var1) {
      int var2 = 0;

      while (true) {
         int var3 = var1.nextBit();
         if (var3 == -1) {
            return -1;
         }

         int var4 = 2 * var2 + 1 + var3;
         int var5 = this.tree[var4];
         if (var5 != -2) {
            if (var5 != -1) {
               return var5;
            }

            throw new IOException("The child " + var3 + " of node at index " + var2 + " is not defined");
         }

         var2 = var4;
      }
   }

   static BinaryTree decode(InputStream var0, int var1) {
      int var2 = var0.read() + 1;
      if (var2 == 0) {
         throw new IOException("Cannot read the size of the encoded tree, unexpected end of stream");
      }

      byte[] var3 = new byte[var2];
      new DataInputStream(var0).readFully(var3);
      int var4 = 0;
      int[] var5 = new int[var1];
      int var6 = 0;

      for (byte var10 : var3) {
         int var11 = ((var10 & 240) >> 4) + 1;
         int var12 = (var10 & 15) + 1;

         for (int var13 = 0; var13 < var11; var13++) {
            var5[var6++] = var12;
         }

         var4 = Math.max(var4, var12);
      }

      int[] var17 = new int[var5.length];
      int var18 = 0;

      while (var18 < var17.length) {
         var17[var18] = var18++;
      }

      var18 = 0;
      int[] var20 = new int[var5.length];

      for (int var21 = 0; var21 < var5.length; var21++) {
         for (int var23 = 0; var23 < var5.length; var23++) {
            if (var5[var23] == var21) {
               var20[var18] = var21;
               var17[var18] = var23;
               var18++;
            }
         }
      }

      int var22 = 0;
      int var24 = 0;
      int var25 = 0;
      int[] var26 = new int[var1];

      for (int var14 = var1 - 1; var14 >= 0; var14--) {
         var22 += var24;
         if (var20[var14] != var25) {
            var25 = var20[var14];
            var24 = 1 << 16 - var25;
         }

         var26[var17[var14]] = var22;
      }

      BinaryTree var27 = new BinaryTree(var4);

      for (int var15 = 0; var15 < var26.length; var15++) {
         int var16 = var5[var15];
         if (var16 > 0) {
            var27.addLeaf(0, Integer.reverse(var26[var15] << 16), var16, var15);
         }
      }

      return var27;
   }
}
