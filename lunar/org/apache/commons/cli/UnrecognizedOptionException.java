package org.apache.commons.cli;

public class UnrecognizedOptionException extends ParseException {
   private String option;

   public UnrecognizedOptionException(String var1) {
      super(var1);
   }

   public UnrecognizedOptionException(String var1, String var2) {
      this(var1);
      this.option = var2;
   }

   public String getOption() {
      return this.option;
   }
}
