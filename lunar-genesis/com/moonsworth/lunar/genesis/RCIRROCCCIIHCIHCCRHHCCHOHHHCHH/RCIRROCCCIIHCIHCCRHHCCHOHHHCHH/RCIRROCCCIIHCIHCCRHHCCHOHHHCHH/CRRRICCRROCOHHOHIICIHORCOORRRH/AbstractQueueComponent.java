package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class IOHCRRIIHCIHORROOCHCCORIHRHCII<E> extends AbstractQueue<E> {
   private final IOHCRRIIHCIHORROOCHCCORIHRHCII<E>.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCRCIIIHHCOCHRIRCIOHHCIRIHCHOC;
   private final IOHCRRIIHCIHORROOCHCCORIHRHCII<E>.IRCIIHHICIHRCOCRROCOICRIHHCCHH HICCHOCOHRCOHCOCIRRRORHCOCCRIO;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   final int HRIOHROHICOICOOHRIICHCCOOOHIOI;
   private Object[] queue;
   private int size;
   private int modCount;
   private static final int ICORIIRCIIIOCCOCCHICOIRIOHHHRI = 1431655765;
   private static final int IHICIOOICOOROIHCHICOCHIHROOOCR = -1431655766;
   private static final int HOIHCRIHICRCHCHIOIHRICIHIHHIHH = 11;

   public static <E extends Comparable<E>> IOHCRRIIHCIHORROOCHCCORIHRHCII<E> IHRHCRICHCIROIICCRCRCCHIORIRIR() {
      return new IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC())
         .IHRHCRICHCIROIICCRCRCCHIORIRIR();
   }

   public static <E extends Comparable<E>> IOHCRRIIHCIHORROOCHCCORIHRHCII<E> OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(Iterable<? extends E> var0) {
      return new IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC())
         .OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0);
   }

   public static <B> IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B> RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Comparator<B> var0) {
      return new IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   public static IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Comparable> HHHHRHROCRRHCCHRIHICHOHCICHROO(int var0) {
      return new IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Comparable>(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC())
         .HHHHRHROCRRHCCHRIHICHOHCICHROO(var0);
   }

   public static IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Comparable> HCIIHRCRHIHHHCCIORIIHOHROOICIH(int var0) {
      return new IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Comparable>(IOIHHIORCICCHIIHOIOIOHHRICRHIO.OHOOIHRHCOIOIRHICHOOROHHIHOCRC())
         .HCIIHRCRHIHHHCCIORIIHOHROOICIH(var0);
   }

   private IOHCRRIIHCIHORROOCHCCORIHRHCII(IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<? super E> var1, int var2) {
      IOIHHIORCICCHIIHOIOIOHHRICRHIO var3 = var1.COIOHRCROIRHICOHICCOCCIRRCRIOI();
      this.RCRCIIIHHCOCHRIRCIOHHCIRIHCHOC = new IOHCRRIIHCIHORROOCHCCORIHRHCII.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3);
      this.HICCHOCOHRCOHCOCIRRRORHCOCCRIO = new IOHCRRIIHCIHORROOCHCCORIHRHCII.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3.HCHORRRCIORCRHCRIIHROIRRRHCCOR());
      this.RCRCIIIHHCOCHRIRCIOHHCIRIHCHOC.RIIORHCRRCCIRRCRIHCCOIHRHCOICI = this.HICCHOCOHRCOHCOCIRRRORHCOCCRIO;
      this.HICCHOCOHRCOHCOCIRRRORHCOCCRIO.RIIORHCRRCCIRRCRIHCCOIHRHCOICI = this.RCRCIIIHHCOCHRIRCIOHHCIRIHCHOC;
      this.HRIOHROHICOICOOHRIICHCCOOOHIOI = var1.maximumSize;
      this.queue = new Object[var2];
   }

   @Override
   public int size() {
      return this.size;
   }

   @CanIgnoreReturnValue
   @Override
   public boolean add(E var1) {
      this.offer((E)var1);
      return true;
   }

   @CanIgnoreReturnValue
   @Override
   public boolean addAll(Collection<? extends E> var1) {
      boolean var2 = false;

      for (Object var4 : var1) {
         this.offer((E)var4);
         var2 = true;
      }

      return var2;
   }

   @CanIgnoreReturnValue
   @Override
   public boolean offer(E var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.modCount++;
      int var2 = this.size++;
      this.growIfNeeded();
      this.RORHCCHIOORIROORRHOCRHHOCRIHII(var2).bubbleUp(var2, (E)var1);
      return this.size <= this.HRIOHROHICOICOOHRIICHCCOOOHIOI || this.pollLast() != var1;
   }

   @CanIgnoreReturnValue
   @Override
   public E poll() {
      return this.isEmpty() ? null : this.removeAndGet(0);
   }

   E elementData(int var1) {
      return (E)this.queue[var1];
   }

   @Override
   public E peek() {
      return this.isEmpty() ? null : this.elementData(0);
   }

   private int getMaxElementIndex() {
      switch (this.size) {
         case 1:
            return 0;
         case 2:
            return 1;
         default:
            return this.HICCHOCOHRCOHCOCIRRRORHCOCCRIO.compareElements(1, 2) <= 0 ? 1 : 2;
      }
   }

   @CanIgnoreReturnValue
   public E pollFirst() {
      return this.poll();
   }

   @CanIgnoreReturnValue
   public E removeFirst() {
      return this.remove();
   }

   public E peekFirst() {
      return this.peek();
   }

   @CanIgnoreReturnValue
   public E pollLast() {
      return this.isEmpty() ? null : this.removeAndGet(this.getMaxElementIndex());
   }

   @CanIgnoreReturnValue
   public E removeLast() {
      if (this.isEmpty()) {
         throw new NoSuchElementException();
      } else {
         return this.removeAndGet(this.getMaxElementIndex());
      }
   }

   public E peekLast() {
      return this.isEmpty() ? null : this.elementData(this.getMaxElementIndex());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   @CanIgnoreReturnValue
   IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> RICOIHCRHHHOCROOCHRROIICRROIIH(int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
         var1, this.size
      );
      this.modCount++;
      this.size--;
      if (this.size == var1) {
         this.queue[this.size] = null;
         return null;
      } else {
         Object var2 = this.elementData(this.size);
         int var3 = this.RORHCCHIOORIROORRHOCRHHOCRIHII(this.size).swapWithConceptuallyLastElement((E)var2);
         if (var3 == var1) {
            this.queue[this.size] = null;
            return null;
         } else {
            Object var4 = this.elementData(this.size);
            this.queue[this.size] = null;
            IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, (E)var4);
            if (var3 < var1) {
               return var5 == null
                  ? new IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>((E)var2, (E)var4)
                  : new IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>((E)var2, var5.HHIHRIRCHIOOIRCRHRRIIICCOIROHH);
            } else {
               return var5;
            }
         }
      }
   }

   private IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var1, E var2) {
      IOHCRRIIHCIHORROOCHCCORIHRHCII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.RORHCCHIOORIROORRHOCRHHOCRIHII(var1);
      int var4 = var3.fillHoleAt(var1);
      int var5 = var3.bubbleUpAlternatingLevels(var4, (E)var2);
      if (var5 == var4) {
         return var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, (E)var2);
      } else {
         return var5 < var1 ? new IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>((E)var2, this.elementData(var1)) : null;
      }
   }

   private E removeAndGet(int var1) {
      Object var2 = this.elementData(var1);
      this.RICOIHCRHHHOCROOCHRROIICRROIIH(var1);
      return (E)var2;
   }

   private IOHCRRIIHCIHORROOCHCCORIHRHCII<E>.IRCIIHHICIHRCOCRROCOICRIHHCCHH RORHCCHIOORIROORRHOCRHHOCRIHII(int var1) {
      return isEvenLevel(var1) ? this.RCRCIIIHHCOCHRIRCIOHHCIRIHCHOC : this.HICCHOCOHRCOHCOCIRRRORHCOCCRIO;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static boolean isEvenLevel(int var0) {
      int var1 = ~(~(var0 + 1));
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         var1 > 0, "negative index"
      );
      return (var1 & 1431655765) > (var1 & -1431655766);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   boolean isIntact() {
      for (int var1 = 1; var1 < this.size; var1++) {
         if (!this.RORHCCHIOORIROORRHOCRHHOCRIHII(var1).verifyIndex(var1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public Iterator<E> iterator() {
      return new IOHCRRIIHCIHORROOCHCCORIHRHCII.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   @Override
   public void clear() {
      for (int var1 = 0; var1 < this.size; var1++) {
         this.queue[var1] = null;
      }

      this.size = 0;
   }

   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.size];
      System.arraycopy(this.queue, 0, var1, 0, this.size);
      return var1;
   }

   public Comparator<? super E> comparator() {
      return this.RCRCIIIHHCOCHRIRCIOHHCIRIHCHOC.COIHRROICHCCOIOOHHOIIOOORICORO;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   int capacity() {
      return this.queue.length;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static int initialQueueSize(int var0, int var1, Iterable<?> var2) {
      int var3 = var0 == -1 ? 11 : var0;
      if (var2 instanceof Collection) {
         int var4 = ((Collection)var2).size();
         var3 = Math.max(var3, var4);
      }

      return capAtMaximumSize(var3, var1);
   }

   private void growIfNeeded() {
      if (this.size > this.queue.length) {
         int var1 = this.calculateNewCapacity();
         Object[] var2 = new Object[var1];
         System.arraycopy(this.queue, 0, var2, 0, this.queue.length);
         this.queue = var2;
      }
   }

   private int calculateNewCapacity() {
      int var1 = this.queue.length;
      int var2 = var1 < 64
         ? (var1 + 1) * 2
         : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.checkedMultiply(
            var1 / 2, 3
         );
      return capAtMaximumSize(var2, this.HRIOHROHICOICOOHRIICHCCOOOHIOI);
   }

   private static int capAtMaximumSize(int var0, int var1) {
      return Math.min(var0 - 1, var1) + 1;
   }

   private class CRRRICCRROCOHHOHIICIHORCOORRRH implements Iterator<E> {
      private int cursor = -1;
      private int nextCursor = -1;
      private int expectedModCount = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.modCount;
      private @Nullable Queue<E> forgetMeNot;
      private @Nullable List<E> skipMe;
      private @Nullable Object lastFromForgetMeNot;
      private boolean canRemove;

      private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      }

      @Override
      public boolean hasNext() {
         this.checkModCount();
         this.nextNotInSkipMe(this.cursor + 1);
         return this.nextCursor < IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size() || this.forgetMeNot != null && !this.forgetMeNot.isEmpty();
      }

      @Override
      public E next() {
         this.checkModCount();
         this.nextNotInSkipMe(this.cursor + 1);
         if (this.nextCursor < IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size()) {
            this.cursor = this.nextCursor;
            this.canRemove = true;
            return IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(this.cursor);
         }

         if (this.forgetMeNot != null) {
            this.cursor = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size();
            this.lastFromForgetMeNot = this.forgetMeNot.poll();
            if (this.lastFromForgetMeNot != null) {
               this.canRemove = true;
               return (E)this.lastFromForgetMeNot;
            }
         }

         throw new NoSuchElementException("iterator moved past last element in queue.");
      }

      @Override
      public void remove() {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.canRemove);
         this.checkModCount();
         this.canRemove = false;
         this.expectedModCount++;
         if (this.cursor < IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size()) {
            IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.RICOIHCRHHHOCROOCHRROIICRROIIH(this.cursor);
            if (var1 != null) {
               if (this.forgetMeNot == null) {
                  this.forgetMeNot = new ArrayDeque<>();
                  this.skipMe = new ArrayList<>(3);
               }

               if (!this.foundAndRemovedExactReference(this.skipMe, var1.OIOOICCRIIOOHOOHIIROIIRIHHICHR)) {
                  this.forgetMeNot.add(var1.OIOOICCRIIOOHOOHIIROIIRIHHICHR);
               }

               if (!this.foundAndRemovedExactReference(this.forgetMeNot, var1.HHIHRIRCHIOOIRCRHRRIIICCOIROHH)) {
                  this.skipMe.add(var1.HHIHRIRCHIOOIRCRHRRIIICCOIROHH);
               }
            }

            this.cursor--;
            this.nextCursor--;
         } else {
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
               this.removeExact(this.lastFromForgetMeNot)
            );
            this.lastFromForgetMeNot = null;
         }
      }

      private boolean foundAndRemovedExactReference(Iterable<E> var1, E var2) {
         Iterator var3 = var1.iterator();

         while (var3.hasNext()) {
            Object var4 = var3.next();
            if (var4 == var2) {
               var3.remove();
               return true;
            }
         }

         return false;
      }

      private boolean removeExact(Object var1) {
         for (int var2 = 0; var2 < IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size; var2++) {
            if (IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var2] == var1) {
               IOHCRRIIHCIHORROOCHCCORIHRHCII.this.RICOIHCRHHHOCROOCHRROIICRROIIH(var2);
               return true;
            }
         }

         return false;
      }

      private void checkModCount() {
         if (IOHCRRIIHCIHORROOCHCCORIHRHCII.this.modCount != this.expectedModCount) {
            throw new ConcurrentModificationException();
         }
      }

      private void nextNotInSkipMe(int var1) {
         if (this.nextCursor < var1) {
            if (this.skipMe != null) {
               while (
                  var1 < IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size()
                     && this.foundAndRemovedExactReference(this.skipMe, IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var1))
               ) {
                  var1++;
               }
            }

            this.nextCursor = var1;
         }
      }
   }

   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> {
      final E OIOOICCRIIOOHOOHIIROIIRIHHICHR;
      final E HHIHRIRCHIOOIRCRHRRIIICCOIROHH;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(E var1, E var2) {
         this.OIOOICCRIIOOHOOHIIROIIRIHHICHR = (E)var1;
         this.HHIHRIRCHIOOIRCRHRRIIICCOIROHH = (E)var2;
      }
   }

   private class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      final IOIHHIORCICCHIIHOIOIOHHRICRHIO<E> COIHRROICHCCOIOOHHOIIOOORICORO;
      @Weak
      IOHCRRIIHCIHORROOCHCCORIHRHCII.@Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH RIIORHCRRCCIRRCRIHCCOIHRHCOICI;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOIHHIORCICCHIIHOIOIOHHRICRHIO<E> var2) {
         this.COIHRROICHCCOIOOHHOIIOOORICORO = var2;
      }

      int compareElements(int var1, int var2) {
         return this.COIHRROICHCCOIOOHHOIIOOORICORO
            .compare(IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var1), IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var2));
      }

      IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, E var3) {
         int var4 = this.crossOver(var2, (E)var3);
         if (var4 == var2) {
            return null;
         }

         Object var5;
         if (var4 < var1) {
            var5 = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var1);
         } else {
            var5 = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(this.getParentIndex(var1));
         }

         return this.RIIORHCRRCCIRRCRIHCCOIHRHCOICI.bubbleUpAlternatingLevels(var4, (E)var3) < var1
            ? new IOHCRRIIHCIHORROOCHCCORIHRHCII.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>((E)var3, (E)var5)
            : null;
      }

      void bubbleUp(int var1, E var2) {
         int var3 = this.crossOverUp(var1, (E)var2);
         IOHCRRIIHCIHORROOCHCCORIHRHCII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4;
         if (var3 == var1) {
            var4 = this;
         } else {
            var1 = var3;
            var4 = this.RIIORHCRRCCIRRCRIHCCOIHRHCOICI;
         }

         var4.bubbleUpAlternatingLevels(var1, (E)var2);
      }

      @CanIgnoreReturnValue
      int bubbleUpAlternatingLevels(int var1, E var2) {
         while (var1 > 2) {
            int var3 = this.getGrandparentIndex(var1);
            Object var4 = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var3);
            if (this.COIHRROICHCCOIOOHHOIIOOORICORO.compare((E)var4, (E)var2) > 0) {
               IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var1] = var4;
               var1 = var3;
               continue;
            }
            break;
         }

         IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var1] = var2;
         return var1;
      }

      int findMin(int var1, int var2) {
         if (var1 >= IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size) {
            return -1;
         }

         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            var1 > 0
         );
         int var3 = Math.min(var1, IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size - var2) + var2;
         int var4 = var1;

         for (int var5 = var1 + 1; var5 < var3; var5++) {
            if (this.compareElements(var5, var4) < 0) {
               var4 = var5;
            }
         }

         return var4;
      }

      int findMinChild(int var1) {
         return this.findMin(this.getLeftChildIndex(var1), 2);
      }

      int findMinGrandChild(int var1) {
         int var2 = this.getLeftChildIndex(var1);
         return var2 < 0 ? -1 : this.findMin(this.getLeftChildIndex(var2), 4);
      }

      int crossOverUp(int var1, E var2) {
         if (var1 == 0) {
            IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[0] = var2;
            return 0;
         }

         int var3 = this.getParentIndex(var1);
         Object var4 = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var3);
         if (var3 != 0) {
            int var5 = this.getParentIndex(var3);
            int var6 = this.getRightChildIndex(var5);
            if (var6 != var3 && this.getLeftChildIndex(var6) >= IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size) {
               Object var7 = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var6);
               if (this.COIHRROICHCCOIOOHHOIIOOORICORO.compare((E)var7, (E)var4) < 0) {
                  var3 = var6;
                  var4 = var7;
               }
            }
         }

         if (this.COIHRROICHCCOIOOHHOIIOOORICORO.compare((E)var4, (E)var2) < 0) {
            IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var1] = var4;
            IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var3] = var2;
            return var3;
         } else {
            IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var1] = var2;
            return var1;
         }
      }

      int swapWithConceptuallyLastElement(E var1) {
         int var2 = this.getParentIndex(IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size);
         if (var2 != 0) {
            int var3 = this.getParentIndex(var2);
            int var4 = this.getRightChildIndex(var3);
            if (var4 != var2 && this.getLeftChildIndex(var4) >= IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size) {
               Object var5 = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var4);
               if (this.COIHRROICHCCOIOOHHOIIOOORICORO.compare((E)var5, (E)var1) < 0) {
                  IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var4] = var1;
                  IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size] = var5;
                  return var4;
               }
            }
         }

         return IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size;
      }

      int crossOver(int var1, E var2) {
         int var3 = this.findMinChild(var1);
         if (var3 > 0 && this.COIHRROICHCCOIOOHHOIIOOORICORO.compare(IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var3), (E)var2) < 0) {
            IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var1] = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var3);
            IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var3] = var2;
            return var3;
         } else {
            return this.crossOverUp(var1, (E)var2);
         }
      }

      int fillHoleAt(int var1) {
         int var2;
         while ((var2 = this.findMinGrandChild(var1)) > 0) {
            IOHCRRIIHCIHORROOCHCCORIHRHCII.this.queue[var1] = IOHCRRIIHCIHORROOCHCCORIHRHCII.this.elementData(var2);
            var1 = var2;
         }

         return var1;
      }

      private boolean verifyIndex(int var1) {
         if (this.getLeftChildIndex(var1) < IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size && this.compareElements(var1, this.getLeftChildIndex(var1)) > 0) {
            return false;
         } else if (this.getRightChildIndex(var1) < IOHCRRIIHCIHORROOCHCCORIHRHCII.this.size && this.compareElements(var1, this.getRightChildIndex(var1)) > 0) {
            return false;
         } else {
            return var1 > 0 && this.compareElements(var1, this.getParentIndex(var1)) > 0
               ? false
               : var1 <= 2 || this.compareElements(this.getGrandparentIndex(var1), var1) <= 0;
         }
      }

      private int getLeftChildIndex(int var1) {
         return var1 * 2 + 1;
      }

      private int getRightChildIndex(int var1) {
         return var1 * 2 + 2;
      }

      private int getParentIndex(int var1) {
         return (var1 - 1) / 2;
      }

      private int getGrandparentIndex(int var1) {
         return this.getParentIndex(this.getParentIndex(var1));
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B> {
      private static final int HRICRIHORIIICIHORIHOIOOIIHOICO = -1;
      private final Comparator<B> OHHCOOHIIIIHROIHHOICICHHHOOHIO;
      private int expectedSize = -1;
      private int maximumSize = Integer.MAX_VALUE;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Comparator<B> var1) {
         this.OHHCOOHIIIIHROIHHOICICHHHOOHIO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @CanIgnoreReturnValue
      public IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B> HHHHRHROCRRHCCHRIHICHOHCICHROO(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var1 >= 0
         );
         this.expectedSize = var1;
         return this;
      }

      @CanIgnoreReturnValue
      public IOHCRRIIHCIHORROOCHCCORIHRHCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<B> HCIIHRCRHIHHHCCIORIIHOHROOICIH(int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var1 > 0
         );
         this.maximumSize = var1;
         return this;
      }

      public <T extends B> IOHCRRIIHCIHORROOCHCCORIHRHCII<T> IHRHCRICHCIROIICCRCRCCHIORIRIR() {
         return this.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(Collections.emptySet());
      }

      public <T extends B> IOHCRRIIHCIHORROOCHCCORIHRHCII<T> OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(Iterable<? extends T> var1) {
         IOHCRRIIHCIHORROOCHCCORIHRHCII var2 = new IOHCRRIIHCIHORROOCHCCORIHRHCII(
            this, IOHCRRIIHCIHORROOCHCCORIHRHCII.initialQueueSize(this.expectedSize, this.maximumSize, var1)
         );

         for (Object var4 : var1) {
            var2.offer(var4);
         }

         return var2;
      }

      private <T extends B> IOIHHIORCICCHIIHOIOIOHHRICRHIO<T> COIOHRCROIRHICOHICCOCCIRRCRIOI() {
         return IOIHHIORCICCHIIHOIOIOHHRICRHIO.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(this.OHHCOOHIIIIHROIHHOICICHHHOOHIO);
      }
   }
}
