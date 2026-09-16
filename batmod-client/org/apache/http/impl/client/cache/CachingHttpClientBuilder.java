package org.apache.http.impl.client.cache;

import java.io.File;
import org.apache.http.client.cache.HttpCacheInvalidator;
import org.apache.http.client.cache.HttpCacheStorage;
import org.apache.http.client.cache.ResourceFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.execchain.ClientExecChain;

public class CachingHttpClientBuilder extends HttpClientBuilder {
   private ResourceFactory resourceFactory;
   private HttpCacheStorage storage;
   private File cacheDir;
   private CacheConfig cacheConfig;
   private SchedulingStrategy schedulingStrategy;
   private HttpCacheInvalidator httpCacheInvalidator;

   public static CachingHttpClientBuilder create() {
      return new CachingHttpClientBuilder();
   }

   protected CachingHttpClientBuilder() {
   }

   public final CachingHttpClientBuilder setResourceFactory(ResourceFactory resourceFactory) {
      this.resourceFactory = resourceFactory;
      return this;
   }

   public final CachingHttpClientBuilder setHttpCacheStorage(HttpCacheStorage storage) {
      this.storage = storage;
      return this;
   }

   public final CachingHttpClientBuilder setCacheDir(File cacheDir) {
      this.cacheDir = cacheDir;
      return this;
   }

   public final CachingHttpClientBuilder setCacheConfig(CacheConfig cacheConfig) {
      this.cacheConfig = cacheConfig;
      return this;
   }

   public final CachingHttpClientBuilder setSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
      this.schedulingStrategy = schedulingStrategy;
      return this;
   }

   public final CachingHttpClientBuilder setHttpCacheInvalidator(HttpCacheInvalidator cacheInvalidator) {
      this.httpCacheInvalidator = cacheInvalidator;
      return this;
   }

   protected ClientExecChain decorateMainExec(ClientExecChain mainExec) {
      CacheConfig config = this.cacheConfig != null ? this.cacheConfig : CacheConfig.DEFAULT;
      ResourceFactory resourceFactory = this.resourceFactory;
      if (resourceFactory == null) {
         if (this.cacheDir == null) {
            resourceFactory = new HeapResourceFactory();
         } else {
            resourceFactory = new FileResourceFactory(this.cacheDir);
         }
      }

      HttpCacheStorage storage = this.storage;
      if (storage == null) {
         if (this.cacheDir == null) {
            storage = new BasicHttpCacheStorage(config);
         } else {
            ManagedHttpCacheStorage managedStorage = new ManagedHttpCacheStorage(config);
            this.addCloseable(managedStorage);
            storage = managedStorage;
         }
      }

      AsynchronousValidator revalidator = this.createAsynchronousRevalidator(config);
      CacheKeyGenerator uriExtractor = new CacheKeyGenerator();
      HttpCacheInvalidator cacheInvalidator = this.httpCacheInvalidator;
      if (cacheInvalidator == null) {
         cacheInvalidator = new CacheInvalidator(uriExtractor, storage);
      }

      return new CachingExec(mainExec, new BasicHttpCache(resourceFactory, storage, config, uriExtractor, cacheInvalidator), config, revalidator);
   }

   private AsynchronousValidator createAsynchronousRevalidator(CacheConfig config) {
      if (config.getAsynchronousWorkersMax() > 0) {
         SchedulingStrategy configuredSchedulingStrategy = this.createSchedulingStrategy(config);
         AsynchronousValidator revalidator = new AsynchronousValidator(configuredSchedulingStrategy);
         this.addCloseable(revalidator);
         return revalidator;
      } else {
         return null;
      }
   }

   private SchedulingStrategy createSchedulingStrategy(CacheConfig config) {
      return this.schedulingStrategy != null ? this.schedulingStrategy : new ImmediateSchedulingStrategy(config);
   }
}
