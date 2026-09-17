package com.github.benmanes.caffeine.cache;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;

abstract class BaseMpscLinkedArrayQueue<E> extends BaseMpscLinkedArrayQueueColdProducerFields<E> {
   static final VarHandle REF_ARRAY;
   static final VarHandle P_INDEX;
   static final VarHandle C_INDEX;
   static final VarHandle P_LIMIT;
   private static final Object JUMP = new Object();

   BaseMpscLinkedArrayQueue(int var1) {
      if (var1 < 2) {
         throw new IllegalArgumentException("Initial capacity must be 2 or more");
      }

      int var2 = Caffeine.ceilingPowerOfTwo(var1);
      long var3 = var2 - 1L << 1;
      Object[] var5 = allocate(var2 + 1);
      this.producerBuffer = (E[])var5;
      this.producerMask = var3;
      this.consumerBuffer = (E[])var5;
      this.consumerMask = var3;
      soProducerLimit(this, var3);
   }

   @Override
   public final Iterator<E> iterator() {
      throw new UnsupportedOperationException();
   }

   @Override
   public String toString() {
      return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
   }

   @Override
   public boolean offer(E var1) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      while (true) {
         long var7 = this.lvProducerLimit();
         long var5 = lvProducerIndex(this);
         if ((var5 & 1L) != 1L) {
            long var2 = this.producerMask;
            Object[] var4 = this.producerBuffer;
            if (var7 <= var5) {
               int var9 = this.offerSlowPath(var2, var5, var7);
               switch (var9) {
                  case 0:
                  default:
                     break;
                  case 1:
                     continue;
                  case 2:
                     return false;
                  case 3:
                     this.resize(var2, (E[])var4, var5, (E)var1);
                     return true;
               }
            }

            if (casProducerIndex(this, var5, var5 + 2L)) {
               var7 = modifiedCalcElementOffset(var5, var2);
               soElement(var4, var7, var1);
               return true;
            }
            continue;
         }
      }
   }

   private int offerSlowPath(long var1, long var3, long var5) {
      long var8 = lvConsumerIndex(this);
      long var10 = this.getCurrentBufferCapacity(var1);
      byte var7 = 0;
      if (var8 + var10 > var3) {
         if (!casProducerLimit(this, var5, var8 + var10)) {
            var7 = 1;
         }
      } else if (this.availableInQueue(var3, var8) <= 0L) {
         var7 = 2;
      } else if (casProducerIndex(this, var3, var3 + 1L)) {
         var7 = 3;
      } else {
         var7 = 1;
      }

      return var7;
   }

   protected abstract long availableInQueue(long var1, long var3);

   @Override
   public E poll() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.consumerIndex;
      long var4 = this.consumerMask;
      long var6 = modifiedCalcElementOffset(var2, var4);
      Object var8 = lvElement(var1, var6);
      if (var8 == null) {
         if (var2 == lvProducerIndex(this)) {
            return null;
         }

         do {
            var8 = lvElement(var1, var6);
         } while (var8 == null);
      }

      if (var8 == JUMP) {
         Object[] var9 = this.getNextBuffer((E[])var1, var4);
         return this.newBufferPoll((E[])var9, var2);
      } else {
         soElement(var1, var6, null);
         soConsumerIndex(this, var2 + 2L);
         return (E)var8;
      }
   }

   @Override
   public E peek() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.consumerIndex;
      long var4 = this.consumerMask;
      long var6 = modifiedCalcElementOffset(var2, var4);
      Object var8 = lvElement(var1, var6);
      if (var8 == null && var2 != lvProducerIndex(this)) {
         while ((var8 = lvElement(var1, var6)) == null) {
         }
      }

      return (E)(var8 == JUMP ? this.newBufferPeek(this.getNextBuffer((E[])var1, var4), var2) : var8);
   }

   private E[] getNextBuffer(E[] var1, long var2) {
      long var4 = this.nextArrayOffset(var2);
      Object[] var6 = lvElement(var1, var4);
      soElement(var1, var4, null);
      return (E[])var6;
   }

   private long nextArrayOffset(long var1) {
      return modifiedCalcElementOffset(var1 + 2L, Long.MAX_VALUE);
   }

   private E newBufferPoll(E[] var1, long var2) {
      long var4 = this.newBufferAndOffset((E[])var1, var2);
      Object var6 = lvElement(var1, var4);
      if (var6 == null) {
         throw new IllegalStateException("new buffer must have at least one element");
      }

      soElement(var1, var4, null);
      soConsumerIndex(this, var2 + 2L);
      return (E)var6;
   }

   private E newBufferPeek(E[] var1, long var2) {
      long var4 = this.newBufferAndOffset((E[])var1, var2);
      Object var6 = lvElement(var1, var4);
      if (var6 == null) {
         throw new IllegalStateException("new buffer must have at least one element");
      } else {
         return (E)var6;
      }
   }

   private long newBufferAndOffset(E[] var1, long var2) {
      this.consumerBuffer = (E[])var1;
      this.consumerMask = var1.length - 2L << 1;
      return modifiedCalcElementOffset(var2, this.consumerMask);
   }

   @Override
   public final int size() {
      long var1 = lvConsumerIndex(this);

      long var5;
      long var7;
      do {
         var5 = var1;
         var7 = lvProducerIndex(this);
         var1 = lvConsumerIndex(this);
      } while (var5 != var1);

      long var3 = var7 - var1 >> 1;
      return var3 > 2147483647L ? Integer.MAX_VALUE : (int)var3;
   }

   @Override
   public final boolean isEmpty() {
      return lvConsumerIndex(this) == lvProducerIndex(this);
   }

   private long lvProducerLimit() {
      return this.producerLimit;
   }

   public long currentProducerIndex() {
      return lvProducerIndex(this) / 2L;
   }

   public long currentConsumerIndex() {
      return lvConsumerIndex(this) / 2L;
   }

   public abstract int capacity();

   public boolean relaxedOffer(E var1) {
      return this.offer((E)var1);
   }

   public E relaxedPoll() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.consumerIndex;
      long var4 = this.consumerMask;
      long var6 = modifiedCalcElementOffset(var2, var4);
      Object var8 = lvElement(var1, var6);
      if (var8 == null) {
         return null;
      } else if (var8 == JUMP) {
         Object[] var9 = this.getNextBuffer((E[])var1, var4);
         return this.newBufferPoll((E[])var9, var2);
      } else {
         soElement(var1, var6, null);
         soConsumerIndex(this, var2 + 2L);
         return (E)var8;
      }
   }

   public E relaxedPeek() {
      Object[] var1 = this.consumerBuffer;
      long var2 = this.consumerIndex;
      long var4 = this.consumerMask;
      long var6 = modifiedCalcElementOffset(var2, var4);
      Object var8 = lvElement(var1, var6);
      return (E)(var8 == JUMP ? this.newBufferPeek(this.getNextBuffer((E[])var1, var4), var2) : var8);
   }

   private void resize(long var1, E[] var3, long var4, E var6) {
      int var7 = this.getNextBufferSize((E[])var3);
      Object[] var8 = allocate(var7);
      this.producerBuffer = (E[])var8;
      int var9 = var7 - 2 << 1;
      this.producerMask = var9;
      long var10 = modifiedCalcElementOffset(var4, var1);
      long var12 = modifiedCalcElementOffset(var4, var9);
      soElement(var8, var12, var6);
      soElement(var3, this.nextArrayOffset(var1), var8);
      long var14 = lvConsumerIndex(this);
      long var16 = this.availableInQueue(var4, var14);
      if (var16 <= 0L) {
         throw new IllegalStateException();
      }

      soProducerLimit(this, var4 + Math.min(var9, var16));
      soProducerIndex(this, var4 + 2L);
      soElement(var3, var10, JUMP);
   }

   public static <E> E[] allocate(int var0) {
      return (E[])(new Object[var0]);
   }

   protected abstract int getNextBufferSize(E[] var1);

   protected abstract long getCurrentBufferCapacity(long var1);

   static long lvProducerIndex(BaseMpscLinkedArrayQueue<?> var0) {
      return (long)P_INDEX.getVolatile((BaseMpscLinkedArrayQueue)var0);
   }

   static long lvConsumerIndex(BaseMpscLinkedArrayQueue<?> var0) {
      return (long)C_INDEX.getVolatile((BaseMpscLinkedArrayQueue)var0);
   }

   static void soProducerIndex(BaseMpscLinkedArrayQueue<?> var0, long var1) {
      P_INDEX.setRelease((BaseMpscLinkedArrayQueue)var0, (long)var1);
   }

   static boolean casProducerIndex(BaseMpscLinkedArrayQueue<?> var0, long var1, long var3) {
      return P_INDEX.compareAndSet((BaseMpscLinkedArrayQueue)var0, (long)var1, (long)var3);
   }

   static void soConsumerIndex(BaseMpscLinkedArrayQueue<?> var0, long var1) {
      C_INDEX.setRelease((BaseMpscLinkedArrayQueue)var0, (long)var1);
   }

   static boolean casProducerLimit(BaseMpscLinkedArrayQueue<?> var0, long var1, long var3) {
      return P_LIMIT.compareAndSet((BaseMpscLinkedArrayQueue)var0, (long)var1, (long)var3);
   }

   static void soProducerLimit(BaseMpscLinkedArrayQueue<?> var0, long var1) {
      P_LIMIT.setRelease((BaseMpscLinkedArrayQueue)var0, (long)var1);
   }

   static <E> void soElement(E[] var0, long var1, E var3) {
      REF_ARRAY.setRelease((Object[])var0, (int)((int)var1), (Object)var3);
   }

   static <E> E lvElement(E[] var0, long var1) {
      return (E)(Object)REF_ARRAY.getVolatile((Object[])var0, (int)((int)var1));
   }

   static long modifiedCalcElementOffset(long var0, long var2) {
      return (var0 & var2) >> 1;
   }

   static {
      try {
         Lookup var0 = MethodHandles.privateLookupIn(BaseMpscLinkedArrayQueueProducerFields.class, MethodHandles.lookup());
         Lookup var1 = MethodHandles.privateLookupIn(BaseMpscLinkedArrayQueueConsumerFields.class, MethodHandles.lookup());
         Lookup var2 = MethodHandles.privateLookupIn(BaseMpscLinkedArrayQueueColdProducerFields.class, MethodHandles.lookup());
         P_INDEX = var0.findVarHandle(BaseMpscLinkedArrayQueueProducerFields.class, "producerIndex", long.class);
         C_INDEX = var1.findVarHandle(BaseMpscLinkedArrayQueueConsumerFields.class, "consumerIndex", long.class);
         P_LIMIT = var2.findVarHandle(BaseMpscLinkedArrayQueueColdProducerFields.class, "producerLimit", long.class);
         REF_ARRAY = MethodHandles.arrayElementVarHandle(Object[].class);
      } catch (ReflectiveOperationException var3) {
         throw new ExceptionInInitializerError(var3);
      }
   }
}
