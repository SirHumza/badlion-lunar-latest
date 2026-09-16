package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

import java.io.Serializable;

public class Pair<A, B> implements Serializable {
   public final A a;
   public final B b;

   public Pair(A var1, B var2) {
      this.a = (A)var1;
      this.b = (B)var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Pair)) {
         return false;
      }

      Pair var2 = (Pair)var1;
      return ObjectEqualityComparator.INSTANCE.equals(this.a, var2.a) && ObjectEqualityComparator.INSTANCE.equals(this.b, var2.b);
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();
      var1 = MurmurHash.update(var1, this.a);
      var1 = MurmurHash.update(var1, this.b);
      return MurmurHash.finish(var1, 2);
   }

   @Override
   public String toString() {
      return String.format("(%s, %s)", this.a, this.b);
   }
}
