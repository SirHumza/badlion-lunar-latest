package org.checkerframework.checker.i18nformatter;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Locale.Category;
import org.checkerframework.checker.i18nformatter.qual.I18nChecksFormat;
import org.checkerframework.checker.i18nformatter.qual.I18nConversionCategory;
import org.checkerframework.checker.i18nformatter.qual.I18nValidFormat;

public class I18nFormatUtil {
   public static void tryFormatSatisfiability(String var0) {
      MessageFormat.format(var0, (Object[])null);
   }

   public static I18nConversionCategory[] formatParameterCategories(String var0) {
      tryFormatSatisfiability(var0);
      I18nFormatUtil.I18nConversion[] var1 = I18nFormatUtil.MessageFormatParser.parse(var0);
      int var2 = -1;
      HashMap var3 = new HashMap();

      for (I18nFormatUtil.I18nConversion var7 : var1) {
         int var8 = var7.index;
         var3.put(
            var8,
            I18nConversionCategory.intersect(var7.category, var3.containsKey(var8) ? (I18nConversionCategory)var3.get(var8) : I18nConversionCategory.UNUSED)
         );
         var2 = Math.max(var2, var8);
      }

      I18nConversionCategory[] var9 = new I18nConversionCategory[var2 + 1];

      for (int var10 = 0; var10 <= var2; var10++) {
         var9[var10] = var3.containsKey(var10) ? (I18nConversionCategory)var3.get(var10) : I18nConversionCategory.UNUSED;
      }

      return var9;
   }

   @I18nChecksFormat
   public static boolean hasFormat(String var0, I18nConversionCategory... var1) {
      I18nConversionCategory[] var2 = formatParameterCategories(var0);
      if (var2.length != var1.length) {
         return false;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (!I18nConversionCategory.isSubsetOf(var1[var3], var2[var3])) {
            return false;
         }
      }

      return true;
   }

