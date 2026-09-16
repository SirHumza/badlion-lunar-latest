package com.google.protobuf.util;

import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompileTimeConstant;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import javax.annotation.Nullable;

public final class Timestamps {
   static final long TIMESTAMP_SECONDS_MIN = -62135596800L;
   static final long TIMESTAMP_SECONDS_MAX = 253402300799L;
   static final int NANOS_PER_SECOND = 1000000000;
   static final int NANOS_PER_MILLISECOND = 1000000;
   static final int NANOS_PER_MICROSECOND = 1000;
   static final int MILLIS_PER_SECOND = 1000;
   static final int MICROS_PER_SECOND = 1000000;
   public static final Timestamp MIN_VALUE = Timestamp.newBuilder().setSeconds(-62135596800L).setNanos(0).build();
   public static final Timestamp MAX_VALUE = Timestamp.newBuilder().setSeconds(253402300799L).setNanos(999999999).build();
   public static final Timestamp EPOCH = Timestamp.newBuilder().setSeconds(0L).setNanos(0).build();
   private static final ThreadLocal<SimpleDateFormat> timestampFormat = new ThreadLocal<SimpleDateFormat>() {
      protected SimpleDateFormat initialValue() {
         return Timestamps.createTimestampFormat();
      }
   };
   @Nullable
   private static final Method INSTANT_NOW = instantMethod("now");
   @Nullable
   private static final Method INSTANT_GET_EPOCH_SECOND = instantMethod("getEpochSecond");
   @Nullable
   private static final Method INSTANT_GET_NANO = instantMethod("getNano");

   private static SimpleDateFormat createTimestampFormat() {
      SimpleDateFormat var0 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
      GregorianCalendar var1 = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
      var1.setGregorianChange(new Date(Long.MIN_VALUE));
      var0.setCalendar(var1);
      return var0;
   }

   private Timestamps() {
   }

   public static Comparator<Timestamp> comparator() {
      return Timestamps.TimestampComparator.INSTANCE;
   }

   public static int compare(Timestamp var0, Timestamp var1) {
      return Timestamps.TimestampComparator.INSTANCE.compare(var0, var1);
   }

   public static boolean isValid(Timestamp var0) {
      return isValid(var0.getSeconds(), var0.getNanos());
   }

   public static boolean isValid(long var0, int var2) {
      return var0 < -62135596800L || var0 > 253402300799L ? false : var2 >= 0 && var2 < 1000000000;
   }

   @CanIgnoreReturnValue
   public static Timestamp checkValid(Timestamp var0) {
      long var1 = var0.getSeconds();
      int var3 = var0.getNanos();
      if (!isValid(var1, var3)) {
         throw new IllegalArgumentException(
            String.format(
               "Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].",
               var1,
               var3
            )
         );
      } else {
         return var0;
      }
   }

   public static Timestamp checkValid(Timestamp.Builder var0) {
      return checkValid(var0.build());
   }

   public static String toString(Timestamp var0) {
      checkValid(var0);
      long var1 = var0.getSeconds();
      int var3 = var0.getNanos();
      StringBuilder var4 = new StringBuilder();
      Date var5 = new Date(var1 * 1000L);
      var4.append(timestampFormat.get().format(var5));
      if (var3 != 0) {
         var4.append(".");
         var4.append(formatNanos(var3));
      }

      var4.append("Z");
      return var4.toString();
   }

   public static Timestamp parse(String var0) {
      int var1 = var0.indexOf(84);
      if (var1 == -1) {
         throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + var0 + "\"", 0);
      }

      int var2 = var0.indexOf(90, var1);
      if (var2 == -1) {
         var2 = var0.indexOf(43, var1);
      }

      if (var2 == -1) {
         var2 = var0.indexOf(45, var1);
      }

      if (var2 == -1) {
         throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
      }

      String var3 = var0.substring(0, var2);
      String var4 = var3;
      String var5 = "";
      int var6 = var3.indexOf(46);
      if (var6 != -1) {
         var4 = var3.substring(0, var6);
         var5 = var3.substring(var6 + 1);
      }

