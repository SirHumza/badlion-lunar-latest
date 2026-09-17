package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Spliterator.OfDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;
import org.checkerframework.checker.nullness.qual.Nullable;

@Immutable
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements Serializable {
   private static final OOROOCCIRCCRHOIOIORIHCHHOOCCOR HOCORCIROCIRCORIIHOHHCCHICIORC = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new double[0]);
   private final double[] CRCOOHHCRHICHRHHOCHIOIIHCIHCOI;
   private final transient int HOCHOHCCRCORHOORIIIIHCIOHIOOHH;
   private final int HICRRCOIHCRRCIIHRCOOHCICIHCIHC;

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR RIICOCIOIOOIHCIRORRORCHOCCCICR() {
      return HOCORCIROCIRCORIIHOHHCCHICIORC;
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IOCCCRIHOCHRCHRHCRHROIRIRHHHIR(double var0) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new double[]{var0});
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IHCRORHRORIICHRHRCHRRIRRHHOCOO(double var0, double var2) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new double[]{var0, var2});
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR CRHROHHHCIHHCOHCOORCRIHHIICROR(double var0, double var2, double var4) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new double[]{var0, var2, var4});
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR RRCRRCORICCHOHHIRCHIROOHIIOHCO(double var0, double var2, double var4, double var6) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new double[]{var0, var2, var4, var6});
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var0, double var2, double var4, double var6, double var8) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new double[]{var0, var2, var4, var6, var8});
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR OOROOCCIRCCRHOIOIORIHCHHOOCCOR(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new double[]{var0, var2, var4, var6, var8, var10});
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, double... var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2.length <= 2147483646, "the total number of elements must fit in an int");
      double[] var3 = new double[var2.length + 1];
      var3[0] = var0;
      System.arraycopy(var2, 0, var3, 1, var2.length);
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var3);
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR RICRIRRCOHRCOCRRHHCRHRROOIOHHR(double[] var0) {
      return var0.length == 0 ? HOCORCIROCIRCORIIHOHHCCHICIORC : new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Arrays.copyOf(var0, var0.length));
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(Collection<Double> var0) {
      return var0.isEmpty() ? HOCORCIROCIRCORIIHOHHCCHICIORC : new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CRRRICCRROCOHHOHIICIHORCOORRRH.toArray(var0));
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR OHRRHHOCROROCCIRROIHOCCHCIHCIR(Iterable<Double> var0) {
      return var0 instanceof Collection
         ? IRCRRHRCIRHIHIHROHCRRHIIHHHHCH((Collection<Double>)var0)
         : CCRIIIIOCOHIICRIIROOCRCIRCOIRH().RCOCRROHHROHHOCRCCCHCIROIIOORC(var0).CCOHIHRHICCOICCRIHRRRRROIHOCHI();
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(DoubleStream var0) {
      double[] var1 = var0.toArray();
      return var1.length == 0 ? HOCORCIROCIRCORIIHOHHCCHICIORC : new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OOCCCCORORRRIOIHRRIIRCCICHHOOC(int var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0 >= 0, "Invalid initialCapacity: %s", var0);
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCRIIIIOCOHIICRIIROOCRCIRCOIRH() {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(10);
   }

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR(double[] var1) {
      this(var1, 0, var1.length);
   }

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR(double[] var1, int var2, int var3) {
      this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI = var1;
      this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH = var2;
      this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC = var3;
   }

   public int length() {
      return this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC - this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH;
   }

   public boolean isEmpty() {
      return this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC == this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH;
   }

   public double get(int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.length());
      return this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH + var1];
   }

   public int indexOf(double var1) {
      for (int var3 = this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH; var3 < this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC; var3++) {
         if (areEqual(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[var3], var1)) {
            return var3 - this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH;
         }
      }

      return -1;
   }

   public int lastIndexOf(double var1) {
      for (int var3 = this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC - 1; var3 >= this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH; var3--) {
         if (areEqual(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[var3], var1)) {
            return var3 - this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH;
         }
      }

      return -1;
   }

   public boolean contains(double var1) {
      return this.indexOf(var1) >= 0;
   }

   public void forEach(DoubleConsumer var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);

      for (int var2 = this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH; var2 < this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC; var2++) {
         var1.accept(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[var2]);
      }
   }

   public DoubleStream stream() {
      return Arrays.stream(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI, this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH, this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC);
   }

   public double[] toArray() {
      return Arrays.copyOfRange(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI, this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH, this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC);
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR ROIOROHRIHRRHIHRRRIHHHIICCHIOI(int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, this.length());
      return var1 == var2
         ? HOCORCIROCIRCORIIHOHHCCHICIORC
         : new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI, this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH + var1, this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH + var2
         );
   }

   private OfDouble spliterator() {
      return Spliterators.spliterator(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI, this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH, this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC, 1040);
   }

   public List<Double> asList() {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof OOROOCCIRCCRHOIOIORIHCHHOOCCOR)) {
         return false;
      }

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var1;
      if (this.length() != var2.length()) {
         return false;
      }

      for (int var3 = 0; var3 < this.length(); var3++) {
         if (!areEqual(this.get(var3), var2.get(var3))) {
            return false;
         }
      }

      return true;
   }

   private static boolean areEqual(double var0, double var2) {
      return Double.doubleToLongBits(var0) == Double.doubleToLongBits(var2);
   }

   @Override
   public int hashCode() {
      int var1 = 1;

      for (int var2 = this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH; var2 < this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC; var2++) {
         var1 *= 31;
         var1 += CRRRICCRROCOHHOHIICIHORCOORRRH.hashCode(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[var2]);
      }

      return var1;
   }

   @Override
   public String toString() {
      if (this.isEmpty()) {
         return "[]";
      }

      StringBuilder var1 = new StringBuilder(this.length() * 5);
      var1.append('[').append(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH]);

      for (int var2 = this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH + 1; var2 < this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC; var2++) {
         var1.append(", ").append(this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[var2]);
      }

      var1.append(']');
      return var1.toString();
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR HOHCRCCIICRORHRHOIIHRCRCIHHCCH() {
      return this.isPartialView() ? new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.toArray()) : this;
   }

   private boolean isPartialView() {
      return this.HOCHOHCCRCORHOORIIIIHCIOHIOOHH > 0 || this.HICRRCOIHCRRCIIHRCOOHCICIHCIHC < this.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI.length;
   }

   Object writeReplace() {
      return this.HOHCRCCIICRORHRHOIIHRCRCIHHCCH();
   }

   Object readResolve() {
      return this.isEmpty() ? HOCORCIROCIRCORIIHOHHCCHICIORC : this;
   }

   @CanIgnoreReturnValue
   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private double[] array;
      private int count = 0;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
         this.array = new double[var1];
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(double var1) {
         this.ensureRoomFor(1);
         this.array[this.count] = var1;
         this.count++;
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HICRRICCHCCROOHHCHOCOCCHOIHHOC(double[] var1) {
         this.ensureRoomFor(var1.length);
         System.arraycopy(var1, 0, this.array, this.count, var1.length);
         this.count += var1.length;
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCOCRROHHROHHOCRCCCHCIROIIOORC(Iterable<Double> var1) {
         if (var1 instanceof Collection) {
            return this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH((Collection<Double>)var1);
         }

         for (Double var3 : var1) {
            this.CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(var3);
         }

         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(Collection<Double> var1) {
         this.ensureRoomFor(var1.size());

         for (Double var3 : var1) {
            this.array[this.count++] = var3;
         }

         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(DoubleStream var1) {
         OfDouble var2 = var1.spliterator();
         long var3 = var2.getExactSizeIfKnown();
         if (var3 > 0L) {
            this.ensureRoomFor(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(var3));
         }

         var2.forEachRemaining(this::CHRCRHHRCCOICCOOIIRIOHCOHCHHIC);
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRRICCRROCOHHOHIICIHORCOORRRH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         this.ensureRoomFor(var1.length());
         System.arraycopy(var1.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI, var1.HOCHOHCCRCORHOORIIIIHCIOHIOOHH, this.array, this.count, var1.length());
         this.count = this.count + var1.length();
         return this;
      }

      private void ensureRoomFor(int var1) {
         int var2 = this.count + var1;
         if (var2 > this.array.length) {
            double[] var3 = new double[expandedCapacity(this.array.length, var2)];
            System.arraycopy(this.array, 0, var3, 0, this.count);
            this.array = var3;
         }
      }

      private static int expandedCapacity(int var0, int var1) {
         if (var1 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
         }

         int var2 = var0 + (var0 >> 1) + 1;
         if (var2 < var1) {
            var2 = Integer.highestOneBit(var1 - 1) << 1;
         }

         if (var2 < 0) {
            var2 = Integer.MAX_VALUE;
         }

         return var2;
      }

      @CheckReturnValue
      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR CCOHIHRHICCOICCRIHRRRRROIHOCHI() {
         return this.count == 0 ? OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCORCIROCIRCORIIHOHHCCHICIORC : new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.array, 0, this.count);
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Double> implements Serializable, RandomAccess {
      private final OOROOCCIRCCRHOIOIORIHCHHOOCCOR OIOIHCOOOOHCOCIHHHHCCCCORCHOII;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII = var1;
      }

      @Override
      public int size() {
         return this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.length();
      }

      public Double get(int var1) {
         return this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.get(var1);
      }

      @Override
      public boolean contains(Object var1) {
         return this.indexOf(var1) >= 0;
      }

      @Override
      public int indexOf(Object var1) {
         return var1 instanceof Double ? this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.indexOf((Double)var1) : -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         return var1 instanceof Double ? this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.lastIndexOf((Double)var1) : -1;
      }

      @Override
      public List<Double> subList(int var1, int var2) {
         return this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.ROIOROHRIHRRHIHRRRIHHHIICCHIOI(var1, var2).asList();
      }

      @Override
      public Spliterator<Double> spliterator() {
         return this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.spliterator();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            return this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.equals(var6.OIOIHCOOOOHCOCIHHHHCCCCORCHOII);
         }

         if (!(var1 instanceof List)) {
            return false;
         }

         List var2 = (List)var1;
         if (this.size() != var2.size()) {
            return false;
         }

         int var3 = this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.HOCHOHCCRCORHOORIIIIHCIOHIOOHH;

         for (Object var5 : var2) {
            if (!(var5 instanceof Double)
               || !OOROOCCIRCCRHOIOIORIHCHHOOCCOR.areEqual(this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.CRCOOHHCRHICHRHHOCHIOIIHCIHCOI[var3++], (Double)var5)) {
               return false;
            }
         }

         return true;
      }

      @Override
      public int hashCode() {
         return this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.hashCode();
      }

      @Override
      public String toString() {
         return this.OIOIHCOOOOHCOCIHHHHCCCCORCHOII.toString();
      }
   }
}
