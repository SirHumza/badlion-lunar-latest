package com.llamalad7.mixinextras.lib.apache.commons.tuple;

public final class ImmutablePair<L, R> extends Pair<L, R> {
   public final L left;
   public final R right;

   public ImmutablePair(L var1, R var2) {
      this.left = (L)var1;
      this.right = (R)var2;
   }

   @Override
   public L getLeft() {
      return this.left;
   }

   @Override
   public R getRight() {
      return this.right;
   }

   @Override
   public R setValue(R var1) {
      throw new UnsupportedOperationException();
   }
}
