package org.yaml.snakeyaml.internal;

public class Logger {
   private final java.util.logging.Logger logger;

   private Logger(String var1) {
      this.logger = java.util.logging.Logger.getLogger(var1);
   }

   public static Logger getLogger(String var0) {
      return new Logger(var0);
   }

   public boolean isLoggable(Logger.Level var1) {
      return this.logger.isLoggable(var1.level);
   }

   public void warn(String var1) {
      this.logger.log(Logger.Level.WARNING.level, var1);
   }

   public enum Level {
      WARNING(java.util.logging.Level.FINE);

      private final java.util.logging.Level level;

      Level(java.util.logging.Level var3) {
         this.level = var3;
      }
   }
}
