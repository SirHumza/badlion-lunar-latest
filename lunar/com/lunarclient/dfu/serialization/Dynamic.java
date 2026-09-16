package com.lunarclient.dfu.serialization;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

public class Dynamic<T> extends DynamicLike<T> {
   private final T value;

   public Dynamic(DynamicOps<T> var1) {
      this(var1, (T)var1.empty());
   }

   public Dynamic(DynamicOps<T> var1, @Nullable T var2) {
      super(var1);
      this.value = (T)(var2 == null ? var1.empty() : var2);
   }

   public T getValue() {
      return this.value;
   }

   public Dynamic<T> map(Function<? super T, ? extends T> var1) {
      return new Dynamic<>(this.ops, (T)var1.apply(this.value));
   }

   public <U> Dynamic<U> castTyped(DynamicOps<U> var1) {
      if (!Objects.equals(this.ops, var1)) {
         throw new IllegalStateException("Dynamic type doesn't match");
      } else {
         return (Dynamic<U>)this;
      }
   }

   public <U> U cast(DynamicOps<U> var1) {
      return this.<U>castTyped(var1).getValue();
   }

   public OptionalDynamic<T> merge(Dynamic<?> var1) {
      DataResult var2 = this.ops.mergeToList(this.value, var1.cast(this.ops));
      return new OptionalDynamic<>(this.ops, var2.map(var1x -> new Dynamic<>(this.ops, (T)var1x)));
   }

   public OptionalDynamic<T> merge(Dynamic<?> var1, Dynamic<?> var2) {
      DataResult var3 = this.ops.mergeToMap(this.value, var1.cast(this.ops), var2.cast(this.ops));
      return new OptionalDynamic<>(this.ops, var3.map(var1x -> new Dynamic<>(this.ops, (T)var1x)));
   }

   public DataResult<Map<Dynamic<T>, Dynamic<T>>> getMapValues() {
      return this.ops.getMapValues(this.value).map(var1 -> {
         Builder var2 = ImmutableMap.builder();
         var1.forEach(var2x -> var2.put(new Dynamic<>(this.ops, var2x.getFirst()), new Dynamic<>(this.ops, var2x.getSecond())));
         return var2.build();
      });
   }

   public Dynamic<T> updateMapValues(Function<Pair<Dynamic<?>, Dynamic<?>>, Pair<Dynamic<?>, Dynamic<?>>> var1) {
      return DataFixUtils.orElse(this.getMapValues().map(var2 -> var2.entrySet().stream().map(var2x -> {
         Pair var3 = (Pair)var1.apply(Pair.of(var2x.getKey(), var2x.getValue()));
         return Pair.of(((Dynamic)var3.getFirst()).castTyped(this.ops), ((Dynamic)var3.getSecond()).castTyped(this.ops));
      }).collect(Pair.toMap())).map(this::createMap).result(), this);
   }

   @Override
   public DataResult<Number> asNumber() {
      return this.ops.getNumberValue(this.value);
   }

   @Override
   public DataResult<String> asString() {
      return this.ops.getStringValue(this.value);
   }

   @Override
   public DataResult<Boolean> asBoolean() {
      return this.ops.getBooleanValue(this.value);
   }

   @Override
   public DataResult<Stream<Dynamic<T>>> asStreamOpt() {
      return this.ops.getStream(this.value).map(var1 -> var1.map(var1x -> new Dynamic<>(this.ops, (T)var1x)));
   }

   @Override
   public DataResult<Stream<Pair<Dynamic<T>, Dynamic<T>>>> asMapOpt() {
      return this.ops
         .getMapValues(this.value)
         .map(var1 -> var1.map(var1x -> Pair.of(new Dynamic<>(this.ops, var1x.getFirst()), new Dynamic<>(this.ops, var1x.getSecond()))));
   }

   @Override
   public DataResult<ByteBuffer> asByteBufferOpt() {
      return this.ops.getByteBuffer(this.value);
   }

   @Override
   public DataResult<IntStream> asIntStreamOpt() {
      return this.ops.getIntStream(this.value);
   }

   @Override
   public DataResult<LongStream> asLongStreamOpt() {
      return this.ops.getLongStream(this.value);
   }

