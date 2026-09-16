package org.apache.commons.logging.impl;

import java.security.PrivilegedAction;

class LogFactoryImpl$2 implements PrivilegedAction {
   private final String val$key;
   private final String val$def;

   LogFactoryImpl$2(String var1, String var2) {
      this.val$key = var1;
      this.val$def = var2;
   }

   public Object run() {
      return System.getProperty(this.val$key, this.val$def);
   }
}
