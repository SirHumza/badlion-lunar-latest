package org.java_websocket.exceptions;

public class InvalidFrameException extends InvalidDataException {
   private static final long serialVersionUID = -9016496369828887591L;

   public InvalidFrameException() {
      super(1002);
   }

   public InvalidFrameException(String var1) {
      super(1002, var1);
   }

   public InvalidFrameException(Throwable var1) {
      super(1002, var1);
   }

   public InvalidFrameException(String var1, Throwable var2) {
      super(1002, var1, var2);
   }
}
