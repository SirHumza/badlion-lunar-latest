package org.spongepowered.tools.agent;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.service.ServiceNotAvailableError;

class MixinAgentClassLoader extends ClassLoader {
   private Map<Class<?>, byte[]> mixins = new HashMap<>();
   private Map<String, byte[]> targets = new HashMap<>();

   void addMixinClass(String var1) {
      log(Level.DEBUG, "Mixin class {} added to class loader", var1);

      try {
         byte[] var2 = this.materialise(var1);
         Class var3 = this.defineClass(var1, var2, 0, var2.length);
         var3.getDeclaredConstructor().newInstance();
         this.mixins.put(var3, var2);
      } catch (Throwable var4) {
         log(Level.ERROR, "Catching {}", var4);
      }
   }

   void addTargetClass(String var1, ClassNode var2) {
      synchronized (this.targets) {
         if (!this.targets.containsKey(var1)) {
            try {
               ClassWriter var4 = new ClassWriter(0);
               var2.accept(var4);
               this.targets.put(var1, var4.toByteArray());
            } catch (Exception var6) {
               log(
                  Level.ERROR,
                  "Error storing original class bytecode for {} in mixin hotswap agent. {}: {}",
                  var1,
                  var6.getClass().getName(),
                  var6.getMessage()
               );
               log(Level.DEBUG, var6.toString());
            }
         }
      }
   }

   byte[] getFakeMixinBytecode(Class<?> var1) {
      return this.mixins.get(var1);
   }

   byte[] getOriginalTargetBytecode(String var1) {
      synchronized (this.targets) {
         return this.targets.get(var1);
      }
   }

   private byte[] materialise(String var1) {
      ClassWriter var2 = new ClassWriter(3);
      var2.visit(MixinEnvironment.getCompatibilityLevel().getClassVersion(), 1, var1.replace('.', '/'), null, Type.getInternalName(Object.class), null);
      MethodVisitor var3 = var2.visitMethod(1, "<init>", "()V", null, null);
      var3.visitCode();
      var3.visitVarInsn(25, 0);
      var3.visitMethodInsn(183, Type.getInternalName(Object.class), "<init>", "()V", false);
      var3.visitInsn(177);
      var3.visitMaxs(1, 1);
      var3.visitEnd();
      var2.visitEnd();
      return var2.toByteArray();
   }

   public static void log(Level var0, String var1, Object... var2) {
      try {
         MixinService.getService().getLogger("mixin.agent").log(var0, var1, var2);
      } catch (ServiceNotAvailableError var4) {
         System.err.printf("MixinAgent: %s: %s", var0.name(), String.format(var1, var2));
      }
   }
}
