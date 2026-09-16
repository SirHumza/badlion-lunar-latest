package org.spongepowered.asm.mixin.throwables;

import org.spongepowered.asm.mixin.extensibility.IActivityContext;

public class ClassMetadataNotFoundException extends MixinException {
   public ClassMetadataNotFoundException(String var1) {
      super(var1);
   }

   public ClassMetadataNotFoundException(String var1, IActivityContext var2) {
      super(var1, var2);
   }

   public ClassMetadataNotFoundException(Throwable var1) {
      super(var1);
   }

   public ClassMetadataNotFoundException(Throwable var1, IActivityContext var2) {
      super(var1, var2);
   }

   public ClassMetadataNotFoundException(String var1, Throwable var2) {
      super(var1, var2);
   }

   public ClassMetadataNotFoundException(String var1, Throwable var2, IActivityContext var3) {
      super(var1, var2, var3);
   }
}
