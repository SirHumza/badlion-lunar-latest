package org.spongepowered.include.com.google.common.base;

import java.io.Serializable;
import java.util.Collection;
import javax.annotation.Nullable;

public final class Predicates {
   private static final Joiner COMMA_JOINER = Joiner.on(',');

   public static <T> Predicate<T> isNull() {
      return Predicates.ObjectPredicate.IS_NULL.withNarrowedType();
   }

   public static <T> Predicate<T> equalTo(@Nullable T var0) {
      return var0 == null ? isNull() : new Predicates.IsEqualToPredicate<>(var0);
   }

   public static <T> Predicate<T> in(Collection<? extends T> var0) {
      return new Predicates.InPredicate<>(var0);
   }

   private static class InPredicate<T> implements Serializable, Predicate<T> {
      private final Collection<?> target;

      private InPredicate(Collection<?> var1) {
         this.target = Preconditions.checkNotNull(var1);
      }

      @Override
      public boolean apply(@Nullable T var1) {
         try {
            return this.target.contains(var1);
         } catch (NullPointerException var3) {
            return false;
         } catch (ClassCastException var4) {
            return false;
         }
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof Predicates.InPredicate) {
            Predicates.InPredicate var2 = (Predicates.InPredicate)var1;
            return this.target.equals(var2.target);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.target.hashCode();
      }

      @Override
      public String toString() {
         return "Predicates.in(" + this.target + ")";
      }
   }

   private static class IsEqualToPredicate<T> implements Serializable, Predicate<T> {
      private final T target;

      private IsEqualToPredicate(T var1) {
         this.target = (T)var1;
      }

      @Override
      public boolean apply(T var1) {
         return this.target.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.target.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof Predicates.IsEqualToPredicate) {
            Predicates.IsEqualToPredicate var2 = (Predicates.IsEqualToPredicate)var1;
            return this.target.equals(var2.target);
         } else {
            return false;
         }
      }

      @Override
      public String toString() {
         return "Predicates.equalTo(" + this.target + ")";
      }
   }

   enum ObjectPredicate implements Predicate<Object> {
      ALWAYS_TRUE {
         @Override
         public boolean apply(@Nullable Object var1) {
            return true;
         }

         @Override
         public String toString() {
            return "Predicates.alwaysTrue()";
         }
      },
      ALWAYS_FALSE {
         @Override
         public boolean apply(@Nullable Object var1) {
            return false;
         }

         @Override
         public String toString() {
            return "Predicates.alwaysFalse()";
         }
      },
      IS_NULL {
         @Override
         public boolean apply(@Nullable Object var1) {
            return var1 == null;
         }

         @Override
         public String toString() {
            return "Predicates.isNull()";
         }
      },
      NOT_NULL {
         @Override
         public boolean apply(@Nullable Object var1) {
            return var1 != null;
         }

         @Override
         public String toString() {
            return "Predicates.notNull()";
         }
      };

      ObjectPredicate() {
      }

      <T> Predicate<T> withNarrowedType() {
         return this;
      }
   }
}
