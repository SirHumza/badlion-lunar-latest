package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class Log4JLogger implements Serializable, Log {
   private static final String FQCN = (Log4JLogger.class$org$apache$commons$logging$impl$Log4JLogger == null
         ? (Log4JLogger.class$org$apache$commons$logging$impl$Log4JLogger = class$("org.apache.commons.logging.impl.Log4JLogger"))
         : Log4JLogger.class$org$apache$commons$logging$impl$Log4JLogger)
      .getName();
   private transient Logger logger = null;
   private String name = null;
   private static Priority traceLevel;
   static Class class$org$apache$commons$logging$impl$Log4JLogger;
   static Class class$org$apache$log4j$Level;
   static Class class$org$apache$log4j$Priority;

   public Log4JLogger() {
   }

   public Log4JLogger(String var1) {
      this.name = var1;
      this.logger = this.getLogger();
   }

   public Log4JLogger(Logger var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
      }

      this.name = var1.getName();
      this.logger = var1;
   }

   public void trace(Object var1) {
      this.getLogger().log(FQCN, traceLevel, var1, null);
   }

   public void trace(Object var1, Throwable var2) {
      this.getLogger().log(FQCN, traceLevel, var1, var2);
   }

   public void debug(Object var1) {
      this.getLogger().log(FQCN, Priority.DEBUG, var1, null);
   }

   public void debug(Object var1, Throwable var2) {
      this.getLogger().log(FQCN, Priority.DEBUG, var1, var2);
   }

   public void info(Object var1) {
      this.getLogger().log(FQCN, Priority.INFO, var1, null);
   }

   public void info(Object var1, Throwable var2) {
      this.getLogger().log(FQCN, Priority.INFO, var1, var2);
   }

   public void warn(Object var1) {
      this.getLogger().log(FQCN, Priority.WARN, var1, null);
   }

   public void warn(Object var1, Throwable var2) {
      this.getLogger().log(FQCN, Priority.WARN, var1, var2);
   }

   public void error(Object var1) {
      this.getLogger().log(FQCN, Priority.ERROR, var1, null);
   }

   public void error(Object var1, Throwable var2) {
      this.getLogger().log(FQCN, Priority.ERROR, var1, var2);
   }

   public void fatal(Object var1) {
      this.getLogger().log(FQCN, Priority.FATAL, var1, null);
   }

   public void fatal(Object var1, Throwable var2) {
      this.getLogger().log(FQCN, Priority.FATAL, var1, var2);
   }

   public Logger getLogger() {
      if (this.logger == null) {
         this.logger = Logger.getLogger(this.name);
      }

      return this.logger;
   }

   public boolean isDebugEnabled() {
      return this.getLogger().isDebugEnabled();
   }

   public boolean isErrorEnabled() {
      return this.getLogger().isEnabledFor(Priority.ERROR);
   }

   public boolean isFatalEnabled() {
      return this.getLogger().isEnabledFor(Priority.FATAL);
   }

   public boolean isInfoEnabled() {
      return this.getLogger().isInfoEnabled();
   }

   public boolean isTraceEnabled() {
      return this.getLogger().isEnabledFor(traceLevel);
   }

   public boolean isWarnEnabled() {
      return this.getLogger().isEnabledFor(Priority.WARN);
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static {
      if (!(class$org$apache$log4j$Priority == null ? (class$org$apache$log4j$Priority = class$("org.apache.log4j.Priority")) : class$org$apache$log4j$Priority)
         .isAssignableFrom(
            class$org$apache$log4j$Level == null ? (class$org$apache$log4j$Level = class$("org.apache.log4j.Level")) : class$org$apache$log4j$Level
         )) {
         throw new InstantiationError("Log4J 1.2 not available");
      }

      try {
         traceLevel = (Priority)(class$org$apache$log4j$Level == null
               ? (class$org$apache$log4j$Level = class$("org.apache.log4j.Level"))
               : class$org$apache$log4j$Level)
            .getDeclaredField("TRACE")
            .get(null);
      } catch (Exception var1) {
         traceLevel = Priority.DEBUG;
      }
   }
}
