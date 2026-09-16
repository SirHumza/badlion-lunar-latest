package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public abstract class CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> extends RIROICHCRROROHCCROOCCCCOCHCCRI<K, V> implements Serializable {
   final transient OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, ? extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V>> ORCOHOCIHOOHICOIRCHHIRHOIHHOOI;
   final transient int RIHCHHRHOOROOROCOCCRHRHRRRHCCR;
   private static final long CCHIORRROROICRHHORROIHRHOCHHCH = 0L;

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> CORHOIRIRICORIOOCCORCRRROOCRCC() {
      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.CRROOIOCRCOHRHIIOIHOICIIHHHHCC();
   }

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> ORHIOICIOCRRHOOCOHRORIHICHRCRR(K var0, V var1) {
      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RIROICHCRROROHCCROOCCCCOCHCCRI((K)var0, (V)var1);
   }

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> RRCRRCORICCHOHHIRCHIROOHIIOHCO(K var0, V var1, K var2, V var3) {
      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.HHCCIRHCCCIIRHCROHIORHIRHHIORH((K)var0, (V)var1, (K)var2, (V)var3);
   }

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> RRCRRCORICCHOHHIRCHIROOHIIOHCO(K var0, V var1, K var2, V var3, K var4, V var5) {
      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.HHCCIRHCCCIIRHCROHIORHIRHHIORH((K)var0, (V)var1, (K)var2, (V)var3, (K)var4, (V)var5);
   }

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> RRCRRCORICCHOHHIRCHIROOHIIOHCO(K var0, V var1, K var2, V var3, K var4, V var5, K var6, V var7) {
      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.HHCCIRHCCCIIRHCROHIORHIRHHIORH((K)var0, (V)var1, (K)var2, (V)var3, (K)var4, (V)var5, (K)var6, (V)var7);
   }

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      K var0, V var1, K var2, V var3, K var4, V var5, K var6, V var7, K var8, V var9
   ) {
      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         (K)var0, (V)var1, (K)var2, (V)var3, (K)var4, (V)var5, (K)var6, (V)var7, (K)var8, (V)var9
      );
   }

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> RIIOOHRCOIRCHICCHOIRICOIHIICRI() {
      return new CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>();
   }

   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var0) {
      if (var0 instanceof CIHCOICOOICHOCCHICIHRCOCIHRIOC) {
         CIHCOICOOICHOCCHICIHRCOCIHRIOC var1 = (CIHCOICOOICHOCCHICIHRCOCIHRIOC)var0;
         if (!var1.isPartialView()) {
            return var1;
         }
      }

      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <K, V> CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> IHCRORHRORIICHRHRCHRRIRRHHOCOO(Iterable<? extends Entry<? extends K, ? extends V>> var0) {
      return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.IOIICIRIICICIIOORHCIIIIRRIHRHI(var0);
   }

   CIHCOICOOICHOCCHICIHRCOCIHRIOC(OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, ? extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V>> var1, int var2) {
      this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI = var1;
      this.RIHCHHRHOOROOROCOCCRHRHRRRHCCR = var2;
   }

   @Deprecated
   @CanIgnoreReturnValue
   public OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(Object var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   public OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(K var1, Iterable<? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   public abstract OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(K var1);

   public abstract CIHCOICOOICHOCCHICIHRCOCIHRIOC<V, K> IOIOHIRCIHOCRRRCIHRRROROCIHCHO();

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public boolean put(K var1, V var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public boolean putAll(K var1, Iterable<? extends V> var2) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var1) {
      throw new UnsupportedOperationException();
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public boolean remove(Object var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   boolean isPartialView() {
      return this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI.isPartialView();
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI.containsKey(var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return var1 != null && super.containsValue(var1);
   }

   @Override
   public int size() {
      return this.RIHCHHRHOOROOROCOCCRHRHRRRHCCR;
   }

   public CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> RORCHHOHICRHCCIRRORIHCCOCRHOCO() {
      return this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI.RORCHHOHICRHCCIRRORIHCCOCRHOCO();
   }

   @Override
   Set<K> createKeySet() {
      throw new AssertionError("unreachable");
   }

   public OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, Collection<V>> COOOOHRCIOICOHCHCRIOIRORCHOOOR() {
      return (OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, Collection<V>>)this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI;
   }

   @Override
   Map<K, Collection<V>> createAsMap() {
      throw new AssertionError("should never be called");
   }

   public OIICIRRCOOCIHRHOIOIOOROCRHCHIC<Entry<K, V>> OICCHCIIHORIORRRIOIOCCCRHCCCIH() {
      return (OIICIRRCOOCIHRHOIOIOOROCRHCHIC<Entry<K, V>>)super.entries();
   }

   OIICIRRCOOCIHRHOIOIOOROCRHCHIC<Entry<K, V>> CHCHHCORICOICHRIOOCHHROHOICHCH() {
      return new CIHCOICOOICHOCCHICIHRCOCIHRIOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(this);
   }

   IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>> HCRRIORCRRIORHRCIOHHCIHORRCHII() {
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>>() {
         final Iterator<? extends Entry<K, ? extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V>>> COHRCHHCOCIRHRRRRIIIHHICRCRORC = CIHCOICOOICHOCCHICIHRCOCIHRIOC.this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI
            .RIICCCOHIOHOIIRHCIIOOCRCCHORCC()
            .IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
         Object currentKey = null;
         Iterator<V> valueItr = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.HICCIROIRICHHOCICHCIOOROHHIOOR();

         @Override
         public boolean hasNext() {
            return this.valueItr.hasNext() || this.COHRCHHCOCIRHRRRRIIIHHICRCRORC.hasNext();
         }

         public Entry<K, V> next() {
            if (!this.valueItr.hasNext()) {
               Entry var1 = this.COHRCHHCOCIRHRRRRIIIHHICRCRORC.next();
               this.currentKey = var1.getKey();
               this.valueItr = ((OIICIRRCOOCIHRHOIOIOOROCRHCHIC)var1.getValue()).IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
            }

            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)this.currentKey, this.valueItr.next());
         }
      };
   }

   @Override
   Spliterator<Entry<K, V>> entrySpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMap(this.COOOOHRCIOICOHCHCRIOIRORCHOOOR().RIICCCOHIOHOIIRHCIIOOCRCCHORCC().spliterator(), var0 -> {
         Object var1 = var0.getKey();
         Collection var2 = var0.getValue();
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(var2.spliterator(), var1x -> ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var1, (V)var1x));
      }, 64 | (this instanceof RCRCCORIIOICRIIRHCCIIOCICRHIOC ? 1 : 0), this.size());
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.COOOOHRCIOICOHCHCRIOIRORCHOOOR().forEach((var1x, var2) -> var2.forEach(var2x -> var1.accept(var1x, var2x)));
   }

   public HOCCCIICRCIIIIRHHICOCOOIICHIOR<K> CHHIIHIOIOCOORCRIHIIROCHROOICO() {
      return (HOCCCIICRCIIIIRHHICOCOOIICHIOR<K>)super.IOOOCHROIROHCCROIOICROCIIOOIOO();
   }

   HOCCCIICRCIIIIRHHICOCOOIICHIOR<K> HRCOCHIRHHHICOHRIROROICCIHIORO() {
      return new CIHCOICOOICHOCCHICIHRCOCIHRIOC.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> CHHRCOCOHHIROCIHROIOOCOICCCHRC() {
      return (OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V>)super.values();
   }

   OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> ROIOIICCRHHHCHIHHIRIRRHHRHCROC() {
      return new CIHCOICOOICHOCCHICIHRCOCIHRIOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(this);
   }

   IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<V> ORORIIRIHCIHCRCHCHRRIRHCHRHCIR() {
      return new IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<V>() {
         Iterator<? extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V>> valueCollectionItr = CIHCOICOOICHOCCHICIHRCOCIHRIOC.this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI
            .CHHRCOCOHHIROCIHROIOOCOICCCHRC()
            .IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
         Iterator<V> valueItr = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.HICCIROIRICHHOCICHCIOOROHHIOOR();

         @Override
         public boolean hasNext() {
            return this.valueItr.hasNext() || this.valueCollectionItr.hasNext();
         }

         @Override
         public V next() {
            if (!this.valueItr.hasNext()) {
               this.valueItr = this.valueCollectionItr.next().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
            }

            return this.valueItr.next();
         }
      };
   }

   class CRRRICCRROCOHHOHIICIHORCOORRRH extends HOCCCIICRCIIIIRHHICOCOOIICHIOR<K> {
      @Override
      public boolean contains(@Nullable Object var1) {
         return CIHCOICOOICHOCCHICIHRCOCIHRIOC.this.containsKey(var1);
      }

      @Override
      public int count(@Nullable Object var1) {
         Collection var2 = CIHCOICOOICHOCCHICIHRCOCIHRIOC.this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI.get(var1);
         return var2 == null ? 0 : var2.size();
      }

      @Override
      public CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OHCOCRRORHCOHIOIIORRORCICCRHOI() {
         return CIHCOICOOICHOCCHICIHRCOCIHRIOC.this.RORCHHOHICRHCCIRRORIHCCOCRHOCO();
      }

      @Override
      public int size() {
         return CIHCOICOOICHOCCHICIHRCOCIHRIOC.this.size();
      }

      @Override
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K> HRIOHRORCHIICCICIHRIIHHCHHOHHO(int var1) {
         Entry var2 = CIHCOICOOICHOCCHICIHRCOCIHRIOC.this.ORCOHOCIHOOHICOIRCHHIRHOIHHOOI
            .RIICCCOHIOHOIIRHCIIOOCRCCHORCC()
            .OHOOIHCOHHORHICHIOROIRIHCOOCRR()
            .get(var1);
         return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((K)var2.getKey(), ((Collection)var2.getValue()).size());
      }

      @Override
      boolean isPartialView() {
         return true;
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      @Override
      Object writeReplace() {
         return new CIHCOICOOICHOCCHICIHRCOCIHRIOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(CIHCOICOOICHOCCHICIHRCOCIHRIOC.this);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      static final COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<CIHCOICOOICHOCCHICIHRCOCIHRIOC> OIHIRHOCCRRCIROHCIOCOIICROHIIH = COOROCRCCHCIHRCCIROCICCIIIRHHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         CIHCOICOOICHOCCHICIHRCOCIHRIOC.class, "map"
      );
      static final COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<CIHCOICOOICHOCCHICIHRCOCIHRIOC> ICROHIHHCIOCOCCRCCCHRCOCCHHCRI = COOROCRCCHCIHRCCIROCICCIIIRHHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         CIHCOICOOICHOCCHICIHRCOCIHRIOC.class, "size"
      );
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<Entry<K, V>> {
      @Weak
      final CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> CROHOIHHHCRCRHOIOOOICCHCOOROOC;
      private static final long RHIHRRCRHIIIICHIRROHOHOIIROHCO = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> var1) {
         this.CROHOIHHHCRCRHOIOOOICCHCOOROOC = var1;
      }

      @Override
      public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
         return this.CROHOIHHHCRCRHOIOOOICCHCOOROOC.HCRRIORCRRIORHRCIOHHCIHORRCHII();
      }

      @Override
      boolean isPartialView() {
         return this.CROHOIHHHCRCRHOIOOOICCHCOOROOC.isPartialView();
      }

      @Override
      public int size() {
         return this.CROHOIHHHCRCRHOIOOOICCHCOOROOC.size();
      }

      @Override
      public boolean contains(Object var1) {
         if (var1 instanceof Entry) {
            Entry var2 = (Entry)var1;
            return this.CROHOIHHHCRCRHOIOOOICCHCOOROOC.containsEntry(var2.getKey(), var2.getValue());
         } else {
            return false;
         }
      }
   }

   @DoNotMock
   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      Map<K, Collection<V>> builderMap = IHHRRRRCOCHIIOIOHORHCIRRRCHCCR.preservesInsertionOrderOnPutsMap();
      @Nullable Comparator<? super K> keyComparator;
      @Nullable Comparator<? super V> valueComparator;

      Collection<V> newMutableValueCollection() {
         return new ArrayList<>();
      }

      @CanIgnoreReturnValue
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IOIICIRIICICIIOORHCIIIIRRIHRHI(K var1, V var2) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var1, var2);
         Collection var3 = this.builderMap.get(var1);
         if (var3 == null) {
            this.builderMap.put((K)var1, var3 = this.newMutableValueCollection());
         }

         var3.add(var2);
         return this;
      }

      @CanIgnoreReturnValue
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> ORHIOICIOCRRHOOCOHRORIHICHRCRR(Entry<? extends K, ? extends V> var1) {
         return this.IOIICIRIICICIIOORHCIIIIRRIHRHI((K)var1.getKey(), (V)var1.getValue());
      }

      @CanIgnoreReturnValue
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> ORHIOICIOCRRHOOCOHRORIHICHRCRR(
         Iterable<? extends Entry<? extends K, ? extends V>> var1
      ) {
         for (Entry var3 : var1) {
            this.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var3);
         }

         return this;
      }

      @CanIgnoreReturnValue
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(K var1, Iterable<? extends V> var2) {
         if (var1 == null) {
            throw new NullPointerException("null key in entry: null=" + IRIHOIRCHIRRCRIOORCOICORHHORHH.toString(var2));
         }

         Collection var3 = this.builderMap.get(var1);
         if (var3 != null) {
            for (Object var8 : var2) {
               ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var1, var8);
               var3.add(var8);
            }

            return this;
         } else {
            Iterator var4 = var2.iterator();
            if (!var4.hasNext()) {
               return this;
            }

            var3 = this.newMutableValueCollection();

            while (var4.hasNext()) {
               Object var5 = var4.next();
               ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var1, var5);
               var3.add(var5);
            }

            this.builderMap.put((K)var1, var3);
            return this;
         }
      }

      @CanIgnoreReturnValue
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(K var1, V... var2) {
         return this.CRRRICCRROCOHHOHIICIHORCOORRRH((K)var1, Arrays.asList((V[])var2));
      }

      @CanIgnoreReturnValue
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var1
      ) {
         for (Entry var3 : var1.asMap().entrySet()) {
            this.CRRRICCRROCOHHOHIICIHORCOORRRH((K)var3.getKey(), (Iterable<? extends V>)var3.getValue());
         }

         return this;
      }

      @CanIgnoreReturnValue
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Comparator<? super K> var1) {
         this.keyComparator = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this;
      }

      @CanIgnoreReturnValue
      public CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> CRICCOOHHHCHOORCICOCOHIHOIRHOO(Comparator<? super V> var1) {
         this.valueComparator = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this;
      }

      @CanIgnoreReturnValue
      CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> var1
      ) {
         for (Entry var3 : var1.builderMap.entrySet()) {
            this.CRRRICCRROCOHHOHIICIHORCOORRRH((K)var3.getKey(), (Iterable<? extends V>)var3.getValue());
         }

         return this;
      }

      public CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> ORIORIIHOCCORIIIRHCHOOCHHHROIO() {
         Collection var1 = this.builderMap.entrySet();
         if (this.keyComparator != null) {
            var1 = IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(this.keyComparator)
               .ROCHHHHORHHHRCROHROHRHIORORCIR()
               .CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
         }

         return HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.valueComparator);
      }
   }

   private static final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> extends OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> {
      @Weak
      private final transient CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> HHRRCHIHHHRCROIROCRCHOCRRRCCIC;
      private static final long IHIHRHCRCHCOHHCHOCRHIIRROIIIOI = 0L;

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CIHCOICOOICHOCCHICIHRCOCIHRIOC<K, V> var1) {
         this.HHRRCHIHHHRCROIROCRCHOCRRRCCIC = var1;
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         return this.HHRRCHIHHHRCROIROCRCHOCRRRCCIC.containsValue(var1);
      }

      @Override
      public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<V> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
         return this.HHRRCHIHHHRCROIROCRCHOCRRRCCIC.ORORIIRIHCIHCRCHCHRRIRHCHRHCIR();
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      @Override
      int copyIntoArray(Object[] var1, int var2) {
         IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var3 = this.HHRRCHIHHHRCROIROCRCHOCRRRCCIC
            .ORCOHOCIHOOHICOIRCHHIRHOIHHOOI
            .CHHRCOCOHHIROCIHROIOOCOICCCHRC()
            .IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

         while (var3.hasNext()) {
            OIICIRRCOOCIHRHOIOIOOROCRHCHIC var4 = (OIICIRRCOOCIHRHOIOIOOROCRHCHIC)var3.next();
            var2 = var4.copyIntoArray(var1, var2);
         }

         return var2;
      }

      @Override
      public int size() {
         return this.HHRRCHIHHHRCROIROCRCHOCRRRCCIC.size();
      }

      @Override
      boolean isPartialView() {
         return true;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements Serializable {
      final CIHCOICOOICHOCCHICIHRCOCIHRIOC<?, ?> ORIHIRIICOCRCHOCIOHOORIIORHOCR;

      RRCRRCORICCHOHHIRCHIROOHIIOHCO(CIHCOICOOICHOCCHICIHRCOCIHRIOC<?, ?> var1) {
         this.ORIHIRIICOCRCHOCIOHOORIIORHOCR = var1;
      }

      Object readResolve() {
         return this.ORIHIRIICOCRCHOCIOHOORIIORHOCR.CHHIIHIOIOCOORCRIHIIROCHROOICO();
      }
   }
}
