package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface MeasurementUnit {
   @ApiStatus.Internal
   String NONE = "none";

   @NotNull
   String name();

   @ApiStatus.Internal
   @NotNull
   String apiName();

   final class Custom implements MeasurementUnit {
      @NotNull
      private final String name;

      public Custom(@NotNull String var1) {
         this.name = var1;
      }

      @NotNull
      @Override
      public String name() {
         return this.name;
      }

      @NotNull
      @Override
      public String apiName() {
         return this.name().toLowerCase(Locale.ROOT);
      }
   }

   enum Duration implements MeasurementUnit {
      NANOSECOND,
      MICROSECOND,
      MILLISECOND,
      SECOND,
      MINUTE,
      HOUR,
      DAY,
      WEEK;

      @NotNull
      @Override
      public String apiName() {
         return this.name().toLowerCase(Locale.ROOT);
      }
   }

   enum Fraction implements MeasurementUnit {
      RATIO,
      PERCENT;

      @NotNull
      @Override
      public String apiName() {
         return this.name().toLowerCase(Locale.ROOT);
      }
   }

   enum Information implements MeasurementUnit {
      BIT,
      BYTE,
      KILOBYTE,
      KIBIBYTE,
      MEGABYTE,
      MEBIBYTE,
      GIGABYTE,
      GIBIBYTE,
      TERABYTE,
      TEBIBYTE,
      PETABYTE,
      PEBIBYTE,
      EXABYTE,
      EXBIBYTE;

      @NotNull
      @Override
      public String apiName() {
         return this.name().toLowerCase(Locale.ROOT);
      }
   }
}