   @I18nValidFormat
   public static boolean isFormat(String var0) {
      try {
         formatParameterCategories(var0);
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   private static class I18nConversion {
      public int index;
      public I18nConversionCategory category;

      public I18nConversion(int var1, I18nConversionCategory var2) {
         this.index = var1;
         this.category = var2;
      }

      @Override
      public String toString() {
         return this.category.toString() + "(index: " + this.index + ")";
      }
   }

   private static class MessageFormatParser {
      public static int maxOffset;
      private static Locale locale;
      private static List<I18nConversionCategory> categories;
      private static List<Integer> argumentIndices;
      private static int numFormat;
      private static final int SEG_RAW = 0;
      private static final int SEG_INDEX = 1;
      private static final int SEG_TYPE = 2;
      private static final int SEG_MODIFIER = 3;
      private static final int TYPE_NULL = 0;
      private static final int TYPE_NUMBER = 1;
      private static final int TYPE_DATE = 2;
      private static final int TYPE_TIME = 3;
      private static final int TYPE_CHOICE = 4;
      private static final String[] TYPE_KEYWORDS = new String[]{"", "number", "date", "time", "choice"};
      private static final int MODIFIER_DEFAULT = 0;
      private static final int MODIFIER_CURRENCY = 1;
      private static final int MODIFIER_PERCENT = 2;
      private static final int MODIFIER_INTEGER = 3;
      private static final String[] NUMBER_MODIFIER_KEYWORDS = new String[]{"", "currency", "percent", "integer"};
      private static final String[] DATE_TIME_MODIFIER_KEYWORDS = new String[]{"", "short", "medium", "long", "full"};

      public static I18nFormatUtil.I18nConversion[] parse(String var0) {
         categories = new ArrayList<>();
         argumentIndices = new ArrayList<>();
         locale = Locale.getDefault(Category.FORMAT);
         applyPattern(var0);
         I18nFormatUtil.I18nConversion[] var1 = new I18nFormatUtil.I18nConversion[numFormat];

         for (int var2 = 0; var2 < numFormat; var2++) {
            var1[var2] = new I18nFormatUtil.I18nConversion(argumentIndices.get(var2), categories.get(var2));
         }

         return var1;
      }

      private static void applyPattern(String var0) {
         StringBuilder[] var1 = new StringBuilder[4];
         var1[0] = new StringBuilder();
         int var2 = 0;
         numFormat = 0;
         boolean var3 = false;
         int var4 = 0;
         maxOffset = -1;

         for (int var5 = 0; var5 < var0.length(); var5++) {
            char var6 = var0.charAt(var5);
            if (var2 == 0) {
               if (var6 == '\'') {
                  if (var5 + 1 < var0.length() && var0.charAt(var5 + 1) == '\'') {
                     var1[var2].append(var6);
                     var5++;
                  } else {
                     var3 = !var3;
                  }
               } else if (var6 == '{' && !var3) {
                  var2 = 1;
                  if (var1[1] == null) {
                     var1[1] = new StringBuilder();
                  }
               } else {
                  var1[var2].append(var6);
               }
            } else if (var3) {
               var1[var2].append(var6);
               if (var6 == '\'') {
                  var3 = false;
               }
            } else {
               switch (var6) {
                  case ' ':
                     if (var2 != 2 || var1[2].length() > 0) {
                        var1[var2].append(var6);
                     }
                     break;
                  case '\'':
                     var3 = true;
                     var1[var2].append(var6);
                     break;
                  case ',':
                     if (var2 < 3) {
                        if (var1[++var2] == null) {
                           var1[var2] = new StringBuilder();
                        }
                     } else {
                        var1[var2].append(var6);
                     }
                     break;
                  case '{':
                     var4++;
                     var1[var2].append(var6);
                     break;
                  case '}':
                     if (var4 == 0) {
                        var2 = 0;
                        makeFormat(numFormat, var1);
                        numFormat++;
                        var1[1] = null;
                        var1[2] = null;
                        var1[3] = null;
                     } else {
                        var4--;
                        var1[var2].append(var6);
                     }
                     break;
                  default:
                     var1[var2].append(var6);
               }
            }
         }

         if (var4 == 0 && var2 != 0) {
            maxOffset = -1;
            throw new IllegalArgumentException("Unmatched braces in the pattern");
         }
      }

      private static void makeFormat(int var0, StringBuilder[] var1) {
         String[] var2 = new String[var1.length];

         for (int var3 = 0; var3 < var1.length; var3++) {
            StringBuilder var4 = var1[var3];
            var2[var3] = var4 != null ? var4.toString() : "";
         }

         int var13;
         try {
            var13 = Integer.parseInt(var2[1]);
         } catch (NumberFormatException var12) {
            throw new IllegalArgumentException("can't parse argument number: " + var2[1], var12);
         }

         if (var13 < 0) {
            throw new IllegalArgumentException("negative argument number: " + var13);
         }

         int var14 = maxOffset;
         maxOffset = var0;
         argumentIndices.add(var13);
         Object var5 = null;
         if (var2[2].length() != 0) {
            int var6 = findKeyword(var2[2], TYPE_KEYWORDS);
            label63:
            switch (var6) {
               case 0:
                  var5 = I18nConversionCategory.GENERAL;
                  break;
               case 1:
                  switch (findKeyword(var2[3], NUMBER_MODIFIER_KEYWORDS)) {
                     default:
                        try {
                           new DecimalFormat(var2[3], DecimalFormatSymbols.getInstance(locale));
                        } catch (IllegalArgumentException var11) {
                           maxOffset = var14;
                           throw var11;
                        }
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                        var5 = I18nConversionCategory.NUMBER;
                        break label63;
                  }
               case 2:
               case 3:
                  int var7 = findKeyword(var2[3], DATE_TIME_MODIFIER_KEYWORDS);
                  if (var7 < 0 || var7 >= DATE_TIME_MODIFIER_KEYWORDS.length) {
                     try {
                        new SimpleDateFormat(var2[3], locale);
                     } catch (IllegalArgumentException var10) {
                        maxOffset = var14;
                        throw var10;
                     }
                  }

                  var5 = I18nConversionCategory.DATE;
                  break;
               case 4:
                  if (var2[3].length() == 0) {
                     throw new IllegalArgumentException("Choice Pattern requires Subformat Pattern: " + var2[3]);
                  }

                  try {
                     new ChoiceFormat(var2[3]);
                  } catch (Exception var9) {
                     maxOffset = var14;
                     throw new IllegalArgumentException("Choice Pattern incorrect: " + var2[3], var9);
                  }

                  var5 = I18nConversionCategory.NUMBER;
                  break;
               default:
                  maxOffset = var14;
                  throw new IllegalArgumentException("unknown format type: " + var2[2]);
            }
         } else {
            var5 = I18nConversionCategory.GENERAL;
         }

         categories.add((I18nConversionCategory)var5);
      }

      private static final int findKeyword(String var0, String[] var1) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            if (var0.equals(var1[var2])) {
               return var2;
            }
         }

         String var4 = var0.trim().toLowerCase(Locale.ROOT);
         if (var4 != var0) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (var4.equals(var1[var3])) {
                  return var3;
               }
            }
         }

         return -1;
      }
   }
}
