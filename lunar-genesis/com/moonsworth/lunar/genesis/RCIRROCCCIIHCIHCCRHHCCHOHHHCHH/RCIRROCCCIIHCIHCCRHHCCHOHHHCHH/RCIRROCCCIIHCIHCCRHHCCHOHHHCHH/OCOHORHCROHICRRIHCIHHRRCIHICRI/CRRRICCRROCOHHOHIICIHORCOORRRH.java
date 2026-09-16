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
import java.util.Spliterator.OfDouble;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class CRRRICCRROCOHHOHIICIHORCOORRRH extends RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static final int OOORRHOHROHICHHIICRCICOCHOICOR = 8;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static final Pattern OHRIIOROHIOOCHIRHIRRRRHOCCIHHH = fpPattern();

   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
   }

   public static int hashCode(double var0) {
      return Double.valueOf(var0).hashCode();
   }

   public static int compare(double var0, double var2) {
      return Double.compare(var0, var2);
   }

   public static boolean isFinite(double var0) {
      return Double.NEGATIVE_INFINITY < var0 && var0 < Double.POSITIVE_INFINITY;
   }

   public static boolean contains(double[] var0, double var1) {
      for (double var6 : var0) {
         if (var6 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(double[] var0, double var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(double[] var0, double var1, int var3, int var4) {
      for (int var5 = var3; var5 < var4; var5++) {
         if (var0[var5] == var1) {
            return var5;
         }
      }

      return -1;
   }

   public static int indexOf(double[] var0, double[] var1) {
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

   public static int lastIndexOf(double[] var0, double var1) {
      return lastIndexOf(var0, var1, 0, var0.length);
   }

   private static int lastIndexOf(double[] var0, double var1, int var3, int var4) {
      for (int var5 = var4 - 1; var5 >= var3; var5--) {
         if (var0[var5] == var1) {
            return var5;
         }
      }

      return -1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      "Available in GWT! Annotation is to avoid conflict with GWT specialization of base class."
   )
   public static double min(double... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      double var1 = var0[0];

      for (int var3 = 1; var3 < var0.length; var3++) {
         var1 = Math.min(var1, var0[var3]);
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      "Available in GWT! Annotation is to avoid conflict with GWT specialization of base class."
   )
   public static double max(double... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      double var1 = var0[0];

      for (int var3 = 1; var3 < var0.length; var3++) {
         var1 = Math.max(var1, var0[var3]);
      }

      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static double constrainToRange(double var0, double var2, double var4) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 <= var4, "min (%s) must be less than or equal to max (%s)", var2, var4);
      return Math.min(Math.max(var0, var2), var4);
   }

   public static double[] concat(double[]... var0) {
      int var1 = 0;

      for (double[] var5 : var0) {
         var1 += var5.length;
      }

      double[] var8 = new double[var1];
      int var9 = 0;

      for (double[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Double> ROCHCCHICOOCIHHOHCRHIHRIOOCOHC() {
      return CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHOHOCRORHIOROCIOCIOIIIICHOHRR;
   }

   public static double[] ensureCapacity(double[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "Invalid minLength: %s", var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Invalid padding: %s", var2);
      return var0.length < var1 ? Arrays.copyOf(var0, var1 + var2) : var0;
   }

   public static String join(String var0, double... var1) {
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

   public static Comparator<double[]> lexicographicalComparator() {
      return CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.INSTANCE;
   }

   public static void sortDescending(double[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(double[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      Arrays.sort(var0, var1, var2);
      reverse(var0, var1, var2);
   }

   public static void reverse(double[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      reverse(var0, 0, var0.length);
   }

   public static void reverse(double[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      int var3 = var1;

      for (int var4 = var2 - 1; var3 < var4; var4--) {
         double var5 = var0[var3];
         var0[var3] = var0[var4];
         var0[var4] = var5;
         var3++;
      }
   }

   public static double[] toArray(Collection<? extends Number> var0) {
      if (var0 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
         return ((CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0).toDoubleArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      double[] var3 = new double[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = ((Number)IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1[var4])).doubleValue();
      }

      return var3;
   }

   public static List<Double> asList(double... var0) {
      return var0.length == 0 ? Collections.emptyList() : new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static Pattern fpPattern() {
      String var0 = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)";
      String var1 = var0 + "(?:[eE][+-]?\\d+#)?[fFdD]?";
      String var2 = "(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)";
      String var3 = "0[xX]" + var2 + "[pP][+-]?\\d+#[fFdD]?";
      String var4 = "[+-]?(?:NaN|Infinity|" + var1 + "|" + var3 + ")";
      var4 = var4.replace("#", "+");
      return Pattern.compile(var4);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static @Nullable Double tryParse(String var0) {
      if (OHRIIOROHIOOCHIRHIRRRRHOCCIHHH.matcher(var0).matches()) {
         try {
            return Double.parseDouble(var0);
         } catch (NumberFormatException var2) {
         }
      }

      return null;
   }

   private enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Comparator<double[]> {
      INSTANCE;

      public int compare(double[] var1, double[] var2) {
         int var3 = Math.min(var1.length, var2.length);

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = Double.compare(var1[var4], var2[var4]);
            if (var5 != 0) {
               return var5;
            }
         }

         return var1.length - var2.length;
      }

      @Override
      public String toString() {
         return "Doubles.lexicographicalComparator()";
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR<String, Double>
      implements Serializable {
      static final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CHOHOCRORHIOROCIOCIOIIIICHOHRR = new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      private static final long OIOOICORHOOHIRHICHHIOHHRIIICCO = 1L;

      protected Double doForward(String var1) {
         return Double.valueOf(var1);
      }

      protected String doBackward(Double var1) {
         return var1.toString();
      }

      @Override
      public String toString() {
         return "Doubles.stringConverter()";
      }

      private Object readResolve() {
         return CHOHOCRORHIOROCIOCIOIIIICHOHRR;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Double> implements Serializable, RandomAccess {
      final double[] RRROOOCRRROCRHCIHRIIOCIORHCHII;
      final int ORCIIHHIRCIOOCRRIRIIHICIRROHCR;
      final int CRRROHRRROHHCIRRCHOCOCRHIOORHH;
      private static final long OORRHRCIIHROHHOCORICHCRHHHHRRI = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double[] var1) {
         this(var1, 0, var1.length);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double[] var1, int var2, int var3) {
         this.RRROOOCRRROCRHCIHRIIOCIORHCHII = var1;
         this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR = var2;
         this.CRRROHRRROHHCIRRCHOCOCRHIOORHH = var3;
      }

      @Override
      public int size() {
         return this.CRRROHRRROHHCIRRCHOCOCRHIOORHH - this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Double get(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         return this.RRROOOCRRROCRHCIHRIIOCIORHCHII[this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + var1];
      }

      public OfDouble spliterator() {
         return Spliterators.spliterator(this.RRROOOCRRROCRHCIHRIIOCIORHCHII, this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR, this.CRRROHRRROHHCIRRCHOCOCRHIOORHH, 0);
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Double
            && CRRRICCRROCOHHOHIICIHORCOORRRH.indexOf(
                  this.RRROOOCRRROCRHCIHRIIOCIORHCHII, (Double)var1, this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR, this.CRRROHRRROHHCIRRCHOCOCRHIOORHH
               )
               != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Double) {
            int var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.indexOf(
               this.RRROOOCRRROCRHCIHRIIOCIORHCHII, (Double)var1, this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR, this.CRRROHRRROHHCIRRCHOCOCRHIOORHH
            );
            if (var2 >= 0) {
               return var2 - this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Double) {
            int var2 = CRRRICCRROCOHHOHIICIHORCOORRRH.lastIndexOf(
               this.RRROOOCRRROCRHCIHRIIOCIORHCHII, (Double)var1, this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR, this.CRRROHRRROHHCIRRCHOCOCRHIOORHH
            );
            if (var2 >= 0) {
               return var2 - this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR;
            }
         }

         return -1;
      }

      public Double set(int var1, Double var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         double var3 = this.RRROOOCRRROCRHCIHRIIOCIORHCHII[this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + var1];
         this.RRROOOCRRROCRHCIHRIIOCIORHCHII[this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + var1] = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Double> subList(int var1, int var2) {
         int var3 = this.size();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var3);
         return var1 == var2
            ? Collections.emptyList()
            : new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.RRROOOCRRROCRHCIHRIIOCIORHCHII, this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + var1, this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + var2
            );
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.RRROOOCRRROCRHCIHRIIOCIORHCHII[this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + var4]
                  != var2.RRROOOCRRROCRHCIHRIIOCIORHCHII[var2.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + var4]) {
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

         for (int var2 = this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR; var2 < this.CRRROHRRROHHCIRRCHOCOCRHIOORHH; var2++) {
            var1 = 31 * var1 + CRRRICCRROCOHHOHIICIHORCOORRRH.hashCode(this.RRROOOCRRROCRHCIHRIIOCIORHCHII[var2]);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 12);
         var1.append('[').append(this.RRROOOCRRROCRHCIHRIIOCIORHCHII[this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR]);

         for (int var2 = this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR + 1; var2 < this.CRRROHRRROHHCIRRCHOCOCRHIOORHH; var2++) {
            var1.append(", ").append(this.RRROOOCRRROCRHCIHRIIOCIORHCHII[var2]);
         }

         return var1.append(']').toString();
      }

      double[] toDoubleArray() {
         return Arrays.copyOfRange(this.RRROOOCRRROCRHCIHRIIOCIORHCHII, this.ORCIIHHIRCIOOCRRIRIIHICIRROHCR, this.CRRROHRRROHHCIRRCHOCOCRHIOORHH);
      }
   }
}
