package org.jctools.maps;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeAccess;

public class NonBlockingHashMapLong<TypeV> extends AbstractMap<Long, TypeV> implements Serializable, Cloneable, ConcurrentMap<Long, TypeV> {
   private static final long serialVersionUID = 1234123412341234124L;
   private static final int REPROBE_LIMIT = 10;
   private static final int _Obase = UnsafeAccess.UNSAFE.arrayBaseOffset(Object[].class);
   private static final int _Oscale = UnsafeAccess.UNSAFE.arrayIndexScale(Object[].class);
   private static final int _Lbase = UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
   private static final int _Lscale = UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
   private static final long _chm_offset = UnsafeAccess.fieldOffset(NonBlockingHashMapLong.class, "_chm");
   private static final long _val_1_offset = UnsafeAccess.fieldOffset(NonBlockingHashMapLong.class, "_val_1");
   private transient NonBlockingHashMapLong.CHM _chm;
   private transient Object _val_1;
   private transient long _last_resize_milli;
   private final boolean _opt_for_space;
   private static final int MIN_SIZE_LOG = 4;
   private static final int MIN_SIZE = 16;
   private static final Object NO_MATCH_OLD = new Object();
   private static final Object MATCH_ANY = new Object();
   private static final Object TOMBSTONE = new Object();
   private static final NonBlockingHashMapLong.Prime TOMBPRIME = new NonBlockingHashMapLong.Prime(TOMBSTONE);
   private static final long NO_KEY = 0L;
   private transient ConcurrentAutoTable _reprobes = new ConcurrentAutoTable();

   private static long rawIndex(Object[] var0, int var1) {
      assert var1 >= 0 && var1 < var0.length;
      return _Obase + (long)var1 * _Oscale;
   }

   private static long rawIndex(long[] var0, int var1) {
      assert var1 >= 0 && var1 < var0.length;
      return _Lbase + (long)var1 * _Lscale;
   }

   private final boolean CAS(long var1, Object var3, Object var4) {
      return UnsafeAccess.UNSAFE.compareAndSwapObject(this, var1, var3, var4);
   }

   public final void print() {
      System.out.println("=========");
      print_impl(-99, 0L, this._val_1);
      this._chm.print();
      System.out.println("=========");
   }

   private static void print_impl(int var0, long var1, Object var3) {
      String var4 = var3 instanceof NonBlockingHashMapLong.Prime ? "prime_" : "";
      Object var5 = NonBlockingHashMapLong.Prime.unbox(var3);
      String var6 = var5 == TOMBSTONE ? "tombstone" : var5.toString();
      System.out.println("[" + var0 + "]=(" + var1 + "," + var4 + var6 + ")");
   }

   private void print2() {
      System.out.println("=========");
      print2_impl(-99, 0L, this._val_1);
      this._chm.print();
      System.out.println("=========");
   }

   private static void print2_impl(int var0, long var1, Object var3) {
      if (var3 != null && NonBlockingHashMapLong.Prime.unbox(var3) != TOMBSTONE) {
         print_impl(var0, var1, var3);
      }
   }

   public long reprobes() {
      long var1 = this._reprobes.get();
      this._reprobes = new ConcurrentAutoTable();
      return var1;
   }

   private static int reprobe_limit(int var0) {
      return 10 + (var0 >> 4);
   }

   public NonBlockingHashMapLong() {
      this(16, true);
   }

   public NonBlockingHashMapLong(int var1) {
      this(var1, true);
   }

   public NonBlockingHashMapLong(boolean var1) {
      this(1, var1);
   }

   public NonBlockingHashMapLong(int var1, boolean var2) {
      this._opt_for_space = var2;
      this.initialize(var1);
   }

   private void initialize(int var1) {
      RangeUtil.checkPositiveOrZero(var1, "initial_sz");
      int var2 = 4;

      while (1 << var2 < var1) {
         var2++;
      }

      this._chm = new NonBlockingHashMapLong.CHM(this, new ConcurrentAutoTable(), var2);
      this._val_1 = TOMBSTONE;
      this._last_resize_milli = System.currentTimeMillis();
   }

   @Override
   public int size() {
      return (this._val_1 == TOMBSTONE ? 0 : 1) + this._chm.size();
   }

