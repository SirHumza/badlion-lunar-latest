package org.jgrapht.alg.isomorphism;

import java.util.Arrays;
import java.util.Comparator;

abstract class VF2State<V, E> {
   public static final int NULL_NODE = -1;
   protected static final boolean DEBUG = false;
   protected final int[] core1;
   protected final int[] core2;
   protected final int[] in1;
   protected final int[] in2;
   protected final int[] out1;
   protected final int[] out2;
   protected final int n1;
   protected final int n2;
   protected int coreLen;
   protected int t1BothLen;
   protected int t2BothLen;
   protected int t1InLen;
   protected int t2InLen;
   protected int t1OutLen;
   protected int t2OutLen;
   protected int addedVertex1;
   protected int addVertex1;
   protected int addVertex2;
   protected final GraphOrdering<V, E> g1;
   protected final GraphOrdering<V, E> g2;
   protected final Comparator<V> vertexComparator;
   protected final Comparator<E> edgeComparator;

   public VF2State(GraphOrdering<V, E> var1, GraphOrdering<V, E> var2, Comparator<V> var3, Comparator<E> var4) {
      this.g1 = var1;
      this.g2 = var2;
      this.vertexComparator = var3;
      this.edgeComparator = var4;
      this.n1 = var1.getVertexCount();
      this.n2 = var2.getVertexCount();
      this.core1 = new int[this.n1];
      this.in1 = new int[this.n1];
      this.out1 = new int[this.n1];
      this.core2 = new int[this.n2];
      this.in2 = new int[this.n2];
      this.out2 = new int[this.n2];
      Arrays.fill(this.core1, -1);
      Arrays.fill(this.core2, -1);
      this.coreLen = 0;
      this.addedVertex1 = this.addVertex1 = this.addVertex2 = -1;
      this.t1BothLen = this.t2BothLen = this.t1InLen = this.t2InLen = this.t1OutLen = this.t2OutLen = 0;
   }

   public VF2State(VF2State<V, E> var1) {
      this.g1 = var1.g1;
      this.g2 = var1.g2;
      this.core1 = var1.core1;
      this.core2 = var1.core2;
      this.in1 = var1.in1;
      this.in2 = var1.in2;
      this.out1 = var1.out1;
      this.out2 = var1.out2;
      this.coreLen = var1.coreLen;
      this.n1 = var1.n1;
      this.n2 = var1.n2;
      this.t1BothLen = var1.t1BothLen;
      this.t2BothLen = var1.t2BothLen;
      this.t1InLen = var1.t1InLen;
      this.t2InLen = var1.t2InLen;
      this.t1OutLen = var1.t1OutLen;
      this.t2OutLen = var1.t2OutLen;
      this.vertexComparator = var1.vertexComparator;
      this.edgeComparator = var1.edgeComparator;
      this.addVertex1 = var1.addVertex1;
      this.addVertex2 = var1.addVertex2;
      this.addedVertex1 = var1.addedVertex1;
   }

   public boolean nextPair() {
      if (this.addVertex2 == -1) {
         this.addVertex2 = 0;
      }

      if (this.addVertex1 == -1) {
         this.addVertex1 = 0;
      } else {
         this.addVertex1++;
      }

      if (this.t1BothLen > this.coreLen && this.t2BothLen > this.coreLen) {
         while (this.addVertex2 < this.n2 && (this.core2[this.addVertex2] != -1 || this.out2[this.addVertex2] == 0 || this.in2[this.addVertex2] == 0)) {
            this.addVertex2++;
            this.addVertex1 = 0;
         }

         while (this.addVertex1 < this.n1 && (this.core1[this.addVertex1] != -1 || this.out1[this.addVertex1] == 0 || this.in1[this.addVertex1] == 0)) {
            this.addVertex1++;
         }
      } else if (this.t1OutLen > this.coreLen && this.t2OutLen > this.coreLen) {
         while (this.addVertex2 < this.n2 && (this.core2[this.addVertex2] != -1 || this.out2[this.addVertex2] == 0)) {
            this.addVertex2++;
            this.addVertex1 = 0;
         }

         while (this.addVertex1 < this.n1 && (this.core1[this.addVertex1] != -1 || this.out1[this.addVertex1] == 0)) {
            this.addVertex1++;
         }
      } else if (this.t1InLen > this.coreLen && this.t2InLen > this.coreLen) {
         while (this.addVertex2 < this.n2 && (this.core2[this.addVertex2] != -1 || this.in2[this.addVertex2] == 0)) {
            this.addVertex2++;
            this.addVertex1 = 0;
         }

         while (this.addVertex1 < this.n1 && (this.core1[this.addVertex1] != -1 || this.in1[this.addVertex1] == 0)) {
            this.addVertex1++;
         }
      } else {
         while (this.addVertex2 < this.n2 && this.core2[this.addVertex2] != -1) {
            this.addVertex2++;
            this.addVertex1 = 0;
         }

         while (this.addVertex1 < this.n1 && this.core1[this.addVertex1] != -1) {
            this.addVertex1++;
         }
      }

      if (this.addVertex1 < this.n1 && this.addVertex2 < this.n2) {
         return true;
      }

      this.addVertex1 = this.addVertex2 = -1;
      return false;
   }

