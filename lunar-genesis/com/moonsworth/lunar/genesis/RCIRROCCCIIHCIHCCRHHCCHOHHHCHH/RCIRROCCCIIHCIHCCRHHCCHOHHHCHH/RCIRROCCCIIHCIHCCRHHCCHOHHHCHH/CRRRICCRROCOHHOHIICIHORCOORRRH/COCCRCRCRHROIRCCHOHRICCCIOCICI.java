package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
public class COCCRCRCRHROIRCCHOHRICCCIOCICI<K, V>
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V>
   implements RICHIIOOOHORCHORORHIHIRRHCOOIH<K, V>,
   Serializable {
   private transient COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> HOCIRIOIROCCIRICIHOHRRIROCRHOI;
   private transient COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO;
   private transient Map<K, COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>> keyToKeyList;
   private transient int size;
   private transient int modCount;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final long HORRHOICCORRIHOICRHCOCIHCCOHRH = 0L;

   public static <K, V> COCCRCRCRHROIRCCHOHRICCCIOCICI<K, V> IHCOOOHHHRROOHOIRHRHHIHCOHRIHI() {
      return new COCCRCRCRHROIRCCHOHRICCCIOCICI<>();
   }

   public static <K, V> COCCRCRCRHROIRCCHOHRICCCIOCICI<K, V> RIOCOIOCRIOOIICORRRRCIHHCHCICC(int var0) {
      return new COCCRCRCRHROIRCCHOHRICCCIOCICI<>(var0);
   }

   public static <K, V> COCCRCRCRHROIRCCHOHRICCCIOCICI<K, V> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var0) {
      return new COCCRCRCRHROIRCCHOHRICCCIOCICI<>(var0);
   }

   COCCRCRCRHROIRCCHOHRICCCIOCICI() {
      this(12);
   }

   private COCCRCRCRHROIRCCHOHRICCCIOCICI(int var1) {
      this.keyToKeyList = IHHRRRRCOCHIIOIOHORHCIRRRCHCCR.newHashMapWithExpectedSize(var1);
   }

   private COCCRCRCRHROIRCCHOHRICCCIOCICI(CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var1) {
      this(var1.keySet().size());
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @CanIgnoreReturnValue
   private COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @Nullable K var1, @Nullable V var2, COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> var3
   ) {
      COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 = new COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(var1, var2);
      if (this.HOCIRIOIROCCIRICIHOHRRIROCRHOI == null) {
         this.HOCIRIOIROCCIRICIHOHRRIROCRHOI = this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO = var4;
         this.keyToKeyList.put((K)var1, new COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(var4));
         this.modCount++;
      } else if (var3 == null) {
         this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO.RHRCICHCIOHRIIIHOHCOROROCIORHI = var4;
         var4.COCROCRORHCROHRCHRHHRCHOHCORCO = this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO;
         this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO = var4;
         COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = this.keyToKeyList.get(var1);
         if (var5 == null) {
            this.keyToKeyList.put((K)var1, new COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(var4));
            this.modCount++;
         } else {
            var5.count++;
            COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var6 = var5.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO;
            var6.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR = var4;
            var4.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC = var6;
            var5.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO = var4;
         }
      } else {
         COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = this.keyToKeyList.get(var1);
         var7.count++;
         var4.COCROCRORHCROHRCHRHHRCHOHCORCO = var3.COCROCRORHCROHRCHRHHRCHOHCORCO;
         var4.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC = var3.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC;
         var4.RHRCICHCIOHRIIIHOHCOROROCIORHI = var3;
         var4.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR = var3;
         if (var3.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC == null) {
            this.keyToKeyList.get(var1).HOCIRIOIROCCIRICIHOHRRIROCRHOI = var4;
         } else {
            var3.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR = var4;
         }

         if (var3.COCROCRORHCROHRCHRHHRCHOHCORCO == null) {
            this.HOCIRIOIROCCIRICIHOHRRIROCRHOI = var4;
         } else {
            var3.COCROCRORHCROHRCHRHHRCHOHCORCO.RHRCICHCIOHRIIIHOHCOROROCIORHI = var4;
         }

         var3.COCROCRORHCROHRCHRHHRCHOHCORCO = var4;
         var3.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC = var4;
      }

      this.size++;
      return var4;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> var1) {
      if (var1.COCROCRORHCROHRCHRHHRCHOHCORCO != null) {
         var1.COCROCRORHCROHRCHRHHRCHOHCORCO.RHRCICHCIOHRIIIHOHCOROROCIORHI = var1.RHRCICHCIOHRIIIHOHCOROROCIORHI;
      } else {
         this.HOCIRIOIROCCIRICIHOHRRIROCRHOI = var1.RHRCICHCIOHRIIIHOHCOROROCIORHI;
      }

      if (var1.RHRCICHCIOHRIIIHOHCOROROCIORHI != null) {
         var1.RHRCICHCIOHRIIIHOHCOROROCIORHI.COCROCRORHCROHRCHRHHRCHOHCORCO = var1.COCROCRORHCROHRCHRHHRCHOHCORCO;
      } else {
         this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO = var1.COCROCRORHCROHRCHRHHRCHOHCORCO;
      }

      if (var1.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC == null && var1.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR == null) {
         COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = this.keyToKeyList.remove(var1.RCHORIOHOIRHHOHOCRCHIIRRRIICOC);
         var3.count = 0;
         this.modCount++;
      } else {
         COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = this.keyToKeyList.get(var1.RCHORIOHOIRHHOHOCRCHIIRRRIICOC);
         var2.count--;
         if (var1.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC == null) {
            var2.HOCIRIOIROCCIRICIHOHRRIROCRHOI = var1.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR;
         } else {
            var1.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR = var1.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR;
         }

         if (var1.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR == null) {
            var2.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO = var1.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC;
         } else {
            var1.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC = var1.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC;
         }
      }

      this.size--;
   }

   private void removeAllNodes(@Nullable Object var1) {
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(new COCCRCRCRHROIRCCHOHRICCCIOCICI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1));
   }

   private static void checkElement(@Nullable Object var0) {
      if (var0 == null) {
         throw new NoSuchElementException();
      }
   }

   @Override
   public int size() {
      return this.size;
   }

   @Override
   public boolean isEmpty() {
      return this.HOCIRIOIROCCIRICIHOHRRIROCRHOI == null;
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.keyToKeyList.containsKey(var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.values().contains(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean put(@Nullable K var1, @Nullable V var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((K)var1, (V)var2, null);
      return true;
   }

   @CanIgnoreReturnValue
   @Override
   public List<V> replaceValues(@Nullable K var1, Iterable<? extends V> var2) {
      List var3 = this.getCopy(var1);
      COCCRCRCRHROIRCCHOHRICCCIOCICI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var4 = new COCCRCRCRHROIRCCHOHRICCCIOCICI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
      Iterator var5 = var2.iterator();

      while (var4.hasNext() && var5.hasNext()) {
         var4.next();
         var4.set(var5.next());
      }

      while (var4.hasNext()) {
         var4.next();
         var4.remove();
      }

      while (var5.hasNext()) {
         var4.add(var5.next());
      }

      return var3;
   }

   private List<V> getCopy(@Nullable Object var1) {
      return Collections.unmodifiableList(RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList(new COCCRCRCRHROIRCCHOHRICCCIOCICI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1)));
   }

   @CanIgnoreReturnValue
   @Override
   public List<V> removeAll(@Nullable Object var1) {
      List var2 = this.getCopy(var1);
      this.removeAllNodes(var1);
      return var2;
   }

   @Override
   public void clear() {
      this.HOCIRIOIROCCIRICIHOHRRIROCRHOI = null;
      this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO = null;
      this.keyToKeyList.clear();
      this.size = 0;
      this.modCount++;
   }

   @Override
   public List<V> get(final @Nullable K var1) {
      return new AbstractSequentialList<V>() {
         @Override
         public int size() {
            COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1x = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.keyToKeyList.get(var1);
            return var1x == null ? 0 : var1x.count;
         }

         @Override
         public ListIterator<V> listIterator(int var1x) {
            return COCCRCRCRHROIRCCHOHRICCCIOCICI.this.new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1, var1x);
         }
      };
   }

   @Override
   Set<K> createKeySet() {
      class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ICRHCCCCOIICOCHHCRCOOIHICROIHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K> {
         @Override
         public int size() {
            return COCCRCRCRHROIRCCHOHRICCCIOCICI.this.keyToKeyList.size();
         }

         @Override
         public Iterator<K> iterator() {
            return COCCRCRCRHROIRCCHOHRICCCIOCICI.this.new CRRRICCRROCOHHOHIICIHORCOORRRH();
         }

         @Override
         public boolean contains(Object var1) {
            return COCCRCRCRHROIRCCHOHRICCCIOCICI.this.containsKey(var1);
         }

         @Override
         public boolean remove(Object var1) {
            return !COCCRCRCRHROIRCCHOHRICCCIOCICI.this.removeAll(var1).isEmpty();
         }
      }

      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   @Override
   CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> OHOHIROHHCIRICHIHRORHOHRIIHHRO() {
      return new HORCRRHOCRRICHROCIOOIORIOHCIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<>(this);
   }

   public List<V> values() {
      return (List<V>)super.values();
   }

   List<V> createValues() {
      class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends AbstractSequentialList<V> {
         @Override
         public int size() {
            return COCCRCRCRHROIRCCHOHRICCCIOCICI.this.size;
         }

         @Override
         public ListIterator<V> listIterator(int var1) {
            final COCCRCRCRHROIRCCHOHRICCCIOCICI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
               var1
            );
            return new CCHCOROOHHCIHOHOCHIHRHOHOCROII<Entry<K, V>, V>(var2) {
               V transform(Entry<K, V> var1) {
                  return (V)var1.getValue();
               }

               @Override
               public void set(V var1) {
                  var2.setValue((V)var1);
               }
            };
         }
      }

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   }

   public List<Entry<K, V>> entries() {
      return (List<Entry<K, V>>)super.entries();
   }

   List<Entry<K, V>> createEntries() {
      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractSequentialList<Entry<K, V>> {
         @Override
         public int size() {
            return COCCRCRCRHROIRCCHOHRICCCIOCICI.this.size;
         }

         @Override
         public ListIterator<Entry<K, V>> listIterator(int var1) {
            return COCCRCRCRHROIRCCHOHRICCCIOCICI.this.new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
         }

         @Override
         public void forEach(Consumer<? super Entry<K, V>> var1) {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            );

            for (COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.HOCIRIOIROCCIRICIHOHRRIROCRHOI;
               var2 != null;
               var2 = var2.RHRCICHCIOHRIIIHOHCOROROCIORHI
            ) {
               var1.accept(var2);
            }
         }
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Override
   Iterator<Entry<K, V>> entryIterator() {
      throw new AssertionError("should never be called");
   }

   @Override
   Map<K, Collection<V>> createAsMap() {
      return new HORCRRHOCRRICHROCIOOIORIOHCIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(this);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeInt(this.size());

      for (Entry var3 : this.entries()) {
         var1.writeObject(var3.getKey());
         var1.writeObject(var3.getValue());
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.keyToKeyList = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newLinkedHashMap();
      int var2 = var1.readInt();

      for (int var3 = 0; var3 < var2; var3++) {
         Object var4 = var1.readObject();
         Object var5 = var1.readObject();
         this.put((K)var4, (V)var5);
      }
   }

   private class CRRRICCRROCOHHOHIICIHORCOORRRH implements Iterator<K> {
      final Set<K> HHOHCHHOCCHCRCCIIOOCCRRHCIOHRH = ICRHCCCCOIICOCHHCRCOOIHICROIHI.newHashSetWithExpectedSize(
         COCCRCRCRHROIRCCHOHRICCCIOCICI.this.keySet().size()
      );
      COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> RHRCICHCIOHRIIIHOHCOROROCIORHI = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.HOCIRIOIROCCIRICIHOHRRIROCRHOI;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> CCHHRCIHOCOIOROHHCCICHCHOOCCRH;
      int expectedModCount = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.modCount;

      private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      }

      private void checkForConcurrentModification() {
         if (COCCRCRCRHROIRCCHOHRICCCIOCICI.this.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         }
      }

      @Override
      public boolean hasNext() {
         this.checkForConcurrentModification();
         return this.RHRCICHCIOHRIIIHOHCOROROCIORHI != null;
      }

      @Override
      public K next() {
         this.checkForConcurrentModification();
         COCCRCRCRHROIRCCHOHRICCCIOCICI.checkElement(this.RHRCICHCIOHRIIIHOHCOROROCIORHI);
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = this.RHRCICHCIOHRIIIHOHCOROROCIORHI;
         this.HHOHCHHOCCHCRCCIIOOCCRRHCIOHRH.add(this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.RCHORIOHOIRHHOHOCRCHIIRRRIICOC);

         do {
            this.RHRCICHCIOHRIIIHOHCOROROCIORHI = this.RHRCICHCIOHRIIIHOHCOROROCIORHI.RHRCICHCIOHRIIIHOHCOROROCIORHI;
         } while (
            this.RHRCICHCIOHRIIIHOHCOROROCIORHI != null
               && !this.HHOHCHHOCCHCRCCIIOOCCRRHCIOHRH.add(this.RHRCICHCIOHRIIIHOHCOROROCIORHI.RCHORIOHOIRHHOHOCRCHIIRRRIICOC)
         );

         return this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.RCHORIOHOIRHHOHOCRCHIIRRRIICOC;
      }

      @Override
      public void remove() {
         this.checkForConcurrentModification();
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH != null);
         COCCRCRCRHROIRCCHOHRICCCIOCICI.this.removeAllNodes(this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.RCHORIOHOIRHHOHOCRCHIIRRRIICOC);
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = null;
         this.expectedModCount = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.modCount;
      }
   }

   private class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements ListIterator<Entry<K, V>> {
      int nextIndex;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> RHRCICHCIOHRIIIHOHCOROROCIORHI;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> CCHHRCIHOCOIOROHHCCICHCHOOCCRH;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> COCROCRORHCROHRCHRHHRCHOHCORCO;
      int expectedModCount = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.modCount;

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var2) {
         int var3 = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.size();
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
            var2, var3
         );
         if (var2 >= var3 / 2) {
            this.COCROCRORHCROHRCHRHHRCHOHCORCO = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO;
            this.nextIndex = var3;

            while (var2++ < var3) {
               this.HIIOHCHIRORIIIRIIIORHRIHIHOIRI();
            }
         } else {
            this.RHRCICHCIOHRIIIHOHCOROROCIORHI = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.HOCIRIOIROCCIRICIHOHRRIROCRHOI;

            while (var2-- > 0) {
               this.CIHHIHHOOHHRRIRRHRIRCIRRCHOOIH();
            }
         }

         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = null;
      }

      private void checkForConcurrentModification() {
         if (COCCRCRCRHROIRCCHOHRICCCIOCICI.this.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         }
      }

      @Override
      public boolean hasNext() {
         this.checkForConcurrentModification();
         return this.RHRCICHCIOHRIIIHOHCOROROCIORHI != null;
      }

      @CanIgnoreReturnValue
      public COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> CIHHIHHOOHHRRIRRHRIRCIRRCHOOIH() {
         this.checkForConcurrentModification();
         COCCRCRCRHROIRCCHOHRICCCIOCICI.checkElement(this.RHRCICHCIOHRIIIHOHCOROROCIORHI);
         this.COCROCRORHCROHRCHRHHRCHOHCORCO = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = this.RHRCICHCIOHRIIIHOHCOROROCIORHI;
         this.RHRCICHCIOHRIIIHOHCOROROCIORHI = this.RHRCICHCIOHRIIIHOHCOROROCIORHI.RHRCICHCIOHRIIIHOHCOROROCIORHI;
         this.nextIndex++;
         return this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH;
      }

      @Override
      public void remove() {
         this.checkForConcurrentModification();
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH != null);
         if (this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH != this.RHRCICHCIOHRIIIHOHCOROROCIORHI) {
            this.COCROCRORHCROHRCHRHHRCHOHCORCO = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.COCROCRORHCROHRCHRHHRCHOHCORCO;
            this.nextIndex--;
         } else {
            this.RHRCICHCIOHRIIIHOHCOROROCIORHI = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.RHRCICHCIOHRIIIHOHCOROROCIORHI;
         }

         COCCRCRCRHROIRCCHOHRICCCIOCICI.this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH);
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = null;
         this.expectedModCount = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.modCount;
      }

      @Override
      public boolean hasPrevious() {
         this.checkForConcurrentModification();
         return this.COCROCRORHCROHRCHRHHRCHOHCORCO != null;
      }

      @CanIgnoreReturnValue
      public COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> HIIOHCHIRORIIIRIIIORHRIHIHOIRI() {
         this.checkForConcurrentModification();
         COCCRCRCRHROIRCCHOHRICCCIOCICI.checkElement(this.COCROCRORHCROHRCHRHHRCHOHCORCO);
         this.RHRCICHCIOHRIIIHOHCOROROCIORHI = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = this.COCROCRORHCROHRCHRHHRCHOHCORCO;
         this.COCROCRORHCROHRCHRHHRCHOHCORCO = this.COCROCRORHCROHRCHRHHRCHOHCORCO.COCROCRORHCROHRCHRHHRCHOHCORCO;
         this.nextIndex--;
         return this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH;
      }

      @Override
      public int nextIndex() {
         return this.nextIndex;
      }

      @Override
      public int previousIndex() {
         return this.nextIndex - 1;
      }

      public void set(Entry<K, V> var1) {
         throw new UnsupportedOperationException();
      }

      public void add(Entry<K, V> var1) {
         throw new UnsupportedOperationException();
      }

      void setValue(V var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH != null
         );
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.value = (V)var1;
      }
   }

   private class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements ListIterator<V> {
      final @Nullable Object OOHIHRCOHIOOOIIRCHHOCHOIRRHCHR;
      int nextIndex;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> RHRCICHCIOHRIIIHOHCOROROCIORHI;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> CCHHRCIHOCOIOROHHCCICHCHOOCCRH;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> COCROCRORHCROHRCHRHHRCHOHCORCO;

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@Nullable Object var2) {
         this.OOHIHRCOHIOOOIIRCHHOCHOIRRHCHR = var2;
         COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.keyToKeyList.get(var2);
         this.RHRCICHCIOHRIIIHOHCOROROCIORHI = var3 == null ? null : var3.HOCIRIOIROCCIRICIHOHRRIROCRHOI;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@Nullable Object var2, int var3) {
         COCCRCRCRHROIRCCHOHRICCCIOCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.keyToKeyList.get(var2);
         int var5 = var4 == null ? 0 : var4.count;
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
            var3, var5
         );
         if (var3 >= var5 / 2) {
            this.COCROCRORHCROHRCHRHHRCHOHCORCO = var4 == null ? null : var4.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO;
            this.nextIndex = var5;

            while (var3++ < var5) {
               this.previous();
            }
         } else {
            this.RHRCICHCIOHRIIIHOHCOROROCIORHI = var4 == null ? null : var4.HOCIRIOIROCCIRICIHOHRRIROCRHOI;

            while (var3-- > 0) {
               this.next();
            }
         }

         this.OOHIHRCOHIOOOIIRCHHOCHOIRRHCHR = var2;
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = null;
      }

      @Override
      public boolean hasNext() {
         return this.RHRCICHCIOHRIIIHOHCOROROCIORHI != null;
      }

      @CanIgnoreReturnValue
      @Override
      public V next() {
         COCCRCRCRHROIRCCHOHRICCCIOCICI.checkElement(this.RHRCICHCIOHRIIIHOHCOROROCIORHI);
         this.COCROCRORHCROHRCHRHHRCHOHCORCO = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = this.RHRCICHCIOHRIIIHOHCOROROCIORHI;
         this.RHRCICHCIOHRIIIHOHCOROROCIORHI = this.RHRCICHCIOHRIIIHOHCOROROCIORHI.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR;
         this.nextIndex++;
         return this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.value;
      }

      @Override
      public boolean hasPrevious() {
         return this.COCROCRORHCROHRCHRHHRCHOHCORCO != null;
      }

      @CanIgnoreReturnValue
      @Override
      public V previous() {
         COCCRCRCRHROIRCCHOHRICCCIOCICI.checkElement(this.COCROCRORHCROHRCHRHHRCHOHCORCO);
         this.RHRCICHCIOHRIIIHOHCOROROCIORHI = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = this.COCROCRORHCROHRCHRHHRCHOHCORCO;
         this.COCROCRORHCROHRCHRHHRCHOHCORCO = this.COCROCRORHCROHRCHRHHRCHOHCORCO.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC;
         this.nextIndex--;
         return this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.value;
      }

      @Override
      public int nextIndex() {
         return this.nextIndex;
      }

      @Override
      public int previousIndex() {
         return this.nextIndex - 1;
      }

      @Override
      public void remove() {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH != null);
         if (this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH != this.RHRCICHCIOHRIIIHOHCOROROCIORHI) {
            this.COCROCRORHCROHRCHRHHRCHOHCORCO = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC;
            this.nextIndex--;
         } else {
            this.RHRCICHCIOHRIIIHOHCOROROCIORHI = this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR;
         }

         COCCRCRCRHROIRCCHOHRICCCIOCICI.this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH);
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = null;
      }

      @Override
      public void set(V var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH != null
         );
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH.value = (V)var1;
      }

      @Override
      public void add(V var1) {
         this.COCROCRORHCROHRCHRHHRCHOHCORCO = COCCRCRCRHROIRCCHOHRICCCIOCICI.this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (K)this.OOHIHRCOHIOOOIIRCHHOCHOIRRHCHR, (V)var1, this.RHRCICHCIOHRIIIHOHCOROROCIORHI
         );
         this.nextIndex++;
         this.CCHHRCIHOCOIOROHHCCICHCHOOCCRH = null;
      }
   }

   private static final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
      final @Nullable K RCHORIOHOIRHHOHOCRCHIIRRRIICOC;
      @Nullable V value;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> RHRCICHCIOHRIIIHOHCOROROCIORHI;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> COCROCRORHCROHRCHRHHRCHOHCORCO;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.@Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> RRRRHRHRIOHCHCHCROCIHRRIRHHIHC;

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(@Nullable K var1, @Nullable V var2) {
         this.RCHORIOHOIRHHOHOCRCHIIRRRIICOC = (K)var1;
         this.value = (V)var2;
      }

      @Override
      public K getKey() {
         return this.RCHORIOHOIRHHOHOCRCHIIRRRIICOC;
      }

      @Override
      public V getValue() {
         return this.value;
      }

      @Override
      public V setValue(@Nullable V var1) {
         Object var2 = this.value;
         this.value = (V)var1;
         return (V)var2;
      }
   }

   private static class RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V> {
      COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> HOCIRIOIROCCIRICIHOHRRIROCRHOI;
      COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO;
      int count;

      RRCRRCORICCHOHHIRCHIROOHIIOHCO(COCCRCRCRHROIRCCHOHRICCCIOCICI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<K, V> var1) {
         this.HOCIRIOIROCCIRICIHOHRRIROCRHOI = var1;
         this.ORCRCRRIIOCRHCHIOCOCOHIRCRIHOO = var1;
         var1.RRRRHRHRIOHCHCHCROCIHRRIRHHIHC = null;
         var1.ICRHOCRCRIHRHCCHHOHCCCIHHCCHHR = null;
         this.count = 1;
      }
   }
}
