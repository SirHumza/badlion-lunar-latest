package org.jgrapht.alg.util;

import java.io.Serializable;
import java.util.Objects;

public class Triple<A, B, C> implements Serializable {
   private static final long serialVersionUID = -7076291895521537427L;
   protected A first;
   protected B second;
   protected C third;

   public Triple(A var1, B var2, C var3) {
      this.first = (A)var1;
      this.second = (B)var2;
      this.third = (C)var3;
   }

   public A getFirst() {
      return this.first;
   }

   public B getSecond() {
      return this.second;
   }

   public C getThird() {
      return this.third;
   }

   public void setFirst(A var1) {
      this.first = (A)var1;
   }

   public void setSecond(B var1) {
      this.second = (B)var1;
   }

   public void setThird(C var1) {
      this.third = (C)var1;
   }

   public <E> boolean hasElement(E var1) {
      return var1 == null
         ? this.first == null || this.second == null || this.third == null
         : var1.equals(this.first) || var1.equals(this.second) || var1.equals(this.third);
   }

   @Override
   public String toString() {
      return "(" + this.first + "," + this.second + "," + this.third + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Triple)) {
         return false;
      }

      Triple var2 = (Triple)var1;
      return Objects.equals(this.first, var2.first) && Objects.equals(this.second, var2.second) && Objects.equals(this.third, var2.third);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.first, this.second, this.third);
   }

   public static <A, B, C> Triple<A, B, C> of(A var0, B var1, C var2) {
      return new Triple<>((A)var0, (B)var1, (C)var2);
   }
}
