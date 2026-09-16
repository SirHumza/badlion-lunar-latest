package org.checkerframework.checker.i18nformatter.qual;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public enum I18nConversionCategory {
   UNUSED(null, null),
   GENERAL(null, null),
   DATE(new Class[]{Date.class, Number.class}, new String[]{"date", "time"}),
   NUMBER(new Class[]{Number.class}, new String[]{"number", "choice"});

   public final Class<? extends Object>[] types;
   public final String[] strings;
   static I18nConversionCategory[] namedCategories = new I18nConversionCategory[]{DATE, NUMBER};

   I18nConversionCategory(Class<? extends Object>[] var3, String[] var4) {
      this.types = var3;
      this.strings = var4;
   }

   public static I18nConversionCategory stringToI18nConversionCategory(String var0) {
      var0 = var0.toLowerCase();

      for (I18nConversionCategory var4 : namedCategories) {
         for (String var8 : var4.strings) {
            if (var8.equals(var0)) {
               return var4;
            }
         }
      }

      throw new IllegalArgumentException("Invalid format type " + var0);
   }

   private static <E> Set<E> arrayToSet(E[] var0) {
      return new HashSet<>(Arrays.asList((E[])var0));
   }

   public static boolean isSubsetOf(I18nConversionCategory var0, I18nConversionCategory var1) {
      return intersect(var0, var1) == var0;
   }

   public static I18nConversionCategory intersect(I18nConversionCategory var0, I18nConversionCategory var1) {
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

      for (I18nConversionCategory var7 : new I18nConversionCategory[]{DATE, NUMBER}) {
         Set var8 = arrayToSet(var7.types);
         if (var8.equals(var2)) {
            return var7;
         }
      }

      throw new RuntimeException();
   }

   public static I18nConversionCategory union(I18nConversionCategory var0, I18nConversionCategory var1) {
      if (var0 == UNUSED || var1 == UNUSED) {
         return UNUSED;
      } else if (var0 == GENERAL || var1 == GENERAL) {
         return GENERAL;
      } else {
         return var0 != DATE && var1 != DATE ? NUMBER : DATE;
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(this.name());
      if (this.types == null) {
         var1.append(" conversion category (all types)");
      } else {
         var1.append(" conversion category (one of: ");
         boolean var2 = true;

         for (Class var6 : this.types) {
            if (!var2) {
               var1.append(", ");
            }

            var1.append(var6.getCanonicalName());
            var2 = false;
         }

         var1.append(")");
      }

      return var1.toString();
   }
}
