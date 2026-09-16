package org.spongepowered.asm.mixin.injection.callback;

public class CancellationException extends RuntimeException {
   public CancellationException() {
   }

   public CancellationException(String var1) {
      super(var1);
   }

   public CancellationException(Throwable var1) {
      super(var1);
   }

   public CancellationException(String var1, Throwable var2) {
      super(var1, var2);
   }
}
