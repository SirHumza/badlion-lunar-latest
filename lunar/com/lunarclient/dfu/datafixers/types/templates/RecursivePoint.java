package com.lunarclient.dfu.datafixers.types.templates;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.View;
import com.lunarclient.dfu.datafixers.functions.Functions;
import com.lunarclient.dfu.datafixers.functions.PointFreeRule;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import java.util.BitSet;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public record RecursivePoint() implements TypeTemplate {
   private final int index;

   public RecursivePoint(int var1) {
      this.index = var1;
   }

   @Override
   public int size() {
      return this.index + 1;
   }

   @Override
   public TypeFamily apply(TypeFamily var1) {
      final Type var2 = var1.apply(this.index);
      return new TypeFamily() {
         @Override
         public Type<?> apply(int var1) {
            return var2;
         }
      };
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var2x -> var1.apply(this.index));
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      return Either.right(new Type.FieldNotFoundException("Recursion point"));
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = (RewriteResult)var2.apply(this.index);
         return this.cap(var1, var4);
      };
   }

   public <S, T> RewriteResult<S, T> cap(TypeFamily var1, RewriteResult<S, T> var2) {
      Type var3 = var1.apply(this.index);
      if (!(var3 instanceof RecursivePoint.RecursivePointType)) {
         throw new IllegalArgumentException("Type error: Recursive point template template got a non-recursice type as an input.");
      }

      if (!Objects.equals(var2.view().type(), var3)) {
         throw new IllegalArgumentException("Type error: hmap function input type");
      }

      BitSet var4 = (BitSet)var2.recData().clone();
      var4.set(this.index);
      return RewriteResult.create(var2.view(), var4);
   }

   @Override
   public String toString() {
      return "Id[" + this.index + "]";
   }

   public static final class RecursivePointType<A> extends Type<A> {
      private final RecursiveTypeFamily family;
      private final int index;
      private final Supplier<Type<A>> delegate;
      @Nullable
      private volatile Type<A> type;

      public RecursivePointType(RecursiveTypeFamily var1, int var2, Supplier<Type<A>> var3) {
         this.family = var1;
         this.index = var2;
         this.delegate = var3;
      }

      public RecursiveTypeFamily family() {
         return this.family;
      }

      public int index() {
         return this.index;
      }

      public Type<A> unfold() {
         if (this.type == null) {
            this.type = this.delegate.get();
         }

         return this.type;
      }

      @Override
      protected Codec<A> buildCodec() {
         return new Codec<A>() {
            @Override
            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
               return (DataResult<Pair<A, T>>)RecursivePointType.this.unfold().codec().decode(var1, var2).setLifecycle(Lifecycle.experimental());
            }

            @Override
            public <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
               return (DataResult<T>)RecursivePointType.this.unfold().codec().encode(var1, var2, var3).setLifecycle(Lifecycle.experimental());
            }
         };
      }

      @Override
      public RewriteResult<A, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         return this.unfold().all(var1, var2, var3);
      }

      @Override
      public Optional<RewriteResult<A, ?>> one(TypeRewriteRule var1) {
         return this.unfold().one(var1);
      }

      @Override
      public Optional<RewriteResult<A, ?>> everywhere(TypeRewriteRule var1, PointFreeRule var2, boolean var3, boolean var4) {
         if (var3) {
            Optional var5 = this.family.everywhere(this.index, var1, var2).map(var0 -> var0);
            if (var5.isPresent()) {
               return var5;
            }
         }

         return Optional.of(RewriteResult.nop(this));
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return var1.apply(this.index);
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.id(this.index);
      }

      @Override
      public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String var1, int var2) {
         return this.unfold().findChoiceType(var1, this.index);
      }

      @Override
      public Optional<Type<?>> findCheckedType(int var1) {
         return this.unfold().findCheckedType(this.index);
      }

      @Override
      public Optional<Type<?>> findFieldTypeOpt(String var1) {
         return this.unfold().findFieldTypeOpt(var1);
      }

      @Override
      public Optional<A> point(DynamicOps<?> var1) {
         return this.unfold().point(var1);
      }

      @Override
      public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         return this.family.findType(this.index, var1, var2, var3, var4).mapLeft(var1x -> {
            if (!Objects.equals(this, var1x.sType())) {
               throw new IllegalStateException(":/");
            } else {
               return (TypedOptic<A, ?, FT, FR>)var1x;
            }
         });
      }

      @Override
      public String toString() {
         return "MuType[" + this.family.name() + "_" + this.index + "]";
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         return !(var1 instanceof RecursivePoint.RecursivePointType var4)
            ? false
            : (var2 || Objects.equals(this.family, var4.family)) && this.index == var4.index;
      }

      @Override
      public int hashCode() {
         int var1 = this.family.hashCode();
         return 31 * var1 + this.index;
      }

      public View<A, A> in() {
         return View.create(Functions.in(this));
      }

      public View<A, A> out() {
         return View.create(Functions.out(this));
      }
   }
}
