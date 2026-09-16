package org.jgrapht.util;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.UUID;
import java.util.function.Supplier;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;

public class SupplierUtil {
   public static final Supplier<DefaultEdge> DEFAULT_EDGE_SUPPLIER = DefaultEdge::new;
   public static final Supplier<DefaultWeightedEdge> DEFAULT_WEIGHTED_EDGE_SUPPLIER = DefaultWeightedEdge::new;
   public static final Supplier<Object> OBJECT_SUPPLIER = Object::new;

   public static <T> Supplier<T> createSupplier(Class<? extends T> var0) {
      if (var0 == DefaultEdge.class) {
         return (Supplier<T>)DEFAULT_EDGE_SUPPLIER;
      }

      if (var0 == DefaultWeightedEdge.class) {
         return (Supplier<T>)DEFAULT_WEIGHTED_EDGE_SUPPLIER;
      }

      if (var0 == Object.class) {
         return (Supplier<T>)OBJECT_SUPPLIER;
      }

      try {
         Constructor var1 = var0.getDeclaredConstructor();
         if ((!Modifier.isPublic(var1.getModifiers()) || !Modifier.isPublic(var1.getDeclaringClass().getModifiers())) && !var1.canAccess(null)) {
            var1.setAccessible(true);
         }

         return new SupplierUtil.ConstructorSupplier<>(var1);
      } catch (ReflectiveOperationException var2) {
         return getThrowingSupplier(var2);
      }
   }

   private static <T> Supplier<T> getThrowingSupplier(Throwable var0) {
      return () -> {
         throw new SupplierException(var0.getMessage(), var0);
      };
   }

   public static Supplier<DefaultEdge> createDefaultEdgeSupplier() {
      return DEFAULT_EDGE_SUPPLIER;
   }

   public static Supplier<DefaultWeightedEdge> createDefaultWeightedEdgeSupplier() {
      return DEFAULT_WEIGHTED_EDGE_SUPPLIER;
   }

   public static Supplier<Integer> createIntegerSupplier() {
      return createIntegerSupplier(0);
   }

   public static Supplier<Integer> createIntegerSupplier(int var0) {
      int[] var1 = new int[]{var0};
      return () -> Integer.valueOf((int)(var1[0]++));
   }

   public static Supplier<Long> createLongSupplier() {
      return createLongSupplier(0L);
   }

   public static Supplier<Long> createLongSupplier(long var0) {
      long[] var2 = new long[]{var0};
      return () -> Long.valueOf((long)(var2[0]++));
   }

   public static Supplier<String> createStringSupplier() {
      return createStringSupplier(0);
   }

   public static Supplier<String> createRandomUUIDStringSupplier() {
      return () -> UUID.randomUUID().toString();
   }

   public static Supplier<String> createStringSupplier(int var0) {
      int[] var1 = new int[]{var0};
      return () -> String.valueOf((int)(var1[0]++));
   }

   private static class ConstructorSupplier<T> implements Serializable, Supplier<T> {
      private final Constructor<? extends T> constructor;

      public ConstructorSupplier(Constructor<? extends T> var1) {
         this.constructor = var1;
      }

      @Override
      public T get() {
         try {
            return (T)this.constructor.newInstance();
         } catch (ReflectiveOperationException var2) {
            throw new SupplierException("Supplier failed", var2);
         }
      }

      Object writeReplace() {
         return new SupplierUtil.ConstructorSupplier.SerializedForm<>(this.constructor.getDeclaringClass());
      }

      private static class SerializedForm<T> implements Serializable {
         private static final long serialVersionUID = -2385289829144892760L;
         private final Class<T> type;

         public SerializedForm(Class<T> var1) {
            this.type = var1;
         }

         Object readResolve() {
            try {
               return new SupplierUtil.ConstructorSupplier<>(this.type.getDeclaredConstructor());
            } catch (ReflectiveOperationException var3) {
               InvalidObjectException var2 = new InvalidObjectException("Failed to get no-args constructor from " + this.type);
               var2.initCause(var3);
               throw var2;
            }
         }
      }
   }
}
