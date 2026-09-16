package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
class OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V> extends AbstractMap<K, V> implements Serializable {
   private static final Object HCHCOCICICOORRIRRCICIIRICOHHHO = new Object();
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static final double HRORIHCCCHOOCIHHOCCIOOICIIICIR = 0.001;
   private static final int RRORHIOOHOHIIOIRIIIOIHOCCHCHOC = 9;
   private transient @Nullable Object table;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   transient int @Nullable [] entries;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   transient Object @Nullable [] keys;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   transient Object @Nullable [] values;
   private transient int metadata;
   private transient int size;
   private transient @Nullable Set<K> keySetView;
   private transient @Nullable Set<Entry<K, V>> entrySetView;
   private transient @Nullable Collection<V> valuesView;

   public static <K, V> OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V> CHRICHRIHHCOCHOOHRHHCCIOIRHIIO() {
      return new OIHCOHRCICCCRHRCROOCIOIRRHHHIH<>();
   }

   public static <K, V> OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V> IIOCROIORHIICHOOCHCIRIRHICORCI(int var0) {
      return new OIHCOHRCICCCRHRCROOCIOIRRHHHIH<>(var0);
   }

   OIHCOHRCICCCRHRCROOCIOIRRHHHIH() {
      this.init(3);
   }

   OIHCOHRCICCCRHRCROOCIOIRRHHHIH(int var1) {
      this.init(var1);
   }

   void init(int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0, "Expected size must be >= 0"
      );
      this.metadata = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.constrainToRange(
         var1, 1, 1073741823
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   boolean needsAllocArrays() {
      return this.table == null;
   }

   @CanIgnoreReturnValue
   int allocArrays() {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         this.needsAllocArrays(), "Arrays already allocated"
      );
      int var1 = this.metadata;
      int var2 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableSize(var1);
      this.table = IOHIHIIHCCCCCIHRORIOIOORCIOHII.createTable(var2);
      this.setHashTableMask(var2 - 1);
      this.entries = new int[var1];
      this.keys = new Object[var1];
      this.values = new Object[var1];
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   @Nullable Map<K, V> delegateOrNull() {
      return this.table instanceof Map ? (Map)this.table : null;
   }

   Map<K, V> createHashFloodingResistantDelegate(int var1) {
      return new LinkedHashMap<>(var1, 1.0F);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   @CanIgnoreReturnValue
   Map<K, V> convertToHashFloodingResistantImplementation() {
      Map var1 = this.createHashFloodingResistantDelegate(this.hashTableMask() + 1);

      for (int var2 = this.firstEntryIndex(); var2 >= 0; var2 = this.getSuccessor(var2)) {
         var1.put(this.keys[var2], this.values[var2]);
      }

      this.table = var1;
      this.entries = null;
      this.keys = null;
      this.values = null;
      this.incrementModCount();
      return var1;
   }

   private void setHashTableMask(int var1) {
      int var2 = 32 - Integer.numberOfLeadingZeros(var1);
      this.metadata = IOHIHIIHCCCCCIHRORIOIOORCIOHII.maskCombine(this.metadata, var2, 31);
   }

   private int hashTableMask() {
      return (1 << (this.metadata & 31)) - 1;
   }

   void incrementModCount() {
      this.metadata += 32;
   }

   void accessEntry(int var1) {
   }

   @CanIgnoreReturnValue
   @Override
   public V put(K var1, V var2) {
      if (this.needsAllocArrays()) {
         this.allocArrays();
      }

      Map var3 = this.delegateOrNull();
      if (var3 != null) {
         return (V)var3.put(var1, var2);
      }

      int[] var4 = this.entries;
      Object[] var5 = this.keys;
      Object[] var6 = this.values;
      int var7 = this.size;
      int var8 = var7 + 1;
      int var9 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smearedHash(var1);
      int var10 = this.hashTableMask();
      int var11 = var9 & var10;
      int var12 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableGet(this.table, var11);
      if (var12 == 0) {
         if (var8 > var10) {
            var10 = this.resizeTable(var10, IOHIHIIHCCCCCIHRORIOIOORCIOHII.newCapacity(var10), var9, var7);
         } else {
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableSet(this.table, var11, var7 + 1);
         }
      } else {
         int var15 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var9, var10);
         int var16 = 0;

         int var13;
         int var14;
         do {
            var13 = var12 - 1;
            var14 = var4[var13];
            if (IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var14, var10) == var15
               && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
                  var1, var5[var13]
               )) {
               Object var17 = var6[var13];
               var6[var13] = var2;
               this.accessEntry(var13);
               return (V)var17;
            }

            var12 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getNext(var14, var10);
            var16++;
         } while (var12 != 0);

         if (var16 >= 9) {
            return this.convertToHashFloodingResistantImplementation().put((K)var1, (V)var2);
         }

         if (var8 > var10) {
            var10 = this.resizeTable(var10, IOHIHIIHCCCCCIHRORIOIOORCIOHII.newCapacity(var10), var9, var7);
         } else {
            var4[var13] = IOHIHIIHCCCCCIHRORIOIOORCIOHII.maskCombine(var14, var7 + 1, var10);
         }
      }

