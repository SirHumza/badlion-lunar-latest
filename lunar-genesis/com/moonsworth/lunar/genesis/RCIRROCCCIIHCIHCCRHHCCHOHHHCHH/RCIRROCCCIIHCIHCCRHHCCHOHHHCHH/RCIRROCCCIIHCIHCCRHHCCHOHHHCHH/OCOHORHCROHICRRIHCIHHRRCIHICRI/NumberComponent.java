package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterators;
import java.util.Spliterator.OfLong;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   public static final int CIIOIIIOOHOCHCICHCHHCRHRIIHOIR = 8;
   public static final long CORIRIIHRHOOIOHHCHIROOHICHCOOI = 4611686018427387904L;

   private OCOHORHCROHICRRIHCIHHRRCIHICRI() {
   }

   public static int hashCode(long var0) {
      return (int)(var0 ^ var0 >>> 32);
   }

   public static int compare(long var0, long var2) {
      return var0 < var2 ? -1 : (var0 > var2 ? 1 : 0);
   }

   public static boolean contains(long[] var0, long var1) {
      for (long var6 : var0) {
         if (var6 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(long[] var0, long var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(long[] var0, long var1, int var3, int var4) {
      for (int var5 = var3; var5 < var4; var5++) {
         if (var0[var5] == var1) {
            return var5;
         }
      }

      return -1;
   }

   public static int indexOf(long[] var0, long[] var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0, "array");
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1, "target");
      if (var1.length == 0) {
         return 0;
      }

      label28:
      for (int var2 = 0; var2 < var0.length - var1.length + 1; var2++) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var0[var2 + var3] != var1[var3]) {
               continue label28;
            }
         }

         return var2;
      }

      return -1;
   }

   public static int lastIndexOf(long[] var0, long var1) {
      return lastIndexOf(var0, var1, 0, var0.length);
   }

   private static int lastIndexOf(long[] var0, long var1, int var3, int var4) {
      for (int var5 = var4 - 1; var5 >= var3; var5--) {
         if (var0[var5] == var1) {
            return var5;
         }
      }

      return -1;
   }

   public static long min(long... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      long var1 = var0[0];

      for (int var3 = 1; var3 < var0.length; var3++) {
         if (var0[var3] < var1) {
            var1 = var0[var3];
         }
      }

      return var1;
   }

   public static long max(long... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      long var1 = var0[0];

      for (int var3 = 1; var3 < var0.length; var3++) {
         if (var0[var3] > var1) {
            var1 = var0[var3];
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static long constrainToRange(long var0, long var2, long var4) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 <= var4, "min (%s) must be less than or equal to max (%s)", var2, var4);
      return Math.min(Math.max(var0, var2), var4);
   }

   public static long[] concat(long[]... var0) {
      int var1 = 0;

      for (long[] var5 : var0) {
         var1 += var5.length;
      }

      long[] var8 = new long[var1];
      int var9 = 0;

      for (long[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   public static byte[] toByteArray(long var0) {
      byte[] var2 = new byte[8];

      for (int var3 = 7; var3 >= 0; var3--) {
         var2[var3] = (byte)(var0 & 255L);
         var0 >>= 8;
      }

      return var2;
   }

   public static long fromByteArray(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length >= 8, "array too small: %s < %s", var0.length, 8);
      return fromBytes(var0[0], var0[1], var0[2], var0[3], var0[4], var0[5], var0[6], var0[7]);
   }

   public static long fromBytes(byte var0, byte var1, byte var2, byte var3, byte var4, byte var5, byte var6, byte var7) {
      return (var0 & 255L) << 56
         | (var1 & 255L) << 48
         | (var2 & 255L) << 40
         | (var3 & 255L) << 32
         | (var4 & 255L) << 24
         | (var5 & 255L) << 16
         | (var6 & 255L) << 8
         | var7 & 255L;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static @Nullable Long tryParse(String var0) {
      return tryParse(var0, 10);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static @Nullable Long tryParse(String var0, int var1) {
      if (IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0).isEmpty()) {
         return null;
      }

      if (var1 >= 2 && var1 <= 36) {
         boolean var2 = var0.charAt(0) == '-';
         int var3 = var2 ? 1 : 0;
         if (var3 == var0.length()) {
            return null;
         }

         int var4 = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.digit(var0.charAt(var3++));
         if (var4 >= 0 && var4 < var1) {
            long var5 = -var4;
            long var7 = Long.MIN_VALUE / var1;

            while (var3 < var0.length()) {
               var4 = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.digit(var0.charAt(var3++));
               if (var4 < 0 || var4 >= var1 || var5 < var7) {
                  return null;
               }

               var5 *= var1;
               if (var5 < Long.MIN_VALUE + var4) {
                  return null;
               }

               var5 -= var4;
            }

            if (var2) {
               return var5;
            } else {
               return var5 == Long.MIN_VALUE ? null : -var5;
            }
         } else {
            return null;
         }
      } else {
         throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + var1);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Long> ROCHCCHICOOCIHHOHCRHIHRIOOCOHC() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCHCORRIOCRHRIOHORRIROIHOICOR;
   }

   public static long[] ensureCapacity(long[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "Invalid minLength: %s", var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Invalid padding: %s", var2);
      return var0.length < var1 ? Arrays.copyOf(var0, var1 + var2) : var0;
   }

   public static String join(String var0, long... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1.length == 0) {
         return "";
      }

      StringBuilder var2 = new StringBuilder(var1.length * 10);
      var2.append(var1[0]);

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2.append(var0).append(var1[var3]);
      }

      return var2.toString();
   }

   public static Comparator<long[]> lexicographicalComparator() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.INSTANCE;
   }

   public static void sortDescending(long[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(long[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      Arrays.sort(var0, var1, var2);
      reverse(var0, var1, var2);
   }

   public static void reverse(long[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      reverse(var0, 0, var0.length);
   }

   public static void reverse(long[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      int var3 = var1;

      for (int var4 = var2 - 1; var3 < var4; var4--) {
         long var5 = var0[var3];
         var0[var3] = var0[var4];
         var0[var4] = var5;
         var3++;
      }
   }

   public static long[] toArray(Collection<? extends Number> var0) {
      if (var0 instanceof OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH) {
         return ((OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var0).toLongArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      long[] var3 = new long[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = ((Number)IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1[var4])).longValue();
      }

      return var3;
   }

   public static List<Long> asList(long... var0) {
      return var0.length == 0 ? Collections.emptyList() : new OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0);
   }

   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Long>
      implements Serializable {
      static final OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH IRCHCORRIOCRHRIOHORRIROIHOICOR = new OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH();
      private static final long RHCCRHOHHICCOOHRROOCHHRHIHOOOI = 1L;

      protected Long doForward(String var1) {
         return Long.decode(var1);
      }

      protected String doBackward(Long var1) {
         return var1.toString();
      }

      @Override
      public String toString() {
         return "Longs.stringConverter()";
      }

      private Object readResolve() {
         return IRCHCORRIOCRHRIOHORRIROIHOICOR;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends AbstractList<Long> implements Serializable, RandomAccess {
      final long[] OCCRIRORIIIHROORORCOHRRCCOIIHO;
      final int HHCHIOIIICIOCCROCCHCIIOOHRICCI;
      final int OHICOIHCRCHHOICHCHOOIOCHHROHIO;
      private static final long ORIIOIIHCHICCOORORCCORCCCOICII = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(long[] var1) {
         this(var1, 0, var1.length);
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(long[] var1, int var2, int var3) {
         this.OCCRIRORIIIHROORORCOHRRCCOIIHO = var1;
         this.HHCHIOIIICIOCCROCCHCIIOOHRICCI = var2;
         this.OHICOIHCRCHHOICHCHOOIOCHHROHIO = var3;
      }

      @Override
      public int size() {
         return this.OHICOIHCRCHHOICHCHOOIOCHHROHIO - this.HHCHIOIIICIOCCROCCHCIIOOHRICCI;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Long get(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         return this.OCCRIRORIIIHROORORCOHRRCCOIIHO[this.HHCHIOIIICIOCCROCCHCIIOOHRICCI + var1];
      }

      public OfLong spliterator() {
         return Spliterators.spliterator(this.OCCRIRORIIIHROORORCOHRRCCOIIHO, this.HHCHIOIIICIOCCROCCHCIIOOHRICCI, this.OHICOIHCRCHHOICHCHOOIOCHHROHIO, 0);
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Long
            && OCOHORHCROHICRRIHCIHHRRCIHICRI.indexOf(
                  this.OCCRIRORIIIHROORORCOHRRCCOIIHO, (Long)var1, this.HHCHIOIIICIOCCROCCHCIIOOHRICCI, this.OHICOIHCRCHHOICHCHOOIOCHHROHIO
               )
               != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Long) {
            int var2 = OCOHORHCROHICRRIHCIHHRRCIHICRI.indexOf(
               this.OCCRIRORIIIHROORORCOHRRCCOIIHO, (Long)var1, this.HHCHIOIIICIOCCROCCHCIIOOHRICCI, this.OHICOIHCRCHHOICHCHOOIOCHHROHIO
            );
            if (var2 >= 0) {
               return var2 - this.HHCHIOIIICIOCCROCCHCIIOOHRICCI;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Long) {
            int var2 = OCOHORHCROHICRRIHCIHHRRCIHICRI.lastIndexOf(
               this.OCCRIRORIIIHROORORCOHRRCCOIIHO, (Long)var1, this.HHCHIOIIICIOCCROCCHCIIOOHRICCI, this.OHICOIHCRCHHOICHCHOOIOCHHROHIO
            );
            if (var2 >= 0) {
               return var2 - this.HHCHIOIIICIOCCROCCHCIIOOHRICCI;
            }
         }

         return -1;
      }

      public Long set(int var1, Long var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         long var3 = this.OCCRIRORIIIHROORORCOHRRCCOIIHO[this.HHCHIOIIICIOCCROCCHCIIOOHRICCI + var1];
         this.OCCRIRORIIIHROORORCOHRRCCOIIHO[this.HHCHIOIIICIOCCROCCHCIIOOHRICCI + var1] = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Long> subList(int var1, int var2) {
         int var3 = this.size();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var3);
         return var1 == var2
            ? Collections.emptyList()
            : new OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               this.OCCRIRORIIIHROORORCOHRRCCOIIHO, this.HHCHIOIIICIOCCROCCHCIIOOHRICCI + var1, this.HHCHIOIIICIOCCROCCHCIIOOHRICCI + var2
            );
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH) {
            OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (OCOHORHCROHICRRIHCIHHRRCIHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.OCCRIRORIIIHROORORCOHRRCCOIIHO[this.HHCHIOIIICIOCCROCCHCIIOOHRICCI + var4]
                  != var2.OCCRIRORIIIHROORORCOHRRCCOIIHO[var2.HHCHIOIIICIOCCROCCHCIIOOHRICCI + var4]) {
                  return false;
               }
            }

            return true;
         } else {
            return super.equals(var1);
         }
      }

      @Override
      public int hashCode() {
         int var1 = 1;

         for (int var2 = this.HHCHIOIIICIOCCROCCHCIIOOHRICCI; var2 < this.OHICOIHCRCHHOICHCHOOIOCHHROHIO; var2++) {
            var1 = 31 * var1 + OCOHORHCROHICRRIHCIHHRRCIHICRI.hashCode(this.OCCRIRORIIIHROORORCOHRRCCOIIHO[var2]);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 10);
         var1.append('[').append(this.OCCRIRORIIIHROORORCOHRRCCOIIHO[this.HHCHIOIIICIOCCROCCHCIIOOHRICCI]);

         for (int var2 = this.HHCHIOIIICIOCCROCCHCIIOOHRICCI + 1; var2 < this.OHICOIHCRCHHOICHCHOOIOCHHROHIO; var2++) {
            var1.append(", ").append(this.OCCRIRORIIIHROORORCOHRRCCOIIHO[var2]);
         }

         return var1.append(']').toString();
      }

      long[] toLongArray() {
         return Arrays.copyOfRange(this.OCCRIRORIIIHROORORCOHRRCCOIIHO, this.HHCHIOIIICIOCCROCCHCIIOOHRICCI, this.OHICOIHCRCHHOICHCHOOIOCHHROHIO);
      }
   }

   private enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Comparator<long[]> {
      INSTANCE;

      public int compare(long[] var1, long[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = OCOHORHCROHICRRIHCIHHRRCIHICRI.compare(var1[var4], var2[var4]);
            if (var5 != 0) {
               return var5;
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "Longs.lexicographicalComparator()";
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private static final byte[] IIIORRRIORCHIORHOHIROCICIHOCCI;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      static int digit(char var0) {
         return var0 < 128 ? IIIORRRIORCHIORHOHIROCICIHOCCI[var0] : -1;
      }

      static {
         byte[] var0 = new byte[128];
         Arrays.fill(var0, (byte)-1);

         for (int var1 = 0; var1 < 10; var1++) {
            var0[48 + var1] = (byte)var1;
         }

         for (int var2 = 0; var2 < 26; var2++) {
            var0[65 + var2] = (byte)(10 + var2);
            var0[97 + var2] = (byte)(10 + var2);
         }

         IIIORRRIORCHIORHOHIROCICIHOCCI = var0;
      }
   }
}
