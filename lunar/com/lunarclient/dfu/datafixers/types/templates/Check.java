package com.lunarclient.dfu.datafixers.types.templates;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.functions.PointFreeRule;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public record Check() implements TypeTemplate {
   private final String name;
   private final int index;
   private final TypeTemplate element;

   public Check(String var1, int var2, TypeTemplate var3) {
      this.name = var1;
      this.index = var2;
      this.element = var3;
   }

   @Override
   public int size() {
      return Math.max(this.index + 1, this.element.size());
   }

   @Override
   public TypeFamily apply(final TypeFamily var1) {
      return new TypeFamily() {
         @Override
         public Type<?> apply(int var1x) {
            if (var1x < 0) {
               throw new IndexOutOfBoundsException();
            } else {
               return new Check.CheckType<>(Check.this.name, var1x, Check.this.index, Check.this.element.apply(var1).apply(var1x));
            }
         }
      };
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var4 -> this.element.<A, B>applyO(var1, var2, var3).apply(var4));
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      return var1 == this.index ? this.element.findFieldOrType(var1, var2, var3, var4) : Either.right(new Type.FieldNotFoundException("Not a matching index"));
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = this.element.hmap(var1, var2).apply(var3);
         return this.cap(var1, var3, var4);
      };
   }

   private <A> RewriteResult<?, ?> cap(TypeFamily var1, int var2, RewriteResult<A, ?> var3) {
      return Check.CheckType.fix((Check.CheckType<?>)this.apply(var1).apply(var2), var3);
   }

   @Override
   public String toString() {
      return "Tag[" + this.name + ", " + this.index + ": " + this.element + "]";
   }

   public static final class CheckType<A> extends Type<A> {
      private final String name;
      private final int index;
      private final int expectedIndex;
      private final Type<A> delegate;

      public CheckType(String var1, int var2, int var3, Type<A> var4) {
         this.name = var1;
         this.index = var2;
         this.expectedIndex = var3;
         this.delegate = var4;
      }

      @Override
      protected Codec<A> buildCodec() {
         return Codec.of(this.delegate.codec(), this::read);
      }

      private <T> DataResult<Pair<A, T>> read(DynamicOps<T> var1, T var2) {
         return this.index != this.expectedIndex
            ? DataResult.error(() -> "Index mismatch: " + this.index + " != " + this.expectedIndex)
            : this.delegate.codec().decode(var1, var2);
      }

      public static <A, B> RewriteResult<A, ?> fix(Check.CheckType<A> var0, RewriteResult<A, B> var1) {
         return var1.view().isNop()
            ? RewriteResult.nop(var0)
            : opticView(var0, var1, wrapOptic(var0, TypedOptic.adapter(var1.view().type(), var1.view().newType())));
      }

      @Override
      public RewriteResult<A, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         return var3 && this.index != this.expectedIndex ? RewriteResult.nop(this) : fix(this, this.delegate.rewriteOrNop(var1));
      }

      @Override
      public Optional<RewriteResult<A, ?>> everywhere(TypeRewriteRule var1, PointFreeRule var2, boolean var3, boolean var4) {
         return var4 && this.index != this.expectedIndex ? Optional.empty() : super.everywhere(var1, var2, var3, var4);
      }

      @Override
      public Optional<RewriteResult<A, ?>> one(TypeRewriteRule var1) {
         return var1.rewrite(this.delegate).map(var1x -> fix(this, (RewriteResult<A, ?>)var1x));
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return new Check.CheckType(this.name, this.index, this.expectedIndex, (Type<A>)this.delegate.updateMu(var1));
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.check(this.name, this.expectedIndex, this.delegate.template());
      }

      @Override
      public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String var1, int var2) {
         return var2 == this.expectedIndex ? this.delegate.findChoiceType(var1, var2) : Optional.empty();
      }

      @Override
      public Optional<Type<?>> findCheckedType(int var1) {
         return var1 == this.expectedIndex ? Optional.of(this.delegate) : Optional.empty();
      }

      @Override
      public Optional<Type<?>> findFieldTypeOpt(String var1) {
         return this.index == this.expectedIndex ? this.delegate.findFieldTypeOpt(var1) : Optional.empty();
      }

      @Override
      public Optional<A> point(DynamicOps<?> var1) {
         return this.index == this.expectedIndex ? this.delegate.point(var1) : Optional.empty();
      }

      @Override
      public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         return this.index != this.expectedIndex
            ? Either.right(new Type.FieldNotFoundException("Incorrect index in CheckType"))
            : this.delegate.<FT, FR>findType(var1, var2, var3, var4).mapLeft(var1x -> wrapOptic(this, (TypedOptic<A, ?, FT, FR>)var1x));
      }

      protected static <A, B, FT, FR> TypedOptic<A, B, FT, FR> wrapOptic(Check.CheckType<A> var0, TypedOptic<A, B, FT, FR> var1) {
         return (TypedOptic<A, B, FT, FR>)var1.castOuter(var0, new Check.CheckType<>(var0.name, var0.index, var0.expectedIndex, var1.tType()));
      }

      @Override
      public String toString() {
         return "TypeTag[" + this.index + "~" + this.expectedIndex + "][" + this.name + ": " + this.delegate + "]";
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         if (!(var1 instanceof Check.CheckType var4)) {
            return false;
         } else {
            if (this.index == var4.index && this.expectedIndex == var4.expectedIndex) {
               if (!var3) {
                  return true;
               }

               if (this.delegate.equals(var4.delegate, var2, var3)) {
                  return true;
               }
            }

            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.index;
         var1 = 31 * var1 + this.expectedIndex;
         return 31 * var1 + this.delegate.hashCode();
      }
   }
}
