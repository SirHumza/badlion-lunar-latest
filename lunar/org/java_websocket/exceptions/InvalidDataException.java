package org.java_websocket.exceptions;

public class InvalidDataException extends Exception {
   private static final long serialVersionUID = 3731842424390998726L;
   private final int closecode;

   public InvalidDataException(int var1) {
      this.closecode = var1;
   }

   public InvalidDataException(int var1, String var2) {
      super(var2);
      this.closecode = var1;
   }

   public InvalidDataException(int var1, Throwable var2) {
      super(var2);
      this.closecode = var1;
   }

   public InvalidDataException(int var1, String var2, Throwable var3) {
      super(var2, var3);
      this.closecode = var1;
   }

   public int getCloseCode() {
      return this.closecode;
   }
}
