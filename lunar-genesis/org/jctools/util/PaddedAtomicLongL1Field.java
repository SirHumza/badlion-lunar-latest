package org.jctools.util;

abstract class PaddedAtomicLongL1Field extends PaddedAtomicLongL1Pad {
   private static final long VALUE_OFFSET = UnsafeAccess.fieldOffset(PaddedAtomicLongL1Field.class, "value");
   private volatile long value;

   public void spVal(long var1) {
      UnsafeAccess.UNSAFE.putLong(this, VALUE_OFFSET, var1);
   }

   public void soVal(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, VALUE_OFFSET, var1);
   }

   public void svVal(long var1) {
      this.value = var1;
   }

   public long lvVal() {
      return this.value;
   }

   public long lpVal() {
      return UnsafeAccess.UNSAFE.getLong(this, VALUE_OFFSET);
   }

   public boolean casVal(long var1, long var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, VALUE_OFFSET, var1, var3);
   }

   public long getAndSetVal(long var1) {
      if (UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
         return UnsafeAccess.UNSAFE.getAndSetLong(this, VALUE_OFFSET, var1);
      }

      long var3;
      do {
         var3 = this.lvVal();
      } while (!this.casVal(var3, var1));

      return var3;
   }

   public long getAndAddVal(long var1) {
      if (UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
         return UnsafeAccess.UNSAFE.getAndAddLong(this, VALUE_OFFSET, var1);
      }

      long var3;
      do {
         var3 = this.lvVal();
      } while (!this.casVal(var3, var3 + var1));

      return var3;
   }
}
