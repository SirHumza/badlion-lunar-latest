package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class StringUtils {
   private static final Charset UTF_8 = Charset.forName("UTF-8");
   private static final String CORRUPTED_NIL_UUID = "0000-0000";
   private static final String PROPER_NIL_UUID = "00000000-0000-0000-0000-000000000000";
   @NotNull
   private static final Pattern PATTERN_WORD_SNAKE_CASE = Pattern.compile("[\\W_]+");

   private StringUtils() {
   }

   @Nullable
   public static String getStringAfterDot(@Nullable String var0) {
      if (var0 != null) {
         int var1 = var0.lastIndexOf(".");
         return var1 >= 0 && var0.length() > var1 + 1 ? var0.substring(var1 + 1) : var0;
      } else {
         return null;
      }
   }

   @Nullable
   public static String capitalize(@Nullable String var0) {
      return var0 != null && !var0.isEmpty() ? var0.substring(0, 1).toUpperCase(Locale.ROOT) + var0.substring(1).toLowerCase(Locale.ROOT) : var0;
   }

   @Nullable
   public static String camelCase(@Nullable String var0) {
      if (var0 != null && !var0.isEmpty()) {
         String[] var1 = PATTERN_WORD_SNAKE_CASE.split(var0, -1);
         StringBuilder var2 = new StringBuilder();

         for (String var6 : var1) {
            var2.append(capitalize(var6));
         }

         return var2.toString();
      } else {
         return var0;
      }
   }

   @Nullable
   public static String removeSurrounding(@Nullable String var0, @Nullable String var1) {
      return var0 != null && var1 != null && var0.startsWith(var1) && var0.endsWith(var1) ? var0.substring(var1.length(), var0.length() - var1.length()) : var0;
   }

   @NotNull
   public static String byteCountToString(long var0) {
      if (-1000L < var0 && var0 < 1000L) {
         return var0 + " B";
      }

      StringCharacterIterator var2 = new StringCharacterIterator("kMGTPE");

      while (var0 <= -999950L || var0 >= 999950L) {
         var0 /= 1000L;
         var2.next();
      }

      return String.format(Locale.ROOT, "%.1f %cB", var0 / 1000.0, var2.current());
   }

   @Nullable
   public static String calculateStringHash(@Nullable String var0, @NotNull ILogger var1) {
      if (var0 != null && !var0.isEmpty()) {
         try {
            MessageDigest var2 = MessageDigest.getInstance("SHA-1");
            byte[] var3 = var2.digest(var0.getBytes(UTF_8));
            BigInteger var4 = new BigInteger(1, var3);
            StringBuilder var5 = new StringBuilder(var4.toString(16));
            return var5.toString();
         } catch (NoSuchAlgorithmException var6) {
            var1.log(SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", var6);
         } catch (Throwable var7) {
            var1.log(SentryLevel.INFO, "string: %s could not calculate its hash", var7, var0);
         }

         return null;
      } else {
         return null;
      }
   }

   public static int countOf(@NotNull String var0, char var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         if (var0.charAt(var3) == var1) {
            var2++;
         }
      }

      return var2;
   }

   public static String normalizeUUID(@NotNull String var0) {
      return var0.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : var0;
   }

   public static String join(@NotNull CharSequence var0, @NotNull Iterable<? extends CharSequence> var1) {
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();
      if (var3.hasNext()) {
         var2.append((CharSequence)var3.next());

         while (var3.hasNext()) {
            var2.append(var0);
            var2.append((CharSequence)var3.next());
         }
      }

      return var2.toString();
   }

   @Nullable
   public static String toString(@Nullable Object var0) {
      return var0 == null ? null : var0.toString();
   }

   @NotNull
   public static String removePrefix(@Nullable String var0, @NotNull String var1) {
      if (var0 == null) {
         return "";
      }

      int var2 = var0.indexOf(var1);
      return var2 == 0 ? var0.substring(var1.length()) : var0;
   }

   @NotNull
   public static String substringBefore(@Nullable String var0, @NotNull String var1) {
      if (var0 == null) {
         return "";
      }

      int var2 = var0.indexOf(var1);
      return var2 >= 0 ? var0.substring(0, var2) : var0;
   }
}
