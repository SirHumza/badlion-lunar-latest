package org.slf4j.spi;

import java.util.function.Supplier;
import org.slf4j.Marker;

public class NOPLoggingEventBuilder implements LoggingEventBuilder {
   static final NOPLoggingEventBuilder SINGLETON = new NOPLoggingEventBuilder();

   private NOPLoggingEventBuilder() {
   }

   public static LoggingEventBuilder singleton() {
      return SINGLETON;
   }

   @Override
   public LoggingEventBuilder addMarker(Marker var1) {
      return singleton();
   }

   @Override
   public LoggingEventBuilder addArgument(Object var1) {
      return singleton();
   }

   @Override
   public LoggingEventBuilder addArgument(Supplier<?> var1) {
      return singleton();
   }

   @Override
   public LoggingEventBuilder addKeyValue(String var1, Object var2) {
      return singleton();
   }

   @Override
   public LoggingEventBuilder addKeyValue(String var1, Supplier<Object> var2) {
      return singleton();
   }

   @Override
   public LoggingEventBuilder setCause(Throwable var1) {
      return singleton();
   }

   @Override
   public void log() {
   }

   @Override
   public LoggingEventBuilder setMessage(String var1) {
      return this;
   }

   @Override
   public LoggingEventBuilder setMessage(Supplier<String> var1) {
      return this;
   }

   @Override
   public void log(String var1) {
   }

   @Override
   public void log(Supplier<String> var1) {
   }

   @Override
   public void log(String var1, Object var2) {
   }

   @Override
   public void log(String var1, Object var2, Object var3) {
   }

   @Override
   public void log(String var1, Object... var2) {
   }
}
