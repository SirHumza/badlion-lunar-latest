package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.asm.ASM;

public class OperationUtils {
   public static void makeOperation(
      Type[] var0, Type var1, InsnList var2, boolean var3, Type[] var4, ClassNode var5, Type var6, String var7, OperationUtils.OperationContents var8
   ) {
      Type[] var9 = var4;
      if (var3) {
         var9 = ArrayUtils.add(var9, 0, Type.getObjectType(var5.name));
      }

      var2.add(
         new InvokeDynamicInsnNode(
            "call",
            Type.getMethodDescriptor(var6, var9),
            ASMUtils.LMF_HANDLE,
            Type.getMethodType(Type.getType(Object.class), Type.getType(Object[].class)),
            generateSyntheticBridge(var0, var1, var3, var4, var7, var5, var8),
            Type.getMethodType(
               ASMUtils.isPrimitive(var1) ? Type.getObjectType(var1 == Type.VOID_TYPE ? "java/lang/Void" : Bytecode.getBoxingType(var1)) : var1,
               Type.getType(Object[].class)
            )
         )
      );
   }

   private static Handle generateSyntheticBridge(
      final Type[] var0, final Type var1, final boolean var2, final Type[] var3, String var4, ClassNode var5, final OperationUtils.OperationContents var6
   ) {
      MethodNode var7 = new MethodNode(
         ASM.API_VERSION,
         4098 | (var2 ? 0 : 8),
         UniquenessHelper.getUniqueMethodName(var5, "mixinextras$bridge$" + var4),
         Bytecode.generateDescriptor(
            ASMUtils.isPrimitive(var1) ? Type.getObjectType(var1 == Type.VOID_TYPE ? "java/lang/Void" : Bytecode.getBoxingType(var1)) : var1,
            ArrayUtils.add(var3, Type.getType(Object[].class))
         ),
         null,
         null
      );
      var7.instructions = new InsnList() {
         {
            int var6x = Arrays.stream(var3).mapToInt(Type::getSize).sum() + (var2 ? 1 : 0);
            this.add(new VarInsnNode(25, var6x));
            this.add(new IntInsnNode(16, var0.length));
            this.add(new LdcInsnNode(Arrays.stream(var0).map(Type::getClassName).collect(Collectors.joining(", ", "[", "]"))));
            this.add(
               new MethodInsnNode(
                  184,
                  Type.getInternalName(WrapOperationRuntime.class),
                  "checkArgumentCount",
                  Bytecode.generateDescriptor(void.class, Object[].class, int.class, String.class),
                  false
               )
            );
            if (var2) {
               this.add(new VarInsnNode(25, 0));
            }

            Consumer var7x = var4x -> {
               var4x.add(new VarInsnNode(25, var6x));

               for (int var5x = 0; var5x < var0.length; var5x++) {
                  Type var6xxx = var0[var5x];
                  var4x.add(new InsnNode(89));
                  var4x.add(new IntInsnNode(16, var5x));
                  var4x.add(new InsnNode(50));
                  if (ASMUtils.isPrimitive(var6xxx)) {
                     var4x.add(new TypeInsnNode(192, Bytecode.getBoxingType(var6xxx)));
                     var4x.add(
                        new MethodInsnNode(182, Bytecode.getBoxingType(var6xxx), Bytecode.getUnboxingMethod(var6xxx), Type.getMethodDescriptor(var6xxx), false)
                     );
                  } else {
                     var4x.add(new TypeInsnNode(192, var6xxx.getInternalName()));
                  }

                  if (var6xxx.getSize() == 2) {
                     var4x.add(new InsnNode(93));
                     var4x.add(new InsnNode(88));
                  } else {
                     var4x.add(new InsnNode(95));
                  }
               }

               var4x.add(new InsnNode(87));
               int var10 = var2 ? 1 : 0;

               for (Type var9 : var3) {
                  var4x.add(new VarInsnNode(var9.getOpcode(21), var10));
                  var10 += var9.getSize();
               }
            };
            this.add(var6.generate(var6x, var7x));
            if (var1 == Type.VOID_TYPE) {
               this.add(new InsnNode(1));
               this.add(new TypeInsnNode(192, "java/lang/Void"));
            } else if (ASMUtils.isPrimitive(var1)) {
               this.add(
                  new MethodInsnNode(
                     184, Bytecode.getBoxingType(var1), "valueOf", Bytecode.generateDescriptor(Type.getObjectType(Bytecode.getBoxingType(var1)), var1), false
                  )
               );
            }

            this.add(new InsnNode(176));
         }
      };
      var5.methods.add(var7);
      return new Handle(var2 ? 7 : 6, var5.name, var7.name, var7.desc, (var5.access & 512) != 0);
   }

   @FunctionalInterface
   public interface OperationContents {
      InsnList generate(int var1, Consumer<InsnList> var2);
   }
}
