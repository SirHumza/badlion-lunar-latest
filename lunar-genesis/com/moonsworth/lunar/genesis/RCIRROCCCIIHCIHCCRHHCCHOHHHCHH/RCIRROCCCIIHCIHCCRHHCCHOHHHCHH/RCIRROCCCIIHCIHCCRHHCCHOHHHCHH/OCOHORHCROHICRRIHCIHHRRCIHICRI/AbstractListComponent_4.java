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
import java.util.Spliterator.OfLong;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;
import org.checkerframework.checker.nullness.qual.Nullable;

@Immutable
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class CRICCOOHHHCHOORCICOCOHIHOIRHOO implements Serializable {
   private static final CRICCOOHHHCHOORCICOCOHIHOIRHOO IOHOCHROCICROCHIHHOICHOIHRRCCC = new CRICCOOHHHCHOORCICOCOHIHOIRHOO(new long[0]);
   private final long[] IHCCOHIOHRCIHHOOORRROOCOORHHCO;
   private final transient int ROIICIIICRCHOCICIIIHCCICRIORIC;
   private final int OHRROORHIHOHRRIHORHHCICIROCCRR;

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO RHIROCOCOOCIRRRRCIOROOIHRRRHIH() {
      return IOHOCHROCICROCHIHHOICHOIHRRCCC;
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO COCCRCRCRHROIRCCHOHRICCCIOCICI(long var0) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO(new long[]{var0});
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO IRRCCOICORICIHCHRHIHIHROIRHOCR(long var0, long var2) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO(new long[]{var0, var2});
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO HHCCIRHCCCIIRHCROHIORHIRHHIORH(long var0, long var2, long var4) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO(new long[]{var0, var2, var4});
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, long var2, long var4, long var6) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO(new long[]{var0, var2, var4, var6});
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, long var2, long var4, long var6, long var8) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO(new long[]{var0, var2, var4, var6, var8});
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, long var2, long var4, long var6, long var8, long var10) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO(new long[]{var0, var2, var4, var6, var8, var10});
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, long... var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2.length <= 2147483646, "the total number of elements must fit in an int");
      long[] var3 = new long[var2.length + 1];
      var3[0] = var0;
      System.arraycopy(var2, 0, var3, 1, var2.length);
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var3);
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO RRCRRCORICCHOHHIRCHIROOHIIOHCO(long[] var0) {
      return var0.length == 0 ? IOHOCHROCICROCHIHHOICHOIHRRCCC : new CRICCOOHHHCHOORCICOCOHIHOIRHOO(Arrays.copyOf(var0, var0.length));
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO IOHIHIIHCCCCCIHRORIOIOORCIOHII(Collection<Long> var0) {
      return var0.isEmpty() ? IOHOCHROCICROCHIHHOICHOIHRRCCC : new CRICCOOHHHCHOORCICOCOHIHOIRHOO(OCOHORHCROHICRRIHCIHHRRCIHICRI.toArray(var0));
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(Iterable<Long> var0) {
      return var0 instanceof Collection
         ? IOHIHIIHCCCCCIHRORIOIOORCIOHII((Collection<Long>)var0)
         : CIRCRHCIHROROOCOHOIIHCOHCOCHRO().RRORCOIRRIICOOICOIOCORHORCHCOC(var0).OOHOHRCOHRHCHCOOCOHHIRICOORIHC();
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO CRRRICCRROCOHHOHIICIHORCOORRRH(LongStream var0) {
      long[] var1 = var0.toArray();
      return var1.length == 0 ? IOHOCHROCICROCHIHHOICHOIHRRCCC : new CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1);
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH HROICORRORCIOIHHOROICROHIOCHIO(int var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0 >= 0, "Invalid initialCapacity: %s", var0);
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIRCRHCIHROROOCOHOIIHCOHCOCHRO() {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(10);
   }

   private CRICCOOHHHCHOORCICOCOHIHOIRHOO(long[] var1) {
      this(var1, 0, var1.length);
   }

   private CRICCOOHHHCHOORCICOCOHIHOIRHOO(long[] var1, int var2, int var3) {
      this.IHCCOHIOHRCIHHOOORRROOCOORHHCO = var1;
      this.ROIICIIICRCHOCICIIIHCCICRIORIC = var2;
      this.OHRROORHIHOHRRIHORHHCICIROCCRR = var3;
   }

   public int length() {
      return this.OHRROORHIHOHRRIHORHHCICIROCCRR - this.ROIICIIICRCHOCICIIIHCCICRIORIC;
   }

   public boolean isEmpty() {
      return this.OHRROORHIHOHRRIHORHHCICIROCCRR == this.ROIICIIICRCHOCICIIIHCCICRIORIC;
   }

   public long get(int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.length());
      return this.IHCCOHIOHRCIHHOOORRROOCOORHHCO[this.ROIICIIICRCHOCICIIIHCCICRIORIC + var1];
   }

   public int indexOf(long var1) {
      for (int var3 = this.ROIICIIICRCHOCICIIIHCCICRIORIC; var3 < this.OHRROORHIHOHRRIHORHHCICIROCCRR; var3++) {
         if (this.IHCCOHIOHRCIHHOOORRROOCOORHHCO[var3] == var1) {
            return var3 - this.ROIICIIICRCHOCICIIIHCCICRIORIC;
         }
      }

      return -1;
   }

   public int lastIndexOf(long var1) {
      for (int var3 = this.OHRROORHIHOHRRIHORHHCICIROCCRR - 1; var3 >= this.ROIICIIICRCHOCICIIIHCCICRIORIC; var3--) {
         if (this.IHCCOHIOHRCIHHOOORRROOCOORHHCO[var3] == var1) {
            return var3 - this.ROIICIIICRCHOCICIIIHCCICRIORIC;
         }
      }

      return -1;
   }

   public boolean contains(long var1) {
      return this.indexOf(var1) >= 0;
   }

   public void forEach(LongConsumer var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);

      for (int var2 = this.ROIICIIICRCHOCICIIIHCCICRIORIC; var2 < this.OHRROORHIHOHRRIHORHHCICIROCCRR; var2++) {
         var1.accept(this.IHCCOHIOHRCIHHOOORRROOCOORHHCO[var2]);
      }
   }

   public LongStream stream() {
      return Arrays.stream(this.IHCCOHIOHRCIHHOOORRROOCOORHHCO, this.ROIICIIICRCHOCICIIIHCCICRIORIC, this.OHRROORHIHOHRRIHORHHCICIROCCRR);
   }

   public long[] toArray() {
      return Arrays.copyOfRange(this.IHCCOHIOHRCIHHOOORRROOCOORHHCO, this.ROIICIIICRCHOCICIIIHCCICRIORIC, this.OHRROORHIHOHRRIHORHHCICIROCCRR);
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO COCCRCRCRHROIRCCHOHRICCCIOCICI(int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, this.length());
      return var1 == var2
         ? IOHOCHROCICROCHIHHOICHOIHRRCCC
         : new CRICCOOHHHCHOORCICOCOHIHOIRHOO(
            this.IHCCOHIOHRCIHHOOORRROOCOORHHCO, this.ROIICIIICRCHOCICIIIHCCICRIORIC + var1, this.ROIICIIICRCHOCICIIIHCCICRIORIC + var2
         );
   }

   private OfLong spliterator() {
      return Spliterators.spliterator(this.IHCCOHIOHRCIHHOOORRROOCOORHHCO, this.ROIICIIICRCHOCICIIIHCCICRIORIC, this.OHRROORHIHOHRRIHORHHCICIROCCRR, 1040);
   }

   public List<Long> asList() {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof CRICCOOHHHCHOORCICOCOHIHOIRHOO)) {
         return false;
      }

      CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 = (CRICCOOHHHCHOORCICOCOHIHOIRHOO)var1;
      if (this.length() != var2.length()) {
         return false;
      }

      for (int var3 = 0; var3 < this.length(); var3++) {
         if (this.get(var3) != var2.get(var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      int var1 = 1;

      for (int var2 = this.ROIICIIICRCHOCICIIIHCCICRIORIC; var2 < this.OHRROORHIHOHRRIHORHHCICIROCCRR; var2++) {
         var1 *= 31;
         var1 += OCOHORHCROHICRRIHCIHHRRCIHICRI.hashCode(this.IHCCOHIOHRCIHHOOORRROOCOORHHCO[var2]);
      }

      return var1;
   }

   @Override
   public String toString() {
      if (this.isEmpty()) {
         return "[]";
      }

      StringBuilder var1 = new StringBuilder(this.length() * 5);
      var1.append('[').append(this.IHCCOHIOHRCIHHOOORRROOCOORHHCO[this.ROIICIIICRCHOCICIIIHCCICRIORIC]);

      for (int var2 = this.ROIICIIICRCHOCICIIIHCCICRIORIC + 1; var2 < this.OHRROORHIHOHRRIHORHHCICIROCCRR; var2++) {
         var1.append(", ").append(this.IHCCOHIOHRCIHHOOORRROOCOORHHCO[var2]);
      }

      var1.append(']');
      return var1.toString();
   }

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO RIHIOICOOICCHOORIOOHOICORIRIHH() {
      return this.isPartialView() ? new CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.toArray()) : this;
   }

   private boolean isPartialView() {
      return this.ROIICIIICRCHOCICIIIHCCICRIORIC > 0 || this.OHRROORHIHOHRRIHORHHCICIROCCRR < this.IHCCOHIOHRCIHHOOORRROOCOORHHCO.length;
   }

   Object writeReplace() {
      return this.RIHIOICOOICCHOORIOOHOICORIRIHH();
   }

   Object readResolve() {
      return this.isEmpty() ? IOHOCHROCICROCHIHHOICHOIHRRCCC : this;
   }

   @CanIgnoreReturnValue
   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private long[] array;
      private int count = 0;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
         this.array = new long[var1];
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RICHIIOOOHORCHORORHIHIRRHCOOIH(long var1) {
         this.ensureRoomFor(1);
         this.array[this.count] = var1;
         this.count++;
         return this;
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(long[] var1) {
         this.ensureRoomFor(var1.length);
         System.arraycopy(var1, 0, this.array, this.count, var1.length);
         this.count += var1.length;
         return this;
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRORCOIRRIICOOICOIOCORHORCHCOC(Iterable<Long> var1) {
         if (var1 instanceof Collection) {
            return this.RCIROOOOICRHCCRRCIORHHIRCOIIIC((Collection<Long>)var1);
         }

         for (Long var3 : var1) {
            this.RICHIIOOOHORCHORORHIHIRRHCOOIH(var3);
         }

         return this;
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIROOOOICRHCCRRCIORHHIRCOIIIC(Collection<Long> var1) {
         this.ensureRoomFor(var1.size());

         for (Long var3 : var1) {
            this.array[this.count++] = var3;
         }

         return this;
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(LongStream var1) {
         OfLong var2 = var1.spliterator();
         long var3 = var2.getExactSizeIfKnown();
         if (var3 > 0L) {
            this.ensureRoomFor(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(var3));
         }

         var2.forEachRemaining(this::RICHIIOOOHORCHORORHIHIRRHCOOIH);
         return this;
      }

      public CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRRICCRROCOHHOHIICIHORCOORRRH(CRICCOOHHHCHOORCICOCOHIHOIRHOO var1) {
         this.ensureRoomFor(var1.length());
         System.arraycopy(var1.IHCCOHIOHRCIHHOOORRROOCOORHHCO, var1.ROIICIIICRCHOCICIIIHCCICRIORIC, this.array, this.count, var1.length());
         this.count = this.count + var1.length();
         return this;
      }

      private void ensureRoomFor(int var1) {
         int var2 = this.count + var1;
         if (var2 > this.array.length) {
            long[] var3 = new long[expandedCapacity(this.array.length, var2)];
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
      public CRICCOOHHHCHOORCICOCOHIHOIRHOO OOHOHRCOHRHCHCOOCOHHIRICOORIHC() {
         return this.count == 0 ? CRICCOOHHHCHOORCICOCOHIHOIRHOO.IOHOCHROCICROCHIHHOICHOIHRRCCC : new CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.array, 0, this.count);
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Long> implements Serializable, RandomAccess {
      private final CRICCOOHHHCHOORCICOCOHIHOIRHOO IRHHIOIHIICROOCHRHHRHOCIRCOCCH;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO var1) {
         this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH = var1;
      }

      @Override
      public int size() {
         return this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.length();
      }

      public Long get(int var1) {
         return this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.get(var1);
      }

      @Override
      public boolean contains(Object var1) {
         return this.indexOf(var1) >= 0;
      }

      @Override
      public int indexOf(Object var1) {
         return var1 instanceof Long ? this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.indexOf((Long)var1) : -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         return var1 instanceof Long ? this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.lastIndexOf((Long)var1) : -1;
      }

      @Override
      public List<Long> subList(int var1, int var2) {
         return this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.COCCRCRCRHROIRCCHOHRICCCIOCICI(var1, var2).asList();
      }

      @Override
      public Spliterator<Long> spliterator() {
         return this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.spliterator();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            return this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.equals(var6.IRHHIOIHIICROOCHRHHRHOCIRCOCCH);
         }

         if (!(var1 instanceof List)) {
            return false;
         }

         List var2 = (List)var1;
         if (this.size() != var2.size()) {
            return false;
         }

         int var3 = this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.ROIICIIICRCHOCICIIIHCCICRIORIC;

         for (Object var5 : var2) {
            if (!(var5 instanceof Long) || this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.IHCCOHIOHRCIHHOOORRROOCOORHHCO[var3++] != (Long)var5) {
               return false;
            }
         }

         return true;
      }

      @Override
      public int hashCode() {
         return this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.hashCode();
      }

      @Override
      public String toString() {
         return this.IRHHIOIHIICROOCHRHHRHOCIRCOCCH.toString();
      }
   }
}
