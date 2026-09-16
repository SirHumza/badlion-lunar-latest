package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.lib.apache.commons.ArrayUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.injection.code.Injector;
import org.spongepowered.asm.mixin.injection.modify.LocalVariableDiscriminator;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.PrettyPrinter;
import org.spongepowered.asm.util.SignaturePrinter;

public class InjectorUtils {
   public static boolean isVirtualRedirect(InjectionNodes.InjectionNode var0) {
      return var0.isReplaced() && var0.hasDecoration("redirector") && var0.getCurrentTarget().getOpcode() != 184;
   }

   public static boolean isDynamicInstanceofRedirect(InjectionNodes.InjectionNode var0) {
      AbstractInsnNode var1 = var0.getOriginalTarget();
      AbstractInsnNode var2 = var0.getCurrentTarget();
      return var1.getOpcode() == 193 && var2 instanceof MethodInsnNode && Type.getReturnType(((MethodInsnNode)var2).desc).equals(Type.getType(Class.class));
   }

   public static void checkForDupedNews(Map<Target, List<InjectionNodes.InjectionNode>> var0) {
      for (Entry var2 : var0.entrySet()) {
         for (InjectionNodes.InjectionNode var4 : (List)var2.getValue()) {
            AbstractInsnNode var5 = var4.getCurrentTarget();
            if (var5.getOpcode() == 187 && var5.getNext().getOpcode() == 89) {
               var4.decorate("mixinextras_newIsDuped", true);
            }
         }
      }
   }

   public static boolean isDupedNew(InjectionNodes.InjectionNode var0) {
      AbstractInsnNode var1 = var0.getCurrentTarget();
      return var1 != null && var1.getOpcode() == 187 && var0.hasDecoration("mixinextras_newIsDuped");
   }

   public static boolean isDupedFactoryRedirect(InjectionNodes.InjectionNode var0) {
      AbstractInsnNode var1 = var0.getOriginalTarget();
      return var0.isReplaced()
         && var1.getOpcode() == 187
         && !var0.hasDecoration("mixinextras_wrappedOperation")
         && var0.hasDecoration("mixinextras_newIsDuped");
   }

   public static void checkForImmediatePops(Map<Target, List<InjectionNodes.InjectionNode>> var0) {
      for (List var2 : var0.values()) {
         for (InjectionNodes.InjectionNode var4 : var2) {
            AbstractInsnNode var5 = var4.getCurrentTarget();
            if (var5 instanceof MethodInsnNode) {
               Type var6 = Type.getReturnType(((MethodInsnNode)var5).desc);
               if (isTypePoppedByInstruction(var6, var5.getNext())) {
                  var4.decorate("mixinextras_operationIsImmediatelyPopped", true);
               }
            }
         }
      }
   }

   private static boolean isTypePoppedByInstruction(Type var0, AbstractInsnNode var1) {
      switch (var0.getSize()) {
         case 1:
            return var1.getOpcode() == 87;
         case 2:
            return var1.getOpcode() == 88;
         default:
            return false;
      }
   }

   public static LocalVariableDiscriminator.Context getOrCreateLocalContext(
      Target var0, InjectionNodes.InjectionNode var1, InjectionInfo var2, Type var3, boolean var4
   ) {
      String var5 = getLocalContextKey(var3, var4, CompatibilityHelper.getMixin(var2).getMixin().getConfig());
      if (var1.hasDecoration(var5)) {
         return var1.getDecoration(var5);
      }

      LocalVariableDiscriminator.Context var6 = CompatibilityHelper.makeLvtContext(var2, var3, var4, var0, var1.getCurrentTarget());
      var1.decorate(var5, var6);
      return var6;
   }

   private static String getLocalContextKey(Type var0, boolean var1, IMixinConfig var2) {
      return String.format("mixinextras_persistent_localContext(%s,%s,%s)", var0, var1 ? "argsOnly" : "fullFrame", FabricMixinUtils.getCompatibility(var2));
   }

