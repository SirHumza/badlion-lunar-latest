package com.lunarclient.dfu.serialization;

import com.google.common.base.Suppliers;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.codecs.CompoundListCodec;
import com.lunarclient.dfu.serialization.codecs.DispatchedMapCodec;
import com.lunarclient.dfu.serialization.codecs.EitherCodec;
import com.lunarclient.dfu.serialization.codecs.EitherMapCodec;
import com.lunarclient.dfu.serialization.codecs.ListCodec;
import com.lunarclient.dfu.serialization.codecs.OptionalFieldCodec;
import com.lunarclient.dfu.serialization.codecs.PairCodec;
import com.lunarclient.dfu.serialization.codecs.PairMapCodec;
import com.lunarclient.dfu.serialization.codecs.PrimitiveCodec;
import com.lunarclient.dfu.serialization.codecs.SimpleMapCodec;
import com.lunarclient.dfu.serialization.codecs.UnboundedMapCodec;
import com.lunarclient.dfu.serialization.codecs.XorCodec;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public interface Codec<A> extends Decoder<A>, Encoder<A> {
   PrimitiveCodec<Boolean> BOOL = new PrimitiveCodec<Boolean>() {
      @Override
      public <T> DataResult<Boolean> read(DynamicOps<T> var1, T var2) {
         return var1.getBooleanValue(var2);
      }

      public <T> T write(DynamicOps<T> var1, Boolean var2) {
         return (T)var1.createBoolean(var2);
      }

      @Override
      public String toString() {
         return "Bool";
      }
   };
   PrimitiveCodec<Byte> BYTE = new PrimitiveCodec<Byte>() {
      @Override
      public <T> DataResult<Byte> read(DynamicOps<T> var1, T var2) {
         return var1.getNumberValue(var2).map(Number::byteValue);
      }

      public <T> T write(DynamicOps<T> var1, Byte var2) {
         return (T)var1.createByte(var2);
      }

      @Override
      public String toString() {
         return "Byte";
      }
   };
   PrimitiveCodec<Short> SHORT = new PrimitiveCodec<Short>() {
      @Override
      public <T> DataResult<Short> read(DynamicOps<T> var1, T var2) {
         return var1.getNumberValue(var2).map(Number::shortValue);
      }

      public <T> T write(DynamicOps<T> var1, Short var2) {
         return (T)var1.createShort(var2);
      }

      @Override
      public String toString() {
         return "Short";
      }
   };
   PrimitiveCodec<Integer> INT = new PrimitiveCodec<Integer>() {
      @Override
      public <T> DataResult<Integer> read(DynamicOps<T> var1, T var2) {
         return var1.getNumberValue(var2).map(Number::intValue);
      }

      public <T> T write(DynamicOps<T> var1, Integer var2) {
         return (T)var1.createInt(var2);
      }

      @Override
      public String toString() {
         return "Int";
      }
   };
   PrimitiveCodec<Long> LONG = new PrimitiveCodec<Long>() {
      @Override
      public <T> DataResult<Long> read(DynamicOps<T> var1, T var2) {
         return var1.getNumberValue(var2).map(Number::longValue);
      }

      public <T> T write(DynamicOps<T> var1, Long var2) {
         return (T)var1.createLong(var2);
      }

      @Override
      public String toString() {
         return "Long";
      }
   };
   PrimitiveCodec<Float> FLOAT = new PrimitiveCodec<Float>() {
      @Override
      public <T> DataResult<Float> read(DynamicOps<T> var1, T var2) {
         return var1.getNumberValue(var2).map(Number::floatValue);
      }

      public <T> T write(DynamicOps<T> var1, Float var2) {
         return (T)var1.createFloat(var2);
      }

      @Override
      public String toString() {
         return "Float";
      }
   };
   PrimitiveCodec<Double> DOUBLE = new PrimitiveCodec<Double>() {
      @Override
      public <T> DataResult<Double> read(DynamicOps<T> var1, T var2) {
         return var1.getNumberValue(var2).map(Number::doubleValue);
      }

      public <T> T write(DynamicOps<T> var1, Double var2) {
         return (T)var1.createDouble(var2);
      }

      @Override
      public String toString() {
         return "Double";
      }
   };
   PrimitiveCodec<String> STRING = new PrimitiveCodec<String>() {
      @Override
      public <T> DataResult<String> read(DynamicOps<T> var1, T var2) {
         return var1.getStringValue(var2);
      }

      public <T> T write(DynamicOps<T> var1, String var2) {
         return (T)var1.createString(var2);
      }

      @Override
      public String toString() {
         return "String";
      }
   };
   PrimitiveCodec<ByteBuffer> BYTE_BUFFER = new PrimitiveCodec<ByteBuffer>() {
      @Override
      public <T> DataResult<ByteBuffer> read(DynamicOps<T> var1, T var2) {
         return var1.getByteBuffer(var2);
      }

      public <T> T write(DynamicOps<T> var1, ByteBuffer var2) {
         return (T)var1.createByteList(var2);
      }

      @Override
      public String toString() {
         return "ByteBuffer";
      }
   };
   PrimitiveCodec<IntStream> INT_STREAM = new PrimitiveCodec<IntStream>() {
      @Override
      public <T> DataResult<IntStream> read(DynamicOps<T> var1, T var2) {
         return var1.getIntStream(var2);
      }

      public <T> T write(DynamicOps<T> var1, IntStream var2) {
         return (T)var1.createIntList(var2);
      }

      @Override
      public String toString() {
         return "IntStream";
      }
   };
   PrimitiveCodec<LongStream> LONG_STREAM = new PrimitiveCodec<LongStream>() {
      @Override
      public <T> DataResult<LongStream> read(DynamicOps<T> var1, T var2) {
         return var1.getLongStream(var2);
      }

      public <T> T write(DynamicOps<T> var1, LongStream var2) {
         return (T)var1.createLongList(var2);
      }

      @Override
      public String toString() {
         return "LongStream";
      }
   };
   Codec<Dynamic<?>> PASSTHROUGH = new Codec<Dynamic<?>>() {
      @Override
      public <T> DataResult<Pair<Dynamic<?>, T>> decode(DynamicOps<T> var1, T var2) {
         return DataResult.success(Pair.of(new Dynamic<>(var1, var2), (T)var1.empty()));
      }

      public <T> DataResult<T> encode(Dynamic<?> var1, DynamicOps<T> var2, T var3) {
         if (var1.getValue() == var1.getOps().empty()) {
            return DataResult.success((T)var3, Lifecycle.experimental());
         }

         Object var4 = var1.convert(var2).getValue();
         if (var3 == var2.empty()) {
            return DataResult.success((T)var4, Lifecycle.experimental());
         }

         DataResult var5 = var2.getMap(var4).flatMap(var2x -> var2.mergeToMap(var3, (MapLike<Object>)var2x));
         return var5.result()
            .map(DataResult::success)
            .orElseGet(
               () -> {
                  DataResult var3x = var2.getStream(var4).flatMap(var2xx -> var2.mergeToList(var3, var2xx.collect(Collectors.toList())));
                  return var3x.result()
                     .map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Don't know how to merge " + var3 + " and " + var4, (T)var3, Lifecycle.experimental()));
               }
            );
      }

      @Override
      public String toString() {
         return "passthrough";
      }
   };
   MapCodec<Unit> EMPTY = MapCodec.unit(Unit.INSTANCE);

   default Codec<A> withLifecycle(final Lifecycle var1) {
      return new Codec<A>() {
         @Override
         public <T> DataResult<T> encode(A var1x, DynamicOps<T> var2, T var3) {
            return (DataResult<T>)Codec.this.encode(var1x, var2, var3).setLifecycle(var1);
         }

         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1x, T var2) {
            return (DataResult<Pair<A, T>>)Codec.this.decode(var1x, var2).setLifecycle(var1);
         }

         @Override
         public String toString() {
            return Codec.this.toString();
         }
      };
   }

   default Codec<A> stable() {
      return this.withLifecycle(Lifecycle.stable());
   }

   default Codec<A> deprecated(int var1) {
      return this.withLifecycle(Lifecycle.deprecated(var1));
   }

   static <A> Codec<A> of(Encoder<A> var0, Decoder<A> var1) {
      return of(var0, var1, "Codec[" + var0 + " " + var1 + "]");
   }

   static <A> Codec<A> of(final Encoder<A> var0, final Decoder<A> var1, final String var2) {
      return new Codec<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1x, T var2x) {
            return var1.decode(var1x, (T)var2x);
         }

         @Override
         public <T> DataResult<T> encode(A var1x, DynamicOps<T> var2x, T var3) {
            return var0.encode(var1x, var2x, (T)var3);
         }

         @Override
         public String toString() {
            return var2;
         }
      };
   }

   static <A> MapCodec<A> of(MapEncoder<A> var0, MapDecoder<A> var1) {
      return of(var0, var1, () -> "MapCodec[" + var0 + " " + var1 + "]");
   }

   static <A> MapCodec<A> of(final MapEncoder<A> var0, final MapDecoder<A> var1, final Supplier<String> var2) {
      return new MapCodec<A>() {
         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1x) {
            return Stream.concat(var0.keys(var1x), var1.keys(var1x));
         }

         @Override
         public <T> DataResult<A> decode(DynamicOps<T> var1x, MapLike<T> var2x) {
            return var1.decode(var1x, var2x);
         }

         @Override
         public <T> RecordBuilder<T> encode(A var1x, DynamicOps<T> var2x, RecordBuilder<T> var3) {
            return var0.encode(var1x, var2x, var3);
         }

         @Override
         public String toString() {
            return (String)var2.get();
         }
      };
   }

   static <F, S> Codec<Pair<F, S>> pair(Codec<F> var0, Codec<S> var1) {
      return new PairCodec<>(var0, var1);
   }

   static <F, S> Codec<Either<F, S>> either(Codec<F> var0, Codec<S> var1) {
      return new EitherCodec<>(var0, var1);
   }

   static <F, S> Codec<Either<F, S>> xor(Codec<F> var0, Codec<S> var1) {
      return new XorCodec<>(var0, var1);
   }

   static <T> Codec<T> withAlternative(Codec<T> var0, Codec<? extends T> var1) {
      return var0.withAlternative(var1);
   }

   default Codec<A> withAlternative(Codec<? extends A> var1) {
      return either(this, var1).xmap(Either::unwrap, Either::left);
   }

   static <T, U> Codec<T> withAlternative(Codec<T> var0, Codec<U> var1, Function<U, T> var2) {
      return var0.withAlternative(var1, var2);
   }

   default <U> Codec<A> withAlternative(Codec<U> var1, Function<U, A> var2) {
      return either(this, var1).xmap(var1x -> var1x.map(var0x -> (A)var0x, var2), Either::left);
   }

   static <F, S> MapCodec<Pair<F, S>> mapPair(MapCodec<F> var0, MapCodec<S> var1) {
      return new PairMapCodec<>(var0, var1);
   }

   static <F, S> MapCodec<Either<F, S>> mapEither(MapCodec<F> var0, MapCodec<S> var1) {
      return new EitherMapCodec<>(var0, var1);
   }

   static <E> Codec<List<E>> list(Codec<E> var0) {
      return list(var0, 0, Integer.MAX_VALUE);
   }

   static <E> Codec<List<E>> list(Codec<E> var0, int var1, int var2) {
      return new ListCodec<>(var0, var1, var2);
   }

   static <K, V> Codec<List<Pair<K, V>>> compoundList(Codec<K> var0, Codec<V> var1) {
      return new CompoundListCodec<>(var0, var1);
   }

   static <K, V> SimpleMapCodec<K, V> simpleMap(Codec<K> var0, Codec<V> var1, Keyable var2) {
      return new SimpleMapCodec<>(var0, var1, var2);
   }

   static <K, V> UnboundedMapCodec<K, V> unboundedMap(Codec<K> var0, Codec<V> var1) {
      return new UnboundedMapCodec<>(var0, var1);
   }

   static <K, V> Codec<Map<K, V>> dispatchedMap(Codec<K> var0, Function<K, Codec<? extends V>> var1) {
      return new DispatchedMapCodec<>(var0, var1);
   }

   static <E> Codec<E> stringResolver(Function<E, String> var0, Function<String, E> var1) {
      return STRING.flatXmap(
         var1x -> Optional.ofNullable(var1.apply(var1x)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown element name:" + var1x)),
         var1x -> Optional.ofNullable((String)var0.apply(var1x))
            .map(DataResult::success)
            .orElseGet(() -> DataResult.error(() -> "Element with unknown name: " + var1x))
      );
   }

   static <F> MapCodec<Optional<F>> optionalField(String var0, Codec<F> var1, boolean var2) {
      return new OptionalFieldCodec(var0, var1, var2);
   }

   static <A> Codec<A> recursive(String var0, Function<Codec<A>, Codec<A>> var1) {
      return new Codec.RecursiveCodec<>(var0, var1);
   }

   static <A> Codec<A> lazyInitialized(Supplier<Codec<A>> var0) {
      return new Codec.RecursiveCodec<>(var0.toString(), var1 -> (Codec<A>)var0.get());
   }

   default Codec<List<A>> listOf() {
      return list(this);
   }

   default Codec<List<A>> listOf(int var1, int var2) {
      return list(this, var1, var2);
   }

   default Codec<List<A>> sizeLimitedListOf(int var1) {
      return this.listOf(0, var1);
   }

   default <S> Codec<S> xmap(Function<? super A, ? extends S> var1, Function<? super S, ? extends A> var2) {
      return of(this.comap(var2), this.map(var1), this.toString() + "[xmapped]");
   }

   default <S> Codec<S> comapFlatMap(Function<? super A, ? extends DataResult<? extends S>> var1, Function<? super S, ? extends A> var2) {
      return of(this.comap(var2), this.flatMap(var1), this.toString() + "[comapFlatMapped]");
   }

   default <S> Codec<S> flatComapMap(Function<? super A, ? extends S> var1, Function<? super S, ? extends DataResult<? extends A>> var2) {
      return of(this.flatComap(var2), this.map(var1), this.toString() + "[flatComapMapped]");
   }

   default <S> Codec<S> flatXmap(Function<? super A, ? extends DataResult<? extends S>> var1, Function<? super S, ? extends DataResult<? extends A>> var2) {
      return of(this.flatComap(var2), this.flatMap(var1), this.toString() + "[flatXmapped]");
   }

   default MapCodec<A> fieldOf(String var1) {
      return MapCodec.of(Encoder.super.fieldOf(var1), Decoder.super.fieldOf(var1), () -> "Field[" + var1 + ": " + this.toString() + "]");
   }

   default MapCodec<Optional<A>> optionalFieldOf(String var1) {
      return optionalField(var1, this, false);
   }

   default MapCodec<A> optionalFieldOf(String var1, A var2) {
      return this.optionalFieldOf(var1, (A)var2, false);
   }

   default MapCodec<A> optionalFieldOf(String var1, A var2, Lifecycle var3) {
      return this.optionalFieldOf(var1, Lifecycle.experimental(), (A)var2, var3);
   }

   default MapCodec<A> optionalFieldOf(String var1, Lifecycle var2, A var3, Lifecycle var4) {
      return this.optionalFieldOf(var1, var2, (A)var3, var4, false);
   }

   default MapCodec<Optional<A>> lenientOptionalFieldOf(String var1) {
      return optionalField(var1, this, true);
   }

   default MapCodec<A> lenientOptionalFieldOf(String var1, A var2) {
      return this.optionalFieldOf(var1, (A)var2, true);
   }

   default MapCodec<A> lenientOptionalFieldOf(String var1, A var2, Lifecycle var3) {
      return this.lenientOptionalFieldOf(var1, Lifecycle.experimental(), (A)var2, var3);
   }

   default MapCodec<A> lenientOptionalFieldOf(String var1, Lifecycle var2, A var3, Lifecycle var4) {
      return this.optionalFieldOf(var1, var2, (A)var3, var4, true);
   }

   private MapCodec<A> optionalFieldOf(String var1, A var2, boolean var3) {
      return optionalField(var1, this, var3)
         .xmap(var1x -> var1x.orElse((A)var2), var1x -> Objects.equals(var1x, var2) ? Optional.empty() : Optional.of((A)var1x));
   }

   private MapCodec<A> optionalFieldOf(String var1, Lifecycle var2, A var3, Lifecycle var4, boolean var5) {
      return optionalField(var1, this, var5)
         .stable()
         .flatXmap(
            var3x -> var3x.<DataResult<? extends A>>map(var1xx -> DataResult.success((A)var1xx, var2)).orElse(DataResult.success((A)var3, var4)),
            var3x -> Objects.equals(var3x, var3) ? DataResult.success(Optional.empty(), var4) : DataResult.success(Optional.of((A)var3x), var2)
         );
   }

   default Codec<A> mapResult(final Codec.ResultFunction<A> var1) {
      return new Codec<A>() {
         @Override
         public <T> DataResult<T> encode(A var1x, DynamicOps<T> var2, T var3) {
            return var1.coApply(var2, var1x, Codec.this.encode(var1x, var2, (T)var3));
         }

         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1x, T var2) {
            return var1.apply(var1x, (T)var2, Codec.this.decode(var1x, (T)var2));
         }

         @Override
         public String toString() {
            return Codec.this + "[mapResult " + var1 + "]";
         }
      };
   }

   default Codec<A> orElse(Consumer<String> var1, A var2) {
      return this.orElse(DataFixUtils.consumerToFunction(var1), (A)var2);
   }

   default Codec<A> orElse(final UnaryOperator<String> var1, final A var2) {
      return this.mapResult(new Codec.ResultFunction<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> var1x, T var2x, DataResult<Pair<A, T>> var3) {
            return DataResult.success(var3.mapError(var1).result().orElseGet(() -> Pair.of((A)var2, (T)var2x)));
         }

         @Override
         public <T> DataResult<T> coApply(DynamicOps<T> var1x, A var2x, DataResult<T> var3) {
            return var3.mapError(var1);
         }

         @Override
         public String toString() {
            return "OrElse[" + var1 + " " + var2 + "]";
         }
      });
   }

   default Codec<A> orElseGet(Consumer<String> var1, Supplier<? extends A> var2) {
      return this.orElseGet(DataFixUtils.consumerToFunction(var1), var2);
   }

   default Codec<A> orElseGet(final UnaryOperator<String> var1, final Supplier<? extends A> var2) {
      return this.mapResult(new Codec.ResultFunction<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> var1x, T var2x, DataResult<Pair<A, T>> var3) {
            return DataResult.success(var3.mapError(var1).result().orElseGet(() -> Pair.of((A)var2.get(), (T)var2x)));
         }

         @Override
         public <T> DataResult<T> coApply(DynamicOps<T> var1x, A var2x, DataResult<T> var3) {
            return var3.mapError(var1);
         }

         @Override
         public String toString() {
            return "OrElseGet[" + var1 + " " + var2.get() + "]";
         }
      });
   }

   default Codec<A> orElse(final A var1) {
      return this.mapResult(new Codec.ResultFunction<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> var1x, T var2, DataResult<Pair<A, T>> var3) {
            return DataResult.success(var3.result().orElseGet(() -> Pair.of((A)var1, (T)var2)));
         }

         @Override
         public <T> DataResult<T> coApply(DynamicOps<T> var1x, A var2, DataResult<T> var3) {
            return var3;
         }

         @Override
         public String toString() {
            return "OrElse[" + var1 + "]";
         }
      });
   }

   default Codec<A> orElseGet(final Supplier<? extends A> var1) {
      return this.mapResult(new Codec.ResultFunction<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> var1x, T var2, DataResult<Pair<A, T>> var3) {
            return DataResult.success(var3.result().orElseGet(() -> Pair.of((A)var1.get(), (T)var2)));
         }

         @Override
         public <T> DataResult<T> coApply(DynamicOps<T> var1x, A var2, DataResult<T> var3) {
            return var3;
         }

         @Override
         public String toString() {
            return "OrElseGet[" + var1.get() + "]";
         }
      });
   }

   default Codec<A> promotePartial(Consumer<String> var1) {
      return of(this, Decoder.super.promotePartial(var1));
   }

   default <E> Codec<E> dispatch(Function<? super E, ? extends A> var1, Function<? super A, ? extends MapCodec<? extends E>> var2) {
      return this.dispatch("type", var1, var2);
   }

   default <E> Codec<E> dispatch(String var1, Function<? super E, ? extends A> var2, Function<? super A, ? extends MapCodec<? extends E>> var3) {
      return this.fieldOf(var1).dispatch(var2, var3);
   }

   default <E> Codec<E> dispatchStable(Function<? super E, ? extends A> var1, Function<? super A, ? extends MapCodec<? extends E>> var2) {
      return this.fieldOf("type").dispatchStable(var1, var2);
   }

   default <E> Codec<E> partialDispatch(
      String var1, Function<? super E, ? extends DataResult<? extends A>> var2, Function<? super A, ? extends DataResult<? extends MapCodec<? extends E>>> var3
   ) {
      return this.fieldOf(var1).partialDispatch(var2, var3);
   }

   default <E> MapCodec<E> dispatchMap(Function<? super E, ? extends A> var1, Function<? super A, ? extends MapCodec<? extends E>> var2) {
      return this.dispatchMap("type", var1, var2);
   }

   default <E> MapCodec<E> dispatchMap(String var1, Function<? super E, ? extends A> var2, Function<? super A, ? extends MapCodec<? extends E>> var3) {
      return this.fieldOf(var1).dispatchMap(var2, var3);
   }

   default Codec<A> validate(Function<A, DataResult<A>> var1) {
      return this.flatXmap(var1, var1);
   }

   static <N extends Number & Comparable<N>> Function<N, DataResult<N>> checkRange(N var0, N var1) {
      return var2 -> var2.compareTo(var0) >= 0 && var2.compareTo(var1) <= 0
         ? DataResult.success(var2)
         : DataResult.error(() -> "Value " + var2 + " outside of range [" + var0 + ":" + var1 + "]");
   }

   static Codec<Integer> intRange(int var0, int var1) {
      Function var2 = checkRange(var0, var1);
      return INT.flatXmap(var2, var2);
   }

   static Codec<Float> floatRange(float var0, float var1) {
      Function var2 = checkRange(var0, var1);
      return FLOAT.flatXmap(var2, var2);
   }

   static Codec<Double> doubleRange(double var0, double var2) {
      Function var4 = checkRange(var0, var2);
      return DOUBLE.flatXmap(var4, var4);
   }

   static Codec<String> string(int var0, int var1) {
      return STRING.validate(
         var2 -> {
            int var3 = var2.length();
            if (var3 < var0) {
               return DataResult.error(() -> "String \"" + var2 + "\" is too short: " + var3 + ", expected range [" + var0 + "-" + var1 + "]");
            } else {
               return var3 > var1
                  ? DataResult.error(() -> "String \"" + var2 + "\" is too long: " + var3 + ", expected range [" + var0 + "-" + var1 + "]")
                  : DataResult.success(var2);
            }
         }
      );
   }

   static Codec<String> sizeLimitedString(int var0) {
      return string(0, var0);
   }

   class RecursiveCodec<T> implements Codec<T> {
      private final String name;
      private final Supplier<Codec<T>> wrapped;

      private RecursiveCodec(String var1, Function<Codec<T>, Codec<T>> var2) {
         this.name = var1;
         this.wrapped = Suppliers.memoize(() -> (Codec)var2.apply(this));
      }

      @Override
      public <S> DataResult<Pair<T, S>> decode(DynamicOps<S> var1, S var2) {
         return (DataResult<Pair<T, S>>)this.wrapped.get().decode(var1, var2);
      }

      @Override
      public <S> DataResult<S> encode(T var1, DynamicOps<S> var2, S var3) {
         return (DataResult<S>)this.wrapped.get().encode((T)var1, var2, var3);
      }

      @Override
      public String toString() {
         return "RecursiveCodec[" + this.name + "]";
      }
   }

   interface ResultFunction<A> {
      <T> DataResult<Pair<A, T>> apply(DynamicOps<T> var1, T var2, DataResult<Pair<A, T>> var3);

      <T> DataResult<T> coApply(DynamicOps<T> var1, A var2, DataResult<T> var3);
   }
}
