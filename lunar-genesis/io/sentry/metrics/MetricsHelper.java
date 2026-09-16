package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import io.sentry.util.Random;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class MetricsHelper {
   public static final long FLUSHER_SLEEP_TIME_MS = 5000L;
   public static final int MAX_TOTAL_WEIGHT = 100000;
   private static final int ROLLUP_IN_SECONDS = 10;
   private static final Pattern UNIT_PATTERN = Pattern.compile("\\W+");
   private static final Pattern NAME_PATTERN = Pattern.compile("[^\\w\\-.]+");
   private static final Pattern TAG_KEY_PATTERN = Pattern.compile("[^\\w\\-./]+");
   private static final char TAGS_PAIR_DELIMITER = ',';
   private static final char TAGS_KEY_VALUE_DELIMITER = '=';
   private static final char TAGS_ESCAPE_CHAR = '\\';
   private static long FLUSH_SHIFT_MS = (long)(new Random().nextFloat() * 10000.0F);

   public static long getTimeBucketKey(long var0) {
      long var2 = var0 / 1000L;
      long var4 = var2 / 10L * 10L;
      return var0 >= 0L ? var4 : var4 - 1L;
   }

   public static long getCutoffTimestampMs(long var0) {
      return var0 - 10000L - FLUSH_SHIFT_MS;
   }

   @NotNull
   public static String sanitizeUnit(@NotNull String var0) {
      return UNIT_PATTERN.matcher(var0).replaceAll("");
   }

   @NotNull
   public static String sanitizeName(@NotNull String var0) {
      return NAME_PATTERN.matcher(var0).replaceAll("_");
   }

   @NotNull
   public static String sanitizeTagKey(@NotNull String var0) {
      return TAG_KEY_PATTERN.matcher(var0).replaceAll("");
   }

   @NotNull
   public static String sanitizeTagValue(@NotNull String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 == '\n') {
            var1.append("\\n");
         } else if (var3 == '\r') {
            var1.append("\\r");
         } else if (var3 == '\t') {
            var1.append("\\t");
         } else if (var3 == '\\') {
            var1.append("\\\\");
         } else if (var3 == '|') {
            var1.append("\\u{7c}");
         } else if (var3 == ',') {
            var1.append("\\u{2c}");
         } else {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   @NotNull
   public static String getMetricBucketKey(@NotNull MetricType var0, @NotNull String var1, @Nullable MeasurementUnit var2, @Nullable Map<String, String> var3) {
      String var4 = var0.statsdCode;
      String var5 = getTagsKey(var3);
      String var6 = getUnitName(var2);
      return String.format("%s_%s_%s_%s", var4, var1, var6, var5);
   }

   @NotNull
   private static String getUnitName(@Nullable MeasurementUnit var0) {
      return var0 != null ? var0.apiName() : "none";
   }

   @NotNull
   private static String getTagsKey(@Nullable Map<String, String> var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder();

         for (Entry var3 : var0.entrySet()) {
            String var4 = escapeString((String)var3.getKey());
            String var5 = escapeString((String)var3.getValue());
            if (var1.length() > 0) {
               var1.append(',');
            }

            var1.append(var4).append('=').append(var5);
         }

         return var1.toString();
      } else {
         return "";
      }
   }

   @NotNull
   private static String escapeString(@NotNull String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 == ',' || var3 == '=') {
            var1.append('\\');
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   @NotNull
   public static String getExportKey(@NotNull MetricType var0, @NotNull String var1, @Nullable MeasurementUnit var2) {
      String var3 = getUnitName(var2);
      return String.format("%s:%s@%s", var0.statsdCode, var1, var3);
   }

   public static double convertNanosTo(@NotNull MeasurementUnit.Duration var0, long var1) {
      switch (var0) {
         case NANOSECOND:
            return var1;
         case MICROSECOND:
            return var1 / 1000.0;
         case MILLISECOND:
            return var1 / 1000000.0;
         case SECOND:
            return var1 / 1.0E9;
         case MINUTE:
            return var1 / 6.0E10;
         case HOUR:
            return var1 / 3.6E12;
         case DAY:
            return var1 / 8.64E13;
         case WEEK:
            return var1 / 8.64E13 / 7.0;
         default:
            throw new IllegalArgumentException("Unknown Duration unit: " + var0.name());
      }
   }

   public static void encodeMetrics(long var0, @NotNull Collection<Metric> var2, @NotNull StringBuilder var3) {
      for (Metric var5 : var2) {
         var3.append(sanitizeName(var5.getKey()));
         var3.append("@");
         MeasurementUnit var6 = var5.getUnit();
         String var7 = getUnitName(var6);
         String var8 = sanitizeUnit(var7);
         var3.append(var8);

         for (Object var10 : var5.serialize()) {
            var3.append(":");
            var3.append(var10);
         }

         var3.append("|");
         var3.append(var5.getType().statsdCode);
         Map var14 = var5.getTags();
         if (var14 != null) {
            var3.append("|#");
            boolean var15 = true;

            for (Entry var12 : var14.entrySet()) {
               String var13 = sanitizeTagKey((String)var12.getKey());
               if (var15) {
                  var15 = false;
               } else {
                  var3.append(",");
               }

               var3.append(var13);
               var3.append(":");
               var3.append(sanitizeTagValue((String)var12.getValue()));
            }
         }

         var3.append("|T");
         var3.append(var0);
         var3.append("\n");
      }
   }

   @NotNull
   public static Map<String, String> mergeTags(@Nullable Map<String, String> var0, @NotNull Map<String, String> var1) {
      if (var0 == null) {
         return Collections.unmodifiableMap(var1);
      }

      HashMap var2 = new HashMap(var0);

      for (Entry var4 : var1.entrySet()) {
         String var5 = (String)var4.getKey();
         if (!var2.containsKey(var5)) {
            var2.put(var5, (String)var4.getValue());
         }
      }

      return var2;
   }

   @TestOnly
   public static void setFlushShiftMs(long var0) {
      FLUSH_SHIFT_MS = var0;
   }
}
