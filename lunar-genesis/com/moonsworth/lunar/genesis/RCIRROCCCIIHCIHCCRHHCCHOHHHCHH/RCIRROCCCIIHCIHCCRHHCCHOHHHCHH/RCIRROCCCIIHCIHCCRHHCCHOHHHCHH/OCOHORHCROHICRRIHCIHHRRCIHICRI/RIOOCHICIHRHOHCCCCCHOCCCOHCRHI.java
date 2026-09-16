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
public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public static final int ROHOICIROICICOHROROROHIOIIHROC = 4;

   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
   }

   public static int hashCode(float var0) {
      return Float.valueOf(var0).hashCode();
   }

   public static int compare(float var0, float var1) {
      return Float.compare(var0, var1);
   }

   public static boolean isFinite(float var0) {
      return Float.NEGATIVE_INFINITY < var0 && var0 < Float.POSITIVE_INFINITY;
   }

   public static boolean contains(float[] var0, float var1) {
      for (float var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(float[] var0, float var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(float[] var0, float var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3; var4++) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static int indexOf(float[] var0, float[] var1) {
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

   public static int lastIndexOf(float[] var0, float var1) {
      return lastIndexOf(var0, var1, 0, var0.length);
   }

   private static int lastIndexOf(float[] var0, float var1, int var2, int var3) {
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
   public static float min(float... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      float var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         var1 = Math.min(var1, var0[var2]);
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      "Available in GWT! Annotation is to avoid conflict with GWT specialization of base class."
   )
   public static float max(float... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      float var1 = var0[0];

      for (int var2 = 1; var2 < var0.length; var2++) {
         var1 = Math.max(var1, var0[var2]);
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static float constrainToRange(float var0, float var1, float var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 <= var2, "min (%s) must be less than or equal to max (%s)", var1, var2);
      return Math.min(Math.max(var0, var1), var2);
   }

   public static float[] concat(float[]... var0) {
      int var1 = 0;

      for (float[] var5 : var0) {
         var1 += var5.length;
      }

      float[] var8 = new float[var1];
      int var9 = 0;

      for (float[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Float> ROCHCCHICOOCIHHOHCRHIHRIOOCOHC() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RICRIIRIHHCIIHRHOICIOIRRIRCCHR;
   }

   public static float[] ensureCapacity(float[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "Invalid minLength: %s", var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Invalid padding: %s", var2);
      return var0.length < var1 ? Arrays.copyOf(var0, var1 + var2) : var0;
   }

   public static String join(String var0, float... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1.length == 0) {
         return "";
      }

      StringBuilder var2 = new StringBuilder(var1.length * 12);
      var2.append(var1[0]);

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2.append(var0).append(var1[var3]);
      }

      return var2.toString();
   }

   public static Comparator<float[]> lexicographicalComparator() {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.INSTANCE;
   }

   public static void sortDescending(float[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(float[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      Arrays.sort(var0, var1, var2);
      reverse(var0, var1, var2);
   }

   public static void reverse(float[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      reverse(var0, 0, var0.length);
   }

   public static void reverse(float[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      int var3 = var1;

      for (int var4 = var2 - 1; var3 < var4; var4--) {
         float var5 = var0[var3];
         var0[var3] = var0[var4];
         var0[var4] = var5;
         var3++;
      }
   }

   public static float[] toArray(Collection<? extends Number> var0) {
      if (var0 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
         return ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0).toFloatArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      float[] var3 = new float[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = ((Number)IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1[var4])).floatValue();
      }

      return var3;
   }

   public static List<Float> asList(float... var0) {
      return var0.length == 0 ? Collections.emptyList() : new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static @Nullable Float tryParse(String var0) {
      if (CRRRICCRROCOHHOHIICIHORCOORRRH.OHRIIOROHIOOCHIRHIRRRRHOCCIHHH.matcher(var0).matches()) {
         try {
            return Float.parseFloat(var0);
         } catch (NumberFormatException var2) {
         }
      }

      return null;
   }

   private enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Comparator<float[]> {
      INSTANCE;

      public int compare(float[] var1, float[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = Float.compare(var1[var4], var2[var4]);
            if (var5 != 0) {
               return var5;
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "Floats.lexicographicalComparator()";
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Float>
      implements Serializable {
      static final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH RICRIIRIHHCIIHRHOICIOIRRIRCCHR = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      private static final long ORCHIHHRHIOOROCHHCRCIRCRRRIOHI = 1L;

      protected Float doForward(String var1) {
         return Float.valueOf(var1);
      }

      protected String doBackward(Float var1) {
         return var1.toString();
      }

      @Override
      public String toString() {
         return "Floats.stringConverter()";
      }

      private Object readResolve() {
         return RICRIIRIHHCIIHRHOICIOIRRIRCCHR;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Float> implements Serializable, RandomAccess {
      final float[] HIHOIRHIRHOCOOCCHHOIHCCIIROHRC;
      final int ICRCRHIHOOOIIRIOICRHRHIOCIICOO;
      final int ICRCROIIRHRIHIRCOHHROHICRRICCC;
      private static final long RCOCHOIRRIROIHOHHRHIHRICROHORC = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float[] var1) {
         this(var1, 0, var1.length);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float[] var1, int var2, int var3) {
         this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC = var1;
         this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO = var2;
         this.ICRCROIIRHRIHIRCOHHROHICRRICCC = var3;
      }

      @Override
      public int size() {
         return this.ICRCROIIRHRIHIRCOHHROHICRRICCC - this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Float get(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         return this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + var1];
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Float
            && RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.indexOf(
                  this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC, (Float)var1, this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO, this.ICRCROIIRHRIHIRCOHHROHICRRICCC
               )
               != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Float) {
            int var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.indexOf(
               this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC, (Float)var1, this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO, this.ICRCROIIRHRIHIRCOHHROHICRRICCC
            );
            if (var2 >= 0) {
               return var2 - this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Float) {
            int var2 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.lastIndexOf(
               this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC, (Float)var1, this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO, this.ICRCROIIRHRIHIRCOHHROHICRRICCC
            );
            if (var2 >= 0) {
               return var2 - this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO;
            }
         }

         return -1;
      }

      public Float set(int var1, Float var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         float var3 = this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + var1];
         this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + var1] = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Float> subList(int var1, int var2) {
         int var3 = this.size();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var3);
         return var1 == var2
            ? Collections.emptyList()
            : new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC, this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + var1, this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + var2
            );
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + var4]
                  != var2.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[var2.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + var4]) {
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

         for (int var2 = this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO; var2 < this.ICRCROIIRHRIHIRCOHHROHICRRICCC; var2++) {
            var1 = 31 * var1 + RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.hashCode(this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[var2]);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 12);
         var1.append('[').append(this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO]);

         for (int var2 = this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO + 1; var2 < this.ICRCROIIRHRIHIRCOHHROHICRRICCC; var2++) {
            var1.append(", ").append(this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC[var2]);
         }

         return var1.append(']').toString();
      }

      float[] toFloatArray() {
         return Arrays.copyOfRange(this.HIHOIRHIRHOCOOCCHHOIHCCIIROHRC, this.ICRCRHIHOOOIIRIOICRHRHIOCIICOO, this.ICRCROIIRHRIHIRCOHHROHICRRICCC);
      }
   }
}
