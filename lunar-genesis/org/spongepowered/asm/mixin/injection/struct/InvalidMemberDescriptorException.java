package org.spongepowered.asm.mixin.injection.struct;

import org.spongepowered.asm.mixin.injection.selectors.InvalidSelectorException;

public class InvalidMemberDescriptorException extends InvalidSelectorException {
   private final String input;

   public InvalidMemberDescriptorException(String var1, String var2) {
      super(var2);
      this.input = var1;
   }

   public InvalidMemberDescriptorException(String var1, Throwable var2) {
      super(var2);
      this.input = var1;
   }

   public InvalidMemberDescriptorException(String var1, String var2, Throwable var3) {
      super(var2, var3);
      this.input = var1;
   }

   public String getInput() {
      return this.input;
   }
}
