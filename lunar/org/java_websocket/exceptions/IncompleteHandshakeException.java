package org.java_websocket.exceptions;

public class IncompleteHandshakeException extends RuntimeException {
   private static final long serialVersionUID = 7906596804233893092L;
   private final int preferredSize;

   public IncompleteHandshakeException(int var1) {
      this.preferredSize = var1;
   }

   public IncompleteHandshakeException() {
      this.preferredSize = 0;
   }

   public int getPreferredSize() {
      return this.preferredSize;
   }
}
