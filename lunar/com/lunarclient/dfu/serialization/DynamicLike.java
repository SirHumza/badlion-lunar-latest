package com.lunarclient.dfu.serialization;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.lunarclient.dfu.datafixers.kinds.App;
import com.lunarclient.dfu.datafixers.kinds.ListBox;
import com.lunarclient.dfu.datafixers.util.Function3;
import com.lunarclient.dfu.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class DynamicLike<T> {
   protected final DynamicOps<T> ops;

   public DynamicLike(DynamicOps<T> var1) {
      this.ops = var1;
   }

   public DynamicOps<T> getOps() {
      return this.ops;
   }

   public abstract DataResult<Number> asNumber();

   public abstract DataResult<String> asString();

   public abstract DataResult<Boolean> asBoolean();

   public abstract DataResult<Stream<Dynamic<T>>> asStreamOpt();

   public abstract DataResult<Stream<Pair<Dynamic<T>, Dynamic<T>>>> asMapOpt();

   public abstract DataResult<ByteBuffer> asByteBufferOpt();

   public abstract DataResult<IntStream> asIntStreamOpt();

   public abstract DataResult<LongStream> asLongStreamOpt();

   public abstract OptionalDynamic<T> get(String var1);

   public abstract DataResult<T> getGeneric(T var1);

   public abstract DataResult<T> getElement(String var1);

   public abstract DataResult<T> getElementGeneric(T var1);

   public abstract <A> DataResult<Pair<A, T>> decode(Decoder<? extends A> var1);

   public <U> DataResult<List<U>> asListOpt(Function<Dynamic<T>, U> var1) {
      return this.asStreamOpt().map(var1x -> var1x.map(var1).collect(Collectors.toList()));
   }

   public <K, V> DataResult<Map<K, V>> asMapOpt(Function<Dynamic<T>, K> var1, Function<Dynamic<T>, V> var2) {
      return this.asMapOpt().map(var2x -> {
         Builder var3 = ImmutableMap.builder();
         var2x.forEach(var3x -> var3.put(var1.apply(var3x.getFirst()), var2.apply(var3x.getSecond())));
         return var3.build();
      });
   }

   public <A> DataResult<A> read(Decoder<? extends A> var1) {
      return this.<A>decode(var1).map(Pair::getFirst);
   }

   public <E> DataResult<List<E>> readList(Decoder<E> var1) {
      return this.asStreamOpt()
         .map(var1x -> var1x.<DataResult>map(var1xx -> var1xx.read(var1)).collect(Collectors.toList()))
         .flatMap(var0 -> DataResult.unbox(ListBox.flip(DataResult.instance(), (List<App<DataResult.Mu, E>>)var0)));
   }

   public <E> DataResult<List<E>> readList(Function<? super Dynamic<?>, ? extends DataResult<? extends E>> var1) {
      return this.asStreamOpt()
         .map(var1x -> var1x.<DataResult>map(var1).map(var0x -> var0x.map(var0xx -> (T)var0xx)).collect(Collectors.toList()))
         .flatMap(var0 -> DataResult.unbox(ListBox.flip(DataResult.instance(), (List<App<DataResult.Mu, E>>)var0)));
   }

   public <K, V> DataResult<List<Pair<K, V>>> readMap(Decoder<K> var1, Decoder<V> var2) {
      return this.asMapOpt()
         .map(
            var2x -> var2x.<DataResult<Pair<Object, Object>>>map(
                  var2xx -> var2xx.getFirst()
                     .<Object>read(var1)
                     .flatMap(var2xxx -> ((Dynamic)var2xx.getSecond()).<Object>read(var2).map(var1xxxx -> Pair.of(var2xxx, var1xxxx)))
               )
               .collect(Collectors.toList())
         )
         .flatMap(var0 -> DataResult.unbox(ListBox.flip(DataResult.instance(), (List<App<DataResult.Mu, Pair<K, V>>>)var0)));
   }

   public <K, V> DataResult<List<Pair<K, V>>> readMap(Decoder<K> var1, Function<K, Decoder<V>> var2) {
      return this.asMapOpt()
         .map(
            var2x -> var2x.<DataResult<Pair<Object, Object>>>map(
                  var2xx -> var2xx.getFirst()
                     .<Object>read(var1)
                     .flatMap(
                        var2xxx -> ((Dynamic)var2xx.getSecond())
                           .<Object>read((Decoder<? extends Object>)var2.apply(var2xxx))
                           .map(var1xxxx -> Pair.of(var2xxx, var1xxxx))
                     )
               )
               .collect(Collectors.toList())
         )
         .flatMap(var0 -> DataResult.unbox(ListBox.flip(DataResult.instance(), (List<App<DataResult.Mu, Pair<K, V>>>)var0)));
   }

   public <R> DataResult<R> readMap(DataResult<R> var1, Function3<R, Dynamic<T>, Dynamic<T>, DataResult<R>> var2) {
      return this.asMapOpt()
         .flatMap(
            var2x -> {
               AtomicReference var3 = new AtomicReference<>(var1);
               var2x.forEach(
                  var2xx -> var3.setPlain(
                     ((DataResult)var3.getPlain()).flatMap(var2xxx -> (DataResult)var2.apply(var2xxx, (Dynamic)var2xx.getFirst(), (Dynamic)var2xx.getSecond()))
                  )
               );
               return (DataResult<R>)var3.getPlain();
            }
         );
   }

   public Number asNumber(Number var1) {
      return this.asNumber().result().orElse(var1);
   }

   public int asInt(int var1) {
      return this.asNumber(var1).intValue();
   }

   public long asLong(long var1) {
      return this.asNumber(var1).longValue();
   }

   public float asFloat(float var1) {
      return this.asNumber(var1).floatValue();
   }

   public double asDouble(double var1) {
      return this.asNumber(var1).doubleValue();
   }

   public byte asByte(byte var1) {
      return this.asNumber(var1).byteValue();
   }

   public short asShort(short var1) {
      return this.asNumber(var1).shortValue();
   }

   public boolean asBoolean(boolean var1) {
      return this.asBoolean().result().orElse(var1);
   }

   public String asString(String var1) {
      return this.asString().result().orElse(var1);
   }

   public Stream<Dynamic<T>> asStream() {
      return this.asStreamOpt().result().orElseGet(Stream::empty);
   }

   public ByteBuffer asByteBuffer() {
      return this.asByteBufferOpt().result().orElseGet(() -> ByteBuffer.wrap(new byte[0]));
   }

   public IntStream asIntStream() {
      return this.asIntStreamOpt().result().orElseGet(IntStream::empty);
   }

   public LongStream asLongStream() {
      return this.asLongStreamOpt().result().orElseGet(LongStream::empty);
   }

   public <U> List<U> asList(Function<Dynamic<T>, U> var1) {
      return this.<U>asListOpt(var1).result().orElseGet(ImmutableList::of);
   }

   public <K, V> Map<K, V> asMap(Function<Dynamic<T>, K> var1, Function<Dynamic<T>, V> var2) {
      return this.<K, V>asMapOpt(var1, var2).result().orElseGet(ImmutableMap::of);
   }

   public T getElement(String var1, T var2) {
      return this.getElement(var1).result().orElse((T)var2);
   }

   public T getElementGeneric(T var1, T var2) {
      return this.getElementGeneric((T)var1).result().orElse((T)var2);
   }

   public Dynamic<T> emptyList() {
      return new Dynamic<>(this.ops, this.ops.emptyList());
   }

   public Dynamic<T> emptyMap() {
      return new Dynamic<>(this.ops, this.ops.emptyMap());
   }

   public Dynamic<T> createNumeric(Number var1) {
      return new Dynamic<>(this.ops, this.ops.createNumeric(var1));
   }

   public Dynamic<T> createByte(byte var1) {
      return new Dynamic<>(this.ops, this.ops.createByte(var1));
   }

   public Dynamic<T> createShort(short var1) {
      return new Dynamic<>(this.ops, this.ops.createShort(var1));
   }

   public Dynamic<T> createInt(int var1) {
      return new Dynamic<>(this.ops, this.ops.createInt(var1));
   }

   public Dynamic<T> createLong(long var1) {
      return new Dynamic<>(this.ops, this.ops.createLong(var1));
   }

   public Dynamic<T> createFloat(float var1) {
      return new Dynamic<>(this.ops, this.ops.createFloat(var1));
   }

   public Dynamic<T> createDouble(double var1) {
      return new Dynamic<>(this.ops, this.ops.createDouble(var1));
   }

   public Dynamic<T> createBoolean(boolean var1) {
      return new Dynamic<>(this.ops, this.ops.createBoolean(var1));
   }

   public Dynamic<T> createString(String var1) {
      return new Dynamic<>(this.ops, this.ops.createString(var1));
   }

   public Dynamic<T> createList(Stream<? extends Dynamic<?>> var1) {
      return new Dynamic<>(this.ops, this.ops.createList(var1.map(var1x -> var1x.cast(this.ops))));
   }

   public Dynamic<T> createMap(Map<? extends Dynamic<?>, ? extends Dynamic<?>> var1) {
      Builder var2 = ImmutableMap.builder();

      for (Entry var4 : var1.entrySet()) {
         var2.put(((Dynamic)var4.getKey()).cast(this.ops), ((Dynamic)var4.getValue()).cast(this.ops));
      }

      return new Dynamic<>(this.ops, this.ops.createMap(var2.build()));
   }

   public Dynamic<?> createByteList(ByteBuffer var1) {
      return new Dynamic<>(this.ops, this.ops.createByteList(var1));
   }

   public Dynamic<?> createIntList(IntStream var1) {
      return new Dynamic<>(this.ops, this.ops.createIntList(var1));
   }

   public Dynamic<?> createLongList(LongStream var1) {
      return new Dynamic<>(this.ops, this.ops.createLongList(var1));
   }
}
