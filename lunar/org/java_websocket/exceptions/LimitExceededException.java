package org.java_websocket.exceptions;

public class LimitExceededException extends InvalidDataException {
   private static final long serialVersionUID = 6908339749836826785L;
   private final int limit;

   public LimitExceededException() {
      this(Integer.MAX_VALUE);
   }

   public LimitExceededException(int var1) {
      super(1009);
      this.limit = var1;
   }

   public LimitExceededException(String var1, int var2) {
      super(1009, var1);
      this.limit = var2;
   }

   public LimitExceededException(String var1) {
      this(var1, Integer.MAX_VALUE);
   }

   public int getLimit() {
      return this.limit;
   }
}
