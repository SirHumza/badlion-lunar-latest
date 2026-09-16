package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import com.lunarclient.dfu.serialization.ListBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public record ListCodec<E>() implements Codec<List<E>> {
   private final Codec<E> elementCodec;
   private final int minSize;
   private final int maxSize;

   public ListCodec(Codec<E> var1, int var2, int var3) {
      this.elementCodec = var1;
      this.minSize = var2;
      this.maxSize = var3;
   }

   private <R> DataResult<R> createTooShortError(int var1) {
      return DataResult.error(() -> "List is too short: " + var1 + ", expected range [" + this.minSize + "-" + this.maxSize + "]");
   }

   private <R> DataResult<R> createTooLongError(int var1) {
      return DataResult.error(() -> "List is too long: " + var1 + ", expected range [" + this.minSize + "-" + this.maxSize + "]");
   }

   public <T> DataResult<T> encode(List<E> var1, DynamicOps<T> var2, T var3) {
      if (var1.size() < this.minSize) {
         return this.createTooShortError(var1.size());
      }

      if (var1.size() > this.maxSize) {
         return this.createTooLongError(var1.size());
      }

      ListBuilder var4 = var2.listBuilder();

      for (Object var6 : var1) {
         var4.add(this.elementCodec.encodeStart(var2, (E)var6));
      }

      return (DataResult<T>)var4.build(var3);
   }

   @Override
   public <T> DataResult<Pair<List<E>, T>> decode(DynamicOps<T> var1, T var2) {
      return var1.getList(var2).setLifecycle(Lifecycle.stable()).flatMap(var2x -> {
         ListCodec.DecoderState var3 = new ListCodec.DecoderState(var1);
         var2x.accept(var3::accept);
         return var3.build();
      });
   }

   @Override
   public String toString() {
      return "ListCodec[" + this.elementCodec + "]";
   }

   private class DecoderState<T> {
      private static final DataResult<Unit> INITIAL_RESULT = DataResult.success(Unit.INSTANCE, Lifecycle.stable());
      private final DynamicOps<T> ops;
      private final List<E> elements = new ArrayList<>();
      private final Builder<T> failed = Stream.builder();
      private DataResult<Unit> result = INITIAL_RESULT;
      private int totalCount;

      private DecoderState(DynamicOps<T> var2) {
         this.ops = var2;
      }

      public void accept(T var1) {
         this.totalCount++;
         if (this.elements.size() >= ListCodec.this.maxSize) {
            this.failed.add((T)var1);
         } else {
            DataResult var2 = ListCodec.this.elementCodec.decode(this.ops, (T)var1);
            var2.error().ifPresent(var2x -> this.failed.add((T)var1));
            var2.resultOrPartial().ifPresent(var1x -> this.elements.add((E)var1x.getFirst()));
            this.result = this.result.apply2stable((var0, var1x) -> var0, var2);
         }
      }

      public DataResult<Pair<List<E>, T>> build() {
         if (this.elements.size() < ListCodec.this.minSize) {
            return ListCodec.this.createTooShortError(this.elements.size());
         }

         Object var1 = this.ops.createList(this.failed.build());
         Pair var2 = Pair.of(List.copyOf(this.elements), var1);
         if (this.totalCount > ListCodec.this.maxSize) {
            this.result = ListCodec.this.createTooLongError(this.totalCount);
         }

         return this.result.<Pair<List<E>, T>>map(var1x -> var2).setPartial(var2);
      }
   }
}
