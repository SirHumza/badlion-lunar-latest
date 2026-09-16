package com.lunarclient.dfu.datafixers;

import com.google.common.collect.Maps;
import com.google.common.collect.ObjectArrays;
import com.lunarclient.dfu.datafixers.schemas.Schema;
import com.lunarclient.dfu.datafixers.types.Func;
import com.lunarclient.dfu.datafixers.types.Type;
import com.lunarclient.dfu.datafixers.types.constant.EmptyPart;
import com.lunarclient.dfu.datafixers.types.constant.EmptyPartPassthrough;
import com.lunarclient.dfu.datafixers.types.templates.Check;
import com.lunarclient.dfu.datafixers.types.templates.CompoundList;
import com.lunarclient.dfu.datafixers.types.templates.Const;
import com.lunarclient.dfu.datafixers.types.templates.Hook;
import com.lunarclient.dfu.datafixers.types.templates.List;
import com.lunarclient.dfu.datafixers.types.templates.Named;
import com.lunarclient.dfu.datafixers.types.templates.Product;
import com.lunarclient.dfu.datafixers.types.templates.RecursivePoint;
import com.lunarclient.dfu.datafixers.types.templates.Sum;
import com.lunarclient.dfu.datafixers.types.templates.Tag;
import com.lunarclient.dfu.datafixers.types.templates.TaggedChoice;
import com.lunarclient.dfu.datafixers.types.templates.TypeTemplate;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public interface DSL {
   static Type<Boolean> bool() {
      return DSL.Instances.BOOL_TYPE;
   }

   static Type<Integer> intType() {
      return DSL.Instances.INT_TYPE;
   }

   static Type<Long> longType() {
      return DSL.Instances.LONG_TYPE;
   }

   static Type<Byte> byteType() {
      return DSL.Instances.BYTE_TYPE;
   }

   static Type<Short> shortType() {
      return DSL.Instances.SHORT_TYPE;
   }

   static Type<Float> floatType() {
      return DSL.Instances.FLOAT_TYPE;
   }

   static Type<Double> doubleType() {
      return DSL.Instances.DOUBLE_TYPE;
   }

   static Type<String> string() {
      return DSL.Instances.STRING_TYPE;
   }

   static TypeTemplate emptyPart() {
      return constType(DSL.Instances.EMPTY_PART);
   }

   static Type<Unit> emptyPartType() {
      return DSL.Instances.EMPTY_PART;
   }

   static TypeTemplate remainder() {
      return constType(DSL.Instances.EMPTY_PASSTHROUGH);
   }

   static Type<Dynamic<?>> remainderType() {
      return DSL.Instances.EMPTY_PASSTHROUGH;
   }

   static TypeTemplate check(String var0, int var1, TypeTemplate var2) {
      return new Check(var0, var1, var2);
   }

   static TypeTemplate compoundList(TypeTemplate var0) {
      return compoundList(constType(string()), var0);
   }

   static <V> CompoundList.CompoundListType<String, V> compoundList(Type<V> var0) {
      return compoundList(string(), var0);
   }

   static TypeTemplate compoundList(TypeTemplate var0, TypeTemplate var1) {
      return and(new CompoundList(var0, var1), remainder());
   }

   static <K, V> CompoundList.CompoundListType<K, V> compoundList(Type<K> var0, Type<V> var1) {
      return new CompoundList.CompoundListType<>(var0, var1);
   }

   static TypeTemplate constType(Type<?> var0) {
      return new Const(var0);
   }

   static TypeTemplate hook(TypeTemplate var0, Hook.HookFunction var1, Hook.HookFunction var2) {
      return new Hook(var0, var1, var2);
   }

   static <A> Type<A> hook(Type<A> var0, Hook.HookFunction var1, Hook.HookFunction var2) {
      return new Hook.HookType<>(var0, var1, var2);
   }

   static TypeTemplate list(TypeTemplate var0) {
      return new List(var0);
   }

   static <A> List.ListType<A> list(Type<A> var0) {
      return new List.ListType<>(var0);
   }

   static TypeTemplate named(String var0, TypeTemplate var1) {
      return new Named(var0, var1);
   }

   static <A> Type<Pair<String, A>> named(String var0, Type<A> var1) {
      return new Named.NamedType<>(var0, var1);
   }

   static TypeTemplate and(TypeTemplate var0, TypeTemplate var1) {
      return new Product(var0, var1);
   }

   static TypeTemplate and(TypeTemplate var0, TypeTemplate... var1) {
      if (var1.length == 0) {
         return var0;
      }

      TypeTemplate var2 = var1[var1.length - 1];

      for (int var3 = var1.length - 2; var3 >= 0; var3--) {
         var2 = and(var1[var3], var2);
      }

      return and(var0, var2);
   }

   static TypeTemplate and(java.util.List<TypeTemplate> var0) {
      return switch (var0.size()) {
         case 0 -> throw new IllegalArgumentException("Must have at least one type");
         case 1 -> (TypeTemplate)var0.get(0);
         default -> and((TypeTemplate)var0.get(0), var0.subList(1, var0.size()).toArray(TypeTemplate[]::new));
      };
   }

   static TypeTemplate allWithRemainder(TypeTemplate var0, TypeTemplate... var1) {
      return and(var0, (TypeTemplate[])ObjectArrays.concat(var1, remainder()));
   }

   static <F, G> Type<Pair<F, G>> and(Type<F> var0, Type<G> var1) {
      return new Product.ProductType<>(var0, var1);
   }

   static <F, G, H> Type<Pair<F, Pair<G, H>>> and(Type<F> var0, Type<G> var1, Type<H> var2) {
      return and(var0, (Type<Pair<G, H>>)and(var1, var2));
   }

   static <F, G, H, I> Type<Pair<F, Pair<G, Pair<H, I>>>> and(Type<F> var0, Type<G> var1, Type<H> var2, Type<I> var3) {
      return and(var0, and(var1, and(var2, var3)));
   }

   static TypeTemplate id(int var0) {
      return new RecursivePoint(var0);
   }

   static TypeTemplate or(TypeTemplate var0, TypeTemplate var1) {
      return new Sum(var0, var1);
   }

   static <F, G> Type<Either<F, G>> or(Type<F> var0, Type<G> var1) {
      return new Sum.SumType<>(var0, var1);
   }

   static TypeTemplate field(String var0, TypeTemplate var1) {
      return new Tag(var0, var1);
   }

   static <A> Tag.TagType<A> field(String var0, Type<A> var1) {
      return new Tag.TagType<>(var0, var1);
   }

   static <K> TaggedChoice<K> taggedChoice(String var0, Type<K> var1, Map<K, TypeTemplate> var2) {
      return new TaggedChoice<>(var0, var1, new Object2ObjectOpenHashMap(var2));
   }

   static <K> TaggedChoice<K> taggedChoiceLazy(String var0, Type<K> var1, Map<K, Supplier<TypeTemplate>> var2) {
      return taggedChoice(
         var0,
         var1,
         var2.entrySet()
            .stream()
            .map(var0x -> Pair.of(var0x.getKey(), (TypeTemplate)((Supplier)var0x.getValue()).get()))
            .collect((Collector<? super Pair<Object, Object>, ?, Map<K, TypeTemplate>>)Pair.toMap())
      );
   }

   static <K> Type<Pair<K, ?>> taggedChoiceType(String var0, Type<K> var1, Map<K, ? extends Type<?>> var2) {
      return (Type<Pair<K, ?>>)DSL.Instances.TAGGED_CHOICE_TYPE_CACHE
         .computeIfAbsent(new DSL.Instances.TaggedChoiceCacheKey(var0, var1, var2), DSL.Instances.TaggedChoiceCacheKey::build);
   }

   static <A, B> Type<Function<A, B>> func(Type<A> var0, Type<B> var1) {
      return new Func<>(var0, var1);
   }

   static <A> Type<Either<A, Unit>> optional(Type<A> var0) {
      return or(var0, emptyPartType());
   }

   static TypeTemplate optional(TypeTemplate var0) {
      return or(var0, emptyPart());
   }

   static TypeTemplate fields(String var0, TypeTemplate var1) {
      return allWithRemainder(field(var0, var1));
   }

   static TypeTemplate fields(String var0, TypeTemplate var1, String var2, TypeTemplate var3) {
      return allWithRemainder(field(var0, var1), field(var2, var3));
   }

   static TypeTemplate fields(String var0, TypeTemplate var1, String var2, TypeTemplate var3, String var4, TypeTemplate var5) {
      return allWithRemainder(field(var0, var1), field(var2, var3), field(var4, var5));
   }

   static TypeTemplate fields(String var0, TypeTemplate var1, TypeTemplate var2) {
      return and(field(var0, var1), var2);
   }

   static TypeTemplate fields(String var0, TypeTemplate var1, String var2, TypeTemplate var3, TypeTemplate var4) {
      return and(field(var0, var1), field(var2, var3), var4);
   }

   static TypeTemplate fields(String var0, TypeTemplate var1, String var2, TypeTemplate var3, String var4, TypeTemplate var5, TypeTemplate var6) {
      return and(field(var0, var1), field(var2, var3), field(var4, var5), var6);
   }

   static TypeTemplate optionalFields(String var0, TypeTemplate var1) {
      return allWithRemainder(optional(field(var0, var1)));
   }

   static TypeTemplate optionalFields(String var0, TypeTemplate var1, String var2, TypeTemplate var3) {
      return allWithRemainder(optional(field(var0, var1)), optional(field(var2, var3)));
   }

   static TypeTemplate optionalFields(String var0, TypeTemplate var1, String var2, TypeTemplate var3, String var4, TypeTemplate var5) {
      return allWithRemainder(optional(field(var0, var1)), optional(field(var2, var3)), optional(field(var4, var5)));
   }

   static TypeTemplate optionalFields(
      String var0, TypeTemplate var1, String var2, TypeTemplate var3, String var4, TypeTemplate var5, String var6, TypeTemplate var7
   ) {
      return allWithRemainder(optional(field(var0, var1)), optional(field(var2, var3)), optional(field(var4, var5)), optional(field(var6, var7)));
   }

   static TypeTemplate optionalFields(
      String var0,
      TypeTemplate var1,
      String var2,
      TypeTemplate var3,
      String var4,
      TypeTemplate var5,
      String var6,
      TypeTemplate var7,
      String var8,
      TypeTemplate var9
   ) {
      return allWithRemainder(
         optional(field(var0, var1)), optional(field(var2, var3)), optional(field(var4, var5)), optional(field(var6, var7)), optional(field(var8, var9))
      );
   }

   static TypeTemplate optionalFields(String var0, TypeTemplate var1, TypeTemplate var2) {
      return and(optional(field(var0, var1)), var2);
   }

   static TypeTemplate optionalFields(String var0, TypeTemplate var1, String var2, TypeTemplate var3, TypeTemplate var4) {
      return and(optional(field(var0, var1)), optional(field(var2, var3)), var4);
   }

   static TypeTemplate optionalFields(String var0, TypeTemplate var1, String var2, TypeTemplate var3, String var4, TypeTemplate var5, TypeTemplate var6) {
      return and(optional(field(var0, var1)), optional(field(var2, var3)), optional(field(var4, var5)), var6);
   }

   static TypeTemplate optionalFields(
      String var0, TypeTemplate var1, String var2, TypeTemplate var3, String var4, TypeTemplate var5, String var6, TypeTemplate var7, TypeTemplate var8
   ) {
      return and(optional(field(var0, var1)), optional(field(var2, var3)), optional(field(var4, var5)), optional(field(var6, var7)), var8);
   }

   static TypeTemplate optionalFields(
      String var0,
      TypeTemplate var1,
      String var2,
      TypeTemplate var3,
      String var4,
      TypeTemplate var5,
      String var6,
      TypeTemplate var7,
      String var8,
      TypeTemplate var9,
      TypeTemplate var10
   ) {
      return and(
         optional(field(var0, var1)), optional(field(var2, var3)), optional(field(var4, var5)), optional(field(var6, var7)), optional(field(var8, var9)), var10
      );
   }

   @SafeVarargs
   static TypeTemplate optionalFields(Pair<String, TypeTemplate>... var0) {
      return and(
         Stream.concat(Arrays.stream(var0).map(var0x -> optional(field((String)var0x.getFirst(), (TypeTemplate)var0x.getSecond()))), Stream.of(remainder()))
            .toList()
      );
   }

   static TypeTemplate optionalFieldsLazy(Map<String, Supplier<TypeTemplate>> var0) {
      return and(
         Stream.concat(
               var0.entrySet().stream().map(var0x -> optional(field((String)var0x.getKey(), (TypeTemplate)((Supplier)var0x.getValue()).get()))),
               Stream.of(remainder())
            )
            .toList()
      );
   }

   static OpticFinder<Dynamic<?>> remainderFinder() {
      return DSL.Instances.REMAINDER_FINDER;
   }

   static <FT> OpticFinder<FT> typeFinder(Type<FT> var0) {
      return new FieldFinder<>(null, var0);
   }

   static <FT> OpticFinder<FT> fieldFinder(String var0, Type<FT> var1) {
      return new FieldFinder<>(var0, var1);
   }

   static <FT> OpticFinder<FT> namedChoice(String var0, Type<FT> var1) {
      return new NamedChoiceFinder<>(var0, var1);
   }

   static Unit unit() {
      return Unit.INSTANCE;
   }

   final class Instances {
      private static final Type<Boolean> BOOL_TYPE = new Const.PrimitiveType<>(Codec.BOOL);
      private static final Type<Integer> INT_TYPE = new Const.PrimitiveType<>(Codec.INT);
      private static final Type<Long> LONG_TYPE = new Const.PrimitiveType<>(Codec.LONG);
      private static final Type<Byte> BYTE_TYPE = new Const.PrimitiveType<>(Codec.BYTE);
      private static final Type<Short> SHORT_TYPE = new Const.PrimitiveType<>(Codec.SHORT);
      private static final Type<Float> FLOAT_TYPE = new Const.PrimitiveType<>(Codec.FLOAT);
      private static final Type<Double> DOUBLE_TYPE = new Const.PrimitiveType<>(Codec.DOUBLE);
      private static final Type<String> STRING_TYPE = new Const.PrimitiveType<>(Codec.STRING);
      private static final Type<Unit> EMPTY_PART = new EmptyPart();
      private static final Type<Dynamic<?>> EMPTY_PASSTHROUGH = new EmptyPartPassthrough();
      private static final OpticFinder<Dynamic<?>> REMAINDER_FINDER = DSL.remainderType().finder();
      private static final Map<DSL.Instances.TaggedChoiceCacheKey<?>, Type<? extends Pair<?, ?>>> TAGGED_CHOICE_TYPE_CACHE = Maps.newConcurrentMap();

      public record TaggedChoiceCacheKey<K>() {
         private final String name;
         private final Type<K> keyType;
         private final Map<K, ? extends Type<?>> types;

         public TaggedChoiceCacheKey(String var1, Type<K> var2, Map<K, ? extends Type<?>> var3) {
            this.name = var1;
            this.keyType = var2;
            this.types = var3;
         }

         public TaggedChoice.TaggedChoiceType<K> build() {
            return new TaggedChoice.TaggedChoiceType<>(this.name, this.keyType, new Object2ObjectOpenHashMap(this.types));
         }
      }
   }

   interface TypeReference {
      String typeName();

      default TypeTemplate in(Schema var1) {
         return var1.id(this.typeName());
      }
   }
}
