package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class CCIHHRIOOOOCOHRCIHOHROOICIORCC {
   private CCIHHRIOOOOCOHRCIHOHROOICIORCC() {
   }

   public static <F, T> HCHRIROHHHCORIOCROOCHRCIOROOCI<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, T> var0, HCHRIROHHHCORIOCROOCHRCIOROOCI<F> var1
   ) {
      return new CCIHHRIOOOOCOHRCIHOHROOICIORCC.CRRRICCRROCOHHOHIICIHORCOORRRH<>(var0, var1);
   }

   public static <T> HCHRIROHHHCORIOCROOCHRCIOROOCI<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var0) {
      if (!(var0 instanceof CCIHHRIOOOOCOHRCIHOHROOICIORCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH)
         && !(var0 instanceof CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH)) {
         return var0 instanceof Serializable
            ? new CCIHHRIOOOOCOHRCIHOHROOICIORCC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0)
            : new CCIHHRIOOOOCOHRCIHOHROOICIORCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(var0);
      } else {
         return var0;
      }
   }

   public static <T> HCHRIROHHHCORIOCROOCHRCIOROOCI<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var0, long var1, TimeUnit var3) {
      return new CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0, var1, var3);
   }

   public static <T> HCHRIROHHHCORIOCROOCHRCIOROOCI<T> RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(@Nullable T var0) {
      return new CCIHHRIOOOOCOHRCIHOHROOICIORCC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<>((T)var0);
   }

   public static <T> HCHRIROHHHCORIOCROOCHRCIOROOCI<T> CRRRICCRROCOHHOHIICIHORCOORRRH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var0) {
      return new CCIHHRIOOOOCOHRCIHOHROOICIORCC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<>(var0);
   }

   public static <T> IRRCCOICORICIHCHRHIHIHROIRHOCR<HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, T> HIOCIHHIOCOCCICCOIRRHHIRCIOIII() {
      return CCIHHRIOOOOCOHRCIHOHROOICIORCC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.INSTANCE;
   }

   private static class CRRRICCRROCOHHOHIICIHORCOORRRH<F, T> implements HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, Serializable {
      final IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, T> COIROCCOHHRRCRROIHRRIIRCIOCROH;
      final HCHRIROHHHCORIOCROOCHRCIOROOCI<F> ORRCHIIIRRHIORHHOHRCHHCHOCOCCR;
      private static final long HHORIROCOHOHCCOOCHCHROIHHCCRRH = 0L;

      CRRRICCRROCOHHOHIICIHORCOORRRH(IRRCCOICORICIHCHRHIHIHROIRHOCR<? super F, T> var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<F> var2) {
         this.COIROCCOHHRRCRROIHRRIIRCIOCROH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.ORRCHIIIRRHIORHHOHRCHHCHOCOCCR = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      }

      @Override
      public T get() {
         return this.COIROCCOHHRRCRROIHRRIIRCIOCROH.apply(this.ORRCHIIIRRHIORHHOHRCHHCHOCOCCR.get());
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof CCIHHRIOOOOCOHRCIHOHROOICIORCC.CRRRICCRROCOHHOHIICIHORCOORRRH)) {
            return false;
         }

         CCIHHRIOOOOCOHRCIHOHROOICIORCC.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (CCIHHRIOOOOCOHRCIHOHROOICIORCC.CRRRICCRROCOHHOHIICIHORCOORRRH)var1;
         return this.COIROCCOHHRRCRROIHRRIIRCIOCROH.equals(var2.COIROCCOHHRRCRROIHRRIIRCIOCROH)
            && this.ORRCHIIIRRHIORHHOHRCHHCHOCOCCR.equals(var2.ORRCHIIIRRHIORHHOHRCHHCHOCOCCR);
      }

      @Override
      public int hashCode() {
         return HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(this.COIROCCOHHRRCRROIHRRIIRCIOCROH, this.ORRCHIIIRRHIORHHOHRCHHCHOCOCCR);
      }

      @Override
      public String toString() {
         return "Suppliers.compose(" + this.COIROCCOHHRRCRROIHRRIIRCIOCROH + ", " + this.ORRCHIIIRRHIORHHOHRCHHCHOCOCCR + ")";
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> implements HCHRIROHHHCORIOCROOCHRCIOROOCI<T> {
      volatile HCHRIROHHHCORIOCROOCHRCIOROOCI<T> IORROHRCCCOOCIIIIRHIRRIOIICHOH;
      volatile boolean initialized;
      @Nullable T value;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var1) {
         this.IORROHRCCCOOCIIIIRHIRRIOIICHOH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      public T get() {
         if (!this.initialized) {
            synchronized (this) {
               if (!this.initialized) {
                  Object var2 = this.IORROHRCCCOOCIIIIRHIRRIOIICHOH.get();
                  this.value = (T)var2;
                  this.initialized = true;
                  this.IORROHRCCCOOCIIIIRHIRRIOIICHOH = null;
                  return (T)var2;
               }
            }
         }

         return this.value;
      }

      @Override
      public String toString() {
         Object var1 = this.IORROHRCCCOOCIIIIRHIRRIOIICHOH;
         return "Suppliers.memoize(" + (var1 == null ? "<supplier that returned " + this.value + ">" : var1) + ")";
      }
   }

   private static class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> implements HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, Serializable {
      final @Nullable T RORCIHHOHCCCOOORCCHOOCHHIRRHRC;
      private static final long OCROHOOCIIOIIOHCRIORIIRIIOCRRI = 0L;

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH(@Nullable T var1) {
         this.RORCIHHOHCCCOOORCCHOOCHHIRRHRC = (T)var1;
      }

      @Override
      public T get() {
         return this.RORCIHHOHCCCOOORCCHOOCHHIRRHRC;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof CCIHHRIOOOOCOHRCIHOHROOICIORCC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH) {
            CCIHHRIOOOOCOHRCIHOHROOICIORCC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = (CCIHHRIOOOOCOHRCIHOHROOICIORCC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1;
            return HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(this.RORCIHHOHCCCOOORCCHOOCHHIRRHRC, var2.RORCIHHOHCCCOOORCCHOOCHHIRRHRC);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(this.RORCIHHOHCCCOOORCCHOOCHHIRRHRC);
      }

      @Override
      public String toString() {
         return "Suppliers.ofInstance(" + this.RORCIHHOHCCCOOORCCHOOCHHIRRHRC + ")";
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, Serializable {
      final HCHRIROHHHCORIOCROOCHRCIOROOCI<T> HRRHROOOOROIOCCRIOORIRRIHCCIOH;
      transient volatile boolean initialized;
      transient @Nullable T value;
      private static final long CCCRROCRCHORIHHIRHOOOHCCCCRCRH = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var1) {
         this.HRRHROOOOROIOCCRIOORIRRIHCCIOH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      public T get() {
         if (!this.initialized) {
            synchronized (this) {
               if (!this.initialized) {
                  Object var2 = this.HRRHROOOOROIOCCRIOORIRRIHCCIOH.get();
                  this.value = (T)var2;
                  this.initialized = true;
                  return (T)var2;
               }
            }
         }

         return this.value;
      }

      @Override
      public String toString() {
         return "Suppliers.memoize(" + (this.initialized ? "<supplier that returned " + this.value + ">" : this.HRRHROOOOROIOCCRIOORIRRIHCCIOH) + ")";
      }
   }

   private static class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T> implements HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, Serializable {
      final HCHRIROHHHCORIOCROOCHRCIOROOCI<T> RICOHHHOHIHIRCIOIRRRRIIIIIRICR;
      private static final long HROOICIRHOIHHRIRRCRRRORROHIIHO = 0L;

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var1) {
         this.RICOHHHOHIHIRCIOIRRRRIIIIIRICR = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      public T get() {
         synchronized (this.RICOHHHOHIHIRCIOIRRRRIIIIIRICR) {
            return this.RICOHHHOHIHIRCIOIRRRRIIIIIRICR.get();
         }
      }

      @Override
      public String toString() {
         return "Suppliers.synchronizedSupplier(" + this.RICOHHHOHIHIRCIOIRRRRIIIIIRICR + ")";
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> implements HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, Serializable {
      final HCHRIROHHHCORIOCROOCHRCIOROOCI<T> IORROHRCCCOOCIIIIRHIRRIOIICHOH;
      final long HOOCOORRRCRHRCOORICCCOCHRROCOI;
      transient volatile @Nullable T value;
      transient volatile long expirationNanos;
      private static final long IRORIHCOHRIRORICRICOHHROROHCCH = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var1, long var2, TimeUnit var4) {
         this.IORROHRCCCOOCIIIIRHIRRIOIICHOH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.HOOCOORRRCRHRCOORICCCOCHRROCOI = var4.toNanos(var2);
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 > 0L, "duration (%s %s) must be > 0", var2, var4);
      }

      @Override
      public T get() {
         long var1 = this.expirationNanos;
         long var3 = ICICIOCHHHIHOCHCOHORIHRCOHHOCR.systemNanoTime();
         if (var1 == 0L || var3 - var1 >= 0L) {
            synchronized (this) {
               if (var1 == this.expirationNanos) {
                  Object var6 = this.IORROHRCCCOOCIIIIRHIRRIOIICHOH.get();
                  this.value = (T)var6;
                  var1 = var3 + this.HOOCOORRRCRHRCOORICCCOCHRROCOI;
                  this.expirationNanos = var1 == 0L ? 1L : var1;
                  return (T)var6;
               }
            }
         }

         return this.value;
      }

      @Override
      public String toString() {
         return "Suppliers.memoizeWithExpiration(" + this.IORROHRCCCOOCIIIIRHIRRIOIICHOH + ", " + this.HOOCOORRRCRHRCOORICCCOCHRROCOI + ", NANOS)";
      }
   }

   private enum RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements CCIHHRIOOOOCOHRCIHOHROOICIORCC.RRCRRCORICCHOHHIRCHIROOHIIOHCO<Object> {
      INSTANCE;

      public Object apply(HCHRIROHHHCORIOCROOCHRCIOROOCI<Object> var1) {
         return var1.get();
      }

      @Override
      public String toString() {
         return "Suppliers.supplierFunction()";
      }
   }

   private interface RRCRRCORICCHOHHIRCHIROOHIIOHCO<T> extends IRRCCOICORICIHCHRHIHIHROIRHOCR<HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, T> {
   }
}
