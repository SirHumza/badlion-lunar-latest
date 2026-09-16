package org.spongepowered.asm.logging;

public abstract class LoggerAdapterAbstract implements ILogger {
   private final String id;

   protected LoggerAdapterAbstract(String var1) {
      this.id = var1;
   }

   @Override
   public String getId() {
      return this.id;
   }

   @Override
   public void catching(Throwable var1) {
      this.catching(Level.WARN, var1);
   }

   @Override
   public void debug(String var1, Object... var2) {
      this.log(Level.DEBUG, var1, var2);
   }

   @Override
   public void debug(String var1, Throwable var2) {
      this.log(Level.DEBUG, var1, var2);
   }

   @Override
   public void error(String var1, Object... var2) {
      this.log(Level.ERROR, var1, var2);
   }

   @Override
   public void error(String var1, Throwable var2) {
      this.log(Level.ERROR, var1, var2);
   }

   @Override
   public void fatal(String var1, Object... var2) {
      this.log(Level.FATAL, var1, var2);
   }

   @Override
   public void fatal(String var1, Throwable var2) {
      this.log(Level.FATAL, var1, var2);
   }

   @Override
   public void info(String var1, Object... var2) {
      this.log(Level.INFO, var1, var2);
   }

   @Override
   public void info(String var1, Throwable var2) {
      this.log(Level.INFO, var1, var2);
   }

   @Override
   public void trace(String var1, Object... var2) {
      this.log(Level.TRACE, var1, var2);
   }

   @Override
   public void trace(String var1, Throwable var2) {
      this.log(Level.TRACE, var1, var2);
   }

   @Override
   public void warn(String var1, Object... var2) {
      this.log(Level.WARN, var1, var2);
   }

   @Override
   public void warn(String var1, Throwable var2) {
      this.log(Level.WARN, var1, var2);
   }

   public static class FormattedMessage {
      private String message;
      private Throwable t;

      public FormattedMessage(String var1, Object... var2) {
         if (var2.length == 0) {
            this.message = var1;
         } else {
            StringBuilder var3 = new StringBuilder();
            int var4 = 0;

            int var5;
            for (var5 = 0; var4 < var1.length() && var5 < var2.length; var5++) {
               int var6 = var1.indexOf("{}", var4);
               if (var6 < 0) {
                  break;
               }

               var3.append(var1.substring(var4, var6)).append(var2[var5]);
               var4 = var6 + 2;
            }

            if (var4 < var1.length()) {
               var3.append(var1.substring(var4));
            }

            if (var5 < var2.length && var2[var2.length - 1] instanceof Throwable) {
               this.t = (Throwable)var2[var2.length - 1];
            }

            this.message = var3.toString();
         }
      }

      @Override
      public String toString() {
         return this.message;
      }

      public String getMessage() {
         return this.message;
      }

      public boolean hasThrowable() {
         return this.t != null;
      }

      public Throwable getThrowable() {
         return this.t;
      }
   }
}
