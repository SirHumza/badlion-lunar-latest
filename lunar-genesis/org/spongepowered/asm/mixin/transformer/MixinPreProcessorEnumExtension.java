package org.spongepowered.asm.mixin.transformer;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.transformer.throwables.InvalidMixinException;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;

class MixinPreProcessorEnumExtension extends MixinPreProcessorStandard {
   private static final List<Class<? extends Annotation>> DISALLOWED_ANNOTATIONS_ON_CONSTANTS = Arrays.asList(Shadow.class, Unique.class);

   MixinPreProcessorEnumExtension(MixinInfo var1, MixinInfo.MixinClassNode var2) {
      super(var1, var2);
   }

   @Override
   protected void prepareShadow(MixinInfo.MixinMethodNode var1, ClassInfo.Method var2) {
      if ("<init>".equals(var1.name) && !Bytecode.hasFlag(var1, 4096)) {
         Annotations.setVisible(var1, Shadow.class);
      }

      super.prepareShadow(var1, var2);
   }

   @Override
   protected boolean validateField(MixinTargetContext var1, FieldNode var2, AnnotationNode var3) {
      if (Bytecode.isEnumConstant(var2, this.classNode)) {
         for (Class var5 : DISALLOWED_ANNOTATIONS_ON_CONSTANTS) {
            if (Annotations.getVisible(var2, var5) != null) {
               throw new InvalidMixinException(
                  var1, String.format("Enum constant %s in %s has @%s annotation. This is not allowed.", var2.name, var1, var5.getSimpleName())
               );
            }
         }

         return true;
      } else {
         return super.validateField(var1, var2, var3);
      }
   }

   @Override
   protected boolean validateMethod(MixinTargetContext var1, MixinInfo.MixinMethodNode var2) {
      String var3 = 'L' + this.mixin.getClassRef() + ';';
      if (var2.name.equals("values") && var2.desc.equals("()[" + var3)) {
         return false;
      } else {
         return var2.name.equals("valueOf") && var2.desc.equals("(Ljava/lang/String;)" + var3) ? false : super.validateMethod(var1, var2);
      }
   }
}
