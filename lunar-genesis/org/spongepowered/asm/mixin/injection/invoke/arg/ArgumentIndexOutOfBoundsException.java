package org.spongepowered.asm.mixin.injection.invoke.arg;

public class ArgumentIndexOutOfBoundsException extends IndexOutOfBoundsException {
   public ArgumentIndexOutOfBoundsException(int var1) {
      super("Argument index is out of bounds: " + var1);
   }
}
