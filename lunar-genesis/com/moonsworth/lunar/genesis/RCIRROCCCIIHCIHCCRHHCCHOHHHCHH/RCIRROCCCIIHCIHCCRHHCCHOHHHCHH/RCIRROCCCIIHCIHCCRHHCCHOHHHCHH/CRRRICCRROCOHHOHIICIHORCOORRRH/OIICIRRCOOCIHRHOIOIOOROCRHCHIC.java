package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use ImmutableList.of or another implementation")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public abstract class OIICIRRCOOCIHRHOIOIOOROCRHCHIC<E> extends AbstractCollection<E> implements Serializable {
   static final int OOHHHHCCHIIHOCROOROHHICCOHHCCI = 1296;
   private static final Object[] RHHCOOHRHICOCIIHHRCIICHICRRHCH = new Object[0];

   OIICIRRCOOCIHRHOIOIOOROCRHCHIC() {
   }

   public abstract IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

   @Override
   public Spliterator<E> spliterator() {
      return Spliterators.spliterator(this, 1296);
   }

   @Override
   public final Object[] toArray() {
      return this.toArray(RHHCOOHRHICOCIIHHRCIICHICRRHCH);
   }

   @CanIgnoreReturnValue
   @Override
   public final <T> T[] toArray(T[] var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      int var2 = this.size();
      if (var1.length < var2) {
         Object[] var3 = this.internalArray();
         if (var3 != null) {
            return (T[])IHHRRRRCOCHIIOIOHORHCIRRRCHCCR.copy(var3, this.internalArrayStart(), this.internalArrayEnd(), var1);
         }

         var1 = IOHCCIRCCICICHHHIOIOHCICICROIO.newArray(var1, var2);
      } else if (var1.length > var2) {
         var1[var2] = null;
      }

      this.copyIntoArray(var1, 0);
      return (T[])var1;
   }

   Object @Nullable [] internalArray() {
      return null;
   }

   int internalArrayStart() {
      throw new UnsupportedOperationException();
   }

   int internalArrayEnd() {
      throw new UnsupportedOperationException();
   }

   @Override
   public abstract boolean contains(@Nullable Object var1);

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean add(E var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean addAll(Collection<? extends E> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean removeAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final boolean removeIf(Predicate<? super E> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final boolean retainAll(Collection<?> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public final void clear() {
      throw new UnsupportedOperationException();
   }

   public COIRRRCIORROCHIROCHROCHICCICIC<E> OHOOIHCOHHORHICHIOROIRIHCOOCRR() {
      switch (this.size()) {
         case 0:
            return COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
         case 1:
            return COIRRRCIORROCHIROCHROCHICCICIC.HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(this.IOHOCICRRIRHHCCCRICOCOHOIIOCRH().next());
         default:
            return new RRCIRIHRCIOOICCCHOIHOCIRCHHIII<>(this, this.toArray());
      }
   }

   abstract boolean isPartialView();

   @CanIgnoreReturnValue
   int copyIntoArray(Object[] var1, int var2) {
      IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var3 = this.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

      while (var3.hasNext()) {
         Object var4 = var3.next();
         var1[var2++] = var4;
      }

      return var2;
   }

   Object writeReplace() {
      return new COIRRRCIORROCHIROCHROCHICCICIC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.toArray());
   }

   @DoNotMock
   public abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> {
      static final int ICHICRCCCORCCROCCHHROIORORHCRO = 4;

      static int expandedCapacity(int var0, int var1) {
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

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @CanIgnoreReturnValue
      public abstract OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> HOCCCIICRCIIIIRHHICOCOOIICHIOR(E var1);

      @CanIgnoreReturnValue
      public OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RHOCHHIRRCHHHOHOIRROIROHHHIHIO(E... var1) {
         for (Object var5 : var1) {
            this.HOCCCIICRCIIIIRHHICOCOOIICHIOR((E)var5);
         }

         return this;
      }

      @CanIgnoreReturnValue
      public OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> RICRIRRCOHRCOCRRHHCRHRROOIOHHR(Iterable<? extends E> var1) {
         for (Object var3 : var1) {
            this.HOCCCIICRCIIIIRHHICOCOOIICHIOR((E)var3);
         }

         return this;
      }

      @CanIgnoreReturnValue
      public OIICIRRCOOCIHRHOIOIOOROCRHCHIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Iterator<? extends E> var1) {
         while (var1.hasNext()) {
            this.HOCCCIICRCIIIIRHHICOCOOIICHIOR((E)var1.next());
         }

         return this;
      }

      public abstract OIICIRRCOOCIHRHOIOIOOROCRHCHIC<E> OIIIRCHOIOICRCIIRIROCIROOHIHOR();
   }
}
