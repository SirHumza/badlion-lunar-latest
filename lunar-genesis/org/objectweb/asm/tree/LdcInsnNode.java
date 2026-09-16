package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class LdcInsnNode extends AbstractInsnNode {
   public Object cst;

   public LdcInsnNode(Object var1) {
      super(18);
      this.cst = var1;
   }

   @Override
   public int getType() {
      return 9;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitLdcInsn(this.cst);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new LdcInsnNode(this.cst).cloneAnnotations(this);
   }
}
