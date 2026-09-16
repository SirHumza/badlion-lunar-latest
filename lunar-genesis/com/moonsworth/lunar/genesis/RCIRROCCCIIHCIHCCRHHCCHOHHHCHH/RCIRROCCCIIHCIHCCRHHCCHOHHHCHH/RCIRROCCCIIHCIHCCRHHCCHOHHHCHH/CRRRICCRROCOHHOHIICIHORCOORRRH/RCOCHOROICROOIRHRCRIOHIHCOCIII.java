package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.ObjIntConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class RCOCHOROICROOIRHRCRIOHIHCOCIII<E> extends IHHCHHHCRIHOOCOIOOCRIIICIOROIR<E> implements Serializable {
   private final transient RCOCHOROICROOIRHRCRIOHIHCOCIII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>> COCIOOIOCHROIIOIOHOCIHHOCORORO;
   private final transient IOHOOIOHCHICOCHIICHCICCOHRCIII<E> IIOROIHCCROHHHRCORRCOROIHOIHII;
   private final transient RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> OIHIRRRRRRRCRCRHRHCHHRICRORCRC;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final long IHRHCHHIRHCIHRHCROCCRCHOIHHHIR = 1L;

   public static <E extends Comparable> RCOCHOROICROOIRHRCRIOHIHCOCIII<E> CIHOOHRCRRCORIIIIOORRIORCHORHI() {
      return new RCOCHOROICROOIRHRCRIOHIHCOCIII<>(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC());
   }

   public static <E> RCOCHOROICROOIRHRCRIOHIHCOCIII<E> OIHCOHRCICCCRHRCROOCIOIRRHHHIH(@Nullable Comparator<? super E> var0) {
      return var0 == null
         ? new RCOCHOROICROOIRHRCRIOHIHCOCIII<>(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC())
         : new RCOCHOROICROOIRHRCRIOHIHCOCIII<>(var0);
   }

   public static <E extends Comparable> RCOCHOROICROOIRHRCRIOHIHCOCIII<E> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(Iterable<? extends E> var0) {
      RCOCHOROICROOIRHRCRIOHIHCOCIII var1 = CIHOOHRCRRCORIIIIOORRIORCHORHI();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   RCOCHOROICROOIRHRCRIOHIHCOCIII(
      RCOCHOROICROOIRHRCRIOHIHCOCIII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>> var1,
      IOHOOIOHCHICOCHIICHCICCOHRCIII<E> var2,
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> var3
   ) {
      super(var2.comparator());
      this.COCIOOIOCHROIIOIOHOCIHHOCORORO = var1;
      this.IIOROIHCCROHHHRCORRCOROIHOIHII = var2;
      this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC = var3;
   }

   RCOCHOROICROOIRHRCRIOHIHCOCIII(Comparator<? super E> var1) {
      super(var1);
      this.IIOROIHCCROHHHRCORRCOROIHOIHII = IOHOOIOHCHICOCHIICHCICCOHRCIII.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC = new RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(null, 1);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC, this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC);
      this.COCIOOIOCHROIIOIOHOCIHHOCORORO = new RCOCHOROICROOIRHRCRIOHIHCOCIII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>();
   }

   private long RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
      long var3 = var1.treeAggregate(var2);
      if (this.IIOROIHCCROHHHRCORRCOROIHOIHII.hasLowerBound()) {
         var3 -= this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      }

      if (this.IIOROIHCCROHHHRCORRCOROIHOIHII.hasUpperBound()) {
         var3 -= this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
      }

      return var3;
   }

   private long RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> var2
   ) {
      if (var2 == null) {
         return 0L;
      }

      int var3 = this.comparator().compare(this.IIOROIHCCROHHHRCORRCOROIHOIHII.getLowerEndpoint(), var2.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
      if (var3 < 0) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2.OICORICRCCIIIIRCCHOOHOHIIICIRC);
      }

      if (var3 == 0) {
         switch (this.IIOROIHCCROHHHRCORRCOROIHOIHII.IHICRICHIOOOCOROOCIIICRORIROIH()) {
            case OPEN:
               return var1.nodeAggregate(var2) + var1.treeAggregate(var2.OICORICRCCIIIIRCCHOOHOHIIICIRC);
            case CLOSED:
               return var1.treeAggregate(var2.OICORICRCCIIIIRCCHOOHOHIIICIRC);
            default:
               throw new AssertionError();
         }
      } else {
         return var1.treeAggregate(var2.OICORICRCCIIIIRCCHOOHOHIIICIRC)
            + var1.nodeAggregate(var2)
            + this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2.HRHCIRORHRRIOCCHORROOOOICCRRHH);
      }
   }

   private long IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> var2
   ) {
      if (var2 == null) {
         return 0L;
      }

      int var3 = this.comparator().compare(this.IIOROIHCCROHHHRCORRCOROIHOIHII.getUpperEndpoint(), var2.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
      if (var3 > 0) {
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2.HRHCIRORHRRIOCCHORROOOOICCRRHH);
      }

      if (var3 == 0) {
         switch (this.IIOROIHCCROHHHRCORRCOROIHOIHII.RROCOICICHHICCHRIROCIIRIRCORCH()) {
            case OPEN:
               return var1.nodeAggregate(var2) + var1.treeAggregate(var2.HRHCIRORHRRIOCCHORROOOOICCRRHH);
            case CLOSED:
               return var1.treeAggregate(var2.HRHCIRORHRRIOCCHORROOOOICCRRHH);
            default:
               throw new AssertionError();
         }
      } else {
         return var1.treeAggregate(var2.HRHCIRORHRRIOCCHORROOOOICCRRHH)
            + var1.nodeAggregate(var2)
            + this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2.OICORICRCCIIIIRCCHOOHOHIIICIRC);
      }
   }

   @Override
   public int size() {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SIZE)
      );
   }

   @Override
   int distinctElements() {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DISTINCT)
      );
   }

   static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var0) {
      return var0 == null ? 0 : var0.distinctElements;
   }

   @Override
   public int count(@Nullable Object var1) {
      try {
         Object var2 = var1;
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
         return this.IIOROIHCCROHHHRCORRCOROIHOIHII.contains((E)var2) && var3 != null ? var3.count(this.comparator(), var2) : 0;
      } catch (ClassCastException | NullPointerException var4) {
         return 0;
      }
   }

   @CanIgnoreReturnValue
   @Override
   public int add(@Nullable E var1, int var2) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "occurrences");
      if (var2 == 0) {
         return this.count(var1);
      } else {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.IIOROIHCCROHHHRCORRCOROIHOIHII.contains((E)var1)
         );
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
         if (var3 == null) {
            this.comparator().compare(var1, var1);
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = new RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var1, var2);
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC, var6, this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC);
            this.COCIOOIOCHROIIOIOHOCIHHOCORORO.checkAndSet(var3, var6);
            return 0;
         } else {
            int[] var4 = new int[1];
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.comparator(), var1, var2, var4);
            this.COCIOOIOCHROIIOIOHOCIHHOCORORO.checkAndSet(var3, var5);
            return var4[0];
         }
      }
   }

   @CanIgnoreReturnValue
   @Override
   public int remove(@Nullable Object var1, int var2) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "occurrences");
      if (var2 == 0) {
         return this.count(var1);
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
      int[] var4 = new int[1];

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5;
      try {
         Object var6 = var1;
         if (!this.IIOROIHCCROHHHRCORRCOROIHOIHII.contains((E)var6) || var3 == null) {
            return 0;
         }

         var5 = var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.comparator(), var6, var2, var4);
      } catch (ClassCastException | NullPointerException var7) {
         return 0;
      }

      this.COCIOOIOCHROIIOIOHOCIHHOCORORO.checkAndSet(var3, var5);
      return var4[0];
   }

   @CanIgnoreReturnValue
   @Override
   public int setCount(@Nullable E var1, int var2) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "count");
      if (!this.IIOROIHCCROHHHRCORRCOROIHOIHII.contains((E)var1)) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var2 == 0
         );
         return 0;
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
      if (var3 == null) {
         if (var2 > 0) {
            this.add((E)var1, var2);
         }

         return 0;
      } else {
         int[] var4 = new int[1];
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.comparator(), var1, var2, var4);
         this.COCIOOIOCHROIIOIOHOCIHHOCORORO.checkAndSet(var3, var5);
         return var4[0];
      }
   }

   @CanIgnoreReturnValue
   @Override
   public boolean setCount(@Nullable E var1, int var2, int var3) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var3, "newCount");
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "oldCount");
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         this.IIOROIHCCROHHHRCORRCOROIHOIHII.contains((E)var1)
      );
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
      if (var4 == null) {
         if (var2 == 0) {
            if (var3 > 0) {
               this.add((E)var1, var3);
            }

            return true;
         } else {
            return false;
         }
      } else {
         int[] var5 = new int[1];
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.comparator(), var1, var2, var3, var5);
         this.COCIOOIOCHROIIOIOHOCIHHOCORORO.checkAndSet(var4, var6);
         return var5[0] == var2;
      }
   }

   @Override
   public void clear() {
      if (!this.IIOROIHCCROHHHRCORRCOROIHOIHII.hasLowerBound() && !this.IIOROIHCCROHHHRCORRCOROIHOIHII.hasUpperBound()) {
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC.RHCIIROOOHHCIOOHIIRRCROIICOOHH;

         while (var1 != this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var1.RHCIIROOOHHCIOOHIIRRCROIICOOHH;
            var1.elemCount = 0;
            var1.OICORICRCCIIIIRCCHOOHOHIIICIRC = null;
            var1.HRHCIRORHRRIOCCHORROOOOICCRRHH = null;
            var1.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH = null;
            var1.RHCIIROOOHHCIOOHIIRRCROIICOOHH = null;
            var1 = var2;
         }

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC, this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC);
         this.COCIOOIOCHROIIOIOHOCIHHOCORORO.clear();
      } else {
         HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(this.entryIterator());
      }
   }

   private CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      final RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> var1
   ) {
      return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>() {
         @Override
         public E getElement() {
            return (E)var1.getElement();
         }

         @Override
         public int getCount() {
            int var1x = var1.getCount();
            return var1x == 0 ? RCOCHOROICROOIRHRCRIOHIHCOCIII.this.count(this.getElement()) : var1x;
         }
      };
   }

   private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RRCHOOOCIHIRHCCIROIIHHHICRCHIR() {
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
      if (var1 == null) {
         return null;
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2;
      if (this.IIOROIHCCROHHHRCORRCOROIHOIHII.hasLowerBound()) {
         Object var3 = this.IIOROIHCCROHHHRCORRCOROIHOIHII.getLowerEndpoint();
         var2 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.comparator(), (E)var3);
         if (var2 == null) {
            return null;
         }

         if (this.IIOROIHCCROHHHRCORRCOROIHOIHII.IHICRICHIOOOCOROOCIIICRORIROIH() == IOIICIRIICICIIOORHCIIIIRRIHRHI.OPEN
            && this.comparator().compare(var3, var2.getElement()) == 0) {
            var2 = var2.RHCIIROOOHHCIOOHIIRRCROIICOOHH;
         }
      } else {
         var2 = this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC.RHCIIROOOHHCIOOHIIRRCROIICOOHH;
      }

      return var2 != this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC && this.IIOROIHCCROHHHRCORRCOROIHOIHII.contains((E)var2.getElement()) ? var2 : null;
   }

   private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> HICROOCIRHCORIHHROCCHHOIOOROCI() {
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get();
      if (var1 == null) {
         return null;
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2;
      if (this.IIOROIHCCROHHHRCORRCOROIHOIHII.hasUpperBound()) {
         Object var3 = this.IIOROIHCCROHHHRCORRCOROIHOIHII.getUpperEndpoint();
         var2 = this.COCIOOIOCHROIIOIOHOCIHHOCORORO.get().IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.comparator(), (E)var3);
         if (var2 == null) {
            return null;
         }

         if (this.IIOROIHCCROHHHRCORRCOROIHOIHII.RROCOICICHHICCHRIROCIIRIRCORCH() == IOIICIRIICICIIOORHCIIIIRRIHRHI.OPEN
            && this.comparator().compare(var3, var2.getElement()) == 0) {
            var2 = var2.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH;
         }
      } else {
         var2 = this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH;
      }

      return var2 != this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC && this.IIOROIHCCROHHHRCORRCOROIHOIHII.contains((E)var2.getElement()) ? var2 : null;
   }

   @Override
   Iterator<E> elementIterator() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.elementIterator(this.entryIterator());
   }

   @Override
   Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
      return new Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>() {
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RCRIOOIHCHIHOOIRORHOORCIHHHIOR = RCOCHOROICROOIRHRCRIOHIHCOCIII.this.RRCHOOOCIHIRHCCIROIIHHHICRCHIR();
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> HROIHRRCRICHRRIIROOHOCROHHHICC;

         @Override
         public boolean hasNext() {
            if (this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR == null) {
               return false;
            } else if (RCOCHOROICROOIRHRCRIOHIHCOCIII.this.IIOROIHCCROHHHRCORRCOROIHOIHII.tooHigh(this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR.getElement())) {
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR = null;
               return false;
            } else {
               return true;
            }
         }

         public CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> IORICRCCOHRCRROIOIIRHHCOCCCCOH() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = RCOCHOROICROOIRHRCRIOHIHCOCIII.this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR
            );
            this.HROIHRRCRICHRRIIROOHOCROHHHICC = var1;
            if (this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR.RHCIIROOOHHCIOOHIIRRCROIICOOHH == RCOCHOROICROOIRHRCRIOHIHCOCIII.this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC) {
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR = null;
            } else {
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR = this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR.RHCIIROOOHHCIOOHIIRRCROIICOOHH;
            }

            return var1;
         }

         @Override
         public void remove() {
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.HROIHRRCRICHRRIIROOHOCROHHHICC != null);
            RCOCHOROICROOIRHRCRIOHIHCOCIII.this.setCount(this.HROIHRRCRICHRRIIROOHOCROHHHICC.getElement(), 0);
            this.HROIHRRCRICHRRIIROOHOCROHHHICC = null;
         }
      };
   }

   @Override
   Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> descendingEntryIterator() {
      return new Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>() {
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RCRIOOIHCHIHOOIRORHOORCIHHHIOR = RCOCHOROICROOIRHRCRIOHIHCOCIII.this.HICROOCIRHCORIHHROCCHHOIOOROCI();
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> HROIHRRCRICHRRIIROOHOCROHHHICC = null;

         @Override
         public boolean hasNext() {
            if (this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR == null) {
               return false;
            } else if (RCOCHOROICROOIRHRCRIOHIHCOCIII.this.IIOROIHCCROHHHRCORRCOROIHOIHII.tooLow(this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR.getElement())) {
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR = null;
               return false;
            } else {
               return true;
            }
         }

         public CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> IORICRCCOHRCRROIOIIRHHCOCCCCOH() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = RCOCHOROICROOIRHRCRIOHIHCOCIII.this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR
            );
            this.HROIHRRCRICHRRIIROOHOCROHHHICC = var1;
            if (this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH == RCOCHOROICROOIRHRCRIOHIHCOCIII.this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC) {
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR = null;
            } else {
               this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR = this.RCRIOOIHCHIHOOIRORHOORCIHHHIOR.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH;
            }

            return var1;
         }

         @Override
         public void remove() {
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.HROIHRRCRICHRRIIROOHOCROHHHICC != null);
            RCOCHOROICROOIRHRCRIOHIHCOCIII.this.setCount(this.HROIHRRCRICHRRIIROOHOCROHHHICC.getElement(), 0);
            this.HROIHRRCRICHRRIIROOHOCROHHHICC = null;
         }
      };
   }

   @Override
   public void forEachEntry(ObjIntConsumer<? super E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      for (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.RRCHOOOCIHIRHCCIROIIHHHICRCHIR();
         var2 != this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC && var2 != null && !this.IIOROIHCCROHHHRCORRCOROIHOIHII.tooHigh((E)var2.getElement());
         var2 = var2.RHCIIROOOHHCIOOHIIRRCROIICOOHH
      ) {
         var1.accept(var2.getElement(), var2.getCount());
      }
   }

   @Override
   public Iterator<E> iterator() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
   }

   @Override
   public IHRCROHROHOCCHIHOHRROHOCOIRHIO<E> CRRRICCRROCOHHOHIICIHORCOORRRH(@Nullable E var1, IOIICIRIICICIIOORHCIIIIRRIHRHI var2) {
      return new RCOCHOROICROOIRHRCRIOHIHCOCIII<>(
         this.COCIOOIOCHROIIOIOHOCIHHOCORORO,
         this.IIOROIHCCROHHHRCORRCOROIHOIHII
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.comparator(), (E)var1, var2)),
         this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC
      );
   }

   @Override
   public IHRCROHROHOCCHIHOHRROHOCOIRHIO<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(@Nullable E var1, IOIICIRIICICIIOORHCIIIIRRIHRHI var2) {
      return new RCOCHOROICROOIRHRCRIOHIHCOCIII<>(
         this.COCIOOIOCHROIIOIOHOCIHHOCORORO,
         this.IIOROIHCCROHHHRCORRCOROIHOIHII
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.comparator(), (E)var1, var2)),
         this.OIHIRRRRRRRCRCRHRHCHHRICRORCRC
      );
   }

   private static <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var0, RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var1
   ) {
      var0.RHCIIROOOHHCIOOHIIRRCROIICOOHH = var1;
      var1.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH = var0;
   }

   private static <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var0,
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var1,
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var2
   ) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeObject(this.elementSet().comparator());
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      Comparator var2 = (Comparator)var1.readObject();
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class, "comparator").set(this, var2);
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(RCOCHOROICROOIRHRCRIOHIHCOCIII.class, "range")
         .set(this, IOHOOIOHCHICOCHIICHCICCOHRCIII.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2));
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(RCOCHOROICROOIRHRCRIOHIHCOCIII.class, "rootReference")
         .set(this, new RCOCHOROICROOIRHRCRIOHIHCOCIII.HHCCIRHCCCIIRHCROHIORHIRHHIORH());
      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = new RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH(null, 1);
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(RCOCHOROICROOIRHRCRIOHIHCOCIII.class, "header").set(this, var3);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var3);
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> {
      private @Nullable T value;

      private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      }

      public @Nullable T get() {
         return this.value;
      }

      public void checkAndSet(@Nullable T var1, T var2) {
         if (this.value != var1) {
            throw new ConcurrentModificationException();
         }

         this.value = (T)var2;
      }

      void clear() {
         this.value = null;
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> {
      private final @Nullable E IOCIRHOHHOCIIRHIIHCHIRIROCIORC;
      private int elemCount;
      private int distinctElements;
      private long totalCount;
      private int height;
      private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> OICORICRCCIIIIRCCHOOHOHIIICIRC;
      private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> HRHCIRORHRRIOCCHORROOOOICCRRHH;
      private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> IIHCCHIHRRIHRIOOHRICOHHHOOOIHH;
      private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RHCIIROOOHHCIOOHIIRRCROIICOOHH;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable E var1, int var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var2 > 0
         );
         this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC = (E)var1;
         this.elemCount = var2;
         this.totalCount = var2;
         this.distinctElements = 1;
         this.height = 1;
         this.OICORICRCCIIIIRCCHOOHOHIIICIRC = null;
         this.HRHCIRORHRRIOCCHORROOOOICCRRHH = null;
      }

      public int count(Comparator<? super E> var1, E var2) {
         int var3 = var1.compare(var2, this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
         if (var3 < 0) {
            return this.OICORICRCCIIIIRCCHOOHOHIIICIRC == null ? 0 : this.OICORICRCCIIIIRCCHOOHOHIIICIRC.count(var1, (E)var2);
         } else if (var3 > 0) {
            return this.HRHCIRORHRRIOCCHORROOOOICCRRHH == null ? 0 : this.HRHCIRORHRRIOCCHORROOOOICCRRHH.count(var1, (E)var2);
         } else {
            return this.elemCount;
         }
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(E var1, int var2) {
         this.HRHCIRORHRRIOCCHORROOOOICCRRHH = new RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>((E)var1, var2);
         RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, this.HRHCIRORHRRIOCCHORROOOOICCRRHH, this.RHCIIROOOHHCIOOHIIRRCROIICOOHH);
         this.height = Math.max(2, this.height);
         this.distinctElements++;
         this.totalCount += var2;
         return this;
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> IIRHCHHOICHRICOOCRORCCIOOIHOIR(E var1, int var2) {
         this.OICORICRCCIIIIRCCHOOHOHIIICIRC = new RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>((E)var1, var2);
         RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH, this.OICORICRCCIIIIRCCHOOHOHIIICIRC, this);
         this.height = Math.max(2, this.height);
         this.distinctElements++;
         this.totalCount += var2;
         return this;
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Comparator<? super E> var1, @Nullable E var2, int var3, int[] var4
      ) {
         int var5 = var1.compare(var2, this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
         if (var5 < 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
            if (var9 == null) {
               var4[0] = 0;
               return this.IIRHCHHOICHRICOOCRORCCIOOIHOIR((E)var2, var3);
            }

            int var10 = var9.height;
            this.OICORICRCCIIIIRCCHOOHOHIIICIRC = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var2, var3, var4
            );
            if (var4[0] == 0) {
               this.distinctElements++;
            }

            this.totalCount += var3;
            return this.OICORICRCCIIIIRCCHOOHOHIIICIRC.height == var10 ? this : this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else if (var5 > 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
            if (var8 == null) {
               var4[0] = 0;
               return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR((E)var2, var3);
            }

            int var7 = var8.height;
            this.HRHCIRORHRRIOCCHORROOOOICCRRHH = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var2, var3, var4
            );
            if (var4[0] == 0) {
               this.distinctElements++;
            }

            this.totalCount += var3;
            return this.HRHCIRORHRRIOCCHORROOOOICCRRHH.height == var7 ? this : this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else {
            var4[0] = this.elemCount;
            long var6 = (long)this.elemCount + var3;
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
               var6 <= 2147483647L
            );
            this.elemCount += var3;
            this.totalCount += var3;
            return this;
         }
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         Comparator<? super E> var1, @Nullable E var2, int var3, int[] var4
      ) {
         int var5 = var1.compare(var2, this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
         if (var5 < 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
            if (var7 == null) {
               var4[0] = 0;
               return this;
            }

            this.OICORICRCCIIIIRCCHOOHOHIIICIRC = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1, var2, var3, var4
            );
            if (var4[0] > 0) {
               if (var3 >= var4[0]) {
                  this.distinctElements--;
                  this.totalCount = this.totalCount - var4[0];
               } else {
                  this.totalCount -= var3;
               }
            }

            return var4[0] == 0 ? this : this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else if (var5 > 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
            if (var6 == null) {
               var4[0] = 0;
               return this;
            }

            this.HRHCIRORHRRIOCCHORROOOOICCRRHH = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var6.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1, var2, var3, var4
            );
            if (var4[0] > 0) {
               if (var3 >= var4[0]) {
                  this.distinctElements--;
                  this.totalCount = this.totalCount - var4[0];
               } else {
                  this.totalCount -= var3;
               }
            }

            return this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else {
            var4[0] = this.elemCount;
            if (var3 >= this.elemCount) {
               return this.HHCRORHHIIICRICROHOHCIICCIICCC();
            }

            this.elemCount -= var3;
            this.totalCount -= var3;
            return this;
         }
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         Comparator<? super E> var1, @Nullable E var2, int var3, int[] var4
      ) {
         int var5 = var1.compare(var2, this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
         if (var5 < 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
            if (var7 == null) {
               var4[0] = 0;
               return var3 > 0 ? this.IIRHCHHOICHRICOOCRORCCIOOIHOIR((E)var2, var3) : this;
            }

            this.OICORICRCCIIIIRCCHOOHOHIIICIRC = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var7.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var1, var2, var3, var4
            );
            if (var3 == 0 && var4[0] != 0) {
               this.distinctElements--;
            } else if (var3 > 0 && var4[0] == 0) {
               this.distinctElements++;
            }

            this.totalCount = this.totalCount + (var3 - var4[0]);
            return this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else if (var5 > 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
            if (var6 == null) {
               var4[0] = 0;
               return var3 > 0 ? this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR((E)var2, var3) : this;
            }

            this.HRHCIRORHRRIOCCHORROOOOICCRRHH = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var1, var2, var3, var4
            );
            if (var3 == 0 && var4[0] != 0) {
               this.distinctElements--;
            } else if (var3 > 0 && var4[0] == 0) {
               this.distinctElements++;
            }

            this.totalCount = this.totalCount + (var3 - var4[0]);
            return this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else {
            var4[0] = this.elemCount;
            if (var3 == 0) {
               return this.HHCRORHHIIICRICROHOHCIICCIICCC();
            }

            this.totalCount = this.totalCount + (var3 - this.elemCount);
            this.elemCount = var3;
            return this;
         }
      }

      RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Comparator<? super E> var1, @Nullable E var2, int var3, int var4, int[] var5
      ) {
         int var6 = var1.compare(var2, this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
         if (var6 < 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
            if (var8 == null) {
               var5[0] = 0;
               return var3 == 0 && var4 > 0 ? this.IIRHCHHOICHRICOOCRORCCIOOIHOIR((E)var2, var4) : this;
            }

            this.OICORICRCCIIIIRCCHOOHOHIIICIRC = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var2, var3, var4, var5
            );
            if (var5[0] == var3) {
               if (var4 == 0 && var5[0] != 0) {
                  this.distinctElements--;
               } else if (var4 > 0 && var5[0] == 0) {
                  this.distinctElements++;
               }

               this.totalCount = this.totalCount + (var4 - var5[0]);
            }

            return this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else if (var6 > 0) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
            if (var7 == null) {
               var5[0] = 0;
               return var3 == 0 && var4 > 0 ? this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR((E)var2, var4) : this;
            }

            this.HRHCIRORHRRIOCCHORROOOOICCRRHH = (RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>)var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var2, var3, var4, var5
            );
            if (var5[0] == var3) {
               if (var4 == 0 && var5[0] != 0) {
                  this.distinctElements--;
               } else if (var4 > 0 && var5[0] == 0) {
                  this.distinctElements++;
               }

               this.totalCount = this.totalCount + (var4 - var5[0]);
            }

            return this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else {
            var5[0] = this.elemCount;
            if (var3 == this.elemCount) {
               if (var4 == 0) {
                  return this.HHCRORHHIIICRICROHOHCIICCIICCC();
               }

               this.totalCount = this.totalCount + (var4 - this.elemCount);
               this.elemCount = var4;
            }

            return this;
         }
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> HHCRORHHIIICRICROHOHCIICCIICCC() {
         int var1 = this.elemCount;
         this.elemCount = 0;
         RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH, this.RHCIIROOOHHCIOOHIIRRCROIICOOHH);
         if (this.OICORICRCCIIIIRCCHOOHOHIIICIRC == null) {
            return this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
         } else if (this.HRHCIRORHRRIOCCHORROOOOICCRRHH == null) {
            return this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
         } else if (this.OICORICRCCIIIIRCCHOOHOHIIICIRC.height >= this.HRHCIRORHRRIOCCHORROOOOICCRRHH.height) {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.IIHCCHIHRRIHRIOOHRICOHHHOOOIHH;
            var3.OICORICRCCIIIIRCCHOOHOHIIICIRC = this.OICORICRCCIIIIRCCHOOHOHIIICIRC.CRRRICCRROCOHHOHIICIHORCOORRRH(var3);
            var3.HRHCIRORHRRIOCCHORROOOOICCRRHH = this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
            var3.distinctElements = this.distinctElements - 1;
            var3.totalCount = this.totalCount - var1;
            return var3.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         } else {
            RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.RHCIIROOOHHCIOOHIIRRCROIICOOHH;
            var2.HRHCIRORHRRIOCCHORROOOOICCRRHH = this.HRHCIRORHRRIOCCHORROOOOICCRRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
            var2.OICORICRCCIIIIRCCHOOHOHIIICIRC = this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
            var2.distinctElements = this.distinctElements - 1;
            var2.totalCount = this.totalCount - var1;
            return var2.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
         }
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> var1
      ) {
         if (this.OICORICRCCIIIIRCCHOOHOHIIICIRC == null) {
            return this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
         }

         this.OICORICRCCIIIIRCCHOOHOHIIICIRC = this.OICORICRCCIIIIRCCHOOHOHIIICIRC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         this.distinctElements--;
         this.totalCount = this.totalCount - var1.elemCount;
         return this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> CRRRICCRROCOHHOHIICIHORCOORRRH(
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> var1
      ) {
         if (this.HRHCIRORHRRIOCCHORROOOOICCRRHH == null) {
            return this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
         }

         this.HRHCIRORHRRIOCCHORROOOOICCRRHH = this.HRHCIRORHRRIOCCHORROOOOICCRRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
         this.distinctElements--;
         this.totalCount = this.totalCount - var1.elemCount;
         return this.HICOIICIHCOORRCRIIOHIRIRCHOHHR();
      }

      private void recomputeMultiset() {
         this.distinctElements = 1
            + RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.OICORICRCCIIIIRCCHOOHOHIIICIRC)
            + RCOCHOROICROOIRHRCRIOHIHCOCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHCIRORHRRIOCCHORROOOOICCRRHH);
         this.totalCount = this.elemCount
            + RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.OICORICRCCIIIIRCCHOOHOHIIICIRC)
            + RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.HRHCIRORHRRIOCCHORROOOOICCRRHH);
      }

      private void recomputeHeight() {
         this.height = 1
            + Math.max(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OICORICRCCIIIIRCCHOOHOHIIICIRC), RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HRHCIRORHRRIOCCHORROOOOICCRRHH));
      }

      private void recompute() {
         this.recomputeMultiset();
         this.recomputeHeight();
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> HICOIICIHCOORRCRIIOHIRIRCHOHHR() {
         switch (this.balanceFactor()) {
            case -2:
               if (this.HRHCIRORHRRIOCCHORROOOOICCRRHH.balanceFactor() > 0) {
                  this.HRHCIRORHRRIOCCHORROOOOICCRRHH = this.HRHCIRORHRRIOCCHORROOOOICCRRHH.ICIRRIHRIIHRROCCIHIHORIHHRRIRH();
               }

               return this.RIOROOHCIRROCROORHCIRCORIOCROO();
            case 2:
               if (this.OICORICRCCIIIIRCCHOOHOHIIICIRC.balanceFactor() < 0) {
                  this.OICORICRCCIIIIRCCHOOHOHIIICIRC = this.OICORICRCCIIIIRCCHOOHOHIIICIRC.RIOROOHCIRROCROORHCIRCORIOCROO();
               }

               return this.ICIRRIHRIIHRROCCIHIHORIHHRRIRH();
            default:
               this.recomputeHeight();
               return this;
         }
      }

      private int balanceFactor() {
         return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.OICORICRCCIIIIRCCHOOHOHIIICIRC) - RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HRHCIRORHRRIOCCHORROOOOICCRRHH);
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RIOROOHCIRROCROORHCIRCORIOCROO() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.HRHCIRORHRRIOCCHORROOOOICCRRHH != null
         );
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.HRHCIRORHRRIOCCHORROOOOICCRRHH;
         this.HRHCIRORHRRIOCCHORROOOOICCRRHH = var1.OICORICRCCIIIIRCCHOOHOHIIICIRC;
         var1.OICORICRCCIIIIRCCHOOHOHIIICIRC = this;
         var1.totalCount = this.totalCount;
         var1.distinctElements = this.distinctElements;
         this.recompute();
         var1.recomputeHeight();
         return var1;
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> ICIRRIHRIIHRROCCIHIHORIHHRRIRH() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.OICORICRCCIIIIRCCHOOHOHIIICIRC != null
         );
         RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.OICORICRCCIIIIRCCHOOHOHIIICIRC;
         this.OICORICRCCIIIIRCCHOOHOHIIICIRC = var1.HRHCIRORHRRIOCCHORROOOOICCRRHH;
         var1.HRHCIRORHRRIOCCHORROOOOICCRRHH = this;
         var1.totalCount = this.totalCount;
         var1.distinctElements = this.distinctElements;
         this.recompute();
         var1.recomputeHeight();
         return var1;
      }

      private static long RRCRRCORICCHOHHIRCHIROOHIIOHCO(RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var0) {
         return var0 == null ? 0L : var0.totalCount;
      }

      private static int RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var0) {
         return var0 == null ? 0 : var0.height;
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Comparator<? super E> var1, E var2) {
         int var3 = var1.compare(var2, this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
         if (var3 < 0) {
            return this.OICORICRCCIIIIRCCHOOHOHIIICIRC == null
               ? this
               : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI.firstNonNull(
                  this.OICORICRCCIIIIRCCHOOHOHIIICIRC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (E)var2), this
               );
         } else if (var3 == 0) {
            return this;
         } else {
            return this.HRHCIRORHRRIOCCHORROOOOICCRRHH == null ? null : this.HRHCIRORHRRIOCCHORROOOOICCRRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (E)var2);
         }
      }

      private RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Comparator<? super E> var1, E var2) {
         int var3 = var1.compare(var2, this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC);
         if (var3 > 0) {
            return this.HRHCIRORHRRIOCCHORROOOOICCRRHH == null
               ? this
               : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI.firstNonNull(
                  this.HRHCIRORHRRIOCCHORROOOOICCRRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, (E)var2), this
               );
         } else if (var3 == 0) {
            return this;
         } else {
            return this.OICORICRCCIIIIRCCHOOHOHIIICIRC == null ? null : this.OICORICRCCIIIIRCCHOOHOHIIICIRC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, (E)var2);
         }
      }

      E getElement() {
         return this.IOCIRHOHHOCIIRHIIHCHIRIROCIORC;
      }

      int getCount() {
         return this.elemCount;
      }

      @Override
      public String toString() {
         return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.getElement(), this.getCount()).toString();
      }
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      SIZE {
         @Override
         int nodeAggregate(RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var1) {
            return var1.elemCount;
         }

         @Override
         long treeAggregate(RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var1) {
            return var1 == null ? 0L : var1.totalCount;
         }
      },
      DISTINCT {
         @Override
         int nodeAggregate(RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var1) {
            return 1;
         }

         @Override
         long treeAggregate(RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var1) {
            return var1 == null ? 0L : var1.distinctElements;
         }
      };

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      abstract int nodeAggregate(RCOCHOROICROOIRHRCRIOHIHCOCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var1);

      abstract long treeAggregate(RCOCHOROICROOIRHRCRIOHIHCOCIII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var1);
   }
}
