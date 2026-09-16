package org.jgrapht.alg.util;

import java.io.Serializable;
import java.util.Objects;

public class UnorderedPair<A, B> extends Pair<A, B> implements Serializable {
   private static final long serialVersionUID = -3110454174542533876L;

   public UnorderedPair(A var1, B var2) {
      super((A)var1, (B)var2);
   }

   @Override
   public String toString() {
      return "{" + this.first + "," + this.second + "}";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof UnorderedPair)) {
         return false;
      }

      UnorderedPair var2 = (UnorderedPair)var1;
      return Objects.equals(this.first, var2.first) && Objects.equals(this.second, var2.second)
         || Objects.equals(this.first, var2.second) && Objects.equals(this.second, var2.first);
   }

   @Override
   public int hashCode() {
      int var1 = this.first == null ? 0 : this.first.hashCode();
      int var2 = this.second == null ? 0 : this.second.hashCode();
      return var1 > var2 ? var1 * 31 + var2 : var2 * 31 + var1;
   }

   public static <A, B> UnorderedPair<A, B> of(A var0, B var1) {
      return new UnorderedPair<>((A)var0, (B)var1);
   }
}
