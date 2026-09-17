package com.llamalad7.mixinextras.lib.antlr.runtime;

public class InputMismatchException extends RecognitionException {
   public InputMismatchException(Parser var1) {
      super(var1, var1.getInputStream(), var1._ctx);
      this.setOffendingToken(var1.getCurrentToken());
   }

   public InputMismatchException(Parser var1, int var2, ParserRuleContext var3) {
      super(var1, var1.getInputStream(), var3);
      this.setOffendingState(var2);
      this.setOffendingToken(var1.getCurrentToken());
   }
}
