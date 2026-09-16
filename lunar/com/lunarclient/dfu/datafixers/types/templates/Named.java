package com.lunarclient.dfu.datafixers.types.templates;

import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public record Named() implements TypeTemplate {
   private final String name;
   private final TypeTemplate element;

   public Named(String var1, TypeTemplate var2) {
      this.name = var1;
      this.element = var2;
   }

   @Override
   public int size() {
      return this.element.size();
   }

   @Override
   public TypeFamily apply(TypeFamily var1) {
      return var2 -> DSL.named(this.name, this.element.apply(var1).apply(var2));
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var4 -> this.element.<A, B>applyO(var1, var2, var3).apply(var4));
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      return this.element.findFieldOrType(var1, var2, var3, var4);
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = this.element.hmap(var1, var2).apply(var3);
         return this.cap(var1, var3, var4);
      };
   }

   private <A> RewriteResult<Pair<String, A>, ?> cap(TypeFamily var1, int var2, RewriteResult<A, ?> var3) {
      return Named.NamedType.fix((Named.NamedType<A>)this.apply(var1).apply(var2), var3);
   }

   @Override
   public String toString() {
      return "NamedTypeTag[" + this.name + ": " + this.element + "]";
   }

   public static final class NamedType<A> extends Type<Pair<String, A>> {
      protected final String name;
      protected final Type<A> element;

      public NamedType(String var1, Type<A> var2) {
         this.name = var1;
         this.element = var2;
      }

      public static <A, B> RewriteResult<Pair<String, A>, ?> fix(Named.NamedType<A> var0, RewriteResult<A, B> var1) {
         return var1.view().isNop()
            ? RewriteResult.nop(var0)
            : opticView(var0, var1, wrapOptic(var0.name, TypedOptic.adapter(var1.view().type(), var1.view().newType())));
      }

      @Override
      public RewriteResult<Pair<String, A>, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         RewriteResult var4 = this.element.rewriteOrNop(var1);
         return fix(this, var4);
      }

      @Override
      public Optional<RewriteResult<Pair<String, A>, ?>> one(TypeRewriteRule var1) {
         Optional var2 = var1.rewrite(this.element);
         return var2.map(var1x -> fix(this, var1x));
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return DSL.named(this.name, this.element.updateMu(var1));
      }

      @Override
      public TypeTemplate buildTemplate() {
         return DSL.named(this.name, this.element.template());
      }

      @Override
      public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String var1, int var2) {
         return this.element.findChoiceType(var1, var2);
      }

      @Override
      public Optional<Type<?>> findCheckedType(int var1) {
         return this.element.findCheckedType(var1);
      }

      @Override
      protected Codec<Pair<String, A>> buildCodec() {
         return new Codec<Pair<String, A>>() {
            @Override
            public <T> DataResult<Pair<Pair<String, A>, T>> decode(DynamicOps<T> var1, T var2) {
               return NamedType.this.element
                  .codec()
                  .decode(var1, var2)
                  .map(var1x -> (Pair<Pair<String, A>, T>)var1x.mapFirst(var1xx -> Pair.of(NamedType.this.name, (A)var1xx)))
                  .setLifecycle(Lifecycle.experimental());
            }

            public <T> DataResult<T> encode(Pair<String, A> var1, DynamicOps<T> var2, T var3) {
               return !Objects.equals(var1.getFirst(), NamedType.this.name)
                  ? DataResult.error(() -> "Named type name doesn't match: expected: " + NamedType.this.name + ", got: " + (String)var1.getFirst(), (T)var3)
                  : NamedType.this.element.codec().encode((A)var1.getSecond(), var2, var3).setLifecycle(Lifecycle.experimental());
            }
         };
      }

      @Override
      public String toString() {
         return "NamedType[\"" + this.name + "\", " + this.element + "]";
      }

      public String name() {
         return this.name;
      }

      public Type<A> element() {
         return this.element;
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         if (this == var1) {
            return true;
         } else {
            return !(var1 instanceof Named.NamedType var4) ? false : Objects.equals(this.name, var4.name) && this.element.equals(var4.element, var2, var3);
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.name.hashCode();
         return 31 * var1 + this.element.hashCode();
      }

      @Override
      public Optional<Type<?>> findFieldTypeOpt(String var1) {
         return this.element.findFieldTypeOpt(var1);
      }

      @Override
      public Optional<Pair<String, A>> point(DynamicOps<?> var1) {
         return this.element.point(var1).map(var1x -> Pair.of(this.name, (A)var1x));
      }

      @Override
      public <FT, FR> Either<TypedOptic<Pair<String, A>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         return this.element.<FT, FR>findType(var1, var2, var3, var4).mapLeft(var1x -> wrapOptic(this.name, (TypedOptic<A, ?, FT, FR>)var1x));
      }

      protected static <A, B, FT, FR> TypedOptic<Pair<String, A>, Pair<String, B>, FT, FR> wrapOptic(String var0, TypedOptic<A, B, FT, FR> var1) {
         return new TypedOptic<>(
               Cartesian.Mu.TYPE_TOKEN, DSL.named(var0, var1.sType()), DSL.named(var0, var1.tType()), var1.sType(), var1.tType(), Optics.proj2()
            )
            .compose(var1);
      }
   }
}
