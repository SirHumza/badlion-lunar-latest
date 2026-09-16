package com.github.benmanes.caffeine.cache;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

enum SystemScheduler implements Scheduler {
   INSTANCE;

   @Override
   public Future<?> schedule(Executor var1, Runnable var2, long var3, TimeUnit var5) {
      Executor var6 = CompletableFuture.delayedExecutor(var3, var5, var1);
      return CompletableFuture.runAsync(var2, var6);
   }
}
