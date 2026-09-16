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
import java.util.Spliterator.OfInt;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI extends IIHRRHORCRCROCHHOHORCHCROCIHRO {
   public static final int OIROIRIHHRHRHHIHRHCCHOCRCCCRHI = 4;
   public static final int OCIRRCOOIRCCHRCCHCROCIOORCOCHO = 1073741824;

   private HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
   }

   public static int hashCode(int var0) {
      return var0;
   }

   public static int checkedCast(long var0) {
      int var2 = (int)var0;
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 == var0, "Out of range: %s", var0);
      return var2;
   }

   public static int saturatedCast(long var0) {
      if (var0 > 2147483647L) {
         return Integer.MAX_VALUE;
      } else {
         return var0 < -2147483648L ? Integer.MIN_VALUE : (int)var0;
      }
   }

   public static int compare(int var0, int var1) {
      return var0 < var1 ? -1 : (var0 > var1 ? 1 : 0);
   }

   public static boolean contains(int[] var0, int var1) {
      for (int var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(int[] var0, int var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(int[] var0, int var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3; var4++) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static int indexOf(int[] var0, int[] var1) {
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

   public static int lastIndexOf(int[] var0, int var1) {
      return lastIndexOf(var0, var1, 0, var0.length);
   }

   private static int lastIndexOf(int[] var0, int var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 >= var2; var4--) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      "Available in GWT! Annotation is to avoid conflict with GWT specialization of base class."
   )
   public static int min(int... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      int var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         if (var0[var2] < var1) {
            var1 = var0[var2];
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      "Available in GWT! Annotation is to avoid conflict with GWT specialization of base class."
   )
   public static int max(int... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      int var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         if (var0[var2] > var1) {
            var1 = var0[var2];
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static int constrainToRange(int var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 <= var2, "min (%s) must be less than or equal to max (%s)", var1, var2);
      return Math.min(Math.max(var0, var1), var2);
   }

   public static int[] concat(int[]... var0) {
      int var1 = 0;

      for (int[] var5 : var0) {
         var1 += var5.length;
      }

      int[] var8 = new int[var1];
      int var9 = 0;

      for (int[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   public static byte[] toByteArray(int var0) {
      return new byte[]{(byte)(var0 >> 24), (byte)(var0 >> 16), (byte)(var0 >> 8), (byte)var0};
   }

   public static int fromByteArray(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length >= 4, "array too small: %s < %s", var0.length, 4);
      return fromBytes(var0[0], var0[1], var0[2], var0[3]);
   }

   public static int fromBytes(byte var0, byte var1, byte var2, byte var3) {
      return var0 << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | var3 & 0xFF;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Integer> ROCHCCHICOOCIHHOHCRHIHRIOOCOHC() {
      return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRRRCOIIIIHIICICCOIHIRCHRIRCR;
   }

   public static int[] ensureCapacity(int[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "Invalid minLength: %s", var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Invalid padding: %s", var2);
      return var0.length < var1 ? Arrays.copyOf(var0, var1 + var2) : var0;
   }

   public static String join(String var0, int... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1.length == 0) {
         return "";
      }

      StringBuilder var2 = new StringBuilder(var1.length * 5);
      var2.append(var1[0]);

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2.append(var0).append(var1[var3]);
      }

      return var2.toString();
   }

   public static Comparator<int[]> lexicographicalComparator() {
      return HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.INSTANCE;
   }

   public static void sortDescending(int[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(int[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      Arrays.sort(var0, var1, var2);
      reverse(var0, var1, var2);
   }

   public static void reverse(int[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      reverse(var0, 0, var0.length);
   }

   public static void reverse(int[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      int var3 = var1;

      for (int var4 = var2 - 1; var3 < var4; var4--) {
         int var5 = var0[var3];
         var0[var3] = var0[var4];
         var0[var4] = var5;
         var3++;
      }
   }

   public static int[] toArray(Collection<? extends Number> var0) {
      if (var0 instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
         return ((HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0).toIntArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      int[] var3 = new int[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = ((Number)IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1[var4])).intValue();
      }

      return var3;
   }

   public static List<Integer> asList(int... var0) {
      return var0.length == 0 ? Collections.emptyList() : new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static @Nullable Integer tryParse(String var0) {
      return tryParse(var0, 10);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static @Nullable Integer tryParse(String var0, int var1) {
      Long var2 = OCOHORHCROHICRRIHCIHHRRCIHICRI.tryParse(var0, var1);
      return var2 != null && var2 == var2.intValue() ? var2.intValue() : null;
   }

   private enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Comparator<int[]> {
      INSTANCE;

      public int compare(int[] var1, int[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.compare(var1[var4], var2[var4]);
            if (var5 != 0) {
               return var5;
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "Ints.lexicographicalComparator()";
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Integer>
      implements Serializable {
      static final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIRRRCOIIIIHIICICCOIHIRCHRIRCR = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      private static final long IOHHOCHICHCOICOIRIRRRHHIOICIIR = 1L;

      protected Integer doForward(String var1) {
         return Integer.decode(var1);
      }

      protected String doBackward(Integer var1) {
         return var1.toString();
      }

      @Override
      public String toString() {
         return "Ints.stringConverter()";
      }

      private Object readResolve() {
         return RIRRRCOIIIIHIICICCOIHIRCHRIRCR;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Integer> implements Serializable, RandomAccess {
      final int[] IRCCIHHIIHHCCCOOIOIROICOHROCIO;
      final int CCHIIROHOOOOHHORHIOCRCIIOCOIII;
      final int HCHROIROOCRHRIRRORRIOIHICRIIHO;
      private static final long OOCROIIICIRCHOHIRORCRHRHHOOHRH = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var1) {
         this(var1, 0, var1.length);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var1, int var2, int var3) {
         this.IRCCIHHIIHHCCCOOIOIROICOHROCIO = var1;
         this.CCHIIROHOOOOHHORHIOCRCIIOCOIII = var2;
         this.HCHROIROOCRHRIRRORRIOIHICRIIHO = var3;
      }

      @Override
      public int size() {
         return this.HCHROIROOCRHRIRRORRIOIHICRIIHO - this.CCHIIROHOOOOHHORHIOCRCIIOCOIII;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Integer get(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         return this.IRCCIHHIIHHCCCOOIOIROICOHROCIO[this.CCHIIROHOOOOHHORHIOCRCIIOCOIII + var1];
      }

      public OfInt spliterator() {
         return Spliterators.spliterator(this.IRCCIHHIIHHCCCOOIOIROICOHROCIO, this.CCHIIROHOOOOHHORHIOCRCIIOCOIII, this.HCHROIROOCRHRIRRORRIOIHICRIIHO, 0);
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Integer
            && HICHRCOHCCRHOHCICOOCHOIHCCHIRI.indexOf(
                  this.IRCCIHHIIHHCCCOOIOIROICOHROCIO, (Integer)var1, this.CCHIIROHOOOOHHORHIOCRCIIOCOIII, this.HCHROIROOCRHRIRRORRIOIHICRIIHO
               )
               != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Integer) {
            int var2 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.indexOf(
               this.IRCCIHHIIHHCCCOOIOIROICOHROCIO, (Integer)var1, this.CCHIIROHOOOOHHORHIOCRCIIOCOIII, this.HCHROIROOCRHRIRRORRIOIHICRIIHO
            );
            if (var2 >= 0) {
               return var2 - this.CCHIIROHOOOOHHORHIOCRCIIOCOIII;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Integer) {
            int var2 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.lastIndexOf(
               this.IRCCIHHIIHHCCCOOIOIROICOHROCIO, (Integer)var1, this.CCHIIROHOOOOHHORHIOCRCIIOCOIII, this.HCHROIROOCRHRIRRORRIOIHICRIIHO
            );
            if (var2 >= 0) {
               return var2 - this.CCHIIROHOOOOHHORHIOCRCIIOCOIII;
            }
         }

         return -1;
      }

      public Integer set(int var1, Integer var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         int var3 = this.IRCCIHHIIHHCCCOOIOIROICOHROCIO[this.CCHIIROHOOOOHHORHIOCRCIIOCOIII + var1];
         this.IRCCIHHIIHHCCCOOIOIROICOHROCIO[this.CCHIIROHOOOOHHORHIOCRCIIOCOIII + var1] = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Integer> subList(int var1, int var2) {
         int var3 = this.size();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var3);
         return var1 == var2
            ? Collections.emptyList()
            : new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.IRCCIHHIIHHCCCOOIOIROICOHROCIO, this.CCHIIROHOOOOHHORHIOCRCIIOCOIII + var1, this.CCHIIROHOOOOHHORHIOCRCIIOCOIII + var2
            );
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.IRCCIHHIIHHCCCOOIOIROICOHROCIO[this.CCHIIROHOOOOHHORHIOCRCIIOCOIII + var4]
                  != var2.IRCCIHHIIHHCCCOOIOIROICOHROCIO[var2.CCHIIROHOOOOHHORHIOCRCIIOCOIII + var4]) {
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

         for (int var2 = this.CCHIIROHOOOOHHORHIOCRCIIOCOIII; var2 < this.HCHROIROOCRHRIRRORRIOIHICRIIHO; var2++) {
            var1 = 31 * var1 + HICHRCOHCCRHOHCICOOCHOIHCCHIRI.hashCode(this.IRCCIHHIIHHCCCOOIOIROICOHROCIO[var2]);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 5);
         var1.append('[').append(this.IRCCIHHIIHHCCCOOIOIROICOHROCIO[this.CCHIIROHOOOOHHORHIOCRCIIOCOIII]);

         for (int var2 = this.CCHIIROHOOOOHHORHIOCRCIIOCOIII + 1; var2 < this.HCHROIROOCRHRIRRORRIOIHICRIIHO; var2++) {
            var1.append(", ").append(this.IRCCIHHIIHHCCCOOIOIROICOHROCIO[var2]);
         }

         return var1.append(']').toString();
      }

      int[] toIntArray() {
         return Arrays.copyOfRange(this.IRCCIHHIIHHCCCOOIOIROICOHROCIO, this.CCHIIROHOOOOHHORHIOCRCIIOCOIII, this.HCHROIROOCRHRIRRORRIOIHICRIIHO);
      }
   }
}
