package io.sigpipe.jbsdiff;

public class InvalidHeaderException extends Exception {
   private static final long serialVersionUID = -3712364093810940826L;

   public InvalidHeaderException() {
   }

   public InvalidHeaderException(String var1) {
      super(var1);
   }

   public InvalidHeaderException(String var1, int var2) {
      super("Invalid header field; " + var1 + " = " + var2);
   }
}
