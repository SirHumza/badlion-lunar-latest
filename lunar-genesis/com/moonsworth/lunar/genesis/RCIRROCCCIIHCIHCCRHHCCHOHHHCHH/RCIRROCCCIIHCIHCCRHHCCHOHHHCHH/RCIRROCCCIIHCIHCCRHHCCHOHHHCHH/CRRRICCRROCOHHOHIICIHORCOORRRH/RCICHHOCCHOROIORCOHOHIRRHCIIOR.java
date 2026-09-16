package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
public class RCICHHOCCHOROIORCOHOHIRRHCIIOR<R, C, V> extends RHCICHRICRIIIHRRCICHOOOIOOOICH<R, C, V> {
   private final Comparator<? super C> HRIORIIRIIRCHRCIIRCHICCOCHCOOO;
   private static final long HCHOOIROHROIHHOCIRIICHIOHIRIRI = 0L;

   public static <R extends Comparable, C extends Comparable, V> RCICHHOCCHOROIORCOHOHIRRHCIIOR<R, C, V> COCROCOCOCCCOROORHHOICHOHIIOCR() {
      return new RCICHHOCCHOROIORCOHOHIRRHCIIOR<>(
         IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC(), IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC()
      );
   }

   public static <R, C, V> RCICHHOCCHOROIORCOHOHIRRHCIIOR<R, C, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Comparator<? super R> var0, Comparator<? super C> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new RCICHHOCCHOROIORCOHOHIRRHCIIOR<>(var0, var1);
   }

   public static <R, C, V> RCICHHOCCHOROIORCOHOHIRRHCIIOR<R, C, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCICHHOCCHOROIORCOHOHIRRHCIIOR<R, C, ? extends V> var0) {
      RCICHHOCCHOROIORCOHOHIRRHCIIOR var1 = new RCICHHOCCHOROIORCOHOHIRRHCIIOR(var0.rowComparator(), var0.columnComparator());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((RCCICOCCCHROHOCCHIHORIHHCOHOHH)var0);
      return var1;
   }

   RCICHHOCCHOROIORCOHOHIRRHCIIOR(Comparator<? super R> var1, Comparator<? super C> var2) {
      super(new TreeMap<>(var1), new RCICHHOCCHOROIORCOHOHIRRHCIIOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var2));
      this.HRIORIIRIIRCHRCIIRCHICCOCHCOOO = var2;
   }

   @Deprecated
   public Comparator<? super R> rowComparator() {
      return this.rowKeySet().comparator();
   }

   @Deprecated
   public Comparator<? super C> columnComparator() {
      return this.HRIORIIRIIRCHRCIIRCHICCOCHCOOO;
   }

   public SortedMap<C, V> row(R var1) {
      return new RCICHHOCCHOROIORCOHOHIRRHCIIOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   @Override
   public SortedSet<R> rowKeySet() {
      return super.rowKeySet();
   }

   @Override
   public SortedMap<R, Map<C, V>> rowMap() {
      return super.rowMap();
   }

   @Override
   Iterator<C> createColumnKeyIterator() {
      final Comparator var1 = this.columnComparator();
      final IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var2 = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.CORCIIICICCIRRRCCIHOOIORHOORHH.values(),
            new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<Map<C, V>, Iterator<C>>(
               
            ) {
               public Iterator<C> apply(Map<C, V> var1) {
                  return var1.keySet().iterator();
               }
            }
         ),
         var1
      );
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<C>(
         
      ) {
         @Nullable Object lastValue;

         @Override
         protected C computeNext() {
            while (var2.hasNext()) {
               Object var1x = var2.next();
               boolean var2x = this.lastValue != null && var1.compare(var1x, this.lastValue) == 0;
               if (!var2x) {
                  this.lastValue = var1x;
                  return (C)this.lastValue;
               }
            }

            this.lastValue = null;
            return (C)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }
      };
   }

   private class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V>.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements SortedMap<C, V> {
      final @Nullable Object OIIIHHCHRCIHOOHOCOCRIIIIROHHOH;
      final @Nullable Object OIROHIRORCCOICCORRORIHHHIHICRR;
      transient @Nullable SortedMap<C, V> wholeRow;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(R var2) {
         this(var2, null, null);
      }

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(R var2, @Nullable C var3, @Nullable C var4) {
         super(var2);
         this.OIIIHHCHRCIHOOHOCOCRIIIIROHHOH = var3;
         this.OIROHIRORCCOICCORRORIHHHIHICRR = var4;
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var3 == null || var4 == null || this.compare(var3, var4) <= 0
         );
      }

      public SortedSet<C> keySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC<>(this);
      }

      @Override
      public Comparator<? super C> comparator() {
         return RCICHHOCCHOROIORCOHOHIRRHCIIOR.this.columnComparator();
      }

      int compare(Object var1, Object var2) {
         Comparator var3 = this.comparator();
         return var3.compare(var1, var2);
      }

      boolean rangeContains(@Nullable Object var1) {
         return var1 != null
            && (this.OIIIHHCHRCIHOOHOCOCRIIIIROHHOH == null || this.compare(this.OIIIHHCHRCIHOOHOCOCRIIIIROHHOH, var1) <= 0)
            && (this.OIROHIRORCCOICCORRORIHHHIHICRR == null || this.compare(this.OIROHIRORCCOICCORRORIHHHIHICRR, var1) > 0);
      }

      @Override
      public SortedMap<C, V> subMap(C var1, C var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.rangeContains(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                     var1
                  )
               )
               && this.rangeContains(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                     var2
                  )
               )
         );
         return RCICHHOCCHOROIORCOHOHIRRHCIIOR.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.HOOHIIHIICRCRHOICOHIROCRHOIIOI, var1, var2);
      }

      @Override
      public SortedMap<C, V> headMap(C var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.rangeContains(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            )
         );
         return RCICHHOCCHOROIORCOHOHIRRHCIIOR.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.HOOHIIHIICRCRHOICOHIROCRHOIIOI, this.OIIIHHCHRCIHOOHOCOCRIIIIROHHOH, var1
         );
      }

      @Override
      public SortedMap<C, V> tailMap(C var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.rangeContains(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            )
         );
         return RCICHHOCCHOROIORCOHOHIRRHCIIOR.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.HOOHIIHIICRCRHOICOHIROCRHOIIOI, var1, this.OIROHIRORCCOICCORRORIHHHIHICRR
         );
      }

      @Override
      public C firstKey() {
         SortedMap var1 = this.backingRowMap();
         if (var1 == null) {
            throw new NoSuchElementException();
         } else {
            return (C)this.backingRowMap().firstKey();
         }
      }

      @Override
      public C lastKey() {
         SortedMap var1 = this.backingRowMap();
         if (var1 == null) {
            throw new NoSuchElementException();
         } else {
            return (C)this.backingRowMap().lastKey();
         }
      }

      SortedMap<C, V> wholeRow() {
         if (this.wholeRow == null
            || this.wholeRow.isEmpty() && RCICHHOCCHOROIORCOHOHIRRHCIIOR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.containsKey(this.HOOHIIHIICRCRHOICOHIROCRHOIIOI)) {
            this.wholeRow = (SortedMap<C, V>)RCICHHOCCHOROIORCOHOHIRRHCIIOR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.get(this.HOOHIIHIICRCRHOICOHIROCRHOIIOI);
         }

         return this.wholeRow;
      }

      SortedMap<C, V> backingRowMap() {
         return (SortedMap<C, V>)super.backingRowMap();
      }

      SortedMap<C, V> computeBackingRowMap() {
         SortedMap var1 = this.wholeRow();
         if (var1 != null) {
            if (this.OIIIHHCHRCIHOOHOCOCRIIIIROHHOH != null) {
               var1 = var1.tailMap(this.OIIIHHCHRCIHOOHOCOCRIIIIROHHOH);
            }

            if (this.OIROHIRORCCOICCORRORIHHHIHICRR != null) {
               var1 = var1.headMap(this.OIROHIRORCCOICCORRORIHHHIHICRR);
            }

            return var1;
         } else {
            return null;
         }
      }

      @Override
      void maintainEmptyInvariant() {
         if (this.wholeRow() != null && this.wholeRow.isEmpty()) {
            RCICHHOCCHOROIORCOHOHIRRHCIIOR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.remove(this.HOOHIIHIICRCRHOICOHIROCRHOIIOI);
            this.wholeRow = null;
            this.backingRowMap = null;
         }
      }

      @Override
      public boolean containsKey(Object var1) {
         return this.rangeContains(var1) && super.containsKey(var1);
      }

      @Override
      public V put(C var1, V var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            this.rangeContains(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            )
         );
         return (V)super.put(var1, (V)var2);
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<C, V>
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<TreeMap<C, V>>,
      Serializable {
      final Comparator<? super C> COROICHHCOOCCOOCIRCRHRCHOHOCCH;
      private static final long ICOHIRRRCOHOIRROCCHHOCIHIHROCO = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Comparator<? super C> var1) {
         this.COROICHHCOOCCOOCIRCRHRCHOHOCCH = var1;
      }

      public TreeMap<C, V> get() {
         return new TreeMap<>(this.COROICHHCOOCCOOCIRCRHRCHOHOCCH);
      }
   }
}
