package org.checkerframework.checker.formatter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.MissingFormatArgumentException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.formatter.qual.ConversionCategory;
import org.checkerframework.checker.formatter.qual.ReturnsFormat;

public class FormatUtil {
   private static final String formatSpecifier = "%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])";
   private static Pattern fsPattern = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");

   @ReturnsFormat
   public static String asFormat(String var0, ConversionCategory... var1) {
      ConversionCategory[] var2 = formatParameterCategories(var0);
      if (var2.length != var1.length) {
         throw new FormatUtil.ExcessiveOrMissingFormatArgumentException(var1.length, var2.length);
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var1[var3] != var2[var3]) {
            throw new FormatUtil.IllegalFormatConversionCategoryException(var1[var3], var2[var3]);
         }
      }

      return var0;
   }

   public static void tryFormatSatisfiability(String var0) {
      String var1 = String.format(var0, (Object[])null);
   }

   public static ConversionCategory[] formatParameterCategories(String var0) {
      tryFormatSatisfiability(var0);
      int var1 = -1;
      int var2 = -1;
      int var3 = -1;
      FormatUtil.Conversion[] var4 = parse(var0);
      HashMap var5 = new HashMap();

      for (FormatUtil.Conversion var9 : var4) {
         int var10 = var9.index();
         switch (var10) {
            case -1:
               break;
            case 0:
               var1 = ++var2;
               break;
            default:
               var1 = var10 - 1;
         }

         var3 = Math.max(var3, var1);
         var5.put(var1, ConversionCategory.intersect(var5.containsKey(var1) ? (ConversionCategory)var5.get(var1) : ConversionCategory.UNUSED, var9.category()));
      }

      ConversionCategory[] var11 = new ConversionCategory[var3 + 1];

      for (int var12 = 0; var12 <= var3; var12++) {
         var11[var12] = var5.containsKey(var12) ? (ConversionCategory)var5.get(var12) : ConversionCategory.UNUSED;
      }

      return var11;
   }

   private static int indexFromFormat(Matcher var0) {
      String var2 = var0.group(1);
      int var1;
      if (var2 != null) {
         var1 = Integer.parseInt(var2.substring(0, var2.length() - 1));
      } else if (var0.group(2) != null && var0.group(2).contains(String.valueOf('<'))) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      return var1;
   }

   private static char conversionCharFromFormat(Matcher var0) {
      String var1 = var0.group(5);
      return var1 == null ? var0.group(6).charAt(0) : var1.charAt(0);
   }

   private static FormatUtil.Conversion[] parse(String var0) {
      ArrayList var1 = new ArrayList();
      Matcher var2 = fsPattern.matcher(var0);

      while (var2.find()) {
         char var3 = conversionCharFromFormat(var2);
         switch (var3) {
            case '%':
            case 'n':
               break;
            default:
               var1.add(new FormatUtil.Conversion(var3, indexFromFormat(var2)));
         }
      }

      return var1.toArray(new FormatUtil.Conversion[var1.size()]);
   }

   private static class Conversion {
      private final int index;
      private final ConversionCategory cath;

      public Conversion(char var1, int var2) {
         this.index = var2;
         this.cath = ConversionCategory.fromConversionChar(var1);
      }

      int index() {
         return this.index;
      }

      ConversionCategory category() {
         return this.cath;
      }
   }

   public static class ExcessiveOrMissingFormatArgumentException extends MissingFormatArgumentException {
      private static final long serialVersionUID = 17000126L;
      private final int expected;
      private final int found;

      public ExcessiveOrMissingFormatArgumentException(int var1, int var2) {
         super("-");
         this.expected = var1;
         this.found = var2;
      }

      public int getExpected() {
         return this.expected;
      }

      public int getFound() {
         return this.found;
      }

      @Override
      public String getMessage() {
         return String.format("Expected %d arguments but found %d.", this.expected, this.found);
      }
   }

   public static class IllegalFormatConversionCategoryException extends IllegalFormatConversionException {
      private static final long serialVersionUID = 17000126L;
      private final ConversionCategory expected;
      private final ConversionCategory found;

      public IllegalFormatConversionCategoryException(ConversionCategory var1, ConversionCategory var2) {
         super(var1.chars.length() == 0 ? '-' : var1.chars.charAt(0), var2.types == null ? Object.class : var2.types[0]);
         this.expected = var1;
         this.found = var2;
      }

      public ConversionCategory getExpected() {
         return this.expected;
      }

      public ConversionCategory getFound() {
         return this.found;
      }

      @Override
      public String getMessage() {
         return String.format("Expected category %s but found %s.", this.expected, this.found);
      }
   }
}
