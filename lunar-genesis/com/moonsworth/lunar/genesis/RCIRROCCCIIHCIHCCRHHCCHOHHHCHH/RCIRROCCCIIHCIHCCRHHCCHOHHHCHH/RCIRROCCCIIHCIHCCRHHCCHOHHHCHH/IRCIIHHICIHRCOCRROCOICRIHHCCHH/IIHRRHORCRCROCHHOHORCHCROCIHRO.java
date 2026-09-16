package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import java.util.function.BiPredicate;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO<T> implements BiPredicate<T, T> {
   protected IIHRRHORCRCROCHHOHORCHCROCIHRO() {
   }

   public final boolean IHHCHHHCRIHOOCOIOOCRIIICIOROIR(@Nullable T var1, @Nullable T var2) {
      if (var1 == var2) {
         return true;
      } else {
         return var1 != null && var2 != null ? this.doEquivalent((T)var1, (T)var2) : false;
      }
   }

   @Deprecated
   @Override
   public final boolean test(@Nullable T var1, @Nullable T var2) {
      return this.IHHCHHHCRIHOOCOIOOCRIIICIOROIR((T)var1, (T)var2);
   }

   @ForOverride
   protected abstract boolean doEquivalent(T var1, T var2);

   public final int ICOHIIIRCIORCORHRRROOOOCOOROIC(@Nullable T var1) {
      return var1 == null ? 0 : this.doHash((T)var1);
   }

   @ForOverride
   protected abstract int doHash(T var1);

   public final <F> IIHRRHORCRCROCHHOHORCHCROCIHRO<F> IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<F, ? extends T> var1) {
      return new RICRIRRCOHRCOCRRHHCRHRROOIOHHR<>(var1, this);
   }

   public final <S extends T> IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH<S> RCOCOHHCOOICCICCRCCORORROHRCCC(@Nullable S var1) {
      return new IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH<>(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      serializable = true
   )
   public final <S extends T> IIHRRHORCRCROCHHOHORCHCROCIHRO<Iterable<S>> OICCOHOCRRIIRHIORHCIRRIRHIHROO() {
      return new RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<>(this);
   }

   public final RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<T> IORRORCRRHRRORHIRHRROHCRRIHRII(@Nullable T var1) {
      return new IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(this, (T)var1);
   }

   public static IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> CIROHOCCIIIOCHRRRCRRHIORRICIOR() {
      return IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIOHHIOICCCRIOHCCIHCRHHRIIRIO;
   }

   public static IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> OHCRHOHOICICOCCHCCHIHRRCICIHRR() {
      return IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICCCHORRCORCCOOIHHRICRHCHROHC;
   }

   public static final class CRRRICCRROCOHHOHIICIHORCOORRRH<T> implements Serializable {
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> HRRRRCRICHICRHRHCHHHCCCIHHHROC;
      private final @Nullable T OOIOCCRIOOCOHOHRHROICHICHROCOH;
      private static final long OCCOCICIIHHCCRIHIROOOCOIIOOHCR = 0L;

      private CRRRICCRROCOHHOHIICIHORCOORRRH(IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var1, @Nullable T var2) {
         this.HRRRRCRICHICRHRHCHHHCCCIHHHROC = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.OOIOCCRIOOCOHOHRHROICHICHROCOH = (T)var2;
      }

      public @Nullable T get() {
         return this.OOIOCCRIOOCOHOHRHROICHICHROCOH;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH) {
            IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH)var1;
            if (this.HRRRRCRICHICRHRHCHHHCCCIHHHROC.equals(var2.HRRRRCRICHICRHRHCHHHCCCIHHHROC)) {
               IIHRRHORCRCROCHHOHORCHCROCIHRO var3 = this.HRRRRCRICHICRHRHCHHHCCCIHHHROC;
               return var3.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(this.OOIOCCRIOOCOHOHRHROICHICHROCOH, var2.OOIOCCRIOOCOHOHRHROICHICHROCOH);
            }
         }

         return false;
      }

      @Override
      public int hashCode() {
         return this.HRRRRCRICHICRHRHCHHHCCCIHHHROC.ICOHIIIRCIORCORHRRROOOOCOOROIC(this.OOIOCCRIOOCOHOHRHROICHICHROCOH);
      }

      @Override
      public String toString() {
         return this.HRRRRCRICHICRHRHCHHHCCCIHHHROC + ".wrap(" + this.OOIOCCRIOOCOHOHRHROICHICHROCOH + ")";
      }
   }

   static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> implements Serializable {
      static final IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH RICCCHORRCORCCOOIHHRICRHCHROHC = new IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      private static final long RCHICCROOOCHIHCCROIHHRIRORRCHR = 1L;

      @Override
      protected boolean doEquivalent(Object var1, Object var2) {
         return false;
      }

      @Override
      protected int doHash(Object var1) {
         return System.identityHashCode(var1);
      }

      private Object readResolve() {
         return RICCCHORRCORCCOOIHHRICRHCHROHC;
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<T>, Serializable {
      private final IIHRRHORCRCROCHHOHORCHCROCIHRO<T> HOHRRCHHHHCHCRHCRHIHHRORICHRHO;
      private final @Nullable T COORHROROICIHCHHHORIIIIRRRROOI;
      private static final long HCICICCOICRCIRROHIOIIIOOHROCRO = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIHRRHORCRCROCHHOHORCHCROCIHRO<T> var1, @Nullable T var2) {
         this.HOHRRCHHHHCHCRHCRHIHHRORICHRHO = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.COORHROROICIHCHHHORIIIIRRRROOI = (T)var2;
      }

      @Override
      public boolean apply(@Nullable T var1) {
         return this.HOHRRCHHHHCHCRHCRHIHHRORICHRHO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR((T)var1, this.COORHROROICIHCHHHORIIIIRRRROOI);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)) {
            return false;
         }

         IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = (IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
         return this.HOHRRCHHHHCHCRHCRHIHHRORICHRHO.equals(var2.HOHRRCHHHHCHCRHCRHIHHRORICHRHO)
            && HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(this.COORHROROICIHCHHHORIIIIRRRROOI, var2.COORHROROICIHCHHHORIIIIRRRROOI);
      }

      @Override
      public int hashCode() {
         return HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(this.HOHRRCHHHHCHCRHCRHIHHRORICHRHO, this.COORHROROICIHCHHHORIIIIRRRROOI);
      }

      @Override
      public String toString() {
         return this.HOHRRCHHHHCHCRHCRHIHHRORICHRHO + ".equivalentTo(" + this.COORHROROICIHCHHHORIIIIRRRROOI + ")";
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> implements Serializable {
      static final IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHIOHHIOICCCRIOHCCIHCRHHRIIRIO = new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      private static final long ORCROCORIHHRHORICOOORRHCHCIHIR = 1L;

      @Override
      protected boolean doEquivalent(Object var1, Object var2) {
         return var1.equals(var2);
      }

      @Override
      protected int doHash(Object var1) {
         return var1.hashCode();
      }

      private Object readResolve() {
         return IHIOHHIOICCCRIOHCCIHCRHHRIIRIO;
      }
   }
}
