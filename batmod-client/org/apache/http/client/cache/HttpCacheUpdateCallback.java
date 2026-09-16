package org.apache.http.client.cache;

import java.io.IOException;

public interface HttpCacheUpdateCallback {
   HttpCacheEntry update(HttpCacheEntry var1) throws IOException;
}
