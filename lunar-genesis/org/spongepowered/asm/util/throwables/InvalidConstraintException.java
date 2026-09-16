package org.spongepowered.asm.util.throwables;

public class InvalidConstraintException extends IllegalArgumentException {
   public InvalidConstraintException() {
   }

   public InvalidConstraintException(String var1) {
      super(var1);
   }

   public InvalidConstraintException(Throwable var1) {
      super(var1);
   }

   public InvalidConstraintException(String var1, Throwable var2) {
      super(var1, var2);
   }
}
