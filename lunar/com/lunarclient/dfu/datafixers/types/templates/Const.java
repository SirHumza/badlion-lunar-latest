package com.lunarclient.dfu.datafixers.types.templates;

import com.google.common.collect.ImmutableSet;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.optics.profunctors.Profunctor;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.serialization.Codec;
import java.util.Objects;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public record Const() implements TypeTemplate {
   private final Type<?> type;

   public Const(Type<?> var1) {
      this.type = var1;
   }

   @Override
   public int size() {
      return 0;
   }

   @Override
   public TypeFamily apply(TypeFamily var1) {
      return new TypeFamily() {
         @Override
         public Type<?> apply(int var1) {
            return Const.this.type;
         }
      };
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      if (Objects.equals(this.type, var2)) {
         return TypeFamily.familyOptic(var2x -> new TypedOptic<>(ImmutableSet.of(Profunctor.Mu.TYPE_TOKEN), var2, var3, var2, var3, Optics.id()));
      }

      TypedOptic var4 = this.makeIgnoreOptic(this.type, var2, var3);
      return TypeFamily.familyOptic(var1x -> var4);
   }

   private <T, A, B> TypedOptic<T, T, A, B> makeIgnoreOptic(Type<T> var1, Type<A> var2, Type<B> var3) {
      return new TypedOptic<>(AffineP.Mu.TYPE_TOKEN, var1, var1, var2, var3, Optics.affine(Either::left, (var0, var1x) -> var1x));
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      return DSL.<FT>fieldFinder(var2, var3).findType(this.type, var4, false).mapLeft(var0 -> new Const(var0.tType()));
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var1x -> RewriteResult.nop(this.type);
   }

   @Override
   public String toString() {
      return "Const[" + this.type + "]";
   }

   public static final class PrimitiveType<A> extends Type<A> {
      private final Codec<A> codec;

      public PrimitiveType(Codec<A> var1) {
         this.codec = var1;
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         return this == var1;
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.constType(this);
      }

      @Override
      protected Codec<A> buildCodec() {
         return this.codec;
      }

      @Override
      public String toString() {
         return this.codec.toString();
      }
   }
}
