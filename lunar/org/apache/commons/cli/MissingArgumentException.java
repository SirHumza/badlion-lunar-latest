package org.apache.commons.cli;

public class MissingArgumentException extends ParseException {
   private Option option;

   public MissingArgumentException(String var1) {
      super(var1);
   }

   public MissingArgumentException(Option var1) {
      this("Missing argument for option: " + var1.getKey());
      this.option = var1;
   }

   public Option getOption() {
      return this.option;
   }
}
