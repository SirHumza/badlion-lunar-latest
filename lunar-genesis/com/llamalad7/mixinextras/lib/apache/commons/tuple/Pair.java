package com.llamalad7.mixinextras.lib.apache.commons.tuple;

import com.llamalad7.mixinextras.lib.apache.commons.ObjectUtils;
import com.llamalad7.mixinextras.lib.apache.commons.builder.CompareToBuilder;
import java.io.Serializable;
import java.util.Map.Entry;

public abstract class Pair<L, R> implements Serializable, Comparable<Pair<L, R>>, Entry<L, R> {
   public static <L, R> Pair<L, R> of(L var0, R var1) {
      return new ImmutablePair<>((L)var0, (R)var1);
   }

   public abstract L getLeft();

   public abstract R getRight();

   @Override
   public final L getKey() {
      return this.getLeft();
   }

   @Override
   public R getValue() {
      return this.getRight();
   }

   public int compareTo(Pair<L, R> var1) {
      return new CompareToBuilder().append(this.getLeft(), var1.getLeft()).append(this.getRight(), var1.getRight()).toComparison();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Entry)) {
         return false;
      }

      Entry var2 = (Entry)var1;
      return ObjectUtils.equals(this.getKey(), var2.getKey()) && ObjectUtils.equals(this.getValue(), var2.getValue());
   }

   @Override
   public int hashCode() {
      return (this.getKey() == null ? 0 : this.getKey().hashCode()) ^ (this.getValue() == null ? 0 : this.getValue().hashCode());
   }

   @Override
   public String toString() {
      return "" + '(' + this.getLeft() + ',' + this.getRight() + ')';
   }
}
