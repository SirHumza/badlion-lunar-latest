package com.lunarclient.dfu.datafixers.types;

import com.google.common.collect.Maps;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.FieldFinder;
import com.lunarclient.dfu.datafixers.OpticFinder;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.Typed;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.View;
import com.lunarclient.dfu.datafixers.functions.Functions;
import com.lunarclient.dfu.datafixers.functions.PointFreeRule;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.templates.TaggedChoice;
import com.lunarclient.dfu.datafixers.types.templates.TypeTemplate;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.Dynamic;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class Type<A> implements App<Type.Mu, A> {
   private static final Map<Type.RewriteCacheKey, CompletableFuture<Optional<? extends RewriteResult<?, ?>>>> PENDING_REWRITE_CACHE = Maps.newConcurrentMap();
   private static final Map<Type.RewriteCacheKey, Optional<? extends RewriteResult<?, ?>>> REWRITE_CACHE = Maps.newConcurrentMap();
   @Nullable
   private TypeTemplate template;
   @Nullable
   private Codec<A> codec;

   public static <A> Type<A> unbox(App<Type.Mu, A> var0) {
      return (Type<A>)var0;
   }

   public RewriteResult<A, ?> rewriteOrNop(TypeRewriteRule var1) {
      return DataFixUtils.orElseGet(var1.rewrite(this), () -> RewriteResult.nop(this));
   }

   public static <S, T, A, B> RewriteResult<S, T> opticView(Type<S> var0, RewriteResult<A, B> var1, TypedOptic<S, T, A, B> var2) {
      return var1.view().isNop()
         ? RewriteResult.nop(var0)
         : RewriteResult.create(View.create(Functions.app(Functions.profunctorTransformer(var2), var1.view().function())), var1.recData());
   }

   public RewriteResult<A, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
      return RewriteResult.nop(this);
   }

   public Optional<RewriteResult<A, ?>> one(TypeRewriteRule var1) {
      return Optional.empty();
   }

   public Optional<RewriteResult<A, ?>> everywhere(TypeRewriteRule var1, PointFreeRule var2, boolean var3, boolean var4) {
      TypeRewriteRule var5 = TypeRewriteRule.seq(
         TypeRewriteRule.orElse(var1, TypeRewriteRule::nop), TypeRewriteRule.all(TypeRewriteRule.everywhere(var1, var2, var3, var4), var3, var4)
      );
      return this.rewrite(var5, var2);
   }

   public Type<?> updateMu(RecursiveTypeFamily var1) {
      return this;
   }

   public TypeTemplate template() {
      if (this.template == null) {
         this.template = this.buildTemplate();
      }

      return this.template;
   }

   public abstract TypeTemplate buildTemplate();

   public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String var1, int var2) {
      return Optional.empty();
   }

   public Optional<Type<?>> findCheckedType(int var1) {
      return Optional.empty();
   }

   public final <T> DataResult<Pair<A, Dynamic<T>>> read(Dynamic<T> var1) {
      return this.codec().decode(var1.getOps(), var1.getValue()).map(var1x -> var1x.mapSecond(var1xx -> new Dynamic<>(var1.getOps(), (T)var1xx)));
   }

   public final Codec<A> codec() {
      if (this.codec == null) {
         this.codec = this.buildCodec();
      }

      return this.codec;
   }

   protected abstract Codec<A> buildCodec();

   public final <T> DataResult<T> write(DynamicOps<T> var1, A var2) {
      return this.codec().encode((A)var2, var1, (T)var1.empty());
   }

   public final <T> DataResult<Dynamic<T>> writeDynamic(DynamicOps<T> var1, A var2) {
      return this.<Object>write(var1, (A)var2).map(var1x -> new Dynamic<>(var1, (T)var1x));
   }

   public <T> DataResult<Pair<Typed<A>, T>> readTyped(Dynamic<T> var1) {
      return this.readTyped(var1.getOps(), (T)var1.getValue());
   }

   public <T> DataResult<Pair<Typed<A>, T>> readTyped(DynamicOps<T> var1, T var2) {
      return this.codec().decode(var1, var2).map(var2x -> (Pair<Typed<A>, T>)var2x.mapFirst(var2xx -> new Typed<>(this, var1, (A)var2xx)));
   }

   public <T> DataResult<Pair<Optional<?>, T>> read(DynamicOps<T> var1, TypeRewriteRule var2, PointFreeRule var3, T var4) {
      return this.codec()
         .decode(var1, var4)
         .map(
            var4x -> (Pair<Optional<?>, T>)var4x.mapFirst(
               var4xx -> this.rewrite(var2, var3).map(var2xxx -> ((Function)var2xxx.view().function().evalCached().apply(var1)).apply(var4xx))
            )
         );
   }

   public <T> DataResult<T> readAndWrite(DynamicOps<T> var1, Type<?> var2, TypeRewriteRule var3, PointFreeRule var4, T var5) {
      Optional var6 = this.rewrite(var3, var4);
      if (!var6.isPresent()) {
         return DataResult.error(() -> "Could not build a rewrite rule: " + var3 + " " + var4, (T)var5);
      }

      View var7 = ((RewriteResult)var6.get()).view();
      return var7.isNop()
         ? DataResult.success((T)var5)
         : this.codec().decode(var1, var5).flatMap(var4x -> this.capWrite(var1, var2, (T)var4x.getSecond(), var4x.getFirst(), var7));
   }

   private <T, B> DataResult<T> capWrite(DynamicOps<T> var1, Type<?> var2, T var3, A var4, View<A, B> var5) {
      if (!var2.equals(var5.newType(), true, true)) {
         return DataResult.error(() -> "Rewritten type doesn't match");
      }

      Object var6 = ((Function)var5.function().evalCached().apply(var1)).apply(var4);
      return var5.newType().codec().encode(var6, var1, (T)var3);
   }

   public Optional<RewriteResult<A, ?>> rewrite(TypeRewriteRule var1, PointFreeRule var2) {
      Type.RewriteCacheKey var3 = new Type.RewriteCacheKey(this, var1, var2);
      Optional var4 = REWRITE_CACHE.get(var3);
      if (var4 != null) {
         return var4;
      } else {
         AtomicReference var5 = new AtomicReference();
         CompletableFuture var6 = PENDING_REWRITE_CACHE.computeIfAbsent(var3, var1x -> {
            CompletableFuture var2x = new CompletableFuture();
            var5.setPlain(var2x);
            return var2x;
         });
         if (var5.getPlain() != null) {
            Optional var7 = var1.rewrite(this)
               .flatMap(var1x -> var1x.view().rewrite(var2).map(var1xx -> RewriteResult.create((View<A, ?>)var1xx, var1x.recData())));
            REWRITE_CACHE.put(var3, var7);
            var6.complete(var7);
            PENDING_REWRITE_CACHE.remove(var3);
            return var7;
         } else {
            return (Optional<RewriteResult<A, ?>>)var6.join();
         }
      }
   }

   public <FT, FR> Type<?> getSetType(OpticFinder<FT> var1, Type<FR> var2) {
      return var1.<A, FR>findType(this, var2, false).orThrow().tType();
   }

   public Optional<Type<?>> findFieldTypeOpt(String var1) {
      return Optional.empty();
   }

   public Type<?> findFieldType(String var1) {
      return this.findFieldTypeOpt(var1).orElseThrow(() -> new IllegalArgumentException("Field not found: " + var1));
   }

   public OpticFinder<?> findField(String var1) {
      return new FieldFinder<>(var1, this.findFieldType(var1));
   }

   public Optional<A> point(DynamicOps<?> var1) {
      return Optional.empty();
   }

   public Optional<Typed<A>> pointTyped(DynamicOps<?> var1) {
      return this.point(var1).map(var2 -> new Typed<>(this, var1, (A)var2));
   }

   public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeCached(
      Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
   ) {
      return this.findType(var1, var2, var3, var4);
   }

   public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findType(
      Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
   ) {
      return var3.match(this).map(Either::left, var5 -> var5 instanceof Type.Continue ? this.findTypeInChildren(var1, var2, var3, var4) : Either.right(var5));
   }

   public <FT, FR> Either<TypedOptic<A, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
      Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
   ) {
      return Either.right(new Type.FieldNotFoundException("No more children"));
   }

   public OpticFinder<A> finder() {
      return DSL.typeFinder(this);
   }

   public <B> Optional<A> ifSame(Typed<B> var1) {
      return this.ifSame(var1.getType(), var1.getValue());
   }

   public <B> Optional<A> ifSame(Type<B> var1, B var2) {
      return this.equals(var1, true, true) ? Optional.of((A)var2) : Optional.empty();
   }

   public <B> Optional<RewriteResult<A, ?>> ifSame(Type<B> var1, RewriteResult<B, ?> var2) {
      return this.equals(var1, true, true) ? Optional.of(var2) : Optional.empty();
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1 ? true : this.equals(var1, false, true);
   }

   public abstract boolean equals(Object var1, boolean var2, boolean var3);

   public static final class Continue extends Type.FieldNotFoundException {
      public Continue() {
         super("Continue");
      }
   }

   public static class FieldNotFoundException extends Type.TypeError {
      public FieldNotFoundException(String var1) {
         super(var1);
      }
   }

   public static class Mu implements K1 {
   }

   private record RewriteCacheKey() {
      private final Type<?> type;
      private final TypeRewriteRule rule;
      private final PointFreeRule optimizationRule;

      private RewriteCacheKey(Type<?> var1, TypeRewriteRule var2, PointFreeRule var3) {
         this.type = var1;
         this.rule = var2;
         this.optimizationRule = var3;
      }
   }

   public abstract static class TypeError {
      private final String message;

      public TypeError(String var1) {
         this.message = var1;
      }

      @Override
      public String toString() {
         return this.message;
      }
   }

   public interface TypeMatcher<FT, FR> {
      <S> Either<TypedOptic<S, ?, FT, FR>, Type.FieldNotFoundException> match(Type<S> var1);
   }
}
