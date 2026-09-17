package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
class HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V> extends OHHRIOHROOIHOROCIRHCHORIHRRRRI<R, C, V> implements Serializable {
   @IHORRHOROHHHIORCCHRCRIRRHHCCCO
   final Map<R, Map<C, V>> CORCIIICICCIRRRCCIHOOIORHOORHH;
   @IHORRHOROHHHIORCCHRCRIRRHHCCCO
   final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<? extends Map<C, V>> OIOHIIRCCRHCICHHOCCHRHHOHHRORH;
   private transient @Nullable Set<C> columnKeySet;
   private transient @Nullable Map<R, Map<C, V>> rowMap;
   private transient HIORIIIIOCCCRCHCOROROCCOIOOIIR.@Nullable RRCRRCORICCHOHHIRCHIROOHIIOHCO OHORHRCCICROHRHHHOIOCOIIOIRIHR;
   private static final long RHRORHOOOHHCCIHCOCIHCHHRRHRRHH = 0L;

   HIORIIIIOCCCRCHCOROROCCOIOOIIR(
      Map<R, Map<C, V>> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<? extends Map<C, V>> var2
   ) {
      this.CORCIIICICCIRRRCCIHOOIORHOORHH = var1;
      this.OIOHIIRCCRHCICHHOCCHRHHOHHRORH = var2;
   }

   @Override
   public boolean contains(@Nullable Object var1, @Nullable Object var2) {
      return var1 != null && var2 != null && super.contains(var1, var2);
   }

