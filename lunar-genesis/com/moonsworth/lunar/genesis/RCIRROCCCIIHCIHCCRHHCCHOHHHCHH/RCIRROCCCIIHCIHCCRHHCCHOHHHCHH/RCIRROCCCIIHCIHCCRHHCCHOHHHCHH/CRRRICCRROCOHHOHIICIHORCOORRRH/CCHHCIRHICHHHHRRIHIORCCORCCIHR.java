package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class CCHHCIRHICHHHHRRIHIORCCORCCIHR<C extends Comparable> {
   final boolean IIHRIRRROIRICCCRCOCHIOOOIRHRCI;

   public static CCHHCIRHICHHHHRRIHIORCCORCCIHR<Integer> IICCCRORHOOOICHOCHCOIRCIORCIII() {
      return CCHHCIRHICHHHHRRIHIORCCORCCIHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIOCRHRHIHRCCRRCRHOOHCIHOCCROI;
   }

   public static CCHHCIRHICHHHHRRIHIORCCORCCIHR<Long> RCRCOROHIRIHCHRRCRCHHOCCOHCHRH() {
      return CCHHCIRHICHHHHRRIHIORCCORCCIHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCIIRIHHCCROOIOIRCICOOICCCCRCO;
   }

   public static CCHHCIRHICHHHHRRIHIORCCORCCIHR<BigInteger> CCORRHOROCIICIRIROCROCCOICCOHO() {
      return CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ICICOHICCCOCHIICOROHICRHHOCCRH;
   }

   protected CCHHCIRHICHHHHRRIHIORCCORCCIHR() {
      this(false);
   }

   private CCHHCIRHICHHHHRRIHIORCCORCCIHR(boolean var1) {
      this.IIHRIRRROIRICCCRCOCHIOOOIRHRCI = var1;
   }

   C offset(C var1, long var2) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "distance");

      for (long var4 = 0L; var4 < var2; var4++) {
         var1 = this.next((C)var1);
      }

      return (C)var1;
   }

   public abstract C next(C var1);

   public abstract C previous(C var1);

   public abstract long distance(C var1, C var2);

   @CanIgnoreReturnValue
   public C minValue() {
      throw new NoSuchElementException();
   }

   @CanIgnoreReturnValue
   public C maxValue() {
      throw new NoSuchElementException();
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends CCHHCIRHICHHHHRRIHIORCCORCCIHR<Long> implements Serializable {
      private static final CCHHCIRHICHHHHRRIHIORCCORCCIHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH OCIIRIHHCCROOIOIRCICOOICCCCRCO = new CCHHCIRHICHHHHRRIHIORCCORCCIHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      private static final long ORRRORCIOOCIHCOOOHHCCICOCRRCHC = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(true);
      }

      public Long next(Long var1) {
         long var2 = var1;
         return var2 == Long.MAX_VALUE ? null : var2 + 1L;
      }

      public Long previous(Long var1) {
         long var2 = var1;
         return var2 == Long.MIN_VALUE ? null : var2 - 1L;
      }

      Long offset(Long var1, long var2) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "distance");
         long var4 = var1 + var2;
         if (var4 < 0L) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
               var1 < 0L, "overflow"
            );
         }

         return var4;
      }

      public long distance(Long var1, Long var2) {
         long var3 = var2 - var1;
         if (var2 > var1 && var3 < 0L) {
            return Long.MAX_VALUE;
         } else {
            return var2 < var1 && var3 > 0L ? Long.MIN_VALUE : var3;
         }
      }

      public Long minValue() {
         return Long.MIN_VALUE;
      }

      public Long maxValue() {
         return Long.MAX_VALUE;
      }

      private Object readResolve() {
         return OCIIRIHHCCROOIOIRCICOOICCCCRCO;
      }

      @Override
      public String toString() {
         return "DiscreteDomain.longs()";
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CCHHCIRHICHHHHRRIHIORCCORCCIHR<Integer> implements Serializable {
      private static final CCHHCIRHICHHHHRRIHIORCCORCCIHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IIOCRHRHIHRCCRRCRHOOHCIHOCCROI = new CCHHCIRHICHHHHRRIHIORCCORCCIHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      private static final long CRRCHOHROOCHHOICCCIOCCOIRCCCOI = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         super(true);
      }

      public Integer next(Integer var1) {
         int var2 = var1;
         return var2 == Integer.MAX_VALUE ? null : var2 + 1;
      }

      public Integer previous(Integer var1) {
         int var2 = var1;
         return var2 == Integer.MIN_VALUE ? null : var2 - 1;
      }

      Integer offset(Integer var1, long var2) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "distance");
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.checkedCast(
            var1.longValue() + var2
         );
      }

      public long distance(Integer var1, Integer var2) {
         return (long)var2.intValue() - var1.intValue();
      }

      public Integer minValue() {
         return Integer.MIN_VALUE;
      }

      public Integer maxValue() {
         return Integer.MAX_VALUE;
      }

      private Object readResolve() {
         return IIOCRHRHIHRCCRRCRHOOHCIHOCCROI;
      }

      @Override
      public String toString() {
         return "DiscreteDomain.integers()";
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CCHHCIRHICHHHHRRIHIORCCORCCIHR<BigInteger> implements Serializable {
      private static final CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICICOHICCCOCHIICOROHICRHHOCCRH = new CCHHCIRHICHHHHRRIHIORCCORCCIHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      private static final BigInteger OROHCIOICIOICCORIHHRCOHHICRHCI = BigInteger.valueOf(Long.MIN_VALUE);
      private static final BigInteger CIOORIHOORIICOCHRHCCOCIHHCOHII = BigInteger.valueOf(Long.MAX_VALUE);
      private static final long OOROIOCOICHRCCHOROCICCRIIOOOHH = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(true);
      }

      public BigInteger next(BigInteger var1) {
         return var1.add(BigInteger.ONE);
      }

      public BigInteger previous(BigInteger var1) {
         return var1.subtract(BigInteger.ONE);
      }

      BigInteger offset(BigInteger var1, long var2) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "distance");
         return var1.add(BigInteger.valueOf(var2));
      }

      public long distance(BigInteger var1, BigInteger var2) {
         return var2.subtract(var1).max(OROHCIOICIOICCORIHHRCOHHICRHCI).min(CIOORIHOORIICOCHRHCCOCIHHCOHII).longValue();
      }

      private Object readResolve() {
         return ICICOHICCCOCHIICOROHICRHHOCCRH;
      }

      @Override
      public String toString() {
         return "DiscreteDomain.bigIntegers()";
      }
   }
}
