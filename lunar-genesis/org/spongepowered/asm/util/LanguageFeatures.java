package org.spongepowered.asm.util;

import java.lang.reflect.Field;
import java.util.List;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.util.asm.ASM;
import org.spongepowered.asm.util.asm.ClassNodeAdapter;

public final class LanguageFeatures {
   public static final int METHODS_IN_INTERFACES = 1;
   public static final int PRIVATE_SYNTHETIC_METHODS_IN_INTERFACES = 2;
   public static final int PRIVATE_METHODS_IN_INTERFACES = 4;
   public static final int NESTING = 8;
   public static final int DYNAMIC_CONSTANTS = 16;
   public static final int RECORDS = 32;
   public static final int SEALED_CLASSES = 64;

   private LanguageFeatures() {
   }

   public static int scan(ClassNode var0) {
      int var1 = scanClassFeatures(var0);
      boolean var2 = Bytecode.hasFlag(var0, 512);

      for (MethodNode var4 : var0.methods) {
         if (var2) {
            var1 |= scanInterfaceFeatures(var4);
         } else {
            var1 |= scanMethodFeatures(var4);
         }
      }

      return var1;
   }

   private static int scanClassFeatures(ClassNode var0) {
      byte var1 = 0;
      String var2 = ClassNodeAdapter.getNestHostClass(var0);
      List var3 = ClassNodeAdapter.getNestMembers(var0);
      if (var2 != null || var3 != null && var3.size() > 0) {
         var1 |= 8;
      }

      return var1;
   }

   private static int scanInterfaceFeatures(MethodNode var0) {
      byte var1 = 0;
      if (!Bytecode.hasFlag(var0, 1024)) {
         var1 |= 1;
      }

      if (Bytecode.getVisibility(var0).isLessThan(Bytecode.Visibility.PUBLIC)) {
         var1 |= Bytecode.hasFlag(var0, 4096) ? 2 : 4;
      }

      return var1;
   }

   private static int scanMethodFeatures(MethodNode var0) {
      if (ASM.isAtLeastVersion(6)) {
         for (AbstractInsnNode var2 : var0.instructions) {
            if (var2 instanceof LdcInsnNode && ((LdcInsnNode)var2).cst instanceof ConstantDynamic) {
               return 16;
            }
         }
      }

      return 0;
   }

   public static final String format(int var0) {
      StringBuilder var1 = new StringBuilder("[");

      try {
         int var2 = 0;

         for (Field var6 : LanguageFeatures.class.getDeclaredFields()) {
            if ((var0 & var6.getInt(null)) != 0) {
               if (var2++ > 0) {
                  var1.append(',');
               }

               var1.append(var6.getName());
            }
         }
      } catch (ReflectiveOperationException var7) {
         var1.append("ERROR");
      }

      return var1.append(']').toString();
   }
}
