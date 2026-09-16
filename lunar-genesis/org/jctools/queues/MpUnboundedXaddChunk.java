package org.jctools.queues;

import org.jctools.util.UnsafeAccess;
import org.jctools.util.UnsafeRefArrayAccess;

public class MpUnboundedXaddChunk<R, E> {
   public static final int NOT_USED = -1;
   private static final long PREV_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddChunk.class, "prev");
   private static final long NEXT_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddChunk.class, "next");
   private static final long INDEX_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddChunk.class, "index");
   private final boolean pooled;
   private final E[] buffer;
   private volatile R prev;
   private volatile long index;
   private volatile R next;

   protected MpUnboundedXaddChunk(long var1, R var3, int var4, boolean var5) {
      this.buffer = (E[])UnsafeRefArrayAccess.allocateRefArray(var4);
      this.soPrev((R)var3);
      this.spIndex(var1);
      this.pooled = var5;
   }

   public final boolean isPooled() {
      return this.pooled;
   }

   public final long lvIndex() {
      return this.index;
   }

   public final void soIndex(long var1) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, INDEX_OFFSET, var1);
   }

   final void spIndex(long var1) {
      UnsafeAccess.UNSAFE.putLong(this, INDEX_OFFSET, var1);
   }

   public final R lvNext() {
      return this.next;
   }

   public final void soNext(R var1) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, NEXT_OFFSET, var1);
   }

   public final R lvPrev() {
      return this.prev;
   }

   public final void soPrev(R var1) {
      UnsafeAccess.UNSAFE.putObject(this, PREV_OFFSET, var1);
   }

   public final void soElement(int var1, E var2) {
      UnsafeRefArrayAccess.soRefElement(this.buffer, UnsafeRefArrayAccess.calcRefElementOffset(var1), var2);
   }

   public final E lvElement(int var1) {
      return UnsafeRefArrayAccess.lvRefElement(this.buffer, UnsafeRefArrayAccess.calcRefElementOffset(var1));
   }

   public final E spinForElement(int var1, boolean var2) {
      Object[] var3 = this.buffer;
      long var4 = UnsafeRefArrayAccess.calcRefElementOffset(var1);

      Object var6;
      do {
         var6 = UnsafeRefArrayAccess.lvRefElement(var3, var4);
      } while (var2 != (var6 == null));

      return (E)var6;
   }
}
