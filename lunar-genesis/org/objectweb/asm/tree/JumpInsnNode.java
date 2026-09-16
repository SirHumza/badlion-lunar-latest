package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class JumpInsnNode extends AbstractInsnNode {
   public LabelNode label;

   public JumpInsnNode(int var1, LabelNode var2) {
      super(var1);
      this.label = var2;
   }

   public void setOpcode(int var1) {
      this.opcode = var1;
   }

   @Override
   public int getType() {
      return 7;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitJumpInsn(this.opcode, this.label.getLabel());
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new JumpInsnNode(this.opcode, clone(this.label, var1)).cloneAnnotations(this);
   }
}
