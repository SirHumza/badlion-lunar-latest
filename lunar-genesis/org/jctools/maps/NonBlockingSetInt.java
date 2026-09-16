package org.jctools.maps;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeAccess;

public class NonBlockingSetInt extends AbstractSet<Integer> implements Serializable {
   private static final long serialVersionUID = 1234123412341234123L;
   private static final long _nbsi_offset = UnsafeAccess.fieldOffset(NonBlockingSetInt.class, "_nbsi");
   private transient NonBlockingSetInt.NBSI _nbsi = new NonBlockingSetInt.NBSI(63, new ConcurrentAutoTable(), this);

   private final boolean CAS_nbsi(NonBlockingSetInt.NBSI var1, NonBlockingSetInt.NBSI var2) {
      return UnsafeAccess.UNSAFE.compareAndSwapObject(this, _nbsi_offset, var1, var2);
   }

   public boolean add(Integer var1) {
      return this.add(var1.intValue());
   }

   @Override
   public boolean contains(Object var1) {
      return var1 instanceof Integer && this.contains(((Integer)var1).intValue());
   }

   @Override
   public boolean remove(Object var1) {
      return var1 instanceof Integer && this.remove(((Integer)var1).intValue());
   }

   public boolean add(int var1) {
      RangeUtil.checkPositiveOrZero(var1, "i");
      return this._nbsi.add(var1);
   }

   public boolean contains(int var1) {
      return var1 >= 0 && this._nbsi.contains(var1);
   }

   public boolean remove(int var1) {
      return var1 >= 0 && this._nbsi.remove(var1);
   }

   @Override
   public int size() {
      return this._nbsi.size();
   }

   public int length() {
      return this._nbsi._bits.length << 6;
   }

   @Override
   public void clear() {
      NonBlockingSetInt.NBSI var1 = new NonBlockingSetInt.NBSI(63, new ConcurrentAutoTable(), this);

      while (!this.CAS_nbsi(this._nbsi, var1)) {
      }
   }

   public void print() {
      this._nbsi.print(0);
   }

   @Override
   public Iterator<Integer> iterator() {
      return new NonBlockingSetInt.iter();
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      NonBlockingSetInt.NBSI var2 = this._nbsi;
      int var3 = this._nbsi._bits.length << 6;
      var1.writeInt(var3);

      for (int var4 = 0; var4 < var3; var4++) {
         var1.writeBoolean(this._nbsi.contains(var4));
      }
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      int var2 = var1.readInt();
      this._nbsi = new NonBlockingSetInt.NBSI(var2, new ConcurrentAutoTable(), this);

      for (int var3 = 0; var3 < var2; var3++) {
         if (var1.readBoolean()) {
            this._nbsi.add(var3);
         }
      }
   }

   private static final class NBSI {
      private final transient NonBlockingSetInt _non_blocking_set_int;
      private final transient ConcurrentAutoTable _size;
      private final long[] _bits;
      private static final int _Lbase = UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
      private static final int _Lscale = UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
      private NonBlockingSetInt.NBSI _new;
      private static final long _new_offset = UnsafeAccess.fieldOffset(NonBlockingSetInt.NBSI.class, "_new");
      private final transient AtomicInteger _copyIdx;
      private final transient AtomicInteger _copyDone;
      private final transient int _sum_bits_length;
      private final NonBlockingSetInt.NBSI _nbsi64;

      private static long rawIndex(long[] var0, int var1) {
         assert var1 >= 0 && var1 < var0.length;
         return _Lbase + (long)var1 * _Lscale;
      }

      private final boolean CAS(int var1, long var2, long var4) {
         return UnsafeAccess.UNSAFE.compareAndSwapLong(this._bits, rawIndex(this._bits, var1), var2, var4);
      }

      private final boolean CAS_new(NonBlockingSetInt.NBSI var1) {
         return UnsafeAccess.UNSAFE.compareAndSwapObject(this, _new_offset, null, var1);
      }

      private static final long mask(int var0) {
         return 1L << (var0 & 63);
      }

      private NBSI(int var1, ConcurrentAutoTable var2, NonBlockingSetInt var3) {
         this._non_blocking_set_int = var3;
         this._size = var2;
         this._copyIdx = var2 == null ? null : new AtomicInteger();
         this._copyDone = var2 == null ? null : new AtomicInteger();
         this._bits = new long[(int)(var1 + 63L >>> 6)];
         this._nbsi64 = var1 + 1 >>> 6 == 0 ? null : new NonBlockingSetInt.NBSI(var1 + 1 >>> 6, null, null);
         this._sum_bits_length = this._bits.length + (this._nbsi64 == null ? 0 : this._nbsi64._sum_bits_length);
      }

      public boolean add(int var1) {
         if (var1 >> 6 >= this._bits.length) {
            return this.install_larger_new_bits(var1).help_copy().add(var1);
         }

         NonBlockingSetInt.NBSI var2 = this;

         int var3;
         for (var3 = var1; (var3 & 63) == 63; var3 >>= 6) {
            var2 = var2._nbsi64;
         }

         long var4 = mask(var3);

         long var6;
         do {
            var6 = var2._bits[var3 >> 6];
            if (var6 < 0L) {
               return this.help_copy_impl(var1).help_copy().add(var1);
            }

            if ((var6 & var4) != 0L) {
               return false;
            }
         } while (!var2.CAS(var3 >> 6, var6, var6 | var4));

         this._size.add(1L);
         return true;
      }

