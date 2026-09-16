package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class ORHIOICIOCRRHOOCOHRORIHICHRCRR<E> extends AbstractList<List<E>> implements RandomAccess {
   private final transient COIRRRCIORROCHIROCHROCHICCICIC<List<E>> CCOCOCHORCROCCORORCHOHIRCIHHRO;
   private final transient int[] HRICORIRRIHICOROHIOIHCOHHRRHHH;

   static <E> List<List<E>> create(List<? extends List<? extends E>> var0) {
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = new COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.size());

      for (List var3 : var0) {
         COIRRRCIORROCHIROCHROCHICCICIC var4 = COIRRRCIORROCHIROCHROCHICCICIC.RIROICHCRROROHCCROOCCCCOCHCCRI(var3);
         if (var4.isEmpty()) {
            return COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
         }

         var1.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var4);
      }

      return new ORHIOICIOCRRHOOCOHRORIHICHRCRR<>(var1.IORRHROIIRHIIOOHCOOIRHOIHRHRHI());
   }

   ORHIOICIOCRRHOOCOHRORIHICHRCRR(COIRRRCIORROCHIROCHROCHICCICIC<List<E>> var1) {
      this.CCOCOCHORCROCCORORCHOHIRCIHHRO = var1;
      int[] var2 = new int[var1.size() + 1];
      var2[var1.size()] = 1;

      try {
         for (int var3 = var1.size() - 1; var3 >= 0; var3--) {
            var2[var3] = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.checkedMultiply(
               var2[var3 + 1], ((List)var1.get(var3)).size()
            );
         }
      } catch (ArithmeticException var4) {
         throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
      }

      this.HRICORIRRIHICOROHIOIHCOHHRRHHH = var2;
   }

   private int getAxisIndexForProductIndex(int var1, int var2) {
      return var1 / this.HRICORIRRIHICOROHIOIHCOHHRRHHH[var2 + 1] % this.CCOCOCHORCROCCORORCHOHIRCIHHRO.get(var2).size();
   }

   @Override
   public int indexOf(Object var1) {
      if (!(var1 instanceof List)) {
         return -1;
      }

      List var2 = (List)var1;
      if (var2.size() != this.CCOCOCHORCROCCORORCHOHIRCIHHRO.size()) {
         return -1;
      }

      ListIterator var3 = var2.listIterator();
      int var4 = 0;

      while (var3.hasNext()) {
         int var5 = var3.nextIndex();
         int var6 = this.CCOCOCHORCROCCORORCHOHIRCIHHRO.get(var5).indexOf(var3.next());
         if (var6 == -1) {
            return -1;
         }

         var4 += var6 * this.HRICORIRRIHICOROHIOIHCOHHRRHHH[var5 + 1];
      }

      return var4;
   }

   public COIRRRCIORROCHIROCHROCHICCICIC<E> CCORCOIOHCIIIROHIOROICIOIHCICC(final int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
         var1, this.size()
      );
      return new COIRRRCIORROCHIROCHROCHICCICIC<E>() {
         @Override
         public int size() {
            return ORHIOICIOCRRHOOCOHRORIHICHRCRR.this.CCOCOCHORCROCCORORCHOHIRCIHHRO.size();
         }

         @Override
         public E get(int var1x) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
               var1x, this.size()
            );
            int var2 = ORHIOICIOCRRHOOCOHRORIHICHRCRR.this.getAxisIndexForProductIndex(var1, var1x);
            return ORHIOICIOCRRHOOCOHRORIHICHRCRR.this.CCOCOCHORCROCCORORCHOHIRCIHHRO.get(var1x).get(var2);
         }

         @Override
         boolean isPartialView() {
            return true;
         }
      };
   }

   @Override
   public int size() {
      return this.HRICORIRRIHICOROHIOIHCOHHRRHHH[0];
   }

   @Override
   public boolean contains(@Nullable Object var1) {
      return this.indexOf(var1) != -1;
   }
}
