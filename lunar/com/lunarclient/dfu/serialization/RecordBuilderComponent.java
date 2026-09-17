package com.lunarclient.dfu.serialization;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.function.UnaryOperator;

public interface RecordBuilder<T> {
   DynamicOps<T> ops();

   RecordBuilder<T> add(T var1, T var2);

   RecordBuilder<T> add(T var1, DataResult<T> var2);

   RecordBuilder<T> add(DataResult<T> var1, DataResult<T> var2);

   RecordBuilder<T> withErrorsFrom(DataResult<?> var1);

   RecordBuilder<T> setLifecycle(Lifecycle var1);

   RecordBuilder<T> mapError(UnaryOperator<String> var1);

   DataResult<T> build(T var1);

   default DataResult<T> build(DataResult<T> var1) {
      return var1.flatMap(this::build);
   }

   default RecordBuilder<T> add(String var1, T var2) {
      return this.add(this.ops().createString(var1), (T)var2);
   }

   default RecordBuilder<T> add(String var1, DataResult<T> var2) {
      return this.add(this.ops().createString(var1), var2);
   }

   default <E> RecordBuilder<T> add(String var1, E var2, Encoder<E> var3) {
      return this.add(var1, var3.encodeStart(this.ops(), var2));
   }

   abstract class AbstractBuilder<T, R> implements RecordBuilder<T> {
      private final DynamicOps<T> ops;
      protected DataResult<R> builder = DataResult.success(this.initBuilder(), Lifecycle.stable());

      protected AbstractBuilder(DynamicOps<T> var1) {
         this.ops = var1;
      }

      @Override
      public DynamicOps<T> ops() {
         return this.ops;
      }

      protected abstract R initBuilder();

      protected abstract DataResult<T> build(R var1, T var2);

      @Override
      public DataResult<T> build(T var1) {
         DataResult var2 = this.builder.flatMap(var2x -> this.build((R)var2x, (T)var1));
         this.builder = DataResult.success(this.initBuilder(), Lifecycle.stable());
         return var2;
      }

      @Override
      public RecordBuilder<T> withErrorsFrom(DataResult<?> var1) {
         this.builder = this.builder.flatMap(var1x -> var1.map(var1xx -> (R)var1x));
         return this;
      }

      @Override
      public RecordBuilder<T> setLifecycle(Lifecycle var1) {
         this.builder = this.builder.setLifecycle(var1);
         return this;
      }

      @Override
      public RecordBuilder<T> mapError(UnaryOperator<String> var1) {
         this.builder = this.builder.mapError(var1);
         return this;
      }
   }

   abstract class AbstractStringBuilder<T, R> extends RecordBuilder.AbstractBuilder<T, R> {
      protected AbstractStringBuilder(DynamicOps<T> var1) {
         super(var1);
      }

      protected abstract R append(String var1, T var2, R var3);

      @Override
      public RecordBuilder<T> add(String var1, T var2) {
         this.builder = this.builder.map(var3 -> this.append(var1, (T)var2, (R)var3));
         return this;
      }

      @Override
      public RecordBuilder<T> add(String var1, DataResult<T> var2) {
         this.builder = this.builder.apply2stable((var2x, var3) -> this.append(var1, (T)var3, var2x), var2);
         return this;
      }

      @Override
      public RecordBuilder<T> add(T var1, T var2) {
         this.builder = this.ops().getStringValue((T)var1).flatMap(var2x -> {
            this.add(var2x, (T)var2);
            return this.builder;
         });
         return this;
      }

      @Override
      public RecordBuilder<T> add(T var1, DataResult<T> var2) {
         this.builder = this.ops().getStringValue((T)var1).flatMap(var2x -> {
            this.add(var2x, var2);
            return this.builder;
         });
         return this;
      }

      @Override
      public RecordBuilder<T> add(DataResult<T> var1, DataResult<T> var2) {
         this.builder = var1.flatMap(this.ops()::getStringValue).flatMap(var2x -> {
            this.add(var2x, var2);
            return this.builder;
         });
         return this;
      }
   }

   abstract class AbstractUniversalBuilder<T, R> extends RecordBuilder.AbstractBuilder<T, R> {
      protected AbstractUniversalBuilder(DynamicOps<T> var1) {
         super(var1);
      }

      protected abstract R append(T var1, T var2, R var3);

      @Override
      public RecordBuilder<T> add(T var1, T var2) {
         this.builder = this.builder.map(var3 -> this.append((T)var1, (T)var2, (R)var3));
         return this;
      }

      @Override
      public RecordBuilder<T> add(T var1, DataResult<T> var2) {
         this.builder = this.builder.apply2stable((var2x, var3) -> this.append((T)var1, (T)var3, var2x), var2);
         return this;
      }

      @Override
      public RecordBuilder<T> add(DataResult<T> var1, DataResult<T> var2) {
         this.builder = this.builder.ap(var1.apply2stable((var1x, var2x) -> var3 -> this.append((T)var1x, (T)var2x, var3), var2));
         return this;
      }
   }

   final class MapBuilder<T> extends RecordBuilder.AbstractUniversalBuilder<T, Builder<T, T>> {
      public MapBuilder(DynamicOps<T> var1) {
         super(var1);
      }

      protected Builder<T, T> initBuilder() {
         return ImmutableMap.builder();
      }

      protected Builder<T, T> append(T var1, T var2, Builder<T, T> var3) {
         return var3.put(var1, var2);
      }

      protected DataResult<T> build(Builder<T, T> var1, T var2) {
         return this.ops().mergeToMap((T)var2, var1.buildKeepingLast());
      }
   }
}
