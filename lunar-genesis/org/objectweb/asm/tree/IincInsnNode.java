package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class IincInsnNode extends AbstractInsnNode {
   public int var;
   public int incr;

   public IincInsnNode(int var1, int var2) {
      super(132);
      this.var = var1;
      this.incr = var2;
   }

   @Override
   public int getType() {
      return 10;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitIincInsn(this.var, this.incr);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new IincInsnNode(this.var, this.incr).cloneAnnotations(this);
   }
}