      public boolean remove(int var1) {
         if (var1 >> 6 >= this._bits.length) {
            return this._new != null && this.help_copy().remove(var1);
         }

         NonBlockingSetInt.NBSI var2 = this;

         int var3;
         for (var3 = var1; (var3 & 63) == 63; var3 >>= 6) {
            var2 = var2._nbsi64;
         }

         long var4 = mask(var3);

         long var6;
         do {
            var6 = var2._bits[var3 >> 6];
            if (var6 < 0L) {
               return this.help_copy_impl(var1).help_copy().remove(var1);
            }

            if ((var6 & var4) == 0L) {
               return false;
            }
         } while (!var2.CAS(var3 >> 6, var6, var6 & ~var4));

         this._size.add(-1L);
         return true;
      }

      public boolean contains(int var1) {
         if (var1 >> 6 >= this._bits.length) {
            return this._new != null && this.help_copy().contains(var1);
         }

         NonBlockingSetInt.NBSI var2 = this;

         int var3;
         for (var3 = var1; (var3 & 63) == 63; var3 >>= 6) {
            var2 = var2._nbsi64;
         }

         long var4 = mask(var3);
         long var6 = var2._bits[var3 >> 6];
         return var6 < 0L ? this.help_copy_impl(var1).help_copy().contains(var1) : (var6 & var4) != 0L;
      }

      public int size() {
         return (int)this._size.get();
      }

      private NonBlockingSetInt.NBSI install_larger_new_bits(int var1) {
         if (this._new == null) {
            int var2 = this._bits.length << 6 << 1;
            this.CAS_new(new NonBlockingSetInt.NBSI(var2, this._size, this._non_blocking_set_int));
         }

         return this;
      }

      private NonBlockingSetInt.NBSI help_copy() {
         NonBlockingSetInt.NBSI var1 = this._non_blocking_set_int._nbsi;
         byte var2 = 8;
         int var3 = var1._copyIdx.getAndAdd(512);

         for (int var4 = 0; var4 < 8; var4++) {
            int var5 = var3 + var4 * 64;
            var5 %= var1._bits.length << 6;
            var1.help_copy_impl(var5);
            var1.help_copy_impl(var5 + 63);
         }

         if (var1._copyDone.get() == var1._sum_bits_length && this._non_blocking_set_int.CAS_nbsi(var1, var1._new)) {
         }

         return this._new;
      }

      private NonBlockingSetInt.NBSI help_copy_impl(int var1) {
         NonBlockingSetInt.NBSI var2 = this;
         NonBlockingSetInt.NBSI var3 = this._new;
         if (var3 == null) {
            return this;
         }

         int var4;
         for (var4 = var1; (var4 & 63) == 63; var4 >>= 6) {
            var2 = var2._nbsi64;
            var3 = var3._nbsi64;
         }

         long var5;
         for (var5 = var2._bits[var4 >> 6]; var5 >= 0L; var5 = var2._bits[var4 >> 6]) {
            long var7 = var5;
            var5 |= mask(63);
            if (var2.CAS(var4 >> 6, var7, var5)) {
               if (var7 == 0L) {
                  this._copyDone.addAndGet(1);
               }
               break;
            }
         }

         if (var5 != mask(63)) {
            long var9 = var3._bits[var4 >> 6];
            if (var9 == 0L) {
               var9 = var5 & ~mask(63);
               if (!var3.CAS(var4 >> 6, 0L, var9)) {
                  var9 = var3._bits[var4 >> 6];
               }

               assert var9 != 0L;
            }

            if (var2.CAS(var4 >> 6, var5, mask(63))) {
               this._copyDone.addAndGet(1);
            }
         }

         return this;
      }

      private void print(int var1, String var2) {
         for (int var3 = 0; var3 < var1; var3++) {
            System.out.print("  ");
         }

         System.out.println(var2);
      }

      private void print(int var1) {
         StringBuilder var2 = new StringBuilder();
         var2.append("NBSI - _bits.len=");

         for (NonBlockingSetInt.NBSI var3 = this; var3 != null; var3 = var3._nbsi64) {
            var2.append(" " + var3._bits.length);
         }

         this.print(var1, var2.toString());
         NonBlockingSetInt.NBSI var5 = this;

         while (var5 != null) {
            for (int var4 = 0; var4 < var5._bits.length; var4++) {
               System.out.print(Long.toHexString(var5._bits[var4]) + " ");
            }

            var5 = var5._nbsi64;
            System.out.println();
         }

         if (this._copyIdx.get() != 0 || this._copyDone.get() != 0) {
            this.print(var1, "_copyIdx=" + this._copyIdx.get() + " _copyDone=" + this._copyDone.get() + " _words_to_cpy=" + this._sum_bits_length);
         }

         if (this._new != null) {
            this.print(var1, "__has_new - ");
            this._new.print(var1 + 1);
         }
      }
   }

   private class iter implements Iterator<Integer> {
      NonBlockingSetInt.NBSI _nbsi2;
      int _idx = -1;
      int _prev = -1;

      iter() {
         this._nbsi2 = NonBlockingSetInt.this._nbsi;
         this.advance();
      }

      @Override
      public boolean hasNext() {
         return this._idx != -2;
      }

      private void advance() {
         do {
            this._idx++;

            while (this._idx >> 6 >= this._nbsi2._bits.length) {
               if (this._nbsi2._new == null) {
                  this._idx = -2;
                  return;
               }

               this._nbsi2 = this._nbsi2._new;
            }
         } while (!this._nbsi2.contains(this._idx));
      }

      public Integer next() {
         if (this._idx == -1) {
            throw new NoSuchElementException();
         }

         this._prev = this._idx;
         this.advance();
         return this._prev;
      }

      @Override
      public void remove() {
         if (this._prev == -1) {
            throw new IllegalStateException();
         }

         this._nbsi2.remove(this._prev);
         this._prev = -1;
      }
   }
}
