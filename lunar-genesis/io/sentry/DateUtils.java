package io.sentry;

import io.sentry.vendor.gson.internal.bind.util.ISO8601Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class DateUtils {
   private DateUtils() {
   }

   @NotNull
   public static Date getCurrentDateTime() {
      Calendar var0 = Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC);
      return var0.getTime();
   }

   @NotNull
   public static Date getDateTime(@NotNull String var0) {
      try {
         return ISO8601Utils.parse(var0, new ParsePosition(0));
      } catch (ParseException var2) {
         throw new IllegalArgumentException("timestamp is not ISO format " + var0);
      }
   }

   @NotNull
   public static Date getDateTimeWithMillisPrecision(@NotNull String var0) {
      try {
         return getDateTime(new BigDecimal(var0).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
      } catch (NumberFormatException var2) {
         throw new IllegalArgumentException("timestamp is not millis format " + var0);
      }
   }

   @NotNull
   public static String getTimestamp(@NotNull Date var0) {
      return ISO8601Utils.format(var0, true);
   }

   @NotNull
   public static Date getDateTime(long var0) {
      Calendar var2 = Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC);
      var2.setTimeInMillis(var0);
      return var2.getTime();
   }

   public static double millisToSeconds(double var0) {
      return var0 / 1000.0;
   }

   public static long millisToNanos(long var0) {
      return var0 * 1000000L;
   }

   public static double nanosToMillis(double var0) {
      return var0 / 1000000.0;
   }

   public static Date nanosToDate(long var0) {
      Double var2 = nanosToMillis(Double.valueOf((double)var0));
      return getDateTime(var2.longValue());
   }

   @Nullable
   public static Date toUtilDate(@Nullable SentryDate var0) {
      return var0 == null ? null : toUtilDateNotNull(var0);
   }

   @NotNull
   public static Date toUtilDateNotNull(@NotNull SentryDate var0) {
      return nanosToDate(var0.nanoTimestamp());
   }

   public static double nanosToSeconds(long var0) {
      return Double.valueOf((double)var0) / 1.0E9;
   }

   public static double dateToSeconds(@NotNull Date var0) {
      return millisToSeconds(var0.getTime());
   }

   public static long dateToNanos(@NotNull Date var0) {
      return millisToNanos(var0.getTime());
   }

   public static long secondsToNanos(@NotNull long var0) {
      return var0 * 1000000000L;
   }
}
