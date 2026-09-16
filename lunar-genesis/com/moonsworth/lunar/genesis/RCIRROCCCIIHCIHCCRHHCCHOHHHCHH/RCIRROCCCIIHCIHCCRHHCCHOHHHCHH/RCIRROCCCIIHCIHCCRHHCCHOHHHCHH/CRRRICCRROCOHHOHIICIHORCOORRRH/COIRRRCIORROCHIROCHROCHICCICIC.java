package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
public abstract class COIRRRCIORROCHIROCHROCHICCICIC<E> extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<E> implements List<E>, RandomAccess {
   public static <E> Collector<E, ?, COIRRRCIORROCHIROCHROCHICCICIC<E>> toImmutableList() {
      return IHCRORHRORIICHRHRCHRRIRRHHOCOO.toImmutableList();
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> HHOIROIHOHHRHIRRRHRIRHOOIRCIOH() {
      return (COIRRRCIORROCHIROCHROCHICCICIC<E>)ORHIIROIHOHHHOROORIIROIOCRHHCR.CRCCHCOOOOOCOORROHORRIOCCCRCRH;
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(E var0) {
      return new OIRCRCOOHCOHHCIHHIROIOCHCIHOHH<>((E)var0);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> HICRRICCHCCROOHHCHOCOCCHOIHHOC(E var0, E var1) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(E var0, E var1, E var2) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(E var0, E var1, E var2, E var3) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var0, E var1, E var2, E var3, E var4) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3, var4);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(E var0, E var1, E var2, E var3, E var4, E var5) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3, var4, var5);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var0, E var1, E var2, E var3, E var4, E var5, E var6) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3, var4, var5, var6);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(E var0, E var1, E var2, E var3, E var4, E var5, E var6, E var7) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var0, E var1, E var2, E var3, E var4, E var5, E var6, E var7, E var8) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      E var0, E var1, E var2, E var3, E var4, E var5, E var6, E var7, E var8, E var9
   ) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      E var0, E var1, E var2, E var3, E var4, E var5, E var6, E var7, E var8, E var9, E var10
   ) {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @SafeVarargs
   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      E var0, E var1, E var2, E var3, E var4, E var5, E var6, E var7, E var8, E var9, E var10, E var11, E... var12
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var12.length <= 2147483635, "the total number of elements must fit in an int"
      );
      Object[] var13 = new Object[12 + var12.length];
      var13[0] = var0;
      var13[1] = var1;
      var13[2] = var2;
      var13[3] = var3;
      var13[4] = var4;
      var13[5] = var5;
      var13[6] = var6;
      var13[7] = var7;
      var13[8] = var8;
      var13[9] = var9;
      var13[10] = var10;
      var13[11] = var11;
      System.arraycopy(var12, 0, var13, 12, var12.length);
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var13);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> HICRRICCHCCROOHHCHOCOCCHOIHHOC(Iterable<? extends E> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return var0 instanceof Collection ? RIROICHCRROROHCCROOCCCCOCHCCRI((Collection<? extends E>)var0) : CRRRICCRROCOHHOHIICIHORCOORRRH(var0.iterator());
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RIROICHCRROROHCCROOCCCCOCHCCRI(Collection<? extends E> var0) {
      if (var0 instanceof OIICIRRCOOCIHRHOIOIOOROCRHCHIC) {
         COIRRRCIORROCHIROCHROCHICCICIC var1 = ((OIICIRRCOOCIHRHOIOIOOROCRHCHIC)var0).OHOOIHCOHHORHICHIOROIRIHCOOCRR();
         return var1.isPartialView() ? HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1.toArray()) : var1;
      } else {
         return RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var0.toArray());
      }
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> CRRRICCRROCOHHOHIICIHORCOORRRH(Iterator<? extends E> var0) {
      if (!var0.hasNext()) {
         return HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
      }

      Object var1 = var0.next();
      return !var0.hasNext()
         ? HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO((E)var1)
         : new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>()
            .CCHHRHRHCRHIHIHRIOICROHCHIIIHI((E)var1)
            .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0)
            .IORRHROIIRHIIOOHCOOIRHOIHRHRHI();
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> IRRCCOICORICIHCHRHIHIHROIRHOCR(E[] var0) {
      switch (var0.length) {
         case 0:
            return HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
         case 1:
            return HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO((E)var0[0]);
         default:
            return RICRIRRCOHRCOCRRHHCRHRROOIOHHR((Object[])var0.clone());
      }
   }

   public static <E extends Comparable<? super E>> COIRRRCIORROCHIROCHROCHICCICIC<E> RIROICHCRROROHCCROOCCCCOCHCCRI(Iterable<? extends E> var0) {
      Comparable[] var1 = IRIHOIRCHIRRCRIOORCOICORHHORHH.toArray(var0, new Comparable[0]);
      IOHCCIRCCICICHHHIOIOHCICICROIO.checkElementsNotNull(var1);
      Arrays.sort(var1);
      return HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1);
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Comparator<? super E> var0, Iterable<? extends E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      Object[] var2 = IRIHOIRCHIRRCRIOORCOICORHHORHH.toArray(var1);
      IOHCCIRCCICICHHHIOIOHCICICROIO.checkElementsNotNull(var2);
      Arrays.sort(var2, var0);
      return HICRRICCHCCROOHHCHOCOCCHOIHHOC(var2);
   }

   private static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RICRIRRCOHRCOCRRHHCRHRROOIOHHR(Object... var0) {
      return HICRRICCHCCROOHHCHOCOCCHOIHHOC(IOHCCIRCCICICHHHIOIOHCICICROIO.checkElementsNotNull(var0));
   }

   static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> HICRRICCHCCROOHHCHOCOCCHOIHHOC(Object[] var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var0.length);
   }

   static <E> COIRRRCIORROCHIROCHROCHICCICIC<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object[] var0, int var1) {
      switch (var1) {
         case 0:
            return HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
         case 1:
            return HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO((E)var0[0]);
         default:
            if (var1 < var0.length) {
               var0 = Arrays.copyOf(var0, var1);
            }

            return new ORHIIROIHOHHHOROORIIROIOCRHHCR<>(var0);
      }
   }

   COIRRRCIORROCHIROCHROCHICCICIC() {
   }

   @Override
   public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
      return this.RIHOHIIOHOHIRORICOHOIHCHRRRCHH();
   }

   public RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC<E> RIHOHIIOHOHIRORICOHOIHCHRRRCHH() {
      return this.OCCHCOCHHRORORHICHRRHCCICCIIIH(0);
   }

   public RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC<E> OCCHCOCHHRORORHICHRRHCCICCIIIH(int var1) {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<E>(
         this.size(), var1
      ) {
         @Override
         protected E get(int var1) {
            return (E)COIRRRCIORROCHIROCHROCHICCICIC.this.get(var1);
         }
      };
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
   public int indexOf(@Nullable Object var1) {
      return var1 == null ? -1 : RCHOIICIHOCIRCIOORIOHRCRHOCRCR.indexOfImpl(this, var1);
   }

   @Override
   public int lastIndexOf(@Nullable Object var1) {
      return var1 == null ? -1 : RCHOIICIHOCIRCIOORIOHRCRHOCRCR.lastIndexOfImpl(this, var1);
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      return this.indexOf(var1) >= 0;
   }

   public COIRRRCIORROCHIROCHROCHICCICIC<E> HIHCHCORCCRCOHCRROHOHOOCHOROCC(int var1, int var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
         var1, var2, this.size()
      );
      int var3 = var2 - var1;
      if (var3 == this.size()) {
         return this;
      } else if (var3 == 0) {
         return HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
      } else {
         return var3 == 1 ? HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(this.get(var1)) : this.OCIHRICRHRRHIOHIIHIROCRIRHCCIR(var1, var2);
      }
   }

   COIRRRCIORROCHIROCHROCHICCICIC<E> OCIHRICRHRRHIOHIIHIROCRIRHCCIR(int var1, int var2) {
      return new COIRRRCIORROCHIROCHROCHICCICIC.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2 - var1);
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean addAll(int var1, Collection<? extends E> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final E set(int var1, E var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void add(int var1, E var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final E remove(int var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void replaceAll(UnaryOperator<E> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void sort(Comparator<? super E> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final COIRRRCIORROCHIROCHROCHICCICIC<E> OHOOIHCOHHORHICHIOROIRIHCOOCRR() {
      return this;
   }

   @Override
   public Spliterator<E> spliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(this.size(), 1296, this::get);
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      int var3 = this.size();

      for (int var4 = 0; var4 < var3; var4++) {
         var1[var2 + var4] = this.get(var4);
      }

      return var2 + var3;
   }

   public COIRRRCIORROCHIROCHROCHICCICIC<E> RROORHRCHCRRRIHOOIHCRRRICORROO() {
      return this.size() <= 1 ? this : new COIRRRCIORROCHIROCHROCHICCICIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return RCHOIICIHOCIRCIOORIOHRCRHOCRCR.equalsImpl(this, var1);
   }

   @Override
   public int hashCode() {
      int var1 = 1;
      int var2 = this.size();

      for (int var3 = 0; var3 < var2; var3++) {
         var1 = 31 * var1 + this.get(var3).hashCode();
         var1 = ~(~var1);
      }

      return var1;
   }

   private void readObject(ObjectInputStream var1) {
      throw new InvalidObjectException("Use SerializedForm");
   }

   @Override
   Object writeReplace() {
      return new COIRRRCIORROCHIROCHROCHICCICIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.toArray());
   }

   public static <E> COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> HOOCHHHRHCRIRHCIHIRIRCOICCOIOR() {
      return new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RHIICHCRRORRROCHRRHOORCORIOCRH(int var0) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var0, "expectedSize");
      return new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   class CRRRICCRROCOHHOHIICIHORCOORRRH extends COIRRRCIORROCHIROCHROCHICCICIC<E> {
      final transient int OIRRRCIHICOICHIOCOIRHCIHRRCHIR;
      final transient int OOCORIRHIHCCCHIHRRCCCIIOCRIIIH;

      CRRRICCRROCOHHOHIICIHORCOORRRH(int var2, int var3) {
         this.OIRRRCIHICOICHIOCOIRHCIHRRCHIR = var2;
         this.OOCORIRHIHCCCHIHRRCCCIIOCRIIIH = var3;
      }

      @Override
      public int size() {
         return this.OOCORIRHIHCCCHIHRRCCCIIOCRIIIH;
      }

      @Override
      public E get(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, this.OOCORIRHIHCCCHIHRRCCCIIOCRIIIH
         );
         return COIRRRCIORROCHIROCHROCHICCICIC.this.get(var1 + this.OIRRRCIHICOICHIOCOIRHCIHRRCHIR);
      }

      @Override
      public COIRRRCIORROCHIROCHROCHICCICIC<E> HIHCHCORCCRCOHCRROHOHOOCHOROCC(int var1, int var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
            var1, var2, this.OOCORIRHIHCCCHIHRRCCCIIOCRIIIH
         );
         return COIRRRCIORROCHIROCHROCHICCICIC.this.HIHCHCORCCRCOHCRROHOHOOCHOROCC(
            var1 + this.OIRRRCIHICOICHIOCOIRHCIHRRCHIR, var2 + this.OIRRRCIHICOICHIOCOIRHCIHRRCHIR
         );
      }

      @Override
      boolean isPartialView() {
         return true;
      }
   }

   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Serializable {
      final Object[] OHORHCHRHIHIOCRIIIORRCRHHHRCCH;
      private static final long COOCCOIICOOCCHIHIIHHIOOORROCRC = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(Object[] var1) {
         this.OHORHCHRHIHIOCRIIIORRCRHHHRCCH = var1;
      }

      Object readResolve() {
         return COIRRRCIORROCHIROCHROCHICCICIC.IRRCCOICORICIHCHRHIHIHROIRHOCR(this.OHORHCHRHIHIOCRIIIORRCRHHHRCCH);
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<E> extends COIRRRCIORROCHIROCHROCHICCICIC<E> {
      private final transient COIRRRCIORROCHIROCHROCHICCICIC<E> OHCOORCCOCCRICRCIOIIIHIIRICOIH;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(COIRRRCIORROCHIROCHROCHICCICIC<E> var1) {
         this.OHCOORCCOCCRICRCIOIIIHIIRICOIH = var1;
      }

      private int reverseIndex(int var1) {
         return this.size() - 1 - var1;
      }

      private int reversePosition(int var1) {
         return this.size() - var1;
      }

      @Override
      public COIRRRCIORROCHIROCHROCHICCICIC<E> RROORHRCHCRRRIHOOIHCRRRICORROO() {
         return this.OHCOORCCOCCRICRCIOIIIHIIRICOIH;
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         return this.OHCOORCCOCCRICRCIOIIIHIIRICOIH.contains(var1);
      }

      @Override
      public int indexOf(@Nullable Object var1) {
         int var2 = this.OHCOORCCOCCRICRCIOIIIHIIRICOIH.lastIndexOf(var1);
         return var2 >= 0 ? this.reverseIndex(var2) : -1;
      }

      @Override
      public int lastIndexOf(@Nullable Object var1) {
         int var2 = this.OHCOORCCOCCRICRCIOIIIHIIRICOIH.indexOf(var1);
         return var2 >= 0 ? this.reverseIndex(var2) : -1;
      }

      @Override
      public COIRRRCIORROCHIROCHROCHICCICIC<E> HIHCHCORCCRCOHCRROHOHOOCHOROCC(int var1, int var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(
            var1, var2, this.size()
         );
         return this.OHCOORCCOCCRICRCIOIIIHIIRICOIH
            .HIHCHCORCCRCOHCRROHOHOOCHOROCC(this.reversePosition(var2), this.reversePosition(var1))
            .RROORHRCHCRRRIHOOIHCRRRICORROO();
      }

      @Override
      public E get(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, this.size()
         );
         return this.OHCOORCCOCCRICRCIOIIIHIIRICOIH.get(this.reverseIndex(var1));
      }

      @Override
      public int size() {
         return this.OHCOORCCOCCRICRCIOIIIHIIRICOIH.size();
      }

      @Override
      boolean isPartialView() {
         return this.OHCOORCCOCCRICRCIOIIIHIIRICOIH.isPartialView();
      }
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> {
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
      Object[] contents;
      private int size;
      private boolean forceCopy;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         this(4);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         this.contents = new Object[var1];
         this.size = 0;
      }

      private void getReadyToExpandTo(int var1) {
         if (this.contents.length < var1) {
            this.contents = Arrays.copyOf(this.contents, expandedCapacity(this.contents.length, var1));
            this.forceCopy = false;
         } else if (this.forceCopy) {
            this.contents = Arrays.copyOf(this.contents, this.contents.length);
            this.forceCopy = false;
         }
      }

      @CanIgnoreReturnValue
      public COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> CCHHRHRHCRHIHIHRIOICROHCHIIIHI(E var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.getReadyToExpandTo(this.size + 1);
         this.contents[this.size++] = var1;
         return this;
      }

      @CanIgnoreReturnValue
      public COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RIROICHCRROROHCCROOCCCCOCHCCRI(E... var1) {
         IOHCCIRCCICICHHHIOIOHCICICROIO.checkElementsNotNull(var1);
         this.add(var1, var1.length);
         return this;
      }

      private void add(Object[] var1, int var2) {
         this.getReadyToExpandTo(this.size + var2);
         System.arraycopy(var1, 0, this.contents, this.size, var2);
         this.size += var2;
      }

      @CanIgnoreReturnValue
      public COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> IHIRRIIORRHORHRORIHOROIRCORCOO(Iterable<? extends E> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (var1 instanceof Collection) {
            Collection var2 = (Collection)var1;
            this.getReadyToExpandTo(this.size + var2.size());
            if (var2 instanceof OIICIRRCOOCIHRHOIOIOOROCRHCHIC) {
               OIICIRRCOOCIHRHOIOIOOROCRHCHIC var3 = (OIICIRRCOOCIHRHOIOIOOROCRHCHIC)var2;
               this.size = var3.copyIntoArray(this.contents, this.size);
               return this;
            }
         }

         super.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var1);
         return this;
      }

      @CanIgnoreReturnValue
      public COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RRCRRCORICCHOHHIRCHIROOHIIOHCO(Iterator<? extends E> var1) {
         super.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         return this;
      }

      @CanIgnoreReturnValue
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> var1
      ) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.add(var1.contents, var1.size);
         return this;
      }

      public COIRRRCIORROCHIROCHROCHICCICIC<E> IORRHROIIRHIIOOHCOOIRHOIHRHRHI() {
         this.forceCopy = true;
         return COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.contents, this.size);
      }
   }
}
