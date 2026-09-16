package org.spongepowered.asm.mixin.injection.struct;

import org.objectweb.asm.Type;

public class ArgOffsets implements IChainedDecoration<ArgOffsets> {
   public static ArgOffsets DEFAULT = new ArgOffsets.Default();
   public static final String KEY = "argOffsets";
   private final int offset;
   private final int length;
   private ArgOffsets next;

   public ArgOffsets(int var1, int var2) {
      this.offset = var1;
      this.length = var2;
   }

   @Override
   public String toString() {
      return String.format("ArgOffsets[start=%d(%d),length=%d]", this.offset, this.getStartIndex(), this.length);
   }

   public void replace(ArgOffsets var1) {
      this.next = var1;
   }

   public int getLength() {
      return this.length;
   }

   public boolean isEmpty() {
      return this.length == 0;
   }

   public int getStartIndex() {
      return this.getArgIndex(0);
   }

   public int getEndIndex() {
      return this.isEmpty() ? this.getStartIndex() : this.getArgIndex(this.length - 1);
   }

   public int getArgIndex(int var1) {
      return this.getArgIndex(var1, false);
   }

   public int getArgIndex(int var1, boolean var2) {
      if (var2 && var1 > this.length) {
         throw new IndexOutOfBoundsException("The specified arg index " + var1 + " is greater than the window size " + this.length);
      }

      int var3 = var1 + this.offset;
      return this.next != null ? this.next.getArgIndex(var3) : var3;
   }

   public Type[] apply(Type[] var1) {
      Type[] var2 = new Type[this.length];

      for (int var3 = 0; var3 < this.length; var3++) {
         int var4 = this.getArgIndex(var3);
         if (var4 < var1.length) {
            var2[var3] = var1[var4];
         }
      }

      return var2;
   }

   private static class Default extends ArgOffsets {
      public Default() {
         super(0, 255);
      }

      @Override
      public int getArgIndex(int var1) {
         return var1;
      }

      @Override
      public Type[] apply(Type[] var1) {
         return var1;
      }
   }
}
