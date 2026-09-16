package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<A, B> {
   private final boolean OIOCOHCHROOHCHCCRHCHIIHCOOHORC;
   @LazyInit
   private transient @Nullable CORCOCICIRIOHROHROIIOOHICCHCRR<B, A> CCROHHHRROHHHOHROCOIRHHRCROROR;

   protected CORCOCICIRIOHROHROIIOOHICCHCRR() {
      this(true);
   }

   CORCOCICIRIOHROHROIIOOHICCHCRR(boolean var1) {
      this.OIOCOHCHROOHCHCCRHCHIIHCOOHORC = var1;
   }

   @ForOverride
   protected abstract B doForward(A var1);

   @ForOverride
   protected abstract A doBackward(B var1);

   @CanIgnoreReturnValue
   public final @Nullable B ICCIIIRHHOOIHCCHIRRCRHICHIHRIH(@Nullable A var1) {
      return this.correctedDoForward((A)var1);
   }

   @Nullable B correctedDoForward(@Nullable A var1) {
      if (this.OIOCOHCHROOHCHCCRHCHIIHCOOHORC) {
         return var1 == null ? null : IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(this.doForward((A)var1));
      } else {
         return this.doForward((A)var1);
      }
   }

   @Nullable A correctedDoBackward(@Nullable B var1) {
      if (this.OIOCOHCHROOHCHCCRHCHIIHCOOHORC) {
         return var1 == null ? null : IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(this.doBackward((B)var1));
      } else {
         return this.doBackward((B)var1);
      }
   }

   @CanIgnoreReturnValue
   public Iterable<B> convertAll(final Iterable<? extends A> var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1, "fromIterable");
      return new Iterable<B>() {
         @Override
         public Iterator<B> iterator() {
            return new Iterator<B>() {
               private final Iterator<? extends A> OIRHOCCHRHHICCHCHICORHICCIIIRH = var1.iterator();

               @Override
               public boolean hasNext() {
                  return this.OIRHOCCHRHHICCHCHICORHICCIIIRH.hasNext();
               }

               @Override
               public B next() {
                  return (B)CORCOCICIRIOHROHROIIOOHICCHCRR.this.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH((A)this.OIRHOCCHRHHICCHCHICORHICCIIIRH.next());
               }

               @Override
               public void remove() {
                  this.OIRHOCCHRHHICCHCHICORHICCIIIRH.remove();
               }
            };
         }
      };
   }

   @CanIgnoreReturnValue
   public CORCOCICIRIOHROHROIIOOHICCHCRR<B, A> IORCHICCORHCOORICIHRIIROORHORH() {
      CORCOCICIRIOHROHROIIOOHICCHCRR var1 = this.CCROHHHRROHHHOHROCOIRHHRCROROR;
      return var1 == null
         ? (
            this.CCROHHHRROHHHOHROCOIRHHRCROROR = (CORCOCICIRIOHROHROIIOOHICCHCRR<B, A>)(new CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH<>(
               this
            ))
         )
         : var1;
   }

   public final <C> CORCOCICIRIOHROHROIIOOHICCHCRR<A, C> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR<B, C> var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   <C> CORCOCICIRIOHROHROIIOOHICCHCRR<A, C> IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR<B, C> var1) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(this, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1));
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public final @Nullable B apply(@Nullable A var1) {
      return this.ICCIIIRHHOOIHCCHIRRCRHICHIHRIH((A)var1);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return super.equals(var1);
   }

   public static <A, B> CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR<? super A, ? extends B> var0, IRRCCOICORICIHCHRHIHIHROIRHOCR<? super B, ? extends A> var1
   ) {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0, var1);
   }

   public static <T> CORCOCICIRIOHROHROIIOOHICCHCRR<T, T> OCHHIICCHRRORRCHRORRROIHIIOIHO() {
      return CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HOHHHHRHICOIRHHRIRRCIRHHROHORC;
   }

   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH<A, B> extends CORCOCICIRIOHROHROIIOOHICCHCRR<B, A> implements Serializable {
      final CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> OHIHHOCCRIICIOORIIHOHICOIOOORC;
      private static final long RHIHRIRHHROOHCOHHOCHHOCRRICCCO = 0L;

      CRRRICCRROCOHHOHIICIHORCOORRRH(CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> var1) {
         this.OHIHHOCCRIICIOORIIHOHICOIOOORC = var1;
      }

      @Override
      protected A doForward(B var1) {
         throw new AssertionError();
      }

      @Override
      protected B doBackward(A var1) {
         throw new AssertionError();
      }

      @Override
      @Nullable A correctedDoForward(@Nullable B var1) {
         return this.OHIHHOCCRIICIOORIIHOHICOIOOORC.correctedDoBackward((B)var1);
      }

      @Override
      @Nullable B correctedDoBackward(@Nullable A var1) {
         return this.OHIHHOCCRIICIOORIIHOHICOIOOORC.correctedDoForward((A)var1);
      }

      @Override
      public CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> IORCHICCORHCOORICIHRIIROORHORH() {
         return this.OHIHHOCCRIICIOORIIHOHICOIOOORC;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH) {
            CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1;
            return this.OHIHHOCCRIICIOORIIHOHICOIOOORC.equals(var2.OHIHHOCCRIICIOORIIHOHICOIOOORC);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return ~this.OHIHHOCCRIICIOORIIHOHICOIOOORC.hashCode();
      }

      @Override
      public String toString() {
         return this.OHIHHOCCRIICIOORIIHOHICOIOOORC + ".reverse()";
      }
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> extends CORCOCICIRIOHROHROIIOOHICCHCRR<T, T> implements Serializable {
      static final CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH<?> HOHHHHRHICOIRHHRIRRCIRHHROHORC = new CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      private static final long CCROOCHIHORCROCIRHOHOCHIIHIHII = 0L;

      @Override
      protected T doForward(T var1) {
         return (T)var1;
      }

      @Override
      protected T doBackward(T var1) {
         return (T)var1;
      }

      public CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> HIIOHCRRIOIIHRIRCOHRHOOOIHOROO() {
         return this;
      }

      @Override
      <S> CORCOCICIRIOHROHROIIOOHICCHCRR<T, S> IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR<T, S> var1) {
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1, "otherConverter");
      }

      @Override
      public String toString() {
         return "Converter.identity()";
      }

      private Object readResolve() {
         return HOHHHHRHICOIRHHRIRRCIRHHROHORC;
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<A, B> extends CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> implements Serializable {
      private final IRRCCOICORICIHCHRHIHIHROIRHOCR<? super A, ? extends B> CIOCOCRCOOOHCCHCIIRCCHOHRROIRI;
      private final IRRCCOICORICIHCHRHIHIHROIRHOCR<? super B, ? extends A> RIRROCHOOIOCHORRRRRRHCICCORIOI;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         IRRCCOICORICIHCHRHIHIHROIRHOCR<? super A, ? extends B> var1, IRRCCOICORICIHCHRHIHIHROIRHOCR<? super B, ? extends A> var2
      ) {
         this.CIOCOCRCOOOHCCHCIIRCCHOHRROIRI = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.RIRROCHOOIOCHORRRRRRHCICCORIOI = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      }

      @Override
      protected B doForward(A var1) {
         return (B)this.CIOCOCRCOOOHCCHCIIRCCHOHRROIRI.apply((A)var1);
      }

      @Override
      protected A doBackward(B var1) {
         return (A)this.RIRROCHOOIOCHORRRRRRHCICCORIOI.apply((B)var1);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)) {
            return false;
         }

         CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = (CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
         return this.CIOCOCRCOOOHCCHCIIRCCHOHRROIRI.equals(var2.CIOCOCRCOOOHCCHCIIRCCHOHRROIRI)
            && this.RIRROCHOOIOCHORRRRRRHCICCORIOI.equals(var2.RIRROCHOOIOCHORRRRRRHCICCORIOI);
      }

      @Override
      public int hashCode() {
         return this.CIOCOCRCOOOHCCHCIIRCCHOHRROIRI.hashCode() * 31 + this.RIRROCHOOIOCHORRRRRRHCICCORIOI.hashCode();
      }

      @Override
      public String toString() {
         return "Converter.from(" + this.CIOCOCRCOOOHCCHCIIRCCHOHRROIRI + ", " + this.RIRROCHOOIOCHORRRRRRHCICCORIOI + ")";
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<A, B, C> extends CORCOCICIRIOHROHROIIOOHICCHCRR<A, C> implements Serializable {
      final CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> RHHOIIOHHCOHIIOROIRRIHIICRCHRH;
      final CORCOCICIRIOHROHROIIOOHICCHCRR<B, C> IOIIIRIOIOCOHOCHIHROCOOOOICCIR;
      private static final long RCOCRCIRICRCOCORHHIIHCRRROIOIR = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR<A, B> var1, CORCOCICIRIOHROHROIIOOHICCHCRR<B, C> var2) {
         this.RHHOIIOHHCOHIIOROIRRIHIICRCHRH = var1;
         this.IOIIIRIOIOCOHOCHIHROCOOOOICCIR = var2;
      }

      @Override
      protected C doForward(A var1) {
         throw new AssertionError();
      }

      @Override
      protected A doBackward(C var1) {
         throw new AssertionError();
      }

      @Override
      @Nullable C correctedDoForward(@Nullable A var1) {
         return this.IOIIIRIOIOCOHOCHIHROCOOOOICCIR.correctedDoForward(this.RHHOIIOHHCOHIIOROIRRIHIICRCHRH.correctedDoForward((A)var1));
      }

      @Override
      @Nullable A correctedDoBackward(@Nullable C var1) {
         return this.RHHOIIOHHCOHIIOROIRRIHIICRCHRH.correctedDoBackward(this.IOIIIRIOIOCOHOCHIHROCOOOOICCIR.correctedDoBackward((C)var1));
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)) {
            return false;
         }

         CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         return this.RHHOIIOHHCOHIIOROIRRIHIICRCHRH.equals(var2.RHHOIIOHHCOHIIOROIRRIHIICRCHRH)
            && this.IOIIIRIOIOCOHOCHIHROCOOOOICCIR.equals(var2.IOIIIRIOIOCOHOCHIHROCOOOOICCIR);
      }

      @Override
      public int hashCode() {
         return 31 * this.RHHOIIOHHCOHIIOROIRRIHIICRCHRH.hashCode() + this.IOIIIRIOIOCOHOCHIHROCOOOOICCIR.hashCode();
      }

      @Override
      public String toString() {
         return this.RHHOIIOHHCOHIIOROIRRIHIICRCHRH + ".andThen(" + this.IOIIIRIOIOCOHOCHIHROCOOOOICCIR + ")";
      }
   }
}
