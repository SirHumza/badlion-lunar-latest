package com.lunarclient.dfu.datafixers.types.templates;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.Applicative;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.optics.Optic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.Traversal;
import com.lunarclient.dfu.datafixers.optics.profunctors.TraversalP;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public record Product() implements TypeTemplate {
   private final TypeTemplate f;
   private final TypeTemplate g;

   public Product(TypeTemplate var1, TypeTemplate var2) {
      this.f = var1;
      this.g = var2;
   }

   @Override
   public int size() {
      return Math.max(this.f.size(), this.g.size());
   }

   @Override
   public TypeFamily apply(final TypeFamily var1) {
      return new TypeFamily() {
         @Override
         public Type<?> apply(int var1x) {
            return DSL.and(Product.this.f.apply(var1).apply(var1x), Product.this.g.apply(var1).apply(var1x));
         }
      };
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var4 -> this.cap(this.f.applyO(var1, var2, var3), this.g.applyO(var1, var2, var3), var4));
   }

   private <A, B, LS, RS, LT, RT> TypedOptic<?, ?, A, B> cap(FamilyOptic<A, B> var1, FamilyOptic<A, B> var2, int var3) {
      TypeToken var4 = TraversalP.Mu.TYPE_TOKEN;
      TypedOptic var5 = var1.apply(var3);
      TypedOptic var6 = var2.apply(var3);
      Optic var7 = (Optic)var5.upCast(var4).orElseThrow(IllegalArgumentException::new);
      Optic var8 = (Optic)var6.upCast(var4).orElseThrow(IllegalArgumentException::new);
      final Traversal var9 = Optics.toTraversal(var7);
      final Traversal var10 = Optics.toTraversal(var8);
      return new TypedOptic<>(
         ImmutableSet.of(var4),
         DSL.and(var5.sType(), var6.sType()),
         DSL.and(var5.tType(), var6.tType()),
         var5.aType(),
         var5.bType(),
         new Traversal<Pair<LS, RS>, Pair<LT, RT>, A, B>() {
            @Override
            public <F extends K1> FunctionType<Pair<LS, RS>, App<F, Pair<LT, RT>>> wander(Applicative<F, ?> var1, FunctionType<A, App<F, B>> var2x) {
               return var4x -> var1.ap2(
                  var1.point(Pair::of),
                  (App<F, A>)var9.wander(var1, var2).apply(var4x.getFirst()),
                  (App<F, B>)var10.wander(var1, var2).apply(var4x.getSecond())
               );
            }
         }
      );
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      Either var5 = this.f.findFieldOrType(var1, var2, var3, var4);
      return var5.map(
         var1x -> Either.left(new Product(var1x, this.g)),
         var5x -> this.g.findFieldOrType(var1, var2, var3, var4).mapLeft(var1xx -> new Product(this.f, var1xx))
      );
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = this.f.hmap(var1, var2).apply(var3);
         RewriteResult var5 = this.g.hmap(var1, var2).apply(var3);
         return this.cap(this.apply(var1).apply(var3), var4, var5);
      };
   }

   private <L, R> RewriteResult<?, ?> cap(Type<?> var1, RewriteResult<L, ?> var2, RewriteResult<R, ?> var3) {
      return ((Product.ProductType)var1).mergeViews(var2, var3);
   }

   @Override
   public String toString() {
      return "(" + this.f + ", " + this.g + ")";
   }

   public static final class ProductType<F, G> extends Type<Pair<F, G>> {
      protected final Type<F> first;
      protected final Type<G> second;
      private int hashCode;

      public ProductType(Type<F> var1, Type<G> var2) {
         this.first = var1;
         this.second = var2;
      }

      public Type<F> first() {
         return this.first;
      }

      public Type<G> second() {
         return this.second;
      }

      @Override
      public RewriteResult<Pair<F, G>, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         return this.mergeViews(this.first.rewriteOrNop(var1), this.second.rewriteOrNop(var1));
      }

      public <F2, G2> RewriteResult<Pair<F, G>, ?> mergeViews(RewriteResult<F, F2> var1, RewriteResult<G, G2> var2) {
         RewriteResult var3 = fixLeft(this, this.first, this.second, var1);
         RewriteResult var4 = fixRight(var3.view().newType(), var1.view().newType(), this.second, var2);
         return var4.compose(var3);
      }

      @Override
      public Optional<RewriteResult<Pair<F, G>, ?>> one(TypeRewriteRule var1) {
         return DataFixUtils.or(
            var1.rewrite(this.first).map(var1x -> fixLeft(this, this.first, this.second, (RewriteResult<F, ?>)var1x)),
            () -> var1.rewrite(this.second).map(var1xx -> fixRight(this, this.first, this.second, (RewriteResult<G, ?>)var1xx))
         );
      }

      private static <F, G, F2> RewriteResult<Pair<F, G>, Pair<F2, G>> fixLeft(Type<Pair<F, G>> var0, Type<F> var1, Type<G> var2, RewriteResult<F, F2> var3) {
         return opticView(var0, var3, TypedOptic.proj1(var1, var2, var3.view().newType()));
      }

      private static <F, G, G2> RewriteResult<Pair<F, G>, Pair<F, G2>> fixRight(Type<Pair<F, G>> var0, Type<F> var1, Type<G> var2, RewriteResult<G, G2> var3) {
         return opticView(var0, var3, TypedOptic.proj2(var1, var2, var3.view().newType()));
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return DSL.and(this.first.updateMu(var1), this.second.updateMu(var1));
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.and(this.first.template(), this.second.template());
      }

      @Override
      public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String var1, int var2) {
         return DataFixUtils.or(this.first.findChoiceType(var1, var2), () -> this.second.findChoiceType(var1, var2));
      }

      @Override
      public Optional<Type<?>> findCheckedType(int var1) {
         return DataFixUtils.or(this.first.findCheckedType(var1), () -> this.second.findCheckedType(var1));
      }

      @Override
      public Codec<Pair<F, G>> buildCodec() {
         return Codec.pair(this.first.codec(), this.second.codec());
      }

      @Override
      public String toString() {
         return "(" + this.first + ", " + this.second + ")";
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         return !(var1 instanceof Product.ProductType var4) ? false : this.first.equals(var4.first, var2, var3) && this.second.equals(var4.second, var2, var3);
      }

      @Override
      public int hashCode() {
         if (this.hashCode == 0) {
            int var1 = this.first.hashCode();
            var1 = 31 * var1 + this.second.hashCode();
            this.hashCode = var1;
         }

         return this.hashCode;
      }

      @Override
      public Optional<Type<?>> findFieldTypeOpt(String var1) {
         return DataFixUtils.or(this.first.findFieldTypeOpt(var1), () -> this.second.findFieldTypeOpt(var1));
      }

      @Override
      public Optional<Pair<F, G>> point(DynamicOps<?> var1) {
         return this.first.point(var1).flatMap(var2 -> this.second.point(var1).map(var1xx -> Pair.of((F)var2, (G)var1xx)));
      }

      @Override
      public <FT, FR> Either<TypedOptic<Pair<F, G>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         Either var5 = this.first.findType(var1, var2, var3, var4);
         return var5.map(this::capLeft, var5x -> {
            Either var6 = this.second.findType(var1, var2, var3, var4);
            return var6.mapLeft(this::capRight);
         });
      }

      private <FT, F2, FR> Either<TypedOptic<Pair<F, G>, ?, FT, FR>, Type.FieldNotFoundException> capLeft(TypedOptic<F, F2, FT, FR> var1) {
         return Either.left(TypedOptic.<F, G, F2>proj1(var1.sType(), this.second, var1.tType()).compose(var1));
      }

      private <FT, G2, FR> TypedOptic<Pair<F, G>, ?, FT, FR> capRight(TypedOptic<G, G2, FT, FR> var1) {
         return TypedOptic.<F, G, G2>proj2(this.first, var1.sType(), var1.tType()).compose(var1);
      }
   }
}
