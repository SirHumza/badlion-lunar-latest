package com.llamalad7.mixinextras.lib.antlr.runtime.misc;

public class Interval {
   public static final Interval INVALID = new Interval(-1, -2);
   static final Interval[] cache = new Interval[1001];
   public int a;
   public int b;

   public Interval(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public static Interval of(int var0, int var1) {
      if (var0 == var1 && var0 >= 0 && var0 <= 1000) {
         if (cache[var0] == null) {
            cache[var0] = new Interval(var0, var0);
         }

         return cache[var0];
      } else {
         return new Interval(var0, var1);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof Interval) {
         Interval var2 = (Interval)var1;
         return this.a == var2.a && this.b == var2.b;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = 23;
      var1 = var1 * 31 + this.a;
      return var1 * 31 + this.b;
   }

   public boolean startsBeforeDisjoint(Interval var1) {
      return this.a < var1.a && this.b < var1.a;
   }

   public boolean startsAfterDisjoint(Interval var1) {
      return this.a > var1.b;
   }

   public boolean disjoint(Interval var1) {
      return this.startsBeforeDisjoint(var1) || this.startsAfterDisjoint(var1);
   }

   public boolean adjacent(Interval var1) {
      return this.a == var1.b + 1 || this.b == var1.a - 1;
   }

   public Interval union(Interval var1) {
      return of(Math.min(this.a, var1.a), Math.max(this.b, var1.b));
   }

   @Override
   public String toString() {
      return this.a + ".." + this.b;
   }
}
