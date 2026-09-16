package org.jctools.maps;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeAccess;

public class NonBlockingIdentityHashMap<TypeK, TypeV> extends AbstractMap<TypeK, TypeV> implements Serializable, Cloneable, ConcurrentMap<TypeK, TypeV> {
   private static final long serialVersionUID = 1234123412341234123L;
   private static final int REPROBE_LIMIT = 10;
   private static final int _Obase = UnsafeAccess.UNSAFE.arrayBaseOffset(Object[].class);
   private static final int _Oscale = UnsafeAccess.UNSAFE.arrayIndexScale(Object[].class);
   private static final long _kvs_offset = UnsafeAccess.fieldOffset(NonBlockingHashMap.class, "_kvs");
   private transient Object[] _kvs;
   private transient long _last_resize_milli;
   private static final int MIN_SIZE_LOG = 3;
   private static final int MIN_SIZE = 8;
   private static final Object NO_MATCH_OLD = new Object();
   private static final Object MATCH_ANY = new Object();
   private static final Object TOMBSTONE = new Object();
   private static final NonBlockingIdentityHashMap.Prime TOMBPRIME = new NonBlockingIdentityHashMap.Prime(TOMBSTONE);
   private transient ConcurrentAutoTable _reprobes = new ConcurrentAutoTable();

   private static long rawIndex(Object[] var0, int var1) {
      assert var1 >= 0 && var1 < var0.length;
      return _Obase + (long)var1 * _Oscale;
   }

   private final boolean CAS_kvs(Object[] var1, Object[] var2) {
      return UnsafeAccess.UNSAFE.compareAndSwapObject(this, _kvs_offset, var1, var2);
   }

   private static final int hash(Object var0) {
      if (var0 == null) {
         throw new NullPointerException();
      } else {
         return System.identityHashCode(var0);
      }
   }

   private static final NonBlockingIdentityHashMap.CHM chm(Object[] var0) {
      return (NonBlockingIdentityHashMap.CHM)var0[0];
   }

   private static final int[] hashes(Object[] var0) {
      return (int[])var0[1];
   }

   private static final int len(Object[] var0) {
      return var0.length - 2 >> 1;
   }

   private static final Object key(Object[] var0, int var1) {
      return var0[(var1 << 1) + 2];
   }

   private static final Object val(Object[] var0, int var1) {
      return var0[(var1 << 1) + 3];
   }

   private static final boolean CAS_key(Object[] var0, int var1, Object var2, Object var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapObject(var0, rawIndex(var0, (var1 << 1) + 2), var2, var3);
   }

   private static final boolean CAS_val(Object[] var0, int var1, Object var2, Object var3) {
      return UnsafeAccess.UNSAFE.compareAndSwapObject(var0, rawIndex(var0, (var1 << 1) + 3), var2, var3);
   }

   public final void print() {
      System.out.println("=========");
      this.print2(this._kvs);
      System.out.println("=========");
   }

   private final void print(Object[] var1) {
      for (int var2 = 0; var2 < len(var1); var2++) {
         Object var3 = key(var1, var2);
         if (var3 != null) {
            String var4 = var3 == TOMBSTONE ? "XXX" : var3.toString();
            Object var5 = val(var1, var2);
            Object var6 = NonBlockingIdentityHashMap.Prime.unbox(var5);
            String var7 = var5 == var6 ? "" : "prime_";
            String var8 = var6 == TOMBSTONE ? "tombstone" : var6.toString();
            System.out.println("" + var2 + " (" + var4 + "," + var7 + var8 + ")");
         }
      }

      Object[] var9 = chm(var1)._newkvs;
      if (var9 != null) {
         System.out.println("----");
         this.print(var9);
      }
   }

   private final void print2(Object[] var1) {
      for (int var2 = 0; var2 < len(var1); var2++) {
         Object var3 = key(var1, var2);
         Object var4 = val(var1, var2);
         Object var5 = NonBlockingIdentityHashMap.Prime.unbox(var4);
         if (var3 != null && var3 != TOMBSTONE && var4 != null && var5 != TOMBSTONE) {
            String var6 = var4 == var5 ? "" : "prime_";
            System.out.println("" + var2 + " (" + var3 + "," + var6 + var4 + ")");
         }
      }

      Object[] var7 = chm(var1)._newkvs;
      if (var7 != null) {
         System.out.println("----");
         this.print2(var7);
      }
   }

