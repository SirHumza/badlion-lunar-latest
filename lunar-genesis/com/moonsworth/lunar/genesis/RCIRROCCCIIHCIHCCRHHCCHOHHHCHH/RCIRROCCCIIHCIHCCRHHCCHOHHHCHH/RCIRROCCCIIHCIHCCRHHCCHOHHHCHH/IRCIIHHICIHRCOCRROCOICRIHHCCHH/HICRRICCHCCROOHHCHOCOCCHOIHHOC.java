package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class HICRRICCHCCROOHHCHOCOCCHOIHHOC {
   private HICRRICCHCCROOHHCHOCOCCHOIHHOC() {
   }

   public static IRRCCOICORICIHCHRHIHIHROIRHOCR<Object, String> HHIHRHOOIHOOROOCOCHOCRHRHRIHIO() {
      return HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.INSTANCE;
   }

   public static <E> IRRCCOICORICIHCHRHIHIHROIRHOCR<E, E> CCHIHOICHCRRCOHIIRHHCCIHIICIRI() {
      return HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.INSTANCE;
   }

   public static <K, V> IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> RCIROOOOICRHCCRRCIORHHIRCOIIIC(Map<K, V> var0) {
      return new HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH<>(var0);
   }

   public static <K, V> IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<K, ? extends V> var0, @Nullable V var1) {
      return new HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0, (V)var1);
   }

   public static <A, B, C> IRRCCOICORICIHCHRHIHIHROIRHOCR<A, C> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR<B, C> var0, IRRCCOICORICIHCHRHIHIHROIRHOCR<A, ? extends B> var1
   ) {
      return new HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(var0, var1);
   }

   public static <T> IRRCCOICORICIHCHRHIHIHROIRHOCR<T, Boolean> IRCIIHHICIHRCOCRROCOICRIHHCCHH(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<T> var0) {
      return new HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(var0);
   }

   public static <E> IRRCCOICORICIHCHRHIHIHROIRHOCR<Object, E> OIICIRRCOOCIHRHOIOIOOROCRHCHIC(@Nullable E var0) {
      return new HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>((E)var0);
   }

   public static <T> IRRCCOICORICIHCHRHIHIHROIRHOCR<Object, T> IRCIIHHICIHRCOCRROCOICRIHHCCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var0) {
      return new HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<>(var0);
   }

   private static class CRRRICCRROCOHHOHIICIHORCOORRRH<K, V> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>, Serializable {
      final Map<K, V> ORICRIOHOIRHRCRROIOIRHIIRCRIHI;
      private static final long ORIORHRRIHIRHCICCRRIHICHHCHHCC = 0L;

      CRRRICCRROCOHHOHIICIHORCOORRRH(Map<K, V> var1) {
         this.ORICRIOHOIRHRCRROIOIRHIIRCRIHI = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      public V apply(@Nullable K var1) {
         Object var2 = this.ORICRIOHOIRHRCRROIOIRHIIRCRIHI.get(var1);
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var2 != null || this.ORICRIOHOIRHRCRROIOIRHIIRCRIHI.containsKey(var1), "Key '%s' not present in map", var1
         );
         return (V)var2;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH) {
            HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH)var1;
            return this.ORICRIOHOIRHRCRROIOIRHIIRCRIHI.equals(var2.ORICRIOHOIRHRCRROIOIRHIIRCRIHI);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.ORICRIOHOIRHRCRROIOIRHIIRCRIHI.hashCode();
      }

      @Override
      public String toString() {
         return "Functions.forMap(" + this.ORICRIOHOIRHRCRROIOIRHIIRCRIHI + ")";
      }
   }

   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<A, B, C> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<A, C>, Serializable {
      private final IRRCCOICORICIHCHRHIHIHROIRHOCR<B, C> ROOHHHIORCORRCHCHRRROOHOCCIIIC;
      private final IRRCCOICORICIHCHRHIHIHROIRHOCR<A, ? extends B> IORRRCCRRORHHOIROIOOIHOHCHIHHH;
      private static final long OIRHRCRIOOCRCOHIHHORIOCRCCRHOO = 0L;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRRCCOICORICIHCHRHIHIHROIRHOCR<B, C> var1, IRRCCOICORICIHCHRHIHIHROIRHOCR<A, ? extends B> var2) {
         this.ROOHHHIORCORRCHCHRRROOHOCCIIIC = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.IORRRCCRRORHHOIROIOOIHOHCHIHHH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      }

      @Override
      public C apply(@Nullable A var1) {
         return this.ROOHHHIORCORRCHCHRRROOHOCCIIIC.apply((B)this.IORRRCCRRORHHOIROIOOIHOHCHIHHH.apply((A)var1));
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH)) {
            return false;
         }

         HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
         return this.IORRRCCRRORHHOIROIOOIHOHCHIHHH.equals(var2.IORRRCCRRORHHOIROIOOIHOHCHIHHH)
            && this.ROOHHHIORCORRCHCHRRROOHOCCIIIC.equals(var2.ROOHHHIORCORRCHCHRRROOHOCCIIIC);
      }

      @Override
      public int hashCode() {
         return this.IORRRCCRRORHHOIROIOOIHOHCHIHHH.hashCode() ^ this.ROOHHHIORCORRCHCHRRROOHOCCIIIC.hashCode();
      }

      @Override
      public String toString() {
         return this.ROOHHHIORCORRCHCHRRROOHOCCIIIC + "(" + this.IORRRCCRRORHHOIROIOOIHOHCHIHHH + ")";
      }
   }

   private static class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<Object, T>, Serializable {
      private final HCHRIROHHHCORIOCROOCHRCIOROOCI<T> IIROHIHRIICOIRIOOROOCRCOHIOCII;
      private static final long HCRROOHRIHCOOICRIHHCIIHCHCCRIC = 0L;

      private HRCHROOHRIHCRCRHRIIROCIRHOIRHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<T> var1) {
         this.IIROHIHRIICOIRIOOROOCRCOHIOCII = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      public T apply(@Nullable Object var1) {
         return this.IIROHIHRIICOIRIOOROOCRCOHIOCII.get();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH) {
            HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1;
            return this.IIROHIHRIICOIRIOOROOCRCOHIOCII.equals(var2.IIROHIHRIICOIRIOOROOCRCOHIOCII);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.IIROHIHRIICOIRIOOROOCRCOHIOCII.hashCode();
      }

      @Override
      public String toString() {
         return "Functions.forSupplier(" + this.IIROHIHRIICOIRIOOROOCRCOHIOCII + ")";
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>, Serializable {
      final Map<K, ? extends V> HRRICOCOIRCRHIROHICOHOHRIHHOIO;
      final @Nullable V COCHHRHIORRRCIHRHICOOHHHCHOROH;
      private static final long CICHHRCIRCIIOCOOROCIIHRHCHRCII = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(Map<K, ? extends V> var1, @Nullable V var2) {
         this.HRRICOCOIRCRHIROHICOHOHRIHHOIO = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.COCHHRHIORRRCIHRHICOOHHHCHOROH = (V)var2;
      }

      @Override
      public V apply(@Nullable K var1) {
         Object var2 = this.HRRICOCOIRCRHIROHICOHOHRIHHOIO.get(var1);
         return (V)(var2 == null && !this.HRRICOCOIRCRHIROHICOHOHRIHHOIO.containsKey(var1) ? this.COCHHRHIORRRCIHRHICOOHHHCHOROH : var2);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH)) {
            return false;
         }

         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
         return this.HRRICOCOIRCRHIROHICOHOHRIHHOIO.equals(var2.HRRICOCOIRCRHIROHICOHOHRIHHOIO)
            && HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(this.COCHHRHIORRRCIHRHICOOHHHCHOROH, var2.COCHHRHIORRRCIHRHICOOHHHCHOROH);
      }

      @Override
      public int hashCode() {
         return HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(this.HRRICOCOIRCRHIROHICOHOHRIHHOIO, this.COCHHRHIORRRCIHRHICOOHHHCHOROH);
      }

      @Override
      public String toString() {
         return "Functions.forMap(" + this.HRRICOCOIRCRHIROHICOHOHRIHHOIO + ", defaultValue=" + this.COCHHRHIORRRCIHRHICOOHHHCHOROH + ")";
      }
   }

   private enum OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements IRRCCOICORICIHCHRHIHIHROIRHOCR<Object, String> {
      INSTANCE;

      public String apply(Object var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         return var1.toString();
      }

      @Override
      public String toString() {
         return "Functions.toStringFunction()";
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<Object, E>, Serializable {
      private final @Nullable E CCCRRCHOOCRROHOROIRROCIIICRRRI;
      private static final long ICHRHCHHCIHCCHHHCRRRHRCOHCHOIR = 0L;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable E var1) {
         this.CCCRRCHOOCRROHOROIRROCIIICRRRI = (E)var1;
      }

      @Override
      public E apply(@Nullable Object var1) {
         return this.CCCRRCHOOCRROHOROIRROCIIICRRRI;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            return HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(this.CCCRRCHOOCRROHOROIRROCIIICRRRI, var2.CCCRRCHOOCRROHOROIRROCIIICRRRI);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.CCCRRCHOOCRROHOROIRROCIIICRRRI == null ? 0 : this.CCCRRCHOOCRROHOROIRROCIIICRRRI.hashCode();
      }

      @Override
      public String toString() {
         return "Functions.constant(" + this.CCCRRCHOOCRROHOROIRROCIIICRRRI + ")";
      }
   }

   private static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<T> implements IRRCCOICORICIHCHRHIHIHROIRHOCR<T, Boolean>, Serializable {
      private final RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<T> OICORCHOIIICCCORCIOORRRHCHCHRO;
      private static final long IICOIRICCIOCCRHCOCRHIIHOHCCRCH = 0L;

      private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<T> var1) {
         this.OICORCHOIIICCCORCIOORRRHCHCHRO = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      public Boolean apply(@Nullable T var1) {
         return this.OICORCHOIIICCCORCIOORRRHCHCHRO.apply((T)var1);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI) {
            HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1;
            return this.OICORCHOIIICCCORCIOORRRHCHCHRO.equals(var2.OICORCHOIIICCCORCIOORRRHCHCHRO);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.OICORCHOIIICCCORCIOORRRHCHCHRO.hashCode();
      }

      @Override
      public String toString() {
         return "Functions.forPredicate(" + this.OICORCHOIIICCCORCIOORRRHCHCHRO + ")";
      }
   }

   private enum RRCRRCORICCHOHHIRCHIROOHIIOHCO implements IRRCCOICORICIHCHRHIHIHROIRHOCR<Object, Object> {
      INSTANCE;

      @Override
      public @Nullable Object apply(@Nullable Object var1) {
         return var1;
      }

      @Override
      public String toString() {
         return "Functions.identity()";
      }
   }
}
