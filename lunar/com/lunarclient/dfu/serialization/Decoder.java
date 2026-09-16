package com.lunarclient.dfu.serialization;

import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.codecs.FieldDecoder;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Decoder<A> {
   <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2);

   default <T> DataResult<A> parse(DynamicOps<T> var1, T var2) {
      return this.decode(var1, var2).map(Pair::getFirst);
   }

   default <T> DataResult<Pair<A, T>> decode(Dynamic<T> var1) {
      return this.decode(var1.getOps(), (T)var1.getValue());
   }

   default <T> DataResult<A> parse(Dynamic<T> var1) {
      return this.<T>decode(var1).map(Pair::getFirst);
   }

   default Decoder.Terminal<A> terminal() {
      return this::parse;
   }

   default Decoder.Boxed<A> boxed() {
      return this::decode;
   }

   default Decoder.Simple<A> simple() {
      return this::parse;
   }

   default MapDecoder<A> fieldOf(String var1) {
      return new FieldDecoder<>(var1, this);
   }

   default <B> Decoder<B> flatMap(final Function<? super A, ? extends DataResult<? extends B>> var1) {
      return new Decoder<B>() {
         @Override
         public <T> DataResult<Pair<B, T>> decode(DynamicOps<T> var1x, T var2) {
            return Decoder.this.decode(var1x, var2)
               .flatMap(var1xxx -> ((DataResult)var1.apply(var1xxx.getFirst())).map(var1xxxxx -> Pair.of((B)var1xxxxx, (T)var1xxx.getSecond())));
         }

         @Override
         public String toString() {
            return Decoder.this.toString() + "[flatMapped]";
         }
      };
   }

   default <B> Decoder<B> map(final Function<? super A, ? extends B> var1) {
      return new Decoder<B>() {
         @Override
         public <T> DataResult<Pair<B, T>> decode(DynamicOps<T> var1x, T var2) {
            return Decoder.this.decode(var1x, var2).map(var1xxx -> (Pair<B, T>)var1xxx.mapFirst(var1));
         }

         @Override
         public String toString() {
            return Decoder.this.toString() + "[mapped]";
         }
      };
   }

   default Decoder<A> promotePartial(final Consumer<String> var1) {
      return new Decoder<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1x, T var2) {
            return (DataResult<Pair<A, T>>)Decoder.this.decode(var1x, var2).promotePartial(var1);
         }

         @Override
         public String toString() {
            return Decoder.this.toString() + "[promotePartial]";
         }
      };
   }

   default Decoder<A> withLifecycle(final Lifecycle var1) {
      return new Decoder<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1x, T var2) {
            return (DataResult<Pair<A, T>>)Decoder.this.decode(var1x, var2).setLifecycle(var1);
         }

         @Override
         public String toString() {
            return Decoder.this.toString();
         }
      };
   }

   static <A> Decoder<A> ofTerminal(Decoder.Terminal<? extends A> var0) {
      return var0.decoder().map(Function.identity());
   }

   static <A> Decoder<A> ofBoxed(Decoder.Boxed<? extends A> var0) {
      return var0.decoder().map(Function.identity());
   }

   static <A> Decoder<A> ofSimple(Decoder.Simple<? extends A> var0) {
      return var0.decoder().map(Function.identity());
   }

   static <A> MapDecoder<A> unit(A var0) {
      return unit(() -> (A)var0);
   }

   static <A> MapDecoder<A> unit(final Supplier<A> var0) {
      return new MapDecoder.Implementation<A>() {
         @Override
         public <T> DataResult<A> decode(DynamicOps<T> var1, MapLike<T> var2) {
            return DataResult.success((A)var0.get());
         }

         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1) {
            return Stream.empty();
         }

         @Override
         public String toString() {
            return "UnitDecoder[" + var0.get() + "]";
         }
      };
   }

   static <A> Decoder<A> error(final String var0) {
      return new Decoder<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
            return DataResult.error(() -> var0);
         }

         @Override
         public String toString() {
            return "ErrorDecoder[" + var0 + "]";
         }
      };
   }

   interface Boxed<A> {
      <T> DataResult<Pair<A, T>> decode(Dynamic<T> var1);

      default Decoder<A> decoder() {
         return new Decoder<A>() {
            @Override
            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
               return Boxed.this.decode(new Dynamic<>(var1, (T)var2));
            }

            @Override
            public String toString() {
               return "BoxedDecoder[" + Boxed.this + "]";
            }
         };
      }
   }

   interface Simple<A> {
      <T> DataResult<A> decode(Dynamic<T> var1);

      default Decoder<A> decoder() {
         return new Decoder<A>() {
            @Override
            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
               return Simple.this.decode(new Dynamic<>(var1, var2)).map(var1x -> Pair.of((A)var1x, (T)var1.empty()));
            }

            @Override
            public String toString() {
               return "SimpleDecoder[" + Simple.this + "]";
            }
         };
      }
   }

   interface Terminal<A> {
      <T> DataResult<A> decode(DynamicOps<T> var1, T var2);

      default Decoder<A> decoder() {
         return new Decoder<A>() {
            @Override
            public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
               return Terminal.this.decode(var1, var2).map(var1x -> Pair.of((A)var1x, (T)var1.empty()));
            }

            @Override
            public String toString() {
               return "TerminalDecoder[" + Terminal.this + "]";
            }
         };
      }
   }
}
