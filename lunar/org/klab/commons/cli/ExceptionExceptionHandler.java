package org.klab.commons.cli;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ExceptionExceptionHandler<T> implements Options.ExceptionHandler<T> {
   private static Log logger = LogFactory.getLog(ExceptionExceptionHandler.class);

   @Override
   public void handleException(Options.ExceptionHandler.Context<T> var1) {
      logger.debug("ExceptionHandler", var1.exception);
      var1.printHelp();
      throw (RuntimeException)new IllegalStateException().initCause(var1.exception);
   }
}
