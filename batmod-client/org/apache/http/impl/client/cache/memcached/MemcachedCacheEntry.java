package org.apache.http.impl.client.cache.memcached;

import org.apache.http.client.cache.HttpCacheEntry;

public interface MemcachedCacheEntry {
   byte[] toByteArray();

   String getStorageKey();

   HttpCacheEntry getHttpCacheEntry();

   void set(byte[] var1);
}
