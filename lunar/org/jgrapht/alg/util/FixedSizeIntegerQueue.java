package org.jgrapht.alg.util;

public final class FixedSizeIntegerQueue {
   private final int[] vs;
   private int i = 0;
   private int n = 0;

   public FixedSizeIntegerQueue(int var1) {
      assert var1 > 0;
      this.vs = new int[var1];
   }

   public void enqueue(int var1) {
      assert this.n < this.vs.length;
      this.vs[this.n++] = var1;
   }

   public int poll() {
      assert !this.isEmpty();
      return this.vs[this.i++];
   }

   public boolean isEmpty() {
      return this.i == this.n;
   }

   public int size() {
      return this.n - this.i;
   }

   public void clear() {
      this.i = 0;
      this.n = 0;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = this.i; var2 < this.n; var2++) {
         var1.append(this.vs[var2]).append(" ");
      }

      return var1.toString();
   }
}
