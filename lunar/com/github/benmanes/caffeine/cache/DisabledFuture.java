package com.github.benmanes.caffeine.cache;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

enum DisabledFuture implements Future<Void> {
   INSTANCE;

   @Override
   public boolean isDone() {
      return true;
   }

   @Override
   public boolean isCancelled() {
      return false;
   }

   @Override
   public boolean cancel(boolean var1) {
      return false;
   }

   public Void get(long var1, TimeUnit var3) {
      return null;
   }

   public Void get() {
      return null;
   }
}
