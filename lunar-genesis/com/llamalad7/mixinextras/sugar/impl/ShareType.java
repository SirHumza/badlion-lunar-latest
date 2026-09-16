package com.llamalad7.mixinextras.sugar.impl;

import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefClassGenerator;
import com.llamalad7.mixinextras.sugar.impl.ref.LocalRefUtils;
import com.llamalad7.mixinextras.utils.ASMUtils;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.spongepowered.asm.mixin.injection.struct.Target;

public class ShareType {
   private final Type innerType;

   public ShareType(Type var1) {
      this.innerType = var1;
   }

   public Type getInnerType() {
      return this.innerType;
   }

   public Type getImplType() {
      return Type.getObjectType(LocalRefClassGenerator.getForType(this.innerType));
   }

   public InsnList initialize(int var1) {
      InsnList var2 = new InsnList();
      LocalRefUtils.generateNew(var2, this.innerType);
      var2.add(new VarInsnNode(58, var1));
      var2.add(new VarInsnNode(25, var1));
      var2.add(new InsnNode(ASMUtils.getDummyOpcodeForType(this.innerType)));
      LocalRefUtils.generateInitialization(var2, this.innerType);
      return var2;
   }

   public void addToLvt(Target var1, int var2) {
      LabelNode var3 = new LabelNode();
      var1.insns.insert(var3);
      LabelNode var4 = new LabelNode();
      var1.insns.add(var4);
      Type var5 = Type.getObjectType(LocalRefClassGenerator.getForType(this.innerType));
      var1.addLocalVariable(var2, "sharedRef" + var2, var5.getDescriptor());
      List var6 = var1.method.localVariables;
      LocalVariableNode var7 = (LocalVariableNode)var6.get(var6.size() - 1);
      var7.start = var3;
      var7.end = var4;
   }
}
