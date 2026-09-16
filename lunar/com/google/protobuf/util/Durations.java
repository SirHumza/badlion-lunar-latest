package com.google.protobuf.util;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompileTimeConstant;
import com.google.protobuf.Duration;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Comparator;

public final class Durations {
   static final long DURATION_SECONDS_MIN = -315576000000L;
   static final long DURATION_SECONDS_MAX = 315576000000L;
   private static final long SECONDS_PER_MINUTE = 60L;
   private static final long SECONDS_PER_HOUR = 3600L;
   private static final long SECONDS_PER_DAY = 86400L;
   public static final Duration MIN_VALUE = Duration.newBuilder().setSeconds(-315576000000L).setNanos(-999999999).build();
   public static final Duration MAX_VALUE = Duration.newBuilder().setSeconds(315576000000L).setNanos(999999999).build();
   public static final Duration ZERO = Duration.newBuilder().setSeconds(0L).setNanos(0).build();

   private Durations() {
   }

   public static Comparator<Duration> comparator() {
      return Durations.DurationComparator.INSTANCE;
   }

   public static int compare(Duration var0, Duration var1) {
      return Durations.DurationComparator.INSTANCE.compare(var0, var1);
   }

   public static boolean isValid(Duration var0) {
      return isValid(var0.getSeconds(), var0.getNanos());
   }

   public static boolean isValid(long var0, int var2) {
      if (var0 >= -315576000000L && var0 <= 315576000000L) {
         return var2 >= -999999999L && var2 < 1000000000 ? var0 >= 0L && var2 >= 0 || var0 <= 0L && var2 <= 0 : false;
      } else {
         return false;
      }
   }

   public static boolean isNegative(Duration var0) {
      checkValid(var0);
      return var0.getSeconds() == 0L ? var0.getNanos() < 0 : var0.getSeconds() < 0L;
   }

   public static boolean isPositive(Duration var0) {
      checkValid(var0);
      return !isNegative(var0) && !var0.equals(ZERO);
   }

   @CanIgnoreReturnValue
   public static Duration checkNotNegative(Duration var0) {
      Preconditions.checkArgument(!isNegative(var0), "duration (%s) must not be negative", toString(var0));
      return var0;
   }

   @CanIgnoreReturnValue
   public static Duration checkPositive(Duration var0) {
      Preconditions.checkArgument(isPositive(var0), "duration (%s) must be positive", toString(var0));
      return var0;
   }

   @CanIgnoreReturnValue
   public static Duration checkValid(Duration var0) {
      long var1 = var0.getSeconds();
      int var3 = var0.getNanos();
      if (!isValid(var1, var3)) {
         throw new IllegalArgumentException(
            String.format(
               "Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds",
               var1,
               var3
            )
         );
      } else {
         return var0;
      }
   }

   public static Duration checkValid(Duration.Builder var0) {
      return checkValid(var0.build());
   }

   public static String toString(Duration var0) {
      checkValid(var0);
      long var1 = var0.getSeconds();
      int var3 = var0.getNanos();
      StringBuilder var4 = new StringBuilder();
      if (var1 < 0L || var3 < 0) {
         var4.append("-");
         var1 = -var1;
         var3 = -var3;
      }

      var4.append(var1);
      if (var3 != 0) {
         var4.append(".");
         var4.append(Timestamps.formatNanos(var3));
      }

      var4.append("s");
      return var4.toString();
   }

   public static Duration parse(String var0) {
      if (!var0.isEmpty() && var0.charAt(var0.length() - 1) == 's') {
         boolean var1 = false;
         if (var0.charAt(0) == '-') {
            var1 = true;
            var0 = var0.substring(1);
         }

         String var2 = var0.substring(0, var0.length() - 1);
         String var3 = "";
         int var4 = var2.indexOf(46);
         if (var4 != -1) {
            var3 = var2.substring(var4 + 1);
            var2 = var2.substring(0, var4);
         }

         long var5 = Long.parseLong(var2);
         int var7 = var3.isEmpty() ? 0 : Timestamps.parseNanos(var3);
         if (var5 < 0L) {
            throw new ParseException("Invalid duration string: " + var0, 0);
         }

         if (var1) {
            var5 = -var5;
            var7 = -var7;
         }

         try {
            return normalizedDuration(var5, var7);
         } catch (IllegalArgumentException var10) {
            ParseException var9 = new ParseException("Duration value is out of range.", 0);
            var9.initCause(var10);
            throw var9;
         }
      } else {
         throw new ParseException("Invalid duration string: " + var0, 0);
      }
   }