   public boolean containsKey(long var1) {
      return this.get(var1) != null;
   }

   public boolean contains(Object var1) {
      return this.containsValue(var1);
   }

   public TypeV put(long var1, TypeV var3) {
      return this.putIfMatch(var1, var3, NO_MATCH_OLD);
   }

   public TypeV putIfAbsent(long var1, TypeV var3) {
      return this.putIfMatch(var1, var3, TOMBSTONE);
   }

   public TypeV remove(long var1) {
      return this.putIfMatch(var1, TOMBSTONE, NO_MATCH_OLD);
   }

   public boolean remove(long var1, Object var3) {
      return this.putIfMatch(var1, TOMBSTONE, var3) == var3;
   }

   public TypeV replace(long var1, TypeV var3) {
      return this.putIfMatch(var1, var3, MATCH_ANY);
   }

   public boolean replace(long var1, TypeV var3, TypeV var4) {
      return this.putIfMatch(var1, var4, var3) == var3;
   }

   private TypeV putIfMatch(long var1, Object var3, Object var4) {
      if (var4 == null || var3 == null) {
         throw new NullPointerException();
      }

      if (var1 != 0L) {
         Object var6 = this._chm.putIfMatch(var1, var3, var4);
         assert !(var6 instanceof NonBlockingHashMapLong.Prime);
         assert var6 != null;
         return (TypeV)(var6 == TOMBSTONE ? null : var6);
      }

      Object var5 = this._val_1;
      if ((var4 == NO_MATCH_OLD || var5 == var4 || var4 == MATCH_ANY && var5 != TOMBSTONE || var4.equals(var5)) && !this.CAS(_val_1_offset, var5, var3)) {
         var5 = this._val_1;
      }

      return (TypeV)(var5 == TOMBSTONE ? null : var5);
   }

   @Override
   public void clear() {
      NonBlockingHashMapLong.CHM var1 = new NonBlockingHashMapLong.CHM(this, new ConcurrentAutoTable(), 4);

      while (!this.CAS(_chm_offset, this._chm, var1)) {
      }

      this.CAS(_val_1_offset, this._val_1, TOMBSTONE);
   }

   public void clear(boolean var1) {
      this._chm.clear();
      this.CAS(_val_1_offset, this._val_1, TOMBSTONE);
   }

