package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
class HRRHRCCOOIOIIIRORIOOORORHOORIH<K, V> extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V> implements OCCCRRHIIOCOIHRIIHOIRRCIORHHHI<K, V> {
   final CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> OICIHROHHCOHRIHRHOHRHIRORHIHHH;
   final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> ICICCHIRCRHHIHHROORIOCRORHHCRO;

   HRRHRCCOOIOIIIRORIOOORORHOORIH(
      CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> var2
   ) {
      this.OICIHROHHCOHRIHRHOHRHIRORHIHHH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.ICICCHIRCRHHIHHROORIOCRORHHCRO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
   }

   @Override
   public CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> OCOOIRORRIICCHRRCCRICIOCHOHCRR() {
      return this.OICIHROHHCOHRIHRHOHRHIRORHIHHH;
   }

   @Override
   public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> OCIOIRIOICIIICCRCIHOHOOHORICHH() {
      return this.ICICCHIRCRHHIHHROORIOCRORHHCRO;
   }

   @Override
   public int size() {
      return this.entries().size();
   }

   private boolean satisfies(K var1, V var2) {
      return this.ICICCHIRCRHHIHHROORIOCRORHHCRO.apply(ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var1, (V)var2));
   }

   static <E> Collection<E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Collection<E> var0,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super E> var1
   ) {
      return var0 instanceof Set
         ? ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Set<E>)var0, var1)
         : RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.asMap().get(var1) != null;
   }

   @Override
   public Collection<V> removeAll(@Nullable Object var1) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI.firstNonNull(
         this.asMap().remove(var1), this.unmodifiableEmptyCollection()
      );
   }

   Collection<V> unmodifiableEmptyCollection() {
      return this.OICIHROHHCOHRIHRHOHRHIRORHIHHH instanceof RCRCCORIIOICRIIRHCCIIOCICRHIOC ? Collections.emptySet() : Collections.emptyList();
   }

   @Override
   public void clear() {
      this.entries().clear();
   }

   @Override
   public Collection<V> get(K var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         this.OICIHROHHCOHRIHRHOHRHIRORHIHHH.get((K)var1), new HRRHRCCOOIOIIIRORIOOORORHOORIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1)
      );
   }

   @Override
   Collection<Entry<K, V>> createEntries() {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.OICIHROHHCOHRIHRHOHRHIRORHIHHH.entries(), this.ICICCHIRCRHHIHHROORIOCRORHHCRO);
   }

   @Override
   Collection<V> createValues() {
      return new RRORCOIRRIICOOICOIOCORHORCHCOC<>(this);
   }

   @Override
   Iterator<Entry<K, V>> entryIterator() {
      throw new AssertionError("should never be called");
   }

   @Override
   Map<K, Collection<V>> createAsMap() {
      return new HRRHRCCOOIOIIIRORIOOORORHOORIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Override
   Set<K> createKeySet() {
      return this.asMap().keySet();
   }

   boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, Collection<V>>> var1
   ) {
      Iterator var2 = this.OICIHROHHCOHRIHRHOHRHIRORHIHHH.asMap().entrySet().iterator();
      boolean var3 = false;

      while (var2.hasNext()) {
         Entry var4 = (Entry)var2.next();
         Object var5 = var4.getKey();
         Collection var6 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            (Collection<V>)var4.getValue(), new HRRHRCCOOIOIIIRORIOOORORHOORIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5)
         );
         if (!var6.isEmpty() && var1.apply(ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry(var5, var6))) {
            if (var6.size() == ((Collection)var4.getValue()).size()) {
               var2.remove();
            } else {
               var6.clear();
            }

            var3 = true;
         }
      }

      return var3;
   }

   @Override
   CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> OHOHIROHHCIRICHIHRORHOHRIIHHRO() {
      return new HRRHRCCOOIOIIIRORIOOORORHOORIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   final class HHCCIRHCCCIIRHCROHIORHIRHHIORH
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<V> {
      private final Object HHRIOCOCOORHOICRCCCOIRRHRRRORO;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(K var2) {
         this.HHRIOCOCOORHOICRCCCOIRRHRRRORO = var2;
      }

      @Override
      public boolean apply(@Nullable V var1) {
         return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.satisfies((K)this.HHRIOCOCOORHOICRCCCOIRRHRRRORO, (V)var1);
      }
   }

   class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HORCRRHOCRRICHROCIOOIORIOHCIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         super(HRRHRCCOOIOIIIRORIOOORORHOORIH.this);
      }

      @Override
      public int remove(@Nullable Object var1, int var2) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "occurrences");
         if (var2 == 0) {
            return this.count(var1);
         }

         Collection var3 = HRRHRCCOOIOIIIRORIOOORORHOORIH.this.OICIHROHHCOHRIHRHOHRHIRORHIHHH.asMap().get(var1);
         if (var3 == null) {
            return 0;
         }

         Object var4 = var1;
         int var5 = 0;
         Iterator var6 = var3.iterator();

         while (var6.hasNext()) {
            Object var7 = var6.next();
            if (HRRHRCCOOIOIIIRORIOOORORHOORIH.this.satisfies((K)var4, (V)var7)) {
               if (++var5 <= var2) {
                  var6.remove();
               }
            }
         }

         return var5;
      }

      @Override
      public Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>> entrySet() {
         return new CCRIHCIIOOIOHIRCCHIICCRHIROORC.CRRRICCRROCOHHOHIICIHORCOORRRH<K>() {
            @Override
            CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> OOIORIRHCHIIOOIRCRIRHRHIOIRROO() {
               return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this;
            }

            @Override
            public Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>> iterator() {
               return IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.entryIterator();
            }

            @Override
            public int size() {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.keySet().size();
            }

            private boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>> var1
            ) {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Entry<K, Collection<V>>>(
                     
                  ) {
                     public boolean apply(Entry<K, Collection<V>> var1x) {
                        return var1.apply(CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1x.getKey(), ((Collection)var1x.getValue()).size()));
                     }
                  }
               );
            }

            @Override
            public boolean removeAll(Collection<?> var1) {
               return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                     var1
                  )
               );
            }

            @Override
            public boolean retainAll(Collection<?> var1) {
               return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                        var1
                     )
                  )
               );
            }
         };
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, Collection<V>> {
      @Override
      public boolean containsKey(@Nullable Object var1) {
         return this.get(var1) != null;
      }

      @Override
      public void clear() {
         HRRHRCCOOIOIIIRORIOOORORHOORIH.this.clear();
      }

      public Collection<V> get(@Nullable Object var1) {
         Collection var2 = HRRHRCCOOIOIIIRORIOOORORHOORIH.this.OICIHROHHCOHRIHRHOHRHIRORHIHHH.asMap().get(var1);
         if (var2 == null) {
            return null;
         }

         Object var3 = var1;
         var2 = HRRHRCCOOIOIIIRORIOOORORHOORIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var2, HRRHRCCOOIOIIIRORIOOORORHOORIH.this.new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3)
         );
         return var2.isEmpty() ? null : var2;
      }

      public Collection<V> remove(@Nullable Object var1) {
         Collection var2 = HRRHRCCOOIOIIIRORIOOORORHOORIH.this.OICIHROHHCOHRIHRHOHRHIRORHIHHH.asMap().get(var1);
         if (var2 == null) {
            return null;
         }

         Object var3 = var1;
         ArrayList var4 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList();
         Iterator var5 = var2.iterator();

         while (var5.hasNext()) {
            Object var6 = var5.next();
            if (HRRHRCCOOIOIIIRORIOOORORHOORIH.this.satisfies((K)var3, (V)var6)) {
               var5.remove();
               var4.add(var6);
            }
         }

         if (var4.isEmpty()) {
            return null;
         } else {
            return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.OICIHROHHCOHRIHRHOHRHIRORHIHHH instanceof RCRCCORIIOICRIIRHCCIIOCICRHIOC
               ? Collections.unmodifiableSet(ICRHCCCCOIICOCHHCRCOOIHICROIHI.newLinkedHashSet(var4))
               : Collections.unmodifiableList(var4);
         }
      }

      @Override
      Set<K> createKeySet() {
         class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, Collection<V>> {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
               super(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this);
            }

            @Override
            public boolean removeAll(Collection<?> var1) {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                        var1
                     )
                  )
               );
            }

            @Override
            public boolean retainAll(Collection<?> var1) {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                           var1
                        )
                     )
                  )
               );
            }

            @Override
            public boolean remove(@Nullable Object var1) {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.remove(var1) != null;
            }
         }

         return new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      }

      @Override
      Set<Entry<K, Collection<V>>> createEntrySet() {
         class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, Collection<V>> {
            @Override
            Map<K, Collection<V>> map() {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this;
            }

            @Override
            public Iterator<Entry<K, Collection<V>>> iterator() {
               return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<Entry<K, Collection<V>>>(
                  
               ) {
                  final Iterator<Entry<K, Collection<V>>> ORIHRCHICOOICIHHCHIRHHHCRIOCOR = HRRHRCCOOIOIIIRORIOOORORHOORIH.this.OICIHROHHCOHRIHRHOHRHIRORHIHHH
                     .asMap()
                     .entrySet()
                     .iterator();

                  protected Entry<K, Collection<V>> computeNext() {
                     while (this.ORIHRCHICOOICIHHCHIRHHHCRIOCOR.hasNext()) {
                        Entry var1 = this.ORIHRCHICOOICIHHCHIRHHHCRIOCOR.next();
                        Object var2 = var1.getKey();
                        Collection var3 = HRRHRCCOOIOIIIRORIOOORORHOORIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           (Collection<V>)var1.getValue(), HRRHRCCOOIOIIIRORIOOORORHOORIH.this.new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2)
                        );
                        if (!var3.isEmpty()) {
                           return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((K)var2, var3);
                        }
                     }

                     return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
                  }
               };
            }

            @Override
            public boolean removeAll(Collection<?> var1) {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                     var1
                  )
               );
            }

            @Override
            public boolean retainAll(Collection<?> var1) {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                        var1
                     )
                  )
               );
            }

            @Override
            public int size() {
               return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.size(this.iterator());
            }
         }

         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      Collection<Collection<V>> createValues() {
         class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, Collection<V>> {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
               super(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this);
            }

            @Override
            public boolean remove(@Nullable Object var1) {
               if (var1 instanceof Collection) {
                  Collection var2 = (Collection)var1;
                  Iterator var3 = HRRHRCCOOIOIIIRORIOOORORHOORIH.this.OICIHROHHCOHRIHRHOHRHIRORHIHHH.asMap().entrySet().iterator();

                  while (var3.hasNext()) {
                     Entry var4 = (Entry)var3.next();
                     Object var5 = var4.getKey();
                     Collection var6 = HRRHRCCOOIOIIIRORIOOORORHOORIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        (Collection<V>)var4.getValue(), HRRHRCCOOIOIIIRORIOOORORHOORIH.this.new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5)
                     );
                     if (!var6.isEmpty() && var2.equals(var6)) {
                        if (var6.size() == ((Collection)var4.getValue()).size()) {
                           var3.remove();
                        } else {
                           var6.clear();
                        }

                        return true;
                     }
                  }
               }

               return false;
            }

            @Override
            public boolean removeAll(Collection<?> var1) {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                     com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                        var1
                     )
                  )
               );
            }

            @Override
            public boolean retainAll(Collection<?> var1) {
               return HRRHRCCOOIOIIIRORIOOORORHOORIH.this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
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

         return new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      }
   }
}
