package org.jgrapht.alg.util;

import java.io.Serializable;
import java.util.Objects;

public class Pair<A, B> implements Serializable {
   private static final long serialVersionUID = 8176288675989092842L;
   protected A first;
   protected B second;

   public Pair(A var1, B var2) {
      this.first = (A)var1;
      this.second = (B)var2;
   }

   public A getFirst() {
      return this.first;
   }

   public B getSecond() {
      return this.second;
   }

   public void setFirst(A var1) {
      this.first = (A)var1;
   }

   public void setSecond(B var1) {
      this.second = (B)var1;
   }

   public <E> boolean hasElement(E var1) {
      return var1 == null ? this.first == null || this.second == null : var1.equals(this.first) || var1.equals(this.second);
   }

   @Override
   public String toString() {
      return "(" + this.first + "," + this.second + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Pair)) {
         return false;
      }

      Pair var2 = (Pair)var1;
      return Objects.equals(this.first, var2.first) && Objects.equals(this.second, var2.second);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.first, this.second);
   }

   public static <A, B> Pair<A, B> of(A var0, B var1) {
      return new Pair<>((A)var0, (B)var1);
   }
}
