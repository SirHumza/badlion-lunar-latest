package com.github.benmanes.caffeine.cache;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

enum DisabledScheduler implements Scheduler {
   INSTANCE;

   @Override
   public Future<Void> schedule(Executor var1, Runnable var2, long var3, TimeUnit var5) {
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      Objects.requireNonNull(var5);
      return DisabledFuture.INSTANCE;
   }
}
