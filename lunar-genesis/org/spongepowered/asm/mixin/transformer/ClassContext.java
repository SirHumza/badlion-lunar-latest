package org.spongepowered.asm.mixin.transformer;

import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.struct.MemberRef;

abstract class ClassContext {
   private final Set<ClassInfo.Method> upgradedMethods = new HashSet<>();

   abstract String getClassRef();

   abstract ClassNode getClassNode();

   abstract ClassInfo getClassInfo();

   void addUpgradedMethod(MethodNode var1) {
      ClassInfo.Method var2 = this.getClassInfo().findMethod(var1);
      if (var2 == null) {
         throw new IllegalStateException("Meta method for " + var1.name + " not located in " + this);
      }

      this.upgradedMethods.add(var2);
   }

   protected void upgradeMethods() {
      for (MethodNode var2 : this.getClassNode().methods) {
         this.upgradeMethod(var2);
      }
   }

   private void upgradeMethod(MethodNode var1) {
      for (AbstractInsnNode var3 : var1.instructions) {
         if (var3 instanceof MethodInsnNode) {
            MemberRef.Method var4 = new MemberRef.Method((MethodInsnNode)var3);
            if (var4.getOwner().equals(this.getClassRef())) {
               ClassInfo.Method var5 = this.getClassInfo().findMethod(var4.getName(), var4.getDesc(), 10);
               this.upgradeMethodRef(var1, var4, var5);
            }
         }
      }
   }

   protected void upgradeMethodRef(MethodNode var1, MemberRef var2, ClassInfo.Method var3) {
      if (var2.getOpcode() == 183) {
         if (this.upgradedMethods.contains(var3)) {
            var2.setOpcode(182);
         }
      }
   }
}
