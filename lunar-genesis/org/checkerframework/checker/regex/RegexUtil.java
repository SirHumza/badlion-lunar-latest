package org.checkerframework.checker.regex;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.checkerframework.checker.index.qual.GTENegativeOne;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.regex.qual.Regex;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.checkerframework.framework.qual.EnsuresQualifierIf;

public final class RegexUtil {
   private RegexUtil() {
      throw new Error("do not instantiate");
   }

   @Pure
   @EnsuresQualifierIf(result = true, expression = "#1", qualifier = Regex.class)
   public static boolean isRegex(String var0) {
      return isRegex(var0, 0);
   }

   @Pure
   @EnsuresQualifierIf(result = true, expression = "#1", qualifier = Regex.class)
   public static boolean isRegex(String var0, int var1) {
      Pattern var2;
      try {
         var2 = Pattern.compile(var0);
      } catch (PatternSyntaxException var4) {
         return false;
      }

      return getGroupCount(var2) >= var1;
   }

   @Pure
   @EnsuresQualifierIf(result = true, expression = "#1", qualifier = Regex.class)
   public static boolean isRegex(char var0) {
      return isRegex(Character.toString(var0));
   }

   @SideEffectFree
   public static @Nullable String regexError(String var0) {
      return regexError(var0, 0);
   }

   @SideEffectFree
   public static @Nullable String regexError(String var0, int var1) {
      try {
         Pattern var2 = Pattern.compile(var0);
         int var3 = getGroupCount(var2);
         return var3 < var1 ? regexErrorMessage(var0, var1, var3) : null;
      } catch (PatternSyntaxException var4) {
         return var4.getMessage();
      }
   }

   @SideEffectFree
   public static @Nullable PatternSyntaxException regexException(String var0) {
      return regexException(var0, 0);
   }

   @SideEffectFree
   public static @Nullable PatternSyntaxException regexException(String var0, int var1) {
      try {
         Pattern var2 = Pattern.compile(var0);
         int var3 = getGroupCount(var2);
         return var3 < var1 ? new PatternSyntaxException(regexErrorMessage(var0, var1, var3), var0, -1) : null;
      } catch (PatternSyntaxException var4) {
         return var4;
      }
   }

   @SideEffectFree
   public static @Regex String asRegex(String var0) {
      return asRegex(var0, 0);
   }

   @SideEffectFree
   public static @Regex String asRegex(String var0, int var1) {
      try {
         Pattern var2 = Pattern.compile(var0);
         int var3 = getGroupCount(var2);
         if (var3 < var1) {
            throw new Error(regexErrorMessage(var0, var1, var3));
         } else {
            return var0;
         }
      } catch (PatternSyntaxException var4) {
         throw new Error(var4);
      }
   }

   @SideEffectFree
   private static String regexErrorMessage(String var0, int var1, int var2) {
      return "regex \"" + var0 + "\" has " + var2 + " groups, but " + var1 + " groups are needed.";
   }

   @Pure
   private static int getGroupCount(Pattern var0) {
      return var0.matcher("").groupCount();
   }

   public static class CheckedPatternSyntaxException extends Exception {
      private static final long serialVersionUID = 6266881831979001480L;
      private final PatternSyntaxException pse;

      public CheckedPatternSyntaxException(PatternSyntaxException var1) {
         this.pse = var1;
      }

      public CheckedPatternSyntaxException(String var1, String var2, @GTENegativeOne int var3) {
         this(new PatternSyntaxException(var1, var2, var3));
      }

      public String getDescription() {
         return this.pse.getDescription();
      }

      public int getIndex() {
         return this.pse.getIndex();
      }

      @Pure
      @Override
      public String getMessage() {
         return this.pse.getMessage();
      }

      public String getPattern() {
         return this.pse.getPattern();
      }
   }
}
