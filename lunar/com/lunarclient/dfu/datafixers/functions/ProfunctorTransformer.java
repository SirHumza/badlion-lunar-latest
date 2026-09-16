package com.lunarclient.dfu.datafixers.functions;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Objects;
import java.util.function.Function;

final class ProfunctorTransformer<S, T, A, B> extends PointFree<Function<Function<A, B>, Function<S, T>>> {
   protected final TypedOptic<S, T, A, B> optic;

   public ProfunctorTransformer(TypedOptic<S, T, A, B> var1) {
      this.optic = var1;
   }

   public <S2, T2> ProfunctorTransformer<S2, T2, A, B> castOuterUnchecked(Type<S2> var1, Type<T2> var2) {
      return new ProfunctorTransformer<>(this.optic.castOuterUnchecked(var1, var2));
   }

   @Override
   public Type<Function<Function<A, B>, Function<S, T>>> type() {
      return DSL.func(DSL.func(this.optic.aType(), this.optic.bType()), DSL.func(this.optic.sType(), this.optic.tType()));
   }

   @Override
   public String toString(int var1) {
      return "Optic[" + this.optic + "]";
   }

   @Override
   public Function<DynamicOps<?>, Function<Function<A, B>, Function<S, T>>> eval() {
      Function var1 = this.optic.<FunctionType.Instance.Mu>upCast(FunctionType.Instance.Mu.TYPE_TOKEN).orElseThrow().eval(FunctionType.Instance.INSTANCE);
      Function var2 = var1x -> FunctionType.unbox((App2<FunctionType.Mu, A, B>)var1.apply(FunctionType.create(var1x)));
      return var1x -> var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ProfunctorTransformer var2 = (ProfunctorTransformer)var1;
         return Objects.equals(this.optic, var2.optic);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.optic.hashCode();
   }
}
