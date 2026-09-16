package org.spongepowered.asm.logging;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerAdapterJava extends LoggerAdapterAbstract {
   private static final java.util.logging.Level[] LEVELS = new java.util.logging.Level[]{
      java.util.logging.Level.SEVERE,
      java.util.logging.Level.SEVERE,
      java.util.logging.Level.WARNING,
      java.util.logging.Level.INFO,
      java.util.logging.Level.FINE,
      java.util.logging.Level.FINER
   };
   private final Logger logger;

   public LoggerAdapterJava(String var1) {
      super(var1);
      this.logger = getLogger(var1);
   }

   @Override
   public String getType() {
      return "java.util.logging Log Adapter";
   }

   @Override
   public void catching(Level var1, Throwable var2) {
      this.warn("Catching {}: {}", var2.getClass().getName(), var2.getMessage(), var2);
   }

   @Override
   public void debug(String var1, Object... var2) {
      LoggerAdapterAbstract.FormattedMessage var3 = new LoggerAdapterAbstract.FormattedMessage(var1, var2);
      this.logger.fine(var3.getMessage());
      if (var3.hasThrowable()) {
         this.logger.fine(var3.getThrowable().toString());
      }
   }

   @Override
   public void debug(String var1, Throwable var2) {
      this.logger.fine(var1);
      this.logger.fine(var2.toString());
   }

   @Override
   public void error(String var1, Object... var2) {
      LoggerAdapterAbstract.FormattedMessage var3 = new LoggerAdapterAbstract.FormattedMessage(var1, var2);
      this.logger.severe(var3.getMessage());
      if (var3.hasThrowable()) {
         this.logger.severe(var3.getThrowable().toString());
      }
   }

   @Override
   public void error(String var1, Throwable var2) {
      this.logger.severe(var1);
      this.logger.severe(var2.toString());
   }

   @Override
   public void fatal(String var1, Object... var2) {
      LoggerAdapterAbstract.FormattedMessage var3 = new LoggerAdapterAbstract.FormattedMessage(var1, var2);
      this.logger.severe(var3.getMessage());
      if (var3.hasThrowable()) {
         this.logger.severe(var3.getThrowable().toString());
      }
   }

   @Override
   public void fatal(String var1, Throwable var2) {
      this.logger.severe(var1);
      this.logger.severe(var2.toString());
   }

   @Override
   public void info(String var1, Object... var2) {
      LoggerAdapterAbstract.FormattedMessage var3 = new LoggerAdapterAbstract.FormattedMessage(var1, var2);
      this.logger.info(var3.getMessage());
      if (var3.hasThrowable()) {
         this.logger.info(var3.getThrowable().toString());
      }
   }

   @Override
   public void info(String var1, Throwable var2) {
      this.logger.info(var1);
      this.logger.info(var2.toString());
   }

   @Override
   public void log(Level var1, String var2, Object... var3) {
      java.util.logging.Level var4 = LEVELS[var1.ordinal()];
      LoggerAdapterAbstract.FormattedMessage var5 = new LoggerAdapterAbstract.FormattedMessage(var2, var3);
      this.logger.log(var4, var5.getMessage());
      if (var5.hasThrowable()) {
         this.logger.log(LEVELS[var1.ordinal()], var5.getThrowable().toString());
      }
   }

   @Override
   public void log(Level var1, String var2, Throwable var3) {
      java.util.logging.Level var4 = LEVELS[var1.ordinal()];
      this.logger.log(var4, var2);
      this.logger.log(var4, var3.toString());
   }

   @Override
   public <T extends Throwable> T throwing(T var1) {
      this.warn("Throwing {}: {}", var1.getClass().getName(), var1.getMessage(), var1);
      return (T)var1;
   }

   @Override
   public void trace(String var1, Object... var2) {
      LoggerAdapterAbstract.FormattedMessage var3 = new LoggerAdapterAbstract.FormattedMessage(var1, var2);
      this.logger.finer(var3.getMessage());
      if (var3.hasThrowable()) {
         this.logger.finer(var3.getThrowable().toString());
      }
   }

   @Override
   public void trace(String var1, Throwable var2) {
      this.logger.finer(var1);
      this.logger.finer(var2.toString());
   }

   @Override
   public void warn(String var1, Object... var2) {
      LoggerAdapterAbstract.FormattedMessage var3 = new LoggerAdapterAbstract.FormattedMessage(var1, var2);
      this.logger.warning(var3.getMessage());
      if (var3.hasThrowable()) {
         this.logger.warning(var3.getThrowable().toString());
      }
   }

   @Override
   public void warn(String var1, Throwable var2) {
      this.logger.warning(var1);
      this.logger.warning(var2.toString());
   }

   private static Logger getLogger(String var0) {
      LogManager var1 = LogManager.getLogManager();
      Logger var2 = var1.getLogger(var0);
      return var2 != null ? var2 : LogManager.getLogManager().getLogger("global");
   }
}
