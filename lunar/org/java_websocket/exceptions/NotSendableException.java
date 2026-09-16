package org.java_websocket.exceptions;

public class NotSendableException extends RuntimeException {
   private static final long serialVersionUID = -6468967874576651628L;

   public NotSendableException(String var1) {
      super(var1);
   }

   public NotSendableException(Throwable var1) {
      super(var1);
   }

   public NotSendableException(String var1, Throwable var2) {
      super(var1, var2);
   }
}
