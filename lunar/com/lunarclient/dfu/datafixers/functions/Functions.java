package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.Algebra;
import com.lunarclient.dfu.datafixers.types.templates.RecursivePoint;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.function.Function;

public abstract class Functions {
   public static <A, B, C> PointFree<Function<A, C>> comp(PointFree<Function<B, C>> var0, PointFree<Function<A, B>> var1) {
      if (isId(var0)) {
         return var1;
      } else if (isId(var1)) {
         return var0;
      } else if (var0 instanceof Comp var2 && var1 instanceof Comp var3) {
         PointFree[] var8 = new PointFree[var2.functions.length + var3.functions.length];
         System.arraycopy(var2.functions, 0, var8, 0, var2.functions.length);
         System.arraycopy(var3.functions, 0, var8, var2.functions.length, var3.functions.length);
         return new Comp<>(var8);
      } else if (var0 instanceof Comp var4) {
         PointFree[] var7 = new PointFree[var4.functions.length + 1];
         System.arraycopy(var4.functions, 0, var7, 0, var4.functions.length);
         var7[var7.length - 1] = var1;
         return new Comp<>(var7);
      } else if (var1 instanceof Comp var5) {
         PointFree[] var6 = new PointFree[1 + var5.functions.length];
         var6[0] = var0;
         System.arraycopy(var5.functions, 0, var6, 1, var5.functions.length);
         return new Comp<>(var6);
      } else {
         return new Comp<>(var0, var1);
      }
   }

   public static <A, B> PointFree<Function<A, B>> fun(String var0, Function<DynamicOps<?>, Function<A, B>> var1, Type<A> var2, Type<B> var3) {
      return new FunctionWrapper<>(var0, var1, var2, var3);
   }

   public static <A, B> PointFree<B> app(PointFree<Function<A, B>> var0, PointFree<A> var1) {
      return new Apply<>(var0, var1);
   }

   public static <S, T, A, B> PointFree<Function<Function<A, B>, Function<S, T>>> profunctorTransformer(TypedOptic<S, T, A, B> var0) {
      return new ProfunctorTransformer<>(var0);
   }

   public static <A> Bang<A> bang(Type<A> var0) {
      return new Bang<>(var0);
   }

   public static <A> PointFree<Function<A, A>> in(RecursivePoint.RecursivePointType<A> var0) {
      return new In<>(var0);
   }

   public static <A> PointFree<Function<A, A>> out(RecursivePoint.RecursivePointType<A> var0) {
      return new Out<>(var0);
   }

   public static <A, B> PointFree<Function<A, B>> fold(
      RecursivePoint.RecursivePointType<A> var0, RecursivePoint.RecursivePointType<B> var1, Algebra var2, int var3
   ) {
      return new Fold<>(var0, var1, var2, var3);
   }

   public static <A> PointFree<Function<A, A>> id(Type<A> var0) {
      return new Id<>(DSL.func(var0, var0));
   }

   public static boolean isId(PointFree<?> var0) {
      return var0 instanceof Id;
   }
}
