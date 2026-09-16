package org.apache.commons.logging;

import java.security.PrivilegedAction;

class LogFactory$2 implements PrivilegedAction {
   private final String val$factoryClass;
   private final ClassLoader val$classLoader;

   LogFactory$2(String var1, ClassLoader var2) {
      this.val$factoryClass = var1;
      this.val$classLoader = var2;
   }

   public Object run() {
      return LogFactory.createFactory(this.val$factoryClass, this.val$classLoader);
   }
}
