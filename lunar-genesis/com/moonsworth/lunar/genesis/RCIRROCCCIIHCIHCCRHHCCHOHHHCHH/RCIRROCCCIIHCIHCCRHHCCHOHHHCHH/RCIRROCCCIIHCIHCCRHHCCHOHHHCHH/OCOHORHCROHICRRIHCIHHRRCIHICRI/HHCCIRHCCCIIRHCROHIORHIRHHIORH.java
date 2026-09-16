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
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final int OCRRROHOIHCCIOCORROHHOIHRIIHHH = 2;

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   }

   public static int hashCode(char var0) {
      return var0;
   }

   public static char checkedCast(long var0) {
      char var2 = (char)var0;
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 == var0, "Out of range: %s", var0);
      return var2;
   }

   public static char saturatedCast(long var0) {
      if (var0 > 65535L) {
         return '\uffff';
      } else {
         return var0 < 0L ? '\u0000' : (char)var0;
      }
   }

   public static int compare(char var0, char var1) {
      return var0 - var1;
   }

   public static boolean contains(char[] var0, char var1) {
      for (char var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(char[] var0, char var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(char[] var0, char var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3; var4++) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static int indexOf(char[] var0, char[] var1) {
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

   public static int lastIndexOf(char[] var0, char var1) {
      return lastIndexOf(var0, var1, 0, var0.length);
   }

   private static int lastIndexOf(char[] var0, char var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 >= var2; var4--) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static char min(char... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      char var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         if (var0[var2] < var1) {
            var1 = var0[var2];
         }
      }

      return var1;
   }

   public static char max(char... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      char var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         if (var0[var2] > var1) {
            var1 = var0[var2];
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static char constrainToRange(char var0, char var1, char var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 <= var2, "min (%s) must be less than or equal to max (%s)", var1, var2);
      return var0 < var1 ? var1 : (var0 < var2 ? var0 : var2);
   }

   public static char[] concat(char[]... var0) {
      int var1 = 0;

      for (char[] var5 : var0) {
         var1 += var5.length;
      }

      char[] var8 = new char[var1];
      int var9 = 0;

      for (char[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static byte[] toByteArray(char var0) {
      return new byte[]{(byte)(var0 >> '\b'), (byte)var0};
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static char fromByteArray(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length >= 2, "array too small: %s < %s", var0.length, 2);
      return fromBytes(var0[0], var0[1]);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static char fromBytes(byte var0, byte var1) {
      return (char)(var0 << '\b' | var1 & 0xFF);
   }

   public static char[] ensureCapacity(char[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "Invalid minLength: %s", var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Invalid padding: %s", var2);
      return var0.length < var1 ? Arrays.copyOf(var0, var1 + var2) : var0;
   }

   public static String join(String var0, char... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      int var2 = var1.length;
      if (var2 == 0) {
         return "";
      }

      StringBuilder var3 = new StringBuilder(var2 + var0.length() * (var2 - 1));
      var3.append(var1[0]);

      for (int var4 = 1; var4 < var2; var4++) {
         var3.append(var0).append(var1[var4]);
      }

      return var3.toString();
   }

   public static Comparator<char[]> lexicographicalComparator() {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.INSTANCE;
   }

   public static char[] toArray(Collection<Character> var0) {
      if (var0 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
         return ((HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0).toCharArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      char[] var3 = new char[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = (Character)IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1[var4]);
      }

      return var3;
   }

   public static void sortDescending(char[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(char[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      Arrays.sort(var0, var1, var2);
      reverse(var0, var1, var2);
   }

   public static void reverse(char[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      reverse(var0, 0, var0.length);
   }

   public static void reverse(char[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      int var3 = var1;

      for (int var4 = var2 - 1; var3 < var4; var4--) {
         char var5 = var0[var3];
         var0[var3] = var0[var4];
         var0[var4] = var5;
         var3++;
      }
   }

   public static List<Character> asList(char... var0) {
      return var0.length == 0 ? Collections.emptyList() : new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   private enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Comparator<char[]> {
      INSTANCE;

      public int compare(char[] var1, char[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.compare(var1[var4], var2[var4]);
            if (var5 != 0) {
               return var5;
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "Chars.lexicographicalComparator()";
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Character> implements Serializable, RandomAccess {
      final char[] CICHRCRRCICORHRROCHICIHHORHOCI;
      final int CIHROOIHIICCCICIHCHHCHIHIRROIH;
      final int RRICICCCHCICOOHRIRHCOHROOHHCIO;
      private static final long CHRRCHHOCORORRIORHHCROHCHHHOCO = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var1) {
         this(var1, 0, var1.length);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var1, int var2, int var3) {
         this.CICHRCRRCICORHRROCHICIHHORHOCI = var1;
         this.CIHROOIHIICCCICIHCHHCHIHIRROIH = var2;
         this.RRICICCCHCICOOHRIRHCOHROOHHCIO = var3;
      }

      @Override
      public int size() {
         return this.RRICICCCHCICOOHRIRHCOHROOHHCIO - this.CIHROOIHIICCCICIHCHHCHIHIRROIH;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Character get(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         return this.CICHRCRRCICORHRROCHICIHHORHOCI[this.CIHROOIHIICCCICIHCHHCHIHIRROIH + var1];
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Character
            && HHCCIRHCCCIIRHCROHIORHIRHHIORH.indexOf(
                  this.CICHRCRRCICORHRROCHICIHHORHOCI, (Character)var1, this.CIHROOIHIICCCICIHCHHCHIHIRROIH, this.RRICICCCHCICOOHRIRHCOHROOHHCIO
               )
               != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Character) {
            int var2 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.indexOf(
               this.CICHRCRRCICORHRROCHICIHHORHOCI, (Character)var1, this.CIHROOIHIICCCICIHCHHCHIHIRROIH, this.RRICICCCHCICOOHRIRHCOHROOHHCIO
            );
            if (var2 >= 0) {
               return var2 - this.CIHROOIHIICCCICIHCHHCHIHIRROIH;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Character) {
            int var2 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.lastIndexOf(
               this.CICHRCRRCICORHRROCHICIHHORHOCI, (Character)var1, this.CIHROOIHIICCCICIHCHHCHIHIRROIH, this.RRICICCCHCICOOHRIRHCOHROOHHCIO
            );
            if (var2 >= 0) {
               return var2 - this.CIHROOIHIICCCICIHCHHCHIHIRROIH;
            }
         }

         return -1;
      }

      public Character set(int var1, Character var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         char var3 = this.CICHRCRRCICORHRROCHICIHHORHOCI[this.CIHROOIHIICCCICIHCHHCHIHIRROIH + var1];
         this.CICHRCRRCICORHRROCHICIHHORHOCI[this.CIHROOIHIICCCICIHCHHCHIHIRROIH + var1] = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Character> subList(int var1, int var2) {
         int var3 = this.size();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var3);
         return var1 == var2
            ? Collections.emptyList()
            : new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.CICHRCRRCICORHRROCHICIHHORHOCI, this.CIHROOIHIICCCICIHCHHCHIHIRROIH + var1, this.CIHROOIHIICCCICIHCHHCHIHIRROIH + var2
            );
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.CICHRCRRCICORHRROCHICIHHORHOCI[this.CIHROOIHIICCCICIHCHHCHIHIRROIH + var4]
                  != var2.CICHRCRRCICORHRROCHICIHHORHOCI[var2.CIHROOIHIICCCICIHCHHCHIHIRROIH + var4]) {
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

         for (int var2 = this.CIHROOIHIICCCICIHCHHCHIHIRROIH; var2 < this.RRICICCCHCICOOHRIRHCOHROOHHCIO; var2++) {
            var1 = 31 * var1 + HHCCIRHCCCIIRHCROHIORHIRHHIORH.hashCode(this.CICHRCRRCICORHRROCHICIHHORHOCI[var2]);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 3);
         var1.append('[').append(this.CICHRCRRCICORHRROCHICIHHORHOCI[this.CIHROOIHIICCCICIHCHHCHIHIRROIH]);

         for (int var2 = this.CIHROOIHIICCCICIHCHHCHIHIRROIH + 1; var2 < this.RRICICCCHCICOOHRIRHCOHROOHHCIO; var2++) {
            var1.append(", ").append(this.CICHRCRRCICORHRROCHICIHHORHOCI[var2]);
         }

         return var1.append(']').toString();
      }

      char[] toCharArray() {
         return Arrays.copyOfRange(this.CICHRCRRCICORHRROCHICIHHORHOCI, this.CIHROOIHIICCCICIHCHHCHIHIRROIH, this.RRICICCCHCICOOHRIRHCOHROOHHCIO);
      }
   }
}
