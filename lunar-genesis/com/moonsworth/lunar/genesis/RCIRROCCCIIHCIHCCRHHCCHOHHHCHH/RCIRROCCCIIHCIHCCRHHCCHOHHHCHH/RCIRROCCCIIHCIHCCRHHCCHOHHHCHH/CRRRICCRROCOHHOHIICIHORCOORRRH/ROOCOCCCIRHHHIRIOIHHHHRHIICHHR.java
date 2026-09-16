package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
class ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<E> extends AbstractSet<E> implements Serializable {
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static final double CIRORHRRIOCCOOHOIHRCOORRRRRIRI = 0.001;
   private static final int HOIIHIRORCOCHIOIOCHCHCCHRIOOHI = 9;
   private transient @Nullable Object table;
   private transient int @Nullable [] entries;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   transient Object @Nullable [] elements;
   private transient int metadata;
   private transient int size;

   public static <E> ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<E> HHCHICIRIOROHCRIHOOIRHRORCICRC() {
      return new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<>();
   }

   public static <E> ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<E> IRRCCOICORICIHCHRHIHIHROIRHOCR(Collection<? extends E> var0) {
      ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var1 = HCOIIHHORCOIHOICRIRICICHICOCCI(var0.size());
      var1.addAll(var0);
      return var1;
   }

   @SafeVarargs
   public static <E> ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<E> CIOHHCORHRCCRICCCORIHCRHCCCRRR(E... var0) {
      ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var1 = HCOIIHHORCOIHOICRIRICICHICOCCI(var0.length);
      Collections.addAll(var1, (E[])var0);
      return var1;
   }

   public static <E> ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<E> HCOIIHHORCOIHOICRIRICICHICOCCI(int var0) {
      return new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<>(var0);
   }

   ROOCOCCCIRHHHIRIOIHHHHRHIICHHR() {
      this.init(3);
   }

   ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(int var1) {
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
      this.elements = new Object[var1];
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   @Nullable Set<E> delegateOrNull() {
      return this.table instanceof Set ? (Set)this.table : null;
   }

   private Set<E> createHashFloodingResistantDelegate(int var1) {
      return new LinkedHashSet<>(var1, 1.0F);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   @CanIgnoreReturnValue
   Set<E> convertToHashFloodingResistantImplementation() {
      Set var1 = this.createHashFloodingResistantDelegate(this.hashTableMask() + 1);

      for (int var2 = this.firstEntryIndex(); var2 >= 0; var2 = this.getSuccessor(var2)) {
         var1.add(this.elements[var2]);
      }

      this.table = var1;
      this.entries = null;
      this.elements = null;
      this.incrementModCount();
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   boolean isUsingHashFloodingResistance() {
      return this.delegateOrNull() != null;
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

   @CanIgnoreReturnValue
   @Override
   public boolean add(E var1) {
      if (this.needsAllocArrays()) {
         this.allocArrays();
      }

      Set var2 = this.delegateOrNull();
      if (var2 != null) {
         return var2.add(var1);
      }

      int[] var3 = this.entries;
      Object[] var4 = this.elements;
      int var5 = this.size;
      int var6 = var5 + 1;
      int var7 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smearedHash(var1);
      int var8 = this.hashTableMask();
      int var9 = var7 & var8;
      int var10 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableGet(this.table, var9);
      if (var10 == 0) {
         if (var6 > var8) {
            var8 = this.resizeTable(var8, IOHIHIIHCCCCCIHRORIOIOORCIOHII.newCapacity(var8), var7, var5);
         } else {
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableSet(this.table, var9, var5 + 1);
         }
      } else {
         int var13 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var7, var8);
         int var14 = 0;

         int var11;
         int var12;
         do {
            var11 = var10 - 1;
            var12 = var3[var11];
            if (IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var12, var8) == var13
               && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
                  var1, var4[var11]
               )) {
               return false;
            }

            var10 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getNext(var12, var8);
            var14++;
         } while (var10 != 0);

         if (var14 >= 9) {
            return this.convertToHashFloodingResistantImplementation().add((E)var1);
         }

         if (var6 > var8) {
            var8 = this.resizeTable(var8, IOHIHIIHCCCCCIHRORIOIOORCIOHII.newCapacity(var8), var7, var5);
         } else {
            var3[var11] = IOHIHIIHCCCCCIHRORIOIOORCIOHII.maskCombine(var12, var5 + 1, var8);
         }
      }

      this.resizeMeMaybe(var6);
      this.insertEntry(var5, (E)var1, var7, var8);
      this.size = var6;
      this.incrementModCount();
      return true;
   }

   void insertEntry(int var1, @Nullable E var2, int var3, int var4) {
      this.entries[var1] = IOHIHIIHCCCCCIHRORIOIOORCIOHII.maskCombine(var3, 0, var4);
      this.elements[var1] = var2;
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
      this.elements = Arrays.copyOf(this.elements, var1);
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

   @Override
   public boolean contains(Object var1) {
      if (this.needsAllocArrays()) {
         return false;
      }

      Set var2 = this.delegateOrNull();
      if (var2 != null) {
         return var2.contains(var1);
      }

      int var3 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smearedHash(var1);
      int var4 = this.hashTableMask();
      int var5 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableGet(this.table, var3 & var4);
      if (var5 == 0) {
         return false;
      }

      int var6 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var3, var4);

      do {
         int var7 = var5 - 1;
         int var8 = this.entries[var7];
         if (IOHIHIIHCCCCCIHRORIOIOORCIOHII.getHashPrefix(var8, var4) == var6
            && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               var1, this.elements[var7]
            )) {
            return true;
         }

         var5 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.getNext(var8, var4);
      } while (var5 != 0);

      return false;
   }

