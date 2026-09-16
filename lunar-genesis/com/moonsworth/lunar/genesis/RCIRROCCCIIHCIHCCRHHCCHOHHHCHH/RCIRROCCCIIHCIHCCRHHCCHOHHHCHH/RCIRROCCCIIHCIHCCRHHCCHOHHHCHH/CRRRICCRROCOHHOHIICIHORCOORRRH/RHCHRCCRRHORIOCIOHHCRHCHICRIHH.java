package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
public class RHCHRCCRRHORIOCIOHHCRHCHICRIHH<K, V> extends CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V> {
   private transient Comparator<? super K> keyComparator;
   private transient Comparator<? super V> valueComparator;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final long IHICOHIIOHOIRROHIICCIOIROOIIRR = 0L;

   public static <K extends Comparable, V extends Comparable> RHCHRCCRRHORIOCIOHHCRHCHICRIHH<K, V> HCIHRRHOORRRRIHCCICCIHIOIHORIR() {
      return new RHCHRCCRRHORIOCIOHHCRHCHICRIHH<>(
         IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC(), IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC()
      );
   }

   public static <K, V> RHCHRCCRRHORIOCIOHHCRHCHICRIHH<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Comparator<? super K> var0, Comparator<? super V> var1) {
      return new RHCHRCCRRHORIOCIOHHCRHCHICRIHH<>(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var0
         ),
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         )
      );
   }

   public static <K extends Comparable, V extends Comparable> RHCHRCCRRHORIOCIOHHCRHCHICRIHH<K, V> IRRCCOICORICIHCHRHIHIHROIRHOCR(
      CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var0
   ) {
      return new RHCHRCCRRHORIOCIOHHCRHCHICRIHH<>(
         IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC(), IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC(), var0
      );
   }

   RHCHRCCRRHORIOCIOHHCRHCHICRIHH(Comparator<? super K> var1, Comparator<? super V> var2) {
      super(new TreeMap<>(var1));
      this.keyComparator = var1;
      this.valueComparator = var2;
   }

   private RHCHRCCRRHORIOCIOHHCRHCHICRIHH(Comparator<? super K> var1, Comparator<? super V> var2, CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var3) {
      this(var1, var2);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
   }

   @Override
   Map<K, Collection<V>> createAsMap() {
      return this.RRCHHCHRCRHOHRCHIIOCOIOORCCICC();
   }

   @Override
   SortedSet<V> createCollection() {
      return new TreeSet<>(this.valueComparator);
   }

   @Override
   Collection<V> createCollection(@Nullable K var1) {
      if (var1 == null) {
         this.keyComparator().compare((K)var1, (K)var1);
      }

      return super.createCollection((K)var1);
   }

   @Deprecated
   public Comparator<? super K> keyComparator() {
      return this.keyComparator;
   }

   @Override
   public Comparator<? super V> valueComparator() {
      return this.valueComparator;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public NavigableSet<V> get(@Nullable K var1) {
      return (NavigableSet<V>)super.get((K)var1);
   }

   public NavigableSet<K> keySet() {
      return (NavigableSet<K>)super.keySet();
   }

   public NavigableMap<K, Collection<V>> asMap() {
      return (NavigableMap<K, Collection<V>>)super.asMap();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeObject(this.keyComparator());
      var1.writeObject(this.valueComparator());
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.keyComparator = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (Comparator<? super K>)var1.readObject()
      );
      this.valueComparator = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (Comparator<? super V>)var1.readObject()
      );
      this.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(new TreeMap<>(this.keyComparator));
      COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }
}
