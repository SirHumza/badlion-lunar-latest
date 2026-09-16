package org.jgrapht.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurrencyUtil {
   public static ThreadPoolExecutor createThreadPoolExecutor(int var0) {
      return (ThreadPoolExecutor)Executors.newFixedThreadPool(var0);
   }

   public static void shutdownExecutionService(ExecutorService var0) {
      shutdownExecutionService(var0, Long.MAX_VALUE, TimeUnit.MILLISECONDS);
   }

   public static void shutdownExecutionService(ExecutorService var0, long var1, TimeUnit var3) {
      var0.shutdown();
      var0.awaitTermination(var1, var3);
   }
}
