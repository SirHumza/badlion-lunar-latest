package org.slf4j.helpers;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class NOPLogger extends NamedLoggerBase implements Logger {
   private static final long serialVersionUID = -517220405410904473L;
   public static final NOPLogger NOP_LOGGER = new NOPLogger();

   protected NOPLogger() {
   }

   @Override
   public String getName() {
      return "NOP";
   }

   @Override
   public final boolean isTraceEnabled() {
      return false;
   }

   @Override
   public final void trace(String var1) {
   }

   @Override
   public final void trace(String var1, Object var2) {
   }

   @Override
   public final void trace(String var1, Object var2, Object var3) {
   }

   @Override
   public final void trace(String var1, Object... var2) {
   }

   @Override
   public final void trace(String var1, Throwable var2) {
   }

   @Override
   public final boolean isDebugEnabled() {
      return false;
   }

   @Override
   public final void debug(String var1) {
   }

   @Override
   public final void debug(String var1, Object var2) {
   }

   @Override
   public final void debug(String var1, Object var2, Object var3) {
   }

   @Override
   public final void debug(String var1, Object... var2) {
   }

   @Override
   public final void debug(String var1, Throwable var2) {
   }

   @Override
   public final boolean isInfoEnabled() {
      return false;
   }

   @Override
   public final void info(String var1) {
   }

   @Override
   public final void info(String var1, Object var2) {
   }

   @Override
   public final void info(String var1, Object var2, Object var3) {
   }

   @Override
   public final void info(String var1, Object... var2) {
   }

   @Override
   public final void info(String var1, Throwable var2) {
   }

   @Override
   public final boolean isWarnEnabled() {
      return false;
   }

   @Override
   public final void warn(String var1) {
   }

   @Override
   public final void warn(String var1, Object var2) {
   }

   @Override
   public final void warn(String var1, Object var2, Object var3) {
   }

   @Override
   public final void warn(String var1, Object... var2) {
   }

   @Override
   public final void warn(String var1, Throwable var2) {
   }

   @Override
   public final boolean isErrorEnabled() {
      return false;
   }

   @Override
   public final void error(String var1) {
   }

   @Override
   public final void error(String var1, Object var2) {
   }

   @Override
   public final void error(String var1, Object var2, Object var3) {
   }

   @Override
   public final void error(String var1, Object... var2) {
   }

   @Override
   public final void error(String var1, Throwable var2) {
   }

   @Override
   public final boolean isTraceEnabled(Marker var1) {
      return false;
   }

   @Override
   public final void trace(Marker var1, String var2) {
   }

   @Override
   public final void trace(Marker var1, String var2, Object var3) {
   }

   @Override
   public final void trace(Marker var1, String var2, Object var3, Object var4) {
   }

   @Override
   public final void trace(Marker var1, String var2, Object... var3) {
   }

   @Override
   public final void trace(Marker var1, String var2, Throwable var3) {
   }

   @Override
   public final boolean isDebugEnabled(Marker var1) {
      return false;
   }

   @Override
   public final void debug(Marker var1, String var2) {
   }

   @Override
   public final void debug(Marker var1, String var2, Object var3) {
   }

   @Override
   public final void debug(Marker var1, String var2, Object var3, Object var4) {
   }

   @Override
   public final void debug(Marker var1, String var2, Object... var3) {
   }

   @Override
   public final void debug(Marker var1, String var2, Throwable var3) {
   }

   @Override
   public boolean isInfoEnabled(Marker var1) {
      return false;
   }

   @Override
   public final void info(Marker var1, String var2) {
   }

   @Override
   public final void info(Marker var1, String var2, Object var3) {
   }

   @Override
   public final void info(Marker var1, String var2, Object var3, Object var4) {
   }

   @Override
   public final void info(Marker var1, String var2, Object... var3) {
   }

   @Override
   public final void info(Marker var1, String var2, Throwable var3) {
   }

   @Override
   public final boolean isWarnEnabled(Marker var1) {
      return false;
   }

   @Override
   public final void warn(Marker var1, String var2) {
   }

   @Override
   public final void warn(Marker var1, String var2, Object var3) {
   }

   @Override
   public final void warn(Marker var1, String var2, Object var3, Object var4) {
   }

   @Override
   public final void warn(Marker var1, String var2, Object... var3) {
   }

   @Override
   public final void warn(Marker var1, String var2, Throwable var3) {
   }

   @Override
   public final boolean isErrorEnabled(Marker var1) {
      return false;
   }

   @Override
   public final void error(Marker var1, String var2) {
   }

   @Override
   public final void error(Marker var1, String var2, Object var3) {
   }

   @Override
   public final void error(Marker var1, String var2, Object var3, Object var4) {
   }

   @Override
   public final void error(Marker var1, String var2, Object... var3) {
   }

   @Override
   public final void error(Marker var1, String var2, Throwable var3) {
   }
}
