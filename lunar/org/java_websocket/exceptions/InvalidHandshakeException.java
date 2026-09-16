package org.java_websocket.exceptions;

public class InvalidHandshakeException extends InvalidDataException {
   private static final long serialVersionUID = -1426533877490484964L;

   public InvalidHandshakeException() {
      super(1002);
   }

   public InvalidHandshakeException(String var1, Throwable var2) {
      super(1002, var1, var2);
   }

   public InvalidHandshakeException(String var1) {
      super(1002, var1);
   }

   public InvalidHandshakeException(Throwable var1) {
      super(1002, var1);
   }
}
