package com.lunarclient.dfu.datafixers;

import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.util.Either;
import javax.annotation.Nullable;

public interface OpticFinder<FT> {
   Type<FT> type();

   <A, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findType(Type<A> var1, Type<FR> var2, boolean var3);

   default <A> Either<TypedOptic<A, ?, FT, FT>, Type.FieldNotFoundException> findType(Type<A> var1, boolean var2) {
      return this.findType(var1, this.type(), var2);
   }

   default <GT> OpticFinder<FT> inField(@Nullable final String var1, final Type<GT> var2) {
      final OpticFinder var3 = this;
      return new OpticFinder<FT>() {
         @Override
         public Type<FT> type() {
            return var3.type();
         }

         @Override
         public <A, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findType(Type<A> var1x, Type<FR> var2x, boolean var3x) {
            Either var4 = var3.findType(var2, var2x, var3x);
            return var4.map(var3xxx -> this.cap(var1x, var3xxx, var3x), Either::right);
         }

         private <A, FR, GR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> cap(Type<A> var1x, TypedOptic<GT, GR, FT, FR> var2x, boolean var3x) {
            Either var4 = DSL.fieldFinder(var1, var2).findType(var1x, var2x.tType(), var3x);
            return var4.mapLeft(var1xxx -> var1xxx.compose(var2x));
         }
      };
   }
}