   public static void printLocals(
      Target var0, AbstractInsnNode var1, LocalVariableDiscriminator.Context var2, LocalVariableDiscriminator var3, Type var4, boolean var5
   ) {
      int var6 = var0.isStatic ? 0 : 1;
      new PrettyPrinter()
         .kvWidth(20)
         .kv("Target Class", var0.classNode.name.replace('/', '.'))
         .kv("Target Method", var0.method.name)
         .kv("Capture Type", SignaturePrinter.getTypeName(var4, false))
         .kv("Instruction", "[%d] %s %s", var0.insns.indexOf(var1), var1.getClass().getSimpleName(), Bytecode.getOpcodeName(var1.getOpcode()))
         .hr()
         .kv("Match mode", isImplicit(var3, var6) ? "IMPLICIT (match single)" : "EXPLICIT (match by criteria)")
         .kv("Match ordinal", var3.getOrdinal() < 0 ? "any" : var3.getOrdinal())
         .kv("Match index", var3.getIndex() < var6 ? "any" : var3.getIndex())
         .kv("Match name(s)", var3.hasNames() ? var3.getNames() : "any")
         .kv("Args only", var5)
         .hr()
         .add(var2)
         .print(System.err);
   }

   private static boolean isImplicit(LocalVariableDiscriminator var0, int var1) {
      return var0.getOrdinal() < 0 && var0.getIndex() < var1 && var0.getNames().isEmpty();
   }

   public static void decorateInjectorSpecific(InjectionNodes.InjectionNode var0, InjectionInfo var1, String var2, Object var3) {
      if (!var0.hasDecoration(var2)) {
         var0.decorate(var2, new HashMap());
      }

      Map var4 = var0.getDecoration(var2);
      var4.put(var1, var3);
   }

   public static <T> T getInjectorSpecificDecoration(InjectionNodes.InjectionNode var0, InjectionInfo var1, String var2) {
      Map var3 = var0.getDecoration(var2);
      return (T)(var3 == null ? null : var3.get(var1));
   }

   public static boolean hasInjectorSpecificDecoration(InjectionNodes.InjectionNode var0, InjectionInfo var1, String var2) {
      Map var3 = var0.getDecoration(var2);
      return var3 == null ? false : var3.containsKey(var1);
   }

   public static void coerceReturnType(Injector.InjectorData var0, InsnList var1, Type var2) {
      if (var0.coerceReturnType && var2.getSort() >= 9) {
         var1.add(new TypeInsnNode(192, var2.getInternalName()));
      }
   }

   public static AbstractInsnNode findCoerce(InjectionNodes.InjectionNode var0, Type var1) {
      if (var0.isReplaced() && !isDynamicInstanceofRedirect(var0)) {
         AbstractInsnNode var2 = var0.getCurrentTarget();
         if (!(var2 instanceof MethodInsnNode)) {
            return null;
         }

         MethodInsnNode var3 = (MethodInsnNode)var2;
         if (!ASMUtils.isPrimitive(var1) && !Type.getReturnType(var3.desc).equals(var1)) {
            if (var3.getNext().getOpcode() == 192) {
               TypeInsnNode var4 = (TypeInsnNode)var3.getNext();
               if (var4.desc.equals(var1.getInternalName())) {
                  return var4;
               }
            }

            throw new AssertionError(
               String.format(
                  "Could not find @Coerce CHECKCAST instruction! Expected '%s' but got '%s'! Please inform LlamaLad7!",
                  "[CHECKCAST] " + var1.getInternalName(),
                  Bytecode.describeNode(var3.getNext())
               )
            );
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static int[] handlerArgMap(Target var0, int[] var1, Type[] var2, boolean var3) {
      if (var3) {
         var1 = ArrayUtils.remove(var1, 0);
      }

      var1 = ArrayUtils.subarray(var1, 0, var2.length);
      return ArrayUtils.addAll(var1, var0.getArgIndices());
   }
}
