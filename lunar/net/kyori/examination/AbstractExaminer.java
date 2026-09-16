package net.kyori.examination;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.function.IntFunction;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractExaminer<R> implements Examiner<R> {
   @NotNull
   @Override
   public R examine(@Nullable Object var1) {
      if (var1 == null) {
         return this.nil();
      }

      if (var1 instanceof String) {
         return this.examine((String)var1);
      }

      if (var1 instanceof Examinable) {
         return this.examine((Examinable)var1);
      }

      if (var1 instanceof Collection) {
         return this.collection((Collection)var1);
      }

      if (var1 instanceof Map) {
         return this.map((Map)var1);
      }

      if (var1.getClass().isArray()) {
         Class var2 = var1.getClass().getComponentType();
         if (var2.isPrimitive()) {
            if (var2 == boolean.class) {
               return this.examine((boolean[])var1);
            }

            if (var2 == byte.class) {
               return this.examine((byte[])var1);
            }

            if (var2 == char.class) {
               return this.examine((char[])var1);
            }

            if (var2 == double.class) {
               return this.examine((double[])var1);
            }

            if (var2 == float.class) {
               return this.examine((float[])var1);
            }

            if (var2 == int.class) {
               return this.examine((int[])var1);
            }

            if (var2 == long.class) {
               return this.examine((long[])var1);
            }

            if (var2 == short.class) {
               return this.examine((short[])var1);
            }
         }

         return this.array((Object[])var1);
      } else {
         if (var1 instanceof Boolean) {
            return this.examine(((Boolean)var1).booleanValue());
         }

         if (var1 instanceof Character) {
            return this.examine(((Character)var1).charValue());
         }

         if (var1 instanceof Number) {
            if (var1 instanceof Byte) {
               return this.examine(((Byte)var1).byteValue());
            }

            if (var1 instanceof Double) {
               return this.examine(((Double)var1).doubleValue());
            }

            if (var1 instanceof Float) {
               return this.examine(((Float)var1).floatValue());
            }

            if (var1 instanceof Integer) {
               return this.examine(((Integer)var1).intValue());
            }

            if (var1 instanceof Long) {
               return this.examine(((Long)var1).longValue());
            }

            if (var1 instanceof Short) {
               return this.examine(((Short)var1).shortValue());
            }
         } else if (var1 instanceof BaseStream) {
            if (var1 instanceof Stream) {
               return this.stream((Stream)var1);
            }

            if (var1 instanceof DoubleStream) {
               return this.stream((DoubleStream)var1);
            }

            if (var1 instanceof IntStream) {
               return this.stream((IntStream)var1);
            }

            if (var1 instanceof LongStream) {
               return this.stream((LongStream)var1);
            }
         }

         return this.scalar(var1);
      }
   }

   @NotNull
   private <E> R array(E @NotNull [] var1) {
      return this.array(var1, Arrays.stream(var1).map(this::examine));
   }

   @NotNull
   protected abstract <E> R array(E @NotNull [] var1, @NotNull Stream<R> var2);

   @NotNull
   private <E> R collection(@NotNull Collection<E> var1) {
      return this.collection(var1, var1.stream().map(this::examine));
   }

   @NotNull
   protected abstract <E> R collection(@NotNull Collection<E> var1, @NotNull Stream<R> var2);

   @NotNull
   @Override
   public R examine(@NotNull String var1, @NotNull Stream<? extends ExaminableProperty> var2) {
      return this.examinable(var1, var2.map(var1x -> new SimpleImmutableEntry<>(var1x.name(), var1x.examine(this))));
   }

   @NotNull
   protected abstract R examinable(@NotNull String var1, @NotNull Stream<Entry<String, R>> var2);

   @NotNull
   private <K, V> R map(@NotNull Map<K, V> var1) {
      return this.map(var1, var1.entrySet().stream().map(var1x -> new SimpleImmutableEntry<>(this.examine(var1x.getKey()), this.examine(var1x.getValue()))));
   }

   @NotNull
   protected abstract <K, V> R map(@NotNull Map<K, V> var1, @NotNull Stream<Entry<R, R>> var2);

   @NotNull
   protected abstract R nil();

   @NotNull
   protected abstract R scalar(@NotNull Object var1);

   @NotNull
   protected abstract <T> R stream(@NotNull Stream<T> var1);

   @NotNull
   protected abstract R stream(@NotNull DoubleStream var1);

   @NotNull
   protected abstract R stream(@NotNull IntStream var1);

   @NotNull
   protected abstract R stream(@NotNull LongStream var1);

   @NotNull
   @Override
   public R examine(boolean @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   @Override
   public R examine(byte @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   @Override
   public R examine(char @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   @Override
   public R examine(double @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   @Override
   public R examine(float @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   @Override
   public R examine(int @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   @Override
   public R examine(long @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   @Override
   public R examine(short @Nullable [] var1) {
      return var1 == null ? this.nil() : this.array(var1.length, var2 -> this.examine(var1[var2]));
   }

   @NotNull
   protected abstract R array(int var1, IntFunction<R> var2);
}
