package com.lunarclient.dfu.datafixers.types.templates;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.DSL;
import com.lunarclient.dfu.datafixers.FamilyOptic;
import com.lunarclient.dfu.datafixers.FunctionType;
import com.lunarclient.dfu.datafixers.RewriteResult;
import com.lunarclient.dfu.datafixers.TypeRewriteRule;
import com.lunarclient.dfu.datafixers.Typed;
import com.lunarclient.dfu.datafixers.TypedOptic;
import com.lunarclient.dfu.datafixers.View;
import com.lunarclient.dfu.datafixers.functions.Functions;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.Applicative;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.optics.Affine;
import com.lunarclient.dfu.datafixers.optics.Lens;
import com.lunarclient.dfu.datafixers.optics.Optic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.Traversal;
import com.lunarclient.dfu.datafixers.optics.profunctors.AffineP;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.TraversalP;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.families.RecursiveTypeFamily;
import com.lunarclient.dfu.datafixers.types.families.TypeFamily;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public final class TaggedChoice<K> implements TypeTemplate {
   private final String name;
   private final Type<K> keyType;
   private final Object2ObjectMap<K, TypeTemplate> templates;
   private final Map<Pair<TypeFamily, Integer>, Type<?>> types = Maps.newConcurrentMap();
   private final int size;

   public TaggedChoice(String var1, Type<K> var2, Object2ObjectMap<K, TypeTemplate> var3) {
      this.name = var1;
      this.keyType = var2;
      this.templates = var3;
      this.size = var3.values().stream().mapToInt(TypeTemplate::size).max().orElse(0);
   }

   @Override
   public int size() {
      return this.size;
   }

   @Override
   public TypeFamily apply(TypeFamily var1) {
      return var2 -> this.types.computeIfAbsent(Pair.of(var1, var2), var1xx -> {
         Object2ObjectOpenHashMap var2x = new Object2ObjectOpenHashMap(this.templates.size());
         ObjectIterator var3 = Object2ObjectMaps.fastIterable(this.templates).iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            var2x.put(var4.getKey(), ((TypeTemplate)var4.getValue()).apply(var1xx.getFirst()).apply(var1xx.getSecond()));
         }

         return DSL.taggedChoiceType(this.name, this.keyType, var2x);
      });
   }

   @Override
   public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> var1, Type<A> var2, Type<B> var3) {
      throw new UnsupportedOperationException();
   }

   @Override
   public <A, B> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int var1, @Nullable String var2, Type<A> var3, Type<B> var4) {
      return Either.right(new Type.FieldNotFoundException("Not implemented"));
   }

   @Override
   public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily var1, IntFunction<RewriteResult<?, ?>> var2) {
      return var3 -> {
         RewriteResult var4 = RewriteResult.nop(this.apply(var1).apply(var3));
         ObjectIterator var5 = this.templates.entrySet().iterator();

         while (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            RewriteResult var7 = ((TypeTemplate)var6.getValue()).hmap(var1, var2).apply(var3);
            var4 = TaggedChoice.TaggedChoiceType.elementResult(var6.getKey(), (TaggedChoice.TaggedChoiceType<Object>)var4.view().newType(), var7).compose(var4);
         }

         return var4;
      };
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof TaggedChoice var2)
            ? false
            : Objects.equals(this.name, var2.name) && Objects.equals(this.keyType, var2.keyType) && Objects.equals(this.templates, var2.templates);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.name.hashCode();
      var1 = 31 * var1 + this.keyType.hashCode();
      return 31 * var1 + this.templates.hashCode();
   }

   @Override
   public String toString() {
      return "TaggedChoice[" + this.name + ", " + Joiner.on(", ").withKeyValueSeparator(" -> ").join(this.templates) + "]";
   }

   public static final class TaggedChoiceType<K> extends Type<Pair<K, ?>> {
      private final String name;
      private final Type<K> keyType;
      protected final Object2ObjectMap<K, Type<?>> types;
      private final int hashCode;

      public TaggedChoiceType(String var1, Type<K> var2, Object2ObjectMap<K, Type<?>> var3) {
         this.name = var1;
         this.keyType = var2;
         this.types = var3;
         this.hashCode = Objects.hash(var1, var2, var3);
      }

      @Override
      public RewriteResult<Pair<K, ?>, ?> all(TypeRewriteRule var1, boolean var2, boolean var3) {
         Object2ObjectOpenHashMap var4 = new Object2ObjectOpenHashMap(this.types.size());
         ObjectIterator var5 = Object2ObjectMaps.fastIterable(this.types).iterator();

         while (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            Optional var7 = var1.rewrite((Type)var6.getValue());
            if (var7.isPresent() && !((RewriteResult)var7.get()).view().isNop()) {
               var4.put(var6.getKey(), (RewriteResult)var7.get());
            }
         }

         if (var4.isEmpty()) {
            return RewriteResult.nop(this);
         }

         if (var4.size() == 1) {
            Entry var10 = (Entry)var4.entrySet().iterator().next();
            return elementResult((K)var10.getKey(), this, (RewriteResult)var10.getValue());
         }

         Object2ObjectOpenHashMap var9 = new Object2ObjectOpenHashMap(this.types);
         BitSet var11 = new BitSet();
         ObjectIterator var12 = Object2ObjectMaps.fastIterable(var4).iterator();

         while (var12.hasNext()) {
            Entry var8 = (Entry)var12.next();
            var9.put(var8.getKey(), ((RewriteResult)var8.getValue()).view().newType());
            var11.or(((RewriteResult)var8.getValue()).recData());
         }

         return RewriteResult.create(
            View.create(
               Functions.fun(
                  "TaggedChoiceTypeRewriteResult " + var4.size(),
                  new TaggedChoice.TaggedChoiceType.RewriteFunc<>(var4),
                  this,
                  DSL.taggedChoiceType(this.name, this.keyType, var9)
               )
            ),
            var11
         );
      }

      public static <K, FT, FR> RewriteResult<Pair<K, ?>, Pair<K, ?>> elementResult(K var0, TaggedChoice.TaggedChoiceType<K> var1, RewriteResult<FT, FR> var2) {
         return opticView(var1, var2, TypedOptic.tagged(var1, var0, var2.view().type(), var2.view().newType()));
      }

      @Override
      public Optional<RewriteResult<Pair<K, ?>, ?>> one(TypeRewriteRule var1) {
         ObjectIterator var2 = this.types.entrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            Optional var4 = var1.rewrite((Type)var3.getValue());
            if (var4.isPresent()) {
               return Optional.of(elementResult((K)var3.getKey(), this, (RewriteResult)var4.get()));
            }
         }

         return Optional.empty();
      }

      @Override
      public Type<?> updateMu(RecursiveTypeFamily var1) {
         Object2ObjectOpenHashMap var2 = new Object2ObjectOpenHashMap(this.types.size());
         ObjectIterator var3 = Object2ObjectMaps.fastIterable(this.types).iterator();

         while (var3.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry var4 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry)var3.next();
            var2.put(var4.getKey(), ((Type)var4.getValue()).updateMu(var1));
         }

         return DSL.taggedChoiceType(this.name, this.keyType, var2);
      }

      @Override
      public TypeTemplate buildTemplate() {
         Object2ObjectOpenHashMap var1 = new Object2ObjectOpenHashMap(this.types.size());
         ObjectIterator var2 = Object2ObjectMaps.fastIterable(this.types).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry var3 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry)var2.next();
            var1.put(var3.getKey(), ((Type)var3.getValue()).template());
         }

         return DSL.taggedChoice(this.name, this.keyType, var1);
      }

      @Override
      protected Codec<Pair<K, ?>> buildCodec() {
         return this.keyType
            .codec()
            .partialDispatch(
               this.name, var0 -> DataResult.success(var0.getFirst()), var1 -> this.getMapCodec((K)var1).map(var1x -> asEntryPair((K)var1, (MapCodec<?>)var1x))
            );
      }

      private static <K, V> MapCodec<Pair<K, V>> asEntryPair(K var0, MapCodec<V> var1) {
         return var1.xmap(var1x -> Pair.of((K)var0, (V)var1x), Pair::getSecond);
      }

      private DataResult<? extends MapCodec<?>> getMapCodec(K var1) {
         return Optional.ofNullable((Type)this.types.get(var1))
            .map(var0 -> DataResult.success(MapCodec.assumeMapUnsafe(((Type)var0).codec())))
            .orElseGet(() -> DataResult.error(() -> "Unsupported key: " + var1));
      }

      @Override
      public Optional<Type<?>> findFieldTypeOpt(String var1) {
         return this.types.values().stream().map(var1x -> var1x.findFieldTypeOpt(var1)).filter(Optional::isPresent).findFirst().flatMap(Function.identity());
      }

      @Override
      public Optional<Pair<K, ?>> point(DynamicOps<?> var1) {
         return this.types
            .entrySet()
            .stream()
            .map(var1x -> ((Type)var1x.getValue()).point(var1).map(var1xx -> Pair.of(var1x.getKey(), var1xx)))
            .filter(Optional::isPresent)
            .findFirst()
            .flatMap(Function.identity())
            .map(var0 -> (Pair<K, ?>)var0);
      }

      public Optional<Typed<Pair<K, ?>>> point(DynamicOps<?> var1, K var2, Object var3) {
         return !this.types.containsKey(var2) ? Optional.empty() : Optional.of(new Typed<>(this, var1, Pair.of((K)var2, var3)));
      }

      @Override
      public <FT, FR> Either<TypedOptic<Pair<K, ?>, ?, FT, FR>, Type.FieldNotFoundException> findTypeInChildren(
         Type<FT> var1, Type<FR> var2, Type.TypeMatcher<FT, FR> var3, boolean var4
      ) {
         final Map var5 = this.types
            .entrySet()
            .stream()
            .map(var4x -> Pair.of(var4x.getKey(), ((Type)var4x.getValue()).findType(var1, var2, var3, var4)))
            .filter(var0 -> var0.getSecond().left().isPresent())
            .map(var0 -> var0.mapSecond(var0x -> (TypedOptic)var0x.left().get()))
            .collect(Pair.toMap());
         if (var5.isEmpty()) {
            return Either.right(new Type.FieldNotFoundException("Not found in any choices"));
         }

         if (var5.size() == 1) {
            Entry var13 = (Entry)var5.entrySet().iterator().next();
            return Either.left(this.cap(this, (K)var13.getKey(), (TypedOptic)var13.getValue()));
         }

         HashSet var6 = Sets.newHashSet();
         var5.values().forEach(var1x -> var6.addAll(var1x.bounds()));
         App2 var7;
         TypeToken var8;
         if (TypedOptic.instanceOf(var6, Cartesian.Mu.TYPE_TOKEN) && var5.size() == this.types.size()) {
            var8 = Cartesian.Mu.TYPE_TOKEN;
            var7 = new Lens<Pair<K, ?>, Pair<K, ?>, FT, FR>() {
               public FT view(Pair<K, ?> var1) {
                  TypedOptic var2x = (TypedOptic)var5.get(var1.getFirst());
                  return (FT)this.capView(var1, var2x);
               }

               private <S, T> FT capView(Pair<K, ?> var1, TypedOptic<S, T, FT, FR> var2x) {
                  return (FT)Optics.toLens((Optic)var2x.upCast(Cartesian.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)).view(var1.getSecond());
               }

               public Pair<K, ?> update(FR var1, Pair<K, ?> var2x) {
                  TypedOptic var3x = (TypedOptic)var5.get(var2x.getFirst());
                  return this.capUpdate((FR)var1, var2x, var3x);
               }

               private <S, T> Pair<K, ?> capUpdate(FR var1, Pair<K, ?> var2x, TypedOptic<S, T, FT, FR> var3x) {
                  return Pair.of(
                     (K)var2x.getFirst(),
                     Optics.toLens((Optic)var3x.upCast(Cartesian.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)).update(var1, var2x.getSecond())
                  );
               }
            };
         } else if (TypedOptic.instanceOf(var6, AffineP.Mu.TYPE_TOKEN)) {
            var8 = AffineP.Mu.TYPE_TOKEN;
            var7 = new Affine<Pair<K, ?>, Pair<K, ?>, FT, FR>() {
               public Either<Pair<K, ?>, FT> preview(Pair<K, ?> var1) {
                  if (!var5.containsKey(var1.getFirst())) {
                     return Either.left(var1);
                  }

                  TypedOptic var2x = (TypedOptic)var5.get(var1.getFirst());
                  return this.capPreview(var1, var2x);
               }

               private <S, T> Either<Pair<K, ?>, FT> capPreview(Pair<K, ?> var1, TypedOptic<S, T, FT, FR> var2x) {
                  return Optics.toAffine((Optic)var2x.upCast(AffineP.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new))
                     .preview(var1.getSecond())
                     .mapLeft(var1x -> Pair.of((K)var1.getFirst(), var1x));
               }

               public Pair<K, ?> set(FR var1, Pair<K, ?> var2x) {
                  if (!var5.containsKey(var2x.getFirst())) {
                     return var2x;
                  }

                  TypedOptic var3x = (TypedOptic)var5.get(var2x.getFirst());
                  return this.capSet((FR)var1, var2x, var3x);
               }

               private <S, T> Pair<K, ?> capSet(FR var1, Pair<K, ?> var2x, TypedOptic<S, T, FT, FR> var3x) {
                  return Pair.of(
                     (K)var2x.getFirst(),
                     Optics.toAffine((Optic)var3x.upCast(AffineP.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new)).set(var1, var2x.getSecond())
                  );
               }
            };
         } else {
            if (!TypedOptic.instanceOf(var6, TraversalP.Mu.TYPE_TOKEN)) {
               throw new IllegalStateException("Could not merge TaggedChoiceType optics, unknown bound: " + Arrays.toString(var6.toArray()));
            }

            var8 = TraversalP.Mu.TYPE_TOKEN;
            var7 = new Traversal<Pair<K, ?>, Pair<K, ?>, FT, FR>() {
               @Override
               public <F extends K1> FunctionType<Pair<K, ?>, App<F, Pair<K, ?>>> wander(Applicative<F, ?> var1, FunctionType<FT, App<F, FR>> var2x) {
                  return var4x -> {
                     if (!var5.containsKey(var4x.getFirst())) {
                        return var1.point(var4x);
                     }

                     TypedOptic var5x = (TypedOptic)var5.get(var4x.getFirst());
                     return this.capTraversal(var1, var2, var4x, var5x);
                  };
               }

               private <S, T, F extends K1> App<F, Pair<K, ?>> capTraversal(
                  Applicative<F, ?> var1, FunctionType<FT, App<F, FR>> var2x, Pair<K, ?> var3x, TypedOptic<S, T, FT, FR> var4x
               ) {
                  Traversal var5x = Optics.toTraversal((Optic)var4x.upCast(TraversalP.Mu.TYPE_TOKEN).orElseThrow(IllegalArgumentException::new));
                  return var1.ap(var1x -> (Pair<K, ?>)Pair.of(var3.getFirst(), var1x), var5x.<F>wander(var1, var2x).apply((S)var3x.getSecond()));
               }
            };
         }

         Object2ObjectOpenHashMap var9 = new Object2ObjectOpenHashMap(this.types);
         ObjectIterator var10 = Object2ObjectMaps.fastIterable(var9).iterator();

         while (var10.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry var11 = (it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry)var10.next();
            TypedOptic var12 = (TypedOptic)var5.get(var11.getKey());
            if (var12 != null) {
               var11.setValue(var12.tType());
            }
         }

         return Either.left(new TypedOptic<>(var8, this, DSL.taggedChoiceType(this.name, this.keyType, var9), var1, var2, var7));
      }

      private <S, T, FT, FR> TypedOptic<Pair<K, ?>, Pair<K, ?>, FT, FR> cap(TaggedChoice.TaggedChoiceType<K> var1, K var2, TypedOptic<S, T, FT, FR> var3) {
         return TypedOptic.tagged(var1, var2, var3.sType(), var3.tType()).compose(var3);
      }

      @Override
      public Optional<TaggedChoice.TaggedChoiceType<?>> findChoiceType(String var1, int var2) {
         return Objects.equals(var1, this.name) ? Optional.of(this) : Optional.empty();
      }

      @Override
      public Optional<Type<?>> findCheckedType(int var1) {
         return this.types.values().stream().map(var1x -> var1x.findCheckedType(var1)).filter(Optional::isPresent).findFirst().flatMap(Function.identity());
      }

      @Override
      public boolean equals(Object var1, boolean var2, boolean var3) {
         if (this == var1) {
            return true;
         } else if (!(var1 instanceof TaggedChoice.TaggedChoiceType var4)) {
            return false;
         } else {
            if (!Objects.equals(this.name, var4.name)) {
               return false;
            }

            if (!this.keyType.equals(var4.keyType, var2, var3)) {
               return false;
            }

            if (this.types.size() != var4.types.size()) {
               return false;
            }

            ObjectIterator var5 = this.types.entrySet().iterator();

            while (var5.hasNext()) {
               Entry var6 = (Entry)var5.next();
               if (!((Type)var6.getValue()).equals(var4.types.get(var6.getKey()), var2, var3)) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public int hashCode() {
         return this.hashCode;
      }

      @Override
      public String toString() {
         return "TaggedChoiceType[" + this.name + ", " + Joiner.on(", \n").withKeyValueSeparator(" -> ").join(this.types) + "]\n";
      }

      public String getName() {
         return this.name;
      }

      public Type<K> getKeyType() {
         return this.keyType;
      }

      public boolean hasType(K var1) {
         return this.types.containsKey(var1);
      }

      public Map<K, Type<?>> types() {
         return this.types;
      }

      private static final class RewriteFunc<K> implements Function<DynamicOps<?>, Function<Pair<K, ?>, Pair<K, ?>>> {
         private final Map<K, ? extends RewriteResult<?, ?>> results;

         public RewriteFunc(Map<K, ? extends RewriteResult<?, ?>> var1) {
            this.results = var1;
         }

         public FunctionType<Pair<K, ?>, Pair<K, ?>> apply(DynamicOps<?> var1) {
            return var2 -> {
               RewriteResult var3 = this.results.get(var2.getFirst());
               return var3 == null ? var2 : this.capRuleApply(var1, var2, var3);
            };
         }

         private <A, B> Pair<K, B> capRuleApply(DynamicOps<?> var1, Pair<K, ?> var2, RewriteResult<A, B> var3) {
            return var2.mapSecond(var2x -> (B)((Function)var3.view().function().evalCached().apply(var1)).apply(var2x));
         }

         @Override
         public boolean equals(Object var1) {
            if (this == var1) {
               return true;
            } else if (var1 != null && this.getClass() == var1.getClass()) {
               TaggedChoice.TaggedChoiceType.RewriteFunc var2 = (TaggedChoice.TaggedChoiceType.RewriteFunc)var1;
               return Objects.equals(this.results, var2.results);
            } else {
               return false;
            }
         }

         @Override
         public int hashCode() {
            return this.results.hashCode();
         }
      }
   }
}
