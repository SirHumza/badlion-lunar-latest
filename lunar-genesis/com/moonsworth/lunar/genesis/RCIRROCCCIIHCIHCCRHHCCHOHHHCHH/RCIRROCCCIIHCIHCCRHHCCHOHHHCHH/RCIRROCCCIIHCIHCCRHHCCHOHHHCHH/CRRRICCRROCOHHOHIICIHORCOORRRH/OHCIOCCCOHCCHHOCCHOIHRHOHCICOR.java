package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
final class OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<E> extends HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<E> {
   static final OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<Comparable> IORCCRRIORCOIORORRRRRRRRIOROHC = new OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<>(
      COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH(), IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC()
   );
   private final transient COIRRRCIORROCHIROCHROCHICCICIC<E> HROOHIRRHRHCIHHRHHOHIICHCOCHRC;

   OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(COIRRRCIORROCHIROCHROCHICCICIC<E> var1, Comparator<? super E> var2) {
      super(var2);
      this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC = var1;
   }

   @Override
   Object[] internalArray() {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.internalArray();
   }

   @Override
   int internalArrayStart() {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.internalArrayStart();
   }

   @Override
   int internalArrayEnd() {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.internalArrayEnd();
   }

   @Override
   public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   @Override
   public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> ORRHCRICRICHOOIIIOORHRHCRRICOI() {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.RROORHRCHCRRRIHOOIHCRRRICORROO().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
   }

   @Override
   public Spliterator<E> spliterator() {
      return this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().spliterator();
   }

   @Override
   public void forEach(Consumer<? super E> var1) {
      this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.forEach(var1);
   }

   @Override
   public int size() {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.size();
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      try {
         return var1 != null && this.unsafeBinarySearch(var1) >= 0;
      } catch (ClassCastException var3) {
         return false;
      }
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      if (var1 instanceof CRIIOOIHIOHHRRRHIOROOCHCHHCCCI) {
         var1 = ((CRIIOOIHIOHHRRRHIOROOCHCHHCCCI)var1).elementSet();
      }

      if (IHHCHIIHOOHRROCRRRHHHCOOHCOORC.hasSameComparator(this.comparator(), var1) && var1.size() > 1) {
         IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var2 = this.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
         Iterator var3 = var1.iterator();
         if (!var2.hasNext()) {
            return false;
         }

         Object var4 = var3.next();
         Object var5 = var2.next();

         try {
            while (true) {
               int var6 = this.unsafeCompare(var5, var4);
               if (var6 < 0) {
                  if (!var2.hasNext()) {
                     return false;
                  }

                  var5 = var2.next();
               } else if (var6 == 0) {
                  if (!var3.hasNext()) {
                     return true;
                  }

                  var4 = var3.next();
               } else if (var6 > 0) {
                  return false;
               }
            }
         } catch (NullPointerException | ClassCastException var7) {
            return false;
         }
      } else {
         return super.containsAll(var1);
      }
   }

   private int unsafeBinarySearch(Object var1) {
      return Collections.binarySearch(this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC, (E)var1, this.unsafeComparator());
   }

   @Override
   boolean isPartialView() {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.isPartialView();
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.copyIntoArray(var1, var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Set)) {
         return false;
      }

      Set var2 = (Set)var1;
      if (this.size() != var2.size()) {
         return false;
      }

      if (this.isEmpty()) {
         return true;
      }

