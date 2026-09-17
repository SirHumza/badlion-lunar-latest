package com.lunarclient.dfu.datafixers.types.families;

import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.functions.PointFree;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class ListAlgebra implements Algebra {
   private final String name;
   private final List<RewriteResult<?, ?>> views;
   private int hashCode;

   public ListAlgebra(String var1, List<RewriteResult<?, ?>> var2) {
      this.name = var1;
      this.views = var2;
   }

   @Override
   public RewriteResult<?, ?> apply(int var1) {
      return this.views.get(var1);
   }

   @Override
   public String toString() {
      return this.toString(0);
   }

   @Override
   public String toString(int var1) {
      String var2 = "\n" + PointFree.indent(var1 + 1);
      return "Algebra["
         + this.name
         + var2
         + this.views.stream().map(var1x -> var1x.view().function().toString(var1 + 1)).collect(Collectors.joining(var2))
         + "\n"
         + PointFree.indent(var1)
         + "]";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof ListAlgebra var2) ? false : Objects.equals(this.views, var2.views);
      }
   }

   @Override
   public int hashCode() {
      if (this.hashCode == 0) {
         this.hashCode = this.views.hashCode();
      }

      return this.hashCode;
   }
}
