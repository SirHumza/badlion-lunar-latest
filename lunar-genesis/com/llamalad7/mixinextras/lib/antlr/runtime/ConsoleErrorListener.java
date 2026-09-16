package com.llamalad7.mixinextras.lib.antlr.runtime;

public class ConsoleErrorListener extends BaseErrorListener {
   public static final ConsoleErrorListener INSTANCE = new ConsoleErrorListener();

   @Override
   public void syntaxError(Recognizer<?, ?> var1, Object var2, int var3, int var4, String var5, RecognitionException var6) {
      System.err.println("line " + var3 + ":" + var4 + " " + var5);
   }
}
