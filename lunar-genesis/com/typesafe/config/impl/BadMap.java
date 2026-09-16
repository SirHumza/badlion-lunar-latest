package com.typesafe.config.impl;

final class BadMap<K, V> {
   private final int size;
   private final BadMap.Entry[] entries;
   private static final BadMap.Entry[] emptyEntries = new BadMap.Entry[0];
   private static final int[] primes = new int[]{
      2,
      5,
      11,
      17,
      23,
      29,
      31,
      37,
      41,
      43,
      47,
      53,
      59,
      61,
      67,
      71,
      73,
      79,
      83,
      89,
      97,
      101,
      103,
      107,
      109,
      113,
      127,
      131,
      137,
      139,
      149,
      151,
      157,
      163,
      167,
      173,
      179,
      181,
      191,
      193,
      197,
      199,
      211,
      223,
      227,
      229,
      233,
      239,
      241,
      251,
      257,
      263,
      269,
      271,
      277,
      281,
      283,
      293,
      307,
      311,
      313,
      317,
      331,
      337,
      347,
      349,
      353,
      359,
      367,
      373,
      379,
      383,
      389,
      397,
      401,
      409,
      419,
      421,
      431,
      433,
      439,
      443,
      449,
      457,
      461,
      463,
      467,
      479,
      487,
      491,
      499,
      503,
      509,
      521,
      523,
      541,
      547,
      557,
      563,
      569,
      571,
      577,
      587,
      593,
      599,
      601,
      607,
      613,
      617,
      619,
      631,
      641,
      643,
      647,
      653,
      659,
      661,
      673,
      677,
      683,
      691,
      701,
      709,
      719,
      727,
      733,
      739,
      743,
      751,
      757,
      761,
      769,
      773,
      787,
      797,
      809,
      811,
      821,
      823,
      827,
      829,
      839,
      853,
      857,
      859,
      863,
      877,
      881,
      883,
      887,
      907,
      911,
      919,
      929,
      937,
      941,
      947,
      953,
      967,
      971,
      977,
      983,
      991,
      997,
      1009,
      2053,
      3079,
      4057,
      7103,
      10949,
      16069,
      32609,
      65867,
      104729
   };

   BadMap() {
      this(0, emptyEntries);
   }

   private BadMap(int var1, BadMap.Entry[] var2) {
      this.size = var1;
      this.entries = var2;
   }

   BadMap<K, V> copyingPut(K var1, V var2) {
      int var3 = this.size + 1;
      BadMap.Entry[] var4;
      if (var3 > this.entries.length) {
         var4 = new BadMap.Entry[nextPrime(var3 * 2 - 1)];
      } else {
         var4 = new BadMap.Entry[this.entries.length];
      }

      if (var4.length == this.entries.length) {
         System.arraycopy(this.entries, 0, var4, 0, this.entries.length);
      } else {
         rehash(this.entries, var4);
      }

      int var5 = Math.abs(var1.hashCode());
      store(var4, var5, var1, var2);
      return new BadMap<>(var3, var4);
   }

   private static <K, V> void store(BadMap.Entry[] var0, int var1, K var2, V var3) {
      int var4 = var1 % var0.length;
      BadMap.Entry var5 = var0[var4];
      var0[var4] = new BadMap.Entry(var1, var2, var3, var5);
   }

   private static void store(BadMap.Entry[] var0, BadMap.Entry var1) {
      int var2 = var1.hash % var0.length;
      BadMap.Entry var3 = var0[var2];
      if (var3 == null && var1.next == null) {
         var0[var2] = var1;
      } else {
         var0[var2] = new BadMap.Entry(var1.hash, var1.key, var1.value, var3);
      }
   }

   private static void rehash(BadMap.Entry[] var0, BadMap.Entry[] var1) {
      BadMap.Entry[] var2 = var0;
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         for (BadMap.Entry var5 = var2[var4]; var5 != null; var5 = var5.next) {
            store(var1, var5);
         }
      }
   }

   V get(K var1) {
      if (this.entries.length == 0) {
         return null;
      }

      int var2 = Math.abs(var1.hashCode());
      int var3 = var2 % this.entries.length;
      BadMap.Entry var4 = this.entries[var3];
      return (V)(var4 == null ? null : var4.find(var1));
   }

   private static int nextPrime(int var0) {
      for (int var4 : primes) {
         if (var4 > var0) {
            return var4;
         }
      }

      return primes[primes.length - 1];
   }

   static final class Entry {
      final int hash;
      final Object key;
      final Object value;
      final BadMap.Entry next;

      Entry(int var1, Object var2, Object var3, BadMap.Entry var4) {
         this.hash = var1;
         this.key = var2;
         this.value = var3;
         this.next = var4;
      }

      Object find(Object var1) {
         if (this.key.equals(var1)) {
            return this.value;
         } else {
            return this.next != null ? this.next.find(var1) : null;
         }
      }
   }
}
