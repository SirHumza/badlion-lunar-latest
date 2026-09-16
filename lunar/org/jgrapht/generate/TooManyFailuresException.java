package org.jgrapht.generate;

public class TooManyFailuresException extends RuntimeException {
   private static final long serialVersionUID = 7986467967127358163L;

   public TooManyFailuresException() {
   }

   public TooManyFailuresException(String var1) {
      super(var1);
   }

   public TooManyFailuresException(String var1, Throwable var2) {
      super(var1, var2);
   }
}
