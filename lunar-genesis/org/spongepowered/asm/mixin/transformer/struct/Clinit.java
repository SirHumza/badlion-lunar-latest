package org.spongepowered.asm.mixin.transformer.struct;

import java.util.ListIterator;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.injection.struct.InjectionNodes;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.util.Bytecode;

public class Clinit {
   protected final MethodNode clinit;
   protected final AbstractInsnNode finalReturn;

   public Clinit(MethodNode var1, AbstractInsnNode var2) {
      this.clinit = var1;
      this.finalReturn = var2;
   }

   public void append(IMixinInfo var1, MethodNode var2) {
      prepareClinit(var2, null);
      Map var3 = Bytecode.cloneLabels(var2.instructions);
      this.appendInsns(var1, var2, var3);
      this.clinit.maxLocals = Math.max(this.clinit.maxLocals, var2.maxLocals);
      this.clinit.maxStack = Math.max(this.clinit.maxStack, var2.maxStack);

      for (TryCatchBlockNode var5 : var2.tryCatchBlocks) {
         this.clinit
            .tryCatchBlocks
            .add(new TryCatchBlockNode((LabelNode)var3.get(var5.start), (LabelNode)var3.get(var5.end), (LabelNode)var3.get(var5.handler), var5.type));
      }

      for (LocalVariableNode var7 : var2.localVariables) {
         this.clinit
            .localVariables
            .add(new LocalVariableNode(var7.name, var7.desc, var7.signature, (LabelNode)var3.get(var7.start), (LabelNode)var3.get(var7.end), var7.index));
      }
   }

   protected void appendInsns(IMixinInfo var1, MethodNode var2, Map<LabelNode, LabelNode> var3) {
      for (AbstractInsnNode var5 : var2.instructions) {
         if (var5.getOpcode() != 177) {
            this.clinit.instructions.insertBefore(this.finalReturn, var5.clone(var3));
         }
      }
   }

   public static Clinit prepare(Target var0) {
      return new Clinit(var0.method, prepareClinit(var0.method, var0));
   }

   protected static AbstractInsnNode prepareClinit(MethodNode var0, Target var1) {
      LabelNode var2 = new LabelNode();
      AbstractInsnNode var3 = null;
      ListIterator var4 = var0.instructions.iterator();

      while (var4.hasNext()) {
         AbstractInsnNode var5 = (AbstractInsnNode)var4.next();
         if (var5.getOpcode() == 177) {
            if (var5.getNext() == null) {
               var3 = var5;
               break;
            }

            JumpInsnNode var6 = new JumpInsnNode(167, var2);
            var4.set(var6);
            if (var1 != null) {
               InjectionNodes.InjectionNode var7 = var1.getInjectionNode(var5);
               if (var7 != null) {
                  var7.replace(var6);
               }
            }
         }
      }

      if (var3 != null) {
         var0.instructions.insertBefore(var3, var2);
         return var3;
      } else {
         var0.instructions.add(var2);
         InsnNode var8 = new InsnNode(177);
         var0.instructions.add(var8);
         return var8;
      }
   }
}
