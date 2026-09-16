package org.apache.commons.logging;

public class LogConfigurationException extends RuntimeException {
   protected Throwable cause = null;

   public LogConfigurationException() {
   }

   public LogConfigurationException(String var1) {
      super(var1);
   }

   public LogConfigurationException(Throwable var1) {
      this(var1 == null ? null : var1.toString(), var1);
   }

   public LogConfigurationException(String var1, Throwable var2) {
      super(var1 + " (Caused by " + var2 + ")");
      this.cause = var2;
   }

   public Throwable getCause() {
      return this.cause;
   }
}
