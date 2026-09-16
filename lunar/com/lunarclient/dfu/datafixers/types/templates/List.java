package com.lunarclient.dfu.datafixers.types.templates;

import com.google.common.collect.ImmutableList;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.profunctors.TraversalP;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public record List() implements TypeTemplate {
   private final TypeTemplate element;

   public List(TypeTemplate var1) {
      this.element = var1;
   }

   @Override
   public int size() {
      return this.element.size();
   }

   @Override
   public TypeFamily apply(final TypeFamily var1) {
      return new TypeFamily() {
         @Override
         public Type<?> apply(int var1x) {
            return DSL.list(List.this.element.apply(var1).apply(var1x));
         }
      };
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var4 -> this.cap(this.element.<A, B>applyO(var1, var2, var3).apply(var4)));
   }

   private <S, T, A, B> TypedOptic<?, ?, A, B> cap(TypedOptic<S, T, A, B> var1) {
      return new TypedOptic<>(TraversalP.Mu.TYPE_TOKEN, DSL.list(var1.sType()), DSL.list(var1.tType()), var1.sType(), var1.tType(), Optics.listTraversal())
         .compose(var1);
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      return this.element.findFieldOrType(var1, var2, var3, var4).mapLeft(List::new);
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = this.element.hmap(var1, var2).apply(var3);
         return this.cap(this.apply(var1).apply(var3), var4);
      };
   }

   private <E> RewriteResult<?, ?> cap(Type<?> var1, RewriteResult<E, ?> var2) {
      return ((List.ListType)var1).fix(var2);
   }

   @Override
   public String toString() {
      return "List[" + this.element + "]";
   }

   public static final class ListType<A> extends Type<java.util.List<A>> {
      protected final Type<A> element;

      public ListType(Type<A> var1) {
         this.element = var1;
      }

      @Override
      public RewriteResult<java.util.List<A>, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         RewriteResult var4 = this.element.rewriteOrNop(var1);
         return this.fix(var4);
      }

      @Override
      public Optional<RewriteResult<java.util.List<A>, ?>> one(TypeRewriteRule var1) {
         return var1.rewrite(this.element).map(this::fix);
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return DSL.list(this.element.updateMu(var1));
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.list(this.element.template());
      }

      @Override
      public Optional<java.util.List<A>> point(DynamicOps<?> var1) {
         return Optional.of(ImmutableList.of());
      }

      @Override
      public <FT, FR> Either<TypedOptic<java.util.List<A>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         Either var5 = this.element.findType(var1, var2, var3, var4);
         return var5.mapLeft(this::capLeft);
      }

      private <FT, FR, B> TypedOptic<java.util.List<A>, ?, FT, FR> capLeft(TypedOptic<A, B, FT, FR> var1) {
         return TypedOptic.<A, B>list(var1.sType(), var1.tType()).compose(var1);
      }

      public <B> RewriteResult<java.util.List<A>, ?> fix(RewriteResult<A, B> var1) {
         return opticView(this, (RewriteResult<java.util.List<A>, ?>)var1, TypedOptic.list(this.element, var1.view().newType()));
      }

      @Override
      public Codec<java.util.List<A>> buildCodec() {
         return Codec.list(this.element.codec());
      }

      @Override
      public String toString() {
         return "List[" + this.element + "]";
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         return var1 instanceof List.ListType && this.element.equals(((List.ListType)var1).element, var2, var3);
      }

      @Override
      public int hashCode() {
         return this.element.hashCode();
      }

      public Type<A> getElement() {
         return this.element;
      }
   }
}
