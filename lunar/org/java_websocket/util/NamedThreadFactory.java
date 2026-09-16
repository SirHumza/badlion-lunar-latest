package org.java_websocket.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory {
   private final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
   private final AtomicInteger threadNumber = new AtomicInteger(1);
   private final String threadPrefix;

   public NamedThreadFactory(String var1) {
      this.threadPrefix = var1;
   }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var2 = this.defaultThreadFactory.newThread(var1);
      var2.setName(this.threadPrefix + "-" + this.threadNumber);
      return var2;
   }
}
