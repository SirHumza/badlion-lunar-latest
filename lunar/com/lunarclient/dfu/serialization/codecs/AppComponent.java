package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.Applicative;
import com.lunarclient.dfu.datafixers.kinds.K1;
import com.lunarclient.dfu.datafixers.util.Function3;
import com.lunarclient.dfu.datafixers.util.Function4;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.Decoder;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Encoder;
import com.lunarclient.dfu.serialization.Lifecycle;
import com.lunarclient.dfu.serialization.MapCodec;
import com.lunarclient.dfu.serialization.MapDecoder;
import com.lunarclient.dfu.serialization.MapEncoder;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public final class RecordCodecBuilder<O, F> implements App<RecordCodecBuilder.Mu<O>, F> {
   private final Function<O, F> getter;
   private final Function<O, MapEncoder<F>> encoder;
   private final MapDecoder<F> decoder;

   public static <O, F> RecordCodecBuilder<O, F> unbox(App<RecordCodecBuilder.Mu<O>, F> var0) {
      return (RecordCodecBuilder<O, F>)var0;
   }

   private RecordCodecBuilder(Function<O, F> var1, Function<O, MapEncoder<F>> var2, MapDecoder<F> var3) {
      this.getter = var1;
      this.encoder = var2;
      this.decoder = var3;
   }

   public static <O> RecordCodecBuilder.Instance<O> instance() {
      return new RecordCodecBuilder.Instance<>();
   }

   public static <O, F> RecordCodecBuilder<O, F> of(Function<O, F> var0, String var1, Codec<F> var2) {
      return of(var0, var2.fieldOf(var1));
   }

   public static <O, F> RecordCodecBuilder<O, F> of(Function<O, F> var0, MapCodec<F> var1) {
      return new RecordCodecBuilder<>(var0, var1x -> var1, var1);
   }

   public static <O, F> RecordCodecBuilder<O, F> point(F var0) {
      return new RecordCodecBuilder<>(var1 -> (F)var0, var0x -> Encoder.empty(), Decoder.unit((F)var0));
   }

   public static <O, F> RecordCodecBuilder<O, F> stable(F var0) {
      return point((F)var0, Lifecycle.stable());
   }

   public static <O, F> RecordCodecBuilder<O, F> deprecated(F var0, int var1) {
      return point((F)var0, Lifecycle.deprecated(var1));
   }

   public static <O, F> RecordCodecBuilder<O, F> point(F var0, Lifecycle var1) {
      return new RecordCodecBuilder<>(var1x -> (F)var0, var1x -> Encoder.<F>empty().withLifecycle(var1), (MapDecoder<F>)Decoder.unit(var0).withLifecycle(var1));
   }

   public static <O> Codec<O> create(Function<RecordCodecBuilder.Instance<O>, ? extends App<RecordCodecBuilder.Mu<O>, O>> var0) {
      return build((App<RecordCodecBuilder.Mu<O>, O>)var0.apply(instance())).codec();
   }

   public static <O> MapCodec<O> mapCodec(Function<RecordCodecBuilder.Instance<O>, ? extends App<RecordCodecBuilder.Mu<O>, O>> var0) {
      return build((App<RecordCodecBuilder.Mu<O>, O>)var0.apply(instance()));
   }

   public <E> RecordCodecBuilder<O, E> dependent(Function<O, E> var1, final MapEncoder<E> var2, final Function<? super F, ? extends MapDecoder<E>> var3) {
      return new RecordCodecBuilder<>(
         var1,
         var1x -> var2,
         new MapDecoder.Implementation<E>() {
            @Override
            public <T> DataResult<E> decode(DynamicOps<T> var1, MapLike<T> var2x) {
               return RecordCodecBuilder.this.decoder
                  .decode(var1, var2x)
                  .<MapDecoder>map(var3)
                  .flatMap(var2xxx -> var2xxx.decode(var1, var2x).map(Function.identity()));
            }

            @Override
            public <T> Stream<T> keys(DynamicOps<T> var1) {
               return var2.keys(var1);
            }

            @Override
            public String toString() {
               return "Dependent[" + var2 + "]";
            }
         }
      );
   }

   public static <O> MapCodec<O> build(App<RecordCodecBuilder.Mu<O>, O> var0) {
      final RecordCodecBuilder var1 = unbox(var0);
      return new MapCodec<O>() {
         @Override
         public <T> DataResult<O> decode(DynamicOps<T> var1x, MapLike<T> var2) {
            return (DataResult<O>)var1.decoder.decode(var1x, var2);
         }

         @Override
         public <T> RecordBuilder<T> encode(O var1x, DynamicOps<T> var2, RecordBuilder<T> var3) {
            return var1.encoder.apply((O)var1x).encode((F)var1x, var2, var3);
         }

         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1x) {
            return var1.decoder.keys(var1x);
         }

         @Override
         public String toString() {
            return "RecordCodec[" + var1.decoder + "]";
         }
      };
   }

   public static final class Instance<O> implements Applicative<RecordCodecBuilder.Mu<O>, RecordCodecBuilder.Instance.Mu<O>> {
      public <A> App<RecordCodecBuilder.Mu<O>, A> stable(A var1) {
         return (App<RecordCodecBuilder.Mu<O>, A>)RecordCodecBuilder.stable(var1);
      }

      public <A> App<RecordCodecBuilder.Mu<O>, A> deprecated(A var1, int var2) {
         return (App<RecordCodecBuilder.Mu<O>, A>)RecordCodecBuilder.deprecated(var1, var2);
      }

      public <A> App<RecordCodecBuilder.Mu<O>, A> point(A var1, Lifecycle var2) {
         return (App<RecordCodecBuilder.Mu<O>, A>)RecordCodecBuilder.point(var1, var2);
      }

      @Override
      public <A> App<RecordCodecBuilder.Mu<O>, A> point(A var1) {
         return (App<RecordCodecBuilder.Mu<O>, A>)RecordCodecBuilder.point(var1);
      }

      @Override
      public <A, R> Function<App<RecordCodecBuilder.Mu<O>, A>, App<RecordCodecBuilder.Mu<O>, R>> lift1(App<RecordCodecBuilder.Mu<O>, Function<A, R>> var1) {
         return var2 -> {
            final RecordCodecBuilder var3 = RecordCodecBuilder.unbox(var1);
            final RecordCodecBuilder var4 = RecordCodecBuilder.unbox(var2);
            return new RecordCodecBuilder<>(var2x -> (R)((Function)var3.getter.apply(var2x)).apply(var4.getter.apply(var2x)), var3x -> {
               final MapEncoder var4x = var3.encoder.apply(var3x);
               final MapEncoder var5 = var4.encoder.apply(var3x);
               final Object var6 = var4.getter.apply(var3x);
               return new MapEncoder.Implementation<R>() {
                  @Override
                  public <T> RecordBuilder<T> encode(Object var1, DynamicOps<T> var2x, RecordBuilder<T> var3xx) {
                     var4.encode((Function<Object, >)var1x -> var1, var2x, var3xx);
                     var5.encode(var6, var2x, var3xx);
                     return var3xx;
                  }

                  @Override
                  public <T> Stream<T> keys(DynamicOps<T> var1) {
                     return Stream.concat(var5.keys(var1), var4.keys(var1));
                  }

                  @Override
                  public String toString() {
                     return var4 + " * " + var5;
                  }
               };
            }, new MapDecoder.Implementation<R>() {
               @Override
               public <T> DataResult<R> decode(DynamicOps<T> var1, MapLike<T> var2x) {
                  return var4.decoder.decode(var1, var2x).flatMap(var3xx -> var3.decoder.decode(var1, var2).map(var1xx -> (T)var1xx.apply(var3xx)));
               }

               @Override
               public <T> Stream<T> keys(DynamicOps<T> var1) {
                  return Stream.concat(var4.decoder.keys(var1), var3.decoder.keys(var1));
               }

               @Override
               public String toString() {
                  return var3.decoder + " * " + var4.decoder;
               }
            });
         };
      }

      @Override
      public <A, B, R> App<RecordCodecBuilder.Mu<O>, R> ap2(
         App<RecordCodecBuilder.Mu<O>, BiFunction<A, B, R>> var1, App<RecordCodecBuilder.Mu<O>, A> var2, App<RecordCodecBuilder.Mu<O>, B> var3
      ) {
         final RecordCodecBuilder var4 = RecordCodecBuilder.unbox(var1);
         final RecordCodecBuilder var5 = RecordCodecBuilder.unbox(var2);
         final RecordCodecBuilder var6 = RecordCodecBuilder.unbox(var3);
         return new RecordCodecBuilder<>(
            var3x -> (R)((BiFunction)var4.getter.apply(var3x)).apply(var5.getter.apply(var3x), var6.getter.apply(var3x)),
            var4x -> {
               final MapEncoder var5x = var4.encoder.apply(var4x);
               final MapEncoder var6x = var5.encoder.apply(var4x);
               final Object var7 = var5.getter.apply(var4x);
               final MapEncoder var8 = var6.encoder.apply(var4x);
               final Object var9 = var6.getter.apply(var4x);
               return new MapEncoder.Implementation<R>() {
                  @Override
                  public <T> RecordBuilder<T> encode(R var1, DynamicOps<T> var2x, RecordBuilder<T> var3x) {
                     var5x.encode((BiFunction<Object, Object, >)(var1x, var2x) -> var1, var2x, var3x);
                     var6x.encode(var7, var2x, var3x);
                     var8.encode(var9, var2x, var3x);
                     return var3x;
                  }

                  @Override
                  public <T> Stream<T> keys(DynamicOps<T> var1) {
                     return Stream.of(var5x.keys(var1), var6x.keys(var1), var8.keys(var1)).flatMap(Function.identity());
                  }

                  @Override
                  public String toString() {
                     return var5x + " * " + var6x + " * " + var8;
                  }
               };
            },
            new MapDecoder.Implementation<R>() {
               @Override
               public <T> DataResult<R> decode(DynamicOps<T> var1, MapLike<T> var2x) {
                  return DataResult.unbox(
                     DataResult.instance().ap2(var4.decoder.decode(var1, var2x), var5.decoder.decode(var1, var2x), var6.decoder.decode(var1, var2x))
                  );
               }

               @Override
               public <T> Stream<T> keys(DynamicOps<T> var1) {
                  return Stream.of(var4.decoder.keys(var1), var5.decoder.keys(var1), var6.decoder.keys(var1)).flatMap(Function.identity());
               }

               @Override
               public String toString() {
                  return var4.decoder + " * " + var5.decoder + " * " + var6.decoder;
               }
            }
         );
      }

      @Override
      public <T1, T2, T3, R> App<RecordCodecBuilder.Mu<O>, R> ap3(
         App<RecordCodecBuilder.Mu<O>, Function3<T1, T2, T3, R>> var1,
         App<RecordCodecBuilder.Mu<O>, T1> var2,
         App<RecordCodecBuilder.Mu<O>, T2> var3,
         App<RecordCodecBuilder.Mu<O>, T3> var4
      ) {
         final RecordCodecBuilder var5 = RecordCodecBuilder.unbox(var1);
         final RecordCodecBuilder var6 = RecordCodecBuilder.unbox(var2);
         final RecordCodecBuilder var7 = RecordCodecBuilder.unbox(var3);
         final RecordCodecBuilder var8 = RecordCodecBuilder.unbox(var4);
         return new RecordCodecBuilder<>(
            var4x -> (R)((Function3)var5.getter.apply(var4x)).apply(var6.getter.apply(var4x), var7.getter.apply(var4x), var8.getter.apply(var4x)),
            var5x -> {
               final MapEncoder var6x = var5.encoder.apply(var5x);
               final MapEncoder var7x = var6.encoder.apply(var5x);
               final Object var8x = var6.getter.apply(var5x);
               final MapEncoder var9 = var7.encoder.apply(var5x);
               final Object var10 = var7.getter.apply(var5x);
               final MapEncoder var11 = var8.encoder.apply(var5x);
               final Object var12 = var8.getter.apply(var5x);
               return new MapEncoder.Implementation<R>() {
                  @Override
                  public <T> RecordBuilder<T> encode(R var1, DynamicOps<T> var2x, RecordBuilder<T> var3x) {
                     var6x.encode((Function3<Object, Object, Object, >)(var1x, var2x, var3x) -> var1, var2x, var3x);
                     var7x.encode(var8x, var2x, var3x);
                     var9.encode(var10, var2x, var3x);
                     var11.encode(var12, var2x, var3x);
                     return var3x;
                  }

                  @Override
                  public <T> Stream<T> keys(DynamicOps<T> var1) {
                     return Stream.of(var6x.keys(var1), var7x.keys(var1), var9.keys(var1), var11.keys(var1)).flatMap(Function.identity());
                  }

                  @Override
                  public String toString() {
                     return var6x + " * " + var7x + " * " + var9 + " * " + var11;
                  }
               };
            },
            new MapDecoder.Implementation<R>() {
               @Override
               public <T> DataResult<R> decode(DynamicOps<T> var1, MapLike<T> var2x) {
                  return DataResult.unbox(
                     DataResult.instance()
                        .ap3(
                           var5.decoder.decode(var1, var2x),
                           var6.decoder.decode(var1, var2x),
                           var7.decoder.decode(var1, var2x),
                           var8.decoder.decode(var1, var2x)
                        )
                  );
               }

               @Override
               public <T> Stream<T> keys(DynamicOps<T> var1) {
                  return Stream.of(var5.decoder.keys(var1), var6.decoder.keys(var1), var7.decoder.keys(var1), var8.decoder.keys(var1))
                     .flatMap(Function.identity());
               }

               @Override
               public String toString() {
                  return var5.decoder + " * " + var6.decoder + " * " + var7.decoder + " * " + var8.decoder;
               }
            }
         );
      }

      @Override
      public <T1, T2, T3, T4, R> App<RecordCodecBuilder.Mu<O>, R> ap4(
         App<RecordCodecBuilder.Mu<O>, Function4<T1, T2, T3, T4, R>> var1,
         App<RecordCodecBuilder.Mu<O>, T1> var2,
         App<RecordCodecBuilder.Mu<O>, T2> var3,
         App<RecordCodecBuilder.Mu<O>, T3> var4,
         App<RecordCodecBuilder.Mu<O>, T4> var5
      ) {
         final RecordCodecBuilder var6 = RecordCodecBuilder.unbox(var1);
         final RecordCodecBuilder var7 = RecordCodecBuilder.unbox(var2);
         final RecordCodecBuilder var8 = RecordCodecBuilder.unbox(var3);
         final RecordCodecBuilder var9 = RecordCodecBuilder.unbox(var4);
         final RecordCodecBuilder var10 = RecordCodecBuilder.unbox(var5);
         return new RecordCodecBuilder<>(
            var5x -> (R)((Function4)var6.getter.apply(var5x))
               .apply(var7.getter.apply(var5x), var8.getter.apply(var5x), var9.getter.apply(var5x), var10.getter.apply(var5x)),
            var6x -> {
               final MapEncoder var7x = var6.encoder.apply(var6x);
               final MapEncoder var8x = var7.encoder.apply(var6x);
               final Object var9x = var7.getter.apply(var6x);
               final MapEncoder var10x = var8.encoder.apply(var6x);
               final Object var11 = var8.getter.apply(var6x);
               final MapEncoder var12 = var9.encoder.apply(var6x);
               final Object var13 = var9.getter.apply(var6x);
               final MapEncoder var14 = var10.encoder.apply(var6x);
               final Object var15 = var10.getter.apply(var6x);
               return new MapEncoder.Implementation<R>() {
                  @Override
                  public <T> RecordBuilder<T> encode(R var1, DynamicOps<T> var2x, RecordBuilder<T> var3x) {
                     var7x.encode((Function4<Object, Object, Object, Object, >)(var1x, var2x, var3x, var4x) -> var1, var2x, var3x);
                     var8x.encode(var9x, var2x, var3x);
                     var10x.encode(var11, var2x, var3x);
                     var12.encode(var13, var2x, var3x);
                     var14.encode(var15, var2x, var3x);
                     return var3x;
                  }

                  @Override
                  public <T> Stream<T> keys(DynamicOps<T> var1) {
                     return Stream.of(var7x.keys(var1), var8x.keys(var1), var10x.keys(var1), var12.keys(var1), var14.keys(var1)).flatMap(Function.identity());
                  }

                  @Override
                  public String toString() {
                     return var7x + " * " + var8x + " * " + var10x + " * " + var12 + " * " + var14;
                  }
               };
            },
            new MapDecoder.Implementation<R>() {
               @Override
               public <T> DataResult<R> decode(DynamicOps<T> var1, MapLike<T> var2x) {
                  return DataResult.unbox(
                     DataResult.instance()
                        .ap4(
                           var6.decoder.decode(var1, var2x),
                           var7.decoder.decode(var1, var2x),
                           var8.decoder.decode(var1, var2x),
                           var9.decoder.decode(var1, var2x),
                           var10.decoder.decode(var1, var2x)
                        )
                  );
               }

               @Override
               public <T> Stream<T> keys(DynamicOps<T> var1) {
                  return Stream.of(var6.decoder.keys(var1), var7.decoder.keys(var1), var8.decoder.keys(var1), var9.decoder.keys(var1), var10.decoder.keys(var1))
                     .flatMap(Function.identity());
               }

               @Override
               public String toString() {
                  return var6.decoder + " * " + var7.decoder + " * " + var8.decoder + " * " + var9.decoder + " * " + var10.decoder;
               }
            }
         );
      }

      @Override
      public <T, R> App<RecordCodecBuilder.Mu<O>, R> map(Function<? super T, ? extends R> var1, App<RecordCodecBuilder.Mu<O>, T> var2) {
         RecordCodecBuilder var3 = RecordCodecBuilder.unbox(var2);
         Function var4 = var3.getter;
         return new RecordCodecBuilder<>((Function<O, R>)var4.andThen(var1), var3x -> new MapEncoder.Implementation<R>() {
            private final MapEncoder<T> encoder = var3.encoder.apply((O)var3x);

            @Override
            public <U> RecordBuilder<U> encode(R var1, DynamicOps<U> var2x, RecordBuilder<U> var3xx) {
               return this.encoder.encode(var4.apply(var3x), var2x, var3xx);
            }

            @Override
            public <U> Stream<U> keys(DynamicOps<U> var1) {
               return this.encoder.keys(var1);
            }

            @Override
            public String toString() {
               return this.encoder + "[mapped]";
            }
         }, var3.decoder.map(var1));
      }

      private static final class Mu<O> implements Applicative.Mu {
      }
   }

   public static final class Mu<O> implements K1 {
   }
}