   public long reprobes() {
      long var1 = this._reprobes.get();
      this._reprobes = new ConcurrentAutoTable();
      return var1;
   }

   private static final int reprobe_limit(int var0) {
      return 10 + (var0 >> 2);
   }

   public NonBlockingIdentityHashMap() {
      this(8);
   }

   public NonBlockingIdentityHashMap(int var1) {
      this.initialize(var1);
   }

   private final void initialize(int var1) {
      RangeUtil.checkPositiveOrZero(var1, "initial_sz");
      if (var1 > 1048576) {
         var1 = 1048576;
      }

      int var2 = 3;

      while (1 << var2 < var1 << 2) {
         var2++;
      }

      this._kvs = new Object[(1 << var2 << 1) + 2];
      this._kvs[0] = new NonBlockingIdentityHashMap.CHM(new ConcurrentAutoTable());
      this._kvs[1] = new int[1 << var2];
      this._last_resize_milli = System.currentTimeMillis();
   }

   protected final void initialize() {
      this.initialize(8);
   }

   @Override
   public int size() {
      return chm(this._kvs).size();
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.get(var1) != null;
   }

   public boolean contains(Object var1) {
      return this.containsValue(var1);
   }

   @Override
   public TypeV put(TypeK var1, TypeV var2) {
      return this.putIfMatch(var1, var2, NO_MATCH_OLD);
   }

   @Override
   public TypeV putIfAbsent(TypeK var1, TypeV var2) {
      return this.putIfMatch(var1, var2, TOMBSTONE);
   }

   @Override
   public TypeV remove(Object var1) {
      return this.putIfMatch(var1, TOMBSTONE, NO_MATCH_OLD);
   }

   @Override
   public boolean remove(Object var1, Object var2) {
      return objectsEquals(this.putIfMatch(var1, TOMBSTONE, var2), var2);
   }

   @Override
   public TypeV replace(TypeK var1, TypeV var2) {
      return this.putIfMatch(var1, var2, MATCH_ANY);
   }

   @Override
   public boolean replace(TypeK var1, TypeV var2, TypeV var3) {
      return objectsEquals(this.putIfMatch(var1, var3, var2), var2);
   }

