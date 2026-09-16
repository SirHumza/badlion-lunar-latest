package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K> implements Serializable {
   private final ConcurrentHashMap<K, Long> IOCCIRROCORHCICIHCOCOCCHCRHCHI;
   private transient @Nullable Map<K, Long> asMap;

   private IHHCHHHCRIHOOCOIOOCRIIICIOROIR(ConcurrentHashMap<K, Long> var1) {
      this.IOCCIRROCORHCICIHCOCOCCHCRHCHI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   public static <K> IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K> HCICCCHIIIRCIRHIOOROCORHIHHCHR() {
      return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR<>(new ConcurrentHashMap<>());
   }

   public static <K> IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K> IHIIIRHOOCHRCCCCIORIROCOIRRHCC(Map<? extends K, ? extends Long> var0) {
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1 = HCICCCHIIIRCIRHIOOROCORHIHHCHR();
      var1.putAll(var0);
      return var1;
   }

   public long get(K var1) {
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.getOrDefault(var1, 0L);
   }

   @CanIgnoreReturnValue
   public long incrementAndGet(K var1) {
      return this.addAndGet((K)var1, 1L);
   }

   @CanIgnoreReturnValue
   public long decrementAndGet(K var1) {
      return this.addAndGet((K)var1, -1L);
   }

   @CanIgnoreReturnValue
   public long addAndGet(K var1, long var2) {
      return this.accumulateAndGet((K)var1, var2, Long::sum);
   }

   @CanIgnoreReturnValue
   public long getAndIncrement(K var1) {
      return this.getAndAdd((K)var1, 1L);
   }

   @CanIgnoreReturnValue
   public long getAndDecrement(K var1) {
      return this.getAndAdd((K)var1, -1L);
   }

   @CanIgnoreReturnValue
   public long getAndAdd(K var1, long var2) {
      return this.getAndAccumulate((K)var1, var2, Long::sum);
   }

   @CanIgnoreReturnValue
   public long updateAndGet(K var1, LongUnaryOperator var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.compute((K)var1, (var1x, var2x) -> var2.applyAsLong(var2x == null ? 0L : var2x));
   }

   @CanIgnoreReturnValue
   public long getAndUpdate(K var1, LongUnaryOperator var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      AtomicLong var3 = new AtomicLong();
      this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.compute((K)var1, (var2x, var3x) -> {
         long var4 = var3x == null ? 0L : var3x;
         var3.set(var4);
         return var2.applyAsLong(var4);
      });
      return var3.get();
   }

   @CanIgnoreReturnValue
   public long accumulateAndGet(K var1, long var2, LongBinaryOperator var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var4
      );
      return this.updateAndGet((K)var1, var3 -> var4.applyAsLong(var3, var2));
   }

   @CanIgnoreReturnValue
   public long getAndAccumulate(K var1, long var2, LongBinaryOperator var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var4
      );
      return this.getAndUpdate((K)var1, var3 -> var4.applyAsLong(var3, var2));
   }

   @CanIgnoreReturnValue
   public long put(K var1, long var2) {
      return this.getAndUpdate((K)var1, var2x -> var2);
   }

   public void putAll(Map<? extends K, ? extends Long> var1) {
      var1.forEach(this::put);
   }

   @CanIgnoreReturnValue
   public long remove(K var1) {
      Long var2 = this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.remove(var1);
      return var2 == null ? 0L : var2;
   }

   boolean remove(K var1, long var2) {
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.remove(var1, var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   public boolean removeIfZero(K var1) {
      return this.remove((K)var1, 0L);
   }

   public void removeAllZeros() {
      this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.values().removeIf(var0 -> var0 == 0L);
   }

   public long sum() {
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.values().stream().mapToLong(Long::longValue).sum();
   }

   public Map<K, Long> asMap() {
      Map var1 = this.asMap;
      return var1 == null ? (this.asMap = this.createAsMap()) : var1;
   }

   private Map<K, Long> createAsMap() {
      return Collections.unmodifiableMap(this.IOCCIRROCORHCICIHCOCOCCHCRHCHI);
   }

   public boolean containsKey(Object var1) {
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.containsKey(var1);
   }

   public int size() {
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.size();
   }

   public boolean isEmpty() {
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.isEmpty();
   }

   public void clear() {
      this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.clear();
   }

   @Override
   public String toString() {
      return this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.toString();
   }

   long putIfAbsent(K var1, long var2) {
      AtomicBoolean var4 = new AtomicBoolean(false);
      Long var5 = this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.compute((K)var1, (var3, var4x) -> {
         if (var4x != null && var4x != 0L) {
            return (Long)var4x;
         }

         var4.set(true);
         return var2;
      });
      return var4.get() ? 0L : var5;
   }

   boolean replace(K var1, long var2, long var4) {
      return var2 == 0L ? this.putIfAbsent((K)var1, var4) == 0L : this.IOCCIRROCORHCICIHCOCOCCHCRHCHI.replace((K)var1, var2, var4);
   }
}