   public void addPair() {
      this.coreLen++;
      this.addedVertex1 = this.addVertex1;
      if (this.in1[this.addVertex1] == 0) {
         this.in1[this.addVertex1] = this.coreLen;
         this.t1InLen++;
         if (this.out1[this.addVertex1] > 0) {
            this.t1BothLen++;
         }
      }

      if (this.out1[this.addVertex1] == 0) {
         this.out1[this.addVertex1] = this.coreLen;
         this.t1OutLen++;
         if (this.in1[this.addVertex1] > 0) {
            this.t1BothLen++;
         }
      }

      if (this.in2[this.addVertex2] == 0) {
         this.in2[this.addVertex2] = this.coreLen;
         this.t2InLen++;
         if (this.out2[this.addVertex2] > 0) {
            this.t2BothLen++;
         }
      }

      if (this.out2[this.addVertex2] == 0) {
         this.out2[this.addVertex2] = this.coreLen;
         this.t2OutLen++;
         if (this.in2[this.addVertex2] > 0) {
            this.t2BothLen++;
         }
      }

      this.core1[this.addVertex1] = this.addVertex2;
      this.core2[this.addVertex2] = this.addVertex1;

      for (int var4 : this.g1.getInEdges(this.addVertex1)) {
         if (this.in1[var4] == 0) {
            this.in1[var4] = this.coreLen;
            this.t1InLen++;
            if (this.out1[var4] > 0) {
               this.t1BothLen++;
            }
         }
      }

      for (int var14 : this.g1.getOutEdges(this.addVertex1)) {
         if (this.out1[var14] == 0) {
            this.out1[var14] = this.coreLen;
            this.t1OutLen++;
            if (this.in1[var14] > 0) {
               this.t1BothLen++;
            }
         }
      }

      for (int var15 : this.g2.getInEdges(this.addVertex2)) {
         if (this.in2[var15] == 0) {
            this.in2[var15] = this.coreLen;
            this.t2InLen++;
            if (this.out2[var15] > 0) {
               this.t2BothLen++;
            }
         }
      }

      for (int var16 : this.g2.getOutEdges(this.addVertex2)) {
         if (this.out2[var16] == 0) {
            this.out2[var16] = this.coreLen;
            this.t2OutLen++;
            if (this.in2[var16] > 0) {
               this.t2BothLen++;
            }
         }
      }
   }

   public boolean isGoal() {
      return this.coreLen == this.n2;
   }

   public abstract boolean isFeasiblePair();

   public void backtrack() {
      int var1 = this.core1[this.addedVertex1];
      if (this.in1[this.addedVertex1] == this.coreLen) {
         this.in1[this.addedVertex1] = 0;
      }

      for (int var5 : this.g1.getInEdges(this.addedVertex1)) {
         if (this.in1[var5] == this.coreLen) {
            this.in1[var5] = 0;
         }
      }

      if (this.out1[this.addedVertex1] == this.coreLen) {
         this.out1[this.addedVertex1] = 0;
      }

      for (int var15 : this.g1.getOutEdges(this.addedVertex1)) {
         if (this.out1[var15] == this.coreLen) {
            this.out1[var15] = 0;
         }
      }

      if (this.in2[var1] == this.coreLen) {
         this.in2[var1] = 0;
      }

      for (int var16 : this.g2.getInEdges(var1)) {
         if (this.in2[var16] == this.coreLen) {
            this.in2[var16] = 0;
         }
      }

      if (this.out2[var1] == this.coreLen) {
         this.out2[var1] = 0;
      }

      for (int var17 : this.g2.getOutEdges(var1)) {
         if (this.out2[var17] == this.coreLen) {
            this.out2[var17] = 0;
         }
      }

      this.core1[this.addedVertex1] = this.core2[var1] = -1;
      this.coreLen--;
      this.addedVertex1 = -1;
   }

   protected boolean areCompatibleVertexes(int var1, int var2) {
      return this.vertexComparator == null || this.vertexComparator.compare(this.g1.getVertex(var1), this.g2.getVertex(var2)) == 0;
   }

   protected boolean areCompatibleEdges(int var1, int var2, int var3, int var4) {
      return this.edgeComparator == null || this.edgeComparator.compare(this.g1.getEdge(var1, var2), this.g2.getEdge(var3, var4)) == 0;
   }

   public IsomorphicGraphMapping<V, E> getCurrentMapping() {
      return new IsomorphicGraphMapping<>(this.g1, this.g2, this.core1, this.core2);
   }

   public void resetAddVertexes() {
      this.addVertex1 = this.addVertex2 = -1;
   }

   protected void showLog(String var1, String var2) {
   }
}
