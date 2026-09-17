package com.lunarclient.dfu.datafixers.types.templates;

import com.google.common.collect.ImmutableList;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
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

public record CompoundList() implements TypeTemplate {
   private final TypeTemplate key;
   private final TypeTemplate element;

   public CompoundList(TypeTemplate var1, TypeTemplate var2) {
      this.key = var1;
      this.element = var2;
   }

   @Override
   public int size() {
      return Math.max(this.key.size(), this.element.size());
   }

   @Override
   public TypeFamily apply(TypeFamily var1) {
      return var2 -> DSL.compoundList(this.key.apply(var1).apply(var2), this.element.apply(var1).apply(var2));
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      return TypeFamily.familyOptic(var4 -> this.cap(this.element.<A, B>applyO(var1, var2, var3).apply(var4)));
   }

   private <S, T, A, B> TypedOptic<?, ?, A, B> cap(TypedOptic<S, T, A, B> var1) {
      Type var2 = DSL.and(DSL.string(), var1.sType());
      Type var3 = DSL.and(DSL.string(), var1.tType());
      return new TypedOptic<>(TraversalP.Mu.TYPE_TOKEN, DSL.compoundList(var1.sType()), DSL.compoundList(var1.tType()), var2, var3, Optics.listTraversal())
         .compose(new TypedOptic<>(Cartesian.Mu.TYPE_TOKEN, var2, var3, var1.sType(), var1.tType(), Optics.proj2()))
         .compose(var1);
   }

   @Override
   public <FT, FR> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<FT> var3, Type<FR> var4) {
      return this.element.findFieldOrType(var1, var2, var3, var4).mapLeft(var1x -> new CompoundList(this.key, var1x));
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = this.key.hmap(var1, var2).apply(var3);
         RewriteResult var5 = this.element.hmap(var1, var2).apply(var3);
         return this.cap(this.apply(var1).apply(var3), var4, var5);
      };
   }

   private <L, R> RewriteResult<?, ?> cap(Type<?> var1, RewriteResult<L, ?> var2, RewriteResult<R, ?> var3) {
      return ((CompoundList.CompoundListType)var1).mergeViews(var2, var3);
   }

   @Override
   public String toString() {
      return "CompoundList[" + this.element + "]";
   }

   public static final class CompoundListType<K, V> extends Type<java.util.List<Pair<K, V>>> {
      protected final Type<K> key;
      protected final Type<V> element;

      public CompoundListType(Type<K> var1, Type<V> var2) {
         this.key = var1;
         this.element = var2;
      }

      @Override
      public RewriteResult<java.util.List<Pair<K, V>>, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         return this.mergeViews(this.key.rewriteOrNop(var1), this.element.rewriteOrNop(var1));
      }

      public <K2, V2> RewriteResult<java.util.List<Pair<K, V>>, ?> mergeViews(RewriteResult<K, K2> var1, RewriteResult<V, V2> var2) {
         RewriteResult var3 = fixKeys(this, this.key, this.element, var1);
         RewriteResult var4 = fixValues(var3.view().newType(), var1.view().newType(), this.element, var2);
         return var4.compose(var3);
      }

      @Override
      public Optional<RewriteResult<java.util.List<Pair<K, V>>, ?>> one(TypeRewriteRule var1) {
         return DataFixUtils.or(
            var1.rewrite(this.key).map(var1x -> fixKeys(this, this.key, this.element, (RewriteResult<K, ?>)var1x)),
            () -> var1.rewrite(this.element).map(var1xx -> fixValues(this, this.key, this.element, (RewriteResult<V, ?>)var1xx))
         );
      }

      private static <K, V, K2> RewriteResult<java.util.List<Pair<K, V>>, java.util.List<Pair<K2, V>>> fixKeys(
         Type<java.util.List<Pair<K, V>>> var0, Type<K> var1, Type<V> var2, RewriteResult<K, K2> var3
      ) {
         return opticView(var0, var3, TypedOptic.compoundListKeys(var1, var3.view().newType(), var2));
      }

      private static <K, V, V2> RewriteResult<java.util.List<Pair<K, V>>, java.util.List<Pair<K, V2>>> fixValues(
         Type<java.util.List<Pair<K, V>>> var0, Type<K> var1, Type<V> var2, RewriteResult<V, V2> var3
      ) {
         return opticView(var0, var3, TypedOptic.compoundListElements(var1, var2, var3.view().newType()));
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         return DSL.compoundList(this.key.updateMu(var1), this.element.updateMu(var1));
      }

      @Override
      public TypeTemplate buildTemplate() {
         return new CompoundList(this.key.template(), this.element.template());
      }

      @Override
      public Optional<java.util.List<Pair<K, V>>> point(DynamicOps<?> var1) {
         return Optional.of(ImmutableList.of());
      }

      @Override
      public <FT, FR> Either<TypedOptic<java.util.List<Pair<K, V>>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         Either var5 = this.key.findType(var1, var2, var3, var4);
         return var5.map(this::capLeft, var5x -> {
            Either var6 = this.element.findType(var1, var2, var3, var4);
            return var6.mapLeft(this::capRight);
         });
      }

      private <FT, K2, FR> Either<TypedOptic<java.util.List<Pair<K, V>>, ?, FT, FR>, Type.FieldNotFoundException> capLeft(TypedOptic<K, K2, FT, FR> var1) {
         return Either.left(TypedOptic.<K, V, K2>compoundListKeys(var1.sType(), var1.tType(), this.element).compose(var1));
      }

      private <FT, V2, FR> TypedOptic<java.util.List<Pair<K, V>>, ?, FT, FR> capRight(TypedOptic<V, V2, FT, FR> var1) {
         return TypedOptic.<K, V, V2>compoundListElements(this.key, var1.sType(), var1.tType()).compose(var1);
      }

      @Override
      protected Codec<java.util.List<Pair<K, V>>> buildCodec() {
         return Codec.compoundList(this.key.codec(), this.element.codec());
      }

      @Override
      public String toString() {
         return "CompoundList[" + this.key + " -> " + this.element + "]";
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         return !(var1 instanceof CompoundList.CompoundListType var4)
            ? false
            : this.key.equals(var4.key, var2, var3) && this.element.equals(var4.element, var2, var3);
      }

      @Override
      public int hashCode() {
         int var1 = this.key.hashCode();
         return 31 * var1 + this.element.hashCode();
      }

      public Type<K> getKey() {
         return this.key;
      }

      public Type<V> getElement() {
         return this.element;
      }
   }
}
