package com.github.benmanes.caffeine.cache;

import java.time.Duration;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class CaffeineSpec {
   static final String SPLIT_OPTIONS = ",";
   static final String SPLIT_KEY_VALUE = "=";
   final String specification;
   int initialCapacity = -1;
   long maximumWeight = -1L;
   long maximumSize = -1L;
   boolean recordStats;
   Caffeine.@Nullable Strength keyStrength;
   Caffeine.@Nullable Strength valueStrength;
   @Nullable Duration expireAfterWrite;
   @Nullable Duration expireAfterAccess;
   @Nullable Duration refreshAfterWrite;

   private CaffeineSpec(String var1) {
      this.specification = Objects.requireNonNull(var1);
   }

   Caffeine<Object, Object> toBuilder() {
      Caffeine var1 = Caffeine.newBuilder();
      if (this.initialCapacity != -1) {
         var1.initialCapacity(this.initialCapacity);
      }

      if (this.maximumSize != -1L) {
         var1.maximumSize(this.maximumSize);
      }

      if (this.maximumWeight != -1L) {
         var1.maximumWeight(this.maximumWeight);
      }

      if (this.keyStrength != null) {
         Caffeine.requireState(this.keyStrength == Caffeine.Strength.WEAK);
         var1.weakKeys();
      }

      if (this.valueStrength != null) {
         if (this.valueStrength == Caffeine.Strength.WEAK) {
            var1.weakValues();
         } else if (this.valueStrength == Caffeine.Strength.SOFT) {
            var1.softValues();
         }
      }

      if (this.expireAfterWrite != null) {
         var1.expireAfterWrite(this.expireAfterWrite);
      }

      if (this.expireAfterAccess != null) {
         var1.expireAfterAccess(this.expireAfterAccess);
      }

      if (this.refreshAfterWrite != null) {
         var1.refreshAfterWrite(this.refreshAfterWrite);
      }

      if (this.recordStats) {
         var1.recordStats();
      }

      return var1;
   }

   public static CaffeineSpec parse(String var0) {
      CaffeineSpec var1 = new CaffeineSpec(var0);

      for (String var5 : var0.split(",")) {
         var1.parseOption(var5.trim());
      }

      return var1;
   }

   void parseOption(String var1) {
      if (!var1.isEmpty()) {
         String[] var2 = var1.split("=");
         Caffeine.requireArgument(var2.length <= 2, "key-value pair %s with more than one equals sign", var1);
         String var3 = var2[0].trim();
         String var4 = var2.length == 1 ? null : var2[1].trim();
         this.configure(var3, var4);
      }
   }

   void configure(String var1, @Nullable String var2) {
      switch (var1) {
         case "initialCapacity":
            this.initialCapacity(var1, var2);
            return;
         case "maximumSize":
            this.maximumSize(var1, var2);
            return;
         case "maximumWeight":
            this.maximumWeight(var1, var2);
            return;
         case "weakKeys":
            this.weakKeys(var2);
            return;
         case "weakValues":
            this.valueStrength(var1, var2, Caffeine.Strength.WEAK);
            return;
         case "softValues":
            this.valueStrength(var1, var2, Caffeine.Strength.SOFT);
            return;
         case "expireAfterAccess":
            this.expireAfterAccess(var1, var2);
            return;
         case "expireAfterWrite":
            this.expireAfterWrite(var1, var2);
            return;
         case "refreshAfterWrite":
            this.refreshAfterWrite(var1, var2);
            return;
         case "recordStats":
            this.recordStats(var2);
            return;
         default:
            throw new IllegalArgumentException("Unknown key " + var1);
      }
   }

   void initialCapacity(String var1, @Nullable String var2) {
      Caffeine.requireArgument(this.initialCapacity == -1, "initial capacity was already set to %,d", this.initialCapacity);
      this.initialCapacity = parseInt(var1, var2);
   }

   void maximumSize(String var1, @Nullable String var2) {
      Caffeine.requireArgument(this.maximumSize == -1L, "maximum size was already set to %,d", this.maximumSize);
      Caffeine.requireArgument(this.maximumWeight == -1L, "maximum weight was already set to %,d", this.maximumWeight);
      this.maximumSize = parseLong(var1, var2);
   }

   void maximumWeight(String var1, @Nullable String var2) {
      Caffeine.requireArgument(this.maximumWeight == -1L, "maximum weight was already set to %,d", this.maximumWeight);
      Caffeine.requireArgument(this.maximumSize == -1L, "maximum size was already set to %,d", this.maximumSize);
      this.maximumWeight = parseLong(var1, var2);
   }

   void weakKeys(@Nullable String var1) {
      Caffeine.requireArgument(var1 == null, "weak keys does not take a value");
      Caffeine.requireArgument(this.keyStrength == null, "weak keys was already set");
      this.keyStrength = Caffeine.Strength.WEAK;
   }

   void valueStrength(String var1, @Nullable String var2, Caffeine.Strength var3) {
      Caffeine.requireArgument(var2 == null, "%s does not take a value", var1);
      Caffeine.requireArgument(this.valueStrength == null, "%s was already set to %s", var1, this.valueStrength);
      this.valueStrength = var3;
   }

   void expireAfterAccess(String var1, @Nullable String var2) {
      Caffeine.requireArgument(this.expireAfterAccess == null, "expireAfterAccess was already set");
      this.expireAfterAccess = parseDuration(var1, var2);
   }

   void expireAfterWrite(String var1, @Nullable String var2) {
      Caffeine.requireArgument(this.expireAfterWrite == null, "expireAfterWrite was already set");
      this.expireAfterWrite = parseDuration(var1, var2);
   }

   void refreshAfterWrite(String var1, @Nullable String var2) {
      Caffeine.requireArgument(this.refreshAfterWrite == null, "refreshAfterWrite was already set");
      this.refreshAfterWrite = parseDuration(var1, var2);
   }

   void recordStats(@Nullable String var1) {
      Caffeine.requireArgument(var1 == null, "record stats does not take a value");
      Caffeine.requireArgument(!this.recordStats, "record stats was already set");
      this.recordStats = true;
   }

   static int parseInt(String var0, @Nullable String var1) {
      Caffeine.requireArgument(var1 != null && !var1.isEmpty(), "value of key %s was omitted", var0);

      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         throw new IllegalArgumentException(String.format(Locale.US, "key %s value was set to %s, must be an integer", var0, var1), var3);
      }
   }

   static long parseLong(String var0, @Nullable String var1) {
      Caffeine.requireArgument(var1 != null && !var1.isEmpty(), "value of key %s was omitted", var0);

      try {
         return Long.parseLong(var1);
      } catch (NumberFormatException var3) {
         throw new IllegalArgumentException(String.format(Locale.US, "key %s value was set to %s, must be a long", var0, var1), var3);
      }
   }

   static Duration parseDuration(String var0, @Nullable String var1) {
      Caffeine.requireArgument(var1 != null && !var1.isEmpty(), "value of key %s omitted", var0);
      boolean var2 = var1.contains("p") || var1.contains("P");
      if (var2) {
         Duration var6 = Duration.parse(var1);
         Caffeine.requireArgument(!var6.isNegative(), "key %s invalid format; was %s, but the duration cannot be negative", var0, var1);
         return var6;
      } else {
         long var3 = parseLong(var0, var1.substring(0, var1.length() - 1));
         TimeUnit var5 = parseTimeUnit(var0, var1);
         return Duration.ofNanos(var5.toNanos(var3));
      }
   }

   static TimeUnit parseTimeUnit(String var0, @Nullable String var1) {
      Caffeine.requireArgument(var1 != null && !var1.isEmpty(), "value of key %s omitted", var0);
      char var2 = Character.toLowerCase(var1.charAt(var1.length() - 1));
      switch (var2) {
         case 'd':
            return TimeUnit.DAYS;
         case 'h':
            return TimeUnit.HOURS;
         case 'm':
            return TimeUnit.MINUTES;
         case 's':
            return TimeUnit.SECONDS;
         default:
            throw new IllegalArgumentException(String.format(Locale.US, "key %s invalid format; was %s, must end with one of [dDhHmMsS]", var0, var1));
      }
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof CaffeineSpec)) {
         return false;
      }

      CaffeineSpec var2 = (CaffeineSpec)var1;
      return Objects.equals(this.refreshAfterWrite, var2.refreshAfterWrite)
         && Objects.equals(this.expireAfterAccess, var2.expireAfterAccess)
         && Objects.equals(this.expireAfterWrite, var2.expireAfterWrite)
         && this.initialCapacity == var2.initialCapacity
         && this.maximumWeight == var2.maximumWeight
         && this.valueStrength == var2.valueStrength
         && this.keyStrength == var2.keyStrength
         && this.maximumSize == var2.maximumSize
         && this.recordStats == var2.recordStats;
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.initialCapacity,
         this.maximumSize,
         this.maximumWeight,
         this.keyStrength,
         this.valueStrength,
         this.recordStats,
         this.expireAfterWrite,
         this.expireAfterAccess,
         this.refreshAfterWrite
      );
   }

   public String toParsableString() {
      return this.specification;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "{" + this.toParsableString() + "}";
   }
}