      this.resizeMeMaybe(var8);
      this.insertEntry(var7, (K)var1, (V)var2, var9, var10);
      this.size = var8;
      this.incrementModCount();
      return null;
   }

   void insertEntry(int var1, @Nullable K var2, @Nullable V var3, int var4, int var5) {
      this.entries[var1] = IOHIHIIHCCCCCIHRORIOIOORCIOHII.maskCombine(var4, 0, var5);
      this.keys[var1] = var2;
      this.values[var1] = var3;
   }

   private void resizeMeMaybe(int var1) {
      int var2 = this.entries.length;
      if (var1 > var2) {
         int var3 = Math.min(1073741823, var2 + Math.max(1, var2 >>> 1) | 1);
         if (var3 != var2) {
            this.resizeEntries(var3);
         }
      }
   }

   void resizeEntries(int var1) {
      this.entries = Arrays.copyOf(this.entries, var1);
      this.keys = Arrays.copyOf(this.keys, var1);
      this.values = Arrays.copyOf(this.values, var1);
   }

   @CanIgnoreReturnValue
   private int resizeTable(int var1, int var2, int var3, int var4) {
      Object var5 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.createTable(var2);
      int var6 = var2 - 1;
      if (var4 != 0) {
         IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableSet(var5, var3 & var6, var4 + 1);
      }

      Object var7 = this.table;
      int[] var8 = this.entries;

      for (int var9 = 0; var9 <= var1; var9++) {
         int var10 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableGet(var7, var9);

         while (var10 != 0) {
            int var11 = var10 - 1;
            int var12 = var8[var11];
            int var13 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var12, var1) | var9;
            int var14 = var13 & var6;
            int var15 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableGet(var5, var14);
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableSet(var5, var14, var10);
            var8[var11] = IOHIHIIHCCCCCIHRORIOIOORCIOHII.maskCombine(var13, var15, var6);
            var10 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getNext(var12, var1);
         }
      }

      this.table = var5;
      this.setHashTableMask(var6);
      return var6;
   }

   private int indexOf(@Nullable Object var1) {
      if (this.needsAllocArrays()) {
         return -1;
      }

      int var2 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smearedHash(var1);
      int var3 = this.hashTableMask();
      int var4 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableGet(this.table, var2 & var3);
      if (var4 == 0) {
         return -1;
      }

      int var5 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var2, var3);

      do {
         int var6 = var4 - 1;
         int var7 = this.entries[var6];
         if (IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var7, var3) == var5
            && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               var1, this.keys[var6]
            )) {
            return var6;
         }

         var4 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getNext(var7, var3);
      } while (var4 != 0);

      return -1;
   }

   @Override
   public boolean containsKey(Object var1) {
      Map var2 = this.delegateOrNull();
      return var2 != null ? var2.containsKey(var1) : this.indexOf(var1) != -1;
   }

   @Override
   public V get(Object var1) {
      Map var2 = this.delegateOrNull();
      if (var2 != null) {
         return (V)var2.get(var1);
      }

      int var3 = this.indexOf(var1);
      if (var3 == -1) {
         return null;
      }

      this.accessEntry(var3);
      return (V)this.values[var3];
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(Object var1) {
      Map var2 = this.delegateOrNull();
      if (var2 != null) {
         return (V)var2.remove(var1);
      }

      Object var3 = this.removeHelper(var1);
      return (V)(var3 == HCHCOCICICOORRIRRCICIIRICOHHHO ? null : var3);
   }

   private Object removeHelper(Object var1) {
      if (this.needsAllocArrays()) {
         return HCHCOCICICOORRIRRCICIIRICOHHHO;
      }

      int var2 = this.hashTableMask();
      int var3 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.remove(var1, null, var2, this.table, this.entries, this.keys, null);
      if (var3 == -1) {
         return HCHCOCICICOORRIRRCICIIRICOHHHO;
      }

      Object var4 = this.values[var3];
      this.moveLastEntry(var3, var2);
      this.size--;
      this.incrementModCount();
      return var4;
   }

   void moveLastEntry(int var1, int var2) {
      int var3 = this.size() - 1;
      if (var1 < var3) {
         Object var4 = this.keys[var3];
         this.keys[var1] = var4;
         this.values[var1] = this.values[var3];
         this.keys[var3] = null;
         this.values[var3] = null;
         this.entries[var1] = this.entries[var3];
         this.entries[var3] = 0;
         int var5 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smearedHash(var4) & var2;
         int var6 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableGet(this.table, var5);
         int var7 = var3 + 1;
         if (var6 == var7) {
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableSet(this.table, var5, var1 + 1);
         } else {
            int var8;
            int var9;
            do {
               var8 = var6 - 1;
               var9 = this.entries[var8];
               var6 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getNext(var9, var2);
            } while (var6 != var7);

            this.entries[var8] = IOHIHIIHCCCCCIHRORIOIOORCIOHII.maskCombine(var9, var1 + 1, var2);
         }
      } else {
         this.keys[var1] = null;
         this.values[var1] = null;
         this.entries[var1] = 0;
      }
   }

   int firstEntryIndex() {
      return this.isEmpty() ? -1 : 0;
   }

   int getSuccessor(int var1) {
      return var1 + 1 < this.size ? var1 + 1 : -1;
   }

   int adjustAfterRemove(int var1, int var2) {
      return var1 - 1;
   }

   @Override
   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Map var2 = this.delegateOrNull();
      if (var2 != null) {
         var2.replaceAll(var1);
      } else {
         for (int var3 = 0; var3 < this.size; var3++) {
            this.values[var3] = var1.apply(this.keys[var3], this.values[var3]);
         }
      }
   }

   @Override
   public Set<K> keySet() {
      return this.keySetView == null ? (this.keySetView = this.createKeySet()) : this.keySetView;
   }

   Set<K> createKeySet() {
      return new OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   }

   Iterator<K> keySetIterator() {
      Map var1 = this.delegateOrNull();
      return var1 != null ? var1.keySet().iterator() : new OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V>.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K>() {
         @Override
         K getOutput(int var1) {
            return (K)OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys[var1];
         }
      };
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Map var2 = this.delegateOrNull();
      if (var2 != null) {
         var2.forEach(var1);
      } else {
         for (int var3 = this.firstEntryIndex(); var3 >= 0; var3 = this.getSuccessor(var3)) {
            var1.accept(this.keys[var3], this.values[var3]);
         }
      }
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      return this.entrySetView == null ? (this.entrySetView = this.createEntrySet()) : this.entrySetView;
   }

   Set<Entry<K, V>> createEntrySet() {
      return new OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   Iterator<Entry<K, V>> entrySetIterator() {
      Map var1 = this.delegateOrNull();
      return var1 != null ? var1.entrySet().iterator() : new OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V>.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Entry<K, V>>() {
         Entry<K, V> getOutput(int var1) {
            return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.new CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
         }
      };
   }

   @Override
   public int size() {
      Map var1 = this.delegateOrNull();
      return var1 != null ? var1.size() : this.size;
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public boolean containsValue(Object var1) {
      Map var2 = this.delegateOrNull();
      if (var2 != null) {
         return var2.containsValue(var1);
      }

      for (int var3 = 0; var3 < this.size; var3++) {
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var1, this.values[var3]
         )) {
            return true;
         }
      }

      return false;
   }

   @Override
   public Collection<V> values() {
      return this.valuesView == null ? (this.valuesView = this.createValues()) : this.valuesView;
   }

   Collection<V> createValues() {
      return new OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO();
   }

   Iterator<V> valuesIterator() {
      Map var1 = this.delegateOrNull();
      return var1 != null ? var1.values().iterator() : new OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V>.IRCIIHHICIHRCOCRROCOICRIHHCCHH<V>() {
         @Override
         V getOutput(int var1) {
            return (V)OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values[var1];
         }
      };
   }

   public void trimToSize() {
      if (!this.needsAllocArrays()) {
         Map var1 = this.delegateOrNull();
         if (var1 != null) {
            Map var5 = this.createHashFloodingResistantDelegate(this.size());
            var5.putAll(var1);
            this.table = var5;
         } else {
            int var2 = this.size;
            if (var2 < this.entries.length) {
               this.resizeEntries(var2);
            }

            int var3 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableSize(var2);
            int var4 = this.hashTableMask();
            if (var3 < var4) {
               this.resizeTable(var4, var3, 0, 0);
            }
         }
      }
   }

   @Override
   public void clear() {
      if (!this.needsAllocArrays()) {
         this.incrementModCount();
         Map var1 = this.delegateOrNull();
         if (var1 != null) {
            this.metadata = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.constrainToRange(
               this.size(), 3, 1073741823
            );
            var1.clear();
            this.table = null;
            this.size = 0;
         } else {
            Arrays.fill(this.keys, 0, this.size, null);
            Arrays.fill(this.values, 0, this.size, null);
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableClear(this.table);
            Arrays.fill(this.entries, 0, this.size, 0);
            this.size = 0;
         }
      }
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeInt(this.size());
      Iterator var2 = this.entrySetIterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.writeObject(var3.getKey());
         var1.writeObject(var3.getValue());
      }
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      int var2 = var1.readInt();
      if (var2 < 0) {
         throw new InvalidObjectException("Invalid size: " + var2);
      }

      this.init(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         Object var4 = var1.readObject();
         Object var5 = var1.readObject();
         this.put((K)var4, (V)var5);
      }
   }

   final class CRRRICCRROCOHHOHIICIHORCOORRRH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
      private final @Nullable Object ICHIICOHCCRIHIRRRIICIRCCHOIIHH;
      private int lastKnownIndex;

      CRRRICCRROCOHHOHIICIHORCOORRRH(int var2) {
         this.ICHIICOHCCRIHIRRRIICIRCCHOIIHH = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys[var2];
         this.lastKnownIndex = var2;
      }

      @Override
      public @Nullable K getKey() {
         return (K)this.ICHIICOHCCRIHIRRRIICIRCCHOIIHH;
      }

      private void updateLastKnownIndex() {
         if (this.lastKnownIndex == -1
            || this.lastKnownIndex >= OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size()
            || !com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               this.ICHIICOHCCRIHIRRRIICIRCCHOIIHH, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys[this.lastKnownIndex]
            )) {
            this.lastKnownIndex = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.indexOf(this.ICHIICOHCCRIHIRRRIICIRCCHOIIHH);
         }
      }

      @Override
      public V getValue() {
         Map var1 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         if (var1 != null) {
            return (V)var1.get(this.ICHIICOHCCRIHIRRRIICIRCCHOIIHH);
         }

         this.updateLastKnownIndex();
         return (V)(this.lastKnownIndex == -1 ? null : OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values[this.lastKnownIndex]);
      }

      @Override
      public V setValue(V var1) {
         Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         if (var2 != null) {
            return (V)var2.put(this.ICHIICOHCCRIHIRRRIICIRCCHOIIHH, var1);
         } else {
            this.updateLastKnownIndex();
            if (this.lastKnownIndex == -1) {
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.put((K)this.ICHIICOHCCRIHIRRRIICIRCCHOIIHH, (V)var1);
               return null;
            } else {
               Object var3 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values[this.lastKnownIndex];
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values[this.lastKnownIndex] = var1;
               return (V)var3;
            }
         }
      }
   }

   class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, V> {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this);
      }

      @Override
      public Object[] toArray() {
         if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.needsAllocArrays()) {
            return new Object[0];
         }

         Map var1 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         return var1 != null
            ? var1.keySet().toArray()
            : IOHCCIRCCICICHHHIOIOHCICICROIO.copyAsObjectArray(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys, 0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size);
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.needsAllocArrays()) {
            if (var1.length > 0) {
               var1[0] = null;
            }

            return (T[])var1;
         } else {
            Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
            return (T[])(var2 != null
               ? var2.keySet().toArray(var1)
               : IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys, 0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size, var1));
         }
      }

      @Override
      public boolean remove(Object var1) {
         Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         return var2 != null
            ? var2.keySet().remove(var1)
            : OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.removeHelper(var1) != OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HCHCOCICICOORRIRRCICIIRICOHHHO;
      }

      @Override
      public Iterator<K> iterator() {
         return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keySetIterator();
      }

      @Override
      public Spliterator<K> spliterator() {
         if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.needsAllocArrays()) {
            return Spliterators.spliterator(new Object[0], 17);
         }

         Map var1 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         return var1 != null
            ? var1.keySet().spliterator()
            : Spliterators.spliterator(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys, 0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size, 17);
      }

      @Override
      public void forEach(Consumer<? super K> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         if (var2 != null) {
            var2.keySet().forEach(var1);
         } else {
            for (int var3 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.firstEntryIndex(); var3 >= 0; var3 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.getSuccessor(var3)) {
               var1.accept(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys[var3]);
            }
         }
      }
   }

   private abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> implements Iterator<T> {
      int expectedMetadata = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.metadata;
      int currentIndex = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.firstEntryIndex();
      int indexToRemove = -1;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }

      @Override
      public boolean hasNext() {
         return this.currentIndex >= 0;
      }

      abstract T getOutput(int var1);

      @Override
      public T next() {
         this.checkForConcurrentModification();
         if (!this.hasNext()) {
            throw new NoSuchElementException();
         }

         this.indexToRemove = this.currentIndex;
         Object var1 = this.getOutput(this.currentIndex);
         this.currentIndex = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.getSuccessor(this.currentIndex);
         return (T)var1;
      }

      @Override
      public void remove() {
         this.checkForConcurrentModification();
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.indexToRemove >= 0);
         this.incrementExpectedModCount();
         OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.remove(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys[this.indexToRemove]);
         this.currentIndex = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
         this.indexToRemove = -1;
      }

      void incrementExpectedModCount() {
         this.expectedMetadata += 32;
      }

      private void checkForConcurrentModification() {
         if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.metadata != this.expectedMetadata) {
            throw new ConcurrentModificationException();
         }
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
      @Override
      Map<K, V> map() {
         return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this;
      }

      @Override
      public Iterator<Entry<K, V>> iterator() {
         return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.entrySetIterator();
      }

      @Override
      public Spliterator<Entry<K, V>> spliterator() {
         Map var1 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         return var1 != null
            ? var1.entrySet().spliterator()
            : IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size, 17, var1x -> OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.new CRRRICCRROCOHHOHIICIHORCOORRRH(var1x)
            );
      }

      @Override
      public boolean contains(Object var1) {
         Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         if (var2 != null) {
            return var2.entrySet().contains(var1);
         }

         if (!(var1 instanceof Entry)) {
            return false;
         }

         Entry var3 = (Entry)var1;
         int var4 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.indexOf(var3.getKey());
         return var4 != -1
            && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values[var4], var3.getValue()
            );
      }

      @Override
      public boolean remove(Object var1) {
         Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         if (var2 != null) {
            return var2.entrySet().remove(var1);
         }

         if (var1 instanceof Entry) {
            Entry var3 = (Entry)var1;
            if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.needsAllocArrays()) {
               return false;
            }

            int var4 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.hashTableMask();
            int var5 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.remove(
               var3.getKey(),
               var3.getValue(),
               var4,
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.table,
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.entries,
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.keys,
               OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values
            );
            if (var5 == -1) {
               return false;
            }

            OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.moveLastEntry(var5, var4);
            OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size--;
            OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.incrementModCount();
            return true;
         } else {
            return false;
         }
      }
   }

   class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
         super(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this);
      }

      @Override
      public Iterator<V> iterator() {
         return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.valuesIterator();
      }

      @Override
      public void forEach(Consumer<? super V> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         if (var2 != null) {
            var2.values().forEach(var1);
         } else {
            for (int var3 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.firstEntryIndex(); var3 >= 0; var3 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.getSuccessor(var3)) {
               var1.accept(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values[var3]);
            }
         }
      }

      @Override
      public Spliterator<V> spliterator() {
         if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.needsAllocArrays()) {
            return Spliterators.spliterator(new Object[0], 16);
         }

         Map var1 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         return var1 != null
            ? var1.values().spliterator()
            : Spliterators.spliterator(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values, 0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size, 16);
      }

      @Override
      public Object[] toArray() {
         if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.needsAllocArrays()) {
            return new Object[0];
         }

         Map var1 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
         return var1 != null
            ? var1.values().toArray()
            : IOHCCIRCCICICHHHIOIOHCICICROIO.copyAsObjectArray(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values, 0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size);
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         if (OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.needsAllocArrays()) {
            if (var1.length > 0) {
               var1[0] = null;
            }

            return (T[])var1;
         } else {
            Map var2 = OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.delegateOrNull();
            return (T[])(var2 != null
               ? var2.values().toArray(var1)
               : IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.values, 0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.this.size, var1));
         }
      }
   }
}
