package com.github.benmanes.caffeine.cache;

final class SSLR<K, V> extends SSL<K, V> {
   final Ticker ticker;
   volatile long refreshAfterWriteNanos;
   final MpscGrowableArrayQueue<Runnable> writeBuffer;

   SSLR(Caffeine<K, V> builder, CacheLoader<? super K, V> cacheLoader, boolean async) {
      super(builder, cacheLoader, async);
      this.ticker = builder.getTicker();
      this.refreshAfterWriteNanos = builder.getRefreshAfterWriteNanos();
      this.writeBuffer = new MpscGrowableArrayQueue<>(4, WRITE_BUFFER_MAX);
   }

   @Override
   public Ticker expirationTicker() {
      return this.ticker;
   }

   @Override
   protected boolean refreshAfterWrite() {
      return true;
   }

   @Override
   protected long refreshAfterWriteNanos() {
      return this.refreshAfterWriteNanos;
   }

   @Override
   protected void setRefreshAfterWriteNanos(long refreshAfterWriteNanos) {
      this.refreshAfterWriteNanos = refreshAfterWriteNanos;
   }

   @Override
   protected MpscGrowableArrayQueue<Runnable> writeBuffer() {
      return this.writeBuffer;
   }

   @Override
   protected boolean buffersWrites() {
      return true;
   }
}
