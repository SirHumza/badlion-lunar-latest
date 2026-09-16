package org.jctools.maps;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jctools.util.UnsafeAccess;

public class ConcurrentAutoTable implements Serializable {
   private volatile ConcurrentAutoTable.CAT _cat = new ConcurrentAutoTable.CAT(null, 16, 0L);
   private static AtomicReferenceFieldUpdater<ConcurrentAutoTable, ConcurrentAutoTable.CAT> _catUpdater = AtomicReferenceFieldUpdater.newUpdater(
      ConcurrentAutoTable.class, ConcurrentAutoTable.CAT.class, "_cat"
   );

   public void add(long var1) {
      this.add_if(var1);
   }

   public void decrement() {
      this.add_if(-1L);
   }

   public void increment() {
      this.add_if(1L);
   }

   public void set(long var1) {
      ConcurrentAutoTable.CAT var3 = new ConcurrentAutoTable.CAT(null, 4, var1);

      while (!this.CAS_cat(this._cat, var3)) {
      }
   }

   public long get() {
      return this._cat.sum();
   }

   public int intValue() {
      return (int)this._cat.sum();
   }

   public long longValue() {
      return this._cat.sum();
   }

   public long estimate_get() {
      return this._cat.estimate_sum();
   }

   @Override
   public String toString() {
      return this._cat.toString();
   }

   public void print() {
      this._cat.print();
   }

   public int internal_size() {
      return this._cat._t.length;
   }

   private long add_if(long var1) {
      return this._cat.add_if(var1, hash(), this);
   }

   private boolean CAS_cat(ConcurrentAutoTable.CAT var1, ConcurrentAutoTable.CAT var2) {
      return _catUpdater.compareAndSet(this, var1, var2);
   }

   private static int hash() {
      int var0 = System.identityHashCode(Thread.currentThread());
      return var0 << 3;
   }

   private static class CAT implements Serializable {
      private static final int _Lbase = UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
      private static final int _Lscale = UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
      private final ConcurrentAutoTable.CAT _next;
      private volatile long _fuzzy_sum_cache;
      private volatile long _fuzzy_time;
      private static final int MAX_SPIN = 1;
      private final long[] _t;

      private static long rawIndex(long[] var0, int var1) {
         assert var1 >= 0 && var1 < var0.length;
         return _Lbase + (long)var1 * _Lscale;
      }

      private static boolean CAS(long[] var0, int var1, long var2, long var4) {
         return UnsafeAccess.UNSAFE.compareAndSwapLong(var0, rawIndex(var0, var1), var2, var4);
      }

      CAT(ConcurrentAutoTable.CAT var1, int var2, long var3) {
         this._next = var1;
         this._t = new long[var2];
         this._t[0] = var3;
      }

      public long add_if(long var1, int var3, ConcurrentAutoTable var4) {
         long[] var5 = this._t;
         int var6 = var3 & var5.length - 1;
         long var7 = var5[var6];
         boolean var9 = CAS(var5, var6, var7, var7 + var1);
         if (var9) {
            return var7;
         }

         int var10 = 0;

         while (true) {
            var7 = var5[var6];
            if (CAS(var5, var6, var7, var7 + var1)) {
               if (var10 < 1) {
                  return var7;
               }

               if (var5.length >= 1048576) {
                  return var7;
               }

               if (var4._cat != this) {
                  return var7;
               }

               ConcurrentAutoTable.CAT var11 = new ConcurrentAutoTable.CAT(this, var5.length * 2, 0L);

               while (var4._cat == this && !var4.CAS_cat(this, var11)) {
               }

               return var7;
            }

            var10++;
         }
      }

      public long sum() {
         long var1 = this._next == null ? 0L : this._next.sum();
         long[] var3 = this._t;

         for (long var7 : var3) {
            var1 += var7;
         }

         return var1;
      }

      public long estimate_sum() {
         if (this._t.length <= 64) {
            return this.sum();
         }

         long var1 = System.currentTimeMillis();
         if (this._fuzzy_time != var1) {
            this._fuzzy_sum_cache = this.sum();
            this._fuzzy_time = var1;
         }

         return this._fuzzy_sum_cache;
      }

      @Override
      public String toString() {
         return Long.toString(this.sum());
      }

      public void print() {
         long[] var1 = this._t;
         System.out.print("[" + var1[0]);

         for (int var2 = 1; var2 < var1.length; var2++) {
            System.out.print("," + var1[var2]);
         }

         System.out.print("]");
         if (this._next != null) {
            this._next.print();
         }
      }
   }
}
