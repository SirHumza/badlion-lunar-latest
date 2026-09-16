package org.spongepowered.asm.mixin.throwables;

public class CompanionPluginError extends LinkageError {
   public CompanionPluginError() {
   }

   public CompanionPluginError(String var1) {
      super(var1);
   }

   public CompanionPluginError(String var1, Throwable var2) {
      super(var1, var2);
   }
}
