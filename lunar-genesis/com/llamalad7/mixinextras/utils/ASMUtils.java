package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.lib.apache.commons.StringUtils;
import com.llamalad7.mixinextras.service.MixinExtrasService;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Bytecode;

public class ASMUtils {
   public static final Type OBJECT_TYPE = Type.getType(Object.class);
   public static final Handle LMF_HANDLE = new Handle(
      6,
      "java/lang/invoke/LambdaMetafactory",
      "metafactory",
      Bytecode.generateDescriptor(CallSite.class, Lookup.class, String.class, MethodType.class, MethodType.class, MethodHandle.class, MethodType.class),
      false
   );

   public static String annotationToString(AnnotationNode var0) {
      StringBuilder var1 = new StringBuilder("@").append(typeToString(Type.getType(var0.desc)));
      List var2 = var0.values;
      if (var2 != null && !var2.isEmpty()) {
         var1.append('(');

         for (byte var3 = 0; var3 < var2.size(); var3 += 2) {
            if (var3 != 0) {
               var1.append(", ");
            }

            String var4 = (String)var2.get(var3);
            Object var5 = var2.get(var3 + 1);
            var1.append(var4).append(" = ").append(valueToString(var5));
         }

         var1.append(')');
         return var1.toString();
      } else {
         return var1.toString();
      }
   }

   public static String typeToString(Type var0) {
      String var1 = var0.getClassName();
      return var1.substring(var1.lastIndexOf(46) + 1).replace('$', '.');
   }

   private static String valueToString(Object var0) {
      if (var0 instanceof String) {
         return '"' + var0.toString() + '"';
      } else if (var0 instanceof Type) {
         Type var3 = (Type)var0;
         return typeToString(var3) + ".class";
      } else if (var0 instanceof String[]) {
         String[] var2 = (String[])var0;
         return typeToString(Type.getType(var2[0])) + '.' + var2[1];
      } else if (var0 instanceof AnnotationNode) {
         return annotationToString((AnnotationNode)var0);
      } else if (var0 instanceof List) {
         List var1 = (List)var0;
         return var1.size() == 1 ? valueToString(var1.get(0)) : '{' + var1.stream().map(ASMUtils::valueToString).collect(Collectors.joining(", ")) + '}';
      } else {
         return var0.toString();
      }
   }

   public static boolean isPrimitive(Type var0) {
      return var0.getDescriptor().length() == 1;
   }

   public static MethodInsnNode getInvokeInstruction(ClassNode var0, MethodNode var1) {
      boolean var2 = (var0.access & 512) != 0;
      int var3 = (var1.access & 8) != 0 ? 184 : ((var1.access & 2) != 0 ? 183 : (var2 ? 185 : 182));
      return new MethodInsnNode(var3, var0.name, var1.name, var1.desc, var2);
   }

   public static int getDummyOpcodeForType(Type var0) {
      switch (var0.getSort()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return 3;
         case 6:
            return 11;
         case 7:
            return 9;
         case 8:
            return 14;
         case 9:
         case 10:
            return 1;
         default:
            throw new UnsupportedOperationException();
      }
   }

   public static MethodInsnNode findInitNodeFor(Target var0, TypeInsnNode var1) {
      int var2 = var0.indexOf(var1);
      int var3 = 0;

      for (AbstractInsnNode var5 : var0.insns) {
         if (var5 instanceof TypeInsnNode && var5.getOpcode() == 187) {
            TypeInsnNode var7 = (TypeInsnNode)var5;
            if (var7.desc.equals(var1.desc)) {
               var3++;
            }
         } else if (var5 instanceof MethodInsnNode && var5.getOpcode() == 183) {
            MethodInsnNode var6 = (MethodInsnNode)var5;
            if ("<init>".equals(var6.name) && var6.owner.equals(var1.desc)) {
               if (--var3 == 0) {
                  return var6;
               }
            }
         }
      }

      return null;
   }

   public static void ifElse(InsnList var0, int var1, Runnable var2, Runnable var3) {
      ifElse(var0, var2x -> var0.add(new JumpInsnNode(var1, var2x)), var2, var3);
   }

   public static void ifElse(InsnList var0, Consumer<LabelNode> var1, Runnable var2, Runnable var3) {
      LabelNode var4 = new LabelNode();
      LabelNode var5 = new LabelNode();
      var1.accept(var4);
      var2.run();
      var0.add(new JumpInsnNode(167, var5));
      var0.add(var4);
      var3.run();
      var0.add(var5);
   }

   public static AnnotationNode getRepeatedMEAnnotation(MethodNode var0, Class<? extends Annotation> var1) {
      Class var2 = var1.getAnnotation(Repeatable.class).value();
      AnnotationNode var3 = getInvisibleMEAnnotation(var0, var2);
      if (var3 != null) {
         return var3;
      }

      AnnotationNode var4 = getInvisibleMEAnnotation(var0, var1);
      if (var4 == null) {
         return null;
      }

      AnnotationNode var5 = new AnnotationNode(Type.getDescriptor(var2));
      var5.visit("value", var4);
      return var5;
   }

   public static AnnotationNode getInvisibleMEAnnotation(MethodNode var0, Class<? extends Annotation> var1) {
      return getMEAnnotation(var0.invisibleAnnotations, Type.getInternalName(var1));
   }

   private static AnnotationNode getMEAnnotation(List<AnnotationNode> var0, String var1) {
      String var2 = "." + StringUtils.substringAfterLast(var1, "/");
      if (var0 == null) {
         return null;
      }

      for (AnnotationNode var4 : var0) {
         String var5 = Type.getType(var4.desc).getClassName();
         if (MixinExtrasService.getInstance().isClassOwned(var5) && var5.endsWith(var2)) {
            return var4;
         }
      }

      return null;
   }

   public static Type getConstantType(AbstractInsnNode var0) {
      return var0 instanceof TypeInsnNode ? null : Bytecode.getConstantType(var0);
   }
}
