package com.lunarclient.dfu.serialization;

import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public interface ListBuilder<T> {
   DynamicOps<T> ops();

   DataResult<T> build(T var1);

   ListBuilder<T> add(T var1);

   ListBuilder<T> add(DataResult<T> var1);

   ListBuilder<T> withErrorsFrom(DataResult<?> var1);

   ListBuilder<T> mapError(UnaryOperator<String> var1);

   default DataResult<T> build(DataResult<T> var1) {
      return var1.flatMap(this::build);
   }

   default <E> ListBuilder<T> add(E var1, Encoder<E> var2) {
      return this.add(var2.encodeStart(this.ops(), var1));
   }

   default <E> ListBuilder<T> addAll(Iterable<E> var1, Encoder<E> var2) {
      var1.forEach(var2x -> var2.encode(var2x, this.ops(), this.ops().empty()));
      return this;
   }

   final class Builder<T> implements ListBuilder<T> {
      private final DynamicOps<T> ops;
      private DataResult<com.google.common.collect.ImmutableList.Builder<T>> builder = DataResult.success(ImmutableList.builder(), Lifecycle.stable());

      public Builder(DynamicOps<T> var1) {
         this.ops = var1;
      }

      @Override
      public DynamicOps<T> ops() {
         return this.ops;
      }

      @Override
      public ListBuilder<T> add(T var1) {
         this.builder = this.builder.map(var1x -> var1x.add(var1));
         return this;
      }

      @Override
      public ListBuilder<T> add(DataResult<T> var1) {
         this.builder = this.builder.apply2stable(com.google.common.collect.ImmutableList.Builder::add, var1);
         return this;
      }

      @Override
      public ListBuilder<T> withErrorsFrom(DataResult<?> var1) {
         this.builder = this.builder.flatMap(var1x -> var1.map(var1xx -> var1x));
         return this;
      }

      @Override
      public ListBuilder<T> mapError(UnaryOperator<String> var1) {
         this.builder = this.builder.mapError(var1);
         return this;
      }

      @Override
      public DataResult<T> build(T var1) {
         DataResult var2 = this.builder.flatMap(var2x -> this.ops.mergeToList((T)var1, var2x.build()));
         this.builder = DataResult.success(ImmutableList.builder(), Lifecycle.stable());
         return var2;
      }
   }
}
