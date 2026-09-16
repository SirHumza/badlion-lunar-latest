package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.types.Func;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

final class Comp<A, B> extends PointFree<Function<A, B>> {
   protected final PointFree<? extends Function<?, ?>>[] functions;
   private final Type<Function<A, B>> type;

   protected Comp(PointFree<? extends Function<?, ?>>... var1) {
      this.functions = var1;
      PointFree var2 = var1[0];
      PointFree var3 = var1[var1.length - 1];
      this.type = DSL.func(((Func)var3.type()).first(), ((Func)var2.type()).second());
   }

   protected Comp(PointFree<? extends Function<?, ?>>[] var1, Type<Function<A, B>> var2) {
      this.functions = var1;
      this.type = var2;
   }

   @Override
   public Type<Function<A, B>> type() {
      return this.type;
   }

   @Override
   public String toString(int var1) {
      String var2 = Arrays.stream(this.functions)
         .map(var1x -> var1x.toString(var1 + 1))
         .collect(Collectors.joining("\n" + indent(var1 + 1) + "◦\n" + indent(var1 + 1)));
      return "(\n" + indent(var1 + 1) + var2 + "\n" + indent(var1) + ")";
   }

   @Override
   public Optional<? extends PointFree<Function<A, B>>> all(PointFreeRule var1) {
      ArrayList var2 = new ArrayList(this.functions.length);
      boolean var3 = false;

      for (PointFree var7 : this.functions) {
         PointFree var8 = var1.rewriteOrNop(var7);
         if (var8 != var7) {
            var3 = true;
            if (var8 instanceof Comp var9) {
               Collections.addAll(var2, var9.functions);
            } else {
               var2.add(var8);
            }
         } else {
            var2.add(var7);
         }
      }

      return Optional.of(var3 ? new Comp<>(var2.toArray(PointFree[]::new), this.type) : this);
   }

   @Override
   public Optional<? extends PointFree<Function<A, B>>> one(PointFreeRule var1) {
      for (int var2 = 0; var2 < this.functions.length; var2++) {
         PointFree var3 = this.functions[var2];
         Optional var4 = var1.rewrite(var3);
         if (var4.isPresent()) {
            if (var4.get() instanceof Comp var5) {
               PointFree[] var8 = new PointFree[this.functions.length - 1 + var5.functions.length];
               System.arraycopy(this.functions, 0, var8, 0, var2);
               System.arraycopy(var5.functions, 0, var8, var2, var5.functions.length);
               System.arraycopy(this.functions, var2 + 1, var8, var2 + var5.functions.length, this.functions.length - var2 - 1);
               return Optional.of(new Comp<>(var8, this.type));
            }

            PointFree[] var7 = Arrays.copyOf(this.functions, this.functions.length);
            var7[var2] = (PointFree)var4.get();
            return Optional.of(new Comp<>(var7, this.type));
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Comp var2 = (Comp)var1;
         return Arrays.equals(this.functions, var2.functions);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.functions);
   }

   @Override
   public Function<DynamicOps<?>, Function<A, B>> eval() {
      return var1 -> var2 -> {
         Object var3 = var2;

         for (int var4 = this.functions.length - 1; var4 >= 0; var4--) {
            PointFree var5 = this.functions[var4];
            var3 = applyUnchecked((Function<A, B>)var5.evalCached().apply(var1), var3);
         }

         return (B)var3;
      };
   }

   private static <A, B> B applyUnchecked(Function<A, B> var0, Object var1) {
      return (B)var0.apply(var1);
   }
}
