package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class RORCHCIIICOHIRROOORHOCCCCIOCCI<E> extends CORCOCICIRIOHROHROIIOOHICCHCRR<E> implements Serializable {
   private final transient ConcurrentMap<E, AtomicInteger> RRCRHRHHROOIOIICIHIOOHRICIHIII;
   private static final long CIRROHORCCCCRIICHCORCHIOCRRRIH = 1L;

   public static <E> RORCHCIIICOHIRROOORHOCCCCIOCCI<E> HHIHHIHIRCICCHHIIOIIRRHOHIIHHR() {
      return new RORCHCIIICOHIRROOORHOCCCCIOCCI<>(new ConcurrentHashMap<>());
   }

   public static <E> RORCHCIIICOHIRROOORHOCCCCIOCCI<E> CRICCOOHHHCHOORCICOCOHIHOIRHOO(Iterable<? extends E> var0) {
      RORCHCIIICOHIRROOORHOCCCCIOCCI var1 = HHIHHIHIRCICCHHIIOIIRRHOHIIHHR();
      IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(var1, var0);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static <E> RORCHCIIICOHIRROOORHOCCCCIOCCI<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ConcurrentMap<E, AtomicInteger> var0) {
      return new RORCHCIIICOHIRROOORHOCCCCIOCCI<>(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   RORCHCIIICOHIRROOORHOCCCCIOCCI(ConcurrentMap<E, AtomicInteger> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1.isEmpty(), "the backing map (%s) must be empty", var1
      );
      this.RRCRHRHHROOIOIICIHIOOHRICIHIII = var1;
   }

   @Override
   public int count(@Nullable Object var1) {
      AtomicInteger var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.RRCRHRHHROOIOIICIHIOOHRICIHIII, var1);
      return var2 == null ? 0 : var2.get();
   }

   @Override
   public int size() {
      long var1 = 0L;

      for (AtomicInteger var4 : this.RRCRHRHHROOIOIICIHIOOHRICIHIII.values()) {
         var1 += var4.get();
      }

      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         var1
      );
   }

   @Override
   public Object[] toArray() {
      return this.snapshot().toArray();
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      return (T[])this.snapshot().toArray(var1);
   }

   private List<E> snapshot() {
      ArrayList var1 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayListWithExpectedSize(this.size());

      for (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : this.entrySet()) {
         Object var4 = var3.getElement();

         for (int var5 = var3.getCount(); var5 > 0; var5--) {
            var1.add(var4);
         }
      }

      return var1;
   }

   @CanIgnoreReturnValue
   @Override
   public int add(E var1, int var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (var2 == 0) {
         return this.count(var1);
      }

      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkPositive(var2, "occurences");

      while (true) {
         AtomicInteger var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.RRCRHRHHROOIOIICIHIOOHRICIHIII, var1);
         if (var3 == null) {
            var3 = this.RRCRHRHHROOIOIICIHIOOHRICIHIII.putIfAbsent((E)var1, new AtomicInteger(var2));
            if (var3 == null) {
               return 0;
            }
         }

         while (true) {
            int var4 = var3.get();
            if (var4 == 0) {
               AtomicInteger var7 = new AtomicInteger(var2);
               if (this.RRCRHRHHROOIOIICIHIOOHRICIHIII.putIfAbsent((E)var1, var7) == null || this.RRCRHRHHROOIOIICIHIOOHRICIHIII.replace((E)var1, var3, var7)) {
                  return 0;
               }
               break;
            }

            try {
               int var5 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.checkedAdd(
                  var4, var2
               );
               if (var3.compareAndSet(var4, var5)) {
                  return var4;
               }
            } catch (ArithmeticException var6) {
               throw new IllegalArgumentException("Overflow adding " + var2 + " occurrences to a count of " + var4);
            }
         }
      }
   }

   @CanIgnoreReturnValue
   @Override
   public int remove(@Nullable Object var1, int var2) {
      if (var2 == 0) {
         return this.count(var1);
      }

      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkPositive(var2, "occurences");
      AtomicInteger var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.RRCRHRHHROOIOIICIHIOOHRICIHIII, var1);
      if (var3 == null) {
         return 0;
      }

      int var4;
      int var5;
      do {
         var4 = var3.get();
         if (var4 == 0) {
            return 0;
         }

         var5 = Math.max(0, var4 - var2);
      } while (!var3.compareAndSet(var4, var5));

      if (var5 == 0) {
         this.RRCRHRHHROOIOIICIHIOOHRICIHIII.remove(var1, var3);
      }

      return var4;
   }

   @CanIgnoreReturnValue
   public boolean removeExactly(@Nullable Object var1, int var2) {
      if (var2 == 0) {
         return true;
      }

      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkPositive(var2, "occurences");
      AtomicInteger var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.RRCRHRHHROOIOIICIHIOOHRICIHIII, var1);
      if (var3 == null) {
         return false;
      }

      int var4;
      int var5;
      do {
         var4 = var3.get();
         if (var4 < var2) {
            return false;
         }

         var5 = var4 - var2;
      } while (!var3.compareAndSet(var4, var5));

      if (var5 == 0) {
         this.RRCRHRHHROOIOIICIHIOOHRICIHIII.remove(var1, var3);
      }

      return true;
   }

   @CanIgnoreReturnValue
   @Override
   public int setCount(E var1, int var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "count");

      label40:
      while (true) {
         AtomicInteger var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.RRCRHRHHROOIOIICIHIOOHRICIHIII, var1);
         if (var3 == null) {
            if (var2 == 0) {
               return 0;
            }

            var3 = this.RRCRHRHHROOIOIICIHIOOHRICIHIII.putIfAbsent((E)var1, new AtomicInteger(var2));
            if (var3 == null) {
               return 0;
            }
         }

         int var4;
         do {
            var4 = var3.get();
            if (var4 == 0) {
               if (var2 == 0) {
                  return 0;
               }

               AtomicInteger var5 = new AtomicInteger(var2);
               if (this.RRCRHRHHROOIOIICIHIOOHRICIHIII.putIfAbsent((E)var1, var5) == null || this.RRCRHRHHROOIOIICIHIOOHRICIHIII.replace((E)var1, var3, var5)) {
                  return 0;
               }
               continue label40;
            }
         } while (!var3.compareAndSet(var4, var2));

         if (var2 == 0) {
            this.RRCRHRHHROOIOIICIHIOOHRICIHIII.remove(var1, var3);
         }

         return var4;
      }
   }

   @CanIgnoreReturnValue
   @Override
   public boolean setCount(E var1, int var2, int var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var2, "oldCount");
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var3, "newCount");
      AtomicInteger var4 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.RRCRHRHHROOIOIICIHIOOHRICIHIII, var1);
      if (var4 == null) {
         if (var2 != 0) {
            return false;
         } else {
            return var3 == 0 ? true : this.RRCRHRHHROOIOIICIHIOOHRICIHIII.putIfAbsent((E)var1, new AtomicInteger(var3)) == null;
         }
      } else {
         int var5 = var4.get();
         if (var5 == var2) {
            if (var5 == 0) {
               if (var3 == 0) {
                  this.RRCRHRHHROOIOIICIHIOOHRICIHIII.remove(var1, var4);
                  return true;
               }

               AtomicInteger var6 = new AtomicInteger(var3);
               return this.RRCRHRHHROOIOIICIHIOOHRICIHIII.putIfAbsent((E)var1, var6) == null
                  || this.RRCRHRHHROOIOIICIHIOOHRICIHIII.replace((E)var1, var4, var6);
            }

            if (var4.compareAndSet(var5, var3)) {
               if (var3 == 0) {
                  this.RRCRHRHHROOIOIICIHIOOHRICIHIII.remove(var1, var4);
               }

               return true;
            }
         }

         return false;
      }
   }

   @Override
   Set<E> createElementSet() {
      final Set var1 = this.RRCRHRHHROOIOIICIHIOOHRICIHIII.keySet();
      return new HOHCCHOIOHOHHOROHOIIHOOHORRHRO<E>() {
         @Override
         protected Set<E> delegate() {
            return var1;
         }

         @Override
         public boolean contains(@Nullable Object var1x) {
            return var1x != null && RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(var1, var1x);
         }

         @Override
         public boolean containsAll(Collection<?> var1x) {
            return this.standardContainsAll(var1x);
         }

         @Override
         public boolean remove(Object var1x) {
            return var1x != null && RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeRemove(var1, var1x);
         }

         @Override
         public boolean removeAll(Collection<?> var1x) {
            return this.standardRemoveAll(var1x);
         }
      };
   }

   @Override
   Iterator<E> elementIterator() {
      throw new AssertionError("should never be called");
   }

   @Deprecated
   @Override
   public Set<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> createEntrySet() {
      return new RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Override
   int distinctElements() {
      return this.RRCRHRHHROOIOIICIHIOOHRICIHIII.size();
   }

   @Override
   public boolean isEmpty() {
      return this.RRCRHRHHROOIOIICIHIOOHRICIHIII.isEmpty();
   }

   @Override
   Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> entryIterator() {
      final HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>() {
         private final Iterator<Entry<E, AtomicInteger>> IHHCOHOOCRHCIIOROCOOROOHORHIIC = RORCHCIIICOHIRROOORHOCCCCIOCCI.this.RRCRHRHHROOIOIICIHIOOHRICIHIII
            .entrySet()
            .iterator();

         protected CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> ORRORCCHHRCHIOOCCRORRRRCCCOOHR() {
            while (this.IHHCOHOOCRHCIIOROCOOROOHORHIIC.hasNext()) {
               Entry var1x = this.IHHCOHOOCRHCIIOROCOOROOHORHIIC.next();
               int var2 = ((AtomicInteger)var1x.getValue()).get();
               if (var2 != 0) {
                  return CCRIHCIIOOIOHIRCCHIICCRHIROORC.CIOHHCORHRCCRICCCORIHCRHCCCRRR((E)var1x.getKey(), var2);
               }
            }

            return this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }
      };
      return new CHHIICHRIIROIOHIHIIROICOCCROCI<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>>() {
         private CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> OHHOHOHCICICOCIOICCIOOIRHOIIIC;

         @Override
         protected Iterator<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> delegate() {
            return var1;
         }

         public CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E> IORICRCCOHRCRROIOIIRHHCOCCCCOH() {
            this.OHHOHOHCICICOCIOICCIOOIRHOIIIC = (CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>)super.next();
            return this.OHHOHOHCICICOCIOICCIOOIRHOIIIC;
         }

         @Override
         public void remove() {
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.OHHOHOHCICICOCIOICCIOOIRHOIIIC != null);
            RORCHCIIICOHIRROOORHOCCCCIOCCI.this.setCount(this.OHHOHOHCICICOCIOICCIOOIRHOIIIC.getElement(), 0);
            this.OHHOHOHCICICOCIOICCIOOIRHOIIIC = null;
         }
      };
   }

   @Override
   public Iterator<E> iterator() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
   }

   @Override
   public void clear() {
      this.RRCRHRHHROOIOIICIHIOOHRICIHIII.clear();
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeObject(this.RRCRHRHHROOIOIICIHIOOHRICIHIII);
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      ConcurrentMap var2 = (ConcurrentMap)var1.readObject();
      RORCHCIIICOHIRROOORHOCCCCIOCCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRHOCIHICROOIICICRIRIHOOHROIIC.set(this, var2);
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      static final COOROCRCCHCIHRCCIROCICCIIIRHHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<RORCHCIIICOHIRROOORHOCCCCIOCCI> RRHOCIHICROOIICICRIRIHOOHROIIC = COOROCRCCHCIHRCCIROCICCIIIRHHC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         RORCHCIIICOHIRROOORHOCCCCIOCCI.class, "countMap"
      );
   }

   private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CORCOCICIRIOHROHROIIOOHICCHCRR<E>.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      RORCHCIIICOHIRROOORHOCCCCIOCCI<E> CRHHHCIIOCHHCIIOCRCCRCHOIICIHH() {
         return RORCHCIIICOHIRROOORHOCCCCIOCCI.this;
      }

      @Override
      public Object[] toArray() {
         return this.snapshot().toArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])this.snapshot().toArray(var1);
      }

      private List<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E>> snapshot() {
         ArrayList var1 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayListWithExpectedSize(this.size());
         HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(var1, this.iterator());
         return var1;
      }
   }
}