   public static Duration parseUnchecked(@CompileTimeConstant String var0) {
      try {
         return parse(var0);
      } catch (ParseException var2) {
         throw new IllegalArgumentException(var2);
      }
   }

   public static Duration fromDays(long var0) {
      return Duration.newBuilder().setSeconds(LongMath.checkedMultiply(var0, 86400L)).setNanos(0).build();
   }

   public static Duration fromHours(long var0) {
      return Duration.newBuilder().setSeconds(LongMath.checkedMultiply(var0, 3600L)).setNanos(0).build();
   }

   public static Duration fromMinutes(long var0) {
      return Duration.newBuilder().setSeconds(LongMath.checkedMultiply(var0, 60L)).setNanos(0).build();
   }

   public static Duration fromSeconds(long var0) {
      return normalizedDuration(var0, 0);
   }

   public static Duration fromMillis(long var0) {
      return normalizedDuration(var0 / 1000L, (int)(var0 % 1000L * 1000000L));
   }

   public static Duration fromMicros(long var0) {
      return normalizedDuration(var0 / 1000000L, (int)(var0 % 1000000L * 1000L));
   }

   public static Duration fromNanos(long var0) {
      return normalizedDuration(var0 / 1000000000L, (int)(var0 % 1000000000L));
   }

   public static long toDays(Duration var0) {
      return checkValid(var0).getSeconds() / 86400L;
   }

   public static long toHours(Duration var0) {
      return checkValid(var0).getSeconds() / 3600L;
   }

   public static long toMinutes(Duration var0) {
      return checkValid(var0).getSeconds() / 60L;
   }

   public static long toSeconds(Duration var0) {
      return checkValid(var0).getSeconds();
   }

   public static double toSecondsAsDouble(Duration var0) {
      checkValid(var0);
      return var0.getSeconds() + var0.getNanos() / 1.0E9;
   }

   public static long toMillis(Duration var0) {
      checkValid(var0);
      return LongMath.checkedAdd(LongMath.checkedMultiply(var0.getSeconds(), 1000L), var0.getNanos() / 1000000);
   }

   public static long toMicros(Duration var0) {
      checkValid(var0);
      return LongMath.checkedAdd(LongMath.checkedMultiply(var0.getSeconds(), 1000000L), var0.getNanos() / 1000);
   }

   public static long toNanos(Duration var0) {
      checkValid(var0);
      return LongMath.checkedAdd(LongMath.checkedMultiply(var0.getSeconds(), 1000000000L), var0.getNanos());
   }

   public static Duration add(Duration var0, Duration var1) {
      checkValid(var0);
      checkValid(var1);
      return normalizedDuration(LongMath.checkedAdd(var0.getSeconds(), var1.getSeconds()), IntMath.checkedAdd(var0.getNanos(), var1.getNanos()));
   }

   public static Duration subtract(Duration var0, Duration var1) {
      checkValid(var0);
      checkValid(var1);
      return normalizedDuration(LongMath.checkedSubtract(var0.getSeconds(), var1.getSeconds()), IntMath.checkedSubtract(var0.getNanos(), var1.getNanos()));
   }

   static Duration normalizedDuration(long var0, int var2) {
      if (var2 <= -1000000000 || var2 >= 1000000000) {
         var0 = LongMath.checkedAdd(var0, var2 / 1000000000);
         var2 %= 1000000000;
      }

      if (var0 > 0L && var2 < 0) {
         var2 += 1000000000;
         var0--;
      }

      if (var0 < 0L && var2 > 0) {
         var2 -= 1000000000;
         var0++;
      }

      Duration var3 = Duration.newBuilder().setSeconds(var0).setNanos(var2).build();
      return checkValid(var3);
   }

   private enum DurationComparator implements Serializable, Comparator<Duration> {
      INSTANCE;

      public int compare(Duration var1, Duration var2) {
         Durations.checkValid(var1);
         Durations.checkValid(var2);
         int var3 = Long.compare(var1.getSeconds(), var2.getSeconds());
         return var3 != 0 ? var3 : Integer.compare(var1.getNanos(), var2.getNanos());
      }
   }
}
