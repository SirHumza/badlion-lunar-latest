package com.llamalad7.mixinextras.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public enum PreviousInjectorInsns {
   DYNAMIC_INSTANCEOF_REDIRECT("dynamic instanceof redirect") {
      @Override
      protected List<Predicate<AbstractInsnNode>> getPredicates() {
         return Arrays.asList(
            var0 -> var0.getOpcode() == 89,
            var0 -> var0.getOpcode() == 199,
            var0 -> var0.getOpcode() == 187 && ((TypeInsnNode)var0).desc.equals(PreviousInjectorInsns.NPE),
            var0 -> var0.getOpcode() == 89,
            var0 -> isMessage(var0, "@Redirect instanceof handler ", "@ModifyConstant instanceof handler "),
            var0 -> var0.getOpcode() == 183 && ((MethodInsnNode)var0).owner.equals(PreviousInjectorInsns.NPE),
            var0 -> var0.getOpcode() == 191,
            var0 -> var0 instanceof LabelNode,
            var0 -> var0.getOpcode() == 95,
            var0 -> var0.getOpcode() == 89,
            var0 -> var0.getOpcode() == 198,
            var0 -> var0.getOpcode() == 182 && ((MethodInsnNode)var0).name.equals("getClass"),
            var0 -> var0.getOpcode() == 182 && ((MethodInsnNode)var0).name.equals("isAssignableFrom"),
            var0 -> var0.getOpcode() == 167,
            var0 -> var0 instanceof LabelNode,
            var0 -> var0.getOpcode() == 87,
            var0 -> var0.getOpcode() == 87,
            var0 -> var0.getOpcode() == 3,
            var0 -> var0 instanceof LabelNode
         );
      }
   },
   DUPED_FACTORY_REDIRECT("duped factory redirect") {
      @Override
      protected List<Predicate<AbstractInsnNode>> getPredicates() {
         return Arrays.asList(
            var0 -> var0.getOpcode() == 89,
            var0 -> var0.getOpcode() == 199,
            var0 -> var0.getOpcode() == 187 && ((TypeInsnNode)var0).desc.equals(PreviousInjectorInsns.NPE),
            var0 -> var0.getOpcode() == 89,
            var0 -> isMessage(var0, "@Redirect constructor handler "),
            var0 -> var0.getOpcode() == 183 && ((MethodInsnNode)var0).owner.equals(PreviousInjectorInsns.NPE),
            var0 -> var0.getOpcode() == 191,
            var0 -> var0 instanceof LabelNode
         );
      }
   },
   COMPARISON_WRAPPER("comparison wrapper") {
      private final Predicate<AbstractInsnNode> is0Or1 = var0 -> var0.getOpcode() == 3 || var0.getOpcode() == 4;

      @Override
      protected List<Predicate<AbstractInsnNode>> getPredicates() {
         return Arrays.asList(
            var0 -> var0.getOpcode() == 154,
            this.is0Or1,
            var0 -> var0.getOpcode() == 167,
            var0 -> var0 instanceof LabelNode,
            this.is0Or1,
            var0 -> var0 instanceof LabelNode
         );
      }
   };

   private static final String NPE = Type.getInternalName(NullPointerException.class);
   private final String description;

   PreviousInjectorInsns(String var3) {
      this.description = var3;
   }

   protected abstract List<Predicate<AbstractInsnNode>> getPredicates();

   public void moveNodes(InsnList var1, InsnList var2, AbstractInsnNode var3) {
      AbstractInsnNode var4 = var3.getNext();

      for (Predicate var6 : this.getPredicates()) {
         if (!var6.test(var4)) {
            throw new AssertionError(String.format("Failed assertion when wrapping instructions of %s. Please inform LlamaLad7!", this.description));
         }

         AbstractInsnNode var7 = var4;

         do {
            var4 = var4.getNext();
         } while (var4 instanceof FrameNode);

         var1.remove(var7);
         var2.add(var7);
      }
   }

   public AbstractInsnNode getLast(AbstractInsnNode var1) {
      AbstractInsnNode var2 = var1.getNext();
      AbstractInsnNode var3 = null;

      for (Predicate var5 : this.getPredicates()) {
         if (!var5.test(var2)) {
            throw new AssertionError(String.format("Failed assertion when walking instructions of %s. Please inform LlamaLad7!", this.description));
         }

         var3 = var2;

         do {
            var2 = var2.getNext();
         } while (var2 instanceof FrameNode);
      }

      return var3;
   }

   protected static boolean isMessage(AbstractInsnNode var0, String... var1) {
      if (!(var0 instanceof LdcInsnNode)) {
         return false;
      }

      LdcInsnNode var2 = (LdcInsnNode)var0;
      if (!(var2.cst instanceof String)) {
         return false;
      }

      String var3 = (String)var2.cst;
      return Arrays.stream(var1).anyMatch(var3::startsWith);
   }
}