      Date var7 = timestampFormat.get().parse(var4);
      long var8 = var7.getTime() / 1000L;
      int var10 = var5.isEmpty() ? 0 : parseNanos(var5);
      if (var0.charAt(var2) == 'Z') {
         if (var0.length() != var2 + 1) {
            throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + var0.substring(var2) + "\"", 0);
         }
      } else {
         String var11 = var0.substring(var2 + 1);
         long var12 = parseTimezoneOffset(var11);
         if (var0.charAt(var2) == '+') {
            var8 -= var12;
         } else {
            var8 += var12;
         }
      }

      try {
         return normalizedTimestamp(var8, var10);
      } catch (IllegalArgumentException var14) {
         ParseException var15 = new ParseException("Failed to parse timestamp " + var0 + " Timestamp is out of range.", 0);
         var15.initCause(var14);
         throw var15;
      }
   }

   public static Timestamp parseUnchecked(@CompileTimeConstant String var0) {
      try {
         return parse(var0);
      } catch (ParseException var2) {
         throw new IllegalArgumentException(var2);
      }
   }

   @Nullable
   private static Method instantMethod(String var0) {
      try {
         return Class.forName("java.time.Instant").getMethod(var0);
      } catch (Exception var2) {
         return null;
      }
   }

   public static Timestamp now() {
      if (INSTANT_NOW != null) {
         try {
            Object var0 = INSTANT_NOW.invoke(null);
            long var1 = (Long)INSTANT_GET_EPOCH_SECOND.invoke(var0);
            int var3 = (Integer)INSTANT_GET_NANO.invoke(var0);
            return normalizedTimestamp(var1, var3);
         } catch (Throwable var4) {
            throw new AssertionError(var4);
         }
      } else {
         return fromMillis(System.currentTimeMillis());
      }
   }

   public static Timestamp fromSeconds(long var0) {
      return normalizedTimestamp(var0, 0);
   }

   public static long toSeconds(Timestamp var0) {
      return checkValid(var0).getSeconds();
   }

   public static Timestamp fromMillis(long var0) {
      return normalizedTimestamp(var0 / 1000L, (int)(var0 % 1000L * 1000000L));
   }

   public static Timestamp fromDate(Date var0) {
      if (!(var0 instanceof java.sql.Timestamp)) {
         return fromMillis(var0.getTime());
      }

      java.sql.Timestamp var1 = (java.sql.Timestamp)var0;
      long var2 = var1.getTime();
      long var4 = var2 < 0L && var2 % 1000L != 0L ? var2 / 1000L - 1L : var2 / 1000L;
      return Timestamp.newBuilder().setSeconds(var4).setNanos(var1.getNanos()).build();
   }

   public static long toMillis(Timestamp var0) {
      checkValid(var0);
      return LongMath.checkedAdd(LongMath.checkedMultiply(var0.getSeconds(), 1000L), var0.getNanos() / 1000000);
   }

   public static Timestamp fromMicros(long var0) {
      return normalizedTimestamp(var0 / 1000000L, (int)(var0 % 1000000L * 1000L));
   }

   public static long toMicros(Timestamp var0) {
      checkValid(var0);
      return LongMath.checkedAdd(LongMath.checkedMultiply(var0.getSeconds(), 1000000L), var0.getNanos() / 1000);
   }

   public static Timestamp fromNanos(long var0) {
      return normalizedTimestamp(var0 / 1000000000L, (int)(var0 % 1000000000L));
   }

   public static long toNanos(Timestamp var0) {
      checkValid(var0);
      return LongMath.checkedAdd(LongMath.checkedMultiply(var0.getSeconds(), 1000000000L), var0.getNanos());
   }

   public static Duration between(Timestamp var0, Timestamp var1) {
      checkValid(var0);
      checkValid(var1);
      return Durations.normalizedDuration(
         LongMath.checkedSubtract(var1.getSeconds(), var0.getSeconds()), IntMath.checkedSubtract(var1.getNanos(), var0.getNanos())
      );
   }

   public static Timestamp add(Timestamp var0, Duration var1) {
      checkValid(var0);
      Durations.checkValid(var1);
      return normalizedTimestamp(LongMath.checkedAdd(var0.getSeconds(), var1.getSeconds()), IntMath.checkedAdd(var0.getNanos(), var1.getNanos()));
   }

   public static Timestamp subtract(Timestamp var0, Duration var1) {
      checkValid(var0);
      Durations.checkValid(var1);
      return normalizedTimestamp(LongMath.checkedSubtract(var0.getSeconds(), var1.getSeconds()), IntMath.checkedSubtract(var0.getNanos(), var1.getNanos()));
   }

   static Timestamp normalizedTimestamp(long var0, int var2) {
      if (var2 <= -1000000000 || var2 >= 1000000000) {
         var0 = LongMath.checkedAdd(var0, var2 / 1000000000);
         var2 %= 1000000000;
      }

      if (var2 < 0) {
         var2 += 1000000000;
         var0 = LongMath.checkedSubtract(var0, 1L);
      }

      Timestamp var3 = Timestamp.newBuilder().setSeconds(var0).setNanos(var2).build();
      return checkValid(var3);
   }

   private static long parseTimezoneOffset(String var0) {
      int var1 = var0.indexOf(58);
      if (var1 == -1) {
         throw new ParseException("Invalid offset value: " + var0, 0);
      }

      String var2 = var0.substring(0, var1);
      String var3 = var0.substring(var1 + 1);

      try {
         return (Long.parseLong(var2) * 60L + Long.parseLong(var3)) * 60L;
      } catch (NumberFormatException var6) {
         ParseException var5 = new ParseException("Invalid offset value: " + var0, 0);
         var5.initCause(var6);
         throw var5;
      }
   }

   static int parseNanos(String var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < 9; var2++) {
         var1 *= 10;
         if (var2 < var0.length()) {
            if (var0.charAt(var2) < '0' || var0.charAt(var2) > '9') {
               throw new ParseException("Invalid nanoseconds.", 0);
            }

            var1 += var0.charAt(var2) - '0';
         }
      }

      return var1;
   }

   static String formatNanos(int var0) {
      if (var0 % 1000000 == 0) {
         return String.format(Locale.ENGLISH, "%1$03d", var0 / 1000000);
      } else {
         return var0 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", var0 / 1000) : String.format(Locale.ENGLISH, "%1$09d", var0);
      }
   }

   private enum TimestampComparator implements Serializable, Comparator<Timestamp> {
      INSTANCE;

      public int compare(Timestamp var1, Timestamp var2) {
         Timestamps.checkValid(var1);
         Timestamps.checkValid(var2);
         int var3 = Long.compare(var1.getSeconds(), var2.getSeconds());
         return var3 != 0 ? var3 : Integer.compare(var1.getNanos(), var2.getNanos());
      }
   }
}
