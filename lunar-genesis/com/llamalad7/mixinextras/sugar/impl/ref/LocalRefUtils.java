package com.llamalad7.mixinextras.sugar.impl.ref;

import com.llamalad7.mixinextras.lib.apache.commons.StringUtils;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.llamalad7.mixinextras.sugar.ref.LocalByteRef;
import com.llamalad7.mixinextras.sugar.ref.LocalCharRef;
import com.llamalad7.mixinextras.sugar.ref.LocalDoubleRef;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.llamalad7.mixinextras.sugar.ref.LocalShortRef;
import com.llamalad7.mixinextras.utils.ASMUtils;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public class LocalRefUtils {
   public static Class<?> getInterfaceFor(Type var0) {
      if (!ASMUtils.isPrimitive(var0)) {
         return LocalRef.class;
      }

      switch (var0.getDescriptor().charAt(0)) {
         case 'B':
            return LocalByteRef.class;
         case 'C':
            return LocalCharRef.class;
         case 'D':
            return LocalDoubleRef.class;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         default:
            throw new IllegalStateException("Illegal descriptor " + var0.getDescriptor());
         case 'F':
            return LocalFloatRef.class;
         case 'I':
            return LocalIntRef.class;
         case 'J':
            return LocalLongRef.class;
         case 'S':
            return LocalShortRef.class;
         case 'Z':
            return LocalBooleanRef.class;
      }
   }

   public static Type getTargetType(Type var0, Type var1) {
      if (var0.getSort() == 10 && MixinExtrasService.getInstance().isClassOwned(var0.getClassName())) {
         switch (StringUtils.substringAfterLast(var0.getInternalName(), "/")) {
            case "LocalBooleanRef":
               return Type.BOOLEAN_TYPE;
            case "LocalByteRef":
               return Type.BYTE_TYPE;
            case "LocalCharRef":
               return Type.CHAR_TYPE;
            case "LocalDoubleRef":
               return Type.DOUBLE_TYPE;
            case "LocalFloatRef":
               return Type.FLOAT_TYPE;
            case "LocalIntRef":
               return Type.INT_TYPE;
            case "LocalLongRef":
               return Type.LONG_TYPE;
            case "LocalShortRef":
               return Type.SHORT_TYPE;
            case "LocalRef":
               if (var1 == null) {
                  throw new IllegalStateException("LocalRef must have a concrete type argument!");
               }

               return var1;
            default:
               return var0;
         }
      } else {
         return var0;
      }
   }

   public static void generateNew(InsnList var0, Type var1) {
      String var2 = LocalRefClassGenerator.getForType(var1);
      var0.add(new TypeInsnNode(187, var2));
      var0.add(new InsnNode(89));
      var0.add(new MethodInsnNode(183, var2, "<init>", "()V", false));
   }

   public static void generateInitialization(InsnList var0, Type var1) {
      String var2 = LocalRefClassGenerator.getForType(var1);
      var0.add(new MethodInsnNode(182, var2, "init", Type.getMethodDescriptor(Type.VOID_TYPE, getErasedType(var1)), false));
   }

   public static void generateDisposal(InsnList var0, Type var1) {
      String var2 = LocalRefClassGenerator.getForType(var1);
      var0.add(new MethodInsnNode(182, var2, "dispose", Type.getMethodDescriptor(getErasedType(var1)), false));
      if (!ASMUtils.isPrimitive(var1)) {
         var0.add(new TypeInsnNode(192, var1.getInternalName()));
      }
   }

   public static void generateUnwrapping(InsnList var0, Type var1, Runnable var2) {
      String var3 = Type.getInternalName(getInterfaceFor(var1));
      var2.run();
      var0.add(new MethodInsnNode(185, var3, "get", Type.getMethodDescriptor(getErasedType(var1)), true));
      if (!ASMUtils.isPrimitive(var1)) {
         var0.add(new TypeInsnNode(192, var1.getInternalName()));
      }
   }

   private static Type getErasedType(Type var0) {
      return ASMUtils.isPrimitive(var0) ? var0 : ASMUtils.OBJECT_TYPE;
   }
}