      if (IHHCHIIHOOHRROCRRRHHHCOOHCOORC.hasSameComparator(this.OCOOIHCCRRRHOCRIOOIRHICHOCHIIR, var2)) {
         Iterator var3 = var2.iterator();

         try {
            IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var4 = this.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

            while (var4.hasNext()) {
               Object var5 = var4.next();
               Object var6 = var3.next();
               if (var6 == null || this.unsafeCompare(var5, var6) != 0) {
                  return false;
               }
            }

            return true;
         } catch (ClassCastException var7) {
            return false;
         } catch (NoSuchElementException var8) {
            return false;
         }
      } else {
         return this.containsAll(var2);
      }
   }

   @Override
   public E first() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      } else {
         return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.get(0);
      }
   }

   @Override
   public E last() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      } else {
         return this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.get(this.size() - 1);
      }
   }

   @Override
   public E lower(E var1) {
      int var2 = this.headIndex((E)var1, false) - 1;
      return var2 == -1 ? null : this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.get(var2);
   }

   @Override
   public E floor(E var1) {
      int var2 = this.headIndex((E)var1, true) - 1;
      return var2 == -1 ? null : this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.get(var2);
   }

   @Override
   public E ceiling(E var1) {
      int var2 = this.tailIndex((E)var1, true);
      return var2 == this.size() ? null : this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.get(var2);
   }

   @Override
   public E higher(E var1) {
      int var2 = this.tailIndex((E)var1, false);
      return var2 == this.size() ? null : this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.get(var2);
   }

   @Override
   HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<E> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(E var1, boolean var2) {
      return this.OCCORIIORHORROHHROHHOORHIHRIOO(0, this.headIndex((E)var1, var2));
   }

   int headIndex(E var1, boolean var2) {
      int var3 = Collections.binarySearch(
         this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            (E)var1
         ),
         this.comparator()
      );
      if (var3 >= 0) {
         return var2 ? var3 + 1 : var3;
      } else {
         return ~var3;
      }
   }

   @Override
   HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var1, boolean var2, E var3, boolean var4) {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH((E)var1, var2).OOROOCCIRCCRHOIOIORIHCHHOOCCOR((E)var3, var4);
   }

   @Override
   HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<E> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(E var1, boolean var2) {
      return this.OCCORIIORHORROHHROHHOORHIHRIOO(this.tailIndex((E)var1, var2), this.size());
   }

   int tailIndex(E var1, boolean var2) {
      int var3 = Collections.binarySearch(
         this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            (E)var1
         ),
         this.comparator()
      );
      if (var3 >= 0) {
         return var2 ? var3 : var3 + 1;
      } else {
         return ~var3;
      }
   }

   Comparator<Object> unsafeComparator() {
      return this.OCOOIHCCRRRHOCRIOOIRHICHOCHIIR;
   }

   OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<E> OCCORIIORHORROHHROHHOORHIHRIOO(int var1, int var2) {
      if (var1 == 0 && var2 == this.size()) {
         return this;
      } else {
         return var1 < var2
            ? new OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<>(
               this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.HIHCHCORCCRCOHCRROHOHOOCHOROCC(var1, var2), this.OCOOIHCCRRRHOCRIOOIRHICHOCHIIR
            )
            : RIROICHCRROROHCCROOCCCCOCHCCRI(this.OCOOIHCCRRRHOCRIOOIRHICHOCHIIR);
      }
   }

   @Override
   int indexOf(@Nullable Object var1) {
      if (var1 == null) {
         return -1;
      }

      int var2;
      try {
         var2 = Collections.binarySearch(this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC, (E)var1, this.unsafeComparator());
      } catch (ClassCastException var4) {
         return -1;
      }

      return var2 >= 0 ? var2 : -1;
   }

   @Override
   COIRRRCIORROCHIROCHROCHICCICIC<E> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
      return this.size() <= 1 ? this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC : new HHIOCIRHCHIRHHRIRCHOIRORHCRCRI<>(this, this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC);
   }

   @Override
   HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH<E> ICOHCHRICRIICHHOROCRIOCIHOCHIR() {
      Comparator var1 = Collections.reverseOrder(this.OCOOIHCCRRRHOCRIOOIRHICHOCHIIR);
      return this.isEmpty()
         ? RIROICHCRROROHCCROOCCCCOCHCCRI(var1)
         : new OHCIOCCCOHCCHHOCCHOIHRHOHCICOR<>(this.HROOHIRRHRHCIHHRHHOHIICHCOCHRC.RROORHRCHCRRRIHOOIHCRRRICORROO(), var1);
   }
}
