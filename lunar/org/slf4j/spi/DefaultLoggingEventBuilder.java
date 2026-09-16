package org.slf4j.spi;

import java.util.List;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.DefaultLoggingEvent;
import org.slf4j.event.KeyValuePair;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;

public class DefaultLoggingEventBuilder implements CallerBoundaryAware, LoggingEventBuilder {
   static String DLEB_FQCN = DefaultLoggingEventBuilder.class.getName();
   protected DefaultLoggingEvent loggingEvent;
   protected Logger logger;

   public DefaultLoggingEventBuilder(Logger var1, Level var2) {
      this.logger = var1;
      this.loggingEvent = new DefaultLoggingEvent(var2, var1);
   }

   @Override
   public LoggingEventBuilder addMarker(Marker var1) {
      this.loggingEvent.addMarker(var1);
      return this;
   }

   @Override
   public LoggingEventBuilder setCause(Throwable var1) {
      this.loggingEvent.setThrowable(var1);
      return this;
   }

   @Override
   public LoggingEventBuilder addArgument(Object var1) {
      this.loggingEvent.addArgument(var1);
      return this;
   }

   @Override
   public LoggingEventBuilder addArgument(Supplier<?> var1) {
      this.loggingEvent.addArgument(var1.get());
      return this;
   }

   @Override
   public LoggingEventBuilder addKeyValue(String var1, Object var2) {
      this.loggingEvent.addKeyValue(var1, var2);
      return this;
   }

   @Override
   public LoggingEventBuilder addKeyValue(String var1, Supplier<Object> var2) {
      this.loggingEvent.addKeyValue(var1, var2.get());
      return this;
   }

   @Override
   public void setCallerBoundary(String var1) {
      this.loggingEvent.setCallerBoundary(var1);
   }

   @Override
   public void log() {
      this.log(this.loggingEvent);
   }

   @Override
   public LoggingEventBuilder setMessage(String var1) {
      this.loggingEvent.setMessage(var1);
      return this;
   }

   @Override
   public LoggingEventBuilder setMessage(Supplier<String> var1) {
      this.loggingEvent.setMessage((String)var1.get());
      return this;
   }

   @Override
   public void log(String var1) {
      this.loggingEvent.setMessage(var1);
      this.log(this.loggingEvent);
   }

   @Override
   public void log(String var1, Object var2) {
      this.loggingEvent.setMessage(var1);
      this.loggingEvent.addArgument(var2);
      this.log(this.loggingEvent);
   }

   @Override
   public void log(String var1, Object var2, Object var3) {
      this.loggingEvent.setMessage(var1);
      this.loggingEvent.addArgument(var2);
      this.loggingEvent.addArgument(var3);
      this.log(this.loggingEvent);
   }

   @Override
   public void log(String var1, Object... var2) {
      this.loggingEvent.setMessage(var1);
      this.loggingEvent.addArguments(var2);
      this.log(this.loggingEvent);
   }

   @Override
   public void log(Supplier<String> var1) {
      if (var1 == null) {
         this.log((String)null);
      } else {
         this.log((String)var1.get());
      }
   }

   protected void log(LoggingEvent var1) {
      if (var1.getCallerBoundary() == null) {
         this.setCallerBoundary(DLEB_FQCN);
      }

      if (this.logger instanceof LoggingEventAware) {
         ((LoggingEventAware)this.logger).log(var1);
      } else if (this.logger instanceof LocationAwareLogger) {
         this.logViaLocationAwareLoggerAPI((LocationAwareLogger)this.logger, var1);
      } else {
         this.logViaPublicSLF4JLoggerAPI(var1);
      }
   }

   private void logViaLocationAwareLoggerAPI(LocationAwareLogger var1, LoggingEvent var2) {
      String var3 = var2.getMessage();
      List var4 = var2.getMarkers();
      String var5 = this.mergeMarkersAndKeyValuePairsAndMessage(var2);
      var1.log(null, var2.getCallerBoundary(), var2.getLevel().toInt(), var5, var2.getArgumentArray(), var2.getThrowable());
   }

   private void logViaPublicSLF4JLoggerAPI(LoggingEvent var1) {
      Object[] var2 = var1.getArgumentArray();
      int var3 = var2 == null ? 0 : var2.length;
      Throwable var4 = var1.getThrowable();
      int var5 = var4 == null ? 0 : 1;
      Object[] var6 = new Object[var3 + var5];
      if (var2 != null) {
         System.arraycopy(var2, 0, var6, 0, var3);
      }

      if (var4 != null) {
         var6[var3] = var4;
      }

      String var7 = this.mergeMarkersAndKeyValuePairsAndMessage(var1);
      switch (var1.getLevel()) {
         case TRACE:
            this.logger.trace(var7, var6);
            break;
         case DEBUG:
            this.logger.debug(var7, var6);
            break;
         case INFO:
            this.logger.info(var7, var6);
            break;
         case WARN:
            this.logger.warn(var7, var6);
            break;
         case ERROR:
            this.logger.error(var7, var6);
      }
   }

   private String mergeMarkersAndKeyValuePairsAndMessage(LoggingEvent var1) {
      StringBuilder var2 = this.mergeMarkers(var1.getMarkers(), null);
      var2 = this.mergeKeyValuePairs(var1.getKeyValuePairs(), var2);
      return this.mergeMessage(var1.getMessage(), var2);
   }

   private StringBuilder mergeMarkers(List<Marker> var1, StringBuilder var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            var2 = new StringBuilder();
         }

         for (Marker var4 : var1) {
            var2.append(var4);
            var2.append(' ');
         }

         return var2;
      } else {
         return var2;
      }
   }

   private StringBuilder mergeKeyValuePairs(List<KeyValuePair> var1, StringBuilder var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null) {
            var2 = new StringBuilder();
         }

         for (KeyValuePair var4 : var1) {
            var2.append(var4.key);
            var2.append('=');
            var2.append(var4.value);
            var2.append(' ');
         }

         return var2;
      } else {
         return var2;
      }
   }

   private String mergeMessage(String var1, StringBuilder var2) {
      if (var2 != null) {
         var2.append(var1);
         return var2.toString();
      } else {
         return var1;
      }
   }
}
