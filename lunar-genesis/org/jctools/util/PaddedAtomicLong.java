package org.jctools.util;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class PaddedAtomicLong extends PaddedAtomicLongL2Pad {
   public PaddedAtomicLong() {
   }

   public PaddedAtomicLong(long var1) {
      this.svVal(var1);
   }

   public long get() {
      return this.lvVal();
   }

   public void set(long var1) {
      this.svVal(var1);
   }

   public void lazySet(long var1) {
      this.soVal(var1);
   }

   public long getAndSet(long var1) {
      return this.getAndSetVal(var1);
   }

   public boolean compareAndSet(long var1, long var3) {
      return this.casVal(var1, var3);
   }

   public boolean weakCompareAndSet(long var1, long var3) {
      return this.casVal(var1, var3);
   }

   public long getAndIncrement() {
      return this.getAndAddVal(1L);
   }

   public long getAndDecrement() {
      return this.getAndAddVal(-1L);
   }

   public long getAndAdd(long var1) {
      return this.getAndAddVal(var1);
   }

   public long incrementAndGet() {
      return this.getAndAddVal(1L) + 1L;
   }

   public long decrementAndGet() {
      return this.getAndAddVal(-1L) - 1L;
   }

   public long addAndGet(long var1) {
      return this.getAndAddVal(var1) + var1;
   }

   public long getAndUpdate(LongUnaryOperator var1) {
      long var2;
      long var4;
      do {
         var2 = this.lvVal();
         var4 = var1.applyAsLong(var2);
      } while (!this.casVal(var2, var4));

      return var2;
   }

   public long updateAndGet(LongUnaryOperator var1) {
      long var2;
      long var4;
      do {
         var2 = this.lvVal();
         var4 = var1.applyAsLong(var2);
      } while (!this.casVal(var2, var4));

      return var4;
   }

   public long getAndAccumulate(long var1, LongBinaryOperator var3) {
      long var4;
      long var6;
      do {
         var4 = this.lvVal();
         var6 = var3.applyAsLong(var4, var1);
      } while (!this.casVal(var4, var6));

      return var4;
   }

   public long accumulateAndGet(long var1, LongBinaryOperator var3) {
      long var4;
      long var6;
      do {
         var4 = this.lvVal();
         var6 = var3.applyAsLong(var4, var1);
      } while (!this.casVal(var4, var6));

      return var6;
   }

   @Override
   public String toString() {
      return Long.toString(this.lvVal());
   }

   @Override
   public int intValue() {
      return (int)this.lvVal();
   }

   @Override
   public long longValue() {
      return this.lvVal();
   }

   @Override
   public float floatValue() {
      return (float)this.lvVal();
   }

   @Override
   public double doubleValue() {
      return this.lvVal();
   }
}
