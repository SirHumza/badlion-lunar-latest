package org.spongepowered.asm.mixin.transformer;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;

final class EnumExtensionUtils {
   public static void checkForGotchas(MixinInfo var0, ClassNode var1) {
      checkForOrdinalSwitch(var0, var1);
   }

   private static void checkForOrdinalSwitch(MixinInfo var0, ClassNode var1) {
      for (MethodNode var3 : var1.methods) {
         for (AbstractInsnNode var5 : var3.instructions) {
            if (isOrdinalCall(var5, var0) && isSwitch(var5.getNext())) {
               Integer var6 = findLineNumber(var5);
               throw new InvalidMixinException(
                  var0,
                  String.format(
                     "`ordinal` switch on enum extension type is not supported but was found on line %s. Instead, switch on the target enum, e.g. `switch ((TargetEnum) (Object) ...)`",
                     var6
                  )
               );
            }
         }
      }
   }

   private static boolean isOrdinalCall(AbstractInsnNode var0, MixinInfo var1) {
      if (var0.getOpcode() != 182) {
         return false;
      }

      MethodInsnNode var2 = (MethodInsnNode)var0;
      return var2.owner.equals(var1.getClassRef()) && var2.name.equals("ordinal") && var2.desc.equals("()I");
   }

   private static boolean isSwitch(AbstractInsnNode var0) {
      return var0.getOpcode() == 170 || var0.getOpcode() == 171;
   }

   private static Integer findLineNumber(AbstractInsnNode var0) {
      while (!(var0 instanceof LineNumberNode)) {
         var0 = var0.getPrevious();
         if (var0 == null) {
            return null;
         }
      }

      return ((LineNumberNode)var0).line;
   }
}
