package org.spongepowered.asm.service.modlauncher;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.logging.LoggerAdapterAbstract;

public class LoggerAdapterLog4j2 extends LoggerAdapterAbstract {
   private static final Level[] LEVELS = new Level[]{Level.FATAL, Level.ERROR, Level.WARN, Level.INFO, Level.DEBUG, Level.TRACE};
   private final Logger logger;

   public LoggerAdapterLog4j2(String var1) {
      super(var1);
      this.logger = LogManager.getLogger(var1);
   }

   @Override
   public String getType() {
      return "Log4j2 (via ModLauncher)";
   }

   @Override
   public void catching(org.spongepowered.asm.logging.Level var1, Throwable var2) {
      this.logger.catching(LEVELS[var1.ordinal()], var2);
   }

   @Override
   public void catching(Throwable var1) {
      this.logger.catching(var1);
   }

   @Override
   public void debug(String var1, Object... var2) {
      this.logger.debug(var1, var2);
   }

   @Override
   public void debug(String var1, Throwable var2) {
      this.logger.debug(var1, var2);
   }

   @Override
   public void error(String var1, Object... var2) {
      this.logger.error(var1, var2);
   }

   @Override
   public void error(String var1, Throwable var2) {
      this.logger.error(var1, var2);
   }

   @Override
   public void fatal(String var1, Object... var2) {
      this.logger.fatal(var1, var2);
   }

   @Override
   public void fatal(String var1, Throwable var2) {
      this.logger.fatal(var1, var2);
   }

   @Override
   public void info(String var1, Object... var2) {
      this.logger.info(var1, var2);
   }

   @Override
   public void info(String var1, Throwable var2) {
      this.logger.info(var1, var2);
   }

   @Override
   public void log(org.spongepowered.asm.logging.Level var1, String var2, Object... var3) {
      this.logger.log(LEVELS[var1.ordinal()], var2, var3);
   }

   @Override
   public void log(org.spongepowered.asm.logging.Level var1, String var2, Throwable var3) {
      this.logger.log(LEVELS[var1.ordinal()], var2, var3);
   }

   @Override
   public <T extends Throwable> T throwing(T var1) {
      return (T)this.logger.throwing(var1);
   }

   @Override
   public void trace(String var1, Object... var2) {
      this.logger.trace(var1, var2);
   }

   @Override
   public void trace(String var1, Throwable var2) {
      this.logger.trace(var1, var2);
   }

   @Override
   public void warn(String var1, Object... var2) {
      this.logger.warn(var1, var2);
   }

   @Override
   public void warn(String var1, Throwable var2) {
      this.logger.warn(var1, var2);
   }
}
