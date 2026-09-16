package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
class RCIROOOOICRHCCRRCIORHHIRCOIIIC<K, V> extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V> {
   private static final int OOHRHHICHHOOHRHOIORICCCOROHHHH = -2;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   transient long @Nullable [] links;
   private transient int firstEntry;
   private transient int lastEntry;
   private final boolean HIRHICRCOCOOOICCOICRHRCRRRCRCC;

   public static <K, V> RCIROOOOICRHCCRRCIORHHIRCOIIIC<K, V> OCCHRRHHRROHRIORIIHRHIIHHIHRIC() {
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC<>();
   }

   public static <K, V> RCIROOOOICRHCCRRCIORHHIRCOIIIC<K, V> IOHHICHRIHCRCIIIROCCHICCIRCIII(int var0) {
      return new RCIROOOOICRHCCRRCIORHHIRCOIIIC<>(var0);
   }

   RCIROOOOICRHCCRRCIORHHIRCOIIIC() {
      this(3);
   }

   RCIROOOOICRHCCRRCIORHHIRCOIIIC(int var1) {
      this(var1, false);
   }

   RCIROOOOICRHCCRRCIORHHIRCOIIIC(int var1, boolean var2) {
      super(var1);
      this.HIRHICRCOCOOOICCOICRHRCRRRCRCC = var2;
   }

   @Override
   void init(int var1) {
      super.init(var1);
      this.firstEntry = -2;
      this.lastEntry = -2;
   }

   @Override
   int allocArrays() {
      int var1 = super.allocArrays();
      this.links = new long[var1];
      return var1;
   }

   @Override
   Map<K, V> createHashFloodingResistantDelegate(int var1) {
      return new LinkedHashMap<>(var1, 1.0F, this.HIRHICRCOCOOOICCOICRHRCRRRCRCC);
   }

   @CanIgnoreReturnValue
   @Override
   Map<K, V> convertToHashFloodingResistantImplementation() {
      Map var1 = super.convertToHashFloodingResistantImplementation();
      this.links = null;
      return var1;
   }

   private int getPredecessor(int var1) {
      return (int)(this.links[var1] >>> 32) - 1;
   }

   @Override
   int getSuccessor(int var1) {
      return (int)this.links[var1] - 1;
   }

   private void setSuccessor(int var1, int var2) {
      long var3 = 4294967295L;
      this.links[var1] = this.links[var1] & ~var3 | var2 + 1 & var3;
   }

   private void setPredecessor(int var1, int var2) {
      long var3 = -4294967296L;
      this.links[var1] = this.links[var1] & ~var3 | (long)(var2 + 1) << 32;
   }

   private void setSucceeds(int var1, int var2) {
      if (var1 == -2) {
         this.firstEntry = var2;
      } else {
         this.setSuccessor(var1, var2);
      }

      if (var2 == -2) {
         this.lastEntry = var1;
      } else {
         this.setPredecessor(var2, var1);
      }
   }

   @Override
   void insertEntry(int var1, @Nullable K var2, @Nullable V var3, int var4, int var5) {
      super.insertEntry(var1, (K)var2, (V)var3, var4, var5);
      this.setSucceeds(this.lastEntry, var1);
      this.setSucceeds(var1, -2);
   }

   @Override
   void accessEntry(int var1) {
      if (this.HIRHICRCOCOOOICCOICRHRCRRRCRCC) {
         this.setSucceeds(this.getPredecessor(var1), this.getSuccessor(var1));
         this.setSucceeds(this.lastEntry, var1);
         this.setSucceeds(var1, -2);
         this.incrementModCount();
      }
   }

   @Override
   void moveLastEntry(int var1, int var2) {
      int var3 = this.size() - 1;
      super.moveLastEntry(var1, var2);
      this.setSucceeds(this.getPredecessor(var1), this.getSuccessor(var1));
      if (var1 < var3) {
         this.setSucceeds(this.getPredecessor(var3), var1);
         this.setSucceeds(var1, this.getSuccessor(var3));
      }

      this.links[var3] = 0L;
   }

   @Override
   void resizeEntries(int var1) {
      super.resizeEntries(var1);
      this.links = Arrays.copyOf(this.links, var1);
   }

   @Override
   int firstEntryIndex() {
      return this.firstEntry;
   }

   @Override
   int adjustAfterRemove(int var1, int var2) {
      return var1 >= this.size() ? var2 : var1;
   }

   @Override
   Set<Entry<K, V>> createEntrySet() {
      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V>.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
         @Override
         public Spliterator<Entry<K, V>> spliterator() {
            return Spliterators.spliterator(this, 17);
         }
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Override
   Set<K> createKeySet() {
      class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V>.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
         @Override
         public Object[] toArray() {
            return IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(this);
         }

         @Override
         public <T> T[] toArray(T[] var1) {
            return (T[])IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(this, var1);
         }

         @Override
         public Spliterator<K> spliterator() {
            return Spliterators.spliterator(this, 17);
         }
      }

      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   @Override
   Collection<V> createValues() {
      class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V>.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
         @Override
         public Object[] toArray() {
            return IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(this);
         }

         @Override
         public <T> T[] toArray(T[] var1) {
            return (T[])IOHCCIRCCICICHHHIOIOHCICICROIO.toArrayImpl(this, var1);
         }

         @Override
         public Spliterator<V> spliterator() {
            return Spliterators.spliterator(this, 16);
         }
      }

      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   }

   @Override
   public void clear() {
      if (!this.needsAllocArrays()) {
         this.firstEntry = -2;
         this.lastEntry = -2;
         if (this.links != null) {
            Arrays.fill(this.links, 0, this.size(), 0L);
         }

         super.clear();
      }
   }
}