   @Override
   public boolean containsValue(Object var1) {
      if (var1 == null) {
         return false;
      }

      if (var1 == this._val_1) {
         return true;
      }

      for (Object var3 : this.values()) {
         if (var3 == var1 || var3.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final TypeV get(long var1) {
      if (var1 == 0L) {
         Object var4 = this._val_1;
         return (TypeV)(var4 == TOMBSTONE ? null : var4);
      } else {
         Object var3 = this._chm.get_impl(var1);
         assert !(var3 instanceof NonBlockingHashMapLong.Prime);
         assert var3 != TOMBSTONE;
         return (TypeV)var3;
      }
   }

   @Override
   public TypeV get(Object var1) {
      return var1 instanceof Long ? this.get(((Long)var1).longValue()) : null;
   }

   @Override
   public TypeV remove(Object var1) {
      return var1 instanceof Long ? this.remove(((Long)var1).longValue()) : null;
   }

   @Override
   public boolean remove(Object var1, Object var2) {
      return var1 instanceof Long && this.remove(((Long)var1).longValue(), var2);
   }

   @Override
   public boolean containsKey(Object var1) {
      return var1 instanceof Long && this.containsKey(((Long)var1).longValue());
   }

   public TypeV putIfAbsent(Long var1, TypeV var2) {
      return this.putIfAbsent(var1.longValue(), (TypeV)var2);
   }

   public TypeV replace(Long var1, TypeV var2) {
      return this.replace(var1.longValue(), (TypeV)var2);
   }

   public TypeV put(Long var1, TypeV var2) {
      return this.put(var1.longValue(), (TypeV)var2);
   }

   public boolean replace(Long var1, TypeV var2, TypeV var3) {
      return this.replace(var1.longValue(), (TypeV)var2, (TypeV)var3);
   }

   private void help_copy() {
      NonBlockingHashMapLong.CHM var1 = this._chm;
      if (var1._newchm != null) {
         var1.help_copy_impl(false);
      }
   }

   private static final int hash(long var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      var0 ^= var0 >>> 7 ^ var0 >>> 4;
      var0 += var0 << 7;
      return (int)var0;
   }

   public Enumeration<TypeV> elements() {
      return new NonBlockingHashMapLong.SnapshotV();
   }

   @Override
   public Collection<TypeV> values() {
      return new AbstractCollection<TypeV>() {
         @Override
         public void clear() {
            NonBlockingHashMapLong.this.clear();
         }

         @Override
         public int size() {
            return NonBlockingHashMapLong.this.size();
         }

         @Override
         public boolean contains(Object var1) {
            return NonBlockingHashMapLong.this.containsValue(var1);
         }

         @Override
         public Iterator<TypeV> iterator() {
            return NonBlockingHashMapLong.this.new SnapshotV();
         }
      };
   }

   public Enumeration<Long> keys() {
      return new NonBlockingHashMapLong.IteratorLong();
   }

   @Override
   public Set<Long> keySet() {
      return new AbstractSet<Long>() {
         @Override
         public void clear() {
            NonBlockingHashMapLong.this.clear();
         }

         @Override
         public int size() {
            return NonBlockingHashMapLong.this.size();
         }

         @Override
         public boolean contains(Object var1) {
            return NonBlockingHashMapLong.this.containsKey(var1);
         }

         @Override
         public boolean remove(Object var1) {
            return NonBlockingHashMapLong.this.remove(var1) != null;
         }

         public NonBlockingHashMapLong<TypeV>.IteratorLong iterator() {
            return NonBlockingHashMapLong.this.new IteratorLong();
         }
      };
   }

   public long[] keySetLong() {
      long[] var1 = new long[this.size()];
      NonBlockingHashMapLong.IteratorLong var2 = (NonBlockingHashMapLong.IteratorLong)this.keySet().iterator();
      int var3 = 0;

      while (var3 < var1.length && var2.hasNext()) {
         var1[var3++] = var2.nextLong();
      }

      return var1;
   }

   @Override
   public Set<Entry<Long, TypeV>> entrySet() {
      return new AbstractSet<Entry<Long, TypeV>>() {
         @Override
         public void clear() {
            NonBlockingHashMapLong.this.clear();
         }

         @Override
         public int size() {
            return NonBlockingHashMapLong.this.size();
         }

         @Override
         public boolean remove(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            return NonBlockingHashMapLong.this.remove(var2.getKey(), var2.getValue());
         }

         @Override
         public boolean contains(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            Object var3 = NonBlockingHashMapLong.this.get(var2.getKey());
            return var3 != null && var3.equals(var2.getValue());
         }

         @Override
         public Iterator<Entry<Long, TypeV>> iterator() {
            return NonBlockingHashMapLong.this.new SnapshotE();
         }
      };
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();

      for (long var3 : this.keySet()) {
         Object var5 = this.get(var3);
         var1.writeLong(var3);
         var1.writeObject(var5);
      }

      var1.writeLong(0L);
      var1.writeObject(null);
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.initialize(16);

      while (true) {
         long var2 = var1.readLong();
         Object var4 = var1.readObject();
         if (var2 == 0L && var4 == null) {
            return;
         }

         this.put(var2, (TypeV)var4);
      }
   }

   public NonBlockingHashMapLong<TypeV> clone() {
      try {
         NonBlockingHashMapLong var1 = (NonBlockingHashMapLong)super.clone();
         var1.clear();

         for (long var5 : this.keySetLong()) {
            var1.put(var5, this.get(var5));
         }

         return var1;
      } catch (CloneNotSupportedException var7) {
         throw new InternalError();
      }
   }

   private static final class CHM implements Serializable {
      final NonBlockingHashMapLong _nbhml;
      private ConcurrentAutoTable _size;
      private ConcurrentAutoTable _slots;
      volatile NonBlockingHashMapLong.CHM _newchm;
      private static final AtomicReferenceFieldUpdater<NonBlockingHashMapLong.CHM, NonBlockingHashMapLong.CHM> _newchmUpdater = AtomicReferenceFieldUpdater.newUpdater(
         NonBlockingHashMapLong.CHM.class, NonBlockingHashMapLong.CHM.class, "_newchm"
      );
      volatile long _resizers;
      private static final AtomicLongFieldUpdater<NonBlockingHashMapLong.CHM> _resizerUpdater = AtomicLongFieldUpdater.newUpdater(
         NonBlockingHashMapLong.CHM.class, "_resizers"
      );
      final long[] _keys;
      final Object[] _vals;
      volatile long _copyIdx = 0L;
      private static final AtomicLongFieldUpdater<NonBlockingHashMapLong.CHM> _copyIdxUpdater = AtomicLongFieldUpdater.newUpdater(
         NonBlockingHashMapLong.CHM.class, "_copyIdx"
      );
      volatile long _copyDone = 0L;
      private static final AtomicLongFieldUpdater<NonBlockingHashMapLong.CHM> _copyDoneUpdater = AtomicLongFieldUpdater.newUpdater(
         NonBlockingHashMapLong.CHM.class, "_copyDone"
      );

      public int size() {
         return (int)this._size.get();
      }

      public int slots() {
         return (int)this._slots.get();
      }

      boolean CAS_newchm(NonBlockingHashMapLong.CHM var1) {
         return _newchmUpdater.compareAndSet(this, null, var1);
      }

      private boolean CAS_key(int var1, long var2, long var4) {
         return UnsafeAccess.UNSAFE.compareAndSwapLong(this._keys, NonBlockingHashMapLong.rawIndex(this._keys, var1), var2, var4);
      }

      private boolean CAS_val(int var1, Object var2, Object var3) {
         return UnsafeAccess.UNSAFE.compareAndSwapObject(this._vals, NonBlockingHashMapLong.rawIndex(this._vals, var1), var2, var3);
      }

      CHM(NonBlockingHashMapLong var1, ConcurrentAutoTable var2, int var3) {
         this._nbhml = var1;
         this._size = var2;
         this._slots = new ConcurrentAutoTable();
         this._keys = new long[1 << var3];
         this._vals = new Object[1 << var3];
      }

      void clear() {
         this._size = new ConcurrentAutoTable();
         this._slots = new ConcurrentAutoTable();
         Arrays.fill(this._keys, 0L);
         Arrays.fill(this._vals, null);
      }

      private void print() {
         for (int var1 = 0; var1 < this._keys.length; var1++) {
            long var2 = this._keys[var1];
            if (var2 != 0L) {
               NonBlockingHashMapLong.print_impl(var1, var2, this._vals[var1]);
            }
         }

         NonBlockingHashMapLong.CHM var4 = this._newchm;
         if (var4 != null) {
            System.out.println("----");
            var4.print();
         }
      }

      private void print2() {
         for (int var1 = 0; var1 < this._keys.length; var1++) {
            long var2 = this._keys[var1];
            if (var2 != 0L) {
               NonBlockingHashMapLong.print2_impl(var1, var2, this._vals[var1]);
            }
         }

         NonBlockingHashMapLong.CHM var4 = this._newchm;
         if (var4 != null) {
            System.out.println("----");
            var4.print2();
         }
      }

      private Object get_impl(long var1) {
         int var3 = NonBlockingHashMapLong.hash(var1);
         int var4 = this._keys.length;
         int var5 = var3 & var4 - 1;
         int var6 = 0;

         while (true) {
            long var7 = this._keys[var5];
            Object var9 = this._vals[var5];
            if (var7 == 0L) {
               return null;
            }

            if (var1 == var7) {
               if (!(var9 instanceof NonBlockingHashMapLong.Prime)) {
                  if (var9 == NonBlockingHashMapLong.TOMBSTONE) {
                     return null;
                  }

                  NonBlockingHashMapLong.CHM var10 = this._newchm;
                  return var9;
               }

               return this.copy_slot_and_check(var5, var1).get_impl(var1);
            }

            if (++var6 >= NonBlockingHashMapLong.reprobe_limit(var4)) {
               return this._newchm == null ? null : this.copy_slot_and_check(var5, var1).get_impl(var1);
            }

            var5 = var5 + 1 & var4 - 1;
         }
      }

      private Object putIfMatch(long var1, Object var3, Object var4) {
         int var5 = NonBlockingHashMapLong.hash(var1);
         assert var3 != null;
         assert !(var3 instanceof NonBlockingHashMapLong.Prime);
         assert !(var4 instanceof NonBlockingHashMapLong.Prime);
         int var6 = this._keys.length;
         int var7 = var5 & var6 - 1;
         int var8 = 0;

         Object var11;
         while (true) {
            var11 = this._vals[var7];
            long var9 = this._keys[var7];
            if (var9 == 0L) {
               if (var3 == NonBlockingHashMapLong.TOMBSTONE) {
                  return NonBlockingHashMapLong.TOMBSTONE;
               }

               if (var4 == NonBlockingHashMapLong.MATCH_ANY) {
                  return NonBlockingHashMapLong.TOMBSTONE;
               }

               if (this.CAS_key(var7, 0L, var1)) {
                  this._slots.add(1L);
                  break;
               }

               var9 = this._keys[var7];
               assert var9 != 0L;
            }

            if (var9 == var1) {
               break;
            }

            if (++var8 >= NonBlockingHashMapLong.reprobe_limit(var6)) {
               NonBlockingHashMapLong.CHM var12 = this.resize();
               if (var4 != null) {
                  this._nbhml.help_copy();
               }

               return var12.putIfMatch(var1, var3, var4);
            }

            var7 = var7 + 1 & var6 - 1;
         }

         while (var3 != var11) {
            if ((var11 != null || !this.tableFull(var8, var6)) && !(var11 instanceof NonBlockingHashMapLong.Prime)) {
               if (var4 == NonBlockingHashMapLong.NO_MATCH_OLD
                  || var11 == var4
                  || var4 == NonBlockingHashMapLong.MATCH_ANY && var11 != NonBlockingHashMapLong.TOMBSTONE && var11 != null
                  || var11 == null && var4 == NonBlockingHashMapLong.TOMBSTONE
                  || var4 != null && var4.equals(var11)) {
                  if (this.CAS_val(var7, var11, var3)) {
                     if (var4 != null) {
                        if ((var11 == null || var11 == NonBlockingHashMapLong.TOMBSTONE) && var3 != NonBlockingHashMapLong.TOMBSTONE) {
                           this._size.add(1L);
                        }

                        if (var11 != null && var11 != NonBlockingHashMapLong.TOMBSTONE && var3 == NonBlockingHashMapLong.TOMBSTONE) {
                           this._size.add(-1L);
                        }
                     }

                     return var11 == null && var4 != null ? NonBlockingHashMapLong.TOMBSTONE : var11;
                  }

                  var11 = this._vals[var7];
                  if (var11 instanceof NonBlockingHashMapLong.Prime) {
                     return this.copy_slot_and_check(var7, var4).putIfMatch(var1, var3, var4);
                  }

                  int var13 = NonBlockingHashMap.DUMMY_VOLATILE;
                  continue;
               }

               return var11 == null ? NonBlockingHashMapLong.TOMBSTONE : var11;
            }

            this.resize();
            return this.copy_slot_and_check(var7, var4).putIfMatch(var1, var3, var4);
         }

         return var11;
      }

      private boolean tableFull(int var1, int var2) {
         return var1 >= 10 && (var1 >= NonBlockingHashMapLong.reprobe_limit(var2) || this._slots.estimate_get() >= var2 >> 1);
      }

      private NonBlockingHashMapLong.CHM resize() {
         NonBlockingHashMapLong.CHM var1 = this._newchm;
         if (var1 != null) {
            return var1;
         }

         int var2 = this._keys.length;
         int var3 = this.size();
         int var4 = var3;
         if (this._nbhml._opt_for_space) {
            if (var3 >= var2 >> 1) {
               var4 = var2 << 1;
            }
         } else if (var3 >= var2 >> 2) {
            var4 = var2 << 1;
            if (var3 >= var2 >> 1) {
               var4 = var2 << 2;
            }
         }

         long var5 = System.currentTimeMillis();
         if (var4 <= var2 && var5 <= this._nbhml._last_resize_milli + 10000L) {
            var4 = var2 << 1;
         }

         if (var4 < var2) {
            var4 = var2;
         }

         int var7 = 4;

         while (1 << var7 < var4) {
            var7++;
         }

         long var8 = (1L << var7 << 1) + 2L;
         if ((int)var8 != var8) {
            var7 = 30;
            var8 = (1L << var7) + 2L;
            if (var3 > (var8 >> 2) + (var8 >> 1)) {
               throw new RuntimeException("Table is full.");
            }
         }

         long var10 = this._resizers;

         while (!_resizerUpdater.compareAndSet(this, var10, var10 + 1L)) {
            var10 = this._resizers;
         }

         long var12 = (1L << var7 << 1) + 8L << 3 >> 20;
         if (var10 >= 2L && var12 > 0L) {
            var1 = this._newchm;
            if (var1 != null) {
               return var1;
            }

            try {
               Thread.sleep(var12);
            } catch (Exception var15) {
            }
         }

         var1 = this._newchm;
         if (var1 != null) {
            return var1;
         }

         var1 = new NonBlockingHashMapLong.CHM(this._nbhml, this._size, var7);
         if (this._newchm != null) {
            return this._newchm;
         }

         if (!this.CAS_newchm(var1)) {
            var1 = this._newchm;
         }

         return var1;
      }

      private void help_copy_impl(boolean var1) {
         NonBlockingHashMapLong.CHM var2 = this._newchm;
         assert var2 != null;
         int var3 = this._keys.length;
         int var4 = Math.min(var3, 1024);
         int var5 = -1;
         int var6 = -9999;

         while (this._copyDone < var3) {
            if (var5 == -1) {
               var6 = (int)this._copyIdx;

               while (var6 < var3 << 1 && !_copyIdxUpdater.compareAndSet(this, var6, var6 + var4)) {
                  var6 = (int)this._copyIdx;
               }

               if (var6 >= var3 << 1) {
                  var5 = var6;
               }
            }

            int var7 = 0;

            for (int var8 = 0; var8 < var4; var8++) {
               if (this.copy_slot(var6 + var8 & var3 - 1)) {
                  var7++;
               }
            }

            if (var7 > 0) {
               this.copy_check_and_promote(var7);
            }

            var6 += var4;
            if (!var1 && var5 == -1) {
               return;
            }
         }

         this.copy_check_and_promote(0);
      }

      private NonBlockingHashMapLong.CHM copy_slot_and_check(int var1, Object var2) {
         assert this._newchm != null;
         if (this.copy_slot(var1)) {
            this.copy_check_and_promote(1);
         }

         if (var2 != null) {
            this._nbhml.help_copy();
         }

         return this._newchm;
      }

      private void copy_check_and_promote(int var1) {
         int var2 = this._keys.length;
         long var3 = this._copyDone;
         long var5 = var3 + var1;
         assert var5 <= var2;
         if (var1 > 0) {
            while (!_copyDoneUpdater.compareAndSet(this, var3, var5)) {
               var3 = this._copyDone;
               var5 = var3 + var1;
               assert var5 <= var2;
            }
         }

         if (var5 == var2 && this._nbhml._chm == this && this._nbhml.CAS(NonBlockingHashMapLong._chm_offset, this, this._newchm)) {
            this._nbhml._last_resize_milli = System.currentTimeMillis();
         }
      }

      private boolean copy_slot(int var1) {
         long var2;
         while ((var2 = this._keys[var1]) == 0L) {
            this.CAS_key(var1, 0L, var1 + this._keys.length);
         }

         Object var4;
         for (var4 = this._vals[var1]; !(var4 instanceof NonBlockingHashMapLong.Prime); var4 = this._vals[var1]) {
            NonBlockingHashMapLong.Prime var5 = var4 != null && var4 != NonBlockingHashMapLong.TOMBSTONE
               ? new NonBlockingHashMapLong.Prime(var4)
               : NonBlockingHashMapLong.TOMBPRIME;
            if (this.CAS_val(var1, var4, var5)) {
               if (var5 == NonBlockingHashMapLong.TOMBPRIME) {
                  return true;
               }

               var4 = var5;
               break;
            }
         }

         if (var4 == NonBlockingHashMapLong.TOMBPRIME) {
            return false;
         }

         Object var7 = ((NonBlockingHashMapLong.Prime)var4)._V;
         assert var7 != NonBlockingHashMapLong.TOMBSTONE;
         boolean var6 = this._newchm.putIfMatch(var2, var7, null) == null;

         while (var4 != NonBlockingHashMapLong.TOMBPRIME && !this.CAS_val(var1, var4, NonBlockingHashMapLong.TOMBPRIME)) {
            var4 = this._vals[var1];
         }

         return var6;
      }
   }

   public class IteratorLong implements Enumeration<Long>, Iterator<Long> {
      private final NonBlockingHashMapLong<TypeV>.SnapshotV _ss = NonBlockingHashMapLong.this.new SnapshotV();

      @Override
      public void remove() {
         this._ss.removeKey();
      }

      public Long next() {
         this._ss.next();
         return this._ss._prevK;
      }

      public long nextLong() {
         this._ss.next();
         return this._ss._prevK;
      }

      @Override
      public boolean hasNext() {
         return this._ss.hasNext();
      }

      public Long nextElement() {
         return this.next();
      }

      @Override
      public boolean hasMoreElements() {
         return this.hasNext();
      }
   }

   private class NBHMLEntry extends AbstractEntry<Long, TypeV> {
      NBHMLEntry(Long var2, TypeV var3) {
         super(var2, (TypeV)var3);
      }

      @Override
      public TypeV setValue(TypeV var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this._val = (TypeV)var1;
         return NonBlockingHashMapLong.this.put(this._key, (TypeV)var1);
      }
   }

   private static final class Prime {
      final Object _V;

      Prime(Object var1) {
         this._V = var1;
      }

      static Object unbox(Object var0) {
         return var0 instanceof NonBlockingHashMapLong.Prime ? ((NonBlockingHashMapLong.Prime)var0)._V : var0;
      }
   }

   private class SnapshotE implements Iterator<Entry<Long, TypeV>> {
      final NonBlockingHashMapLong<TypeV>.SnapshotV _ss = NonBlockingHashMapLong.this.new SnapshotV();

      public SnapshotE() {
      }

      @Override
      public void remove() {
         this._ss.removeKey();
      }

      public Entry<Long, TypeV> next() {
         this._ss.next();
         return NonBlockingHashMapLong.this.new NBHMLEntry(this._ss._prevK, this._ss._prevV);
      }

      @Override
      public boolean hasNext() {
         return this._ss.hasNext();
      }
   }

   private class SnapshotV implements Enumeration<TypeV>, Iterator<TypeV> {
      final NonBlockingHashMapLong.CHM _sschm;
      private int _idx;
      private long _nextK;
      private long _prevK;
      private Object _nextV;
      private Object _prevV;

      public SnapshotV() {
         while (true) {
            NonBlockingHashMapLong.CHM var2 = NonBlockingHashMapLong.this._chm;
            if (var2._newchm == null) {
               this._sschm = var2;
               this._idx = -1;
               this.next();
               return;
            }

            var2.help_copy_impl(true);
         }
      }

      int length() {
         return this._sschm._keys.length;
      }

      long key(int var1) {
         return this._sschm._keys[var1];
      }

      @Override
      public boolean hasNext() {
         return this._nextV != null;
      }

      @Override
      public TypeV next() {
         if (this._idx != -1 && this._nextV == null) {
            throw new NoSuchElementException();
         }

         this._prevK = this._nextK;
         this._prevV = this._nextV;
         this._nextV = null;
         if (this._idx == -1) {
            this._idx = 0;
            this._nextK = 0L;
            if ((this._nextV = NonBlockingHashMapLong.this.get(this._nextK)) != null) {
               return (TypeV)this._prevV;
            }
         }

         while (this._idx < this.length()) {
            this._nextK = this.key(this._idx++);
            if (this._nextK != 0L && (this._nextV = NonBlockingHashMapLong.this.get(this._nextK)) != null) {
               break;
            }
         }

         return (TypeV)this._prevV;
      }

      public void removeKey() {
         if (this._prevV == null) {
            throw new IllegalStateException();
         }

         NonBlockingHashMapLong.this.putIfMatch(this._prevK, NonBlockingHashMapLong.TOMBSTONE, NonBlockingHashMapLong.NO_MATCH_OLD);
         this._prevV = null;
      }

      @Override
      public void remove() {
         this.removeKey();
      }

      @Override
      public TypeV nextElement() {
         return (TypeV)this.next();
      }

      @Override
      public boolean hasMoreElements() {
         return this.hasNext();
      }
   }
}
