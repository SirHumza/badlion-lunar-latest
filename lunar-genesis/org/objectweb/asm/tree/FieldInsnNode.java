package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class FieldInsnNode extends AbstractInsnNode {
   public String owner;
   public String name;
   public String desc;

   public FieldInsnNode(int var1, String var2, String var3, String var4) {
      super(var1);
      this.owner = var2;
      this.name = var3;
      this.desc = var4;
   }

   public void setOpcode(int var1) {
      this.opcode = var1;
   }

   @Override
   public int getType() {
      return 4;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitFieldInsn(this.opcode, this.owner, this.name, this.desc);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new FieldInsnNode(this.opcode, this.owner, this.name, this.desc).cloneAnnotations(this);
   }
}
