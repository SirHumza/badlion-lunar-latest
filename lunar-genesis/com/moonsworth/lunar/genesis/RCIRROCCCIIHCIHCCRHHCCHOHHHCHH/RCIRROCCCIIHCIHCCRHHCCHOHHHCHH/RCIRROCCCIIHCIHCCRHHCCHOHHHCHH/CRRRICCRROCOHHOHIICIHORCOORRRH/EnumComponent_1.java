package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.ObjIntConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class RIIHIHHCRHCHRCICHOROHCHIIHCICH<E extends Enum<E>> extends CORCOCICIRIOHROHROIIOOHICCHCRR<E> implements Serializable {
   private transient Class<E> type;
   private transient E[] enumConstants;
   private transient int[] counts;
   private transient int distinctElements;
   private transient long size;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final long OCIHOIOIRCOOCRRROHHICCCOCHICHI = 0L;

   public static <E extends Enum<E>> RIIHIHHCRHCHRCICHOROHCHIIHCICH<E> IIOIROIHIHHCCRICRCOOCHIICHRCOI(Class<E> var0) {
      return new RIIHIHHCRHCHRCICHOROHCHIIHCICH<>(var0);
   }

   public static <E extends Enum<E>> RIIHIHHCRHCHRCICHOROHCHIIHCICH<E> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Iterable<E> var0) {
      Iterator var1 = var0.iterator();
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1.hasNext(), "EnumMultiset constructor passed empty Iterable"
      );
      RIIHIHHCRHCHRCICHOROHCHIIHCICH var2 = new RIIHIHHCRHCHRCICHOROHCHIIHCICH(((Enum)var1.next()).getDeclaringClass());
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var2, var0);
      return var2;
   }

   public static <E extends Enum<E>> RIIHIHHCRHCHRCICHOROHCHIIHCICH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterable<E> var0, Class<E> var1) {
      RIIHIHHCRHCHRCICHOROHCHIIHCICH var2 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var1);
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var2, var0);
      return var2;
   }

   private RIIHIHHCRHCHRCICHOROHCHIIHCICH(Class<E> var1) {
      this.type = var1;
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1.isEnum()
      );
      this.enumConstants = (E[])var1.getEnumConstants();
      this.counts = new int[this.enumConstants.length];
   }

   private boolean isActuallyE(@Nullable Object var1) {
      if (!(var1 instanceof Enum)) {
         return false;
      }

      Enum var2 = (Enum)var1;
      int var3 = var2.ordinal();
      return var3 < this.enumConstants.length && this.enumConstants[var3] == var2;
   }

   void checkIsE(@Nullable Object var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (!this.isActuallyE(var1)) {
         throw new ClassCastException("Expected an " + this.type + " but got " + var1);
      }
   }

   @Override
   int distinctElements() {
      return this.distinctElements;
   }

   @Override
   public int size() {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         this.size
      );
   }

   @Override
   public int count(@Nullable Object var1) {
      if (!this.isActuallyE(var1)) {
         return 0;
      }

      Enum var2 = (Enum)var1;
      return this.counts[var2.ordinal()];
   }

   @CanIgnoreReturnValue
   public int add(E var1, int var2) {
      this.checkIsE(var1);
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "occurrences");
      if (var2 == 0) {
         return this.count(var1);
      }

      int var3 = var1.ordinal();
      int var4 = this.counts[var3];
      long var5 = (long)var4 + var2;
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var5 <= 2147483647L, "too many occurrences: %s", var5
      );
      this.counts[var3] = (int)var5;
      if (var4 == 0) {
         this.distinctElements++;
      }

      this.size += var2;
      return var4;
   }

   @CanIgnoreReturnValue
   @Override
   public int remove(@Nullable Object var1, int var2) {
      if (!this.isActuallyE(var1)) {
         return 0;
      }

      Enum var3 = (Enum)var1;
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "occurrences");
      if (var2 == 0) {
         return this.count(var1);
      }

      int var4 = var3.ordinal();
      int var5 = this.counts[var4];
      if (var5 == 0) {
         return 0;
      }

      if (var5 <= var2) {
         this.counts[var4] = 0;
         this.distinctElements--;
         this.size -= var5;
      } else {
         this.counts[var4] = var5 - var2;
         this.size -= var2;
      }

      return var5;
   }

   @CanIgnoreReturnValue
   public int setCount(E var1, int var2) {
      this.checkIsE(var1);
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "count");
      int var3 = var1.ordinal();
      int var4 = this.counts[var3];
      this.counts[var3] = var2;
      this.size += var2 - var4;
      if (var4 == 0 && var2 > 0) {
         this.distinctElements++;
      } else if (var4 > 0 && var2 == 0) {
         this.distinctElements--;
      }

      return var4;
   }

   @Override
   public void clear() {
      Arrays.fill(this.counts, 0);
      this.size = 0L;
      this.distinctElements = 0;
   }

   @Override
   Iterator<E> elementIterator() {
      return new RIIHIHHCRHCHRCICHOROHCHIIHCICH<E>.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>() {
         E output(int var1) {
            return RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.enumConstants[var1];
         }
      };
   }

   @Override
   Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
      return new RIIHIHHCRHCHRCICHOROHCHIIHCICH<E>.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>() {
         CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> CHHOOIOHHRCIRIRRHHHOOCRCCHHOOR(final int var1) {
            return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>() {
               public E getElement() {
                  return RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.enumConstants[var1];
               }

               @Override
               public int getCount() {
                  return RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.counts[var1];
               }
            };
         }
      };
   }

   @Override
   public void forEachEntry(ObjIntConsumer<? super E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      for (int var2 = 0; var2 < this.enumConstants.length; var2++) {
         if (this.counts[var2] > 0) {
            var1.accept(this.enumConstants[var2], this.counts[var2]);
         }
      }
   }

   @Override
   public Iterator<E> iterator() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeObject(this.type);
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      Class var2 = (Class)var1.readObject();
      this.type = var2;
      this.enumConstants = this.type.getEnumConstants();
      this.counts = new int[this.enumConstants.length];
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> implements Iterator<T> {
      int index = 0;
      int toRemove = -1;

      abstract T output(int var1);

      @Override
      public boolean hasNext() {
         while (this.index < RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.enumConstants.length) {
            if (RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.counts[this.index] > 0) {
               return true;
            }

            this.index++;
         }

         return false;
      }

      @Override
      public T next() {
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         Object var1 = this.output(this.index);
         this.toRemove = this.index++;
         return (T)var1;
      }

      @Override
      public void remove() {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.toRemove >= 0);
         if (RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.counts[this.toRemove] > 0) {
            RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.distinctElements--;
            RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.size = RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.size - RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.counts[this.toRemove];
            RIIHIHHCRHCHRCICHOROHCHIIHCICH.this.counts[this.toRemove] = 0;
         }

         this.toRemove = -1;
      }
   }
}
