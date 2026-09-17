package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collector;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
public abstract class CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<E> implements Set<E> {
   static final int ROIIOCROIOOHHIHHHRORHOHICHOHOI = 1297;
   @LazyInit
   @RetainedWith
   private transient @Nullable COIRRRCIORROCHIROCHROCHICCICIC<E> IOCIHRROOOCHOIICIRHCICRRRICHCH;
   static final int IOHOCRRRIHOCOICCHCCOOIOOOIIRCH = 1073741824;
   private static final double HORICCRHHCIIICCOOCHIRRROOIHRCO = 0.7;
   private static final int OROICIIOOHOOIOHHCRHCHOCCRIHOIH = 751619276;
   static final double IOCCOHOHHRRCHHRCIHHHRRHHHCOIRO = 0.001;
   static final int CIOIRCRCCRCHCRRCOCCIHCOIIRIHCR = 13;

   public static <E> Collector<E, ?, CICOIHIRIIHHCIOICHRHICRIRCIOHC<E>> toImmutableSet() {
      return IHCRORHRORIICHRHRCHRRIRRHHOCOO.toImmutableSet();
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> CRROCHIORCOCORIRRHOICICCIIORHI() {
      return (CICOIHIRIIHHCIOICHRHICRIRCIOHC<E>)HROHCRIOCIHCORHOHIOCIHOHHCIIRH.COIHHIIIOIROIRHIHCCRHIHIIRRIHI;
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> RROIIRROOOOHIORHRICHOCHIHCRRCH(E var0) {
      return new OCCCCRRCROIRIHRROHCHCHORCOCICC<>((E)var0);
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> IHCRORHRORIICHRHRCHRRIRRHHOCOO(E var0, E var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(2, 2, var0, var1);
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> CRRRICCRROCOHHOHIICIHORCOORRRH(E var0, E var1, E var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(3, 3, var0, var1, var2);
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(E var0, E var1, E var2, E var3) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(4, 4, var0, var1, var2, var3);
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(E var0, E var1, E var2, E var3, E var4) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(5, 5, var0, var1, var2, var3, var4);
   }

   @SafeVarargs
   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(E var0, E var1, E var2, E var3, E var4, E var5, E... var6) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var6.length <= 2147483641, "the total number of elements must fit in an int"
      );
      byte var7 = 6;
      Object[] var8 = new Object[6 + var6.length];
      var8[0] = var0;
      var8[1] = var1;
      var8[2] = var2;
      var8[3] = var3;
      var8[4] = var4;
      var8[5] = var5;
      System.arraycopy(var6, 0, var8, 6, var6.length);
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8.length, var8.length, var8);
   }

   private static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, Object... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0,
         Math.max(
            4,
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.sqrt(
               var0, RoundingMode.CEILING
            )
         ),
         var1
      );
   }

   private static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, int var1, Object... var2) {
      switch (var0) {
         case 0:
            return CRROCHIORCOCORIRRHOICICCIIORHI();
         case 1:
            Object var3 = var2[0];
            return RROIIRROOOOHIORHRICHOCHIHCRRCH((E)var3);
         default:
            CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 = new CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);

            for (int var5 = 0; var5 < var0; var5++) {
               Object var6 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var2[var5]
               );
               var4 = var4.HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(var6);
            }

            return var4.HCIIHIIIRRIRCRIORRHOCHHOCOOOCH().HCCCCRHROOROHRHCCIOIOIROIOOCIH();
      }
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> IOIICIRIICICIIOORHCIIIIRRIHRHI(Collection<? extends E> var0) {
      if (var0 instanceof CICOIHIRIIHHCIOICHRHICRIRCIOHC && !(var0 instanceof SortedSet)) {
         CICOIHIRIIHHCIOICHRHICRIRCIOHC var1 = (CICOIHIRIIHHCIOICHRHICRIRCIOHC)var0;
         if (!var1.isPartialView()) {
            return var1;
         }
      } else if (var0 instanceof EnumSet) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH((EnumSet)var0);
      }

      Object[] var2 = var0.toArray();
      return var0 instanceof Set ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.length, var2.length, var2) : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.length, var2);
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> IOHIHIIHCCCCCIHRORIOIOORCIOHII(Iterable<? extends E> var0) {
      return var0 instanceof Collection ? IOIICIRIICICIIOORHCIIIIRRIHRHI((Collection<? extends E>)var0) : OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0.iterator());
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Iterator<? extends E> var0) {
      if (!var0.hasNext()) {
         return CRROCHIORCOCORIRRHOICICCIIORHI();
      }

      Object var1 = var0.next();
      return !var0.hasNext()
         ? RROIIRROOOOHIORHRICHOCHIHCRRCH((E)var1)
         : new CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>()
            .HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH((E)var1)
            .CORCOCICIRIOHROHROIIOOHICCHCRR(var0)
            .HCCCCRHROOROHRHCCIOIOIROIOOCIH();
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> ORHIOICIOCRRHOOCOHRORIHICHRCRR(E[] var0) {
      switch (var0.length) {
         case 0:
            return CRROCHIORCOCORIRRHOICICCIIORHI();
         case 1:
            return RROIIRROOOOHIORHRICHOCHIHCRRCH((E)var0[0]);
         default:
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.length, (Object[])var0.clone());
      }
   }

   private static CICOIHIRIIHHCIOICHRHICRIRCIOHC IRCIIHHICIHRCOCRROCOICRIHHCCHH(EnumSet var0) {
      return CIIHHCHIRCRRIHOIOCCCROHOIOCCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumSet.copyOf(var0));
   }

   CICOIHIRIIHHCIOICHRHICRIRCIOHC() {
   }

   boolean isHashCodeFast() {
      return false;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return var1 instanceof CICOIHIRIIHHCIOICHRHICRIRCIOHC
               && this.isHashCodeFast()
               && ((CICOIHIRIIHHCIOICHRHICRIRCIOHC)var1).isHashCodeFast()
               && this.hashCode() != var1.hashCode()
            ? false
            : ICRHCCCCOIICOCHHCRCOOIHICROIHI.equalsImpl(this, var1);
      }
   }

   @Override
   public int hashCode() {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this);
   }

   @Override
   public abstract IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

   @Override
   public COIRRRCIORROCHIROCHROCHICCICIC<E> OHOOIHCOHHORHICHIOROIRIHCOOCRR() {
      COIRRRCIORROCHIROCHROCHICCICIC var1 = this.IOCIHRROOOCHOIICIRHCICRRRICHCH;
      return var1 == null ? (this.IOCIHRROOOCHOIICIRHCICRRRICHCH = this.RHRRCOIHRICOCRRIHRRRCHRHOCICCC()) : var1;
   }

   COIRRRCIORROCHIROCHROCHICCICIC<E> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
      return new RRCIRIHRCIOOICCCHOIHOCIRCHHIII<>(this, this.toArray());
   }

   @Override
   Object writeReplace() {
      return new CICOIHIRIIHHCIOICHRHICRIRCIOHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.toArray());
   }

   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> CIRICCRCCRRCHHIOOHROCHRHRHHIIR() {
      return new CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> IHRIHICCOHRCCCRHIHRIROORCCHIRH(int var0) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var0, "expectedSize");
      return new CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   static Object[] rebuildHashTable(int var0, Object[] var1, int var2) {
      Object[] var3 = new Object[var0];
      int var4 = var3.length - 1;

      for (int var5 = 0; var5 < var2; var5++) {
         Object var6 = var1[var5];
         int var7 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smear(var6.hashCode());
         int var8 = var7;

         while (true) {
            int var9 = var8 & var4;
            if (var3[var9] == null) {
               var3[var9] = var6;
               break;
            }

            var8++;
         }
      }

      return var3;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static int chooseTableSize(int var0) {
      var0 = Math.max(var0, 2);
      if (var0 >= 751619276) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var0 < 1073741824, "collection too large"
         );
         return 1073741824;
      }

      int var1 = Integer.highestOneBit(var0 - 1) << 1;

      while (var1 * 0.7 < var0) {
         var1 <<= 1;
      }

      return var1;
   }

   static boolean hashFloodingDetected(Object[] var0) {
      int var1 = maxRunBeforeFallback(var0.length);
      int var2 = 0;

      while (var2 < var0.length && var0[var2] != null) {
         if (++var2 > var1) {
            return true;
         }
      }

      int var3;
      for (var3 = var0.length - 1; var3 > var2 && var0[var3] != null; var3--) {
         if (var2 + (var0.length - 1 - var3) > var1) {
            return true;
         }
      }

      int var4 = var1 / 2;

      label40:
      for (int var5 = var2 + 1; var5 + var4 <= var3; var5 += var4) {
         for (int var6 = 0; var6 < var4; var6++) {
            if (var0[var5 + var6] == null) {
               continue label40;
            }
         }

         return true;
      }

      return false;
   }

   private static int maxRunBeforeFallback(int var0) {
      return 13
         * com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.log2(
            var0, RoundingMode.UNNECESSARY
         );
   }

   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH<E> extends CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> {
      private Object[] hashTable;
      private int maxRunBeforeFallback;
      private int expandTableThreshold;
      private int hashCode;

      CRRRICCRROCOHHOHIICIHORCOORRRH(int var1) {
         super(var1);
         int var2 = CICOIHIRIIHHCIOICHRHICRIRCIOHC.chooseTableSize(var1);
         this.hashTable = new Object[var2];
         this.maxRunBeforeFallback = CICOIHIRIIHHCIOICHRHICRIRCIOHC.maxRunBeforeFallback(var2);
         this.expandTableThreshold = (int)(0.7 * var2);
      }

      CRRRICCRROCOHHOHIICIHORCOORRRH(CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRRRICCRROCOHHOHIICIHORCOORRRH<E> var1) {
         super(var1);
         this.hashTable = Arrays.copyOf(var1.hashTable, var1.hashTable.length);
         this.maxRunBeforeFallback = var1.maxRunBeforeFallback;
         this.expandTableThreshold = var1.expandTableThreshold;
         this.hashCode = var1.hashCode;
      }

      void ensureTableCapacity(int var1) {
         if (var1 > this.expandTableThreshold && this.hashTable.length < 1073741824) {
            int var2 = this.hashTable.length * 2;
            this.hashTable = CICOIHIRIIHHCIOICHRHICRIRCIOHC.rebuildHashTable(var2, this.dedupedElements, this.distinct);
            this.maxRunBeforeFallback = CICOIHIRIIHHCIOICHRHICRIRCIOHC.maxRunBeforeFallback(var2);
            this.expandTableThreshold = (int)(0.7 * var2);
         }
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(E var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         int var2 = var1.hashCode();
         int var3 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smear(var2);
         int var4 = this.hashTable.length - 1;

         for (int var5 = var3; var5 - var3 < this.maxRunBeforeFallback; var5++) {
            int var6 = var5 & var4;
            Object var7 = this.hashTable[var6];
            if (var7 == null) {
               this.IOOCHIRHCRICHIHORCRCHCRHCICROH((E)var1);
               this.hashTable[var6] = var1;
               this.hashCode += var2;
               this.ensureTableCapacity(this.distinct);
               return this;
            }

            if (var7.equals(var1)) {
               return this;
            }
         }

         return new CICOIHIRIIHHCIOICHRHICRIRCIOHC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(this).HHOIOCRIRIOCOIHHOOHICIOIIOHCOR((E)var1);
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> OICCRCOHROOHCRROOCHHORRIOCRRRR() {
         return new CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRRRICCRROCOHHOHIICIHORCOORRRH<>(this);
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> HCIIHIIIRRIRCRIORRHOCHHOCOOOCH() {
         int var1 = CICOIHIRIIHHCIOICHRHICRIRCIOHC.chooseTableSize(this.distinct);
         if (var1 * 2 < this.hashTable.length) {
            this.hashTable = CICOIHIRIIHHCIOICHRHICRIRCIOHC.rebuildHashTable(var1, this.dedupedElements, this.distinct);
            this.maxRunBeforeFallback = CICOIHIRIIHHCIOICHRHICRIRCIOHC.maxRunBeforeFallback(var1);
            this.expandTableThreshold = (int)(0.7 * var1);
         }

         return CICOIHIRIIHHCIOICHRHICRIRCIOHC.hashFloodingDetected(this.hashTable)
            ? new CICOIHIRIIHHCIOICHRHICRIRCIOHC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(this)
            : this;
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> HCCCCRHROOROHRHCCIOIOIROIOOCIH() {
         switch (this.distinct) {
            case 0:
               return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
            case 1:
               return CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH(this.dedupedElements[0]);
            default:
               Object[] var1 = this.distinct == this.dedupedElements.length ? this.dedupedElements : Arrays.copyOf(this.dedupedElements, this.distinct);
               return new HROHCRIOCIHCORHOHIOCIHOHHCIIRH<>(var1, this.hashCode, this.hashTable, this.hashTable.length - 1);
         }
      }
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> extends CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> {
      private final Set<Object> OCROCIHOICRIOCICRICIOIOORHCRCH = ICRHCCCCOIICOCHHCRCOOIHICROIHI.newHashSetWithExpectedSize(this.distinct);

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> var1) {
         super(var1);

         for (int var2 = 0; var2 < this.distinct; var2++) {
            this.OCROCIHOICRIOCICRICIOIOORHCRCH.add(this.dedupedElements[var2]);
         }
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(E var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (this.OCROCIHOICRIOCICRICIOIOORHCRCH.add(var1)) {
            this.IOOCHIRHCRICHIHORCRCHCRHCICROH((E)var1);
         }

         return this;
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> OICCRCOHROOHCRROOCHHORRIOCRRRR() {
         return new CICOIHIRIIHHCIOICHRHICRIRCIOHC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(this);
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> HCCCCRHROOROHRHCCIOIOIROIOOCIH() {
         switch (this.distinct) {
            case 0:
               return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
            case 1:
               return CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH(this.dedupedElements[0]);
            default:
               return new CIROHHHIOIHIROHCHICORCCCRROHCC<>(
                  this.OCROCIHOICRIOCICRICIOIOORHCRCH, COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.dedupedElements, this.distinct)
               );
         }
      }
   }

   abstract static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> extends CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> {
      abstract E get(int var1);

      @Override
      public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
         return this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
      }

      @Override
      public Spliterator<E> spliterator() {
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(this.size(), 1297, this::get);
      }

      @Override
      public void forEach(Consumer<? super E> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         int var2 = this.size();

         for (int var3 = 0; var3 < var2; var3++) {
            var1.accept(this.get(var3));
         }
      }

      @Override
      int copyIntoArray(Object[] var1, int var2) {
         return this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().copyIntoArray(var1, var2);
      }

      @Override
      COIRRRCIORROCHIROCHROCHICCICIC<E> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
         return new ICCIIIRHHOOIHCCHIRRCRHICHIHRIH<E>() {
            @Override
            public E get(int var1) {
               return (E)IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.get(var1);
            }

            CICOIHIRIIHHCIOICHRHICRIRCIOHC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> OROHOCOHIIHOIICIOIIHORHRCHIRHC() {
               return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this;
            }
         };
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> {
      private CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> OCCHIIHIOOCRIHHORCCHIORCOCOHRR;
      boolean forceCopy;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         this(4);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR = new CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRRRICCRROCOHHOHIICIHORCOORRRH<>(var1);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1) {
         this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR = null;
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
      void forceJdk() {
         this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR = new CICOIHIRIIHHCIOICHRHICRIRCIOHC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR);
      }

      final void RHOOOCCHIRCORRHORHRCROCROICROI() {
         if (this.forceCopy) {
            this.copy();
            this.forceCopy = false;
         }
      }

      void copy() {
         this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR = this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR.OICCRCOHROOHCRROOCHHORRIOCRRRR();
      }

      @CanIgnoreReturnValue
      public CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH(E var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.RHOOOCCHIRCORRHORHRCROCROICROI();
         this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR = this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR.HHOIOCRIRIOCOIHHOOHICIOIIOHCOR((E)var1);
         return this;
      }

      @CanIgnoreReturnValue
      public CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(E... var1) {
         super.RHOCHHIRRCHHHOHOIRROIROHHHIHIO((E[])var1);
         return this;
      }

      @CanIgnoreReturnValue
      public CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RCIROOOOICRHCCRRCIORHHIRCOIIIC(Iterable<? extends E> var1) {
         super.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var1);
         return this;
      }

      @CanIgnoreReturnValue
      public CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> CORCOCICIRIOHROHROIIOOHICCHCRR(Iterator<? extends E> var1) {
         super.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         return this;
      }

      CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         CICOIHIRIIHHCIOICHRHICRIRCIOHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> var1
      ) {
         this.RHOOOCCHIRCORRHORHRCROCROICROI();
         this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR = this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.OCCHIIHIOOCRIHHORCCHIORCOCOHRR);
         return this;
      }

      public CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> HCCCCRHROOROHRHCCIOIOIROIOOCIH() {
         this.forceCopy = true;
         this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR = this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR.HCIIHIIIRRIRCRIORRHOCHHOCOOOCH();
         return this.OCCHIIHIOOCRIHHORCCHIORCOCOHRR.HCCCCRHROOROHRHCCIOIOIROIOOCIH();
      }
   }

   private abstract static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> {
      E[] dedupedElements;
      int distinct;

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1) {
         this.dedupedElements = (E[])(new Object[var1]);
         this.distinct = 0;
      }

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> var1) {
         this.dedupedElements = Arrays.copyOf(var1.dedupedElements, var1.dedupedElements.length);
         this.distinct = var1.distinct;
      }

      private void ensureCapacity(int var1) {
         if (var1 > this.dedupedElements.length) {
            int var2 = OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.expandedCapacity(this.dedupedElements.length, var1);
            this.dedupedElements = Arrays.copyOf(this.dedupedElements, var2);
         }
      }

      final void IOOCHIRHCRICHIHORCRCHCRHCICROH(E var1) {
         this.ensureCapacity(this.distinct + 1);
         this.dedupedElements[this.distinct++] = (E)var1;
      }

      abstract CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(E var1);

      final CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> var1
      ) {
         CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = this;

         for (int var3 = 0; var3 < var1.distinct; var3++) {
            var2 = var2.HHOIOCRIRIOCOIHHOOHICIOIIOHCOR(var1.dedupedElements[var3]);
         }

         return var2;
      }

      abstract CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> OICCRCOHROOHCRROOCHHORRIOCRRRR();

      CICOIHIRIIHHCIOICHRHICRIRCIOHC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<E> HCIIHIIIRRIRCRIORRHOCHHOCOOOCH() {
         return this;
      }

      abstract CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> HCCCCRHROOROHRHCCIOIOIROIOOCIH();
   }

   private static class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements Serializable {
      final Object[] CRIRHRIRCRCRCIOOIIOHCHIRICRRIH;
      private static final long CIOCHIHIROORHHOIROROOHOIIORCRC = 0L;

      RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object[] var1) {
         this.CRIRHRIRCRCRCIOOIIOHCHIRICRRIH = var1;
      }

      Object readResolve() {
         return CICOIHIRIIHHCIOICHRHICRIRCIOHC.ORHIOICIOCRRHOOCOHRORIHICHRCRR(this.CRIRHRIRCRCRCIOOIIOHCHIRICRRIH);
      }
   }
}
