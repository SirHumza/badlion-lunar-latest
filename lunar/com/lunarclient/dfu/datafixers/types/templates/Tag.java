package com.lunarclient.dfu.datafixers.types.templates;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.profunctors.Profunctor;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public record Tag() implements TypeTemplate {
   private final String name;
   private final TypeTemplate element;

   public Tag(String var1, TypeTemplate var2) {
      this.name = var1;
      this.element = var2;
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
            return DSL.field(Tag.this.name, Tag.this.element.apply(var1).apply(var1x));
         }
      };
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var4 -> this.element.<A, B>applyO(var1, var2, var3).apply(var4));
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      if (!Objects.equals(var2, this.name)) {
         return Either.right(new Type.FieldNotFoundException("Names don't match"));
      } else if (this.element instanceof Const var5) {
         return Objects.equals(var3, var5.type()) ? Either.left(new Tag(var2, new Const(var4))) : Either.right(new Type.FieldNotFoundException("don't match"));
      } else {
         if (Objects.equals(var3, var4)) {
            return Either.left(this);
         }

         if (var3 instanceof RecursivePoint.RecursivePointType
            && this.element instanceof RecursivePoint
            && ((RecursivePoint)this.element).index() == ((RecursivePoint.RecursivePointType)var3).index()) {
            if (!(var4 instanceof RecursivePoint.RecursivePointType)) {
               return Either.left(DSL.constType(var4));
            }

            if (((RecursivePoint.RecursivePointType)var4).index() == ((RecursivePoint)this.element).index()) {
               return Either.left(this);
            }
         }

         return Either.right(new Type.FieldNotFoundException("Recursive field"));
      }
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return this.element.hmap(var1, var2);
   }

   @Override
   public String toString() {
      return "NameTag[" + this.name + ": " + this.element + "]";
   }

   public static final class TagType<A> extends Type<A> {
      protected final String name;
      protected final Type<A> element;

      public TagType(String var1, Type<A> var2) {
         this.name = var1;
         this.element = var2;
      }

      @Override
      public RewriteResult<A, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         return this.wrap(this.element.rewriteOrNop(var1));
      }

      private <B> RewriteResult<A, B> wrap(RewriteResult<A, B> var1) {
         if (var1.view().isNop()) {
            return var1;
         }

         Tag.TagType var2 = DSL.field(this.name, var1.view().newType());
         return opticView(this, var1, new TypedOptic<>(Profunctor.Mu.TYPE_TOKEN, this, var2, var1.view().type(), var1.view().newType(), Optics.id()));
      }

      @Override
      public Optional<RewriteResult<A, ?>> one(TypeRewriteRule var1) {
         Optional var2 = var1.rewrite(this.element);
         return var2.map(this::wrap);
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return DSL.field(this.name, this.element.updateMu(var1));
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.field(this.name, this.element.template());
      }

      @Override
      protected Codec<A> buildCodec() {
         return this.element.codec().fieldOf(this.name).codec();
      }

      @Override
      public String toString() {
         return "Tag[\"" + this.name + "\", " + this.element + "]";
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            Tag.TagType var4 = (Tag.TagType)var1;
            return Objects.equals(this.name, var4.name) && this.element.equals(var4.element, var2, var3);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.name.hashCode();
         return 31 * var1 + this.element.hashCode();
      }

      @Override
      public Optional<Type<?>> findFieldTypeOpt(String var1) {
         return Objects.equals(var1, this.name) ? Optional.of(this.element) : Optional.empty();
      }

      @Override
      public Optional<A> point(DynamicOps<?> var1) {
         return this.element.point(var1);
      }

      @Override
      public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         return this.element.<FT, FR>findType(var1, var2, var3, var4).mapLeft(this::wrapOptic);
      }

      private <B, FT, FR> TypedOptic<A, B, FT, FR> wrapOptic(TypedOptic<A, B, FT, FR> var1) {
         return var1.castOuter(DSL.field(this.name, var1.sType()), DSL.field(this.name, var1.tType()));
      }

      public String name() {
         return this.name;
      }

      public Type<A> element() {
         return this.element;
      }
   }
}
