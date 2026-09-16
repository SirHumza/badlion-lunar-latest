package com.lunarclient.dfu.serialization;

import com.google.common.base.Suppliers;
import com.lunarclient.dfu.datafixers.DataFixUtils;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.codecs.KeyDispatchCodec;
import com.lunarclient.dfu.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public abstract class MapCodec<A> extends CompressorHolder implements MapDecoder<A>, MapEncoder<A> {
   public static <A> MapCodec<A> assumeMapUnsafe(final Codec<A> var0) {
      return new MapCodec<A>() {
         private static final String COMPRESSED_VALUE_KEY = "value";

         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1) {
            return Stream.of((T)var1.createString("value"));
         }

         @Override
         public <T> DataResult<A> decode(DynamicOps<T> var1, MapLike<T> var2) {
            if (var1.compressMaps()) {
               Object var3 = var2.get("value");
               return var3 == null ? DataResult.error(() -> "Missing value") : var0.parse(var1, var3);
            } else {
               return var0.parse(var1, var1.createMap(var2.entries()));
            }
         }

         @Override
         public <T> RecordBuilder<T> encode(A var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
            DataResult var4 = var0.encodeStart(var2, var1);
            if (var2.compressMaps()) {
               return var3.add("value", var4);
            }

            DataResult var5 = var4.flatMap(var2::getMap);
            return var5.map(var1x -> {
               var1x.entries().forEach(var1xx -> var3.add(var1xx.getFirst(), var1xx.getSecond()));
               return var3;
            }).result().orElseGet(() -> var3.withErrorsFrom(var5));
         }
      };
   }

   public final <O> RecordCodecBuilder<O, A> forGetter(Function<O, A> var1) {
      return RecordCodecBuilder.of(var1, this);
   }

   public static <A> MapCodec<A> of(MapEncoder<A> var0, MapDecoder<A> var1) {
      return of(var0, var1, () -> "MapCodec[" + var0 + " " + var1 + "]");
   }

   public static <A> MapCodec<A> of(final MapEncoder<A> var0, final MapDecoder<A> var1, final Supplier<String> var2) {
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

   public static <A> MapCodec<A> recursive(String var0, Function<Codec<A>, MapCodec<A>> var1) {
      return new MapCodec.RecursiveMapCodec<>(var0, var1);
   }

   public MapCodec<A> fieldOf(String var1) {
      return this.codec().fieldOf(var1);
   }

   public MapCodec<A> withLifecycle(final Lifecycle var1) {
      return new MapCodec<A>() {
         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1x) {
            return MapCodec.this.keys(var1x);
         }

         @Override
         public <T> DataResult<A> decode(DynamicOps<T> var1x, MapLike<T> var2) {
            return MapCodec.this.decode(var1x, var2).setLifecycle(var1);
         }

         @Override
         public <T> RecordBuilder<T> encode(A var1x, DynamicOps<T> var2, RecordBuilder<T> var3) {
            return MapCodec.this.<T>encode(var1x, var2, var3).setLifecycle(var1);
         }

         @Override
         public String toString() {
            return MapCodec.this.toString();
         }
      };
   }

   public Codec<A> codec() {
      return new MapCodec.MapCodecCodec<>(this);
   }

   public MapCodec<A> stable() {
      return this.withLifecycle(Lifecycle.stable());
   }

   public MapCodec<A> deprecated(int var1) {
      return this.withLifecycle(Lifecycle.deprecated(var1));
   }

   public <S> MapCodec<S> xmap(Function<? super A, ? extends S> var1, Function<? super S, ? extends A> var2) {
      return of(this.comap(var2), this.map(var1), () -> this.toString() + "[xmapped]");
   }

   public <S> MapCodec<S> flatXmap(Function<? super A, ? extends DataResult<? extends S>> var1, Function<? super S, ? extends DataResult<? extends A>> var2) {
      return Codec.of(this.flatComap(var2), this.flatMap(var1), () -> this.toString() + "[flatXmapped]");
   }

   public MapCodec<A> validate(Function<A, DataResult<A>> var1) {
      return this.flatXmap(var1, var1);
   }

   public <E> MapCodec<A> dependent(MapCodec<E> var1, Function<A, Pair<E, MapCodec<E>>> var2, BiFunction<A, E, A> var3) {
      return new MapCodec.Dependent<>(this, var1, var2, var3);
   }

   public <E> Codec<E> dispatch(Function<? super E, ? extends A> var1, Function<? super A, ? extends MapCodec<? extends E>> var2) {
      return this.partialDispatch(var1.andThen(DataResult::success), var2.andThen(DataResult::success));
   }

   public <E> Codec<E> dispatchStable(Function<? super E, ? extends A> var1, Function<? super A, ? extends MapCodec<? extends E>> var2) {
      return this.partialDispatch(
         var1x -> DataResult.success((A)var1.apply(var1x), Lifecycle.stable()),
         var1x -> DataResult.success((MapCodec<? extends E>)var2.apply(var1x), Lifecycle.stable())
      );
   }

   public <E> Codec<E> partialDispatch(
      Function<? super E, ? extends DataResult<? extends A>> var1, Function<? super A, ? extends DataResult<? extends MapCodec<? extends E>>> var2
   ) {
      return new KeyDispatchCodec(this, var1, var2).codec();
   }

   public <E> MapCodec<E> dispatchMap(Function<? super E, ? extends A> var1, Function<? super A, ? extends MapCodec<? extends E>> var2) {
      return new KeyDispatchCodec<>(this, var1.andThen(DataResult::success), var2.andThen(DataResult::success));
   }

   @Override
   public abstract <T> Stream<T> keys(DynamicOps<T> var1);

   public MapCodec<A> mapResult(final MapCodec.ResultFunction<A> var1) {
      return new MapCodec<A>() {
         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1x) {
            return MapCodec.this.keys(var1x);
         }

         @Override
         public <T> RecordBuilder<T> encode(A var1x, DynamicOps<T> var2, RecordBuilder<T> var3) {
            return var1.coApply(var2, var1x, MapCodec.this.encode(var1x, var2, var3));
         }

         @Override
         public <T> DataResult<A> decode(DynamicOps<T> var1x, MapLike<T> var2) {
            return var1.apply(var1x, var2, MapCodec.this.decode(var1x, var2));
         }

         @Override
         public String toString() {
            return MapCodec.this + "[mapResult " + var1 + "]";
         }
      };
   }

   public MapCodec<A> orElse(Consumer<String> var1, A var2) {
      return this.orElse(DataFixUtils.consumerToFunction(var1), (A)var2);
   }

   public MapCodec<A> orElse(final UnaryOperator<String> var1, final A var2) {
      return this.mapResult(new MapCodec.ResultFunction<A>() {
         @Override
         public <T> DataResult<A> apply(DynamicOps<T> var1x, MapLike<T> var2x, DataResult<A> var3) {
            return DataResult.success((A)var3.mapError(var1).result().orElse(var2));
         }

         @Override
         public <T> RecordBuilder<T> coApply(DynamicOps<T> var1x, A var2x, RecordBuilder<T> var3) {
            return var3.mapError(var1);
         }

         @Override
         public String toString() {
            return "OrElse[" + var1 + " " + var2 + "]";
         }
      });
   }

   public MapCodec<A> orElseGet(Consumer<String> var1, Supplier<? extends A> var2) {
      return this.orElseGet(DataFixUtils.consumerToFunction(var1), var2);
   }

   public MapCodec<A> orElseGet(final UnaryOperator<String> var1, final Supplier<? extends A> var2) {
      return this.mapResult(new MapCodec.ResultFunction<A>() {
         @Override
         public <T> DataResult<A> apply(DynamicOps<T> var1x, MapLike<T> var2x, DataResult<A> var3) {
            return DataResult.success((A)var3.mapError(var1).result().orElseGet(var2));
         }

         @Override
         public <T> RecordBuilder<T> coApply(DynamicOps<T> var1x, A var2x, RecordBuilder<T> var3) {
            return var3.mapError(var1);
         }

         @Override
         public String toString() {
            return "OrElseGet[" + var1 + " " + var2.get() + "]";
         }
      });
   }

   public MapCodec<A> orElse(final A var1) {
      return this.mapResult(new MapCodec.ResultFunction<A>() {
         @Override
         public <T> DataResult<A> apply(DynamicOps<T> var1x, MapLike<T> var2, DataResult<A> var3) {
            return DataResult.success((A)var3.result().orElse(var1));
         }

         @Override
         public <T> RecordBuilder<T> coApply(DynamicOps<T> var1x, A var2, RecordBuilder<T> var3) {
            return var3;
         }

         @Override
         public String toString() {
            return "OrElse[" + var1 + "]";
         }
      });
   }

   public MapCodec<A> orElseGet(final Supplier<? extends A> var1) {
      return this.mapResult(new MapCodec.ResultFunction<A>() {
         @Override
         public <T> DataResult<A> apply(DynamicOps<T> var1x, MapLike<T> var2, DataResult<A> var3) {
            return DataResult.success((A)var3.result().orElseGet(var1));
         }

         @Override
         public <T> RecordBuilder<T> coApply(DynamicOps<T> var1x, A var2, RecordBuilder<T> var3) {
            return var3;
         }

         @Override
         public String toString() {
            return "OrElseGet[" + var1.get() + "]";
         }
      });
   }

   public MapCodec<A> setPartial(final Supplier<A> var1) {
      return this.mapResult(new MapCodec.ResultFunction<A>() {
         @Override
         public <T> DataResult<A> apply(DynamicOps<T> var1x, MapLike<T> var2, DataResult<A> var3) {
            return var3.setPartial(var1);
         }

         @Override
         public <T> RecordBuilder<T> coApply(DynamicOps<T> var1x, A var2, RecordBuilder<T> var3) {
            return var3;
         }

         @Override
         public String toString() {
            return "SetPartial[" + var1 + "]";
         }
      });
   }

   public static <A> MapCodec<A> unit(A var0) {
      return unit(() -> (A)var0);
   }

   public static <A> MapCodec<A> unit(final Supplier<A> var0) {
      return new MapCodec<A>() {
         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1) {
            return Stream.empty();
         }

         @Override
         public <T> DataResult<A> decode(DynamicOps<T> var1, MapLike<T> var2) {
            return DataResult.success((A)var0.get());
         }

         @Override
         public <T> RecordBuilder<T> encode(A var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
            return var3;
         }

         @Override
         public Codec<A> codec() {
            return unitCodec(var0);
         }

         @Override
         public String toString() {
            return "Unit[" + var0.get() + "]";
         }
      };
   }

   public static <A> Codec<A> unitCodec(A var0) {
      return unitCodec(() -> (A)var0);
   }

   public static <A> Codec<A> unitCodec(final Supplier<A> var0) {
      return new Codec<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
            DataResult var3 = var1.compressMaps() ? var1.getList(var2) : var1.getMap(var2);
            return var3.map(var2x -> Pair.of((A)var0.get(), (T)var2));
         }

         @Override
         public <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
            return (DataResult<T>)var2.mergeToMap(var3, MapLike.empty());
         }

         @Override
         public String toString() {
            return "Unit[" + var0.get() + "]";
         }
      };
   }

   private static class Dependent<O, E> extends MapCodec<O> {
      private final MapCodec<E> initialInstance;
      private final Function<O, Pair<E, MapCodec<E>>> splitter;
      private final MapCodec<O> codec;
      private final BiFunction<O, E, O> combiner;

      public Dependent(MapCodec<O> var1, MapCodec<E> var2, Function<O, Pair<E, MapCodec<E>>> var3, BiFunction<O, E, O> var4) {
         this.initialInstance = var2;
         this.splitter = var3;
         this.codec = var1;
         this.combiner = var4;
      }

      @Override
      public <T> Stream<T> keys(DynamicOps<T> var1) {
         return Stream.concat(this.codec.keys(var1), this.initialInstance.keys(var1));
      }

      @Override
      public <T> DataResult<O> decode(DynamicOps<T> var1, MapLike<T> var2) {
         return this.codec
            .decode(var1, var2)
            .flatMap(
               var3 -> this.splitter
                  .apply((O)var3)
                  .getSecond()
                  .decode(var1, var2)
                  .map(var2xx -> (T)this.combiner.apply((O)var3, (E)var2xx))
                  .setLifecycle(Lifecycle.experimental())
            );
      }

      @Override
      public <T> RecordBuilder<T> encode(O var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
         this.codec.encode((O)var1, var2, var3);
         Pair var4 = this.splitter.apply((O)var1);
         ((MapCodec)var4.getSecond()).encode(var4.getFirst(), var2, var3);
         return var3.setLifecycle(Lifecycle.experimental());
      }
   }

   public record MapCodecCodec<A>() implements Codec<A> {
      private final MapCodec<A> codec;

      public MapCodecCodec(MapCodec<A> var1) {
         this.codec = var1;
      }

      @Override
      public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
         return this.codec.compressedDecode(var1, var2).map(var1x -> Pair.of((A)var1x, (T)var2));
      }

      @Override
      public <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
         return this.codec.encode((A)var1, var2, this.codec.compressedBuilder(var2)).build((T)var3);
      }

      @Override
      public String toString() {
         return this.codec.toString();
      }
   }

   private static class RecursiveMapCodec<A> extends MapCodec<A> {
      private final String name;
      private final Supplier<MapCodec<A>> wrapped;

      private RecursiveMapCodec(String var1, Function<Codec<A>, MapCodec<A>> var2) {
         this.name = var1;
         this.wrapped = Suppliers.memoize(() -> (MapCodec)var2.apply(this.codec()));
      }

      @Override
      public <T> RecordBuilder<T> encode(A var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
         return this.wrapped.get().encode((A)var1, var2, var3);
      }

      @Override
      public <T> DataResult<A> decode(DynamicOps<T> var1, MapLike<T> var2) {
         return this.wrapped.get().decode(var1, var2);
      }

      @Override
      public <T> Stream<T> keys(DynamicOps<T> var1) {
         return this.wrapped.get().keys(var1);
      }

      @Override
      public String toString() {
         return "RecursiveMapCodec[" + this.name + "]";
      }
   }

   public interface ResultFunction<A> {
      <T> DataResult<A> apply(DynamicOps<T> var1, MapLike<T> var2, DataResult<A> var3);

      <T> RecordBuilder<T> coApply(DynamicOps<T> var1, A var2, RecordBuilder<T> var3);
   }
}
