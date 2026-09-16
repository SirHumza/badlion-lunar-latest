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

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static Comparator<Boolean> trueFirst() {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TRUE_FIRST;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static Comparator<Boolean> falseFirst() {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FALSE_FIRST;
   }

   public static int hashCode(boolean var0) {
      return var0 ? 1231 : 1237;
   }

   public static int compare(boolean var0, boolean var1) {
      return var0 == var1 ? 0 : (var0 ? 1 : -1);
   }

   public static boolean contains(boolean[] var0, boolean var1) {
      for (boolean var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(boolean[] var0, boolean var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(boolean[] var0, boolean var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3; var4++) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static int indexOf(boolean[] var0, boolean[] var1) {
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

   public static int lastIndexOf(boolean[] var0, boolean var1) {
      return lastIndexOf(var0, var1, 0, var0.length);
   }

   private static int lastIndexOf(boolean[] var0, boolean var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 >= var2; var4--) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static boolean[] concat(boolean[]... var0) {
      int var1 = 0;

      for (boolean[] var5 : var0) {
         var1 += var5.length;
      }

      boolean[] var8 = new boolean[var1];
      int var9 = 0;

      for (boolean[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   public static boolean[] ensureCapacity(boolean[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "Invalid minLength: %s", var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Invalid padding: %s", var2);
      return var0.length < var1 ? Arrays.copyOf(var0, var1 + var2) : var0;
   }

   public static String join(String var0, boolean... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1.length == 0) {
         return "";
      }

      StringBuilder var2 = new StringBuilder(var1.length * 7);
      var2.append(var1[0]);

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2.append(var0).append(var1[var3]);
      }

      return var2.toString();
   }

   public static Comparator<boolean[]> lexicographicalComparator() {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.INSTANCE;
   }

   public static boolean[] toArray(Collection<Boolean> var0) {
      if (var0 instanceof com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         )
       {
         return ((com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0)
            .toBooleanArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      boolean[] var3 = new boolean[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = (Boolean)IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1[var4]);
      }

      return var3;
   }

   public static List<Boolean> asList(boolean... var0) {
      return var0.length == 0
         ? Collections.emptyList()
         : new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var0
         );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static int countTrue(boolean... var0) {
      int var1 = 0;

      for (boolean var5 : var0) {
         if (var5) {
            var1++;
         }
      }

      return var1;
   }

   public static void reverse(boolean[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      reverse(var0, 0, var0.length);
   }

   public static void reverse(boolean[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      int var3 = var1;

      for (int var4 = var2 - 1; var3 < var4; var4--) {
         boolean var5 = var0[var3];
         var0[var3] = var0[var4];
         var0[var4] = var5;
         var3++;
      }
   }

   private enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Comparator<boolean[]> {
      INSTANCE;

      public int compare(boolean[] var1, boolean[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.compare(
               var1[var4], var2[var4]
            );
            if (var5 != 0) {
               return var5;
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "Booleans.lexicographicalComparator()";
      }
   }

   private enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Comparator<Boolean> {
      TRUE_FIRST(1, "Booleans.trueFirst()"),
      FALSE_FIRST(-1, "Booleans.falseFirst()");

      private final int trueValue;
      private final String toString;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var3, String var4) {
         this.trueValue = var3;
         this.toString = var4;
      }

      public int compare(Boolean var1, Boolean var2) {
         int var3 = var1 ? this.trueValue : 0;
         int var4 = var2 ? this.trueValue : 0;
         return var4 - var3;
      }

      @Override
      public String toString() {
         return this.toString;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Boolean> implements Serializable, RandomAccess {
      final boolean[] ORHCOOIORRHOCIRHHHCORIHCCCORHI;
      final int CROHRIORIIRHHIRHHICRCOIOIROCRH;
      final int CRHHCIRRRCOOIOOHRHRCCIRIOIIORI;
      private static final long CIIIRHRIHRCOORCCCIRORIIICCHCHO = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean[] var1) {
         this(var1, 0, var1.length);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean[] var1, int var2, int var3) {
         this.ORHCOOIORRHOCIRHHHCORIHCCCORHI = var1;
         this.CROHRIORIIRHHIRHHICRCOIOIROCRH = var2;
         this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI = var3;
      }

      @Override
      public int size() {
         return this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI - this.CROHRIORIIRHHIRHHICRCOIOIROCRH;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Boolean get(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         return this.ORHCOOIORRHOCIRHHHCORIHCCCORHI[this.CROHRIORIIRHHIRHHICRCOIOIROCRH + var1];
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Boolean
            && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.indexOf(
                  this.ORHCOOIORRHOCIRHHHCORIHCCCORHI, (Boolean)var1, this.CROHRIORIIRHHIRHHICRCOIOIROCRH, this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI
               )
               != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Boolean) {
            int var2 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.indexOf(
               this.ORHCOOIORRHOCIRHHHCORIHCCCORHI, (Boolean)var1, this.CROHRIORIIRHHIRHHICRCOIOIROCRH, this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI
            );
            if (var2 >= 0) {
               return var2 - this.CROHRIORIIRHHIRHHICRCOIOIROCRH;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Boolean) {
            int var2 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.lastIndexOf(
               this.ORHCOOIORRHOCIRHHHCORIHCCCORHI, (Boolean)var1, this.CROHRIORIIRHHIRHHICRCOIOIROCRH, this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI
            );
            if (var2 >= 0) {
               return var2 - this.CROHRIORIIRHHIRHHICRCOIOIROCRH;
            }
         }

         return -1;
      }

      public Boolean set(int var1, Boolean var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         boolean var3 = this.ORHCOOIORRHOCIRHHHCORIHCCCORHI[this.CROHRIORIIRHHIRHHICRCOIOIROCRH + var1];
         this.ORHCOOIORRHOCIRHHHCORIHCCCORHI[this.CROHRIORIIRHHIRHHICRCOIOIROCRH + var1] = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Boolean> subList(int var1, int var2) {
         int var3 = this.size();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var3);
         return var1 == var2
            ? Collections.emptyList()
            : new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.ORHCOOIORRHOCIRHHHCORIHCCCORHI, this.CROHRIORIIRHHIRHHICRCOIOIROCRH + var1, this.CROHRIORIIRHHIRHHICRCOIOIROCRH + var2
            );
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
            )
          {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.ORHCOOIORRHOCIRHHHCORIHCCCORHI[this.CROHRIORIIRHHIRHHICRCOIOIROCRH + var4]
                  != var2.ORHCOOIORRHOCIRHHHCORIHCCCORHI[var2.CROHRIORIIRHHIRHHICRCOIOIROCRH + var4]) {
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

         for (int var2 = this.CROHRIORIIRHHIRHHICRCOIOIROCRH; var2 < this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI; var2++) {
            var1 = 31 * var1
               + com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.hashCode(
                  this.ORHCOOIORRHOCIRHHHCORIHCCCORHI[var2]
               );
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 7);
         var1.append(this.ORHCOOIORRHOCIRHHHCORIHCCCORHI[this.CROHRIORIIRHHIRHHICRCOIOIROCRH] ? "[true" : "[false");

         for (int var2 = this.CROHRIORIIRHHIRHHICRCOIOIROCRH + 1; var2 < this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI; var2++) {
            var1.append(this.ORHCOOIORRHOCIRHHHCORIHCCCORHI[var2] ? ", true" : ", false");
         }

         return var1.append(']').toString();
      }

      boolean[] toBooleanArray() {
         return Arrays.copyOfRange(this.ORHCOOIORRHOCIRHHHCORIHCCCORHI, this.CROHRIORIIRHHIRHHICRCOIOIROCRH, this.CRHHCIRRRCOOIOOHRHRCCIRIOIIORI);
      }
   }
}
