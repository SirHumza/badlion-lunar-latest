package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class InsnNode extends AbstractInsnNode {
   public InsnNode(int var1) {
      super(var1);
   }

   @Override
   public int getType() {
      return 0;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitInsn(this.opcode);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new InsnNode(this.opcode).cloneAnnotations(this);
   }
}
