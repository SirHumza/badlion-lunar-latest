package org.spongepowered.asm.mixin.transformer.ext.extensions;

import java.util.Iterator;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;
import org.spongepowered.asm.mixin.transformer.ext.ITargetClassContext;
import org.spongepowered.asm.util.Locals;

public class ExtensionLVTCleaner implements IExtension {
   @Override
   public boolean checkActive(MixinEnvironment var1) {
      return true;
   }

   @Override
   public void preApply(ITargetClassContext var1) {
   }

   @Override
   public void postApply(ITargetClassContext var1) {
   }

   @Override
   public void export(MixinEnvironment var1, String var2, boolean var3, ClassNode var4) {
      for (MethodNode var6 : var4.methods) {
         if (var6.localVariables != null) {
            Iterator var7 = var6.localVariables.iterator();

            while (var7.hasNext()) {
               if (var7.next() instanceof Locals.SyntheticLocalVariableNode) {
                  var7.remove();
               }
            }
         }
      }
   }
}