   @CanIgnoreReturnValue
   @Override
   public boolean remove(Object var1) {
      if (this.needsAllocArrays()) {
         return false;
      }

      Set var2 = this.delegateOrNull();
      if (var2 != null) {
         return var2.remove(var1);
      }

      int var3 = this.hashTableMask();
      int var4 = IOHIHIIHCCCCCIHRORIOIOORCIOHII.remove(var1, null, var3, this.table, this.entries, this.elements, null);
      if (var4 == -1) {
         return false;
      }

      this.moveLastEntry(var4, var3);
      this.size--;
      this.incrementModCount();
      return true;
   }

   void moveLastEntry(int var1, int var2) {
      int var3 = this.size() - 1;
      if (var1 < var3) {
         Object var4 = this.elements[var3];
         this.elements[var1] = var4;
         this.elements[var3] = null;
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
         this.elements[var1] = null;
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
   public Iterator<E> iterator() {
      Set var1 = this.delegateOrNull();
      return var1 != null ? var1.iterator() : new Iterator<E>() {
         int expectedMetadata = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.metadata;
         int currentIndex = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.firstEntryIndex();
         int indexToRemove = -1;

         @Override
         public boolean hasNext() {
            return this.currentIndex >= 0;
         }

         @Override
         public E next() {
            this.checkForConcurrentModification();
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            }

            this.indexToRemove = this.currentIndex;
            Object var1x = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.elements[this.currentIndex];
            this.currentIndex = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.getSuccessor(this.currentIndex);
            return (E)var1x;
         }

         @Override
         public void remove() {
            this.checkForConcurrentModification();
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.indexToRemove >= 0);
            this.incrementExpectedModCount();
            ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.remove(ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.elements[this.indexToRemove]);
            this.currentIndex = ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
         }

         void incrementExpectedModCount() {
            this.expectedMetadata += 32;
         }

         private void checkForConcurrentModification() {
            if (ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.this.metadata != this.expectedMetadata) {
               throw new ConcurrentModificationException();
            }
         }
      };
   }

   @Override
   public Spliterator<E> spliterator() {
      if (this.needsAllocArrays()) {
         return Spliterators.spliterator(new Object[0], 17);
      }

      Set var1 = this.delegateOrNull();
      return var1 != null ? var1.spliterator() : Spliterators.spliterator(this.elements, 0, this.size, 17);
   }

   @Override
   public void forEach(Consumer<? super E> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Set var2 = this.delegateOrNull();
      if (var2 != null) {
         var2.forEach(var1);
      } else {
         for (int var3 = this.firstEntryIndex(); var3 >= 0; var3 = this.getSuccessor(var3)) {
            var1.accept(this.elements[var3]);
         }
      }
   }

   @Override
   public int size() {
      Set var1 = this.delegateOrNull();
      return var1 != null ? var1.size() : this.size;
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public Object[] toArray() {
      if (this.needsAllocArrays()) {
         return new Object[0];
      }

      Set var1 = this.delegateOrNull();
      return var1 != null ? var1.toArray() : Arrays.copyOf(this.elements, this.size);
   }

   @CanIgnoreReturnValue
   @Override
   public <T> T[] toArray(T[] var1) {
      if (this.needsAllocArrays()) {
         if (var1.length > 0) {
            var1[0] = null;
         }

         return (T[])var1;
      } else {
         Set var2 = this.delegateOrNull();
         return (T[])(var2 != null ? var2.toArray(var1) : IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(this.elements, 0, this.size, var1));
      }
   }

   public void trimToSize() {
      if (!this.needsAllocArrays()) {
         Set var1 = this.delegateOrNull();
         if (var1 != null) {
            Set var5 = this.createHashFloodingResistantDelegate(this.size());
            var5.addAll(var1);
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
         Set var1 = this.delegateOrNull();
         if (var1 != null) {
            this.metadata = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.constrainToRange(
               this.size(), 3, 1073741823
            );
            var1.clear();
            this.table = null;
            this.size = 0;
         } else {
            Arrays.fill(this.elements, 0, this.size, null);
            IOHIHIIHCCCCCIHRORIOIOORCIOHII.tableClear(this.table);
            Arrays.fill(this.entries, 0, this.size, 0);
            this.size = 0;
         }
      }
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeInt(this.size());

      for (Object var3 : this) {
         var1.writeObject(var3);
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
         this.add((E)var4);
      }
   }
}
