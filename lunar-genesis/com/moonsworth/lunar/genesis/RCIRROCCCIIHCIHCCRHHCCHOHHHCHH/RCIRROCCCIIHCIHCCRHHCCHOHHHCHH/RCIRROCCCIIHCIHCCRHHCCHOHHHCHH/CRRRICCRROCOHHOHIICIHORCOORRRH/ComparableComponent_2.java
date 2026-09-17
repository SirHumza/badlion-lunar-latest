package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class RCCCROCHCICCROHCOCCRRROCIIHCCH<C extends Comparable> implements Serializable, Comparable<RCCCROCHCICCROHCOCCRRROCIIHCCH<C>> {
   final @Nullable C OCHOCOCRHCORCHRICHOIHIIOCOICRH;
   private static final long HRIIRHOOCIIRIIRCOOIOCOHOHCIRCC = 0L;

   RCCCROCHCICCROHCOCCRRROCIIHCCH(@Nullable C var1) {
      this.OCHOCOCRHCORCHRICHOIHIIOCOICRH = (C)var1;
   }

   abstract boolean isLessThan(C var1);

   abstract IOIICIRIICICIIOORHCIIIIRRIHRHI CHCCROOHCIRCRCRHRIORCRCCHRIOIH();

   abstract IOIICIRIICICIIOORHCIIIIRRIHRHI RRHHOOICOIRCICHRCRORICHCICRORC();

   abstract RCCCROCHCICCROHCOCCRRROCIIHCCH<C> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var2);

   abstract RCCCROCHCICCROHCOCCRRROCIIHCCH<C> IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var2);

   abstract void describeAsLowerBound(StringBuilder var1);

   abstract void describeAsUpperBound(StringBuilder var1);

   abstract C RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1);

   abstract C IRCIIHHICIHRCOCRROCOICRIHHCCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1);

   RCCCROCHCICCROHCOCCRRROCIIHCCH<C> HHCCIRHCCCIIRHCROHIORHIRHHIORH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1) {
      return this;
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCCROCHCICCROHCOCCRRROCIIHCCH<C> var1) {
      if (var1 == OHICORHHOHIHHRRHIOOHOROICOCCIO()) {
         return 1;
      }

      if (var1 == CHOORICROROOCHCHOCOHRHRRRHCCRH()) {
         return -1;
      }

      int var2 = IIHROHOIOHICCRRHRICHCIHRCROOIO.compareOrThrow(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH, var1.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
      return var2 != 0
         ? var2
         : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.compare(
            this instanceof RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH,
            var1 instanceof RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
         );
   }

   C endpoint() {
      return this.OCHOCOCRHCORCHRICHOIHIIOCOICRH;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof RCCCROCHCICCROHCOCCRRROCIIHCCH) {
         RCCCROCHCICCROHCOCCRRROCIIHCCH var2 = (RCCCROCHCICCROHCOCCRRROCIIHCCH)var1;

         try {
            int var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
            return var3 == 0;
         } catch (ClassCastException var4) {
         }
      }

      return false;
   }

   @Override
   public abstract int hashCode();

   static <C extends Comparable> RCCCROCHCICCROHCOCCRRROCIIHCCH<C> OHICORHHOHIHHRRHIOOHOROICOCCIO() {
      return RCCCROCHCICCROHCOCCRRROCIIHCCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOCIIHROIOHIOIHCORRCRRHHCHCRRI;
   }

   static <C extends Comparable> RCCCROCHCICCROHCOCCRRROCIIHCCH<C> CHOORICROROOCHCHOCOHRHRRRHCCRH() {
      return RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIIROCHHCCIHCOCIHCOOICIICICIOO;
   }

   static <C extends Comparable> RCCCROCHCICCROHCOCCRRROCIIHCCH<C> CRRRICCRROCOHHOHIICIHORCOORRRH(C var0) {
      return new RCCCROCHCICCROHCOCCRRROCIIHCCH.CRRRICCRROCOHHOHIICIHORCOORRRH<>((C)var0);
   }

   static <C extends Comparable> RCCCROCHCICCROHCOCCRRROCIIHCCH<C> RRCRRCORICCHOHHIRCHIROOHIIOHCO(C var0) {
      return new RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>((C)var0);
   }

   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH<C extends Comparable> extends RCCCROCHCICCROHCOCCRRROCIIHCCH<C> {
      private static final long CIHCRIHRRRIROROHROHOHHCIIRHHRH = 0L;

      CRRRICCRROCOHHOHIICIHORCOORRRH(C var1) {
         super(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               (C)var1
            )
         );
      }

      @Override
      boolean isLessThan(C var1) {
         return IIHROHOIOHICCRRHRICHCIHRCROOIO.compareOrThrow(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH, var1) <= 0;
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI CHCCROOHCIRCRCRHRIORCRCCHRIOIH() {
         return IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED;
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI RRHHOOICOIRCICHRCRORICHCICRORC() {
         return IOIICIRIICICIIOORHCIIIIRRIHRHI.OPEN;
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<C> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var2) {
         switch (var1) {
            case CLOSED:
               return this;
            case OPEN:
               Comparable var3 = var2.previous(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
               return var3 == null
                  ? RCCCROCHCICCROHCOCCRRROCIIHCCH.OHICORHHOHIHHRRHIOOHOROICOCCIO()
                  : new RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>((C)var3);
            default:
               throw new AssertionError();
         }
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<C> IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var2) {
         switch (var1) {
            case CLOSED:
               Comparable var3 = var2.previous(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
               return var3 == null
                  ? RCCCROCHCICCROHCOCCRRROCIIHCCH.CHOORICROROOCHCHOCOHRHRRRHCCRH()
                  : new RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>((C)var3);
            case OPEN:
               return this;
            default:
               throw new AssertionError();
         }
      }

      @Override
      void describeAsLowerBound(StringBuilder var1) {
         var1.append('[').append(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
      }

      @Override
      void describeAsUpperBound(StringBuilder var1) {
         var1.append(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH).append(')');
      }

      @Override
      C RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1) {
         return this.OCHOCOCRHCORCHRICHOIHIIOCOICRH;
      }

      @Override
      C IRCIIHHICIHRCOCRROCOICRIHHCCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1) {
         return (C)var1.previous(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
      }

      @Override
      public int hashCode() {
         return this.OCHOCOCRHCORCHRICHOIHIIOCOICRH.hashCode();
      }

      @Override
      public String toString() {
         return "\\" + this.OCHOCOCRHCORCHRICHOIHIIOCOICRH + "/";
      }
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> {
      private static final RCCCROCHCICCROHCOCCRRROCIIHCCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH IOCIIHROIOHIOIHCORRCRRHHCHCRRI = new RCCCROCHCICCROHCOCCRRROCIIHCCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      private static final long IICOCCHCHOOHHORCOIIOOORCOICIIR = 0L;

      private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(null);
      }

      @Override
      Comparable<?> endpoint() {
         throw new IllegalStateException("range unbounded on this side");
      }

      @Override
      boolean isLessThan(Comparable<?> var1) {
         return true;
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI CHCCROOHCIRCRCRHRIORCRCCHRIOIH() {
         throw new IllegalStateException();
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI RRHHOOICOIRCICHRCRORICHCICRORC() {
         throw new AssertionError("this statement should be unreachable");
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var2
      ) {
         throw new IllegalStateException();
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var2
      ) {
         throw new AssertionError("this statement should be unreachable");
      }

      @Override
      void describeAsLowerBound(StringBuilder var1) {
         var1.append("(-∞");
      }

      @Override
      void describeAsUpperBound(StringBuilder var1) {
         throw new AssertionError();
      }

      @Override
      Comparable<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var1) {
         return var1.minValue();
      }

      @Override
      Comparable<?> IRCIIHHICIHRCOCRROCOICRIHHCCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var1) {
         throw new AssertionError();
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> HHCCIRHCCCIIRHCROHIORHIRHHIORH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var1) {
         try {
            return RCCCROCHCICCROHCOCCRRROCIIHCCH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.minValue());
         } catch (NoSuchElementException var3) {
            return this;
         }
      }

      @Override
      public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> var1) {
         return var1 == this ? 0 : -1;
      }

      @Override
      public int hashCode() {
         return System.identityHashCode(this);
      }

      @Override
      public String toString() {
         return "-∞";
      }

      private Object readResolve() {
         return IOCIIHROIOHIOIHCORRCRRHHCHCRRI;
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<C extends Comparable> extends RCCCROCHCICCROHCOCCRRROCIIHCCH<C> {
      private static final long ICICHCOHCICICROIRIICROCIICCOII = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(C var1) {
         super(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               (C)var1
            )
         );
      }

      @Override
      boolean isLessThan(C var1) {
         return IIHROHOIOHICCRRHRICHCIHRCROOIO.compareOrThrow(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH, var1) < 0;
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI CHCCROOHCIRCRCRHRIORCRCCHRIOIH() {
         return IOIICIRIICICIIOORHCIIIIRRIHRHI.OPEN;
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI RRHHOOICOIRCICHRCRORICHCICRORC() {
         return IOIICIRIICICIIOORHCIIIIRRIHRHI.CLOSED;
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<C> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var2) {
         switch (var1) {
            case CLOSED:
               Comparable var3 = var2.next(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
               return var3 == null ? RCCCROCHCICCROHCOCCRRROCIIHCCH.OHICORHHOHIHHRRHIOOHOROICOCCIO() : CRRRICCRROCOHHOHIICIHORCOORRRH((C)var3);
            case OPEN:
               return this;
            default:
               throw new AssertionError();
         }
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<C> IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var2) {
         switch (var1) {
            case CLOSED:
               return this;
            case OPEN:
               Comparable var3 = var2.next(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
               return var3 == null ? RCCCROCHCICCROHCOCCRRROCIIHCCH.CHOORICROROOCHCHOCOHRHRRRHCCRH() : CRRRICCRROCOHHOHIICIHORCOORRRH((C)var3);
            default:
               throw new AssertionError();
         }
      }

      @Override
      void describeAsLowerBound(StringBuilder var1) {
         var1.append('(').append(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
      }

      @Override
      void describeAsUpperBound(StringBuilder var1) {
         var1.append(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH).append(']');
      }

      @Override
      C RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1) {
         return (C)var1.next(this.OCHOCOCRHCORCHRICHOIHIIOCOICRH);
      }

      @Override
      C IRCIIHHICIHRCOCRROCOICRIHHCCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1) {
         return this.OCHOCOCRHCORCHRICHOIHIIOCOICRH;
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<C> HHCCIRHCCCIIRHCROHIORHIRHHIORH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<C> var1) {
         Comparable var2 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
         return var2 != null ? CRRRICCRROCOHHOHIICIHORCOORRRH((C)var2) : RCCCROCHCICCROHCOCCRRROCIIHCCH.CHOORICROROOCHCHOCOHRHRRRHCCRH();
      }

      @Override
      public int hashCode() {
         return ~this.OCHOCOCRHCORCHRICHOIHIIOCOICRH.hashCode();
      }

      @Override
      public String toString() {
         return "/" + this.OCHOCOCRHCORCHRICHOIHIIOCOICRH + "\\";
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> {
      private static final RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIIROCHHCCIHCOCIHCOOICIICICIOO = new RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      private static final long HIIOCHOIOIORIHHIHHICIICOCHOHIH = 0L;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(null);
      }

      @Override
      Comparable<?> endpoint() {
         throw new IllegalStateException("range unbounded on this side");
      }

      @Override
      boolean isLessThan(Comparable<?> var1) {
         return false;
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI CHCCROOHCIRCRCRHRIORCRCCHRIOIH() {
         throw new AssertionError("this statement should be unreachable");
      }

      @Override
      IOIICIRIICICIIOORHCIIIIRRIHRHI RRHHOOICOIRCICHRCRORICHCICRORC() {
         throw new IllegalStateException();
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var2
      ) {
         throw new AssertionError("this statement should be unreachable");
      }

      @Override
      RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         IOIICIRIICICIIOORHCIIIIRRIHRHI var1, CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var2
      ) {
         throw new IllegalStateException();
      }

      @Override
      void describeAsLowerBound(StringBuilder var1) {
         throw new AssertionError();
      }

      @Override
      void describeAsUpperBound(StringBuilder var1) {
         var1.append("+∞)");
      }

      @Override
      Comparable<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var1) {
         throw new AssertionError();
      }

      @Override
      Comparable<?> IRCIIHHICIHRCOCRROCOICRIHHCCHH(CCHHCIRHICHHHHRRIHIORCCORCCIHR<Comparable<?>> var1) {
         return var1.maxValue();
      }

      @Override
      public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCCROCHCICCROHCOCCRRROCIIHCCH<Comparable<?>> var1) {
         return var1 == this ? 0 : 1;
      }

      @Override
      public int hashCode() {
         return System.identityHashCode(this);
      }

      @Override
      public String toString() {
         return "+∞";
      }

      private Object readResolve() {
         return RIIROCHHCCIHCOCIHCOOICIICICIOO;
      }
   }
}
