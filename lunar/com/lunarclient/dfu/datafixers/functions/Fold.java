package com.lunarclient.dfu.datafixers.functions;

import com.google.common.collect.Maps;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.View;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.Algebra;
import com.lunarclient.dfu.datafixers.types.families.ListAlgebra;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.templates.RecursivePoint;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;

final class Fold<A, B> extends PointFree<Function<A, B>> {
   private static final Map<Fold.HmapCacheKey, IntFunction<RewriteResult<?, ?>>> HMAP_CACHE = Maps.newConcurrentMap();
   private static final Map<Pair<IntFunction<RewriteResult<?, ?>>, Integer>, RewriteResult<?, ?>> HMAP_APPLY_CACHE = Maps.newConcurrentMap();
   protected final RecursivePoint.RecursivePointType<A> aType;
   protected final RecursivePoint.RecursivePointType<B> bType;
   protected final Algebra algebra;
   protected final int index;

   public Fold(RecursivePoint.RecursivePointType<A> var1, RecursivePoint.RecursivePointType<B> var2, Algebra var3, int var4) {
      this.aType = var1;
      this.bType = var2;
      this.algebra = var3;
      this.index = var4;
   }

   @Override
   public Type<Function<A, B>> type() {
      return DSL.func(this.aType, this.bType);
   }

   @Override
   Optional<? extends PointFree<Function<A, B>>> all(PointFreeRule var1) {
      int var2 = this.aType.family().size();
      ArrayList var3 = new ArrayList(var2);
      boolean var4 = false;

      for (int var5 = 0; var5 < var2; var5++) {
         RewriteResult var6 = this.algebra.apply(var5);
         PointFree var7 = var6.view().function();
         PointFree var8 = var1.rewriteOrNop(var7);
         if (var8 != var7) {
            var3.add(cap(var6, var8));
            var4 = true;
         } else {
            var3.add(var6);
         }
      }

      return var4 ? Optional.of(new Fold<>(this.aType, this.bType, new ListAlgebra("Rewrite all", var3), this.index)) : Optional.empty();
   }

   private static <A, B> RewriteResult<A, B> cap(RewriteResult<A, B> var0, PointFree<? extends Function<?, ?>> var1) {
      return RewriteResult.create(new View<>(var1), var0.recData());
   }

   private <FB> PointFree<Function<A, B>> cap(RewriteResult<?, FB> var1) {
      RewriteResult var2 = this.algebra.apply(this.index);
      return Functions.comp(var2.view().function(), var1.view().function());
   }

   @Override
   public Function<DynamicOps<?>, Function<A, B>> eval() {
      return var1 -> var2 -> {
         RecursiveTypeFamily var3 = this.aType.family();
         RecursiveTypeFamily var4 = this.bType.family();
         IntFunction var5 = HMAP_CACHE.computeIfAbsent(
            new Fold.HmapCacheKey(var3, var4, this.algebra),
            var0 -> var0.family().template().hmap(var0.family(), var0.family().fold(var0.algebra(), var0.newFamily()))
         );
         RewriteResult var6 = HMAP_APPLY_CACHE.computeIfAbsent(Pair.of(var5, this.index), var0 -> var0.getFirst().apply(var0.getSecond()));
         PointFree var7 = this.cap(var6);
         return (B)((Function)var7.evalCached().apply(var1)).apply(var2);
      };
   }

   @Override
   public String toString(int var1) {
      return "fold(" + this.aType + ", " + this.index + ", \n" + indent(var1 + 1) + this.algebra.toString(var1 + 1) + "\n" + indent(var1) + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Fold var2 = (Fold)var1;
         return Objects.equals(this.aType, var2.aType) && Objects.equals(this.bType, var2.bType) && Objects.equals(this.algebra, var2.algebra);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.aType.hashCode();
      var1 = 31 * var1 + this.bType.hashCode();
      return 31 * var1 + this.algebra.hashCode();
   }

   private record HmapCacheKey() {
      private final RecursiveTypeFamily family;
      private final RecursiveTypeFamily newFamily;
      private final Algebra algebra;

      private HmapCacheKey(RecursiveTypeFamily var1, RecursiveTypeFamily var2, Algebra var3) {
         this.family = var1;
         this.newFamily = var2;
         this.algebra = var3;
      }
   }
}