   @Override
   public boolean containsColumn(@Nullable Object var1) {
      if (var1 == null) {
         return false;
      }

      for (Map var3 : this.CORCIIICICCIRRRCCIHOOIORHOORHH.values()) {
         if (ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeContainsKey(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean containsRow(@Nullable Object var1) {
      return var1 != null && ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeContainsKey(this.CORCIIICICCIRRRCCIHOOIORHOORHH, var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return var1 != null && super.containsValue(var1);
   }

   @Override
   public V get(@Nullable Object var1, @Nullable Object var2) {
      return var1 != null && var2 != null ? super.get(var1, var2) : null;
   }

   @Override
   public boolean isEmpty() {
      return this.CORCIIICICCIRRRCCIHOOIORHOORHH.isEmpty();
   }

   @Override
   public int size() {
      int var1 = 0;

      for (Map var3 : this.CORCIIICICCIRRRCCIHOOIORHOORHH.values()) {
         var1 += var3.size();
      }

      return var1;
   }

   @Override
   public void clear() {
      this.CORCIIICICCIRRRCCIHOOIORHOORHH.clear();
   }

   private Map<C, V> getOrCreate(R var1) {
      Map var2 = this.CORCIIICICCIRRRCCIHOOIORHOORHH.get(var1);
      if (var2 == null) {
         var2 = this.OIOHIIRCCRHCICHHOCCHRHHOHHRORH.get();
         this.CORCIIICICCIRRRCCIHOOIORHOORHH.put((R)var1, var2);
      }

      return var2;
   }

   @CanIgnoreReturnValue
   @Override
   public V put(R var1, C var2, V var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var3
      );
      return this.getOrCreate((R)var1).put((C)var2, (V)var3);
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(@Nullable Object var1, @Nullable Object var2) {
      if (var1 != null && var2 != null) {
         Map var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.CORCIIICICCIRRRCCIHOOIORHOORHH, var1);
         if (var3 == null) {
            return null;
         }

         Object var4 = var3.remove(var2);
         if (var3.isEmpty()) {
            this.CORCIIICICCIRRRCCIHOOIORHOORHH.remove(var1);
         }

         return (V)var4;
      } else {
         return null;
      }
   }

   @CanIgnoreReturnValue
   private Map<R, V> removeColumn(Object var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      Iterator var3 = this.CORCIIICICCIRRRCCIHOOIORHOORHH.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         Object var5 = ((Map)var4.getValue()).remove(var1);
         if (var5 != null) {
            var2.put(var4.getKey(), var5);
            if (((Map)var4.getValue()).isEmpty()) {
               var3.remove();
            }
         }
      }

      return var2;
   }

   private boolean containsMapping(Object var1, Object var2, Object var3) {
      return var3 != null && var3.equals(this.get(var1, var2));
   }

   private boolean removeMapping(Object var1, Object var2, Object var3) {
      if (this.containsMapping(var1, var2, var3)) {
         this.remove(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public Set<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSet() {
      return super.cellSet();
   }

   @Override
   Iterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellIterator() {
      return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Override
   Spliterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.flatMap(
         this.CORCIIICICCIRRRCCIHOOIORHOORHH.entrySet().spliterator(),
         var0 -> IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(
            var0.getValue().entrySet().spliterator(),
            var1 -> CIHHIHOORIIHCOORRRICHHCCRRRCHO.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0.getKey(), var1.getKey(), var1.getValue())
         ),
         65,
         this.size()
      );
   }

   @Override
   public Map<C, V> row(R var1) {
      return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1);
   }

   @Override
   public Map<R, V> column(C var1) {
      return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
   }

   @Override
   public Set<R> rowKeySet() {
      return this.rowMap().keySet();
   }

   @Override
   public Set<C> columnKeySet() {
      Set var1 = this.columnKeySet;
      return var1 == null ? (this.columnKeySet = new HIORIIIIOCCCRCHCOROROCCOIOOIIR.CRRRICCRROCOHHOHIICIHORCOORRRH()) : var1;
   }

   Iterator<C> createColumnKeyIterator() {
      return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   }

   @Override
   public Collection<V> values() {
      return super.values();
   }

   @Override
   public Map<R, Map<C, V>> rowMap() {
      Map var1 = this.rowMap;
      return var1 == null ? (this.rowMap = this.createRowMap()) : var1;
   }

   Map<R, Map<C, V>> createRowMap() {
      return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
   }

   @Override
   public Map<C, Map<R, V>> columnMap() {
      HIORIIIIOCCCRCHCOROROCCOIOOIIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = this.OHORHRCCICROHRHHHOIOCOIIOIRIHR;
      return var1 == null ? (this.OHORHRCCICROHRHHHOIOCOIIOIRIHR = new HIORIIIIOCCCRCHCOROROCCOIOOIIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO()) : var1;
   }

   private class CRRRICCRROCOHHOHIICIHORCOORRRH extends HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V>.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<C> {
      private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      }

      @Override
      public Iterator<C> iterator() {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.createColumnKeyIterator();
      }

      @Override
      public int size() {
         return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.size(this.iterator());
      }

      @Override
      public boolean remove(Object var1) {
         if (var1 == null) {
            return false;
         }

         boolean var2 = false;
         Iterator var3 = HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.values().iterator();

         while (var3.hasNext()) {
            Map var4 = (Map)var3.next();
            if (var4.keySet().remove(var1)) {
               var2 = true;
               if (var4.isEmpty()) {
                  var3.remove();
               }
            }
         }

         return var2;
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         boolean var2 = false;
         Iterator var3 = HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.values().iterator();

         while (var3.hasNext()) {
            Map var4 = (Map)var3.next();
            if (HRCROCOHHHICRHIHHOOCIIRRRCCIRR.removeAll(var4.keySet().iterator(), var1)) {
               var2 = true;
               if (var4.isEmpty()) {
                  var3.remove();
               }
            }
         }

         return var2;
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         boolean var2 = false;
         Iterator var3 = HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.values().iterator();

         while (var3.hasNext()) {
            Map var4 = (Map)var3.next();
            if (var4.keySet().retainAll(var1)) {
               var2 = true;
               if (var4.isEmpty()) {
                  var3.remove();
               }
            }
         }

         return var2;
      }

      @Override
      public boolean contains(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsColumn(var1);
      }
   }

   private class HHCCIRHCCCIIRHCROHIORHIRHHIORH
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<C> {
      final Map<C, V> HRHRIRCIIHRROICCOICIOHIOOIOIOO = (Map<C, V>)HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.OIOHIIRCCRHCICHHOCCHRHHOHHRORH.get();
      final Iterator<Map<C, V>> IOCCIORRIHCOOOOIROCHRRCHIIOORO = HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.values().iterator();
      Iterator<Entry<C, V>> entryIterator = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.HICCIROIRICHHOCICHCIOOROHHIOOR();

      private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      }

      @Override
      protected C computeNext() {
         while (true) {
            if (this.entryIterator.hasNext()) {
               Entry var1 = this.entryIterator.next();
               if (!this.HRHRIRCIIHRROICCOICIOHIOOIOIOO.containsKey(var1.getKey())) {
                  this.HRHRIRCIIHRROICCOICIOHIOOIOIOO.put((C)var1.getKey(), (V)var1.getValue());
                  return (C)var1.getKey();
               }
            } else {
               if (!this.IOCCIORRIHCOOOOIROCHRRCHIIOORO.hasNext()) {
                  return (C)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
               }

               this.entryIterator = this.IOCCIORRIHCOOOOIROCHRRCHIIOORO.next().entrySet().iterator();
            }
         }
      }
   }

   class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<R, Map<C, V>> {
      @Override
      public boolean containsKey(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsRow(var1);
      }

      public Map<C, V> get(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsRow(var1) ? HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.row((R)var1) : null;
      }

      public Map<C, V> remove(Object var1) {
         return var1 == null ? null : HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.remove(var1);
      }

      @Override
      protected Set<Entry<R, Map<C, V>>> createEntrySet() {
         return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V>.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Entry<R, Map<C, V>>> {
         @Override
         public Iterator<Entry<R, Map<C, V>>> iterator() {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.keySet(),
               new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<R, Map<C, V>>(
                  
               ) {
                  public Map<C, V> apply(R var1) {
                     return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.row((R)var1);
                  }
               }
            );
         }

         @Override
         public int size() {
            return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.size();
         }

         @Override
         public boolean contains(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            return var2.getKey() != null
               && var2.getValue() instanceof Map
               && RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.entrySet(), var2);
         }

         @Override
         public boolean remove(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            return var2.getKey() != null
               && var2.getValue() instanceof Map
               && HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.entrySet().remove(var2);
         }
      }
   }

   private class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<R, V> {
      final Object COCOROHHRIORRRHIHCOHHCHRHIROOI;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(C var2) {
         this.COCOROHHRIORRRHIHCOHHCHRHIROOI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      @Override
      public V put(R var1, V var2) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.put((R)var1, (C)this.COCOROHHRIORRRHIHCOHHCHRHIROOI, (V)var2);
      }

      @Override
      public V get(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.get(var1, this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
      }

      @Override
      public boolean containsKey(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.contains(var1, this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
      }

      @Override
      public V remove(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.remove(var1, this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
      }

      @CanIgnoreReturnValue
      boolean OCOHORHCROHICRRIHCIHHRRCIHICRI(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<R, V>> var1
      ) {
         boolean var2 = false;
         Iterator var3 = HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.entrySet().iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            Map var5 = (Map)var4.getValue();
            Object var6 = var5.get(this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
            if (var6 != null && var1.apply(ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry(var4.getKey(), var6))) {
               var5.remove(this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
               var2 = true;
               if (var5.isEmpty()) {
                  var3.remove();
               }
            }
         }

         return var2;
      }

      @Override
      Set<Entry<R, V>> createEntrySet() {
         return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      Set<R> createKeySet() {
         return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      }

      @Override
      Collection<V> createValues() {
         return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }

      private class CRRRICCRROCOHHOHIICIHORCOORRRH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<R, V> {
         CRRRICCRROCOHHOHIICIHORCOORRRH() {
            super(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this);
         }

         @Override
         public boolean remove(Object var1) {
            return var1 != null
               && IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI(
                        (V)var1
                     )
                  )
               );
         }

         @Override
         public boolean removeAll(Collection<?> var1) {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.OCOHORHCROHICRRIHCIHHRRCIHICRI(
               ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                     var1
                  )
               )
            );
         }

         @Override
         public boolean retainAll(Collection<?> var1) {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.OCOHORHCROHICRRIHCIHHRRCIHICRI(
               ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                        var1
                     )
                  )
               )
            );
         }
      }

