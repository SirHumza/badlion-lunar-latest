package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;

public class MultiANewArrayInsnNode extends AbstractInsnNode {
   public String desc;
   public int dims;

   public MultiANewArrayInsnNode(String var1, int var2) {
      super(197);
      this.desc = var1;
      this.dims = var2;
   }

   @Override
   public int getType() {
      return 13;
   }

   @Override
   public void accept(MethodVisitor var1) {
      var1.visitMultiANewArrayInsn(this.desc, this.dims);
      this.acceptAnnotations(var1);
   }

   @Override
   public AbstractInsnNode clone(Map<LabelNode, LabelNode> var1) {
      return new MultiANewArrayInsnNode(this.desc, this.dims).cloneAnnotations(this);
   }
}
