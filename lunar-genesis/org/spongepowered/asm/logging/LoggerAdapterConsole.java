package org.spongepowered.asm.logging;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.spongepowered.include.com.google.common.base.Strings;

public class LoggerAdapterConsole extends LoggerAdapterAbstract {
   private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");
   private PrintStream debug;

   public LoggerAdapterConsole(String var1) {
      super(Strings.nullToEmpty(var1));
   }

   @Override
   public String getType() {
      return "Default Console Logger";
   }

   public LoggerAdapterConsole setDebugStream(PrintStream var1) {
      this.debug = var1;
      return this;
   }

   @Override
   public void catching(Level var1, Throwable var2) {
      this.log(Level.WARN, "Catching {}: {}", var2.getClass().getName(), var2.getMessage(), var2);
   }

   @Override
   public void log(Level var1, String var2, Object... var3) {
      PrintStream var4 = this.getOutputStream(var1);
      if (var4 != null) {
         LoggerAdapterAbstract.FormattedMessage var5 = new LoggerAdapterAbstract.FormattedMessage(var2, var3);
         var4.println(String.format("[%s] [%s/%s] %s", DATE_FORMAT.format(new Date()), this.getId(), var1, var5));
         if (var5.hasThrowable()) {
            var5.getThrowable().printStackTrace(var4);
         }
      }
   }

   @Override
   public void log(Level var1, String var2, Throwable var3) {
      PrintStream var4 = this.getOutputStream(var1);
      if (var4 != null) {
         var4.println(String.format("[%s] [%s/%s] %s", DATE_FORMAT.format(new Date()), this.getId(), var1, var2));
         var3.printStackTrace(var4);
      }
   }

   @Override
   public <T extends Throwable> T throwing(T var1) {
      this.log(Level.WARN, "Throwing {}: {}", var1.getClass().getName(), var1.getMessage(), var1);
      return (T)var1;
   }

   private PrintStream getOutputStream(Level var1) {
      if (var1 == Level.FATAL || var1 == Level.ERROR || var1 == Level.WARN) {
         return System.err;
      } else if (var1 == Level.INFO) {
         return System.out;
      } else {
         return var1 == Level.DEBUG ? this.debug : null;
      }
   }
}
