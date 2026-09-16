package com.llamalad7.mixinextras.lib.semver;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Version implements Serializable, Comparable<Version> {
   public static final Comparator<Version> INCREMENT_ORDER = Version::compareToIgnoreBuildMetadata;
   public static final Comparator<Version> PRECEDENCE_ORDER = INCREMENT_ORDER.reversed();
   private final long major;
   private final long minor;
   private final long patch;
   private final String[] preReleaseIds;
   private final String[] buildIds;
   @Deprecated
   public static final Comparator<Version> BUILD_AWARE_ORDER = Version::compareTo;

   Version(long var1, long var3, long var5, String[] var7, String[] var8) {
      this.major = Version.Validators.nonNegative(var1, "major");
      this.minor = Version.Validators.nonNegative(var3, "minor");
      this.patch = Version.Validators.nonNegative(var5, "patch");
      this.preReleaseIds = (String[])Version.Validators.nonNull(var7, "preReleaseIds").clone();
      this.buildIds = (String[])Version.Validators.nonNull(var8, "buildIds").clone();
   }

   public static Version parse(String var0) {
      return parse(var0, true);
   }

   public static Version parse(String var0, boolean var1) {
      return VersionParser.parseValidSemVer(Version.Validators.nonNull(var0, "version"), var1);
   }

   public static Optional<Version> tryParse(String var0) {
      return tryParse(var0, true);
   }

   public static Optional<Version> tryParse(String var0, boolean var1) {
      try {
         return Optional.of(parse(var0, var1));
      } catch (RuntimeException var3) {
         return Optional.empty();
      }
   }

   public Optional<String> preReleaseVersion() {
      return Optional.ofNullable(joinIdentifiers(this.preReleaseIds));
   }

   public Optional<String> buildMetadata() {
      return Optional.ofNullable(joinIdentifiers(this.buildIds));
   }

   public boolean isHigherThan(Version var1) {
      return this.compareToIgnoreBuildMetadata(var1) > 0;
   }

   public int compareTo(Version var1) {
      int var2 = this.compareToIgnoreBuildMetadata(var1);
      if (var2 != 0) {
         return var2;
      }

      var2 = compareIdentifierArrays(this.buildIds, var1.buildIds);
      if (this.buildIds.length == 0 || var1.buildIds.length == 0) {
         var2 = -1 * var2;
      }

      return var2;
   }

   public int compareToIgnoreBuildMetadata(Version var1) {
      Version.Validators.nonNull(var1, "other");
      long var2 = this.major - var1.major;
      if (var2 == 0L) {
         var2 = this.minor - var1.minor;
         if (var2 == 0L) {
            var2 = this.patch - var1.patch;
            if (var2 == 0L) {
               return compareIdentifierArrays(this.preReleaseIds, var1.preReleaseIds);
            }
         }
      }

      return var2 < 0L ? -1 : 1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Version) ? false : this.compareTo((Version)var1) == 0;
      }
   }

   @Override
   public int hashCode() {
      int var1 = 5;
      var1 = 97 * var1 + Long.hashCode(this.major);
      var1 = 97 * var1 + Long.hashCode(this.minor);
      var1 = 97 * var1 + Long.hashCode(this.patch);
      var1 = 97 * var1 + Arrays.hashCode(this.preReleaseIds);
      return 97 * var1 + Arrays.hashCode(this.buildIds);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.major);
      var1.append(".");
      var1.append(this.minor);
      var1.append(".");
      var1.append(this.patch);
      this.preReleaseVersion().ifPresent(var1x -> var1.append("-").append(var1x));
      this.buildMetadata().ifPresent(var1x -> var1.append("+").append(var1x));
      return var1.toString();
   }

   private static String joinIdentifiers(String... var0) {
      return var0.length == 0 ? null : String.join(".", var0);
   }

   private static int compareIdentifierArrays(String[] var0, String[] var1) {
      if (var0.length == 0 && var1.length == 0) {
         return 0;
      }

      if (var0.length != 0 && var1.length != 0) {
         int var2 = 0;
         int var3 = Math.min(var0.length, var1.length);

         for (int var4 = 0; var4 < var3; var4++) {
            var2 = compareIdentifiers(var0[var4], var1[var4]);
            if (var2 != 0) {
               break;
            }
         }

         if (var2 == 0) {
            var2 = var0.length - var1.length;
         }

         return var2;
      } else {
         return var0.length == 0 ? 1 : -1;
      }
   }

   private static int compareIdentifiers(String var0, String var1) {
      return isNumeric(var0) && isNumeric(var1) ? Long.valueOf(var0).compareTo(Long.valueOf(var1)) : var0.compareTo(var1);
   }

   private static boolean isNumeric(String var0) {
      return var0.startsWith("0") ? false : var0.chars().allMatch(Character::isDigit);
   }

   static class Validators {
      static long nonNegative(long var0, String var2) {
         if (var0 < 0L) {
            throw new IllegalArgumentException(var2 + " must not be negative");
         } else {
            return var0;
         }
      }

      static <T> T nonNull(T var0, String var1) {
         return nonNullOrThrow((T)var0, var1 + " must not be null");
      }

      private static <T> T nonNullOrThrow(T var0, String var1) {
         if (var0 == null) {
            throw new IllegalArgumentException(var1);
         } else {
            return (T)var0;
         }
      }
   }
}
