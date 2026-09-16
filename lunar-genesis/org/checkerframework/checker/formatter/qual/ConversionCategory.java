package org.checkerframework.checker.formatter.qual;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.dataflow.qual.Pure;

public enum ConversionCategory {
   GENERAL(null, "bBhHsS"),
   CHAR(new Class[]{Character.class, Byte.class, Short.class, Integer.class}, "cC"),
   INT(new Class[]{Byte.class, Short.class, Integer.class, Long.class, BigInteger.class}, "doxX"),
   FLOAT(new Class[]{Float.class, Double.class, BigDecimal.class}, "eEfgGaA"),
   TIME(new Class[]{Long.class, Calendar.class, Date.class}, "tT"),
   CHAR_AND_INT(new Class[]{Byte.class, Short.class, Integer.class}, null),
   INT_AND_TIME(new Class[]{Long.class}, null),
   NULL(new Class[0], null),
   UNUSED(null, null);

   public final Class<? extends Object>[] types;
   public final String chars;

   ConversionCategory(Class<? extends Object>[] var3, String var4) {
      this.types = var3;
      this.chars = var4;
   }

   public static ConversionCategory fromConversionChar(char var0) {
      for (ConversionCategory var4 : new ConversionCategory[]{GENERAL, CHAR, INT, FLOAT, TIME}) {
         if (var4.chars.contains(String.valueOf(var0))) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Bad conversion character " + var0);
   }

   private static <E> Set<E> arrayToSet(E[] var0) {
      return new HashSet<>(Arrays.asList((E[])var0));
   }

   public static boolean isSubsetOf(ConversionCategory var0, ConversionCategory var1) {
      return intersect(var0, var1) == var0;
   }

   public static ConversionCategory intersect(ConversionCategory var0, ConversionCategory var1) {
      if (var0 == UNUSED) {
         return var1;
      }

      if (var1 == UNUSED) {
         return var0;
      }

      if (var0 == GENERAL) {
         return var1;
      }

      if (var1 == GENERAL) {
         return var0;
      }

      Set var2 = arrayToSet(var0.types);
      Set var3 = arrayToSet(var1.types);
      var2.retainAll(var3);

      for (ConversionCategory var7 : new ConversionCategory[]{CHAR, INT, FLOAT, TIME, CHAR_AND_INT, INT_AND_TIME, NULL}) {
         Set var8 = arrayToSet(var7.types);
         if (var8.equals(var2)) {
            return var7;
         }
      }

      throw new RuntimeException();
   }

   public static ConversionCategory union(ConversionCategory var0, ConversionCategory var1) {
      if (var0 == UNUSED || var1 == UNUSED) {
         return UNUSED;
      }

      if (var0 != GENERAL && var1 != GENERAL) {
         if ((var0 != CHAR_AND_INT || var1 != INT_AND_TIME) && (var0 != INT_AND_TIME || var1 != CHAR_AND_INT)) {
            Set var2 = arrayToSet(var0.types);
            Set var3 = arrayToSet(var1.types);
            var2.addAll(var3);

            for (ConversionCategory var7 : new ConversionCategory[]{NULL, CHAR_AND_INT, INT_AND_TIME, CHAR, INT, FLOAT, TIME}) {
               Set var8 = arrayToSet(var7.types);
               if (var8.equals(var2)) {
                  return var7;
               }
            }

            return GENERAL;
         } else {
            return INT;
         }
      } else {
         return GENERAL;
      }
   }

   private String className(Class<?> var1) {
      if (var1 == Boolean.class) {
         return "boolean";
      } else if (var1 == Character.class) {
         return "char";
      } else if (var1 == Byte.class) {
         return "byte";
      } else if (var1 == Short.class) {
         return "short";
      } else if (var1 == Integer.class) {
         return "int";
      } else if (var1 == Long.class) {
         return "long";
      } else if (var1 == Float.class) {
         return "float";
      } else {
         return var1 == Double.class ? "double" : var1.getSimpleName();
      }
   }

   @Pure
   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(this.name());
      var1.append(" conversion category (one of: ");
      boolean var2 = true;

      for (Class var6 : this.types) {
         if (!var2) {
            var1.append(", ");
         }

         var1.append(this.className(var6));
         var2 = false;
      }

      var1.append(")");
      return var1.toString();
   }
}