   @Override
   public OptionalDynamic<T> get(String var1) {
      return new OptionalDynamic<>(this.ops, this.ops.getMap(this.value).flatMap(var2 -> {
         Object var3 = var2.get(var1);
         return var3 == null ? DataResult.error(() -> "key missing: " + var1 + " in " + this.value) : DataResult.success(new Dynamic<>(this.ops, (T)var3));
      }));
   }

   @Override
   public DataResult<T> getGeneric(T var1) {
      return this.ops.getGeneric(this.value, (T)var1);
   }

   @CheckReturnValue
   public Dynamic<T> remove(String var1) {
      return this.map(var2 -> this.ops.remove((T)var2, var1));
   }

   @CheckReturnValue
   public Dynamic<T> set(String var1, Dynamic<?> var2) {
      return this.map(var3 -> this.ops.set((T)var3, var1, var2.cast(this.ops)));
   }

   @CheckReturnValue
   public Dynamic<T> update(String var1, Function<Dynamic<?>, Dynamic<?>> var2) {
      return this.map(var3 -> this.ops.update((T)var3, var1, var2xx -> ((Dynamic)var2.apply(new Dynamic<>(this.ops, var2xx))).cast(this.ops)));
   }

   @CheckReturnValue
   public Dynamic<T> updateGeneric(T var1, Function<T, T> var2) {
      return this.map(var3 -> this.ops.updateGeneric((T)var3, (T)var1, var2));
   }

   @CheckReturnValue
   public Dynamic<T> setFieldIfPresent(String var1, Optional<? extends Dynamic<?>> var2) {
      return var2.isEmpty() ? this : this.set(var1, (Dynamic<?>)var2.get());
   }

   @CheckReturnValue
   public Dynamic<T> renameField(String var1, String var2) {
      return this.renameAndFixField(var1, var2, UnaryOperator.identity());
   }

   @CheckReturnValue
   public Dynamic<T> replaceField(String var1, String var2, Optional<? extends Dynamic<?>> var3) {
      return this.remove(var1).setFieldIfPresent(var2, var3);
   }

   @CheckReturnValue
   public Dynamic<T> renameAndFixField(String var1, String var2, UnaryOperator<Dynamic<?>> var3) {
      return this.remove(var1).setFieldIfPresent(var2, this.get(var1).result().map(var3));
   }

   @Override
   public DataResult<T> getElement(String var1) {
      return this.getElementGeneric(this.ops.createString(var1));
   }

   @Override
   public DataResult<T> getElementGeneric(T var1) {
      return this.ops.getGeneric(this.value, (T)var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Dynamic var2 = (Dynamic)var1;
         return Objects.equals(this.ops, var2.ops) && Objects.equals(this.value, var2.value);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.value.hashCode();
      return 31 * var1 + this.ops.hashCode();
   }

   @Override
   public String toString() {
      return String.format("%s[%s]", this.ops, this.value);
   }

   public <R> Dynamic<R> convert(DynamicOps<R> var1) {
      return (Dynamic<R>)(new Dynamic<>(var1, convert(this.ops, var1, this.value)));
   }

   public <V> V into(Function<? super Dynamic<T>, ? extends V> var1) {
      return (V)var1.apply(this);
   }

   @Override
   public <A> DataResult<Pair<A, T>> decode(Decoder<? extends A> var1) {
      return var1.decode(this.ops, this.value).map(var0 -> var0.mapFirst(Function.identity()));
   }

   public static <S, T> T convert(DynamicOps<S> var0, DynamicOps<T> var1, S var2) {
      return (T)(Objects.equals(var0, var1) ? var2 : var0.convertTo(var1, var2));
   }

   @CheckReturnValue
   public static Dynamic<?> copyField(Dynamic<?> var0, String var1, Dynamic<?> var2, String var3) {
      return copyAndFixField(var0, var1, var2, var3, UnaryOperator.identity());
   }

   @CheckReturnValue
   public static <T> Dynamic<?> copyAndFixField(Dynamic<T> var0, String var1, Dynamic<?> var2, String var3, UnaryOperator<Dynamic<T>> var4) {
      Optional var5 = var0.get(var1).result();
      return var5.isPresent() ? var2.set(var3, (Dynamic<?>)var4.apply((Dynamic)var5.get())) : var2;
   }
}
