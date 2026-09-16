package org.apache.http.impl.client.cache;

import java.io.File;
import org.apache.http.annotation.Immutable;
import org.apache.http.impl.client.CloseableHttpClient;

@Immutable
public class CachingHttpClients {
   private CachingHttpClients() {
   }

   public static CachingHttpClientBuilder custom() {
      return CachingHttpClientBuilder.create();
   }

   public static CloseableHttpClient createMemoryBound() {
      return CachingHttpClientBuilder.create().build();
   }

   public static CloseableHttpClient createFileBound(File cacheDir) {
      return CachingHttpClientBuilder.create().setCacheDir(cacheDir).build();
   }
}