   private static boolean objectsEquals(Object var0, Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   private final TypeV putIfMatch(Object var1, Object var2, Object var3) {
      if (var3 != null && var2 != null) {
         Object var4 = putIfMatch0(this, this._kvs, var1, var2, var3);
         assert !(var4 instanceof NonBlockingIdentityHashMap.Prime);
         assert var4 != null;
         return (TypeV)(var4 == TOMBSTONE ? null : var4);
      } else {
         throw new NullPointerException();
      }
   }

   @Override
   public void putAll(Map<? extends TypeK, ? extends TypeV> var1) {
      for (Entry var3 : var1.entrySet()) {
         this.put((TypeK)var3.getKey(), (TypeV)var3.getValue());
      }
   }

   @Override
   public void clear() {
      Object[] var1 = (new NonBlockingIdentityHashMap(8))._kvs;

      while (!this.CAS_kvs(this._kvs, var1)) {
      }
   }

   @Override
   public boolean containsValue(Object var1) {
      if (var1 == null) {
         throw new NullPointerException();
      }

      for (Object var3 : this.values()) {
         if (var3 == var1 || var3.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   protected void rehash() {
   }

   @Override
   public Object clone() {
      try {
         NonBlockingIdentityHashMap var1 = (NonBlockingIdentityHashMap)super.clone();
         var1.clear();

         for (Object var3 : this.keySet()) {
            Object var4 = this.get(var3);
            var1.put(var3, var4);
         }

         return var1;
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   @Override
   public String toString() {
      Iterator var1 = this.entrySet().iterator();
      if (!var1.hasNext()) {
         return "{}";
      }

      StringBuilder var2 = new StringBuilder();
      var2.append('{');

      while (true) {
         Entry var3 = (Entry)var1.next();
         Object var4 = var3.getKey();
         Object var5 = var3.getValue();
         var2.append(var4 == this ? "(this Map)" : var4);
         var2.append('=');
         var2.append(var5 == this ? "(this Map)" : var5);
         if (!var1.hasNext()) {
            return var2.append('}').toString();
         }

         var2.append(", ");
      }
   }

   @Override
   public TypeV get(Object var1) {
      Object var2 = get_impl(this, this._kvs, var1);
      assert !(var2 instanceof NonBlockingIdentityHashMap.Prime);
      assert var2 != TOMBSTONE;
      return (TypeV)var2;
   }

   private static final Object get_impl(NonBlockingIdentityHashMap var0, Object[] var1, Object var2) {
      int var3 = hash(var2);
      int var4 = len(var1);
      NonBlockingIdentityHashMap.CHM var5 = chm(var1);
      int var6 = var3 & var4 - 1;
      int var7 = 0;

      while (true) {
         Object var8 = key(var1, var6);
         Object var9 = val(var1, var6);
         if (var8 == null) {
            return null;
         }

         Object[] var10 = var5._newkvs;
         if (var8 == var2) {
            if (!(var9 instanceof NonBlockingIdentityHashMap.Prime)) {
               return var9 == TOMBSTONE ? null : var9;
            }

            return get_impl(var0, var5.copy_slot_and_check(var0, var1, var6, var2), var2);
         }

         if (++var7 >= reprobe_limit(var4) || var8 == TOMBSTONE) {
            return var10 == null ? null : get_impl(var0, var0.help_copy(var10), var2);
         }

         var6 = var6 + 1 & var4 - 1;
      }
   }

   private static final Object putIfMatch0(NonBlockingIdentityHashMap var0, Object[] var1, Object var2, Object var3, Object var4) {
      assert var3 != null;
      assert !(var3 instanceof NonBlockingIdentityHashMap.Prime);
      assert !(var4 instanceof NonBlockingIdentityHashMap.Prime);
      int var5 = hash(var2);
      int var6 = len(var1);
      NonBlockingIdentityHashMap.CHM var7 = chm(var1);
      int var8 = var5 & var6 - 1;
      int var9 = 0;
      Object var10 = null;
      Object var11 = null;
      Object[] var12 = null;

      while (true) {
         var11 = val(var1, var8);
         var10 = key(var1, var8);
         if (var10 == null) {
            if (var3 == TOMBSTONE) {
               return TOMBSTONE;
            }

            if (var4 == MATCH_ANY) {
               return TOMBSTONE;
            }

            if (!CAS_key(var1, var8, null, var2)) {
               int var13 = NonBlockingHashMap.DUMMY_VOLATILE;
               continue;
            }

            var7._slots.add(1L);
         } else {
            var12 = var7._newkvs;
            if (var10 != var2) {
               if (++var9 < reprobe_limit(var6) && var10 != TOMBSTONE) {
                  var8 = var8 + 1 & var6 - 1;
                  continue;
               }

               var12 = var7.resize(var0, var1);
               if (var4 != null) {
                  var0.help_copy(var12);
               }

               return putIfMatch0(var0, var12, var2, var3, var4);
            }
         }

         while (var3 != var11) {
            if (var12 == null && (var11 == null && var7.tableFull(var9, var6) || var11 instanceof NonBlockingIdentityHashMap.Prime)) {
               var12 = var7.resize(var0, var1);
            }

            if (var12 != null) {
               return putIfMatch0(var0, var7.copy_slot_and_check(var0, var1, var8, var4), var2, var3, var4);
            }

            assert !(var11 instanceof NonBlockingIdentityHashMap.Prime);
            if (var4 != NO_MATCH_OLD
               && var11 != var4
               && (var4 != MATCH_ANY || var11 == TOMBSTONE || var11 == null)
               && (var11 != null || var4 != TOMBSTONE)
               && (var4 == null || !var4.equals(var11))) {
               return var11 == null ? TOMBSTONE : var11;
            }

            if (CAS_val(var1, var8, var11, var3)) {
               if (var4 != null) {
                  if ((var11 == null || var11 == TOMBSTONE) && var3 != TOMBSTONE) {
                     var7._size.add(1L);
                  }

                  if (var11 != null && var11 != TOMBSTONE && var3 == TOMBSTONE) {
                     var7._size.add(-1L);
                  }
               }

               return var11 == null && var4 != null ? TOMBSTONE : var11;
            }

            var11 = val(var1, var8);
            if (var11 instanceof NonBlockingIdentityHashMap.Prime) {
               return putIfMatch0(var0, var7.copy_slot_and_check(var0, var1, var8, var4), var2, var3, var4);
            }

            int var17 = NonBlockingHashMap.DUMMY_VOLATILE;
         }

         return var11;
      }
   }

   private final Object[] help_copy(Object[] var1) {
      Object[] var2 = this._kvs;
      NonBlockingIdentityHashMap.CHM var3 = chm(var2);
      if (var3._newkvs == null) {
         return var1;
      }

      var3.help_copy_impl(this, var2, false);
      return var1;
   }

   public Enumeration<TypeV> elements() {
      return new NonBlockingIdentityHashMap.SnapshotV();
   }

   @Override
   public Collection<TypeV> values() {
      return new AbstractCollection<TypeV>() {
         @Override
         public void clear() {
            NonBlockingIdentityHashMap.this.clear();
         }

         @Override
         public int size() {
            return NonBlockingIdentityHashMap.this.size();
         }

         @Override
         public boolean contains(Object var1) {
            return NonBlockingIdentityHashMap.this.containsValue(var1);
         }

         @Override
         public Iterator<TypeV> iterator() {
            return NonBlockingIdentityHashMap.this.new SnapshotV();
         }
      };
   }

   public Enumeration<TypeK> keys() {
      return new NonBlockingIdentityHashMap.SnapshotK();
   }

   @Override
   public Set<TypeK> keySet() {
      return new AbstractSet<TypeK>() {
         @Override
         public void clear() {
            NonBlockingIdentityHashMap.this.clear();
         }

         @Override
         public int size() {
            return NonBlockingIdentityHashMap.this.size();
         }

         @Override
         public boolean contains(Object var1) {
            return NonBlockingIdentityHashMap.this.containsKey(var1);
         }

         @Override
         public boolean remove(Object var1) {
            return NonBlockingIdentityHashMap.this.remove(var1) != null;
         }

         @Override
         public Iterator<TypeK> iterator() {
            return NonBlockingIdentityHashMap.this.new SnapshotK();
         }
      };
   }

   @Override
   public Set<Entry<TypeK, TypeV>> entrySet() {
      return new AbstractSet<Entry<TypeK, TypeV>>() {
         @Override
         public void clear() {
            NonBlockingIdentityHashMap.this.clear();
         }

         @Override
         public int size() {
            return NonBlockingIdentityHashMap.this.size();
         }

         @Override
         public boolean remove(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            return NonBlockingIdentityHashMap.this.remove(var2.getKey(), var2.getValue());
         }

         @Override
         public boolean contains(Object var1) {
            if (!(var1 instanceof Entry)) {
               return false;
            }

            Entry var2 = (Entry)var1;
            Object var3 = NonBlockingIdentityHashMap.this.get(var2.getKey());
            return var3 != null && var3.equals(var2.getValue());
         }

         @Override
         public Iterator<Entry<TypeK, TypeV>> iterator() {
            return NonBlockingIdentityHashMap.this.new SnapshotE();
         }
      };
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();

      for (Object var3 : this.keySet()) {
         Object var4 = this.get(var3);
         var1.writeObject(var3);
         var1.writeObject(var4);
      }

      var1.writeObject(null);
      var1.writeObject(null);
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.initialize(8);

      while (true) {
         Object var2 = var1.readObject();
         Object var3 = var1.readObject();
         if (var2 == null) {
            return;
         }

         this.put((TypeK)var2, (TypeV)var3);
      }
   }

   private static final class CHM<TypeK, TypeV> {
      private final ConcurrentAutoTable _size;
      private final ConcurrentAutoTable _slots;
      volatile Object[] _newkvs;
      private static final AtomicReferenceFieldUpdater<NonBlockingIdentityHashMap.CHM, Object[]> _newkvsUpdater = AtomicReferenceFieldUpdater.newUpdater(
         NonBlockingIdentityHashMap.CHM.class, Object[].class, "_newkvs"
      );
      volatile long _resizers;
      private static final AtomicLongFieldUpdater<NonBlockingIdentityHashMap.CHM> _resizerUpdater = AtomicLongFieldUpdater.newUpdater(
         NonBlockingIdentityHashMap.CHM.class, "_resizers"
      );
      volatile long _copyIdx = 0L;
      private static final AtomicLongFieldUpdater<NonBlockingIdentityHashMap.CHM> _copyIdxUpdater = AtomicLongFieldUpdater.newUpdater(
         NonBlockingIdentityHashMap.CHM.class, "_copyIdx"
      );
      volatile long _copyDone = 0L;
      private static final AtomicLongFieldUpdater<NonBlockingIdentityHashMap.CHM> _copyDoneUpdater = AtomicLongFieldUpdater.newUpdater(
         NonBlockingIdentityHashMap.CHM.class, "_copyDone"
      );

      public int size() {
         return (int)this._size.get();
      }

      public int slots() {
         return (int)this._slots.get();
      }

      boolean CAS_newkvs(Object[] var1) {
         while (this._newkvs == null) {
            if (_newkvsUpdater.compareAndSet(this, null, var1)) {
               return true;
            }
         }

         return false;
      }

      CHM(ConcurrentAutoTable var1) {
         this._size = var1;
         this._slots = new ConcurrentAutoTable();
      }

      private final boolean tableFull(int var1, int var2) {
         return var1 >= 10 && this._slots.estimate_get() >= NonBlockingIdentityHashMap.reprobe_limit(var2);
      }

      private final Object[] resize(NonBlockingIdentityHashMap var1, Object[] var2) {
         assert NonBlockingIdentityHashMap.chm(var2) == this;
         Object[] var3 = this._newkvs;
         if (var3 != null) {
            return var3;
         }

         int var4 = NonBlockingIdentityHashMap.len(var2);
         int var5 = this.size();
         int var6 = var5;
         if (var5 >= var4 >> 2) {
            var6 = var4 << 1;
            if (var5 >= var4 >> 1) {
               var6 = var4 << 2;
            }
         }

         long var7 = System.currentTimeMillis();
         long var9 = 0L;
         if (var6 <= var4 && var7 <= var1._last_resize_milli + 10000L && this._slots.estimate_get() >= var5 << 1) {
            var6 = var4 << 1;
         }

         if (var6 < var4) {
            var6 = var4;
         }

         int var11 = 3;

         while (1 << var11 < var6) {
            var11++;
         }

         long var12 = this._resizers;

         while (!_resizerUpdater.compareAndSet(this, var12, var12 + 1L)) {
            var12 = this._resizers;
         }

         int var14 = (1 << var11 << 1) + 4 << 3 >> 20;
         if (var12 >= 2L && var14 > 0) {
            var3 = this._newkvs;
            if (var3 != null) {
               return var3;
            }

            try {
               Thread.sleep(8L * var14);
            } catch (Exception var16) {
            }
         }

         var3 = this._newkvs;
         if (var3 != null) {
            return var3;
         }

         var3 = new Object[(1 << var11 << 1) + 2];
         var3[0] = new NonBlockingIdentityHashMap.CHM(this._size);
         var3[1] = new int[1 << var11];
         if (this._newkvs != null) {
            return this._newkvs;
         }

         if (this.CAS_newkvs(var3)) {
            var1.rehash();
         } else {
            var3 = this._newkvs;
         }

         return var3;
      }

      private final void help_copy_impl(NonBlockingIdentityHashMap var1, Object[] var2, boolean var3) {
         assert NonBlockingIdentityHashMap.chm(var2) == this;
         Object[] var4 = this._newkvs;
         assert var4 != null;
         int var5 = NonBlockingIdentityHashMap.len(var2);
         int var6 = Math.min(var5, 1024);
         int var7 = -1;
         int var8 = -9999;

         while (this._copyDone < var5) {
            if (var7 == -1) {
               var8 = (int)this._copyIdx;

               while (var8 < var5 << 1 && !_copyIdxUpdater.compareAndSet(this, var8, var8 + var6)) {
                  var8 = (int)this._copyIdx;
               }

               if (var8 >= var5 << 1) {
                  var7 = var8;
               }
            }

            int var9 = 0;

            for (int var10 = 0; var10 < var6; var10++) {
               if (this.copy_slot(var1, var8 + var10 & var5 - 1, var2, var4)) {
                  var9++;
               }
            }

            if (var9 > 0) {
               this.copy_check_and_promote(var1, var2, var9);
            }

            var8 += var6;
            if (!var3 && var7 == -1) {
               return;
            }
         }

         this.copy_check_and_promote(var1, var2, 0);
      }

      private final Object[] copy_slot_and_check(NonBlockingIdentityHashMap var1, Object[] var2, int var3, Object var4) {
         assert NonBlockingIdentityHashMap.chm(var2) == this;
         Object[] var5 = this._newkvs;
         assert var5 != null;
         if (this.copy_slot(var1, var3, var2, this._newkvs)) {
            this.copy_check_and_promote(var1, var2, 1);
         }

         return var4 == null ? var5 : var1.help_copy(var5);
      }

      private final void copy_check_and_promote(NonBlockingIdentityHashMap var1, Object[] var2, int var3) {
         assert NonBlockingIdentityHashMap.chm(var2) == this;
         int var4 = NonBlockingIdentityHashMap.len(var2);
         long var5 = this._copyDone;
         assert var5 + var3 <= var4;
         if (var3 > 0) {
            while (!_copyDoneUpdater.compareAndSet(this, var5, var5 + var3)) {
               var5 = this._copyDone;
               assert var5 + var3 <= var4;
            }
         }

         if (var5 + var3 == var4 && var1._kvs == var2 && var1.CAS_kvs(var2, this._newkvs)) {
            var1._last_resize_milli = System.currentTimeMillis();
         }
      }

      private boolean copy_slot(NonBlockingIdentityHashMap var1, int var2, Object[] var3, Object[] var4) {
         Object var5;
         while ((var5 = NonBlockingIdentityHashMap.key(var3, var2)) == null) {
            NonBlockingIdentityHashMap.CAS_key(var3, var2, null, NonBlockingIdentityHashMap.TOMBSTONE);
         }

         Object var6;
         for (var6 = NonBlockingIdentityHashMap.val(var3, var2);
            !(var6 instanceof NonBlockingIdentityHashMap.Prime);
            var6 = NonBlockingIdentityHashMap.val(var3, var2)
         ) {
            NonBlockingIdentityHashMap.Prime var7 = var6 != null && var6 != NonBlockingIdentityHashMap.TOMBSTONE
               ? new NonBlockingIdentityHashMap.Prime(var6)
               : NonBlockingIdentityHashMap.TOMBPRIME;
            if (NonBlockingIdentityHashMap.CAS_val(var3, var2, var6, var7)) {
               if (var7 == NonBlockingIdentityHashMap.TOMBPRIME) {
                  return true;
               }

               var6 = var7;
               break;
            }
         }

         if (var6 == NonBlockingIdentityHashMap.TOMBPRIME) {
            return false;
         }

         Object var8 = ((NonBlockingIdentityHashMap.Prime)var6)._V;
         assert var8 != NonBlockingIdentityHashMap.TOMBSTONE;
         NonBlockingIdentityHashMap.putIfMatch0(var1, var4, var5, var8, null);

         while (var6 != NonBlockingIdentityHashMap.TOMBPRIME && !NonBlockingIdentityHashMap.CAS_val(var3, var2, var6, NonBlockingIdentityHashMap.TOMBPRIME)) {
            var6 = NonBlockingIdentityHashMap.val(var3, var2);
         }

         return var6 != NonBlockingIdentityHashMap.TOMBPRIME;
      }
   }

   private class NBHMEntry extends AbstractEntry<TypeK, TypeV> {
      NBHMEntry(TypeK var2, TypeV var3) {
         super((TypeK)var2, (TypeV)var3);
      }

      @Override
      public TypeV setValue(TypeV var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this._val = (TypeV)var1;
         return NonBlockingIdentityHashMap.this.put(this._key, (TypeV)var1);
      }
   }

   private static final class Prime {
      final Object _V;

      Prime(Object var1) {
         this._V = var1;
      }

      static Object unbox(Object var0) {
         return var0 instanceof NonBlockingIdentityHashMap.Prime ? ((NonBlockingIdentityHashMap.Prime)var0)._V : var0;
      }
   }

   private class SnapshotE implements Iterator<Entry<TypeK, TypeV>> {
      final NonBlockingIdentityHashMap<TypeK, TypeV>.SnapshotV _ss = NonBlockingIdentityHashMap.this.new SnapshotV();

      public SnapshotE() {
      }

      @Override
      public void remove() {
         this._ss.removeKey();
      }

      public Entry<TypeK, TypeV> next() {
         this._ss.next();
         return NonBlockingIdentityHashMap.this.new NBHMEntry(this._ss._prevK, this._ss._prevV);
      }

      @Override
      public boolean hasNext() {
         return this._ss.hasNext();
      }
   }

   private class SnapshotK implements Enumeration<TypeK>, Iterator<TypeK> {
      final NonBlockingIdentityHashMap<TypeK, TypeV>.SnapshotV _ss = NonBlockingIdentityHashMap.this.new SnapshotV();

      public SnapshotK() {
      }

      @Override
      public void remove() {
         this._ss.removeKey();
      }

      @Override
      public TypeK next() {
         this._ss.next();
         return (TypeK)this._ss._prevK;
      }

      @Override
      public boolean hasNext() {
         return this._ss.hasNext();
      }

      @Override
      public TypeK nextElement() {
         return (TypeK)this.next();
      }

      @Override
      public boolean hasMoreElements() {
         return this.hasNext();
      }
   }

   private class SnapshotV implements Enumeration<TypeV>, Iterator<TypeV> {
      final Object[] _sskvs;
      private int _idx;
      private Object _nextK;
      private Object _prevK;
      private Object _nextV;
      private Object _prevV;

      public SnapshotV() {
         while (true) {
            Object[] var2 = NonBlockingIdentityHashMap.this._kvs;
            NonBlockingIdentityHashMap.CHM var3 = NonBlockingIdentityHashMap.chm(var2);
            if (var3._newkvs == null) {
               this._sskvs = var2;
               this.next();
               return;
            }

            var3.help_copy_impl(NonBlockingIdentityHashMap.this, var2, true);
         }
      }

      int length() {
         return NonBlockingIdentityHashMap.len(this._sskvs);
      }

      Object key(int var1) {
         return NonBlockingIdentityHashMap.key(this._sskvs, var1);
      }

      @Override
      public boolean hasNext() {
         return this._nextV != null;
      }

      @Override
      public TypeV next() {
         if (this._idx != 0 && this._nextV == null) {
            throw new NoSuchElementException();
         }

         this._prevK = this._nextK;
         this._prevV = this._nextV;
         this._nextV = null;

         while (this._idx < this.length()) {
            this._nextK = this.key(this._idx++);
            if (this._nextK != null
               && this._nextK != NonBlockingIdentityHashMap.TOMBSTONE
               && (this._nextV = NonBlockingIdentityHashMap.this.get(this._nextK)) != null) {
               break;
            }
         }

         return (TypeV)this._prevV;
      }

      public void removeKey() {
         if (this._prevV == null) {
            throw new IllegalStateException();
         }

         NonBlockingIdentityHashMap.this.putIfMatch(this._prevK, NonBlockingIdentityHashMap.TOMBSTONE, NonBlockingIdentityHashMap.NO_MATCH_OLD);
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
