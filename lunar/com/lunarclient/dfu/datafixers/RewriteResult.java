package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.RecursivePoint;
import java.util.BitSet;
import java.util.Objects;

public record RewriteResult<A, B>() {
   private final View<A, B> view;
   private final BitSet recData;

   public RewriteResult(View<A, B> var1, BitSet var2) {
      this.view = var1;
      this.recData = var2;
   }

   public static <A, B> RewriteResult<A, B> create(View<A, B> var0, BitSet var1) {
      return new RewriteResult<>(var0, var1);
   }

   public static <A> RewriteResult<A, A> nop(Type<A> var0) {
      return new RewriteResult<>(View.nopView(var0), new BitSet());
   }

   public <C> RewriteResult<C, B> compose(RewriteResult<C, A> var1) {
      BitSet var2;
      if (this.view.type() instanceof RecursivePoint.RecursivePointType && var1.view.type() instanceof RecursivePoint.RecursivePointType) {
         var2 = (BitSet)this.recData.clone();
         var2.or(var1.recData);
      } else {
         var2 = this.recData;
      }

      return (RewriteResult<C, B>)create(this.view.compose((View<A, A>)var1.view), var2);
   }

   @Override
   public String toString() {
      return "RR[" + this.view + "]";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         RewriteResult var2 = (RewriteResult)var1;
         return Objects.equals(this.view, var2.view);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.view.hashCode();
   }
}
