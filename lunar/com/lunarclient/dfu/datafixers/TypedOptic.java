package com.lunarclient.dfu.datafixers;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.reflect.TypeToken;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.App2;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.kinds.K2;
import com.lunarclient.dfu.datafixers.optics.InjTagged;
import com.lunarclient.dfu.datafixers.optics.Optic;
import com.lunarclient.dfu.datafixers.optics.Optics;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.Cocartesian;
import com.lunarclient.dfu.datafixers.optics.profunctors.Profunctor;
import com.lunarclient.dfu.datafixers.optics.profunctors.TraversalP;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.templates.TaggedChoice;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public record TypedOptic<S, T, A, B>() {
   private final Set<TypeToken<? extends K1>> bounds;
   private final List<? extends TypedOptic.Element<?, ?, ?, ?>> elements;

   public TypedOptic(TypeToken<? extends K1> var1, Type<S> var2, Type<T> var3, Type<A> var4, Type<B> var5, Optic<?, S, T, A, B> var6) {
      this(ImmutableSet.of(var1), var2, var3, var4, var5, var6);
   }

   public TypedOptic(Set<TypeToken<? extends K1>> var1, Type<S> var2, Type<T> var3, Type<A> var4, Type<B> var5, Optic<?, S, T, A, B> var6) {
      this(var1, List.of(new TypedOptic.Element(var2, var3, var4, var5, var6)));
   }

   public TypedOptic(Set<TypeToken<? extends K1>> var1, List<? extends TypedOptic.Element<?, ?, ?, ?>> var2) {
      this.bounds = var1;
      this.elements = var2;
   }

   public <P extends K2, Proof2 extends K1> App2<P, S, T> apply(TypeToken<Proof2> var1, App<Proof2, P> var2, App2<P, A, B> var3) {
      return this.<Proof2>upCast(var1).orElseThrow(() -> new IllegalArgumentException("Couldn't upcast")).<P>eval(var2).apply(var3);
   }

   public Optic<?, S, T, ?, ?> outermost() {
      return this.outermostElement().optic();
   }

   public Optic<?, ?, ?, A, B> innermost() {
      return this.innermostElement().optic();
   }

   private TypedOptic.Element<S, T, ?, ?> outermostElement() {
      return (TypedOptic.Element<S, T, ?, ?>)this.elements.get(0);
   }

   private TypedOptic.Element<?, ?, A, B> innermostElement() {
      return (TypedOptic.Element<?, ?, A, B>)this.elements.get(this.elements.size() - 1);
   }

   public Type<S> sType() {
      return this.outermostElement().sType();
   }

   public Type<T> tType() {
      return this.outermostElement().tType();
   }

   public Type<A> aType() {
      return this.innermostElement().aType();
   }

   public Type<B> bType() {
      return this.innermostElement().bType();
   }

   public <A1, B1> TypedOptic<S, T, A1, B1> compose(TypedOptic<A, B, A1, B1> var1) {
      Builder var2 = ImmutableSet.builder();
      var2.addAll(this.bounds);
      var2.addAll(var1.bounds);
      com.google.common.collect.ImmutableList.Builder var3 = ImmutableList.builderWithExpectedSize(this.elements().size() + var1.elements().size());
      var3.addAll(this.elements());
      var3.addAll(var1.elements());
      return (TypedOptic<S, T, A1, B1>)(new TypedOptic<>(var2.build(), var3.build()));
   }

   public <Proof2 extends K1> Optional<Optic<? super Proof2, S, T, A, B>> upCast(TypeToken<Proof2> var1) {
      if (instanceOf(this.bounds, var1)) {
         if (this.elements.size() == 1) {
            return Optional.of((Optic<? super Proof2, S, T, A, B>)this.elements.get(0).optic());
         }

         List var2 = this.elements.stream().map(var0 -> var0.optic()).collect(Collectors.toList());
         return Optional.of(new Optic.CompositionOptic<>(var2));
      } else {
         return Optional.empty();
      }
   }

   public static <Proof2 extends K1> boolean instanceOf(Collection<TypeToken<? extends K1>> var0, TypeToken<Proof2> var1) {
      return var0.stream().allMatch(var1x -> var1x.isSupertypeOf(var1));
   }

   public static <S, T> TypedOptic<S, T, S, T> adapter(Type<S> var0, Type<T> var1) {
      return new TypedOptic<>(Profunctor.Mu.TYPE_TOKEN, var0, var1, var0, var1, Optics.id());
   }

   public static <F, G, F2> TypedOptic<Pair<F, G>, Pair<F2, G>, F, F2> proj1(Type<F> var0, Type<G> var1, Type<F2> var2) {
      return new TypedOptic<>(Cartesian.Mu.TYPE_TOKEN, DSL.and(var0, var1), (Type<Pair<F2, G>>)DSL.and(var2, var1), var0, var2, Optics.proj1());
   }

   public static <F, G, G2> TypedOptic<Pair<F, G>, Pair<F, G2>, G, G2> proj2(Type<F> var0, Type<G> var1, Type<G2> var2) {
      return new TypedOptic<>(Cartesian.Mu.TYPE_TOKEN, DSL.and(var0, var1), (Type<Pair<F, G2>>)DSL.and(var0, var2), var1, var2, Optics.proj2());
   }

   public static <F, G, F2> TypedOptic<Either<F, G>, Either<F2, G>, F, F2> inj1(Type<F> var0, Type<G> var1, Type<F2> var2) {
      return new TypedOptic<>(Cocartesian.Mu.TYPE_TOKEN, DSL.or(var0, var1), (Type<Either<F2, G>>)DSL.or(var2, var1), var0, var2, Optics.inj1());
   }

   public static <F, G, G2> TypedOptic<Either<F, G>, Either<F, G2>, G, G2> inj2(Type<F> var0, Type<G> var1, Type<G2> var2) {
      return new TypedOptic<>(Cocartesian.Mu.TYPE_TOKEN, DSL.or(var0, var1), (Type<Either<F, G2>>)DSL.or(var0, var2), var1, var2, Optics.inj2());
   }

   public static <K, V, K2> TypedOptic<List<Pair<K, V>>, List<Pair<K2, V>>, K, K2> compoundListKeys(Type<K> var0, Type<K2> var1, Type<V> var2) {
      return (TypedOptic<List<Pair<K, V>>, List<Pair<K2, V>>, K, K2>)new TypedOptic<>(
            TraversalP.Mu.TYPE_TOKEN,
            DSL.compoundList(var0, var2),
            DSL.compoundList(var1, var2),
            DSL.and(var0, var2),
            DSL.and(var1, var2),
            Optics.listTraversal()
         )
         .compose(
            (TypedOptic<Pair<K, V>, Pair<K, V>, K, K2>)(new TypedOptic<>(
               TraversalP.Mu.TYPE_TOKEN, DSL.and(var0, var2), DSL.and(var1, var2), var0, var1, Optics.proj1()
            ))
         );
   }

   public static <K, V, V2> TypedOptic<List<Pair<K, V>>, List<Pair<K, V2>>, V, V2> compoundListElements(Type<K> var0, Type<V> var1, Type<V2> var2) {
      return (TypedOptic<List<Pair<K, V>>, List<Pair<K, V2>>, V, V2>)new TypedOptic<>(
            TraversalP.Mu.TYPE_TOKEN,
            DSL.compoundList(var0, var1),
            DSL.compoundList(var0, var2),
            DSL.and(var0, var1),
            DSL.and(var0, var2),
            Optics.listTraversal()
         )
         .compose(
            (TypedOptic<Pair<K, V>, Pair<K, V>, V, V2>)(new TypedOptic<>(
               TraversalP.Mu.TYPE_TOKEN, DSL.and(var0, var1), DSL.and(var0, var2), var1, var2, Optics.proj2()
            ))
         );
   }

   public static <A, B> TypedOptic<List<A>, List<B>, A, B> list(Type<A> var0, Type<B> var1) {
      return new TypedOptic<>(TraversalP.Mu.TYPE_TOKEN, DSL.list(var0), DSL.list(var1), var0, var1, Optics.listTraversal());
   }

   public static <K, A, B> TypedOptic<Pair<K, ?>, Pair<K, ?>, A, B> tagged(TaggedChoice.TaggedChoiceType<K> var0, K var1, Type<A> var2, Type<B> var3) {
      return new TypedOptic<>(Cocartesian.Mu.TYPE_TOKEN, var0, replaceTagged(var0, (K)var1, var2, var3), var2, var3, new InjTagged<>((K)var1));
   }

   private static <K, A, B> Type<Pair<K, ?>> replaceTagged(TaggedChoice.TaggedChoiceType<K> var0, K var1, Type<A> var2, Type<B> var3) {
      if (Objects.equals(var2, var3)) {
         return var0;
      }

      if (!Objects.equals(var0.types().get(var1), var2)) {
         throw new IllegalArgumentException("Focused type doesn't match.");
      }

      HashMap var4 = Maps.newHashMap(var0.types());
      var4.put(var1, var3);
      return DSL.taggedChoiceType(var0.getName(), var0.getKeyType(), var4);
   }

   public TypedOptic<S, T, A, B> castOuter(Type<S> var1, Type<T> var2) {
      return this.castOuterUnchecked(var1, var2);
   }

   public <S2, T2> TypedOptic<S2, T2, A, B> castOuterUnchecked(Type<S2> var1, Type<T2> var2) {
      ArrayList var3 = new ArrayList<>(this.elements);
      var3.set(0, ((TypedOptic.Element)var3.get(0)).castOuterUnchecked(var1, var2));
      return (TypedOptic<S2, T2, A, B>)(new TypedOptic<>(this.bounds, var3));
   }

   @Override
   public String toString() {
      return "(" + this.elements.stream().map(Object::toString).collect(Collectors.joining(" ◦ ")) + ")";
   }

   public record Element<S, T, A, B>() {
      private final Type<S> sType;
      private final Type<T> tType;
      private final Type<A> aType;
      private final Type<B> bType;
      private final Optic<?, S, T, A, B> optic;

      public Element(Type<S> var1, Type<T> var2, Type<A> var3, Type<B> var4, Optic<?, S, T, A, B> var5) {
         this.sType = var1;
         this.tType = var2;
         this.aType = var3;
         this.bType = var4;
         this.optic = var5;
      }

      public <S2, T2> TypedOptic.Element<S2, T2, A, B> castOuterUnchecked(Type<S2> var1, Type<T2> var2) {
         return (TypedOptic.Element<S2, T2, A, B>)(new TypedOptic.Element<>(var1, var2, this.aType, this.bType, this.optic));
      }

      @Override
      public String toString() {
         return this.optic.toString();
      }
   }
}
