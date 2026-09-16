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
import java.util.Spliterator.OfInt;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import org.checkerframework.checker.nullness.qual.Nullable;

@Immutable
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class CORCOCICIRIOHROHROIIOOHICCHCRR implements Serializable {
   private static final CORCOCICIRIOHROHROIIOOHICCHCRR IHHCCCRCIORIIICHRORRHRIHRIIRRI = new CORCOCICIRIOHROHROIIOOHICCHCRR(new int[0]);
   private final int[] ICCOROOICHIIIROROHOHIRHOHOHCHI;
   private final transient int RRIOIICICOOIIRRIOIOHRORIIIRIHH;
   private final int COIICIHCICIROIHIIROHHIIRHCCRIC;

   public static CORCOCICIRIOHROHROIIOOHICCHCRR RHIIIIROHIOICCCCRCIIRHOOORHROC() {
      return IHHCCCRCIORIIICHRORRHRIHRIIRRI;
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR CHOOIORORCOOICCRRHRRHCOIICOOCC(int var0) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(new int[]{var0});
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR CCRHRROIOIIRROHCOOCCCRRIOIHHHO(int var0, int var1) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(new int[]{var0, var1});
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR IIOIROIHIHHCCRICRCOOCHIICHRCOI(int var0, int var1, int var2) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(new int[]{var0, var1, var2});
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR IOHIHIIHCCCCCIHRORIOIOORCIOHII(int var0, int var1, int var2, int var3) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(new int[]{var0, var1, var2, var3});
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var0, int var1, int var2, int var3, int var4) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(new int[]{var0, var1, var2, var3, var4});
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR CRRRICCRROCOHHOHIICIHORCOORRRH(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(new int[]{var0, var1, var2, var3, var4, var5});
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, int... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1.length <= 2147483646, "the total number of elements must fit in an int");
      int[] var2 = new int[var1.length + 1];
      var2[0] = var0;
      System.arraycopy(var1, 0, var2, 1, var1.length);
      return new CORCOCICIRIOHROHROIIOOHICCHCRR(var2);
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR IOHHOIIOCRHCHHCRORICCOHOHROOIH(int[] var0) {
      return var0.length == 0 ? IHHCCCRCIORIIICHRORRHRIHRIIRRI : new CORCOCICIRIOHROHROIIOOHICCHCRR(Arrays.copyOf(var0, var0.length));
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR OIHCOHRCICCCRHRCROOCIOIRRHHHIH(Collection<Integer> var0) {
      return var0.isEmpty() ? IHHCCCRCIORIIICHRORRHRIHRIIRRI : new CORCOCICIRIOHROHROIIOOHICCHCRR(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.toArray(var0));
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR ORCOCORROHIROCCIORORRRRCHIOOCH(Iterable<Integer> var0) {
      return var0 instanceof Collection
         ? OIHCOHRCICCCRHRCROOCIOIRRHHHIH((Collection<Integer>)var0)
         : RCCHHHIIOCOOORCORRRHHHHOCHIIIO().HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var0).COOOCOCIHCOIORHRHCCIOHHIIORHOI();
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR CRRRICCRROCOHHOHIICIHORCOORRRH(IntStream var0) {
      int[] var1 = var0.toArray();
      return var1.length == 0 ? IHHCCCRCIORIIICHRORRHRIHRIIRRI : new CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OORCRORHCICOCORRCHRHRHIICHOCCR(int var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0 >= 0, "Invalid initialCapacity: %s", var0);
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   public static CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCCHHHIIOCOOORCORRRHHHHOCHIIIO() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(10);
   }

   private CORCOCICIRIOHROHROIIOOHICCHCRR(int[] var1) {
      this(var1, 0, var1.length);
   }

   private CORCOCICIRIOHROHROIIOOHICCHCRR(int[] var1, int var2, int var3) {
      this.ICCOROOICHIIIROROHOHIRHOHOHCHI = var1;
      this.RRIOIICICOOIIRRIOIOHRORIIIRIHH = var2;
      this.COIICIHCICIROIHIIROHHIIRHCCRIC = var3;
   }

   public int length() {
      return this.COIICIHCICIROIHIIROHHIIRHCCRIC - this.RRIOIICICOOIIRRIOIOHRORIIIRIHH;
   }

   public boolean isEmpty() {
      return this.COIICIHCICIROIHIIROHHIIRHCCRIC == this.RRIOIICICOOIIRRIOIOHRORIIIRIHH;
   }

   public int get(int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.length());
      return this.ICCOROOICHIIIROROHOHIRHOHOHCHI[this.RRIOIICICOOIIRRIOIOHRORIIIRIHH + var1];
   }

   public int indexOf(int var1) {
      for (int var2 = this.RRIOIICICOOIIRRIOIOHRORIIIRIHH; var2 < this.COIICIHCICIROIHIIROHHIIRHCCRIC; var2++) {
         if (this.ICCOROOICHIIIROROHOHIRHOHOHCHI[var2] == var1) {
            return var2 - this.RRIOIICICOOIIRRIOIOHRORIIIRIHH;
         }
      }

      return -1;
   }

   public int lastIndexOf(int var1) {
      for (int var2 = this.COIICIHCICIROIHIIROHHIIRHCCRIC - 1; var2 >= this.RRIOIICICOOIIRRIOIOHRORIIIRIHH; var2--) {
         if (this.ICCOROOICHIIIROROHOHIRHOHOHCHI[var2] == var1) {
            return var2 - this.RRIOIICICOOIIRRIOIOHRORIIIRIHH;
         }
      }

      return -1;
   }

   public boolean contains(int var1) {
      return this.indexOf(var1) >= 0;
   }

   public void forEach(IntConsumer var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);

      for (int var2 = this.RRIOIICICOOIIRRIOIOHRORIIIRIHH; var2 < this.COIICIHCICIROIHIIROHHIIRHCCRIC; var2++) {
         var1.accept(this.ICCOROOICHIIIROROHOHIRHOHOHCHI[var2]);
      }
   }

   public IntStream stream() {
      return Arrays.stream(this.ICCOROOICHIIIROROHOHIRHOHOHCHI, this.RRIOIICICOOIIRRIOIOHRORIIIRIHH, this.COIICIHCICIROIHIIROHHIIRHCCRIC);
   }

   public int[] toArray() {
      return Arrays.copyOfRange(this.ICCOROOICHIIIROROHOHIRHOHOHCHI, this.RRIOIICICOOIIRRIOIOHRORIIIRIHH, this.COIICIHCICIROIHIIROHHIIRHCCRIC);
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR RCOHCCHCRHIIIICRIHCOICIHHCCOOC(int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, this.length());
      return var1 == var2
         ? IHHCCCRCIORIIICHRORRHRIHRIIRRI
         : new CORCOCICIRIOHROHROIIOOHICCHCRR(
            this.ICCOROOICHIIIROROHOHIRHOHOHCHI, this.RRIOIICICOOIIRRIOIOHRORIIIRIHH + var1, this.RRIOIICICOOIIRRIOIOHRORIIIRIHH + var2
         );
   }

   private OfInt spliterator() {
      return Spliterators.spliterator(this.ICCOROOICHIIIROROHOHIRHOHOHCHI, this.RRIOIICICOOIIRRIOIOHRORIIIRIHH, this.COIICIHCICIROIHIIROHHIIRHCCRIC, 1040);
   }

   public List<Integer> asList() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR)) {
         return false;
      }

      CORCOCICIRIOHROHROIIOOHICCHCRR var2 = (CORCOCICIRIOHROHROIIOOHICCHCRR)var1;
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

      for (int var2 = this.RRIOIICICOOIIRRIOIOHRORIIIRIHH; var2 < this.COIICIHCICIROIHIIROHHIIRHCCRIC; var2++) {
         var1 *= 31;
         var1 += HICHRCOHCCRHOHCICOOCHOIHCCHIRI.hashCode(this.ICCOROOICHIIIROROHOHIRHOHOHCHI[var2]);
      }

      return var1;
   }

   @Override
   public String toString() {
      if (this.isEmpty()) {
         return "[]";
      }

      StringBuilder var1 = new StringBuilder(this.length() * 5);
      var1.append('[').append(this.ICCOROOICHIIIROROHOHIRHOHOHCHI[this.RRIOIICICOOIIRRIOIOHRORIIIRIHH]);

      for (int var2 = this.RRIOIICICOOIIRRIOIOHRORIIIRIHH + 1; var2 < this.COIICIHCICIROIHIIROHHIIRHCCRIC; var2++) {
         var1.append(", ").append(this.ICCOROOICHIIIROROHOHIRHOHOHCHI[var2]);
      }

      var1.append(']');
      return var1.toString();
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR CROICRCOHIIIICOOHIOCOORIIICOIC() {
      return this.isPartialView() ? new CORCOCICIRIOHROHROIIOOHICCHCRR(this.toArray()) : this;
   }

   private boolean isPartialView() {
      return this.RRIOIICICOOIIRRIOIOHRORIIIRIHH > 0 || this.COIICIHCICIROIHIIROHHIIRHCCRIC < this.ICCOROOICHIIIROROHOHIRHOHOHCHI.length;
   }

   Object writeReplace() {
      return this.CROICRCOHIIIICOOHIOCOORIIICOIC();
   }

   Object readResolve() {
      return this.isEmpty() ? IHHCCCRCIORIIICHRORRHRIHRIIRRI : this;
   }

   @CanIgnoreReturnValue
   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private int[] array;
      private int count = 0;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1) {
         this.array = new int[var1];
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IHIIOHCOCOCCORIIOCHHCORIOOHICH(int var1) {
         this.ensureRoomFor(1);
         this.array[this.count] = var1;
         this.count++;
         return this;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(int[] var1) {
         this.ensureRoomFor(var1.length);
         System.arraycopy(var1, 0, this.array, this.count, var1.length);
         this.count += var1.length;
         return this;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOIHOROOIOOCOIHCRIRIRIRRICIIHC(Iterable<Integer> var1) {
         if (var1 instanceof Collection) {
            return this.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR((Collection<Integer>)var1);
         }

         for (Integer var3 : var1) {
            this.IHIIOHCOCOCCORIIOCHHCORIOOHICH(var3);
         }

         return this;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(Collection<Integer> var1) {
         this.ensureRoomFor(var1.size());

         for (Integer var3 : var1) {
            this.array[this.count++] = var3;
         }

         return this;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCRRCORICCHOHHIRCHIROOHIIOHCO(IntStream var1) {
         OfInt var2 = var1.spliterator();
         long var3 = var2.getExactSizeIfKnown();
         if (var3 > 0L) {
            this.ensureRoomFor(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(var3));
         }

         var2.forEachRemaining(this::IHIIOHCOCOCCORIIOCHHCORIOOHICH);
         return this;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRRICCRROCOHHOHIICIHORCOORRRH(CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
         this.ensureRoomFor(var1.length());
         System.arraycopy(var1.ICCOROOICHIIIROROHOHIRHOHOHCHI, var1.RRIOIICICOOIIRRIOIOHRORIIIRIHH, this.array, this.count, var1.length());
         this.count = this.count + var1.length();
         return this;
      }

      private void ensureRoomFor(int var1) {
         int var2 = this.count + var1;
         if (var2 > this.array.length) {
            int[] var3 = new int[expandedCapacity(this.array.length, var2)];
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
      public CORCOCICIRIOHROHROIIOOHICCHCRR COOOCOCIHCOIORHRHCCIOHHIIORHOI() {
         return this.count == 0 ? CORCOCICIRIOHROHROIIOOHICCHCRR.IHHCCCRCIORIIICHRORRHRIHRIIRRI : new CORCOCICIRIOHROHROIIOOHICCHCRR(this.array, 0, this.count);
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Integer> implements Serializable, RandomAccess {
      private final CORCOCICIRIOHROHROIIOOHICCHCRR HCOICRIRHIICRRIOOOIHIIIIRHHICI;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
         this.HCOICRIRHIICRRIOOOIHIIIIRHHICI = var1;
      }

      @Override
      public int size() {
         return this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.length();
      }

      public Integer get(int var1) {
         return this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.get(var1);
      }

      @Override
      public boolean contains(Object var1) {
         return this.indexOf(var1) >= 0;
      }

      @Override
      public int indexOf(Object var1) {
         return var1 instanceof Integer ? this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.indexOf((Integer)var1) : -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         return var1 instanceof Integer ? this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.lastIndexOf((Integer)var1) : -1;
      }

      @Override
      public List<Integer> subList(int var1, int var2) {
         return this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.RCOHCCHCRHIIIICRIHCOICIHHCCOOC(var1, var2).asList();
      }

      @Override
      public Spliterator<Integer> spliterator() {
         return this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.spliterator();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            return this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.equals(var6.HCOICRIRHIICRRIOOOIHIIIIRHHICI);
         }

         if (!(var1 instanceof List)) {
            return false;
         }

         List var2 = (List)var1;
         if (this.size() != var2.size()) {
            return false;
         }

         int var3 = this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.RRIOIICICOOIIRRIOIOHRORIIIRIHH;

         for (Object var5 : var2) {
            if (!(var5 instanceof Integer) || this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.ICCOROOICHIIIROROHOHIRHOHOHCHI[var3++] != (Integer)var5) {
               return false;
            }
         }

         return true;
      }

      @Override
      public int hashCode() {
         return this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.hashCode();
      }

      @Override
      public String toString() {
         return this.HCOICRIRHIICRRIOOOIHIIIIRHHICI.toString();
      }
   }
}