      private class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<R, V> {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
            super(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this);
         }

         @Override
         public boolean contains(Object var1) {
            return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.contains(var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
         }

         @Override
         public boolean remove(Object var1) {
            return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.remove(var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI) != null;
         }

         @Override
         public boolean retainAll(Collection<?> var1) {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.OCOHORHCROHICRRIHCIHHRRCIHICRI(
               ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                        var1
                     )
                  )
               )
            );
         }
      }

      private class IRCIIHHICIHRCOCRROCOICRIHHCCHH
         extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Entry<R, V>> {
         final Iterator<Entry<R, Map<C, V>>> OCIHIRHHCROIICOIICRCROIOIHRCHI = HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH
            .entrySet()
            .iterator();

         private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         }

         protected Entry<R, V> computeNext() {
            while (this.OCIHIRHHCROIICOIICRCROIOIHRCHI.hasNext()) {
               final Entry var1 = this.OCIHIRHHCROIICOIICRCROIOIHRCHI.next();
               if (((Map)var1.getValue()).containsKey(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI)) {
                  class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
                     extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<R, V> {
                     @Override
                     public R getKey() {
                        return (R)var1.getKey();
                     }

                     @Override
                     public V getValue() {
                        return (V)((Map)var1.getValue()).get(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
                     }

                     @Override
                     public V setValue(V var1x) {
                        return (V)((Map)var1.getValue())
                           .put(
                              IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI,
                              com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                                 (V)var1x
                              )
                           );
                     }
                  }

                  return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
               }
            }

            return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }
      }

      private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<Entry<R, V>> {
         private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         }

         @Override
         public Iterator<Entry<R, V>> iterator() {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
         }

         @Override
         public int size() {
            int var1 = 0;

            for (Map var3 : HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.values()) {
               if (var3.containsKey(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI)) {
                  var1++;
               }
            }

            return var1;
         }

         @Override
         public boolean isEmpty() {
            return !HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsColumn(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI);
         }

         @Override
         public void clear() {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.OCOHORHCROHICRRIHCIHHRRCIHICRI(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.OOHHOIHIRHRCHIHHIIHCRRRICCHICO()
            );
         }

         @Override
         public boolean contains(Object var1) {
            if (var1 instanceof Entry) {
               Entry var2 = (Entry)var1;
               return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsMapping(
                  var2.getKey(), IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI, var2.getValue()
               );
            } else {
               return false;
            }
         }

         @Override
         public boolean remove(Object var1) {
            if (var1 instanceof Entry) {
               Entry var2 = (Entry)var1;
               return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.removeMapping(
                  var2.getKey(), IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.COCOROHHRIORRRHIHCOHHCHRHIROOI, var2.getValue()
               );
            } else {
               return false;
            }
         }

         @Override
         public boolean retainAll(Collection<?> var1) {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.OCOHORHCROHICRRIHCIHHRRCIHICRI(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                     var1
                  )
               )
            );
         }
      }
   }

   private abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T> extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> {
      private OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
      }

      @Override
      public boolean isEmpty() {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.isEmpty();
      }

      @Override
      public void clear() {
         HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.clear();
      }
   }

   private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Iterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> {
      final Iterator<Entry<R, Map<C, V>>> OIIHCIHICHORRICCOHCORCHOOIICCH = HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH
         .entrySet()
         .iterator();
      @Nullable Entry<R, Map<C, V>> rowEntry;
      Iterator<Entry<C, V>> columnIterator = HRCROCOHHHICRHIHHOOCIIRRRCCIRR.emptyModifiableIterator();

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      public boolean hasNext() {
         return this.OIIHCIHICHORRICCOHCORCHOOIICCH.hasNext() || this.columnIterator.hasNext();
      }

      public RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V> RORHOHHHIICOCCOHRRHOCCIIHCOIOH() {
         if (!this.columnIterator.hasNext()) {
            this.rowEntry = this.OIIHCIHICHORRICCOHCORCHOOIICCH.next();
            this.columnIterator = this.rowEntry.getValue().entrySet().iterator();
         }

         Entry var1 = this.columnIterator.next();
         return CIHHIHOORIIHCOORRRICHHCCRRRCHO.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.rowEntry.getKey(), (C)var1.getKey(), (V)var1.getValue());
      }

      @Override
      public void remove() {
         this.columnIterator.remove();
         if (this.rowEntry.getValue().isEmpty()) {
            this.OIIHCIHICHORRICCOHCORCHOOIICCH.remove();
            this.rowEntry = null;
         }
      }
   }

   class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR<C, V> {
      final Object HOOHIIHIICRCRHOICOHIROCRHOIIOI;
      @Nullable Map<C, V> backingRowMap;

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(R var2) {
         this.HOOHIIHIICRCRHOICOHIROCRHOIIOI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
      }

      Map<C, V> backingRowMap() {
         return this.backingRowMap != null
               && (
                  !this.backingRowMap.isEmpty()
                     || !HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.containsKey(this.HOOHIIHIICRCRHOICOHIROCRHOIIOI)
               )
            ? this.backingRowMap
            : (this.backingRowMap = this.computeBackingRowMap());
      }

      Map<C, V> computeBackingRowMap() {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.get(this.HOOHIIHIICRCRHOICOHIROCRHOIIOI);
      }

      void maintainEmptyInvariant() {
         if (this.backingRowMap() != null && this.backingRowMap.isEmpty()) {
            HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.CORCIIICICCIRRRCCIHOOIORHOORHH.remove(this.HOOHIIHIICRCRHOICOHIROCRHOIIOI);
            this.backingRowMap = null;
         }
      }

      @Override
      public boolean containsKey(Object var1) {
         Map var2 = this.backingRowMap();
         return var1 != null && var2 != null && ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeContainsKey(var2, var1);
      }

      @Override
      public V get(Object var1) {
         Map var2 = this.backingRowMap();
         return var1 != null && var2 != null ? ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(var2, var1) : null;
      }

      @Override
      public V put(C var1, V var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
         return this.backingRowMap != null && !this.backingRowMap.isEmpty()
            ? this.backingRowMap.put((C)var1, (V)var2)
            : HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.put((R)this.HOOHIIHIICRCRHOICOHIROCRHOIIOI, (C)var1, (V)var2);
      }

      @Override
      public V remove(Object var1) {
         Map var2 = this.backingRowMap();
         if (var2 == null) {
            return null;
         }

         Object var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeRemove(var2, var1);
         this.maintainEmptyInvariant();
         return (V)var3;
      }

      @Override
      public void clear() {
         Map var1 = this.backingRowMap();
         if (var1 != null) {
            var1.clear();
         }

         this.maintainEmptyInvariant();
      }

      @Override
      public int size() {
         Map var1 = this.backingRowMap();
         return var1 == null ? 0 : var1.size();
      }

      @Override
      Iterator<Entry<C, V>> entryIterator() {
         Map var1 = this.backingRowMap();
         if (var1 == null) {
            return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.emptyModifiableIterator();
         }

         final Iterator var2 = var1.entrySet().iterator();
         return new Iterator<Entry<C, V>>() {
            @Override
            public boolean hasNext() {
               return var2.hasNext();
            }

            public Entry<C, V> next() {
               return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.wrapEntry((Entry<C, V>)var2.next());
            }

            @Override
            public void remove() {
               var2.remove();
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.maintainEmptyInvariant();
            }
         };
      }

      @Override
      Spliterator<Entry<C, V>> entrySpliterator() {
         Map var1 = this.backingRowMap();
         return var1 == null ? Spliterators.emptySpliterator() : IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(var1.entrySet().spliterator(), this::wrapEntry);
      }

      Entry<C, V> wrapEntry(final Entry<C, V> var1) {
         return new OCOROCROIRCHIHIHHOOIRIIIRRCRHI<C, V>() {
            @Override
            protected Entry<C, V> delegate() {
               return var1;
            }

            @Override
            public V setValue(V var1x) {
               return (V)super.setValue(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                     (V)var1x
                  )
               );
            }

            @Override
            public boolean equals(Object var1x) {
               return this.standardEquals(var1x);
            }
         };
      }
   }

   private class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<C, Map<R, V>> {
      private RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      }

      public Map<R, V> get(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsColumn(var1) ? HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.column((C)var1) : null;
      }

      @Override
      public boolean containsKey(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsColumn(var1);
      }

      public Map<R, V> remove(Object var1) {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsColumn(var1) ? HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.removeColumn(var1) : null;
      }

      @Override
      public Set<Entry<C, Map<R, V>>> createEntrySet() {
         return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      public Set<C> keySet() {
         return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.columnKeySet();
      }

      @Override
      Collection<Map<R, V>> createValues() {
         return new HIORIIIIOCCCRCHCOROROCCOIOOIIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      }

      private class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<C, Map<R, V>> {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
            super(RRCRRCORICCHOHHIRCHIROOHIIOHCO.this);
         }

         @Override
         public boolean remove(Object var1) {
            for (Entry var3 : RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.entrySet()) {
               if (((Map)var3.getValue()).equals(var1)) {
                  HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.removeColumn(var3.getKey());
                  return true;
               }
            }

            return false;
         }

         @Override
         public boolean removeAll(Collection<?> var1) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            );
            boolean var2 = false;

            for (Object var4 : RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.columnKeySet().iterator())) {
               if (var1.contains(HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.column((C)var4))) {
                  HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.removeColumn(var4);
                  var2 = true;
               }
            }

            return var2;
         }

         @Override
         public boolean retainAll(Collection<?> var1) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            );
            boolean var2 = false;

            for (Object var4 : RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.columnKeySet().iterator())) {
               if (!var1.contains(HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.column((C)var4))) {
                  HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.removeColumn(var4);
                  var2 = true;
               }
            }

            return var2;
         }
      }

      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V>.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Entry<C, Map<R, V>>> {
         @Override
         public Iterator<Entry<C, Map<R, V>>> iterator() {
            return ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.columnKeySet(),
               new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<C, Map<R, V>>(
                  
               ) {
                  public Map<R, V> apply(C var1) {
                     return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.column((C)var1);
                  }
               }
            );
         }

         @Override
         public int size() {
            return HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.columnKeySet().size();
         }

         @Override
         public boolean contains(Object var1) {
            if (var1 instanceof Entry) {
               Entry var2 = (Entry)var1;
               if (HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.containsColumn(var2.getKey())) {
                  Object var3 = var2.getKey();
                  return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.get(var3).equals(var2.getValue());
               }
            }

            return false;
         }

         @Override
         public boolean remove(Object var1) {
            if (this.contains(var1)) {
               Entry var2 = (Entry)var1;
               HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.removeColumn(var2.getKey());
               return true;
            } else {
               return false;
            }
         }

         @Override
         public boolean removeAll(Collection<?> var1) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            );
            return ICRHCCCCOIICOCHHCRCOOIHICROIHI.removeAllImpl(this, var1.iterator());
         }

         @Override
         public boolean retainAll(Collection<?> var1) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            );
            boolean var2 = false;

            for (Object var4 : RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.columnKeySet().iterator())) {
               if (!var1.contains(ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry(var4, HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.column((C)var4)))) {
                  HIORIIIIOCCCRCHCOROROCCOIOOIIR.this.removeColumn(var4);
                  var2 = true;
               }
            }

            return var2;
         }
      }
   }
}
