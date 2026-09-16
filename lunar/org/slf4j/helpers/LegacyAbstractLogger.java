package org.slf4j.helpers;

import org.slf4j.Marker;

public abstract class LegacyAbstractLogger extends AbstractLogger {
   private static final long serialVersionUID = -7041884104854048950L;

   @Override
   public boolean isTraceEnabled(Marker var1) {
      return this.isTraceEnabled();
   }

   @Override
   public boolean isDebugEnabled(Marker var1) {
      return this.isDebugEnabled();
   }

   @Override
   public boolean isInfoEnabled(Marker var1) {
      return this.isInfoEnabled();
   }

   @Override
   public boolean isWarnEnabled(Marker var1) {
      return this.isWarnEnabled();
   }

   @Override
   public boolean isErrorEnabled(Marker var1) {
      return this.isErrorEnabled();
   }
}
