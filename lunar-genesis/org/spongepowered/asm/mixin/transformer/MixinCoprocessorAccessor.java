package org.spongepowered.asm.mixin.transformer;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.transformer.meta.MixinProxy;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.asm.util.Bytecode;

class MixinCoprocessorAccessor extends MixinCoprocessor {
   protected final String sessionId;
   private final Map<String, MixinInfo> accessorMixins = new HashMap<>();

   MixinCoprocessorAccessor(String var1) {
      this.sessionId = var1;
   }

   @Override
   String getName() {
      return "accessor";
   }

   @Override
   public void onPrepare(MixinInfo var1) {
      if (var1.isAccessor()) {
         this.registerAccessor(var1);
      }
   }

   void registerAccessor(MixinInfo var1) {
      this.accessorMixins.put(var1.getClassName(), var1);
   }

   @Override
   MixinCoprocessor.ProcessResult process(String var1, ClassNode var2) {
      if (MixinEnvironment.getCompatibilityLevel().supports(1) && this.accessorMixins.containsKey(var1)) {
         MixinInfo var3 = this.accessorMixins.get(var1);
         boolean var4 = false;
         MixinInfo.MixinClassNode var5 = var3.getClassNode(0);
         ClassInfo var6 = var3.getTargets().get(0);
         if (!Bytecode.hasFlag(var5, 1)) {
            Bytecode.setVisibility(var5, Bytecode.Visibility.PUBLIC);
            var4 = true;
         }

         for (MixinInfo.MixinMethodNode var8 : var5.mixinMethods) {
            if (Bytecode.hasFlag(var8, 8)) {
               AnnotationNode var9 = var8.getVisibleAnnotation(Accessor.class);
               AnnotationNode var10 = var8.getVisibleAnnotation(Invoker.class);
               if (var9 != null || var10 != null) {
                  ClassInfo.Method var11 = this.getAccessorMethod(var3, var8, var6);
                  createProxy(var8, var6, var11);
                  Annotations.setVisible(var8, MixinProxy.class, "sessionId", this.sessionId);
                  var2.methods.add(var8);
                  var4 = true;
               }
            }
         }

         if (!var4) {
            return MixinCoprocessor.ProcessResult.NONE;
         }

         Bytecode.replace(var5, var2);
         return MixinCoprocessor.ProcessResult.PASSTHROUGH_TRANSFORMED;
      } else {
         return MixinCoprocessor.ProcessResult.NONE;
      }
   }

   @Override
   public boolean couldTransform(String var1) {
      return MixinEnvironment.getCompatibilityLevel().supports(1) && this.accessorMixins.containsKey(var1);
   }

   private ClassInfo.Method getAccessorMethod(MixinInfo var1, MethodNode var2, ClassInfo var3) {
      ClassInfo.Method var4 = var1.getClassInfo().findMethod(var2, 10);
      if (!var4.isConformed()) {
         String var5 = var3.getMethodMapper().getUniqueName(var1, var2, this.sessionId, true);
         var4.conform(var5);
      }

      return var4;
   }

   private static void createProxy(MethodNode var0, ClassInfo var1, ClassInfo.Method var2) {
      var0.access |= 4096;
      var0.instructions.clear();
      Type[] var3 = Type.getArgumentTypes(var0.desc);
      Type var4 = Type.getReturnType(var0.desc);
      Bytecode.loadArgs(var3, var0.instructions, 0);
      var0.instructions.add(new MethodInsnNode(184, var1.getName(), var2.getName(), var0.desc, var1.isInterface()));
      var0.instructions.add(new InsnNode(var4.getOpcode(172)));
      var0.maxStack = Bytecode.getFirstNonArgLocalIndex(var3, false);
      var0.maxLocals = 0;
   }
}
