package org.spongepowered.asm.mixin.transformer.ext.extensions;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.throwables.MixinException;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.transformers.MixinClassWriter;

public class ExtensionCheckClass implements IExtension {
   @Override
   public boolean checkActive(MixinEnvironment var1) {
      return var1.getOption(MixinEnvironment.Option.DEBUG_VERIFY);
   }

   @Override
   public void preApply(ITargetClassContext var1) {
   }

   @Override
   public void postApply(ITargetClassContext var1) {
      try {
         var1.getClassNode().accept(new CheckClassAdapter(new MixinClassWriter(2)));
      } catch (RuntimeException var3) {
         throw new ExtensionCheckClass.ValidationFailedException(var3.getMessage(), var3);
      }
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
   }

   public static class ValidationFailedException extends MixinException {
      public ValidationFailedException(String var1, Throwable var2) {
         super(var1, var2);
      }

      public ValidationFailedException(String var1) {
         super(var1);
      }

      public ValidationFailedException(Throwable var1) {
         super(var1);
      }
   }
}
