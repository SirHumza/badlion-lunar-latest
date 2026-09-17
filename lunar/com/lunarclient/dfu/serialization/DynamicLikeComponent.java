package com.lunarclient.dfu.serialization;

import com.lunarclient.dfu.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class OptionalDynamic<T> extends DynamicLike<T> {
   private final DataResult<Dynamic<T>> delegate;

   public OptionalDynamic(DynamicOps<T> var1, DataResult<Dynamic<T>> var2) {
      super(var1);
      this.delegate = var2;
   }

   public DataResult<Dynamic<T>> get() {
      return this.delegate;
   }

   public Optional<Dynamic<T>> result() {
      return this.delegate.result();
   }

   public <U> DataResult<U> map(Function<? super Dynamic<T>, U> var1) {
      return this.delegate.map(var1);
   }

   public <U> DataResult<U> flatMap(Function<? super Dynamic<T>, ? extends DataResult<U>> var1) {
      return this.delegate.flatMap(var1);
   }

   @Override
   public DataResult<Number> asNumber() {
      return this.flatMap(DynamicLike::asNumber);
   }

   @Override
   public DataResult<String> asString() {
      return this.flatMap(DynamicLike::asString);
   }

   @Override
   public DataResult<Boolean> asBoolean() {
      return this.flatMap(DynamicLike::asBoolean);
   }

   @Override
   public DataResult<Stream<Dynamic<T>>> asStreamOpt() {
      return this.flatMap(DynamicLike::asStreamOpt);
   }

   @Override
   public DataResult<Stream<Pair<Dynamic<T>, Dynamic<T>>>> asMapOpt() {
      return this.flatMap(DynamicLike::asMapOpt);
   }

   @Override
   public DataResult<ByteBuffer> asByteBufferOpt() {
      return this.flatMap(DynamicLike::asByteBufferOpt);
   }

   @Override
   public DataResult<IntStream> asIntStreamOpt() {
      return this.flatMap(DynamicLike::asIntStreamOpt);
   }

   @Override
   public DataResult<LongStream> asLongStreamOpt() {
      return this.flatMap(DynamicLike::asLongStreamOpt);
   }

   @Override
   public OptionalDynamic<T> get(String var1) {
      return new OptionalDynamic<>(this.ops, this.delegate.flatMap(var1x -> var1x.get(var1).delegate));
   }

   @Override
   public DataResult<T> getGeneric(T var1) {
      return this.flatMap(var1x -> var1x.getGeneric((T)var1));
   }

   @Override
   public DataResult<T> getElement(String var1) {
      return this.flatMap(var1x -> var1x.getElement(var1));
   }

   @Override
   public DataResult<T> getElementGeneric(T var1) {
      return this.flatMap(var1x -> var1x.getElementGeneric((T)var1));
   }

   public Dynamic<T> orElseEmptyMap() {
      return this.result().orElseGet(this::emptyMap);
   }

   public Dynamic<T> orElseEmptyList() {
      return this.result().orElseGet(this::emptyList);
   }

   public <V> DataResult<V> into(Function<? super Dynamic<T>, ? extends V> var1) {
      return this.delegate.map(var1);
   }

   @Override
   public <A> DataResult<Pair<A, T>> decode(Decoder<? extends A> var1) {
      return this.delegate.flatMap(var1x -> var1x.decode(var1));
   }
}
